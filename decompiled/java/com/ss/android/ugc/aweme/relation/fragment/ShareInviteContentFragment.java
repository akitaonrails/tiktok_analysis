package com.ss.android.ugc.aweme.relation.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1369580lkC;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187701Ajg;
import X.C452501pT;
import X.InterfaceC1368050lhj;
import X.InterfaceC1371380ln6;
import X.InterfaceC344240DeY;
import X.ViewTreeObserverOnGlobalLayoutListenerC462880IDe;
import Y.AObserverS210S0100000_6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.fragment.ShareInviteContentFragment;
import com.ss.android.ugc.aweme.relation.share.InviteFriendsSheetPackage;
import com.ss.android.ugc.aweme.relation.viewmodel.ShareInviteContentVM;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS299S0300000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareInviteContentFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISoiZyHELIOSkhKSIhLCEnZhYkKD02ASs6IDs2CyoiPSo9PAM+KCg+LSs4";
    public C1369580lkC LLIZ;
    public ShareInviteContentVM LLIZLLLIL;
    public int LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 748));

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        Context context;
        Integer numLIZJ;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS565S0100000_21(this, 747));
        c0om1.LIZIZ(c1251150ifB);
        if (1 == this.LLJ && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c7, context)) != null) {
            c0om1.LIZJ(numLIZJ.intValue());
        }
        return c0om1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[PHI: r2
      0x007a: PHI (r2v8 java.lang.String) = (r2v0 java.lang.String), (r2v9 java.lang.String) binds: [B:13:0x003f, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[PHI: r6
      0x0083: PHI (r6v1 com.ss.android.ugc.aweme.share.base.model.BaseSharePackage) = 
      (r6v0 com.ss.android.ugc.aweme.share.base.model.BaseSharePackage)
      (r6v5 com.ss.android.ugc.aweme.share.base.model.BaseSharePackage)
     binds: [B:19:0x004d, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.fragment.ShareInviteContentFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((InterfaceC1371380ln6) this.LLJI.getValue()).onViewCreated(view);
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(this, 166);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe = new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(view, awS600S0100000_21, 11);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C1369580lkC c1369580lkCLIZJ = ((InterfaceC1371380ln6) this.LLJI.getValue()).LIZJ();
        this.LLIZ = c1369580lkCLIZJ;
        ShareInviteContentVM shareInviteContentVM = null;
        if (c1369580lkCLIZJ == null) {
            c1369580lkCLIZJ = null;
        }
        ShareInviteContentVM shareInviteContentVM2 = this.LLIZLLLIL;
        if (shareInviteContentVM2 == null) {
            shareInviteContentVM2 = null;
        }
        c1369580lkCLIZJ.LJIIZILJ(shareInviteContentVM2.LL, false);
        C1369580lkC c1369580lkC = this.LLIZ;
        if (c1369580lkC == null) {
            c1369580lkC = null;
        }
        c1369580lkC.LLJJ = new InterfaceC1368050lhj() { // from class: X.0ln5
            @Override // X.InterfaceC1368050lhj
            public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view2) {
                InviteFriendsSheetPackage inviteFriendsSheetPackage;
                int num;
                ShareInviteContentVM shareInviteContentVM3 = this.LL.LLIZLLLIL;
                ShareInviteContentVM shareInviteContentVM4 = null;
                if (shareInviteContentVM3 == null) {
                    shareInviteContentVM3 = null;
                }
                C1355130lMt c1355130lMt = shareInviteContentVM3.LLILZIL;
                if (c1355130lMt == null) {
                    c1355130lMt = null;
                }
                c1355130lMt.LIZ("invite", interfaceC1369790lkX.key());
                ShareInviteContentVM shareInviteContentVM5 = this.LL.LLIZLLLIL;
                if (shareInviteContentVM5 == null) {
                    shareInviteContentVM5 = null;
                }
                InviteFriendsSheetPackage inviteFriendsSheetPackage2 = shareInviteContentVM5.LLILZ;
                if (inviteFriendsSheetPackage2 == null) {
                    inviteFriendsSheetPackage2 = null;
                }
                AbstractC1375550ltp abstractC1375550ltpLJIILLIIL = inviteFriendsSheetPackage2.LJIILLIIL(interfaceC1369790lkX);
                ShareExtService shareExtService = (ShareExtService) ServiceManager.get().getService(ShareExtService.class);
                ShareInviteContentVM shareInviteContentVM6 = this.LL.LLIZLLLIL;
                if (shareInviteContentVM6 == null) {
                    shareInviteContentVM6 = null;
                }
                if (shareInviteContentVM6.LLILZ == null) {
                    num = -1;
                } else {
                    ShareExtService shareExtService2 = (ShareExtService) ServiceManager.get().getService(ShareExtService.class);
                    InviteFriendsSheetPackage inviteFriendsSheetPackage3 = shareInviteContentVM6.LLILZ;
                    if (inviteFriendsSheetPackage3 == null) {
                        inviteFriendsSheetPackage = null;
                    } else {
                        inviteFriendsSheetPackage = inviteFriendsSheetPackage3;
                    }
                    String str = inviteFriendsSheetPackage.itemType;
                    if (inviteFriendsSheetPackage3 == null) {
                        inviteFriendsSheetPackage3 = null;
                    }
                    num = shareExtService2.LJIIIZ(str, inviteFriendsSheetPackage3.url).getNum();
                }
                if (shareExtService.LJII(num)) {
                    ShareInviteContentFragment shareInviteContentFragment = this.LL;
                    ShareInviteContentVM shareInviteContentVM7 = shareInviteContentFragment.LLIZLLLIL;
                    if (shareInviteContentVM7 != null) {
                        shareInviteContentVM4 = shareInviteContentVM7;
                    }
                    Context contextRequireContext = shareInviteContentFragment.requireContext();
                    ShareInviteContentFragment shareInviteContentFragment2 = this.LL;
                    InviteFriendsSheetPackage inviteFriendsSheetPackage4 = shareInviteContentVM4.LLILZ;
                    if (inviteFriendsSheetPackage4 != null) {
                        SharePackage.LJIJJLI(inviteFriendsSheetPackage4, inviteFriendsSheetPackage4, abstractC1375550ltpLJIILLIIL, new AwS299S0300000_21(shareInviteContentVM4, interfaceC1369790lkX, contextRequireContext, 1));
                        String str2 = TuxSheet._pnsPageId;
                        C1391190mJ3.LJFF(shareInviteContentFragment2, C343970De7.LIZ);
                        return;
                    }
                    return;
                }
                ShareInviteContentVM shareInviteContentVM8 = this.LL.LLIZLLLIL;
                if (shareInviteContentVM8 == null) {
                    shareInviteContentVM8 = null;
                }
                C1355130lMt c1355130lMt2 = shareInviteContentVM8.LLILZIL;
                if (c1355130lMt2 == null) {
                    c1355130lMt2 = null;
                }
                c1355130lMt2.LIZIZ(interfaceC1369790lkX.key());
                interfaceC1369790lkX.LJJIIJ(abstractC1375550ltpLJIILLIIL, this.LL.requireContext(), null);
                String str3 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(this.LL, C343970De7.LIZ);
            }
        };
        ShareInviteContentVM shareInviteContentVM3 = this.LLIZLLLIL;
        if (shareInviteContentVM3 != null) {
            shareInviteContentVM = shareInviteContentVM3;
        }
        shareInviteContentVM.LLILLL.observe(this, new AObserverS210S0100000_6(this, 42));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZIZ = ((InterfaceC1371380ln6) this.LLJI.getValue()).LIZIZ(layoutInflater, viewGroup);
        C19GS c19gs = null;
        if (!(viewLIZIZ instanceof View)) {
            viewLIZIZ = null;
        }
        if (viewLIZIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
                viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZIZ;
    }
}
