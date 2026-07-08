package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PreviewDockerState implements C004I {
    public static final int $stable = 8;
    public final ArrayList<CutSameVideoImageExtraData> cutSamExtraDataList;
    public final boolean isAigc;
    public final boolean isAutoCutSoundSyncMode;
    public final boolean isCutSame;
    public final boolean isFromABRoll;
    public final boolean isPhotoModeTemplate;
    public final boolean isSoundSync;
    public final boolean isUgcTemplate;
    public final int minVideoCount;

    public PreviewDockerState() {
        this(1, null, false, false, false, false, false, false, false);
    }

    public final PreviewDockerState copy(int i, ArrayList<CutSameVideoImageExtraData> arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return new PreviewDockerState(i, arrayList, z, z2, z3, z4, z5, z6, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewDockerState)) {
            return false;
        }
        PreviewDockerState previewDockerState = (PreviewDockerState) obj;
        return this.minVideoCount == previewDockerState.minVideoCount && Intrinsics.LJFF(this.cutSamExtraDataList, previewDockerState.cutSamExtraDataList) && this.isCutSame == previewDockerState.isCutSame && this.isSoundSync == previewDockerState.isSoundSync && this.isUgcTemplate == previewDockerState.isUgcTemplate && this.isAutoCutSoundSyncMode == previewDockerState.isAutoCutSoundSyncMode && this.isPhotoModeTemplate == previewDockerState.isPhotoModeTemplate && this.isAigc == previewDockerState.isAigc && this.isFromABRoll == previewDockerState.isFromABRoll;
    }

    public int hashCode() {
        int i = this.minVideoCount * 31;
        ArrayList<CutSameVideoImageExtraData> arrayList = this.cutSamExtraDataList;
        return ((((((((((((((i + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + C786410Ut5.Z2(this.isCutSame)) * 31) + C786410Ut5.Z2(this.isSoundSync)) * 31) + C786410Ut5.Z2(this.isUgcTemplate)) * 31) + C786410Ut5.Z2(this.isAutoCutSoundSyncMode)) * 31) + C786410Ut5.Z2(this.isPhotoModeTemplate)) * 31) + C786410Ut5.Z2(this.isAigc)) * 31) + C786410Ut5.Z2(this.isFromABRoll);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewDockerState(minVideoCount=");
        sbLIZ.append(this.minVideoCount);
        sbLIZ.append(", cutSamExtraDataList=");
        sbLIZ.append(this.cutSamExtraDataList);
        sbLIZ.append(", isCutSame=");
        sbLIZ.append(this.isCutSame);
        sbLIZ.append(", isSoundSync=");
        sbLIZ.append(this.isSoundSync);
        sbLIZ.append(", isUgcTemplate=");
        sbLIZ.append(this.isUgcTemplate);
        sbLIZ.append(", isAutoCutSoundSyncMode=");
        sbLIZ.append(this.isAutoCutSoundSyncMode);
        sbLIZ.append(", isPhotoModeTemplate=");
        sbLIZ.append(this.isPhotoModeTemplate);
        sbLIZ.append(", isAigc=");
        sbLIZ.append(this.isAigc);
        sbLIZ.append(", isFromABRoll=");
        sbLIZ.append(this.isFromABRoll);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ArrayList<CutSameVideoImageExtraData> getCutSamExtraDataList() {
        return this.cutSamExtraDataList;
    }

    public final int getMinVideoCount() {
        return this.minVideoCount;
    }

    public final boolean isAigc() {
        return this.isAigc;
    }

    public final boolean isAutoCutSoundSyncMode() {
        return this.isAutoCutSoundSyncMode;
    }

    public final boolean isCutSame() {
        return this.isCutSame;
    }

    public final boolean isFromABRoll() {
        return this.isFromABRoll;
    }

    public final boolean isPhotoModeTemplate() {
        return this.isPhotoModeTemplate;
    }

    public final boolean isSoundSync() {
        return this.isSoundSync;
    }

    public final boolean isUgcTemplate() {
        return this.isUgcTemplate;
    }

    public PreviewDockerState(int i, ArrayList<CutSameVideoImageExtraData> arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.minVideoCount = i;
        this.cutSamExtraDataList = arrayList;
        this.isCutSame = z;
        this.isSoundSync = z2;
        this.isUgcTemplate = z3;
        this.isAutoCutSoundSyncMode = z4;
        this.isPhotoModeTemplate = z5;
        this.isAigc = z6;
        this.isFromABRoll = z7;
    }
}
