package com.ss.android.ugc.feed.platform.panel.digg;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0RAS;
import X.C0RLJ;
import X.C0SYN;
import X.C0SZ8;
import X.C0T01;
import X.C0XPD;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1022620cia;
import X.C1388190mED;
import X.C1389300mG0;
import X.C1440005kM;
import X.C14EU;
import X.C1558420qem;
import X.C1558520qew;
import X.C1575380r68;
import X.C1578630rBN;
import X.C1602160rnK;
import X.C16F4;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2214851BmN;
import X.C2487409ou;
import X.C259800zU;
import X.C313310CPx;
import X.C452501pT;
import X.C582330Msh;
import X.C586100Mym;
import X.C627150Oin;
import X.C714490S0x;
import X.C718510SGj;
import X.C729510SjV;
import X.C730120SkU;
import X.C734300SrE;
import X.C734310SrF;
import X.C734330SrH;
import X.C734340SrI;
import X.C734350SrJ;
import X.C734390SrN;
import X.C735370Ssx;
import X.C737010Svb;
import X.C737030Svd;
import X.C739240SzC;
import X.C740370T2l;
import X.C740490T2x;
import X.C786410Ut5;
import X.EnumC730430Skz;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC689860R4e;
import X.InterfaceC713360RyY;
import X.InterfaceC743730TFj;
import X.InterfaceC849390XTt;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS11S1300000_11;
import Y.ARunnableS80S0200000_11;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PanelDoubleTapInterceptAbility;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS109S0400000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public final class DiggPanelComponent extends BasePanelUIComponent implements IDiggComponentAbility, InterfaceC743730TFj, InterfaceC1554640qYg {
    public static final Keva LLJJJ = Keva.getRepo("BaseListFragmentPanel");
    public C16F4 LLJJ;
    public boolean LLJJIII;
    public BPEAHandler LLJJIJI;
    public ARunnableS11S1300000_11 LLJJIJIIJIL;
    public ARunnableS111S0100000_11 LLJJIJIL;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C734310SrF(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C734300SrE(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C734350SrJ(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C734340SrI(this));
    public final C01GW LLJJI = C452501pT.LIZIZ(new C734330SrH());

    @Override // X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
    }

    @Override // X.InterfaceC743730TFj
    public final void L() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M1(Configuration configuration) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Mf(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Re(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Tg() {
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
    }

    @Override // X.InterfaceC743730TFj
    public final void dd() {
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1969856132) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
    }

    public final IViewPagerComponentAbility Mb() {
        return (IViewPagerComponentAbility) this.LLJILLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        BPEAHandler bPEAHandler;
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LLJJIJIL;
        if (aRunnableS111S0100000_11 != null && (bPEAHandler = this.LLJJIJI) != null) {
            bPEAHandler.removeCallbacks(aRunnableS111S0100000_11);
        }
        this.LLJJIJI = null;
        this.LLJJIJIL = null;
        this.LLJJIJIIJIL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        BPEAHandler bPEAHandler;
        super.onPause();
        ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LLJJIJIL;
        if (aRunnableS111S0100000_11 == null || (bPEAHandler = this.LLJJIJI) == null) {
            return;
        }
        bPEAHandler.removeCallbacks(aRunnableS111S0100000_11);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        BPEAHandler bPEAHandler;
        super.onResume();
        if (this.LLJJIJIIJIL != null) {
            if (this.LLJJIJI == null) {
                this.LLJJIJI = new BPEAHandler();
            }
            if (this.LLJJIJIL == null) {
                this.LLJJIJIL = new ARunnableS111S0100000_11(this, 93);
            }
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LLJJIJIL;
            if (aRunnableS111S0100000_11 == null || (bPEAHandler = this.LLJJIJI) == null) {
                return;
            }
            C786410Ut5.LJLIIL(500L, bPEAHandler, aRunnableS111S0100000_11);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.digg.IDiggComponentAbility
    public final C16F4 xQ() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.digg.IDiggComponentAbility
    public final void RN1(C1575380r68 c1575380r68) {
        C16F4 c16f4 = this.LLJJ;
        if (c16f4 != null) {
            c16f4.setDiggAnimationListener(c1575380r68);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, com.ss.android.ugc.aweme.feed.model.Aweme] */
    @Override // com.ss.android.ugc.feed.platform.panel.digg.IDiggComponentAbility
    public final void handleDoubleClick(final MotionEvent motionEvent) {
        final C0SZ8 c0sz8FR;
        InterfaceC494301wD interfaceC494301wDLIZ;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        Activity activityLIZ;
        String aid;
        String authorUid;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8FR2;
        Aweme aweme;
        if (!Intrinsics.LJFF(C1389300mG0.LIZLLL(getPanelContext()), "from_duet_mode") && !Intrinsics.LJFF(C1389300mG0.LIZLLL(getPanelContext()), "from_duet_mode_detail")) {
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 != null && c2189821An6.isFromEffectDiscoverTab()) {
                return;
            }
            C2189821An6 c2189821An62 = getPanelContext().LIZJ;
            if ((c2189821An62 != null && c2189821An62.isFromEffectDiscoverPanel()) || Intrinsics.LJFF(C1389300mG0.LIZLLL(getPanelContext()), "from_paid_collection")) {
                return;
            }
            InteractAreaComponent.LLLLLLLLL.getClass();
            if (!InteractAreaComponent.LLLLLLLZIL.getValue().contains(C1389300mG0.LIZLLL(getPanelContext())) || ((iViewPagerComponentAbilityMb = Mb()) != null && (c0sz8FR2 = iViewPagerComponentAbilityMb.FR()) != null && (aweme = c0sz8FR2.getAweme()) != null && C718510SGj.LJ(aweme))) {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJILJIL.getValue();
                if ((iFeedPanelPlatformAbility != null && iFeedPanelPlatformAbility.Ni2()) || this.LLJJIII) {
                    return;
                }
                C2189821An6 c2189821An63 = getPanelContext().LIZJ;
                if (c2189821An63 != null && c2189821An63.isVideoFromDcd()) {
                    return;
                }
                IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = Mb();
                String aid2 = null;
                if (iViewPagerComponentAbilityMb2 == null || (c0sz8FR = iViewPagerComponentAbilityMb2.FR()) == null) {
                    return;
                }
                if (!(c0sz8FR instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8FR) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, PanelDoubleTapInterceptAbility.class, null)) == null) {
                    C0SZ8 c0sz8LLJLLL = c0sz8FR.LLJLLL();
                    if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                        interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, PanelDoubleTapInterceptAbility.class, null);
                    } else {
                        interfaceC494301wDLIZ = null;
                    }
                }
                PanelDoubleTapInterceptAbility panelDoubleTapInterceptAbility = (PanelDoubleTapInterceptAbility) interfaceC494301wDLIZ;
                if (panelDoubleTapInterceptAbility != null && panelDoubleTapInterceptAbility.Ac()) {
                    return;
                }
                final C259800zU c259800zU = new C259800zU();
                ?? aweme2 = c0sz8FR.getAweme();
                c259800zU.element = aweme2;
                if (C729510SjV.LJJIIZ(aweme2)) {
                    Aweme awemeLJIIIIZZ = c0sz8FR.LJIIIIZZ();
                    T tLJFF = awemeLJIIIIZZ;
                    if (awemeLJIIIIZZ == null) {
                        tLJFF = C729510SjV.LJFF((Aweme) c259800zU.element);
                    }
                    c259800zU.element = tLJFF;
                }
                C16F4 c16f4 = this.LLJJ;
                if (c16f4 != null) {
                    int visibility = c16f4.getVisibility();
                    c16f4.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c16f4);
                }
                C16F4 c16f42 = this.LLJJ;
                if (c16f42 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16f42);
                    c16f42.setTranslationY(0.0f);
                }
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    Context context = getContext();
                    if (context != null) {
                        activityLIZ = C1388190mED.LIZ(context);
                    } else {
                        activityLIZ = null;
                    }
                    String strLIZ = C1389300mG0.LIZ(getPanelContext());
                    C627150Oin c627150Oin = new C627150Oin();
                    Aweme aweme3 = (Aweme) c259800zU.element;
                    if (aweme3 != null) {
                        aid = aweme3.getAid();
                    } else {
                        aid = null;
                    }
                    C786410Ut5.LJJJI("group_id", aid, c627150Oin.LIZ);
                    Aweme aweme4 = (Aweme) c259800zU.element;
                    if (aweme4 != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme4);
                    } else {
                        authorUid = null;
                    }
                    C786410Ut5.LJJJI("author_id", authorUid, c627150Oin.LIZ);
                    Aweme aweme5 = (Aweme) c259800zU.element;
                    if (aweme5 != null) {
                        aid2 = aweme5.getAid();
                    }
                    C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid2), c627150Oin.LIZ);
                    C0XPD.LIZIZ(activityLIZ, strLIZ, "click_double_like", c627150Oin.LIZ, new InterfaceC849390XTt() { // from class: X.0SrD
                        @Override // X.InterfaceC849390XTt
                        public final /* synthetic */ void LIZIZ() {
                        }

                        @Override // X.InterfaceC849390XTt
                        public final void LIZ() {
                            this.LIZ.Go(motionEvent, c0sz8FR, c259800zU.element);
                        }
                    });
                    return;
                }
                Go(motionEvent, c0sz8FR, (Aweme) c259800zU.element);
            }
        }
    }

    @C14EU
    public final void onDiggLocalEvent(C586100Mym c586100Mym) {
        C0SZ8 c0sz8LJLIL;
        VideoDiggVM videoDiggVMLIZIZ;
        VideoItemParams item;
        Aweme aweme;
        Aweme aweme2;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        String aid = null;
        if (iViewPagerComponentAbilityMb != null && (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) != null && (videoDiggVMLIZIZ = C0RLJ.LIZIZ(c0sz8LJLIL)) != null && (item = videoDiggVMLIZIZ.getItem()) != null && (aweme = item.getAweme()) != null && C1017070cZd.LJZ(aweme)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("curAweme aid: ");
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(" event aid:");
            Aweme aweme3 = c586100Mym.LIZ;
            if (aweme3 != null) {
                aid = aweme3.getAid();
            }
            sbLIZ.append(aid);
            C1022620cia.LIZ("DiggPanelComponent", C2188811AlT.LIZIZ(sbLIZ));
            if (!c586100Mym.LIZIZ && (aweme2 = c586100Mym.LIZ) != null && TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                C734390SrN c734390SrN = C734390SrN.LIZ;
                Context context = getContext();
                AwS109S0400000_11 awS109S0400000_11 = new AwS109S0400000_11(aweme, item, this, c586100Mym, 4);
                c734390SrN.getClass();
                C734390SrN.LJ(context, aweme, awS109S0400000_11);
            }
        }
    }

    @C14EU
    public final void onDiggStartEvent(C737030Svd c737030Svd) {
        boolean zLJI = MethodIDManager.LJI(72002);
        C2487409ou.LIZJ(new ARunnableS80S0200000_11(this, c737030Svd, 28));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        List<C0SZ8> listVi;
        Aweme awemeLLILZ;
        boolean z;
        InterfaceC689860R4e interfaceC689860R4eK9;
        if (!C1578630rBN.LJIIIZ(this) && c737030Svd != null && c737030Svd.LIZ == 13) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof String) && (str = (String) obj) != null && (iViewPagerComponentAbilityMb = Mb()) != null && (listVi = iViewPagerComponentAbilityMb.vi()) != null) {
                for (C0SZ8 c0sz8 : listVi) {
                    if (!BaseListFragmentPanel.LLIZLLLIL(c0sz8) && c0sz8.getAweme() != null && C2093608Ic.LIZJ(c0sz8.getAweme().getAid(), str) && (awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str)) != null) {
                        if (awemeLLILZ.getUserDigg() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (awemeLLILZ.isAd() && awemeLLILZ.getActivityPendant() == null) {
                            C313310CPx c313310CPx = C313310CPx.LIZ;
                            C1389300mG0.LIZ(getPanelContext());
                            c313310CPx.getClass();
                            Aweme awemeM199clone = awemeLLILZ.m199clone();
                            awemeM199clone.setAd(false);
                            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(awemeM199clone);
                        }
                        C1440005kM.LIZ(new C0SYN(z, awemeLLILZ.getAid()));
                        C1440005kM.LIZ(new C730120SkU(awemeLLILZ.getAid(), awemeLLILZ.getStatistics().getDiggCount(), awemeLLILZ.getUserDigg(), EnumC730430Skz.LIST));
                        if (c0sz8.K9() != null && (interfaceC689860R4eK9 = c0sz8.K9()) != null) {
                            interfaceC689860R4eK9.LJJJJZI(z);
                        }
                        C01GW<C740490T2x> c01gw = C740490T2x.LIZLLL;
                        if (C739240SzC.LIZ(C1389300mG0.LIZ(getPanelContext()))) {
                            C01GW<C740370T2l> c01gw2 = C740370T2l.LJIIL;
                            C582330Msh.LIZ().LJ(5);
                        }
                        C2214851BmN.LJFF(4);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0SrG] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C16F4 c16f4;
        C714490S0x c714490S0xEs1;
        super.onViewCreated(view);
        if (view instanceof C16F4) {
            c16f4 = (C16F4) view;
        } else {
            c16f4 = null;
        }
        this.LLJJ = c16f4;
        this.LLJJIII = Intrinsics.LJFF(C1389300mG0.LIZLLL(getPanelContext()), "from_publish_add_video");
        IRootAbility iRootAbility = (IRootAbility) this.LLJIJIL.getValue();
        if (iRootAbility != null && (c714490S0xEs1 = iRootAbility.es1()) != null) {
            C0T01 c0t01 = new C0T01() { // from class: X.0rUV
                @Override // X.C0T01, X.InterfaceC714480S0w
                public final void LIZJ(View view2, MotionEvent motionEvent, MotionEvent motionEvent2) {
                    Aweme awemeLJIIIIZZ;
                    int i;
                    boolean z;
                    Object objValueOf;
                    String authorUid;
                    int i2;
                    String groupId;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMb = this.LIZ.Mb();
                    if (iViewPagerComponentAbilityMb != null) {
                        awemeLJIIIIZZ = iViewPagerComponentAbilityMb.LJIIIIZZ();
                    } else {
                        awemeLJIIIIZZ = null;
                    }
                    if (!C20286514Zj.LJFF(awemeLJIIIIZZ) && !C1594680rbG.LJII(awemeLJIIIIZZ) && !C1594680rbG.LJIIJ(awemeLJIIIIZZ) && !C1594680rbG.LJI(awemeLJIIIIZZ)) {
                        C1387620mDI.LIZ.getClass();
                        if (!C1387620mDI.LJI(awemeLJIIIIZZ)) {
                            if (awemeLJIIIIZZ != null && (awemeLJIIIIZZ.getAwemeType() == 110 || C718190SFd.LIZLLL(awemeLJIIIIZZ, C1389300mG0.LIZ(this.LIZ.getPanelContext())))) {
                                return;
                            }
                            this.LIZ.handleDoubleClick(motionEvent);
                            if (!C1389300mG0.LJIJJ(this.LIZ.getPanelContext())) {
                                return;
                            }
                            C1590480rUU c1590480rUU = C1590480rUU.LIZ;
                            String strLIZ = C1389300mG0.LIZ(this.LIZ.getPanelContext());
                            c1590480rUU.getClass();
                            if (!C1590580rUe.LIZ() || motionEvent == null || motionEvent2 == null) {
                                return;
                            }
                            float x = motionEvent2.getX();
                            int i3 = C1590480rUU.LIZJ;
                            float f = i3 / 2;
                            int i4 = 2;
                            if (x > f) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                            if (motionEvent.getX() <= f) {
                                i4 = 1;
                            }
                            if (i == i4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (C1590480rUU.LIZ()) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("type", "double_digg");
                                float f2 = 100;
                                float f3 = i3;
                                c2344009Gk.LIZIZ((motionEvent2.getX() * f2) / f3, "x");
                                float y = motionEvent2.getY() * f2;
                                float f4 = C1590480rUU.LIZLLL;
                                c2344009Gk.LIZIZ(y / f4, "y");
                                c2344009Gk.LIZIZ(((motionEvent.getX() - motionEvent2.getX()) * f2) / f3, "dx");
                                c2344009Gk.LIZIZ(((motionEvent.getY() - motionEvent2.getY()) * f2) / f4, "dy");
                                if (!z) {
                                    i4 = 0;
                                }
                                c2344009Gk.LIZJ(i4, "side");
                                c2344009Gk.LIZJ(C1590480rUU.LIZIZ() ? 1 : 0, "rtl");
                                c2344009Gk.LJIIIIZZ("enter_from", strLIZ);
                                String str = "";
                                if (awemeLJIIIIZZ == null) {
                                    objValueOf = "";
                                } else {
                                    objValueOf = Integer.valueOf(awemeLJIIIIZZ.getAwemeType());
                                }
                                c2344009Gk.LJ(objValueOf, "aweme_type");
                                if (awemeLJIIIIZZ == null || (authorUid = AwemeExtKt.getAuthorUid(awemeLJIIIIZZ)) == null) {
                                    authorUid = "";
                                }
                                c2344009Gk.LJIIIIZZ("author_id", authorUid);
                                if (awemeLJIIIIZZ != null && (groupId = awemeLJIIIIZZ.getGroupId()) != null) {
                                    str = groupId;
                                }
                                c2344009Gk.LJIIIIZZ("group_id", str);
                                if (awemeLJIIIIZZ != null && awemeLJIIIIZZ.isAd() && awemeLJIIIIZZ.getAwemeType() == 0) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                c2344009Gk.LIZJ(i2, "is_ads");
                                C20684815ws.LJIILLIIL("event_hot_area", c2344009Gk.LIZ);
                            }
                            Keva keva = C1590480rUU.LIZIZ;
                            keva.storeInt("double_digg", keva.getInt("double_digg", 0) + 1);
                            keva.storeLong("double_digg_time", System.currentTimeMillis());
                        }
                    }
                }
            };
            if (!((ConcurrentHashSet) c714490S0xEs1.LIZ.getValue()).contains(c0t01)) {
                ((ConcurrentHashSet) c714490S0xEs1.LIZ.getValue()).add(c0t01);
            }
        }
        ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LLJILJILJ.getValue();
        if (iLoadMoreAbility != 0) {
            iLoadMoreAbility.JU0(new C0RAS() { // from class: X.0SrG
                @Override // X.C0RAS
                public final void LIZJ(int i) {
                    C16F4 c16f42 = this.LIZ.LLJJ;
                    if (c16f42 != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16f42);
                        c16f42.setTranslationY(i);
                    }
                }
            });
        }
        IRootAbility iRootAbility2 = (IRootAbility) this.LLJIJIL.getValue();
        if (iRootAbility2 != null) {
            iRootAbility2.G21(new C737010Svb(this));
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        View viewFindViewById;
        C16F4 c16f4 = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.fu8);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof C16F4) {
            c16f4 = (C16F4) viewFindViewById;
        }
        this.LLJJ = c16f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(android.view.MotionEvent r21, X.C0SZ8 r22, com.ss.android.ugc.aweme.feed.model.Aweme r23) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent.Go(android.view.MotionEvent, X.0SZ8, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
