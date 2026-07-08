package com.ss.bduploader.util;

import X.C2088908Gh;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.BDUploadUtil;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes21.dex */
public class BDUrlDispatch {
    public static volatile BDUrlDispatch mInstance;
    public final ReentrantReadWriteLock mDispatchlock = new ReentrantReadWriteLock();
    public long mDispatchDuration = -1;
    public String mTncTag = null;

    public static BDUrlDispatch inst() {
        if (mInstance == null) {
            synchronized (BDUrlDispatch.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new BDUrlDispatch();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    private String doOkHttpDispatchPrivate(String str, String str2) throws Exception {
        Class<?> cls = Class.forName("m14.l");
        Object objInvoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
        Boolean bool = (Boolean) cls.getMethod("isDispatchActionsEmpty", new Class[0]).invoke(objInvoke, new Object[0]);
        this.mTncTag = (String) cls.getMethod("getTncEtag", new Class[0]).invoke(objInvoke, new Object[0]);
        if (!bool.booleanValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Class<?> cls2 = Class.forName("m14.m");
            Object objInvoke2 = cls.getMethod("getDispatchResultForUrl", cls2).invoke(objInvoke, cls2.getConstructor(String.class, String.class).newInstance(str, str2));
            this.mDispatchDuration = System.currentTimeMillis() - jCurrentTimeMillis;
            if (objInvoke2 != null) {
                Class<?> cls3 = Class.forName("m14.e");
                String str3 = (String) cls3.getField("mDispatchedURL").get(objInvoke2);
                if (!str.equals(str3)) {
                    List list = (List) cls3.getField("mActionRuleIdList").get(objInvoke2);
                    if (str3.isEmpty() && !list.isEmpty()) {
                        throw new Exception("ERR_TTNET_TRAFFIC_CONTROL_DROP, -555");
                    }
                    if (C2088908Gh.LIZ(str3)) {
                        return str3;
                    }
                }
            }
        } else {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            String str4 = (String) cls.getMethod("handleHostMapping", String.class).invoke(objInvoke, str);
            this.mDispatchDuration = System.currentTimeMillis() - jCurrentTimeMillis2;
            if (!str.equals(str4) && C2088908Gh.LIZ(str4)) {
                return str4;
            }
        }
        return str;
    }

    public String getDispatchUrl(String str, String str2) {
        String strDoDispatchUrl;
        this.mDispatchlock.writeLock().lock();
        this.mDispatchDuration = -1L;
        try {
            strDoDispatchUrl = doOkHttpDispatchPrivate(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (BDUploadUtil.urlDispatch != null) {
                strDoDispatchUrl = BDUploadUtil.urlDispatch.doDispatchUrl(str, str2);
            } else {
                strDoDispatchUrl = null;
            }
        }
        this.mDispatchlock.writeLock().unlock();
        return strDoDispatchUrl;
    }
}
