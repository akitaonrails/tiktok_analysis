package com.ss.android.ugc.aweme.poi.detail.worldcup.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class WorldCupMatchStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ WorldCupMatchStatus[] $VALUES;
    public final int value;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final WorldCupMatchStatus UNKNOWN = new WorldCupMatchStatus("UNKNOWN", 0, 0);

    @C09CT("1")
    public static final WorldCupMatchStatus NOT_STARTED = new WorldCupMatchStatus("NOT_STARTED", 1, 1);

    @C09CT("2")
    public static final WorldCupMatchStatus IN_PROGRESS = new WorldCupMatchStatus("IN_PROGRESS", 2, 2);

    @C09CT("3")
    public static final WorldCupMatchStatus FINISHED = new WorldCupMatchStatus("FINISHED", 3, 3);

    @C09CT("4")
    public static final WorldCupMatchStatus POSTPONED = new WorldCupMatchStatus("POSTPONED", 4, 4);

    @C09CT("5")
    public static final WorldCupMatchStatus SUSPENDED = new WorldCupMatchStatus("SUSPENDED", 5, 5);

    @C09CT("6")
    public static final WorldCupMatchStatus CANCELLED = new WorldCupMatchStatus("CANCELLED", 6, 6);

    @C09CT("7")
    public static final WorldCupMatchStatus WITHDRAWN = new WorldCupMatchStatus("WITHDRAWN", 7, 7);

    @C09CT("8")
    public static final WorldCupMatchStatus WALKOVER = new WorldCupMatchStatus("WALKOVER", 8, 8);

    @C09CT("9")
    public static final WorldCupMatchStatus BYE = new WorldCupMatchStatus("BYE", 9, 9);

    @C09CT("10")
    public static final WorldCupMatchStatus AWARDED = new WorldCupMatchStatus("AWARDED", 10, 10);

    public static final /* synthetic */ WorldCupMatchStatus[] $values() {
        return new WorldCupMatchStatus[]{UNKNOWN, NOT_STARTED, IN_PROGRESS, FINISHED, POSTPONED, SUSPENDED, CANCELLED, WITHDRAWN, WALKOVER, BYE, AWARDED};
    }

    public static InterfaceC2044707zh<WorldCupMatchStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        WorldCupMatchStatus[] worldCupMatchStatusArr$values = $values();
        $VALUES = worldCupMatchStatusArr$values;
        $ENTRIES = new C2254308sP(worldCupMatchStatusArr$values);
    }

    public static WorldCupMatchStatus[] values() {
        return (WorldCupMatchStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static WorldCupMatchStatus valueOf(String str) {
        return (WorldCupMatchStatus) C08FF.LIZ(WorldCupMatchStatus.class, str);
    }

    public WorldCupMatchStatus(String str, int i, int i2) {
        this.value = i2;
    }
}
