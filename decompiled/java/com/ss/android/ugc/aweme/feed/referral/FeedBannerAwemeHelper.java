package com.ss.android.ugc.aweme.feed.referral;

import X.C01GW;
import X.C1210880hcE;
import X.C13BV;
import X.C13LP;
import X.C1440005kM;
import X.C452501pT;
import X.C739380SzQ;
import X.C740260T2a;
import X.C759500Tqm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedBannerAwemeHelper {
    public static final C01GW<HashMap<String, FeedBannerAwemeHelper>> LIZLLL = C452501pT.LIZIZ(new C740260T2a());
    public final String LIZ;
    public final HashMap<Aweme, Integer> LIZIZ = new HashMap<>();
    public final CopyOnWriteArrayList<AwemeInfo> LIZJ = new CopyOnWriteArrayList<>();

    public final void LIZIZ() {
        CopyOnWriteArrayList<AwemeInfo> copyOnWriteArrayList = this.LIZJ;
        if (copyOnWriteArrayList != null) {
            Iterator<AwemeInfo> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                C1440005kM.LIZ(new C1210880hcE(this.LIZ, "FUNCTION_FROM_DEFAULT", "referral_banner_delete", it2.next().aweme));
            }
        }
        this.LIZJ.clear();
    }

    public FeedBannerAwemeHelper(String str) {
        this.LIZ = str;
    }

    public final List<Aweme> LIZ(List<Aweme> list) {
        try {
            if (!this.LIZIZ.isEmpty()) {
                List<Aweme> listLLIIII = C13LP.LLIIII(this.LIZIZ.keySet());
                if (list != null) {
                    list.removeAll(listLLIIII);
                }
                this.LIZJ.clear();
                this.LIZIZ.clear();
                C01GW<C759500Tqm> c01gw = C759500Tqm.LJ;
                C739380SzQ.LIZ().LIZ("RefreshList");
                return listLLIIII;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C13BV.INSTANCE;
    }

    public static final class AwemeInfo {
        public static final int $stable = 8;
        public final Aweme aweme;
        public final int position;

        public AwemeInfo(Aweme aweme, int i) {
            this.aweme = aweme;
            this.position = i;
        }
    }
}
