package com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner;

import X.C0SGU;
import X.C0SGX;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes12.dex */
public final class SeriesPlayNextVM extends FeedBaseViewModel<C0SGX> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public SeriesBannerCustomizedInfo LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LL = null;
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0SGX
        };
    }

    public final SeriesBottomBannerButtonType vQ2() {
        SeriesBottomBannerButtonType seriesBottomBannerButtonType;
        if (this.LL == null) {
            VideoItemParams item = getItem();
            this.LL = C0SGU.LIZIZ(item != null ? item.getAweme() : null);
        }
        SeriesBannerCustomizedInfo seriesBannerCustomizedInfo = this.LL;
        return (seriesBannerCustomizedInfo == null || (seriesBottomBannerButtonType = seriesBannerCustomizedInfo.buttonType) == null) ? SeriesBottomBannerButtonType.DEFAULT : seriesBottomBannerButtonType;
    }

    public final String wQ2() {
        if (this.LL == null) {
            VideoItemParams item = getItem();
            this.LL = C0SGU.LIZIZ(item != null ? item.getAweme() : null);
        }
        SeriesBannerCustomizedInfo seriesBannerCustomizedInfo = this.LL;
        if (seriesBannerCustomizedInfo != null) {
            return seriesBannerCustomizedInfo.nextEpisodeVideoId;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        C0SGX c0sgx = (C0SGX) interfaceC0148002o;
        this.LL = null;
        super.paramSync2StateAccept(c0sgx, videoItemParams);
        return c0sgx;
    }
}
