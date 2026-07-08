package com.samsung.sdk.sperf;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes32.dex */
public class CustomParams {
    public static SPerfManager sPerfManager;
    public BoostObject boostObj;
    public boolean isBoostObjUpdated;

    public static int getBoostType(int i) {
        return (i == 8 || i == 9) ? 1 : 0;
    }

    public int add(int i, int i2, int i3) {
        synchronized (this) {
            try {
                if (this.boostObj == null) {
                    this.boostObj = new BoostObject();
                    this.isBoostObjUpdated = false;
                }
                if (sPerfManager == null) {
                    SPerfManager sPerfManagerCreateInstance = SPerfManager.createInstance(null);
                    sPerfManager = sPerfManagerCreateInstance;
                    if (sPerfManagerCreateInstance == null) {
                        return -1;
                    }
                }
                int iUpdateBoost = sPerfManager.updateBoost(i, i2, i3, this.boostObj);
                if (iUpdateBoost >= 0) {
                    this.isBoostObjUpdated = true;
                }
                return iUpdateBoost;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public BoostObject getBoostObject() {
        if (this.isBoostObjUpdated) {
            return this.boostObj;
        }
        return null;
    }
}
