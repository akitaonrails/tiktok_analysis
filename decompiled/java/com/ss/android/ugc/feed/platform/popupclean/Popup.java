package com.ss.android.ugc.feed.platform.popupclean;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class Popup implements Serializable {
    public static final int $stable = 8;

    @C09CT("popup_key")
    public final String popupKey;

    @C09CT("rules")
    public final List<Rule> rules;

    @C09CT("trigger_id")
    public final List<String> triggerIds;

    public Popup(String str, List<String> list, List<Rule> list2) {
        this.popupKey = str;
        this.triggerIds = list;
        this.rules = list2;
    }
}
