package com.heytap.mcssdk.liquid;

import X.AbstractBinderC813290VvL;
import X.AbstractBinderC813330VvP;
import X.AbstractBinderC814350Vx3;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC813270VvJ;
import X.InterfaceC814360Vx4;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcs.liquid.model.ActionInfo;
import com.heytap.mcs.liquid.model.ActionResult;
import com.heytap.mcs.liquid.model.SeedingRequest;
import com.heytap.mcs.liquid.model.SeedingRequestResult;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.callback.ILiquidDownloadCallback;
import com.heytap.msp.push.callback.ILiquidTaskQueryCallback;
import com.heytap.msp.push.callback.IPackageAuthCallbackListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static final String a = "b";
    public static volatile Boolean e = null;
    public static final AtomicReference<com.heytap.mcssdk.liquid.a> g = new AtomicReference<>();
    public static final AtomicReference<com.heytap.mcssdk.liquid.a> h = new AtomicReference<>();
    public volatile LiquidSettingChangeObserver c;
    public final AtomicReference<InterfaceC813270VvJ> b = new AtomicReference<>();
    public final LinkedBlockingDeque<com.heytap.mcssdk.liquid.a> f = new LinkedBlockingDeque<>();

    public static class a {
        public static b a = new b();
    }

    private InterfaceC814360Vx4 a(final ILiquidDownloadCallback iLiquidDownloadCallback) {
        return new AbstractBinderC814350Vx3() { // from class: com.heytap.mcssdk.liquid.b.3
            @Override // X.InterfaceC814360Vx4
            public void onClick(String str, int i) {
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onClick -- traceId");
                    sbLIZ.append(str);
                    sbLIZ.append(" type:");
                    sbLIZ.append(i);
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                if (iLiquidDownloadCallback2 != null) {
                    iLiquidDownloadCallback2.onClick(str, i);
                }
            }

            @Override // X.InterfaceC814360Vx4
            public void onDismiss(String str) {
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onDismiss -- traceId");
                    sbLIZ.append(str);
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                if (iLiquidDownloadCallback2 != null) {
                    iLiquidDownloadCallback2.onDismiss(str);
                }
            }

            @Override // X.InterfaceC814360Vx4
            public void onFailed(String str, int i, int i2) {
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onFailed -- traceId");
                    sbLIZ.append(str);
                    sbLIZ.append(" type:");
                    sbLIZ.append(i2);
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                if (iLiquidDownloadCallback2 != null) {
                    iLiquidDownloadCallback2.onFailed(str, i, i2);
                }
            }

            @Override // X.InterfaceC814360Vx4
            public ActionResult onPauseClick(String str) {
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPauseClick -- traceId");
                    sbLIZ.append(str);
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                return iLiquidDownloadCallback2 != null ? iLiquidDownloadCallback2.onPauseClick(str) : new ActionResult(0);
            }

            @Override // X.InterfaceC814360Vx4
            public ActionResult onResumeClick(String str) {
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onResumeClick -- traceId");
                    sbLIZ.append(str);
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                return iLiquidDownloadCallback2 != null ? iLiquidDownloadCallback2.onResumeClick(str) : new ActionResult(0);
            }

            @Override // X.InterfaceC814360Vx4
            public void onShow(String str, int i) {
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onShow -- traceId");
                    sbLIZ.append(str);
                    sbLIZ.append(" type:");
                    sbLIZ.append(i);
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                if (iLiquidDownloadCallback2 != null) {
                    iLiquidDownloadCallback2.onShow(str, i);
                }
            }
        };
    }

    public static b a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<SeedingRequestResult> list, Map<String, DownloadRequest> map) {
        e.b(a, "onFailedCallback - recv batch results .");
        if (list == null || list.isEmpty()) {
            return;
        }
        for (SeedingRequestResult seedingRequestResult : list) {
            DownloadRequest downloadRequest = map.get(seedingRequestResult.requestId);
            if (downloadRequest != null && downloadRequest.getCallback() != null) {
                String str = a;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailedCallback - recv  fail: request trace-id:");
                sbLIZ.append(downloadRequest.getTraceId());
                sbLIZ.append(" downloadResult trace-id:");
                sbLIZ.append(seedingRequestResult.traceId);
                e.b(str, C2188811AlT.LIZIZ(sbLIZ));
                downloadRequest.getCallback().onFailed(seedingRequestResult.traceId, seedingRequestResult.verifyStatus, seedingRequestResult.currentStatus);
            }
        }
        map.clear();
    }

    private boolean c() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            return ((Boolean) cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.software.support_fluid_entry")).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (e.g()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkFluidFeature() error .");
                sbLIZ.append(th.getMessage());
                e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        try {
            InterfaceC813270VvJ interfaceC813270VvJ = this.b.get();
            com.heytap.mcssdk.liquid.a andSet = g.getAndSet(null);
            if (andSet != null) {
                ILiquidTaskQueryCallback iLiquidTaskQueryCallbackC = andSet.c();
                List<String> listA = interfaceC813270VvJ.a(context.getPackageName());
                if (iLiquidTaskQueryCallbackC != null) {
                    iLiquidTaskQueryCallbackC.onSuccess(listA);
                }
            }
            if (e.g()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dealCachedMessageProcessTask  cacheClassifyModel:");
                sbLIZ.append(this.f);
                e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.f.size() == 0) {
                return;
            }
            while (true) {
                com.heytap.mcssdk.liquid.a aVarPollFirst = this.f.pollFirst();
                if (aVarPollFirst == null) {
                    return;
                }
                int iA = aVarPollFirst.a();
                if (e.g()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("dealCachedMessageProcessTask() apiType .");
                    sbLIZ2.append(iA);
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (iA == 1) {
                    DownloadRequest downloadRequestB = aVarPollFirst.b();
                    if (downloadRequestB != null && interfaceC813270VvJ != null) {
                        interfaceC813270VvJ.LLLLLLZZ(context.getPackageName(), downloadRequestB.getLoadingType(), downloadRequestB.getPkgName(), downloadRequestB.getTraceId(), downloadRequestB.getToken(), downloadRequestB.getStatus(), downloadRequestB.getDesc(), downloadRequestB.getAction(), downloadRequestB.getManagerAction(), downloadRequestB.getPercent(), a(downloadRequestB.getCallback()));
                    }
                } else if (iA == 3) {
                    a(context, interfaceC813270VvJ, aVarPollFirst.d());
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (e.g()) {
                e.b("mcssdk---", "exception happened in deal cached classify task .");
            }
        }
    }

    public void a(int i, List<DownloadRequest> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (DownloadRequest downloadRequest : list) {
            if (downloadRequest.getCallback() != null) {
                downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), i, downloadRequest.getStatus());
            }
        }
    }

    public void a(Context context) {
        if (this.c != null) {
            C786410Ut5.LJJIFFI(context, this.c);
        }
    }

    public synchronized void a(Context context, OnLiquidSettingChangeListener onLiquidSettingChangeListener) {
        if (this.c == null) {
            this.c = new LiquidSettingChangeObserver(context, onLiquidSettingChangeListener);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.heytap.mcs.liquid.third.switch_change_kk");
            if (Build.VERSION.SDK_INT >= 33) {
                C786410Ut5.LJIJJLI(context, this.c, intentFilter, 2);
            } else {
                C786410Ut5.LJIJJ(context, this.c, intentFilter);
            }
        }
    }

    public synchronized void a(Context context, List<DownloadRequest> list) {
        InterfaceC813270VvJ interfaceC813270VvJ = this.b.get();
        if (interfaceC813270VvJ == null) {
            com.heytap.mcssdk.liquid.a aVar = new com.heytap.mcssdk.liquid.a(3, list);
            this.f.add(aVar);
            boolean zC = c(context);
            if (e.g()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestDownloadSeedingList  bindResult:");
                sbLIZ.append(zC);
                sbLIZ.append("cacheClassifyModel:");
                sbLIZ.append(this.f);
                e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!zC) {
                a(10002, list);
                if (!this.f.remove(aVar) && e.g()) {
                    e.b("mcssdk---", "requestDownloadSeedingList cacheClassifyModel remove failed ");
                }
            }
        } else {
            if (e.g()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("requestDownloadSeedingList mLiquidApiService = ");
                sbLIZ2.append(interfaceC813270VvJ);
                sbLIZ2.append(" requestList = ");
                sbLIZ2.append(list);
                e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ2));
            }
            a(context, interfaceC813270VvJ, list);
        }
    }

    public boolean b() {
        if (e == null) {
            synchronized (this) {
                try {
                    if (e == null) {
                        e = Boolean.valueOf(c());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSupportFluidDevice() isFluidDevice:");
        sbLIZ.append(e);
        e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
        return e.booleanValue();
    }

    private boolean b(Context context) {
        try {
            String mcsPackageName = PushService.a.a.getMcsPackageName(context);
            if (mcsPackageName == null) {
                return false;
            }
            int versionCode = Utils.getVersionCode(context, mcsPackageName);
            if (e.g()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkMcsVersionNotSupportAuth() mcsVersionCode: ");
                sbLIZ.append(versionCode);
                e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (versionCode <= 52807) {
                if (b()) {
                    return true;
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (e.g()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("checkMcsVersionNotSupportAuth() error: ");
                sbLIZ2.append(e2.getMessage());
                e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return false;
    }

    private boolean c(final Context context) {
        Intent intent = new Intent();
        intent.setAction("com.mcs.action.LIQUID_SERVICE");
        intent.setPackage(PushService.a.a.getMcsPackageName(context));
        return C2204961BRm.LJJJJ(context, intent, new ServiceConnection() { // from class: com.heytap.mcssdk.liquid.b.2
            @Override // android.content.ServiceConnection
            public void onBindingDied(ComponentName componentName) {
                b.this.b.set(null);
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bindLiquidApiService onBindingDied ");
                    sbLIZ.append(componentName);
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(ComponentName componentName) {
                b.this.b.set(null);
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bindLiquidApiService onNullBinding ");
                    sbLIZ.append(componentName);
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b.this.b.set(null);
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bindLiquidApiService onServiceDisconnected ");
                    sbLIZ.append(componentName);
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, final IBinder iBinder) throws Throwable {
                InterfaceC813270VvJ interfaceC813270VvJ = null;
                C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/heytap/mcssdk/liquid/b$2", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgo/Rt7dRRksRgGXYn8Tus6xq7Pr3vM=", null)));
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
                if (iBinder != null) {
                    try {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.mcs.liquid.service.download.ILiquidApiService");
                        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC813270VvJ)) {
                            interfaceC813270VvJ = (InterfaceC813270VvJ) iInterfaceQueryLocalInterface;
                        } else {
                            interfaceC813270VvJ = new InterfaceC813270VvJ(iBinder) { // from class: X.0VvK
                                public final IBinder LL;

                                {
                                    this.LL = iBinder;
                                }

                                @Override // X.InterfaceC813270VvJ
                                public final void LLJL(String str, AbstractBinderC813330VvP abstractBinderC813330VvP) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.heytap.mcs.liquid.service.download.ILiquidApiService");
                                        parcelObtain.writeString(str);
                                        abstractBinderC813330VvP.asBinder();
                                        parcelObtain.writeStrongBinder(abstractBinderC813330VvP);
                                        this.LL.transact(4, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC813270VvJ
                                public final void LLLLLLZZ(String str, int i, String str2, String str3, String str4, int i2, String str5, ActionInfo actionInfo, ActionInfo actionInfo2, int i3, InterfaceC814360Vx4 interfaceC814360Vx4) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.heytap.mcs.liquid.service.download.ILiquidApiService");
                                        parcelObtain.writeString(str);
                                        parcelObtain.writeInt(i);
                                        parcelObtain.writeString(str2);
                                        parcelObtain.writeString(str3);
                                        parcelObtain.writeString(str4);
                                        parcelObtain.writeInt(i2);
                                        parcelObtain.writeString(str5);
                                        if (actionInfo != null) {
                                            parcelObtain.writeInt(1);
                                            actionInfo.writeToParcel(parcelObtain, 0);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        if (actionInfo2 != null) {
                                            parcelObtain.writeInt(1);
                                            actionInfo2.writeToParcel(parcelObtain, 0);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        parcelObtain.writeInt(i3);
                                        parcelObtain.writeStrongBinder(interfaceC814360Vx4 != null ? interfaceC814360Vx4.asBinder() : null);
                                        this.LL.transact(1, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC813270VvJ
                                public final void LLLLZIL(List<SeedingRequest> list, InterfaceC813300VvM interfaceC813300VvM) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.heytap.mcs.liquid.service.download.ILiquidApiService");
                                        parcelObtain.writeTypedList(list);
                                        parcelObtain.writeStrongBinder(interfaceC813300VvM.asBinder());
                                        this.LL.transact(2, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC813270VvJ
                                public final List<String> a(String str) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.heytap.mcs.liquid.service.download.ILiquidApiService");
                                        parcelObtain.writeString(str);
                                        this.LL.transact(3, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        ArrayList<String> arrayListCreateStringArrayList = parcelObtain2.createStringArrayList();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return arrayListCreateStringArrayList;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // android.os.IInterface
                                public final IBinder asBinder() {
                                    return this.LL;
                                }
                            };
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (e.g()) {
                            e.b("mcssdk---", "bindLiquidApiService() error :" + e2.getMessage());
                            return;
                        }
                        return;
                    }
                }
                b.this.b.set(interfaceC813270VvJ);
                b.this.a(interfaceC813270VvJ, context);
                b.this.d(context);
            }
        }, 1, new C0WZX("dzBzEgo/Rt7dRRksRgGXYn8Tus6xq7Pr3vM=", null));
    }

    public synchronized void a(Context context, DownloadRequest downloadRequest) {
        InterfaceC813270VvJ interfaceC813270VvJ = this.b.get();
        if (interfaceC813270VvJ == null) {
            com.heytap.mcssdk.liquid.a aVar = new com.heytap.mcssdk.liquid.a(1, downloadRequest);
            this.f.add(aVar);
            if (!c(context)) {
                if (downloadRequest.getCallback() != null) {
                    downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), 10002, downloadRequest.getStatus());
                }
                if (!this.f.remove(aVar) && e.g()) {
                    e.b("mcssdk---", "requestDownloadSeeding cacheClassifyModel remove failed ");
                }
            }
        } else {
            if (e.g()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestDownloadSeeding mLiquidApiService = ");
                sbLIZ.append(interfaceC813270VvJ);
                sbLIZ.append(" request = ");
                sbLIZ.append(downloadRequest);
                e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
            }
            try {
                interfaceC813270VvJ.LLLLLLZZ(context.getPackageName(), downloadRequest.getLoadingType(), downloadRequest.getPkgName(), downloadRequest.getTraceId(), downloadRequest.getToken(), downloadRequest.getStatus(), downloadRequest.getDesc(), downloadRequest.getAction(), downloadRequest.getManagerAction(), downloadRequest.getPercent(), a(downloadRequest.getCallback()));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (downloadRequest.getCallback() != null) {
                    downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), 10002, downloadRequest.getStatus());
                }
                if (e.g()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("requestDownloadSeeding() has happened error in start process download .");
                    sbLIZ2.append(e2.getMessage());
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(InterfaceC813270VvJ interfaceC813270VvJ, Context context) {
        com.heytap.mcssdk.liquid.a andSet = h.getAndSet(null);
        if (andSet != null && interfaceC813270VvJ != null) {
            String strE = andSet.e();
            final IPackageAuthCallbackListener iPackageAuthCallbackListenerF = andSet.f();
            if (strE != null && !strE.isEmpty()) {
                if (context != null && b(context)) {
                    if (e.g()) {
                        e.b("mcssdk---", "dealAuthStatusQuery() MCS version <= 52807, return status 4");
                    }
                    if (iPackageAuthCallbackListenerF != null) {
                        iPackageAuthCallbackListenerF.onAuthResult(4);
                        return;
                    }
                    return;
                }
                try {
                    interfaceC813270VvJ.LLJL(strE, new AbstractBinderC813330VvP() { // from class: com.heytap.mcssdk.liquid.b.4
                        @Override // X.InterfaceC813350VvR
                        public void onAuthResult(int i) {
                            if (e.g()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("queryPackageAuthDetail() onAuthResult status: ");
                                sbLIZ.append(i);
                                e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                            }
                            IPackageAuthCallbackListener iPackageAuthCallbackListener = iPackageAuthCallbackListenerF;
                            if (iPackageAuthCallbackListener != null) {
                                iPackageAuthCallbackListener.onAuthResult(i);
                            }
                        }
                    });
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    if (e.g()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("queryPackageAuthDetail() has happened error in dealCachedMessageProcessTask: ");
                        sbLIZ.append(e2.getMessage());
                        e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        }
    }

    public synchronized void a(Context context, ILiquidTaskQueryCallback iLiquidTaskQueryCallback) {
        InterfaceC813270VvJ interfaceC813270VvJ = this.b.get();
        if (interfaceC813270VvJ == null) {
            AtomicReference<com.heytap.mcssdk.liquid.a> atomicReference = g;
            atomicReference.set(new com.heytap.mcssdk.liquid.a(2, iLiquidTaskQueryCallback));
            if (!c(context)) {
                if (iLiquidTaskQueryCallback != null) {
                    iLiquidTaskQueryCallback.onFailure(10002);
                }
                atomicReference.set(null);
            }
        } else {
            try {
                List<String> listA = interfaceC813270VvJ.a(context.getPackageName());
                if (iLiquidTaskQueryCallback != null) {
                    iLiquidTaskQueryCallback.onSuccess(listA);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestDownloadSeeding() has happened error in start process download .");
                    sbLIZ.append(e2.getMessage());
                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    private void a(Context context, InterfaceC813270VvJ interfaceC813270VvJ, List<DownloadRequest> list) {
        try {
            ArrayList arrayList = new ArrayList();
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (DownloadRequest downloadRequest : list) {
                String string = UUID.randomUUID().toString();
                arrayList.add(new SeedingRequest(string, context.getPackageName(), downloadRequest.getLoadingType(), downloadRequest.getPkgName(), downloadRequest.getTraceId(), downloadRequest.getToken(), downloadRequest.getStatus(), downloadRequest.getDesc(), downloadRequest.getAction(), downloadRequest.getManagerAction(), downloadRequest.getPercent(), a(downloadRequest.getCallback())));
                concurrentHashMap.put(string, downloadRequest);
            }
            if (!arrayList.isEmpty()) {
                interfaceC813270VvJ.LLLLZIL(arrayList, new AbstractBinderC813290VvL() { // from class: com.heytap.mcssdk.liquid.b.5
                    @Override // X.InterfaceC813300VvM
                    public void onFailed(List<SeedingRequestResult> list2) {
                        b.this.a(list2, (Map<String, DownloadRequest>) concurrentHashMap);
                    }
                });
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (e.g()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestDownloadSeedingBatch() has happened error in start process download .");
                sbLIZ.append(e2.getMessage());
                e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
            }
            a(10002, list);
        }
    }

    public synchronized void a(Context context, String str, final IPackageAuthCallbackListener iPackageAuthCallbackListener) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (b(context)) {
                    if (e.g()) {
                        e.b("mcssdk---", "queryPackageAuthDetail() MCS version <= 52807, return status 4");
                    }
                    if (iPackageAuthCallbackListener != null) {
                        iPackageAuthCallbackListener.onAuthResult(4);
                    }
                    return;
                }
                InterfaceC813270VvJ interfaceC813270VvJ = this.b.get();
                if (interfaceC813270VvJ == null) {
                    AtomicReference<com.heytap.mcssdk.liquid.a> atomicReference = h;
                    atomicReference.set(new com.heytap.mcssdk.liquid.a(4, str, iPackageAuthCallbackListener));
                    if (!c(context)) {
                        if (e.g()) {
                            e.b("mcssdk---", "queryPackageAuthDetail() bind service failed");
                        }
                        atomicReference.set(null);
                    }
                } else {
                    try {
                        interfaceC813270VvJ.LLJL(str, new AbstractBinderC813330VvP() { // from class: com.heytap.mcssdk.liquid.b.1
                            @Override // X.InterfaceC813350VvR
                            public void onAuthResult(int i) {
                                if (e.g()) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("queryPackageAuthDetail() onAuthResult status: ");
                                    sbLIZ.append(i);
                                    e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                                }
                                IPackageAuthCallbackListener iPackageAuthCallbackListener2 = iPackageAuthCallbackListener;
                                if (iPackageAuthCallbackListener2 != null) {
                                    iPackageAuthCallbackListener2.onAuthResult(i);
                                }
                            }
                        });
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (e.g()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("queryPackageAuthDetail() has happened error: ");
                            sbLIZ.append(e2.getMessage());
                            e.b("mcssdk---", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
                return;
            }
        }
        if (e.g()) {
            e.b("mcssdk---", "queryPackageAuthDetail() packageName is null or empty");
        }
    }
}
