package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C0C8Y;
import X.C0FNV;
import X.C0LAB;
import X.C0XQS;
import X.C0XTR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C13LP;
import X.C1428470nHB;
import X.C1619720sFe;
import X.C1873560yr4;
import X.C1887790zE1;
import X.C1893340zMy;
import X.C1893680zNW;
import X.C1893940zNw;
import X.C1893960zNy;
import X.C1893990zO1;
import X.C1894010zO3;
import X.C1894700zPA;
import X.C1898110zUf;
import X.C1909107dp;
import X.C1913480ztS;
import X.C1916670zyb;
import X.C19331510k5;
import X.C19EG;
import X.C20484615Do;
import X.C20484715Dp;
import X.C20684815ws;
import X.C2089008Gi;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2178808gE;
import X.C2188811AlT;
import X.C2276471E8n;
import X.C262100zr;
import X.C464790IKn;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1893950zNx;
import X.EnumC518060KTk;
import X.InterfaceC1107590evd;
import X.InterfaceC1873540yr2;
import X.InterfaceC1897260zTI;
import X.InterfaceC1898130zUh;
import X.InterfaceC1898470zVF;
import X.InterfaceC1910160zo6;
import X.InterfaceC20484815Dq;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.touchpoint.api.model.DisplayInfo;
import com.bytedance.touchpoint.api.model.Status;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventResponse;
import com.bytedance.touchpoint.api.model.TimeInfo;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.videodetail.DetailTaskEventPendantManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.incentive.crossplatform.experiment.IncentiveJsLogicModuleConfig;
import com.ss.android.ugc.incentive.crossplatform.experiment.IncentiveJsLogicModuleInfo;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class AwS143S1200000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS143S1200000_28 awS143S1200000_28) {
        ((ScreenShotFeedbackService) awS143S1200000_28.l1).startUploadScreenShotFeedback((C19EG) awS143S1200000_28.l2, awS143S1200000_28.s0);
        ((ScreenShotFeedbackService) awS143S1200000_28.l1).sendShareFeedbackEvent();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS143S1200000_28 awS143S1200000_28) {
        String creationId;
        String strLJIILL;
        AVETParameter avetParameter;
        String strLIZ = LocalServiceImpl.LIZIZ().LIZ((C19EG) awS143S1200000_28.l1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://www.tiktok.com/community-guidelines/");
        sbLIZ.append(strLIZ);
        sbLIZ.append("/integrity-authenticity/?cgversion=2023#3");
        C2089008Gi c2089008Gi = new C2089008Gi(C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS143S1200000_28.l2;
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = "model is null";
        }
        c0lab.LJ("creation_id", creationId);
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS143S1200000_28.l2;
        String contentSource = null;
        if (videoPublishEditModel2 != null) {
            strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel2);
        } else {
            strLJIILL = null;
        }
        c0lab.LJ("content_type", strLJIILL);
        VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) awS143S1200000_28.l2;
        if (videoPublishEditModel3 != null && (avetParameter = videoPublishEditModel3.getAvetParameter()) != null) {
            contentSource = avetParameter.getContentSource();
        }
        c0lab.LJ("content_source", contentSource);
        c0lab.LJ("enter_from", awS143S1200000_28.s0);
        C20684815ws.LJIILLIIL("click_links_in_aigc_pop_up", c0lab.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) awS143S1200000_28.l1, "aweme://webview");
        smartRouteBuildRoute.withParam("url", c2089008Gi.LJ());
        smartRouteBuildRoute.withParam("title", ((C19EG) awS143S1200000_28.l1).getString(2131849494));
        smartRouteBuildRoute.withParam("show_separate_line", true);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS143S1200000_28 awS143S1200000_28) {
        String str;
        String string;
        String str2;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            HashMap map = new HashMap();
            TaskEvent taskEvent = (TaskEvent) awS143S1200000_28.l1;
            TaskEventResponse taskEventResponse = (TaskEventResponse) awS143S1200000_28.l2;
            String str3 = awS143S1200000_28.s0;
            map.put("event_id", String.valueOf(taskEvent.id));
            String str4 = taskEvent.taskEventKey;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            map.put("event_key", str4);
            map.put("event_type", taskEvent.userActionType);
            map.put("event_name", taskEvent.taskEventName);
            Status status = taskEvent.status;
            if (status == null || (str = status.status) == null) {
                str = "";
            }
            map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            if (taskEventResponse == null || (string = Integer.valueOf(taskEventResponse.statusCode).toString()) == null) {
                string = "";
            }
            map.put("start_mode", string);
            map.put("error_code", str3);
            if (taskEventResponse != null && (str2 = taskEventResponse.statusMsg) != null) {
                str5 = str2;
            }
            map.put("result", str5);
            interfaceC1897260zTILIZIZ.LIZ("campaign_task_event_response", map);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS143S1200000_28 awS143S1200000_28) {
        LinkedHashMap linkedHashMap;
        InterfaceC1107590evd map;
        Map<String, Object> mapLIZ;
        String str = awS143S1200000_28.s0;
        if (Intrinsics.LJFF(str, "mainClick")) {
            String string = null;
            try {
                InterfaceC1107590evd interfaceC1107590evd = ((C262100zr) awS143S1200000_28.l1).LIZIZ;
                if (interfaceC1107590evd != null && (map = interfaceC1107590evd.getMap("bcm_chain_param")) != null && (mapLIZ = map.LIZ()) != null) {
                    linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZ.size()));
                    for (Object obj : mapLIZ.entrySet()) {
                        linkedHashMap.put(((Map.Entry) obj).getKey(), String.valueOf(((Map.Entry) obj).getValue()));
                    }
                } else {
                    linkedHashMap = null;
                }
            } catch (Exception e) {
                e = e;
                linkedHashMap = null;
            }
            try {
                InterfaceC1107590evd interfaceC1107590evd2 = ((C262100zr) awS143S1200000_28.l1).LIZIZ;
                if (interfaceC1107590evd2 != null) {
                    string = interfaceC1107590evd2.getString("btm");
                }
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
            Function2<? super Map<String, String>, ? super String, Unit> function2 = ((C1887790zE1) awS143S1200000_28.l2).LLILLL;
            if (function2 != null) {
                function2.invoke(linkedHashMap, string);
            }
            ((C1887790zE1) awS143S1200000_28.l2).LIZLLL("StepClickEnterRoom", new JSONObject());
        } else if (Intrinsics.LJFF(str, "close")) {
            Function0<Unit> function0 = ((C1887790zE1) awS143S1200000_28.l2).LLILZIL;
            if (function0 != null) {
                function0.invoke();
            }
            ((C1887790zE1) awS143S1200000_28.l2).LIZLLL("StepClickClose", new JSONObject());
            FrameLayout frameLayout = ((C1887790zE1) awS143S1200000_28.l2).LL;
            if (frameLayout != null) {
                C786410Ut5.LJLLLLLL(8, frameLayout);
            }
        } else {
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceiveJsEvent===unknown action_type:");
            sbLIZ.append(awS143S1200000_28.s0);
            c2276471E8n.LIZIZ("ttls-live", "LSLiveProductCard", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS143S1200000_28 awS143S1200000_28) {
        boolean z;
        String strLIZ;
        Uri uri;
        String path;
        HashSet hashSet;
        HashSet hashSet2;
        List<String> list;
        HashMap map;
        C01GW<C1893940zNw> c01gw = C1893940zNw.LJI;
        String strLIZ2 = C0C8Y.LIZ(awS143S1200000_28.s0);
        String str = ((IncentiveJsLogicModuleInfo) awS143S1200000_28.l1).jsLogicUrlPath;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        C1894010zO3 c1894010zO3 = null;
        if (z) {
            strLIZ = null;
        } else {
            strLIZ = C0C8Y.LIZ(((IncentiveJsLogicModuleInfo) awS143S1200000_28.l1).jsLogicUrlPath);
        }
        if (strLIZ2 != null && (uri = UriProtector.parse(strLIZ2)) != null && (path = uri.getPath()) != null && path.length() != 0) {
            List list2 = (List) awS143S1200000_28.l2;
            if (strLIZ != null && strLIZ.length() != 0) {
                if (Intrinsics.LJFF(((IncentiveJsLogicModuleInfo) awS143S1200000_28.l1).jsLogicType, EnumC518060KTk.PREFETCH.getType())) {
                    Pair[] pairArr = new Pair[1];
                    String strLIZJ = C1893340zMy.LIZJ(path);
                    if (strLIZJ == null) {
                        strLIZJ = path;
                    }
                    pairArr[0] = new Pair("_pa_inc_api_cache_key", strLIZJ);
                    map = C2097608Jq.LJI(pairArr);
                } else {
                    map = new HashMap();
                }
                c1894010zO3 = new C1894010zO3(strLIZ, map);
            }
            boolean z3 = ((IncentiveJsLogicModuleInfo) awS143S1200000_28.l1).needPrePreDecode;
            C01GW c01gw2 = C1893960zNy.LIZIZ;
            boolean z4 = z3 & ((IncentiveJsLogicModuleConfig) c01gw2.getValue()).predecodeEnable;
            boolean z5 = ((IncentiveJsLogicModuleInfo) awS143S1200000_28.l1).needRemoveExpiredApiCache;
            boolean z6 = ((IncentiveJsLogicModuleConfig) c01gw2.getValue()).pidTriggerEnable;
            List<String> list3 = ((IncentiveJsLogicModuleInfo) awS143S1200000_28.l1).triggerConfig.pidTriggerTiming;
            if (list3 == null || list3.isEmpty()) {
                z2 = true;
            }
            if (((!z2) & z6) && (list = ((IncentiveJsLogicModuleInfo) awS143S1200000_28.l1).triggerConfig.pidTriggerTiming) != null) {
                hashSet = C13LP.LLIFFJFJJ(list);
            } else {
                hashSet = new HashSet();
            }
            boolean zLJFF = Intrinsics.LJFF(((IncentiveJsLogicModuleInfo) awS143S1200000_28.l1).jsLogicType, EnumC518060KTk.PREFETCH.getType());
            List<String> list4 = ((IncentiveJsLogicModuleInfo) awS143S1200000_28.l1).triggerConfig.triggerTiming;
            if (list4 != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : list4) {
                    EnumC1893950zNx enumC1893950zNx = EnumC1893950zNx.FEED_BEFORE;
                    if (!Intrinsics.LJFF(str2, enumC1893950zNx.getValue())) {
                        enumC1893950zNx = EnumC1893950zNx.FEED_READY;
                        if (!Intrinsics.LJFF(str2, enumC1893950zNx.getValue())) {
                            enumC1893950zNx = EnumC1893950zNx.LOGIN_UPDATE;
                            if (!Intrinsics.LJFF(str2, enumC1893950zNx.getValue())) {
                                enumC1893950zNx = EnumC1893950zNx.TOUCH_POINT_WILL_SHOW;
                                if (Intrinsics.LJFF(str2, enumC1893950zNx.getValue())) {
                                }
                            }
                        }
                    }
                    arrayList.add(enumC1893950zNx);
                }
                hashSet2 = C13LP.LLIFFJFJJ(arrayList);
            } else {
                hashSet2 = new HashSet();
            }
            list2.add(new C1893990zO1(c1894010zO3, zLJFF, strLIZ2, path, z4, z5, hashSet, hashSet2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS143S1200000_28 awS143S1200000_28) {
        String str = awS143S1200000_28.s0;
        if (str != null) {
            ImageView imageView = (ImageView) awS143S1200000_28.l1;
            InterfaceC1910160zo6 interfaceC1910160zo6 = (InterfaceC1910160zo6) awS143S1200000_28.l2;
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJI(imageView);
            c1331670kl3LJIIIZ.LJIIJ(new C19331510k5(interfaceC1910160zo6, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS143S1200000_28 awS143S1200000_28) {
        C0FNV.LIZ((DialogC1389620mGW) awS143S1200000_28.l1);
        C1913480ztS.LIZ("pns_tpsc_configurable_exception", C2097608Jq.LJIIIIZZ(new Pair("type", "config_fallback_failed"), new Pair("page_tag", awS143S1200000_28.s0)), null, 12);
        C1389890mGx c1389890mGx = new C1389890mGx((C19EG) awS143S1200000_28.l2);
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS143S1200000_28 awS143S1200000_28) {
        C786410Ut5.LJIIJ((DialogC1389620mGW) awS143S1200000_28.l1);
        C1913480ztS.LIZ("pns_tpsc_configurable_exception", C2097608Jq.LJIIIIZZ(new Pair("type", "config_fallback_failed"), new Pair("page_tag", awS143S1200000_28.s0)), null, 12);
        C1389890mGx c1389890mGx = new C1389890mGx((C19EG) awS143S1200000_28.l2);
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS143S1200000_28 awS143S1200000_28) {
        Function0 function0 = (Function0) awS143S1200000_28.l1;
        if (function0 != null) {
            function0.invoke();
        }
        C1913480ztS.LIZ("pns_tpsc_configurable_exception", C2097608Jq.LJIIIIZZ(new Pair("type", "config_fallback_failed"), new Pair("page_tag", awS143S1200000_28.s0)), null, 12);
        ((Function0) awS143S1200000_28.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS143S1200000_28 awS143S1200000_28) {
        for (InterfaceC1898130zUh interfaceC1898130zUh : (ArrayList) C1898110zUf.LLILZ) {
            if (Intrinsics.LJFF(interfaceC1898130zUh.LJIIIIZZ(), (Integer) awS143S1200000_28.l1)) {
                if (awS143S1200000_28.s0 != null) {
                    if (Intrinsics.LJFF(interfaceC1898130zUh.getTaskEventKey(), awS143S1200000_28.s0)) {
                        interfaceC1898130zUh.LIZLLL((InterfaceC1898470zVF) awS143S1200000_28.l2);
                    }
                } else {
                    interfaceC1898130zUh.LIZLLL((InterfaceC1898470zVF) awS143S1200000_28.l2);
                }
            }
        }
        C1898110zUf.LLILZIL.put((Integer) awS143S1200000_28.l1, (InterfaceC1898470zVF) awS143S1200000_28.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS143S1200000_28 awS143S1200000_28) {
        C20484715Dp c20484715Dp = C464790IKn.LIZ;
        String str = awS143S1200000_28.s0;
        Iterator it2 = ((ArrayList) c20484715Dp.LIZIZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC20484815Dq interfaceC20484815Dq = (InterfaceC20484815Dq) ((HashMap) ((C20484615Do) it2.next()).LJFF).get(str);
            if (interfaceC20484815Dq != null) {
                interfaceC20484815Dq.TF();
                break;
            }
        }
        CompletionBlock completionBlock = (CompletionBlock) awS143S1200000_28.l1;
        ((C1873560yr4) awS143S1200000_28.l2).getClass();
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1873540yr2.class, null), "");
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T extends X.0zNV, X.0zNV] */
    public static final Object invoke$8(AwS143S1200000_28 awS143S1200000_28) {
        boolean z;
        ViewGroup viewGroup;
        DisplayInfo displayInfo;
        TimeInfo timeInfo;
        Integer num;
        String str = awS143S1200000_28.s0;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str2 = "";
        if (!z) {
            try {
                String strOptString = new JSONObject(str).optString("task_event_key");
                if (strOptString == null) {
                    strOptString = "";
                }
                if (strOptString.length() > 0 && str != null && str.length() != 0) {
                    try {
                        String strOptString2 = new JSONObject(str).optString("enable_timer_pendant");
                        if (strOptString2 == null) {
                            strOptString2 = "";
                        }
                        if (Intrinsics.LJFF(strOptString2, "1")) {
                            String str3 = awS143S1200000_28.s0;
                            if (str3 != null && str3.length() != 0) {
                                try {
                                    String strOptString3 = new JSONObject(str3).optString("task_event_key");
                                    if (strOptString3 != null) {
                                        str2 = strOptString3;
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            IWatchVideoService iWatchVideoService = (IWatchVideoService) PluggableExtentionKt.pluggableSpi$default(IWatchVideoService.class, false, false, false, 14, null);
                            if (iWatchVideoService != null) {
                                iWatchVideoService.LJ(str2);
                            }
                            DetailTaskEventPendantManager value = DetailTaskEventPendantManager.LLJJJJJIL.getValue();
                            LifecycleOwner lifecycleOwner = (LifecycleOwner) awS143S1200000_28.l1;
                            View view = (View) awS143S1200000_28.l2;
                            if (view instanceof ViewGroup) {
                                viewGroup = (ViewGroup) view;
                            } else {
                                viewGroup = null;
                            }
                            value.getClass();
                            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                            TaskEvent taskEventLIZLLL = C2178808gE.LIZ().LIZLLL(str2);
                            if (taskEventLIZLLL != null && (displayInfo = taskEventLIZLLL.displayInfo) != null && (timeInfo = displayInfo.timeInfo) != null && (num = timeInfo.timerLaunchPlayId) != null) {
                                int iIntValue = num.intValue();
                                ?? LJI = C2178808gE.LIZ().LJI(62, iIntValue);
                                value.LLJJJJ = Integer.valueOf(iIntValue);
                                if (LJI != 0) {
                                    value.LLILLL = LJI;
                                }
                                value.LJIIJ(viewGroup, lifecycleOwner);
                            }
                            C1893680zNW.LIZ.getClass();
                            C1893680zNW.LJIIJJI(62, null);
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS143S1200000_28 awS143S1200000_28) {
        if (!((C1916670zyb) awS143S1200000_28.l1).LJFF().isLoginPanelDisplayed() && !((C1916670zyb) awS143S1200000_28.l1).LJFF().isLoginActivity((Activity) awS143S1200000_28.l2)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_fullscreen_dialog", true);
            bundle.putBoolean("is_skippable_dialog", false);
            ILoginService iLoginServiceLJFF = ((C1916670zyb) awS143S1200000_28.l1).LJFF();
            C0XQS c0xqs = new C0XQS();
            c0xqs.LIZ = (Activity) awS143S1200000_28.l2;
            c0xqs.LIZIZ = awS143S1200000_28.s0;
            c0xqs.LIZJ = "gatekeeper";
            c0xqs.LIZLLL = bundle;
            c0xqs.LJ = new C0XTR() { // from class: X.0zye
                @Override // X.C0XTR
                public final void onResult(int i, int i2, Object obj) {
                }
            };
            iLoginServiceLJFF.showLoginAndRegisterView(c0xqs.LIZ());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1200000_28(DialogC1389620mGW dialogC1389620mGW, String str, C19EG c19eg, int i) {
        super(0);
        this.$t = i;
        this.l1 = dialogC1389620mGW;
        this.s0 = str;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1200000_28(C1916670zyb c1916670zyb, Activity activity, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1916670zyb;
        this.l2 = activity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1200000_28(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c19eg;
        this.l2 = videoPublishEditModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1200000_28(View view, LifecycleOwner lifecycleOwner, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = lifecycleOwner;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1200000_28(TaskEvent taskEvent, TaskEventResponse taskEventResponse, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = taskEvent;
        this.l2 = taskEventResponse;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1200000_28(BaseTimerPendantManager baseTimerPendantManager, Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = num;
        this.s0 = str;
        this.l2 = baseTimerPendantManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1200000_28(ScreenShotFeedbackService screenShotFeedbackService, C19EG c19eg, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = screenShotFeedbackService;
        this.l2 = c19eg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1200000_28(String str, C262100zr c262100zr, C1887790zE1 c1887790zE1, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c262100zr;
        this.l2 = c1887790zE1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1200000_28(String str, ImageView imageView, InterfaceC1910160zo6 interfaceC1910160zo6, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = imageView;
        this.l2 = interfaceC1910160zo6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS143S1200000_28(String str, String str2, CompletionBlock<InterfaceC1873540yr2> completionBlock, C1873560yr4 c1873560yr4) {
        super(0);
        this.$t = c1873560yr4;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = completionBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS143S1200000_28(String str, String str2, IncentiveJsLogicModuleInfo incentiveJsLogicModuleInfo, List<C1893990zO1> list) {
        super(0);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = incentiveJsLogicModuleInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1200000_28(String str, Function0 function0, Function0 function02, int i) {
        super(0);
        this.$t = i;
        this.l1 = function0;
        this.s0 = str;
        this.l2 = function02;
    }
}
