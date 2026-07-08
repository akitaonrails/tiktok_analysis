package com.ss.android.ugc.aweme.creative.model.story.stickercreate;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryAnniversaryStickerModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryAnniversaryStickerModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<StoryAnniversaryStickerModel> CREATOR = new Parcelable.Creator<StoryAnniversaryStickerModel>() { // from class: X.0nYn
        @Override // android.os.Parcelable.Creator
        public final StoryAnniversaryStickerModel createFromParcel(Parcel parcel) {
            return new StoryAnniversaryStickerModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryAnniversaryStickerModel[] newArray(int i) {
            return new StoryAnniversaryStickerModel[i];
        }
    };

    @C09CT("to_user_id")
    public String toUserId;

    public StoryAnniversaryStickerModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.toUserId);
    }

    public final String getToUserId() {
        return this.toUserId;
    }

    public StoryAnniversaryStickerModel(String str) {
        this.toUserId = str;
    }

    public final void setToUserId(String str) {
        this.toUserId = str;
    }
}
