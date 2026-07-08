package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class PublishFrom {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PublishFrom[] $VALUES;
    public static final PublishFrom DEFAULT = new PublishFrom(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
    public static final PublishFrom ONLY_REPOST = new PublishFrom("ONLY_REPOST", 1);
    public static final PublishFrom ADD_TEXT = new PublishFrom("ADD_TEXT", 2);
    public static final PublishFrom REPOST_AND_TEXT = new PublishFrom("REPOST_AND_TEXT", 3);

    public static final /* synthetic */ PublishFrom[] $values() {
        return new PublishFrom[]{DEFAULT, ONLY_REPOST, ADD_TEXT, REPOST_AND_TEXT};
    }

    public static InterfaceC2044707zh<PublishFrom> getEntries() {
        return $ENTRIES;
    }

    static {
        PublishFrom[] publishFromArr$values = $values();
        $VALUES = publishFromArr$values;
        $ENTRIES = new C2254308sP(publishFromArr$values);
    }

    public static PublishFrom[] values() {
        return (PublishFrom[]) $VALUES.clone();
    }

    public static PublishFrom valueOf(String str) {
        return (PublishFrom) C08FF.LIZ(PublishFrom.class, str);
    }

    public PublishFrom(String str, int i) {
    }
}
