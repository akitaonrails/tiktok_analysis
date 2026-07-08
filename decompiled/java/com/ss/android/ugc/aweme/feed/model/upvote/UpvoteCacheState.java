package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteCacheState {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ UpvoteCacheState[] $VALUES;
    public static final UpvoteCacheState PRE_PUBLISH = new UpvoteCacheState("PRE_PUBLISH", 0);
    public static final UpvoteCacheState PRE_REMOVE = new UpvoteCacheState("PRE_REMOVE", 1);
    public static final UpvoteCacheState PUBLISH_FAILED = new UpvoteCacheState("PUBLISH_FAILED", 2);
    public static final UpvoteCacheState PUBLISH_SUCCESS = new UpvoteCacheState("PUBLISH_SUCCESS", 3);
    public static final UpvoteCacheState DELETE_SUCCESS = new UpvoteCacheState("DELETE_SUCCESS", 4);
    public static final UpvoteCacheState DELETE_FAILED = new UpvoteCacheState("DELETE_FAILED", 5);

    public static final /* synthetic */ UpvoteCacheState[] $values() {
        return new UpvoteCacheState[]{PRE_PUBLISH, PRE_REMOVE, PUBLISH_FAILED, PUBLISH_SUCCESS, DELETE_SUCCESS, DELETE_FAILED};
    }

    public static InterfaceC2044707zh<UpvoteCacheState> getEntries() {
        return $ENTRIES;
    }

    static {
        UpvoteCacheState[] upvoteCacheStateArr$values = $values();
        $VALUES = upvoteCacheStateArr$values;
        $ENTRIES = new C2254308sP(upvoteCacheStateArr$values);
    }

    public static UpvoteCacheState[] values() {
        return (UpvoteCacheState[]) $VALUES.clone();
    }

    public static UpvoteCacheState valueOf(String str) {
        return (UpvoteCacheState) C08FF.LIZ(UpvoteCacheState.class, str);
    }

    public UpvoteCacheState(String str, int i) {
    }
}
