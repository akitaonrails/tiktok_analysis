package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoClientExt {

    @C09CT("carry_logId")
    public final String carryLogId;

    @C09CT("carry_repeat_key")
    public final String carryRepeatKey;

    @C09CT("msg_mob_params")
    public final Map<String, String> msgMobParams;

    @C09CT("shortcut_interaction_eanble")
    public final boolean shortcutInteractionEanble;

    public TakoClientExt() {
        this("", "", true, null);
    }

    public TakoClientExt(String str, String str2, boolean z, Map<String, String> map) {
        this.carryRepeatKey = str;
        this.carryLogId = str2;
        this.shortcutInteractionEanble = z;
        this.msgMobParams = map;
    }
}
