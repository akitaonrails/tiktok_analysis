package com.ss.android.ugc.aweme.feed.utils;

import X.C1150504el;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C443120HZe;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.util.IStartupFeedAwemesService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StartupAwemesService implements IStartupFeedAwemesService {
    public volatile List<? extends Aweme> LIZ = C13BV.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.util.IStartupFeedAwemesService
    public final C443120HZe<Integer, Integer, Integer> LIZ() {
        ?? arrayList;
        int iIntValue;
        try {
            List listLL = C13LP.LL(this.LIZ, 3);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((Aweme) it2.next()).getAwemeType()));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            arrayList = C13BV.INSTANCE;
        }
        int i = C1150504el.LIZ().LJIIJJI;
        if (i == 1) {
            iIntValue = 201;
        } else if (i == 2) {
            iIntValue = 101;
        } else if (i == 3) {
            iIntValue = 150;
        } else if (C1150504el.LIZ().LJIILIIL == 1) {
            iIntValue = 102;
        } else {
            Integer num = (Integer) C13LP.LJJJLL(arrayList);
            iIntValue = num != null ? num.intValue() : -1;
        }
        Integer num2 = (Integer) C13LP.LJJJLZIJ(1, arrayList);
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Integer num3 = (Integer) C13LP.LJJJLZIJ(2, arrayList);
        return new C443120HZe<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(num3 != null ? num3.intValue() : -1));
    }

    @Override // com.ss.android.ugc.aweme.util.IStartupFeedAwemesService
    public final boolean LIZIZ() {
        try {
            List listLL = C13LP.LL(this.LIZ, 3);
            if ((listLL instanceof Collection) && listLL.isEmpty()) {
                return false;
            }
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                List<AnchorCommonStruct> anchors = ((Aweme) it2.next()).getAnchors();
                if (anchors != null && !anchors.isEmpty()) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.util.IStartupFeedAwemesService
    public final void LIZJ(List<? extends Aweme> list) {
        try {
            this.LIZ = C13LP.LLIIII(list);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
