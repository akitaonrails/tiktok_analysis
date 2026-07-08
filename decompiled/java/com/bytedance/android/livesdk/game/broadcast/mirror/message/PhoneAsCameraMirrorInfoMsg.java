package com.bytedance.android.livesdk.game.broadcast.mirror.message;

import X.C09CT;
import X.C0TE7;
import X.C0TER;

/* JADX INFO: loaded from: classes13.dex */
public final class PhoneAsCameraMirrorInfoMsg implements C0TER {

    @C09CT("anchor_id")
    public String anchorId;

    @C09CT("audio_source")
    public int audioSource;

    @C09CT("bit_rate_scale")
    public float bitRateScale;

    @C09CT("fps")
    public int fps;

    @C09CT("landscape")
    public int landscape;

    @C09CT("mic_scale")
    public int micScale;

    @C09CT("room_id")
    public String roomId;

    @C09CT("server_mode")
    public int serverMode;

    @C09CT("settings")
    public String settings;

    @C09CT("sink_platform")
    public String sinkPlatform;

    @C09CT("uuid")
    public String uuid;

    @C09CT("ver")
    public int version;

    @C09CT("video_h")
    public int videoHeight;

    @C09CT("video_w")
    public int videoWidth;

    public PhoneAsCameraMirrorInfoMsg() {
        this(null, -1, -1, -1, 0.2f, 30, null, null, null, -1, -1, -1, -1, null);
    }

    @Override // X.C0TER
    public final String getMethodName() {
        return C0TE7.PHONE_AS_CAMERA_MIRROR_INFO.getMethod();
    }

    public PhoneAsCameraMirrorInfoMsg(String str, int i, int i2, int i3, float f, int i4, String str2, String str3, String str4, int i5, int i6, int i7, int i8, String str5) {
        this.roomId = str;
        this.videoWidth = i;
        this.videoHeight = i2;
        this.version = i3;
        this.bitRateScale = f;
        this.fps = i4;
        this.anchorId = str2;
        this.sinkPlatform = str3;
        this.settings = str4;
        this.audioSource = i5;
        this.micScale = i6;
        this.serverMode = i7;
        this.landscape = i8;
        this.uuid = str5;
    }
}
