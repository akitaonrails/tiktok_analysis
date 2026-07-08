package com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SourceSheetItem implements Parcelable {
    public static final Parcelable.Creator<SourceSheetItem> CREATOR = new Parcelable.Creator<SourceSheetItem>() { // from class: X.0wRk
        @Override // android.os.Parcelable.Creator
        public final SourceSheetItem createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new SourceSheetItem(string, string2, string3, string4, lValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SourceSheetItem[] newArray(int i) {
            return new SourceSheetItem[i];
        }
    };

    @C09CT("comment_id")
    public final String commentId;

    @C09CT("content")
    public final String content;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final String type;

    @C09CT("video_id")
    public final String videoId;

    public SourceSheetItem() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceSheetItem)) {
            return false;
        }
        SourceSheetItem sourceSheetItem = (SourceSheetItem) obj;
        return Intrinsics.LJFF(this.type, sourceSheetItem.type) && Intrinsics.LJFF(this.content, sourceSheetItem.content) && Intrinsics.LJFF(this.imageUrl, sourceSheetItem.imageUrl) && Intrinsics.LJFF(this.schema, sourceSheetItem.schema) && Intrinsics.LJFF(this.createTime, sourceSheetItem.createTime) && Intrinsics.LJFF(this.commentId, sourceSheetItem.commentId) && Intrinsics.LJFF(this.videoId, sourceSheetItem.videoId);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schema;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.commentId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.videoId;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SourceSheetItem(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(", commentId=");
        sbLIZ.append(this.commentId);
        sbLIZ.append(", videoId=");
        sbLIZ.append(this.videoId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.content);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.schema);
        Long l = this.createTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.commentId);
        parcel.writeString(this.videoId);
    }

    public SourceSheetItem(String str, String str2, String str3, String str4, Long l, String str5, String str6) {
        this.type = str;
        this.content = str2;
        this.imageUrl = str3;
        this.schema = str4;
        this.createTime = l;
        this.commentId = str5;
        this.videoId = str6;
    }
}
