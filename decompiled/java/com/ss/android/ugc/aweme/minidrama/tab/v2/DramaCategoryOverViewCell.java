package com.ss.android.ugc.aweme.minidrama.tab.v2;

import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1559210qg3;
import X.C1573110r2T;
import X.C1573870r3h;
import X.C19ME;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C296910BkP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.seriescenter.MiniDramaCenterOverViewBaseCell;
import com.ss.android.ugc.aweme.series.vip.cell.SeriesVipSubscriptionTrendingDramaListCell;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaCategoryOverViewCell extends MiniDramaCenterOverViewBaseCell<C1573110r2T> {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 756));
    public final C736950SvV LLJILJIL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.series.feed.seriescenter.MiniDramaCenterOverViewBaseCell
    public final void onItemClick() {
        DramaCategoryContentListModel dramaCategoryContentListModel = (DramaCategoryContentListModel) this.LLJILJIL.getValue();
        if (getContext() == null) {
            this.itemView.getContext();
        }
        C1573110r2T c1573110r2T = (C1573110r2T) getItem();
        ShortDramaOverview shortDramaOverview = c1573110r2T != null ? c1573110r2T.LL : null;
        getAbsoluteAdapterPosition();
        if (shortDramaOverview != null) {
            C1559210qg3 c1559210qg3VQ2 = dramaCategoryContentListModel.vQ2();
            SeriesCenterCenterScene seriesCenterCenterScene = c1559210qg3VQ2 != null ? c1559210qg3VQ2.LL : null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("series_tab_");
            sbLIZ.append(seriesCenterCenterScene != null ? seriesCenterCenterScene.metricName : null);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1573870r3h c1573870r3h = C1573870r3h.LIZ;
            Long l = shortDramaOverview.collectionId;
            SeriesCategory seriesCategory = shortDramaOverview.category;
            if (seriesCategory == null) {
                seriesCategory = SeriesCategory.DEFAULT;
            }
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("series_enter_entrance", strLIZIZ), new Pair("root_scene", "2"));
            C1559210qg3 c1559210qg3VQ22 = dramaCategoryContentListModel.vQ2();
            C1573870r3h.LIZIZ(c1573870r3h, "homepage_series", l, seriesCategory, null, mapLJIIIIZZ, c1559210qg3VQ22 != null && c1559210qg3VQ22.LLILLJJLI, null, C296910BkP.LIZ(), 144);
        }
    }

    public DramaCategoryOverViewCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 757);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(DramaCategoryContentListModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(225), null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.series.feed.seriescenter.MiniDramaCenterOverViewBaseCell
    public final boolean L5() {
        if (C296910BkP.LIZ()) {
            return false;
        }
        return !(this instanceof SeriesVipSubscriptionTrendingDramaListCell);
    }

    @Override // com.ss.android.ugc.aweme.series.feed.seriescenter.MiniDramaCenterOverViewBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View viewFindViewById;
        super.onItemViewCreated();
        if (!C296910BkP.LIZ() || (viewFindViewById = this.itemView.findViewById(R.id.f750m4p)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C19ME c19me = (C19ME) layoutParams;
        c19me.endToEnd = -1;
        c19me.startToStart = R.id.e7c;
        C786410Ut5.W5(viewFindViewById, c19me);
    }

    @Override // com.ss.android.ugc.aweme.series.feed.seriescenter.MiniDramaCenterOverViewBaseCell
    /* JADX INFO: renamed from: I5 */
    public final void onBindItemView(C1573110r2T c1573110r2T) {
        View viewFindViewById;
        int i;
        super.onBindItemView(c1573110r2T);
        if (!C296910BkP.LIZ() || (viewFindViewById = this.itemView.findViewById(R.id.f750m4p)) == null || viewFindViewById.getVisibility() != 0) {
            return;
        }
        ShortDramaOverview shortDramaOverview = c1573110r2T.LL;
        Boolean bool = shortDramaOverview.labelHot;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            i = R.drawable.arz;
        } else if (!Intrinsics.LJFF(shortDramaOverview.labelNew, bool2)) {
            return;
        } else {
            i = R.drawable.arx;
        }
        viewFindViewById.setBackground(C800330VaR.LIZIZ(viewFindViewById.getContext(), i));
    }

    @Override // com.ss.android.ugc.aweme.series.feed.seriescenter.MiniDramaCenterOverViewBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C1573110r2T) interfaceC1891350zJl);
    }
}
