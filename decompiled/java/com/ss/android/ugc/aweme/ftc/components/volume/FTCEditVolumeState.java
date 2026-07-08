package com.ss.android.ugc.aweme.ftc.components.volume;

import X.AbstractC194560119y;
import X.C194561119z;
import X.C2188811AlT;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditVolumeState extends UiState {
    public static final int $stable = 8;
    public final String musicTitle;
    public final Integer musicVolume;
    public final AbstractC194560119y ui;
    public final String voiceTitle;

    public FTCEditVolumeState() {
        this(null, null, null, new C194561119z());
    }

    public final FTCEditVolumeState copy(String str, String str2, Integer num, AbstractC194560119y abstractC194560119y) {
        return new FTCEditVolumeState(str, str2, num, abstractC194560119y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditVolumeState)) {
            return false;
        }
        FTCEditVolumeState fTCEditVolumeState = (FTCEditVolumeState) obj;
        return Intrinsics.LJFF(this.musicTitle, fTCEditVolumeState.musicTitle) && Intrinsics.LJFF(this.voiceTitle, fTCEditVolumeState.voiceTitle) && Intrinsics.LJFF(this.musicVolume, fTCEditVolumeState.musicVolume) && Intrinsics.LJFF(this.ui, fTCEditVolumeState.ui);
    }

    public int hashCode() {
        String str = this.musicTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.voiceTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.musicVolume;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.ui.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FTCEditVolumeState(musicTitle=");
        sbLIZ.append(this.musicTitle);
        sbLIZ.append(", voiceTitle=");
        sbLIZ.append(this.voiceTitle);
        sbLIZ.append(", musicVolume=");
        sbLIZ.append(this.musicVolume);
        sbLIZ.append(", ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMusicTitle() {
        return this.musicTitle;
    }

    public final Integer getMusicVolume() {
        return this.musicVolume;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final String getVoiceTitle() {
        return this.voiceTitle;
    }

    public FTCEditVolumeState(String str, String str2, Integer num, AbstractC194560119y abstractC194560119y) {
        super(abstractC194560119y);
        this.musicTitle = str;
        this.voiceTitle = str2;
        this.musicVolume = num;
        this.ui = abstractC194560119y;
    }
}
