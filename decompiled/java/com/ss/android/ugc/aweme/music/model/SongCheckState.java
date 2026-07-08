package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SongCheckState {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SongCheckState[] $VALUES;
    public static final SongCheckState NO_SONG_CHECK = new SongCheckState("NO_SONG_CHECK", 0);
    public static final SongCheckState IN_CHECKING = new SongCheckState("IN_CHECKING", 1);
    public static final SongCheckState CHECKED = new SongCheckState("CHECKED", 2);
    public static final SongCheckState MISS_PARAM = new SongCheckState("MISS_PARAM", 3);

    public static final /* synthetic */ SongCheckState[] $values() {
        return new SongCheckState[]{NO_SONG_CHECK, IN_CHECKING, CHECKED, MISS_PARAM};
    }

    public static InterfaceC2044707zh<SongCheckState> getEntries() {
        return $ENTRIES;
    }

    static {
        SongCheckState[] songCheckStateArr$values = $values();
        $VALUES = songCheckStateArr$values;
        $ENTRIES = new C2254308sP(songCheckStateArr$values);
    }

    public static SongCheckState[] values() {
        return (SongCheckState[]) $VALUES.clone();
    }

    public static SongCheckState valueOf(String str) {
        return (SongCheckState) C08FF.LIZ(SongCheckState.class, str);
    }

    public SongCheckState(String str, int i) {
    }
}
