package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui;

import X.AbstractC329610Cw3;
import X.AbstractC345490DgZ;
import X.C019F;
import X.C01GW;
import X.C061J;
import X.C06LK;
import X.C0KFD;
import X.C1196320hEk;
import X.C13LE;
import X.C1483380ohk;
import X.C1509305vX;
import X.C1555960qao;
import X.C1557230qcr;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C1579030rC1;
import X.C1637806bA;
import X.C1776320wKE;
import X.C1856320yPG;
import X.C1864520ycU;
import X.C1864530ycV;
import X.C18WK;
import X.C18YL;
import X.C19719912Dl;
import X.C21300318Xh;
import X.C21673919s1;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C789260Uxg;
import X.C814420VxA;
import X.C912900Zrc;
import X.EnumC1562950qm5;
import X.EnumC1779090wOh;
import X.EnumC904370Zdr;
import X.EnumC912790ZrR;
import X.InterfaceC1249220ic4;
import X.InterfaceC1554640qYg;
import X.InterfaceC1616630sAf;
import X.InterfaceC21300418Xi;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnPreDrawListenerC1864760ycs;
import Y.ARunnableS127S0100000_27;
import Y.ARunnableS32S0201000_27;
import Y.AsS53S0100000_27;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics;
import com.ss.android.ugc.aweme.tablet.api.ITabletService;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS17S0300100_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class DetailMediaGridContentAssem extends UISlotAssem implements MediaGridCellLongPressAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public final C01GW LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final IIMMediaGridAnalytics LLJJJJ;
    public final IIMMediaGridPerformanceAnalytics LLJJJJJIL;
    public final C1776320wKE LLJJJJLIIL;
    public final C01GW LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final ViewTreeObserverOnPreDrawListenerC1864760ycs LLJLILLLLZIIL;
    public final ViewTreeObserverOnPreDrawListenerC1864760ycs LLJLL;
    public final C01GW LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DetailMediaGridContentAssem.class, "mediaGridVM", "getMediaGridVM()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/MediaGridViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DetailMediaGridContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MediaGridViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS571S0100000_27(c19719912DlLIZ, 292), AFwS269S0000000_27.get$arr$(66), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C061J.class, null), checkSupervisorPrepared());
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 291));
        this.LLJJJJ = (IIMMediaGridAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMediaGridAnalytics.class);
        this.LLJJJJJIL = (IIMMediaGridPerformanceAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMediaGridPerformanceAnalytics.class);
        this.LLJJJJLIIL = new C1776320wKE(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        this.LLJJL = C1509305vX.LIZ(new AwS571S0100000_27(this, 290));
        this.LLJLILLLLZIIL = new ViewTreeObserverOnPreDrawListenerC1864760ycs(this, 2);
        this.LLJLL = new ViewTreeObserverOnPreDrawListenerC1864760ycs(this, 1);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 289));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cnz;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1513344352) {
            return null;
        }
        return this;
    }

    public final EnumC904370Zdr hp() {
        EnumC904370Zdr enumC904370Zdr;
        C061J c061j = (C061J) this.LLJJIII.getValue();
        return (c061j == null || (enumC904370Zdr = c061j.LL) == null) ? EnumC904370Zdr.SHARED_VIDEOS : enumC904370Zdr;
    }

    public final MediaGridViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (MediaGridViewModel) assemVMLazy.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv kp() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJI.getValue();
    }

    public final int lp() {
        InterfaceC1616630sAf interfaceC1616630sAfLIZLLL;
        InterfaceC1249220ic4 interfaceC1249220ic4LJI;
        C1483380ohk.LIZ.getClass();
        ITabletService iTabletService = C1483380ohk.LIZIZ;
        return (iTabletService == null || (interfaceC1616630sAfLIZLLL = iTabletService.LIZLLL()) == null || (interfaceC1249220ic4LJI = interfaceC1616630sAfLIZLLL.LJI()) == null) ? this.LLJJJJLIIL.LIZ : interfaceC1249220ic4LJI.LLLIZZ(this.LLJJJJLIIL.LIZ, 0);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C786410Ut5.D3(getContentView().getViewTreeObserver(), this.LLJLILLLLZIIL);
        C786410Ut5.D3(getContentView().getViewTreeObserver(), this.LLJLL);
        kp().clearOnScrollListeners();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AbstractC329610Cw3<?> abstractC329610Cw3;
        super.onViewCreated(view);
        kp().LJIILJJIL(DetailMediaCell.class, DetailEmptyStatusCell.class);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvKp = kp();
        final Context context = view.getContext();
        final int i = this.LLJJJJLIIL.LIZ;
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(context, i) { // from class: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridContentAssem$setupPowerList$1
            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                super.onLayoutCompleted(c21673919s1);
                DetailMediaGridContentAssem detailMediaGridContentAssem = this.LLJI;
                if (detailMediaGridContentAssem.LLJJJIL) {
                    HandlerHook.viewPost(detailMediaGridContentAssem.kp(), new ARunnableS127S0100000_27(this.LLJI, 18));
                    this.LLJI.LLJJJIL = false;
                }
            }
        };
        wrapGridLayoutManager.LLIZ = new C1864520ycU(this, wrapGridLayoutManager, 0);
        viewOnAttachStateChangeListenerC20604515jvKp.setLayoutManager(wrapGridLayoutManager);
        kp().addItemDecoration(new C1864530ycV(this, 7));
        C1196320hEk.LIZIZ(kp(), C1558520qew.LJIIL(this));
        kp().addOnItemTouchListener(new C0KFD() { // from class: X.0yPE
            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                if (((C21300318Xh) this.LL.LLJJL.getValue()).isShowing()) {
                    return true;
                }
                if (motionEvent.getActionMasked() == 0 && recyclerView.getScrollState() == 2) {
                    recyclerView.stopScroll();
                    return false;
                }
                return false;
            }
        });
        kp().addOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLJLLIL.getValue());
        kp().setItemAnimator(null);
        C786410Ut5.y3(getContentView().getViewTreeObserver(), this.LLJLILLLLZIIL);
        C786410Ut5.y3(getContentView().getViewTreeObserver(), this.LLJLL);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0ZUF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZUE) obj).LLILLJJLI;
            }
        }, null, new AwS641S0100000_27(this, 99), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0ZUG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZUE) obj).LLILLL;
            }
        }, null, new AwS641S0100000_27(this, 100), 6);
        if (C06LK.LIZ[hp().ordinal()] == 1) {
            abstractC329610Cw3 = (AbstractC329610Cw3) ip().LLIZ.getValue();
        } else {
            abstractC329610Cw3 = (AbstractC329610Cw3) ip().LLIZLLLIL.getValue();
        }
        kp().LJIIL(abstractC329610Cw3);
        kp().addOnScrollListener(new AsS53S0100000_27(this, 6));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.MediaGridCellLongPressAbility
    public final boolean Vj1(long j, View view) {
        if (view == null) {
            return false;
        }
        if (((C21300318Xh) this.LLJJL.getValue()).isShowing()) {
            return true;
        }
        C21300318Xh c21300318Xh = (C21300318Xh) this.LLJJL.getValue();
        C18YL c18yl = new C18YL(new C789260Uxg(view, new AwS568S0100000_24(view, 645)), EnumC912790ZrR.MIDDLE, new C18WK(), true);
        Context context = view.getContext();
        ((InterfaceC21300418Xi) c21300318Xh.LJFF.getValue()).LIZJ(c18yl, new C912900Zrc(Collections.singletonList(new C1562980qm8("Show in chat", EnumC1779090wOh.SHOW_IN_CHAT, C1557230qcr.LIZ, new C1555960qao(context.getString(2131832156)), EnumC1562950qm5.PRIMARY, new C1579030rC1(), false, new AwS17S0300100_27(this, c21300318Xh, view, j, 0)))), C1856320yPG.LIZ);
        return true;
    }

    public final void mp(List<? extends AbstractC345490DgZ> list, EnumC904370Zdr enumC904370Zdr) {
        if (!list.isEmpty()) {
            if (!this.LLJLIL) {
                this.LLJLIL = true;
                String strXQ2 = ip().xQ2();
                if (strXQ2 != null) {
                    EnumC904370Zdr enumC904370ZdrHp = hp();
                    IIMMediaGridPerformanceAnalytics iIMMediaGridPerformanceAnalytics = this.LLJJJJJIL;
                    if (iIMMediaGridPerformanceAnalytics != null) {
                        iIMMediaGridPerformanceAnalytics.LIZJ(strXQ2, enumC904370ZdrHp);
                    }
                }
            }
            this.LLJJLIIIJLLLLLLLZ = true;
        }
        kp().getState().LJIILL(list, new ARunnableS32S0201000_27(((LinearLayoutManager) kp().getLayoutManager()).findFirstVisibleItemPosition(), this, enumC904370Zdr, 3));
    }
}
