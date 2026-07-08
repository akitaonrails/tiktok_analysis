package com.ss.android.ugc.aweme.poi.detail.chartv3.poilist.bigcard;

import X.C03EY;
import X.C1174170gf1;
import X.C1179110gmz;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C123100dR;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LP;
import X.C1843500y4a;
import X.C2188811AlT;
import X.C339190DRl;
import X.C418440Gaw;
import X.C438710HIf;
import X.C786410Ut5;
import X.EnumC1177490gkN;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailChartsV3BigCardReusedAssem extends ReusedUISlotAssem<PoiDetailChartsV3BigCardReusedAssem> implements InterfaceC712990Rxx<C1174170gf1> {
    public C1174170gf1 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public SmartImageView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public C03EY LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dzo;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (TuxTextView) view.findViewById(R.id.qzn);
        this.LLJLIL = (SmartImageView) view.findViewById(R.id.qzk);
        this.LLJLILLLLZIIL = (TuxIconView) view.findViewById(R.id.qzq);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.qzp);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.qzt);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.qzl);
        this.LLJZ = (C03EY) view.findViewById(R.id.qzs);
        C786410Ut5.I7(new AkS57S0200000_18(this, view, 5), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1174170gf1 c1174170gf1) {
        String poiId;
        UrlModel urlModel;
        ChartInfo chartInfo;
        String str;
        int i;
        TuxTextView tuxTextView;
        PoiDetailApi.ChartPoiReviewInfo reviewsInfo;
        Float f;
        long jLongValue;
        String poiName;
        List<UrlModel> img;
        C1174170gf1 c1174170gf12 = c1174170gf1;
        this.LLJJLIIIJLLLLLLLZ = c1174170gf12;
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_charts_v3", new C1180560gpK(getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12))), null));
        PoiDetailApi.ChartPoi chartPoi = c1174170gf12.getChartPoi();
        if (chartPoi != null) {
            poiId = chartPoi.getPoiId();
        } else {
            poiId = null;
        }
        c1180600gpO.LIZLLL = new C1202680hP0(poiId, null, null, null, null, 30);
        PoiDetailApi.ChartPoi chartPoi2 = c1174170gf12.getChartPoi();
        if (chartPoi2 != null && (img = chartPoi2.getImg()) != null) {
            urlModel = (UrlModel) C13LP.LJJJLZIJ(0, img);
        } else {
            urlModel = null;
        }
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(urlModel));
        c1189360h3WLIZ.LIZ.LIZLLL("poi_detail_chart_v3");
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(12);
        c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
        c1189360h3WLIZ.LIZLLL(this.LLJLIL);
        c1189360h3WLIZ.LIZIZ();
        TuxTextView tuxTextView2 = this.LLJL;
        if (tuxTextView2 != null) {
            PoiDetailApi.ChartPoi chartPoi3 = c1174170gf12.getChartPoi();
            if (chartPoi3 != null) {
                poiName = chartPoi3.getPoiName();
            } else {
                poiName = null;
            }
            tuxTextView2.setText(poiName);
        }
        PoiDetailApi.ChartPoi chartPoi4 = c1174170gf12.getChartPoi();
        if (chartPoi4 != null && (reviewsInfo = chartPoi4.getReviewsInfo()) != null && (f = reviewsInfo.score) != null) {
            float fFloatValue = f.floatValue();
            TuxIconView tuxIconView = this.LLJLILLLLZIIL;
            if (tuxIconView != null) {
                C339190DRl.LIZLLL(tuxIconView);
            }
            TuxTextView tuxTextView3 = this.LLJLL;
            if (tuxTextView3 != null) {
                C339190DRl.LIZLLL(tuxTextView3);
            }
            String strK4 = C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
            Object[] objArr = new Object[1];
            Long l = c1174170gf12.getChartPoi().getReviewsInfo().totalCount;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            objArr[0] = C1843500y4a.LIZIZ(jLongValue);
            String strJ4 = C786410Ut5.j4("(%s)", Arrays.copyOf(objArr, 1));
            TuxTextView tuxTextView4 = this.LLJLL;
            if (tuxTextView4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strK4);
                sbLIZ.append(strJ4);
                tuxTextView4.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            TuxIconView tuxIconView2 = this.LLJLILLLLZIIL;
            if (tuxIconView2 != null) {
                C339190DRl.LIZIZ(tuxIconView2);
            }
            TuxTextView tuxTextView5 = this.LLJLL;
            if (tuxTextView5 != null) {
                C339190DRl.LIZIZ(tuxTextView5);
            }
        }
        boolean zLIZ = C1179110gmz.LIZ(this.LLJLLL, c1174170gf12.getChartPoi(), null);
        TuxTextView tuxTextView6 = this.LLJLLIL;
        if (tuxTextView6 != null) {
            if (zLIZ && (tuxTextView = this.LLJLL) != null && tuxTextView.getVisibility() == 0) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView6, i);
        }
        PoiDetailApi.ChartPoi chartPoi5 = c1174170gf12.getChartPoi();
        if (chartPoi5 != null && (chartInfo = chartPoi5.getChartInfo()) != null && (str = chartInfo.chartTopicName) != null && C123100dR.LIZ(str)) {
            C03EY c03ey = this.LLJZ;
            if (c03ey != null) {
                C03EY.LIZ(c03ey, str, 0, null, false, null, null, null, null, null, null, null, 8189);
            }
            C03EY c03ey2 = this.LLJZ;
            if (c03ey2 != null) {
                C786410Ut5.j1(c03ey2, 0);
                return;
            }
            return;
        }
        C03EY c03ey3 = this.LLJZ;
        if (c03ey3 == null) {
            return;
        }
        C786410Ut5.j1(c03ey3, 8);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1174170gf1 c1174170gf1) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1174170gf1 c1174170gf1) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
