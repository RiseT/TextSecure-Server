package org.whispersystems.textsecuregcm.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micrometer.wavefront.WavefrontConfig;

import javax.validation.constraints.NotEmpty;

public class MicrometerConfiguration {

    @JsonProperty
    @NotEmpty
    private String name;

    @JsonProperty
    private String uri;

    @JsonProperty
    @NotEmpty
    private String apiKey;

    public String getName() {
        return name;
    }

    public String getUri() {
        return uri;
    }

    public String getApiKey() {
        return apiKey;
    }
}
