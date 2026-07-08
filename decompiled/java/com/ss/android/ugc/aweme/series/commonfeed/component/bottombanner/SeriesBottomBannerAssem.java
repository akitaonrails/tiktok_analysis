package com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner;

import X.AbstractC738140SxQ;
import X.C0C64;
import X.C0SGT;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C1AV2;
import X.C1AV3;
import X.C2217381BqS;
import X.C339190DRl;
import X.C342810DcF;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C723830SaL;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonUIStruct;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.series.commonfeed.component.preload.SeriesVideoPreloadViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class SeriesBottomBannerAssem extends FeedCommonBannerAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public FeedBottomBannerView LLLFFI;
    public boolean LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeriesBottomBannerAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/series/commonfeed/component/preload/SeriesVideoPreloadViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeriesBottomBannerAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesVideoPreloadViewModel.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ, 519);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C724750Sbp.LIZIZ(this, function0LJIIJ, new AssemVMLazy(function0LJIIJ, awS555S0100000_11, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((AbstractC738140SxQ) this, 520), aFwS243S0000000_11, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this)));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLLFFI = (FeedBottomBannerView) view.findViewById(R.id.tr7);
        boolean z = false;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "paid_content_series_bottom_banner_experiment_group", true) != 0) {
            z = true;
        }
        this.LLLFZ = z;
        if (z) {
            C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 168));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerAssem
    public final void Jp(BannerCommonUIStruct bannerCommonUIStruct, FeedCommonBannerProtocol feedCommonBannerProtocol, C1AV2 c1av2) {
        BannerCommonTailAction bannerCommonTailAction;
        BannerCommonTailAction.BannerActionType tailActionType;
        FrameLayout interactionAssemArea;
        BannerCommonAction bannerCommonAction = null;
        super.Jp(bannerCommonUIStruct, feedCommonBannerProtocol, C1AV3.LIZ(1, "Feed", null, "series_banner"));
        if (bannerCommonUIStruct != null && (bannerCommonTailAction = bannerCommonUIStruct.tailAction) != null && (tailActionType = bannerCommonTailAction.getTailActionType()) != null && C0SGT.LIZ[tailActionType.ordinal()] == 1 && !this.LLLFZ) {
            FeedBottomBannerView feedBottomBannerView = this.LLLFFI;
            if (feedBottomBannerView != null && (interactionAssemArea = feedBottomBannerView.getInteractionAssemArea()) != null) {
                C339190DRl.LIZIZ(interactionAssemArea);
            }
            FeedBottomBannerView feedBottomBannerView2 = this.LLLFFI;
            if (feedBottomBannerView2 != null) {
                feedBottomBannerView2.setInteractionAction(new C342810DcF());
            }
            FeedBottomBannerView feedBottomBannerView3 = this.LLLFFI;
            if (feedBottomBannerView3 != null) {
                feedBottomBannerView3.setInteractionAreaType(FeedBottomBannerConfig.InteractionType.ARROW);
            }
            List<BannerCommonAction> list = bannerCommonTailAction.actions;
            if (list != null) {
                bannerCommonAction = (BannerCommonAction) C13LP.LJJJLL(list);
            }
            FeedBottomBannerView feedBottomBannerView4 = this.LLLFFI;
            if (feedBottomBannerView4 != null) {
                C786410Ut5.I9(feedBottomBannerView4, new ACListenerS115S0200000_11(feedCommonBannerProtocol, bannerCommonAction, 8));
            }
        }
    }
}
