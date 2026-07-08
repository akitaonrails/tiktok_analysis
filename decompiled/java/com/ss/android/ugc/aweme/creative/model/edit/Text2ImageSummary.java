package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageSummary;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageSummary implements Parcelable, Serializable {
    public static final Parcelable.Creator<Text2ImageSummary> CREATOR = new Parcelable.Creator<Text2ImageSummary>() { // from class: X.0MdD
        @Override // android.os.Parcelable.Creator
        public final Text2ImageSummary createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new Text2ImageSummary(numValueOf, string, string2, numValueOf2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Text2ImageSummary[] newArray(int i) {
            return new Text2ImageSummary[i];
        }
    };

    @C09CT("cover_path")
    @C0MY0
    public String coverPath;

    @C09CT("cover_url")
    public String coverUrl;

    @C09CT("desc")
    public final String desc;

    @C09CT("max_lines")
    public Integer maxLines;

    @C09CT("nick_name")
    public String nickName;

    @C09CT("summary_content")
    public final String summaryContent;

    @C09CT("summary_type")
    public Integer summaryType;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageSummary() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final Text2ImageSummary copy(Integer num, String str, String str2, Integer num2, String str3, String str4, String str5) {
        return new Text2ImageSummary(num, str, str2, num2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2ImageSummary)) {
            return false;
        }
        Text2ImageSummary text2ImageSummary = (Text2ImageSummary) obj;
        return Intrinsics.LJFF(this.summaryType, text2ImageSummary.summaryType) && Intrinsics.LJFF(this.summaryContent, text2ImageSummary.summaryContent) && Intrinsics.LJFF(this.desc, text2ImageSummary.desc) && Intrinsics.LJFF(this.maxLines, text2ImageSummary.maxLines) && Intrinsics.LJFF(this.nickName, text2ImageSummary.nickName) && Intrinsics.LJFF(this.coverUrl, text2ImageSummary.coverUrl) && Intrinsics.LJFF(this.coverPath, text2ImageSummary.coverPath);
    }

    public int hashCode() {
        Integer num = this.summaryType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.summaryContent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.desc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.maxLines;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.nickName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coverUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.coverPath;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageSummary(summaryType=");
        sbLIZ.append(this.summaryType);
        sbLIZ.append(", summaryContent=");
        sbLIZ.append(this.summaryContent);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", maxLines=");
        sbLIZ.append(this.maxLines);
        sbLIZ.append(", nickName=");
        sbLIZ.append(this.nickName);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", coverPath=");
        sbLIZ.append(this.coverPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.summaryType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.summaryContent);
        parcel.writeString(this.desc);
        Integer num2 = this.maxLines;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.nickName);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.coverPath);
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final Integer getMaxLines() {
        return this.maxLines;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getSummaryContent() {
        return this.summaryContent;
    }

    public final Integer getSummaryType() {
        return this.summaryType;
    }

    public final void setCoverPath(String str) {
        this.coverPath = str;
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setMaxLines(Integer num) {
        this.maxLines = num;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setSummaryType(Integer num) {
        this.summaryType = num;
    }

    public Text2ImageSummary(Integer num, String str, String str2, Integer num2, String str3, String str4, String str5) {
        this.summaryType = num;
        this.summaryContent = str;
        this.desc = str2;
        this.maxLines = num2;
        this.nickName = str3;
        this.coverUrl = str4;
        this.coverPath = str5;
    }

    public /* synthetic */ Text2ImageSummary(Integer num, String str, String str2, Integer num2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? str5 : null);
    }
}
