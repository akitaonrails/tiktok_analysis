package com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist;

import X.C01GW;
import X.C104100aN;
import X.C1390130mHL;
import X.C1390410mHn;
import X.C1566140qrE;
import X.C1749280vcc;
import X.C1849960yF0;
import X.C1849980yF2;
import X.C1849990yF3;
import X.C1850010yF5;
import X.C20684815ws;
import X.C299750Boz;
import X.C305550ByL;
import X.C417100GXc;
import X.C421780GgK;
import X.C426750GoL;
import X.C451190Hmf;
import X.C451200Hmg;
import X.C452501pT;
import X.C630740Ooa;
import X.C786410Ut5;
import X.EnumC1609900rzo;
import X.EnumC1802300x08;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1749320vcg;
import X.InterfaceC494301wD;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS127S0100000_27;
import Y.ARunnableS75S0200000_6;
import Y.ARunnableS96S0200000_27;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;
import com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist.FYPPageStateImp;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class FYPPageStateImp extends PageStateCommonComponent {
    public static final /* synthetic */ int LLJL = 0;
    public final C01GW LLJJI;
    public final C01GW<C1390410mHn> LLJJIII;
    public final C01GW<C1390130mHL> LLJJIJI;
    public long LLJJIJIIJIL;
    public final C01GW<ViewGroup> LLJJIJIL;
    public final C01GW<ViewGroup> LLJJJ;
    public final C01GW<C1849960yF0> LLJJJIL;
    public boolean LLJJJJ;
    public C1849990yF3 LLJJJJJIL;
    public View LLJJJJLIIL;
    public final C1849980yF2 LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC743730TFj
    public final void L() {
        this.LLJJJJ = true;
        bp();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC743730TFj
    public final void dd() {
        this.LLJJJJ = true;
        bp();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    public static boolean cp() {
        return C305550ByL.LIZIZ("homepage_hot") && C104100aN.LIZ().LJIILIIL();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public final void Jo() {
        C1390410mHn value;
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            if (this.LLJJIII.isInitialized() && (value = this.LLJJIII.getValue()) != null) {
                C786410Ut5.LLLZZIL(value, 8);
            }
            this.LLJJJJLIIL = ap(this.LLJJIJI.getValue());
            c1749280vcc.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public final void Lo() {
        C1390130mHL value;
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            if (this.LLJJIJI.isInitialized() && (value = this.LLJJIJI.getValue()) != null) {
                C786410Ut5.LLZ(value, 8);
            }
            this.LLJJJJLIIL = ap(this.LLJJIII.getValue());
            c1749280vcc.LJ();
        }
    }

    public final EnumC1802300x08 Vo() {
        return (EnumC1802300x08) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void bp() {
        C1849960yF0 value;
        C417100GXc c417100GXc;
        C1849990yF3 c1849990yF3 = this.LLJJJJJIL;
        if (c1849990yF3 != null) {
            c1849990yF3.LIZJ = true;
            ValueAnimator valueAnimator = c1849990yF3.LIZIZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ARunnableS104S0100000_4 aRunnableS104S0100000_4 = c1849990yF3.LJ;
            if (aRunnableS104S0100000_4 != null) {
                HandlerHook.viewRemoveCallbacks(c1849990yF3.LIZ, aRunnableS104S0100000_4);
            }
            c1849990yF3.LJ = null;
        }
        this.LLJJJJJIL = null;
        View view = this.LLJJJJLIIL;
        View viewFindViewById = view != null ? view.findViewById(R.id.dts) : null;
        if ((viewFindViewById instanceof C417100GXc) && (c417100GXc = (C417100GXc) viewFindViewById) != null) {
            c417100GXc.setOnProgressChanged(null);
        }
        if (!this.LLJJJIL.isInitialized() || (value = this.LLJJJIL.getValue()) == null) {
            return;
        }
        value.LLJ = false;
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = value.LLIZLLLIL;
        if (aRunnableS127S0100000_27 != null) {
            value.LL.removeCallbacks(aRunnableS127S0100000_27);
        }
        value.LL.removeCallbacksAndMessages(null);
        value.LLIZLLLIL = null;
        value.LLILZLL.LIZLLL();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0yF2] */
    public FYPPageStateImp() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS571S0100000_27((InterfaceC1565950qqv) this, 1012), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1850010yF5(false, this));
        }
        this.LLJJI = c01gwLIZIZ;
        this.LLJJIII = C452501pT.LIZIZ(new C451190Hmf(this));
        this.LLJJIJI = C452501pT.LIZIZ(new C451200Hmg(this));
        this.LLJJIJIL = C452501pT.LIZIZ(new C421780GgK(this));
        this.LLJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 871));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1011));
        this.LLJJJJ = true;
        this.LLJJL = new InterfaceC1749320vcg() { // from class: X.0yF2
            @Override // X.InterfaceC1749320vcg
            public final void hide() {
                C1390410mHn c1390410mHn;
                View view = this.LIZ.LLJJJJLIIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(4, view);
                }
                View view2 = this.LIZ.LLJJJJLIIL;
                if (!(view2 instanceof C1390410mHn) || (c1390410mHn = (C1390410mHn) view2) == null) {
                    return;
                }
                c1390410mHn.LIZLLL();
            }

            @Override // X.InterfaceC1749320vcg
            public final void show() {
                C1390410mHn c1390410mHn;
                C417100GXc c417100GXc;
                TuxTextView tuxTextView;
                C1390410mHn c1390410mHn2;
                C417130GXf c417130GXf;
                this.LIZ.getClass();
                TuxTextView tuxTextView2 = null;
                if (FYPPageStateImp.cp()) {
                    View view = this.LIZ.LLJJJJLIIL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                    View view2 = this.LIZ.LLJJJJLIIL;
                    if (view2 == null || (c417130GXf = (C417130GXf) view2.findViewById(R.id.dts)) == null) {
                        return;
                    }
                    this.LIZ.getClass();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.3f);
                    valueAnimatorOfFloat.setDuration(4000L);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(c417130GXf, 182));
                    valueAnimatorOfFloat.start();
                    return;
                }
                if (C305550ByL.LIZIZ("homepage_hot")) {
                    FYPPageStateImp fYPPageStateImp = this.LIZ;
                    if (fYPPageStateImp.LLJJJJ) {
                        View view3 = fYPPageStateImp.LLJJJJLIIL;
                        if (view3 != null) {
                            C786410Ut5.LJLLLLLL(4, view3);
                        }
                        View view4 = this.LIZ.LLJJJJLIIL;
                        if (!(view4 instanceof C1390410mHn) || (c1390410mHn2 = (C1390410mHn) view4) == null) {
                            return;
                        }
                        c1390410mHn2.LIZLLL();
                        return;
                    }
                }
                if (this.LIZ.Vo() == EnumC1802300x08.V2) {
                    FYPPageStateImp fYPPageStateImp2 = this.LIZ;
                    fYPPageStateImp2.bp();
                    View view5 = fYPPageStateImp2.LLJJJJLIIL;
                    if (view5 != null) {
                        C786410Ut5.LJLLLLLL(0, view5);
                    }
                    View view6 = fYPPageStateImp2.LLJJJJLIIL;
                    if (view6 != null && (tuxTextView = (TuxTextView) view6.findViewById(R.id.stz)) != null) {
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                    }
                    View view7 = fYPPageStateImp2.LLJJJJLIIL;
                    if (view7 != null && (tuxTextView2 = (TuxTextView) view7.findViewById(R.id.su0)) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C814420VxA.LIZIZ(0.0f * 100));
                        sbLIZ.append('%');
                        tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    View view8 = fYPPageStateImp2.LLJJJJLIIL;
                    if (view8 == null || (c417100GXc = (C417100GXc) view8.findViewById(R.id.dts)) == null) {
                        return;
                    }
                    c417100GXc.setOnProgressChanged(new C020W(tuxTextView2, fYPPageStateImp2, 101));
                    c417100GXc.setDisplayMode(EnumC429100Gs8.PROGRESS);
                    C1849990yF3 c1849990yF3 = new C1849990yF3(c417100GXc);
                    fYPPageStateImp2.LLJJJJJIL = c1849990yF3;
                    c1849990yF3.LIZ(0.0f, 0.3f, 1500L, C1849990yF3.LJFF, new AwS571S0100000_27(c1849990yF3, 1402));
                    return;
                }
                if (this.LIZ.Vo() != EnumC1802300x08.V3) {
                    View view9 = this.LIZ.LLJJJJLIIL;
                    if (view9 != null) {
                        C786410Ut5.LJLLLLLL(0, view9);
                    }
                    View view10 = this.LIZ.LLJJJJLIIL;
                    if (!(view10 instanceof C1390410mHn) || (c1390410mHn = (C1390410mHn) view10) == null) {
                        return;
                    }
                    c1390410mHn.LIZJ();
                    return;
                }
                C1849960yF0 value = this.LIZ.LLJJJIL.getValue();
                if (value != null) {
                    int visibility = value.getVisibility();
                    value.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, value);
                    if (value.LLJ) {
                        return;
                    }
                    value.LLJ = true;
                    value.LLIZ = 0;
                    value.LLILZLL.LIZJ();
                    AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(value, 1403);
                    value.LIZLLL();
                    TuxTextView tuxTextView3 = value.LLILZIL;
                    List<String> list = value.LLILLJJLI;
                    int i = value.LLIZ;
                    tuxTextView3.setText((CharSequence) ((i < 0 || i >= list.size()) ? "" : ListProtector.get(list, i)));
                    C1849960yF0.LIZ(value.LLILLL, value.LIZIZ(28.0f));
                    C786410Ut5.LJLIIL(200L, value.LL, new ARunnableS96S0200000_27(value, awS571S0100000_27, 35));
                }
            }
        };
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1010));
    }

    public final void So() {
        bp();
        super.cn0();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void cn0() {
        C1849960yF0 value;
        if (Vo() == EnumC1802300x08.V2) {
            C1849990yF3 c1849990yF3 = this.LLJJJJJIL;
            if (c1849990yF3 != null) {
                AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 1390);
                if (!c1849990yF3.LIZLLL) {
                    c1849990yF3.LIZLLL = true;
                    c1849990yF3.LIZJ = true;
                    ValueAnimator valueAnimator = c1849990yF3.LIZIZ;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    c1849990yF3.LIZ.setProgress(1.0f);
                    ARunnableS104S0100000_4 aRunnableS104S0100000_4 = new ARunnableS104S0100000_4((Object) awS571S0100000_27, 160);
                    c1849990yF3.LJ = aRunnableS104S0100000_4;
                    HandlerHook.viewPost(c1849990yF3.LIZ, aRunnableS104S0100000_4);
                }
            } else {
                So();
            }
        } else if (Vo() == EnumC1802300x08.V3) {
            if (this.LLJJJIL.isInitialized() && (value = this.LLJJJIL.getValue()) != null) {
                value.LLJ = false;
                ARunnableS127S0100000_27 aRunnableS127S0100000_27 = value.LLIZLLLIL;
                if (aRunnableS127S0100000_27 != null) {
                    value.LL.removeCallbacks(aRunnableS127S0100000_27);
                }
                value.LL.removeCallbacksAndMessages(null);
                value.LLIZLLLIL = null;
                value.LLILZLL.LIZLLL();
            }
            super.cn0();
        } else if (cp() && this.LLJJJJ) {
            C1749280vcc c1749280vcc = this.LLJILJILJ;
            if (c1749280vcc != null) {
                HandlerHook.viewPost(c1749280vcc, new ARunnableS75S0200000_6((Object) c1749280vcc, (Object) new AwS571S0100000_27(this, 1389), 146));
            }
        } else {
            super.cn0();
        }
        this.LLJJJJ = false;
        Zo(0);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void eS() {
        super.eS();
        Zo(2);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJJJ = true;
        bp();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void tn1() {
        super.tn1();
        Zo(1);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Ys2(Exception exc) {
        Ho(EnumC1609900rzo.RECOMMEND_FEED, exc);
        IOfflineModeSwitchAbility iOfflineModeSwitchAbility = (IOfflineModeSwitchAbility) this.LLJJI.getValue();
        if (iOfflineModeSwitchAbility != null) {
            iOfflineModeSwitchAbility.rv0(this.LLJILJILJ);
        }
        Zo(1);
    }

    public final void Zo(final int i) {
        if (this.LLJJIJIIJIL <= 0) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIJIIJIL;
        C20684815ws.LJFF().submit(new Runnable() { // from class: X.0NQp
            public final void LIZ() {
                C20684815ws.LJIJ("feed_request_response", C591500NHw.LIZ(new Pair("enter_from", "loading_status_monitor"), new Pair("duration", Long.valueOf(jCurrentTimeMillis)), new Pair("network_status", Integer.valueOf(C036E.LIZ.LIZJ.getValue())), new Pair("is_success", Integer.valueOf(i))));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FYPPageStateImp@3193.monitorLoadingTime$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FYPPageStateImp@3193.monitorLoadingTime$1");
            }
        });
    }

    public final View ap(View view) {
        if (cp()) {
            return this.LLJJIJIL.getValue();
        }
        if (Vo() == EnumC1802300x08.V2) {
            return this.LLJJJ.getValue();
        }
        if (Vo() != EnumC1802300x08.V3) {
            return view;
        }
        return this.LLJJJIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void t4(boolean z) {
        super.t4(z);
        this.LLJJIJIIJIL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        super.LLZLLLL(view, bundle);
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            c1749280vcc.LIZ(this.LLJJL);
        }
        if (C305550ByL.LIZJ() || Vo() != EnumC1802300x08.NONE) {
            C1749280vcc c1749280vcc2 = this.LLJILJILJ;
            if (c1749280vcc2 != null) {
                c1749280vcc2.setLayoutVariant(1);
            }
            C1749280vcc c1749280vcc3 = this.LLJILJILJ;
            if (c1749280vcc3 != null) {
                C426750GoL.LJIIIZ(c1749280vcc3, 0, 0, 0, 0, false, 16);
            }
        }
    }

    public final void Oo(int i, int i2, View view) {
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            view.setId(R.id.z1_);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
            layoutParams.gravity = 17;
            C786410Ut5.W5(view, layoutParams);
            if (view.getParent() == null) {
                c1749280vcc.addView(view);
            }
        }
    }
}
