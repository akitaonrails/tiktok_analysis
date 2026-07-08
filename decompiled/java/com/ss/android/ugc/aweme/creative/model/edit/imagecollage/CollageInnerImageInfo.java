package com.ss.android.ugc.aweme.creative.model.edit.imagecollage;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInnerImageInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CollageInnerImageInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CollageInnerImageInfo> CREATOR = new Parcelable.Creator<CollageInnerImageInfo>() { // from class: X.0nOe
        @Override // android.os.Parcelable.Creator
        public final CollageInnerImageInfo createFromParcel(Parcel parcel) {
            SrcImageInfo srcImageInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                srcImageInfoCreateFromParcel = null;
            } else {
                srcImageInfoCreateFromParcel = SrcImageInfo.CREATOR.createFromParcel(parcel);
            }
            return new CollageInnerImageInfo(srcImageInfoCreateFromParcel, (AIGCInfo) parcel.readParcelable(CollageInnerImageInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CollageInnerImageInfo[] newArray(int i) {
            return new CollageInnerImageInfo[i];
        }
    };

    @C09CT("ai_chatnode_id")
    public final String aiChatGenNodeId;

    @C09CT("aigc_info")
    public final AIGCInfo aigcInfo;

    @C09CT("src_image_info")
    public final SrcImageInfo srcImageInfo;

    public CollageInnerImageInfo() {
        this(null, null, null);
    }

    public final CollageInnerImageInfo copy(SrcImageInfo srcImageInfo, AIGCInfo aIGCInfo, String str) {
        return new CollageInnerImageInfo(srcImageInfo, aIGCInfo, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollageInnerImageInfo)) {
            return false;
        }
        CollageInnerImageInfo collageInnerImageInfo = (CollageInnerImageInfo) obj;
        return Intrinsics.LJFF(this.srcImageInfo, collageInnerImageInfo.srcImageInfo) && Intrinsics.LJFF(this.aigcInfo, collageInnerImageInfo.aigcInfo) && Intrinsics.LJFF(this.aiChatGenNodeId, collageInnerImageInfo.aiChatGenNodeId);
    }

    public int hashCode() {
        SrcImageInfo srcImageInfo = this.srcImageInfo;
        int iHashCode = (srcImageInfo == null ? 0 : srcImageInfo.hashCode()) * 31;
        AIGCInfo aIGCInfo = this.aigcInfo;
        int iHashCode2 = (iHashCode + (aIGCInfo == null ? 0 : aIGCInfo.hashCode())) * 31;
        String str = this.aiChatGenNodeId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollageInnerImageInfo(srcImageInfo=");
        sbLIZ.append(this.srcImageInfo);
        sbLIZ.append(", aigcInfo=");
        sbLIZ.append(this.aigcInfo);
        sbLIZ.append(", aiChatGenNodeId=");
        sbLIZ.append(this.aiChatGenNodeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SrcImageInfo srcImageInfo = this.srcImageInfo;
        if (srcImageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            srcImageInfo.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.aigcInfo, i);
        parcel.writeString(this.aiChatGenNodeId);
    }

    public final String getAiChatGenNodeId() {
        return this.aiChatGenNodeId;
    }

    public final AIGCInfo getAigcInfo() {
        return this.aigcInfo;
    }

    public final SrcImageInfo getSrcImageInfo() {
        return this.srcImageInfo;
    }

    public CollageInnerImageInfo(SrcImageInfo srcImageInfo, AIGCInfo aIGCInfo, String str) {
        this.srcImageInfo = srcImageInfo;
        this.aigcInfo = aIGCInfo;
        this.aiChatGenNodeId = str;
    }
}
