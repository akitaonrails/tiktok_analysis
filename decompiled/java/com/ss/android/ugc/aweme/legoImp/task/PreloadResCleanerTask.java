package com.ss.android.ugc.aweme.legoImp.task;

import X.C086I;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1965507mv;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PreloadResCleanerTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadResCleanerTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Field field;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Object objLIZJ = C1965507mv.LIZJ(C786410Ut5.N3(context).getResources(), "mResourcesImpl");
                if (objLIZJ != null) {
                    Object objLIZJ2 = C1965507mv.LIZJ(objLIZJ, "sPreloadedDrawables");
                    if (objLIZJ2 instanceof LongSparseArray[]) {
                        for (LongSparseArray longSparseArray : (LongSparseArray[]) objLIZJ2) {
                            C086I.LIZ(longSparseArray);
                        }
                    } else {
                        C086I.LIZ((LongSparseArray) objLIZJ2);
                    }
                    C086I.LIZ(C1965507mv.LIZJ(objLIZJ, "sPreloadedColorDrawables"));
                    C086I.LIZ(C1965507mv.LIZJ(objLIZJ, "sPreloadedComplexColors"));
                    Object objLIZJ3 = C1965507mv.LIZJ(objLIZJ, "mDrawableCache");
                    if (objLIZJ3 != null) {
                        C086I.LIZ(C1965507mv.LIZJ(objLIZJ3, "mNullThemedEntries"));
                        C086I.LIZ(C1965507mv.LIZJ(objLIZJ3, "mThemedEntries"));
                        C086I.LIZ(C1965507mv.LIZJ(objLIZJ3, "mUnthemedEntries"));
                    }
                    C086I.LIZ(C1965507mv.LIZJ(objLIZJ, "mDrawableCache"));
                    C086I.LIZ(C1965507mv.LIZJ(objLIZJ, "mColorDrawableCache"));
                    C086I.LIZ(C1965507mv.LIZJ(objLIZJ, "mColorStateListCache"));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            try {
                Resources resources = C786410Ut5.N3(context).getResources();
                Object objLIZJ4 = C1965507mv.LIZJ(resources, "sPreloadedDrawables");
                if (objLIZJ4 instanceof LongSparseArray[]) {
                    for (LongSparseArray longSparseArray2 : (LongSparseArray[]) objLIZJ4) {
                        C086I.LIZ(longSparseArray2);
                    }
                } else {
                    C086I.LIZ((LongSparseArray) objLIZJ4);
                }
                C086I.LIZ(C1965507mv.LIZJ(resources, "sPreloadedColorDrawables"));
                C086I.LIZ(C1965507mv.LIZJ(resources, "sPreloadedColorStateLists"));
                C086I.LIZ(C1965507mv.LIZJ(resources, "mDrawableCache"));
                C086I.LIZ(C1965507mv.LIZJ(resources, "mColorDrawableCache"));
                C086I.LIZ(C1965507mv.LIZJ(resources, "mColorStateListCache"));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        try {
            Class<?> cls = Class.forName("android.text.Hyphenator");
            try {
                field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, "sMap");
                field.setAccessible(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                field = null;
            }
            C086I.LIZ(field.get(cls));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
