package com.ss.android.ugc.aweme.share.base.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class ShareContentType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ShareContentType[] $VALUES;
    public static final Parcelable.Creator<ShareContentType> CREATOR;
    public static final ShareContentType DISABLE_SHARE;
    public static final ShareContentType ILEGAL;
    public static final ShareContentType LINK;
    public static final ShareContentType LINK_PLUS_PHOTO;
    public static final ShareContentType LINK_PLUS_PHOTOS;
    public static final ShareContentType LINK_PLUS_VIDEO;
    public static final ShareContentType PHOTO;
    public static final ShareContentType PHOTOS;
    public static final ShareContentType VIDEO;
    public final int num;

    public static InterfaceC2044707zh<ShareContentType> getEntries() {
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
        ShareContentType shareContentType = new ShareContentType("LINK", 0, 0);
        LINK = shareContentType;
        ShareContentType shareContentType2 = new ShareContentType("VIDEO", 1, 1);
        VIDEO = shareContentType2;
        ShareContentType shareContentType3 = new ShareContentType("PHOTO", 2, 4);
        PHOTO = shareContentType3;
        ShareContentType shareContentType4 = new ShareContentType("LINK_PLUS_PHOTO", 3, 5);
        LINK_PLUS_PHOTO = shareContentType4;
        ShareContentType shareContentType5 = new ShareContentType("LINK_PLUS_VIDEO", 4, 6);
        LINK_PLUS_VIDEO = shareContentType5;
        ShareContentType shareContentType6 = new ShareContentType("PHOTOS", 5, 7);
        PHOTOS = shareContentType6;
        ShareContentType shareContentType7 = new ShareContentType("LINK_PLUS_PHOTOS", 6, 8);
        LINK_PLUS_PHOTOS = shareContentType7;
        ShareContentType shareContentType8 = new ShareContentType("ILEGAL", 7, -2);
        ILEGAL = shareContentType8;
        ShareContentType shareContentType9 = new ShareContentType("DISABLE_SHARE", 8, -1);
        DISABLE_SHARE = shareContentType9;
        ShareContentType[] shareContentTypeArr = {shareContentType, shareContentType2, shareContentType3, shareContentType4, shareContentType5, shareContentType6, shareContentType7, shareContentType8, shareContentType9};
        $VALUES = shareContentTypeArr;
        $ENTRIES = new C2254308sP(shareContentTypeArr);
        CREATOR = new Parcelable.Creator<ShareContentType>() { // from class: X.0lrN
            @Override // android.os.Parcelable.Creator
            public final ShareContentType createFromParcel(Parcel parcel) {
                return ShareContentType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ShareContentType[] newArray(int i) {
                return new ShareContentType[i];
            }
        };
    }

    public static ShareContentType[] values() {
        return (ShareContentType[]) $VALUES.clone();
    }

    public final int getNum() {
        return this.num;
    }

    public static ShareContentType valueOf(String str) {
        return (ShareContentType) C08FF.LIZ(ShareContentType.class, str);
    }

    public ShareContentType(String str, int i, int i2) {
        this.num = i2;
    }
}
