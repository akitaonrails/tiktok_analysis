package com.ss.ugc.android.editor.base.data;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.android.editor.base.data.CoverUrl;
import com.ss.ugc.android.editor.base.data.MusicItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MusicItem implements Parcelable {
    public static final Parcelable.Creator<MusicItem> CREATOR = new Parcelable.Creator<MusicItem>() { // from class: X.0wPK
        @Override // android.os.Parcelable.Creator
        public final MusicItem createFromParcel(Parcel parcel) {
            CoverUrl coverUrlCreateFromParcel;
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                coverUrlCreateFromParcel = null;
            } else {
                coverUrlCreateFromParcel = CoverUrl.CREATOR.createFromParcel(parcel);
            }
            return new MusicItem(j, string, string2, string3, i, string4, coverUrlCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicItem[] newArray(int i) {
            return new MusicItem[i];
        }
    };
    public String author;
    public CoverUrl coverUrl;
    public int duration;
    public String fileName;
    public long id;
    public String musicUrs;
    public String previewUrl;
    public String title;
    public String uri;

    public MusicItem() {
        this(0L, "", "", "", 0, "", null, null, null);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.uri;
    }

    public final int component5() {
        return this.duration;
    }

    public final String component6() {
        return this.previewUrl;
    }

    public final CoverUrl component7() {
        return this.coverUrl;
    }

    public final String component8() {
        return this.fileName;
    }

    public final MusicItem copy(long j, String str, String str2, String str3, int i, String str4, CoverUrl coverUrl, String str5, String str6) {
        return new MusicItem(j, str, str2, str3, i, str4, coverUrl, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicItem)) {
            return false;
        }
        MusicItem musicItem = (MusicItem) obj;
        return this.id == musicItem.id && Intrinsics.LJFF(this.title, musicItem.title) && Intrinsics.LJFF(this.author, musicItem.author) && Intrinsics.LJFF(this.uri, musicItem.uri) && this.duration == musicItem.duration && Intrinsics.LJFF(this.previewUrl, musicItem.previewUrl) && Intrinsics.LJFF(this.coverUrl, musicItem.coverUrl) && Intrinsics.LJFF(this.fileName, musicItem.fileName) && Intrinsics.LJFF(this.musicUrs, musicItem.musicUrs);
    }

    public int hashCode() {
        int iY2 = ((((((((C786410Ut5.Y2(this.id) * 31) + this.title.hashCode()) * 31) + this.author.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.duration) * 31;
        String str = this.previewUrl;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        CoverUrl coverUrl = this.coverUrl;
        int iHashCode2 = (iHashCode + (coverUrl == null ? 0 : coverUrl.hashCode())) * 31;
        String str2 = this.fileName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.musicUrs;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicItem(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", previewUrl=");
        sbLIZ.append(this.previewUrl);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", fileName=");
        sbLIZ.append(this.fileName);
        sbLIZ.append(", musicUrs=");
        sbLIZ.append(this.musicUrs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.author);
        parcel.writeString(this.uri);
        parcel.writeInt(this.duration);
        parcel.writeString(this.previewUrl);
        CoverUrl coverUrl = this.coverUrl;
        if (coverUrl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coverUrl.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fileName);
        parcel.writeString(this.musicUrs);
    }

    public final String getMusicUrs() {
        return this.musicUrs;
    }

    public final void setMusicUrs(String str) {
        this.musicUrs = str;
    }

    public MusicItem(long j, String str, String str2, String str3, int i, String str4, CoverUrl coverUrl, String str5, String str6) {
        this.id = j;
        this.title = str;
        this.author = str2;
        this.uri = str3;
        this.duration = i;
        this.previewUrl = str4;
        this.coverUrl = coverUrl;
        this.fileName = str5;
        this.musicUrs = str6;
    }
}
