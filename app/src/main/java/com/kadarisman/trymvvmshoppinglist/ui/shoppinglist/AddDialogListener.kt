package com.kadarisman.trymvvmshoppinglist.ui.shoppinglist

import com.kadarisman.trymvvmshoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}