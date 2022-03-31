package com.i3market.semanticengine.common.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

import static org.apache.commons.lang3.StringUtils.EMPTY;

@Value
@Builder(builderClassName = "Builder", toBuilder = true)
@JsonDeserialize(builder = PaymentOnSubscriptionDto.Builder.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentOnSubscriptionDto {

    @lombok.Builder.Default
    @JsonIgnore
    String type = "http://i3-market.eu/backplane/pricingmodel/PaymentOnSubscription";

    String paymentOnSubscriptionName;

    String paymentType;

    String timeDuration;

    String description;

    String repeat;

    BigDecimal hasSubscriptionPrice;

    @JsonPOJOBuilder(withPrefix = EMPTY)
    public static class Builder {

    }
}