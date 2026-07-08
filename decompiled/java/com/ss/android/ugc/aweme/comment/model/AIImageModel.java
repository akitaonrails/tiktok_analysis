package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AIImageModel implements Serializable {

    @C09CT("ai_generate_model")
    public final String aiGenerateModel;

    @C09CT("ai_intention_model")
    public final String aiIntentionModel;

    @C09CT("is_history_photo")
    public final Integer isHistoryPhoto;

    @C09CT("is_vp_new_user")
    public final boolean isVPNewUser;

    @C09CT("is_vp_generate_result_show")
    public final Integer isVpGenerateResultShow;

    @C09CT("preload_image_status")
    public final String preloadImageStatus;

    @C09CT("upload_image_status")
    public final int uploadImageStatus;

    public AIImageModel() {
        this(null, 0, "", "", true, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIImageModel)) {
            return false;
        }
        AIImageModel aIImageModel = (AIImageModel) obj;
        return Intrinsics.LJFF(this.preloadImageStatus, aIImageModel.preloadImageStatus) && this.uploadImageStatus == aIImageModel.uploadImageStatus && Intrinsics.LJFF(this.aiGenerateModel, aIImageModel.aiGenerateModel) && Intrinsics.LJFF(this.aiIntentionModel, aIImageModel.aiIntentionModel) && this.isVPNewUser == aIImageModel.isVPNewUser && Intrinsics.LJFF(this.isHistoryPhoto, aIImageModel.isHistoryPhoto) && Intrinsics.LJFF(this.isVpGenerateResultShow, aIImageModel.isVpGenerateResultShow);
    }

    public int hashCode() {
        String str = this.preloadImageStatus;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.uploadImageStatus) * 31) + this.aiGenerateModel.hashCode()) * 31) + this.aiIntentionModel.hashCode()) * 31) + C786410Ut5.Z2(this.isVPNewUser)) * 31;
        Integer num = this.isHistoryPhoto;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.isVpGenerateResultShow;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIImageModel(preloadImageStatus=");
        sbLIZ.append(this.preloadImageStatus);
        sbLIZ.append(", uploadImageStatus=");
        sbLIZ.append(this.uploadImageStatus);
        sbLIZ.append(", aiGenerateModel=");
        sbLIZ.append(this.aiGenerateModel);
        sbLIZ.append(", aiIntentionModel=");
        sbLIZ.append(this.aiIntentionModel);
        sbLIZ.append(", isVPNewUser=");
        sbLIZ.append(this.isVPNewUser);
        sbLIZ.append(", isHistoryPhoto=");
        sbLIZ.append(this.isHistoryPhoto);
        sbLIZ.append(", isVpGenerateResultShow=");
        sbLIZ.append(this.isVpGenerateResultShow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer isHistoryPhoto() {
        return this.isHistoryPhoto;
    }

    public final boolean isVPNewUser() {
        return this.isVPNewUser;
    }

    public final Integer isVpGenerateResultShow() {
        return this.isVpGenerateResultShow;
    }

    public AIImageModel(String str, int i, String str2, String str3, boolean z, Integer num, Integer num2) {
        this.preloadImageStatus = str;
        this.uploadImageStatus = i;
        this.aiGenerateModel = str2;
        this.aiIntentionModel = str3;
        this.isVPNewUser = z;
        this.isHistoryPhoto = num;
        this.isVpGenerateResultShow = num2;
    }
}
