package com.ss.android.ugc.aweme.creative.model.story;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.story.StoryEditModel;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryEditModel implements Parcelable {
    public static final Parcelable.Creator<StoryEditModel> CREATOR = new Parcelable.Creator<StoryEditModel>() { // from class: X.0nX5
        @Override // android.os.Parcelable.Creator
        public final StoryEditModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new StoryEditModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryEditModel[] newArray(int i) {
            return new StoryEditModel[i];
        }
    };

    @C040H
    public boolean isStoryEditMode;

    public StoryEditModel() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isStoryEditMode ? 1 : 0);
    }

    public StoryEditModel(boolean z) {
        this.isStoryEditMode = z;
    }

    public /* synthetic */ StoryEditModel(int i) {
        this(false);
    }
}
