package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EditCapCutReuseModel implements Parcelable {
    public static final Parcelable.Creator<EditCapCutReuseModel> CREATOR = new Parcelable.Creator<EditCapCutReuseModel>() { // from class: X.0nf1
        @Override // android.os.Parcelable.Creator
        public final EditCapCutReuseModel createFromParcel(Parcel parcel) {
            EditCapCutReuseModel.MusicInfo musicInfoCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                musicInfoCreateFromParcel = null;
            } else {
                musicInfoCreateFromParcel = EditCapCutReuseModel.MusicInfo.CREATOR.createFromParcel(parcel);
            }
            return new EditCapCutReuseModel(string, musicInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EditCapCutReuseModel[] newArray(int i) {
            return new EditCapCutReuseModel[i];
        }
    };

    @C040H
    @C09CT("creation_id")
    public final String creationId;

    @C09CT("music_info")
    public MusicInfo musicInfo;

    public static final class MusicInfo implements Parcelable, Serializable {
        public static final Parcelable.Creator<MusicInfo> CREATOR = new Parcelable.Creator<MusicInfo>() { // from class: X.0nf3
            @Override // android.os.Parcelable.Creator
            public final EditCapCutReuseModel.MusicInfo createFromParcel(Parcel parcel) {
                boolean z;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new EditCapCutReuseModel.MusicInfo(string, string2, string3, string4, z);
            }

            @Override // android.os.Parcelable.Creator
            public final EditCapCutReuseModel.MusicInfo[] newArray(int i) {
                return new EditCapCutReuseModel.MusicInfo[i];
            }
        };

        @C09CT("author_name")
        public final String authorName;

        @C09CT("cover_uri")
        public final String coverUri;

        @C040H
        public final boolean isPgc;

        @C09CT("music_id")
        public final String musicId;

        @C09CT("music_name")
        public final String musicName;

        public final MusicInfo copy(String str, String str2, String str3, String str4, boolean z) {
            return new MusicInfo(str, str2, str3, str4, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicInfo)) {
                return false;
            }
            MusicInfo musicInfo = (MusicInfo) obj;
            return Intrinsics.LJFF(this.musicId, musicInfo.musicId) && Intrinsics.LJFF(this.musicName, musicInfo.musicName) && Intrinsics.LJFF(this.authorName, musicInfo.authorName) && Intrinsics.LJFF(this.coverUri, musicInfo.coverUri) && this.isPgc == musicInfo.isPgc;
        }

        public int hashCode() {
            return (((((((this.musicId.hashCode() * 31) + this.musicName.hashCode()) * 31) + this.authorName.hashCode()) * 31) + this.coverUri.hashCode()) * 31) + C786410Ut5.Z2(this.isPgc);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MusicInfo(musicId=");
            sbLIZ.append(this.musicId);
            sbLIZ.append(", musicName=");
            sbLIZ.append(this.musicName);
            sbLIZ.append(", authorName=");
            sbLIZ.append(this.authorName);
            sbLIZ.append(", coverUri=");
            sbLIZ.append(this.coverUri);
            sbLIZ.append(", isPgc=");
            sbLIZ.append(this.isPgc);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.musicId);
            parcel.writeString(this.musicName);
            parcel.writeString(this.authorName);
            parcel.writeString(this.coverUri);
            parcel.writeInt(this.isPgc ? 1 : 0);
        }

        public MusicInfo() {
            this("", "", "", "", false);
        }

        public final String getAuthorName() {
            return this.authorName;
        }

        public final String getCoverUri() {
            return this.coverUri;
        }

        public final String getMusicId() {
            return this.musicId;
        }

        public final String getMusicName() {
            return this.musicName;
        }

        public final boolean isPgc() {
            return this.isPgc;
        }

        public MusicInfo(String str, String str2, String str3, String str4, boolean z) {
            this.musicId = str;
            this.musicName = str2;
            this.authorName = str3;
            this.coverUri = str4;
            this.isPgc = z;
        }
    }

    public EditCapCutReuseModel() {
        this("", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.creationId);
        MusicInfo musicInfo = this.musicInfo;
        if (musicInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicInfo.writeToParcel(parcel, i);
        }
    }

    public EditCapCutReuseModel(String str, MusicInfo musicInfo) {
        this.creationId = str;
        this.musicInfo = musicInfo;
    }
}
