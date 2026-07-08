package kotlin.jvm.internal;

import X.C08E7;
import X.C098200Yq;
import X.C09AJ;
import X.C09AY;
import X.C0OM1;
import X.C106L;
import X.C109T;
import X.C1185040gwY;
import X.C1390920mIc;
import X.C1548420qOe;
import X.C1720106oR;
import X.C189200o6;
import X.C1892770zM3;
import X.C1892940zMK;
import X.C1892950zML;
import X.C1892980zMO;
import X.C1893200zMk;
import X.C1893670zNV;
import X.C1894530zOt;
import X.C1898010zUV;
import X.C1898700zVc;
import X.C1903040zcc;
import X.C1903510zdN;
import X.C1904220zeW;
import X.C19482611Ke;
import X.C1954807lC;
import X.C20484080s;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.DialogInterfaceOnCancelListenerC19332810kI;
import X.EnumC1892930zMJ;
import X.EnumC1892960zMM;
import X.EnumC1892970zMN;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.IncentiveCommon;
import com.bytedance.touchpoint.api.model.ProgressInfo;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS149S0201000_28 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS149S0201000_28 awS149S0201000_28) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        C0OM1 c0om1 = (C0OM1) awS149S0201000_28.l0;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        c1390920mIc.LIZLLL(awS149S0201000_28.i2, false);
        c1390920mIc.LIZ.LLJJIII = (View) awS149S0201000_28.l1;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.LL = new DialogInterface.OnCancelListener() { // from class: X.0zOs
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                String str;
                String strLJIJJ;
                Function0<Unit> function0 = C1894530zOt.LIZLLL;
                if (function0 != null) {
                    function0.invoke();
                }
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enter_from", "feed");
                    linkedHashMap.put("is_adult", CardStruct.IStatusCode.DEFAULT);
                    C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                    IncentiveCommon incentiveCommon = (IncentiveCommon) C2178808gE.LIZ().LJ(23);
                    if (incentiveCommon != null) {
                        str = incentiveCommon.notificationName;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put("activity_name", str);
                    AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                    if (abstractC1896090zRP != null) {
                        strLJIJJ = abstractC1896090zRP.LJIJJ();
                    } else {
                        strLJIJJ = null;
                    }
                    linkedHashMap.put("region", strLJIJJ);
                    interfaceC1897260zTILIZIZ.LIZ("age_pop_click", linkedHashMap);
                }
                C1893790zNh c1893790zNh = C1893790zNh.LIZ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("is_adult", CardStruct.IStatusCode.DEFAULT);
                c1893790zNh.getClass();
                C1893790zNh.LJIIJ("age_pop_click_onelink", null, linkedHashMap2);
            }
        };
        C1894530zOt.LIZ = tuxSheet2;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS149S0201000_28 awS149S0201000_28) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZLLL(awS149S0201000_28.i2, false);
        c1390920mIc.LIZ.LLJJIII = (View) awS149S0201000_28.l0;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LL = new DialogInterfaceOnCancelListenerC19332810kI((Function0) awS149S0201000_28.l1, 0);
        C1898010zUV.LIZIZ = tuxSheet;
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS149S0201000_28 awS149S0201000_28) {
        ((C109T) awS149S0201000_28.l0).LJIJ(awS149S0201000_28.i2, (View) awS149S0201000_28.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS149S0201000_28 awS149S0201000_28) {
        ((C109T) awS149S0201000_28.l0).LJIJ(awS149S0201000_28.i2, (View) awS149S0201000_28.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS149S0201000_28 r8) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS149S0201000_28.invoke$12(kotlin.jvm.internal.AwS149S0201000_28):java.lang.Object");
    }

    public static final Object invoke$13(AwS149S0201000_28 awS149S0201000_28) {
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService == null || !iPrivacySettingsDepService.LJIJI("privacy_settings_private_account")) {
            ((C106L) awS149S0201000_28.l0).LJJIFFI(awS149S0201000_28.i2, (View) awS149S0201000_28.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS149S0201000_28 awS149S0201000_28) {
        List list = (List) awS149S0201000_28.l0;
        if (list != null) {
            int i = awS149S0201000_28.i2;
            ArrayList<TouchPoint> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((TouchPoint) obj).touchPointId == i) {
                    arrayList.add(obj);
                }
            }
            List list2 = (List) awS149S0201000_28.l1;
            for (TouchPoint touchPoint : arrayList) {
                List<C1893670zNV> listLIZLLL = C20484080s.LIZLLL(Bubble[].class, touchPoint.data);
                for (C1893670zNV c1893670zNV : listLIZLLL) {
                    c1893670zNV.LIZ = touchPoint.touchPointId;
                    String str = touchPoint.touchPointName;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    c1893670zNV.LIZIZ = str;
                    int i2 = touchPoint.launchPlanId;
                    if (i2 == null) {
                        i2 = -1;
                    }
                    c1893670zNV.LIZJ = i2;
                    String str3 = touchPoint.abVersions;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c1893670zNV.LIZLLL = str3;
                    c1893670zNV.LJ = touchPoint.customEventParams;
                    c1893670zNV.LJI = touchPoint.product;
                    String str4 = touchPoint.data;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    c1893670zNV.LJFF = str2;
                }
                list2.addAll(listLIZLLL);
            }
        }
        List list3 = (List) awS149S0201000_28.l1;
        if (!(true ^ list3.isEmpty())) {
            return null;
        }
        return list3;
    }

    public static final Object invoke$15(AwS149S0201000_28 awS149S0201000_28) {
        ((C1903040zcc) awS149S0201000_28.l0).LJFF(awS149S0201000_28.i2, (InboxEntrancePod) awS149S0201000_28.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS149S0201000_28 awS149S0201000_28) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportShowByDiff AfterDiff reportType:");
        sbLIZ.append(awS149S0201000_28.i2);
        sbLIZ.append(", data:");
        sbLIZ.append(((C1903510zdN) awS149S0201000_28.l0).LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        ((Function0) awS149S0201000_28.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS149S0201000_28 awS149S0201000_28) {
        Integer num;
        C1898700zVc c1898700zVc = (C1898700zVc) awS149S0201000_28.l0;
        ProgressInfo progressInfo = (ProgressInfo) awS149S0201000_28.l1;
        if (progressInfo != null) {
            num = progressInfo.awardAmount;
        } else {
            num = null;
        }
        c1898700zVc.LJJI(num, new AwS134S0101000_28(c1898700zVc, awS149S0201000_28.i2, 26));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS149S0201000_28 awS149S0201000_28) {
        Object c098200Yq;
        NoticeList noticeList = (NoticeList) awS149S0201000_28.l0;
        int i = awS149S0201000_28.i2;
        try {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("NCManager", "NoticeCountManager#rxInitNoticeCount");
            C1904220zeW.LL.getClass();
            c098200Yq = Boolean.valueOf(C1904220zeW.LJJJJLL(noticeList, i));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C09AJ c09aj = (C09AJ) awS149S0201000_28.l1;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C08E7.LIZ(c09aj, Boolean.valueOf(((Boolean) c098200Yq).booleanValue()));
        }
        C09AJ c09aj2 = (C09AJ) awS149S0201000_28.l1;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C08E7.LIZ(c09aj2, Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS149S0201000_28 awS149S0201000_28) {
        SparkActivity sparkActivityLIZ;
        String url;
        WebKitView webKitViewLIZ;
        WebKitView webKitViewLIZ2;
        int i;
        SparkActivity sparkActivityLIZ2;
        C1892980zMO c1892980zMO = (C1892980zMO) awS149S0201000_28.l0;
        EnumC1892970zMN enumC1892970zMN = (EnumC1892970zMN) awS149S0201000_28.l1;
        int i2 = awS149S0201000_28.i2;
        c1892980zMO.getClass();
        C1892770zM3 c1892770zM3 = C1892770zM3.LIZ;
        String str = enumC1892970zMN.LL;
        c1892770zM3.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1892770zM3.LIZJ(c2344009Gk);
        c2344009Gk.LJIIIIZZ("btn_name", str);
        c2344009Gk.LIZJ(i2, "index");
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_transaction_webview_expand_popup_click", map, null);
        int iOrdinal = enumC1892970zMN.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    SparkContext sparkContext = c1892980zMO.LLILZIL;
                    if (sparkContext != null && (sparkActivityLIZ2 = C1893200zMk.LIZ(sparkContext)) != null) {
                        C1892940zMK c1892940zMK = C1892940zMK.LIZ;
                        EnumC1892930zMJ enumC1892930zMJ = EnumC1892930zMJ.COPY_LINK;
                        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(c1892980zMO, 13);
                        c1892940zMK.getClass();
                        C1892940zMK.LIZ(sparkActivityLIZ2, enumC1892930zMJ, awS572S0100000_28);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                EnumC1892960zMM enumC1892960zMM = c1892980zMO.LLJ;
                if (enumC1892960zMM == null || ((i = C1892950zML.LIZIZ[enumC1892960zMM.ordinal()]) != 1 && i != 2)) {
                    SparkContext sparkContext2 = c1892980zMO.LLILZIL;
                    if (sparkContext2 == null || (webKitViewLIZ2 = C1548420qOe.LIZ(sparkContext2)) == null || (url = webKitViewLIZ2.getUrl()) == null) {
                        url = "";
                    }
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("host", UriProtector.parse(url).getHost());
                    C20684815ws.LJIILLIIL("poi_webview_refresh", c2344009Gk2.LIZ);
                    SparkContext sparkContext3 = c1892980zMO.LLILZIL;
                    if (sparkContext3 != null && (webKitViewLIZ = C1548420qOe.LIZ(sparkContext3)) != null) {
                        webKitViewLIZ.reload();
                    }
                }
            }
        } else {
            SparkContext sparkContext4 = c1892980zMO.LLILZIL;
            if (sparkContext4 != null && (sparkActivityLIZ = C1893200zMk.LIZ(sparkContext4)) != null) {
                C1892940zMK c1892940zMK2 = C1892940zMK.LIZ;
                EnumC1892930zMJ enumC1892930zMJ2 = EnumC1892930zMJ.VIEW_ON_BROWSER;
                AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28(c1892980zMO, 12);
                c1892940zMK2.getClass();
                C1892940zMK.LIZ(sparkActivityLIZ, enumC1892930zMJ2, awS572S0100000_282);
            }
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$3(AwS149S0201000_28 awS149S0201000_28) {
        ((C109T) awS149S0201000_28.l0).LJIJ(awS149S0201000_28.i2, (View) awS149S0201000_28.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS149S0201000_28 awS149S0201000_28) {
        ((C109T) awS149S0201000_28.l0).LJIJ(awS149S0201000_28.i2, (View) awS149S0201000_28.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS149S0201000_28 awS149S0201000_28) {
        ((C109T) awS149S0201000_28.l0).LJIJ(awS149S0201000_28.i2, (View) awS149S0201000_28.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS149S0201000_28 awS149S0201000_28) {
        ((C109T) awS149S0201000_28.l0).LJIJ(awS149S0201000_28.i2, (View) awS149S0201000_28.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS149S0201000_28 awS149S0201000_28) {
        ((C109T) awS149S0201000_28.l0).LJIJ(awS149S0201000_28.i2, (View) awS149S0201000_28.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS149S0201000_28 awS149S0201000_28) {
        ((C109T) awS149S0201000_28.l0).LJIJ(awS149S0201000_28.i2, (View) awS149S0201000_28.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS149S0201000_28 awS149S0201000_28) {
        ((C109T) awS149S0201000_28.l0).LJIJ(awS149S0201000_28.i2, (View) awS149S0201000_28.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(List list, List list2, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.i2 = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(int i, C1903510zdN c1903510zdN, AwS572S0100000_28 awS572S0100000_28, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c1903510zdN;
        this.l1 = awS572S0100000_28;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(C0OM1 c0om1, int i, View view, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0om1;
        this.i2 = i;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(C1892980zMO c1892980zMO, EnumC1892970zMN enumC1892970zMN, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1892980zMO;
        this.l1 = enumC1892970zMN;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(C1898700zVc c1898700zVc, ProgressInfo progressInfo, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1898700zVc;
        this.l1 = progressInfo;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(C1903040zcc c1903040zcc, int i, InboxEntrancePod inboxEntrancePod, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1903040zcc;
        this.i2 = i;
        this.l1 = inboxEntrancePod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(C106L c106l, View view, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c106l;
        this.l1 = view;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(C109T c109t, View view, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c109t;
        this.l1 = view;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(View view, int i, Function0 function0, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = view;
        this.l1 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(NoticeList noticeList, int i, C19482611Ke c19482611Ke, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = noticeList;
        this.i2 = i;
        this.l1 = c19482611Ke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0201000_28(BaseNotice baseNotice, NoticeVideoManager.InnerManager innerManager, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = baseNotice;
        this.l1 = innerManager;
        this.i2 = i;
    }
}
