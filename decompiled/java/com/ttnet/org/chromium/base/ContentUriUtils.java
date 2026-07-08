package com.ttnet.org.chromium.base;

import X.C08VH;
import X.C09NT;
import X.C0VSJ;
import X.C0WZX;
import X.C2204961BRm;
import X.C787230UuP;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ContentUriUtils {
    public static final Object LIZ = new Object();

    public static AssetFileDescriptor LIZ(String str) {
        ContentResolver contentResolver = C787230UuP.LIZ.getContentResolver();
        Uri uri = UriProtector.parse(str);
        try {
            if (LIZLLL(uri)) {
                String[] streamTypes = contentResolver.getStreamTypes(uri, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, streamTypes[0], null);
                    if (assetFileDescriptorOpenTypedAssetFileDescriptor != null && assetFileDescriptorOpenTypedAssetFileDescriptor.getStartOffset() != 0) {
                        try {
                            assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        throw new SecurityException("Cannot open files with non-zero offset type.");
                    }
                    return assetFileDescriptorOpenTypedAssetFileDescriptor;
                }
            } else {
                ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(contentResolver, uri, "r");
                if (parcelFileDescriptorLIZLLL != null) {
                    return new AssetFileDescriptor(parcelFileDescriptorLIZLLL, 0L, -1L);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            Object[] objArr = {str, e2};
            C08VH.LIZIZ("Cannot open content uri: %s", C08VH.LIZJ(objArr), objArr);
        }
        return null;
    }

    public static boolean LIZJ(Cursor cursor) {
        int columnIndex;
        if (Build.VERSION.SDK_INT < 24 || (columnIndex = cursor.getColumnIndex("flags")) <= -1 || (cursor.getLong(columnIndex) & 512) == 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Uri uri) throws Throwable {
        Cursor cursorLJJJ;
        if (uri == null || !DocumentsContract.isDocumentUri(C787230UuP.LIZ, uri)) {
            return false;
        }
        try {
            cursorLJJJ = C2204961BRm.LJJJ(C787230UuP.LIZ.getContentResolver(), uri, null, null, null, null, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb7UzFo86ld1e6F2s6W5lIYRGm6rQ==", null));
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
        if (cursorLJJJ == null) {
            return false;
        }
        try {
            if (cursorLJJJ.getCount() >= 1) {
                cursorLJJJ.moveToFirst();
                boolean zLIZJ = LIZJ(cursorLJJJ);
                cursorLJJJ.close();
                return zLIZJ;
            }
            cursorLJJJ.close();
            return false;
        } finally {
        }
        TryCatchGuardChecker.doCheck(e);
        return false;
    }

    public static boolean contentUriExists(String str) {
        try {
            AssetFileDescriptor assetFileDescriptorLIZ = LIZ(str);
            if (assetFileDescriptorLIZ != null) {
                try {
                    assetFileDescriptorLIZ.close();
                    return true;
                } catch (IOException e) {
                    return true;
                }
            }
            return false;
        } finally {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean delete(String str) {
        if (C787230UuP.LIZ.getContentResolver().delete(UriProtector.parse(str), null, null) > 0) {
            return true;
        }
        return false;
    }

    public static String getContentUriFromFilePath(String str) {
        try {
            new C0VSJ(str);
            synchronized (LIZ) {
                try {
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return null;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C08VH.LIZ("Cannot retrieve content uri from file: %s", str, e);
            return null;
        }
    }

    public static String getMimeType(String str) {
        ContentResolver contentResolver = C787230UuP.LIZ.getContentResolver();
        Uri uri = UriProtector.parse(str);
        if (LIZLLL(uri)) {
            String[] streamTypes = contentResolver.getStreamTypes(uri, "*/*");
            if (streamTypes != null && streamTypes.length > 0) {
                return streamTypes[0];
            }
            return null;
        }
        return contentResolver.getType(uri);
    }

    public static String maybeGetDisplayName(String str) throws Throwable {
        try {
            String strLIZIZ = LIZIZ(UriProtector.parse(str), C787230UuP.LIZ);
            if (TextUtils.isEmpty(strLIZIZ)) {
                return null;
            }
            return strLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Object[] objArr = {str, e};
            C08VH.LIZIZ("Cannot open content uri: %s", C08VH.LIZJ(objArr), objArr);
            return null;
        }
    }

    public static int openContentUriForRead(String str) {
        AssetFileDescriptor assetFileDescriptorLIZ = LIZ(str);
        if (assetFileDescriptorLIZ != null) {
            return assetFileDescriptorLIZ.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    public static String LIZIZ(Uri uri, Context context) throws Throwable {
        Cursor cursorLJJJ;
        String[] streamTypes;
        String extensionFromMimeType;
        if (uri == null) {
            return "";
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            cursorLJJJ = C2204961BRm.LJJJ(contentResolver, uri, null, null, null, null, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb7UzFo86ld1e6F2s6W5lIYRGm6rQ==", null));
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
        if (cursorLJJJ != null) {
            try {
                if (cursorLJJJ.getCount() >= 1) {
                    cursorLJJJ.moveToFirst();
                    int columnIndex = cursorLJJJ.getColumnIndex("_display_name");
                    if (columnIndex == -1) {
                        cursorLJJJ.close();
                        return "";
                    }
                    String string = cursorLJJJ.getString(columnIndex);
                    if (LIZJ(cursorLJJJ) && (streamTypes = contentResolver.getStreamTypes(uri, "*/*")) != null && streamTypes.length > 0 && (extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0])) != null) {
                        string = string + e3.d + extensionFromMimeType;
                    }
                    cursorLJJJ.close();
                    return string;
                    TryCatchGuardChecker.doCheck(e);
                    return "";
                }
            } finally {
            }
        }
        if (cursorLJJJ != null) {
            cursorLJJJ.close();
        }
        return "";
    }
}
