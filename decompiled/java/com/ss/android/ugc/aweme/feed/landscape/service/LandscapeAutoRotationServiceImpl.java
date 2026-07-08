package com.ss.android.ugc.aweme.feed.landscape.service;

import X.AbstractC1387200mCc;
import X.AbstractC726480Sec;
import X.C04TD;
import X.C0WZX;
import X.C1300690jx5;
import X.C1389890mGx;
import X.C1397950mTx;
import X.C1906580ziK;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C2531909w5;
import X.C713290RyR;
import X.C783000Una;
import X.C838130WuJ;
import X.C844470XAv;
import X.InterfaceC783040Une;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.hardware.SensorManager;
import android.provider.Settings;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ILandscapeAutoRotationService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeAutoRotationServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LandscapeAutoRotationServiceImpl implements ILandscapeAutoRotationService {
    public final Keva LIZ = Keva.getRepo("landscape_auto_rotation");
    public final Context LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C783000Una LJ;
    public InterfaceC783040Une LJFF;
    public int LJI;
    public boolean LJII;
    public volatile Boolean LJIIIIZZ;

    public final boolean LJIIIZ() {
        try {
            ContentResolver contentResolver = this.LIZIZ.getContentResolver();
            if (contentResolver != null) {
                return Settings.System.getInt(contentResolver, "accelerometer_rotation") == 1;
            }
        } catch (Settings.SettingNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static ILandscapeAutoRotationService LJIIIIZZ() {
        Object objLIZ = C04TD.LIZ(ILandscapeAutoRotationService.class, false);
        if (objLIZ != null) {
            return (ILandscapeAutoRotationService) objLIZ;
        }
        if (C04TD.v0 == null) {
            synchronized (ILandscapeAutoRotationService.class) {
                if (C04TD.v0 == null) {
                    C04TD.v0 = new LandscapeAutoRotationServiceImpl();
                }
            }
        }
        return C04TD.v0;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeAutoRotationService
    public final boolean LIZJ() {
        int i = this.LIZ.getInt("key_auto_rotation_status", 0);
        return i == 4 || i == 5;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeAutoRotationService
    public final boolean LIZLLL() {
        int i = this.LIZ.getInt("key_auto_rotation_status", 0);
        return i == 2 || i == 4;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeAutoRotationService
    public final boolean LJII() {
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = Boolean.valueOf(LJIIIZ());
        }
        return Intrinsics.LJFF(this.LJIIIIZZ, Boolean.TRUE);
    }

    public final void LJIIJ() {
        if (C713290RyR.LIZ && !C2531909w5.LIZ && (this.LIZ.getInt("key_auto_rotation_status", 0) == 2 || this.LIZ.getInt("key_auto_rotation_status", 0) == 3)) {
            this.LIZ.storeInt("key_auto_rotation_status", 0);
        }
        if (LIZJ()) {
            return;
        }
        boolean z = C2531909w5.LIZ;
        if (!C2531909w5.LIZ || this.LIZ.getInt("key_auto_rotation_status", 0) == 2) {
            return;
        }
        this.LIZ.storeInt("key_auto_rotation_status", C2531909w5.LIZIZ ? 2 : 3);
    }

    public LandscapeAutoRotationServiceImpl() {
        C844470XAv.LIZ.getClass();
        this.LIZIZ = C844470XAv.LIZ();
        this.LJI = -1;
        LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeAutoRotationService
    public final boolean LJ() {
        return LJII() && LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeAutoRotationService
    public final void LIZ(boolean z) {
        if (z) {
            this.LIZJ = true;
        } else {
            this.LIZLLL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeAutoRotationService
    public final void LIZIZ(InterfaceC783040Une interfaceC783040Une) {
        if (!ComplianceServiceProvider.LJIILJJIL().LJII(null)) {
            return;
        }
        this.LJFF = interfaceC783040Une;
        if (!this.LJII) {
            this.LJII = true;
            this.LJIIIIZZ = Boolean.valueOf(LJIIIZ());
            LJIIJ();
            if (this.LJ == null) {
                this.LJ = new C783000Una(this, this.LIZIZ);
            }
            try {
                ContentResolver contentResolver = this.LIZIZ.getContentResolver();
                if (contentResolver != null) {
                    contentResolver.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, new ContentObserver() { // from class: X.0Unb
                        {
                            super(null);
                        }

                        @Override // android.database.ContentObserver
                        public final void onChange(boolean z) {
                            LandscapeAutoRotationServiceImpl landscapeAutoRotationServiceImpl = this.LIZ;
                            landscapeAutoRotationServiceImpl.LJIIIIZZ = Boolean.valueOf(landscapeAutoRotationServiceImpl.LJIIIZ());
                            LandscapeAutoRotationServiceImpl landscapeAutoRotationServiceImpl2 = this.LIZ;
                            if (landscapeAutoRotationServiceImpl2.LJ == null) {
                                landscapeAutoRotationServiceImpl2.LJ = new C783000Una(landscapeAutoRotationServiceImpl2, landscapeAutoRotationServiceImpl2.LIZIZ);
                            }
                            InterfaceC783040Une interfaceC783040Une2 = landscapeAutoRotationServiceImpl2.LJFF;
                            if (interfaceC783040Une2 != null) {
                                landscapeAutoRotationServiceImpl2.LIZIZ(interfaceC783040Une2);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } else {
            this.LJIIIIZZ = Boolean.valueOf(LJIIIZ());
            LJIIJ();
        }
        C783000Una c783000Una = this.LJ;
        if (c783000Una != null && !c783000Una.LIZJ) {
            try {
                SensorManager sensorManager = c783000Una.LIZIZ;
                C1300690jx5.LIZJ(sensorManager, c783000Una.LIZLLL, C2204961BRm.LJJL(sensorManager, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA0DPYwXqNyF6EYSqu5CprCkPAnEsir+X7WY5TbzyM2vDXmuddY7DUQFNtroDrog==", null)), 2, CertProviderManagerKt.findCert("bpea-sensor", 1476415503));
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c783000Una.LIZJ = true;
        }
        this.LJI = !interfaceC783040Une.LJJLIIIJL() ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeAutoRotationService
    public final void LJFF(InterfaceC783040Une interfaceC783040Une) throws Throwable {
        if (!Intrinsics.LJFF(this.LJFF, interfaceC783040Une)) {
            return;
        }
        this.LJFF = null;
        C783000Una c783000Una = this.LJ;
        if (c783000Una != null && c783000Una.LIZJ) {
            C2204961BRm.LJJLIIIJJI(c783000Una.LIZIZ, c783000Una.LIZLLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA0DPYwXqNyF6EYSqu5CprCkPAnEsir+X7WY5TbzyM2vDXmuddY7DUQFNtroDrog==", null));
            c783000Una.LIZJ = false;
        }
    }

    public static void LJIIJJI(AbstractC726480Sec abstractC726480Sec, int i, int i2, String str) {
        String str2;
        String authorUid;
        String aid;
        String str3;
        String str4;
        String str5;
        String str6;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String logPbString = null;
        if (abstractC726480Sec != null) {
            str2 = abstractC726480Sec.LIZIZ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (abstractC726480Sec != null && (aweme3 = abstractC726480Sec.LIZ) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme3);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (abstractC726480Sec != null && (aweme2 = abstractC726480Sec.LIZ) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (abstractC726480Sec != null && (aweme = abstractC726480Sec.LIZ) != null) {
            logPbString = aweme.getLogPbString();
        }
        c2344009Gk.LJIIIIZZ("log_pb", logPbString);
        c2344009Gk.LIZJ(i, "rotate_angle_xy");
        c2344009Gk.LIZJ(i2, "rotate_angle_z");
        c2344009Gk.LIZJ(1, "is_landscape_entrance");
        c2344009Gk.LJIIIIZZ("rotate_action", str);
        if (abstractC726480Sec == null || (str3 = abstractC726480Sec.LIZJ) == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("action_failed_reason", str3);
        if (LJIIIIZZ().LIZJ()) {
            str4 = "user_setting";
        } else {
            str4 = "default";
        }
        c2344009Gk.LJIIIIZZ("set_method", str4);
        String str7 = "on";
        if (C2531909w5.LIZIZ) {
            str5 = "on";
        } else {
            str5 = "off";
        }
        c2344009Gk.LJIIIIZZ("default_app_rotate_status", str5);
        if (LJIIIIZZ().LJII()) {
            str6 = "on";
        } else {
            str6 = "off";
        }
        c2344009Gk.LJIIIIZZ("phone_rotate_status", str6);
        if (!LJIIIIZZ().LIZLLL()) {
            str7 = "off";
        }
        c2344009Gk.LJIIIIZZ("app_rotate_status", str7);
        C20684815ws.LJIILLIIL("rotate_landscape_screen", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeAutoRotationService
    public final void LJI(boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        C1397950mTx c1397950mTx;
        Activity activity;
        C1397950mTx c1397950mTx2;
        Activity activity2;
        C1397950mTx c1397950mTx3;
        Activity activity3;
        if (z) {
            if (z2) {
                i = 4;
            } else {
                i = 2;
            }
        } else if (z2) {
            i = 5;
        } else {
            i = 3;
        }
        this.LIZ.storeInt("key_auto_rotation_status", i);
        if (z4) {
            if (z3) {
                if (z) {
                    AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                    if ((abstractC1387200mCcLJ instanceof C1397950mTx) && (c1397950mTx3 = (C1397950mTx) abstractC1387200mCcLJ) != null && (activity3 = c1397950mTx3.LIZLLL) != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activity3);
                        c1389890mGx.LJIIIZ(2131826883);
                        c1389890mGx.LJIIJJI();
                    }
                } else {
                    AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                    if ((abstractC1387200mCcLJ2 instanceof C1397950mTx) && (c1397950mTx2 = (C1397950mTx) abstractC1387200mCcLJ2) != null && (activity2 = c1397950mTx2.LIZLLL) != null) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(activity2);
                        c1389890mGx2.LJIIIZ(2131826882);
                        c1389890mGx2.LJIIJJI();
                    }
                }
            }
        } else if (z3 && z) {
            AbstractC1387200mCc abstractC1387200mCcLJ3 = C1906580ziK.LJ();
            if ((abstractC1387200mCcLJ3 instanceof C1397950mTx) && (c1397950mTx = (C1397950mTx) abstractC1387200mCcLJ3) != null && (activity = c1397950mTx.LIZLLL) != null) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(activity);
                c1389890mGx3.LJIIIZ(2131826890);
                c1389890mGx3.LJIIJJI();
            }
        }
        if (this.LJ == null) {
            this.LJ = new C783000Una(this, this.LIZIZ);
        }
        InterfaceC783040Une interfaceC783040Une = this.LJFF;
        if (interfaceC783040Une != null) {
            LIZIZ(interfaceC783040Une);
        }
    }
}
