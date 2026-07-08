package com.ss.android.ugc.aweme.socialsharesearch;

import X.C01GW;
import X.C1385710mAD;
import X.C1385750mAH;
import X.C1386000mAg;
import X.C1386050mAl;
import X.C2097908Jt;
import X.C452501pT;
import X.C498901wx;
import X.InterfaceC1367540lgu;
import X.InterfaceC1368900lj6;
import X.InterfaceC829930Wh5;
import com.ss.android.ugc.aweme.socialsharesearch.api.ISocialSearchService;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SocialSearchServiceImpl implements ISocialSearchService {
    public static final C1385710mAD LIZLLL = new C1385710mAD("social_search_matcher", "damerau_levenshtein_matcher", C2097908Jt.LIZJ(new Pair("max_edit_distance", 1)), C2097908Jt.LIZJ(new Pair("match_type", "fuzzy_dl")));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(330));
    public C498901wx LIZJ;

    @Override // com.ss.android.ugc.aweme.socialsharesearch.api.ISocialSearchService
    public void LIZLLL() {
        final C1386050mAl c1386050mAlLIZ = C1386050mAl.LIZJ.LIZ();
        if (c1386050mAlLIZ.LIZIZ) {
            return;
        }
        if (TTMStrategyCenterManager.isInit()) {
            c1386050mAlLIZ.LIZIZ();
        } else {
            TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.0mAo
                @Override // X.InterfaceC829930Wh5
                public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                    if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                        c1386050mAlLIZ.LIZIZ();
                    }
                }
            });
        }
        c1386050mAlLIZ.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.socialsharesearch.api.ISocialSearchService
    public InterfaceC1368900lj6 LJ() {
        return (C1385750mAH) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.socialsharesearch.api.ISocialSearchService
    public InterfaceC1367540lgu LIZIZ() {
        return LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.socialsharesearch.api.ISocialSearchService
    public Map<String, Object> LIZ(String str) {
        return C1386000mAg.LIZJ.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    @Override // com.ss.android.ugc.aweme.socialsharesearch.api.ISocialSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object LIZJ(java.lang.String r18, java.util.List<? extends X.InterfaceC1381610m3b> r19, java.util.Map<java.lang.String, ? extends java.lang.Object> r20, X.InterfaceC1364105Vn<? super X.C443120HZe<? extends java.util.List<? extends X.InterfaceC1381610m3b>, java.lang.Double, java.lang.Double>> r21) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialsharesearch.SocialSearchServiceImpl.LIZJ(java.lang.String, java.util.List, java.util.Map, X.05Vn):java.lang.Object");
    }
}
