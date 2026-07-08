package com.ss.android.ugc.aweme.creative.model.album;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LivePhotoPreviewMode implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LivePhotoPreviewMode[] $VALUES;
    public static final Parcelable.Creator<LivePhotoPreviewMode> CREATOR;
    public static final LivePhotoPreviewMode LIVE_PHOTO;
    public static final LivePhotoPreviewMode LOOP;
    public static final LivePhotoPreviewMode STATIC;

    public static InterfaceC2044707zh<LivePhotoPreviewMode> getEntries() {
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
        LivePhotoPreviewMode livePhotoPreviewMode = new LivePhotoPreviewMode("LIVE_PHOTO", 0);
        LIVE_PHOTO = livePhotoPreviewMode;
        LivePhotoPreviewMode livePhotoPreviewMode2 = new LivePhotoPreviewMode("LOOP", 1);
        LOOP = livePhotoPreviewMode2;
        LivePhotoPreviewMode livePhotoPreviewMode3 = new LivePhotoPreviewMode("STATIC", 2);
        STATIC = livePhotoPreviewMode3;
        LivePhotoPreviewMode[] livePhotoPreviewModeArr = {livePhotoPreviewMode, livePhotoPreviewMode2, livePhotoPreviewMode3};
        $VALUES = livePhotoPreviewModeArr;
        $ENTRIES = new C2254308sP(livePhotoPreviewModeArr);
        CREATOR = new Parcelable.Creator<LivePhotoPreviewMode>() { // from class: X.0KxS
            @Override // android.os.Parcelable.Creator
            public final LivePhotoPreviewMode createFromParcel(Parcel parcel) {
                return LivePhotoPreviewMode.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LivePhotoPreviewMode[] newArray(int i) {
                return new LivePhotoPreviewMode[i];
            }
        };
    }

    public static LivePhotoPreviewMode[] values() {
        return (LivePhotoPreviewMode[]) $VALUES.clone();
    }

    public static LivePhotoPreviewMode valueOf(String str) {
        return (LivePhotoPreviewMode) C08FF.LIZ(LivePhotoPreviewMode.class, str);
    }

    public LivePhotoPreviewMode(String str, int i) {
    }
}
