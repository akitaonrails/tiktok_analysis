package com.ss.android.ugc.aweme.minis.feed.instantplay.preview;

import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C1006440cIU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C435000H3y;
import X.C786410Ut5;
import X.InterfaceC1006410cIR;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC836760Ws6
public final class MinisInstantPlayPreviewFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZiMpLCt9ISs/PS49PDHELIOSUgKDZ9ODcpPyY2P2sBICE6OwwiOjsyJjEcJS4qGDcpPyY2PwM+KCg+LSs4";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, (Function0) null, "feed_card_info", GameCardMaterial.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS204S0000000_16.get$arr$(208), "minis_status", Integer.class);
    public final C435000H3y LLJ = new C435000H3y();
    public AnonymousClass0956 LLJI;
    public boolean LLJIJIL;
    public C1006440cIU LLJILJIL;
    public FrameLayout LLJILJILJ;

    public final GameCardMaterial SR() {
        return (GameCardMaterial) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC1006410cIR interfaceC1006410cIR;
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJI = null;
        C1006440cIU c1006440cIU = this.LLJILJIL;
        if (c1006440cIU != null && (interfaceC1006410cIR = c1006440cIU.LJFF) != null) {
            interfaceC1006410cIR.LIZIZ();
        }
        this.LLJILJILJ = null;
        this.LLJILJIL = null;
        super.onDestroyView();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS252S0000000_16.get$arr$(272));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019c A[PHI: r0
      0x019c: PHI (r0v33 java.lang.Long) = (r0v25 java.lang.Long), (r0v27 java.lang.Long), (r0v35 java.lang.Long) binds: [B:84:0x0282, B:74:0x0268, B:55:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024d A[LOOP:0: B:66:0x0247->B:68:0x024d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a0  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.feed.instantplay.preview.MinisInstantPlayPreviewFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8x, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
