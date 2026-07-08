package com.ss.android.ugc.aweme.creative.model.edit.imagecollage;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInnerImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageIntParam;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CollageInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CollageInfo> CREATOR = new Parcelable.Creator<CollageInfo>() { // from class: X.0nOd
        @Override // android.os.Parcelable.Creator
        public final CollageInfo createFromParcel(Parcel parcel) {
            SrcImageInfo srcImageInfoCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                srcImageInfoCreateFromParcel = null;
            } else {
                srcImageInfoCreateFromParcel = SrcImageInfo.CREATOR.createFromParcel(parcel);
            }
            SrcImageInfo srcImageInfo = srcImageInfoCreateFromParcel;
            CollageIntParam collageIntParamCreateFromParcel = CollageIntParam.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CollageInnerImageInfo.CREATOR.createFromParcel(parcel));
            }
            return new CollageInfo(string, srcImageInfo, collageIntParamCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CollageInfo[] newArray(int i) {
            return new CollageInfo[i];
        }
    };

    @C09CT("src_image_list")
    public final List<CollageInnerImageInfo> collageImageList;

    @C09CT("collage_int_param")
    public final CollageIntParam collageIntParam;

    @C09CT("generated_image")
    public final SrcImageInfo generatedImage;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    public CollageInfo() {
        this(null, null, null, null, 15, null);
    }

    public final CollageInfo copy(String str, SrcImageInfo srcImageInfo, CollageIntParam collageIntParam, List<CollageInnerImageInfo> list) {
        return new CollageInfo(str, srcImageInfo, collageIntParam, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollageInfo)) {
            return false;
        }
        CollageInfo collageInfo = (CollageInfo) obj;
        return Intrinsics.LJFF(this.id, collageInfo.id) && Intrinsics.LJFF(this.generatedImage, collageInfo.generatedImage) && Intrinsics.LJFF(this.collageIntParam, collageInfo.collageIntParam) && Intrinsics.LJFF(this.collageImageList, collageInfo.collageImageList);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        SrcImageInfo srcImageInfo = this.generatedImage;
        return ((((iHashCode + (srcImageInfo == null ? 0 : srcImageInfo.hashCode())) * 31) + this.collageIntParam.hashCode()) * 31) + this.collageImageList.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollageInfo(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", generatedImage=");
        sbLIZ.append(this.generatedImage);
        sbLIZ.append(", collageIntParam=");
        sbLIZ.append(this.collageIntParam);
        sbLIZ.append(", collageImageList=");
        sbLIZ.append(this.collageImageList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        SrcImageInfo srcImageInfo = this.generatedImage;
        if (srcImageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            srcImageInfo.writeToParcel(parcel, i);
        }
        this.collageIntParam.writeToParcel(parcel, i);
        List<CollageInnerImageInfo> list = this.collageImageList;
        parcel.writeInt(list.size());
        Iterator<CollageInnerImageInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public final List<CollageInnerImageInfo> getCollageImageList() {
        return this.collageImageList;
    }

    public final CollageIntParam getCollageIntParam() {
        return this.collageIntParam;
    }

    public final SrcImageInfo getGeneratedImage() {
        return this.generatedImage;
    }

    public final String getId() {
        return this.id;
    }

    public CollageInfo(String str, SrcImageInfo srcImageInfo, CollageIntParam collageIntParam, List<CollageInnerImageInfo> list) {
        this.id = str;
        this.generatedImage = srcImageInfo;
        this.collageIntParam = collageIntParam;
        this.collageImageList = list;
    }

    public CollageInfo(String str, SrcImageInfo srcImageInfo, CollageIntParam collageIntParam, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : srcImageInfo, (i & 4) != 0 ? new CollageIntParam(null, 0, 0, null, 15, null) : collageIntParam, (i & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
