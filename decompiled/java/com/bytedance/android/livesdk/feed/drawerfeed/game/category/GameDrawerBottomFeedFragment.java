package com.bytedance.android.livesdk.feed.drawerfeed.game.category;

import X.C1161920gLG;
import X.C11RK;
import X.C469770IbX;
import X.C470660Icy;
import X.C470770Id9;
import X.C471100Idg;
import X.C471160Idm;
import X.C471640IeY;
import X.InterfaceC469760IbW;
import Y.ACListenerS142S0100000_7;
import Y.AObserverS211S0100000_7;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.model.FeedItem;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDrawerBottomFeedFragment extends BaseDrawerFeedLiveFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWE3OiQ7LD01LSAoHELIOSZygyJSBiKi4nLSIjOzZ9DyQhLAshKTIpOw08PDEjJAk2LSEKOy40JSAiPQ==";
    public boolean LLJJJ;

    public GameDrawerBottomFeedFragment() {
        super(new C471640IeY(), new C469770IbX(0), AFwS237S0000000_7.get$arr$(14), AFwS237S0000000_7.get$arr$(15));
    }

    @Override // com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C11RK<FeedItem> c11rk;
        IGameService iGameService;
        MutableLiveData<C470770Id9> mutableLiveData;
        MutableLiveData<C470770Id9> mutableLiveData2;
        super.onViewCreated(view, bundle);
        TabFeedViewModel tabFeedViewModel = this.LLJILJIL;
        if (tabFeedViewModel != null && (mutableLiveData2 = tabFeedViewModel.LL) != null) {
            mutableLiveData2.observe(this, new AObserverS211S0100000_7(this, 4));
        }
        TabFeedViewModel tabFeedViewModel2 = this.LLJILJIL;
        if (tabFeedViewModel2 != null && (mutableLiveData = tabFeedViewModel2.LLILLJJLI) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.0IeF
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    IGameService iGameService2;
                    InterfaceC471600IeU interfaceC471600IeUKj2;
                    if (((C470770Id9) obj).LIZ() && (iGameService2 = (IGameService) C1161920gLG.LIZJ(IGameService.class)) != null && (interfaceC471600IeUKj2 = iGameService2.Kj2()) != null) {
                        interfaceC471600IeUKj2.refresh();
                    }
                }
            });
        }
        ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 57);
        IGameService iGameService2 = (IGameService) C1161920gLG.LIZJ(IGameService.class);
        if (iGameService2 != null) {
            iGameService2.SD2(aCListenerS142S0100000_7);
        }
        C470660Icy c470660Icy = this.LLIZ;
        if (c470660Icy != null && (c11rk = c470660Icy.LLJJIJI) != null && (iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class)) != null) {
            iGameService.qn2(c11rk);
        }
    }

    public GameDrawerBottomFeedFragment(InterfaceC469760IbW interfaceC469760IbW, C469770IbX c469770IbX, C471100Idg c471100Idg, C471160Idm c471160Idm) {
        super(interfaceC469760IbW, c469770IbX, c471100Idg, c471160Idm);
    }
}
