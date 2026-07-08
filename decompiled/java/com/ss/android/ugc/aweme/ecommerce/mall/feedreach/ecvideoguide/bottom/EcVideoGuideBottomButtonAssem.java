package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.bottom;

import X.C01GW;
import X.C098200Yq;
import X.C09A1;
import X.C0PEM;
import X.C123100dR;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1637806bA;
import X.C1769340w8y;
import X.C1769480w9C;
import X.C1769630w9R;
import X.C1770090wAB;
import X.C1770110wAD;
import X.C189200o6;
import X.C19719912Dl;
import X.C1AF0;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2296908zH;
import X.C23118094a;
import X.C23119094b;
import X.C300590BqL;
import X.C452501pT;
import X.C708530Rql;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C7879035x;
import X.EnumC452301pR;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.IVideoGuideService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes27.dex */
public final class EcVideoGuideBottomButtonAssem extends BaseCellSlotComponent<EcVideoGuideBottomButtonAssem> implements InterfaceC497601wk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public CoroutineContext LLJLLIL;
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS268S0000000_26.get$arr$(271));
    public final InterfaceC1731706qJ LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public C1770110wAD LLLF;
    public FrameLayout LLLFF;
    public TuxTextView LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcVideoGuideBottomButtonAssem.class, "videoGuideVM", "getVideoGuideVM()Lcom/ss/android/ugc/aweme/ecommerce/mall/feedreach/ecvideoguide/EcVideoGuideVM;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EcVideoGuideBottomButtonAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcVideoGuideVM.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 334), null, AFwS268S0000000_26.get$arr$(270));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(EcVideoGuideBottomContentionVM.class), AFwS268S0000000_26.get$arr$(272));
        this.LLL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS215S0000000_26.get$arr$(163));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ayq;
    }

    public final FrameLayout Ep() {
        View viewFindViewById = this.LLLFF;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v8h) : null;
            this.LLLFF = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final EcVideoGuideVM Fp() {
        return (EcVideoGuideVM) this.LLJZ.getValue(this, LLLFZ[0]);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContext = this.LLJLLIL;
        if (coroutineContext != null && C23118094a.LJIIIIZZ(coroutineContext)) {
            return coroutineContext;
        }
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        CoroutineContext coroutineContextLIZLLL = C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII());
        this.LLJLLIL = coroutineContextLIZLLL;
        return coroutineContextLIZLLL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        CoroutineContext coroutineContext = this.LLJLLIL;
        if (coroutineContext != null) {
            C23118094a.LIZJ(coroutineContext, null);
        }
        Fp().LL = "";
        Gp(this);
        this.LLLF = null;
    }

    public final EcVideoGuideBottomButtonAbility Bp() {
        return (EcVideoGuideBottomButtonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), EcVideoGuideBottomButtonAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        Gp(this);
    }

    public static void Gp(EcVideoGuideBottomButtonAssem ecVideoGuideBottomButtonAssem) {
        Unit unit = null;
        if (C7879035x.LIZLLL()) {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            if (eventBusLIZLLL.LJIIJ(ecVideoGuideBottomButtonAssem)) {
                eventBusLIZLLL.LJJI(ecVideoGuideBottomButtonAssem);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return;
        }
        try {
            EventBus eventBusLIZLLL2 = EventBus.LIZLLL();
            if (eventBusLIZLLL2.LJIIJ(ecVideoGuideBottomButtonAssem)) {
                eventBusLIZLLL2.LJJI(ecVideoGuideBottomButtonAssem);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @C14EU(sticky = false, threadMode = ThreadMode.MAIN)
    public final void onAnchorPanelAction(C1769480w9C c1769480w9C) {
        Object obj;
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
        if (iECommerceAnchorService != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (iECommerceAnchorService.LJJJJZ(((VideoItemParams) obj).getAweme()) && C300590BqL.LIZ() && !Intrinsics.LJFF(c1769480w9C.LIZ.LIZJ, Boolean.TRUE)) {
                String str = c1769480w9C.LIZ.LIZ;
                if (C123100dR.LIZ(str) && Intrinsics.LJFF(str, Fp().LL)) {
                    int i = C1769340w8y.LIZ[c1769480w9C.LIZIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            Fp().xQ2(c1769480w9C.LIZ);
                            return;
                        }
                        return;
                    }
                    Fp().yQ2(c1769480w9C.LIZ);
                }
            }
        }
    }

    @C14EU(sticky = false, threadMode = ThreadMode.MAIN)
    public final void onEcOrderSubmitEvent(C1769630w9R c1769630w9R) {
        Object obj;
        C1770090wAB c1770090wAB;
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
        Object obj2 = null;
        if (iECommerceAnchorService != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (iECommerceAnchorService.LJJJJZ(((VideoItemParams) obj).getAweme()) && C300590BqL.LIZ()) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                if (!((VideoItemParams) obj2).getAweme().isAd() && (c1770090wAB = Fp().LLJ) != null && c1770090wAB.LJ) {
                    C1770090wAB c1770090wAB2 = Fp().LLJ;
                    if (c1770090wAB2 != null) {
                        c1770090wAB2.LJFF = true;
                    }
                    ((IVideoGuideService) ServiceManager.get().getService(IVideoGuideService.class)).LIZ(false);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        EcVideoGuideVM ecVideoGuideVMFp = Fp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        ecVideoGuideVMFp.LL = ((VideoItemParams) obj).getAweme().getAid();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0NzV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILLL;
            }
        }, null, new AwS623S0100000_9(this, 221), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nl6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILZ;
            }
        }, null, new AwS640S0100000_26(this, 155), 6);
        AssemViewModel.asyncSubscribe$default(Fp(), new C2217381BqS() { // from class: X.0wAJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1158840gGI) obj2).LL;
            }
        }, this, null, null, null, new AwS605S0100000_26(this, 780), 28, null);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJZIJLIL.getValue();
        subscribe(assemViewModel, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, AFwS313S0000000_26.get$arr$(44));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        int i = EcVideoGuideBottomButtonComponent.LLJLIL;
        return C708530Rql.LIZ(videoItemParams.getAweme());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Fp().LL = videoItemParams.getAweme().getAid();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
