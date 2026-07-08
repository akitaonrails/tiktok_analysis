package com.ss.android.ugc.aweme.composer.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.model.MixStudioShareStoryInputData;
import com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MixStudioShareStoryInputData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MixStudioShareStoryInputData> CREATOR = new Parcelable.Creator<MixStudioShareStoryInputData>() { // from class: X.0Mia
        @Override // android.os.Parcelable.Creator
        public final MixStudioShareStoryInputData createFromParcel(Parcel parcel) {
            return new MixStudioShareStoryInputData((MixStickerInfo) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final MixStudioShareStoryInputData[] newArray(int i) {
            return new MixStudioShareStoryInputData[i];
        }
    };

    @C09CT("imagine_sticker_info")
    public MixStickerInfo mixStickerInfo;

    public MixStudioShareStoryInputData() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.mixStickerInfo);
    }

    public final MixStickerInfo getMixStickerInfo() {
        return this.mixStickerInfo;
    }

    public MixStudioShareStoryInputData(MixStickerInfo mixStickerInfo) {
        this.mixStickerInfo = mixStickerInfo;
    }

    public final void setMixStickerInfo(MixStickerInfo mixStickerInfo) {
        this.mixStickerInfo = mixStickerInfo;
    }
}
