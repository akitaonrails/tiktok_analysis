package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.share;

import X.AbstractC1387200mCc;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C098200Yq;
import X.C1174850gg7;
import X.C1181550gqv;
import X.C1182380gsG;
import X.C1183770guV;
import X.C1184510gvh;
import X.C1185120gwg;
import X.C1185160gwk;
import X.C1185180gwm;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185670gxZ;
import X.C1188440h22;
import X.C1200940hMC;
import X.C123100dR;
import X.C1252710ihh;
import X.C1372470lor;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C189200o6;
import X.C2188811AlT;
import X.C2365509Or;
import X.C520040KaQ;
import X.C621180OYa;
import X.C723590SZx;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1181010gq3;
import X.InterfaceC1181670gr7;
import X.InterfaceC1184330gvP;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.share.PoiDetailShareAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.ReportInfo;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import com.ss.android.ugc.aweme.poi.experiment.PoiWebViewGneSettings;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class PoiDetailShareAssem extends PoiDetailBaseUiContentComponent<Object> {
    public PoiListApi.PoiDetailResponse LLJIJIL;
    public View LLJILJIL;
    public final C1559260qg8 LLJI = new C1559260qg8(new C723590SZx(this, C1184510gvh.class, "PoiDetailShareHierarchyData"), checkSupervisorPrepared());
    public boolean LLJILJILJ = true;

    public void No() {
    }

    public final C1184510gvh Lo() {
        return (C1184510gvh) this.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558360qeg.LJFF(fragmentLJI, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent
    public final void Jo(final PoiListApi.PoiDetailResponse poiDetailResponse) {
        C1181550gqv c1181550gqvEr2;
        PoiDetailVideoListModel poiDetailVideoListModelLIZ;
        C1181550gqv c1181550gqvEr22;
        PoiDetailVideoListModel poiDetailVideoListModelLIZ2;
        this.LLJIJIL = poiDetailResponse;
        if (poiDetailResponse != null && C1183770guV.LIZ()) {
            long jLongValue = 0;
            List<Aweme> listLIZ = null;
            if (this.LLJILJILJ) {
                String str = Lo().LLILLL;
                InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
                if (interfaceC1181010gq3LIZ != null && (c1181550gqvEr22 = interfaceC1181010gq3LIZ.Er2()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((LinkedHashMap) c1181550gqvEr22.LIZ).entrySet().iterator();
                    while (it2.hasNext()) {
                        Object value = ((Map.Entry) it2.next()).getValue();
                        if (value instanceof C1185120gwg) {
                            arrayList.add(value);
                        }
                    }
                    C1185120gwg c1185120gwg = (C1185120gwg) ((InterfaceC1181670gr7) C13LP.LJJJLL(arrayList));
                    if (c1185120gwg != null && (poiDetailVideoListModelLIZ2 = c1185120gwg.LIZ()) != null) {
                        listLIZ = poiDetailVideoListModelLIZ2.LIZ();
                    }
                }
                Long realFavoriteCnt = poiDetailResponse.getRealFavoriteCnt();
                if (realFavoriteCnt != null) {
                    jLongValue = realFavoriteCnt.longValue();
                }
                String strIsClaimedForMob = poiDetailResponse.isClaimedForMob();
                String strLIZIZ = Ho().LIZIZ();
                if (strLIZIZ == null) {
                    strLIZIZ = Ho().LJIIJJI();
                }
                C1185180gwm.LIZ(str, new C1185160gwk(strIsClaimedForMob, listLIZ, strLIZIZ, Ho().LIZJ(), jLongValue, Ho().LIZ()));
                this.LLJILJILJ = false;
                View view = this.LLJILJIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                String str2 = Lo().LL;
                if (str2 == null) {
                    str2 = "";
                }
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
                c1185430gxB.getClass();
                C1185430gxB.LJJJJZI(pageFinderVia, interfaceC665370Q7zLJIIL, str2);
                View view2 = this.LLJILJIL;
                if (view2 != null) {
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0gwf
                        @Override // X.AbstractViewOnClickListenerC1637610siV
                        public final void LIZ(View view3) throws JSONException {
                            String strIsClaimedForMob2;
                            String collectInfo;
                            C1185410gx9 c1185410gx9Nf;
                            String poiCityCode;
                            String poiRegionCode;
                            String anchorInteractMethod;
                            String str3;
                            String initialEnterFrom;
                            String initialEnterMethod;
                            String initialPoiFromGroupId;
                            String enterFrom;
                            C1181550gqv c1181550gqvEr23;
                            if (view3 != null) {
                                this.LLILZ.No();
                                PoiDetailShareAssem poiDetailShareAssem = this.LLILZ;
                                PoiListApi.PoiDetailResponse poiDetailResponse2 = poiDetailResponse;
                                if (poiDetailResponse2 == null || (strIsClaimedForMob2 = poiDetailResponse2.isClaimedForMob()) == null) {
                                    strIsClaimedForMob2 = "";
                                }
                                PoiListApi.PoiDetailResponse poiDetailResponse3 = poiDetailResponse;
                                PoiDetailVideoListModel poiDetailVideoListModelLIZ3 = null;
                                if (poiDetailResponse3 != null) {
                                    collectInfo = poiDetailResponse3.getCollectInfo();
                                } else {
                                    collectInfo = null;
                                }
                                poiDetailShareAssem.getClass();
                                InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(poiDetailShareAssem, C13LE.LIZ(InterfaceC1184330gvP.class), null);
                                if (interfaceC1184330gvP != null) {
                                    c1185410gx9Nf = interfaceC1184330gvP.Nf();
                                } else {
                                    c1185410gx9Nf = null;
                                }
                                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                C1182410gsJ.LIZ(linkedHashMap, C1558520qew.LJIIL(poiDetailShareAssem));
                                linkedHashMap.put("enter_from", "poi_detail");
                                String str4 = poiDetailShareAssem.Lo().LL;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                linkedHashMap.put("enter_method", str4);
                                String str5 = poiDetailShareAssem.Lo().LLILLL;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                linkedHashMap.put("poi_id", str5);
                                C1188440h22 c1188440h22 = poiDetailShareAssem.Lo().LLILZ;
                                if (c1188440h22 == null || (poiCityCode = c1188440h22.getPoiCityCode()) == null) {
                                    poiCityCode = "";
                                }
                                linkedHashMap.put("poi_city", poiCityCode);
                                C1188440h22 c1188440h222 = poiDetailShareAssem.Lo().LLILZ;
                                if (c1188440h222 == null || (poiRegionCode = c1188440h222.getPoiRegionCode()) == null) {
                                    poiRegionCode = "";
                                }
                                linkedHashMap.put("poi_region_code", poiRegionCode);
                                linkedHashMap.put("poi_info_source", "google");
                                String str6 = poiDetailShareAssem.Lo().LLILLJJLI;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                linkedHashMap.put("previous_page", str6);
                                linkedHashMap.put("is_claimed", strIsClaimedForMob2);
                                if (c1185410gx9Nf != null) {
                                    anchorInteractMethod = c1185410gx9Nf.getAnchorInteractMethod();
                                } else {
                                    anchorInteractMethod = null;
                                }
                                C1189060h32.LJJ("anchor_interact_method", anchorInteractMethod, linkedHashMap);
                                if (Intrinsics.LJFF(poiDetailShareAssem.Lo().LLILZLL, Boolean.TRUE)) {
                                    str3 = "panel";
                                } else {
                                    str3 = "detail";
                                }
                                linkedHashMap.put("page_model", str3);
                                C1188730h2V c1188730h2V = C1185490gxH.Companion;
                                C1185490gxH c1185490gxH = poiDetailShareAssem.Lo().LLILZIL;
                                c1188730h2V.getClass();
                                C1188730h2V.LIZIZ(linkedHashMap, c1185490gxH, true);
                                if (c1185410gx9Nf == null || (initialEnterFrom = c1185410gx9Nf.getInitialEnterFrom()) == null) {
                                    initialEnterFrom = "";
                                }
                                linkedHashMap.put("initial_poi_enter_from", initialEnterFrom);
                                if (c1185410gx9Nf == null || (initialEnterMethod = c1185410gx9Nf.getInitialEnterMethod()) == null) {
                                    initialEnterMethod = "";
                                }
                                linkedHashMap.put("initial_poi_enter_method", initialEnterMethod);
                                if (c1185410gx9Nf == null || (initialPoiFromGroupId = c1185410gx9Nf.getInitialPoiFromGroupId()) == null) {
                                    initialPoiFromGroupId = "";
                                }
                                linkedHashMap.put("initial_poi_from_group_id", initialPoiFromGroupId);
                                if (c1185410gx9Nf == null || (enterFrom = c1185410gx9Nf.getEnterFrom()) == null) {
                                    enterFrom = "";
                                }
                                linkedHashMap.put("poi_detail_enter_from", enterFrom);
                                linkedHashMap.putAll(((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ());
                                C1189060h32.LIZ(collectInfo, linkedHashMap);
                                C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(C1189060h32.LJIIJ(poiDetailShareAssem)));
                                c1185040gwY.getClass();
                                C1185040gwY.LIZIZ("click_share_poi_button", linkedHashMap, c1185050gwZ);
                                if (!C848230XPh.LL.LJI()) {
                                    Fragment fragmentLJI = C724240Sb0.LJI(this.LLILZ);
                                    final PoiDetailShareAssem poiDetailShareAssem2 = this.LLILZ;
                                    final PoiListApi.PoiDetailResponse poiDetailResponse4 = poiDetailResponse;
                                    C0XPD.LIZJ(fragmentLJI, "poi_detail", "", null, new InterfaceC849390XTt() { // from class: X.0gwj
                                        @Override // X.InterfaceC849390XTt
                                        public final void LIZIZ() {
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
                                        @Override // X.InterfaceC849390XTt
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final void LIZ() throws org.json.JSONException {
                                            /*
                                                r7 = this;
                                                com.ss.android.ugc.aweme.poi.detail.basicinfo.header.share.PoiDetailShareAssem r0 = r1
                                                X.19EG r6 = X.C724240Sb0.LIZ(r0)
                                                if (r6 == 0) goto L55
                                                com.ss.android.ugc.aweme.poi.detail.basicinfo.header.share.PoiDetailShareAssem r5 = r1
                                                com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r4 = r2
                                                r5.getClass()
                                                X.0gq3 r0 = X.C1174850gg7.LIZ(r5)
                                                if (r0 == 0) goto L56
                                                X.0gqv r0 = r0.Er2()
                                                if (r0 == 0) goto L56
                                                java.util.ArrayList r3 = new java.util.ArrayList
                                                r3.<init>()
                                                java.util.Map<java.lang.String, X.0gr7> r0 = r0.LIZ
                                                java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
                                                java.util.Set r0 = r0.entrySet()
                                                java.util.Iterator r2 = r0.iterator()
                                            L2c:
                                                boolean r0 = r2.hasNext()
                                                if (r0 == 0) goto L44
                                                java.lang.Object r0 = r2.next()
                                                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                                                java.lang.Object r1 = r0.getValue()
                                                boolean r0 = r1 instanceof X.C1185120gwg
                                                if (r0 == 0) goto L2c
                                                r3.add(r1)
                                                goto L2c
                                            L44:
                                                java.lang.Object r0 = X.C13LP.LJJJLL(r3)
                                                X.0gr7 r0 = (X.InterfaceC1181670gr7) r0
                                                X.0gwg r0 = (X.C1185120gwg) r0
                                                if (r0 == 0) goto L56
                                                com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel r0 = r0.LIZ()
                                            L52:
                                                r5.Oo(r6, r4, r0)
                                            L55:
                                                return
                                            L56:
                                                r0 = 0
                                                goto L52
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C1185150gwj.LIZ():void");
                                        }
                                    });
                                    return;
                                }
                                C19EG c19egLIZ = C724240Sb0.LIZ(this.LLILZ);
                                if (c19egLIZ == null) {
                                    return;
                                }
                                PoiDetailShareAssem poiDetailShareAssem3 = this.LLILZ;
                                PoiListApi.PoiDetailResponse poiDetailResponse5 = poiDetailResponse;
                                poiDetailShareAssem3.getClass();
                                PoiDetailShareAssem poiDetailShareAssem4 = this.LLILZ;
                                poiDetailShareAssem4.getClass();
                                InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(poiDetailShareAssem4);
                                if (interfaceC1181010gq3LIZ2 != null && (c1181550gqvEr23 = interfaceC1181010gq3LIZ2.Er2()) != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = ((LinkedHashMap) c1181550gqvEr23.LIZ).entrySet().iterator();
                                    while (it3.hasNext()) {
                                        Object value2 = ((Map.Entry) it3.next()).getValue();
                                        if (value2 instanceof C1185120gwg) {
                                            arrayList2.add(value2);
                                        }
                                    }
                                    C1185120gwg c1185120gwg2 = (C1185120gwg) ((InterfaceC1181670gr7) C13LP.LJJJLL(arrayList2));
                                    if (c1185120gwg2 != null) {
                                        poiDetailVideoListModelLIZ3 = c1185120gwg2.LIZ();
                                    }
                                }
                                poiDetailShareAssem3.Oo(c19egLIZ, poiDetailResponse5, poiDetailVideoListModelLIZ3);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(300L);
                        }
                    }, view2);
                    return;
                }
                return;
            }
            C1185160gwk c1185160gwkLIZIZ = C1185180gwm.LIZIZ(Lo().LLILLL);
            if (c1185160gwkLIZIZ != null) {
                String str3 = Lo().LLILLL;
                List<Aweme> list = c1185160gwkLIZIZ.LIZIZ;
                if (list == null) {
                    InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(this);
                    if (interfaceC1181010gq3LIZ2 != null && (c1181550gqvEr2 = interfaceC1181010gq3LIZ2.Er2()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = ((LinkedHashMap) c1181550gqvEr2.LIZ).entrySet().iterator();
                        while (it3.hasNext()) {
                            Object value2 = ((Map.Entry) it3.next()).getValue();
                            if (value2 instanceof C1185120gwg) {
                                arrayList2.add(value2);
                            }
                        }
                        C1185120gwg c1185120gwg2 = (C1185120gwg) ((InterfaceC1181670gr7) C13LP.LJJJLL(arrayList2));
                        if (c1185120gwg2 != null && (poiDetailVideoListModelLIZ = c1185120gwg2.LIZ()) != null) {
                            listLIZ = poiDetailVideoListModelLIZ.LIZ();
                        }
                    }
                } else {
                    listLIZ = list;
                }
                Long realFavoriteCnt2 = poiDetailResponse.getRealFavoriteCnt();
                if (realFavoriteCnt2 != null) {
                    jLongValue = realFavoriteCnt2.longValue();
                }
                C1185180gwm.LIZ(str3, new C1185160gwk(poiDetailResponse.isClaimedForMob(), listLIZ, c1185160gwkLIZIZ.LIZLLL, c1185160gwkLIZIZ.LJ, jLongValue, c1185160gwkLIZIZ.LJFF));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJILJIL = view;
    }

    public final void Oo(Activity activity, PoiListApi.PoiDetailResponse poiDetailResponse, PoiDetailVideoListModel poiDetailVideoListModel) throws JSONException {
        String fromGroupId;
        String str;
        String string;
        String str2;
        long jLongValue;
        List<Aweme> listLIZ;
        String poiCityCode;
        String poiRegionCode;
        String poiInfoSource;
        Object poiCityCode2;
        Object poiRegionCode2;
        Object objLJ;
        Boolean bool;
        String enterFrom;
        String enterMethod;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZ;
        String str3;
        Object objOpt;
        String collectInfo;
        Object c098200Yq;
        Bundle bundle = new Bundle();
        PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJIJIL;
        if (poiDetailResponse2 != null && (collectInfo = poiDetailResponse2.getCollectInfo()) != null) {
            try {
                JSONObject jSONObject = new JSONObject(collectInfo);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next)) {
                        C786410Ut5.LJJJI(next, jSONObject.get(next).toString(), bundle);
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        C1188440h22 c1188440h22 = Lo().LLILZ;
        if (c1188440h22 == null || (fromGroupId = c1188440h22.getFromGroupId()) == null) {
            fromGroupId = "";
        }
        C786410Ut5.LJJJI("from_group_id", fromGroupId, bundle);
        C786410Ut5.LJJJI("poi_detail_type", poiDetailResponse.poiTypeName(), bundle);
        C786410Ut5.LJJJI("is_claimed", poiDetailResponse.isClaimedForMob(), bundle);
        C786410Ut5.LJJJI("type_level", poiDetailResponse.getTypeLevel(), bundle);
        C786410Ut5.LJJIZ(bundle, "init_location", poiDetailResponse.getPoiLocation());
        if (Intrinsics.LJFF(Lo().LLILZLL, Boolean.TRUE)) {
            str = "panel";
        } else {
            str = "detail";
        }
        C786410Ut5.LJJJI("page_model", str, bundle);
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(PoiWebViewGneSettings.LIZIZ()).buildUpon().appendQueryParameter("entrance", "poi_detail").appendQueryParameter("enter_method", "share_poi_panel");
        String str4 = Lo().LLILLL;
        if (str4 == null) {
            str4 = "";
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("poi_id", str4).appendQueryParameter("collect_info", poiDetailResponse.getCollectInfo());
        ReportInfo reportInfo = poiDetailResponse.getReportInfo();
        if (reportInfo != null && (str3 = reportInfo.params) != null) {
            JSONObject jSONObject2 = new JSONObject(str3);
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (C123100dR.LIZ(next2) && (objOpt = jSONObject2.opt(next2)) != null) {
                    builderAppendQueryParameter2.appendQueryParameter(next2, objOpt.toString());
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(PoiWebViewGneSettings.LIZ());
        sbLIZ.append("&url=");
        sbLIZ.append(Uri.encode(builderAppendQueryParameter2.toString()));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1185410gx9 c1185410gx9Nf = null;
        if (C123100dR.LIZ(poiDetailResponse.getHelpCenterUrl())) {
            string = UriProtector.parse(poiDetailResponse.getHelpCenterUrl()).buildUpon().appendQueryParameter("enter_method", "share_poi_panel").toString();
        } else {
            Boolean showHelpCenter = poiDetailResponse.getShowHelpCenter();
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(showHelpCenter, bool2)) {
                Uri.Builder builderAppendQueryParameter3 = UriProtector.parse("aweme://roma_redirect/?spark_page=ttls_feedback").buildUpon().appendQueryParameter("entrance", "poi_detail").appendQueryParameter("enter_from", "poi_detail").appendQueryParameter("enter_method", "share_poi_panel");
                String str5 = Lo().LLILLL;
                if (str5 == null) {
                    str5 = "";
                }
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("poi_id", str5).appendQueryParameter("collect_info", poiDetailResponse.getCollectInfo());
                if (Intrinsics.LJFF(poiDetailResponse.isSemiClosedLoopHotel(), bool2)) {
                    str2 = "2";
                } else {
                    str2 = "1";
                }
                string = builderAppendQueryParameter4.appendQueryParameter("biz_line", str2).toString();
            } else {
                string = null;
            }
        }
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            c1185410gx9Nf = interfaceC1184330gvP.Nf();
        }
        ShareService shareService = C621180OYa.LIZ;
        String str6 = Lo().LL;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = Lo().LLILLL;
        if (str7 == null) {
            str7 = "";
        }
        String name = poiDetailResponse.getName();
        if (name == null) {
            name = "";
        }
        Long realFavoriteCnt = poiDetailResponse.getRealFavoriteCnt();
        if (realFavoriteCnt != null) {
            jLongValue = realFavoriteCnt.longValue();
        } else {
            jLongValue = 0;
        }
        if (poiDetailVideoListModel == null || (listLIZ = poiDetailVideoListModel.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        C1188440h22 c1188440h222 = Lo().LLILZ;
        if (c1188440h222 == null || (poiCityCode = c1188440h222.getPoiCityCode()) == null) {
            poiCityCode = "";
        }
        C1188440h22 c1188440h223 = Lo().LLILZ;
        if (c1188440h223 == null || (poiRegionCode = c1188440h223.getPoiRegionCode()) == null) {
            poiRegionCode = "";
        }
        C1188440h22 c1188440h224 = Lo().LLILZ;
        if (c1188440h224 == null || (poiInfoSource = c1188440h224.getPoiInfoSource()) == null) {
            poiInfoSource = "";
        }
        C1200940hMC.LIZ.getClass();
        boolean zLIZIZ = C1200940hMC.LIZIZ(activity);
        String str8 = Lo().LLILLJJLI;
        if (str8 == null) {
            str8 = "";
        }
        View view = this.LLJILJIL;
        JSONObject jSONObject3 = new JSONObject();
        C1188440h22 c1188440h225 = Lo().LLILZ;
        if (c1188440h225 == null || (poiCityCode2 = c1188440h225.getPoiCityCode()) == null) {
            poiCityCode2 = "";
        }
        jSONObject3.put("poi_city", poiCityCode2);
        C1188440h22 c1188440h226 = Lo().LLILZ;
        if (c1188440h226 == null || (poiRegionCode2 = c1188440h226.getPoiRegionCode()) == null) {
            poiRegionCode2 = "";
        }
        jSONObject3.put("poi_region_code", poiRegionCode2);
        jSONObject3.put("type_level", poiDetailResponse.getTypeLevel());
        PoiLocation poiLocation = poiDetailResponse.getPoiLocation();
        if (poiLocation != null) {
            objLJ = C2365509Or.LJ(poiLocation);
        } else {
            objLJ = null;
        }
        jSONObject3.put("init_location", objLJ);
        String strJ3 = C786410Ut5.J3(jSONObject3);
        Boolean editPoiStatus = poiDetailResponse.getEditPoiStatus();
        Boolean boolIsBaAccount = poiDetailResponse.isBaAccount();
        Boolean claimStoreStatus = poiDetailResponse.getClaimStoreStatus();
        ReportInfo reportInfo2 = poiDetailResponse.getReportInfo();
        if (reportInfo2 != null) {
            bool = reportInfo2.needShow;
        } else {
            bool = null;
        }
        ShareInfo shareInfo = poiDetailResponse.getShareInfo();
        String collectInfo2 = poiDetailResponse.getCollectInfo();
        if (c1185410gx9Nf == null || (enterFrom = c1185410gx9Nf.getEnterFrom()) == null) {
            enterFrom = Lo().LLILLJJLI;
        }
        if (c1185410gx9Nf == null || (enterMethod = c1185410gx9Nf.getEnterMethod()) == null) {
            enterMethod = Lo().LL;
        }
        String strLIZIZ2 = Ho().LIZIZ();
        if (strLIZIZ2 == null) {
            strLIZIZ2 = Ho().LJIIJJI();
        }
        String strLIZJ = Ho().LIZJ();
        String strLIZ = Ho().LIZ();
        String pageId = BtmSDK.INSTANCE.getPageId(PageFinder.via(this.LLJILJIL));
        View view2 = this.LLJILJIL;
        if (view2 != null && (abstractC1387200mCcLIZ = C520040KaQ.LIZ(view2)) != null) {
            interfaceC665370Q7zLIZ = C1185670gxZ.LIZ(abstractC1387200mCcLIZ);
        } else {
            interfaceC665370Q7zLIZ = null;
        }
        shareService.LJJIII(activity, new C1372470lor("poi_detail", str6, str7, name, jLongValue, listLIZ, poiCityCode, poiRegionCode, poiInfoSource, zLIZIZ ? 1 : 0, str8, view, enterFrom, enterMethod, strLIZIZ2, strLIZJ, strLIZ, pageId, C1182380gsG.LJFF(interfaceC665370Q7zLIZ), strJ3, bundle, editPoiStatus, boolIsBaAccount, claimStoreStatus, string, shareInfo, collectInfo2, bool, strLIZIZ));
    }
}
