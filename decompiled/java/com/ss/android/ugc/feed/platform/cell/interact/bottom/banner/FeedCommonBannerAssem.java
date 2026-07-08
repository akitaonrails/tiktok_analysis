package com.ss.android.ugc.feed.platform.cell.interact.bottom.banner;

import X.C01GW;
import X.C07CT;
import X.C0HH2;
import X.C0HHT;
import X.C0RJN;
import X.C0SH0;
import X.C0SH7;
import X.C1110904Wd;
import X.C1111004We;
import X.C127G;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19719912Dl;
import X.C1AV2;
import X.C1AV3;
import X.C1EE1;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2765015f;
import X.C339190DRl;
import X.C342810DcF;
import X.C342820DcG;
import X.C345690Dgt;
import X.C345700Dgu;
import X.C345710Dgv;
import X.C452501pT;
import X.C690870R8b;
import X.C707380Rou;
import X.C707460Rp2;
import X.C718490SGh;
import X.C718650SGx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import X.InterfaceC1350790lFt;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS115S0200000_11;
import Y.AObjectS64S0000000_11;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonUIStruct;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.viewmodel.ITakoFeedRightBottomEntranceViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCommonBannerAssem extends BaseCellSlotComponent<FeedCommonBannerAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public FeedBottomBannerView LLJLLIL;
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1201));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1200));
    public final C707460Rp2 LLJZIJLIL = new C707460Rp2("slot");
    public final InterfaceC1731706qJ LLL;
    public C127G LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedCommonBannerAssem.class, "rightBottomViewModel", "getRightBottomViewModel()Lcom/ss/android/ugc/aweme/tako/otherpage/feed/mainentrance/viewmodel/ITakoFeedRightBottomEntranceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedCommonBannerAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ITakoFeedRightBottomEntranceViewModel.class);
        this.LLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 1205), null, AFwS243S0000000_11.get$arr$(559));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b5e;
    }

    public static ITakoService Ip() {
        return (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
    }

    public final C707380Rou Bp() {
        return (C707380Rou) this.LLJZ.getValue();
    }

    public final boolean Fp() {
        C0RJN c0rjnLIZIZ;
        C690870R8b c690870R8bJm = jm();
        return C07CT.LIZ((c690870R8bJm == null || (c0rjnLIZIZ = c690870R8bJm.LIZIZ()) == null) ? null : c0rjnLIZIZ.LIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Gp() {
        /*
            r6 = this;
            X.0Rou r0 = r6.Bp()
            r5 = 0
            if (r0 == 0) goto L30
            com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol r4 = r0.LJFF
            if (r4 == 0) goto L31
            r3 = 1
        Lc:
            X.0Rp2 r2 = r6.LLJZIJLIL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "shouldShow >>> bannerProtocol "
            r1.append(r0)
            if (r4 == 0) goto L1d
            java.lang.String r5 = r4.LIZJ()
        L1d:
            r1.append(r5)
            java.lang.String r0 = " shouldShow "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJIIIZ(r0)
            return r3
        L30:
            r4 = r5
        L31:
            r3 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerAssem.Gp():boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void H() {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouBp = Bp();
        if (c707380RouBp == null || (feedCommonBannerProtocol = c707380RouBp.LJFF) == null || (c0sh0LJ = feedCommonBannerProtocol.LJ()) == null) {
            return;
        }
        c0sh0LJ.H();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouBp = Bp();
        if (c707380RouBp == null || (feedCommonBannerProtocol = c707380RouBp.LJFF) == null || (c0sh0LJ = feedCommonBannerProtocol.LJ()) == null) {
            return;
        }
        c0sh0LJ.LJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouBp = Bp();
        if (c707380RouBp == null || (feedCommonBannerProtocol = c707380RouBp.LJFF) == null || (c0sh0LJ = feedCommonBannerProtocol.LJ()) == null) {
            return;
        }
        c0sh0LJ.LJLLLL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouBp = Bp();
        if (c707380RouBp == null || (feedCommonBannerProtocol = c707380RouBp.LJFF) == null || (c0sh0LJ = feedCommonBannerProtocol.LJ()) == null) {
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
                    C127G c127g2 = new C127G(new Object[]{ITakoFeedRightBottomEntranceViewModel.class, new AObjectS64S0000000_11(this, 2)}, defaultViewModelProviderFactory);
                    this.LLLF = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void Ep(C1AV2 c1av2) {
        C2180521AVm.LIZLLL(LJJIJL(), 8, c1av2);
        C2180521AVm.LIZLLL(getContentView(), 8, c1av2);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouBp = Bp();
        if (c707380RouBp != null && (feedCommonBannerProtocol = c707380RouBp.LJFF) != null && (c0sh0LJ = feedCommonBannerProtocol.LJ()) != null) {
            c0sh0LJ.LJJIIJZLJL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        C0SH0 c0sh0LJ;
        C707380Rou c707380RouBp = Bp();
        if (c707380RouBp != null && (feedCommonBannerProtocol = c707380RouBp.LJFF) != null && (c0sh0LJ = feedCommonBannerProtocol.LJ()) != null) {
            c0sh0LJ.LJJIIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        ITakoService iTakoServiceIp;
        InterfaceC1350790lFt interfaceC1350790lFtLJIILL;
        C2189821An6 c2189821An6;
        C0RJN c0rjnLIZIZ;
        C2765015f.LIZJ("FeedCommonBannerAssem.onViewCreated", new AwS555S0100000_11(this, 1203));
        super.onViewCreated(view);
        FeedBottomBannerView feedBottomBannerView = (FeedBottomBannerView) view.findViewById(R.id.tr7);
        this.LLJLLIL = feedBottomBannerView;
        if (feedBottomBannerView != null) {
            feedBottomBannerView.setCompactRightAreaEnabled(Fp());
        }
        FeedBottomBannerView feedBottomBannerView2 = this.LLJLLIL;
        if (feedBottomBannerView2 != null) {
            feedBottomBannerView2.setIconType(FeedBottomBannerConfig.IconType.LOCAL);
        }
        FeedBottomBannerView feedBottomBannerView3 = this.LLJLLIL;
        if (feedBottomBannerView3 != null) {
            setComponentClickStatusExperimental(feedBottomBannerView3, EnumC700430Rdh.POSITIVE);
        }
        C2765015f.LIZ("FeedCommonBannerAssem.onViewCreated", new AwS555S0100000_11(this, 1204));
        Integer num = null;
        int iLJJL = 0;
        if (!Fp()) {
            ITakoService iTakoServiceIp2 = Ip();
            if (iTakoServiceIp2 != null && (interfaceC1350790lFtLJIILL = iTakoServiceIp2.LJIILL()) != null) {
                C690870R8b c690870R8bJm = jm();
                if (c690870R8bJm != null && (c0rjnLIZIZ = c690870R8bJm.LIZIZ()) != null) {
                    c2189821An6 = c0rjnLIZIZ.LIZJ;
                } else {
                    c2189821An6 = null;
                }
                if (!interfaceC1350790lFtLJIILL.LJ(c2189821An6)) {
                    return;
                }
            } else {
                return;
            }
        }
        FeedBottomBannerView feedBottomBannerView4 = this.LLJLLIL;
        if (feedBottomBannerView4 != null && (iTakoServiceIp = Ip()) != null) {
            Integer numValueOf = Integer.valueOf(C1111004We.LIZ());
            numValueOf.intValue();
            if (Fp() && C1110904Wd.LIZ()) {
                num = numValueOf;
            }
            iTakoServiceIp.LJJZZIII(feedBottomBannerView4, num);
        }
        if (Fp()) {
            FeedBottomBannerView feedBottomBannerView5 = this.LLJLLIL;
            if (feedBottomBannerView5 != null) {
                ITakoService iTakoServiceIp3 = Ip();
                if (iTakoServiceIp3 != null) {
                    iLJJL = iTakoServiceIp3.LJJL();
                }
                feedBottomBannerView5.setExtraEndPadding(iLJJL);
                return;
            }
            return;
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(this, LLLFF[0]), new C2217381BqS() { // from class: X.0Rsb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C709570RsR) obj).LL);
            }
        }, null, AFwS294S0000000_11.get$arr$(208), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        BannerCommonStruct bannerCommonStruct;
        BannerCommonTailAction bannerCommonTailAction;
        BannerCommonTailAction.BannerActionType tailActionType;
        VideoItemParams videoItemParams2 = videoItemParams;
        C2765015f.LIZJ("FeedCommonBannerAssem.onBind", new AwS412S0200000_11(videoItemParams2, this, 54));
        C707460Rp2 c707460Rp2 = this.LLJZIJLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind >>> ");
        sbLIZ.append(videoItemParams2.getAweme());
        c707460Rp2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (Gp()) {
            C707380Rou c707380RouBp = Bp();
            if (c707380RouBp != null && (feedCommonBannerProtocol = c707380RouBp.LJFF) != null && (bannerCommonStruct = feedCommonBannerProtocol.LL.LIZLLL) != null) {
                Qp(bannerCommonStruct, feedCommonBannerProtocol);
                BannerCommonUIStruct bannerCommonUIStruct = bannerCommonStruct.bannerUIStruct;
                if (bannerCommonUIStruct == null || (bannerCommonTailAction = bannerCommonUIStruct.tailAction) == null || (tailActionType = bannerCommonTailAction.getTailActionType()) == null || (tailActionType != BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_TEXT_SELECTION && tailActionType != BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_BUTTON_SELECTION)) {
                    C786410Ut5.LJLLLLLL(0, LJJIJL());
                    C786410Ut5.LJLLLLLL(0, getContentView());
                }
            }
        } else {
            Ep(C1AV3.LIZ(4, "Feed", null, "common_banner"));
        }
        C2765015f.LIZ("FeedCommonBannerAssem.onBind", new AwS412S0200000_11(videoItemParams2, this, 55));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        FeedCommonBannerProtocol feedCommonBannerProtocol;
        BannerCommonUIStruct bannerCommonUIStruct;
        BannerCommonTailAction bannerCommonTailAction;
        BannerCommonTailAction.BannerActionType tailActionType;
        FeedBottomBannerView feedBottomBannerView;
        BannerCommonStruct bannerCommonStruct;
        C707380Rou c707380RouBp = Bp();
        if (c707380RouBp != null && (feedCommonBannerProtocol = c707380RouBp.LJFF) != null) {
            if (C1EE1.LIZIZ.LJJJ() && Gp() && (bannerCommonStruct = feedCommonBannerProtocol.LL.LIZLLL) != null) {
                Qp(bannerCommonStruct, feedCommonBannerProtocol);
            }
            BannerCommonStruct bannerCommonStruct2 = feedCommonBannerProtocol.LL.LIZLLL;
            if (bannerCommonStruct2 != null && (bannerCommonUIStruct = bannerCommonStruct2.bannerUIStruct) != null && (bannerCommonTailAction = bannerCommonUIStruct.tailAction) != null && (tailActionType = bannerCommonTailAction.getTailActionType()) != null && ((tailActionType == BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_TEXT_SELECTION || tailActionType == BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_BUTTON_SELECTION) && Gp() && (feedBottomBannerView = this.LLJLLIL) != null)) {
                feedBottomBannerView.LIZ(new AwS555S0100000_11(this, 1202));
            }
            feedCommonBannerProtocol.LJ().LJJLJLI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Qp(com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct r13, com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol r14) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerAssem.Qp(com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct, com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        FeedBottomBannerView feedBottomBannerView = this.LLJLLIL;
        if (feedBottomBannerView != null) {
            feedBottomBannerView.LIZJ(C1AV3.LIZ(1, "Feed", null, "common_banner"));
        }
        C707380Rou c707380RouBp = Bp();
        if (c707380RouBp != null) {
            c707380RouBp.LJFF = null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void Jp(BannerCommonUIStruct bannerCommonUIStruct, FeedCommonBannerProtocol feedCommonBannerProtocol, C1AV2 c1av2) {
        BannerCommonTailAction bannerCommonTailAction;
        String str;
        FrameLayout interactionAssemArea;
        BannerCommonAction bannerCommonAction;
        C0SH7 c0sh7;
        List<BannerCommonAction> list;
        BannerCommonAction bannerCommonAction2;
        String str2;
        BannerCommonAction bannerCommonAction3 = null;
        Object obj = null;
        BannerCommonAction bannerCommonAction4 = null;
        if (bannerCommonUIStruct != null && (bannerCommonTailAction = bannerCommonUIStruct.tailAction) != null) {
            String str3 = "";
            switch (C718490SGh.LIZIZ[bannerCommonTailAction.getTailActionType().ordinal()]) {
                case 1:
                    FeedBottomBannerView feedBottomBannerView = this.LLJLLIL;
                    if (feedBottomBannerView != null) {
                        feedBottomBannerView.setInteractionAction(new C342810DcF());
                    }
                    FeedBottomBannerView feedBottomBannerView2 = this.LLJLLIL;
                    if (feedBottomBannerView2 != null) {
                        feedBottomBannerView2.setInteractionAreaType(FeedBottomBannerConfig.InteractionType.ARROW);
                    }
                    List<BannerCommonAction> list2 = bannerCommonTailAction.actions;
                    if (list2 != null) {
                        bannerCommonAction3 = (BannerCommonAction) C13LP.LJJJLL(list2);
                    }
                    C707460Rp2 c707460Rp2 = this.LLJZIJLIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateTailActions >>> BANNER_ACTION_TYPE_ARROW_JUMP action ");
                    sbLIZ.append(bannerCommonAction3);
                    c707460Rp2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                    FeedBottomBannerView feedBottomBannerView3 = this.LLJLLIL;
                    if (feedBottomBannerView3 != null) {
                        C786410Ut5.I9(feedBottomBannerView3, new ACListenerS115S0200000_11(feedCommonBannerProtocol, bannerCommonAction3, 13));
                        return;
                    }
                    return;
                case 2:
                    FeedBottomBannerView feedBottomBannerView4 = this.LLJLLIL;
                    if (feedBottomBannerView4 != null) {
                        C0HH2 c0hh2 = new C0HH2();
                        List<BannerCommonAction> list3 = bannerCommonTailAction.actions;
                        if (list3 != null) {
                            int i = 0;
                            for (BannerCommonAction bannerCommonAction5 : list3) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    BannerCommonAction bannerCommonAction6 = bannerCommonAction5;
                                    C707460Rp2 c707460Rp22 = this.LLJZIJLIL;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("updateTailActions >>> BANNER_ACTION_TYPE_BUTTON_SELECTION action ");
                                    sbLIZ2.append(bannerCommonAction6);
                                    c707460Rp22.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                    if (i != 0) {
                                        if (i == 1) {
                                            String str4 = bannerCommonAction6.text;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            c0hh2.LIZJ(str4, new AwS590S0100000_11(this, 324), new AwS220S0300000_11(feedCommonBannerProtocol, bannerCommonAction6, this, 14));
                                        }
                                    } else {
                                        String str5 = bannerCommonAction6.text;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        c0hh2.LIZIZ(str5, new AwS590S0100000_11(this, 323), new AwS220S0300000_11(feedCommonBannerProtocol, bannerCommonAction6, this, 13));
                                    }
                                    i = i2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                        feedBottomBannerView4.setInteractionAction(c0hh2);
                    }
                    FeedBottomBannerView feedBottomBannerView5 = this.LLJLLIL;
                    if (feedBottomBannerView5 != null) {
                        feedBottomBannerView5.setInteractionAreaType(FeedBottomBannerConfig.InteractionType.BUTTON);
                        return;
                    }
                    return;
                case 3:
                    FeedBottomBannerView feedBottomBannerView6 = this.LLJLLIL;
                    if (feedBottomBannerView6 != null) {
                        C345710Dgv c345710Dgv = new C345710Dgv();
                        List<BannerCommonAction> list4 = bannerCommonTailAction.actions;
                        if (list4 != null) {
                            bannerCommonAction4 = (BannerCommonAction) C13LP.LJJJLL(list4);
                        }
                        C707460Rp2 c707460Rp23 = this.LLJZIJLIL;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("updateTailActions >>> BANNER_ACTION_TYPE_TEXT_SELECTION action ");
                        sbLIZ3.append(bannerCommonAction4);
                        c707460Rp23.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        if (bannerCommonAction4 != null && (str = bannerCommonAction4.text) != null) {
                            str3 = str;
                        }
                        c345710Dgv.LIZ = new C345700Dgu(str3, new AwS590S0100000_11(this, 325), new AwS220S0300000_11(feedCommonBannerProtocol, bannerCommonAction4, this, 15));
                        feedBottomBannerView6.setInteractionAction(c345710Dgv);
                    }
                    FeedBottomBannerView feedBottomBannerView7 = this.LLJLLIL;
                    if (feedBottomBannerView7 != null) {
                        feedBottomBannerView7.setInteractionAreaType(FeedBottomBannerConfig.InteractionType.TEXT);
                        return;
                    }
                    return;
                case 4:
                    FeedBottomBannerView feedBottomBannerView8 = this.LLJLLIL;
                    if (feedBottomBannerView8 != null) {
                        C342820DcG c342820DcG = new C342820DcG();
                        new AwS590S0100000_11(this, 326);
                        c342820DcG.LIZ = new AwS377S0200000_11(this, feedCommonBannerProtocol, 77);
                        feedBottomBannerView8.setInteractionAction(c342820DcG);
                    }
                    FeedBottomBannerView feedBottomBannerView9 = this.LLJLLIL;
                    if (feedBottomBannerView9 != null) {
                        feedBottomBannerView9.setInteractionAreaType(FeedBottomBannerConfig.InteractionType.CLOSE);
                        return;
                    }
                    return;
                case 5:
                    FeedBottomBannerView feedBottomBannerView10 = this.LLJLLIL;
                    if (feedBottomBannerView10 != null) {
                        feedBottomBannerView10.setInteractionAreaType(FeedBottomBannerConfig.InteractionType.UNKNOWN);
                        return;
                    }
                    return;
                case 6:
                    FeedBottomBannerView feedBottomBannerView11 = this.LLJLLIL;
                    if (feedBottomBannerView11 != null && (interactionAssemArea = feedBottomBannerView11.getInteractionAssemArea()) != null) {
                        C339190DRl.LIZLLL(interactionAssemArea);
                    }
                    FeedBottomBannerView feedBottomBannerView12 = this.LLJLLIL;
                    if (feedBottomBannerView12 != null) {
                        feedBottomBannerView12.setInteractionAreaType(FeedBottomBannerConfig.InteractionType.CUSTOM);
                        return;
                    }
                    return;
                case 7:
                    List<BannerCommonAction> list5 = bannerCommonTailAction.actions;
                    if (list5 != null) {
                        bannerCommonAction = (BannerCommonAction) C13LP.LJJJLL(list5);
                    } else {
                        bannerCommonAction = null;
                    }
                    boolean zLJFF = Intrinsics.LJFF(feedCommonBannerProtocol.LIZJ(), "bottom_banner_offline_mode");
                    if (C1EE1.LIZIZ.LJJJ() && zLJFF) {
                        C345690Dgt c345690Dgt = new C345690Dgt();
                        C707460Rp2 c707460Rp24 = this.LLJZIJLIL;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("updateTailActions >>> BANNER_ACTION_TYPE_TEXT_ICON (offline) action ");
                        sbLIZ4.append(bannerCommonAction);
                        c707460Rp24.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4));
                        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 327);
                        AwS377S0200000_11 awS377S0200000_11 = new AwS377S0200000_11(feedCommonBannerProtocol, bannerCommonAction, 78);
                        BannerCommonTailAction bannerCommonTailAction2 = bannerCommonUIStruct.tailAction;
                        if (bannerCommonTailAction2 != null && (list = bannerCommonTailAction2.actions) != null && (bannerCommonAction2 = (BannerCommonAction) C13LP.LJJJLL(list)) != null && (str2 = bannerCommonAction2.text) != null) {
                            str3 = str2;
                        }
                        c345690Dgt.LIZ = new C345700Dgu(str3, awS590S0100000_11, awS377S0200000_11);
                        c0sh7 = c345690Dgt;
                    } else {
                        C718650SGx c718650SGx = new C718650SGx();
                        C707460Rp2 c707460Rp25 = this.LLJZIJLIL;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("updateTailActions >>> BANNER_ACTION_TYPE_TEXT_ICON action ");
                        sbLIZ5.append(bannerCommonAction);
                        c707460Rp25.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5));
                        C724270Sb3 c724270Sb3 = this.LLJI;
                        if (c724270Sb3 != null) {
                            obj = c724270Sb3.LL;
                        }
                        C718650SGx.LIZIZ(c718650SGx, ((VideoItemParams) obj).getAweme(), feedCommonBannerProtocol.LL.LIZLLL, bannerCommonUIStruct, new AwS590S0100000_11(this, 328));
                        c0sh7 = c718650SGx;
                    }
                    FeedBottomBannerView feedBottomBannerView13 = this.LLJLLIL;
                    if (feedBottomBannerView13 != null) {
                        feedBottomBannerView13.setInteractionAction(c0sh7);
                    }
                    FeedBottomBannerView feedBottomBannerView14 = this.LLJLLIL;
                    if (feedBottomBannerView14 != null) {
                        C786410Ut5.I9(feedBottomBannerView14, new ACListenerS115S0200000_11(feedCommonBannerProtocol, bannerCommonAction, 14));
                    }
                    FeedBottomBannerView feedBottomBannerView15 = this.LLJLLIL;
                    if (feedBottomBannerView15 != null) {
                        feedBottomBannerView15.setInteractionAreaType(FeedBottomBannerConfig.InteractionType.SEARCH_TAKO_TEXT_ICON);
                        return;
                    }
                    return;
                default:
                    throw new C1954807lC();
            }
        }
        FeedBottomBannerView feedBottomBannerView16 = this.LLJLLIL;
        if (feedBottomBannerView16 != null) {
            feedBottomBannerView16.LIZIZ(c1av2);
        }
    }
}
