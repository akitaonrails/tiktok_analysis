package com.ss.android.ugc.aweme.stemfeed.ui;

import X.C019F;
import X.C1156590gCf;
import X.C13LE;
import X.C1440005kM;
import X.C14LC;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1568310quj;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C20684815ws;
import X.C21387918mz;
import X.C21388418n4;
import X.C2217381BqS;
import X.C309690CBz;
import X.C418440Gaw;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS124S0100000_24;
import Y.ATListenerS456S0100000_24;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.stemfeed.panel.StemFeedFragmentPanel;
import com.ss.android.ugc.aweme.stemfeed.vm.StemFeedListViewModel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StemFeedToFYPAssem extends UISlotAssem implements IStemToFYPAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final AssemVMLazy LLJJI;
    public boolean LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public StemFeedFragmentPanel LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public int LLJJJIL;
    public C197039127h LLJJJJ;
    public TuxTextView LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StemFeedToFYPAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/stemfeed/vm/StemFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StemFeedToFYPAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StemFeedListViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1156), AFwS264S0000000_24.get$arr$(391), null, true);
        this.LLJJIJI = new C1559260qg8(new C723590SZx(this, C1156590gCf.class, null), checkSupervisorPrepared());
        this.LLJJJIL = 10;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fa_;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1715472472) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemToFYPAssemAbility
    public final void L3() {
        ILoadMoreAbility iLoadMoreAbility;
        if (this.LLILZ && this.LLJJIII) {
            StemFeedFragmentPanel stemFeedFragmentPanel = this.LLJJIJIIJIL;
            if (stemFeedFragmentPanel != null && (iLoadMoreAbility = stemFeedFragmentPanel.LLILZLL) != null) {
                iLoadMoreAbility.g82(false);
            }
            this.LLJJIII = false;
            StemFeedFragmentPanel stemFeedFragmentPanel2 = this.LLJJIJIIJIL;
            C1440005kM.LIZ(new C1568310quj(1, stemFeedFragmentPanel2 != null ? stemFeedFragmentPanel2.LJIIIIZZ() : null, this.LLJJIJIIJIL, Boolean.TRUE));
            TuxTextView tuxTextView = this.LLJJJJJIL;
            if (tuxTextView != null) {
                tuxTextView.animate().setInterpolator(new C21387918mz()).translationYBy(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))).setDuration(200L).start();
            }
            C197039127h c197039127h = this.LLJJJJ;
            if (c197039127h != null) {
                c197039127h.animate().setInterpolator(new C21387918mz()).translationYBy(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))).setDuration(200L).start();
            }
            LJJIJL().animate().setInterpolator(new C21388418n4()).alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS124S0100000_24(this, 71)).start();
            HandlerHook.viewPostDelay(LJJIJL(), new Runnable() { // from class: X.0qtZ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("StemFeedToFYPAssem@a559.dismissGuide$4");
                    try {
                        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
                        if (c1576740r8KLIZ != null) {
                            c1576740r8KLIZ.LJIIIIZZ(false);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("StemFeedToFYPAssem@a559.dismissGuide$4");
                }
            }, 200L);
        }
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemToFYPAssemAbility
    public final boolean pb() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return ((Boolean) withState(assemVMLazy.getValue(), new AwS603S0100000_24(this, 294))).booleanValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemToFYPAssemAbility
    public final boolean LLLLII() {
        return this.LLJJIII;
    }

    public final void hp(String str) {
        C20684815ws.LJIJI("homepage_return_guide", new Pair("homepage_topic_stem", "enter_from"), new Pair(str, "action_type"));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int scaledTouchSlop;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!(LJJIJL() instanceof FrameLayout)) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        } else {
            scaledTouchSlop = 10;
        }
        this.LLJJJIL = scaledTouchSlop;
        this.LLJJIJIIJIL = ((C1156590gCf) this.LLJJIJI.getValue()).LL;
        LJJIJL().setOnTouchListener(new ATListenerS456S0100000_24(this, 7));
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.cnc);
        C786410Ut5.U8(c197039127h, new ACListenerS158S0100000_24(this, 88));
        ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
        if (layoutParams != null) {
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                boolean z = C14LC.LJIIIZ;
                C309690CBz.LIZ.getClass();
                marginLayoutParams.bottomMargin = C14LC.LIZIZ() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
            }
        } else {
            layoutParams = null;
        }
        C786410Ut5.J6(c197039127h, layoutParams);
        this.LLJJJJ = c197039127h;
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.foa);
        View viewFindViewById = view.findViewById(R.id.dwd);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setColors(new int[]{0, -16777216});
            viewFindViewById.setBackground(gradientDrawable);
        }
    }
}
