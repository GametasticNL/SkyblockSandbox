package com.prince.skyblocksandbox.skyblockabilities

enum class AbilityTypes(private var ability:ItemAbility?=null){
    AOTE(AoteAbility),WITHER_IMPACT(WitherImpact),NONE;
    fun getAbility() : ItemAbility{
        return ability!!
    }
}