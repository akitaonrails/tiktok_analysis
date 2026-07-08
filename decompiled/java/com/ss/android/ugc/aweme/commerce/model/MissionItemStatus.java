package com.ss.android.ugc.aweme.commerce.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes32.dex */
public final class MissionItemStatus {

    @C09CT("5")
    public static final MissionItemStatus AWAITING_REWARD;

    @C09CT("17")
    public static final MissionItemStatus CASH_REWARD_CALCULATED;

    @C09CT("9")
    public static final MissionItemStatus CLOSED;

    @C09CT("8")
    public static final MissionItemStatus GREY;

    @C09CT("6")
    public static final MissionItemStatus HIDDEN;

    @C09CT("12")
    public static final MissionItemStatus IN_BRAND_SAFETY_REVIEW;

    @C09CT("1")
    public static final MissionItemStatus IN_REVIEW;

    @C09CT("24")
    public static final MissionItemStatus IN_TNS_REVIEW;
    public static final /* synthetic */ MissionItemStatus[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("15")
    public static final MissionItemStatus NONPUBLIC;

    @C09CT("16")
    public static final MissionItemStatus NONPUBLIC_WITH_REWARD;

    @C09CT("18")
    public static final MissionItemStatus NO_INCOME_PLUS;

    @C09CT("19")
    public static final MissionItemStatus NO_TAX_INFO;

    @C09CT("13")
    public static final MissionItemStatus PASS_BRAND_SAFETY;

    @C09CT("7")
    public static final MissionItemStatus PASS_BY_AUDIT;

    @C09CT("3")
    public static final MissionItemStatus PASS_BY_MACHINE;

    @C09CT("25")
    public static final MissionItemStatus PASS_BY_TNS;

    @C09CT("10")
    public static final MissionItemStatus REJECTED_BY_ADVERTISER;

    @C09CT("4")
    public static final MissionItemStatus REJECTED_BY_AD_AUDIT;

    @C09CT("14")
    public static final MissionItemStatus REJECTED_BY_BRAND_SAFETY;

    @C09CT("2")
    public static final MissionItemStatus REJECTED_BY_MACHINE;

    @C09CT("11")
    public static final MissionItemStatus REJECTED_BY_TNS;

    @C09CT("26")
    public static final MissionItemStatus REMOVED_AFTER_SELECT;

    @C09CT("27")
    public static final MissionItemStatus REMOVED_WITH_REWARD;

    @C09CT("28")
    public static final MissionItemStatus STOPPED_AFTER_SELECT;

    @C09CT("29")
    public static final MissionItemStatus STOPPED_WITH_REWARD;

    @C09CT("23")
    public static final MissionItemStatus TRANSACTION_FAILED;

    @C09CT("22")
    public static final MissionItemStatus TRANSACTION_FINISHED;

    @C09CT("21")
    public static final MissionItemStatus TRANSACTION_PROCESSING;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final MissionItemStatus UNKNOWN;

    @C09CT("20")
    public static final MissionItemStatus WAITING_TRANSACTION;
    public final int LL;

    public static InterfaceC2044707zh<MissionItemStatus> getEntries() {
        return LLILLL;
    }

    static {
        MissionItemStatus missionItemStatus = new MissionItemStatus("UNKNOWN", 0, 0);
        UNKNOWN = missionItemStatus;
        MissionItemStatus missionItemStatus2 = new MissionItemStatus("IN_REVIEW", 1, 1);
        IN_REVIEW = missionItemStatus2;
        MissionItemStatus missionItemStatus3 = new MissionItemStatus("REJECTED_BY_MACHINE", 2, 2);
        REJECTED_BY_MACHINE = missionItemStatus3;
        MissionItemStatus missionItemStatus4 = new MissionItemStatus("PASS_BY_MACHINE", 3, 3);
        PASS_BY_MACHINE = missionItemStatus4;
        MissionItemStatus missionItemStatus5 = new MissionItemStatus("REJECTED_BY_AD_AUDIT", 4, 4);
        REJECTED_BY_AD_AUDIT = missionItemStatus5;
        MissionItemStatus missionItemStatus6 = new MissionItemStatus("AWAITING_REWARD", 5, 5);
        AWAITING_REWARD = missionItemStatus6;
        MissionItemStatus missionItemStatus7 = new MissionItemStatus("HIDDEN", 6, 6);
        HIDDEN = missionItemStatus7;
        MissionItemStatus missionItemStatus8 = new MissionItemStatus("PASS_BY_AUDIT", 7, 7);
        PASS_BY_AUDIT = missionItemStatus8;
        MissionItemStatus missionItemStatus9 = new MissionItemStatus("GREY", 8, 8);
        GREY = missionItemStatus9;
        MissionItemStatus missionItemStatus10 = new MissionItemStatus("CLOSED", 9, 9);
        CLOSED = missionItemStatus10;
        MissionItemStatus missionItemStatus11 = new MissionItemStatus("REJECTED_BY_ADVERTISER", 10, 10);
        REJECTED_BY_ADVERTISER = missionItemStatus11;
        MissionItemStatus missionItemStatus12 = new MissionItemStatus("REJECTED_BY_TNS", 11, 11);
        REJECTED_BY_TNS = missionItemStatus12;
        MissionItemStatus missionItemStatus13 = new MissionItemStatus("IN_BRAND_SAFETY_REVIEW", 12, 12);
        IN_BRAND_SAFETY_REVIEW = missionItemStatus13;
        MissionItemStatus missionItemStatus14 = new MissionItemStatus("PASS_BRAND_SAFETY", 13, 13);
        PASS_BRAND_SAFETY = missionItemStatus14;
        MissionItemStatus missionItemStatus15 = new MissionItemStatus("REJECTED_BY_BRAND_SAFETY", 14, 14);
        REJECTED_BY_BRAND_SAFETY = missionItemStatus15;
        MissionItemStatus missionItemStatus16 = new MissionItemStatus("NONPUBLIC", 15, 15);
        NONPUBLIC = missionItemStatus16;
        MissionItemStatus missionItemStatus17 = new MissionItemStatus("NONPUBLIC_WITH_REWARD", 16, 16);
        NONPUBLIC_WITH_REWARD = missionItemStatus17;
        MissionItemStatus missionItemStatus18 = new MissionItemStatus("CASH_REWARD_CALCULATED", 17, 17);
        CASH_REWARD_CALCULATED = missionItemStatus18;
        MissionItemStatus missionItemStatus19 = new MissionItemStatus("NO_INCOME_PLUS", 18, 18);
        NO_INCOME_PLUS = missionItemStatus19;
        MissionItemStatus missionItemStatus20 = new MissionItemStatus("NO_TAX_INFO", 19, 19);
        NO_TAX_INFO = missionItemStatus20;
        MissionItemStatus missionItemStatus21 = new MissionItemStatus("WAITING_TRANSACTION", 20, 20);
        WAITING_TRANSACTION = missionItemStatus21;
        MissionItemStatus missionItemStatus22 = new MissionItemStatus("TRANSACTION_PROCESSING", 21, 21);
        TRANSACTION_PROCESSING = missionItemStatus22;
        MissionItemStatus missionItemStatus23 = new MissionItemStatus("TRANSACTION_FINISHED", 22, 22);
        TRANSACTION_FINISHED = missionItemStatus23;
        MissionItemStatus missionItemStatus24 = new MissionItemStatus("TRANSACTION_FAILED", 23, 23);
        TRANSACTION_FAILED = missionItemStatus24;
        MissionItemStatus missionItemStatus25 = new MissionItemStatus("IN_TNS_REVIEW", 24, 24);
        IN_TNS_REVIEW = missionItemStatus25;
        MissionItemStatus missionItemStatus26 = new MissionItemStatus("PASS_BY_TNS", 25, 25);
        PASS_BY_TNS = missionItemStatus26;
        MissionItemStatus missionItemStatus27 = new MissionItemStatus("REMOVED_AFTER_SELECT", 26, 26);
        REMOVED_AFTER_SELECT = missionItemStatus27;
        MissionItemStatus missionItemStatus28 = new MissionItemStatus("REMOVED_WITH_REWARD", 27, 27);
        REMOVED_WITH_REWARD = missionItemStatus28;
        MissionItemStatus missionItemStatus29 = new MissionItemStatus("STOPPED_AFTER_SELECT", 28, 28);
        STOPPED_AFTER_SELECT = missionItemStatus29;
        MissionItemStatus missionItemStatus30 = new MissionItemStatus("STOPPED_WITH_REWARD", 29, 29);
        STOPPED_WITH_REWARD = missionItemStatus30;
        MissionItemStatus[] missionItemStatusArr = {missionItemStatus, missionItemStatus2, missionItemStatus3, missionItemStatus4, missionItemStatus5, missionItemStatus6, missionItemStatus7, missionItemStatus8, missionItemStatus9, missionItemStatus10, missionItemStatus11, missionItemStatus12, missionItemStatus13, missionItemStatus14, missionItemStatus15, missionItemStatus16, missionItemStatus17, missionItemStatus18, missionItemStatus19, missionItemStatus20, missionItemStatus21, missionItemStatus22, missionItemStatus23, missionItemStatus24, missionItemStatus25, missionItemStatus26, missionItemStatus27, missionItemStatus28, missionItemStatus29, missionItemStatus30};
        LLILLJJLI = missionItemStatusArr;
        LLILLL = new C2254308sP(missionItemStatusArr);
    }

    public static MissionItemStatus[] values() {
        return (MissionItemStatus[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static MissionItemStatus valueOf(String str) {
        return (MissionItemStatus) C08FF.LIZ(MissionItemStatus.class, str);
    }

    public MissionItemStatus(String str, int i, int i2) {
        this.LL = i2;
    }
}
