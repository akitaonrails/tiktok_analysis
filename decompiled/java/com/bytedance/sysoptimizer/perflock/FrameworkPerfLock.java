package com.bytedance.sysoptimizer.perflock;

import X.C0WZX;
import X.C2204961BRm;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class FrameworkPerfLock {
    public static final int[] sQualcommPerfLockParas = {1077936128, 1, 1086324736, 1, 1082146816, 4095, 1082147072, 4095, 1082147328, 4095, 1082130432, 4095, 1082130688, 4095, 1082130944, 4095, 1099005952, 255, 1098907648, 255, 1086455808, 20, 1086439424, 30};
    public static final int[] sQualcommPerfLockExtendGPU = {1077936128, 1, 1086324736, 1, 1082146816, 4095, 1082147072, 4095, 1082147328, 4095, 1082130432, 4095, 1082130688, 4095, 1082130944, 4095, 1099005952, 255, 1098907648, 255, 1086455808, 20, 1086439424, 30, 1124073472, 255, 1119944704, 1, 1128267776, 65535, 1115734016, 4095, 1115750400, 4095};
    public static final int[] sMTKPowerHalParas = {8388608, 4, 8388864, 4, 21037056, 1, 4194304, 16777215, 4194560, 16777215, 4194816, 16777215};
    public static final int[] sMTKPowerHalExtendParas = {8388608, 4, 8388864, 4, 21037056, 1, 4194304, 16777215, 4194560, 16777215, 4194816, 16777215, 12582912, 16777215, 12599296, 16777215};

    public static class QualCommPerfLock extends PerfLockImpl {
        public AtomicBoolean mHasFixed;
        public Class<?> mQPerformanceClazz;
        public Field mRestrictUnTrustedAppAccessField;

        private void fixQualcommUnTrustedAppAccessIssue() {
            if (PerfLockBooster.sFixQualUnTrustedAppAccessIssue && this.mHasFixed.compareAndSet(false, true)) {
                try {
                    Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("com.qualcomm.qti.Performance");
                    this.mQPerformanceClazz = clsLoadClass;
                    Field fieldInner = DoubleReflectUtils.getFieldInner(clsLoadClass, "RestrictUnTrustedAppAccess");
                    this.mRestrictUnTrustedAppAccessField = fieldInner;
                    if (fieldInner != null) {
                        fieldInner.setBoolean(null, false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }

        public QualCommPerfLock() {
            this.mHasFixed = new AtomicBoolean(false);
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean preparePerfParasImpl(Context context) throws ClassNotFoundException {
            try {
                Class<?> cls = Class.forName("com.qualcomm.qti.Performance", true, ClassLoader.getSystemClassLoader());
                this.mPerfClazz = cls;
                Constructor<?>[] constructor = DoubleReflector.getConstructor(cls);
                if (constructor != null) {
                    if (constructor.length > 1) {
                        this.mPerfClazzObj = constructor[1].newInstance(context);
                    } else if (constructor.length == 1) {
                        this.mPerfClazzObj = constructor[0].newInstance(new Object[0]);
                    }
                }
                if (this.mPerfClazzObj != null) {
                    Method methodInner = DoubleReflector.getMethodInner(this.mPerfClazz, "perfLockAcquire", Integer.TYPE, int[].class);
                    this.mPerfBoostMethod = methodInner;
                    if (methodInner != null) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    Class<?> cls2 = Class.forName("android.util.BoostFramework", true, ClassLoader.getSystemClassLoader());
                    this.mPerfClazz = cls2;
                    Constructor<?>[] constructor2 = DoubleReflector.getConstructor(cls2);
                    if (constructor2 != null) {
                        if (constructor2.length > 1) {
                            this.mPerfClazzObj = constructor2[1].newInstance(context);
                        } else if (constructor2.length == 1) {
                            this.mPerfClazzObj = constructor2[0].newInstance(new Object[0]);
                        }
                    }
                    if (this.mPerfClazzObj != null) {
                        Method methodInner2 = DoubleReflector.getMethodInner(this.mPerfClazz, "perfLockAcquire", Integer.TYPE, int[].class);
                        this.mPerfBoostMethod = methodInner2;
                        if (methodInner2 != null) {
                            return true;
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            Class<?> cls3 = Class.forName("android.util.BoostFramework", true, ClassLoader.getSystemClassLoader());
            this.mPerfClazz = cls3;
            try {
                this.mPerfClazzObj = DoubleReflectUtils.getConstructor(cls3, Context.class).newInstance(context);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                this.mPerfClazzObj = DoubleReflectUtils.getConstructor(this.mPerfClazz, new Class[0]).newInstance(new Object[0]);
            }
            this.mPerfBoostMethod = DoubleReflectUtils.getMethodInner(this.mPerfClazz, "perfLockAcquire", Integer.TYPE, int[].class);
            return true;
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean invokePerfBoostImpl(int[] iArr, int i) throws Throwable {
            fixQualcommUnTrustedAppAccessIssue();
            Method method = this.mPerfBoostMethod;
            if (method == null) {
                return false;
            }
            if ((this.mExtendBoostEnableLevel & 1) != 0) {
                if (iArr == null) {
                    iArr = FrameworkPerfLock.sQualcommPerfLockExtendGPU;
                }
            } else if (iArr == null) {
                iArr = FrameworkPerfLock.sQualcommPerfLockParas;
            }
            Object objA0 = C2204961BRm.a0(method, this.mPerfClazzObj, new Object[]{Integer.valueOf(i), iArr}, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            if (objA0 == null || ((Integer) objA0).intValue() <= 0) {
                return false;
            }
            return true;
        }
    }

    public static class QualcommOriginPerfLock extends PerfLockImpl {
        public AtomicBoolean mHasFixed;
        public Field mRestrictUnTrustedAppAccessField;

        private void fixQualcommUnTrustedAppAccessIssue() {
            if (PerfLockBooster.sFixQualUnTrustedAppAccessIssue && this.mHasFixed.compareAndSet(false, true)) {
                try {
                    Field fieldInner = DoubleReflectUtils.getFieldInner(this.mPerfClazz, "RestrictUnTrustedAppAccess");
                    this.mRestrictUnTrustedAppAccessField = fieldInner;
                    if (fieldInner != null) {
                        fieldInner.setBoolean(null, false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }

        public QualcommOriginPerfLock() {
            this.mHasFixed = new AtomicBoolean(false);
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean preparePerfParasImpl(Context context) throws ClassNotFoundException {
            Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("com.qualcomm.qti.Performance");
            this.mPerfClazz = clsLoadClass;
            this.mPerfClazzObj = DoubleReflectUtils.getConstructor(clsLoadClass, Context.class).newInstance(context);
            this.mPerfBoostMethod = DoubleReflectUtils.getMethodInner(this.mPerfClazz, "perfLockAcquire", Integer.TYPE, int[].class);
            return true;
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean invokePerfBoostImpl(int[] iArr, int i) throws Throwable {
            fixQualcommUnTrustedAppAccessIssue();
            Method method = this.mPerfBoostMethod;
            if (method == null) {
                return false;
            }
            if (iArr == null) {
                iArr = FrameworkPerfLock.sQualcommPerfLockParas;
            }
            Object objA0 = C2204961BRm.a0(method, this.mPerfClazzObj, new Object[]{Integer.valueOf(i), iArr}, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            if (objA0 == null || ((Integer) objA0).intValue() <= 0) {
                return false;
            }
            return true;
        }
    }

    public static class HuaweiAwarePerfLock extends PerfLockImpl {
        public HuaweiAwarePerfLock() {
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean preparePerfParasImpl(Context context) throws ClassNotFoundException {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    Class<?> cls = Class.forName("android.rms.iaware.IAwareSdk", true, ClassLoader.getSystemClassLoader());
                    this.mPerfClazz = cls;
                    if (cls != null) {
                        Method methodInner = DoubleReflector.getMethodInner(cls, "asyncSendData", String.class, Integer.TYPE);
                        this.mPerfBoostMethod = methodInner;
                        if (methodInner != null) {
                            return true;
                        }
                    }
                } else if (i >= 26) {
                    Class<?> cls2 = Class.forName("android.iawareperf.UniPerf", true, ClassLoader.getSystemClassLoader());
                    this.mPerfClazz = cls2;
                    if (DoubleReflector.getMethodInner(cls2, "getInstance", new Class[0]) != null) {
                        Method methodInner2 = DoubleReflector.getMethodInner(this.mPerfClazz, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                        this.mPerfBoostMethod = methodInner2;
                        if (methodInner2 != null) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            Class<?> cls3 = Class.forName("android.rms.iaware.IAwareSdk", true, ClassLoader.getSystemClassLoader());
            this.mPerfClazz = cls3;
            if (cls3 == null) {
                return false;
            }
            this.mPerfBoostMethod = DoubleReflectUtils.getMethodInner(cls3, "asyncSendData", String.class, Integer.TYPE);
            return true;
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean invokePerfBoostImpl(int[] iArr, int i) throws Throwable {
            int i2;
            if (iArr != null && iArr.length > 0) {
                i2 = iArr[0];
            } else {
                i2 = 4099;
            }
            Method method = this.mPerfBoostMethod;
            if (method == null) {
                return false;
            }
            C2204961BRm.a0(method, null, new Object[]{"UniperfClient", Integer.valueOf(i2)}, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            return true;
        }
    }

    public static class HuaweiUniperfPerfLock extends PerfLockImpl {
        public HuaweiUniperfPerfLock() {
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean preparePerfParasImpl(Context context) throws ClassNotFoundException {
            Class<?> cls = Class.forName("android.iawareperf.UniPerf", true, ClassLoader.getSystemClassLoader());
            this.mPerfClazz = cls;
            Method methodInner = DoubleReflectUtils.getMethodInner(cls, "getInstance", new Class[0]);
            if (methodInner != null) {
                this.mPerfClazzObj = C2204961BRm.a0(methodInner, null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            }
            if (this.mPerfClazzObj == null) {
                return false;
            }
            this.mPerfBoostMethod = DoubleReflectUtils.getMethodInner(this.mPerfClazz, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
            return true;
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean invokePerfBoostImpl(int[] iArr, int i) throws Throwable {
            int i2;
            if (iArr != null && iArr.length > 0) {
                i2 = iArr[0];
            } else {
                i2 = 4099;
            }
            Method method = this.mPerfBoostMethod;
            if (method == null) {
                return false;
            }
            C2204961BRm.a0(method, this.mPerfClazzObj, new Object[]{Integer.valueOf(i2), "", new int[]{i}}, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            return true;
        }
    }

    public static class MTCommonPerfLock extends PerfLockImpl {
        public MTCommonPerfLock() {
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean preparePerfParasImpl(Context context) throws ClassNotFoundException {
            Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("com.mediatek.boostframework.Performance");
            this.mPerfClazz = clsLoadClass;
            this.mPerfClazzObj = clsLoadClass.newInstance();
            this.mPerfBoostMethod = DoubleReflectUtils.getMethodInner(this.mPerfClazz, "perfLockAcquire", Integer.TYPE, int[].class);
            return true;
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean invokePerfBoostImpl(int[] iArr, int i) throws Throwable {
            if (iArr == null) {
                iArr = new int[]{8388608, 4, 8388864, 4, 4194304, 16777215, 4194560, 16777215};
            }
            Method method = this.mPerfBoostMethod;
            if (method == null) {
                return false;
            }
            C2204961BRm.a0(method, this.mPerfClazzObj, new Object[]{Integer.valueOf(i), iArr}, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            return true;
        }
    }

    public static class MTPowerHALPerfLock extends PerfLockImpl {
        public MTPowerHALPerfLock() {
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean preparePerfParasImpl(Context context) throws ClassNotFoundException {
            Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("com.mediatek.powerhalmgr.PowerHalMgrImpl");
            this.mPerfClazz = clsLoadClass;
            this.mPerfClazzObj = clsLoadClass.newInstance();
            Class<?> cls = this.mPerfClazz;
            Class cls2 = Integer.TYPE;
            this.mPerfBoostMethod = DoubleReflectUtils.getMethodInner(cls, "perfLockAcquire", cls2, cls2, int[].class);
            return true;
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean invokePerfBoostImpl(int[] iArr, int i) throws Throwable {
            if ((this.mExtendBoostEnableLevel & 1) != 0) {
                if (iArr == null) {
                    iArr = FrameworkPerfLock.sMTKPowerHalExtendParas;
                }
            } else if (iArr == null) {
                iArr = FrameworkPerfLock.sMTKPowerHalParas;
            }
            Method method = this.mPerfBoostMethod;
            if (method == null) {
                return false;
            }
            C2204961BRm.a0(method, this.mPerfClazzObj, new Object[]{0, Integer.valueOf(i), iArr}, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            return true;
        }
    }

    public static class OppoPerfLock extends PerfLockImpl {
        public OppoPerfLock() {
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean preparePerfParasImpl(Context context) throws ClassNotFoundException {
            Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("android.os.PerformanceManager");
            this.mPerfClazz = clsLoadClass;
            if (clsLoadClass == null) {
                return false;
            }
            this.mPerfBoostMethod = DoubleReflectUtils.getMethodInner(clsLoadClass, "enableMultiThreadOptimize", new Class[0]);
            return true;
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean invokePerfBoostImpl(int[] iArr, int i) throws Throwable {
            Method method = this.mPerfBoostMethod;
            if (method == null) {
                return false;
            }
            C2204961BRm.a0(method, null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            return true;
        }
    }

    public static class VivoPerfLock extends PerfLockImpl {
        public VivoPerfLock() {
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean preparePerfParasImpl(Context context) throws Throwable {
            Object objA0;
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            Class<?> clsLoadClass = systemClassLoader.loadClass("vivo.app.VivoFrameworkFactory");
            this.mPerfClazz = systemClassLoader.loadClass("vivo.app.vperf.AbsVivoPerfManager");
            Method methodInner = DoubleReflectUtils.getMethodInner(clsLoadClass, "getFrameworkFactoryImpl", new Class[0]);
            if (methodInner != null) {
                objA0 = C2204961BRm.a0(methodInner, null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            } else {
                objA0 = null;
            }
            Method methodInner2 = DoubleReflectUtils.getMethodInner(clsLoadClass, "getVivoPerfManager", Context.class);
            if (methodInner2 != null && objA0 != null) {
                this.mPerfClazzObj = C2204961BRm.a0(methodInner2, objA0, new Object[]{context}, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            }
            Class<?> cls = this.mPerfClazz;
            if (cls == null || this.mPerfClazzObj == null) {
                return false;
            }
            this.mPerfBoostMethod = DoubleReflectUtils.getMethodInner(cls, "perfLockAcquire", Integer.TYPE, int[].class);
            return true;
        }

        @Override // com.bytedance.sysoptimizer.perflock.FrameworkPerfLock.PerfLockImpl
        public boolean invokePerfBoostImpl(int[] iArr, int i) throws Throwable {
            Method method = this.mPerfBoostMethod;
            if (method == null) {
                return false;
            }
            if ((this.mExtendBoostEnableLevel & 1) != 0) {
                if (iArr == null) {
                    iArr = FrameworkPerfLock.sQualcommPerfLockExtendGPU;
                }
            } else if (iArr == null) {
                iArr = FrameworkPerfLock.sQualcommPerfLockParas;
            }
            Object objA0 = C2204961BRm.a0(method, this.mPerfClazzObj, new Object[]{Integer.valueOf(i), iArr}, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xsW9ygshqQe9EhPjWicAO65FIAA+pua5pMRo=", null));
            if (objA0 == null || ((Integer) objA0).intValue() <= 0) {
                return false;
            }
            return true;
        }
    }

    public static abstract class PerfLockImpl {
        public int mExtendBoostEnableLevel;
        public Method mPerfBoostMethod;
        public Class<?> mPerfClazz;
        public Object mPerfClazzObj;

        public boolean invokePerfBoostImpl(int[] iArr, int i) {
            return false;
        }

        public boolean preparePerfParasImpl(Context context) {
            return false;
        }

        public final boolean preparePerfParas(Context context) {
            try {
                return preparePerfParasImpl(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }

        public final void setExtendBoostEnable(int i) {
            this.mExtendBoostEnableLevel = i;
        }

        public final boolean invokePerfBoost(int[] iArr, int i) {
            try {
                return invokePerfBoostImpl(iArr, i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
    }

    public static PerfLockImpl getPerfLockImplByType(int i) {
        switch (i) {
            case 1:
                return new QualCommPerfLock();
            case 2:
                return new QualcommOriginPerfLock();
            case 3:
                return new MTCommonPerfLock();
            case 4:
                return new HuaweiAwarePerfLock();
            case 5:
                return new HuaweiUniperfPerfLock();
            case 6:
                return new OppoPerfLock();
            case 7:
                return new VivoPerfLock();
            case 8:
                return new MTPowerHALPerfLock();
            default:
                return null;
        }
    }
}
