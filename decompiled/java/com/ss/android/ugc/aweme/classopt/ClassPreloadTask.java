package com.ss.android.ugc.aweme.classopt;

import X.C082Q;
import X.C0CCZ;
import X.C0VZ0;
import X.C2044207zc;
import X.C304560Bwk;
import X.C305490ByF;
import X.C305500ByG;
import X.C305510ByH;
import X.C584520MwE;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.ss.android.ugc.aweme.classopt.container.AdClassContainerA;
import com.ss.android.ugc.aweme.classopt.container.AdClassContainerB;
import com.ss.android.ugc.aweme.classopt.container.LiveClassContainerA;
import com.ss.android.ugc.aweme.classopt.container.LiveClassContainerB;
import com.ss.android.ugc.aweme.classopt.container.PhotoModeClassContainerA;
import com.ss.android.ugc.aweme.classopt.container.PhotoModeClassContainerB;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class ClassPreloadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ClassPreloadTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (((Boolean) C305490ByF.LIZIZ.getValue()).booleanValue()) {
            C584520MwE.LIZ(new AdClassContainerA(), new AdClassContainerB());
        }
        if (((Boolean) C305500ByG.LIZIZ.getValue()).booleanValue()) {
            C584520MwE.LIZ(new LiveClassContainerA(), new LiveClassContainerB());
        }
        if (((Boolean) C305510ByH.LIZIZ.getValue()).booleanValue()) {
            C584520MwE.LIZ(new PhotoModeClassContainerA(), new PhotoModeClassContainerB());
        }
        Looper mainLooper = Looper.getMainLooper();
        Field field = C2044207zc.LIZ;
        if (((Boolean) C304560Bwk.LIZIZ.getValue()).booleanValue() && C082Q.LIZ == 1 && Build.VERSION.SDK_INT > 28) {
            C823050WQl.LJ().scheduleWithFixedDelay(new ARunnableS103S0100000_3(mainLooper, 90), 0L, 1000 * ((Number) C304560Bwk.LIZJ.getValue()).longValue(), TimeUnit.MILLISECONDS);
        }
    }
}
