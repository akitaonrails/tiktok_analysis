package com.ss.android.ugc.aweme.commercialize.impl;

import X.C08RN;
import X.C0VSJ;
import X.C2188811AlT;
import X.C786450Ut9;
import X.InterfaceC1551110qSz;
import android.app.Application;
import android.content.Context;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.settings.IGeckoRegister;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC1551110qSz(boeAccessKey = "", prodAccessKey = "cca47107bfcbdb211d88f3385aeede40", testAccessKey = "2ff95781afa1ea7819532925d401d15e")
public final class IncentiveLandingPageGeckoRegister implements IGeckoRegister {
    @Override // com.bytedance.geckox.settings.IGeckoRegister
    public Map<String, OptionCheckUpdateParams.CustomValue> registerCustomParams() {
        HashMap map = new HashMap();
        map.put("business_version", new OptionCheckUpdateParams.CustomValue() { // from class: X.0NLw
            @Override // com.bytedance.geckox.OptionCheckUpdateParams.CustomValue
            public final Object getValue() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LJFF();
            }
        });
        return map;
    }

    public static File INVOKEVIRTUAL_com_ss_android_ugc_aweme_commercialize_impl_IncentiveLandingPageGeckoRegister_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    @Override // com.bytedance.geckox.settings.IGeckoRegister
    public String registerRootDir(Context context) {
        return new C0VSJ(INVOKEVIRTUAL_com_ss_android_ugc_aweme_commercialize_impl_IncentiveLandingPageGeckoRegister_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "offlineX").getAbsolutePath();
    }
}
