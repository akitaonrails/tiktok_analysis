package com.bytedance.business.base;

import X.C1967307nD;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class BusinessToolsConfig {
    public static volatile BusinessToolsConfig mBusinessToolsConfig;
    public int aid;
    public int appVersionCode;
    public String appVersionName;
    public boolean isDebug;
    public C1967307nD mBugReportConfig;

    public C1967307nD getBugReportConfig() {
        return null;
    }

    public void setBugReportConfig(C1967307nD c1967307nD) {
    }

    public int getAid() {
        return this.aid;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public void setAid(int i) {
        this.aid = i;
    }

    public void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    public BusinessToolsConfig(String str, int i, int i2, boolean z) {
        this.appVersionName = str;
        this.appVersionCode = i;
        this.aid = i2;
        this.isDebug = z;
    }

    public static BusinessToolsConfig getInstance(String str, int i, int i2, boolean z) {
        if (mBusinessToolsConfig == null) {
            synchronized (BusinessToolsConfig.class) {
                try {
                    if (mBusinessToolsConfig == null) {
                        mBusinessToolsConfig = new BusinessToolsConfig(str, i, i2, z);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mBusinessToolsConfig;
    }
}
