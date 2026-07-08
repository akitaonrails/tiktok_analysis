package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta;

import X.C01GW;
import X.C062U;
import X.C098200Yq;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1186970gzf;
import X.C123100dR;
import X.C1558520qew;
import X.C189200o6;
import X.C308370C6x;
import X.C452501pT;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS562S0100000_18;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PoiDetailHeaderPoiShopCtaBaseAssem extends UISlotAssem {
    public C1185410gx9 LLJJI;
    public boolean LLJJIII;
    public TuxActionSheet LLJJIJI;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1007));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1006));

    public String LLIIJI() {
        return null;
    }

    public abstract C062U kp();

    public void mp() {
    }

    public abstract void op(int i, View view, String str);

    public View ip() {
        return (View) this.LLJJIJIL.getValue();
    }

    public final JSONObject hp(String str) {
        C1186970gzf c1186970gzf;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String str7;
        String str8;
        String adClickId;
        String activitySource;
        String activityPageId;
        String requestId;
        String str9;
        Object objOpt;
        C062U c062uKp = kp();
        Object obj2 = null;
        if (c062uKp != null) {
            c1186970gzf = c062uKp.LLILLJJLI;
        } else {
            c1186970gzf = null;
        }
        try {
            if (c1186970gzf != null) {
                str2 = c1186970gzf.collectInfo;
            } else {
                str2 = null;
            }
            String str10 = "";
            if (str2 == null) {
                str2 = "";
            }
            JSONObject jSONObject = new JSONObject(str2);
            for (Map.Entry entry : ((LinkedHashMap) C308370C6x.LIZ(null)).entrySet()) {
                jSONObject.putOpt((String) entry.getKey(), (String) entry.getValue());
            }
            if (c1186970gzf != null) {
                str3 = c1186970gzf.collectInfo;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.putOpt("collect_info", str3);
            jSONObject.putOpt("enter_from", "poi_detail");
            jSONObject.putOpt("enter_method", str);
            jSONObject.putOpt("page_name", "reserve");
            if (c1186970gzf != null) {
                str4 = c1186970gzf.provider;
            } else {
                str4 = null;
            }
            jSONObject.putOpt("provider", str4);
            if (c1186970gzf != null) {
                str5 = c1186970gzf.poiId;
            } else {
                str5 = null;
            }
            jSONObject.putOpt("poi_id", str5);
            if (c1186970gzf != null) {
                str6 = c1186970gzf.poiCity;
            } else {
                str6 = null;
            }
            jSONObject.putOpt("poi_city", str6);
            C1185410gx9 c1185410gx9 = this.LLJJI;
            if (c1185410gx9 != null) {
                initialEnterFrom = c1185410gx9.getInitialEnterFrom();
            } else {
                initialEnterFrom = null;
            }
            jSONObject.putOpt("initial_poi_enter_from", initialEnterFrom);
            C1185410gx9 c1185410gx92 = this.LLJJI;
            if (c1185410gx92 != null) {
                initialEnterMethod = c1185410gx92.getInitialEnterMethod();
            } else {
                initialEnterMethod = null;
            }
            jSONObject.putOpt("initial_poi_enter_method", initialEnterMethod);
            C1185410gx9 c1185410gx93 = this.LLJJI;
            if (c1185410gx93 != null) {
                initialPoiFromGroupId = c1185410gx93.getInitialPoiFromGroupId();
            } else {
                initialPoiFromGroupId = null;
            }
            jSONObject.putOpt("initial_poi_from_group_id", initialPoiFromGroupId);
            C1185410gx9 c1185410gx94 = this.LLJJI;
            if (c1185410gx94 != null) {
                initialPoiId = c1185410gx94.getInitialPoiId();
            } else {
                initialPoiId = null;
            }
            jSONObject.putOpt("initial_poi_id", initialPoiId);
            if (c1186970gzf != null) {
                str7 = c1186970gzf.entranceEnterFrom;
            } else {
                str7 = null;
            }
            jSONObject.putOpt("poi_detail_enter_from", str7);
            if (c1186970gzf != null) {
                str8 = c1186970gzf.entranceEnterMethod;
            } else {
                str8 = null;
            }
            jSONObject.putOpt("poi_detail_enter_method", str8);
            C1185410gx9 c1185410gx95 = this.LLJJI;
            if (c1185410gx95 != null) {
                adClickId = c1185410gx95.getAdClickId();
            } else {
                adClickId = null;
            }
            jSONObject.putOpt("click_id", adClickId);
            C1185410gx9 c1185410gx96 = this.LLJJI;
            if (c1185410gx96 != null) {
                activitySource = c1185410gx96.getActivitySource();
            } else {
                activitySource = null;
            }
            jSONObject.putOpt("activity_source", activitySource);
            C1185410gx9 c1185410gx97 = this.LLJJI;
            if (c1185410gx97 != null) {
                activityPageId = c1185410gx97.getActivityPageId();
            } else {
                activityPageId = null;
            }
            jSONObject.putOpt("activity_page_id", activityPageId);
            C1185410gx9 c1185410gx98 = this.LLJJI;
            if (c1185410gx98 != null) {
                requestId = c1185410gx98.getRequestId();
            } else {
                requestId = null;
            }
            jSONObject.putOpt("request_id", requestId);
            try {
                if (c1186970gzf != null) {
                    str9 = c1186970gzf.trackInfo;
                } else {
                    str9 = null;
                }
                if (str9 != null) {
                    str10 = str9;
                }
                JSONObject jSONObject2 = new JSONObject(str10);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject2.opt(next)) != null) {
                        jSONObject.putOpt(next, objOpt.toString());
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C189200o6.m2constructorimpl(jSONObject);
            obj = jSONObject;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C098200Yq c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (JSONObject) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem.onViewCreated(android.view.View):void");
    }

    public final void lp(PoiShopBookingInfo poiShopBookingInfo, String str, int i, String str2, String str3, PageFinder pageFinder) {
        C1186970gzf c1186970gzf;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String adClickId;
        String activitySource;
        String activityPageId;
        String requestId;
        C062U c062uKp = kp();
        String str10 = null;
        if (c062uKp != null) {
            c1186970gzf = c062uKp.LLILLJJLI;
        } else {
            c1186970gzf = null;
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        Integer num = poiShopBookingInfo.provider;
        if (c1186970gzf != null) {
            str10 = c1186970gzf.poiId;
            str4 = c1186970gzf.poiRegionCode;
            str5 = c1186970gzf.poiCity;
            str6 = c1186970gzf.ttTypeCode;
            str7 = c1186970gzf.collectInfo;
            str8 = c1186970gzf.entranceEnterFrom;
        } else {
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
        }
        String str11 = "";
        if (str8 == null) {
            str8 = "";
        }
        if (c1186970gzf == null || (str9 = c1186970gzf.entranceEnterMethod) == null) {
            str9 = "";
        }
        C1185410gx9 c1185410gx9 = this.LLJJI;
        if (c1185410gx9 == null || (initialEnterFrom = c1185410gx9.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        C1185410gx9 c1185410gx92 = this.LLJJI;
        if (c1185410gx92 == null || (initialEnterMethod = c1185410gx92.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1185410gx9 c1185410gx93 = this.LLJJI;
        if (c1185410gx93 == null || (initialPoiFromGroupId = c1185410gx93.getInitialPoiFromGroupId()) == null) {
            initialPoiFromGroupId = "";
        }
        C1185410gx9 c1185410gx94 = this.LLJJI;
        if (c1185410gx94 == null || (initialPoiId = c1185410gx94.getInitialPoiId()) == null) {
            initialPoiId = "";
        }
        C1185410gx9 c1185410gx95 = this.LLJJI;
        if (c1185410gx95 == null || (adClickId = c1185410gx95.getAdClickId()) == null) {
            adClickId = "";
        }
        C1185410gx9 c1185410gx96 = this.LLJJI;
        if (c1185410gx96 == null || (activitySource = c1185410gx96.getActivitySource()) == null) {
            activitySource = "";
        }
        C1185410gx9 c1185410gx97 = this.LLJJI;
        if (c1185410gx97 == null || (activityPageId = c1185410gx97.getActivityPageId()) == null) {
            activityPageId = "";
        }
        C1185410gx9 c1185410gx98 = this.LLJJI;
        if (c1185410gx98 != null && (requestId = c1185410gx98.getRequestId()) != null) {
            str11 = requestId;
        }
        String strIconType$poi_release = poiShopBookingInfo.iconType$poi_release();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        c1185430gxB.getClass();
        C1185430gxB.LJJJJJ(str, num, str10, str5, str4, str6, str7, str2, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, initialPoiId, str8, str9, i, adClickId, activitySource, activityPageId, str11, str3, strIconType$poi_release, pageFinder, interfaceC665370Q7zLJIIL);
    }
}
