package com.heytap.mcssdk;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1701330uNH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C786420Ut6;
import X.C844470XAv;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.d.e;
import com.heytap.mcssdk.liquid.DownloadRequest;
import com.heytap.mcssdk.liquid.OnLiquidSettingChangeListener;
import com.heytap.mcssdk.utils.StatUtil;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.f;
import com.heytap.mcssdk.utils.g;
import com.heytap.mcssdk.utils.j;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ILiquidTaskQueryCallback;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.heytap.msp.push.callback.IPackageAuthCallbackListener;
import com.heytap.msp.push.callback.IServiceChannelCallback;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.MessageStat;
import com.heytap.msp.push.statis.StatisticUtils;
import com.mcs.aidl.IMcsSdkService;
import com.mcs.aidl.INotifiPermissionCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class PushService implements b {
    public static final String TYPE = "type";
    public static boolean sIsNewMcsPkg;
    public static String sMcsPkgName;
    public final ConcurrentHashMap<Integer, com.heytap.mcssdk.b.a> mAppLimitMap;
    public String mAuthCode;
    public Context mContext;
    public Handler mHandler;
    public ICallBackResultService mICallBackResultService;
    public IGetAppNotificationCallBackService mIGetAppNotificationCallBackService;
    public ISetAppNotificationCallBackService mISetAppNotificationCallBackService;
    public final List<e> mParsers;
    public PermissionCallbackProxy mPermissionCallback;
    public final List<com.heytap.mcssdk.e.c> mProcessors;
    public String mRegisterID;
    public f mRegisterTimeoutTask;
    public String mVerifyCode;
    public boolean needStaticRegister;
    public static final String TAG = "PushService";
    public static final int[] OLD_MCS_PACKAGE = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115};
    public static final int[] OLD_MCS_RECEIVE_SDK_ACTION = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115, 115, 100, 107, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 67, 69, 73, 86, 69, 95, 83, 68, 75, 95, 77, 69, 83, 83, 65, 71, 69};
    public static final int[] NEW_MCS_PACKAGE = {99, 111, 109, 46, 104, 101, 121, 116, 97, 112, 46, 109, 99, 115};
    public static final int[] CALLKIT_PROVIDER_URI = {99, 111, 110, 116, 101, 110, 116, 58, 47, 47, 99, 111, 109, 46, 111, 115, 46, 99, 97, 108, 108, 115, 101, 114, 118, 105, 99, 101, 46, 99, 97, 108, 108, 107, 105, 116, 95, 112, 114, 111, 118, 105, 100, 101, 114};
    public static String NEW_MCS_RECEIVE_SDK_ACTION = "";
    public static int sCount = 0;
    public static volatile Boolean isSupportLiquid = null;
    public static volatile Boolean isSupportLiquidBatch = null;
    public static volatile Boolean isTabletDevice = null;

    public static final class PermissionCallbackProxy extends INotifiPermissionCallback.Stub {
        public INotificationPermissionCallback b;
        public long c;

        private boolean b() {
            return SystemClock.elapsedRealtime() - this.c <= 2000;
        }

        private void c() {
            this.c = SystemClock.elapsedRealtime();
        }

        private void d() {
            this.c = 0L;
        }

        public void a() {
            d();
            this.b = null;
        }

        public boolean a(INotificationPermissionCallback iNotificationPermissionCallback) {
            if (b()) {
                return false;
            }
            c();
            this.b = iNotificationPermissionCallback;
            return true;
        }

        @Override // com.mcs.aidl.INotifiPermissionCallback
        public void onFail(int i, String str) {
            d();
            INotificationPermissionCallback iNotificationPermissionCallback = this.b;
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(i, str);
            }
            this.b = null;
        }

        @Override // com.mcs.aidl.INotifiPermissionCallback
        public void onSuccess() {
            d();
            INotificationPermissionCallback iNotificationPermissionCallback = this.b;
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onSuccess();
            }
            this.b = null;
        }
    }

    public static class a {
        public static final PushService a = new PushService();
    }

    public PushService() {
        this.mProcessors = new ArrayList();
        this.mParsers = new ArrayList();
        this.mRegisterID = null;
        this.needStaticRegister = true;
        this.mPermissionCallback = new PermissionCallbackProxy();
        synchronized (PushService.class) {
            try {
                int i = sCount;
                if (i > 0) {
                    throw new RuntimeException("PushService can't create again!");
                }
                sCount = i + 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        addParser(new com.heytap.mcssdk.d.c());
        addParser(new com.heytap.mcssdk.d.a());
        addParser(new com.heytap.mcssdk.d.b());
        addProcessor(new com.heytap.mcssdk.e.b());
        addProcessor(new com.heytap.mcssdk.e.a());
        this.mAppLimitMap = new ConcurrentHashMap<>();
    }

    private com.heytap.mcssdk.b.a addCommandToMap(int i) {
        String str;
        if (!this.mAppLimitMap.containsKey(Integer.valueOf(i))) {
            com.heytap.mcssdk.b.a aVar = new com.heytap.mcssdk.b.a(System.currentTimeMillis(), 1);
            this.mAppLimitMap.put(Integer.valueOf(i), aVar);
            com.heytap.mcssdk.utils.e.b("addCommandToMap :appBean is null");
            return aVar;
        }
        com.heytap.mcssdk.b.a aVar2 = this.mAppLimitMap.get(Integer.valueOf(i));
        if (checkTimeNeedUpdate(aVar2)) {
            aVar2.a(1);
            aVar2.a(System.currentTimeMillis());
            str = "addCommandToMap : appLimitBean.setCount(1)";
        } else {
            aVar2.a(aVar2.b() + 1);
            str = "addCommandToMap :appLimitBean.getCount() + 1";
        }
        com.heytap.mcssdk.utils.e.b(str);
        return aVar2;
    }

    private synchronized void addParser(e eVar) {
        if (eVar != null) {
            this.mParsers.add(eVar);
        }
    }

    private synchronized void addProcessor(com.heytap.mcssdk.e.c cVar) {
        if (cVar != null) {
            this.mProcessors.add(cVar);
        }
    }

    private boolean checkAll() {
        return checkContext() && checkRegisterID();
    }

    private boolean checkContext() {
        return this.mContext != null;
    }

    private boolean checkIsTabletDevice() {
        if (isTabletDevice == null) {
            isTabletDevice = Boolean.valueOf(com.heytap.mcssdk.utils.d.a());
        }
        return isTabletDevice.booleanValue();
    }

    private boolean checkRegisterID() {
        return this.mRegisterID != null;
    }

    private boolean checkTimeNeedUpdate(com.heytap.mcssdk.b.a aVar) {
        long jA = aVar.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkTimeNeedUpdate : lastedTime ");
        sbLIZ.append(jA);
        sbLIZ.append(" currentTime:");
        sbLIZ.append(jCurrentTimeMillis);
        com.heytap.mcssdk.utils.e.b(C2188811AlT.LIZIZ(sbLIZ));
        return jCurrentTimeMillis - jA > getAppLimitCLickTime();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean checkTop(android.app.Activity r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "activity"
            java.lang.Object r5 = X.C786410Ut5.F2(r7, r0)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r1 = r5.getAppTasks()
            r2 = 0
            r4 = 0
            java.lang.String r3 = "dzBzEgo/Rt7dRRksRgGXYn8ThtKztonqgudFVo4="
            if (r1 == 0) goto L42
            int r0 = r1.size()
            if (r0 <= 0) goto L42
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r0 = r1.getTaskInfo()
            android.content.ComponentName r0 = r0.topActivity
            if (r0 == 0) goto L42
            java.lang.Class r0 = r7.getClass()
            java.lang.String r2 = r0.getName()
            android.app.ActivityManager$RecentTaskInfo r0 = r1.getTaskInfo()
            android.content.ComponentName r1 = r0.topActivity
            X.0WZX r0 = new X.0WZX
            r0.<init>(r3, r4)
        L39:
            java.lang.String r0 = X.C2204961BRm.LJJIJIIJIL(r1, r0)
            boolean r0 = r2.equals(r0)
            return r0
        L42:
            X.0WZX r0 = new X.0WZX
            r0.<init>(r3, r4)
            java.util.List r1 = X.C2204961BRm.LJIIIZ(r5, r0)
            if (r1 == 0) goto L69
            int r0 = r1.size()
            if (r0 <= 0) goto L69
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            android.app.ActivityManager$RunningTaskInfo r1 = (android.app.ActivityManager.RunningTaskInfo) r1
            java.lang.Class r0 = r7.getClass()
            java.lang.String r2 = r0.getName()
            android.content.ComponentName r1 = r1.topActivity
            X.0WZX r0 = new X.0WZX
            r0.<init>(r3, r4)
            goto L39
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.mcssdk.PushService.checkTop(android.app.Activity):boolean");
    }

    private boolean checkVerifyRequest(DownloadRequest downloadRequest) {
        int i = 2;
        if (!TextUtils.isEmpty(downloadRequest.getTraceId())) {
            if (TextUtils.isEmpty(downloadRequest.getDesc())) {
                i = 17;
            } else if (downloadRequest.getLoadingType() != 1 && downloadRequest.getLoadingType() != 2) {
                i = 8;
            } else if (downloadRequest.getAction() == null) {
                i = 19;
            } else if (downloadRequest.getManagerAction() == null) {
                i = 20;
            } else if (downloadRequest.getPercent() < 0 || downloadRequest.getPercent() > 100) {
                i = 22;
            } else {
                if (!TextUtils.isEmpty(downloadRequest.getPkgName())) {
                    return true;
                }
                i = 7;
            }
        }
        if (downloadRequest.getCallback() != null) {
            downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), i, downloadRequest.getStatus());
        }
        return false;
    }

    public static PushService getInstance() {
        return a.a;
    }

    private Intent getIntent(int i, String str, JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setAction(getReceiveSdkAction(this.mContext));
        intent.setPackage(getMcsPackageName(this.mContext));
        intent.putExtra("type", i);
        JSONObject jSONObject2 = new JSONObject();
        try {
            try {
                Context context = this.mContext;
                jSONObject2.putOpt("versionName", Utils.getVersionName(context, context.getPackageName()));
                Context context2 = this.mContext;
                jSONObject2.putOpt("versionCode", Integer.valueOf(Utils.getVersionCode(context2, context2.getPackageName())));
                if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.putOpt(next, jSONObject.get(next));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            intent.putExtra("extra", C786410Ut5.J3(jSONObject2));
            intent.putExtra("params", str);
            intent.putExtra("appPackage", this.mContext.getPackageName());
            intent.putExtra("appKey", this.mAuthCode);
            intent.putExtra("appSecret", this.mVerifyCode);
            intent.putExtra("registerID", this.mRegisterID);
            intent.putExtra("sdkVersion", getSDKVersionName());
            intent.putExtra("userIdentifier", getUserId(this.mContext));
            return intent;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            intent.putExtra("extra", C786410Ut5.J3(jSONObject2));
            throw th;
        }
    }

    private String getMcsPackageNameInner(Context context) {
        String str = TAG;
        com.heytap.mcssdk.utils.e.b(str, "getMcsPackageNameInner -- ");
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        String string = Utils.getString(NEW_MCS_PACKAGE);
                        ApplicationInfo applicationInfoV3 = C786410Ut5.V3(packageManager, string, 0);
                        if (applicationInfoV3 != null) {
                            boolean z = (applicationInfoV3.flags & 1) == 1;
                            int iINVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageUid = INVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageUid(packageManager, "android", 0);
                            int i = applicationInfoV3.uid;
                            int iA = j.a();
                            str = (z || (j.a(i, iA) == iINVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageUid)) ? string : null;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("getMcsPackageNameInner packageUid = ");
                            sbLIZ.append(i);
                            sbLIZ.append(", systemUid = ");
                            sbLIZ.append(iINVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageUid);
                            sbLIZ.append(", userId = ");
                            sbLIZ.append(iA);
                            com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return str;
                    } catch (PackageManager.NameNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                        String str2 = TAG;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("NameNotFoundException in get mcs package name:");
                        sbLIZ2.append(e.getMessage());
                        com.heytap.mcssdk.utils.e.e(str2, C2188811AlT.LIZIZ(sbLIZ2));
                        return str;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    String str3 = TAG;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Error in get mcs package name:");
                    sbLIZ3.append(e2.getMessage());
                    com.heytap.mcssdk.utils.e.e(str3, C2188811AlT.LIZIZ(sbLIZ3));
                    return str;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return str;
    }

    public static int getSDKVersionCode() {
        return 4100;
    }

    public static String getSDKVersionName() {
        return "4.1.0";
    }

    private int getUserId(Context context) {
        try {
            return ((Integer) Context.class.getMethod("getUserId", new Class[0]).invoke(context, new Object[0])).intValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    private boolean isMcsSupportCallkit() {
        String mcsPackageName = getMcsPackageName(this.mContext);
        boolean zIsSupportPush = Utils.isSupportPush(this.mContext, mcsPackageName, "supportCallkitDataBind");
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSupportCallkit -- ");
        sbLIZ.append(zIsSupportPush);
        com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        return Utils.isExistPackage(this.mContext, mcsPackageName) && zIsSupportPush;
    }

    private boolean isSupportPushInner(Context context) {
        if (this.mContext == null) {
            this.mContext = C786410Ut5.N3(context);
        }
        String mcsPackageName = getMcsPackageName(this.mContext);
        boolean z = Utils.isExistPackage(this.mContext, mcsPackageName) && Utils.getVersionCode(this.mContext, mcsPackageName) >= 1019 && Utils.isSupportPush(this.mContext, mcsPackageName, "supportOpenPush");
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSupportPushInner -- ");
        sbLIZ.append(z);
        com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public static boolean isSystemApp(Context context, String str) {
        return (TextUtils.isEmpty(str) || (C786410Ut5.Y3(context.getPackageManager(), str, 0).applicationInfo.flags & 129) == 0) ? false : true;
    }

    public static boolean isSystemProviderRegistered(Context context, String str) {
        try {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider != null) {
                return isSystemApp(context, providerInfoResolveContentProvider.packageName);
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSystemProviderRegistered ex: ");
            sbLIZ.append(e);
            com.heytap.mcssdk.utils.e.e(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public static void onAppStart(Context context) {
        StatUtil.statisticMessage(context, new MessageStat(context.getPackageName(), "app_start", null));
    }

    private void startMcsService(int i, String str, JSONObject jSONObject) {
        if (checkCommandLimit(i)) {
            if (this.mICallBackResultService != null) {
                this.mICallBackResultService.onError(getErrorCode(i), "api_call_too_frequently", this.mContext.getPackageName(), getMiniProgramPkgFromJSON(jSONObject));
                return;
            }
            return;
        }
        try {
            C786410Ut5.s3(this.mContext, getIntent(i, str, jSONObject));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startMcsService--Exception");
            sbLIZ.append(e.getMessage());
            com.heytap.mcssdk.utils.e.e(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private void startMcsService(int i, JSONObject jSONObject) {
        startMcsService(i, "", jSONObject);
    }

    private void startRegisterTimeoutTask() {
        synchronized (this) {
            try {
                if (this.mHandler == null) {
                    this.mHandler = new BPEAHandler(Looper.getMainLooper());
                }
                if (this.mRegisterTimeoutTask == null) {
                    this.mRegisterTimeoutTask = new f(this.mHandler, 10000L);
                }
                this.mRegisterTimeoutTask.a();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void active(Context context) {
        String str;
        if (context == null) {
            str = "active context null";
        } else {
            if (!checkCommandLimit(12321)) {
                try {
                    Intent intent = new Intent();
                    intent.setAction("com.heytap.mcs.action.active");
                    intent.setPackage(getMcsPackageName(context));
                    intent.putExtra("commandType", "acceleratePing");
                    if (context.getPackageManager().resolveService(intent, 128) == null) {
                        com.heytap.mcssdk.utils.e.b("mcssdk---", "active unsupported");
                        return;
                    } else {
                        C786410Ut5.s3(context, intent);
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    com.heytap.mcssdk.utils.e.a("mcssdk---", th);
                    return;
                }
            }
            str = "active internal limit!";
        }
        com.heytap.mcssdk.utils.e.e("mcssdk---", str);
    }

    public void bindMcsService(int i) throws Throwable {
        if (!checkCommandLimit(i)) {
            final Intent intent = getIntent(i, "", null);
            C2204961BRm.LJJJJ(this.mContext, intent, new ServiceConnection() { // from class: com.heytap.mcssdk.PushService.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
                    C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/heytap/mcssdk/PushService$1", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgo/Rt7dRRksRgGXYn8ThtKztonqgudFVo4=", null)));
                    if (c0wsuLIZIZ.LIZ) {
                        return;
                    }
                    Object[] objArr = c0wsuLIZIZ.LIZJ;
                    if (objArr != null) {
                        Object obj = objArr[0];
                        Object obj2 = objArr[1];
                        if (obj2 != null) {
                            iBinder = (IBinder) obj2;
                        }
                    }
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJIIJZLJL(bundle, INVOKEVIRTUAL_com_heytap_mcssdk_PushService$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
                    try {
                        IMcsSdkService.Stub.asInterface(iBinder).process(bundle);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        com.heytap.mcssdk.utils.e.b("bindMcsService exception:" + e);
                    }
                    PushService.this.mContext.unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }

                public static Bundle INVOKEVIRTUAL_com_heytap_mcssdk_PushService$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent2) {
                    try {
                        return intent2.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
            }, 1, new C0WZX("dzBzEgo/Rt7dRRksRgGXYn8ThtKztonqgudFVo4=", null));
        } else {
            ICallBackResultService iCallBackResultService = this.mICallBackResultService;
            if (iCallBackResultService != null) {
                iCallBackResultService.onError(getErrorCode(i), "api_call_too_frequently", this.mContext.getPackageName(), "");
            }
        }
    }

    @Override // com.heytap.mcssdk.b
    public void callBackTimePushVerifyResult(JSONObject jSONObject) {
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callBackTimePushVerifyResult extraData = ");
        sbLIZ.append(jSONObject);
        com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        startMcsService(12331, jSONObject);
    }

    @Override // com.heytap.mcssdk.b
    public void cancelNotification(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12319, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "please call the register first!");
        }
    }

    public void cancelRegisterTimeoutTask() {
        synchronized (this) {
            try {
                f fVar = this.mRegisterTimeoutTask;
                if (fVar != null) {
                    fVar.b();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public boolean checkCommandLimit(int i) {
        return (i == 12291 || i == 12312 || addCommandToMap(i).b() <= 2) ? false : true;
    }

    @Override // com.heytap.mcssdk.b
    public void clearNotificationAdvanceCallback() {
        this.mPermissionCallback.a();
    }

    @Override // com.heytap.mcssdk.b
    public void clearNotificationType() {
        clearNotificationType(null);
    }

    @Override // com.heytap.mcssdk.b
    public void clearNotificationType(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12308, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.b
    public void clearNotifications() {
        clearNotifications(null);
    }

    @Override // com.heytap.mcssdk.b
    public void clearNotifications(JSONObject jSONObject) {
        if (checkContext()) {
            startMcsService(12311, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.b
    public void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (checkContext()) {
            this.mISetAppNotificationCallBackService = iSetAppNotificationCallBackService;
            startMcsService(12317, null);
        } else if (getPushCallback() != null) {
            this.mISetAppNotificationCallBackService.onSetAppNotificationSwitch(-2);
        }
    }

    @Override // com.heytap.mcssdk.b
    public void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (checkContext()) {
            this.mISetAppNotificationCallBackService = iSetAppNotificationCallBackService;
            startMcsService(12316, null);
        } else {
            ISetAppNotificationCallBackService iSetAppNotificationCallBackService2 = this.mISetAppNotificationCallBackService;
            if (iSetAppNotificationCallBackService2 != null) {
                iSetAppNotificationCallBackService2.onSetAppNotificationSwitch(-2);
            }
        }
    }

    @Override // com.heytap.mcssdk.b
    public long getAppLimitCLickTime() {
        return 1000L;
    }

    public Map<Integer, com.heytap.mcssdk.b.a> getAppLimitMap() {
        return this.mAppLimitMap;
    }

    @Override // com.heytap.mcssdk.b
    public void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        if (checkContext()) {
            this.mIGetAppNotificationCallBackService = iGetAppNotificationCallBackService;
            startMcsService(12318, null);
        } else {
            IGetAppNotificationCallBackService iGetAppNotificationCallBackService2 = this.mIGetAppNotificationCallBackService;
            if (iGetAppNotificationCallBackService2 != null) {
                iGetAppNotificationCallBackService2.onGetAppNotificationSwitch(-2, 0);
            }
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getErrorCode(int i) {
        switch (i) {
            case 12289:
                return -1;
            case 12290:
                return -2;
            case 12291:
                return -14;
            default:
                switch (i) {
                    case 12298:
                        return -11;
                    case 12299:
                        return -3;
                    case 12300:
                        return -4;
                    default:
                        switch (i) {
                            case 12306:
                                return -10;
                            case 12307:
                                return -6;
                            case 12308:
                                return -7;
                            case 12309:
                                return -5;
                            case 12310:
                                return -8;
                            case 12311:
                                return -9;
                            case 12312:
                                return -13;
                            case 12313:
                                return -12;
                            default:
                                switch (i) {
                                    case 12316:
                                        return -15;
                                    case 12317:
                                        return -16;
                                    case 12318:
                                        return -17;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    public String getMcsPackageName(Context context) {
        boolean z;
        if (sMcsPkgName == null) {
            String mcsPackageNameInner = getMcsPackageNameInner(context);
            if (mcsPackageNameInner == null) {
                sMcsPkgName = Utils.getString(OLD_MCS_PACKAGE);
                z = false;
            } else {
                sMcsPkgName = mcsPackageNameInner;
                z = true;
            }
            sIsNewMcsPkg = z;
        }
        return sMcsPkgName;
    }

    public String getMiniProgramPkgFromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            try {
                return jSONObject.optString("miniProgramPkg");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error happened in getMiniProgramPkgFromJSON() :");
                sbLIZ.append(e.getMessage());
                com.heytap.mcssdk.utils.e.b(C2188811AlT.LIZIZ(sbLIZ));
                return "";
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    @Override // com.heytap.mcssdk.b
    public void getNotificationStatus() {
        getNotificationStatus(null);
    }

    @Override // com.heytap.mcssdk.b
    public void getNotificationStatus(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12309, jSONObject);
        } else if (getPushCallback() != null) {
            getPushCallback().onGetNotificationStatus(-2, 0);
        }
    }

    public List<e> getParsers() {
        return this.mParsers;
    }

    public List<com.heytap.mcssdk.e.c> getProcessors() {
        return this.mProcessors;
    }

    public ICallBackResultService getPushCallback() {
        return this.mICallBackResultService;
    }

    public IGetAppNotificationCallBackService getPushGetAppNotificationCallBack() {
        return this.mIGetAppNotificationCallBackService;
    }

    public ISetAppNotificationCallBackService getPushSetAppNotificationCallBack() {
        return this.mISetAppNotificationCallBackService;
    }

    public void getPushStatus() {
        if (checkAll()) {
            startMcsService(12306, null);
        } else if (getPushCallback() != null) {
            getPushCallback().onGetPushStatus(-2, 0);
        }
    }

    public int getPushVersionCode() {
        if (!checkContext()) {
            return 0;
        }
        Context context = this.mContext;
        return Utils.getVersionCode(context, getMcsPackageName(context));
    }

    public String getPushVersionName() {
        if (!checkContext()) {
            return "";
        }
        Context context = this.mContext;
        return Utils.getVersionName(context, getMcsPackageName(context));
    }

    public String getReceiveSdkAction(Context context) {
        if (sMcsPkgName == null) {
            getMcsPackageNameInner(context);
        }
        if (!sIsNewMcsPkg) {
            return Utils.getString(OLD_MCS_RECEIVE_SDK_ACTION);
        }
        if (TextUtils.isEmpty(NEW_MCS_RECEIVE_SDK_ACTION)) {
            NEW_MCS_RECEIVE_SDK_ACTION = new String(Base64.decode("Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ==", 0));
        }
        return NEW_MCS_RECEIVE_SDK_ACTION;
    }

    @Override // com.heytap.mcssdk.b
    public void getRegister() {
        getRegister(null);
    }

    @Override // com.heytap.mcssdk.b
    public void getRegister(JSONObject jSONObject) {
        if (checkContext()) {
            startMcsService(12289, jSONObject);
        } else if (getPushCallback() != null) {
            getPushCallback().onRegister(-2, null, null, null);
        }
    }

    @Override // com.heytap.mcssdk.b
    public String getRegisterID() {
        return this.mRegisterID;
    }

    public PushService init(Context context, boolean z) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        innerInit(context);
        com.heytap.mcssdk.utils.e.f(z);
        return this;
    }

    public void innerInit(Context context) {
        boolean z;
        this.mContext = C786410Ut5.N3(context);
        if (this.mHandler == null) {
            this.mHandler = new BPEAHandler(Looper.getMainLooper());
        }
        if (sMcsPkgName == null) {
            String mcsPackageNameInner = getMcsPackageNameInner(context);
            if (mcsPackageNameInner == null) {
                sMcsPkgName = Utils.getString(OLD_MCS_PACKAGE);
                z = false;
            } else {
                sMcsPkgName = mcsPackageNameInner;
                z = true;
            }
            sIsNewMcsPkg = z;
        }
    }

    public boolean isCallKitProviderAvailable() {
        return isSystemProviderRegistered(this.mContext, UriProtector.parse(Utils.getString(CALLKIT_PROVIDER_URI)).getAuthority());
    }

    public boolean isMCSSupportLiquidAuthDetailQuery() {
        if (isOsVersion15()) {
            String mcsPackageName = getMcsPackageName(this.mContext);
            return Utils.isExistPackage(this.mContext, mcsPackageName) && Utils.getVersionCode(this.mContext, mcsPackageName) >= 52808;
        }
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Device not supported LiquidBatch: SDK version ");
        sbLIZ.append(Build.VERSION.SDK_INT);
        sbLIZ.append(" < 35");
        com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public boolean isMcsSupportLiquid() {
        if (isOsVersion15()) {
            String mcsPackageName = getMcsPackageName(this.mContext);
            return Utils.isExistPackage(this.mContext, mcsPackageName) && Utils.isSupportPush(this.mContext, mcsPackageName, "supportLiquidDownload");
        }
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Device not supported Liquid: SDK version ");
        sbLIZ.append(Build.VERSION.SDK_INT);
        sbLIZ.append(" < 35");
        com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public boolean isMcsSupportLiquidBatch() {
        if (isOsVersion15()) {
            String mcsPackageName = getMcsPackageName(this.mContext);
            return Utils.isExistPackage(this.mContext, mcsPackageName) && Utils.getVersionCode(this.mContext, mcsPackageName) >= 52800;
        }
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Device not supported LiquidBatch: SDK version ");
        sbLIZ.append(Build.VERSION.SDK_INT);
        sbLIZ.append(" < 35");
        com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public boolean isOsVersion15() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            return true;
        }
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Device not supported Liquid: SDK version ");
        sbLIZ.append(i);
        sbLIZ.append(" < 35");
        com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public boolean isSupportCallkit(Context context) {
        if (this.mContext == null) {
            this.mContext = C786410Ut5.N3(context);
        }
        boolean z = isMcsSupportCallkit() && isCallKitProviderAvailable();
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSupportCallkit -- ");
        sbLIZ.append(z);
        com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    @Override // com.heytap.mcssdk.b
    public boolean isSupportLiquid(Context context) {
        if (this.mContext == null) {
            this.mContext = C786410Ut5.N3(context);
        }
        boolean z = false;
        if (checkCommandLimit(12324)) {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "Avoid frequently calling isSupportLiquid.");
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Device not supported: SDK version ");
            sbLIZ.append(i);
            sbLIZ.append(" < 35");
            com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (isMcsSupportLiquid() && com.heytap.mcssdk.liquid.b.a().b() && !checkIsTabletDevice()) {
            z = true;
        }
        String str2 = TAG;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isSupportPushInner -- ");
        sbLIZ2.append(z);
        com.heytap.mcssdk.utils.e.b(str2, C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }

    @Override // com.heytap.mcssdk.b
    public boolean isSupportLiquidBatch(Context context) {
        if (this.mContext == null) {
            this.mContext = C786410Ut5.N3(context);
        }
        if (this.mContext == null) {
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSupportLiquidBatch --  mContext is null after assign :");
            sbLIZ.append(this.mContext == null);
            com.heytap.mcssdk.utils.e.e(str, C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (checkCommandLimit(12326)) {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "Avoid frequently calling isSupportLiquidBatch.");
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            String str2 = TAG;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Device not supported: SDK version ");
            sbLIZ2.append(i);
            sbLIZ2.append(" < 35");
            com.heytap.mcssdk.utils.e.b(str2, C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        boolean z = isMcsSupportLiquidBatch() && com.heytap.mcssdk.liquid.b.a().b() && !checkIsTabletDevice();
        String str3 = TAG;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("isSupportLiquidBatch -- ");
        sbLIZ3.append(z);
        com.heytap.mcssdk.utils.e.b(str3, C2188811AlT.LIZIZ(sbLIZ3));
        return z;
    }

    public boolean isSupportPushByClient(Context context) {
        return isSupportPushInner(context);
    }

    @Override // com.heytap.mcssdk.b
    public void openNotificationSettings() {
        openNotificationSettings(null);
    }

    @Override // com.heytap.mcssdk.b
    public void openNotificationSettings(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12310, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.b
    public void pausePush() {
        pausePush(null);
    }

    @Override // com.heytap.mcssdk.b
    public void pausePush(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12299, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.b
    public void queryLiquidTask(Context context, ILiquidTaskQueryCallback iLiquidTaskQueryCallback) {
        if (context == null) {
            if (iLiquidTaskQueryCallback != null) {
                iLiquidTaskQueryCallback.onFailure(10001);
            }
        } else if (checkCommandLimit(12323)) {
            if (iLiquidTaskQueryCallback != null) {
                iLiquidTaskQueryCallback.onFailure(10003);
            }
        } else {
            if (this.mContext == null) {
                this.mContext = C786410Ut5.N3(context);
            }
            com.heytap.mcssdk.liquid.b.a().a(context, iLiquidTaskQueryCallback);
        }
    }

    @Override // com.heytap.mcssdk.b
    public void queryPackageAuthDetail(Context context, String str, IPackageAuthCallbackListener iPackageAuthCallbackListener) {
        if (context == null) {
            return;
        }
        if (this.mContext == null) {
            this.mContext = C786410Ut5.N3(context);
        }
        if (!isSupportLiquid(context)) {
            if (iPackageAuthCallbackListener != null) {
                iPackageAuthCallbackListener.onAuthResult(-2);
            }
        } else if (isMCSSupportLiquidAuthDetailQuery()) {
            com.heytap.mcssdk.liquid.b.a().a(context, str, iPackageAuthCallbackListener);
        } else {
            iPackageAuthCallbackListener.onAuthResult(4);
        }
    }

    @Override // com.heytap.mcssdk.b
    public void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        register(context, str, str2, null, iCallBackResultService);
    }

    @Override // com.heytap.mcssdk.b
    public void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        if (context == null) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null, null, null);
                return;
            }
            return;
        }
        if (this.mContext == null) {
            this.mContext = C786410Ut5.N3(context);
        }
        if (!Utils.isSupportPushByClient(this.mContext)) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null, null, null);
                return;
            }
            return;
        }
        if (this.needStaticRegister) {
            com.heytap.mcssdk.utils.e.b("registerAction:", "Will static push_register event :");
            StatisticUtils.statisticEvent(this.mContext, "push_register");
            this.needStaticRegister = false;
        }
        this.mAuthCode = str;
        this.mVerifyCode = str2;
        this.mICallBackResultService = iCallBackResultService;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.putOpt("appVersionCode", Integer.valueOf(Utils.getVersionCode(context)));
            jSONObject.putOpt("appVersionName", Utils.getVersionName(context));
            int iC = g.f().c();
            jSONObject.putOpt("fail_type", "registerTimeout");
            jSONObject.putOpt("registerFailedCount", Integer.valueOf(iC));
            if (com.heytap.mcssdk.utils.e.g()) {
                String str3 = TAG;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("register() timeoutCount: ");
                sbLIZ.append(iC);
                com.heytap.mcssdk.utils.e.b(str3, C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register-Exception:");
            sbLIZ2.append(e.getMessage());
            com.heytap.mcssdk.utils.e.e(C2188811AlT.LIZIZ(sbLIZ2));
        }
        cancelRegisterTimeoutTask();
        startRegisterTimeoutTask();
        startMcsService(12289, jSONObject);
    }

    public void registerLiquidSettingChangeListener(Context context, OnLiquidSettingChangeListener onLiquidSettingChangeListener) {
        com.heytap.mcssdk.liquid.b.a().a(context, onLiquidSettingChangeListener);
    }

    @Override // com.heytap.mcssdk.b
    public void requestDownloadSeeding(DownloadRequest downloadRequest) {
        if (!checkContext()) {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "please initialize first!");
            if (downloadRequest.getCallback() != null) {
                downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), 10001, downloadRequest.getStatus());
                return;
            }
            return;
        }
        if (downloadRequest == null) {
            throw new NullPointerException("request is null");
        }
        if (checkIsTabletDevice()) {
            if (downloadRequest.getCallback() != null) {
                downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), 36, downloadRequest.getStatus());
                return;
            }
            return;
        }
        if (!isOsVersion15()) {
            if (downloadRequest.getCallback() != null) {
                downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), 10007, downloadRequest.getStatus());
                return;
            }
            return;
        }
        if (!com.heytap.mcssdk.liquid.b.a().b()) {
            if (downloadRequest.getCallback() != null) {
                downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), 30, downloadRequest.getStatus());
                return;
            }
            return;
        }
        if (isSupportLiquid == null) {
            isSupportLiquid = Boolean.valueOf(isMcsSupportLiquid());
        }
        if (!isSupportLiquid.booleanValue()) {
            if (downloadRequest.getCallback() != null) {
                downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), 10005, downloadRequest.getStatus());
                return;
            }
            return;
        }
        int i = 2;
        if (!TextUtils.isEmpty(downloadRequest.getTraceId())) {
            if (TextUtils.isEmpty(downloadRequest.getDesc())) {
                i = 17;
            } else if (downloadRequest.getLoadingType() != 1 && downloadRequest.getLoadingType() != 2) {
                i = 8;
            } else if (downloadRequest.getAction() == null) {
                i = 19;
            } else if (downloadRequest.getManagerAction() == null) {
                i = 20;
            } else if (downloadRequest.getPercent() < 0 || downloadRequest.getPercent() > 100) {
                i = 22;
            } else {
                if (!TextUtils.isEmpty(downloadRequest.getPkgName())) {
                    if (!checkCommandLimit(12322)) {
                        com.heytap.mcssdk.liquid.b.a().a(getContext(), downloadRequest);
                        return;
                    } else {
                        if (downloadRequest.getCallback() != null) {
                            downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), 10003, downloadRequest.getStatus());
                            return;
                        }
                        return;
                    }
                }
                i = 7;
            }
        }
        if (downloadRequest.getCallback() != null) {
            downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), i, downloadRequest.getStatus());
        }
    }

    @Override // com.heytap.mcssdk.b
    public void requestDownloadSeedingList(List<DownloadRequest> list) {
        if (!checkContext()) {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "please initialize first!");
            com.heytap.mcssdk.liquid.b.a().a(10001, list);
            return;
        }
        if (list == null) {
            throw new NullPointerException("requestList is null");
        }
        if (com.heytap.mcssdk.utils.e.g()) {
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestDownloadSeedingList --original:");
            sbLIZ.append(list);
            com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (checkCommandLimit(12325)) {
            com.heytap.mcssdk.liquid.b.a().a(10003, list);
            return;
        }
        if (checkIsTabletDevice()) {
            com.heytap.mcssdk.liquid.b.a().a(36, list);
            return;
        }
        if (!isOsVersion15()) {
            com.heytap.mcssdk.liquid.b.a().a(10007, list);
            return;
        }
        if (!com.heytap.mcssdk.liquid.b.a().b()) {
            com.heytap.mcssdk.liquid.b.a().a(30, list);
            return;
        }
        if (isSupportLiquidBatch == null) {
            isSupportLiquidBatch = Boolean.valueOf(isMcsSupportLiquidBatch());
        }
        if (!isSupportLiquidBatch.booleanValue()) {
            com.heytap.mcssdk.liquid.b.a().a(10006, list);
            return;
        }
        if (list.size() >= 200) {
            com.heytap.mcssdk.liquid.b.a().a(10004, list.subList(200, list.size()));
            list = list.subList(0, 200);
        }
        if (!list.isEmpty()) {
            Iterator<DownloadRequest> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!checkVerifyRequest(it2.next())) {
                    it2.remove();
                }
            }
        }
        if (com.heytap.mcssdk.utils.e.g()) {
            String str2 = TAG;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestDownloadSeedingList -- requestList:");
            sbLIZ2.append(list);
            com.heytap.mcssdk.utils.e.b(str2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (list.isEmpty()) {
            return;
        }
        com.heytap.mcssdk.liquid.b.a().a(getContext(), list);
    }

    @Override // com.heytap.mcssdk.b
    public void requestNotificationAdvance(Activity activity, INotificationPermissionCallback iNotificationPermissionCallback, int i) throws Throwable {
        if (activity == null) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2000, null);
                return;
            }
            return;
        }
        if (checkCommandLimit(12320)) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2004, null);
                return;
            }
            return;
        }
        if (!checkTop(activity)) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2001, null);
                return;
            }
            return;
        }
        if (activity.checkPermission("android.permission.POST_NOTIFICATIONS", Process.myPid(), Process.myUid()) == 0) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2002, null);
                return;
            }
            return;
        }
        if (!this.mPermissionCallback.a(iNotificationPermissionCallback)) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2003, null);
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.heytap.mcs.action.NOTIFICATION_ADVANCE");
        intent.setPackage(getMcsPackageName(activity));
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIIZ(bundle, this.mPermissionCallback, "result_callback");
        intent.putExtras(bundle);
        intent.putExtra("userIdentifier", getUserId(this.mContext));
        try {
            INVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_bytedance_router_monitor_page_PageLancet_startActivityForResult(activity, intent, i);
        } catch (ActivityNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2005, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.b
    public void requestNotificationPermission() throws Throwable {
        int i = Build.VERSION.SDK_INT;
        if (i < 32) {
            if (checkContext()) {
                bindMcsService(12313);
                return;
            } else {
                com.heytap.mcssdk.utils.e.e("mcssdk---", "please call the register first!");
                return;
            }
        }
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestNotificationPermission() will return due to Android T device , current device Android SDK version code is :");
        sbLIZ.append(i);
        com.heytap.mcssdk.utils.e.b(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.heytap.mcssdk.b
    public void resumePush() {
        resumePush(null);
    }

    @Override // com.heytap.mcssdk.b
    public void resumePush(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(12300, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "please call the register first!");
        }
    }

    public void setAppKeySecret(String str, String str2) {
        this.mAuthCode = str;
        this.mVerifyCode = str2;
    }

    @Override // com.heytap.mcssdk.b
    public void setNotificationType(int i) {
        setNotificationType(i, null);
    }

    @Override // com.heytap.mcssdk.b
    public void setNotificationType(int i, JSONObject jSONObject) {
        if (!checkAll()) {
            com.heytap.mcssdk.utils.e.e("mcssdk---", "please call the register first!");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("");
        startMcsService(12307, C2188811AlT.LIZIZ(sbLIZ), jSONObject);
    }

    public void setPushCallback(ICallBackResultService iCallBackResultService) {
        this.mICallBackResultService = iCallBackResultService;
    }

    @Override // com.heytap.mcssdk.b
    public void setPushTime(List<Integer> list, int i, int i2, int i3, int i4) {
        setPushTime(list, i, i2, i3, i4, null);
    }

    @Override // com.heytap.mcssdk.b
    public void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) {
        if (!checkAll()) {
            if (getPushCallback() != null) {
                getPushCallback().onSetPushTime(-2, "please call the register first!");
                return;
            }
            return;
        }
        if (list == null || list.size() <= 0 || i < 0 || i2 < 0 || i3 < i || i3 > 23 || i4 < i2 || i4 > 59) {
            throw new IllegalArgumentException("params are not all right,please check params");
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("weekDays", com.heytap.mcssdk.b.b.a(list));
            jSONObject2.put("startHour", i);
            jSONObject2.put("startMin", i2);
            jSONObject2.put("endHour", i3);
            jSONObject2.put("endMin", i4);
            startMcsService(12298, C786410Ut5.J3(jSONObject2), jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            com.heytap.mcssdk.utils.e.e("mcssdk---", e.getLocalizedMessage());
        }
    }

    @Override // com.heytap.mcssdk.b
    public void setRegisterID(String str) {
        this.mRegisterID = str;
    }

    @Override // com.heytap.mcssdk.b
    public void subscribeServiceChannel(Context context, String str, IServiceChannelCallback iServiceChannelCallback) {
        if (context == null) {
            if (iServiceChannelCallback != null) {
                iServiceChannelCallback.onResult(-2, "context is null");
                return;
            }
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            if (iServiceChannelCallback != null) {
                iServiceChannelCallback.onResult(41, "channelId is empty");
                return;
            }
            return;
        }
        if (this.mContext == null) {
            this.mContext = C786410Ut5.N3(context);
        }
        if (!checkCommandLimit(12329)) {
            com.heytap.mcssdk.a.b.a(this.mContext, getIntent(12329, "", null), str, iServiceChannelCallback);
        } else if (iServiceChannelCallback != null) {
            iServiceChannelCallback.onResult(40001, "api call too frequently");
        }
    }

    @Override // com.heytap.mcssdk.b
    public void unRegister() {
        unRegister(null);
    }

    public void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        this.mAuthCode = str;
        this.mVerifyCode = str2;
        this.mContext = C786410Ut5.N3(context);
        this.mICallBackResultService = iCallBackResultService;
        unRegister(jSONObject);
    }

    @Override // com.heytap.mcssdk.b
    public void unRegister(JSONObject jSONObject) {
        if (checkContext()) {
            startMcsService(12290, jSONObject);
        } else if (getPushCallback() != null) {
            getPushCallback().onUnRegister(-2, this.mContext.getPackageName(), getMiniProgramPkgFromJSON(jSONObject));
        }
    }

    public void unRegisterLiquidChangeSettingObserver(Context context) {
        com.heytap.mcssdk.liquid.b.a().a(context);
    }

    @Override // com.heytap.mcssdk.b
    public void unsubscribeServiceChannel(Context context, String str, IServiceChannelCallback iServiceChannelCallback) {
        if (context == null) {
            if (iServiceChannelCallback != null) {
                iServiceChannelCallback.onResult(-2, "context is null");
                return;
            }
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            if (iServiceChannelCallback != null) {
                iServiceChannelCallback.onResult(41, "channelId is empty");
                return;
            }
            return;
        }
        if (this.mContext == null) {
            this.mContext = C786410Ut5.N3(context);
        }
        if (!checkCommandLimit(12330)) {
            com.heytap.mcssdk.a.b.b(this.mContext, getIntent(12330, "", null), str, iServiceChannelCallback);
        } else if (iServiceChannelCallback != null) {
            iServiceChannelCallback.onResult(40001, "api call too frequently");
        }
    }

    public static void INVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResult(Activity activity, Intent intent, int i) throws Throwable {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(i, activity, intent, new C0WZX("dzBzEgo/Rt7dRRksRgGXYn8ThtKztonqgudFVo4=", null));
    }

    public static void INVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_bytedance_router_monitor_page_PageLancet_startActivityForResult(Activity activity, Intent intent, int i) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        INVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResult(activity, intent, i);
    }

    public static int INVOKEVIRTUAL_com_heytap_mcssdk_PushService_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageUid(PackageManager packageManager, String str, int i) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (C786420Ut6.LJIIIZ && TextUtils.equals(str, contextLIZ.getPackageName())) {
            if (i != 0) {
                if (i != 8) {
                    if (i != 64) {
                        if (i != 128) {
                            return packageManager.getPackageUid(str, i);
                        }
                        if (C786420Ut6.LJIILIIL == 0) {
                            C786420Ut6.LJIILIIL = packageManager.getPackageUid(str, i);
                        }
                        return C786420Ut6.LJIILIIL;
                    }
                    if (C786420Ut6.LJIILL == 0) {
                        C786420Ut6.LJIILL = packageManager.getPackageUid(str, i);
                    }
                    return C786420Ut6.LJIILL;
                }
                if (C786420Ut6.LJIILLIIL == 0) {
                    C786420Ut6.LJIILLIIL = packageManager.getPackageUid(str, i);
                }
                return C786420Ut6.LJIILLIIL;
            }
            if (C786420Ut6.LJIILJJIL == 0) {
                C786420Ut6.LJIILJJIL = packageManager.getPackageUid(str, i);
            }
            return C786420Ut6.LJIILJJIL;
        }
        return packageManager.getPackageUid(str, i);
    }
}
