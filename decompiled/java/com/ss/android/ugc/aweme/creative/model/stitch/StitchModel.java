package com.ss.android.ugc.aweme.creative.model.stitch;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.stitch.StitchModel;
import com.ss.android.ugc.aweme.creative.model.stitch.StitchUser;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class StitchModel implements Parcelable {
    public static final Parcelable.Creator<StitchModel> CREATOR = new Parcelable.Creator<StitchModel>() { // from class: X.0nWN
        @Override // android.os.Parcelable.Creator
        public final StitchModel createFromParcel(Parcel parcel) {
            StitchUser stitchUserCreateFromParcel;
            StitchParams stitchParamsCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                stitchUserCreateFromParcel = null;
            } else {
                stitchUserCreateFromParcel = StitchUser.CREATOR.createFromParcel(parcel);
            }
            StitchUser stitchUser = stitchUserCreateFromParcel;
            String string = parcel.readString();
            AIGCInfo aIGCInfo = (AIGCInfo) parcel.readParcelable(StitchModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                stitchParamsCreateFromParcel = StitchParams.CREATOR.createFromParcel(parcel);
            }
            return new StitchModel(stitchUser, string, aIGCInfo, stitchParamsCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StitchModel[] newArray(int i) {
            return new StitchModel[i];
        }
    };

    @C09CT("aigc_info")
    public AIGCInfo aigcInfo;

    @C09CT("stitch_author")
    public StitchUser stitchAuthor;

    @C040H
    public StitchParams stitchParams;

    @C09CT("video_id")
    public String videoId;

    public StitchModel() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchModel)) {
            return false;
        }
        StitchModel stitchModel = (StitchModel) obj;
        return Intrinsics.LJFF(this.stitchAuthor, stitchModel.stitchAuthor) && Intrinsics.LJFF(this.videoId, stitchModel.videoId) && Intrinsics.LJFF(this.aigcInfo, stitchModel.aigcInfo) && Intrinsics.LJFF(this.stitchParams, stitchModel.stitchParams);
    }

    public final int hashCode() {
        StitchUser stitchUser = this.stitchAuthor;
        int iHashCode = (stitchUser == null ? 0 : stitchUser.hashCode()) * 31;
        String str = this.videoId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AIGCInfo aIGCInfo = this.aigcInfo;
        int iHashCode3 = (iHashCode2 + (aIGCInfo == null ? 0 : aIGCInfo.hashCode())) * 31;
        StitchParams stitchParams = this.stitchParams;
        return iHashCode3 + (stitchParams != null ? stitchParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StitchModel(stitchAuthor=");
        sbLIZ.append(this.stitchAuthor);
        sbLIZ.append(", videoId=");
        sbLIZ.append(this.videoId);
        sbLIZ.append(", aigcInfo=");
        sbLIZ.append(this.aigcInfo);
        sbLIZ.append(", stitchParams=");
        sbLIZ.append(this.stitchParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StitchUser stitchUser = this.stitchAuthor;
        if (stitchUser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stitchUser.writeToParcel(parcel, i);
        }
        parcel.writeString(this.videoId);
        parcel.writeParcelable(this.aigcInfo, i);
        StitchParams stitchParams = this.stitchParams;
        if (stitchParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stitchParams.writeToParcel(parcel, i);
        }
    }

    public StitchModel(StitchUser stitchUser, String str, AIGCInfo aIGCInfo, StitchParams stitchParams) {
        this.stitchAuthor = stitchUser;
        this.videoId = str;
        this.aigcInfo = aIGCInfo;
        this.stitchParams = stitchParams;
    }
}
