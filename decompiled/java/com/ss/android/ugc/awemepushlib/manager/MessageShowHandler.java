package com.ss.android.ugc.awemepushlib.manager;

import X.AbstractC1387200mCc;
import X.AbstractC838380Wui;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C089N;
import X.C098200Yq;
import X.C0B81;
import X.C0C64;
import X.C0V4T;
import X.C0WZX;
import X.C0X37;
import X.C0X4D;
import X.C0X9S;
import X.C126G;
import X.C13LP;
import X.C13WZ;
import X.C1514430pVp;
import X.C1701330uNH;
import X.C1720106oR;
import X.C189200o6;
import X.C1906580ziK;
import X.C1908480zlO;
import X.C19212010Ec;
import X.C19254610Um;
import X.C19266210Yy;
import X.C19514511Wl;
import X.C19514711Wn;
import X.C1961607mI;
import X.C1BY5;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2162308dZ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2241008qG;
import X.C786410Ut5;
import X.C790970V1b;
import X.C809030VoT;
import X.C809050VoV;
import X.C809970Vpz;
import X.C810290VqV;
import X.C810310VqX;
import X.C810670Vr7;
import X.C810810VrL;
import X.C810830VrN;
import X.C810890VrT;
import X.C813860VwG;
import X.C813870VwH;
import X.C814730Vxf;
import X.C814840Vxq;
import X.C814850Vxr;
import X.C814860Vxs;
import X.C814920Vxy;
import X.C815050VyB;
import X.C815070VyD;
import X.C815090VyF;
import X.C815100VyG;
import X.C817570W5j;
import X.C823050WQl;
import X.C824390WVp;
import X.C827070WcT;
import X.C891310Yxt;
import X.EnumC048500Fn;
import X.EnumC814940Vy0;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501310pAf;
import X.InterfaceC19515111Wr;
import X.InterfaceC2174708fZ;
import X.InterfaceC814740Vxg;
import X.InterfaceC815000Vy6;
import X.InterfaceC815060VyC;
import X.RunnableC823120WQs;
import Y.AComparatorS32S0000000_13;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS19S0201000_13;
import Y.ARunnableS1S0211000_13;
import Y.ARunnableS24S0101000_13;
import Y.ARunnableS73S0200000_4;
import Y.ARunnableS91S0000000_12;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.unifiedauthapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.android.ugc.awemepushapi.model.SilentMsg;
import com.ss.android.ugc.awemepushlib.experiments.InboxUpdateUnreadCountFromPushExp;
import com.ss.android.ugc.awemepushlib.experiments.OppoSystemPushExperiment;
import com.ss.android.ugc.awemepushlib.experiments.PushMsgGroupAndLimitExp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class MessageShowHandler {
    public static NotificationManager LIZIZ;
    public static final Object LIZ = new Object();
    public static final List<C815070VyD> LIZJ = new ArrayList();
    public static volatile boolean LIZLLL = false;
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static final List<String> LJFF = new ArrayList();
    public static final List<String> LJI = Arrays.asList("click_push_im", "click_push_im_private", "click_push_im_group", "click_push_im_msg_req", "click_push_streak", "click_push_im_voip", "visual_poet_success", "visual_poet_fail");
    public static final AComparatorS32S0000000_13 LJII = new AComparatorS32S0000000_13(11);

    public interface DownloadImageApi {
        @InterfaceC1501160pAQ
        @InterfaceC1501310pAf({"x-tt-dataflow-id: 671089153"})
        C0X9S<TypedInput> downloadImageWithUrl(@InterfaceC2174708fZ String str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[PHI: r4
      0x005e: PHI (r4v2 long) = (r4v1 long), (r4v3 long) binds: [B:21:0x0055, B:23:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r13) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.LIZ(int):void");
    }

    public static boolean LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return LJI.contains(str);
    }

    public static void LJFF(Context context) {
        String string;
        ArrayList arrayList = new ArrayList();
        try {
            synchronized (LIZ) {
                try {
                    string = C810670Vr7.LIZJ(context, 0, "app_notify_info").getString("notify_list", null);
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("local notify list: ");
            sbLIZ.append(string);
            C2188811AlT.LIZIZ(sbLIZ);
            if (!C2093608Ic.LJ(string)) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    long jOptLong = jSONObject.optLong("time", 0L);
                    int iOptInt = jSONObject.optInt(FollowStatusChangeMethod.PARAM_UID, 0);
                    if (iOptInt > 0) {
                        arrayList.add(new C815070VyD(iOptInt, jOptLong));
                    }
                }
            }
        } catch (Exception e) {
        }
        if (!arrayList.isEmpty()) {
            try {
                List<C815070VyD> list = LIZJ;
                ((ArrayList) list).clear();
                ((ArrayList) list).addAll(arrayList);
            } catch (Exception e2) {
            }
        }
    }

    public static void LJIILJJIL(Intent intent) {
        intent.putExtra("from_notification", true);
        String string = UUID.randomUUID().toString();
        ((ArrayList) LJFF).add(string);
        intent.putExtra("from_notification_uuid", string);
    }

    public static boolean LJIILL(String str) {
        Uri uri;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("multi_account", "shouldFilterInconsistentUid()...");
        if (TextUtils.isEmpty(str) || (uri = UriProtector.parse(str)) == null) {
            return false;
        }
        String secUid = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getSecUid();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "need_filter_uid");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && !strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.equals(CardStruct.IStatusCode.DEFAULT)) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_target_uid");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shouldFilterInconsistentUid() - need_filter_uid(");
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                sbLIZ.append(", ");
                sbLIZ.append(secUid);
                sbLIZ.append(")");
                C1720106oR.LJI("multi_account", C2188811AlT.LIZIZ(sbLIZ));
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                    if (!TextUtils.equals(secUid, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                        return true;
                    }
                }
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ttpush_need_filter_uid");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && !strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.equals(CardStruct.IStatusCode.DEFAULT)) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ttpush_sec_target_uid");
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("shouldFilterInconsistentUid() - ttpush_need_filter_uid_");
                sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                sbLIZ2.append(e3.h);
                sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                sbLIZ2.append(", ");
                sbLIZ2.append(secUid);
                sbLIZ2.append(", ");
                sbLIZ2.append(AbstractC848400XPy.LJJIIJZLJL());
                sbLIZ2.append(")");
                C1720106oR.LJI("multi_account", C2188811AlT.LIZIZ(sbLIZ2));
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
                    if ("2".equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                        return !((ArrayList) AbstractC848400XPy.LJJIIJZLJL()).contains(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                    }
                    return !TextUtils.equals(secUid, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                }
            } catch (NullPointerException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static void LJIIIIZZ(int i, Context context, C814730Vxf c814730Vxf) {
        boolean z;
        JSONObject jSONObject;
        boolean zIsScreenOn;
        Integer numValueOf;
        Uri uri;
        Uri uri2;
        List<String> list;
        Uri uri3;
        int sceneId;
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processMessage start, from: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C810890VrT c810890VrT = C810890VrT.LIZIZ;
        c810890VrT.LJIJ("from_handleMsg_to_processMSg", "", false);
        c810890VrT.LJ("MessageShowHandler_processMessage", true);
        C19266210Yy.LIZIZ.LIZIZ();
        C814840Vxq c814840Vxq = c814730Vxf.extra;
        if (c814840Vxq != null && !TextUtils.isEmpty(c814840Vxq.notificationChannelId)) {
            String str = c814730Vxf.extra.notificationChannelId;
            int iLIZIZ = C810830VrN.LIZIZ(c814730Vxf);
            C814840Vxq c814840Vxq2 = c814730Vxf.extra;
            c814840Vxq2.notificationChannelId = C810810VrL.LIZIZ(iLIZIZ, c814840Vxq2.notificationChannelId);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[AlertTone-DEBUG] preprocessPushMsg: original=");
            sbLIZ2.append(str);
            sbLIZ2.append(", soundType=");
            sbLIZ2.append(iLIZIZ);
            sbLIZ2.append(", result=");
            sbLIZ2.append(c814730Vxf.extra.notificationChannelId);
            sbLIZ2.append(", soundUrl=");
            sbLIZ2.append(c814730Vxf.extra.soundUrl);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        IMPushApi.LIZ.getClass();
        InterfaceC815000Vy6 interfaceC815000Vy6LIZJ = C817570W5j.LIZ().LIZJ();
        if (c814730Vxf.imageType == 9) {
            z = true;
        } else {
            z = false;
        }
        interfaceC815000Vy6LIZJ.LIZJ(c814730Vxf.rawJson, z);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("processMessage, channelId: ");
        sbLIZ3.append(c814730Vxf.extra.notificationChannelId);
        C2188811AlT.LIZIZ(sbLIZ3);
        try {
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("push_show");
            mobClickObtain.setLabelName("perf_monitor");
            mobClickObtain.setValue(String.valueOf(c814730Vxf.id));
            C20684815ws.onEvent(mobClickObtain);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c814730Vxf.isSilentMsg()) {
            if (!C813860VwG.LIZ) {
                int i2 = C2187451AjH.LIZ;
                ((IPushApi) ServiceManager.get().getService(IPushApi.class)).registerSilentMsgHandler(new InterfaceC814740Vxg() { // from class: X.0Vxz
                    @Override // X.InterfaceC814740Vxg
                    public final int[] LIZ() {
                        return new int[]{EnumC814940Vy0.TESTING_SILENT.getSceneId()};
                    }

                    @Override // X.InterfaceC814740Vxg
                    public final void LIZIZ(SilentMsg silentMsg) {
                        try {
                            int i3 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("onReceiveSilentMessage: ");
                            sbLIZ4.append(silentMsg);
                            C2188811AlT.LIZIZ(sbLIZ4);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            int i4 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("onReceiveSilentMessage error: ");
                            sbLIZ5.append(e2.getMessage());
                            C1720106oR.LIZ("silent_push", C2188811AlT.LIZIZ(sbLIZ5));
                        }
                    }
                });
                C19212010Ec.LIZJ.LJJLJ();
                C19254610Um.LIZIZ.LJIIIIZZ();
                ((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LJIJJLI();
            }
            SilentMsg silentMsg = c814730Vxf.silentMsg;
            if (silentMsg != null) {
                if (silentMsg.type < EnumC048500Fn.SILENT_PUSH_DEFAULT.ordinal()) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("handleReceive(");
                    sbLIZ4.append(silentMsg.type);
                    sbLIZ4.append("): not silent msg!");
                    C2188811AlT.LIZIZ(sbLIZ4);
                } else {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C813860VwG.LIZIZ.getValue();
                    if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                        C815090VyF c815090VyF = EnumC814940Vy0.Companion;
                        String str2 = silentMsg.scene;
                        c815090VyF.getClass();
                        EnumC814940Vy0[] enumC814940Vy0ArrValues = EnumC814940Vy0.values();
                        int length = enumC814940Vy0ArrValues.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                EnumC814940Vy0 enumC814940Vy0 = enumC814940Vy0ArrValues[i4];
                                if (Intrinsics.LJFF(enumC814940Vy0.getSceneName(), str2)) {
                                    sceneId = enumC814940Vy0.getSceneId();
                                    break;
                                }
                                i4++;
                            } else {
                                sceneId = -1;
                                break;
                            }
                        }
                        if (sceneId >= EnumC814940Vy0.TESTING_SILENT.getSceneId()) {
                            int i5 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("handleReceive(");
                            sbLIZ5.append(silentMsg.type);
                            sbLIZ5.append("): ");
                            sbLIZ5.append(silentMsg.scene);
                            C2188811AlT.LIZIZ(sbLIZ5);
                            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) C813860VwG.LIZIZ.getValue()).get(Integer.valueOf(sceneId));
                            if (copyOnWriteArraySet != null) {
                                Iterator it2 = copyOnWriteArraySet.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        ((InterfaceC814740Vxg) it2.next()).LIZIZ(silentMsg);
                                        c098200Yq = Unit.LIZ;
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                    if (thM5exceptionOrNullimpl != null) {
                                        String message = thM5exceptionOrNullimpl.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        C1720106oR.LIZ("SilentMsgHandler", message);
                                    }
                                }
                            }
                        } else {
                            int i6 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("handleReceive(");
                            sbLIZ6.append(silentMsg.type);
                            sbLIZ6.append("): ");
                            sbLIZ6.append(silentMsg.scene);
                            sbLIZ6.append(" not existed!");
                            C1720106oR.LIZ("silent_push", C2188811AlT.LIZIZ(sbLIZ6));
                        }
                    } else {
                        int i7 = C2187451AjH.LIZ;
                    }
                    int i8 = C2187451AjH.LIZ;
                    C1720106oR.LJI("silent_push", "processMessage, intercept silent msg:" + c814730Vxf.id);
                    C814850Vxr.LJIIJ(c814730Vxf, i, "intercept_silent_messages");
                    return;
                }
            }
        }
        if (!C1906580ziK.LJI() && !TextUtils.isEmpty(c814730Vxf.openUrl) && (uri3 = UriProtector.parse(c814730Vxf.openUrl)) != null && "click_push_ai_live_photo".equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "gd_label"))) {
            int i9 = C2187451AjH.LIZ;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("processMessage, block out-app push in front:");
            sbLIZ7.append(c814730Vxf.id);
            C1720106oR.LJI("AILivePhotoInnerPush", C2188811AlT.LIZIZ(sbLIZ7));
            C814850Vxr.LJIIJ(c814730Vxf, i, "click_push_ai_live_photo");
            return;
        }
        C19212010Ec.LIZJ.LJLLJ(c814730Vxf.originData);
        if (!TextUtils.isEmpty(c814730Vxf.openUrl) && (uri2 = UriProtector.parse(c814730Vxf.openUrl)) != null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "gd_label");
            C01GW c01gw = InboxUpdateUnreadCountFromPushExp.LIZIZ;
            if (((InboxUpdateUnreadCountFromPushExp.Config) c01gw.getValue()).enable && (list = ((InboxUpdateUnreadCountFromPushExp.Config) c01gw.getValue()).pushLabels) != null && C13LP.LJJJJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, list) && System.currentTimeMillis() - InboxUpdateUnreadCountFromPushExp.LIZJ >= ((InboxUpdateUnreadCountFromPushExp.Config) c01gw.getValue()).timeIntervalS * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                C0X4D.LIZ.getClass();
                C0X4D.LIZ(12, false);
                InboxUpdateUnreadCountFromPushExp.LIZJ = System.currentTimeMillis();
            }
        }
        if (C1908480zlO.LIZIZ.LJIILJJIL(c814730Vxf.originData)) {
            int i10 = C2187451AjH.LIZ;
            C1720106oR.LJI("MessageShowHandler", "processMessage, intercepted by in-app:" + c814730Vxf.id);
            C814850Vxr.LJIIJ(c814730Vxf, i, "intercepted_by_inner_push");
            return;
        }
        int i11 = 2;
        if (!TextUtils.isEmpty(c814730Vxf.extra.customAction) && !C2214201BlK.LJIIJJI) {
            Intent intentLIZIZ = LIZIZ(context, i, c814730Vxf, 2);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(context.getPackageName());
            sbLIZ8.append(".action.PUSH_CUSTOM_ACTION");
            intentLIZIZ.setAction(C2188811AlT.LIZIZ(sbLIZ8));
            if (!C2093608Ic.LJ(c814730Vxf.extra.toJsonString())) {
                intentLIZIZ.putExtra("message_extra", c814730Vxf.extra.toJsonString());
            }
            if (!C2093608Ic.LJ(c814730Vxf.openUrl)) {
                intentLIZIZ.putExtra("message_open_url", c814730Vxf.openUrl);
            }
            if (!C2093608Ic.LJ(c814730Vxf.title) && !C2093608Ic.LJ(c814730Vxf.text) && !C2093608Ic.LJ(c814730Vxf.imageUrl)) {
                intentLIZIZ.putExtra("message_title", c814730Vxf.title);
                intentLIZIZ.putExtra("message_text", c814730Vxf.text);
                intentLIZIZ.putExtra("message_image_url", c814730Vxf.imageUrl);
                intentLIZIZ.putExtra("message_in_app_push_type", c814730Vxf.extra.inAppPushType);
            }
            if (!LJIILL(c814730Vxf.openUrl)) {
                C2204961BRm.LJJJJI(context, intentLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2dv+7a5PH3nx3lxlsehH5ctqphsSTGGSCYAsnjVQ+rnaW1w==", null));
                C814850Vxr.LJIIJ(c814730Vxf, i, "custom_action_app_foreground");
                return;
            } else {
                C814850Vxr.LJIIJ(c814730Vxf, i, "filter_by_uid");
                return;
            }
        }
        if (!C2214201BlK.LJIIJJI && !TextUtils.isEmpty(c814730Vxf.openUrl) && (uri = UriProtector.parse(c814730Vxf.openUrl)) != null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
            if ("click_push_share_link_vv".equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                C814850Vxr.LJIIJ(c814730Vxf, i, "click_push_share_link_vv");
                return;
            }
            if (LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                C814850Vxr.LJIIJ(c814730Vxf, i, "dm_msg_app_foreground");
                return;
            } else if ("click_push_cool_down_complete_push".equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                C814850Vxr.LJIIJ(c814730Vxf, i, "click_push_cool_down_complete_push");
                return;
            } else if ("click_push_out_app_live_multi_guest".equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                C814850Vxr.LJIIJ(c814730Vxf, i, "live_multi_guest_push");
                return;
            }
        }
        try {
            try {
                int i12 = C790970V1b.LIZ;
            } catch (Exception e2) {
                e = e2;
            }
            if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "oppo") && !C809970Vpz.LJFF().LJI()) {
                C810890VrT.LIZIZ.LJIJ("MessageShowHandler_processMessage", "", false);
                return;
            }
            if (!LIZLLL) {
                LJFF(context);
                LIZLLL = true;
            }
            LIZIZ = (NotificationManager) C786410Ut5.H2(context, "notification");
            if (!TextUtils.isEmpty(c814730Vxf.callback) && c814730Vxf.callback.startsWith("http")) {
                try {
                    try {
                        C827070WcT.LIZ.getClass();
                        final String[] strArr = {c814730Vxf.callback, C827070WcT.LIZJ(), String.valueOf(c814730Vxf.id), c814730Vxf.openUrl};
                        RunnableC823120WQs.LIZIZ(new Runnable(strArr) { // from class: X.0VFW
                            public final String[] LL;

                            public final void LIZ() {
                                String[] strArr2 = this.LL;
                                if (strArr2 == null || strArr2.length <= 0) {
                                    return;
                                }
                                try {
                                    String str3 = strArr2[0];
                                    String str4 = strArr2[1];
                                    String str5 = strArr2[2];
                                    String str6 = strArr2[3];
                                    if (TextUtils.isEmpty(str3)) {
                                        return;
                                    }
                                    Logger.debug();
                                    JSONObject jSONObject2 = new JSONObject();
                                    if (!TextUtils.isEmpty(str4)) {
                                        jSONObject2.put("did", str4);
                                    }
                                    if (!TextUtils.isEmpty(str5)) {
                                        jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, str5);
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        jSONObject2.put("url", str6);
                                    }
                                    if ("success".equals(new JSONObject(NetworkUtils.executePost(-1, str3, C786410Ut5.J3(jSONObject2).getBytes("UTF-8"), EnumC796940VOa.GZIP, "application/json")).optString("message"))) {
                                        Logger.debug();
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("MessageShowHandler$SendCallbackTask@7439.run");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("MessageShowHandler$SendCallbackTask@7439.run");
                            }

                            {
                                this.LL = strArr;
                            }
                        });
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("callback", c814730Vxf.callback);
                            jSONObject2.put("did", C827070WcT.LIZJ());
                            jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, String.valueOf(c814730Vxf.id));
                            jSONObject2.put("url", c814730Vxf.openUrl);
                            JSONObject[] jSONObjectArr = {jSONObject2};
                            i11 = -1;
                            C814850Vxr.LIZJ(context, "message_callback", c814730Vxf.id, i, jSONObjectArr);
                        } catch (Throwable th2) {
                            i11 = -1;
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    } catch (Throwable th3) {
                        i11 = -1;
                        TryCatchGuardChecker.doCheck(th3);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("callback", c814730Vxf.callback);
                        C827070WcT.LIZ.getClass();
                        jSONObject3.put("did", C827070WcT.LIZJ());
                        jSONObject3.put(FollowStatusChangeMethod.PARAM_UID, String.valueOf(c814730Vxf.id));
                        jSONObject3.put("url", c814730Vxf.openUrl);
                        C814850Vxr.LIZJ(context, "message_callback", c814730Vxf.id, i, jSONObject3);
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
            } else {
                i11 = -1;
            }
            try {
                zIsScreenOn = ((PowerManager) C786410Ut5.H2(context, "power")).isScreenOn();
                numValueOf = Integer.valueOf(i11);
                Display display = ((DisplayManager) C786410Ut5.H2(context, "display")).getDisplay(0);
                if (display != null) {
                    Object objLIZIZ = C1961607mI.LIZIZ(Display.class, "getState", null, null, display);
                    if (objLIZIZ instanceof Integer) {
                        numValueOf = (Integer) objLIZIZ;
                    }
                    Logger.debug();
                }
                jSONObject = new JSONObject();
            } catch (Exception e3) {
                e = e3;
                jSONObject = null;
            }
            try {
                jSONObject.put("interactive_state", zIsScreenOn);
                if (numValueOf.intValue() > i11) {
                    jSONObject.put("display_state", numValueOf);
                }
                Logger.debug();
            } catch (Exception e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
            }
            if (LJIILIIL(context, c814730Vxf, i, jSONObject)) {
                C810890VrT.LIZIZ.LJIJ("MessageShowHandler_processMessage", "", false);
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("processMessage end， from: ");
                sbLIZ9.append(i);
                C2188811AlT.LIZIZ(sbLIZ9);
                return;
            }
            try {
                if (!LJIILL(c814730Vxf.openUrl)) {
                    LJIIJ(i, context, c814730Vxf);
                    if (!PushMsgGroupAndLimitExp.LIZ()) {
                        LIZ(C814730Vxf.getShortMsgID(c814730Vxf.id));
                    }
                } else {
                    C814850Vxr.LJIIJ(c814730Vxf, i, "filter_by_uid");
                }
            } catch (Exception e5) {
                e = e5;
                TryCatchGuardChecker.doCheck(e);
            }
            C810890VrT.LIZIZ.LJIJ("MessageShowHandler_processMessage", "", false);
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("processMessage end， from: ");
            sbLIZ10.append(i);
            C2188811AlT.LIZIZ(sbLIZ10);
            TryCatchGuardChecker.doCheck(e);
            C810890VrT.LIZIZ.LJIJ("MessageShowHandler_processMessage", "", false);
            StringBuilder sbLIZ102 = C2188811AlT.LIZ();
            sbLIZ102.append("processMessage end， from: ");
            sbLIZ102.append(i);
            C2188811AlT.LIZIZ(sbLIZ102);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            C810890VrT.LIZIZ.LJIJ("MessageShowHandler_processMessage", "", false);
            throw th5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(int r20, final android.content.Context r21, final X.C814730Vxf r22) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.LJIIIZ(int, android.content.Context, X.0Vxf):void");
    }

    public static void LJIIJ(int i, Context context, C814730Vxf c814730Vxf) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("proxyShowWithPermissionCheck(");
        sbLIZ.append(i);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        if (C0B81.LIZ()) {
            AtomicBoolean atomicBoolean = LJ;
            if (!atomicBoolean.compareAndSet(false, true)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("proxyShowWithPermissionCheck is showing permission: sReceivePushPermissionRequestInFlight is ");
                sbLIZ2.append(atomicBoolean.get());
                sbLIZ2.append(", skip!");
                C2188811AlT.LIZIZ(sbLIZ2);
                C814850Vxr.LJIIJ(c814730Vxf, i, "is_processing_one");
                return;
            }
            LJIJ(context, c814730Vxf, i, new ARunnableS19S0201000_13(i, context, c814730Vxf, 3), new ARunnableS91S0000000_12(1));
            return;
        }
        LJIIIZ(i, context, c814730Vxf);
    }

    public static Intent LIZIZ(Context context, int i, C814730Vxf c814730Vxf, int i2) {
        Intent intentLIZ;
        Intent intent = null;
        try {
            try {
                if (i2 == 2) {
                    intentLIZ = new Intent();
                    intentLIZ.setPackage(context.getPackageName());
                } else {
                    intentLIZ = C814860Vxs.LIZ(context, c814730Vxf);
                    if (intentLIZ == null) {
                        return null;
                    }
                    intentLIZ.addFlags(268435456);
                }
                intent = intentLIZ;
                LJIILJJIL(intentLIZ);
                boolean z = true;
                if (i2 != 0) {
                    if (i2 == 1) {
                        intent.putExtra("msg_from", 2);
                    }
                } else {
                    intent.putExtra("msg_from", 1);
                }
                intent.putExtra("msg_id", c814730Vxf.id);
                intent.putExtra("message_from", i);
                C814840Vxq c814840Vxq = c814730Vxf.extra;
                if (c814840Vxq != null && !C2093608Ic.LJ(c814840Vxq.toJsonString())) {
                    intent.putExtra("message_extra", c814730Vxf.extra.toJsonString());
                }
                if (c814730Vxf.extra.activeClickValid != 1 && C0C64.LJIILLIIL().LJIJ(31744, 0, "cancel_other_push", true) != 1) {
                    z = false;
                }
                intent.putExtra("clear_all_notifications", z);
                intent.putExtra("imageType", c814730Vxf.imageType);
                return intent;
            } catch (Throwable th) {
                th = th;
                intentLIZ = intent;
                TryCatchGuardChecker.doCheck(th);
                return intentLIZ;
            }
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            return intentLIZ;
        }
    }

    public static void LIZJ(Context context, int i, String str, int i2) {
        if (context != null && i == 1 && str != null) {
            try {
                C809970Vpz c809970VpzLJFF = C809970Vpz.LJFF();
                if (c809970VpzLJFF.LIZ(context) && c809970VpzLJFF.LJIILL && !TextUtils.isEmpty(str)) {
                    LIZLLL(context, str, i2, false);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle3rdMessage end, from: ");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(Context context, String str, int i, boolean z) {
        C814730Vxf c814730VxfFrom;
        ArrayList<C814920Vxy> arrayList;
        InterfaceC815060VyC interfaceC815060VyC;
        C814920Vxy c814920Vxy;
        boolean z2;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Looper.getMainLooper().getThread().equals(C786410Ut5.u3()));
        C2188811AlT.LIZIZ(sbLIZ);
        if ((i == 30 && !OppoSystemPushExperiment.INSTANCE.enabled()) || C2093608Ic.LJ(str) || (c814730VxfFrom = C814730Vxf.from(str)) == null) {
            return;
        }
        if (c814730VxfFrom.voipType == 1 && !LJIILL(c814730VxfFrom.openUrl)) {
            IMPushApi.LIZ.getClass();
            C817570W5j.LIZ().LJ(c814730VxfFrom.extraStr);
            return;
        }
        C810890VrT.LIZIZ.LJ("MessageShowHandler_handleMessage", true);
        c814730VxfFrom.latencyAnalytics.setUpPushLabel(c814730VxfFrom.openUrl);
        C814850Vxr.LJFF("receive_notification", String.valueOf(c814730VxfFrom.rid64));
        C814850Vxr.LJFF("item_type_notification", c814730VxfFrom.itemType);
        if (!TextUtils.isEmpty(c814730VxfFrom.openUrl)) {
            C814850Vxr.LJFF("push_label_notification", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(c814730VxfFrom.openUrl), "gd_label"));
        }
        ARunnableS1S0211000_13 aRunnableS1S0211000_13 = new ARunnableS1S0211000_13(i, context, c814730VxfFrom, z, 1);
        c814730VxfFrom.latencyAnalytics.startRevokePhase();
        long millis = TimeUnit.DAYS.toMillis(1L);
        ArrayList arrayList2 = new ArrayList();
        C815050VyB c815050VyBLIZ = C815050VyB.LIZ();
        Keva keva = c815050VyBLIZ.LIZIZ;
        if (keva != null && keva.contains("revoke_rid_list")) {
            String string = c815050VyBLIZ.LIZIZ.getString("revoke_rid_list", "");
            c815050VyBLIZ.LIZ.getClass();
            arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(C814920Vxy.LIZIZ(jSONObjectOptJSONObject));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } else {
            c815050VyBLIZ.LIZ.getClass();
            arrayList = new ArrayList();
        }
        long jLIZ = C0V4T.LIZ();
        for (C814920Vxy c814920Vxy2 : arrayList) {
            if (c814920Vxy2 != null && c814920Vxy2.LIZLLL + millis > jLIZ) {
                arrayList2.add(c814920Vxy2);
            }
        }
        if (c814730VxfFrom.revokeId <= 0) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    c814920Vxy = (C814920Vxy) it2.next();
                    if (c814920Vxy != null && c814920Vxy.LIZIZ == c814730VxfFrom.id) {
                        z2 = true;
                        break;
                    }
                } else {
                    c814920Vxy = null;
                    z2 = false;
                    break;
                }
            }
            if (Boolean.valueOf(z2).booleanValue()) {
                C20684815ws.LJIILLIIL("push_withdraw_success", C814920Vxy.LIZ(c814920Vxy));
            } else {
                aRunnableS1S0211000_13.run();
            }
        } else {
            int i4 = c814730VxfFrom.revokeType;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        interfaceC815060VyC = new InterfaceC815060VyC() { // from class: X.0Vy7
                            @Override // X.InterfaceC815060VyC
                            public final void LIZ(boolean z3, C814920Vxy c814920Vxy3, ARunnableS1S0211000_13 aRunnableS1S0211000_132) {
                                if (z3) {
                                    C20684815ws.LJIILLIIL("push_withdraw_success", C814920Vxy.LIZ(c814920Vxy3));
                                }
                            }

                            @Override // X.InterfaceC815060VyC
                            public final void LIZIZ(Context context2, C814730Vxf c814730Vxf, List list, ARunnableS1S0211000_13 aRunnableS1S0211000_132) {
                                C814880Vxu.LIZ(this, context2, c814730Vxf, list, aRunnableS1S0211000_132);
                            }
                        };
                    } else {
                        interfaceC815060VyC = new InterfaceC815060VyC() { // from class: X.0Vy5
                            @Override // X.InterfaceC815060VyC
                            public final void LIZ(boolean z3, C814920Vxy c814920Vxy3, ARunnableS1S0211000_13 aRunnableS1S0211000_132) {
                                if (z3) {
                                    C20684815ws.LJIILLIIL("push_withdraw_success", C814920Vxy.LIZ(c814920Vxy3));
                                }
                                aRunnableS1S0211000_132.run();
                            }

                            @Override // X.InterfaceC815060VyC
                            public final void LIZIZ(Context context2, C814730Vxf c814730Vxf, List list, ARunnableS1S0211000_13 aRunnableS1S0211000_132) {
                                C814880Vxu.LIZ(this, context2, c814730Vxf, list, aRunnableS1S0211000_132);
                            }
                        };
                    }
                } else {
                    interfaceC815060VyC = new InterfaceC815060VyC() { // from class: X.0Vy4
                        @Override // X.InterfaceC815060VyC
                        public final void LIZ(boolean z3, C814920Vxy c814920Vxy3, ARunnableS1S0211000_13 aRunnableS1S0211000_132) {
                            if (z3) {
                                C20684815ws.LJIILLIIL("push_withdraw_success", C814920Vxy.LIZ(c814920Vxy3));
                                aRunnableS1S0211000_132.run();
                            }
                        }

                        @Override // X.InterfaceC815060VyC
                        public final void LIZIZ(Context context2, C814730Vxf c814730Vxf, List list, ARunnableS1S0211000_13 aRunnableS1S0211000_132) {
                            C814880Vxu.LIZ(this, context2, c814730Vxf, list, aRunnableS1S0211000_132);
                        }
                    };
                }
            } else {
                interfaceC815060VyC = new InterfaceC815060VyC() { // from class: X.0Vy7
                    @Override // X.InterfaceC815060VyC
                    public final void LIZ(boolean z3, C814920Vxy c814920Vxy3, ARunnableS1S0211000_13 aRunnableS1S0211000_132) {
                        if (z3) {
                            C20684815ws.LJIILLIIL("push_withdraw_success", C814920Vxy.LIZ(c814920Vxy3));
                        }
                    }

                    @Override // X.InterfaceC815060VyC
                    public final void LIZIZ(Context context2, C814730Vxf c814730Vxf, List list, ARunnableS1S0211000_13 aRunnableS1S0211000_132) {
                        C814880Vxu.LIZ(this, context2, c814730Vxf, list, aRunnableS1S0211000_132);
                    }
                };
            }
            interfaceC815060VyC.LIZIZ(context, c814730VxfFrom, arrayList2, aRunnableS1S0211000_13);
        }
        C810890VrT c810890VrT = C810890VrT.LIZIZ;
        c810890VrT.LJIJ("MessageShowHandler_handleMessage", "", false);
        c810890VrT.LJ("from_handleMsg_to_processMSg", false);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleMessage end, from: ");
        sbLIZ2.append(i);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LJII(Context context, ARunnableS113S0100000_13 aRunnableS113S0100000_13, ARunnableS24S0101000_13 aRunnableS24S0101000_13, ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        if (C824390WVp.LIZJ(context)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryRequestPushPermissionPopup.onNoPopup() - has permission; exp = ");
            sbLIZ.append(C0B81.LIZ());
            C2188811AlT.LIZIZ(sbLIZ);
            aRunnableS113S0100000_13.run();
        } else {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryRequestPushPermissionPopup.onNoPopup() - no permission; exp = ");
            sbLIZ2.append(C0B81.LIZ());
            C2188811AlT.LIZIZ(sbLIZ2);
            aRunnableS24S0101000_13.run();
        }
        aRunnableS73S0200000_4.run();
    }

    public static void LJIIL(C814730Vxf c814730Vxf, int i, String str, long j) {
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (c814730Vxf == null) {
            return;
        }
        try {
            String str2 = "";
            if (!TextUtils.isEmpty(c814730Vxf.openUrl) && (uri = UriProtector.parse(c814730Vxf.openUrl)) != null && uri.isHierarchical() && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label")) != null) {
                str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            }
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("is_dim_screen_fast_path", "1");
            c2241008qG.LIZ.put("phase", str);
            c2241008qG.LIZ.put("update_latency_ms", String.valueOf(j));
            c2241008qG.LIZ.put("rule_id", String.valueOf(c814730Vxf.id));
            c2241008qG.LIZ.put("rule_id64", String.valueOf(c814730Vxf.rid64));
            c2241008qG.LIZ.put("push_label", str2);
            c2241008qG.LIZ.put("item_type", c814730Vxf.itemType);
            c2241008qG.LIZ.put("image_type", String.valueOf(c814730Vxf.imageType));
            c2241008qG.LIZ.put("push_channel", String.valueOf(i));
            C20684815ws.LJIJ("push_dim_screen_fast_path", c2241008qG.LJ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MessageShowHandler sendDimScreenFastPathEvent error: ");
            sbLIZ.append(th);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static boolean LJIILIIL(Context context, C814730Vxf c814730Vxf, int i, JSONObject jSONObject) {
        C810290VqV c810290VqV;
        C814850Vxr.LIZJ(context, "news_achieve", c814730Vxf.id, i, jSONObject);
        if (c814730Vxf.isPing == 1) {
            return true;
        }
        if (C2093608Ic.LJ(c814730Vxf.text)) {
            if (c814730Vxf.pass_through == 0 && context != null) {
                try {
                    Intent intentLIZIZ = C2162308dZ.LIZIZ(context, context.getPackageName());
                    if (intentLIZIZ != null) {
                        intentLIZIZ.addFlags(268435456);
                        LJIILJJIL(intentLIZIZ);
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentLIZIZ, "Context_startActivity_1");
                        C1701330uNH.LIZ(intentLIZIZ, context);
                        C2204961BRm.LJJJJJL(context, intentLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2dv+7a5PH3nx3lxlsehH5ctqphsSTGGSCYAsnjVQ+rnaW1w==", null));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C814850Vxr.LJIIJ(c814730Vxf, i, "push_text_empty");
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c814730Vxf.pass_through != 0 && c814730Vxf.filter != 0) {
            C809970Vpz c809970VpzLJFF = C809970Vpz.LJFF();
            long j = c814730Vxf.id;
            c809970VpzLJFF.getClass();
            Objects.requireNonNull(c809970VpzLJFF.LJIIJ);
            C810290VqV c810290VqV2 = new C810290VqV();
            c810290VqV2.LIZ = Long.valueOf(j);
            c810290VqV2.LIZIZ = jCurrentTimeMillis;
            boolean zLIZIZ = c809970VpzLJFF.LJIIJ.LIZIZ(c810290VqV2);
            if (zLIZIZ) {
                C810310VqX c810310VqX = c809970VpzLJFF.LJIIJ;
                synchronized (c810310VqX) {
                    try {
                        c810290VqV = c810310VqX.LIZIZ.get(c810290VqV2);
                        try {
                            Logger.debug();
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        c810290VqV = null;
                    }
                }
                if (c810290VqV != null) {
                    Logger.debug();
                    if (c810290VqV2.LIZIZ - c810290VqV.LIZIZ > 43200000) {
                        zLIZIZ = false;
                    }
                }
            }
            Logger.debug();
            c809970VpzLJFF.LJIIJ.LIZ(c810290VqV2);
            c809970VpzLJFF.LJIIIIZZ();
            if (zLIZIZ) {
                Logger.debug();
                C814850Vxr.LJIIJ(c814730Vxf, i, "push_msg_existed");
                C814850Vxr.LIZJ(context, "news_forbid", c814730Vxf.id, 2L, new JSONObject[0]);
                C813870VwH.LIZ();
                return true;
            }
        }
        return false;
    }

    public static void LJIJ(Context context, final C814730Vxf c814730Vxf, int i, Runnable runnable, Runnable runnable2) {
        final boolean z;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryRequestPushPermissionPopup(");
        sbLIZ.append(i);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        final ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(runnable, 158);
        final ARunnableS24S0101000_13 aRunnableS24S0101000_13 = new ARunnableS24S0101000_13(i, c814730Vxf, 3);
        final ARunnableS73S0200000_4 aRunnableS73S0200000_4 = new ARunnableS73S0200000_4(new AtomicBoolean(false), runnable2, 24);
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null && abstractC1387200mCcLJFF.LIZIZ() != null) {
            if (abstractC1387200mCcLJFF.LIZIZ() instanceof Activity) {
                final Activity activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ();
                if (activityLIZIZ != null && ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIILJJIL(activityLIZIZ)) {
                    if (C19254610Um.LIZIZ.LJIIJJI().LIZ() && !((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)) {
                        C814850Vxr.LJIIJ(c814730Vxf, i, "consent_status_block");
                        aRunnableS73S0200000_4.run();
                        return;
                    }
                    if (!((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIIZ() && !((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIJI() && !((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LIZLLL()) {
                        final boolean zR4 = C786410Ut5.r4(activityLIZIZ, "android.permission.POST_NOTIFICATIONS");
                        if (C1BY5.LIZIZ() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
                        C814850Vxr.LJII(0, zBooleanValue ? 1 : 0, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, "receive_push");
                        c814730Vxf.latencyAnalytics.startPermissionRequestPhase();
                        final PushPermissionStatusEvent pushPermissionStatusEvent = new PushPermissionStatusEvent();
                        final long jCurrentTimeMillis = System.currentTimeMillis();
                        C19514711Wn c19514711WnLIZLLL = C19514711Wn.LIZLLL(activityLIZIZ, TokenCert.with("bpea-push_permission_post_notifications"));
                        final int i3 = zBooleanValue ? 1 : 0;
                        C19514511Wl c19514511WlLIZ = c19514711WnLIZLLL.LIZ(new AbstractC838380Wui() { // from class: X.0Vyn
                            @Override // X.AbstractC838380Wui
                            public final void LIZIZ(C19514611Wm c19514611Wm, C0HWO... c0hwoArr) {
                                pushPermissionStatusEvent.LJI(0, "is_with_cover");
                                pushPermissionStatusEvent.LJI(0, "popup_type");
                                pushPermissionStatusEvent.LJI("receive_push", "popup_page");
                                pushPermissionStatusEvent.LJI(Integer.valueOf(i3), "is_first_start");
                                if (zR4 || !z) {
                                    ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIILL(System.currentTimeMillis(), true);
                                    ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJ();
                                }
                                int i4 = C0LHK.LIZ[c0hwoArr[0].LIZIZ.ordinal()];
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        if (i4 == 3) {
                                            pushPermissionStatusEvent.LJIILIIL("denied_permanent");
                                            if (c19514611Wm != null) {
                                                c19514611Wm.LIZJ();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    pushPermissionStatusEvent.LJIILIIL("this_operation_not_permitted");
                                    if (c19514611Wm == null) {
                                        return;
                                    }
                                    c19514611Wm.LIZJ();
                                    return;
                                }
                                pushPermissionStatusEvent.LJIILIIL("granted");
                                if (c19514611Wm == null) {
                                    return;
                                }
                                c19514611Wm.LIZIZ();
                            }
                        });
                        c19514511WlLIZ.LIZIZ("android.permission.POST_NOTIFICATIONS");
                        final int i4 = zBooleanValue ? 1 : 0;
                        c19514511WlLIZ.LIZJ(new InterfaceC19515111Wr() { // from class: X.0Vym
                            @Override // X.InterfaceC19515111Wr
                            public final void onCanceled() {
                                int i5 = C2187451AjH.LIZ;
                                aRunnableS73S0200000_4.run();
                                if (C0B81.LIZ()) {
                                    pushPermissionStatusEvent.LJI(0, "is_with_cover");
                                    pushPermissionStatusEvent.LJI(0, "popup_type");
                                    pushPermissionStatusEvent.LJI("receive_push", "popup_page");
                                    pushPermissionStatusEvent.LJI(Integer.valueOf(i4), "is_first_start");
                                    pushPermissionStatusEvent.LJIIJ("Request canceled");
                                    if (C824390WVp.LIZJ(activityLIZIZ)) {
                                        pushPermissionStatusEvent.LJIIL("granted");
                                        aRunnableS113S0100000_13.run();
                                    } else {
                                        pushPermissionStatusEvent.LJIIL("this_operation_not_permitted");
                                        aRunnableS24S0101000_13.run();
                                    }
                                    c814730Vxf.latencyAnalytics.endPermissionRequestPhase();
                                    PushPermissionStatusEvent pushPermissionStatusEvent2 = pushPermissionStatusEvent;
                                    pushPermissionStatusEvent2.LJI(Integer.valueOf((int) (System.currentTimeMillis() - jCurrentTimeMillis)), "timestamp_diff");
                                    pushPermissionStatusEvent2.LJI(Integer.valueOf(C1BY5.LIZIZ()), "pop_up_count");
                                    pushPermissionStatusEvent2.LJIIIIZZ();
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
                            @Override // X.InterfaceC19515111Wr
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(X.C0HWO... r16) {
                                /*
                                    Method dump skipped, instruction units count: 587
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C815420Vym.LIZ(X.0HWO[]):void");
                            }
                        });
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("not ShowCombinedPushPermissionPopup() - compile error or freq ctrl(");
                    sbLIZ2.append(((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIIZ());
                    sbLIZ2.append(", ");
                    sbLIZ2.append(((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIJI());
                    sbLIZ2.append(", ");
                    sbLIZ2.append(((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LIZLLL());
                    sbLIZ2.append(")");
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C814850Vxr.LJIIJ(c814730Vxf, i, "compile_error_or_freq_ctrl");
                    aRunnableS73S0200000_4.run();
                    return;
                }
                LJII(context, aRunnableS113S0100000_13, aRunnableS24S0101000_13, aRunnableS73S0200000_4);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("requestPushPermissionPopup rootPage is ");
            sbLIZ3.append(abstractC1387200mCcLJFF.LIZIZ().getClass().getName());
            C2188811AlT.LIZIZ(sbLIZ3);
            LJII(context, aRunnableS113S0100000_13, aRunnableS24S0101000_13, aRunnableS73S0200000_4);
            return;
        }
        LJII(context, aRunnableS113S0100000_13, aRunnableS24S0101000_13, aRunnableS73S0200000_4);
    }

    public static void LJIILLIIL(int i, int i2, long j, Context context, Intent intent, Bitmap bitmap, C814730Vxf c814730Vxf) {
        int i3;
        int i4;
        try {
            boolean zEqualsIgnoreCase = "oppo".equalsIgnoreCase(Build.BRAND);
            if (C790970V1b.LIZ(context)) {
                i3 = 2010;
                i4 = 264;
            } else if (zEqualsIgnoreCase) {
                i3 = 20005;
                i4 = 136;
            } else {
                i3 = 2005;
                i4 = 8;
            }
            WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
            C126G c126g = new C126G(i, i2, j, context, intent, bitmap, c814730Vxf);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 0, 0, i3, i4, 1);
            layoutParams.gravity = 51;
            if (zEqualsIgnoreCase) {
                layoutParams.setTitle("Toast");
            }
            windowManager.addView(c126g, layoutParams);
            th = null;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
        }
        if (th != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("throwable", Log.getStackTraceString(th));
                C814850Vxr.LIZJ(context, "news_notify_anim_push_try_show", c814730Vxf.id, i, jSONObject);
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return;
            }
        }
        C814850Vxr.LIZJ(context, "news_notify_anim_push_try_show", c814730Vxf.id, i, new JSONObject[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x026c A[Catch: Exception -> 0x0290, TRY_LEAVE, TryCatch #0 {Exception -> 0x0290, blocks: (B:87:0x020d, B:89:0x0211, B:90:0x021b, B:92:0x0225, B:94:0x022b, B:95:0x0253, B:101:0x0262, B:102:0x026c), top: B:135:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0211 A[Catch: Exception -> 0x0290, TryCatch #0 {Exception -> 0x0290, blocks: (B:87:0x020d, B:89:0x0211, B:90:0x021b, B:92:0x0225, B:94:0x022b, B:95:0x0253, B:101:0x0262, B:102:0x026c), top: B:135:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(final int r24, final android.content.Context r25, final android.graphics.Bitmap r26, final android.graphics.Bitmap r27, X.C814730Vxf r28, final boolean r29, final boolean r30) {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.LJIIZILJ(int, android.content.Context, android.graphics.Bitmap, android.graphics.Bitmap, X.0Vxf, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.EnumC815370Vyh r11, X.C814730Vxf r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15, boolean r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.LJI(X.0Vyh, X.0Vxf, java.lang.Long, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    public static void LJIIJJI(final Context context, final C814730Vxf c814730Vxf, boolean z, int i, final Notification notification, boolean z2, Bitmap bitmap, Bitmap bitmap2, boolean z3) {
        NotificationChannel notificationChannel;
        Object sound;
        String str;
        boolean z4;
        C814840Vxq c814840Vxq;
        Object obj;
        Object obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realNotify...., from: ");
        sbLIZ.append(i);
        sbLIZ.append(", lowImport: ");
        sbLIZ.append(z2);
        sbLIZ.append(", isDimScreenFastPathBase: ");
        sbLIZ.append(z3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c814730Vxf == null) {
            return;
        }
        boolean z5 = false;
        if (i == 30) {
            C809050VoV.LIZ.getClass();
            C809030VoT c809030VoT = C809030VoT.LJIIJ;
            c809030VoT.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PushSupporter.setShowOppoSystemPush(), show: ");
            sbLIZ2.append(true);
            C2188811AlT.LIZIZ(sbLIZ2);
            c809030VoT.LJIIIZ = true;
            C814850Vxr.LJFF("show_notification", String.valueOf(c814730Vxf.rid64));
            if (c814730Vxf.extra != null) {
                if (C2214201BlK.LJFF() == null) {
                    z5 = true;
                }
                Map<String, String> mapLIZLLL = C814860Vxs.LIZLLL(c814730Vxf, i, z5, z);
                String str2 = "1";
                if (z) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                HashMap map = (HashMap) mapLIZLLL;
                map.put("has_image", obj);
                if (c814730Vxf.extra.style == 5) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("mediastyle", obj2);
                if (TextUtils.isEmpty(c814730Vxf.extra.bg_color)) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("colorized", str2);
                C20684815ws.LJIJ("push_show_oppo", new JSONObject(mapLIZLLL));
                C814850Vxr.LIZIZ(c814730Vxf.extra.rawExtra, true);
                return;
            }
            return;
        }
        C810890VrT.LIZIZ.LJ("MessageShowHandler_realNotify", true);
        int shortMsgID = C814730Vxf.getShortMsgID(c814730Vxf.id);
        if (C824390WVp.LIZJ(context)) {
            if (!z2) {
                if (z3) {
                    str = "dim_screen_base";
                } else {
                    str = "normal";
                }
                if (z || ("dim_screen_base".equals(str) && (!TextUtils.isEmpty(c814730Vxf.imageUrl) || ((c814840Vxq = c814730Vxf.extra) != null && !TextUtils.isEmpty(c814840Vxq.largeModeIconUrl))))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C814850Vxr.LJIIIZ(c814730Vxf, z4, i, str, bitmap, bitmap2);
            }
        } else {
            C814850Vxr.LJIIJ(c814730Vxf, i, "no_permission");
            if (C0B81.LIZ()) {
                return;
            }
        }
        if (InnerPushDedupExp.LIZLLL) {
            C1908480zlO.LIZIZ.LJIILIIL(c814730Vxf.originData, c814730Vxf.rid64);
        }
        c814730Vxf.latencyAnalytics.onRealNotify();
        if (Build.VERSION.SDK_INT >= 26) {
            String channelId = notification.getChannelId();
            NotificationManager notificationManager = LIZIZ;
            if (notificationManager != null) {
                notificationChannel = notificationManager.getNotificationChannel(channelId);
            } else {
                notificationChannel = null;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[AlertTone-DEBUG] notify: pushId=");
            sbLIZ3.append(shortMsgID);
            sbLIZ3.append(", channelId=");
            sbLIZ3.append(channelId);
            sbLIZ3.append(", channelSound=");
            Object objValueOf = "null";
            if (notificationChannel == null) {
                sound = "null";
            } else {
                sound = notificationChannel.getSound();
            }
            sbLIZ3.append(sound);
            sbLIZ3.append(", channelImportance=");
            if (notificationChannel != null) {
                objValueOf = Integer.valueOf(notificationChannel.getImportance());
            }
            sbLIZ3.append(objValueOf);
            sbLIZ3.append(", notifSound=");
            sbLIZ3.append(notification.sound);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        LIZIZ.notify("app_notify_ame", shortMsgID, notification);
        C0X37 c0x37 = C0X37.ShowPush;
        try {
            C815100VyG.LIZ.LLILLJJLI = false;
            C13WZ c13wz = C089N.LIZ;
            c13wz.LJIILLIIL(c0x37);
            c13wz.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C814850Vxr.LIZJ(context, "news_notify_show", c814730Vxf.id, -1L, new JSONObject[0]);
        C823050WQl.LIZJ().submit(new Runnable() { // from class: X.0VwX
            /* JADX WARN: Removed duplicated region for block: B:79:0x02f2  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x035b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 1099
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC814030VwX.run():void");
            }
        });
        IMessageAlertToneService.LIZ.getClass();
        IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
        String string = notification.extras.getString("custom_tone_audio_url");
        if (string != null) {
            iMessageAlertToneServiceLIZ.LJIIL(shortMsgID, notification, string);
        } else {
            iMessageAlertToneServiceLIZ.LJIIJJI();
        }
        C810890VrT.LIZIZ.LJIJ("MessageShowHandler_realNotify", "", false);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("realNotify end...., from: ");
        sbLIZ4.append(i);
        C2188811AlT.LIZIZ(sbLIZ4);
    }
}
