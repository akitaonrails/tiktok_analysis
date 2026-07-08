package com.ss.ugc.android.editor.track;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: loaded from: classes6.dex */
public final class CurrentSlotInfo {
    public final int index;
    public final long playTime;
    public final NLETrackSlot slot;

    public CurrentSlotInfo(int i, NLETrackSlot nLETrackSlot, long j) {
        this.index = i;
        this.slot = nLETrackSlot;
        this.playTime = j;
    }
}
