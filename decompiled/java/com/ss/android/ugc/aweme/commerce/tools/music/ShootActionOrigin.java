package com.ss.android.ugc.aweme.commerce.tools.music;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin;
import java.io.Serializable;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes32.dex */
public final class ShootActionOrigin implements Parcelable, Serializable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ShootActionOrigin[] $VALUES;

    @C09CT("click_effect")
    public static final ShootActionOrigin CLICK_EFFECT;

    @C09CT("click_hashtag")
    public static final ShootActionOrigin CLICK_HASHTAG;

    @C09CT("click_plus")
    public static final ShootActionOrigin CLICK_PLUS;

    @C09CT("click_video_duet_stitch")
    public static final ShootActionOrigin CLICK_VIDEO_DUET_STITCH;

    @C09CT("click_video_music")
    public static final ShootActionOrigin CLICK_VIDEO_MUSIC;
    public static final Parcelable.Creator<ShootActionOrigin> CREATOR;

    @C09CT("others")
    public static final ShootActionOrigin OTHERS;

    @C09CT("search_music")
    public static final ShootActionOrigin SEARCH_MUSIC;

    public static InterfaceC2044707zh<ShootActionOrigin> getEntries() {
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
        ShootActionOrigin shootActionOrigin = new ShootActionOrigin("CLICK_PLUS", 0);
        CLICK_PLUS = shootActionOrigin;
        ShootActionOrigin shootActionOrigin2 = new ShootActionOrigin("CLICK_VIDEO_DUET_STITCH", 1);
        CLICK_VIDEO_DUET_STITCH = shootActionOrigin2;
        ShootActionOrigin shootActionOrigin3 = new ShootActionOrigin("CLICK_HASHTAG", 2);
        CLICK_HASHTAG = shootActionOrigin3;
        ShootActionOrigin shootActionOrigin4 = new ShootActionOrigin("CLICK_VIDEO_MUSIC", 3);
        CLICK_VIDEO_MUSIC = shootActionOrigin4;
        ShootActionOrigin shootActionOrigin5 = new ShootActionOrigin("SEARCH_MUSIC", 4);
        SEARCH_MUSIC = shootActionOrigin5;
        ShootActionOrigin shootActionOrigin6 = new ShootActionOrigin("CLICK_EFFECT", 5);
        CLICK_EFFECT = shootActionOrigin6;
        ShootActionOrigin shootActionOrigin7 = new ShootActionOrigin("OTHERS", 6);
        OTHERS = shootActionOrigin7;
        ShootActionOrigin[] shootActionOriginArr = {shootActionOrigin, shootActionOrigin2, shootActionOrigin3, shootActionOrigin4, shootActionOrigin5, shootActionOrigin6, shootActionOrigin7};
        $VALUES = shootActionOriginArr;
        $ENTRIES = new C2254308sP(shootActionOriginArr);
        CREATOR = new Parcelable.Creator<ShootActionOrigin>() { // from class: X.15ML
            @Override // android.os.Parcelable.Creator
            public final ShootActionOrigin createFromParcel(Parcel parcel) {
                return ShootActionOrigin.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ShootActionOrigin[] newArray(int i) {
                return new ShootActionOrigin[i];
            }
        };
    }

    public static ShootActionOrigin[] values() {
        return (ShootActionOrigin[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return super.toString().toLowerCase(Locale.ROOT);
    }

    public static ShootActionOrigin valueOf(String str) {
        return (ShootActionOrigin) C08FF.LIZ(ShootActionOrigin.class, str);
    }

    public ShootActionOrigin(String str, int i) {
    }
}
