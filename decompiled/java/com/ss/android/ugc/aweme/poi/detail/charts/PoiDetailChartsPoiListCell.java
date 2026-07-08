package com.ss.android.ugc.aweme.poi.detail.charts;

import X.C1180600gpO;
import X.C1181430gqj;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C1203310hQ1;
import X.C13LP;
import X.C1843500y4a;
import X.C339190DRl;
import X.C438710HIf;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailChartsPoiListCell extends PowerCell<PoiDetailApi.ChartPoi> {
    public View LL;
    public TuxTextView LLILLJJLI;
    public SmartImageView LLILLL;
    public C1203310hQ1 LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Float f;
        long jLongValue;
        UrlModel urlModel;
        PoiDetailApi.ChartPoi chartPoi = (PoiDetailApi.ChartPoi) interfaceC1891350zJl;
        List<UrlModel> img = chartPoi.getImg();
        String str = null;
        if (img != null && (urlModel = (UrlModel) C13LP.LJJJLZIJ(0, img)) != null && this.LLILLL != null) {
            C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_top_picks", null);
            c1180600gpO.LIZLLL = new C1202680hP0(chartPoi.getPoiId(), null, null, null, null, 30);
            C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(urlModel));
            c1189360h3WLIZ.LIZ.LIZLLL("poi_detail_chart_cell");
            c1189360h3WLIZ.LIZLLL(this.LLILLL);
            c1189360h3WLIZ.LIZIZ();
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(chartPoi.getPoiName());
        }
        TuxTextView tuxTextView2 = this.LLIZ;
        if (tuxTextView2 != null) {
            ChartInfo chartInfo = chartPoi.getChartInfo();
            if (chartInfo != null) {
                str = chartInfo.chartTopicName;
            }
            tuxTextView2.setText(str);
        }
        PoiDetailApi.ChartPoiReviewInfo reviewsInfo = chartPoi.getReviewsInfo();
        if (reviewsInfo != null && (f = reviewsInfo.score) != null) {
            float fFloatValue = f.floatValue();
            C1203310hQ1 c1203310hQ1 = this.LLILZ;
            if (c1203310hQ1 != null) {
                C339190DRl.LIZLLL(c1203310hQ1);
            }
            TuxTextView tuxTextView3 = this.LLILZIL;
            if (tuxTextView3 != null) {
                C339190DRl.LIZLLL(tuxTextView3);
            }
            TuxTextView tuxTextView4 = this.LLILZLL;
            if (tuxTextView4 != null) {
                C339190DRl.LIZLLL(tuxTextView4);
            }
            C1203310hQ1 c1203310hQ12 = this.LLILZ;
            if (c1203310hQ12 != null) {
                c1203310hQ12.setValue(fFloatValue);
            }
            TuxTextView tuxTextView5 = this.LLILZIL;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1)));
            }
            TuxTextView tuxTextView6 = this.LLILZLL;
            if (tuxTextView6 != null) {
                Object[] objArr = new Object[1];
                Long l = chartPoi.getReviewsInfo().totalCount;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                objArr[0] = C1843500y4a.LIZIZ(jLongValue);
                tuxTextView6.setText(C786410Ut5.j4("(%s)", Arrays.copyOf(objArr, 1)));
            }
        } else {
            C1203310hQ1 c1203310hQ13 = this.LLILZ;
            if (c1203310hQ13 != null) {
                C339190DRl.LIZIZ(c1203310hQ13);
            }
            TuxTextView tuxTextView7 = this.LLILZIL;
            if (tuxTextView7 != null) {
                C339190DRl.LIZIZ(tuxTextView7);
            }
            TuxTextView tuxTextView8 = this.LLILZLL;
            if (tuxTextView8 != null) {
                C339190DRl.LIZIZ(tuxTextView8);
            }
        }
        C1189060h32.LJJIIJ(this.itemView, new AwS384S0200000_18(this, chartPoi, 258));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZIZ;
        if (!SlashComponentUIPreloadExp.LIZ("poi_charts_card") && !SlashComponentUIPreloadExp.LIZ("poi_tab_charts")) {
            viewLIZIZ = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dzj, viewGroup, false);
        } else {
            viewLIZIZ = C1181430gqj.LIZIZ(viewGroup.getContext(), R.layout.dzj, viewGroup, false);
        }
        this.LL = viewLIZIZ.findViewById(R.id.don);
        this.LLILLL = (SmartImageView) viewLIZIZ.findViewById(R.id.r3g);
        this.LLILLJJLI = (TuxTextView) viewLIZIZ.findViewById(R.id.r4z);
        this.LLILZ = (C1203310hQ1) viewLIZIZ.findViewById(R.id.srg);
        this.LLIZ = (TuxTextView) viewLIZIZ.findViewById(R.id.dou);
        this.LLILZIL = (TuxTextView) viewLIZIZ.findViewById(R.id.srq);
        this.LLILZLL = (TuxTextView) viewLIZIZ.findViewById(R.id.srv);
        return viewLIZIZ;
    }
}
