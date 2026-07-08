package com.ss.android.ugc.aweme.tools.sticker.core.attributionlink;

import X.C08FF;
import X.C09CT;
import X.C19592511l5;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes30.dex */
public final class AttributionLinkScenario {

    @C09CT("3")
    public static final AttributionLinkScenario ATTRIBUTION_LINK_SCENARIO_IMAGE;

    @C09CT("4")
    public static final AttributionLinkScenario ATTRIBUTION_LINK_SCENARIO_LINK;

    @C09CT("1")
    public static final AttributionLinkScenario ATTRIBUTION_LINK_SCENARIO_MUSIC;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final AttributionLinkScenario ATTRIBUTION_LINK_SCENARIO_UNKNOWN;

    @C09CT("2")
    public static final AttributionLinkScenario ATTRIBUTION_LINK_SCENARIO_VIDEO;
    public static final C19592511l5 Companion;
    public static final /* synthetic */ AttributionLinkScenario[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<AttributionLinkScenario> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.11l5] */
    static {
        AttributionLinkScenario attributionLinkScenario = new AttributionLinkScenario("ATTRIBUTION_LINK_SCENARIO_UNKNOWN", 0, 0);
        ATTRIBUTION_LINK_SCENARIO_UNKNOWN = attributionLinkScenario;
        AttributionLinkScenario attributionLinkScenario2 = new AttributionLinkScenario("ATTRIBUTION_LINK_SCENARIO_MUSIC", 1, 1);
        ATTRIBUTION_LINK_SCENARIO_MUSIC = attributionLinkScenario2;
        AttributionLinkScenario attributionLinkScenario3 = new AttributionLinkScenario("ATTRIBUTION_LINK_SCENARIO_VIDEO", 2, 2);
        ATTRIBUTION_LINK_SCENARIO_VIDEO = attributionLinkScenario3;
        AttributionLinkScenario attributionLinkScenario4 = new AttributionLinkScenario("ATTRIBUTION_LINK_SCENARIO_IMAGE", 3, 3);
        ATTRIBUTION_LINK_SCENARIO_IMAGE = attributionLinkScenario4;
        AttributionLinkScenario attributionLinkScenario5 = new AttributionLinkScenario("ATTRIBUTION_LINK_SCENARIO_LINK", 4, 4);
        ATTRIBUTION_LINK_SCENARIO_LINK = attributionLinkScenario5;
        AttributionLinkScenario[] attributionLinkScenarioArr = {attributionLinkScenario, attributionLinkScenario2, attributionLinkScenario3, attributionLinkScenario4, attributionLinkScenario5};
        LLILLJJLI = attributionLinkScenarioArr;
        LLILLL = new C2254308sP(attributionLinkScenarioArr);
        Companion = new Object() { // from class: X.11l5
        };
    }

    public static AttributionLinkScenario[] values() {
        return (AttributionLinkScenario[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static AttributionLinkScenario valueOf(String str) {
        return (AttributionLinkScenario) C08FF.LIZ(AttributionLinkScenario.class, str);
    }

    public AttributionLinkScenario(String str, int i, int i2) {
        this.LL = i2;
    }
}
