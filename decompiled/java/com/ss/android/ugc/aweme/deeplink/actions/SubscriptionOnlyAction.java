package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1950707kX;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class SubscriptionOnlyAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>("sslocal://openShoot?enter_from=direct_shoot&tab=live&source_params=%7B%22open_subscription%22%3A1%2C%20%22show_entrance%22%3A%20%22sub_auto_email%22%2C%20%22open_sub_setting%22%3A0%2C%20%22open_sub_only_setting%22%3A1%7D", map);
    }
}
