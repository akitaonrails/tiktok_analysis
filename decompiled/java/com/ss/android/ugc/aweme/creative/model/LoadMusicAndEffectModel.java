package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.LoadMusicAndEffectModel;

/* JADX INFO: loaded from: classes23.dex */
public final class LoadMusicAndEffectModel implements Parcelable {
    public static final Parcelable.Creator<LoadMusicAndEffectModel> CREATOR = new Parcelable.Creator<LoadMusicAndEffectModel>() { // from class: X.0nfc
        @Override // android.os.Parcelable.Creator
        public final LoadMusicAndEffectModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                z3 = false;
            }
            return new LoadMusicAndEffectModel(z, z2, string, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final LoadMusicAndEffectModel[] newArray(int i) {
            return new LoadMusicAndEffectModel[i];
        }
    };

    @C040H
    public boolean isDraftMusicLegal;

    @C040H
    public boolean loadAfterRecord;

    @C040H
    public String musicId;

    @C040H
    public boolean netUnavailableMusic;

    public LoadMusicAndEffectModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.loadAfterRecord ? 1 : 0);
        parcel.writeInt(this.netUnavailableMusic ? 1 : 0);
        parcel.writeString(this.musicId);
        parcel.writeInt(this.isDraftMusicLegal ? 1 : 0);
    }

    public /* synthetic */ LoadMusicAndEffectModel(int i) {
        this(false, false, null, true);
    }

    public LoadMusicAndEffectModel(boolean z, boolean z2, String str, boolean z3) {
        this.loadAfterRecord = z;
        this.netUnavailableMusic = z2;
        this.musicId = str;
        this.isDraftMusicLegal = z3;
    }
}
