package com.ss.android.ugc.aweme.poi.detail.chartv3.poilist.smallcard;

import X.C03EY;
import X.C1174180gf2;
import X.C1180060goW;
import X.C1180600gpO;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C123100dR;
import X.C13LP;
import X.C1843500y4a;
import X.C2188811AlT;
import X.C339190DRl;
import X.C438710HIf;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
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
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailChartsV3SmallCardReusedAssem extends ReusedUISlotAssem<PoiDetailChartsV3SmallCardReusedAssem> implements InterfaceC712990Rxx<C1174180gf2> {
    public C1174180gf2 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public SmartImageView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public C03EY LLJZ;
    public ViewGroup LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dzp;
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
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.qzj);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.qzl);
        this.LLJZ = (C03EY) view.findViewById(R.id.qzs);
        this.LLJZIJLIL = (ViewGroup) view.findViewById(R.id.qzr);
        C786410Ut5.I7(new AkS57S0200000_18(this, view, 6), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1174180gf2 c1174180gf2) {
        ChartInfo chartInfo;
        String str;
        PoiDetailApi.ChartPoiReviewInfo reviewsInfo;
        Float f;
        long jLongValue;
        String poiName;
        List<UrlModel> img;
        UrlModel urlModel;
        C1174180gf2 c1174180gf22 = c1174180gf2;
        this.LLJJLIIIJLLLLLLLZ = c1174180gf22;
        PoiDetailApi.ChartPoi chartPoi = c1174180gf22.getChartPoi();
        if (chartPoi != null && (img = chartPoi.getImg()) != null && (urlModel = (UrlModel) C13LP.LJJJLZIJ(0, img)) != null) {
            C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_charts_v3", null);
            c1180600gpO.LIZLLL = new C1202680hP0(c1174180gf22.getChartPoi().getPoiId(), null, null, null, null, 30);
            C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(urlModel));
            c1189360h3WLIZ.LIZ.LIZLLL("poi_detail_chart_v3");
            c1189360h3WLIZ.LIZLLL(this.LLJLIL);
            c1189360h3WLIZ.LIZIZ();
        }
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            PoiDetailApi.ChartPoi chartPoi2 = c1174180gf22.getChartPoi();
            if (chartPoi2 != null) {
                poiName = chartPoi2.getPoiName();
            } else {
                poiName = null;
            }
            tuxTextView.setText(poiName);
        }
        PoiDetailApi.ChartPoi chartPoi3 = c1174180gf22.getChartPoi();
        if (chartPoi3 != null && (reviewsInfo = chartPoi3.getReviewsInfo()) != null && (f = reviewsInfo.score) != null) {
            float fFloatValue = f.floatValue();
            TuxIconView tuxIconView = this.LLJLILLLLZIIL;
            if (tuxIconView != null) {
                C339190DRl.LIZLLL(tuxIconView);
            }
            TuxTextView tuxTextView2 = this.LLJLL;
            if (tuxTextView2 != null) {
                C339190DRl.LIZLLL(tuxTextView2);
            }
            String strK4 = C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
            Object[] objArr = new Object[1];
            Long l = c1174180gf22.getChartPoi().getReviewsInfo().totalCount;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            objArr[0] = C1843500y4a.LIZIZ(jLongValue);
            String strJ4 = C786410Ut5.j4("(%s)", Arrays.copyOf(objArr, 1));
            TuxTextView tuxTextView3 = this.LLJLL;
            if (tuxTextView3 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strK4);
                sbLIZ.append(strJ4);
                tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            TuxIconView tuxIconView2 = this.LLJLILLLLZIIL;
            if (tuxIconView2 != null) {
                C339190DRl.LIZIZ(tuxIconView2);
            }
            TuxTextView tuxTextView4 = this.LLJLL;
            if (tuxTextView4 != null) {
                C339190DRl.LIZIZ(tuxTextView4);
            }
        }
        PoiDetailApi.ChartPoi chartPoi4 = c1174180gf22.getChartPoi();
        if (chartPoi4 != null && (chartInfo = chartPoi4.getChartInfo()) != null && (str = chartInfo.chartTopicName) != null && C123100dR.LIZ(str)) {
            C03EY c03ey = this.LLJZ;
            if (c03ey != null) {
                C03EY.LIZ(c03ey, str, 91, null, false, null, null, null, null, null, null, null, 8185);
            }
            C03EY c03ey2 = this.LLJZ;
            if (c03ey2 != null) {
                C786410Ut5.j1(c03ey2, 0);
            }
        } else {
            C03EY c03ey3 = this.LLJZ;
            if (c03ey3 != null) {
                C786410Ut5.j1(c03ey3, 8);
            }
        }
        ViewGroup viewGroup = this.LLJZIJLIL;
        if (viewGroup != null) {
            C1180060goW.LJIILL(viewGroup, new AwS384S0200000_18(this, c1174180gf22, 275));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1174180gf2 c1174180gf2) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1174180gf2 c1174180gf2) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
