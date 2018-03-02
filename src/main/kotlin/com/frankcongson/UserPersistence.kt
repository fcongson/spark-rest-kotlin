package com.frankcongson

class UserPersistence {
    private var users = HashMap<String, User>()

    fun addUser(user: User) {
        users[user.id] = user
    }

    fun getUsers(): Collection<User> {
        return users.values
    }
}
