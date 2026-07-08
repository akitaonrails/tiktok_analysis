package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import X.C0L9G;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumUIConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumUIConfig implements Parcelable {
    public boolean enableCloseButton;
    public boolean enablePageSheet;
    public Integer maxLimitToastText;
    public int mediaListColumns;
    public C0L9G themeStyle;
    public static final Parcelable.Creator<AlbumUIConfig> CREATOR = new Parcelable.Creator<AlbumUIConfig>() { // from class: X.0Kgp
        @Override // android.os.Parcelable.Creator
        public final AlbumUIConfig createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            C0L9G c0l9gValueOf = C0L9G.valueOf(parcel.readString());
            int i = parcel.readInt();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AlbumUIConfig(c0l9gValueOf, i, z, z2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumUIConfig[] newArray(int i) {
            return new AlbumUIConfig[i];
        }
    };
    public static final int $stable = 8;

    public AlbumUIConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.themeStyle.name());
        parcel.writeInt(this.mediaListColumns);
        parcel.writeInt(this.enableCloseButton ? 1 : 0);
        parcel.writeInt(this.enablePageSheet ? 1 : 0);
        Integer num = this.maxLimitToastText;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public /* synthetic */ AlbumUIConfig(int i) {
        this(C0L9G.SYSTEM, 4, true, false, 2131830079);
    }

    public AlbumUIConfig(C0L9G c0l9g, int i, boolean z, boolean z2, Integer num) {
        this.themeStyle = c0l9g;
        this.mediaListColumns = i;
        this.enableCloseButton = z;
        this.enablePageSheet = z2;
        this.maxLimitToastText = num;
    }
}
