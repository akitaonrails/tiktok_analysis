package com.ss.ugc.android.editor.track;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TrackShowType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ TrackShowType[] $VALUES;
    public static final TrackShowType NORMAL = new TrackShowType("NORMAL", 0);
    public static final TrackShowType NORMAL_WITHOUT_OVERLAY = new TrackShowType("NORMAL_WITHOUT_OVERLAY", 1);
    public static final TrackShowType STICKER = new TrackShowType("STICKER", 2);
    public static final TrackShowType TEXT = new TrackShowType("TEXT", 3);
    public static final TrackShowType PIP = new TrackShowType("PIP", 4);
    public static final TrackShowType AUDIO = new TrackShowType("AUDIO", 5);
    public static final TrackShowType VIDEOEFFECT = new TrackShowType("VIDEOEFFECT", 6);
    public static final TrackShowType AUDIORECORD = new TrackShowType("AUDIORECORD", 7);
    public static final TrackShowType ADJUST = new TrackShowType("ADJUST", 8);
    public static final TrackShowType FILTER = new TrackShowType("FILTER", 9);
    public static final TrackShowType RETOUCH = new TrackShowType("RETOUCH", 10);
    public static final TrackShowType LYRIC = new TrackShowType("LYRIC", 11);

    public static final /* synthetic */ TrackShowType[] $values() {
        return new TrackShowType[]{NORMAL, NORMAL_WITHOUT_OVERLAY, STICKER, TEXT, PIP, AUDIO, VIDEOEFFECT, AUDIORECORD, ADJUST, FILTER, RETOUCH, LYRIC};
    }

    public static InterfaceC2044707zh<TrackShowType> getEntries() {
        return $ENTRIES;
    }

    static {
        TrackShowType[] trackShowTypeArr$values = $values();
        $VALUES = trackShowTypeArr$values;
        $ENTRIES = new C2254308sP(trackShowTypeArr$values);
    }

    public static TrackShowType[] values() {
        return (TrackShowType[]) $VALUES.clone();
    }

    public static TrackShowType valueOf(String str) {
        return (TrackShowType) C08FF.LIZ(TrackShowType.class, str);
    }

    public TrackShowType(String str, int i) {
    }
}
