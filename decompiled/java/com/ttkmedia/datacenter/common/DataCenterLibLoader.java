package com.ttkmedia.datacenter.common;

import X.C2188811AlT;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DataCenterLibLoader {
    public static ILibraryLoader mLibraryLoader;
    public static final String TAG = "DataCenterLibLoader";
    public static ILibraryLoader mDefaultLibLoader = new DefaultLibraryLoader();
    public static boolean mLibraryLoaded = false;
    public static boolean IsErrored = false;
    public static String mErrorInfo = null;

    public static final synchronized void loadLibrary() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("c++_shared");
            arrayList.add("vcbasekit");
            arrayList.add("npth_dl");
            arrayList.add("cybertron_base");
            IsErrored = loadLibs(arrayList, false) ? false : true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            IsErrored = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load default library error.");
            sbLIZ.append(th.toString());
            mErrorInfo = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static class DefaultLibraryLoader implements ILibraryLoader {
        public DefaultLibraryLoader() {
        }

        public static void INVOKESTATIC_com_ttkmedia_datacenter_common_DataCenterLibLoader$DefaultLibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
        }

        @Override // com.ttkmedia.datacenter.common.ILibraryLoader
        public boolean onLoadNativeLibs(List<String> list) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    INVOKESTATIC_com_ttkmedia_datacenter_common_DataCenterLibLoader$DefaultLibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(it2.next());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    DataCenterLibLoader.mErrorInfo = th.getMessage();
                    return false;
                }
            }
            return true;
        }
    }

    public static String getErrorInfo() {
        return mErrorInfo;
    }

    public static boolean isError() {
        return IsErrored;
    }

    public static boolean isLoaded() {
        return mLibraryLoaded;
    }

    public static synchronized boolean loadDebugLibrary(File file) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("c++_shared");
            arrayList.add("vcbasekit");
            arrayList.add("npth_dl");
            if (!loadLibs(arrayList, false)) {
                z = true;
            } else {
                z = false;
            }
            IsErrored = z;
            System.load(file.getAbsolutePath());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            IsErrored = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load default library error.");
            sbLIZ.append(th.toString());
            mErrorInfo = C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        return true;
    }

    public static final void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        mLibraryLoader = iLibraryLoader;
    }

    public static boolean loadLibs(List<String> list, boolean z) {
        boolean z2 = mLibraryLoaded;
        if ((!z) & z2) {
            return z2;
        }
        ILibraryLoader iLibraryLoader = mLibraryLoader;
        if (iLibraryLoader != null) {
            try {
                mLibraryLoaded = iLibraryLoader.onLoadNativeLibs(list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                mErrorInfo = th.getMessage();
            }
        } else {
            mLibraryLoaded = mDefaultLibLoader.onLoadNativeLibs(list);
        }
        return mLibraryLoaded;
    }
}
