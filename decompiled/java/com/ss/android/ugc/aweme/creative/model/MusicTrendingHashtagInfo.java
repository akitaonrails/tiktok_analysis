package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MusicTrendingHashtagInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicTrendingHashtagInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicTrendingHashtagInfo> CREATOR = new Parcelable.Creator<MusicTrendingHashtagInfo>() { // from class: X.0mUr
        @Override // android.os.Parcelable.Creator
        public final MusicTrendingHashtagInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new MusicTrendingHashtagInfo(boolValueOf, string, string2, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MusicTrendingHashtagInfo[] newArray(int i) {
            return new MusicTrendingHashtagInfo[i];
        }
    };

    @C09CT("hashtag_id")
    public String hashTagId;

    @C09CT("hashtag_name")
    public String hashtagName;

    @C09CT("hashtag_views")
    public Long hashtagViews;

    @C09CT("is_hot_trending_hashtag")
    public Boolean isHotTrendingHashtag;

    public MusicTrendingHashtagInfo() {
        this(null, null, null, null);
    }

    public final MusicTrendingHashtagInfo copy(Boolean bool, String str, String str2, Long l) {
        return new MusicTrendingHashtagInfo(bool, str, str2, l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicTrendingHashtagInfo)) {
            return false;
        }
        MusicTrendingHashtagInfo musicTrendingHashtagInfo = (MusicTrendingHashtagInfo) obj;
        return Intrinsics.LJFF(this.isHotTrendingHashtag, musicTrendingHashtagInfo.isHotTrendingHashtag) && Intrinsics.LJFF(this.hashtagName, musicTrendingHashtagInfo.hashtagName) && Intrinsics.LJFF(this.hashTagId, musicTrendingHashtagInfo.hashTagId) && Intrinsics.LJFF(this.hashtagViews, musicTrendingHashtagInfo.hashtagViews);
    }

    public int hashCode() {
        Boolean bool = this.isHotTrendingHashtag;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.hashtagName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hashTagId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.hashtagViews;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicTrendingHashtagInfo(isHotTrendingHashtag=");
        sbLIZ.append(this.isHotTrendingHashtag);
        sbLIZ.append(", hashtagName=");
        sbLIZ.append(this.hashtagName);
        sbLIZ.append(", hashTagId=");
        sbLIZ.append(this.hashTagId);
        sbLIZ.append(", hashtagViews=");
        sbLIZ.append(this.hashtagViews);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isHotTrendingHashtag;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.hashtagName);
        parcel.writeString(this.hashTagId);
        Long l = this.hashtagViews;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public final String getHashTagId() {
        return this.hashTagId;
    }

    public final String getHashtagName() {
        return this.hashtagName;
    }

    public final Long getHashtagViews() {
        return this.hashtagViews;
    }

    public final Boolean isHotTrendingHashtag() {
        return this.isHotTrendingHashtag;
    }

    public final void setHashTagId(String str) {
        this.hashTagId = str;
    }

    public final void setHashtagName(String str) {
        this.hashtagName = str;
    }

    public final void setHashtagViews(Long l) {
        this.hashtagViews = l;
    }

    public final void setHotTrendingHashtag(Boolean bool) {
        this.isHotTrendingHashtag = bool;
    }

    public MusicTrendingHashtagInfo(Boolean bool, String str, String str2, Long l) {
        this.isHotTrendingHashtag = bool;
        this.hashtagName = str;
        this.hashTagId = str2;
        this.hashtagViews = l;
    }
}
