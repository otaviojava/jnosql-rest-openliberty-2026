package com.github.otaviojava.rest;

import jakarta.data.page.Page;
import jakarta.data.page.PageRequest;
import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Insert;
import jakarta.data.repository.OrderBy;
import jakarta.data.repository.Repository;
import jakarta.ws.rs.Path;
import org.eclipse.jnosql.rest.RestDTO;
import org.eclipse.jnosql.rest.RestRepository;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.Optional;

@Repository
@RestRepository(path = "/products")
@RestDTO(exclude = {
        "supplier",
        "supplierCost",
        "internalNotes"
})
@Tag(
        name = "Products",
        description = "Product catalog management and search"
)
public interface ProductRepository {

    @Insert
    @Operation(
            summary = "Create a product",
            description = "Creates a product in the catalog."
    )
    @APIResponse(responseCode = "201",
            description = "Product created")
    Product insert(Product product);

    @Find
    @Operation(
            summary = "Find a product",
            description = "Retrieves a product by its identifier."
    )
    @APIResponse(responseCode = "200",
            description = "Product found")
    @APIResponse(responseCode = "404",
            description = "Product not found")
    Optional<Product> findById(
            @Parameter(description = "Product identifier")
            String id
    );

    @Delete
    @Operation(
            summary = "Delete a product",
            description = "Removes a product from the catalog."
    )
    @APIResponse(responseCode = "204",
            description = "Product deleted")
    void delete(String id);

    @Find
    @OrderBy("id")
    @Operation(
            summary = "List products",
            description = "Retrieves products using offset-based pagination."
    )
    @APIResponse(
            responseCode = "200",
            description = "Paginated list of products"
    )
    @Path("")
    Page<Product> findAll(PageRequest pageRequest);
}