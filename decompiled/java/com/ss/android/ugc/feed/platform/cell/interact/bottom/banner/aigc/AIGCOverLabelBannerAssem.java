package com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc;

import X.C01GW;
import X.C0H5K;
import X.C0H5L;
import X.C0H5O;
import X.C0HHT;
import X.C0PEM;
import X.C0RJN;
import X.C0SH0;
import X.C0SH2;
import X.C0SUF;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1AV2;
import X.C1AV3;
import X.C1DFH;
import X.C2107308Nj;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2765015f;
import X.C452501pT;
import X.C690870R8b;
import X.C707380Rou;
import X.C718360SFu;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.EnumC700430Rdh;
import X.InterfaceC1350790lFt;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.AObjectS64S0000000_11;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonUIStruct;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AIGCOverLabelBannerAssem extends BaseCellSlotComponent<AIGCOverLabelBannerAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public FeedBottomBannerView LLJLLIL;
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1211));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1210));
    public final InterfaceC1731706qJ LLJZIJLIL;
    public String LLL;
    public C127G LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AIGCOverLabelBannerAssem.class, "rightBottomViewModel", "getRightBottomViewModel()Lcom/ss/android/ugc/aweme/tako/otherpage/feed/mainentrance/viewmodel/ITakoFeedRightBottomEntranceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AIGCOverLabelBannerAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ITakoFeedRightBottomEntranceViewModel.class);
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 1215), null, AFwS243S0000000_11.get$arr$(560));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        this.LLL = null;
        Bp();
        C707380Rou c707380RouFp = Fp();
        if (c707380RouFp == null || (feedCommonBannerProtocol = c707380RouFp.LJFF) == null || (c0sh0LJ = feedCommonBannerProtocol.LJ()) == null) {
            return;
        }
        c0sh0LJ.LJLLLL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b5e;
    }

    public final C707380Rou Fp() {
        return (C707380Rou) this.LLJZ.getValue();
    }

    public final void Bp() {
        C0SUF c0suf;
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C707380Rou c707380RouFp = Fp();
        C0SH2 c0sh2LJI = (c707380RouFp == null || (feedCommonBannerProtocol = c707380RouFp.LJFF) == null) ? null : feedCommonBannerProtocol.LJI();
        if (!(c0sh2LJI instanceof C0SUF) || (c0suf = (C0SUF) c0sh2LJI) == null) {
            return;
        }
        c0suf.LIZLLL = null;
    }

    public final void Ep() {
        String str;
        boolean z;
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C718360SFu c718360SFu;
        C707380Rou c707380RouFp = Fp();
        if (c707380RouFp != null && (feedCommonBannerProtocol = c707380RouFp.LJFF) != null && (c718360SFu = feedCommonBannerProtocol.LL) != null) {
            str = c718360SFu.LIZIZ;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (!z && !Intrinsics.LJFF(this.LLL, str)) {
                this.LLL = str;
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0H5L(str, null), 3);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C0H5K(this, null), 3);
        }
        str = null;
        z = true;
        if (!z) {
            this.LLL = str;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0H5L(str, null), 3);
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C0H5K(this, null), 3);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void H() {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouFp = Fp();
        if (c707380RouFp == null || (feedCommonBannerProtocol = c707380RouFp.LJFF) == null || (c0sh0LJ = feedCommonBannerProtocol.LJ()) == null) {
            return;
        }
        c0sh0LJ.H();
    }

    public final boolean Ip() {
        C707380Rou c707380RouFp = Fp();
        return (c707380RouFp == null || c707380RouFp.LJFF == null) ? false : true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouFp = Fp();
        if (c707380RouFp == null || (feedCommonBannerProtocol = c707380RouFp.LJFF) == null || (c0sh0LJ = feedCommonBannerProtocol.LJ()) == null) {
            return;
        }
        c0sh0LJ.LJL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouFp = Fp();
        if (c707380RouFp == null || (feedCommonBannerProtocol = c707380RouFp.LJFF) == null || (c0sh0LJ = feedCommonBannerProtocol.LJ()) == null) {
            return;
        }
        c0sh0LJ.LJJIIJ();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLF;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLF;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ITakoFeedRightBottomEntranceViewModel.class, new AObjectS64S0000000_11(this, 3)}, defaultViewModelProviderFactory);
                    this.LLLF = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void Gp(C1AV2 c1av2) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C0H5O(this, c1av2, null), 3);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouFp = Fp();
        if (c707380RouFp != null && (feedCommonBannerProtocol = c707380RouFp.LJFF) != null && (c0sh0LJ = feedCommonBannerProtocol.LJ()) != null) {
            c0sh0LJ.LJJIIJZLJL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouFp = Fp();
        if (c707380RouFp != null && (feedCommonBannerProtocol = c707380RouFp.LJFF) != null && (c0sh0LJ = feedCommonBannerProtocol.LJ()) != null) {
            c0sh0LJ.LJJIIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC1350790lFt interfaceC1350790lFtLJIILL;
        C2189821An6 c2189821An6;
        ITakoService iTakoService;
        C0RJN c0rjnLIZIZ;
        C2765015f.LIZJ("FeedCommonBannerAssem.onViewCreated", new AwS555S0100000_11(this, 1213));
        super.onViewCreated(view);
        FeedBottomBannerView feedBottomBannerView = (FeedBottomBannerView) view.findViewById(R.id.tr7);
        this.LLJLLIL = feedBottomBannerView;
        if (feedBottomBannerView != null) {
            feedBottomBannerView.setIconType(FeedBottomBannerConfig.IconType.LOCAL);
        }
        FeedBottomBannerView feedBottomBannerView2 = this.LLJLLIL;
        if (feedBottomBannerView2 != null) {
            setComponentClickStatusExperimental(feedBottomBannerView2, EnumC700430Rdh.POSITIVE);
        }
        C2765015f.LIZ("FeedCommonBannerAssem.onViewCreated", new AwS555S0100000_11(this, 1214));
        ITakoService iTakoService2 = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
        if (iTakoService2 != null && (interfaceC1350790lFtLJIILL = iTakoService2.LJIILL()) != null) {
            C690870R8b c690870R8bJm = jm();
            if (c690870R8bJm != null && (c0rjnLIZIZ = c690870R8bJm.LIZIZ()) != null) {
                c2189821An6 = c0rjnLIZIZ.LIZJ;
            } else {
                c2189821An6 = null;
            }
            if (interfaceC1350790lFtLJIILL.LJ(c2189821An6)) {
                FeedBottomBannerView feedBottomBannerView3 = this.LLJLLIL;
                if (feedBottomBannerView3 != null && (iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null)) != null) {
                    iTakoService.LJJZZIII(feedBottomBannerView3, null);
                }
                C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(this, LLLFF[0]), new C2217381BqS() { // from class: X.0Rsa
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C709570RsR) obj).LL);
                    }
                }, null, AFwS289S0000000_6.get$arr$(29), 6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r19) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        BannerCommonUIStruct bannerCommonUIStruct;
        BannerCommonTailAction bannerCommonTailAction;
        BannerCommonTailAction.BannerActionType tailActionType;
        FeedBottomBannerView feedBottomBannerView;
        C707380Rou c707380RouFp = Fp();
        if (c707380RouFp != null && (feedCommonBannerProtocol = c707380RouFp.LJFF) != null) {
            BannerCommonStruct bannerCommonStruct = feedCommonBannerProtocol.LL.LIZLLL;
            if (bannerCommonStruct != null && (bannerCommonUIStruct = bannerCommonStruct.bannerUIStruct) != null && (bannerCommonTailAction = bannerCommonUIStruct.tailAction) != null && (tailActionType = bannerCommonTailAction.getTailActionType()) != null && ((tailActionType == BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_TEXT_SELECTION || tailActionType == BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_BUTTON_SELECTION) && Ip() && (feedBottomBannerView = this.LLJLLIL) != null)) {
                feedBottomBannerView.LIZ(new AwS555S0100000_11(this, 1212));
            }
            feedCommonBannerProtocol.LJ().LJJLJLI();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        this.LLL = null;
        Bp();
        FeedBottomBannerView feedBottomBannerView = this.LLJLLIL;
        if (feedBottomBannerView != null) {
            feedBottomBannerView.LIZJ(C1AV3.LIZ(1, "Feed", null, "aigc_overlabel_banner"));
        }
        C707380Rou c707380RouFp = Fp();
        if (c707380RouFp != null) {
            c707380RouFp.LJFF = null;
        }
    }
}
