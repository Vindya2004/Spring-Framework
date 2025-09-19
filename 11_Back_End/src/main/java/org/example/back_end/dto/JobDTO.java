package org.example.back_end.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public class JobDTO {
        private Integer id;
        @NotBlank(message = "Job title is mandatory")
        private String jobTitle;
        @NotBlank(message = "Company name is mandatory")
        @Pattern(regexp = "^[a-zA-Z ]+$", message = "Company Name should contain only alphabets")
        private String company;
        private String location;
        @NotNull(message = "Type is mandatory")
        private String type;
        @Size(min = 10, max =100, message = "Job Description should be at least 10 characters long")
        private String jobDescription;
        private String status;
    }

