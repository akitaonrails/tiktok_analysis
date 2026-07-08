package com.ss.android.ugc.aweme.deeplink.actions.internal;

import X.AbstractC1950107kR;
import X.C1950707kX;
import X.C580990MqX;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class WWACampaignAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "deep_link_startWWAAddYoursCampaign";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>("//startWWAAddYoursCampaign", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(context, "deep_link_startWWAAddYoursCampaign", new C580990MqX(this, context, 1));
        return true;
    }
}
