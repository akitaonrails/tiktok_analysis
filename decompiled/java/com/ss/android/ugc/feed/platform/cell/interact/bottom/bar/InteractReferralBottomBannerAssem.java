package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C697680RYg;
import com.ss.android.ugc.aweme.feed.IFeedSpecActService;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractReferralBottomBannerAssem extends InteractBottomBannerAssem<InteractReferralBottomBannerAssem> {
    public final String LLLFFI = "bottom_banner_referral";

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String Jp() {
        return this.LLLFFI;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final FeedBottomBannerConfig Up(FeedBottomBannerConfig.Builder builder) {
        builder.setIconWithRemoteLighten(AFwS236S0000000_6.get$arr$(494));
        builder.setUpdateTitleSync(false);
        builder.setInteractionWithArrow(AFwS243S0000000_11.get$arr$(211));
        return builder.build();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean dq(VideoItemParams videoItemParams) {
        return C697680RYg.LIZ(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final void fq(VideoItemParams videoItemParams) {
        super.fq(videoItemParams);
        ((IFeedSpecActService) ServiceManager.get().getService(IFeedSpecActService.class)).LJI(LJJIJL().getContext(), videoItemParams.getAweme(), new AwS590S0100000_11(this, 337), new AwS625S0100000_11(this, 91));
    }
}
