package com.ttnet.org.chromium.base;

import X.C08VH;
import X.C09NE;
import X.C0VSJ;
import X.C786410Ut5;
import X.C787230UuP;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StrictMode;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PathUtils {
    static {
        new AtomicBoolean();
    }

    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        C09NE c09ne = new C09NE(StrictMode.allowThreadDiskWrites(), null);
        try {
            File[] externalFilesDirs = C787230UuP.LIZ.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            c09ne.close();
            return LIZ(arrayList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                c09ne.close();
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static String getAppExternalCacheDirectory() {
        File fileX2 = C786410Ut5.x2(C787230UuP.LIZ);
        return fileX2 == null ? "" : fileX2.getAbsolutePath();
    }

    public static String[] getExternalDownloadVolumesNames() {
        ArrayList arrayList = new ArrayList();
        for (String str : MediaStore.getExternalVolumeNames(C787230UuP.LIZ)) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                File directory = ((StorageManager) C787230UuP.LIZ.getSystemService(StorageManager.class)).getStorageVolume(MediaStore.Files.getContentUri(str)).getDirectory();
                C0VSJ c0vsj = new C0VSJ(directory, Environment.DIRECTORY_DOWNLOADS);
                if (!c0vsj.isDirectory()) {
                    Object[] objArr = {c0vsj.getAbsolutePath(), directory.getAbsolutePath(), Boolean.valueOf(directory.isDirectory())};
                    C08VH.LIZIZ("Download dir missing: %s, parent dir:%s, isDirectory:%s", C08VH.LIZJ(objArr), objArr);
                }
                arrayList.add(c0vsj);
            }
        }
        return LIZ(arrayList);
    }

    public static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = C787230UuP.LIZ.getApplicationInfo();
        int i = applicationInfo.flags;
        return ((i & 128) != 0 || (i & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    public static String getDownloadsDirectory() {
        C09NE c09ne = new C09NE(StrictMode.allowThreadDiskReads(), null);
        try {
            if (Build.VERSION.SDK_INT < 29) {
                String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                c09ne.close();
                return path;
            }
            String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
            String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
            c09ne.close();
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                c09ne.close();
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static String getExternalStorageDirectory() {
        return C786410Ut5.W3().getAbsolutePath();
    }

    public static String getCacheDirectory() {
        throw null;
    }

    public static String getDataDirectory() {
        throw null;
    }

    public static String getThumbnailCacheDirectory() {
        throw null;
    }

    public static String[] LIZ(List<File> list) {
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
