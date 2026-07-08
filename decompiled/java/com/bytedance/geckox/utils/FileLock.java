package com.bytedance.geckox.utils;

import X.C0VSJ;
import X.C2188811AlT;
import X.C2222108nD;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FileLock {
    public static final Map<String, Integer> LIZJ = new HashMap();
    public final int LIZ;
    public final String LIZIZ;

    public static native int nGetFD(String str);

    public static native void nLockFile(int i);

    public static native void nLockFileSegment(int i, int i2);

    public static native void nRelease(int i);

    public static native boolean nTryLock(int i);

    public static native void nUnlockFile(int i);

    static {
        C2222108nD.LIZ("file_lock");
    }

    public final void LIZLLL() {
        Integer num;
        Map<String, Integer> map = LIZJ;
        synchronized (map) {
            try {
                num = (Integer) ((HashMap) map).remove(this.LIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        try {
            nRelease(num.intValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release lock failed, file:");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(" caused by:");
            sbLIZ.append(e.getMessage());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJI() {
        try {
            nUnlockFile(this.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release lock failed，path:");
            sbLIZ.append(this.LIZIZ);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static int LIZ(String str) {
        Integer numValueOf;
        Map<String, Integer> map = LIZJ;
        synchronized (map) {
            try {
                numValueOf = (Integer) ((HashMap) map).get(str);
                if (numValueOf == null) {
                    new C0VSJ(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    ((HashMap) map).put(str, numValueOf);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return numValueOf.intValue();
    }

    public static FileLock LIZIZ(String str) {
        try {
            int iLIZ = LIZ(str);
            nLockFile(iLIZ);
            return new FileLock(str, iLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lock failed, file:");
            sbLIZ.append(str);
            sbLIZ.append(", pid:");
            sbLIZ.append(Process.myPid());
            sbLIZ.append(" caused by:");
            sbLIZ.append(e.getMessage());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static FileLock LJ(String str) {
        try {
            int iLIZ = LIZ(str);
            if (!nTryLock(iLIZ)) {
                return null;
            }
            return new FileLock(str, iLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try lock failed, file:");
            sbLIZ.append(str);
            sbLIZ.append(" caused by:");
            sbLIZ.append(e.getMessage());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static FileLock LJFF(String str) {
        try {
            int iLIZ = LIZ(str);
            if (!nTryLock(iLIZ)) {
                new FileLock(str, iLIZ).LIZLLL();
                return null;
            }
            return new FileLock(str, iLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try lock failed, file:");
            sbLIZ.append(str);
            sbLIZ.append(" caused by:");
            sbLIZ.append(e.getMessage());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public FileLock(String str, int i) {
        this.LIZIZ = str;
        this.LIZ = i;
    }

    public static FileLock LIZJ(int i, String str) {
        try {
            int iLIZ = LIZ(str);
            nLockFileSegment(iLIZ, i);
            return new FileLock(str, iLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lock segment failed, file:");
            sbLIZ.append(str);
            sbLIZ.append(" caused by:");
            sbLIZ.append(e.getMessage());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
