package com.arbade.gjc.config;

import org.mapstruct.CollectionMappingStrategy;

@org.mapstruct.MapperConfig(componentModel = "spring",
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public class MapperConfig {

}
