package com.example.customer_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(description = "Payload for creating or updating a customer")
public class CustomerRequestDTO {

    @NotBlank(message = "Full name is required")
    @Size(max = 150)
    @Schema(description = "Customer's full name", example = "Jane Doe")
    private String fullName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    @Size(max = 150)
    @Schema(description = "Customer's email address", example = "jane.doe@example.com")
    private String email;

    @Size(max = 30)
    @Schema(description = "Customer's phone number", example = "+1-555-123-4567")
    private String phoneNumber;

    @Size(max = 255)
    @Schema(description = "Customer's mailing address", example = "123 Main St, Springfield")
    private String address;
}
