package com.ss.android.ugc.aweme.hybrid.container;

import X.C098200Yq;
import X.C1014150cUv;
import X.C1014160cUw;
import X.C1014220cV2;
import X.C1014230cV3;
import X.C189200o6;
import X.C7740030o;
import X.InterfaceC1018920ccc;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.AnoleAdCardModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleVSACardLandPageGecko implements InterfaceC1018920ccc<C1014160cUw> {
    public static final int $stable = 0;

    @Override // X.InterfaceC1018920ccc
    public C1014150cUv obtainGeckoConfig(C1014160cUw c1014160cUw) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        AnoleComponentModel anoleComponentModel;
        Object c098200Yq;
        NativeSiteConfig nativeSiteConfig;
        String strLIZ = C1014230cV3.LIZ("vsa_full_screen_card");
        if (c1014160cUw != null && (awemeRawAd = c1014160cUw.LIZ) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && (anoleComponentModel = map.get("vsa_full_screen_card")) != null && anoleComponentModel.data != null) {
            List<String> arrayList = null;
            try {
                Gson gson = C7740030o.LIZ().getGson();
                if (gson != null) {
                    c098200Yq = (AnoleAdCardModel) gson.LJII(gson.LJIILL(gson), AnoleAdCardModel.class);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            AnoleAdCardModel anoleAdCardModel = (AnoleAdCardModel) c098200Yq;
            if (anoleAdCardModel != null && (nativeSiteConfig = anoleAdCardModel.getNativeSiteConfig()) != null) {
                arrayList = nativeSiteConfig.geckoChannel;
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            return new C1014220cV2(strLIZ, "vsa_full_screen_card", arrayList);
        }
        return new C1014220cV2(strLIZ, "vsa_full_screen_card", new ArrayList());
    }
}
