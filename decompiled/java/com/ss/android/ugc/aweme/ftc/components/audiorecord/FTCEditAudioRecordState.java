package com.ss.android.ugc.aweme.ftc.components.audiorecord;

import X.AbstractC194560119y;
import X.C194561119z;
import X.C2188811AlT;
import X.C529150Kp7;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditAudioRecordState extends UiState {
    public static final int $stable = 8;
    public final C529150Kp7 clearAudioData;
    public final AbstractC194560119y ui;

    public FTCEditAudioRecordState() {
        this(new C194561119z(), null);
    }

    public final FTCEditAudioRecordState copy(AbstractC194560119y abstractC194560119y, C529150Kp7 c529150Kp7) {
        return new FTCEditAudioRecordState(abstractC194560119y, c529150Kp7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditAudioRecordState)) {
            return false;
        }
        FTCEditAudioRecordState fTCEditAudioRecordState = (FTCEditAudioRecordState) obj;
        return Intrinsics.LJFF(this.ui, fTCEditAudioRecordState.ui) && Intrinsics.LJFF(this.clearAudioData, fTCEditAudioRecordState.clearAudioData);
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        C529150Kp7 c529150Kp7 = this.clearAudioData;
        return iHashCode + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FTCEditAudioRecordState(ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(", clearAudioData=");
        sbLIZ.append(this.clearAudioData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C529150Kp7 getClearAudioData() {
        return this.clearAudioData;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public FTCEditAudioRecordState(AbstractC194560119y abstractC194560119y, C529150Kp7 c529150Kp7) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.clearAudioData = c529150Kp7;
    }
}
