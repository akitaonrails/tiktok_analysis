package com.bytedance.android.livesdk.moderator;

import X.C01GW;
import X.C036E;
import X.C098200Yq;
import X.C0IJT;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C292401Bi;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C749600Tao;
import X.C749730Tb1;
import X.C749740Tb2;
import X.C749790Tb7;
import X.C750740Tce;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC748580TYa;
import X.InterfaceC749850TbD;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicAdminAuthorizationLinkOptSetting;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.android.livesdk.moderator.ModeratorListFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class ModeratorListFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSHELIOSooLD0yPCo+ZwI8LCA+KDs8OgklOjsVOiQrJCo9PA==";
    public C749790Tb7 LL;
    public RecyclerView LLILLJJLI;
    public FrameLayout LLILLL;
    public FrameLayout LLILZ;
    public C16F5 LLILZIL;
    public FrameLayout LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public String LLJILJIL;
    public C749600Tao LLJILJILJ;
    public int LLJIJIL = 30;
    public final C01GW LLJILLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 322));
    public final C01GW LLJJ = C292401Bi.LIZ(new AwS556S0100000_12(this, 321));
    public final C749740Tb2 LLJJI = new InterfaceC749850TbD() { // from class: X.0Tb2
        @Override // X.InterfaceC749850TbD
        public final void OO(long j, boolean z) {
        }

        @Override // X.InterfaceC749850TbD
        public final void Rk(Exception exc) {
        }

        @Override // X.InterfaceC749850TbD
        public final void Xa(int i) {
        }

        @Override // X.InterfaceC749850TbD
        public final void gx(int i, Exception exc) {
        }

        @Override // X.InterfaceC749850TbD
        public final void il(AdminUserBean adminUserBean, Exception exc) {
            String str;
            ModeratorListFragment moderatorListFragment = this.LL;
            if (moderatorListFragment.mStatusViewValid) {
                C749600Tao c749600Tao = null;
                if (exc == null && adminUserBean != null) {
                    if (!C086I.LIZIZ(adminUserBean.LIZ)) {
                        ModeratorListFragment moderatorListFragment2 = this.LL;
                        List<C750740Tce> list = adminUserBean.LIZ;
                        moderatorListFragment2.getClass();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : (ArrayList) list) {
                            C750740Tce c750740Tce = (C750740Tce) obj;
                            if (c750740Tce.LIZ != ((Number) moderatorListFragment2.LLJILLL.getValue()).longValue() && !c750740Tce.LJIIIIZZ) {
                                arrayList.add(obj);
                            }
                        }
                        ModeratorListFragment moderatorListFragment3 = this.LL;
                        moderatorListFragment3.LLJIJIL = adminUserBean.mMaxCount;
                        moderatorListFragment3.bS(arrayList.size(), adminUserBean.mMaxCount);
                        DataChannel dataChannelLJ = C475510Ikn.LJ(this.LL);
                        if (dataChannelLJ != null) {
                            dataChannelLJ.SX0(C749570Tal.class, Integer.valueOf(this.LL.LLJIJIL));
                        }
                        C749600Tao c749600Tao2 = this.LL.LLJILJILJ;
                        if (c749600Tao2 != null) {
                            c749600Tao = c749600Tao2;
                        }
                        c749600Tao.setData(arrayList);
                        ModeratorListFragment moderatorListFragment4 = this.LL;
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        moderatorListFragment4.getClass();
                        DataChannel dataChannelLJ2 = C475510Ikn.LJ(moderatorListFragment4);
                        if (dataChannelLJ2 != null) {
                            dataChannelLJ2.zW(ModeratorListChannel.class, arrayList2);
                        }
                        this.LL.aS(arrayList);
                        if (!arrayList.isEmpty()) {
                            this.LL.UR().LIZ();
                            C500260Jjc.LLFFF(this.LL.SR());
                            if (this.LL.PR()) {
                                if (!Intrinsics.LJFF(this.LL.LLJILJIL, "multi_guest_panel") || !LinkMicAdminAuthorizationLinkOptSetting.INSTANCE.enable()) {
                                    ModeratorListFragment moderatorListFragment5 = this.LL;
                                    moderatorListFragment5.getClass();
                                    if (C500260Jjc.LJJJIL(C475510Ikn.LJ(moderatorListFragment5))) {
                                        C500260Jjc.LJIILLIIL(moderatorListFragment5.OR());
                                    } else {
                                        C500260Jjc.LLFFF(moderatorListFragment5.OR());
                                    }
                                    C786410Ut5.O7(moderatorListFragment5.OR(), new ACListenerS147S0100000_12(moderatorListFragment5, 450));
                                }
                                if (this.LL.RR().size() > this.LL.LLJIJIL) {
                                    C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.f144t5;
                                    if (c20337914i1.LIZIZ().booleanValue()) {
                                        ModeratorListFragment moderatorListFragment6 = this.LL;
                                        int size = moderatorListFragment6.RR().size();
                                        C782110Um9 c782110Um9 = new C782110Um9(moderatorListFragment6.getContext());
                                        c782110Um9.LJIIZILJ(2131843033);
                                        c782110Um9.LJII(2131843032);
                                        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131843699), new InterfaceC743640TFa() { // from class: X.0Tb4
                                            @Override // X.InterfaceC743640TFa
                                            public final void LIZ(LiveDialog liveDialog) {
                                                liveDialog.dismiss();
                                            }
                                        });
                                        c782110Um9.LJIILLIIL = false;
                                        C786410Ut5.E4(c782110Um9.LIZ());
                                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_page_first_popup");
                                        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(moderatorListFragment6));
                                        if (C500260Jjc.LJJIJLIJ()) {
                                            str = "live_take_page";
                                        } else {
                                            str = "live_take_detail";
                                        }
                                        c474500IjALIZ.LJJII(str, "event_page");
                                        c474500IjALIZ.LJJII(Integer.valueOf(size), "moderator_number");
                                        c474500IjALIZ.LIZ();
                                        c20337914i1.LJFF(Boolean.FALSE);
                                    }
                                }
                            }
                            ModeratorListFragment moderatorListFragment7 = this.LL;
                            moderatorListFragment7.WR(moderatorListFragment7.RR().size());
                            return;
                        }
                        C500260Jjc.LJIILIIL(this.LL.SR());
                        this.LL.UR().LIZIZ();
                        this.LL.WR(0);
                        return;
                    }
                    this.LL.UR().LIZIZ();
                    ModeratorListFragment moderatorListFragment8 = this.LL;
                    ArrayList arrayList3 = new ArrayList();
                    moderatorListFragment8.getClass();
                    DataChannel dataChannelLJ3 = C475510Ikn.LJ(moderatorListFragment8);
                    if (dataChannelLJ3 != null) {
                        dataChannelLJ3.zW(ModeratorListChannel.class, arrayList3);
                    }
                    this.LL.aS(new ArrayList());
                    this.LL.WR(0);
                    return;
                }
                C749600Tao c749600Tao3 = moderatorListFragment.LLJILJILJ;
                if (c749600Tao3 != null) {
                    c749600Tao = c749600Tao3;
                }
                if (c749600Tao.getItemCount() == 0) {
                    this.LL.UR().LIZJ();
                }
                C501540Jlg.LIZJ(this.LL.getContext(), exc);
            }
        }
    };

    public final FrameLayout OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cmq) : null;
            this.LLILZLL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final boolean PR() {
        return ((Boolean) this.LLJJ.getValue()).booleanValue();
    }

    public final RecyclerView SR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqo) : null;
            this.LLILLJJLI = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C749790Tb7 UR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqq) : null;
            this.LL = (C749790Tb7) viewFindViewById;
        }
        return (C749790Tb7) viewFindViewById;
    }

    public final FrameLayout VR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqs) : null;
            this.LLILLL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final void NR() {
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                UR().LIZLLL();
                ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).Sw0(this.LLJJI, ((Number) this.LLJILLL.getValue()).longValue());
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C766270U4b.LJFF(2131843092, getContext());
    }

    public final List<C750740Tce> RR() {
        List<C750740Tce> list;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        return (dataChannelLJ == null || (list = (List) dataChannelLJ.gg0(ModeratorListChannel.class)) == null) ? new ArrayList() : list;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    public final void WR(int i) {
        if (PR()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_page_show");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
            c474500IjALIZ.LJJII(Integer.valueOf(i), "moderator_number");
            if (Intrinsics.LJFF(this.LLJILJIL, "multi_guest_panel")) {
                c474500IjALIZ.LJJII("multi_guest_panel", "event_page");
            }
            c474500IjALIZ.LIZ();
        }
    }

    public final void ZR(boolean z) {
        String str;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            EnumC748580TYa enumC748580TYa = EnumC748580TYa.MANAGE_MODERATOR;
            enumC748580TYa.next();
            dataChannelLJ.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_add_moderator_click");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        if (z) {
            str = "add_icon";
        } else {
            str = "add_button";
        }
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[PHI: r0
      0x0071: PHI (r0v3 android.view.View) = (r0v2 android.view.View), (r0v6 android.view.View) binds: [B:24:0x005e, B:29:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aS(java.util.List<X.C750740Tce> r6) {
        /*
            r5 = this;
            java.lang.String r1 = r5.LLJILJIL
            java.lang.String r0 = "multi_guest_panel"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r4 = 8
            if (r0 == 0) goto L4c
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicAdminAuthorizationLinkOptSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicAdminAuthorizationLinkOptSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L4c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r0 = r6.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L4c
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L4c
            java.util.Iterator r2 = r6.iterator()
        L29:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r2.next()
            X.0Tce r0 = (X.C750740Tce) r0
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r0.LJIIIZ
            if (r1 == 0) goto L4e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L4e
            int r0 = r0.intValue()
            if (r0 != r3) goto L4e
            goto L29
        L4c:
            r3 = 0
            goto L5c
        L4e:
            X.14i1<java.lang.Boolean> r0 = X.InterfaceC934710aQn.vc
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4c
        L5c:
            android.view.View r0 = r5.LLIZ
            if (r0 != 0) goto L71
            android.view.View r1 = r5.getView()
            if (r1 == 0) goto L81
            r0 = 2131381059(0x7f0a4b43, float:1.8382424E38)
            android.view.View r0 = r1.findViewById(r0)
        L6d:
            r5.LLIZ = r0
            if (r0 == 0) goto L77
        L71:
            if (r3 == 0) goto L74
            r4 = 0
        L74:
            X.C786410Ut5.LJLLLLLL(r4, r0)
        L77:
            if (r3 == 0) goto L80
            X.14i1<java.lang.Boolean> r1 = X.InterfaceC934710aQn.vc
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.LJFF(r0)
        L80:
            return
        L81:
            r0 = 0
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.moderator.ModeratorListFragment.aS(java.util.List):void");
    }

    public final void onEvent(C749730Tb1 c749730Tb1) {
        if (c749730Tb1 == null) {
            return;
        }
        List<C750740Tce> listRR = RR();
        ArrayList arrayList = new ArrayList();
        for (C750740Tce c750740Tce : listRR) {
            if (c750740Tce.LIZ != c749730Tb1.LIZIZ) {
                arrayList.add(c750740Tce);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(ModeratorListChannel.class, arrayList2);
        }
        if (this.mStatusViewValid && !c749730Tb1.LIZ) {
            C749600Tao c749600Tao = this.LLJILJILJ;
            C749600Tao c749600Tao2 = null;
            if (c749600Tao == null) {
                c749600Tao = null;
            }
            c749600Tao.LLLI(c749730Tb1.LIZIZ);
            C749600Tao c749600Tao3 = this.LLJILJILJ;
            if (c749600Tao3 != null) {
                c749600Tao2 = c749600Tao3;
            }
            if (c749600Tao2.getItemCount() == 0) {
                C500260Jjc.LJIILIIL(SR());
                UR().LIZIZ();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void bS(int i, int i2) {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.tqr);
            } else {
                viewFindViewById = null;
            }
            this.LLILZIL = (C16F5) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (Intrinsics.LJFF(this.LLJILJIL, "multi_guest_panel") && LinkMicAdminAuthorizationLinkOptSetting.INSTANCE.enable()) {
            textView.setText(C786410Ut5.j4("%s(%d/%d)", Arrays.copyOf(new Object[]{C497740JfY.LJIJI(2131842824), Integer.valueOf(i), Integer.valueOf(i2)}, 3)));
        } else {
            textView.setText(2131842824);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[PHI: r2
      0x00ab: PHI (r2v3 android.view.View) = (r2v2 android.view.View), (r2v19 android.view.View) binds: [B:38:0x0098, B:43:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca A[PHI: r2
      0x00ca: PHI (r2v5 android.view.View) = (r2v4 android.view.View), (r2v16 android.view.View) binds: [B:46:0x00b7, B:51:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9 A[PHI: r2
      0x00e9: PHI (r2v7 android.view.View) = (r2v6 android.view.View), (r2v13 android.view.View) binds: [B:54:0x00d6, B:59:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.moderator.ModeratorListFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        boolean z;
        View viewTd;
        Bundle arguments = getArguments();
        C19GS c19gs = null;
        if (arguments != null) {
            try {
                obj = arguments.get("entrance");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, "multi_guest_panel") && LinkMicAdminAuthorizationLinkOptSetting.INSTANCE.enable()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.g8p, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.g8n, viewGroup, false);
        }
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
