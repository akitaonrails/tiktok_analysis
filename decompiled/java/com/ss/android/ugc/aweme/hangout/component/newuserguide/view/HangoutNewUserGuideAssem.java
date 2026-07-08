package com.ss.android.ugc.aweme.hangout.component.newuserguide.view;

import X.C019F;
import X.C0IDP;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1292030jj7;
import X.C1294250jmh;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C13LE;
import X.C1637806bA;
import X.C1669670tYD;
import X.C19719212De;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C479140Iqe;
import X.C479760Ire;
import X.C497740JfY;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1427810nG7;
import X.InterfaceC1292040jj8;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnPreDrawListenerC482030IvJ;
import X.ViewTreeObserverOnPreDrawListenerC521780KdE;
import Y.ARunnableS107S0100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutTopliveNewUserGuideEnableSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem;
import com.ss.android.ugc.aweme.hangout.component.newuserguide.view.HangoutNewUserGuideAssem;
import com.ss.android.ugc.aweme.hangout.component.newuserguide.viewmodel.HangoutNewUserGuideVM;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: loaded from: classes8.dex */
public final class HangoutNewUserGuideAssem extends LiveHangoutV2SelectableSlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public C1295960jpS LLJJIII;
    public C1295960jpS LLJJIJI;
    public ViewTreeObserverOnPreDrawListenerC521780KdE LLJJIJIIJIL;
    public ViewTreeObserverOnPreDrawListenerC521780KdE LLJJIJIL;
    public ViewTreeObserverOnPreDrawListenerC482030IvJ LLJJJ;
    public ValueAnimator LLJJJIL;
    public C0IDP LLJJJJ;
    public View LLJJJJJIL;
    public ARunnableS107S0100000_7 LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HangoutNewUserGuideAssem.class, "guideLayoutVM", "getGuideLayoutVM()Lcom/ss/android/ugc/aweme/hangout/component/newuserguide/viewmodel/HangoutNewUserGuideVM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLILLLLZIIL = Color.argb(54, 0, 0, 0);
    }

    public HangoutNewUserGuideAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HangoutNewUserGuideVM.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 273), AFwS237S0000000_7.get$arr$(96), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return HangoutTopliveNewUserGuideEnableSetting.INSTANCE.value() == 2 ? R.layout.diu : R.layout.dit;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        LinearLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        C20441214yg.LIZIZ("HangoutNewUserGuideAssem", "onDestroy");
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = this.LLJJJJLIIL;
        if (aRunnableS107S0100000_7 != null) {
            LinkedHashSet<Runnable> linkedHashSet = C479760Ire.LJIJJLI;
            synchronized (linkedHashSet) {
                try {
                    linkedHashSet.remove(aRunnableS107S0100000_7);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LLJJJJLIIL = null;
        ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE = this.LLJJIJIIJIL;
        if (viewTreeObserverOnPreDrawListenerC521780KdE != null) {
            C786410Ut5.D3(getContentView().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC521780KdE);
        }
        this.LLJJIJIIJIL = null;
        ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE2 = this.LLJJIJIL;
        if (viewTreeObserverOnPreDrawListenerC521780KdE2 != null) {
            C786410Ut5.D3(getContentView().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC521780KdE2);
        }
        this.LLJJIJIL = null;
        ViewTreeObserverOnPreDrawListenerC482030IvJ viewTreeObserverOnPreDrawListenerC482030IvJ = this.LLJJJ;
        if (viewTreeObserverOnPreDrawListenerC482030IvJ != null) {
            C786410Ut5.D3(getContentView().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC482030IvJ);
        }
        this.LLJJJ = null;
        ValueAnimator valueAnimator = this.LLJJJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJJIL = null;
        View view = this.LLJJJJJIL;
        C0IDP c0idp = this.LLJJJJ;
        if (view != null && c0idp != null) {
            view.removeOnLayoutChangeListener(c0idp);
        }
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        getContentView().animate().cancel();
        if (this.LLJJL && !this.LLJJLIIIJLLLLLLLZ) {
            View viewIp = ip();
            if (viewIp != null) {
                viewIp.animate().cancel();
                C786410Ut5.T4(viewIp, 1.0f);
                C786410Ut5.LJLLLLLL(0, viewIp);
            }
            View viewKp = kp();
            if (viewKp != null) {
                viewKp.animate().cancel();
                C786410Ut5.ed(viewKp, 0.0f);
                ViewGroup.LayoutParams layoutParams3 = viewKp.getLayoutParams();
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null && layoutParams2.topMargin != 0) {
                    layoutParams2.topMargin = 0;
                    C786410Ut5.W5(viewKp, layoutParams2);
                }
                if (HangoutTopliveNewUserGuideEnableSetting.INSTANCE.value() != 2) {
                    int iLIZIZ = (int) C497740JfY.LIZIZ(112.0f);
                    View viewFindViewById = viewKp.findViewById(R.id.dg0);
                    if (viewFindViewById != null) {
                        viewFindViewById.animate().cancel();
                        op(iLIZIZ, viewFindViewById);
                    }
                    View viewFindViewById2 = viewKp.findViewById(R.id.dej);
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.animate().cancel();
                        op(iLIZIZ, viewFindViewById2);
                    }
                    View viewFindViewById3 = viewKp.findViewById(R.id.lsb);
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.animate().cancel();
                        C786410Ut5.T4(viewFindViewById3, 1.0f);
                        C786410Ut5.LJLLLLLL(0, viewFindViewById3);
                    }
                    View viewFindViewById4 = viewKp.findViewById(R.id.le7);
                    if (viewFindViewById4 != null) {
                        viewFindViewById4.animate().cancel();
                        C786410Ut5.T4(viewFindViewById4, 1.0f);
                        C786410Ut5.LJLLLLLL(0, viewFindViewById4);
                    }
                    View viewFindViewById5 = viewKp.findViewById(R.id.tv_random_chat_title);
                    if (viewFindViewById5 != null) {
                        viewFindViewById5.animate().cancel();
                        C786410Ut5.ed(viewFindViewById5, 0.0f);
                    }
                    View viewFindViewById6 = viewKp.findViewById(R.id.zhc);
                    if (viewFindViewById6 != null) {
                        viewFindViewById6.animate().cancel();
                        C786410Ut5.ed(viewFindViewById6, 0.0f);
                    }
                }
            }
            View viewLp = lp();
            if (viewLp != null) {
                viewLp.animate().cancel();
                C786410Ut5.ed(viewLp, 0.0f);
                ViewGroup.LayoutParams layoutParams4 = viewLp.getLayoutParams();
                if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams4) != null && layoutParams.topMargin != 0) {
                    layoutParams.topMargin = 0;
                    C786410Ut5.W5(viewLp, layoutParams);
                }
            }
        }
        C1295960jpS c1295960jpS = this.LLJJIII;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LLJJIJI;
        if (c1295960jpS2 != null) {
            c1295960jpS2.cancelAnimation();
        }
        this.LLJJIII = null;
        this.LLJJIJI = null;
        super.onDestroy();
    }

    public final View ip() {
        View view;
        View view2;
        View view3;
        Object parent = getContentView().getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return null;
        }
        Object parent2 = view.getParent();
        if (!(parent2 instanceof ViewGroup) || (view2 = (View) parent2) == null) {
            return null;
        }
        Object parent3 = view2.getParent();
        if (!(parent3 instanceof ViewGroup) || (view3 = (View) parent3) == null) {
            return null;
        }
        return view3.findViewById(R.id.oaf);
    }

    public final View kp() {
        View view;
        View view2;
        Object parent = getContentView().getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return null;
        }
        Object parent2 = view.getParent();
        if (!(parent2 instanceof ViewGroup) || (view2 = (View) parent2) == null) {
            return null;
        }
        return view2.findViewById(R.id.oag);
    }

    public final View lp() {
        View view;
        Object parent = getContentView().getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return null;
        }
        Object parent2 = view.getParent();
        if (parent2 instanceof View) {
            return (View) parent2;
        }
        return null;
    }

    public final boolean tp() {
        View viewKp = kp();
        if (viewKp == null) {
            return false;
        }
        View viewFindViewById = viewKp.findViewById(R.id.dg0);
        View viewFindViewById2 = viewKp.findViewById(R.id.dej);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            return false;
        }
        float f = 85;
        op((int) C497740JfY.LIZIZ(f), viewFindViewById);
        op((int) C497740JfY.LIZIZ(f), viewFindViewById2);
        View viewFindViewById3 = viewKp.findViewById(R.id.lsb);
        if (viewFindViewById3 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        }
        View viewFindViewById4 = viewKp.findViewById(R.id.le7);
        if (viewFindViewById4 == null) {
            return true;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById4);
        return true;
    }

    public static void hp(View view) {
        if (view == null) {
            return;
        }
        view.animate().cancel();
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.LJLLLLLL(0, view);
        view.animate().alpha(1.0f).setDuration(400L).start();
    }

    @Override // com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LinearLayout.LayoutParams layoutParams;
        int iLIZIZ;
        ViewGroup viewGroup;
        super.onViewCreated(view);
        C20441214yg.LIZIZ("HangoutNewUserGuideAssem", "onViewCreated");
        boolean z = C479760Ire.LJIJI;
        if (!C479140Iqe.LIZ()) {
            C20441214yg.LIZIZ("HangoutNewUserGuideAssem", "skipping new-user guide: not first launch or feature off");
            C786410Ut5.LJLLLLLL(8, getContentView());
            return;
        }
        this.LLJJL = true;
        ViewParent parent = getContentView().getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        View viewLp = lp();
        if (viewLp != null) {
            ViewGroup.LayoutParams layoutParams2 = viewLp.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null && layoutParams.topMargin != (iLIZIZ = (int) C497740JfY.LIZIZ(-60.0f))) {
                layoutParams.topMargin = iLIZIZ;
                C786410Ut5.W5(viewLp, layoutParams);
            }
        }
        if (HangoutTopliveNewUserGuideEnableSetting.INSTANCE.value() == 2) {
            ComposeView composeView = (ComposeView) getContentView().findViewById(R.id.eo8);
            if (composeView == null) {
                C20441214yg.LJIIL("HangoutNewUserGuideAssem", "compose_new_user_guide view not found; CMP UI skipped");
            } else {
                C1669670tYD.LJ(composeView, EnumC1427810nG7.Dark, new C19719212De(-831464889, new AwS639S0100000_25(this, 105), true));
            }
        } else {
            this.LLJJIII = (C1295960jpS) getContentView().findViewById(R.id.nrq);
            this.LLJJIJI = (C1295960jpS) getContentView().findViewById(R.id.nrp);
            TextView textView = (TextView) getContentView().findViewById(R.id.zyz);
            if (textView != null) {
                textView.setShadowLayer((int) C497740JfY.LIZIZ(10.0f), (int) C497740JfY.LIZIZ(0.0f), (int) C497740JfY.LIZIZ(2.0f), LLJLILLLLZIIL);
            }
            try {
                ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).ud2("tiktok_live_interaction_normal_3");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJIILIIL("HangoutNewUserGuideAssem", "updateGeckoLocalFile failed", th);
            }
            C1295960jpS c1295960jpS = this.LLJJIII;
            if (c1295960jpS != null) {
                mp(c1295960jpS, "hangout_user_guide_left.json");
            }
            C1295960jpS c1295960jpS2 = this.LLJJIJI;
            if (c1295960jpS2 != null) {
                mp(c1295960jpS2, "hangout_user_guide_right.json");
            }
            View viewKp = kp();
            if (viewKp != null) {
                C786410Ut5.LJLLLLLL(4, viewKp);
            }
            ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE = new ViewTreeObserverOnPreDrawListenerC521780KdE(this, 3);
            this.LLJJIJIIJIL = viewTreeObserverOnPreDrawListenerC521780KdE;
            C786410Ut5.y3(getContentView().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC521780KdE);
        }
        if (HangoutTopliveNewUserGuideEnableSetting.INSTANCE.value() != 2 && !tp()) {
            ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE2 = new ViewTreeObserverOnPreDrawListenerC521780KdE(this, 4);
            this.LLJJIJIL = viewTreeObserverOnPreDrawListenerC521780KdE2;
            C786410Ut5.y3(getContentView().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC521780KdE2);
        }
        View viewIp = ip();
        if (viewIp != null) {
            C786410Ut5.LJLLLLLL(8, viewIp);
        }
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 121);
        LinkedHashSet<Runnable> linkedHashSet = C479760Ire.LJIJJLI;
        synchronized (linkedHashSet) {
            try {
                linkedHashSet.add(aRunnableS107S0100000_7);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        this.LLJJJJLIIL = aRunnableS107S0100000_7;
    }

    public static void op(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height == i) {
            return;
        }
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static void sp(View view, float f) {
        if (view == null) {
            return;
        }
        view.animate().cancel();
        C786410Ut5.ed(view, f);
        view.animate().translationY(0.0f).setDuration(400L).start();
    }

    public final void mp(final C1295960jpS c1295960jpS, final String str) {
        Context context = c1295960jpS.getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tiktok_live_interaction_normal_3/");
        sbLIZ.append(str);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            InputStream inputStreamOpen = context.getAssets().open(strLIZIZ);
            if (inputStreamOpen != null) {
                C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(inputStreamOpen, strLIZIZ);
                c1292030jj7LJ.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0IvK
                    @Override // X.InterfaceC1292040jj8
                    public final void onResult(Object obj) {
                        C1294720jnS c1294720jnS = (C1294720jnS) obj;
                        if (c1294720jnS != null) {
                            c1295960jpS.setComposition(c1294720jnS);
                            c1295960jpS.playAnimation();
                            return;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("asset returned null composition: ");
                        sbLIZ2.append(strLIZIZ);
                        C20441214yg.LJIIL("HangoutNewUserGuideAssem", C2188811AlT.LIZIZ(sbLIZ2));
                        HangoutNewUserGuideAssem hangoutNewUserGuideAssem = this;
                        C1295960jpS c1295960jpS2 = c1295960jpS;
                        String str2 = str;
                        hangoutNewUserGuideAssem.getClass();
                        C1143680frq.LJIILJJIL(c1295960jpS2, "tiktok_live_interaction_normal_3", str2, true);
                    }
                });
                c1292030jj7LJ.LIZ(new InterfaceC1292040jj8() { // from class: X.0IvL
                    @Override // X.InterfaceC1292040jj8
                    public final void onResult(Object obj) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("asset parse failed, falling back to gecko: ");
                        sbLIZ2.append(strLIZIZ);
                        C20441214yg.LJIILIIL("HangoutNewUserGuideAssem", C2188811AlT.LIZIZ(sbLIZ2), (Throwable) obj);
                        HangoutNewUserGuideAssem hangoutNewUserGuideAssem = this;
                        C1295960jpS c1295960jpS2 = c1295960jpS;
                        String str2 = str;
                        hangoutNewUserGuideAssem.getClass();
                        C1143680frq.LJIILJJIL(c1295960jpS2, "tiktok_live_interaction_normal_3", str2, true);
                    }
                });
                return;
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("asset not bundled, falling back to gecko: ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("; ");
            sbLIZ2.append(e);
            C20441214yg.LIZIZ("HangoutNewUserGuideAssem", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1143680frq.LJIILJJIL(c1295960jpS, "tiktok_live_interaction_normal_3", str, true);
    }
}
