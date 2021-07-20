package com.eyosiyas.android.id;

import android.media.MediaDrm;
import android.util.Base64;

import java.util.UUID;

public class JavaAndroidID {
    public static String widevine = uniqueIDGenerator(new UUID(-0x121074568629b532L, -0x5c37d8232ae2de13L));
    public static String commonPSSH = uniqueIDGenerator(new UUID(0x1077EFECC0B24D02L, -0x531cc3e1ad1d04b5L));
    public static String clearKey = uniqueIDGenerator(new UUID(-0x1d8e62a7567a4c37L, 0x781AB030AF78D30EL));
    public static String playReady = uniqueIDGenerator(new UUID(-0x65fb0f8667bfbd7aL, -0x546d19a41f77a06bL));

    static String uniqueIDGenerator(UUID uuid) {
        try {
            MediaDrm drm = new MediaDrm(uuid);
            return Base64.encodeToString(drm.getPropertyByteArray(MediaDrm.PROPERTY_DEVICE_UNIQUE_ID), Base64.DEFAULT);
        } catch (Exception e) {
            return "";
        }
    }
}