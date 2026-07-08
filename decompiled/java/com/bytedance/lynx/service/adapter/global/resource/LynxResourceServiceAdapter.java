package com.bytedance.lynx.service.adapter.global.resource;

import X.AbstractC1289780jfU;
import X.C0VSJ;
import X.C1522030pi5;
import X.C1530340pvU;
import X.C1530350pvV;
import X.C1530360pvW;
import X.C1533510q0b;
import X.C1533560q0g;
import X.C1533570q0h;
import X.C1533790q13;
import X.C1533910q1F;
import X.C1550610qSB;
import X.C1956907lX;
import X.EnumC1533980q1M;
import X.InterfaceC1289770jfT;
import X.InterfaceC1301400jyE;
import X.InterfaceC1476390oWT;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class LynxResourceServiceAdapter implements InterfaceC1476390oWT {
    public static File appFileDir;
    public static C1533560q0g forestConfig;
    public static Forest forestLoader;
    public static HashMap<String, Forest> forestLoaderMap;
    public static C1522030pi5 lynxServiceConfig;
    public static final LynxResourceServiceAdapter INSTANCE = new LynxResourceServiceAdapter();
    public static final ReentrantReadWriteLock loaderMapLock = new ReentrantReadWriteLock();

    private final C1533560q0g initForestConfig() {
        C1522030pi5 c1522030pi5 = lynxServiceConfig;
        String str = (c1522030pi5 == null ? null : c1522030pi5).LIZJ;
        if (c1522030pi5 == null) {
            c1522030pi5 = null;
        }
        Long lValueOf = Long.valueOf(CastLongProtector.parseLong(c1522030pi5.LIZLLL));
        C1522030pi5 c1522030pi52 = lynxServiceConfig;
        String str2 = (c1522030pi52 == null ? null : c1522030pi52).LJ;
        String str3 = (c1522030pi52 == null ? null : c1522030pi52).LJI;
        if (c1522030pi52 == null) {
            c1522030pi52 = null;
        }
        C1533570q0h c1533570q0h = new C1533570q0h("", str, lValueOf, str2, str3, c1522030pi52.LJII, true, 128);
        C1522030pi5 c1522030pi53 = lynxServiceConfig;
        C1533560q0g c1533560q0g = new C1533560q0g((c1522030pi53 != null ? c1522030pi53 : null).LIZIZ, c1533570q0h, 4);
        c1533560q0g.LJI = true;
        return c1533560q0g;
    }

    private final boolean isForestInitial() {
        return forestLoader != null;
    }

    @Override // X.InterfaceC1476390oWT
    public void initForest() {
        C1522030pi5 c1522030pi5 = lynxServiceConfig;
        if (c1522030pi5 == null) {
            c1522030pi5 = null;
        }
        forestLoader = new Forest(c1522030pi5.LIZ, forestConfig);
    }

    @Override // X.InterfaceC1476390oWT
    public boolean isInitial() {
        return (forestConfig == null || forestLoaderMap == null) ? false : true;
    }

    private final RequestParams createRequestParams(C1530360pvW c1530360pvW) {
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.resourceScene = EnumC1533980q1M.valueOf(c1530360pvW.LIZ.toString());
        requestParams.enableMemoryCache = c1530360pvW.LIZIZ;
        requestParams.enableRequestReuse = c1530360pvW.LIZJ.booleanValue();
        return requestParams;
    }

    private final Forest getLoader(String str) {
        Forest forest = null;
        if (!isInitial()) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = loaderMapLock;
        reentrantReadWriteLock.readLock().lock();
        HashMap<String, Forest> map = forestLoaderMap;
        if (map != null) {
            forest = map.get(str);
        }
        reentrantReadWriteLock.readLock().unlock();
        return forest;
    }

    @Override // X.InterfaceC1476390oWT
    public String getPrefixAsGeckoCDN(String str) {
        return GeckoXAdapter.Companion.getPrefixAsGeckoCDN(str);
    }

    @Override // X.InterfaceC1476390oWT
    public void initLynxResourceServiceAdapter(C1522030pi5 c1522030pi5) {
        lynxServiceConfig = c1522030pi5;
        forestConfig = initForestConfig();
        forestLoaderMap = new HashMap<>();
    }

    private final void setLoader(String str, Forest forest) {
        if (!isInitial()) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = loaderMapLock;
        reentrantReadWriteLock.writeLock().lock();
        HashMap<String, Forest> map = forestLoaderMap;
        if (map != null) {
            map.put(str, forest);
        }
        reentrantReadWriteLock.writeLock().unlock();
    }

    @Override // X.InterfaceC1476390oWT
    public void addResourceLoader(Object obj, String str) {
        if (obj instanceof Forest) {
            setLoader(str, (Forest) obj);
        } else {
            LynxLog.e("LynxResourceServiceAdapter", "resourceLoader is not forest instance, add resource loader failed.");
        }
    }

    @Override // X.InterfaceC1476390oWT
    public InterfaceC1289770jfT fetchResourceSync(String str, C1530360pvW c1530360pvW) {
        C1533790q13 c1533790q13LIZIZ;
        if (!isForestInitial()) {
            initForest();
        }
        c1530360pvW.getClass();
        C1533910q1F c1533910q1FCreateSyncRequest = forestLoader.createSyncRequest(str, createRequestParams(c1530360pvW));
        if (c1533910q1FCreateSyncRequest == null || (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) == null) {
            return null;
        }
        return new C1530340pvU(c1533790q13LIZIZ);
    }

    public void preload(String str, C1530360pvW c1530360pvW) {
        if (!isForestInitial()) {
            initForest();
        }
        Forest.preload$default(forestLoader, str, createRequestParams(c1530360pvW), false, null, null, 28, null);
    }

    @Override // X.InterfaceC1476390oWT
    public InterfaceC1301400jyE fetchResourceAsync(String str, C1530360pvW c1530360pvW, AbstractC1289780jfU abstractC1289780jfU) {
        if (!isForestInitial()) {
            initForest();
        }
        c1530360pvW.getClass();
        final C1533910q1F c1533910q1FFetchResourceAsync = forestLoader.fetchResourceAsync(str, createRequestParams(c1530360pvW), new C1530350pvV(abstractC1289780jfU));
        if (c1533910q1FFetchResourceAsync != null) {
            return new InterfaceC1301400jyE(c1533910q1FFetchResourceAsync) { // from class: X.0pvX
            };
        }
        return null;
    }

    public String parseChannelBundleByPrefix(String str, String str2, String str3) {
        C1533510q0b c1533510q0bLIZIZ = C1956907lX.LIZIZ(str, str2);
        if (c1533510q0bLIZIZ != null) {
            if (appFileDir == null) {
                C1522030pi5 c1522030pi5 = lynxServiceConfig;
                if (c1522030pi5 == null) {
                    c1522030pi5 = null;
                }
                appFileDir = c1522030pi5.LIZ.getFilesDir();
            }
            C1522030pi5 c1522030pi52 = lynxServiceConfig;
            if (c1522030pi52 == null) {
                c1522030pi52 = null;
            }
            String str4 = c1522030pi52.LIZJ;
            try {
                C0VSJ c0vsj = new C0VSJ(appFileDir, str4);
                if (!c0vsj.exists()) {
                    c0vsj.mkdirs();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                new C0VSJ(str4);
            }
            String str5 = C1550610qSB.LIZIZ(str3, c1533510q0bLIZIZ.LIZIZ) + File.separator + a0.LJJJJZ("/", c1533510q0bLIZIZ.LIZJ);
            if (new C0VSJ(str5).exists()) {
                return str5;
            }
        }
        return null;
    }
}
