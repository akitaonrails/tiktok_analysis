package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMRecordPageEnum;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class IMRecordPageEnum implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ IMRecordPageEnum[] $VALUES;
    public static final IMRecordPageEnum AI_GROUP_SHOT;
    public static final Parcelable.Creator<IMRecordPageEnum> CREATOR;
    public static final IMRecordPageEnum DEFAULT;
    public static final IMRecordPageEnum DEFAULT_VIDEO;
    public static final IMRecordPageEnum GAME;
    public static final IMRecordPageEnum PHOTOSWAP;
    public static final IMRecordPageEnum PHOTO_STICKER;
    public static final IMRecordPageEnum PLAYGROUND;
    public static final IMRecordPageEnum QUICK_LIVE_REACT;
    public static final IMRecordPageEnum STORY;
    public final int nameResId;
    public final String tag;

    public static InterfaceC2044707zh<IMRecordPageEnum> getEntries() {
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
        IMRecordPageEnum iMRecordPageEnum = new IMRecordPageEnum(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 2131828276, "default");
        DEFAULT = iMRecordPageEnum;
        IMRecordPageEnum iMRecordPageEnum2 = new IMRecordPageEnum("DEFAULT_VIDEO", 1, 2131828285, "default_video");
        DEFAULT_VIDEO = iMRecordPageEnum2;
        IMRecordPageEnum iMRecordPageEnum3 = new IMRecordPageEnum("PHOTOSWAP", 2, 2131831790, "photoswap");
        PHOTOSWAP = iMRecordPageEnum3;
        IMRecordPageEnum iMRecordPageEnum4 = new IMRecordPageEnum("QUICK_LIVE_REACT", 3, -1, "quick_live_react");
        QUICK_LIVE_REACT = iMRecordPageEnum4;
        IMRecordPageEnum iMRecordPageEnum5 = new IMRecordPageEnum("GAME", 4, -1, "game");
        GAME = iMRecordPageEnum5;
        IMRecordPageEnum iMRecordPageEnum6 = new IMRecordPageEnum("PLAYGROUND", 5, 2131831813, "playground");
        PLAYGROUND = iMRecordPageEnum6;
        IMRecordPageEnum iMRecordPageEnum7 = new IMRecordPageEnum("AI_GROUP_SHOT", 6, 2131830917, "ai_group_shot");
        AI_GROUP_SHOT = iMRecordPageEnum7;
        IMRecordPageEnum iMRecordPageEnum8 = new IMRecordPageEnum("PHOTO_STICKER", 7, -1, "photo_sticker");
        PHOTO_STICKER = iMRecordPageEnum8;
        IMRecordPageEnum iMRecordPageEnum9 = new IMRecordPageEnum("STORY", 8, -1, "camera");
        STORY = iMRecordPageEnum9;
        IMRecordPageEnum[] iMRecordPageEnumArr = {iMRecordPageEnum, iMRecordPageEnum2, iMRecordPageEnum3, iMRecordPageEnum4, iMRecordPageEnum5, iMRecordPageEnum6, iMRecordPageEnum7, iMRecordPageEnum8, iMRecordPageEnum9};
        $VALUES = iMRecordPageEnumArr;
        $ENTRIES = new C2254308sP(iMRecordPageEnumArr);
        CREATOR = new Parcelable.Creator<IMRecordPageEnum>() { // from class: X.0ni2
            @Override // android.os.Parcelable.Creator
            public final IMRecordPageEnum createFromParcel(Parcel parcel) {
                return IMRecordPageEnum.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IMRecordPageEnum[] newArray(int i) {
                return new IMRecordPageEnum[i];
            }
        };
    }

    public static IMRecordPageEnum[] values() {
        return (IMRecordPageEnum[]) $VALUES.clone();
    }

    public final int getNameResId() {
        return this.nameResId;
    }

    public final String getTag() {
        return this.tag;
    }

    public static IMRecordPageEnum valueOf(String str) {
        return (IMRecordPageEnum) C08FF.LIZ(IMRecordPageEnum.class, str);
    }

    public IMRecordPageEnum(String str, int i, int i2, String str2) {
        this.nameResId = i2;
        this.tag = str2;
    }
}
