package com.ss.android.ugc.aweme.ftc.components.cutmusic;

import X.AbstractC194560119y;
import X.C194561119z;
import X.C2188811AlT;
import X.C443120HZe;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class FTCEditMusicCutState extends UiState {
    public static final int $stable = 8;
    public final C443120HZe<AVMusicWaveBean, Integer, Integer> musicWaveData;
    public final AbstractC194560119y ui;
    public final Integer videoLength;

    public FTCEditMusicCutState() {
        this(null, null, new C194561119z());
    }

    public final FTCEditMusicCutState copy(C443120HZe<AVMusicWaveBean, Integer, Integer> c443120HZe, Integer num, AbstractC194560119y abstractC194560119y) {
        return new FTCEditMusicCutState(c443120HZe, num, abstractC194560119y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditMusicCutState)) {
            return false;
        }
        FTCEditMusicCutState fTCEditMusicCutState = (FTCEditMusicCutState) obj;
        return Intrinsics.LJFF(this.musicWaveData, fTCEditMusicCutState.musicWaveData) && Intrinsics.LJFF(this.videoLength, fTCEditMusicCutState.videoLength) && Intrinsics.LJFF(this.ui, fTCEditMusicCutState.ui);
    }

    public int hashCode() {
        C443120HZe<AVMusicWaveBean, Integer, Integer> c443120HZe = this.musicWaveData;
        int iHashCode = (c443120HZe == null ? 0 : c443120HZe.hashCode()) * 31;
        Integer num = this.videoLength;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + this.ui.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FTCEditMusicCutState(musicWaveData=");
        sbLIZ.append(this.musicWaveData);
        sbLIZ.append(", videoLength=");
        sbLIZ.append(this.videoLength);
        sbLIZ.append(", ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C443120HZe<AVMusicWaveBean, Integer, Integer> getMusicWaveData() {
        return this.musicWaveData;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    public FTCEditMusicCutState(C443120HZe<AVMusicWaveBean, Integer, Integer> c443120HZe, Integer num, AbstractC194560119y abstractC194560119y) {
        super(abstractC194560119y);
        this.musicWaveData = c443120HZe;
        this.videoLength = num;
        this.ui = abstractC194560119y;
    }
}
