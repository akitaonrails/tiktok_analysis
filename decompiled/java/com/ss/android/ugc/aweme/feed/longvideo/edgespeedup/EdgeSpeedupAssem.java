package com.ss.android.ugc.aweme.feed.longvideo.edgespeedup;

import X.C01GW;
import X.C0C2Y;
import X.C0C64;
import X.C0N0Y;
import X.C0QSJ;
import X.C0SRF;
import X.C0T2Y;
import X.C1017070cZd;
import X.C10IT;
import X.C1389890mGx;
import X.C13LE;
import X.C1440005kM;
import X.C1483410ohn;
import X.C14Z4;
import X.C1558520qew;
import X.C1597406Ng;
import X.C19252910Tv;
import X.C19EG;
import X.C1AV2;
import X.C1AVH;
import X.C1D0F;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C2245931CvP;
import X.C284060BBk;
import X.C294930BhD;
import X.C295030BhN;
import X.C296230BjJ;
import X.C300710BqX;
import X.C305280Bxu;
import X.C421910GgX;
import X.C452501pT;
import X.C589960NBy;
import X.C628500Oky;
import X.C630740Ooa;
import X.C698300RaG;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C735950Stt;
import X.C735960Stu;
import X.C735970Stv;
import X.C735980Stw;
import X.C735990Stx;
import X.C736000Sty;
import X.C736010Stz;
import X.C736020Su0;
import X.C736030Su1;
import X.C736060Su4;
import X.C736070Su5;
import X.C736080Su6;
import X.C736090Su7;
import X.C736100Su8;
import X.C736110Su9;
import X.C736120SuA;
import X.C736130SuB;
import X.C736160SuE;
import X.C736170SuF;
import X.C736680Sv4;
import X.C737030Svd;
import X.C737910Sx3;
import X.C740740T3w;
import X.EnumC706820Ro0;
import X.EnumC736040Su2;
import X.InterfaceC1554640qYg;
import X.InterfaceC1616480sAQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC689860R4e;
import X.InterfaceC736180SuG;
import X.ViewOnTouchListenerC736230SuL;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.aweme.ability.ICommerceSpeedupAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.commercialize.model.VideoPlaybackConfig;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoShareAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility;
import com.ss.android.ugc.feed.platform.cell.ability.VideoFavoriteAssemAbility;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class EdgeSpeedupAssem extends BaseCellSlotComponent<EdgeSpeedupAssem> implements EdgeSpeedupAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLILI;
    public C421910GgX LLLIIIL;
    public ViewOnTouchListenerC736230SuL LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public long LLLILZJ;
    public int LLLILZLLLI;
    public boolean LLLJ;
    public boolean LLLJL;
    public boolean LLLL;
    public C1389890mGx LLLLII;
    public volatile MainPageBusinessAbility LLLLIILL;
    public InterfaceC665370Q7z LLLLIILLL;
    public C0QSJ LLLLIL;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C736160SuE());
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C736170SuF());
    public final C01GW LLJZ = C452501pT.LIZIZ(new C736070Su5(this));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new C736090Su7(this));
    public final C01GW LLL = C452501pT.LIZIZ(new C735980Stw(this));
    public final C01GW LLLF = C452501pT.LIZIZ(new C735960Stu(this));
    public final C01GW LLLFF = C452501pT.LIZIZ(new C735950Stt(this));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 423));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new C735970Stv(this));
    public final C01GW LLLI = C452501pT.LIZIZ(new C736080Su6(this));
    public final C01GW LLLII = C452501pT.LIZIZ(new C736100Su8(this));
    public final C630740Ooa LLLIIII = C628500Oky.LIZ(new C736110Su9(this));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new C736030Su1(this));
    public float LLLILZ = 1.0f;
    public EnumC736040Su2 LLLIZZ = EnumC736040Su2.INVALID_ZONE;
    public final List<InterfaceC736180SuG> LLLJIL = new ArrayList();
    public final C736020Su0 LLLLIIIILLL = new C736020Su0(this);
    public final C01GW LLLLIIL = C452501pT.LIZIZ(new C736130SuB());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EdgeSpeedupAssem.class, "mainPageBusinessAbility", "getMainPageBusinessAbility()Lcom/ss/android/ugc/aweme/base/mainpagefragment/MainPageBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLLLILI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b66;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1248994953) {
            return null;
        }
        return this;
    }

    public final ICommerceSpeedupAbility Ep() {
        Aweme aweme;
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || !aweme.isAd()) {
            return null;
        }
        return (ICommerceSpeedupAbility) this.LLLII.getValue();
    }

    public final C736060Su4 Fp() {
        return (C736060Su4) this.LLLLIIL.getValue();
    }

    public final void Gp() {
        if (C736060Su4.LJI) {
            C737030Svd c737030Svd = new C737030Svd(76, new C1597406Ng(false, C2097908Jt.LIZJ(new Pair("start", Boolean.FALSE))));
            c737030Svd.LJIILLIIL = System.identityHashCode(C724240Sb0.LIZ(this));
            C724270Sb3 c724270Sb3 = this.LLJI;
            c737030Svd.LJ = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
            C736060Su4.LJI = false;
            C1440005kM.LIZ(c737030Svd);
        }
    }

    public final boolean Ip() {
        AwemeRawAd awemeRawAd;
        VideoPlaybackConfig videoPlaybackConfig;
        Integer num;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (!((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().isAd()) {
            return true;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
        boolean z = false;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (videoPlaybackConfig = awemeRawAd.getVideoPlaybackConfig()) != null && (num = videoPlaybackConfig.speedUpClearMode) != null && num.intValue() == 1) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C589960NBy c589960NBy = C589960NBy.LIZ;
        C736020Su0 c736020Su0 = this.LLLLIIIILLL;
        c589960NBy.getClass();
        ((ArrayList) C589960NBy.LJFF).remove(c736020Su0);
    }

    public final boolean Bp() {
        CellSurveyComponentAbility cellSurveyComponentAbility;
        if (!C305280Bxu.LIZ()) {
            return false;
        }
        C589960NBy c589960NBy = C589960NBy.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        c589960NBy.getClass();
        if (!C589960NBy.LIZ(aweme)) {
            return false;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (C10IT.LJIIJJI(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme())) {
            return false;
        }
        CellSurveyComponentAbility cellSurveyComponentAbility2 = (CellSurveyComponentAbility) this.LLLFZ.getValue();
        if (cellSurveyComponentAbility2 != null && cellSurveyComponentAbility2.Gg1()) {
            return false;
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (C14Z4.LIZJ(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme()) && (cellSurveyComponentAbility = (CellSurveyComponentAbility) this.LLLFZ.getValue()) != null && cellSurveyComponentAbility.ti2()) {
            return false;
        }
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) this.LLLIIII.getValue();
        if ((feedRecommendSkylightDrawerAbility != null && feedRecommendSkylightDrawerAbility.yw0()) || C1D0F.LIZ.isConnected()) {
            return false;
        }
        ICommerceSpeedupAbility iCommerceSpeedupAbilityEp = Ep();
        return iCommerceSpeedupAbilityEp == null || !iCommerceSpeedupAbilityEp.Jy();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final boolean q80() {
        C736060Su4 c736060Su4Fp = Fp();
        if (c736060Su4Fp != null) {
            return c736060Su4Fp.LIZJ;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final boolean aW1() {
        return this.LLLIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final void E51(C2245931CvP c2245931CvP) {
        if (((ArrayList) this.LLLJIL).contains(c2245931CvP)) {
            return;
        }
        ((ArrayList) this.LLLJIL).add(c2245931CvP);
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final void Eg1(boolean z) {
        C736060Su4 c736060Su4Fp;
        if (z) {
            C736060Su4 c736060Su4Fp2 = Fp();
            if (c736060Su4Fp2 != null && !c736060Su4Fp2.LIZJ) {
                c736060Su4Fp2.LIZJ = true;
                c736060Su4Fp2.LIZLLL = false;
                c736060Su4Fp2.LIZ = c736060Su4Fp2.LIZIZ;
                Up(true);
                return;
            }
            return;
        }
        C736060Su4 c736060Su4Fp3 = Fp();
        if (c736060Su4Fp3 != null && c736060Su4Fp3.LIZJ && (c736060Su4Fp = Fp()) != null && !c736060Su4Fp.LIZLLL) {
            c736060Su4Fp.LIZ = !c736060Su4Fp.LIZIZ;
            c736060Su4Fp.LIZLLL = true;
            c736060Su4Fp.LIZJ = false;
            Up(false);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C19EG c19egLIZ;
        if (C300710BqX.LIZ() && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            Object obj = null;
            if (iDetailFeedSafService != null) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                Fragment fragmentLIZLLL = iDetailFeedSafService.LIZLLL(((VideoItemParams) obj).fragment);
                if (fragmentLIZLLL != null) {
                    C740740T3w.LIZ(fragmentLIZLLL, fragmentLIZLLL, new C0T2Y() { // from class: X.0SuC
                        @Override // X.C0T2Y
                        public final void Y3(Aweme aweme) {
                            this.LL.Gp();
                        }
                    });
                    return;
                }
            }
            C740740T3w.LIZIZ(c19egLIZ, c19egLIZ, new C0T2Y() { // from class: X.0SuD
                @Override // X.C0T2Y
                public final void Y3(Aweme aweme) {
                    this.LL.Gp();
                }
            });
        }
    }

    public final void Jp(float f) {
        Object obj;
        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        c0n0yLJLJJI.setSpeed(f * C1017070cZd.LLLLIILL(((VideoItemParams) obj).getAweme()));
        HashMap<String, Object> map = new HashMap<>();
        map.put("stage", "speed_begin");
        map.put("action", "gesture");
        map.put("begin_speed", Float.valueOf(C1483410ohn.LJLJJI().getSpeed()));
        C1483410ohn.LJLJJI().LJJJJZI(map);
    }

    public final void Qp(boolean z) {
        boolean z2;
        IVideoCellAbility iVideoCellAbility;
        InterfaceC689860R4e interfaceC689860R4eK9;
        if (!Ip()) {
            return;
        }
        BaseFeedPageParams baseFeedPageParams = jm().LJ;
        if (baseFeedPageParams != null && baseFeedPageParams.isPlayListCleanMode()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object obj = null;
        if (!z2) {
            if (C284060BBk.LIZ() != 2 && C284060BBk.LIZ() != 3) {
                RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), RootCellCommonAbility.class, null);
                if (rootCellCommonAbility != null) {
                    EnumC706820Ro0 enumC706820Ro0 = EnumC706820Ro0.ALL;
                    C0SRF c0srf = new C0SRF();
                    rootCellCommonAbility.bd2(enumC706820Ro0, z, new C698300RaG(c0srf.LIZ, c0srf.LIZIZ), (C1AV2) C1AVH.LJIIJJI.getValue());
                }
            } else {
                RootCellCommonAbility rootCellCommonAbility2 = (RootCellCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), RootCellCommonAbility.class, null);
                if (rootCellCommonAbility2 != null) {
                    C0SRF c0srf2 = new C0SRF();
                    C698300RaG c698300RaG = new C698300RaG(c0srf2.LIZ, c0srf2.LIZIZ);
                    EnumC706820Ro0 enumC706820Ro02 = EnumC706820Ro0.RIGHT_AREA;
                    C01GW c01gw = C1AVH.LJIIJJI;
                    rootCellCommonAbility2.bd2(enumC706820Ro02, z, c698300RaG, (C1AV2) c01gw.getValue());
                    rootCellCommonAbility2.bd2(EnumC706820Ro0.LEFT_AREA, z, c698300RaG, (C1AV2) c01gw.getValue());
                    rootCellCommonAbility2.bd2(EnumC706820Ro0.BOTTOM_AREA, z, c698300RaG, (C1AV2) c01gw.getValue());
                    rootCellCommonAbility2.bd2(EnumC706820Ro0.MIDDLE_AREA, z, c698300RaG, (C1AV2) c01gw.getValue());
                    rootCellCommonAbility2.Me(z);
                }
            }
            IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLJZ.getValue();
            if (iVideoCellAbility2 != null) {
                iVideoCellAbility2.ii(z);
            }
        }
        IFeedCleanAbility iFeedCleanAbility = (IFeedCleanAbility) this.LLLI.getValue();
        if (iFeedCleanAbility != null) {
            iFeedCleanAbility.Xk(null, "edge_speedup", !z, true, true, false);
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        if (((VideoItemParams) obj).getAweme().isAd() && (iVideoCellAbility = (IVideoCellAbility) this.LLJZ.getValue()) != null && (interfaceC689860R4eK9 = iVideoCellAbility.K9()) != null) {
            interfaceC689860R4eK9.LLJJ(!z, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tp(boolean r15) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem.Tp(boolean):void");
    }

    public final void Up(boolean z) {
        Object obj;
        C737030Svd c737030Svd = new C737030Svd(76, new C1597406Ng(true, C2097908Jt.LIZJ(new Pair("pull_down", Boolean.valueOf(z)))));
        c737030Svd.LJIILLIIL = System.identityHashCode(C724240Sb0.LIZ(this));
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        c737030Svd.LJ = ((VideoItemParams) obj).mEventType;
        C1440005kM.LIZ(c737030Svd);
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final void VK1(C2245931CvP c2245931CvP) {
        ((ArrayList) this.LLLJIL).remove(c2245931CvP);
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final void dp0(boolean z) {
        Object obj;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (!c19252910Tv.LIZLLL().LJIJI().LL()) {
            return;
        }
        InterfaceC1616480sAQ interfaceC1616480sAQLJIJI = c19252910Tv.LIZLLL().LJIJI();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        boolean zLLFZ = interfaceC1616480sAQLJIJI.LLFZ(((VideoItemParams) obj).mEventType);
        if (z) {
            if (!zLLFZ && !this.LLLJL) {
                if (this.LLLL) {
                    InterfaceC1616480sAQ interfaceC1616480sAQLJIJI2 = c19252910Tv.LIZLLL().LJIJI();
                    C724270Sb3 c724270Sb32 = this.LLJI;
                    if (c724270Sb32 != null) {
                        obj2 = c724270Sb32.LL;
                    }
                    interfaceC1616480sAQLJIJI2.LLJILJIL(((VideoItemParams) obj2).mEventType);
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    if (fragmentLJI != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
                        c1389890mGx.LJIIIZ(2131849394);
                        c1389890mGx.LJFF(R.raw.icon_chevron_down_double_fill);
                        c1389890mGx.LJII(R.attr.a1h);
                        c1389890mGx.LIZLLL(3000L);
                        this.LLLLII = c1389890mGx;
                        c1389890mGx.LJIIJJI();
                    }
                    this.LLLJL = false;
                    this.LLLL = false;
                    c19252910Tv.LIZLLL().LJIJI().LLJJJIL(0);
                    return;
                }
                InterfaceC1616480sAQ interfaceC1616480sAQLJIJI3 = c19252910Tv.LIZLLL().LJIJI();
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj2 = c724270Sb33.LL;
                }
                interfaceC1616480sAQLJIJI3.LLJILJIL(((VideoItemParams) obj2).mEventType);
                Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                if (fragmentLJI2 != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(fragmentLJI2);
                    c1389890mGx2.LJIIIZ(2131848692);
                    c1389890mGx2.LJFF(R.raw.icon_lock_fill);
                    c1389890mGx2.LJII(R.attr.a1h);
                    c1389890mGx2.LIZLLL(3000L);
                    this.LLLLII = c1389890mGx2;
                    c1389890mGx2.LJIIJJI();
                }
                c19252910Tv.LIZLLL().LJIJI().LLJJJIL(1);
                this.LLLJL = true;
                this.LLLL = false;
                return;
            }
            return;
        }
        if (!zLLFZ || this.LLLL) {
            return;
        }
        if (this.LLLJL) {
            c19252910Tv.LIZLLL().LJIJI().LLJILJIL(null);
            Fragment fragmentLJI3 = C724240Sb0.LJI(this);
            if (fragmentLJI3 != null) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(fragmentLJI3);
                c1389890mGx3.LJIIIZ(2131849392);
                c1389890mGx3.LJFF(R.raw.icon_chevron_up_double_fill);
                c1389890mGx3.LJII(R.attr.a1h);
                c1389890mGx3.LIZLLL(3000L);
                c1389890mGx3.LJIIJJI();
            }
            this.LLLJL = false;
            this.LLLL = false;
            c19252910Tv.LIZLLL().LJIJI().LLJJJIL(0);
            return;
        }
        c19252910Tv.LIZLLL().LJIJI().LLJILJIL(null);
        Fragment fragmentLJI4 = C724240Sb0.LJI(this);
        if (fragmentLJI4 != null) {
            C1389890mGx c1389890mGx4 = new C1389890mGx(fragmentLJI4);
            c1389890mGx4.LJIIIZ(2131848696);
            c1389890mGx4.LJFF(R.raw.icon_lock_fill);
            c1389890mGx4.LJII(R.attr.a1h);
            c1389890mGx4.LIZLLL(3000L);
            c1389890mGx4.LJIIJJI();
        }
        c19252910Tv.LIZLLL().LJIJI().LLJJJIL(1);
        this.LLLJL = false;
        this.LLLL = true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        VideoViewCellRootView videoViewCellRootView;
        if (!C305280Bxu.LIZ()) {
            return;
        }
        this.LLLIIIL = (C421910GgX) view.findViewById(R.id.tn4);
        View viewLJJIJL = LJJIJL();
        LJJIJL().getWidth();
        ViewOnTouchListenerC736230SuL viewOnTouchListenerC736230SuL = new ViewOnTouchListenerC736230SuL(viewLJJIJL);
        viewOnTouchListenerC736230SuL.LLJ = this;
        this.LLLIIL = viewOnTouchListenerC736230SuL;
        ViewParent parent = LJJIJL().getParent();
        if ((parent instanceof VideoViewCellRootView) && (videoViewCellRootView = (VideoViewCellRootView) parent) != null) {
            videoViewCellRootView.setEdgeSpeedupListener(this.LLLIIL);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0Rt8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, new C735990Stx(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0Rt9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, null, new C736000Sty(), 6);
        if (C300710BqX.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0Rsm
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJILJILJ;
                }
            }, null, AFwS294S0000000_11.get$arr$(84), 6);
        }
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Rsl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIIJIL;
            }
        }, null, new C736010Stz(), 6);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Rt7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(83), 6);
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LL()) {
            C589960NBy c589960NBy = C589960NBy.LIZ;
            C736020Su0 c736020Su0 = this.LLLLIIIILLL;
            c589960NBy.getClass();
            ((ArrayList) C589960NBy.LJFF).add(c736020Su0);
        }
        super.onViewCreated(view);
        C0C2Y.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c3  */
    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wi(boolean r16) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem.wi(boolean):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final void Xl(float f, float f2) {
        ICommerceSpeedupAbility iCommerceSpeedupAbilityEp = Ep();
        if (iCommerceSpeedupAbilityEp != null) {
            iCommerceSpeedupAbilityEp.Xl(f, f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    public final boolean cS1(float f, float f2) {
        Context context;
        VideoFavoriteAssemAbility videoFavoriteAssemAbility;
        VideoDiggAssemAbility videoDiggAssemAbility;
        IVideoCommentAbility iVideoCommentAbility;
        IVideoShareAbility iVideoShareAbility;
        if (!this.LLLIILIL || !Bp()) {
            return false;
        }
        C736120SuA c736120SuA = C736120SuA.LIZ;
        int width = LJJIJL().getWidth();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_6844100557_early_edge_speed_ready", true, true)) {
            context = LJJIJL().getContext();
        } else {
            context = null;
        }
        c736120SuA.getClass();
        if (C736120SuA.LIZ(f, width, context) == EnumC736040Su2.INVALID_ZONE) {
            return false;
        }
        ICommerceSpeedupAbility iCommerceSpeedupAbilityEp = Ep();
        if (iCommerceSpeedupAbilityEp != null && iCommerceSpeedupAbilityEp.RI1(f, f2)) {
            return false;
        }
        if (!C294930BhD.LIZ() && (iVideoShareAbility = (IVideoShareAbility) this.LLL.getValue()) != null && iVideoShareAbility.b41(f, f2)) {
            return false;
        }
        if (C295030BhN.LIZ() && !C294930BhD.LIZ() && (iVideoCommentAbility = (IVideoCommentAbility) this.LLLF.getValue()) != null && iVideoCommentAbility.uY(f, f2)) {
            return false;
        }
        if (!C294930BhD.LIZ() && (videoDiggAssemAbility = (VideoDiggAssemAbility) this.LLLFFI.getValue()) != null && videoDiggAssemAbility.sj0(f, f2)) {
            return false;
        }
        if (((Number) C296230BjJ.LIZ.getValue()).intValue() != 0 && (videoFavoriteAssemAbility = (VideoFavoriteAssemAbility) this.LLLFF.getValue()) != null && videoFavoriteAssemAbility.Ja2(f, f2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    @Override // com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fs(float r12, float r13) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem.fs(float, float):void");
    }
}
