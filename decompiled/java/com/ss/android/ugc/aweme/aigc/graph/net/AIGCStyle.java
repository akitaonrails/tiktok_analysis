package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.graph.net.AIGCStyle;
import com.ss.android.ugc.aweme.aigc.graph.net.BizParam;
import com.ss.android.ugc.aweme.aigc.graph.net.UrlStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AIGCStyle implements Parcelable {
    public static final Parcelable.Creator<AIGCStyle> CREATOR = new Parcelable.Creator<AIGCStyle>() { // from class: X.0wVS
        @Override // android.os.Parcelable.Creator
        public final AIGCStyle createFromParcel(Parcel parcel) {
            BizParam bizParamCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            UrlStruct urlStruct = (UrlStruct) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                bizParamCreateFromParcel = null;
            } else {
                bizParamCreateFromParcel = BizParam.CREATOR.createFromParcel(parcel);
            }
            return new AIGCStyle(string, string2, string3, string4, string5, string6, string7, string8, urlStruct, bizParamCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCStyle[] newArray(int i) {
            return new AIGCStyle[i];
        }
    };

    @C09CT("biz_params")
    public final BizParam bizParams;

    @C09CT("display_name")
    public final String displayName;

    @C09CT("extra")
    public final String extra;

    @C09CT("icon_url")
    public final UrlStruct iconUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("name")
    public final String name;

    @C09CT("root_id")
    public final String rootId;

    @C09CT("root_resource_id")
    public final String rootResourceId;

    @C09CT("style_image")
    public final String styleImage;

    @C09CT("style_resource_id")
    public final String styleResourceId;

    public AIGCStyle() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCStyle)) {
            return false;
        }
        AIGCStyle aIGCStyle = (AIGCStyle) obj;
        return Intrinsics.LJFF(this.name, aIGCStyle.name) && Intrinsics.LJFF(this.styleImage, aIGCStyle.styleImage) && Intrinsics.LJFF(this.displayName, aIGCStyle.displayName) && Intrinsics.LJFF(this.id, aIGCStyle.id) && Intrinsics.LJFF(this.rootId, aIGCStyle.rootId) && Intrinsics.LJFF(this.extra, aIGCStyle.extra) && Intrinsics.LJFF(this.styleResourceId, aIGCStyle.styleResourceId) && Intrinsics.LJFF(this.rootResourceId, aIGCStyle.rootResourceId) && Intrinsics.LJFF(this.iconUrl, aIGCStyle.iconUrl) && Intrinsics.LJFF(this.bizParams, aIGCStyle.bizParams);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.styleImage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rootId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.extra;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.styleResourceId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rootResourceId;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UrlStruct urlStruct = this.iconUrl;
        int iHashCode9 = (iHashCode8 + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31;
        BizParam bizParam = this.bizParams;
        return iHashCode9 + (bizParam != null ? bizParam.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCStyle(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", styleImage=");
        sbLIZ.append(this.styleImage);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.displayName);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", rootId=");
        sbLIZ.append(this.rootId);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", styleResourceId=");
        sbLIZ.append(this.styleResourceId);
        sbLIZ.append(", rootResourceId=");
        sbLIZ.append(this.rootResourceId);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", bizParams=");
        sbLIZ.append(this.bizParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.styleImage);
        parcel.writeString(this.displayName);
        parcel.writeString(this.id);
        parcel.writeString(this.rootId);
        parcel.writeString(this.extra);
        parcel.writeString(this.styleResourceId);
        parcel.writeString(this.rootResourceId);
        parcel.writeSerializable(this.iconUrl);
        BizParam bizParam = this.bizParams;
        if (bizParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bizParam.writeToParcel(parcel, i);
        }
    }

    public AIGCStyle(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, UrlStruct urlStruct, BizParam bizParam) {
        this.name = str;
        this.styleImage = str2;
        this.displayName = str3;
        this.id = str4;
        this.rootId = str5;
        this.extra = str6;
        this.styleResourceId = str7;
        this.rootResourceId = str8;
        this.iconUrl = urlStruct;
        this.bizParams = bizParam;
    }
}
