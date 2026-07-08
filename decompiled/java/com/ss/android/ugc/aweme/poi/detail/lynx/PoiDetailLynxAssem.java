package com.ss.android.ugc.aweme.poi.detail.lynx;

import X.AbstractC1186480gys;
import X.AnonymousClass0753;
import X.C01GW;
import X.C0PEM;
import X.C101600Zy;
import X.C1173300gdc;
import X.C1173980gei;
import X.C1174850gg7;
import X.C1175440gh4;
import X.C1182380gsG;
import X.C1185410gx9;
import X.C1185450gxD;
import X.C1185600gxS;
import X.C1185810gxn;
import X.C1186840gzS;
import X.C1186870gzV;
import X.C1187710h0r;
import X.C1187810h11;
import X.C1187830h13;
import X.C1189060h32;
import X.C1195980hEC;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C166V;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C295220Bhg;
import X.C298370Bml;
import X.C308370C6x;
import X.C433720Gza;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1180270gor;
import X.InterfaceC1181010gq3;
import X.InterfaceC1294060jmO;
import X.InterfaceC1541990qEH;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1558400qek;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiSlashContextAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem;
import com.ss.android.ugc.aweme.slash.data.PageInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS102S1200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailLynxAssem extends PoiDetailBaseAssem<PoiDetailApi.PoiDetailLynxResponse> implements InterfaceC1180270gor, InterfaceC1558400qek {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final C166V LLJJL = new C166V(new AwS597S0100000_18((UISlotAssem) this, 337));
    public InterfaceC1541990qEH LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public boolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C1187810h11 LLJLLIL;
    public boolean LLJLLL;
    public long LLJZ;
    public long LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public Boolean LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailLynxAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiDetailLynxLayoutBinding;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e0m;
    }

    @Override // X.InterfaceC1558400qek
    public final ViewModelStoreOwner LLIIIILZ() {
        return this;
    }

    @Override // X.InterfaceC1558400qek
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final long Jp() {
        return ((Number) this.LLJLILLLLZIIL.getValue()).longValue();
    }

    public final String getSessionId() {
        return (String) this.LLJLL.getValue();
    }

    public PoiDetailLynxAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJLILLLLZIIL = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 1165));
        this.LLJLL = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 1164));
        this.LLJLLIL = new C1187810h11();
    }

    public static boolean Wp() {
        return C295220Bhg.LIZJ() && C295220Bhg.LIZ() < 4 && !C298370Bml.LIZ();
    }

    public final boolean FU() {
        IPoiSlashContextAbility iPoiSlashContextAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        if (interfaceC665370Q7zLJIIL == null || (iPoiSlashContextAbility = (IPoiSlashContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IPoiSlashContextAbility.class, null)) == null) {
            return false;
        }
        return iPoiSlashContextAbility.FU();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public final Map<String, Object> Gp() {
        C1187710h0r c1187710h0rLIZ;
        String sessionId;
        String sheetBizName$poi_release;
        String collectInfo;
        String imprId;
        String cityCode;
        String autoShowCalendarRoomPlanSheet;
        String poiId;
        String enterFrom;
        String enterMethod;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String adClickId;
        String activitySource;
        String activityPageId;
        String requestId;
        PoiModuleMobCommonParams poiModuleMobCommonParams;
        LogPbBean logPbBean;
        C1185450gxD c1185450gxD;
        C1173300gdc c1173300gdcQr0;
        C1185600gxS c1185600gxS;
        Bundle arguments;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        long j = (fragmentLJI == null || (arguments = fragmentLJI.getArguments()) == null) ? -1L : arguments.getLong("page_start_ts");
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        String str = null;
        C1185410gx9 c1185410gx9 = (interfaceC1181010gq3BK2 == null || (c1173300gdcQr0 = interfaceC1181010gq3BK2.qr0()) == null || (c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ) == null) ? null : c1185600gxS.LJFF;
        InterfaceC1181010gq3 interfaceC1181010gq3BK22 = BK2();
        PageInfo pageInfoYW = interfaceC1181010gq3BK22 != null ? interfaceC1181010gq3BK22.YW() : null;
        PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        String str2 = this.LLL;
        if (str2 != null) {
            C1195980hEC.LIZ.getClass();
            c1187710h0rLIZ = C1195980hEC.LIZ(str2);
        } else {
            c1187710h0rLIZ = null;
        }
        Pair[] pairArr = new Pair[1];
        Pair[] pairArr2 = new Pair[9];
        pairArr2[0] = new Pair("page_start_ts", Long.valueOf(j));
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1185450gxD.class, null);
        String str3 = "";
        if (interfaceC1555100qZQLIZIZ == null || (c1185450gxD = (C1185450gxD) interfaceC1555100qZQLIZIZ.getSource()) == null || (sessionId = c1185450gxD.getSessionId()) == null) {
            sessionId = "";
        }
        pairArr2[1] = new Pair("poi_session_id", sessionId);
        String strLIZ = C1173980gei.LIZ(this);
        if (strLIZ == null) {
            strLIZ = "";
        }
        pairArr2[2] = new Pair("instance_id", strLIZ);
        pairArr2[3] = new Pair("refresh_code", Ip());
        if (c1185410gx9 == null || (sheetBizName$poi_release = c1185410gx9.getSheetBizName$poi_release()) == null) {
            sheetBizName$poi_release = "";
        }
        pairArr2[4] = new Pair("sheet_biz_name", sheetBizName$poi_release);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (poiDetailResponseLp == null || (collectInfo = poiDetailResponseLp.getCollectInfo()) == null) {
            collectInfo = "";
        }
        C1189060h32.LJIJI(linkedHashMap, "collect_info", collectInfo);
        if (pageInfoYW == null || (logPbBean = pageInfoYW.logPb) == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        C1189060h32.LJIJI(linkedHashMap, "log_id", imprId);
        if (poiDetailResponseLp == null || (cityCode = poiDetailResponseLp.getCityCode()) == null) {
            cityCode = "";
        }
        C1189060h32.LJIJI(linkedHashMap, "poi_city", cityCode);
        pairArr2[5] = new Pair("poi_meta_data", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (c1185410gx9 == null || (autoShowCalendarRoomPlanSheet = c1185410gx9.getAutoShowCalendarRoomPlanSheet()) == null) {
            autoShowCalendarRoomPlanSheet = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "auto_show_calendar_room_plan_sheet", autoShowCalendarRoomPlanSheet);
        if (c1185410gx9 == null || (poiId = c1185410gx9.getPoiId()) == null) {
            poiId = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "poi_id", poiId);
        if (c1185410gx9 == null || (enterFrom = c1185410gx9.getEnterFrom()) == null) {
            enterFrom = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "poi_detail_enter_from", enterFrom);
        if (c1185410gx9 == null || (enterMethod = c1185410gx9.getEnterMethod()) == null) {
            enterMethod = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "poi_detail_enter_method", enterMethod);
        if (c1185410gx9 == null || (initialEnterFrom = c1185410gx9.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "initial_poi_enter_from", initialEnterFrom);
        if (c1185410gx9 == null || (initialEnterMethod = c1185410gx9.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "initial_poi_enter_method", initialEnterMethod);
        if (c1185410gx9 == null || (initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId()) == null) {
            initialPoiFromGroupId = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "initial_poi_from_group_id", initialPoiFromGroupId);
        if (c1185410gx9 == null || (initialPoiId = c1185410gx9.getInitialPoiId()) == null) {
            initialPoiId = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "initial_poi_id", initialPoiId);
        if (c1185410gx9 == null || (adClickId = c1185410gx9.getAdClickId()) == null) {
            adClickId = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "ad_click_id", adClickId);
        if (c1185410gx9 == null || (activitySource = c1185410gx9.getActivitySource()) == null) {
            activitySource = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "activity_source", activitySource);
        if (c1185410gx9 == null || (activityPageId = c1185410gx9.getActivityPageId()) == null) {
            activityPageId = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "activity_page_id", activityPageId);
        if (c1185410gx9 == null || (requestId = c1185410gx9.getRequestId()) == null) {
            requestId = "";
        }
        C1189060h32.LJIJI(linkedHashMap2, "request_id", requestId);
        C1189060h32.LJIJI(linkedHashMap2, "search_params", C308370C6x.LIZ(null));
        pairArr2[6] = new Pair("poi_router_params", linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        C1189060h32.LJIJI(linkedHashMap3, "slash_biz", "poi_detail");
        C1189060h32.LJIJI(linkedHashMap3, "is_first_enter_page", c1185410gx9 != null ? Intrinsics.LJFF(c1185410gx9.getHasEnterPoi(), Boolean.TRUE) : false ? CardStruct.IStatusCode.DEFAULT : (c1185410gx9 == null || !Intrinsics.LJFF(c1185410gx9.getHasEnterPoi(), Boolean.FALSE)) ? "" : "1");
        if (c1185410gx9 != null) {
            if (Intrinsics.LJFF(c1185410gx9.getHasEnterSamePoi(), Boolean.TRUE)) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            } else if (c1185410gx9 != null && Intrinsics.LJFF(c1185410gx9.getHasEnterSamePoi(), Boolean.FALSE)) {
                str3 = "1";
            }
        }
        C1189060h32.LJIJI(linkedHashMap3, "is_first_enter_same_poi_page", str3);
        C1189060h32.LJIJI(linkedHashMap3, "url", this.LLJL);
        C1189060h32.LJIJI(linkedHashMap3, "gecko_bundle", this.LLLF);
        C1189060h32.LJIJI(linkedHashMap3, "spark_version", c1187710h0rLIZ != null ? c1187710h0rLIZ.LIZIZ : null);
        C1189060h32.LJIJI(linkedHashMap3, "lynx_version", c1187710h0rLIZ != null ? c1187710h0rLIZ.LIZJ : null);
        C1189060h32.LJIJI(linkedHashMap3, "is_offline_gecko", Intrinsics.LJFF(this.LLLFF, Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT);
        C1189060h32.LJIJI(linkedHashMap3, "gecko_version_id", c1187710h0rLIZ != null ? c1187710h0rLIZ.LIZ : null);
        C1189060h32.LJIJI(linkedHashMap3, "gecko_channel", this.LLL);
        pairArr2[7] = new Pair("poi_tech_params", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) C1182380gsG.LJII(C1558520qew.LJIIL(this))).entrySet()) {
            C1189060h32.LJJ(entry.getKey(), (String) entry.getValue(), linkedHashMap4);
        }
        PoiCommonMobParams poiCommonMobParamsLJ = C1182380gsG.LJ(C1558520qew.LJIIL(this));
        if (poiCommonMobParamsLJ != null && (poiModuleMobCommonParams = poiCommonMobParamsLJ.getPoiModuleMobCommonParams()) != null) {
            str = poiModuleMobCommonParams.currentPage;
        }
        C1189060h32.LJJ("current_page", str, linkedHashMap4);
        pairArr2[8] = new Pair("poi_general_track_params", linkedHashMap4);
        pairArr[0] = new Pair("poi_extra", C2097608Jq.LJIIJ(pairArr2));
        return C2097608Jq.LJIIJ(pairArr);
    }

    public final String Ip() {
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        int iHi = interfaceC1181010gq3BK2 != null ? interfaceC1181010gq3BK2.hi(C1173980gei.LIZ(this)) : 0;
        InterfaceC1181010gq3 interfaceC1181010gq3BK22 = BK2();
        return (iHi > 0 || (interfaceC1181010gq3BK22 != null ? interfaceC1181010gq3BK22.Lg() : 0) > 0) ? "act" : "first";
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C1186840gzS c1186840gzSLw1;
        super.onCreate();
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 != null && (c1186840gzSLw1 = interfaceC1181010gq3BK2.lw1()) != null) {
            c1186840gzSLw1.LIZIZ("PoiPageStatusEvent", this);
        }
        if (Wp()) {
            Bp(true);
            return;
        }
        if (C295220Bhg.LIZ() >= 4) {
            Bp(false);
        } else if (!C101600Zy.LIZ()) {
            Bp(false);
        } else {
            if (this.LLJLIL) {
                return;
            }
            Bp(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final Integer zp() {
        if (Wp()) {
            return Integer.valueOf(R.layout.e96);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
    }

    public static Map Qp(PoiDetailApi.PoiDetailLynxResponse poiDetailLynxResponse) {
        Pair[] pairArr = new Pair[1];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = poiDetailLynxResponse.updateType;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("update_type", str);
        Map<String, String> attachedDataList = poiDetailLynxResponse.getAttachedDataList();
        if (attachedDataList == null) {
            attachedDataList = C2097608Jq.LJ();
        }
        linkedHashMap.put("attached_data_map", attachedDataList);
        pairArr[0] = new Pair("slash_extra_info", linkedHashMap);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("makeExtraInfo: ");
        sbLIZ.append(mapLJIIJ);
        C2188811AlT.LIZIZ(sbLIZ);
        return mapLJIIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x013f A[PHI: r1 r7 r10 r17
      0x013f: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v17 java.lang.String) binds: [B:98:0x013c, B:75:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v9 java.lang.String) binds: [B:98:0x013c, B:75:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r10v2 java.lang.Boolean) = (r10v1 java.lang.Boolean), (r10v4 java.lang.Boolean) binds: [B:98:0x013c, B:75:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r17v4 java.lang.String) = (r17v3 java.lang.String), (r17v8 java.lang.String) binds: [B:98:0x013c, B:75:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0151 A[PHI: r22
      0x0151: PHI (r22v1 java.lang.Boolean) = (r22v0 java.lang.Boolean), (r22v3 java.lang.Boolean) binds: [B:106:0x014d, B:40:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b A[PHI: r19
      0x015b: PHI (r19v1 java.lang.String) = (r19v0 java.lang.String), (r19v7 java.lang.String) binds: [B:110:0x0157, B:29:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161 A[PHI: r19 r20
      0x0161: PHI (r19v2 java.lang.String) = (r19v1 java.lang.String), (r19v6 java.lang.String) binds: [B:113:0x015d, B:32:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r20v1 java.lang.String) = (r20v0 java.lang.String), (r20v3 java.lang.String) binds: [B:113:0x015d, B:32:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0132 A[PHI: r1
      0x0132: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v20 java.lang.String) binds: [B:89:0x012f, B:66:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0137 A[PHI: r1 r17
      0x0137: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v19 java.lang.String) binds: [B:92:0x0134, B:69:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r17v2 java.lang.String) = (r17v1 java.lang.String), (r17v10 java.lang.String) binds: [B:92:0x0134, B:69:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013b A[PHI: r1 r7 r17
      0x013b: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v18 java.lang.String) binds: [B:95:0x0138, B:72:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v10 java.lang.String) binds: [B:95:0x0138, B:72:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r17v3 java.lang.String) = (r17v2 java.lang.String), (r17v9 java.lang.String) binds: [B:95:0x0138, B:72:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tp(java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem.Tp(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    /* JADX INFO: renamed from: Vp, reason: merged with bridge method [inline-methods] */
    public final void CG1(PoiDetailApi.PoiDetailLynxResponse poiDetailLynxResponse) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        super.CG1(poiDetailLynxResponse);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDataChanged dataResumedOnViewCreated: ");
        sbLIZ.append(this.LLJLLL);
        sbLIZ.append(",this: ");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJLLL && C101600Zy.LIZ()) {
            this.LLJLLL = false;
            return;
        }
        if (this.LLJJLIIIJLLLLLLLZ != null && this.LLJLIL && Intrinsics.LJFF(this.LLJL, poiDetailLynxResponse.getUrl())) {
            Tp("update");
            InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC1541990qEH2 != null) {
                interfaceC1541990qEH2.U0(Gp());
            }
            String businessData = poiDetailLynxResponse.getBusinessData();
            if (businessData != null && businessData.length() > 0 && (interfaceC1541990qEH = this.LLJJLIIIJLLLLLLLZ) != null) {
                interfaceC1541990qEH.c1(businessData, Qp(poiDetailLynxResponse));
                return;
            }
            return;
        }
        this.LLJLLIL.LIZ = Long.valueOf(System.currentTimeMillis());
        Tp("init");
        this.LLJL = poiDetailLynxResponse.getUrl();
        String url = poiDetailLynxResponse.getUrl();
        if (url == null) {
            return;
        }
        this.LLJLIL = false;
        C166V c166v = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        C786410Ut5.LJJJJIZL(((C1187830h13) c166v.LIZ(this)).LLILLJJLI);
        if (!Wp()) {
            Bp(false);
        }
        this.LLJZIJLIL = SystemClock.elapsedRealtime();
        if (Wp()) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C433720Gza(this, null), 3);
            View view = this.LLJJJJJIL;
            if (view == null) {
                return;
            }
            Fp(view, 0.5f, 0, new AwS102S1200000_18(this, url, poiDetailLynxResponse, 11));
            return;
        }
        ((C1187830h13) this.LLJJL.LIZ(this)).LLILLJJLI.addView(Ep(url, poiDetailLynxResponse), new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // X.InterfaceC1180270gor
    public void onEvent(AbstractC1186480gys abstractC1186480gys) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        InterfaceC1541990qEH interfaceC1541990qEH2;
        if (abstractC1186480gys instanceof C1185810gxn) {
            int i = C1186870gzV.LIZ[((C1185810gxn) abstractC1186480gys).LL.ordinal()];
            if (i != 1) {
                if (i == 2 && AnonymousClass0753.LIZ() && (interfaceC1541990qEH2 = this.LLJJLIIIJLLLLLLLZ) != null) {
                    interfaceC1541990qEH2.onHide();
                    return;
                }
                return;
            }
            if (!AnonymousClass0753.LIZ() || (interfaceC1541990qEH = this.LLJJLIIIJLLLLLLLZ) == null) {
                return;
            }
            interfaceC1541990qEH.onShow();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        super.onViewCreated(view);
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = "";
        }
        C1175440gh4.LIZ(this, strLJFF, C1173980gei.LIZ(this), 8);
        pH(new AwS597S0100000_18(this, 336));
        if (C101600Zy.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewCreated currentData is null: ");
            if (C1174850gg7.LIZJ(this) == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            PoiDetailApi.PoiDetailLynxResponse poiDetailLynxResponse = (PoiDetailApi.PoiDetailLynxResponse) C1174850gg7.LIZJ(this);
            if (poiDetailLynxResponse != null) {
                CG1(poiDetailLynxResponse);
                this.LLJLLL = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0256 A[PHI: r5
      0x0256: PHI (r5v4 java.lang.Boolean) = (r5v3 java.lang.Boolean), (r5v13 java.lang.Boolean) binds: [B:123:0x0253, B:109:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0271 A[PHI: r47
      0x0271: PHI (r47v1 java.lang.Boolean) = (r47v0 java.lang.Boolean), (r47v3 java.lang.Boolean) binds: [B:134:0x026d, B:70:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027b A[PHI: r41
      0x027b: PHI (r41v1 java.lang.String) = (r41v0 java.lang.String), (r41v5 java.lang.String) binds: [B:138:0x0277, B:59:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0281 A[PHI: r41 r42
      0x0281: PHI (r41v2 java.lang.String) = (r41v1 java.lang.String), (r41v4 java.lang.String) binds: [B:141:0x027d, B:62:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r42v1 java.lang.String) = (r42v0 java.lang.String), (r42v3 java.lang.String) binds: [B:141:0x027d, B:62:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x029c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB Ep(java.lang.String r51, final com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PoiDetailLynxResponse r52) {
        /*
            Method dump skipped, instruction units count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem.Ep(java.lang.String, com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiDetailLynxResponse):X.0qEB");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d A[PHI: r3
      0x019d: PHI (r3v22 java.lang.Boolean) = (r3v21 java.lang.Boolean), (r3v31 java.lang.Boolean) binds: [B:103:0x019a, B:89:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b8 A[PHI: r51
      0x01b8: PHI (r51v1 java.lang.Boolean) = (r51v0 java.lang.Boolean), (r51v3 java.lang.Boolean) binds: [B:114:0x01b4, B:47:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c2 A[PHI: r45
      0x01c2: PHI (r45v1 java.lang.String) = (r45v0 java.lang.String), (r45v5 java.lang.String) binds: [B:118:0x01be, B:36:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c8 A[PHI: r45 r46
      0x01c8: PHI (r45v2 java.lang.String) = (r45v1 java.lang.String), (r45v4 java.lang.String) binds: [B:121:0x01c4, B:39:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r46v1 java.lang.String) = (r46v0 java.lang.String), (r46v3 java.lang.String) binds: [B:121:0x01c4, B:39:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Up(X.InterfaceC1541990qEH r55, boolean r56, java.lang.String r57) {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem.Up(X.0qEH, boolean, java.lang.String):void");
    }

    public final void Fp(final View view, final float f, final int i, final Function1<? super Integer, Unit> function1) {
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0h0s
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    this.LL.Fp(view2, f, i, function1);
                }
            });
        } else {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            C786410Ut5.y3(viewTreeObserver, new ViewTreeObserver.OnPreDrawListener() { // from class: X.0h0q
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    if (viewTreeObserver.isAlive()) {
                        C786410Ut5.D3(viewTreeObserver, this);
                    }
                    this.Xp(view, f, i, function1, false);
                    return true;
                }
            });
        }
    }

    public final void Xp(final View view, final float f, final int i, final Function1<? super Integer, Unit> function1, boolean z) {
        if (i >= 5) {
            function1.invoke(Integer.valueOf(i));
            return;
        }
        if (z) {
            C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.0h0p
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    if (!view.isAttachedToWindow()) {
                        function1.invoke(Integer.valueOf(i));
                        return;
                    }
                    PoiDetailLynxAssem poiDetailLynxAssem = this;
                    View view2 = view;
                    poiDetailLynxAssem.getClass();
                    if (view2.isShown() && view2.getWidth() > 0 && view2.getHeight() > 0) {
                        function1.invoke(Integer.valueOf(i));
                    } else {
                        this.Xp(view, f, i + 1, function1, true);
                    }
                }
            });
        } else if (view.isShown() && view.getWidth() > 0 && view.getHeight() > 0) {
            Xp(view, f, i + 1, function1, true);
        } else {
            Xp(view, f, i + 1, function1, false);
        }
    }
}
