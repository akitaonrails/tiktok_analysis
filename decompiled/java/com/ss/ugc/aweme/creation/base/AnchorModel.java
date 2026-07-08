package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.AnchorModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class AnchorModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AnchorModel> CREATOR = new Parcelable.Creator<AnchorModel>() { // from class: X.0MiE
        @Override // android.os.Parcelable.Creator
        public final AnchorModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z;
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            return new AnchorModel(i, string, string2, string3, string4, string5, string6, string7, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AnchorModel[] newArray(int i) {
            return new AnchorModel[i];
        }
    };

    @C09CT("content")
    public String content;

    @C09CT("extra")
    public String extra;

    @C09CT("fixed")
    public Boolean fixed;

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("keyword")
    public String keyword;

    @C09CT("language")
    public String language;

    @C09CT("sub_type")
    public String subType;

    @C09CT("type")
    public int type;

    @C09CT("url")
    public String url;

    public AnchorModel() {
        this(0, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeInt(this.type);
        parcel.writeString(this.subType);
        parcel.writeString(this.keyword);
        parcel.writeString(this.url);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.language);
        parcel.writeString(this.content);
        parcel.writeString(this.extra);
        Boolean bool = this.fixed;
        if (bool != null) {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        parcel.writeInt(BooleanValue);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Boolean getFixed() {
        return this.fixed;
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

    public final String getSubType() {
        return this.subType;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFixed(Boolean bool) {
        this.fixed = bool;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setSubType(String str) {
        this.subType = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public AnchorModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.type = i;
        this.subType = str;
        this.keyword = str2;
        this.url = str3;
        this.iconUrl = str4;
        this.language = str5;
        this.content = str6;
        this.extra = str7;
        this.fixed = bool;
    }
}
