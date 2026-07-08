package com.ss.android.ugc.aweme.series.vip.cell;

import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1573110r2T;
import X.C1573870r3h;
import X.C1614640s7S;
import X.C1614710s7Z;
import X.C2097908Jt;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetail;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.series.feed.seriescenter.MiniDramaCenterOverViewBaseCell;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesVipSubscriptionTrendingDramaListCell extends MiniDramaCenterOverViewBaseCell<C1573110r2T> {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1114));
    public final C736950SvV LLJILJIL;

    public SeriesVipSubscriptionTrendingDramaListCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1115);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(SeriesVipSubscriptionViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(359), null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.series.feed.seriescenter.MiniDramaCenterOverViewBaseCell
    public final void onItemClick() {
        ShortDramaOverview shortDramaOverview;
        C1573110r2T c1573110r2T = (C1573110r2T) getItem();
        if (c1573110r2T == null || (shortDramaOverview = c1573110r2T.LL) == null) {
            return;
        }
        String str = ((C1614710s7Z) ((AssemViewModel) this.LLJILJIL.getValue()).getState()).LLJJIJI;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = ((C1614710s7Z) ((AssemViewModel) this.LLJILJIL.getValue()).getState()).LLILLJJLI;
        VipSubscriptionDetail vipSubscriptionDetail = vipSubscriptionDetailResponse != null ? vipSubscriptionDetailResponse.detail : null;
        Long l = shortDramaOverview.collectionId;
        C1573110r2T c1573110r2T2 = (C1573110r2T) getItem();
        C1614640s7S.LIZIZ(str, vipSubscriptionDetail, "drama", l, c1573110r2T2 != null ? Integer.valueOf(c1573110r2T2.LLILLL) : null);
        C1573870r3h c1573870r3h = C1573870r3h.LIZ;
        this.itemView.getContext();
        Long l2 = shortDramaOverview.collectionId;
        SeriesCategory seriesCategory = shortDramaOverview.category;
        if (seriesCategory == null) {
            seriesCategory = SeriesCategory.DEFAULT;
        }
        C1573870r3h.LIZIZ(c1573870r3h, "subscription_drama_list", l2, seriesCategory, null, C2097908Jt.LIZJ(new Pair("root_scene", "2")), false, null, false, 464);
    }
}
