package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.StoryStreakTextStickerStyleModel;

/* JADX INFO: loaded from: classes6.dex */
public final class StoryStreakTextStickerStyleModel implements Parcelable {

    @C09CT("font_weight")
    public final int fontWeight;

    @C09CT("max_sticker_width")
    public final int maxStickerWidth;

    @C09CT("sticker_height")
    public final int stickerHeight;
    public static final Parcelable.Creator<StoryStreakTextStickerStyleModel> CREATOR = new Parcelable.Creator<StoryStreakTextStickerStyleModel>() { // from class: X.0F7m
        @Override // android.os.Parcelable.Creator
        public final StoryStreakTextStickerStyleModel createFromParcel(Parcel parcel) {
            return new StoryStreakTextStickerStyleModel(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryStreakTextStickerStyleModel[] newArray(int i) {
            return new StoryStreakTextStickerStyleModel[i];
        }
    };
    public static final int $stable = 8;

    public StoryStreakTextStickerStyleModel() {
        this(0, 0, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryStreakTextStickerStyleModel)) {
            return false;
        }
        StoryStreakTextStickerStyleModel storyStreakTextStickerStyleModel = (StoryStreakTextStickerStyleModel) obj;
        return this.maxStickerWidth == storyStreakTextStickerStyleModel.maxStickerWidth && this.fontWeight == storyStreakTextStickerStyleModel.fontWeight && this.stickerHeight == storyStreakTextStickerStyleModel.stickerHeight;
    }

    public final int hashCode() {
        return (((this.maxStickerWidth * 31) + this.fontWeight) * 31) + this.stickerHeight;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryStreakTextStickerStyleModel(maxStickerWidth=");
        sbLIZ.append(this.maxStickerWidth);
        sbLIZ.append(", fontWeight=");
        sbLIZ.append(this.fontWeight);
        sbLIZ.append(", stickerHeight=");
        sbLIZ.append(this.stickerHeight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.maxStickerWidth);
        parcel.writeInt(this.fontWeight);
        parcel.writeInt(this.stickerHeight);
    }

    public StoryStreakTextStickerStyleModel(int i, int i2, int i3) {
        this.maxStickerWidth = i;
        this.fontWeight = i2;
        this.stickerHeight = i3;
    }
}
