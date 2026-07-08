package com.ss.bytertc.engine.avclient;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAVAudioRoute {
    ROUTE_DEFAULT(-1),
    ROUTE_HEADSET(1),
    ROUTE_EARPIECE(2),
    ROUTE_SPEAKERPHONE(3),
    ROUTE_HEADSET_BLUETOOTH(4),
    ROUTE_HEADSET_USB(5);

    public static final Companion Companion = new Companion();
    public int value;

    public static LyraxAVAudioRoute valueOf(String str) {
        return (LyraxAVAudioRoute) C08FF.LIZ(LyraxAVAudioRoute.class, str);
    }

    public int getValue() {
        return this.value;
    }

    public static final class Companion {
        public LyraxAVAudioRoute fromId(int i) {
            for (LyraxAVAudioRoute lyraxAVAudioRoute : LyraxAVAudioRoute.values()) {
                if (lyraxAVAudioRoute.value == i) {
                    return lyraxAVAudioRoute;
                }
            }
            return LyraxAVAudioRoute.ROUTE_DEFAULT;
        }
    }

    LyraxAVAudioRoute(int i) {
        this.value = i;
    }
}
