package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class LiveRelatedLabelType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LiveRelatedLabelType[] $VALUES;
    public final String value;
    public static final LiveRelatedLabelType LIVE_RELATED_LABEL_TYPE_LIVE_GIFTER = new LiveRelatedLabelType("LIVE_RELATED_LABEL_TYPE_LIVE_GIFTER", 0, "live_gifter");
    public static final LiveRelatedLabelType LIVE_RELATED_LABEL_TYPE_RECENT_GUEST = new LiveRelatedLabelType("LIVE_RELATED_LABEL_TYPE_RECENT_GUEST", 1, "recent_guest");
    public static final LiveRelatedLabelType LIVE_RELATED_LABEL_TYPE_COMMENT_LIVE = new LiveRelatedLabelType("LIVE_RELATED_LABEL_TYPE_COMMENT_LIVE", 2, "comment_live");
    public static final LiveRelatedLabelType LIVE_RELATED_LABEL_TYPE_MIN_WATCH = new LiveRelatedLabelType("LIVE_RELATED_LABEL_TYPE_MIN_WATCH", 3, "min_watch");
    public static final LiveRelatedLabelType LIVE_RELATED_LABEL_TYPE_WATCH_LIVE = new LiveRelatedLabelType("LIVE_RELATED_LABEL_TYPE_WATCH_LIVE", 4, "watch_live");
    public static final LiveRelatedLabelType LIVE_RELATED_LABEL_TYPE_INTERACTED_LIVE = new LiveRelatedLabelType("LIVE_RELATED_LABEL_TYPE_INTERACTED_LIVE", 5, "interacted_live");

    public static final /* synthetic */ LiveRelatedLabelType[] $values() {
        return new LiveRelatedLabelType[]{LIVE_RELATED_LABEL_TYPE_LIVE_GIFTER, LIVE_RELATED_LABEL_TYPE_RECENT_GUEST, LIVE_RELATED_LABEL_TYPE_COMMENT_LIVE, LIVE_RELATED_LABEL_TYPE_MIN_WATCH, LIVE_RELATED_LABEL_TYPE_WATCH_LIVE, LIVE_RELATED_LABEL_TYPE_INTERACTED_LIVE};
    }

    public static InterfaceC2044707zh<LiveRelatedLabelType> getEntries() {
        return $ENTRIES;
    }

    static {
        LiveRelatedLabelType[] liveRelatedLabelTypeArr$values = $values();
        $VALUES = liveRelatedLabelTypeArr$values;
        $ENTRIES = new C2254308sP(liveRelatedLabelTypeArr$values);
    }

    public static LiveRelatedLabelType[] values() {
        return (LiveRelatedLabelType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static LiveRelatedLabelType valueOf(String str) {
        return (LiveRelatedLabelType) C08FF.LIZ(LiveRelatedLabelType.class, str);
    }

    public LiveRelatedLabelType(String str, int i, String str2) {
        this.value = str2;
    }
}
