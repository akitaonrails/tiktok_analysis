package com.ss.android.ugc.aweme.geoblocking.common;

import X.C1518810pct;
import X.C1518950pd7;
import X.C1518990pdB;
import X.C1519010pdD;
import X.C1519020pdE;
import X.InterfaceC1519000pdC;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService2;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class GeoBlockingService2Impl implements IGeoBlockingService2 {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService2
    public final void LIZ() {
        synchronized (this) {
            try {
                if (!this.LIZ) {
                    C1518950pd7 c1518950pd7 = C1518950pd7.LIZ;
                    C1518950pd7.LIZ(C1518810pct.LIZ);
                    C1518950pd7.LIZ(new InterfaceC1519000pdC() { // from class: X.0pdA
                        public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("tiktok/v1/calculate/age", "passport/email/register", "passport/email/register_verify", "passport/email/register_verify_login", "passport/app/email/register/code_verify", "passport/auth/login", "passport/mobile/sms_login", "passport/email/register/v2", "passport/user/check_email_registered", "passport/email/oauth_bind_register_or_login", "passport/employee/account/create", "passport/carrier_auth/login_continue", "passport/mobile/oauth_bind_register_or_login", "passport/mobile/sms_login_continue", "passport/app/email/register/ticket_register", "passport/mobile/register", "passport/username/register", "aweme/v3/verification/age");
                        public static final String LIZJ = "GeoBlockingRegistrationStrategy";

                        @Override // X.InterfaceC1519000pdC
                        public final boolean LIZJ() {
                            return true;
                        }

                        @Override // X.InterfaceC1519000pdC
                        public final void reset() {
                        }

                        @Override // X.InterfaceC1519000pdC
                        public final EnumC1518970pd9 getLevel() {
                            return EnumC1518970pd9.FEATURE_LEVEL;
                        }

                        @Override // X.InterfaceC1519000pdC
                        public final String getTag() {
                            return LIZJ;
                        }

                        @Override // X.InterfaceC1519000pdC
                        public final void LIZ(C1518830pcv c1518830pcv) {
                            synchronized (this) {
                                try {
                                    C1518990pdB c1518990pdB = C1518990pdB.LIZ;
                                    String str = c1518830pcv.LIZ;
                                    int i = c1518830pcv.LIZIZ;
                                    c1518990pdB.getClass();
                                    C1518990pdB.LIZ(i, str);
                                    ((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).LJIIIIZZ(c1518830pcv);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        @Override // X.InterfaceC1519000pdC
                        public final boolean LIZIZ(C1518830pcv c1518830pcv) {
                            return LIZIZ.contains(a0.LJLIL(c1518830pcv.LIZ, '/'));
                        }
                    });
                    IGeoBlockingDepService iGeoBlockingDepService = (IGeoBlockingDepService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingDepService.class, false, false, false, 14, null);
                    if (iGeoBlockingDepService != null) {
                        iGeoBlockingDepService.LJII();
                        iGeoBlockingDepService.LJFF(new C1519010pdD(C1519020pdE.LIZ));
                    }
                    this.LIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1518990pdB.LIZ.getClass();
        C1518990pdB.LIZJ.set(true);
        for (InterfaceC1519000pdC interfaceC1519000pdC : C1518950pd7.LIZIZ) {
            if (interfaceC1519000pdC != null) {
                interfaceC1519000pdC.reset();
            }
        }
    }
}
