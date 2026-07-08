package com.ss.android.ugc.aweme.crossplatform.business;

import X.C1041660dDI;
import X.C1968907nT;
import X.C2188811AlT;
import X.InterfaceC1037490d6Z;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class BusinessService {
    public final C1968907nT LIZ;
    public final HashMap<Class, Business> LIZIZ = new HashMap<>();

    /* JADX INFO: loaded from: classes17.dex */
    public static abstract class Business {
        public final InterfaceC1037490d6Z LIZ;
        public final C1041660dDI LIZIZ;
        public final Context LIZJ;

        public Business(C1968907nT c1968907nT) {
            InterfaceC1037490d6Z interfaceC1037490d6Z = c1968907nT.LIZ;
            this.LIZ = interfaceC1037490d6Z;
            this.LIZIZ = interfaceC1037490d6Z.LJIIIIZZ();
            this.LIZJ = interfaceC1037490d6Z.getContext();
        }
    }

    public BusinessService(C1968907nT c1968907nT) {
        this.LIZ = c1968907nT;
    }

    public final <T extends Business> T LIZ(Class<T> cls) {
        T tNewInstance;
        if (this.LIZIZ.containsKey(cls)) {
            return (T) this.LIZIZ.get(cls);
        }
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(C1968907nT.class);
                declaredConstructor.setAccessible(true);
                tNewInstance = declaredConstructor.newInstance(this.LIZ);
                try {
                    this.LIZIZ.put(cls, tNewInstance);
                } catch (IllegalAccessException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                } catch (InstantiationException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                } catch (NoSuchMethodException e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                } catch (InvocationTargetException e4) {
                    e = e4;
                    TryCatchGuardChecker.doCheck(e);
                } catch (Exception e5) {
                    e = e5;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (IllegalAccessException e6) {
                e = e6;
                tNewInstance = null;
            } catch (InstantiationException e7) {
                e = e7;
                tNewInstance = null;
            } catch (NoSuchMethodException e8) {
                e = e8;
                tNewInstance = null;
            } catch (InvocationTargetException e9) {
                e = e9;
                tNewInstance = null;
            } catch (Exception e10) {
                e = e10;
                tNewInstance = null;
            }
            if (tNewInstance == null) {
                return null;
            }
            return tNewInstance;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can't use abstract class!");
        sbLIZ.append(cls.getSimpleName());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
