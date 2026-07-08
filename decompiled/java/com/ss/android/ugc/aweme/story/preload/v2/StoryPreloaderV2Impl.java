package com.ss.android.ugc.aweme.story.preload.v2;

import X.AbstractC325730Cpn;
import X.C13EL;
import X.C13LP;
import X.C13LZ;
import X.C2188811AlT;
import X.C325780Cps;
import X.C325790Cpt;
import X.C823050WQl;
import Y.ARunnableS37S0300000_4;
import Y.ARunnableS73S0200000_4;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryPreloaderV2Impl implements IStoryPreloaderV2 {
    @Override // com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2
    public final void LIZIZ(List<? extends Aweme> list, C325790Cpt c325790Cpt) {
        if (!list.isEmpty()) {
            C823050WQl.LIZLLL().execute(new ARunnableS73S0200000_4(list, c325790Cpt, 17));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2
    public final void LIZ(List<? extends Aweme> list, C325780Cps c325780Cps, Function1<? super Aweme, ? extends List<? extends AbstractC325730Cpn>> function1) {
        C325780Cps c325780Cps2 = c325780Cps;
        if (list != null && (!list.isEmpty())) {
            int i = 0;
            if (c325780Cps2 == null) {
                c325780Cps2 = new C325780Cps(0, null, 127);
            }
            int size = list.size();
            if (size > c325780Cps2.LIZJ) {
                int iLJ = C13LZ.LJ(c325780Cps2.LIZLLL, 0, size - 1);
                int i2 = c325780Cps2.LIZ + iLJ;
                if (i2 <= size) {
                    size = i2;
                }
                int i3 = iLJ - c325780Cps2.LIZIZ;
                if (i3 >= 0) {
                    i = i3;
                }
                list = C13LP.LL(C13LP.LJLIL(new C13EL(list.subList(i, iLJ)), list.subList(iLJ, size)), c325780Cps2.LIZJ);
            }
            if (list.isEmpty()) {
                return;
            }
            for (Aweme aweme : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preloadResources aid=");
                sbLIZ.append(aweme.getAid());
                C823050WQl.LIZLLL().execute(new ARunnableS37S0300000_4(C2188811AlT.LIZIZ(sbLIZ), function1, aweme, c325780Cps2, 11));
            }
        }
    }
}
