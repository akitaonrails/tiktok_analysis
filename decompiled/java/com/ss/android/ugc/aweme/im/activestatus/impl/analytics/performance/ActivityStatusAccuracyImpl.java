package com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance;

import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C08CF;
import X.C0PEM;
import X.C0ZJF;
import X.C0ZJI;
import X.C0ZJK;
import X.C1231704rr;
import X.C1388190mED;
import X.C13LQ;
import X.C1440005kM;
import X.C1867550yhN;
import X.C19EG;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C694970RNv;
import X.C897370ZIh;
import X.C914180Ztg;
import X.EnumC1910440zoY;
import X.InterfaceC897380ZIi;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl;
import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusAccuracyPollingConfig;
import com.ss.android.ugc.aweme.im.saas.host.api.homepage.IMSaasTabApi;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivityStatusAccuracyImpl {
    public static final EnumC1910440zoY[] LJIIIZ = {EnumC1910440zoY.INBOX_TOP, EnumC1910440zoY.CHAT_CELL};
    public final EnumC1910440zoY LIZ;
    public final LifecycleOwner LIZIZ;
    public AnonymousClass0956 LIZJ;
    public final C1231704rr LIZLLL = new C1231704rr("ActivityStatusAccuracyImpl", null, 6);
    public final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new C914180Ztg(CoroutineExceptionHandler.LJJLIL, this, 1)));
    public boolean LJFF;
    public boolean LJI;
    public Boolean LJII;
    public final C0ZJF LJIIIIZZ;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r4 = this;
            X.0Yzt r0 = com.ss.android.ugc.aweme.im.saas.host.api.main.IMMainSAFLifecycle.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.im.saas.host.api.main.IMMainSAFLifecycle> r0 = X.C892550Yzt.LIZIZ
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.im.saas.host.api.main.IMMainSAFLifecycle r1 = (com.ss.android.ugc.aweme.im.saas.host.api.main.IMMainSAFLifecycle) r1
            r2 = 0
            if (r1 == 0) goto L5b
            androidx.lifecycle.LifecycleOwner r0 = r4.LIZIZ
            androidx.lifecycle.LifecycleOwner r0 = r1.LIZ(r0)
            if (r0 == 0) goto L5b
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L5b
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            if (r1 == 0) goto L5b
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            boolean r3 = r1.isAtLeast(r0)
        L2a:
            X.0zoY r0 = r4.LIZ
            int[] r1 = X.C0ZJG.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L4f
            r0 = 2
            if (r1 == r0) goto L48
            r2 = r3
        L3b:
            java.lang.Boolean r1 = r4.LJII
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5d
            return
        L48:
            if (r3 == 0) goto L3b
            boolean r0 = r4.LJFF
            if (r0 == 0) goto L3b
            goto L59
        L4f:
            if (r3 == 0) goto L3b
            boolean r0 = r4.LJFF
            if (r0 == 0) goto L3b
            boolean r0 = r4.LJI
            if (r0 == 0) goto L3b
        L59:
            r2 = 1
            goto L3b
        L5b:
            r3 = 0
            goto L2a
        L5d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.LJII = r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "check page visibility "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r4.LIZJ(r0)
            r3 = 0
            if (r2 == 0) goto L9e
            java.util.Set<X.0zoY> r1 = X.C0ZJH.LIZ
            X.0zoY r0 = r4.LIZ
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L9d
            java.lang.String r0 = "start polling"
            r4.LIZJ(r0)
            X.0956 r0 = r4.LIZJ
            if (r0 == 0) goto L8f
            r0.LIZIZ(r3)
        L8f:
            X.054G r2 = r4.LJ
            X.0NPO r1 = new X.0NPO
            r1.<init>(r4, r3)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            r4.LIZJ = r0
        L9d:
            return
        L9e:
            java.lang.String r0 = "stop polling"
            r4.LIZJ(r0)
            X.0956 r0 = r4.LIZJ
            if (r0 == 0) goto Laa
            r0.LIZIZ(r3)
        Laa:
            r4.LIZJ = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl.LIZ():void");
    }

    public final ActivityStatusAccuracyPollingConfig LIZIZ() {
        Object next;
        Iterator it2 = ((List) C1867550yhN.LIZLLL.getValue()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(((ActivityStatusAccuracyPollingConfig) next).position, this.LIZ.getValue())) {
                break;
            }
        }
        ActivityStatusAccuracyPollingConfig activityStatusAccuracyPollingConfig = (ActivityStatusAccuracyPollingConfig) next;
        return activityStatusAccuracyPollingConfig == null ? new ActivityStatusAccuracyPollingConfig(EnumC1910440zoY.INBOX_TOP.getValue(), 2L, 10L) : activityStatusAccuracyPollingConfig;
    }

    public static final void LIZLLL(ActivityStatusAccuracyImpl activityStatusAccuracyImpl) {
        activityStatusAccuracyImpl.getClass();
        InterfaceC897380ZIi.LIZIZ.getClass();
        if (!C897370ZIh.LIZ().LJ().LIZ()) {
            return;
        }
        activityStatusAccuracyImpl.LIZJ("collectAccuracyInfo");
        C1440005kM.LIZ(new C694970RNv(activityStatusAccuracyImpl.LIZ));
    }

    public final void LIZJ(String str) {
        C1231704rr c1231704rr = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.getValue());
        sbLIZ.append('_');
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0ZJF] */
    public ActivityStatusAccuracyImpl(EnumC1910440zoY enumC1910440zoY, LifecycleOwner lifecycleOwner, final Context context) {
        C19EG c19egLIZIZ;
        boolean zLIZJ;
        this.LIZ = enumC1910440zoY;
        this.LIZIZ = lifecycleOwner;
        ?? r3 = new C0ZJK() { // from class: X.0ZJF
            @Override // X.C0ZJK
            public final void LJJIIJ(boolean z) {
                ActivityStatusAccuracyImpl activityStatusAccuracyImpl = this.LIZ;
                activityStatusAccuracyImpl.LJFF = z;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mainTabChangeListener_isInInboxPage:");
                sbLIZ.append(z);
                activityStatusAccuracyImpl.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LIZ();
            }
        };
        this.LJIIIIZZ = r3;
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                C19EG c19egLIZIZ2;
                int i = C08CF.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ActivityStatusAccuracyImpl.this.LIZJ("on destroy");
                            ActivityStatusAccuracyImpl.this.LIZ();
                            Context context2 = context;
                            if (context2 != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context2)) != null) {
                                ActivityStatusAccuracyImpl activityStatusAccuracyImpl = ActivityStatusAccuracyImpl.this;
                                IMSaasTabApi.LIZ.getClass();
                                IMSaasTabApi value = C0ZJI.LIZIZ.getValue();
                                if (value != null) {
                                    value.LIZ(c19egLIZIZ2, activityStatusAccuracyImpl.LJIIIIZZ);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ActivityStatusAccuracyImpl.this.LIZJ("on pause");
                    ActivityStatusAccuracyImpl.this.LIZ();
                    return;
                }
                ActivityStatusAccuracyImpl.this.LIZJ("on resume");
                ActivityStatusAccuracyImpl.this.LIZ();
            }
        });
        if (C13LQ.LJIILLIIL(enumC1910440zoY, LJIIIZ) && context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            IMSaasTabApi.LIZ.getClass();
            C01GW<IMSaasTabApi> c01gw = C0ZJI.LIZIZ;
            IMSaasTabApi value = c01gw.getValue();
            if (value != 0) {
                value.LIZIZ(c19egLIZIZ, r3);
            }
            IMSaasTabApi value2 = c01gw.getValue();
            if (value2 != null) {
                zLIZJ = value2.LIZJ(c19egLIZIZ);
            } else {
                zLIZJ = false;
            }
            this.LJFF = zLIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isInInboxPage:");
            sbLIZ.append(this.LJFF);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            LIZ();
        }
    }
}
