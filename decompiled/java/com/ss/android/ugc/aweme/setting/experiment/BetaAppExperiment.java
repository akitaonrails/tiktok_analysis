package com.ss.android.ugc.aweme.setting.experiment;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C08CX;
import X.C09CT;
import X.C0XQ5;
import X.C0XQ7;
import X.C2188811AlT;
import X.C452501pT;
import X.C844470XAv;
import X.EnumC452301pR;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.u;

/* JADX INFO: loaded from: classes13.dex */
public final class BetaAppExperiment {
    public static final BetaAppExperiment LIZ = new BetaAppExperiment();
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final Keva LJI;
    public static final C01GW LJII;
    public static boolean LJIIIIZZ;
    public static final BetaAppBody LJIIIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("launch-");
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LJ());
        LIZIZ = LJ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("click-");
        sbLIZ2.append(C844470XAv.LJ());
        LIZJ = LJ(C2188811AlT.LIZIZ(sbLIZ2));
        LIZLLL = LJ("bits-version-code");
        LJ = LJ("bits-version-name");
        LJFF = LJ("bits-gp-name");
        LJI = Keva.getRepo("beta_testing");
        LJII = C452501pT.LIZ(EnumC452301pR.NONE, AFwS199S0000000_12.get$arr$(203));
        BetaAppBody betaAppBody = new BetaAppBody(0, null, null, 7, null);
        BetaAppBody betaAppBody2 = (BetaAppBody) SettingsManager.LIZLLL().LJIIIIZZ("ios_beta_testing_enable", BetaAppBody.class, betaAppBody);
        if (betaAppBody2 != null) {
            betaAppBody = betaAppBody2;
        }
        LJIIIZ = betaAppBody;
    }

    public static final boolean LIZ() {
        LIZ.getClass();
        if (!LIZJ()) {
            return false;
        }
        Keva keva = LJI;
        return !keva.getBoolean(LIZJ, false) && System.currentTimeMillis() - keva.getLong(LIZIZ, Long.MAX_VALUE) <= TimeUnit.DAYS.toMillis(14L);
    }

    public static boolean LIZJ() {
        BetaAppBody betaAppBody = LJIIIZ;
        Set<String> set = betaAppBody.regions;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            if (u.LJIJI((String) it2.next(), ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase(), true)) {
                return betaAppBody.enabled == 1 && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !C0XQ5.LIZ().LIZ();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r1 < 35) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(int r8) {
        /*
            long r3 = (long) r8
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            long r1 = X.C844470XAv.LJ()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r3 = 0
            if (r0 > 0) goto L10
            return r3
        L10:
            java.lang.String r2 = java.lang.String.valueOf(r8)
            r4 = 7
            r5 = 10
            r6 = 4
            r7 = 6
            r8 = 1
            int r0 = r2.length()     // Catch: java.lang.Exception -> L9d
            if (r0 == r7) goto L35
            if (r0 != r5) goto La1
            r0 = 9
            java.lang.String r0 = r2.substring(r4, r0)     // Catch: java.lang.Exception -> L9d
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> L9d
            r0 = 41
            if (r0 > r1) goto La1
            r0 = 46
            if (r1 >= r0) goto La1
            goto L45
        L35:
            java.lang.String r0 = r2.substring(r6, r7)     // Catch: java.lang.Exception -> L9d
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> L9d
            r0 = 27
            if (r0 > r1) goto La1
            r0 = 35
            if (r1 >= r0) goto La1
        L45:
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            long r0 = X.C844470XAv.LJ()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r0 = r1.length()
            if (r0 != r7) goto L6d
            int r0 = r2.length()
            if (r0 != r7) goto L6d
            java.lang.String r1 = r1.substring(r3, r6)
            java.lang.String r0 = r2.substring(r3, r6)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L6a:
            if (r0 == 0) goto L87
            return r3
        L6d:
            int r0 = r1.length()
            if (r0 != r5) goto L87
            int r0 = r2.length()
            if (r0 != r5) goto L87
            r0 = 3
            java.lang.String r1 = r1.substring(r0, r4)
            java.lang.String r0 = r2.substring(r0, r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            goto L6a
        L87:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "app version from GP: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "BetaAppExperiment"
            com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(r0, r1)
            return r8
        L9d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment.LIZIZ(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(int r7) {
        /*
            r0 = 1
            com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment.LJIIIIZZ = r0
            java.lang.String r5 = java.lang.String.valueOf(r7)
            int r1 = r5.length()
            r4 = 0
            r7 = 6
            r6 = 46
            if (r1 == r7) goto L95
            r0 = 10
            if (r1 != r0) goto L4a
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            r0 = 3
            r2 = 5
            java.lang.String r0 = r5.substring(r0, r2)
            r3.append(r0)
            r3.append(r6)
            r1 = 7
            java.lang.String r0 = r5.substring(r2, r1)
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r3.append(r0)
            r3.append(r6)
            r0 = 9
            java.lang.String r0 = r5.substring(r1, r0)
            r3.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r3)
        L41:
            if (r2 == 0) goto L4a
            com.bytedance.keva.Keva r1 = com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment.LJI
            java.lang.String r0 = com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment.LJFF
            r1.storeString(r0, r2)
        L4a:
            X.0TTs r0 = X.InterfaceC747470TTt.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r1 = X.C747460TTs.LJ
            java.lang.String r0 = X.C747460TTs.LIZJ
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L94
            X.0TTt r6 = X.C747460TTs.LIZIZ
            com.ss.android.ugc.aweme.setting.api.InboxMsgRequestBody r5 = new com.ss.android.ugc.aweme.setting.api.InboxMsgRequestBody
            r4 = 3
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r3 = r0.getCurUserId()
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            java.lang.String r2 = X.C844470XAv.LJFF()
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            long r0 = X.C844470XAv.LJ()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.<init>(r4, r3, r2, r0)
            X.11NZ r1 = r6.LIZJ(r5)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r2 = r1.LJL(r0)
            X.0TTv<T> r1 = new X.C09JN() { // from class: X.0TTv
                static {
                    /*
                        X.0TTv r0 = new X.0TTv
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0TTv<T>) X.0TTv.LL X.0TTv
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C747490TTv.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C747490TTv.<init>():void");
                }

                @Override // X.C09JN
                public final void accept(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.String r3 = "BetaAppApi$Companion@c1df.becomeBetaSuccessInboxMsg$1"
                        X.C1C7U.LIZ(r3)
                        com.ss.android.ugc.aweme.setting.api.SimpleResponseBody r5 = (com.ss.android.ugc.aweme.setting.api.SimpleResponseBody) r5
                        X.0TTs r0 = X.C747460TTs.LIZ
                        boolean r2 = r5.LIZ()
                        r0.getClass()
                        com.bytedance.keva.Keva r1 = X.C747460TTs.LJ
                        java.lang.String r0 = X.C747460TTs.LIZJ
                        r1.storeBoolean(r0, r2)
                        java.lang.String r1 = "BetaAppExperiment"
                        java.lang.String r0 = "msg send success."
                        com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(r1, r0)
                        X.C1C7U.LIZIZ(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C747490TTv.accept(java.lang.Object):void");
                }
            }
            X.089V<T> r0 = new X.C09JN() { // from class: X.089V
                static {
                    /*
                        X.089V r0 = new X.089V
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.089V<T>) X.089V.LL X.089V
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C089V.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C089V.<init>():void");
                }

                @Override // X.C09JN
                public final void accept(java.lang.Object r4) {
                    /*
                        r3 = this;
                        java.lang.String r2 = "BetaAppApi$Companion@c1df.becomeBetaSuccessInboxMsg$2"
                        X.C1C7U.LIZ(r2)
                        java.lang.String r1 = "BetaAppExperiment"
                        java.lang.String r0 = "msg send failed!!"
                        com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(r1, r0)
                        X.C1C7U.LIZIZ(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C089V.accept(java.lang.Object):void");
                }
            }
            r2.LJJLL(r1, r0)
        L94:
            return
        L95:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            r2 = 2
            java.lang.String r0 = r5.substring(r4, r2)
            r3.append(r0)
            r3.append(r6)
            r1 = 4
            java.lang.String r0 = r5.substring(r2, r1)
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r5.substring(r1, r7)
            r3.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r3)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment.LIZLLL(int):void");
    }

    public static String LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class BetaAppBody {

        @C09CT("debug_gp_code")
        public final Integer debugVersionCode;

        @C09CT("enable")
        public final int enabled;

        @C09CT("store_region")
        public final Set<String> regions;

        public BetaAppBody() {
            this(0, null, null, 7, null);
        }

        public BetaAppBody(int i, Set<String> set, Integer num) {
            this.enabled = i;
            this.regions = set;
            this.debugVersionCode = num;
        }

        public BetaAppBody(int i, Set set, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C08CX.INSTANCE : set, (i2 & 4) != 0 ? null : num);
        }
    }
}
