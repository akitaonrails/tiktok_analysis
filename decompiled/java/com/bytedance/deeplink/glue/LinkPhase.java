package com.bytedance.deeplink.glue;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class LinkPhase {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LinkPhase[] $VALUES;
    public final String mobKey;
    public static final LinkPhase TOTAL = new LinkPhase("TOTAL", 0, "total_duration");
    public static final LinkPhase TARGET_ACTIVATION = new LinkPhase("TARGET_ACTIVATION", 1, "target_activation_duration");
    public static final LinkPhase GET_LINK = new LinkPhase("GET_LINK", 2, "get_link_duration");
    public static final LinkPhase LINK_PROCESS = new LinkPhase("LINK_PROCESS", 3, "link_process_duration");
    public static final LinkPhase PAGE_OPEN = new LinkPhase("PAGE_OPEN", 4, "page_open_duration");
    public static final LinkPhase PAGE_UI_READY = new LinkPhase("PAGE_UI_READY", 5, "page_ui_ready_duration");

    public static final /* synthetic */ LinkPhase[] $values() {
        return new LinkPhase[]{TOTAL, TARGET_ACTIVATION, GET_LINK, LINK_PROCESS, PAGE_OPEN, PAGE_UI_READY};
    }

    public static InterfaceC2044707zh<LinkPhase> getEntries() {
        return $ENTRIES;
    }

    static {
        LinkPhase[] linkPhaseArr$values = $values();
        $VALUES = linkPhaseArr$values;
        $ENTRIES = new C2254308sP(linkPhaseArr$values);
    }

    public static LinkPhase[] values() {
        return (LinkPhase[]) $VALUES.clone();
    }

    public final String getMobKey() {
        return this.mobKey;
    }

    public static LinkPhase valueOf(String str) {
        return (LinkPhase) C08FF.LIZ(LinkPhase.class, str);
    }

    public LinkPhase(String str, int i, String str2) {
        this.mobKey = str2;
    }
}
