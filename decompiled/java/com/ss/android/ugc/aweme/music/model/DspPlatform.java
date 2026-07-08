package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class DspPlatform {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ DspPlatform[] $VALUES;
    public static final Companion Companion;
    public final String eventName;
    public final boolean needAuth;
    public final int value;
    public static final DspPlatform UNKNOWN = new DspPlatform("UNKNOWN", 0, 0, "null", false);
    public static final DspPlatform APPLE_MUSIC = new DspPlatform("APPLE_MUSIC", 1, 1, "apple", true);
    public static final DspPlatform AMAZON_MUSIC = new DspPlatform("AMAZON_MUSIC", 2, 2, "amazon", true);
    public static final DspPlatform SPOTIFY = new DspPlatform("SPOTIFY", 3, 3, "spotify", true);
    public static final DspPlatform TIKTOK_MY_MUSIC = new DspPlatform("TIKTOK_MY_MUSIC", 4, 6, "tt_my_music", false);
    public static final DspPlatform MELON = new DspPlatform("MELON", 5, 7, "melon", true);
    public static final DspPlatform DEEZER = new DspPlatform("DEEZER", 6, 8, "deezer", true);
    public static final DspPlatform SOUND_CLOUD = new DspPlatform("SOUND_CLOUD", 7, 9, "soundcloud", true);
    public static final DspPlatform YOUTUBE_MUSIC = new DspPlatform("YOUTUBE_MUSIC", 8, 10, "youtubemusic", true);
    public static final DspPlatform ANGHAMI = new DspPlatform("ANGHAMI", 9, 11, "anghami", true);

    public static final /* synthetic */ DspPlatform[] $values() {
        return new DspPlatform[]{UNKNOWN, APPLE_MUSIC, AMAZON_MUSIC, SPOTIFY, TIKTOK_MY_MUSIC, MELON, DEEZER, SOUND_CLOUD, YOUTUBE_MUSIC, ANGHAMI};
    }

    public static InterfaceC2044707zh<DspPlatform> getEntries() {
        return $ENTRIES;
    }

    static {
        DspPlatform[] dspPlatformArr$values = $values();
        $VALUES = dspPlatformArr$values;
        $ENTRIES = new C2254308sP(dspPlatformArr$values);
        Companion = new Companion();
    }

    public static DspPlatform[] values() {
        return (DspPlatform[]) $VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final boolean getNeedAuth() {
        return this.needAuth;
    }

    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        public final DspPlatform from(Integer num) {
            DspPlatform next;
            Iterator<DspPlatform> it2 = DspPlatform.getEntries().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    int value = next.getValue();
                    if (num != null && value == num.intValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            DspPlatform dspPlatform = next;
            if (dspPlatform == null) {
                return DspPlatform.UNKNOWN;
            }
            return dspPlatform;
        }

        public final DspPlatform fromEventName(String str) {
            DspPlatform next;
            Iterator<DspPlatform> it2 = DspPlatform.getEntries().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getEventName(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            DspPlatform dspPlatform = next;
            if (dspPlatform == null) {
                return DspPlatform.UNKNOWN;
            }
            return dspPlatform;
        }
    }

    public static DspPlatform valueOf(String str) {
        return (DspPlatform) C08FF.LIZ(DspPlatform.class, str);
    }

    public DspPlatform(String str, int i, int i2, String str2, boolean z) {
        this.value = i2;
        this.eventName = str2;
        this.needAuth = z;
    }
}
