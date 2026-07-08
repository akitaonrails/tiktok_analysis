package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class PhotoTopicBannerTopicType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PhotoTopicBannerTopicType[] $VALUES;
    public final int value;
    public static final PhotoTopicBannerTopicType REGULAR = new PhotoTopicBannerTopicType("REGULAR", 0, 0);
    public static final PhotoTopicBannerTopicType OPERATIONAL = new PhotoTopicBannerTopicType("OPERATIONAL", 1, 1);
    public static final PhotoTopicBannerTopicType TRAVEL = new PhotoTopicBannerTopicType("TRAVEL", 2, 2);

    public static final /* synthetic */ PhotoTopicBannerTopicType[] $values() {
        return new PhotoTopicBannerTopicType[]{REGULAR, OPERATIONAL, TRAVEL};
    }

    public static InterfaceC2044707zh<PhotoTopicBannerTopicType> getEntries() {
        return $ENTRIES;
    }

    static {
        PhotoTopicBannerTopicType[] photoTopicBannerTopicTypeArr$values = $values();
        $VALUES = photoTopicBannerTopicTypeArr$values;
        $ENTRIES = new C2254308sP(photoTopicBannerTopicTypeArr$values);
    }

    public static PhotoTopicBannerTopicType[] values() {
        return (PhotoTopicBannerTopicType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static PhotoTopicBannerTopicType valueOf(String str) {
        return (PhotoTopicBannerTopicType) C08FF.LIZ(PhotoTopicBannerTopicType.class, str);
    }

    public PhotoTopicBannerTopicType(String str, int i, int i2) {
        this.value = i2;
    }
}
