package com.meshal.tasklambda.bo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateSuggestionRequest {
    private String text;
    private int rate;
    private String status;
}
