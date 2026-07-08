package com.ss.android.ugc.aweme.creative.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.StoryLivePhotoMode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class StoryLivePhotoMode implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ StoryLivePhotoMode[] $VALUES;
    public static final Parcelable.Creator<StoryLivePhotoMode> CREATOR;
    public static final StoryLivePhotoMode LIVE_PHOTO;
    public static final StoryLivePhotoMode NONE;
    public static final StoryLivePhotoMode STATIC;

    public static InterfaceC2044707zh<StoryLivePhotoMode> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }

    static {
        StoryLivePhotoMode storyLivePhotoMode = new StoryLivePhotoMode("LIVE_PHOTO", 0);
        LIVE_PHOTO = storyLivePhotoMode;
        StoryLivePhotoMode storyLivePhotoMode2 = new StoryLivePhotoMode("STATIC", 1);
        STATIC = storyLivePhotoMode2;
        StoryLivePhotoMode storyLivePhotoMode3 = new StoryLivePhotoMode("NONE", 2);
        NONE = storyLivePhotoMode3;
        StoryLivePhotoMode[] storyLivePhotoModeArr = {storyLivePhotoMode, storyLivePhotoMode2, storyLivePhotoMode3};
        $VALUES = storyLivePhotoModeArr;
        $ENTRIES = new C2254308sP(storyLivePhotoModeArr);
        CREATOR = new Parcelable.Creator<StoryLivePhotoMode>() { // from class: X.0nYp
            @Override // android.os.Parcelable.Creator
            public final StoryLivePhotoMode createFromParcel(Parcel parcel) {
                return StoryLivePhotoMode.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StoryLivePhotoMode[] newArray(int i) {
                return new StoryLivePhotoMode[i];
            }
        };
    }

    public static StoryLivePhotoMode[] values() {
        return (StoryLivePhotoMode[]) $VALUES.clone();
    }

    public static StoryLivePhotoMode valueOf(String str) {
        return (StoryLivePhotoMode) C08FF.LIZ(StoryLivePhotoMode.class, str);
    }

    public StoryLivePhotoMode(String str, int i) {
    }
}
