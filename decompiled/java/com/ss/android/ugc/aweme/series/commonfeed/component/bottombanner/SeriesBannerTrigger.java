package com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner;

import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C690870R8b;
import X.C695070ROf;
import X.C707380Rou;
import X.C718360SFu;
import X.InterfaceC494301wD;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.DefaultFeedCommonBannerProtocol;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class SeriesBannerTrigger extends FeedCommonBannerTrigger {
    public final DefaultFeedCommonBannerProtocol LLJLLIL = new DefaultFeedCommonBannerProtocol("bottom_banner_series_mini_drama");

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(SeriesBottomBannerAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1707724930) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        Object obj;
        C718360SFu c718360SFu;
        PaidContentInfo paidContentInfo;
        String bottomButtonText;
        List<BannerCommonStruct> banners = videoItemParams.getAweme().getBanners();
        if (banners != null) {
            Iterator<BannerCommonStruct> it2 = banners.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                BannerCommonStruct next = it2.next();
                BannerCommonKey bannerCommonKey = next.bannerKey;
                if (bannerCommonKey != null) {
                    obj = bannerCommonKey.componentKey;
                }
                if (Intrinsics.LJFF(obj, "bottom_banner_series_mini_drama")) {
                    obj = next;
                    break;
                }
            }
            BannerCommonStruct bannerCommonStruct = (BannerCommonStruct) obj;
            if (bannerCommonStruct != null) {
                if (videoItemParams.getAweme().isPaidContent && (paidContentInfo = videoItemParams.getAweme().mPaidContentInfo) != null && Intrinsics.LJFF(paidContentInfo.getShouldShowBottomButton(), Boolean.TRUE) && (bottomButtonText = paidContentInfo.getBottomButtonText()) != null && bottomButtonText.length() != 0 && (!Intrinsics.LJFF(videoItemParams.mEventType, "paid_series_detail_page") || C695070ROf.LIZ(videoItemParams.getAweme()))) {
                    return false;
                }
                C707380Rou c707380Rou = this.LLJLIL;
                DefaultFeedCommonBannerProtocol defaultFeedCommonBannerProtocol = this.LLJLLIL;
                c707380Rou.LJFF = defaultFeedCommonBannerProtocol;
                if (defaultFeedCommonBannerProtocol != null && (c718360SFu = defaultFeedCommonBannerProtocol.LL) != null) {
                    String aid = videoItemParams.getAweme().getAid();
                    C690870R8b c690870R8bJm = jm();
                    Aweme aweme = videoItemParams.getAweme();
                    String str = videoItemParams.mEventType;
                    c718360SFu.LIZIZ = aid;
                    c718360SFu.LIZLLL = bannerCommonStruct;
                    c718360SFu.LJ = c690870R8bJm;
                    c718360SFu.LIZJ = aweme;
                    c718360SFu.LJFF = str;
                }
                return true;
            }
        }
        return false;
    }
}
