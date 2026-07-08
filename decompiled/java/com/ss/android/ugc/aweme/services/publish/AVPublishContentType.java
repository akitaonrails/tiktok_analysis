package com.ss.android.ugc.aweme.services.publish;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class AVPublishContentType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AVPublishContentType[] $VALUES;
    public final String contentType;
    public static final AVPublishContentType Video = new AVPublishContentType("Video", 0, "video");
    public static final AVPublishContentType PhotoMovie = new AVPublishContentType("PhotoMovie", 1, "video");
    public static final AVPublishContentType Photo = new AVPublishContentType("Photo", 2, "photo");

    public static final /* synthetic */ AVPublishContentType[] $values() {
        return new AVPublishContentType[]{Video, PhotoMovie, Photo};
    }

    public static InterfaceC2044707zh<AVPublishContentType> getEntries() {
        return $ENTRIES;
    }

    static {
        AVPublishContentType[] aVPublishContentTypeArr$values = $values();
        $VALUES = aVPublishContentTypeArr$values;
        $ENTRIES = new C2254308sP(aVPublishContentTypeArr$values);
    }

    public static AVPublishContentType[] values() {
        return (AVPublishContentType[]) $VALUES.clone();
    }

    public final String getContentType() {
        return this.contentType;
    }

    public static AVPublishContentType valueOf(String str) {
        return (AVPublishContentType) C08FF.LIZ(AVPublishContentType.class, str);
    }

    public AVPublishContentType(String str, int i, String str2) {
        this.contentType = str2;
    }
}
