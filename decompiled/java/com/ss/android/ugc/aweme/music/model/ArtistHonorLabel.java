package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ArtistHonorLabel {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ArtistHonorLabel[] $VALUES;
    public static final ArtistHonorLabel ARTIST_HONOR_LABEL_ARTIST = new ArtistHonorLabel("ARTIST_HONOR_LABEL_ARTIST", 0, 3, "song_singer");
    public static final ArtistHonorLabel ARTIST_HONOR_LABEL_SONG_WRITER = new ArtistHonorLabel("ARTIST_HONOR_LABEL_SONG_WRITER", 1, 7, "song_writer");
    public final String label;
    public final int value;

    public static final /* synthetic */ ArtistHonorLabel[] $values() {
        return new ArtistHonorLabel[]{ARTIST_HONOR_LABEL_ARTIST, ARTIST_HONOR_LABEL_SONG_WRITER};
    }

    public static InterfaceC2044707zh<ArtistHonorLabel> getEntries() {
        return $ENTRIES;
    }

    static {
        ArtistHonorLabel[] artistHonorLabelArr$values = $values();
        $VALUES = artistHonorLabelArr$values;
        $ENTRIES = new C2254308sP(artistHonorLabelArr$values);
    }

    public static ArtistHonorLabel[] values() {
        return (ArtistHonorLabel[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getValue() {
        return this.value;
    }

    public static ArtistHonorLabel valueOf(String str) {
        return (ArtistHonorLabel) C08FF.LIZ(ArtistHonorLabel.class, str);
    }

    public ArtistHonorLabel(String str, int i, int i2, String str2) {
        this.value = i2;
        this.label = str2;
    }
}
