package com.ss.android.ugc.aweme.comment.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class InteractionBubbleCacheState {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ InteractionBubbleCacheState[] $VALUES;
    public static final InteractionBubbleCacheState NO_CACHE = new InteractionBubbleCacheState("NO_CACHE", 0);
    public static final InteractionBubbleCacheState COMMENT_CACHE = new InteractionBubbleCacheState("COMMENT_CACHE", 1);
    public static final InteractionBubbleCacheState LIKE_CACHE = new InteractionBubbleCacheState("LIKE_CACHE", 2);
    public static final InteractionBubbleCacheState ALL_CACHE = new InteractionBubbleCacheState("ALL_CACHE", 3);

    public static final /* synthetic */ InteractionBubbleCacheState[] $values() {
        return new InteractionBubbleCacheState[]{NO_CACHE, COMMENT_CACHE, LIKE_CACHE, ALL_CACHE};
    }

    public static InterfaceC2044707zh<InteractionBubbleCacheState> getEntries() {
        return $ENTRIES;
    }

    static {
        InteractionBubbleCacheState[] interactionBubbleCacheStateArr$values = $values();
        $VALUES = interactionBubbleCacheStateArr$values;
        $ENTRIES = new C2254308sP(interactionBubbleCacheStateArr$values);
    }

    public static InteractionBubbleCacheState[] values() {
        return (InteractionBubbleCacheState[]) $VALUES.clone();
    }

    public static InteractionBubbleCacheState valueOf(String str) {
        return (InteractionBubbleCacheState) C08FF.LIZ(InteractionBubbleCacheState.class, str);
    }

    public InteractionBubbleCacheState(String str, int i) {
    }
}
