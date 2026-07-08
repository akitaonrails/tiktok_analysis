package com.ss.android.ugc.aweme.relation.feed.v4;

import X.C01D1;
import X.C01GW;
import X.C0SUL;
import X.C10L2;
import X.C1287400jbe;
import X.C13LE;
import X.C14LC;
import X.C1617910sCj;
import X.C1637806bA;
import X.C19228210Ki;
import X.C19229410Ku;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19M4;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C309690CBz;
import X.C323670CmT;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C487280J9a;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1287420jbg;
import X.InterfaceC207200166c;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import X.InterfaceC690460R6m;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.relation.experiment.BigCardUIFixConfig;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeUserCardRootAssem;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class RecSwipeUserCardRootAssem extends ReusedUIContentAssem<RecSwipeUserCardRootAssem> implements InterfaceC207200166c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public C0SUL LLJJJJ;
    public C197039127h LLJJJJJIL;
    public RelationButton LLJJJJLIIL;
    public RelationButton LLJJL;
    public C1617910sCj LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public C19M4 LLJLIL;
    public C1287400jbe LLJLILLLLZIIL;
    public View LLJLL;
    public final AssemVMLazy LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C19229410Ku LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecSwipeUserCardRootAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/relation/feed/v4/RecSwipeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.10Ku] */
    public RecSwipeUserCardRootAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecSwipeViewModel.class);
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS572S0100000_28(c19719912DlLIZ, 517), AFwS271S0000000_28.get$arr$(203), null, true);
        this.LLJLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(347));
        this.LLJZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(348));
        this.LLJZIJLIL = new InterfaceC487330J9f() { // from class: X.10Ku
            @Override // X.InterfaceC487330J9f
            public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                int i;
                int marginEnd;
                ViewGroup.MarginLayoutParams marginLayoutParams2;
                int i2 = C2187451AjH.LIZ;
                this.LL.dp();
                if (!C19228210Ki.LIZJ()) {
                    RecSwipeUserCardRootAssem recSwipeUserCardRootAssem = this.LL;
                    Integer numLIZ = ((C10KY) recSwipeUserCardRootAssem.LLJZ.getValue()).LIZ(recSwipeUserCardRootAssem.getContext());
                    C197039127h c197039127hKp = recSwipeUserCardRootAssem.kp();
                    ViewGroup.LayoutParams layoutParams = c197039127hKp.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams = null;
                    }
                    int i3 = 0;
                    if (marginLayoutParams != null) {
                        i = marginLayoutParams.topMargin;
                    } else {
                        i = 0;
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    ViewGroup.LayoutParams layoutParams2 = c197039127hKp.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    } else {
                        marginEnd = 0;
                    }
                    Integer numValueOf2 = Integer.valueOf(marginEnd);
                    ViewGroup.LayoutParams layoutParams3 = c197039127hKp.getLayoutParams();
                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        i3 = marginLayoutParams2.bottomMargin;
                    }
                    C426750GoL.LJIIIZ(c197039127hKp, numLIZ, numValueOf, numValueOf2, Integer.valueOf(i3), false, 16);
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C487280J9a.LIZJ(this.LLJZIJLIL);
    }

    public final void dp() {
        int iLIZIZ;
        boolean z = C14LC.LJIIIZ;
        if (C309690CBz.LIZ.LJFF) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            int i = C14LC.LJIILLIIL;
            int iLIZIZ2 = C14LC.LIZIZ();
            if (i == 0) {
                i = iLIZIZ2;
            }
            iLIZIZ = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        }
        op().setPadding(0, 0, 0, iLIZIZ);
        HandlerHook.viewPost(LJJIJL(), new ARunnableS128S0100000_28(this, 53));
    }

    public final View ep() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.boj) : null;
            this.LLJLL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C1287400jbe hp() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.bom) : null;
            this.LLJLILLLLZIIL = (C1287400jbe) viewFindViewById;
        }
        return (C1287400jbe) viewFindViewById;
    }

    public final RelationButton ip() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.bzr) : null;
            this.LLJJJJLIIL = (RelationButton) viewFindViewById;
        }
        return (RelationButton) viewFindViewById;
    }

    public final C197039127h kp() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.bzs) : null;
            this.LLJJJJJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C0SUL lp() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c06) : null;
            this.LLJJJJ = (C0SUL) viewFindViewById;
        }
        return (C0SUL) viewFindViewById;
    }

    public final RelationButton mp() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.bzv) : null;
            this.LLJJL = (RelationButton) viewFindViewById;
        }
        return (RelationButton) viewFindViewById;
    }

    public final C1617910sCj op() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tr5) : null;
            this.LLJJLIIIJLLLLLLLZ = (C1617910sCj) viewFindViewById;
        }
        return (C1617910sCj) viewFindViewById;
    }

    public final View sp() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wsb) : null;
            this.LLJL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C19M4 tp() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tv_swipe_up) : null;
            this.LLJLIL = (C19M4) viewFindViewById;
        }
        return (C19M4) viewFindViewById;
    }

    @Override // X.InterfaceC207200166c
    /* JADX INFO: renamed from: up, reason: merged with bridge method [inline-methods] */
    public final RecSwipeViewModel wk() {
        AssemVMLazy assemVMLazy = this.LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (RecSwipeViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC207200166c
    public final int D8() {
        return wk().LLILLL;
    }

    @Override // X.InterfaceC207200166c
    public final boolean Kf() {
        return ((RecSwipeViewModel) wk()).AQ2();
    }

    @Override // X.InterfaceC207200166c
    public final boolean Tj() {
        return wk().CQ2();
    }

    @Override // X.InterfaceC207200166c
    public final void Wf() {
        if (!C19228210Ki.LIZJ()) {
            C323670CmT.LIZ.getClass();
            if (C323670CmT.LIZ().getInt("key_swipe_up_show_times", 0) >= 3) {
                C786410Ut5.LLLLLZIL(tp(), 8);
                return;
            }
            C323670CmT.LIZ().storeInt("key_swipe_up_show_times", C323670CmT.LIZ().getInt("key_swipe_up_show_times", 0) + 1);
            C786410Ut5.LLLLLZIL(tp(), 0);
            return;
        }
        if (((BigCardUIFixConfig) C19228210Ki.LIZIZ.getValue()).showSwipeUpText != 1) {
            C19M4 c19m4Tp = tp();
            if (c19m4Tp != null) {
                C786410Ut5.LLLLLZIL(c19m4Tp, 8);
                return;
            }
            return;
        }
        C19M4 c19m4Tp2 = tp();
        if (c19m4Tp2 != null) {
            c19m4Tp2.setTextColorRes(R.attr.zi);
            c19m4Tp2.setText((CharSequence) null);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19m4Tp2);
            c19m4Tp2.setAlpha(0.6f);
            C786410Ut5.LLLLLZIL(c19m4Tp2, 0);
            C426750GoL.LJIIIZ(c19m4Tp2, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), false, 16);
        }
    }

    @Override // X.InterfaceC207200166c
    public final int c3() {
        return wk().LLILZLL;
    }

    @Override // X.InterfaceC207200166c
    public final int fj() {
        return wk().LLILZ;
    }

    @Override // X.InterfaceC207200166c
    public final int gj() {
        return wk().LLILZIL;
    }

    @Override // X.InterfaceC207200166c
    public final boolean m3() {
        return ((RecSwipeViewModel) wk()).BQ2();
    }

    @Override // X.InterfaceC207200166c
    public final boolean xl() {
        return ((RecSwipeViewModel) wk()).zQ2();
    }

    @Override // X.InterfaceC207200166c
    public final void LJIILIIL(Aweme aweme) {
        wk().LLILLJJLI = aweme;
    }

    @Override // X.InterfaceC207200166c
    public final void hc(boolean z) {
        wk().LLJ = z;
    }

    @Override // X.InterfaceC207200166c
    public final void j7(String str) {
        wk().GQ2(str);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(final View view) {
        if (!C19228210Ki.LIZJ() && getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this.LLJZIJLIL);
        }
        C723830SaL.LIZ(this, null, new AwS394S0200000_28(this, view, 39));
        int i = C2187451AjH.LIZ;
        dp();
        if (C19228210Ki.LIZJ()) {
            int iLIZIZ = C19228210Ki.LIZIZ(getContext());
            View viewSp = sp();
            if (viewSp != null) {
                ViewGroup.LayoutParams layoutParams = viewSp.getLayoutParams();
                layoutParams.height = iLIZIZ;
                C786410Ut5.W5(viewSp, layoutParams);
            }
            if (((BigCardUIFixConfig) C19228210Ki.LIZIZ.getValue()).newBackground == 1) {
                C1287400jbe c1287400jbeHp = hp();
                if (c1287400jbeHp != null) {
                    c1287400jbeHp.LIZ(EnumC1287420jbg.SpinDiffuse, null);
                    c1287400jbeHp.LIZJ();
                    c1287400jbeHp.setRenderMode(0);
                    C786410Ut5.LLLZIIL(c1287400jbeHp, 0);
                }
                C1617910sCj c1617910sCjOp = op();
                if (c1617910sCjOp != null) {
                    c1617910sCjOp.setBackground(null);
                }
                View viewEp = ep();
                if (viewEp != null) {
                    C786410Ut5.LJLLLLLL(0, viewEp);
                }
            } else {
                C1287400jbe c1287400jbeHp2 = hp();
                if (c1287400jbeHp2 != null) {
                    C786410Ut5.LLLZIIL(c1287400jbeHp2, 8);
                }
                View viewEp2 = ep();
                if (viewEp2 != null) {
                    C786410Ut5.LJLLLLLL(8, viewEp2);
                }
            }
        } else {
            C1287400jbe c1287400jbeHp3 = hp();
            if (c1287400jbeHp3 != null) {
                C786410Ut5.LLLZIIL(c1287400jbeHp3, 8);
            }
            View viewEp3 = ep();
            if (viewEp3 != null) {
                C786410Ut5.LJLLLLLL(8, viewEp3);
            }
        }
        C736680Sv4.LJIIIIZZ(this, wk(), new C2217381BqS() { // from class: X.10Kp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1713300uga) obj).LLILLL;
            }
        }, null, AFwS315S0000000_28.get$arr$(31), 6);
        lp().setListener(new InterfaceC690460R6m() { // from class: X.10Kv
            @Override // X.InterfaceC690460R6m
            public final void LIZ(float f, float f2) {
                Context context = this.LIZ.getContext();
                if (context != null) {
                    RecSwipeUserCardRootAssem recSwipeUserCardRootAssem = this.LIZ;
                    recSwipeUserCardRootAssem.wk().FQ2(context, view);
                }
            }
        });
    }

    @Override // X.InterfaceC207200166c
    public final void setEventType(String str) {
        C10L2.LIZ(this, str);
    }

    public static void cp(int i, int i2, C197039127h c197039127h) {
        int marginStart;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
        int i3 = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        Integer numValueOf = Integer.valueOf(marginStart);
        Integer numValueOf2 = Integer.valueOf(i);
        ViewGroup.LayoutParams layoutParams2 = c197039127h.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
        } else {
            marginEnd = 0;
        }
        Integer numValueOf3 = Integer.valueOf(marginEnd);
        ViewGroup.LayoutParams layoutParams3 = c197039127h.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            i3 = marginLayoutParams.bottomMargin;
        }
        C426750GoL.LJIIIZ(c197039127h, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i3), false, 16);
        ViewGroup.LayoutParams layoutParams4 = c197039127h.getLayoutParams();
        layoutParams4.height = i2;
        C786410Ut5.W5(c197039127h, layoutParams4);
    }
}
