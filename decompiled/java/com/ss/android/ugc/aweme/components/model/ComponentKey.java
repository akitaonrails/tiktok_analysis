package com.ss.android.ugc.aweme.components.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes26.dex */
public final class ComponentKey {

    @C09CT("pgc_monetization_brief_info")
    public static final ComponentKey BRIEF_INFO;

    @C09CT("pgc_monetization_info_section")
    public static final ComponentKey INFO_SECTION;
    public static final /* synthetic */ ComponentKey[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("pgc_monetization_purchase_button")
    public static final ComponentKey PURCHASE_BUTTON;

    @C09CT("pgc_monetization_purchase_options")
    public static final ComponentKey PURCHASE_OPTIONS;

    @C09CT("pgc_monetization_tabs_wrapper")
    public static final ComponentKey TABS;

    public static InterfaceC2044707zh<ComponentKey> getEntries() {
        return LLILLJJLI;
    }

    static {
        ComponentKey componentKey = new ComponentKey("INFO_SECTION", 0);
        INFO_SECTION = componentKey;
        ComponentKey componentKey2 = new ComponentKey("BRIEF_INFO", 1);
        BRIEF_INFO = componentKey2;
        ComponentKey componentKey3 = new ComponentKey("PURCHASE_OPTIONS", 2);
        PURCHASE_OPTIONS = componentKey3;
        ComponentKey componentKey4 = new ComponentKey("PURCHASE_BUTTON", 3);
        PURCHASE_BUTTON = componentKey4;
        ComponentKey componentKey5 = new ComponentKey("TABS", 4);
        TABS = componentKey5;
        ComponentKey[] componentKeyArr = {componentKey, componentKey2, componentKey3, componentKey4, componentKey5};
        LL = componentKeyArr;
        LLILLJJLI = new C2254308sP(componentKeyArr);
    }

    public static ComponentKey[] values() {
        return (ComponentKey[]) LL.clone();
    }

    public static ComponentKey valueOf(String str) {
        return (ComponentKey) C08FF.LIZ(ComponentKey.class, str);
    }

    public ComponentKey(String str, int i) {
    }
}
