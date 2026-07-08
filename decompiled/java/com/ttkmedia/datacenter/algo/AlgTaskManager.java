package com.ttkmedia.datacenter.algo;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class AlgTaskManager {

    public static class Holder {
        public static final AlgTaskManager inst = new AlgTaskManager();
    }

    private native boolean _isReady();

    private native int _postTask(String str, HashMap<String, Object> map, AlgTaskConfig algTaskConfig, AlgTaskCallback algTaskCallback);

    private native int _syncPostTask(String str, HashMap<String, Object> map, AlgTaskConfig algTaskConfig, AlgTaskCallback algTaskCallback);

    public boolean isReady() {
        try {
            return _isReady();
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public AlgTaskManager() {
    }

    public static AlgTaskManager getInstance() {
        return Holder.inst;
    }

    public int postTask(String str, HashMap<String, Object> map, AlgTaskConfig algTaskConfig, AlgTaskCallback algTaskCallback) {
        try {
            return _postTask(str, map, algTaskConfig, algTaskCallback);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public int syncPostTask(String str, HashMap<String, Object> map, AlgTaskConfig algTaskConfig, AlgTaskCallback algTaskCallback) {
        try {
            return _syncPostTask(str, map, algTaskConfig, algTaskCallback);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }
}
