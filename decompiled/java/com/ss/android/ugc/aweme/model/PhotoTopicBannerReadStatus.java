package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class PhotoTopicBannerReadStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PhotoTopicBannerReadStatus[] $VALUES;
    public final int value;
    public static final PhotoTopicBannerReadStatus NO_ACTION = new PhotoTopicBannerReadStatus("NO_ACTION", 0, -1);
    public static final PhotoTopicBannerReadStatus DISMISS = new PhotoTopicBannerReadStatus("DISMISS", 1, 0);
    public static final PhotoTopicBannerReadStatus ENTER = new PhotoTopicBannerReadStatus("ENTER", 2, 1);
    public static final PhotoTopicBannerReadStatus PUBLISH = new PhotoTopicBannerReadStatus("PUBLISH", 3, 2);
    public static final PhotoTopicBannerReadStatus DRAFT = new PhotoTopicBannerReadStatus("DRAFT", 4, 4);

    public static final /* synthetic */ PhotoTopicBannerReadStatus[] $values() {
        return new PhotoTopicBannerReadStatus[]{NO_ACTION, DISMISS, ENTER, PUBLISH, DRAFT};
    }

    public static InterfaceC2044707zh<PhotoTopicBannerReadStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        PhotoTopicBannerReadStatus[] photoTopicBannerReadStatusArr$values = $values();
        $VALUES = photoTopicBannerReadStatusArr$values;
        $ENTRIES = new C2254308sP(photoTopicBannerReadStatusArr$values);
    }

    public static PhotoTopicBannerReadStatus[] values() {
        return (PhotoTopicBannerReadStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static PhotoTopicBannerReadStatus valueOf(String str) {
        return (PhotoTopicBannerReadStatus) C08FF.LIZ(PhotoTopicBannerReadStatus.class, str);
    }

    public PhotoTopicBannerReadStatus(String str, int i, int i2) {
        this.value = i2;
    }
}
