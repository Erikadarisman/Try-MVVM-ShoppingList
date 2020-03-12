package com.kadarisman.trymvvmshoppinglist.data.repositories

import com.kadarisman.trymvvmshoppinglist.data.db.ShoppingDatabase
import com.kadarisman.trymvvmshoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getDhoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getDhoppingDao().delete(item)

    fun getAllShoppingItems() = db.getDhoppingDao().getAllShoppingItems()
}