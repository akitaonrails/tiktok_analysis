package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel;

import X.C0W17;
import X.C11NJ;
import X.C1360900lWC;
import X.C2232408os;
import X.C23250099c;
import X.C278570Avv;
import X.C690900R8e;
import X.C823050WQl;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.upvote.service.IUpvoteService;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3RepostEntranceVM extends AssemViewModel<C690900R8e> {
    public final C11NJ LL = new C11NJ();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C690900R8e(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL.LJ();
    }

    public final void vQ2(long j) {
        IUpvoteService iUpvoteService = (IUpvoteService) PluggableExtentionKt.pluggableSpi$default(IUpvoteService.class, false, false, false, 14, null);
        if (iUpvoteService != null && iUpvoteService.LIZ() && ((Boolean) C278570Avv.LIZ.getValue()).booleanValue()) {
            C0W17.LIZJ("repostVM", "request repostEntrance start");
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), new C2232408os(C823050WQl.LIZLLL()), null, new C1360900lWC(j, this, null), 2);
        }
    }
}
