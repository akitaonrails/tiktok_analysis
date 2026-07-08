package com.ss.android.ugc.aweme.aigc;

import X.C07TD;
import X.C15438062q;
import X.C546230LbZ;
import X.C547860LeC;
import com.ss.android.ugc.aweme.aikit.api.common.FeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class FeedServiceImpl implements FeedService {
    @Override // com.ss.android.ugc.aweme.aikit.api.common.FeedService
    public final boolean LIZ(Aweme aweme) {
        Function1<Aweme, Boolean> function1;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(false).iterator();
        while (it2.hasNext()) {
            C07TD c07td = (C07TD) it2.next().LJIIL.getValue();
            if (c07td != null && (function1 = c07td.LIZJ) != null && function1.invoke(aweme).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.FeedService
    public final boolean LIZIZ(Aweme aweme) {
        Function1<Aweme, Boolean> function1;
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(false);
        if (listLJFF != null) {
            Iterator<C546230LbZ> it2 = listLJFF.iterator();
            while (it2.hasNext()) {
                C07TD c07td = (C07TD) it2.next().LJIIL.getValue();
                if (c07td != null && (function1 = c07td.LIZ) != null && function1.invoke(aweme).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.FeedService
    public final boolean LIZJ(Aweme aweme) {
        Function1<Aweme, Boolean> function1;
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(false);
        if (listLJFF != null) {
            ArrayList<C07TD> arrayList = new ArrayList(C15438062q.LJIJJ(listLJFF, 10));
            Iterator<C546230LbZ> it2 = listLJFF.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJIIL.getValue());
            }
            for (C07TD c07td : arrayList) {
                if (c07td != null && (function1 = c07td.LIZIZ) != null && !function1.invoke(aweme).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }
}
