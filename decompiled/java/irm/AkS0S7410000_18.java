package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C098200Yq;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185490gxH;
import X.C1186070gyD;
import X.C1252710ihh;
import X.C13LE;
import X.C1558520qew;
import X.C189200o6;
import X.C18JG;
import X.C2365509Or;
import X.InterfaceC1184330gvP;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.IconTag;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AkS0S7410000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l10;
    public Object l7;
    public Object l8;
    public Object l9;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public String s4;
    public String s5;
    public String s6;
    public boolean z11;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS0S7410000_18 akS0S7410000_18, View view) {
        PoiDetailHeaderAssem poiDetailHeaderAssem = (PoiDetailHeaderAssem) akS0S7410000_18.l7;
        View view2 = (View) akS0S7410000_18.l8;
        String str = akS0S7410000_18.s0;
        boolean z = akS0S7410000_18.z11;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) akS0S7410000_18.l9;
        poiDetailHeaderAssem.jq(view2, str, z, poiDetailResponse, akS0S7410000_18.s1, akS0S7410000_18.s2, akS0S7410000_18.s3, akS0S7410000_18.s4, akS0S7410000_18.s5, akS0S7410000_18.s6, poiDetailResponse.mobPicMode());
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHeaderAssem) akS0S7410000_18.l7);
        String str2 = ((IconTag) akS0S7410000_18.l10).tagId;
        String strMobPicMode = ((PoiListApi.PoiDetailResponse) akS0S7410000_18.l9).mobPicMode();
        PageFinder pageFinderZo = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJIZ(pageFinderZo, interfaceC665370Q7zLJIIL, str2, null, strMobPicMode, "highlight", true);
    }

    public static final void LIZ$1(AkS0S7410000_18 akS0S7410000_18, View view) {
        PoiDetailHeaderAssem poiDetailHeaderAssem = (PoiDetailHeaderAssem) akS0S7410000_18.l7;
        View view2 = (View) akS0S7410000_18.l8;
        String str = akS0S7410000_18.s0;
        boolean z = akS0S7410000_18.z11;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) akS0S7410000_18.l9;
        poiDetailHeaderAssem.jq(view2, str, z, poiDetailResponse, akS0S7410000_18.s1, akS0S7410000_18.s2, akS0S7410000_18.s3, akS0S7410000_18.s4, akS0S7410000_18.s5, akS0S7410000_18.s6, poiDetailResponse.mobPicMode());
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHeaderAssem) akS0S7410000_18.l7);
        String str2 = ((IconTag) akS0S7410000_18.l10).tagId;
        String strMobPicMode = ((PoiListApi.PoiDetailResponse) akS0S7410000_18.l9).mobPicMode();
        PageFinder pageFinderZo = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJIZ(pageFinderZo, interfaceC665370Q7zLJIIL, str2, null, strMobPicMode, "highlight", true);
    }

    public static final void LIZ$2(AkS0S7410000_18 akS0S7410000_18, View view) {
        PoiDetailHeaderAssem poiDetailHeaderAssem = (PoiDetailHeaderAssem) akS0S7410000_18.l7;
        View view2 = (View) akS0S7410000_18.l8;
        String str = akS0S7410000_18.s0;
        boolean z = akS0S7410000_18.z11;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) akS0S7410000_18.l9;
        poiDetailHeaderAssem.jq(view2, str, z, poiDetailResponse, akS0S7410000_18.s1, akS0S7410000_18.s2, akS0S7410000_18.s3, akS0S7410000_18.s4, akS0S7410000_18.s5, akS0S7410000_18.s6, poiDetailResponse.mobPicMode());
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHeaderAssem) akS0S7410000_18.l7);
        String str2 = ((IconTag) akS0S7410000_18.l10).tagId;
        String strMobPicMode = ((PoiListApi.PoiDetailResponse) akS0S7410000_18.l9).mobPicMode();
        PageFinder pageFinderZo = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJIZ(pageFinderZo, interfaceC665370Q7zLJIIL, str2, null, strMobPicMode, "highlight", true);
    }

    public static final void LIZ$3(AkS0S7410000_18 akS0S7410000_18, View view) {
        String strLJ;
        Object c098200Yq;
        String groupId;
        Object obj;
        boolean zLJFF;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185490gxH c1185490gxH;
        Map<String, Object> extraParam;
        C1184480gve c1184480gve3;
        C1185490gxH c1185490gxH2;
        PoiCurrentSessionInfo poiCurrentSessionInfoDp = ((PoiDetailFoodHeaderAssem) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp == null || (strLJ = C2365509Or.LJ(poiCurrentSessionInfoDp)) == null) {
            strLJ = "";
        }
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = ((View) akS0S7410000_18.l8).getContext();
        String str = null;
        String strLIZ = C18JG.LIZ("c74061.d2545", PageFinder.via((View) akS0S7410000_18.l9), null);
        try {
            InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI((PoiDetailFoodHeaderAssem) akS0S7410000_18.l7, C13LE.LIZ(InterfaceC1184330gvP.class), null);
            if (interfaceC1184330gvP != null) {
                c098200Yq = interfaceC1184330gvP.Nf();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        C1184460gvc c1184460gvcOo = ((PoiDetailFoodHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo != null && (c1184480gve3 = c1184460gvcOo.LLILLL) != null && (c1185490gxH2 = c1184480gve3.LLIZ) != null) {
            groupId = c1185490gxH2.getGroupId();
        } else {
            groupId = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailFoodHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve2 = c1184460gvcOo2.LLILLL) != null && (c1185490gxH = c1184480gve2.LLIZ) != null && (extraParam = c1185490gxH.getExtraParam()) != null) {
            obj = extraParam.get("aweme_type");
        } else {
            obj = null;
        }
        C1184460gvc c1184460gvcOo3 = ((PoiDetailFoodHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo3 != null && (c1184480gve = c1184460gvcOo3.LLILLL) != null) {
            zLJFF = Intrinsics.LJFF(c1184480gve.LLJILLL, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        PoiCurrentSessionInfo poiCurrentSessionInfoDp2 = ((PoiDetailFoodHeaderAssem) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp2 != null) {
            str = poiCurrentSessionInfoDp2.poiSessionId;
        }
        C1186070gyD.LIZJ(c1186070gyD, context, (View) akS0S7410000_18.l9, akS0S7410000_18.s0, akS0S7410000_18.z11, (PoiListApi.PoiDetailResponse) akS0S7410000_18.l10, akS0S7410000_18.s1, akS0S7410000_18.s2, akS0S7410000_18.s3, akS0S7410000_18.s4, akS0S7410000_18.s5, akS0S7410000_18.s6, strLIZ, c1185410gx9, groupId, obj, zLJFF, strLJ, "click_tag_more", str, "highlight", ((PoiListApi.PoiDetailResponse) akS0S7410000_18.l10).mobPicMode(), null, 2097152);
    }

    public static final void LIZ$4(AkS0S7410000_18 akS0S7410000_18, View view) {
        String strLJ;
        Object c098200Yq;
        String groupId;
        Object obj;
        boolean zLJFF;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185490gxH c1185490gxH;
        Map<String, Object> extraParam;
        C1184480gve c1184480gve3;
        C1185490gxH c1185490gxH2;
        PoiCurrentSessionInfo poiCurrentSessionInfoDp = ((PoiDetailHotelHeaderAssem) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp == null || (strLJ = C2365509Or.LJ(poiCurrentSessionInfoDp)) == null) {
            strLJ = "";
        }
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = ((TuxIconView) akS0S7410000_18.l8).getContext();
        String str = null;
        String strLIZ = C18JG.LIZ("c74061.d2545", PageFinder.via((View) akS0S7410000_18.l9), null);
        try {
            InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI((PoiDetailHotelHeaderAssem) akS0S7410000_18.l7, C13LE.LIZ(InterfaceC1184330gvP.class), null);
            if (interfaceC1184330gvP != null) {
                c098200Yq = interfaceC1184330gvP.Nf();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        C1184460gvc c1184460gvcOo = ((PoiDetailHotelHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo != null && (c1184480gve3 = c1184460gvcOo.LLILLL) != null && (c1185490gxH2 = c1184480gve3.LLIZ) != null) {
            groupId = c1185490gxH2.getGroupId();
        } else {
            groupId = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHotelHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve2 = c1184460gvcOo2.LLILLL) != null && (c1185490gxH = c1184480gve2.LLIZ) != null && (extraParam = c1185490gxH.getExtraParam()) != null) {
            obj = extraParam.get("aweme_type");
        } else {
            obj = null;
        }
        C1184460gvc c1184460gvcOo3 = ((PoiDetailHotelHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo3 != null && (c1184480gve = c1184460gvcOo3.LLILLL) != null) {
            zLJFF = Intrinsics.LJFF(c1184480gve.LLJILLL, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        PoiCurrentSessionInfo poiCurrentSessionInfoDp2 = ((PoiDetailHotelHeaderAssem) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp2 != null) {
            str = poiCurrentSessionInfoDp2.poiSessionId;
        }
        C1186070gyD.LIZJ(c1186070gyD, context, (TuxIconView) akS0S7410000_18.l9, akS0S7410000_18.s0, akS0S7410000_18.z11, (PoiListApi.PoiDetailResponse) akS0S7410000_18.l10, akS0S7410000_18.s1, akS0S7410000_18.s2, akS0S7410000_18.s3, akS0S7410000_18.s4, akS0S7410000_18.s5, akS0S7410000_18.s6, strLIZ, c1185410gx9, groupId, obj, zLJFF, strLJ, "click_tag_more", str, "highlight", ((PoiListApi.PoiDetailResponse) akS0S7410000_18.l10).mobPicMode(), null, 2097152);
    }

    public static final void LIZ$5(AkS0S7410000_18 akS0S7410000_18, View view) {
        String strLJ;
        Object c098200Yq;
        String groupId;
        Object obj;
        boolean zLJFF;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185490gxH c1185490gxH;
        Map<String, Object> extraParam;
        C1184480gve c1184480gve3;
        C1185490gxH c1185490gxH2;
        PoiCurrentSessionInfo poiCurrentSessionInfoDp = ((PoiDetailTravelHeaderAssem) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp == null || (strLJ = C2365509Or.LJ(poiCurrentSessionInfoDp)) == null) {
            strLJ = "";
        }
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = ((TuxIconView) akS0S7410000_18.l8).getContext();
        String str = null;
        String strLIZ = C18JG.LIZ("c74061.d2545", PageFinder.via((View) akS0S7410000_18.l9), null);
        try {
            InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI((PoiDetailTravelHeaderAssem) akS0S7410000_18.l7, C13LE.LIZ(InterfaceC1184330gvP.class), null);
            if (interfaceC1184330gvP != null) {
                c098200Yq = interfaceC1184330gvP.Nf();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        C1184460gvc c1184460gvcOo = ((PoiDetailTravelHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo != null && (c1184480gve3 = c1184460gvcOo.LLILLL) != null && (c1185490gxH2 = c1184480gve3.LLIZ) != null) {
            groupId = c1185490gxH2.getGroupId();
        } else {
            groupId = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailTravelHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve2 = c1184460gvcOo2.LLILLL) != null && (c1185490gxH = c1184480gve2.LLIZ) != null && (extraParam = c1185490gxH.getExtraParam()) != null) {
            obj = extraParam.get("aweme_type");
        } else {
            obj = null;
        }
        C1184460gvc c1184460gvcOo3 = ((PoiDetailTravelHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo3 != null && (c1184480gve = c1184460gvcOo3.LLILLL) != null) {
            zLJFF = Intrinsics.LJFF(c1184480gve.LLJILLL, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        PoiCurrentSessionInfo poiCurrentSessionInfoDp2 = ((PoiDetailTravelHeaderAssem) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp2 != null) {
            str = poiCurrentSessionInfoDp2.poiSessionId;
        }
        C1186070gyD.LIZJ(c1186070gyD, context, (TuxIconView) akS0S7410000_18.l9, akS0S7410000_18.s0, akS0S7410000_18.z11, (PoiListApi.PoiDetailResponse) akS0S7410000_18.l10, akS0S7410000_18.s1, akS0S7410000_18.s2, akS0S7410000_18.s3, akS0S7410000_18.s4, akS0S7410000_18.s5, akS0S7410000_18.s6, strLIZ, c1185410gx9, groupId, obj, zLJFF, strLJ, "click_tag_more", str, "highlight", ((PoiListApi.PoiDetailResponse) akS0S7410000_18.l10).mobPicMode(), null, 2097152);
    }

    public static final void LIZ$6(AkS0S7410000_18 akS0S7410000_18, View view) {
        String strLJ;
        Object c098200Yq;
        String groupId;
        Object obj;
        boolean zLJFF;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185490gxH c1185490gxH;
        Map<String, Object> extraParam;
        C1184480gve c1184480gve3;
        C1185490gxH c1185490gxH2;
        PoiCurrentSessionInfo poiCurrentSessionInfoDp = ((PoiDetailTravelHeaderAssemV2) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp == null || (strLJ = C2365509Or.LJ(poiCurrentSessionInfoDp)) == null) {
            strLJ = "";
        }
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = ((View) akS0S7410000_18.l8).getContext();
        String str = null;
        String strLIZ = C18JG.LIZ("c74061.d2545", PageFinder.via((View) akS0S7410000_18.l9), null);
        try {
            InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI((PoiDetailTravelHeaderAssemV2) akS0S7410000_18.l7, C13LE.LIZ(InterfaceC1184330gvP.class), null);
            if (interfaceC1184330gvP != null) {
                c098200Yq = interfaceC1184330gvP.Nf();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        C1184460gvc c1184460gvcOo = ((PoiDetailTravelHeaderAssemV2) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo != null && (c1184480gve3 = c1184460gvcOo.LLILLL) != null && (c1185490gxH2 = c1184480gve3.LLIZ) != null) {
            groupId = c1185490gxH2.getGroupId();
        } else {
            groupId = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailTravelHeaderAssemV2) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve2 = c1184460gvcOo2.LLILLL) != null && (c1185490gxH = c1184480gve2.LLIZ) != null && (extraParam = c1185490gxH.getExtraParam()) != null) {
            obj = extraParam.get("aweme_type");
        } else {
            obj = null;
        }
        C1184460gvc c1184460gvcOo3 = ((PoiDetailTravelHeaderAssemV2) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo3 != null && (c1184480gve = c1184460gvcOo3.LLILLL) != null) {
            zLJFF = Intrinsics.LJFF(c1184480gve.LLJILLL, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        PoiCurrentSessionInfo poiCurrentSessionInfoDp2 = ((PoiDetailTravelHeaderAssemV2) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp2 != null) {
            str = poiCurrentSessionInfoDp2.poiSessionId;
        }
        C1186070gyD.LIZJ(c1186070gyD, context, (View) akS0S7410000_18.l9, akS0S7410000_18.s0, akS0S7410000_18.z11, (PoiListApi.PoiDetailResponse) akS0S7410000_18.l10, akS0S7410000_18.s1, akS0S7410000_18.s2, akS0S7410000_18.s3, akS0S7410000_18.s4, akS0S7410000_18.s5, akS0S7410000_18.s6, strLIZ, c1185410gx9, groupId, obj, zLJFF, strLJ, "click_tag_more", str, "highlight", ((PoiListApi.PoiDetailResponse) akS0S7410000_18.l10).mobPicMode(), null, 2097152);
    }

    public static final void LIZ$7(AkS0S7410000_18 akS0S7410000_18, View view) {
        String strLJ;
        Object c098200Yq;
        String groupId;
        Object obj;
        boolean zLJFF;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185490gxH c1185490gxH;
        Map<String, Object> extraParam;
        C1184480gve c1184480gve3;
        C1185490gxH c1185490gxH2;
        PoiCurrentSessionInfo poiCurrentSessionInfoDp = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp == null || (strLJ = C2365509Or.LJ(poiCurrentSessionInfoDp)) == null) {
            strLJ = "";
        }
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = ((TuxIconView) akS0S7410000_18.l8).getContext();
        String str = null;
        String strLIZ = C18JG.LIZ("c74061.d2545", PageFinder.via((View) akS0S7410000_18.l9), null);
        try {
            InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI((PoiDetailHeaderAssem) akS0S7410000_18.l7, C13LE.LIZ(InterfaceC1184330gvP.class), null);
            if (interfaceC1184330gvP != null) {
                c098200Yq = interfaceC1184330gvP.Nf();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo != null && (c1184480gve3 = c1184460gvcOo.LLILLL) != null && (c1185490gxH2 = c1184480gve3.LLIZ) != null) {
            groupId = c1185490gxH2.getGroupId();
        } else {
            groupId = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve2 = c1184460gvcOo2.LLILLL) != null && (c1185490gxH = c1184480gve2.LLIZ) != null && (extraParam = c1185490gxH.getExtraParam()) != null) {
            obj = extraParam.get("aweme_type");
        } else {
            obj = null;
        }
        C1184460gvc c1184460gvcOo3 = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo3 != null && (c1184480gve = c1184460gvcOo3.LLILLL) != null) {
            zLJFF = Intrinsics.LJFF(c1184480gve.LLJILLL, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        PoiCurrentSessionInfo poiCurrentSessionInfoDp2 = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp2 != null) {
            str = poiCurrentSessionInfoDp2.poiSessionId;
        }
        C1186070gyD.LIZJ(c1186070gyD, context, (TuxIconView) akS0S7410000_18.l9, akS0S7410000_18.s0, akS0S7410000_18.z11, (PoiListApi.PoiDetailResponse) akS0S7410000_18.l10, akS0S7410000_18.s1, akS0S7410000_18.s2, akS0S7410000_18.s3, akS0S7410000_18.s4, akS0S7410000_18.s5, akS0S7410000_18.s6, strLIZ, c1185410gx9, groupId, obj, zLJFF, strLJ, "click_tag_more", str, "highlight", ((PoiListApi.PoiDetailResponse) akS0S7410000_18.l10).mobPicMode(), null, 2097152);
    }

    public static final void LIZ$8(AkS0S7410000_18 akS0S7410000_18, View view) {
        String strLJ;
        Object c098200Yq;
        String groupId;
        Object obj;
        boolean zLJFF;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1185490gxH c1185490gxH;
        Map<String, Object> extraParam;
        C1184480gve c1184480gve3;
        C1185490gxH c1185490gxH2;
        PoiCurrentSessionInfo poiCurrentSessionInfoDp = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp == null || (strLJ = C2365509Or.LJ(poiCurrentSessionInfoDp)) == null) {
            strLJ = "";
        }
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = ((TuxIconView) akS0S7410000_18.l8).getContext();
        String str = null;
        String strLIZ = C18JG.LIZ("c74061.d2545", PageFinder.via((View) akS0S7410000_18.l9), null);
        try {
            InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI((PoiDetailHeaderAssem) akS0S7410000_18.l7, C13LE.LIZ(InterfaceC1184330gvP.class), null);
            if (interfaceC1184330gvP != null) {
                c098200Yq = interfaceC1184330gvP.Nf();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo != null && (c1184480gve3 = c1184460gvcOo.LLILLL) != null && (c1185490gxH2 = c1184480gve3.LLIZ) != null) {
            groupId = c1185490gxH2.getGroupId();
        } else {
            groupId = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve2 = c1184460gvcOo2.LLILLL) != null && (c1185490gxH = c1184480gve2.LLIZ) != null && (extraParam = c1185490gxH.getExtraParam()) != null) {
            obj = extraParam.get("aweme_type");
        } else {
            obj = null;
        }
        C1184460gvc c1184460gvcOo3 = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).Oo();
        if (c1184460gvcOo3 != null && (c1184480gve = c1184460gvcOo3.LLILLL) != null) {
            zLJFF = Intrinsics.LJFF(c1184480gve.LLJILLL, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        PoiCurrentSessionInfo poiCurrentSessionInfoDp2 = ((PoiDetailHeaderAssem) akS0S7410000_18.l7).dp();
        if (poiCurrentSessionInfoDp2 != null) {
            str = poiCurrentSessionInfoDp2.poiSessionId;
        }
        C1186070gyD.LIZJ(c1186070gyD, context, (TuxIconView) akS0S7410000_18.l9, akS0S7410000_18.s0, akS0S7410000_18.z11, (PoiListApi.PoiDetailResponse) akS0S7410000_18.l10, akS0S7410000_18.s1, akS0S7410000_18.s2, akS0S7410000_18.s3, akS0S7410000_18.s4, akS0S7410000_18.s5, akS0S7410000_18.s6, strLIZ, c1185410gx9, groupId, obj, zLJFF, strLJ, "click_tag_more", str, "highlight", ((PoiListApi.PoiDetailResponse) akS0S7410000_18.l10).mobPicMode(), null, 2097152);
    }

    public AkS0S7410000_18(Object obj, Object obj2, String str, boolean z, Object obj3, String str2, String str3, String str4, String str5, String str6, String str7, Object obj4, int i) {
        this.$t = i;
        this.l7 = obj;
        this.l8 = obj2;
        this.s0 = str;
        this.z11 = z;
        this.l9 = obj3;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.s4 = str5;
        this.s5 = str6;
        this.s6 = str7;
        this.l10 = obj4;
    }
}
