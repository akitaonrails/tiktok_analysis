package com.ss.android.ugc.aweme.ecommerce.saas;

import X.AnonymousClass0317;
import X.C034S;
import X.C08RN;
import X.C0VSJ;
import X.C1120604Zw;
import X.C1AQS;
import X.C2188811AlT;
import X.C786450Ut9;
import X.InterfaceC1551110qSz;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.settings.IGeckoRegister;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.ECBuildInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC1551110qSz(boeAccessKey = "", prodAccessKey = "cb50eeeb5df4705aa5544c9c8db87c4c", testAccessKey = "5ae177d789b2f86a9611d44282aa47c0")
public final class EcomSaaSGeckoRegister implements IGeckoRegister {
    @Override // com.bytedance.geckox.settings.IGeckoRegister
    public Map<String, OptionCheckUpdateParams.CustomValue> registerCustomParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("business_version", new OptionCheckUpdateParams.CustomValue() { // from class: X.0Ned
            @Override // com.bytedance.geckox.OptionCheckUpdateParams.CustomValue
            public final Object getValue() {
                return ((ECBuildInfo) C1AQS.LIZ.getValue()).versionName;
            }
        });
        return linkedHashMap;
    }

    public static File INVOKEVIRTUAL_com_ss_android_ugc_aweme_ecommerce_saas_EcomSaaSGeckoRegister_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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
    public String registerRootDir(Context context) throws Throwable {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        String name;
        File fileINVOKEVIRTUAL_com_ss_android_ugc_aweme_ecommerce_saas_EcomSaaSGeckoRegister_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = INVOKEVIRTUAL_com_ss_android_ugc_aweme_ecommerce_saas_EcomSaaSGeckoRegister_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IHybridDependencyService.class.getName();
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
        }
        return new C0VSJ(fileINVOKEVIRTUAL_com_ss_android_ugc_aweme_ecommerce_saas_EcomSaaSGeckoRegister_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir, ((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).geckoXRootDir()).getPath();
    }
}
