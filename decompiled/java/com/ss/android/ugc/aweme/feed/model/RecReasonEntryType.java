package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes29.dex */
public final class RecReasonEntryType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ RecReasonEntryType[] $VALUES;
    public final int type;
    public static final RecReasonEntryType LIKE = new RecReasonEntryType("LIKE", 0, 1);
    public static final RecReasonEntryType SHARE = new RecReasonEntryType("SHARE", 1, 2);
    public static final RecReasonEntryType COMMENT = new RecReasonEntryType("COMMENT", 2, 3);
    public static final RecReasonEntryType FINISH = new RecReasonEntryType("FINISH", 3, 4);
    public static final RecReasonEntryType POPULARITY = new RecReasonEntryType("POPULARITY", 4, 5);
    public static final RecReasonEntryType FOLLOWERSHIP = new RecReasonEntryType("FOLLOWERSHIP", 5, 6);
    public static final RecReasonEntryType INTEREST_TOPICS = new RecReasonEntryType("INTEREST_TOPICS", 6, 7);
    public static final RecReasonEntryType LONG_VIDEO = new RecReasonEntryType("LONG_VIDEO", 7, 8);
    public static final RecReasonEntryType SOCIAL = new RecReasonEntryType("SOCIAL", 8, 9);
    public static final RecReasonEntryType LIVE_HEAD = new RecReasonEntryType("LIVE_HEAD", 9, 10);
    public static final RecReasonEntryType BOOST = new RecReasonEntryType("BOOST", 10, 11);
    public static final RecReasonEntryType OTHER_HOMEPAGE = new RecReasonEntryType("OTHER_HOMEPAGE", 11, 12);
    public static final RecReasonEntryType COLD_START = new RecReasonEntryType("COLD_START", 12, 13);
    public static final RecReasonEntryType SEARCH_SIMILAR = new RecReasonEntryType("SEARCH_SIMILAR", 13, 14);
    public static final RecReasonEntryType ALGO_REFRESH = new RecReasonEntryType("ALGO_REFRESH", 14, 15);
    public static final RecReasonEntryType USER_BOOST = new RecReasonEntryType("USER_BOOST", 15, 16);
    public static final RecReasonEntryType LIKED_BEFORE = new RecReasonEntryType("LIKED_BEFORE", 16, 101);
    public static final RecReasonEntryType FAVORITE_BEFORE = new RecReasonEntryType("FAVORITE_BEFORE", 17, 102);
    public static final RecReasonEntryType DOWNLOADED_BEFORE = new RecReasonEntryType("DOWNLOADED_BEFORE", 18, 103);
    public static final RecReasonEntryType SIMILAR_CREATORS = new RecReasonEntryType("SIMILAR_CREATORS", 19, 201);
    public static final RecReasonEntryType FOLLOWERS_VIEWED = new RecReasonEntryType("FOLLOWERS_VIEWED", 20, 202);
    public static final RecReasonEntryType SRP = new RecReasonEntryType("SRP", 21, 205);

    public static final /* synthetic */ RecReasonEntryType[] $values() {
        return new RecReasonEntryType[]{LIKE, SHARE, COMMENT, FINISH, POPULARITY, FOLLOWERSHIP, INTEREST_TOPICS, LONG_VIDEO, SOCIAL, LIVE_HEAD, BOOST, OTHER_HOMEPAGE, COLD_START, SEARCH_SIMILAR, ALGO_REFRESH, USER_BOOST, LIKED_BEFORE, FAVORITE_BEFORE, DOWNLOADED_BEFORE, SIMILAR_CREATORS, FOLLOWERS_VIEWED, SRP};
    }

    public static InterfaceC2044707zh<RecReasonEntryType> getEntries() {
        return $ENTRIES;
    }

    static {
        RecReasonEntryType[] recReasonEntryTypeArr$values = $values();
        $VALUES = recReasonEntryTypeArr$values;
        $ENTRIES = new C2254308sP(recReasonEntryTypeArr$values);
    }

    public static RecReasonEntryType[] values() {
        return (RecReasonEntryType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static RecReasonEntryType valueOf(String str) {
        return (RecReasonEntryType) C08FF.LIZ(RecReasonEntryType.class, str);
    }

    public RecReasonEntryType(String str, int i, int i2) {
        this.type = i2;
    }
}
