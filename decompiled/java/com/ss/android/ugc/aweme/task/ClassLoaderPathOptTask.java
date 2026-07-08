package com.ss.android.ugc.aweme.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1697810uHb;
import X.C2039007ym;
import X.C20621085z;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ClassLoaderPathOptTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ClassLoaderPathOptTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return ((Boolean) C20621085z.LIZ.getValue()).booleanValue();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return (((Number) C20621085z.LIZIZ.getValue()).intValue() & 1) == 1 ? EnumC799870VZh.MAIN : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            C844470XAv.LIZ.getClass();
            ClassLoader classLoader = C844470XAv.LIZ().getClassLoader();
            List listLJIILJJIL = C1697810uHb.LJIILJJIL("config.arm64_v8a.apk", "config.armeabi_v7a.apk", "config.xxxhdpi.apk", "config.xxhdpi.apk", "config.en.apk", "config.zh.apk");
            try {
                Field fieldExactField = Reflect.on(classLoader).exactField("pathList", new Class[0]);
                fieldExactField.setAccessible(true);
                C2039007ym.LIZ(fieldExactField.get(classLoader), listLJIILJJIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
