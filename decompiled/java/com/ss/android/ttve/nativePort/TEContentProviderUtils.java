package com.ss.android.ttve.nativePort;

import X.C09NT;
import X.C09NX;
import X.C09NY;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2484209oO;
import X.C786410Ut5;
import android.app.Application;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TEContentProviderUtils {
    public static Application _initApplication;
    public static HashMap<String, String> sPathMap = new HashMap<>();
    public static String sMediaStoreVersion = null;

    public static Application getApplicationContext() {
        if (_initApplication == null) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, null);
                declaredField.setAccessible(true);
                _initApplication = (Application) declaredField.get(objInvoke);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[getApplicationContext] err: ");
                sbLIZ.append(th.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if ((C2484209oO.LIZIZ & 1) != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C2484209oO.LIZ);
                    sbLIZ2.append("TEContentProviderUtils");
                    TELogcat.nativeLog((byte) 1, C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ);
                }
            }
        }
        return _initApplication;
    }

    public static String getAndroidExternalDir() {
        File externalFilesDir;
        Application applicationContext = getApplicationContext();
        if (applicationContext == null || (externalFilesDir = applicationContext.getExternalFilesDir(null)) == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    public static ContentResolver getContentResolver() {
        Application applicationContext = getApplicationContext();
        if (applicationContext != null) {
            return applicationContext.getContentResolver();
        }
        return null;
    }

    public static boolean checkDownloadsDoc(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean checkExternalStorageDoc(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean checkGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean checkMediaDoc(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static String convertUriPathFromNative(String str) {
        Application applicationContext = getApplicationContext();
        if (applicationContext != null) {
            if (sMediaStoreVersion == null) {
                sMediaStoreVersion = getVersion(applicationContext);
            }
            if (sMediaStoreVersion != null && getVersion(applicationContext) != null && sMediaStoreVersion.equals(getVersion(applicationContext))) {
                if (sPathMap.containsKey(str)) {
                    return sPathMap.get(str);
                }
            } else {
                sMediaStoreVersion = getVersion(applicationContext);
                sPathMap.clear();
            }
            C2484209oO.LJI("TEContentProviderUtils-Q", "3");
            try {
                ContentResolver contentResolver = applicationContext.getContentResolver();
                Uri uri = UriProtector.parse(str);
                if (uri != null && contentResolver != null) {
                    String strConvertUriPath = convertUriPath(applicationContext, uri);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[convertUriPathFromNative] from db. uriPath = ");
                    sbLIZ.append(C2484209oO.LJFF(str));
                    sbLIZ.append(", convertPath = ");
                    sbLIZ.append(C2484209oO.LJFF(strConvertUriPath));
                    C2484209oO.LJI("TEContentProviderUtils-Q", C2188811AlT.LIZIZ(sbLIZ));
                    sPathMap.put(str, strConvertUriPath);
                    return strConvertUriPath;
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2484209oO.LIZIZ(TEContentProviderUtils.class, "[getFd] err", th);
                return null;
            }
        }
        return null;
    }

    public static String getExtensionFromUri(String str) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(getFileTypeFromUri(str));
    }

    public static String getFileTypeFromUri(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C09NY c09ny = C09NX.LIZ;
        if (c09ny.LIZJ.containsKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFileTypeFromUri cache cost = ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ.append(", filePath = ");
            sbLIZ.append(str);
            C2484209oO.LIZ("TEContentProviderUtils", C2188811AlT.LIZIZ(sbLIZ));
            return c09ny.LIZJ.get(str);
        }
        Application applicationContext = getApplicationContext();
        String type = null;
        if (applicationContext != null) {
            try {
                Uri uri = UriProtector.parse(str);
                ContentResolver contentResolver = applicationContext.getContentResolver();
                if (uri != null && contentResolver != null) {
                    type = contentResolver.getType(uri);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2484209oO.LIZIZ(TEContentProviderUtils.class, "[getFileTypeFromUri] err", th);
            }
        }
        C09NX.LIZ.LIZJ.put(str, type);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getFileTypeFromUri cost = ");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ2.append(", filePath = ");
        sbLIZ2.append(str);
        C2484209oO.LIZ("TEContentProviderUtils", C2188811AlT.LIZIZ(sbLIZ2));
        return type;
    }

    public static String getVersion(Context context) {
        ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("media");
        if (contentProviderClientAcquireContentProviderClient != null) {
            contentProviderClientAcquireContentProviderClient.release();
            return MediaStore.getVersion(context);
        }
        return null;
    }

    public static String convertUriPath(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (checkExternalStorageDoc(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C786410Ut5.W3());
                    sbLIZ.append("/");
                    sbLIZ.append(strArrSplit[1]);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                if (checkDownloadsDoc(uri)) {
                    return getColumnByUri(context, ContentUris.withAppendedId(UriProtector.parse("content://downloads/public_downloads"), CastLongProtector.parseLong(DocumentsContract.getDocumentId(uri))), null, null);
                }
                if (checkMediaDoc(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = strArrSplit2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getColumnByUri(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (checkGooglePhotosUri(uri)) {
                    return uri.getLastPathSegment();
                }
                return getColumnByUri(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static int getFd(String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Application applicationContext = getApplicationContext();
        int iDetachFd = -1;
        if (applicationContext != null) {
            try {
                ContentResolver contentResolver = applicationContext.getContentResolver();
                Uri uri = UriProtector.parse(str);
                if (uri != null && contentResolver != null) {
                    iDetachFd = C09NT.LIZLLL(contentResolver, uri, str2).detachFd();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2484209oO.LIZIZ(TEContentProviderUtils.class, "[getFd] err", th);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFd cost = ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ.append(", filePath = ");
        sbLIZ.append(str);
        C2484209oO.LIZ("TEContentProviderUtils", C2188811AlT.LIZIZ(sbLIZ));
        return iDetachFd;
    }

    public static String getColumnByUri(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), uri, new String[]{"_data"}, str, strArr, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ijp4THEeUSrkZ0cDL+sqvym1XjwTqZurQsvtbhpWYKvbH2E=", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        String string = cursorLJJJ.getString(cursorLJJJ.getColumnIndexOrThrow("_data"));
                        cursorLJJJ.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorLJJJ;
                    TryCatchGuardChecker.doCheck(th);
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorLJJJ != null) {
                cursorLJJJ.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
