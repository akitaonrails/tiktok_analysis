package com.ss.android.ugc.tiktok.tpsc.privacy.video.model;

import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.util.JsonToStringAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoPrivateUrlModel extends BaseResponse {

    @C09CT("hybrid_label")
    @C09CS(JsonToStringAdapter.class)
    public final String hybridLabels;

    @C09CT("label_private")
    @C09CS(JsonToStringAdapter.class)
    public final String labelPrivate;

    @C09CT("video_text")
    @C09CS(JsonToStringAdapter.class)
    public final String textVideoLabels;

    public final VideoPrivateUrlModel copy(String str, String str2, String str3) {
        return new VideoPrivateUrlModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPrivateUrlModel)) {
            return false;
        }
        VideoPrivateUrlModel videoPrivateUrlModel = (VideoPrivateUrlModel) obj;
        return Intrinsics.LJFF(this.labelPrivate, videoPrivateUrlModel.labelPrivate) && Intrinsics.LJFF(this.textVideoLabels, videoPrivateUrlModel.textVideoLabels) && Intrinsics.LJFF(this.hybridLabels, videoPrivateUrlModel.hybridLabels);
    }

    public int hashCode() {
        String str = this.labelPrivate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textVideoLabels;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hybridLabels;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPrivateUrlModel(labelPrivate=");
        sbLIZ.append(this.labelPrivate);
        sbLIZ.append(", textVideoLabels=");
        sbLIZ.append(this.textVideoLabels);
        sbLIZ.append(", hybridLabels=");
        sbLIZ.append(this.hybridLabels);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoPrivateUrlModel() {
        this("", "", "");
    }

    public final String getHybridLabels() {
        return this.hybridLabels;
    }

    public final String getLabelPrivate() {
        return this.labelPrivate;
    }

    public final String getTextVideoLabels() {
        return this.textVideoLabels;
    }

    public VideoPrivateUrlModel(String str, String str2, String str3) {
        this.labelPrivate = str;
        this.textVideoLabels = str2;
        this.hybridLabels = str3;
    }
}
