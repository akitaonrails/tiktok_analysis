package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C09PR;
import X.C0B2S;
import X.C0C64;
import X.C0CCZ;
import X.C0V2E;
import X.C0V5M;
import X.C0V5O;
import X.C0V5P;
import X.C0VC5;
import X.C0VDB;
import X.C0VEX;
import X.C0VG2;
import X.C0VJT;
import X.C0VZ0;
import X.C1602860roS;
import X.C19273110af;
import X.C2222691Bz1;
import X.C2407009bw;
import X.C2427709fH;
import X.C791880V4o;
import X.C791940V4u;
import X.C792400V6o;
import X.C792420V6q;
import X.C792940V8q;
import X.C793740VBs;
import X.C794010VCt;
import X.C794240VDq;
import X.C794350VEb;
import X.C794380VEe;
import X.C794390VEf;
import X.C794420VEi;
import X.C794430VEj;
import X.C835170WpX;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2210981Bg8;
import X.InterfaceC792020V5c;
import X.InterfaceC792440V6s;
import X.InterfaceC794190VDl;
import Y.ARunnableS78S0200000_9;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask;
import com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask;
import com.ss.android.ugc.aweme.settings.ApmReportJsonMemoryConfig;
import com.ss.android.ugc.aweme.task.JavaObjectMonitorInitTask;
import com.ss.android.ugc.aweme.task.gc.GCCallbackReporterTask;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class MonitorInitTask implements C0CCZ {
    public static final AtomicBoolean LL = new AtomicBoolean(false);
    public static final String[] LLILLJJLI = {"https://mon-va.tiktokv.com/monitor/collect/c/exception"};
    public static final List<String> LLILLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MonitorInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    static {
        String[] strArr = new String[3];
        strArr[0] = C2222691Bz1.LJIIIIZZ() ? "https://mon.tiktokv.com/monitor/collect/" : "https://mon-va.tiktokv.com/monitor/collect/";
        strArr[1] = C2222691Bz1.LJIIIIZZ() ? "https://mon-va.tiktokv.com/monitor/collect/" : "https://mon.tiktokv.com/monitor/collect/";
        strArr[2] = "https://mon-sg.tiktokv.com/monitor/collect/";
        LLILLL = new ArrayList(Arrays.asList(strArr));
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) throws JSONException {
        Iterator<String> itKeys;
        String str;
        C2407009bw.LIZ();
        if (LL.compareAndSet(false, true)) {
            C01GW c01gw = C794380VEe.LIZIZ;
            C793740VBs c793740VBs = new C793740VBs(((ApmReportJsonMemoryConfig) c01gw.getValue()).getEnable(), ((ApmReportJsonMemoryConfig) c01gw.getValue()).getRecordDataStreamInitSize(), ((ApmReportJsonMemoryConfig) c01gw.getValue()).getReportDataStreamInitSize());
            Context context2 = C792400V6o.LIZ;
            C792420V6q.LJIILLIIL = c793740VBs;
            C01GW c01gw2 = C794390VEf.LIZIZ;
            C0VC5.LJ = new C794010VCt(((ApmReportJsonMemoryConfig) c01gw2.getValue()).getEnable(), ((ApmReportJsonMemoryConfig) c01gw2.getValue()).getRecordDataStreamInitSize(), ((ApmReportJsonMemoryConfig) c01gw2.getValue()).getReportDataStreamInitSize());
            C844470XAv.LIZ.getClass();
            C791880V4o.LIZ(C844470XAv.LIZ());
            final C791940V4u c791940V4u = new C791940V4u();
            JSONObject headerCopy = AppLog.getHeaderCopy();
            c791940V4u.LJIL = new C0VG2();
            if (headerCopy != null) {
                try {
                    C1602860roS.LIZ.getClass();
                    headerCopy.put("is_new_user", String.valueOf(C1602860roS.LJ()));
                    JSONObject jSONObjectLIZ = C0VJT.LIZ(headerCopy);
                    try {
                        JSONObject jSONObject = c791940V4u.LJIIJ;
                        if (jSONObject != null && (itKeys = jSONObjectLIZ.keys()) != null) {
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (!jSONObjectLIZ.isNull(next)) {
                                    jSONObject.put(next, jSONObjectLIZ.opt(next));
                                }
                            }
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new RuntimeException(e2);
                }
            }
            if (C0B2S.LIZ) {
                c791940V4u.LIZJ = false;
                c791940V4u.LIZIZ = false;
            } else {
                c791940V4u.LIZJ = true;
                c791940V4u.LIZIZ = true;
            }
            c791940V4u.LJFF = false;
            c791940V4u.LIZLLL = true;
            String[] strArr = new String[3];
            String str2 = "https://mon.tiktokv.com/monitor/appmonitor/v2/settings";
            if (C2222691Bz1.LJIIIIZZ()) {
                str = "https://mon.tiktokv.com/monitor/appmonitor/v2/settings";
            } else {
                str = "https://mon-va.tiktokv.com/monitor/appmonitor/v2/settings";
            }
            strArr[0] = str;
            if (C2222691Bz1.LJIIIIZZ()) {
                str2 = "https://mon-va.tiktokv.com/monitor/appmonitor/v2/settings";
            }
            strArr[1] = str2;
            strArr[2] = "https://mon-sg.tiktokv.com/monitor/appmonitor/v2/settings";
            c791940V4u.LJII = Arrays.asList(strArr);
            c791940V4u.LJIILIIL = Math.min(60L, 30L);
            c791940V4u.LJIIIZ = Arrays.asList(LLILLJJLI);
            c791940V4u.LJIIIIZZ = LLILLL;
            C844470XAv.LIZ.getClass();
            try {
                c791940V4u.LJIIJ.put("aid", C844470XAv.LJIIJ);
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            c791940V4u.LIZIZ("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
            c791940V4u.LIZIZ("app_version", C844470XAv.LIZJ());
            c791940V4u.LIZIZ("update_version_code", String.valueOf(C844470XAv.LIZLLL()));
            c791940V4u.LIZIZ("channel", C844470XAv.LJIILL);
            c791940V4u.LJIIZILJ = new C0V5O() { // from class: X.0VEd
            };
            c791940V4u.LJIJI = new C0VEX();
            c791940V4u.LJIILJJIL = new C0V5M() { // from class: X.0VYm
                @Override // X.C0V5M
                public final void onStartComplete() {
                }

                @Override // X.C0V5M
                public final void LIZ() {
                    C799900VZk.LIZ.getClass();
                    C0CPH c0cph = new C0CPH();
                    c0cph.LIZ(new RheaTraceUploadTask());
                    c0cph.LIZIZ();
                }
            };
            String strLIZIZ = C835170WpX.LIZIZ(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
            if (strLIZIZ != null) {
                c791940V4u.LIZIZ("scoped_device_id", strLIZIZ);
            } else {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("Apm", "getScopedDeviceId: null");
            }
            if (TextUtils.equals(C844470XAv.LJIILL, "local_test")) {
                c791940V4u.LIZ = C19273110af.LIZ().forceUpdateSlardarSetting();
                c791940V4u.LJIILL = new C0V5P() { // from class: X.0VEv
                    @Override // X.C0V5P
                    public final void LIZ(String str3, JSONObject jSONObject2) {
                        Context context3 = context;
                        AtomicBoolean atomicBoolean = MonitorInitTask.LL;
                        if (C794560VEw.LIZ == null) {
                            C794560VEw.LIZ = Boolean.valueOf(KevaImpl.getRepo("optimize_config", 0).getBoolean("log_open", false));
                        }
                        if (C794560VEw.LIZ.booleanValue() && TextUtils.equals("page_load", str3)) {
                            StringBuilder sb = new StringBuilder();
                            try {
                                String string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "extra_status"), Scene.SCENE_SERVICE);
                                String strSubstring = string.substring(string.lastIndexOf(46));
                                sb.append("Activity: ");
                                sb.append(strSubstring);
                                sb.append("\n");
                                JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "extra_values");
                                Iterator<String> itKeys2 = jSONObject3.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    sb.append(next2);
                                    sb.append(": ");
                                    sb.append(JSONObjectProtectorUtils.getInt(jSONObject3, next2));
                                    sb.append("\n");
                                }
                                sb.deleteCharAt(sb.lastIndexOf("\n"));
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                            C1701940uOG.LIZIZ().LIZIZ(new ARunnableS78S0200000_9(context3, sb, 30));
                        }
                    }
                };
            }
            c791940V4u.LJI = true;
            try {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "ttk_feedback_alog_upload_opt", true, false)) {
                    c791940V4u.LJIJJ = C2427709fH.LJI(context).getAbsolutePath();
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            setupCloudCommand(context, c791940V4u);
            C844470XAv.LIZ.getClass();
            final Context contextLIZ = C844470XAv.LIZ();
            C794430VEj c794430VEj = C794420VEi.LIZLLL;
            c791940V4u.LJIIJJI = new InterfaceC792440V6s() { // from class: X.0VQG
                @Override // X.InterfaceC792440V6s
                public final Map<String, String> getCommonParams() {
                    HashMap map = new HashMap();
                    C0XDN.LIZJ(map, true);
                    return map;
                }

                @Override // X.InterfaceC792440V6s
                public final String getSessionId() {
                    C827040WcQ.LIZ.getClass();
                    return C827040WcQ.LIZJ;
                }

                @Override // X.InterfaceC792440V6s
                public final long getUid() {
                    String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
                    if (TextUtils.isEmpty(curUserId)) {
                        return 0L;
                    }
                    return CastLongProtector.valueOf(curUserId).longValue();
                }
            };
            c791940V4u.LJIILLIIL = new InterfaceC792020V5c() { // from class: X.0VEV
                @Override // X.InterfaceC792020V5c
                public final Map getQueryParams() {
                    HashMap map = new HashMap();
                    C844470XAv.LIZ.getClass();
                    map.put("app_id", String.valueOf(C844470XAv.LJIIJ));
                    return map;
                }
            };
            C794240VDq.LIZ(c791940V4u);
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8(contextLIZ, c791940V4u) { // from class: X.0VEW
                public final /* synthetic */ C791940V4u LL;

                @Override // X.InterfaceC2210981Bg8
                public final void LIZ(boolean z) {
                }

                @Override // X.InterfaceC2210981Bg8
                public final void LIZJ(boolean z) {
                }

                {
                    this.LL = c791940V4u;
                }

                @Override // X.InterfaceC2210981Bg8
                public final void LIZIZ(String str3, String str4) {
                    if (AppLog.getHeaderCopy() != null) {
                        C794240VDq.LIZ(this.LL);
                    }
                }
            });
            NetworkUtils.setMonitorProcessHook(C794420VEi.LIZLLL);
            C1602860roS.LIZ.getClass();
            C0V2E.LLJJIJI.put("is_new_user", String.valueOf(C1602860roS.LJI()));
            if (C794350VEb.LIZ() != null && C794350VEb.LIZ().enable) {
                new JavaObjectMonitorInitTask().run(context);
            }
        }
        if (C09PR.LIZ == 1) {
            new GCCallbackReporterTask().run(context);
        }
    }

    private void setupCloudCommand(Context context, C791940V4u c791940V4u) {
        C792940V8q c792940V8q = new C792940V8q();
        c791940V4u.getClass();
        if (C792400V6o.LJIIIZ()) {
            ((HashSet) c791940V4u.LJIIL).add(c792940V8q);
        }
        InterfaceC794190VDl interfaceC794190VDl = new InterfaceC794190VDl() { // from class: X.0Vi9
            public List<String> LIZ;
            public String LIZIZ;

            @Override // X.InterfaceC794180VDk
            public final C794120VDe LIZ() {
                boolean z;
                String str;
                HashMap<String, String> lastFetchErrorInfo;
                List<String> list = this.LIZ;
                if (list == null || list.size() <= 0) {
                    z = false;
                    str = this.LIZIZ;
                    if (str == null) {
                        str = "alog file not get";
                    }
                    lastFetchErrorInfo = ALog.getLastFetchErrorInfo();
                } else {
                    z = true;
                    str = "";
                    lastFetchErrorInfo = null;
                }
                return new C794120VDe(str, lastFetchErrorInfo, z);
            }

            @Override // X.InterfaceC794190VDl
            public final List LIZIZ(long j, long j2) {
                boolean zContains;
                if (C10EU.LJIILIIL()) {
                    this.LIZIZ = "App in child mode, transmission is prohibited";
                } else if (!C05GY.LIZ()) {
                    this.LIZIZ = "App is not consent, transmission is prohibited";
                } else if (C1906580ziK.LJI()) {
                    this.LIZIZ = "App in the background, transmission is prohibited";
                }
                String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                boolean zLIZIZ = C2273401Dyc.LIZIZ();
                if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null) {
                    try {
                        zContains = C080300Rt.LIZ.contains(C13LQ.LJJIJIL(MessageDigest.getInstance("SHA-256").digest(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.getBytes(Charsets.UTF_8)), "", AFwS231S0000000_3.get$arr$(102)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        zContains = false;
                    }
                } else {
                    zContains = false;
                }
                if (zContains || !zLIZIZ || C802300Vdc.LIZ()) {
                    LIZLLL(j, j2);
                } else {
                    this.LIZIZ = "App in TTP, transmission is prohibited";
                }
                return this.LIZ;
            }

            public final void LIZLLL(long j, long j2) {
                if (j >= j2) {
                    return;
                }
                if (!ALog.isInitSuccess()) {
                    this.LIZIZ = "ALog has not been inited";
                }
                ALog.syncFlush();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LIZ = ALog.getALogFiles(j, j2);
            }
        };
        if (C0VDB.LJIIIZ) {
            C0VDB.LIZIZ().LIZJ(interfaceC794190VDl);
        } else {
            C0VDB.LJII = interfaceC794190VDl;
        }
    }
}
