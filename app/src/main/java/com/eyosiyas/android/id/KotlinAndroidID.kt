package com.eyosiyas.android.id

import android.media.MediaDrm
import android.util.Base64
import java.util.*

class KotlinAndroidID {
    fun widevine(): String = uniqueIDGenerator(UUID(-0x121074568629b532L, -0x5c37d8232ae2de13L))
    fun commonPSSH(): String = uniqueIDGenerator(UUID(0x1077EFECC0B24D02L, -0x531cc3e1ad1d04b5L))
    fun clearKey(): String = uniqueIDGenerator(UUID(-0x1d8e62a7567a4c37L, 0x781AB030AF78D30EL))
    fun playReady(): String = uniqueIDGenerator(UUID(-0x65fb0f8667bfbd7aL, -0x546d19a41f77a06bL))

    private fun uniqueIDGenerator(uuid: UUID): String {
        return try {
            Base64.encodeToString(
                MediaDrm(uuid).getPropertyByteArray(MediaDrm.PROPERTY_DEVICE_UNIQUE_ID),
                Base64.DEFAULT
            )
        } catch (e: Exception) {
            ""
        }
    }
}