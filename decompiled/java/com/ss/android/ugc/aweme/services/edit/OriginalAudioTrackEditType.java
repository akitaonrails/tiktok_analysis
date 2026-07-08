package com.ss.android.ugc.aweme.services.edit;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class OriginalAudioTrackEditType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ OriginalAudioTrackEditType[] $VALUES;
    public final int value;
    public static final OriginalAudioTrackEditType ORIGINAL_AUDIO_TRACK_EDIT_TYPE_UNKOWN = new OriginalAudioTrackEditType("ORIGINAL_AUDIO_TRACK_EDIT_TYPE_UNKOWN", 0, 0);
    public static final OriginalAudioTrackEditType ORIGINAL_AUDIO_TRACK_EDIT_TYPE_COPYRIGHT_INFRINGEMENT_MUTE_AND_KEEP = new OriginalAudioTrackEditType("ORIGINAL_AUDIO_TRACK_EDIT_TYPE_COPYRIGHT_INFRINGEMENT_MUTE_AND_KEEP", 1, 1);
    public static final OriginalAudioTrackEditType ORIGINAL_AUDIO_TRACK_EDIT_TYPE_COPYRIGHT_INFRINGEMENT_REPLACEMENT = new OriginalAudioTrackEditType("ORIGINAL_AUDIO_TRACK_EDIT_TYPE_COPYRIGHT_INFRINGEMENT_REPLACEMENT", 2, 2);
    public static final OriginalAudioTrackEditType ORIGINAL_AUDIO_TRACK_EDIT_TYPE_KEEP_WITH_VOLUME = new OriginalAudioTrackEditType("ORIGINAL_AUDIO_TRACK_EDIT_TYPE_KEEP_WITH_VOLUME", 3, 3);

    public static final /* synthetic */ OriginalAudioTrackEditType[] $values() {
        return new OriginalAudioTrackEditType[]{ORIGINAL_AUDIO_TRACK_EDIT_TYPE_UNKOWN, ORIGINAL_AUDIO_TRACK_EDIT_TYPE_COPYRIGHT_INFRINGEMENT_MUTE_AND_KEEP, ORIGINAL_AUDIO_TRACK_EDIT_TYPE_COPYRIGHT_INFRINGEMENT_REPLACEMENT, ORIGINAL_AUDIO_TRACK_EDIT_TYPE_KEEP_WITH_VOLUME};
    }

    public static InterfaceC2044707zh<OriginalAudioTrackEditType> getEntries() {
        return $ENTRIES;
    }

    static {
        OriginalAudioTrackEditType[] originalAudioTrackEditTypeArr$values = $values();
        $VALUES = originalAudioTrackEditTypeArr$values;
        $ENTRIES = new C2254308sP(originalAudioTrackEditTypeArr$values);
    }

    public static OriginalAudioTrackEditType[] values() {
        return (OriginalAudioTrackEditType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static OriginalAudioTrackEditType valueOf(String str) {
        return (OriginalAudioTrackEditType) C08FF.LIZ(OriginalAudioTrackEditType.class, str);
    }

    public OriginalAudioTrackEditType(String str, int i, int i2) {
        this.value = i2;
    }
}
