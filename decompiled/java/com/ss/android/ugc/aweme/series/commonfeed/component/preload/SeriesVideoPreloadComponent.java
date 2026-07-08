package com.ss.android.ugc.aweme.series.commonfeed.component.preload;

import X.C01GW;
import X.C13LE;
import X.C1EE4;
import X.C2217381BqS;
import X.C452501pT;
import X.C710430Rtp;
import X.C710440Rtq;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class SeriesVideoPreloadComponent extends BaseCellLogicComponent<SeriesVideoPreloadComponent> implements ISeriesPreloadAbility, InterfaceC1554640qYg {
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C710440Rtq());
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C710430Rtp());

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1279351047) {
            return null;
        }
        return this;
    }

    public static boolean Bo(Aweme aweme) {
        String type;
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                type = awemeRawAd.getType();
            } else {
                type = null;
            }
            if (Intrinsics.LJFF(type, "paid_content")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        String str2;
        VideoItemParams videoItemParams2 = videoItemParams;
        BaseFeedPageParams baseFeedPageParams = jm().LJ;
        if (baseFeedPageParams != null) {
            str = baseFeedPageParams.eventType;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "paid_series_detail_page")) {
            if (!Bo(videoItemParams2.getAweme())) {
                List<BannerCommonStruct> banners = videoItemParams2.getAweme().getBanners();
                if (banners != null && !banners.isEmpty()) {
                    Iterator<BannerCommonStruct> it2 = banners.iterator();
                    while (it2.hasNext()) {
                        BannerCommonKey bannerCommonKey = it2.next().bannerKey;
                        if (bannerCommonKey != null) {
                            str2 = bannerCommonKey.componentKey;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str2, "bottom_banner_series_mini_drama")) {
                        }
                    }
                    return;
                }
                return;
            }
            if (((Boolean) C1EE4.LIZIZ.getValue()).booleanValue()) {
                C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0R8X
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C0RFV) obj).LLJ;
                    }
                }, null, new AwS620S0100000_6(videoItemParams2, 156), 6);
            }
        }
    }
}
