package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1129900fVc;
import X.C1133630fbd;
import X.C1146120fvm;
import X.C1146240fvy;
import X.C1146350fw9;
import X.C1146440fwI;
import X.C1146540fwS;
import X.C1146560fwU;
import X.C1146570fwV;
import X.C1151490g4R;
import X.C1151500g4S;
import X.C13BV;
import X.C13LE;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C16FZ;
import X.C19719912Dl;
import X.C19EG;
import X.C1EOY;
import X.C20600815jK;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C262100zr;
import X.C452501pT;
import X.C459880I1q;
import X.C520010KaN;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C772770UTb;
import X.C786410Ut5;
import X.InterfaceC1141530foN;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1151700g4m;
import Y.ACListenerS152S0100000_17;
import Y.ARunnableS86S0200000_17;
import Y.AsS44S0100000_17;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.GiftAnchorPanelCenterViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.list.AnchorActivityCell;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.list.AnchorGiftCell;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelGiftPageCenterAssem extends UISlotAssem implements InterfaceC1141530foN, IGiftAnchorPanelGiftPageScrollAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1146120fvm.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C1129900fVc LLJJIJIL;
    public C16FZ LLJJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftAnchorPanelGiftPageCenterAssem.class, "panelCenterVM", "getPanelCenterVM()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/GiftAnchorPanelCenterViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GiftAnchorPanelGiftPageCenterAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/gift/center/GiftAnchorPanelGiftPageCenterViewModel;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public GiftAnchorPanelGiftPageCenterAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftAnchorPanelCenterViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS561S0100000_17(c19719912DlLIZ, 149), AFwS254S0000000_17.get$arr$(52), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GiftAnchorPanelGiftPageCenterViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS561S0100000_17(c19719912DlLIZ2, 150), AFwS254S0000000_17.get$arr$(53), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(42));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gx_;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1325896418) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.IGiftAnchorPanelGiftPageScrollAbility
    public final C1146570fwV Na2() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJIL;
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv != null ? viewOnAttachStateChangeListenerC20604515jv.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof GridLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return new C1146570fwV(0, 0);
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0) {
            iFindFirstVisibleItemPosition = 0;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        return new C1146570fwV(iFindFirstVisibleItemPosition, viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0);
    }

    public final C1146120fvm hp() {
        return (C1146120fvm) this.LLJJI.getValue();
    }

    public final GiftAnchorPanelGiftPageCenterViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (GiftAnchorPanelGiftPageCenterViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("gift_clicked_by_creator", this);
        C1548820qPI.LJIIIIZZ("creator_banner_loaded", this);
        C1548820qPI.LJIIIIZZ("live_update_creator_gift_panel_item", this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void kp(String str) {
        LinearLayoutManager linearLayoutManager;
        List<InterfaceC1891350zJl> listLJII;
        C20600815jK<InterfaceC1891350zJl> state;
        C1146350fw9 c1146350fw9LIZIZ = C1146440fwI.LIZIZ(ip().getState().LLILLJJLI);
        if (c1146350fw9LIZIZ != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJIL;
            RecyclerView.LayoutManager layoutManager = null;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            }
            if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                C1133630fbd c1133630fbd = hp().LLILZIL;
                String str2 = hp().LLILLL;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJJIL;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                    listLJII = state.LJII();
                } else {
                    listLJII = C13BV.INSTANCE;
                }
                Long lValueOf = Long.valueOf(c1146350fw9LIZIZ.LL);
                c1133630fbd.getClass();
                C1133630fbd.LIZ(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition, lValueOf, str2, str, listLJII);
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (this.LLILZ && C459880I1q.LIZ(this) && getContext() != null) {
            C1146350fw9 c1146350fw9LIZ = C1146540fwS.LIZ(ip().getState().LLILLJJLI, c262100zr);
            if (c1146350fw9LIZ != null && C1146560fwU.LIZ(c1146350fw9LIZ, getContext())) {
                return;
            }
            ip().AQ2(c262100zr);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewTreeObserver viewTreeObserver;
        super.onViewCreated(view);
        ip().LLILZIL = this;
        this.LLJJIJIL = (C1129900fVc) view.findViewById(R.id.hbn);
        this.LLJJJ = (C16FZ) view.findViewById(R.id.nnp);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.izo);
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setEdgeEffectFactory(new C1146240fvy());
            IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
            if (iHostCreativeTool != null && iHostCreativeTool.UC0()) {
                viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            }
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        this.LLJJJIL = viewOnAttachStateChangeListenerC20604515jv;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4, 1, view.getContext(), false);
        gridLayoutManager.LLIZ = new C1151490g4R(this, 0);
        C1151500g4S c1151500g4S = new C1151500g4S(this, 0);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv2.setHasFixedSize(true);
            viewOnAttachStateChangeListenerC20604515jv2.setClipChildren(false);
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(gridLayoutManager);
            viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(c1151500g4S);
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(AnchorActivityCell.class, AnchorGiftCell.class);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(new C772770UTb(C1EOY.LIZ.LIZIZ("anchor_panel_gift_slide"), c19egLIZ.getWindow()));
            }
        }
        C1129900fVc c1129900fVc = this.LLJJIJIL;
        if (c1129900fVc != null) {
            C786410Ut5.h8(c1129900fVc.LL, new ACListenerS152S0100000_17(new AwS561S0100000_17(this, 147), 165));
        }
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0fwQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1146210fvv) obj).LLILLJJLI;
            }
        }, null, new AwS631S0100000_17(this, 10), 6);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0fwX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1146530fwR) obj).LL;
            }
        }, this, null, new AwS596S0100000_17(this, 129), new AwS561S0100000_17(this, 148), new AwS596S0100000_17(this, 130), 4, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0fwW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1146530fwR) obj).LLILLJJLI;
            }
        }, null, new AwS631S0100000_17(this, 9), 6);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null && (viewTreeObserver = viewOnAttachStateChangeListenerC20604515jv3.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m = new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1151700g4m, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.addOnScrollListener(new AsS44S0100000_17(this, 2));
        }
        C1548820qPI.LIZLLL("gift_clicked_by_creator", this);
        C1548820qPI.LIZLLL("creator_banner_loaded", this);
        C1548820qPI.LIZLLL("live_update_creator_gift_panel_item", this);
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.IGiftAnchorPanelGiftPageScrollAbility
    public final void sE2(C1146570fwV c1146570fwV) {
        LinearLayoutManager linearLayoutManager;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJIL;
        RecyclerView.LayoutManager layoutManager = null;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        }
        if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.scrollToPositionWithOffset(c1146570fwV.LIZ, c1146570fwV.LIZIZ);
        }
    }

    public final void lp(int i, Function0<Unit> function0) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJIL;
        RecyclerView.LayoutManager layoutManager = null;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        }
        if ((layoutManager instanceof GridLayoutManager) && layoutManager != null) {
            C1133630fbd c1133630fbd = hp().LLILZIL;
            c1133630fbd.getClass();
            c1133630fbd.LJIIJJI = System.currentTimeMillis();
            layoutManager.scrollToPosition(i);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv2, new ARunnableS86S0200000_17(this, function0, 22));
            }
        }
    }
}
