package com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.db;

import X.AbstractC796540VMm;
import X.C01GW;
import X.C0NMJ;
import X.C0NMK;
import X.C0NMN;
import X.C0NMO;
import X.C0NMR;
import X.C0PEM;
import X.C1AF0;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public abstract class SearchDislikeDataBase extends AbstractC796540VMm {
    public static final C01GW<SearchDislikeDataBase> LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(307));
    public static final C01GW<C0NMO> LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(308));

    public abstract C0NMK LIZIZ();

    public static void LIZ(Aweme aweme, String str) {
        if (str != null) {
            try {
                if (str.length() > 0 && 1 != 0) {
                    C0NMR.LIZJ.add(str);
                    if (aweme != null && aweme.isAd()) {
                        return;
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NMJ(C0NMN.LIZ().LIZIZ(), str, str, null), 3);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "SearchDislikeDB");
            }
        }
    }
}
