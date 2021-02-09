package guru.springframework.msscbrewery.domain;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class Customer {

    @NonNull
    UUID id;

    String name;
}
