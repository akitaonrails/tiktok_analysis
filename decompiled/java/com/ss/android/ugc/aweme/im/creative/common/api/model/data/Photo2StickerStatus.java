package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.Photo2StickerStatus;

/* JADX INFO: loaded from: classes23.dex */
public interface Photo2StickerStatus extends Parcelable {

    public static final class DISABLED implements Photo2StickerStatus {
        public static final DISABLED INSTANCE = new DISABLED();
        public static final Parcelable.Creator<DISABLED> CREATOR = new Parcelable.Creator<DISABLED>() { // from class: X.0niB
            @Override // android.os.Parcelable.Creator
            public final Photo2StickerStatus.DISABLED createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Photo2StickerStatus.DISABLED.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Photo2StickerStatus.DISABLED[] newArray(int i) {
                return new Photo2StickerStatus.DISABLED[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static final class ENABLED implements Photo2StickerStatus {
        public static final ENABLED INSTANCE = new ENABLED();
        public static final Parcelable.Creator<ENABLED> CREATOR = new Parcelable.Creator<ENABLED>() { // from class: X.0niQ
            @Override // android.os.Parcelable.Creator
            public final Photo2StickerStatus.ENABLED createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Photo2StickerStatus.ENABLED.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Photo2StickerStatus.ENABLED[] newArray(int i) {
                return new Photo2StickerStatus.ENABLED[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}
