package com.samsung.sdk.sperf;

import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes32.dex */
public class SPerfManager {
    public static BoostLevelControl boostLevelControl;
    public static SPerfManager mInstance;
    public static int nextBoostObjectID;
    public static SessionControl sessionControl;
    public static SPerfInitThread sPerfThread = new SPerfInitThread();
    public static Context mContext = null;
    public static HashMap<Integer, TaskBoostReleaseHandler> releaserHash = new HashMap<>();

    public static SPerfManager initSPerfManager() {
        String str;
        if (mInstance == null) {
            SessionControl sessionControlCreateInstance = SessionControl.createInstance();
            sessionControl = sessionControlCreateInstance;
            if (sessionControlCreateInstance == null) {
                str = "ERROR : Initialize Fail (Session)";
            } else {
                BoostLevelControl boostLevelControlCreateInstance = BoostLevelControl.createInstance(sessionControlCreateInstance);
                boostLevelControl = boostLevelControlCreateInstance;
                if (boostLevelControlCreateInstance == null) {
                    str = "ERROR : Initialize Fail (BoostingLevelSet)";
                } else {
                    mInstance = new SPerfManager();
                }
            }
            SPerfUtil.logAlways(str);
            return null;
        }
        return mInstance;
    }

    public static void startTaskReleaseHandler(int i, int i2) {
        HashMap<Integer, TaskBoostReleaseHandler> map = releaserHash;
        if (map == null) {
            return;
        }
        map.get(Integer.valueOf(i)).startBoostTimeout(i2);
    }

    public void addSPerfListerner(SPerfListener sPerfListener) {
        String str;
        if (sPerfListener == null) {
            str = "ERROR : Null listener (addPerfSDKListerner)";
        } else {
            SessionControl sessionControl2 = sessionControl;
            if (sessionControl2 != null) {
                sessionControl2.addListerner(sPerfListener);
                return;
            }
            str = "ERROR : SessionControl Should be initialized";
        }
        SPerfUtil.log(str);
    }

    public int createBoostID() {
        int i;
        synchronized (this) {
            try {
                i = nextBoostObjectID;
                nextBoostObjectID = i + 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    public int startBoost(BoostObject boostObject) {
        if (boostObject == null) {
            SPerfUtil.log("ERROR : null boost object (doBoost)");
            return -1;
        }
        if (boostObject.getID() == -1) {
            boostObject.setID(createBoostID());
        }
        return Boost.requestNativeBoost(boostObject);
    }

    public int startPresetBoost(int i, int i2) {
        String str;
        BoostLevelControl boostLevelControl2 = boostLevelControl;
        if (boostLevelControl2 == null) {
            str = "ERROR : BoostLevelControl Should be initialized";
        } else {
            if (i2 >= 0) {
                return startBoost(boostLevelControl2.getBoostObjectByScenario(i, i2));
            }
            str = "ERROR : timeout coundn't be less than 0";
        }
        SPerfUtil.log(str);
        return -1;
    }

    public int stopBoost() {
        if (boostLevelControl != null) {
            return Boost.releaseNativeBoost();
        }
        SPerfUtil.log("ERROR : BoostLevelControl Should be initialized");
        return -1;
    }

    public int stopBoost(int i, int i2) {
        if (boostLevelControl != null) {
            return Boost.releaseNativeBoost(i, i2);
        }
        SPerfUtil.log("ERROR : BoostLevelControl Should be initialized");
        return -1;
    }

    public int updateBoost(int i, int i2, int i3, BoostObject boostObject) {
        BoostLevelControl boostLevelControl2 = boostLevelControl;
        if (boostLevelControl2 != null) {
            return boostLevelControl2.updateBoost(i, i2, i3, boostObject);
        }
        SPerfUtil.log("ERROR : Initialize Fail boostLevel not exist (updateBoost)");
        return -1;
    }

    public static SPerfManager createInstance(Context context) {
        SPerfManager sPerfManager;
        synchronized (SPerfManager.class) {
            try {
                sPerfManager = mInstance;
                if (sPerfManager == null) {
                    sPerfManager = null;
                    if (context == null) {
                        SPerfUtil.logAlways("ERROR : Context is Null");
                    } else {
                        BPEAThread bPEAThread = new BPEAThread(sPerfThread);
                        try {
                            bPEAThread.start();
                            ThreadMethodProxy.join(bPEAThread);
                            sPerfManager = sPerfThread.getSPerfManager();
                            mContext = context;
                            int i = 0;
                            do {
                                if (CustomParams.getBoostType(i) == 1 && mContext != null) {
                                    releaserHash.put(Integer.valueOf(i), new TaskBoostReleaseHandler(mContext, sPerfManager, i));
                                }
                                i++;
                            } while (i < 11);
                        } catch (IllegalThreadStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                            SPerfUtil.logAlways("ERROR : IllegalThreadStateException");
                        } catch (InterruptedException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            SPerfUtil.logAlways("ERROR : InterruptedException");
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return sPerfManager;
    }
}
