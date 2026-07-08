package com.ss.android.ugc.aweme.journey.step.push;

import X.AbstractC20656215sG;
import X.AnonymousClass0956;
import X.C090F;
import X.C098200Yq;
import X.C099F;
import X.C0HTI;
import X.C0PEM;
import X.C10H5;
import X.C10MN;
import X.C10MP;
import X.C10NW;
import X.C13LP;
import X.C1514430pVp;
import X.C1685300txQ;
import X.C1891180zJU;
import X.C1891190zJV;
import X.C189200o6;
import X.C1911400zq6;
import X.C1911410zq7;
import X.C1912280zrW;
import X.C1912930zsZ;
import X.C1912940zsa;
import X.C1912950zsb;
import X.C19233310Mh;
import X.C19233810Mm;
import X.C19233910Mn;
import X.C19241310Pj;
import X.C19249910Sr;
import X.C19EG;
import X.C19GS;
import X.C1BWL;
import X.C1DFH;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C420060GdY;
import X.C426750GoL;
import X.C616540OGe;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1912290zrX;
import X.InterfaceC1914010zuJ;
import X.ViewTreeObserverOnGlobalLayoutListenerC19333810kS;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJPushService;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PushPermissionBackgroundFragment extends NUJComponentFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2OGHELIOSs8PDw7ZhU5OicDLTchIDwgISoiCy4wIyI+Jjo9LAM+KCg+LSs4";
    public ConstraintLayout LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public AnonymousClass0956 LLJJIJI;
    public boolean LLJJIJIL;
    public Class<?> LLJJJIL;
    public final C2344009Gk LLJILLL = new C2344009Gk();
    public final IPushPermissionApi LLJJ = (IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class);
    public final INUJPushService LLJJI = (INUJPushService) ServiceManager.get().getService(INUJPushService.class);
    public EnumC1912290zrX LLJJIII = EnumC1912290zrX.INIT;
    public final C099F LLJJIJIIJIL = C090F.LIZIZ();
    public final List<String> LLJJJ = new ArrayList();

    public final void VR() {
        C10MP.LIZ.getClass();
        Keva.getRepo("nuj_extend").storeBoolean("push_page_passed", true);
        C1911410zq7.LIZ("PushPermissionFragment", "enter completePageWithExitTransition");
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1912280zrW(this, null), 3);
    }

    public final void aS() {
        if (this.LLJJIII != EnumC1912290zrX.INIT) {
            C1911410zq7.LIZ("PushPermissionFragment", "push permission popup had been requested before");
            return;
        }
        this.LLJJIII = EnumC1912290zrX.REQUESTED;
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            this.LLJJ.LJIIJJI();
        }
        if (this.LLJJ.LJFF(C1BWL.LIZ())) {
            C19241310Pj.LIZ.getClass();
            if (C19241310Pj.LIZ() == C10MN.BEFORE_INTEREST_SELECT) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("should show popup, current running popup: ");
                sbLIZ.append(PopupManager.LJ());
                C1911410zq7.LIZ("PushPermissionFragment", C2188811AlT.LIZIZ(sbLIZ));
                WR();
                C19EG activity = getActivity();
                if (activity != null) {
                    this.LLJJI.LIZLLL(activity, "before_interest", false, false, new InterfaceC1914010zuJ() { // from class: X.0zJW
                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZ() {
                            C1911410zq7.LIZ("PushPermissionFragment", "notShownBack");
                            this.LIZ.LLJJIII = EnumC1912290zrX.CONFIRMED;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("runningTask: ");
                            sbLIZ2.append(PopupManager.LJ());
                            C1911410zq7.LIZ("PushPermissionFragment", C2188811AlT.LIZIZ(sbLIZ2));
                            this.LIZ.VR();
                        }

                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZIZ() {
                            C1911410zq7.LIZ("PushPermissionFragment", "onShownBack");
                            this.LIZ.LLJJIII = EnumC1912290zrX.CONFIRMED;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("runningTask: ");
                            sbLIZ2.append(PopupManager.LJ());
                            C1911410zq7.LIZ("PushPermissionFragment", C2188811AlT.LIZIZ(sbLIZ2));
                            this.LIZ.VR();
                        }
                    });
                    return;
                }
                return;
            }
        }
        C1911410zq7.LIZ("PushPermissionFragment", "should not show popup, complete page");
        VR();
    }

    public final void WR() {
        AbstractC20656215sG abstractC20656215sGLJ = PopupManager.LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runningTask: ");
        sbLIZ.append(abstractC20656215sGLJ);
        C1911410zq7.LIZ("PushPermissionFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC20656215sGLJ != null) {
            ((ArrayList) this.LLJJJ).add(abstractC20656215sGLJ.getId());
            PopupManager.LIZJ(abstractC20656215sGLJ.getClass());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(abstractC20656215sGLJ);
            sbLIZ2.append(" dismissed");
            C1911410zq7.LIZ("PushPermissionFragment", C2188811AlT.LIZIZ(sbLIZ2));
            if (Intrinsics.LJFF(this.LLJJJIL, abstractC20656215sGLJ.getClass())) {
                return;
            }
            this.LLJJJIL = abstractC20656215sGLJ.getClass();
            WR();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1911410zq7.LIZ("PushPermissionFragment", "onDestroy");
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIJI = null;
        if (!this.LLJJIJIL) {
            ZR("killed");
        } else if (this.LLJJIII == EnumC1912290zrX.SKIPPED) {
            ZR("skipped");
        } else {
            ZR("done");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1911410zq7.LIZ("PushPermissionFragment", "onPause");
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIJI = null;
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PushPermissionBackgroundFragment.class.getName());
        }
        super.onResume();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume, pushPopupStatus: ");
        sbLIZ.append(this.LLJJIII);
        C1911410zq7.LIZ("PushPermissionFragment", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1891190zJV(this, null), 3);
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIJI = null;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJIJI = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1891180zJU(this, null), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1911410zq7.LIZ("PushPermissionFragment", "onStart");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C1911410zq7.LIZ("PushPermissionFragment", "onStop");
        if (this.LLJJIJIL) {
            return;
        }
        ZR("background");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ZR(String str) {
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        String value = C10H5.PUSH_PERMISSION_PAGE_EXIT.getValue();
        C2344009Gk c2344009Gk = this.LLJILLL;
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("ui_type", "push_page");
        c2344009Gk.LJIIIIZZ("exit_method", str);
        c2344009Gk.LJIIIIZZ("push_status", this.LLJJIII.getStatus());
        c2344009Gk.LIZJ(this.LLJJIJIL ? 1 : 0, "node_completed");
        String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LLJJJ, ",", null, null, 0, null, null, 62);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("blocking popups: ");
        sbLIZ.append(strLJJLIIIJ);
        C1911410zq7.LIZ("PushPermissionFragment", C2188811AlT.LIZIZ(sbLIZ));
        c2344009Gk.LJIIIIZZ("pending_popups", strLJJLIIIJ);
        c2344009Gk.LIZJ(((ArrayList) this.LLJJJ).size(), "pending_popup_cnt");
        c19249910Sr.LIZIZ(c2344009Gk, value);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("strategyConfig.textAlignmentStyle: ");
        C19233810Mm c19233810Mm = C19233810Mm.LIZ;
        c19233810Mm.getClass();
        sbLIZ.append(C19233810Mm.LIZ(C19233910Mn.class).LIZLLL("text_alignment_style", "start"));
        C1911410zq7.LIZ("PushPermissionFragment", C2188811AlT.LIZIZ(sbLIZ));
        c19233810Mm.getClass();
        String strLIZLLL = C19233810Mm.LIZ(C19233910Mn.class).LIZLLL("text_alignment_style", "start");
        if (Intrinsics.LJFF(strLIZLLL, "center")) {
            C1911410zq7.LIZ("PushPermissionFragment", "TEXT_ALIGNMENT_STYLE_CENTER");
            ((TextView) view.findViewById(R.id.sjd)).setGravity(1);
            ((TextView) view.findViewById(R.id.sjc)).setGravity(1);
        } else if (Intrinsics.LJFF(strLIZLLL, "start")) {
            C1911410zq7.LIZ("PushPermissionFragment", "TEXT_ALIGNMENT_STYLE_START");
            ((TextView) view.findViewById(R.id.sjd)).setGravity(8388611);
            ((TextView) view.findViewById(R.id.sjc)).setGravity(8388611);
        }
        c19233810Mm.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            View viewFindViewById = this.LLJIJIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.sjd);
                } else {
                    viewFindViewById = null;
                }
                this.LLJIJIL = (TuxTextView) viewFindViewById;
            }
            C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76))), null, null, false, 29);
        }
        if (C1911400zq6.LIZ(getContext())) {
            View viewFindViewById2 = this.LLJIJIL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.sjd);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJIJIL = (TuxTextView) viewFindViewById2;
            }
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById2;
            tuxTextView.setTuxFont(13);
            tuxTextView.LJJJJI(24.0f);
            C426750GoL.LJIIIZ(tuxTextView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68))), null, null, false, 29);
            View viewFindViewById3 = this.LLJILJIL;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.sjc);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJILJIL = (TuxTextView) viewFindViewById3;
            }
            ((TuxTextView) viewFindViewById3).LJJJJI(14.0f);
            View viewFindViewById4 = this.LLJILJILJ;
            if (viewFindViewById4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById4 = view5.findViewById(R.id.siu);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJILJILJ = (TuxIconView) viewFindViewById4;
            }
            C1911400zq6.LJ(viewFindViewById4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(293))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))));
        }
        View viewFindViewById5 = this.LLJILJILJ;
        if (viewFindViewById5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById5 = view6.findViewById(R.id.siu);
            } else {
                viewFindViewById5 = null;
            }
            this.LLJILJILJ = (TuxIconView) viewFindViewById5;
        }
        TuxIconView tuxIconView = (TuxIconView) viewFindViewById5;
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.p4;
        tuxIconView.setImageDrawable(c0hti.LIZ(tuxIconView.getContext()));
        c19233810Mm.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            View view7 = getView();
            if (view7 != null) {
                C1911410zq7.LIZ("PushPermissionFragment", "to call showPushPermissionPopup without animation");
                ViewTreeObserver viewTreeObserver = view7.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    ViewTreeObserverOnGlobalLayoutListenerC19333810kS viewTreeObserverOnGlobalLayoutListenerC19333810kS = new ViewTreeObserverOnGlobalLayoutListenerC19333810kS(view7, this, 1);
                    viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC19333810kS);
                    C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC19333810kS, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
            }
        } else {
            C1911410zq7.LIZ("PushPermissionFragment", "to showPageWithEnterTransition");
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 682);
            View viewFindViewById6 = this.LLJI;
            if (viewFindViewById6 == null) {
                View view8 = getView();
                if (view8 != null) {
                    viewFindViewById6 = view8.findViewById(R.id.tqy);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLJI = (ConstraintLayout) viewFindViewById6;
            }
            C420060GdY.LIZ((ConstraintLayout) viewFindViewById6, null, true, new AwS572S0100000_28(awS572S0100000_28, 683), 26);
        }
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        String value = C10H5.PUSH_PERMISSION_PAGE_SHOW.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("ui_type", "push_page");
        c19249910Sr.LIZIZ(c2344009Gk, value);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1912950zsb c1912950zsb;
        C1912950zsb c1912950zsb2;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_PUSH_PERMISSION_BACKGROUND;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C19GS c19gs = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJ;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.czg, viewGroup, false);
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJ;
        } else {
            c1912950zsb2 = null;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
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
