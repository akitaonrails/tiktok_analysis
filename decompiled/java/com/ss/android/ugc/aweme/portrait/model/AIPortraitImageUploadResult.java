package com.ss.android.ugc.aweme.portrait.model;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitImageUploadResult {
    public final String errorMsg;
    public final String imagePath;
    public final String imageTos;
    public final int progress;
    public final AIPortraitImageUploadState state;
    public final String uploadId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitImageUploadResult)) {
            return false;
        }
        AIPortraitImageUploadResult aIPortraitImageUploadResult = (AIPortraitImageUploadResult) obj;
        return Intrinsics.LJFF(this.uploadId, aIPortraitImageUploadResult.uploadId) && Intrinsics.LJFF(this.imagePath, aIPortraitImageUploadResult.imagePath) && Intrinsics.LJFF(this.imageTos, aIPortraitImageUploadResult.imageTos) && this.progress == aIPortraitImageUploadResult.progress && this.state == aIPortraitImageUploadResult.state && Intrinsics.LJFF(this.errorMsg, aIPortraitImageUploadResult.errorMsg);
    }

    public int hashCode() {
        int iHashCode = ((this.uploadId.hashCode() * 31) + this.imagePath.hashCode()) * 31;
        String str = this.imageTos;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.progress) * 31) + this.state.hashCode()) * 31;
        String str2 = this.errorMsg;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitImageUploadResult(uploadId=");
        sbLIZ.append(this.uploadId);
        sbLIZ.append(", imagePath=");
        sbLIZ.append(this.imagePath);
        sbLIZ.append(", imageTos=");
        sbLIZ.append(this.imageTos);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIPortraitImageUploadResult(String str, String str2, String str3, int i, AIPortraitImageUploadState aIPortraitImageUploadState, String str4) {
        this.uploadId = str;
        this.imagePath = str2;
        this.imageTos = str3;
        this.progress = i;
        this.state = aIPortraitImageUploadState;
        this.errorMsg = str4;
    }
}
