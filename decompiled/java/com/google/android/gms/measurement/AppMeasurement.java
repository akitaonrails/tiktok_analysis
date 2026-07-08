package com.google.android.gms.measurement;

import X.AbstractC19816112g3;
import X.C09FV;
import X.C0W3J;
import X.C19804712eD;
import X.C786410Ut5;
import X.InterfaceC19816012g2;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzno;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes31.dex */
public class AppMeasurement {
    public static volatile AppMeasurement LIZIZ;
    public final AbstractC19816112g3 LIZ;

    public long generateEventId() {
        return this.LIZ.zza();
    }

    public String getAppInstanceId() {
        return this.LIZ.LJFF();
    }

    public String getCurrentScreenClass() {
        return this.LIZ.LIZJ();
    }

    public String getCurrentScreenName() {
        return this.LIZ.LJI();
    }

    public String getGmpAppId() {
        return this.LIZ.LJIIJJI();
    }

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            C0W3J.LJIIIIZZ(bundle);
            this.mAppId = (String) C09FV.LIZ(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C09FV.LIZ(bundle, "origin", String.class, null);
            this.mName = (String) C09FV.LIZ(bundle, "name", String.class, null);
            this.mValue = C09FV.LIZ(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C09FV.LIZ(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C09FV.LIZ(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C09FV.LIZ(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C09FV.LIZ(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C09FV.LIZ(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C09FV.LIZ(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C09FV.LIZ(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C09FV.LIZ(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C09FV.LIZ(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C09FV.LIZ(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C09FV.LIZ(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C09FV.LIZ(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(final C19804712eD c19804712eD) {
        this.LIZ = new AbstractC19816112g3(c19804712eD) { // from class: X.12eI
            public final C19804712eD LIZ;
            public final C19804412eA LIZIZ;

            @Override // X.InterfaceC19816012g2
            public final String LIZJ() {
                C19804712eD c19804712eD2 = this.LIZIZ.LIZ;
                C19804712eD.LIZJ(c19804712eD2.LJIILJJIL);
                C19811512fJ c19811512fJ = c19804712eD2.LJIILJJIL.LIZJ;
                if (c19811512fJ != null) {
                    return c19811512fJ.LIZIZ;
                }
                return null;
            }

            @Override // X.InterfaceC19816012g2
            public final String LJFF() {
                return this.LIZIZ.LJI.get();
            }

            @Override // X.InterfaceC19816012g2
            public final String LJI() {
                C19804712eD c19804712eD2 = this.LIZIZ.LIZ;
                C19804712eD.LIZJ(c19804712eD2.LJIILJJIL);
                C19811512fJ c19811512fJ = c19804712eD2.LJIILJJIL.LIZJ;
                if (c19811512fJ != null) {
                    return c19811512fJ.LIZ;
                }
                return null;
            }

            @Override // X.InterfaceC19816012g2
            public final String LJIIJJI() {
                return this.LIZIZ.LJI.get();
            }

            @Override // X.InterfaceC19816012g2
            public final long zza() {
                return this.LIZ.LJIILLIIL().LJL();
            }

            {
                C0W3J.LJIIIIZZ(c19804712eD);
                this.LIZ = c19804712eD;
                this.LIZIZ = c19804712eD.LJIILIIL();
            }

            @Override // X.InterfaceC19816012g2
            public final void LIZIZ(String str) {
                C19806012eQ c19806012eQLJIIIIZZ = this.LIZ.LJIIIIZZ();
                this.LIZ.LJIILIIL.getClass();
                c19806012eQLJIIIIZZ.LJIILIIL(SystemClock.elapsedRealtime(), str);
            }

            @Override // X.InterfaceC19816012g2
            public final int LJIIIIZZ(String str) {
                C0W3J.LJI(str);
                return 25;
            }

            @Override // X.InterfaceC19816012g2
            public final void LJIIIZ(String str) {
                C19806012eQ c19806012eQLJIIIIZZ = this.LIZ.LJIIIIZZ();
                this.LIZ.LJIILIIL.getClass();
                c19806012eQLJIIIIZZ.LJIJI(SystemClock.elapsedRealtime(), str);
            }

            @Override // X.InterfaceC19816012g2
            public final void LJJ(Bundle bundle) {
                C19804412eA c19804412eA = this.LIZIZ;
                c19804412eA.LIZ.LJIILIIL.getClass();
                c19804412eA.LJJJ(System.currentTimeMillis(), bundle);
            }

            @Override // X.InterfaceC19816012g2
            public final List<Bundle> LJIJ(final String str, final String str2) {
                final C19804412eA c19804412eA = this.LIZIZ;
                if (c19804412eA.LJIIL().LJIIZILJ()) {
                    c19804412eA.LJIILJJIL().LJFF.LIZJ("Cannot get conditional user properties from analytics worker thread");
                    return new ArrayList(0);
                }
                if (C19812512fT.LIZ()) {
                    c19804412eA.LJIILJJIL().LJFF.LIZJ("Cannot get conditional user properties from main thread");
                    return new ArrayList(0);
                }
                final AtomicReference atomicReference = new AtomicReference();
                c19804412eA.LIZ.LJIIL().LJIIIIZZ(atomicReference, Mp4ScreenVideoLoadTimeout.CONTROL, "get conditional user properties", new Runnable() { // from class: X.12dt
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzjz@3951.run");
                        try {
                            final C19804512eB c19804512eBLJIILL = c19804412eA.LIZ.LJIILL();
                            final AtomicReference atomicReference2 = atomicReference;
                            final String str3 = str;
                            final String str4 = str2;
                            c19804512eBLJIILL.LJ();
                            c19804512eBLJIILL.LJIIJJI();
                            final zzn zznVarLJJIIZ = c19804512eBLJIILL.LJJIIZ(false);
                            c19804512eBLJIILL.LJIIZILJ(new Runnable() { // from class: X.12dp
                                public final /* synthetic */ String LLILLJJLI = null;

                                public final void LIZ() {
                                    C19804512eB c19804512eB;
                                    InterfaceC19802012dm interfaceC19802012dm;
                                    synchronized (atomicReference2) {
                                        try {
                                            try {
                                                try {
                                                    c19804512eB = c19804512eBLJIILL;
                                                    interfaceC19802012dm = c19804512eB.LIZLLL;
                                                } catch (RemoteException e) {
                                                    TryCatchGuardChecker.doCheck(e);
                                                    c19804512eBLJIILL.LJIILJJIL().LJFF.LIZLLL("(legacy) Failed to get conditional properties; remote exception", C19806212eS.LJIIJ(this.LLILLJJLI), str3, e);
                                                    atomicReference2.set(Collections.emptyList());
                                                    atomicReference2.notify();
                                                }
                                                if (interfaceC19802012dm == null) {
                                                    c19804512eB.LJIILJJIL().LJFF.LIZLLL("(legacy) Failed to get conditional properties; not connected to service", C19806212eS.LJIIJ(this.LLILLJJLI), str3, str4);
                                                    atomicReference2.set(Collections.emptyList());
                                                    atomicReference2.notify();
                                                } else {
                                                    if (TextUtils.isEmpty(this.LLILLJJLI)) {
                                                        C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                                                        atomicReference2.set(interfaceC19802012dm.LLJLILLLLZIIL(str3, str4, zznVarLJJIIZ));
                                                    } else {
                                                        atomicReference2.set(interfaceC19802012dm.g0(this.LLILLJJLI, str3, str4));
                                                    }
                                                    c19804512eBLJIILL.LJJIIJZLJL();
                                                    atomicReference2.notify();
                                                }
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            atomicReference2.notify();
                                            throw th2;
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ2;
                                    C1C7U.LIZ("zzlv@398b.run");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ2) {
                                        }
                                    }
                                    C1C7U.LIZIZ("zzlv@398b.run");
                                }
                            });
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzjz@3951.run");
                    }
                });
                List list = (List) atomicReference.get();
                if (list == null) {
                    c19804412eA.LJIILJJIL().LJFF.LIZ(null, "Timed out waiting for get conditional user properties");
                    return new ArrayList();
                }
                return C19803112dx.LJJJZ(list);
            }

            @Override // X.InterfaceC19816012g2
            public final void LIZ(String str, String str2, Bundle bundle) {
                this.LIZ.LJIILIIL().LJJ(str, str2, bundle);
            }

            @Override // X.InterfaceC19816012g2
            public final void LIZLLL(String str, String str2, Bundle bundle) {
                C19804412eA c19804412eA = this.LIZIZ;
                c19804412eA.LIZ.LJIILIIL.getClass();
                c19804412eA.LJJI(str, str2, bundle, true, true, System.currentTimeMillis());
            }

            @Override // X.InterfaceC19816012g2
            public final Map<String, Object> LJ(final String str, final String str2, final boolean z) {
                final C19804412eA c19804412eA = this.LIZIZ;
                if (c19804412eA.LJIIL().LJIIZILJ()) {
                    c19804412eA.LJIILJJIL().LJFF.LIZJ("Cannot get user properties from analytics worker thread");
                    return Collections.emptyMap();
                }
                if (C19812512fT.LIZ()) {
                    c19804412eA.LJIILJJIL().LJFF.LIZJ("Cannot get user properties from main thread");
                    return Collections.emptyMap();
                }
                final AtomicReference atomicReference = new AtomicReference();
                c19804412eA.LIZ.LJIIL().LJIIIIZZ(atomicReference, Mp4ScreenVideoLoadTimeout.CONTROL, "get user properties", new Runnable() { // from class: X.12ds
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzjy@3950.run");
                        try {
                            final C19804512eB c19804512eBLJIILL = c19804412eA.LIZ.LJIILL();
                            final AtomicReference atomicReference2 = atomicReference;
                            final String str3 = str;
                            final String str4 = str2;
                            final boolean z2 = z;
                            c19804512eBLJIILL.LJ();
                            c19804512eBLJIILL.LJIIJJI();
                            final zzn zznVarLJJIIZ = c19804512eBLJIILL.LJJIIZ(false);
                            c19804512eBLJIILL.LJIIZILJ(new Runnable() { // from class: X.12dq
                                public final /* synthetic */ String LLILLJJLI = null;

                                public final void LIZ() {
                                    C19804512eB c19804512eB;
                                    InterfaceC19802012dm interfaceC19802012dm;
                                    synchronized (atomicReference2) {
                                        try {
                                            try {
                                                try {
                                                    c19804512eB = c19804512eBLJIILL;
                                                    interfaceC19802012dm = c19804512eB.LIZLLL;
                                                } catch (RemoteException e) {
                                                    TryCatchGuardChecker.doCheck(e);
                                                    c19804512eBLJIILL.LJIILJJIL().LJFF.LIZLLL("(legacy) Failed to get user properties; remote exception", C19806212eS.LJIIJ(this.LLILLJJLI), str3, e);
                                                    atomicReference2.set(Collections.emptyList());
                                                    atomicReference2.notify();
                                                }
                                                if (interfaceC19802012dm == null) {
                                                    c19804512eB.LJIILJJIL().LJFF.LIZLLL("(legacy) Failed to get user properties; not connected to service", C19806212eS.LJIIJ(this.LLILLJJLI), str3, str4);
                                                    atomicReference2.set(Collections.emptyList());
                                                    atomicReference2.notify();
                                                } else {
                                                    if (TextUtils.isEmpty(this.LLILLJJLI)) {
                                                        C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                                                        atomicReference2.set(interfaceC19802012dm.LLLLLLLLLL(str3, str4, z2, zznVarLJJIIZ));
                                                    } else {
                                                        atomicReference2.set(interfaceC19802012dm.LLLZ(this.LLILLJJLI, str3, str4, z2));
                                                    }
                                                    c19804512eBLJIILL.LJJIIJZLJL();
                                                    atomicReference2.notify();
                                                }
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                atomicReference2.notify();
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            throw th2;
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ2;
                                    C1C7U.LIZ("zzlx@398d.run");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ2) {
                                        }
                                    }
                                    C1C7U.LIZIZ("zzlx@398d.run");
                                }
                            });
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzjy@3950.run");
                    }
                });
                List<zzno> list = (List) atomicReference.get();
                if (list == null) {
                    c19804412eA.LJIILJJIL().LJFF.LIZ(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
                    return Collections.emptyMap();
                }
                C830490Whz c830490Whz = new C830490Whz(list.size());
                for (zzno zznoVar : list) {
                    Object objZza = zznoVar.zza();
                    if (objZza != null) {
                        c830490Whz.put(zznoVar.zza, objZza);
                    }
                }
                return c830490Whz;
            }
        };
    }

    public static InterfaceC19816012g2 LIZ(Context context) {
        try {
            try {
                return (InterfaceC19816012g2) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static AppMeasurement getInstance(Context context) {
        if (LIZIZ == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (LIZIZ == null) {
                        InterfaceC19816012g2 interfaceC19816012g2LIZ = LIZ(context);
                        if (interfaceC19816012g2LIZ != null) {
                            LIZIZ = new AppMeasurement(interfaceC19816012g2LIZ);
                        } else {
                            LIZIZ = new AppMeasurement(C19804712eD.LIZIZ(context, new zzdl(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public void beginAdUnitExposure(String str) {
        this.LIZ.LIZIZ(str);
    }

    public void endAdUnitExposure(String str) {
        this.LIZ.LJIIIZ(str);
    }

    public int getMaxUserProperties(String str) {
        return this.LIZ.LJIIIIZZ(str);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C0W3J.LJIIIIZZ(conditionalUserProperty);
        AbstractC19816112g3 abstractC19816112g3 = this.LIZ;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            C786410Ut5.LJJJI("app_id", str, bundle);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            C786410Ut5.LJJJI("origin", str2, bundle);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            C786410Ut5.LJJJI("name", str3, bundle);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C09FV.LIZIZ(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            C786410Ut5.LJJJI("trigger_event_name", str4, bundle);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            C786410Ut5.LJJJI("timed_out_event_name", str5, bundle);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            C786410Ut5.LJJIIZI(bundle, bundle2, "timed_out_event_params");
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            C786410Ut5.LJJJI("triggered_event_name", str6, bundle);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            C786410Ut5.LJJIIZI(bundle, bundle3, "triggered_event_params");
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            C786410Ut5.LJJJI("expired_event_name", str7, bundle);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            C786410Ut5.LJJIIZI(bundle, bundle4, "expired_event_params");
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC19816112g3.LJJ(bundle);
    }

    public AppMeasurement(final InterfaceC19816012g2 interfaceC19816012g2) {
        this.LIZ = new AbstractC19816112g3(interfaceC19816012g2) { // from class: X.12g1
            public final InterfaceC19816012g2 LIZ;

            @Override // X.InterfaceC19816012g2
            public final String LIZJ() {
                return this.LIZ.LIZJ();
            }

            @Override // X.InterfaceC19816012g2
            public final String LJFF() {
                return this.LIZ.LJFF();
            }

            @Override // X.InterfaceC19816012g2
            public final String LJI() {
                return this.LIZ.LJI();
            }

            @Override // X.InterfaceC19816012g2
            public final String LJIIJJI() {
                return this.LIZ.LJIIJJI();
            }

            @Override // X.InterfaceC19816012g2
            public final long zza() {
                return this.LIZ.zza();
            }

            {
                this.LIZ = interfaceC19816012g2;
            }

            @Override // X.InterfaceC19816012g2
            public final void LIZIZ(String str) {
                this.LIZ.LIZIZ(str);
            }

            @Override // X.InterfaceC19816012g2
            public final int LJIIIIZZ(String str) {
                return this.LIZ.LJIIIIZZ(str);
            }

            @Override // X.InterfaceC19816012g2
            public final void LJIIIZ(String str) {
                this.LIZ.LJIIIZ(str);
            }

            @Override // X.InterfaceC19816012g2
            public final void LJJ(Bundle bundle) {
                this.LIZ.LJJ(bundle);
            }

            @Override // X.InterfaceC19816012g2
            public final List<Bundle> LJIJ(String str, String str2) {
                return this.LIZ.LJIJ(str, str2);
            }

            @Override // X.InterfaceC19816012g2
            public final void LIZ(String str, String str2, Bundle bundle) {
                this.LIZ.LIZ(str, str2, bundle);
            }

            @Override // X.InterfaceC19816012g2
            public final void LIZLLL(String str, String str2, Bundle bundle) {
                this.LIZ.LIZLLL(str, str2, bundle);
            }

            @Override // X.InterfaceC19816012g2
            public final Map<String, Object> LJ(String str, String str2, boolean z) {
                return this.LIZ.LJ(str, str2, z);
            }
        };
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List<Bundle> listLJIJ = this.LIZ.LJIJ(str, str2);
        if (listLJIJ == null) {
            size = 0;
        } else {
            size = listLJIJ.size();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator<Bundle> it2 = listLJIJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it2.next()));
        }
        return arrayList;
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.LIZ.LIZ(str, str2, bundle);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.LIZ.LJ(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.LIZ.LIZLLL(str, str2, bundle);
    }
}
