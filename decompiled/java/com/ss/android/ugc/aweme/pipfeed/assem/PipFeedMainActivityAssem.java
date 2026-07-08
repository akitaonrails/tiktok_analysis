package com.ss.android.ugc.aweme.pipfeed.assem;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C07HE;
import X.C0RUJ;
import X.C0SHX;
import X.C0TA1;
import X.C1620020sG8;
import X.C1620030sG9;
import X.C1620050sGB;
import X.C1620120sGI;
import X.C1906580ziK;
import X.C19EG;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC1603190roz;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.PipFeedManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes25.dex */
public final class PipFeedMainActivityAssem extends BaseMainContainerAssem implements C0RUJ {
    public static WeakReference<PipFeedMainActivityAssem> LLILLL = new WeakReference<>(null);
    public final C01GW LL = C452501pT.LIZIZ(new C1620020sG8(this));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1620030sG9());

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "panel_feed_main_pip";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final boolean m303do() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return false;
        }
        Iterator<String> it2 = ((IPipFeedService) this.LLILLJJLI.getValue()).LJIIIZ().iterator();
        while (it2.hasNext()) {
            if (Hox.LLJILJIL.LIZ(c19egLIZ).KQ2(it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.onPrevActivityDestroyed$pipfeed_release();
        LLILLL = new WeakReference<>(null);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        this.LL.getValue();
        LLILLL = new WeakReference<>(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        C19EG c19egLIZ;
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveDataLJII;
        C0TA1 stateRequestHandler;
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveDataLJII2;
        C0TA1 stateRequestHandler2;
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveDataLJII3;
        C0TA1 stateRequestHandler3;
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveDataLJII4;
        C0TA1 stateRequestHandler4;
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveDataLJII5;
        C0TA1 stateRequestHandler5;
        super.onStop();
        if (C07HE.LIZ()) {
            if (!bo(false)) {
                FeedPipViewModel feedPipViewModel = (FeedPipViewModel) this.LL.getValue();
                feedPipViewModel.LL.setValue((Object) null);
                feedPipViewModel.LLILZLL = false;
                feedPipViewModel.LLILZIL = null;
                feedPipViewModel.LLJ = null;
                ((ArrayList) feedPipViewModel.LLJI).clear();
                feedPipViewModel.LLJIJIL.clear();
                feedPipViewModel.LLJJIJIL.getClass();
                feedPipViewModel.yQ2(0);
                feedPipViewModel.LLJJIJIL.LIZ = 0.0f;
                ((IPipFeedService) this.LLILLJJLI.getValue()).LJIIZILJ(null);
            }
            PipFeedManager.Companion.getClass();
            if (!C1620120sGI.LIZ.canStartPipNow$pipfeed_release(false) || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
                return;
            }
            C1620050sGB c1620050sGBLIZ = C0SHX.LIZ(c19egLIZ, null);
            if (c1620050sGBLIZ.LIZ("long_press_layer") && (dialogStateLiveDataLJII5 = c1620050sGBLIZ.LJII("long_press_panel")) != null && (stateRequestHandler5 = dialogStateLiveDataLJII5.getStateRequestHandler()) != null) {
                stateRequestHandler5.LIZ();
            }
            if (c1620050sGBLIZ.LJFF() && (dialogStateLiveDataLJII4 = c1620050sGBLIZ.LJII("share_panel")) != null && (stateRequestHandler4 = dialogStateLiveDataLJII4.getStateRequestHandler()) != null) {
                stateRequestHandler4.LIZ();
            }
            if (c1620050sGBLIZ.LIZ("downloaded_video_share_dialog") && (dialogStateLiveDataLJII3 = c1620050sGBLIZ.LJII("downloaded_video_share_dialog")) != null && (stateRequestHandler3 = dialogStateLiveDataLJII3.getStateRequestHandler()) != null) {
                stateRequestHandler3.LIZ();
            }
            if (c1620050sGBLIZ.LIZ("ad_explain_static_dynamic") && (dialogStateLiveDataLJII2 = c1620050sGBLIZ.LJII("ad_explain_static_dynamic")) != null && (stateRequestHandler2 = dialogStateLiveDataLJII2.getStateRequestHandler()) != null) {
                stateRequestHandler2.LIZ();
            }
            if (!c1620050sGBLIZ.LIZIZ() || (dialogStateLiveDataLJII = c1620050sGBLIZ.LJII("comment_panel")) == null || (stateRequestHandler = dialogStateLiveDataLJII.getStateRequestHandler()) == null) {
                return;
            }
            stateRequestHandler.LIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
    }

    public final boolean bo(boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Object obj = null;
        if (abstractC1387200mCcLJ != null) {
            obj = abstractC1387200mCcLJ.LIZ;
        }
        if ((obj instanceof InterfaceC1603190roz) && obj != null && m303do()) {
            if (!z) {
                FeedPipViewModel feedPipViewModel = (FeedPipViewModel) this.LL.getValue();
                Aweme value = feedPipViewModel.LL.getValue();
                if (value == null || value.getVideo() == null || !(!((ArrayList) feedPipViewModel.wQ2()).isEmpty()) || feedPipViewModel.LLILZLL || feedPipViewModel.LLJ == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
