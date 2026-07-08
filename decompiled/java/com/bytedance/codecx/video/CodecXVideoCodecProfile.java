package com.bytedance.codecx.video;

import X.C08FF;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes21.dex */
public enum CodecXVideoCodecProfile {
    Unknown(0),
    ProfileConstrainedBaseline(1),
    ProfileBaseline(2),
    ProfileMain(3),
    ProfileConstrainedHigh(4),
    ProfileHigh(5),
    ByteVC1ProfileUnknown(10),
    ByteVC1ProfileMain(11),
    ByteVC1ProfileMain10(12),
    VP8ProfileMain(80),
    AV1ProfileMain(90),
    ByteVC1ProfileMain10HDR10(100),
    ByteVC1ProfileMax(128);

    public int value;

    public int toSystemProfile() {
        int i = this.value;
        if (i == 0 || i == 1 || i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4 || i == 5) {
            return 8;
        }
        if (i == 80) {
            return 1;
        }
        if (i == 100) {
            return SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        }
        if (i == 128) {
            return 4;
        }
        switch (i) {
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 1;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return 2;
            default:
                throw new RuntimeException("profile not match system!");
        }
    }

    public int toInt() {
        return this.value;
    }

    public static CodecXVideoCodecProfile fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 80) {
                                    if (i != 100) {
                                        if (i != 128) {
                                            switch (i) {
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                    return ByteVC1ProfileUnknown;
                                                case BdTuring.TYPE_EMAIL /* 11 */:
                                                    return ByteVC1ProfileMain;
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                    return ByteVC1ProfileMain10;
                                                default:
                                                    return Unknown;
                                            }
                                        }
                                        return ByteVC1ProfileMax;
                                    }
                                    return ByteVC1ProfileMain10HDR10;
                                }
                                return VP8ProfileMain;
                            }
                            return ProfileHigh;
                        }
                        return ProfileConstrainedHigh;
                    }
                    return ProfileMain;
                }
                return ProfileBaseline;
            }
            return ProfileConstrainedBaseline;
        }
        return Unknown;
    }

    public static CodecXVideoCodecProfile valueOf(String str) {
        return (CodecXVideoCodecProfile) C08FF.LIZ(CodecXVideoCodecProfile.class, str);
    }

    CodecXVideoCodecProfile(int i) {
        this.value = i;
    }
}
