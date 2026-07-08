package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1950707kX;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class LivePushSettingsAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "page_live_push_settings";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>("//push_setting_notification_choice", map);
    }
}
