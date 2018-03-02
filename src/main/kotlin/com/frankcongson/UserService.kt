package com.frankcongson

class UserService {
    private val userPersistence = UserPersistence()

    fun addUser(user: User) {
        userPersistence.addUser(user)
    }

    fun getUsers(): Collection<User> {
        return userPersistence.getUsers()
    }
}
