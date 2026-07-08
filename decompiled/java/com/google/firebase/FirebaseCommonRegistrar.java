package com.google.firebase;

import X.AbstractC819100WBg;
import X.C0W4C;
import X.C0W4J;
import X.C0WBG;
import X.C0WBM;
import X.C0WBO;
import X.C0WBP;
import X.C0WBQ;
import X.C0WBR;
import X.C1890607aq;
import X.C818880WAk;
import X.InterfaceC812410Vtv;
import X.InterfaceC812430Vtx;
import X.InterfaceC819050WBb;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C0WBP<?>> getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        C0WBQ c0wbqLIZ = C0WBP.LIZ(InterfaceC812430Vtx.class);
        c0wbqLIZ.LIZ(new C0WBG(2, 0, AbstractC819100WBg.class));
        c0wbqLIZ.LJ = new C0WBM() { // from class: X.0WBT
            @Override // X.C0WBM
            public final Object LIZ(C0WBH c0wbh) {
                final Set setLJ = c0wbh.LJ(AbstractC819100WBg.class);
                final C0WBW c0wbw = C0WBW.LIZIZ;
                if (c0wbw == null) {
                    synchronized (C0WBW.class) {
                        try {
                            c0wbw = C0WBW.LIZIZ;
                            if (c0wbw == null) {
                                c0wbw = new C0WBW();
                                C0WBW.LIZIZ = c0wbw;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                return new InterfaceC812430Vtx(setLJ, c0wbw) { // from class: X.0WBU
                    public final String LIZ;
                    public final C0WBW LIZIZ;

                    @Override // X.InterfaceC812430Vtx
                    public final String getUserAgent() {
                        Set setUnmodifiableSet;
                        C0WBW c0wbw2 = this.LIZIZ;
                        synchronized (c0wbw2.LIZ) {
                            try {
                                setUnmodifiableSet = Collections.unmodifiableSet(c0wbw2.LIZ);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
                        if (setUnmodifiableSet.isEmpty()) {
                            return this.LIZ;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(' ');
                        sbLIZ.append(LIZ(this.LIZIZ.LIZ()));
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    public static String LIZ(Set<AbstractC819100WBg> set) {
                        StringBuilder sb = new StringBuilder();
                        Iterator<AbstractC819100WBg> it2 = set.iterator();
                        while (it2.hasNext()) {
                            AbstractC819100WBg next = it2.next();
                            sb.append(next.LIZ());
                            sb.append('/');
                            sb.append(next.LIZIZ());
                            if (it2.hasNext()) {
                                sb.append(' ');
                            }
                        }
                        return sb.toString();
                    }

                    {
                        this.LIZ = LIZ(setLJ);
                        this.LIZIZ = c0wbw;
                    }
                };
            }
        };
        arrayList.add(c0wbqLIZ.LIZIZ());
        C0WBQ c0wbq = new C0WBQ(C0W4C.class, new Class[]{C0W4J.class, InterfaceC812410Vtv.class});
        c0wbq.LIZ(C0WBG.LIZ(Context.class));
        c0wbq.LIZ(C0WBG.LIZ(C818880WAk.class));
        c0wbq.LIZ(new C0WBG(2, 0, C0WBO.class));
        c0wbq.LIZ(new C0WBG(1, 1, InterfaceC812430Vtx.class));
        c0wbq.LJ = new C0WBM() { // from class: X.0WBJ
            @Override // X.C0WBM
            public final Object LIZ(C0WBH c0wbh) {
                return new C0W4C((Context) c0wbh.LIZIZ(Context.class), ((C818880WAk) c0wbh.LIZIZ(C818880WAk.class)).LIZJ(), c0wbh.LJ(C0WBO.class), c0wbh.LIZJ(InterfaceC812430Vtx.class));
            }
        };
        arrayList.add(c0wbq.LIZIZ());
        arrayList.add(C0WBR.LIZ("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C0WBR.LIZ("fire-core", "20.1.1"));
        arrayList.add(C0WBR.LIZ("device-name", LIZ(Build.PRODUCT)));
        arrayList.add(C0WBR.LIZ("device-model", LIZ(Build.DEVICE)));
        arrayList.add(C0WBR.LIZ("device-brand", LIZ(Build.BRAND)));
        arrayList.add(C0WBR.LIZIZ("android-target-sdk", new InterfaceC819050WBb() { // from class: X.0WBZ
            @Override // X.InterfaceC819050WBb
            public final String LIZ(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                if (applicationInfo != null) {
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                return "";
            }
        }));
        arrayList.add(C0WBR.LIZIZ("android-min-sdk", new InterfaceC819050WBb() { // from class: X.0WBX
            @Override // X.InterfaceC819050WBb
            public final String LIZ(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
                    return String.valueOf(applicationInfo.minSdkVersion);
                }
                return "";
            }
        }));
        arrayList.add(C0WBR.LIZIZ("android-platform", new InterfaceC819050WBb() { // from class: X.0Wfo
            @Override // X.InterfaceC819050WBb
            public final String LIZ(Object obj) {
                Context context = (Context) obj;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    return "embedded";
                }
                return "";
            }
        }));
        arrayList.add(C0WBR.LIZIZ("android-installer", new InterfaceC819050WBb() { // from class: X.0WBS
            @Override // X.InterfaceC819050WBb
            public final String LIZ(Object obj) {
                Context context = (Context) obj;
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    return FirebaseCommonRegistrar.LIZ(installerPackageName);
                }
                return "";
            }
        }));
        try {
            string = C1890607aq.LLILZLL.toString();
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            string = null;
        }
        if (string != null) {
            arrayList.add(C0WBR.LIZ("kotlin", string));
        }
        return arrayList;
    }

    public static String LIZ(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }
}
