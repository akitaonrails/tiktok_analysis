package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta;

import X.C1185410gx9;
import X.C1185430gxB;
import X.C1186930gzb;
import X.C1186970gzf;
import X.C1252710ihh;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C18JG;
import X.C197039127h;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1184330gvP;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingProviderInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import wh6.AbS508S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetail3rdPartyPartnerAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1186930gzb.class, "PoiDetailReserveHierarchyData"), checkSupervisorPrepared());
    public C1185410gx9 LLJJIII;
    public C197039127h LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e33;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1185410gx9 c1185410gx9Nf;
        PoiBookingInfo poiBookingInfo;
        List<PoiBookingProviderInfo> list;
        PoiBookingProviderInfo poiBookingProviderInfo;
        C1186970gzf c1186970gzf;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String adClickId;
        String activitySource;
        String activityPageId;
        String requestId;
        InterfaceC1184330gvP interfaceC1184330gvP;
        super.onViewCreated(view);
        String str8 = null;
        try {
            interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (interfaceC1184330gvP != null) {
            c1185410gx9Nf = interfaceC1184330gvP.Nf();
        } else {
            c1185410gx9Nf = null;
        }
        this.LLJJIII = c1185410gx9Nf;
        this.LLJJIJI = (C197039127h) view.findViewById(R.id.r0m);
        C1186930gzb c1186930gzb = (C1186930gzb) this.LLJJI.getValue();
        if (c1186930gzb != null && (poiBookingInfo = c1186930gzb.LL) != null && (list = poiBookingInfo.providers) != null && (poiBookingProviderInfo = (PoiBookingProviderInfo) C13LP.LJJJLL(list)) != null) {
            C197039127h c197039127h = this.LLJJIJI;
            if (c197039127h != null) {
                c197039127h.setText(poiBookingProviderInfo.title);
            }
            C197039127h c197039127h2 = this.LLJJIJI;
            if (c197039127h2 != null) {
                C786410Ut5.I7(new AbS508S0200000_18(poiBookingProviderInfo, this, 10, 42), c197039127h2);
            }
            String strLIZLLL = C18JG.LIZLLL(PageFinder.via((View) this.LLJJIJI), "c74061.d0923", null);
            C1186930gzb c1186930gzb2 = (C1186930gzb) this.LLJJI.getValue();
            if (c1186930gzb2 != null) {
                c1186970gzf = c1186930gzb2.LLILLJJLI;
            } else {
                c1186970gzf = null;
            }
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            Integer num = poiBookingProviderInfo.provider;
            if (c1186970gzf != null) {
                str8 = c1186970gzf.poiId;
                str = c1186970gzf.poiRegionCode;
                str2 = c1186970gzf.poiCity;
                str3 = c1186970gzf.ttTypeCode;
                str4 = c1186970gzf.collectInfo;
                str5 = c1186970gzf.trackInfo;
                str6 = c1186970gzf.entranceEnterFrom;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
            }
            String str9 = "";
            if (str6 == null) {
                str6 = "";
            }
            if (c1186970gzf == null || (str7 = c1186970gzf.entranceEnterMethod) == null) {
                str7 = "";
            }
            C1185410gx9 c1185410gx9 = this.LLJJIII;
            if (c1185410gx9 == null || (initialEnterFrom = c1185410gx9.getInitialEnterFrom()) == null) {
                initialEnterFrom = "";
            }
            C1185410gx9 c1185410gx92 = this.LLJJIII;
            if (c1185410gx92 == null || (initialEnterMethod = c1185410gx92.getInitialEnterMethod()) == null) {
                initialEnterMethod = "";
            }
            C1185410gx9 c1185410gx93 = this.LLJJIII;
            if (c1185410gx93 == null || (initialPoiFromGroupId = c1185410gx93.getInitialPoiFromGroupId()) == null) {
                initialPoiFromGroupId = "";
            }
            C1185410gx9 c1185410gx94 = this.LLJJIII;
            if (c1185410gx94 == null || (initialPoiId = c1185410gx94.getInitialPoiId()) == null) {
                initialPoiId = "";
            }
            C1185410gx9 c1185410gx95 = this.LLJJIII;
            if (c1185410gx95 == null || (adClickId = c1185410gx95.getAdClickId()) == null) {
                adClickId = "";
            }
            C1185410gx9 c1185410gx96 = this.LLJJIII;
            if (c1185410gx96 == null || (activitySource = c1185410gx96.getActivitySource()) == null) {
                activitySource = "";
            }
            C1185410gx9 c1185410gx97 = this.LLJJIII;
            if (c1185410gx97 == null || (activityPageId = c1185410gx97.getActivityPageId()) == null) {
                activityPageId = "";
            }
            C1185410gx9 c1185410gx98 = this.LLJJIII;
            if (c1185410gx98 != null && (requestId = c1185410gx98.getRequestId()) != null) {
                str9 = requestId;
            }
            PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
            c1185430gxB.getClass();
            C1185430gxB.LJJJJJL("click_button", num, str8, str2, str, str3, str4, str5, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, initialPoiId, str6, str7, 0, adClickId, activitySource, activityPageId, str9, strLIZLLL, "", pageFinderVia);
            return;
        }
        C197039127h c197039127h3 = this.LLJJIJI;
        if (c197039127h3 != null) {
            C786410Ut5.LLLLLLJ(c197039127h3, 8);
        }
    }
}
