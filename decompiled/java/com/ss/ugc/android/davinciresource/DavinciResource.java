package com.ss.ugc.android.davinciresource;

import com.ss.ugc.android.davinciresource.database.DBManagerFactory;
import com.ss.ugc.android.davinciresource.jni.AndroidExecutor;
import com.ss.ugc.android.davinciresource.jni.DAVDBManagerWrapper;
import com.ss.ugc.android.davinciresource.jni.DAVGcmCrypt;
import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLogger;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerListener;
import com.ss.ugc.android.davinciresource.jni.DAVNetworkClientDelegateWrapper;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipper;
import com.ss.ugc.android.davinciresource.jni.ExecutorSettings;
import com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper;

/* JADX INFO: loaded from: classes36.dex */
public final class DavinciResource {
    public static final DavinciResource INSTANCE = new DavinciResource();
    public static DBManagerFactory dbManagerFactory;
    public static AndroidExecutor executor;
    public static IDAVHTTPClientDelegateWrapper httpClient;
    public static DAVLogLevel logLevel;
    public static DAVLoggerListener logger;
    public static DAVUnZipFunc unZipper;

    static {
        DavinciResourceLibraryLoader.INSTANCE.loadLibrary();
        DAVUnZipper.setUnZipper(DefaultUnZipper.INSTANCE);
        DAVGcmCrypt.setGcmCrypt(DefaultGcmCrypt.INSTANCE);
        logLevel = DAVLogLevel.LEVEL_DEBUG;
    }

    public final DBManagerFactory getDbManagerFactory() {
        return dbManagerFactory;
    }

    public final AndroidExecutor getExecutor() {
        return executor;
    }

    public final IDAVHTTPClientDelegateWrapper getHttpClient() {
        return httpClient;
    }

    public final DAVLogLevel getLogLevel() {
        return logLevel;
    }

    public final DAVLoggerListener getLogger() {
        return logger;
    }

    public final DAVUnZipFunc getUnZipper() {
        return unZipper;
    }

    public final void setDbManagerFactory(DBManagerFactory dBManagerFactory) {
        if (dbManagerFactory != null) {
            return;
        }
        dbManagerFactory = dBManagerFactory;
        DAVDBManagerWrapper.setDBManagerFactory(dBManagerFactory);
    }

    public final void setExecutor(AndroidExecutor androidExecutor) {
        if (executor != null) {
            return;
        }
        executor = androidExecutor;
        ExecutorSettings.setExecutor(androidExecutor);
    }

    public final void setHttpClient(IDAVHTTPClientDelegateWrapper iDAVHTTPClientDelegateWrapper) {
        httpClient = iDAVHTTPClientDelegateWrapper;
        DAVNetworkClientDelegateWrapper.setHttpClientWrapper(iDAVHTTPClientDelegateWrapper);
    }

    public final void setLogLevel(DAVLogLevel dAVLogLevel) {
        logLevel = dAVLogLevel;
        DAVLogger.obtain().setLogLevel(dAVLogLevel);
    }

    public final void setLogger(DAVLoggerListener dAVLoggerListener) {
        logger = dAVLoggerListener;
        DAVLogger.obtain().setDelegate(logger);
    }

    public final void setUnZipper(DAVUnZipFunc dAVUnZipFunc) {
        unZipper = dAVUnZipFunc;
        DAVUnZipper.setUnZipper(dAVUnZipFunc);
    }
}
