package com.saimon.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author Muhammad Saimon
 * @since Apr 4/18/21 11:01 AM
 */

// @JsonIgnoreProperties from the Jackson JSON processing library to indicate that
// any properties not bound in this type should be ignored.
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Value {

    private Long id;
    private String quote;

}
