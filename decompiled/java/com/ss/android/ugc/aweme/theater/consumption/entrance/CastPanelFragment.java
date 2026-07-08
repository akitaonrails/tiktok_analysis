package com.ss.android.ugc.aweme.theater.consumption.entrance;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C01GW;
import X.C034J;
import X.C098200Yq;
import X.C0B7Z;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C1E3D;
import X.C20600815jK;
import X.C20673215v0;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C547930LeJ;
import X.C548880Lfq;
import X.C548910Lft;
import X.C549430Lgj;
import X.C549720LhC;
import X.C549760LhG;
import X.C550740Liq;
import X.C554730LpH;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC344240DeY;
import X.InterfaceC528960Koo;
import X.InterfaceC548750Lfd;
import X.InterfaceC550750Lir;
import X.InterfaceC558600LvW;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.feed.model.AITheaterInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.feed.model.UserBaseInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class CastPanelFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEkLC4nLTdiKiA9HELIOSOzAhOTs6JytiLCEnOiQiKip9CyQ/PR8yJiAgDz0yLygpJzs=";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 410));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 413));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 414));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 411));

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS552S0100000_8(this, 412));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        String strLIZ = C547930LeJ.LIZ(2131826064, new Object[0]);
        if (strLIZ == null) {
            strLIZ = "";
        }
        c1250250idj.LIZJ = strLIZ;
        c0om1.LIZJ = c1250250idj;
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS239S0000000_8.get$arr$(145));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final boolean z;
        Runnable runnable;
        final IAITheaterCreationLauncher.EnterParams enterParams;
        AIGC.AICreationSceneName aICreationSceneName;
        ?? arrayList;
        C20600815jK<InterfaceC1891350zJl> state;
        List<CameoInfo> cameoInfo;
        UserBaseInfo userBaseInfo;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        InterfaceC528960Koo interfaceC528960KooJ9;
        InterfaceC550750Lir interfaceC550750LirG9;
        String strLIZ;
        super.onViewCreated(view, bundle);
        char c = 0;
        if (((Aweme) this.LLIZ.getValue()).getAllowAIRemix() != 1 && !((Boolean) C0B7Z.LIZ.getValue()).booleanValue()) {
            z = false;
            runnable = null;
            enterParams = new IAITheaterCreationLauncher.EnterParams(null, null, null, null, AIGCEntranceInfo.LIZ(C550740Liq.LIZ("dissupport_remix_cast", AIGC.AICreationSceneName.DISSUPPORT_REMIX_CAST.INSTANCE, new AIGC.RefPageName.Custom((String) this.LLIZLLLIL.getValue()), false), null, null, 0, null, null, false, false, false, null, null, (String) this.LLIZLLLIL.getValue(), null, null, null, false, false, 1046527), 15, null);
        } else {
            z = true;
            runnable = null;
            enterParams = new IAITheaterCreationLauncher.EnterParams(null, null, C549430Lgj.LIZIZ((Aweme) this.LLIZ.getValue()), null, AIGCEntranceInfo.LIZ(C550740Liq.LIZ("support_remix_anchor", AIGC.AICreationSceneName.SUPPORT_REMIX_ANCHOR.INSTANCE, new AIGC.RefPageName.Custom((String) this.LLIZLLLIL.getValue()), false), null, null, 0, null, null, false, false, false, null, null, (String) this.LLIZLLLIL.getValue(), null, null, null, false, false, 1046527), 11, null);
        }
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null && interfaceC558600LvWLIZIZ.isFeatureEnabled()) {
            View view2 = (View) this.LLJI.getValue();
            if (view2 != null) {
                C426750GoL.LJIIIZ(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))), false, 16);
            }
            TextView textView = (TextView) this.LLJI.getValue();
            if (textView != null) {
                if (z) {
                    strLIZ = C547930LeJ.LIZ(2131826059, new Object[0]);
                } else {
                    strLIZ = C547930LeJ.LIZ(2131826058, new Object[0]);
                }
                textView.setText(strLIZ);
            }
            View view3 = (View) this.LLJI.getValue();
            if (view3 != null) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0Lit
                    @Override // X.AbstractViewOnClickListenerC1173120gdK
                    public final void LIZ(View view4) {
                        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
                        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ2;
                        AITheaterProfileService aITheaterProfileService;
                        InterfaceC528960Koo interfaceC528960KooJ92;
                        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                        C1E3C c1e3c = C1E3C.LJIIIIZZ;
                        InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(enterParams);
                        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(260);
                        c548880Lfq.getClass();
                        C548880Lfq.LIZLLL(c1e3c, interfaceC548750LfdLIZ, aFwS239S0000000_8);
                        Context context = this.getContext();
                        if (!z) {
                            String strLIZ2 = C528840Koc.LIZ();
                            AIGCEntranceInfo aIGCEntranceInfo = enterParams.entranceInfo;
                            if (aIGCEntranceInfo != null && (aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null)) != null && (interfaceC528960KooJ92 = aITheaterProfileService.j9()) != null) {
                                interfaceC528960KooJ92.LIZLLL(strLIZ2, aIGCEntranceInfo);
                            }
                            if (context != null) {
                                IAITheaterFeatureService.LIZ.getClass();
                                IAITheaterFeatureService iAITheaterFeatureServiceLIZ2 = C549720LhC.LIZ();
                                if (iAITheaterFeatureServiceLIZ2 != null && (iAITheaterCreationLauncherLIZ2 = iAITheaterFeatureServiceLIZ2.LIZ()) != null) {
                                    iAITheaterCreationLauncherLIZ2.LIZ(enterParams, context, strLIZ2, false, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (context == null) {
                            return;
                        }
                        IAITheaterFeatureService.LIZ.getClass();
                        IAITheaterFeatureService iAITheaterFeatureServiceLIZ3 = C549720LhC.LIZ();
                        if (iAITheaterFeatureServiceLIZ3 == null || (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ3.LIZ()) == null) {
                            return;
                        }
                        iAITheaterCreationLauncherLIZ.LJFF(enterParams, context, false);
                    }
                }, view3);
            }
            if (!z) {
                c = 0;
                AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, runnable);
                if (aITheaterProfileService != null && (interfaceC550750LirG9 = aITheaterProfileService.g9()) != null) {
                    interfaceC550750LirG9.LJIILL();
                }
                AIGCEntranceInfo aIGCEntranceInfo = enterParams.entranceInfo;
                if (aIGCEntranceInfo != null && aITheaterProfileService != null && (interfaceC528960KooJ9 = aITheaterProfileService.j9()) != null) {
                    interfaceC528960KooJ9.LJIIIIZZ(aIGCEntranceInfo);
                }
            }
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C1E3D c1e3d = C1E3D.LJIIIIZZ;
            InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(enterParams);
            AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(260);
            c548880Lfq.getClass();
            C548880Lfq.LIZLLL(c1e3d, interfaceC548750LfdLIZ, aFwS239S0000000_8);
        } else {
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ2 = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ2 != null) {
                AIGCEntranceInfo aIGCEntranceInfo2 = enterParams.entranceInfo;
                if (aIGCEntranceInfo2 == null || (aICreationSceneName = aIGCEntranceInfo2.sceneName) == null) {
                    aICreationSceneName = AIGC.AICreationSceneName.NO_NEED.INSTANCE;
                }
                C549760LhG.LIZ(iAITheaterFeatureServiceLIZ2, aICreationSceneName);
            }
            C197039127h c197039127h = (C197039127h) this.LLJI.getValue();
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 8);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            Class<? extends PowerCell<?>>[] clsArr = new Class[1];
            clsArr[c] = CastUserCell.class;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(clsArr);
        }
        AITheaterInfo aITheaterInfo = ((Aweme) this.LLIZ.getValue()).aiTheaterInfo;
        if (aITheaterInfo != null && (cameoInfo = aITheaterInfo.getCameoInfo()) != null) {
            arrayList = new ArrayList();
            for (CameoInfo cameoInfo2 : cameoInfo) {
                if (cameoInfo2 != null && (userBaseInfo = cameoInfo2.getUserBaseInfo()) != null) {
                    arrayList.add(new C034J(userBaseInfo, cameoInfo2.getCameoAssetInfo(), (Aweme) this.LLIZ.getValue(), (String) this.LLIZLLLIL.getValue()));
                }
            }
        } else {
            arrayList = runnable;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
        if (viewOnAttachStateChangeListenerC20604515jv2 == null || (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) == null || arrayList == 0) {
            return;
        }
        state.LJIILL(arrayList, runnable);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            viewLIZJ = C20673215v0.LIZLLL(R.layout.nd, activity, viewGroup, false);
        } else {
            viewLIZJ = null;
        }
        if (viewLIZJ == null) {
            viewLIZJ = C554730LpH.LIZJ(layoutInflater, R.layout.nd, viewGroup, false);
        }
        if (!(viewLIZJ instanceof View)) {
            viewLIZJ = null;
        }
        if (viewLIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
                viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZJ;
    }
}
