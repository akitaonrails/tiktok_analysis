package com.ss.android.ugc.aweme.listener;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.listener.MultiBitRateEtParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiBitRateEtParams implements Parcelable {
    public static final Parcelable.Creator<MultiBitRateEtParams> CREATOR = new Parcelable.Creator<MultiBitRateEtParams>() { // from class: X.02xt
        @Override // android.os.Parcelable.Creator
        public final MultiBitRateEtParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            return new MultiBitRateEtParams(string, i, parcel.readInt(), parcel.readInt(), parcel.readInt(), string2, string3, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiBitRateEtParams[] newArray(int i) {
            return new MultiBitRateEtParams[i];
        }
    };
    public final int imageFirstFrameDuration;
    public final int imageFirstFrameRenderered;
    public final String imageSizeListStr;
    public final String ladderErrCode;
    public final String playLadderNameList;
    public final String resolutionListStr;
    public final String scene;
    public final int skippedImageCnt;
    public final int useMultiBitrateCount;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiBitRateEtParams)) {
            return false;
        }
        MultiBitRateEtParams multiBitRateEtParams = (MultiBitRateEtParams) obj;
        return Intrinsics.LJFF(this.resolutionListStr, multiBitRateEtParams.resolutionListStr) && Intrinsics.LJFF(this.imageSizeListStr, multiBitRateEtParams.imageSizeListStr) && this.useMultiBitrateCount == multiBitRateEtParams.useMultiBitrateCount && Intrinsics.LJFF(this.ladderErrCode, multiBitRateEtParams.ladderErrCode) && this.skippedImageCnt == multiBitRateEtParams.skippedImageCnt && Intrinsics.LJFF(this.playLadderNameList, multiBitRateEtParams.playLadderNameList) && this.imageFirstFrameDuration == multiBitRateEtParams.imageFirstFrameDuration && this.imageFirstFrameRenderered == multiBitRateEtParams.imageFirstFrameRenderered && Intrinsics.LJFF(this.scene, multiBitRateEtParams.scene);
    }

    public final int hashCode() {
        return (((((((((((((((this.resolutionListStr.hashCode() * 31) + this.imageSizeListStr.hashCode()) * 31) + this.useMultiBitrateCount) * 31) + this.ladderErrCode.hashCode()) * 31) + this.skippedImageCnt) * 31) + this.playLadderNameList.hashCode()) * 31) + this.imageFirstFrameDuration) * 31) + this.imageFirstFrameRenderered) * 31) + this.scene.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiBitRateEtParams(resolutionListStr=");
        sbLIZ.append(this.resolutionListStr);
        sbLIZ.append(", imageSizeListStr=");
        sbLIZ.append(this.imageSizeListStr);
        sbLIZ.append(", useMultiBitrateCount=");
        sbLIZ.append(this.useMultiBitrateCount);
        sbLIZ.append(", ladderErrCode=");
        sbLIZ.append(this.ladderErrCode);
        sbLIZ.append(", skippedImageCnt=");
        sbLIZ.append(this.skippedImageCnt);
        sbLIZ.append(", playLadderNameList=");
        sbLIZ.append(this.playLadderNameList);
        sbLIZ.append(", imageFirstFrameDuration=");
        sbLIZ.append(this.imageFirstFrameDuration);
        sbLIZ.append(", imageFirstFrameRenderered=");
        sbLIZ.append(this.imageFirstFrameRenderered);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resolutionListStr);
        parcel.writeString(this.imageSizeListStr);
        parcel.writeInt(this.useMultiBitrateCount);
        parcel.writeString(this.ladderErrCode);
        parcel.writeInt(this.skippedImageCnt);
        parcel.writeString(this.playLadderNameList);
        parcel.writeInt(this.imageFirstFrameDuration);
        parcel.writeInt(this.imageFirstFrameRenderered);
        parcel.writeString(this.scene);
    }

    public MultiBitRateEtParams(String str, int i, int i2, int i3, int i4, String str2, String str3, String str4, String str5) {
        this.resolutionListStr = str;
        this.imageSizeListStr = str2;
        this.useMultiBitrateCount = i;
        this.ladderErrCode = str3;
        this.skippedImageCnt = i2;
        this.playLadderNameList = str4;
        this.imageFirstFrameDuration = i3;
        this.imageFirstFrameRenderered = i4;
        this.scene = str5;
    }
}
