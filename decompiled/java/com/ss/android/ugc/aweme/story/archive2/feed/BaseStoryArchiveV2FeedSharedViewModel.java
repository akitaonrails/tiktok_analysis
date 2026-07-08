package com.ss.android.ugc.aweme.story.archive2.feed;

import X.C627660Ojc;
import X.InterfaceC1173760geM;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseStoryArchiveV2FeedSharedViewModel<S extends InterfaceC1173760geM<S, ITEM>, ITEM extends InterfaceC1891350zJl> extends BaseDetailShareVM<S, ITEM, Long> {
    public abstract S BQ2(S s, C627660Ojc<ITEM> c627660Ojc, String str, String str2, String str3, String str4);

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public /* bridge */ /* synthetic */ void listAddItem(Object obj) {
        listAddItem((InterfaceC1891350zJl) obj);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public /* bridge */ /* synthetic */ void listRemoveItem(Object obj) {
        listRemoveItem((InterfaceC1891350zJl) obj);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public /* bridge */ /* synthetic */ void listSetItem(Object obj) {
        listSetItem((InterfaceC1891350zJl) obj);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public /* bridge */ /* synthetic */ void listAddItemAt(int i, Object obj) {
        listAddItemAt(i, (InterfaceC1891350zJl) obj);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public /* bridge */ /* synthetic */ void listSetItemAt(int i, Object obj) {
        listSetItemAt(i, (InterfaceC1891350zJl) obj);
    }
}
