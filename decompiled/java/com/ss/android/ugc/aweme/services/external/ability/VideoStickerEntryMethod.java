package com.ss.android.ugc.aweme.services.external.ability;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class VideoStickerEntryMethod {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ VideoStickerEntryMethod[] $VALUES;
    public final String method;
    public static final VideoStickerEntryMethod FEED = new VideoStickerEntryMethod("FEED", 0, "feed");
    public static final VideoStickerEntryMethod CHATROOM = new VideoStickerEntryMethod("CHATROOM", 1, "chatroom");

    public static final /* synthetic */ VideoStickerEntryMethod[] $values() {
        return new VideoStickerEntryMethod[]{FEED, CHATROOM};
    }

    public static InterfaceC2044707zh<VideoStickerEntryMethod> getEntries() {
        return $ENTRIES;
    }

    static {
        VideoStickerEntryMethod[] videoStickerEntryMethodArr$values = $values();
        $VALUES = videoStickerEntryMethodArr$values;
        $ENTRIES = new C2254308sP(videoStickerEntryMethodArr$values);
    }

    public static VideoStickerEntryMethod[] values() {
        return (VideoStickerEntryMethod[]) $VALUES.clone();
    }

    public final String getMethod() {
        return this.method;
    }

    public static VideoStickerEntryMethod valueOf(String str) {
        return (VideoStickerEntryMethod) C08FF.LIZ(VideoStickerEntryMethod.class, str);
    }

    public VideoStickerEntryMethod(String str, int i, String str2) {
        this.method = str2;
    }
}
