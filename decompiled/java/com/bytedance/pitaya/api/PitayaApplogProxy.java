package com.bytedance.pitaya.api;

import X.C08RN;
import X.C08RY;
import X.C08RZ;
import X.C09BH;
import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import X.InterfaceC2117008Rc;
import android.app.Application;
import android.content.Context;
import com.bytedance.pitaya.api.bean.PTYApplogEvent;
import com.bytedance.pitaya.api.bean.PTYApplogEventType;
import com.bytedance.pitaya.api.bean.PTYProxySetting;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class PitayaApplogProxy implements ReflectionCall, InterfaceC2117008Rc {
    public volatile C08RZ<PTYApplogEvent> cache;
    public volatile boolean init;
    public volatile boolean stoped;
    public final String TAG = "PTY-ApplogProxy";
    public final String APPLOG_CFGPATH = "/Pitaya/CFG/APPLOG_CACHE_KEY";
    public volatile Set<String> filterSet = new LinkedHashSet();

    public final int cacheSize() {
        int size;
        synchronized (this) {
            try {
                C08RZ<PTYApplogEvent> c08rz = this.cache;
                size = c08rz != null ? c08rz.LIZIZ.size() : 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return size;
    }

    public final String getAPPLOG_CFGPATH() {
        return this.APPLOG_CFGPATH;
    }

    public final boolean getInit() {
        return this.init;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public static File INVOKEVIRTUAL_com_bytedance_pitaya_api_PitayaApplogProxy_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    private final Set<String> stringToSet(String str) {
        List listLJJLIIIJILLIZJL;
        if (str != null) {
            listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL = null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (listLJJLIIIJILLIZJL != null && (!listLJJLIIIJILLIZJL.isEmpty())) {
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(it2.next());
            }
        }
        return linkedHashSet;
    }

    public final boolean init(PTYProxySetting pTYProxySetting) {
        String absolutePath;
        File fileINVOKEVIRTUAL_com_bytedance_pitaya_api_PitayaApplogProxy_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir;
        if (pTYProxySetting.getUseCustomApplogEvents()) {
            this.filterSet = stringToSet(pTYProxySetting.getCustomApplogEvents());
            if (this.filterSet.size() == 0) {
                return false;
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Context contextLIZ = C08RY.LIZ();
            if (contextLIZ != null && (fileINVOKEVIRTUAL_com_bytedance_pitaya_api_PitayaApplogProxy_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = INVOKEVIRTUAL_com_bytedance_pitaya_api_PitayaApplogProxy_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(contextLIZ)) != null) {
                absolutePath = fileINVOKEVIRTUAL_com_bytedance_pitaya_api_PitayaApplogProxy_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            sbLIZ.append(absolutePath);
            sbLIZ.append(this.APPLOG_CFGPATH);
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (!c0vsj.exists()) {
                this.init = true;
                this.stoped = true;
                return false;
            }
            try {
                this.filterSet = stringToSet(C09BH.LJI(c0vsj, Charsets.UTF_8));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        this.cache = new C08RZ<>(pTYProxySetting.getMaxApplogEventCacheNum());
        this.init = true;
        return true;
    }

    @Override // X.InterfaceC2117008Rc
    public boolean isValidEvent(String str) {
        if (str.length() != 0 && this.init && this.filterSet.size() > 0 && this.filterSet.contains(str)) {
            return true;
        }
        return false;
    }

    public final void setInit(boolean z) {
        this.init = z;
    }

    public final void storeCache(PTYApplogImplCallback pTYApplogImplCallback) {
        if (this.stoped) {
            return;
        }
        synchronized (this) {
            try {
                this.stoped = true;
                if (cacheSize() == 0) {
                    return;
                }
                Iterator<PTYApplogEvent> it2 = this.cache.LIZIZ.iterator();
                while (it2.hasNext()) {
                    pTYApplogImplCallback.onEvent(it2.next());
                }
                C08RZ<PTYApplogEvent> c08rz = this.cache;
                if (c08rz != null) {
                    c08rz.LIZIZ.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void onEvent(String str, JSONObject jSONObject) {
        String strJ3;
        if (this.init && this.filterSet.size() > 0 && this.filterSet.contains(str)) {
            synchronized (this) {
                try {
                    if (this.stoped) {
                        return;
                    }
                    if (jSONObject != null) {
                        try {
                            strJ3 = C786410Ut5.J3(jSONObject);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return;
                        }
                    } else {
                        strJ3 = null;
                    }
                    C08RZ<PTYApplogEvent> c08rz = this.cache;
                    if (c08rz != null) {
                        PTYApplogEvent pTYApplogEvent = new PTYApplogEvent(str, strJ3, PTYApplogEventType.COLD_START);
                        if (c08rz.LIZIZ.size() >= c08rz.LIZ) {
                            c08rz.LIZIZ.removeFirst();
                        }
                        c08rz.LIZIZ.addLast(pTYApplogEvent);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    public final void onEvent(String str, String str2) {
        if (this.init && this.filterSet.size() > 0 && this.filterSet.contains(str)) {
            synchronized (this) {
                try {
                    if (this.stoped) {
                        return;
                    }
                    C08RZ<PTYApplogEvent> c08rz = this.cache;
                    if (c08rz != null) {
                        PTYApplogEvent pTYApplogEvent = new PTYApplogEvent(str, str2, PTYApplogEventType.COLD_START);
                        if (c08rz.LIZIZ.size() >= c08rz.LIZ) {
                            c08rz.LIZIZ.removeFirst();
                        }
                        c08rz.LIZIZ.addLast(pTYApplogEvent);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
