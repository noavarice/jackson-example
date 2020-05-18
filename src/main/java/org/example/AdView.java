package org.example;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

/**
 * @author noavarice
 * @since 1.0
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableAdView.Builder.class)
public interface AdView {

    String getCompany();

    String getUrl();

    String getText();
}
