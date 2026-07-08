package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MdpInfoModel;

/* JADX INFO: loaded from: classes23.dex */
public final class MdpInfoModel implements Parcelable {
    public static final Parcelable.Creator<MdpInfoModel> CREATOR = new Parcelable.Creator<MdpInfoModel>() { // from class: X.0nX3
        @Override // android.os.Parcelable.Creator
        public final MdpInfoModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MdpInfoModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final MdpInfoModel[] newArray(int i) {
            return new MdpInfoModel[i];
        }
    };

    @C09CT("from_offline_music_mdp")
    public boolean fromOfflineMusicMdp;

    public MdpInfoModel() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.fromOfflineMusicMdp ? 1 : 0);
    }

    public MdpInfoModel(boolean z) {
        this.fromOfflineMusicMdp = z;
    }
}
