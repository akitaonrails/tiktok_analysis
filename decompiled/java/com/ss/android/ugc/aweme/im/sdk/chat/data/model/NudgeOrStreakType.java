package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C01GW;
import X.C08FF;
import X.C2254308sP;
import X.C452501pT;
import X.C869590Y9l;
import X.InterfaceC2044707zh;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class NudgeOrStreakType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ NudgeOrStreakType[] $VALUES;
    public static final Companion Companion;
    public final int interactionType;
    public final boolean isFromPush;
    public final int wrapMsgHintId;
    public static final NudgeOrStreakType RECEIVE_NUDGE = new NudgeOrStreakType("RECEIVE_NUDGE", 0, 3, false, 2131831727);
    public static final NudgeOrStreakType SEND_NUDGE = new NudgeOrStreakType("SEND_NUDGE", 1, 1, false, 2131832319);
    public static final NudgeOrStreakType RECEIVE_NUDGE_BACK = new NudgeOrStreakType("RECEIVE_NUDGE_BACK", 2, 4, false, 2131831729);
    public static final NudgeOrStreakType RECEIVE_NUDGE_PUSH = new NudgeOrStreakType("RECEIVE_NUDGE_PUSH", 3, 3, true, 2131831727);
    public static final NudgeOrStreakType RECEIVE_NUDGE_BACK_PUSH = new NudgeOrStreakType("RECEIVE_NUDGE_BACK_PUSH", 4, 4, true, 2131831729);
    public static final NudgeOrStreakType SEND_NUDGE_BACK = new NudgeOrStreakType("SEND_NUDGE_BACK", 5, 2, false, 2131831724);
    public static final NudgeOrStreakType RECEIVE_STREAK = new NudgeOrStreakType("RECEIVE_STREAK", 6, 7, false, 2131832104);
    public static final NudgeOrStreakType SEND_STREAK = new NudgeOrStreakType("SEND_STREAK", 7, 5, false, 2131832116);
    public static final NudgeOrStreakType RECEIVE_STREAK_BACK = new NudgeOrStreakType("RECEIVE_STREAK_BACK", 8, 8, false, 2131832105);
    public static final NudgeOrStreakType RECEIVE_STREAK_PUSH = new NudgeOrStreakType("RECEIVE_STREAK_PUSH", 9, 7, true, 2131832104);
    public static final NudgeOrStreakType RECEIVE_STREAK_BACK_PUSH = new NudgeOrStreakType("RECEIVE_STREAK_BACK_PUSH", 10, 8, true, 2131832105);
    public static final NudgeOrStreakType SEND_STREAK_BACK = new NudgeOrStreakType("SEND_STREAK_BACK", 11, 6, false, 2131832115);

    public static final /* synthetic */ NudgeOrStreakType[] $values() {
        return new NudgeOrStreakType[]{RECEIVE_NUDGE, SEND_NUDGE, RECEIVE_NUDGE_BACK, RECEIVE_NUDGE_PUSH, RECEIVE_NUDGE_BACK_PUSH, SEND_NUDGE_BACK, RECEIVE_STREAK, SEND_STREAK, RECEIVE_STREAK_BACK, RECEIVE_STREAK_PUSH, RECEIVE_STREAK_BACK_PUSH, SEND_STREAK_BACK};
    }

    public static InterfaceC2044707zh<NudgeOrStreakType> getEntries() {
        return $ENTRIES;
    }

    static {
        NudgeOrStreakType[] nudgeOrStreakTypeArr$values = $values();
        $VALUES = nudgeOrStreakTypeArr$values;
        $ENTRIES = new C2254308sP(nudgeOrStreakTypeArr$values);
        Companion = new Companion();
    }

    public static NudgeOrStreakType[] values() {
        return (NudgeOrStreakType[]) $VALUES.clone();
    }

    public final int getInteractionType() {
        return this.interactionType;
    }

    public final int getWrapMsgHintId() {
        return this.wrapMsgHintId;
    }

    public final boolean isFromPush() {
        return this.isFromPush;
    }

    public static final class Companion {
        public static final int getType$lambda$0(C01GW<Integer> c01gw) {
            return c01gw.getValue().intValue();
        }

        public final NudgeOrStreakType getType$im_messagelist_release(C869590Y9l c869590Y9l, boolean z) {
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(c869590Y9l, 587));
            for (NudgeOrStreakType nudgeOrStreakType : NudgeOrStreakType.values()) {
                if (nudgeOrStreakType.getInteractionType() == getType$lambda$0(c01gwLIZIZ) && nudgeOrStreakType.isFromPush() == z) {
                    return nudgeOrStreakType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    public static NudgeOrStreakType valueOf(String str) {
        return (NudgeOrStreakType) C08FF.LIZ(NudgeOrStreakType.class, str);
    }

    public NudgeOrStreakType(String str, int i, int i2, boolean z, int i3) {
        this.interactionType = i2;
        this.isFromPush = z;
        this.wrapMsgHintId = i3;
    }
}
