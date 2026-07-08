package com.bytedance.ies.ugc.appcontext.launch;

import X.C08PY;
import X.C0W9J;
import X.C786410Ut5;
import X.C844470XAv;
import X.C844490XAx;
import X.C844500XAy;
import X.C844510XAz;
import X.InterfaceC844480XAw;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.compact.task.IAppContextCompactIniter;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class AppContextCompactIniterImpl implements IAppContextCompactIniter {
    @Override // com.bytedance.ies.ugc.appcontext.compact.task.IAppContextCompactIniter
    public final void LIZ(Application application, InterfaceC844480XAw interfaceC844480XAw) {
        PackageInfo packageInfoY3;
        long j;
        AwS592S0100000_13 awS592S0100000_13 = new AwS592S0100000_13(interfaceC844480XAw, 22);
        C844490XAx c844490XAx = new C844490XAx();
        c844490XAx.LIZ = application;
        awS592S0100000_13.invoke(c844490XAx);
        C844470XAv.LIZ.getClass();
        Application application2 = c844490XAx.LIZ;
        Application application3 = null;
        if (application2 == null) {
            application2 = null;
        }
        C844470XAv.LIZIZ = application2;
        C844470XAv.LIZJ = c844490XAx.LIZIZ;
        String str = c844490XAx.LIZJ;
        if (str == null) {
            str = null;
        }
        C844470XAv.LJ = str;
        long j2 = c844490XAx.LJ;
        String str2 = c844490XAx.LIZLLL;
        if (str2 == null) {
            str2 = null;
        }
        C844470XAv.LJFF = new C844510XAz(j2, str2);
        C844470XAv.LJIIIZ = c844490XAx.LJIIIZ;
        C844470XAv.LJIIJ = c844490XAx.LJFF;
        C844470XAv.LJIJ = c844490XAx.LJI;
        C844470XAv.LJIJI = c844490XAx.LJIIIIZZ;
        C844470XAv.LJIJJ = c844490XAx.LJII;
        C844510XAz c844510XAz = C844470XAv.LJFF;
        if (c844510XAz == null) {
            c844510XAz = null;
        }
        long jIntValue = -1;
        if (TextUtils.isEmpty(c844510XAz.LIZIZ) || c844510XAz.LIZ == 0 || c844510XAz.LIZ == -1) {
            Application application4 = C844470XAv.LIZIZ;
            if (application4 == null) {
                application4 = null;
            }
            try {
                packageInfoY3 = C786410Ut5.Y3(application4.getPackageManager(), application4.getPackageName(), 0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                packageInfoY3 = null;
            }
            String str3 = "";
            if (packageInfoY3 != null) {
                String str4 = packageInfoY3.versionName;
                if (str4 != null) {
                    str3 = str4;
                }
                j = packageInfoY3.versionCode;
            } else {
                j = -1;
            }
            C844470XAv.LJFF = new C844510XAz(j, str3);
        }
        Application application5 = C844470XAv.LIZIZ;
        if (application5 == null) {
            application5 = null;
        }
        C844470XAv.LIZ.getClass();
        String strLJFF = C844470XAv.LJFF();
        long jLJ = C844470XAv.LJ();
        try {
            strLJFF = String.valueOf((String) C08PY.LIZ(application5, "SS_VERSION_NAME"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            jLJ = ((Integer) C08PY.LIZ(application5, "SS_VERSION_CODE")).intValue();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        try {
            jIntValue = ((Integer) C08PY.LIZ(application5, "UPDATE_VERSION_CODE")).intValue();
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        C844470XAv.LJI = new C844500XAy(jLJ, strLJFF, jIntValue);
        Application application6 = C844470XAv.LIZIZ;
        if (application6 == null) {
            application6 = null;
        }
        String strLIZ = C0W9J.LIZ(application6, "meta_channel");
        if (strLIZ != null && strLIZ.length() > 0) {
            C844470XAv.LJIILL = strLIZ;
            C844470XAv.LJIILLIIL = strLIZ;
        }
        Application application7 = C844470XAv.LIZIZ;
        if (application7 == null) {
            application7 = null;
        }
        String strLIZ2 = C0W9J.LIZ(application7, "GIT_BRANCH");
        if (strLIZ2 != null) {
            C844470XAv.LJIIJJI = strLIZ2;
        }
        Application application8 = C844470XAv.LIZIZ;
        if (application8 == null) {
            application8 = null;
        }
        C0W9J.LIZ(application8, "ci_branch");
        Application application9 = C844470XAv.LIZIZ;
        if (application9 == null) {
            application9 = null;
        }
        String strLIZ3 = C0W9J.LIZ(application9, "c_timestamp");
        if (strLIZ3 != null) {
            try {
                new SimpleDateFormat("MM-dd HH:mm").format(new Date(CastLongProtector.parseLong(strLIZ3) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        Application application10 = C844470XAv.LIZIZ;
        if (application10 == null) {
            application10 = null;
        }
        String strLIZ4 = C0W9J.LIZ(application10, "GIT_SHA");
        if (strLIZ4 != null) {
            C844470XAv.LJIIL = strLIZ4;
        }
        Application application11 = C844470XAv.LIZIZ;
        if (application11 == null) {
            application11 = null;
        }
        C0W9J.LIZ(application11, "GIT_USERNAME");
        Application application12 = C844470XAv.LIZIZ;
        if (application12 == null) {
            application12 = null;
        }
        C0W9J.LIZ(application12, "GIT_USER_EMAIL");
        Application application13 = C844470XAv.LIZIZ;
        if (application13 == null) {
            application13 = null;
        }
        String strLIZ5 = C0W9J.LIZ(application13, "release_build");
        if (strLIZ5 != null) {
            C844470XAv.LJII = strLIZ5;
        }
        Application application14 = C844470XAv.LIZIZ;
        if (application14 == null) {
            application14 = null;
        }
        String strLIZ6 = C0W9J.LIZ(application14, "BITS_MR_ID");
        if (strLIZ6 != null) {
            C844470XAv.LJIILIIL = strLIZ6;
        }
        Application application15 = C844470XAv.LIZIZ;
        if (application15 != null) {
            application3 = application15;
        }
        String strLIZ7 = C0W9J.LIZ(application3, "build_timestamp");
        if (strLIZ7 != null) {
            C844470XAv.LJIILJJIL = strLIZ7;
        }
        C844470XAv.LJIJJLI = System.currentTimeMillis();
    }
}
