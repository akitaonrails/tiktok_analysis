package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class RepostItemSource {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ RepostItemSource[] $VALUES;
    public static final Companion Companion;
    public final int value;
    public static final RepostItemSource ITEM = new RepostItemSource("ITEM", 0, 0);
    public static final RepostItemSource COMMENT = new RepostItemSource("COMMENT", 1, 1);

    public static final /* synthetic */ RepostItemSource[] $values() {
        return new RepostItemSource[]{ITEM, COMMENT};
    }

    public static InterfaceC2044707zh<RepostItemSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.feed.model.upvote.RepostItemSource$Companion] */
    static {
        RepostItemSource[] repostItemSourceArr$values = $values();
        $VALUES = repostItemSourceArr$values;
        $ENTRIES = new C2254308sP(repostItemSourceArr$values);
        Companion = new Object() { // from class: com.ss.android.ugc.aweme.feed.model.upvote.RepostItemSource.Companion
            public final RepostItemSource fromValue(int i) {
                for (RepostItemSource repostItemSource : RepostItemSource.values()) {
                    if (repostItemSource.getValue() == i) {
                        return repostItemSource;
                    }
                }
                return null;
            }
        };
    }

    public static RepostItemSource[] values() {
        return (RepostItemSource[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static RepostItemSource valueOf(String str) {
        return (RepostItemSource) C08FF.LIZ(RepostItemSource.class, str);
    }

    public RepostItemSource(String str, int i, int i2) {
        this.value = i2;
    }
}
