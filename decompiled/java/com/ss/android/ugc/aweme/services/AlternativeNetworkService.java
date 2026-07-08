package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C05XL;
import X.C090F;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0XF1;
import X.C155000ia;
import X.C1C7U;
import X.C452501pT;
import X.EnumC1493070oxN;
import X.InterfaceC1364105Vn;
import X.InterfaceC1493160oxW;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501330pAh;
import X.InterfaceC1501370pAl;
import X.InterfaceC1519705xD;
import X.InterfaceC497601wk;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTMultiNetwork;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import njp.a;

/* JADX INFO: loaded from: classes10.dex */
public final class AlternativeNetworkService implements InterfaceC1493160oxW {
    public static volatile C05XL<Boolean> enableDeferred;
    public static final AlternativeNetworkService INSTANCE = new AlternativeNetworkService();
    public static final C01GW preconnectAPI$delegate = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(310));
    public static final int $stable = 8;

    public interface Api {
        @InterfaceC1501330pAh({"x-ttnet-protocol-handler: 1", "x-ttnet-action-preconnect-alternative-net: 1"})
        @InterfaceC1501200pAU
        Object preconnect(@InterfaceC1501370pAl("x-ttnet-action-preconnect-url") String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1493160oxW
    public void onMultiNetStateChanged(EnumC1493070oxN enumC1493070oxN, EnumC1493070oxN enumC1493070oxN2, long j) {
    }

    public final Api getPreconnectAPI() {
        return (Api) preconnectAPI$delegate.getValue();
    }

    public final C05XL<Boolean> getEnableDeferred() {
        return enableDeferred;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.AlternativeNetworkService$preconnect$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.services.AlternativeNetworkService$preconnect$1", f = "AlternativeNetworkService.kt", l = {77}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ String $preconnectURL;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$preconnectURL = str;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass1(this.$preconnectURL, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("AlternativeNetworkService@f0d6.preconnect$1");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    Api preconnectAPI = AlternativeNetworkService.INSTANCE.getPreconnectAPI();
                    String str = this.$preconnectURL;
                    this.label = 1;
                    if (preconnectAPI.preconnect(str, this) == objLJFF) {
                        C1C7U.LIZIZ("AlternativeNetworkService@f0d6.preconnect$1");
                        return objLJFF;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AlternativeNetworkService@f0d6.preconnect$1");
            return unit;
        }
    }

    public final synchronized void manuallyActivateCell(Context context) {
        if (context != null) {
            InterfaceC1519705xD.LIZ.getClass();
            if (C0XF1.LJ(context)) {
                if (enableDeferred != null) {
                    return;
                }
                enableDeferred = C090F.LIZIZ();
                TTMultiNetwork.registerMultiNetObserver(this, null);
                TTMultiNetwork.tryActivateAlternativeNet();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preconnect(java.lang.String r5) {
        /*
            r4 = this;
            X.05XL<java.lang.Boolean> r0 = com.ss.android.ugc.aweme.services.AlternativeNetworkService.enableDeferred
            if (r0 == 0) goto L24
            boolean r1 = r0.isCompleted()
            r0 = 1
            if (r1 != r0) goto L24
        Lb:
            r3 = 0
            if (r0 == 0) goto L21
            X.05XL<java.lang.Boolean> r0 = com.ss.android.ugc.aweme.services.AlternativeNetworkService.enableDeferred
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r0.LIZLLL()
        L16:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L26
            return
        L1f:
            r1 = r3
            goto L16
        L21:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L16
        L24:
            r0 = 0
            goto Lb
        L26:
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            com.ss.android.ugc.aweme.services.AlternativeNetworkService$preconnect$1 r1 = new com.ss.android.ugc.aweme.services.AlternativeNetworkService$preconnect$1
            r1.<init>(r5, r3)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.AlternativeNetworkService.preconnect(java.lang.String):void");
    }

    @Override // X.InterfaceC1493160oxW
    public void onUserSpecifiedNetworkEnabled(boolean z, long j) {
        C05XL<Boolean> c05xl;
        C05XL<Boolean> c05xl2 = enableDeferred;
        if (c05xl2 != null && !c05xl2.isCompleted() && (c05xl = enableDeferred) != null) {
            c05xl.LJIIZILJ(Boolean.valueOf(z));
        }
    }
}
