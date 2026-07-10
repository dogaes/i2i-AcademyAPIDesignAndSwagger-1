package com.example.customer_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(description = "Customer data returned by the API")
public class CustomerResponseDTO {

    @Schema(description = "Unique customer ID", example = "1")
    private Long id;

    @Schema(description = "Customer's full name", example = "Jane Doe")
    private String fullName;

    @Schema(description = "Customer's email address", example = "jane.doe@example.com")
    private String email;

    @Schema(description = "Customer's phone number", example = "+1-555-123-4567")
    private String phoneNumber;

    @Schema(description = "Customer's mailing address", example = "123 Main St, Springfield")
    private String address;

    @Schema(description = "Timestamp the customer record was created")
    private LocalDateTime createdAt;
}
