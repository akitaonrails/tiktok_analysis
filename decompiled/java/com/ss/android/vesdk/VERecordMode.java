package com.ss.android.vesdk;

import X.C08FF;

/* JADX INFO: loaded from: classes34.dex */
public enum VERecordMode {
    DEFAULT,
    DUET,
    REACTION,
    CUSTOM_VIDEO_BG,
    DUET_KARAOKE,
    KARAOKE,
    KARAOKE_PURE_AUDIO,
    CUSTOM_VIDEO_BG_GIF,
    AUDIO,
    SCREEN,
    MOTION_PHOTO;

    public static VERecordMode valueOf(String str) {
        return (VERecordMode) C08FF.LIZ(VERecordMode.class, str);
    }
}
