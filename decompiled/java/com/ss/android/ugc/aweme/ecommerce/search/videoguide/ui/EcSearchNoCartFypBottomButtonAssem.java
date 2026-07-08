package com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui;

import X.AbstractC2361009My;
import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C09A1;
import X.C0PEM;
import X.C123100dR;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1565820qqi;
import X.C1637806bA;
import X.C1744700vVE;
import X.C1770220wAO;
import X.C1770320wAY;
import X.C1770340wAa;
import X.C1770380wAe;
import X.C1770430wAj;
import X.C1770460wAm;
import X.C1770470wAn;
import X.C1770510wAr;
import X.C1770800wBK;
import X.C1770850wBP;
import X.C1776160wJy;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C1A5L;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2252611DEt;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2296908zH;
import X.C23118094a;
import X.C23119094b;
import X.C418440Gaw;
import X.C446900Hfk;
import X.C452501pT;
import X.C722910SXh;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736490Sul;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1055110dYz;
import X.InterfaceC1583770rJf;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import Y.ACListenerS90S0300000_26;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideFrequency;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideFrequencyParams;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.PhotoSearchData;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.WithoutCartSearchStruct;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartContentionVM;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartFeedVideoGuideVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS39S1110000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSearchNoCartFypBottomButtonAssem extends BaseCellSlotComponent<EcSearchNoCartFypBottomButtonAssem> implements InterfaceC497601wk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLL;
    public static final Set<Integer> LLLLLIL;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS268S0000000_26.get$arr$(291));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS268S0000000_26.get$arr$(292));
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoFavoriteVM.class), AFwS268S0000000_26.get$arr$(293));
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoDiggVM.class), AFwS268S0000000_26.get$arr$(294));
    public final C01GW LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS268S0000000_26.get$arr$(295));
    public final C01GW LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(EcSearchNoCartContentionVM.class), AFwS268S0000000_26.get$arr$(296));
    public final InterfaceC1731706qJ LLLFF;
    public final C01GW LLLFFI;
    public CoroutineContext LLLFZ;
    public AnonymousClass0956 LLLI;
    public C2252611DEt LLLII;
    public AnonymousClass0956 LLLIIII;
    public C2252611DEt LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public int LLLILZ;
    public boolean LLLILZJ;
    public final C1770460wAm LLLILZLLLI;
    public final C1770510wAr LLLIZZ;
    public final C1770470wAn LLLJ;
    public final Map<String, Object> LLLJIL;
    public final Set<String> LLLJL;
    public final Map<Integer, Integer> LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public FrameLayout LLLLIILL;
    public LinearLayout LLLLIILLL;
    public TuxTextView LLLLIL;
    public SmartImageView LLLLILI;
    public TuxTextView LLLLJ;
    public TuxIconView LLLLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcSearchNoCartFypBottomButtonAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/search/videoguide/vm/EcSearchNoCartFeedVideoGuideVM;", 0);
        C13LE.LIZ.getClass();
        LLLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLLIL = new LinkedHashSet();
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.0wAm] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0wAr] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.0wAn] */
    public EcSearchNoCartFypBottomButtonAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcSearchNoCartFeedVideoGuideVM.class);
        this.LLLFF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 347), null, AFwS268S0000000_26.get$arr$(290));
        this.LLLFFI = C452501pT.LIZ(EnumC452301pR.NONE, AFwS215S0000000_26.get$arr$(174));
        this.LLLILZLLLI = new InterfaceC1583770rJf() { // from class: X.0wAm
            @Override // X.InterfaceC1583770rJf
            public final void A4(String str, String str2) {
                EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem = this.LL;
                if (ecSearchNoCartFypBottomButtonAssem.LLLIIL) {
                    ecSearchNoCartFypBottomButtonAssem.Up(Intrinsics.LJFF(str2, ecSearchNoCartFypBottomButtonAssem.Gp()));
                }
                EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem2 = this.LL;
                if (ecSearchNoCartFypBottomButtonAssem2.LLLIIL && ecSearchNoCartFypBottomButtonAssem2.LLLIL) {
                    if (Intrinsics.LJFF(str2, ecSearchNoCartFypBottomButtonAssem2.Gp())) {
                        ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LJIIZILJ(true);
                    } else {
                        if (!Intrinsics.LJFF(str, this.LL.Gp())) {
                            return;
                        }
                        ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LJIIZILJ(false);
                    }
                }
            }
        };
        this.LLLIZZ = new InterfaceC1055110dYz() { // from class: X.0wAr
            @Override // X.InterfaceC1583780rJg
            public final String getHoxNodeTag() {
                return "";
            }

            @Override // X.InterfaceC1055110dYz
            public final void onNodeHide(Bundle bundle) {
                EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem = this.LL;
                if (ecSearchNoCartFypBottomButtonAssem.LLLIIL) {
                    ecSearchNoCartFypBottomButtonAssem.Up(true);
                }
            }

            @Override // X.InterfaceC1055110dYz
            public final void onNodeShow(Bundle bundle) {
                EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem = this.LL;
                if (ecSearchNoCartFypBottomButtonAssem.LLLIIL) {
                    ecSearchNoCartFypBottomButtonAssem.Up(false);
                }
            }
        };
        this.LLLJ = new AbstractC2361009My() { // from class: X.0wAn
            @Override // X.AbstractC2361009My
            public final boolean onShot(String str) {
                if (C1565820qqi.LIZJ) {
                    EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem = this.LL;
                    C1770380wAe c1770380wAe = new C1770380wAe(2, 10);
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = EcSearchNoCartFypBottomButtonAssem.LLLLL;
                    ecSearchNoCartFypBottomButtonAssem.Jp(c1770380wAe, null);
                }
                return super.onShot(str);
            }
        };
        this.LLLJIL = new LinkedHashMap();
        this.LLLJL = new LinkedHashSet();
        this.LLLL = new LinkedHashMap();
        this.LLLLII = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(114));
        this.LLLLIIIILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(116));
        this.LLLLIIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(115));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.brk;
    }

    public final int Ep() {
        int i = this.LLLILZ;
        if (!this.LLLIILIL) {
            return i;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Video video = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getVideo();
        return video != null ? Math.max(i, video.getDuration()) : i;
    }

    public final float Fp() {
        if (this.LLLIILIL) {
            return 1.0f;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Video video = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getVideo();
        if (video == null) {
            return 1.0f;
        }
        if (Integer.valueOf(video.getDuration()).intValue() > 0) {
            return (this.LLLILZ * 1.0f) / r1.intValue();
        }
        return 1.0f;
    }

    public final EcSearchNoCartFeedVideoGuideVM Ip() {
        return (EcSearchNoCartFeedVideoGuideVM) this.LLLFF.getValue(this, LLLLL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (this.LLLIIL) {
            Up(true);
        }
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContext = this.LLLFZ;
        if (coroutineContext != null && C23118094a.LJIIIIZZ(coroutineContext)) {
            return coroutineContext;
        }
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        CoroutineContext coroutineContextLIZLLL = C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII());
        this.LLLFZ = coroutineContextLIZLLL;
        return coroutineContextLIZLLL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        if (this.LLLIIL) {
            Up(false);
        }
    }

    public final String Bp() {
        BaseFeedPageParams baseFeedPageParamsNJ2;
        String str;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IVideoCellAbility.class, null);
        return (iVideoCellAbility == null || (baseFeedPageParamsNJ2 = iVideoCellAbility.nJ2()) == null || (str = baseFeedPageParamsNJ2.eventType) == null) ? "" : str;
    }

    public final String Gp() {
        return Intrinsics.LJFF(Bp(), "homepage_follow") ? "Following" : "For You";
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        Wp(this);
        Qp(C724240Sb0.LIZ(this));
    }

    public static void Wp(Object obj) {
        try {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            Unit unit = null;
            if (eventBusLIZLLL.LJIIJ(obj)) {
                eventBusLIZLLL.LJJI(obj);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void Qp(C19EG c19eg) {
        Unit unit = null;
        if (c19eg != null) {
            try {
                C446900Hfk c446900Hfk = Hox.LLJILJIL;
                c446900Hfk.LIZ(c19eg).PQ2("page_profile", this.LLLIZZ);
                c446900Hfk.LIZ(c19eg).OQ2(this.LLLILZLLLI);
                IScreenshotService iScreenshotService = (IScreenshotService) PluggableExtentionKt.pluggableSpi$default(IScreenshotService.class, false, false, false, 14, null);
                if (iScreenshotService != null) {
                    iScreenshotService.LIZLLL(this.LLLJ);
                    unit = Unit.LIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(unit);
    }

    public final synchronized boolean Tp(C1770380wAe c1770380wAe) {
        C2252611DEt c2252611DEt;
        try {
            c2252611DEt = this.LLLII;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (c2252611DEt != null && c2252611DEt.isActive()) {
            C2252611DEt c2252611DEt2 = this.LLLII;
            if (c2252611DEt2 != null) {
                C189200o6.m2constructorimpl(c1770380wAe);
                c2252611DEt2.resumeWith(c1770380wAe);
            }
            return true;
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return false;
    }

    public final void Up(boolean z) {
        C2252611DEt c2252611DEt;
        C2252611DEt c2252611DEt2;
        this.LLLIIIL = z;
        if (z && (c2252611DEt = this.LLLIIIIL) != null && c2252611DEt.isActive() && (c2252611DEt2 = this.LLLIIIIL) != null) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            c2252611DEt2.resumeWith(unit);
        }
    }

    @C14EU
    public final void onPlayerControllerVideoStatusEvent(C722910SXh c722910SXh) {
        if (C1565820qqi.LIZJ && c722910SXh.LIZJ == 1) {
            Jp(new C1770380wAe(2, 9), null);
        }
    }

    @C14EU
    public final void onScrolledToProfile(C736490Sul c736490Sul) {
        Jp(new C1770380wAe(2, 4), null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLLLIILL = (FrameLayout) view.findViewById(R.id.ggo);
        this.LLLLIILLL = (LinearLayout) view.findViewById(R.id.ggp);
        this.LLLLIL = (TuxTextView) view.findViewById(R.id.ggr);
        this.LLLLILI = (SmartImageView) view.findViewById(R.id.saw);
        this.LLLLJ = (TuxTextView) view.findViewById(R.id.ggs);
        this.LLLLJI = (TuxIconView) view.findViewById(R.id.ggq);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0Nz2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS313S0000000_26.get$arr$(26), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0Nkp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS313S0000000_26.get$arr$(27), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0SHe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJJ;
            }
        }, null, AFwS313S0000000_26.get$arr$(28), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0RSn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, null, AFwS313S0000000_26.get$arr$(29), 6);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJZ.getValue();
        selectSubscribe(assemViewModel, new C2217381BqS() { // from class: X.0Sn5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0SnA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0SnE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZLL;
            }
        }, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, C1776160wJy.get$arr$(2));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0Snq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730490Sl5) obj).LLILLJJLI;
            }
        }, null, AFwS313S0000000_26.get$arr$(20), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0SCY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJI;
            }
        }, null, AFwS313S0000000_26.get$arr$(22), 6);
        AssemViewModel assemViewModel2 = (AssemViewModel) this.LLLF.getValue();
        subscribe(assemViewModel2, C736820SvI.LIZIZ(assemViewModel2.usedInReusedScene), null, AFwS313S0000000_26.get$arr$(23));
        EcSearchNoCartFeedVideoGuideVM ecSearchNoCartFeedVideoGuideVMIp = Ip();
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZIZ = AFwS302S0000000_18.get$arr$(17);
        AssemViewModel.asyncSubscribe$default(ecSearchNoCartFeedVideoGuideVMIp, new C2217381BqS() { // from class: X.0gMo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159010gGZ) obj).LL;
            }
        }, this, c1770850wBP, new AwS605S0100000_26(this, 467), null, new AwS605S0100000_26(this, 468), 16, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        C1770340wAa c1770340wAa = C1770340wAa.LIZ;
        Aweme aweme = videoItemParams.getAweme();
        String strBp = Bp();
        c1770340wAa.getClass();
        return C1770340wAa.LIZ(aweme, strBp);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLLF.getValue();
        String aid = videoItemParams.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        assemViewModel.getClass();
        assemViewModel.setState(new AwS39S1110000_26(aid, false, (C1770220wAO) null, 1));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0170 A[Catch: all -> 0x01ea, TryCatch #0 {all -> 0x01ea, blocks: (B:2:0x0000, B:4:0x0007, B:5:0x0009, B:7:0x001c, B:9:0x0020, B:11:0x002c, B:13:0x003b, B:15:0x0041, B:16:0x0043, B:18:0x0069, B:20:0x0083, B:22:0x008b, B:23:0x009f, B:25:0x00b1, B:26:0x00b5, B:28:0x00cb, B:30:0x00d1, B:34:0x00db, B:35:0x00ef, B:37:0x00f5, B:39:0x010a, B:41:0x011b, B:43:0x0121, B:44:0x0123, B:45:0x0141, B:47:0x0149, B:49:0x0156, B:50:0x0170, B:52:0x0178, B:54:0x0185, B:55:0x019f, B:57:0x01a3, B:59:0x01a9, B:60:0x01ad, B:62:0x01bb, B:64:0x01c1, B:65:0x01c3, B:66:0x01e1, B:19:0x007c), top: B:72:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019f A[Catch: all -> 0x01ea, TryCatch #0 {all -> 0x01ea, blocks: (B:2:0x0000, B:4:0x0007, B:5:0x0009, B:7:0x001c, B:9:0x0020, B:11:0x002c, B:13:0x003b, B:15:0x0041, B:16:0x0043, B:18:0x0069, B:20:0x0083, B:22:0x008b, B:23:0x009f, B:25:0x00b1, B:26:0x00b5, B:28:0x00cb, B:30:0x00d1, B:34:0x00db, B:35:0x00ef, B:37:0x00f5, B:39:0x010a, B:41:0x011b, B:43:0x0121, B:44:0x0123, B:45:0x0141, B:47:0x0149, B:49:0x0156, B:50:0x0170, B:52:0x0178, B:54:0x0185, B:55:0x019f, B:57:0x01a3, B:59:0x01a9, B:60:0x01ad, B:62:0x01bb, B:64:0x01c1, B:65:0x01c3, B:66:0x01e1, B:19:0x007c), top: B:72:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Jp(X.C1770380wAe r10, X.C1565830qqj<?> r11) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssem.Jp(X.0wAe, X.0qqj):java.lang.Object");
    }

    public final void Vp(C1770220wAO c1770220wAO, PhotoSearchData photoSearchData) {
        String string;
        int i;
        int i2;
        Float f;
        TuxIconView tuxIconView = this.LLLLJI;
        if (tuxIconView != null) {
            C1744700vVE.LJII(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        }
        TuxIconView tuxIconView2 = this.LLLLJI;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_scan_magnifying_glass);
        }
        TuxTextView tuxTextView = this.LLLLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(photoSearchData.title);
        }
        WithoutCartSearchStruct withoutCartSearchStructLIZ = c1770220wAO.LIZIZ.LIZ();
        if (withoutCartSearchStructLIZ != null && (f = withoutCartSearchStructLIZ.fontSize) != null) {
            float fFloatValue = f.floatValue();
            TuxTextView tuxTextView2 = this.LLLLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.LJJJJI(fFloatValue);
            }
        }
        C1770430wAj.LL.getClass();
        EcSearchFeedVideoGuideFrequency ecSearchFeedVideoGuideFrequency = C1770430wAj.LLILLL;
        Long l = c1770220wAO.LIZIZ.frequencyTimeStamp;
        String str = null;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        if (C123100dR.LIZ(string)) {
            if (ecSearchFeedVideoGuideFrequency != null) {
                str = ecSearchFeedVideoGuideFrequency.timestamp;
            }
            if (Intrinsics.LJFF(string, str)) {
                if (ecSearchFeedVideoGuideFrequency != null) {
                    i2 = ecSearchFeedVideoGuideFrequency.times;
                } else {
                    i2 = 0;
                }
                i = i2 + 1;
            } else {
                i = 1;
            }
            C1770430wAj.LJFF(new EcSearchFeedVideoGuideFrequency(string, i, null, 0, 0L, 28, null));
        }
        C2271391DvN.LIZ(this.LLLLIILL, (C1A5L) C2271381DvM.LLLLLLZ.getValue());
        FrameLayout frameLayout = this.LLLLIILL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS90S0300000_26(c1770220wAO, this, photoSearchData, 1));
        }
        FrameLayout frameLayout2 = this.LLLLIILL;
        if (frameLayout2 != null) {
            ((C1770800wBK) this.LLLFFI.getValue()).LIZ(frameLayout2, LJJIJL());
        }
        C1770320wAY c1770320wAY = C1770320wAY.LIZ;
        Map<String, Object> mapLJ = c1770220wAO.LIZIZ.daParams;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        String strBp = Bp();
        c1770320wAY.getClass();
        C1770320wAY.LIZLLL(strBp, mapLJ);
        Ip().wQ2(new EcSearchFeedVideoGuideFrequencyParams(1, 1));
        this.LLLIL = true;
        IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
        if (iECommerceMallService != null) {
            iECommerceMallService.LJIIZILJ(true);
        }
    }
}
