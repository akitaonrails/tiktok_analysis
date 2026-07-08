package com.ss.android.ugc.aweme.image.switchmode.payload;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class SwitchModePayload implements Parcelable {
    public final boolean hideIntermediateUI;
    public int livePicCut;
    public final SwitchModePayloadType type;

    public boolean LIZ() {
        return this.hideIntermediateUI;
    }

    public int LIZIZ() {
        return this.livePicCut;
    }

    public void LIZJ(int i) {
        this.livePicCut = i;
    }

    public SwitchModePayload(SwitchModePayloadType switchModePayloadType, boolean z, int i) {
        this.type = switchModePayloadType;
        this.hideIntermediateUI = z;
        this.livePicCut = i;
    }
}
