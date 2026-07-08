package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.C1446710nkb;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CreateAnchorInfo implements Serializable, Parcelable {
    public Long addTime;
    public final Boolean canDelete;
    public final String content;
    public final boolean display;
    public final String extra;
    public Integer iconRawId;
    public String iconUrl;
    public final boolean isEditProp;
    public final String keyword;
    public final String language;
    public final String minisInfos;
    public final String pluginInfo;
    public final String subtype;

    @C09CT("third_id")
    public String thirdId;

    @C09CT("time")
    public String time;
    public final int type;
    public final String url;
    public static final C1446710nkb Companion = new Object() { // from class: X.0nkb
    };
    public static final Parcelable.Creator<CreateAnchorInfo> CREATOR = new Parcelable.Creator<CreateAnchorInfo>() { // from class: X.0Lnj
        @Override // android.os.Parcelable.Creator
        public final CreateAnchorInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            boolean z3;
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new CreateAnchorInfo(i, string, string2, string3, string4, string5, lValueOf, string6, string7, string8, string9, boolValueOf, z2, string10, string11, z3, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CreateAnchorInfo[] newArray(int i) {
            return new CreateAnchorInfo[i];
        }
    };

    public final CreateAnchorInfo copy(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool, boolean z, String str10, String str11, boolean z2, Integer num) {
        return new CreateAnchorInfo(i, str, str2, str3, str4, str5, l, str6, str7, str8, str9, bool, z, str10, str11, z2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAnchorInfo)) {
            return false;
        }
        CreateAnchorInfo createAnchorInfo = (CreateAnchorInfo) obj;
        return this.type == createAnchorInfo.type && Intrinsics.LJFF(this.keyword, createAnchorInfo.keyword) && Intrinsics.LJFF(this.url, createAnchorInfo.url) && Intrinsics.LJFF(this.language, createAnchorInfo.language) && Intrinsics.LJFF(this.content, createAnchorInfo.content) && Intrinsics.LJFF(this.iconUrl, createAnchorInfo.iconUrl) && Intrinsics.LJFF(this.addTime, createAnchorInfo.addTime) && Intrinsics.LJFF(this.extra, createAnchorInfo.extra) && Intrinsics.LJFF(this.thirdId, createAnchorInfo.thirdId) && Intrinsics.LJFF(this.time, createAnchorInfo.time) && Intrinsics.LJFF(this.subtype, createAnchorInfo.subtype) && Intrinsics.LJFF(this.canDelete, createAnchorInfo.canDelete) && this.display == createAnchorInfo.display && Intrinsics.LJFF(this.pluginInfo, createAnchorInfo.pluginInfo) && Intrinsics.LJFF(this.minisInfos, createAnchorInfo.minisInfos) && this.isEditProp == createAnchorInfo.isEditProp && Intrinsics.LJFF(this.iconRawId, createAnchorInfo.iconRawId);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.type * 31) + this.keyword.hashCode()) * 31) + this.url.hashCode()) * 31) + this.language.hashCode()) * 31) + this.content.hashCode()) * 31;
        String str = this.iconUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.addTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.extra;
        int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.thirdId.hashCode()) * 31) + this.time.hashCode()) * 31;
        String str3 = this.subtype;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canDelete;
        int iHashCode6 = (((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.display)) * 31;
        String str4 = this.pluginInfo;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minisInfos;
        int iHashCode8 = (((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.isEditProp)) * 31;
        Integer num = this.iconRawId;
        return iHashCode8 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CreateAnchorInfo(type=" + this.type + ", keyword=" + this.keyword + ", url=" + this.url + ", language=" + this.language + ", content=" + this.content + ", iconUrl=" + this.iconUrl + ", addTime=" + this.addTime + ", extra=" + this.extra + ", thirdId=" + this.thirdId + ", time=" + this.time + ", subtype=" + this.subtype + ", canDelete=" + this.canDelete + ", display=" + this.display + ", pluginInfo=" + this.pluginInfo + ", minisInfos=" + this.minisInfos + ", isEditProp=" + this.isEditProp + ", iconRawId=" + this.iconRawId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.keyword);
        parcel.writeString(this.url);
        parcel.writeString(this.language);
        parcel.writeString(this.content);
        parcel.writeString(this.iconUrl);
        Long l = this.addTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.extra);
        parcel.writeString(this.thirdId);
        parcel.writeString(this.time);
        parcel.writeString(this.subtype);
        Boolean bool = this.canDelete;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.display ? 1 : 0);
        parcel.writeString(this.pluginInfo);
        parcel.writeString(this.minisInfos);
        parcel.writeInt(this.isEditProp ? 1 : 0);
        Integer num = this.iconRawId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public final Long getAddTime() {
        return this.addTime;
    }

    public final Boolean getCanDelete() {
        return this.canDelete;
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean getDisplay() {
        return this.display;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Integer getIconRawId() {
        return this.iconRawId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getMinisInfos() {
        return this.minisInfos;
    }

    public final String getPluginInfo() {
        return this.pluginInfo;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getThirdId() {
        return this.thirdId;
    }

    public final String getTime() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isEditProp() {
        return this.isEditProp;
    }

    public final void setAddTime(Long l) {
        this.addTime = l;
    }

    public final void setIconRawId(Integer num) {
        this.iconRawId = num;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setThirdId(String str) {
        this.thirdId = str;
    }

    public final void setTime(String str) {
        this.time = str;
    }

    public CreateAnchorInfo(int i, String str, String str2) {
        this(i, str, "", "", str2, "", Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3) {
        this(i, str, str2, "", str3, "", Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4) {
        this(i, str, str2, str3, str4, "", Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5) {
        this(i, str, str2, str3, str4, str5, Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l) {
        this(i, str, str2, str3, str4, str5, l, "", "", "", "", Boolean.TRUE, true, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6) {
        this(i, str, str2, str3, str4, str5, l, str6, "", "", "", Boolean.TRUE, true, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7) {
        this(i, str, str2, str3, str4, str5, l, str6, str7, "", "", Boolean.TRUE, true, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8) {
        this(i, str, str2, str3, str4, str5, l, str6, str7, str8, "", Boolean.TRUE, true, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9) {
        this(i, str, str2, str3, str4, str5, l, str6, str7, str8, str9, Boolean.TRUE, true, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool) {
        this(i, str, str2, str3, str4, str5, l, str6, str7, str8, str9, bool, true, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool, boolean z) {
        this(i, str, str2, str3, str4, str5, l, str6, str7, str8, str9, bool, z, null, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool, boolean z, String str10) {
        this(i, str, str2, str3, str4, str5, l, str6, str7, str8, str9, bool, z, str10, null, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool, boolean z, String str10, String str11) {
        this(i, str, str2, str3, str4, str5, l, str6, str7, str8, str9, bool, z, str10, str11, false, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool, boolean z, String str10, String str11, boolean z2) {
        this(i, str, str2, str3, str4, str5, l, str6, str7, str8, str9, bool, z, str10, str11, z2, null);
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool, boolean z, String str10, String str11, boolean z2, Integer num) {
        this.type = i;
        this.keyword = str;
        this.url = str2;
        this.language = str3;
        this.content = str4;
        this.iconUrl = str5;
        this.addTime = l;
        this.extra = str6;
        this.thirdId = str7;
        this.time = str8;
        this.subtype = str9;
        this.canDelete = bool;
        this.display = z;
        this.pluginInfo = str10;
        this.minisInfos = str11;
        this.isEditProp = z2;
        this.iconRawId = num;
    }
}
