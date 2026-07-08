package com.ss.android.ugc.aweme.ftc.components.effect;

import X.AbstractC194560119y;
import X.C194561119z;
import X.C2188811AlT;
import X.C529140Kp6;
import X.C529150Kp7;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditEffectState extends UiState {
    public static final int $stable = 8;
    public final C529150Kp7 refreshCoverEvent;
    public final C529150Kp7 regenerateReverseVideo;
    public final C529150Kp7 removeTimeEffect;
    public final Integer setVideoLength;
    public final AbstractC194560119y ui;
    public final C529140Kp6 updateEffectTime;

    public FTCEditEffectState() {
        this(new C194561119z(), null, null, null, null, null);
    }

    public final FTCEditEffectState copy(AbstractC194560119y abstractC194560119y, Integer num, C529150Kp7 c529150Kp7, C529150Kp7 c529150Kp72, C529150Kp7 c529150Kp73, C529140Kp6 c529140Kp6) {
        return new FTCEditEffectState(abstractC194560119y, num, c529150Kp7, c529150Kp72, c529150Kp73, c529140Kp6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditEffectState)) {
            return false;
        }
        FTCEditEffectState fTCEditEffectState = (FTCEditEffectState) obj;
        return Intrinsics.LJFF(this.ui, fTCEditEffectState.ui) && Intrinsics.LJFF(this.setVideoLength, fTCEditEffectState.setVideoLength) && Intrinsics.LJFF(this.regenerateReverseVideo, fTCEditEffectState.regenerateReverseVideo) && Intrinsics.LJFF(this.removeTimeEffect, fTCEditEffectState.removeTimeEffect) && Intrinsics.LJFF(this.refreshCoverEvent, fTCEditEffectState.refreshCoverEvent) && Intrinsics.LJFF(this.updateEffectTime, fTCEditEffectState.updateEffectTime);
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        Integer num = this.setVideoLength;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C529150Kp7 c529150Kp7 = this.regenerateReverseVideo;
        int iHashCode3 = (iHashCode2 + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31;
        C529150Kp7 c529150Kp72 = this.removeTimeEffect;
        int iHashCode4 = (iHashCode3 + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31;
        C529150Kp7 c529150Kp73 = this.refreshCoverEvent;
        int iHashCode5 = (iHashCode4 + (c529150Kp73 == null ? 0 : c529150Kp73.hashCode())) * 31;
        C529140Kp6 c529140Kp6 = this.updateEffectTime;
        return iHashCode5 + (c529140Kp6 != null ? c529140Kp6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FTCEditEffectState(ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(", setVideoLength=");
        sbLIZ.append(this.setVideoLength);
        sbLIZ.append(", regenerateReverseVideo=");
        sbLIZ.append(this.regenerateReverseVideo);
        sbLIZ.append(", removeTimeEffect=");
        sbLIZ.append(this.removeTimeEffect);
        sbLIZ.append(", refreshCoverEvent=");
        sbLIZ.append(this.refreshCoverEvent);
        sbLIZ.append(", updateEffectTime=");
        sbLIZ.append(this.updateEffectTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C529150Kp7 getRefreshCoverEvent() {
        return this.refreshCoverEvent;
    }

    public final C529150Kp7 getRegenerateReverseVideo() {
        return this.regenerateReverseVideo;
    }

    public final C529150Kp7 getRemoveTimeEffect() {
        return this.removeTimeEffect;
    }

    public final Integer getSetVideoLength() {
        return this.setVideoLength;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final C529140Kp6 getUpdateEffectTime() {
        return this.updateEffectTime;
    }

    public FTCEditEffectState(AbstractC194560119y abstractC194560119y, Integer num, C529150Kp7 c529150Kp7, C529150Kp7 c529150Kp72, C529150Kp7 c529150Kp73, C529140Kp6 c529140Kp6) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.setVideoLength = num;
        this.regenerateReverseVideo = c529150Kp7;
        this.removeTimeEffect = c529150Kp72;
        this.refreshCoverEvent = c529150Kp73;
        this.updateEffectTime = c529140Kp6;
    }
}
