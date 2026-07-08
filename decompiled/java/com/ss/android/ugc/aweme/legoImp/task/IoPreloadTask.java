package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0CG6;
import X.C0VU1;
import X.C0VY0;
import X.C0VZ0;
import X.C2188811AlT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC20234614Fk
public final class IoPreloadTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "IoPreloadTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return ((Boolean) C0CG6.LJII.getValue()).booleanValue() && !ColdBootTasksDegradeExperiment.LIZ().ioPreloadTask;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                String absolutePath = context.createDeviceProtectedStorageContext().getCodeCacheDir().getAbsolutePath();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(absolutePath);
                String str = File.separator;
                sbLIZ.append(str);
                sbLIZ.append("com.android.opengl.shaders_cache");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(absolutePath);
                sbLIZ2.append(str);
                sbLIZ2.append("com.android.skia.shaders_cache");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                C0VY0.LIZ(strLIZIZ);
                C0VY0.LIZ(strLIZIZ2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
