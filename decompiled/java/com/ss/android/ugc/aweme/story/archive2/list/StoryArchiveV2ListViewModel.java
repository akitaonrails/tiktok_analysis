package com.ss.android.ugc.aweme.story.archive2.list;

import X.AbstractC1157040gDO;
import X.C1157210gDf;
import X.C1173380gdk;
import X.C20600815jK;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1173760geM;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.story.archive2.feed.StoryArchiveV2FeedSharedViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchiveV2ListViewModel extends StoryArchiveV2FeedSharedViewModel<C1173380gdk, AbstractC1157040gDO> {
    public boolean LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1173380gdk(0);
    }

    @Override // com.ss.android.ugc.aweme.story.archive2.feed.StoryArchiveV2FeedSharedViewModel
    public final boolean DQ2() {
        return this.LLILZLL;
    }

    public static void EQ2(C20600815jK c20600815jK, Map map) {
        int iLJIIIZ;
        List<InterfaceC1891350zJl> listLJII = c20600815jK.LJII();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJII) {
            if (obj instanceof C1157210gDf) {
                arrayList.add(obj);
            }
        }
        ArrayList<C1157210gDf> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (true ^ ((C1157210gDf) obj2).LLILLL) {
                arrayList2.add(obj2);
            }
        }
        for (C1157210gDf c1157210gDf : arrayList2) {
            if (map.containsKey(c1157210gDf.LLILLJJLI) && (iLJIIIZ = c20600815jK.LJIIIZ(c1157210gDf)) != -1) {
                c20600815jK.LJIILJJIL(iLJIIIZ, new C1157210gDf(c1157210gDf.LL, c1157210gDf.LLILLJJLI, true, c1157210gDf.LLILZ));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.archive2.feed.BaseStoryArchiveV2FeedSharedViewModel
    public final InterfaceC1173760geM BQ2(InterfaceC1173760geM interfaceC1173760geM, C627660Ojc c627660Ojc, String str, String str2, String str3, String str4) {
        return C1173380gdk.LIZ((C1173380gdk) interfaceC1173760geM, c627660Ojc, str, str2, str3, str4, null, 32);
    }
}
