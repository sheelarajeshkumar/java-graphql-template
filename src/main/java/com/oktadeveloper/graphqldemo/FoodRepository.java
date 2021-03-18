package com.oktadeveloper.graphqldemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FoodRepository extends MongoRepository<Food, Long> {
}
