package com.application.sugarrush.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.application.sugarrush.data.database.entities.FavouritesEntity
import com.application.sugarrush.data.database.entities.FoodJokeEntity
import com.application.sugarrush.data.database.entities.RecipesEntity

@Database(
    entities = [RecipesEntity::class,FavouritesEntity::class,FoodJokeEntity::class],
    version = 2,
    exportSchema = false
)
@TypeConverters(RecipesTypeConvertor::class)
abstract class RecipeDatabase:RoomDatabase() {
    abstract  fun recipeDao(): RecipesDao
}