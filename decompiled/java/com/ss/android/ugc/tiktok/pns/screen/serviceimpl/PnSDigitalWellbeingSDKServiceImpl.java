package com.ss.android.ugc.tiktok.pns.screen.serviceimpl;

import X.AnonymousClass0566;
import X.C01GW;
import X.C05BD;
import X.C10CM;
import X.C10CN;
import X.C13LE;
import X.C1440005kM;
import X.C1865410ydv;
import X.C19283210cI;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C356901a3;
import X.C452501pT;
import X.C786410Ut5;
import X.C817503Hh;
import X.C822660WOy;
import X.EnumC1745000vVi;
import X.EnumC1879480z0c;
import X.EnumC19283910cP;
import X.EnumC483470Ixd;
import X.InterfaceC1519030pdF;
import X.InterfaceC19284510cV;
import X.RunnableC19283810cO;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS97S0200000_28;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.offline.compliance.debug.IComplianceDebugService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import com.ss.android.ugc.tiktok.pns.screen.network.ScreenTimeActionRequest;
import com.ss.android.ugc.tiktok.pns.screen.network.ScreenTimeDailyUsage;
import com.ss.android.ugc.tiktok.pns.screen.network.ScreenTimeData;
import com.ss.android.ugc.tiktok.pns.screen.network.TodayUsedTimeResponse;
import com.ss.android.ugc.tiktok.pns.screen.serviceimpl.PnSDigitalWellbeingSDKServiceImpl;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS429S0200000_28;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class PnSDigitalWellbeingSDKServiceImpl implements PnSDigitalWellbeingSDKService, DefaultLifecycleObserver, GenericLifecycleObserver {
    public int LL;
    public final BPEAHandler LLILLJJLI;
    public EnumC483470Ixd LLILLL;
    public final long LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;
    public final C822660WOy LLIZ;
    public boolean LLIZLLLIL;
    public final RunnableC19283810cO LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final ARunnableS128S0100000_28 LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public ARunnableS128S0100000_28 LLJJIJI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final boolean LJFF() {
        if (this.LLILZIL) {
            return false;
        }
        return !this.LLJJIII;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.10cO] */
    public PnSDigitalWellbeingSDKServiceImpl() {
        C13LE.LIZ(PnSDigitalWellbeingSDKService.class).LJI();
        this.LL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
        this.LLILLL = EnumC483470Ixd.CLOSED;
        this.LLILZ = 5L;
        this.LLIZ = new C822660WOy(1);
        this.LLJ = new Runnable() { // from class: X.10cO
            public final void LIZ() {
                if (this.LL.LLILLL == EnumC483470Ixd.OPENED) {
                    IComplianceDebugService iComplianceDebugService = (IComplianceDebugService) PluggableExtentionKt.pluggableSpi$default(IComplianceDebugService.class, false, false, false, 14, null);
                    if (iComplianceDebugService != null) {
                        iComplianceDebugService.LIZ();
                    }
                    PnSDigitalWellbeingSDKServiceImpl pnSDigitalWellbeingSDKServiceImpl = this.LL;
                    pnSDigitalWellbeingSDKServiceImpl.LLILZLL += pnSDigitalWellbeingSDKServiceImpl.LLILZ * ((long) 1);
                    InterfaceC1519050pdH interfaceC1519050pdH = (InterfaceC1519050pdH) pnSDigitalWellbeingSDKServiceImpl.LLJILJILJ.getValue();
                    if (interfaceC1519050pdH != null) {
                        PnSDigitalWellbeingSDKServiceImpl pnSDigitalWellbeingSDKServiceImpl2 = this.LL;
                        interfaceC1519050pdH.putLong(pnSDigitalWellbeingSDKServiceImpl2.LLJIJIL, pnSDigitalWellbeingSDKServiceImpl2.LLILZLL);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PnSDigitalWellbeingSDKServiceImpl@3d33.scheduledThreadPoolExecutorTask$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PnSDigitalWellbeingSDKServiceImpl@3d33.scheduledThreadPoolExecutorTask$1");
            }
        };
        this.LLJI = "pns_digital_wellbeing_sdk_storage";
        this.LLJIJIL = "usage_time_in_sec_key";
        this.LLJILJIL = "upload_frequency_in_sec_key";
        this.LLJILJILJ = C452501pT.LIZIZ(new C10CM(this));
        this.LLJILLL = C452501pT.LIZIZ(new C10CN());
        this.LLJJ = new ARunnableS128S0100000_28(this, 56);
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final long LIZIZ() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final boolean LJIIL() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final boolean LJIILIIL() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final void LIZJ(long j) {
        if (j <= 0) {
            return;
        }
        ARunnableS128S0100000_28 aRunnableS128S0100000_28 = this.LLJJIJI;
        if (aRunnableS128S0100000_28 != null) {
            this.LLILLJJLI.removeCallbacks(aRunnableS128S0100000_28);
        }
        ARunnableS128S0100000_28 aRunnableS128S0100000_282 = new ARunnableS128S0100000_28(this, 57);
        this.LLJJIJI = aRunnableS128S0100000_282;
        C786410Ut5.LJLIIL(j * 1000, this.LLILLJJLI, aRunnableS128S0100000_282);
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final void LJI(boolean z) {
        this.LLJJIII = z;
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final void LJII(final EnumC19283910cP enumC19283910cP) {
        this.LLIZ.execute(new Runnable() { // from class: X.10cN
            public final /* synthetic */ InterfaceC19284510cV LLILLL = null;

            /* JADX WARN: Type inference failed for: r3v5, types: [X.10cQ] */
            public final void LIZ() {
                C11NZ<TodayUsedTimeResponse> c11nzLIZIZ;
                final PnSDigitalWellbeingSDKServiceImpl pnSDigitalWellbeingSDKServiceImpl = this.LL;
                EnumC19283910cP enumC19283910cP2 = enumC19283910cP;
                final InterfaceC19284510cV interfaceC19284510cV = this.LLILLL;
                if (pnSDigitalWellbeingSDKServiceImpl.LLJJI) {
                    return;
                }
                boolean z = true;
                pnSDigitalWellbeingSDKServiceImpl.LLJJI = true;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ScreenTimeDailyUsage[] screenTimeDailyUsageArr = new ScreenTimeDailyUsage[1];
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jCurrentTimeMillis);
                int i = calendar.get(11);
                if (i < 22 && i >= 6) {
                    z = false;
                }
                screenTimeDailyUsageArr[0] = z ? new ScreenTimeDailyUsage((int) (System.currentTimeMillis() / ((long) 86400000)), 0, (int) pnSDigitalWellbeingSDKServiceImpl.LLILZLL) : new ScreenTimeDailyUsage((int) (System.currentTimeMillis() / ((long) 86400000)), (int) pnSDigitalWellbeingSDKServiceImpl.LLILZLL, 0);
                final List listLJIILJJIL = C1697810uHb.LJIILJJIL(screenTimeDailyUsageArr);
                int type = enumC19283910cP2.getType();
                final String strName = enumC19283910cP2.name();
                final ?? r3 = new InterfaceC19284510cV() { // from class: X.10cQ
                    @Override // X.InterfaceC19284510cV
                    public final void onFailure() {
                        pnSDigitalWellbeingSDKServiceImpl.LLJJI = false;
                        InterfaceC19284510cV interfaceC19284510cV2 = interfaceC19284510cV;
                        if (interfaceC19284510cV2 != null) {
                            interfaceC19284510cV2.onFailure();
                        }
                    }

                    @Override // X.InterfaceC19284510cV
                    public final void onSuccess() {
                        PnSDigitalWellbeingSDKServiceImpl pnSDigitalWellbeingSDKServiceImpl2 = pnSDigitalWellbeingSDKServiceImpl;
                        pnSDigitalWellbeingSDKServiceImpl2.LLJJI = false;
                        pnSDigitalWellbeingSDKServiceImpl2.LLILZLL = 0L;
                        InterfaceC1519050pdH interfaceC1519050pdH = (InterfaceC1519050pdH) pnSDigitalWellbeingSDKServiceImpl2.LLJILJILJ.getValue();
                        if (interfaceC1519050pdH != null) {
                            interfaceC1519050pdH.putLong(pnSDigitalWellbeingSDKServiceImpl2.LLJIJIL, pnSDigitalWellbeingSDKServiceImpl2.LLILZLL);
                        }
                        InterfaceC19284510cV interfaceC19284510cV2 = interfaceC19284510cV;
                        if (interfaceC19284510cV2 != null) {
                            interfaceC19284510cV2.onSuccess();
                        }
                    }
                };
                final long jCurrentTimeMillis2 = System.currentTimeMillis();
                InterfaceC19283610cM interfaceC19283610cM = (InterfaceC19283610cM) C19283210cI.LIZ.getValue();
                if (interfaceC19283610cM != null && (c11nzLIZIZ = interfaceC19283610cM.LIZIZ(new ScreenTimeData(jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT), listLJIILJJIL, type, 1, "", ""))) != null) {
                    c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<TodayUsedTimeResponse>() { // from class: X.10cL
                        @Override // X.InterfaceC626120Oh8
                        public final void onComplete() {
                        }

                        @Override // X.InterfaceC626120Oh8
                        public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                        }

                        @Override // X.InterfaceC626120Oh8
                        public final void onError(Throwable th) {
                            r3.onFailure();
                        }

                        @Override // X.InterfaceC626120Oh8
                        public final void onNext(TodayUsedTimeResponse todayUsedTimeResponse) {
                            TodayUsedTimeResponse todayUsedTimeResponse2 = todayUsedTimeResponse;
                            int i2 = 0;
                            if (todayUsedTimeResponse2.getStatusCode() == 0) {
                                PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) C19283210cI.LIZIZ.getValue();
                                Pair[] pairArr = new Pair[2];
                                int i3 = 0;
                                for (ScreenTimeDailyUsage screenTimeDailyUsage : listLJIILJJIL) {
                                    i3 += screenTimeDailyUsage.dayUsage + screenTimeDailyUsage.nightUsage;
                                }
                                pairArr[0] = new Pair("upload_time", String.valueOf(i3));
                                pairArr[1] = new Pair("is_dashboard_sdk", "1");
                                pnSDigitalWellbeingSDKService.LIZ("pnsscreensdk_dashboard_timeusage_diff", C2097608Jq.LJIIIIZZ(pairArr));
                                r3.onSuccess();
                            } else {
                                r3.onFailure();
                            }
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService2 = (PnSDigitalWellbeingSDKService) C19283210cI.LIZIZ.getValue();
                            Pair[] pairArr2 = new Pair[6];
                            pairArr2[0] = new Pair("status_code", String.valueOf(todayUsedTimeResponse2.getStatusCode()));
                            pairArr2[1] = new Pair("status_message", String.valueOf(todayUsedTimeResponse2.getStatusMsg()));
                            pairArr2[2] = new Pair("api_url", "/tiktok/v1/screen_time/upload/");
                            pairArr2[3] = new Pair("enter_from", strName);
                            for (ScreenTimeDailyUsage screenTimeDailyUsage2 : listLJIILJJIL) {
                                i2 += screenTimeDailyUsage2.dayUsage + screenTimeDailyUsage2.nightUsage;
                            }
                            pairArr2[4] = new Pair("upload_time", String.valueOf(i2));
                            pairArr2[5] = new Pair("duration", String.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2));
                            pnSDigitalWellbeingSDKService2.LIZ("digital_wellbeing_api", C2097608Jq.LJIIIIZZ(pairArr2));
                        }
                    });
                }
                if (enumC19283910cP2 == EnumC19283910cP.LOGOUT_ACCOUNT || enumC19283910cP2 == EnumC19283910cP.SWITCH_ACCOUNT_DEACTIVATE) {
                    pnSDigitalWellbeingSDKServiceImpl.LLILZLL = 0L;
                    InterfaceC1519050pdH interfaceC1519050pdH = (InterfaceC1519050pdH) pnSDigitalWellbeingSDKServiceImpl.LLJILJILJ.getValue();
                    if (interfaceC1519050pdH != null) {
                        interfaceC1519050pdH.putLong(pnSDigitalWellbeingSDKServiceImpl.LLJIJIL, pnSDigitalWellbeingSDKServiceImpl.LLILZLL);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PnSDigitalWellbeingSDKServiceImpl@3d33.uploadScreenTime$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PnSDigitalWellbeingSDKServiceImpl@3d33.uploadScreenTime$1");
            }
        });
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final void LJIIIIZZ(boolean z) {
        if (z == this.LLILZIL) {
            return;
        }
        this.LLILZIL = z;
        if (z) {
            C1440005kM.LIZ(new IEvent() { // from class: X.0bth
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        } else {
            C1440005kM.LIZ(new IEvent() { // from class: X.0bth
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final void LJIIIZ(int i) {
        this.LL = i;
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C05BD(this, i, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void init(android.content.Context r8) {
        /*
            r7 = this;
            boolean r0 = r7.LLIZLLLIL
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r7.LLIZLLLIL = r0
            X.01GW r0 = r7.LLJILJILJ
            java.lang.Object r1 = r0.getValue()
            X.0pdH r1 = (X.InterfaceC1519050pdH) r1
            if (r1 == 0) goto La3
            java.lang.String r0 = r7.LLJIJIL
            long r0 = r1.getLong(r0)
        L18:
            r7.LLILZLL = r0
            X.0WOy r0 = r7.LLIZ
            X.10cO r1 = r7.LLJ
            r2 = 0
            long r4 = r7.LLILZ
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            androidx.lifecycle.LifecycleOwner r0 = r0.get()
            androidx.lifecycle.Lifecycle r3 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r0 = r1.isAtLeast(r0)
            r6 = 0
            if (r0 == 0) goto L7e
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = r7.LLILLJJLI
            Y.ARunnableS71S0200000_2 r1 = new Y.ARunnableS71S0200000_2
            r0 = 26
            r1.<init>(r3, r7, r0)
            X.C786410Ut5.LJJZZIII(r2, r1)
        L4a:
            X.01GW r0 = r7.LLJILJILJ
            java.lang.Object r1 = r0.getValue()
            X.0pdH r1 = (X.InterfaceC1519050pdH) r1
            if (r1 == 0) goto L7b
            java.lang.String r0 = r7.LLJILJIL
            int r0 = r1.getInt(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L7b
            int r0 = r1.intValue()
        L68:
            r7.LL = r0
            com.bytedance.bpea.transmit.delegate.BPEAHandler r5 = r7.LLILLJJLI
            Y.ARunnableS128S0100000_28 r4 = r7.LLJJ
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            X.C786410Ut5.LJLIIL(r2, r5, r4)
            java.lang.String r0 = "digital_wellbeing_infra_initiated"
            r7.LIZ(r0, r6)
            return
        L7b:
            r0 = 300(0x12c, float:4.2E-43)
            goto L68
        L7e:
            if (r8 == 0) goto La1
            android.content.Context r1 = X.C786410Ut5.N3(r8)
        L84:
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto L4a
            android.app.Application r1 = (android.app.Application) r1
            if (r1 == 0) goto L4a
            X.05c3 r0 = new X.05c3
            r0.<init>()
            r1.registerActivityLifecycleCallbacks(r0)
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = r7.LLILLJJLI
            Y.ARunnableS102S0100000_2 r1 = new Y.ARunnableS102S0100000_2
            r0 = 96
            r1.<init>(r7, r0)
            X.C786410Ut5.LJJZZIII(r2, r1)
            goto L4a
        La1:
            r1 = r6
            goto L84
        La3:
            r0 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.screen.serviceimpl.PnSDigitalWellbeingSDKServiceImpl.init(android.content.Context):void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.LLILLL = EnumC483470Ixd.OPENED;
        LJII(EnumC19283910cP.OPEN_APP);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.LLILLL = EnumC483470Ixd.CLOSED;
        LJII(EnumC19283910cP.EXIT_APP);
        this.LLIZ.execute(new ARunnableS97S0200000_28(this, 48));
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final void LIZ(String str, Map<String, String> map) {
        InterfaceC1519030pdF interfaceC1519030pdF = (InterfaceC1519030pdF) this.LLJILLL.getValue();
        if (interfaceC1519030pdF != null) {
            interfaceC1519030pdF.LIZ(str, map);
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final void LIZLLL(EnumC1879480z0c enumC1879480z0c, InterfaceC19284510cV interfaceC19284510cV) {
        LJIIJJI(enumC1879480z0c, EnumC1745000vVi.OK, null, interfaceC19284510cV);
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final void LJ(Context context, String str, JSONObject jSONObject) {
        Intent intent = new Intent("com.ss.android.ugc.tiktok.pns.screen.broadcast");
        intent.putExtra("screen_time_sdk_action_id", str);
        if (jSONObject != null) {
            intent.putExtra("screen_time_sdk_action_ui_config", C786410Ut5.J3(jSONObject));
        }
        LocalBroadcastManager.LIZ(context).LIZJ(intent);
        LIZ("aggregate_screen_time_infra", C2097908Jt.LIZJ(new Pair("current_stage", "send_broadcast_screen_time_sdk_action_id")));
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final void LJIIJ(EnumC1879480z0c enumC1879480z0c, AnonymousClass0566 anonymousClass0566, final InterfaceC19284510cV interfaceC19284510cV) {
        C19283210cI.LIZ(new ScreenTimeActionRequest(enumC1879480z0c.getS(), null, "", "", Integer.valueOf(anonymousClass0566.getI()), null), new InterfaceC19284510cV() { // from class: X.10cS
            @Override // X.InterfaceC19284510cV
            public final void onFailure() {
                InterfaceC19284510cV interfaceC19284510cV2 = interfaceC19284510cV;
                if (interfaceC19284510cV2 != null) {
                    interfaceC19284510cV2.onFailure();
                }
            }

            @Override // X.InterfaceC19284510cV
            public final void onSuccess() {
                InterfaceC19284510cV interfaceC19284510cV2 = interfaceC19284510cV;
                if (interfaceC19284510cV2 != null) {
                    interfaceC19284510cV2.onSuccess();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService
    public final void LJIIJJI(EnumC1879480z0c enumC1879480z0c, EnumC1745000vVi enumC1745000vVi, String str, final InterfaceC19284510cV interfaceC19284510cV) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SleepHour.");
        sbLIZ.append(enumC1879480z0c.getS());
        sbLIZ.append(".Action");
        C1865410ydv.LIZ(C2188811AlT.LIZIZ(sbLIZ), new AwS429S0200000_28(enumC1879480z0c, enumC1745000vVi, 66));
        C19283210cI.LIZ(new ScreenTimeActionRequest(enumC1879480z0c.getS(), Integer.valueOf(enumC1745000vVi.getI()), "", "", null, str), new InterfaceC19284510cV() { // from class: X.10cR
            @Override // X.InterfaceC19284510cV
            public final void onFailure() {
                InterfaceC19284510cV interfaceC19284510cV2 = interfaceC19284510cV;
                if (interfaceC19284510cV2 != null) {
                    interfaceC19284510cV2.onFailure();
                }
            }

            @Override // X.InterfaceC19284510cV
            public final void onSuccess() {
                InterfaceC19284510cV interfaceC19284510cV2 = interfaceC19284510cV;
                if (interfaceC19284510cV2 != null) {
                    interfaceC19284510cV2.onSuccess();
                }
            }
        });
    }
}
