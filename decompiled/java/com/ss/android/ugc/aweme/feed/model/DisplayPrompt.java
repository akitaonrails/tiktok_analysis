package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DisplayPrompt implements Serializable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ DisplayPrompt[] $VALUES;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final DisplayPrompt NONE = new DisplayPrompt("NONE", 0);

    @C09CT("1")
    public static final DisplayPrompt PURCHASE_SERIES = new DisplayPrompt("PURCHASE_SERIES", 1);

    public static final /* synthetic */ DisplayPrompt[] $values() {
        return new DisplayPrompt[]{NONE, PURCHASE_SERIES};
    }

    public static InterfaceC2044707zh<DisplayPrompt> getEntries() {
        return $ENTRIES;
    }

    static {
        DisplayPrompt[] displayPromptArr$values = $values();
        $VALUES = displayPromptArr$values;
        $ENTRIES = new C2254308sP(displayPromptArr$values);
    }

    public static DisplayPrompt[] values() {
        return (DisplayPrompt[]) $VALUES.clone();
    }

    public static DisplayPrompt valueOf(String str) {
        return (DisplayPrompt) C08FF.LIZ(DisplayPrompt.class, str);
    }

    public DisplayPrompt(String str, int i) {
    }
}
