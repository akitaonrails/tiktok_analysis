package com.ss.android.ugc.aweme.music.model.report;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class HasMore {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ HasMore[] $VALUES;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final HasMore FALSE = new HasMore("FALSE", 0);

    @C09CT("1")
    public static final HasMore TRUE = new HasMore("TRUE", 1);

    public static final /* synthetic */ HasMore[] $values() {
        return new HasMore[]{FALSE, TRUE};
    }

    public static InterfaceC2044707zh<HasMore> getEntries() {
        return $ENTRIES;
    }

    static {
        HasMore[] hasMoreArr$values = $values();
        $VALUES = hasMoreArr$values;
        $ENTRIES = new C2254308sP(hasMoreArr$values);
    }

    public static HasMore[] values() {
        return (HasMore[]) $VALUES.clone();
    }

    public static HasMore valueOf(String str) {
        return (HasMore) C08FF.LIZ(HasMore.class, str);
    }

    public HasMore(String str, int i) {
    }
}
