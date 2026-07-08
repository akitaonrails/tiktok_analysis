package com.ss.android.ugc.aweme.socialavatar.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarStickerStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<SocialAvatarStickerStruct> CREATOR = new Parcelable.Creator<SocialAvatarStickerStruct>() { // from class: X.0HtW
        @Override // android.os.Parcelable.Creator
        public final SocialAvatarStickerStruct createFromParcel(Parcel parcel) {
            Long lValueOf;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new SocialAvatarStickerStruct(lValueOf, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SocialAvatarStickerStruct[] newArray(int i) {
            return new SocialAvatarStickerStruct[i];
        }
    };

    @C09CT("expression")
    public List<String> expression;

    @C09CT("high_resolution_url")
    public List<String> highResolutionUrl;

    @C09CT("sticker_id")
    public Long id;

    @C09CT("low_resolution_url")
    public List<String> lowResolutionUrl;

    @C09CT("mid_resolution_url")
    public List<String> midResolutionUrl;

    public SocialAvatarStickerStruct() {
        this(null, null, null, null, null);
    }

    public final SocialAvatarStickerStruct copy(Long l, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        return new SocialAvatarStickerStruct(l, list, list2, list3, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarStickerStruct)) {
            return false;
        }
        SocialAvatarStickerStruct socialAvatarStickerStruct = (SocialAvatarStickerStruct) obj;
        return Intrinsics.LJFF(this.id, socialAvatarStickerStruct.id) && Intrinsics.LJFF(this.expression, socialAvatarStickerStruct.expression) && Intrinsics.LJFF(this.lowResolutionUrl, socialAvatarStickerStruct.lowResolutionUrl) && Intrinsics.LJFF(this.midResolutionUrl, socialAvatarStickerStruct.midResolutionUrl) && Intrinsics.LJFF(this.highResolutionUrl, socialAvatarStickerStruct.highResolutionUrl);
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<String> list = this.expression;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.lowResolutionUrl;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.midResolutionUrl;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.highResolutionUrl;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarStickerStruct(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", expression=");
        sbLIZ.append(this.expression);
        sbLIZ.append(", lowResolutionUrl=");
        sbLIZ.append(this.lowResolutionUrl);
        sbLIZ.append(", midResolutionUrl=");
        sbLIZ.append(this.midResolutionUrl);
        sbLIZ.append(", highResolutionUrl=");
        sbLIZ.append(this.highResolutionUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeStringList(this.expression);
        parcel.writeStringList(this.lowResolutionUrl);
        parcel.writeStringList(this.midResolutionUrl);
        parcel.writeStringList(this.highResolutionUrl);
    }

    public final List<String> getExpression() {
        return this.expression;
    }

    public final List<String> getHighResolutionUrl() {
        return this.highResolutionUrl;
    }

    public final Long getId() {
        return this.id;
    }

    public final List<String> getLowResolutionUrl() {
        return this.lowResolutionUrl;
    }

    public final List<String> getMidResolutionUrl() {
        return this.midResolutionUrl;
    }

    public SocialAvatarStickerStruct(Long l, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        this.id = l;
        this.expression = list;
        this.lowResolutionUrl = list2;
        this.midResolutionUrl = list3;
        this.highResolutionUrl = list4;
    }
}
