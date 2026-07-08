package com.bytedance.zoin.model;

import X.C0VSJ;
import X.C2188811AlT;
import X.C2418409dm;
import X.C2421809eK;
import X.C2421909eL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractModule {
    public String algorithm;
    public int maxRetryCounts = 2;
    public boolean moduleInited;
    public String moduleName;
    public int moduleType;
    public boolean preFallocate;

    public boolean checkDecompressedFiles() {
        return true;
    }

    public abstract C2421909eL decode(boolean z);

    public C2421909eL doRetryLoad() {
        C2421909eL c2421909eLDecode;
        synchronized (this) {
            try {
                if (isDecoded()) {
                    c2421909eLDecode = install();
                    if (c2421909eLDecode.LIZ != 0) {
                    }
                } else {
                    c2421909eLDecode = decode(false);
                    if (c2421909eLDecode.LIZ != 0) {
                        processWhenFailedFirst();
                        c2421909eLDecode = decode(false);
                    }
                    if (c2421909eLDecode.LIZ == 0) {
                        c2421909eLDecode = install();
                    }
                }
                C2421809eK.LJ(C2421809eK.LIZLLL(this.moduleName, "is_first_load"), false);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c2421909eLDecode;
    }

    public abstract void doWhenUpdateApk();

    public abstract AbstractModule findByFileName(String str);

    public void init() {
    }

    public abstract C2421909eL install();

    public abstract boolean isDecoded();

    public int preFallocate(List<ZoinBuildFileInfo> list) {
        return 0;
    }

    public void processWhenFailedFirst() {
    }

    public void reset() {
    }

    public abstract void setDecoded();

    public abstract void setModuleInfo(AbstractModuleInfo abstractModuleInfo);

    public abstract void setNotDecoded();

    public int hashCode() {
        String str = this.moduleName;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.moduleType;
        return (iHashCode * 31) + (i ^ (i >>> 32));
    }

    public boolean isModuleInited() {
        return this.moduleInited;
    }

    public C2421909eL doLoad(boolean z) {
        C2421909eL c2421909eLDecode;
        synchronized (this) {
            try {
                System.currentTimeMillis();
                if (isDecoded()) {
                    c2421909eLDecode = install();
                    if (c2421909eLDecode.LIZ != 0) {
                    }
                } else {
                    c2421909eLDecode = decode(z);
                    if (c2421909eLDecode.LIZ == 0) {
                        c2421909eLDecode = install();
                    }
                }
                C2421809eK.LJ(C2421809eK.LIZLLL(this.moduleName, "is_first_load"), false);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c2421909eLDecode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractModule)) {
            return false;
        }
        AbstractModule abstractModule = (AbstractModule) obj;
        if (this.moduleName.equals(abstractModule.moduleName) && this.moduleType == abstractModule.moduleType) {
            return true;
        }
        return false;
    }

    public void renameTempFiles(File file, List<ZoinBuildFileInfo> list) {
        for (ZoinBuildFileInfo zoinBuildFileInfo : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(zoinBuildFileInfo.name);
            sbLIZ.append(".temp");
            C0VSJ c0vsj = new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists()) {
                C0VSJ c0vsj2 = new C0VSJ(file, zoinBuildFileInfo.name);
                if (!c0vsj.renameTo(c0vsj2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("rename files failed ");
                    sbLIZ2.append(c0vsj.getPath());
                    sbLIZ2.append(" ");
                    sbLIZ2.append(c0vsj2.getPath());
                    throw new C2418409dm(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    }
}
