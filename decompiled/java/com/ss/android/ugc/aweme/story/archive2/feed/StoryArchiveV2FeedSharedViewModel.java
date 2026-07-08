package com.ss.android.ugc.aweme.story.archive2.feed;

import X.AbstractC316870CbV;
import X.C1220000hqw;
import X.C13LE;
import X.C2189821An6;
import X.C317290CcB;
import X.C452070Ho5;
import X.C5180020c;
import X.C627660Ojc;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1173760geM;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import java.util.Collection;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class StoryArchiveV2FeedSharedViewModel<S extends InterfaceC1173760geM<S, ITEM>, ITEM extends InterfaceC1891350zJl> extends BaseStoryArchiveV2FeedSharedViewModel<S, ITEM> {
    public final C736950SvV LLILZIL;

    public abstract boolean DQ2();

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(ITEM item) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> getAwemeList() {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.archive2.feed.StoryArchiveV2FeedSharedViewModel.getAwemeList():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryArchiveV2FeedSharedViewModel() {
        this.LLILZIL = new C736950SvV(C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS256S0000000_18.get$arr$(771), null, null, null);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    @InterfaceC1294060jmO
    public final void listClear() {
        super.listClear();
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    @InterfaceC1294060jmO
    public final void listAddAll(Collection<? extends ITEM> collection) {
        super.listAddAll(collection);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    @InterfaceC1294060jmO
    public final void listAddItem(ITEM item) {
        super.listAddItem((InterfaceC1891350zJl) item);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    @InterfaceC1294060jmO
    public final void listRemoveItem(ITEM item) {
        super.listRemoveItem((InterfaceC1891350zJl) item);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    @InterfaceC1294060jmO
    public final void listRemoveItemAt(int i) {
        super.listRemoveItemAt(i);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    @InterfaceC1294060jmO
    public final void listSetItem(ITEM item) {
        super.listSetItem((InterfaceC1891350zJl) item);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    @InterfaceC1294060jmO
    public final void listSetItems(Collection<? extends ITEM> collection) {
        super.listSetItems(collection);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<ITEM> c627660Ojc) {
        setState(new AwS384S0200000_18(this, c627660Ojc, 158));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        ((AssemViewModel) this.LLILZIL.getValue()).setState(new C5180020c(str, 2));
        return -1;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    @InterfaceC1294060jmO
    public final void listAddAllAt(int i, Collection<? extends ITEM> collection) {
        super.listAddAllAt(i, collection);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    @InterfaceC1294060jmO
    public final void listAddItemAt(int i, ITEM item) {
        super.listAddItemAt(i, (InterfaceC1891350zJl) item);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    @InterfaceC1294060jmO
    public final void listSetItemAt(int i, ITEM item) {
        super.listSetItemAt(i, (InterfaceC1891350zJl) item);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Number) obj).longValue();
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    @InterfaceC1294060jmO
    public final void listSetItemsAt(int i, int i2, Collection<? extends ITEM> collection) {
        super.listSetItemsAt(i, i2, collection);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return 0L;
    }
}
