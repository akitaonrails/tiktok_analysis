package com.ss.android.ugc.aweme.setting.creatorverification;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class CreatorVerificationStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CreatorVerificationStatus[] $VALUES;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final CreatorVerificationStatus NOT_CREATED = new CreatorVerificationStatus("NOT_CREATED", 0);

    @C09CT("1")
    public static final CreatorVerificationStatus CREATED = new CreatorVerificationStatus("CREATED", 1);

    @C09CT("2")
    public static final CreatorVerificationStatus REJECTED = new CreatorVerificationStatus("REJECTED", 2);

    @C09CT("3")
    public static final CreatorVerificationStatus VERIFIED = new CreatorVerificationStatus("VERIFIED", 3);

    public static final /* synthetic */ CreatorVerificationStatus[] $values() {
        return new CreatorVerificationStatus[]{NOT_CREATED, CREATED, REJECTED, VERIFIED};
    }

    public static InterfaceC2044707zh<CreatorVerificationStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        CreatorVerificationStatus[] creatorVerificationStatusArr$values = $values();
        $VALUES = creatorVerificationStatusArr$values;
        $ENTRIES = new C2254308sP(creatorVerificationStatusArr$values);
    }

    public static CreatorVerificationStatus[] values() {
        return (CreatorVerificationStatus[]) $VALUES.clone();
    }

    public static CreatorVerificationStatus valueOf(String str) {
        return (CreatorVerificationStatus) C08FF.LIZ(CreatorVerificationStatus.class, str);
    }

    public CreatorVerificationStatus(String str, int i) {
    }
}
