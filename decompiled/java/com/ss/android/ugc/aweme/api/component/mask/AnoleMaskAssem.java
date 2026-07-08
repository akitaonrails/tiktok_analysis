package com.ss.android.ugc.aweme.api.component.mask;

import X.C01GW;
import X.C1009740cNo;
import X.C1012040cRW;
import X.C1016730cZ5;
import X.C1074310e3x;
import X.C128Y;
import X.C1386360mBG;
import X.C1440005kM;
import X.C1558520qew;
import X.C19EG;
import X.C1AV2;
import X.C1AVH;
import X.C452501pT;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C988330bpH;
import X.C988760bpy;
import X.EnumC696280RSw;
import X.EnumC706820Ro0;
import X.InterfaceC1008930cMV;
import X.InterfaceC1034470d1h;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC689860R4e;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.ability.mask.IAnoleLynxMaskAbility;
import com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggSetting;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.experiment.EndlayerAutoReportConfigExp;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleMaskAssem extends BaseCellLogicComponent<AnoleMaskAssem> implements IAnoleMaskAbility, InterfaceC1554640qYg {
    public InterfaceC1034470d1h LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 67));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 64));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 65));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 66));
    public final BPEAHandler LLJJJIL = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 63));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(43));

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility
    public final void eu() {
        EdgeSpeedupAbility edgeSpeedupAbility;
        InterfaceC689860R4e interfaceC689860R4eK9;
        InterfaceC689860R4e interfaceC689860R4eK92;
        this.LLJJLIIIJLLLLLLLZ = true;
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJIJIIJIL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.Xz2(EnumC706820Ro0.ALL, false, null, false, (C1AV2) C1AVH.LJJII.getValue());
        }
        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
        if (fypAutoScrollServiceLIZJ != null) {
            fypAutoScrollServiceLIZJ.LJIIL(true);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
            if (!ShakeEggSetting.LIZ().closeShakeEgg && C1016730cZ5.LIZIZ.LIZ(aweme)) {
                C1074310e3x.LIZ(c19egLIZ).LLIZ.setValue("ad_mask_block");
            }
        }
        C1012040cRW.LIZIZ().LIZLLL = true;
        InterfaceC1008930cMV interfaceC1008930cMVBo = Bo();
        if (interfaceC1008930cMVBo != null) {
            interfaceC1008930cMVBo.LJIILL(new C988760bpy(true));
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        C1440005kM.LIZ(new C988330bpH(true, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid()));
        C724270Sb3 c724270Sb33 = this.LLJI;
        DataCenter dataCenter = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).dataCenter;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.TRUE, "ad_init_play_fun_egg");
        }
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJJIJI.getValue();
        if (iVideoCellAbility != null && (interfaceC689860R4eK92 = iVideoCellAbility.K9()) != null) {
            interfaceC689860R4eK92.LJZI(true);
        }
        IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLJJIJI.getValue();
        if (iVideoCellAbility2 != null && (interfaceC689860R4eK9 = iVideoCellAbility2.K9()) != null) {
            interfaceC689860R4eK9.LLD(true);
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (!C1009740cNo.LIZLLL(((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme()) || (edgeSpeedupAbility = (EdgeSpeedupAbility) this.LLJJJJLIIL.getValue()) == null) {
            return;
        }
        edgeSpeedupAbility.wi(false);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1165736435) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility
    public final void qm() {
        InterfaceC689860R4e interfaceC689860R4eK9;
        this.LLJJLIIIJLLLLLLLZ = false;
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJIJIIJIL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.Xz2(EnumC706820Ro0.ALL, true, null, false, (C1AV2) C1AVH.LJJII.getValue());
        }
        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
        if (fypAutoScrollServiceLIZJ != null) {
            fypAutoScrollServiceLIZJ.LJIIL(false);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
            if (!ShakeEggSetting.LIZ().closeShakeEgg && C1016730cZ5.LIZIZ.LIZ(aweme)) {
                C1074310e3x.LIZ(c19egLIZ).LLIZLLLIL.setValue("ad_mask_block");
            }
        }
        C1012040cRW.LIZIZ().LIZLLL = false;
        InterfaceC1008930cMV interfaceC1008930cMVBo = Bo();
        if (interfaceC1008930cMVBo != null) {
            interfaceC1008930cMVBo.LJIILL(new C988760bpy(false));
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        C1440005kM.LIZ(new C988330bpH(false, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid()));
        C724270Sb3 c724270Sb33 = this.LLJI;
        DataCenter dataCenter = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).dataCenter;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.FALSE, "ad_init_play_fun_egg");
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        DataCenter dataCenter2 = ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.zQ2(null, "ad_mask_ecommerce_notify");
        }
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJJIJI.getValue();
        if (iVideoCellAbility == null || (interfaceC689860R4eK9 = iVideoCellAbility.K9()) == null) {
            return;
        }
        interfaceC689860R4eK9.LJZI(false);
    }

    public final InterfaceC1008930cMV Bo() {
        IFeedService iFeedServiceLIZIZ = ((ICommerceService) this.LLJJL.getValue()).LIZIZ();
        Context context = getContext();
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
        C724270Sb3 c724270Sb32 = this.LLJI;
        return iFeedServiceLIZIZ.LIZJ(context, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), str, true);
    }

    public final void Co() {
        FrameLayout frameLayout;
        InterfaceC1034470d1h interfaceC1034470d1h = this.LLJJJJ;
        if (interfaceC1034470d1h == null) {
            return;
        }
        interfaceC1034470d1h.LLLIL("lynx_endlayer_dealloc");
        IAnoleLynxMaskAbility iAnoleLynxMaskAbility = (IAnoleLynxMaskAbility) this.LLJJIJIL.getValue();
        ViewGroup viewGroupLJJIJL = iAnoleLynxMaskAbility != null ? iAnoleLynxMaskAbility.LJJIJL() : null;
        if ((viewGroupLJJIJL instanceof FrameLayout) && (frameLayout = (FrameLayout) viewGroupLJJIJL) != null) {
            C786410Ut5.LJJJZ(this.LLJJJJJIL, frameLayout);
        }
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C786410Ut5.LJLIIL(200L, this.LLJJJIL, new ARunnableS116S0100000_16(this, 23));
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility
    public final int LLJILLL() {
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLJJJ.getValue();
        if (iScreenComponentAbility != null) {
            return iScreenComponentAbility.LLJILLL();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility
    public final void U2() {
        BPEAHandler bPEAHandler = this.LLJJJIL;
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 22);
        EndlayerAutoReportConfigExp.EndlayerAutoReportConfig endlayerAutoReportConfig = (EndlayerAutoReportConfigExp.EndlayerAutoReportConfig) EndlayerAutoReportConfigExp.LIZIZ.getValue();
        C786410Ut5.LJLIIL(endlayerAutoReportConfig != null ? endlayerAutoReportConfig.autoReportClickTime : 0L, bPEAHandler, aRunnableS116S0100000_16);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility
    public final boolean Vg() {
        IVideoCellAbility iVideoCellAbility;
        InterfaceC689860R4e interfaceC689860R4eK9;
        return (this.LLJJLIIIJLLLLLLLZ || (iVideoCellAbility = (IVideoCellAbility) this.LLJJIJI.getValue()) == null || (interfaceC689860R4eK9 = iVideoCellAbility.K9()) == null || !interfaceC689860R4eK9.Vg()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility
    public final void Xz1() {
        InterfaceC689860R4e interfaceC689860R4eK9;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJJIJI.getValue();
        if (iVideoCellAbility == null || (interfaceC689860R4eK9 = iVideoCellAbility.K9()) == null) {
            return;
        }
        interfaceC689860R4eK9.LLD(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility
    public final void o0() {
        Context context;
        Co();
        if (this.LLJJJJ != null || C724240Sb0.LIZ(this) == null || (context = getContext()) == null) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
        C128Y c128yJv = iAdWebUtils != null ? iAdWebUtils.jv(C724240Sb0.LIZ(this), aweme) : null;
        this.LLJJJJ = c128yJv instanceof InterfaceC1034470d1h ? (InterfaceC1034470d1h) c128yJv : null;
        this.LLJJJJJIL = new FrameLayout(context);
        FrameLayout frameLayout = this.LLJJJJJIL;
        if (frameLayout != null) {
            C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(1, 1));
        }
        FrameLayout frameLayout2 = this.LLJJJJJIL;
        if (frameLayout2 != null) {
            frameLayout2.setId(R.id.yma);
        }
        IAnoleLynxMaskAbility iAnoleLynxMaskAbility = (IAnoleLynxMaskAbility) this.LLJJIJIL.getValue();
        ViewGroup viewGroupLJJIJL = iAnoleLynxMaskAbility != null ? iAnoleLynxMaskAbility.LJJIJL() : null;
        if ((viewGroupLJJIJL instanceof FrameLayout) && viewGroupLJJIJL != null) {
            viewGroupLJJIJL.addView(this.LLJJJJJIL);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            IAdWebUtils iAdWebUtils2 = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
            if (iAdWebUtils2 != null) {
                InterfaceC1034470d1h interfaceC1034470d1h = this.LLJJJJ;
                iAdWebUtils2.pv(true, c19egLIZ, interfaceC1034470d1h != null ? interfaceC1034470d1h.getFragment() : null, null, this.LLJJJJJIL, 0, true, false, false, null, AFwS231S0000000_3.get$arr$(266));
            }
            BPEAHandler bPEAHandler = this.LLJJJIL;
            ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 254);
            EndlayerAutoReportConfigExp.EndlayerAutoReportConfig endlayerAutoReportConfig = (EndlayerAutoReportConfigExp.EndlayerAutoReportConfig) EndlayerAutoReportConfigExp.LIZIZ.getValue();
            C786410Ut5.LJLIIL(endlayerAutoReportConfig != null ? endlayerAutoReportConfig.autoLoadIab : 0L, bPEAHandler, aRunnableS116S0100000_16);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility
    public final void Er() {
        IAnoleManager iAnoleManagerRi;
        InterfaceC1008930cMV interfaceC1008930cMVBo = Bo();
        if (interfaceC1008930cMVBo == null || (iAnoleManagerRi = interfaceC1008930cMVBo.Ri()) == null) {
            return;
        }
        iAnoleManagerRi.LJIIIIZZ(EnumC696280RSw.TT_FEED_MASK_FULL_SCREEN.getSlotName());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility
    public final void P() {
        Co();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility
    public final boolean hB2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        InterfaceC1008930cMV interfaceC1008930cMVBo = Bo();
        if (interfaceC1008930cMVBo != null) {
            interfaceC1008930cMVBo.LJIIJJI(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        this.LLJJLIIIJLLLLLLLZ = false;
    }
}
