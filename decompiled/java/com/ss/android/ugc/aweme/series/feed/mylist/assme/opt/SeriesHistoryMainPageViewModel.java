package com.ss.android.ugc.aweme.series.feed.mylist.assme.opt;

import X.C1559090qfr;
import X.C1559260qg8;
import X.C1573630r3J;
import X.C723600SZy;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.series.feed.model.MyListSceneEnum;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesHistoryMainPageViewModel extends AssemViewModel<C1573630r3J> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1559090qfr.class, "history_list_key"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1573630r3J(MyListSceneEnum.MY_LIST_SCENE_COLLECTION_HISTORY, 254);
    }
}
