package com.ss.android.ugc.aweme.drama.app.referrer;

import X.C0WI4;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0X51;
import X.C13LP;
import X.C13LQ;
import X.C2362209Nk;
import X.C306940C1k;
import X.C786410Ut5;
import X.C844470XAv;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class DramaTTReferrerProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    public static Keva LIZLLL() {
        return Keva.getRepo("pinedrama_tt_referrer");
    }

    public final C0WI4 LIZ() {
        String packageName;
        String callingPackage = getCallingPackage();
        Context context = getContext();
        if (context == null || (packageName = context.getPackageName()) == null) {
            packageName = "";
        }
        String strLIZJ = LIZJ(callingPackage, packageName);
        return Intrinsics.LJFF(callingPackage, packageName) ? new C0WI4(strLIZJ, true) : new C0WI4(strLIZJ, false);
    }

    public final C0WI4 LIZIZ() {
        ArrayList arrayList;
        String callingPackage = getCallingPackage();
        Context context = getContext();
        String packageName = context != null ? context.getPackageName() : null;
        String strLJJLIIIJ = "";
        if (packageName == null) {
            packageName = "";
        }
        String strLIZJ = LIZJ(callingPackage, packageName);
        C844470XAv.LIZ.getClass();
        PackageManager packageManager = C844470XAv.LIZ().getPackageManager();
        if (callingPackage != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    SigningInfo signingInfo = C786410Ut5.Y3(packageManager, callingPackage, 134217728).signingInfo;
                    if (signingInfo != null) {
                        if (signingInfo.hasMultipleSigners()) {
                            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                            arrayList = new ArrayList(apkContentsSigners.length);
                            for (Signature signature : apkContentsSigners) {
                                arrayList.add(LJ(signature));
                            }
                        } else {
                            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            arrayList = new ArrayList(signingCertificateHistory.length);
                            for (Signature signature2 : signingCertificateHistory) {
                                arrayList.add(LJ(signature2));
                            }
                        }
                        strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                try {
                    Signature[] signatureArr = C786410Ut5.Y3(packageManager, callingPackage, 64).signatures;
                    if (signatureArr != null) {
                        arrayList = new ArrayList(signatureArr.length);
                        for (Signature signature3 : signatureArr) {
                            arrayList.add(LJ(signature3));
                        }
                        strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        String[] stringArray = LIZLLL().getStringArray("app_signature_list", new String[0]);
        if (C13LQ.LJJIJIIJI(strLJJLIIIJ, stringArray) >= 0) {
            return new C0WI4(1, strLIZJ, "signature_whitelist", true);
        }
        return new C0WI4(stringArray.length == 0 ? -1 : 0, strLIZJ, "signature_whitelist", false);
    }

    public static String LJ(Signature signature) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(signature.toByteArray());
        byte[] bArrDigest = messageDigest.digest();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i = 0; i < length; i++) {
            int i2 = bArrDigest[i] & 255;
            int i3 = i * 2;
            cArr2[i3] = cArr[i2 >>> 4];
            cArr2[i3 + 1] = cArr[i2 & 15];
        }
        return new String(cArr2);
    }

    public static String LIZJ(String str, String str2) {
        if (str != null && str.length() != 0) {
            if (Intrinsics.LJFF(str, str2)) {
                return "self";
            }
            return "third_party";
        }
        return "unknown";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) throws Throwable {
        String asString;
        long jCurrentTimeMillis;
        Long asLong;
        C2362209Nk.LIZ(uri, "insert");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0WI4 c0wi4LIZ = LIZ();
        String str = "denied";
        String simpleName = null;
        try {
            if (!c0wi4LIZ.LIZ) {
                C0X51 c0x51 = C0X51.LIZ;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                String str2 = c0wi4LIZ.LIZIZ;
                String str3 = c0wi4LIZ.LIZJ;
                int i = c0wi4LIZ.LIZLLL;
                c0x51.getClass();
                C0X51.LIZ("insert", "denied", str2, i, jElapsedRealtime2, str3, null, -1);
                return null;
            }
            if (contentValues == null || (asString = contentValues.getAsString("deeplink")) == null) {
                asString = "";
            }
            if (contentValues != null && (asLong = contentValues.getAsLong("timestamp")) != null) {
                jCurrentTimeMillis = asLong.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            String[] strArr = (String[]) C306940C1k.LIZIZ.getValue();
            LIZLLL().storeString("deeplink", asString);
            LIZLLL().storeLong("timestamp", jCurrentTimeMillis);
            LIZLLL().storeStringArray("app_signature_list", strArr);
            C0X51 c0x512 = C0X51.LIZ;
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            String str4 = c0wi4LIZ.LIZIZ;
            String str5 = c0wi4LIZ.LIZJ;
            int i2 = c0wi4LIZ.LIZLLL;
            c0x512.getClass();
            C0X51.LIZ("insert", "success", str4, i2, jElapsedRealtime3, str5, null, -1);
            return null;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                str = "exception";
                simpleName = th.getClass().getSimpleName();
                throw th;
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C0X51 c0x513 = C0X51.LIZ;
                        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        String str6 = c0wi4LIZ.LIZIZ;
                        String str7 = c0wi4LIZ.LIZJ;
                        int i3 = c0wi4LIZ.LIZLLL;
                        c0x513.getClass();
                        C0X51.LIZ("insert", str, str6, i3, jElapsedRealtime4, str7, simpleName, -1);
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) throws Throwable {
        C2362209Nk.LIZ(uri, "delete");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0WI4 c0wi4LIZIZ = LIZIZ();
        String str2 = "denied";
        String simpleName = null;
        try {
            if (c0wi4LIZIZ.LIZ) {
                LIZLLL().clear();
                C0X51 c0x51 = C0X51.LIZ;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                String str3 = c0wi4LIZIZ.LIZIZ;
                String str4 = c0wi4LIZIZ.LIZJ;
                int i = c0wi4LIZIZ.LIZLLL;
                c0x51.getClass();
                C0X51.LIZ("delete", "success", str3, i, jElapsedRealtime2, str4, null, -1);
                return 0;
            }
            C0X51 c0x512 = C0X51.LIZ;
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            String str5 = c0wi4LIZIZ.LIZIZ;
            String str6 = c0wi4LIZIZ.LIZJ;
            int i2 = c0wi4LIZIZ.LIZLLL;
            c0x512.getClass();
            C0X51.LIZ("delete", "denied", str5, i2, jElapsedRealtime3, str6, null, -1);
            return 0;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                str2 = "exception";
                simpleName = th.getClass().getSimpleName();
                throw th;
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C0X51 c0x513 = C0X51.LIZ;
                        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        String str7 = c0wi4LIZIZ.LIZIZ;
                        String str8 = c0wi4LIZIZ.LIZJ;
                        int i3 = c0wi4LIZIZ.LIZLLL;
                        c0x513.getClass();
                        C0X51.LIZ("delete", str2, str7, i3, jElapsedRealtime4, str8, simpleName, -1);
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        LIZ();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2;
        int i;
        boolean z;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/ss/android/ugc/aweme/drama/app/referrer/DramaTTReferrerProvider", "query", this, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO66YpLPkjMXM2TPvqDxjM+LYWZ81yBLzUn6KdyyHK6eCDB+lXXNa1bXrg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (Cursor) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                uri2 = (Uri) obj;
            } else {
                uri2 = uri;
            }
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
        } else {
            uri2 = uri;
        }
        C2362209Nk.LIZ(uri2, "query");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0WI4 c0wi4LIZIZ = LIZIZ();
        String str3 = "denied";
        String simpleName = null;
        try {
            if (!c0wi4LIZIZ.LIZ) {
                C0X51 c0x51 = C0X51.LIZ;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                String str4 = c0wi4LIZIZ.LIZIZ;
                String str5 = c0wi4LIZIZ.LIZJ;
                int i2 = c0wi4LIZIZ.LIZLLL;
                c0x51.getClass();
                C0X51.LIZ("query", "denied", str4, i2, jElapsedRealtime2, str5, null, -1);
                return null;
            }
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"deeplink", "timestamp"});
            String string = LIZLLL().getString("deeplink", "");
            long j = LIZLLL().getLong("timestamp", 0L);
            if (string.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && j <= 0) {
                i = 0;
            } else {
                i = 1;
            }
            try {
                matrixCursor.newRow().add("deeplink", string).add("timestamp", Long.valueOf(j));
                C0X51 c0x512 = C0X51.LIZ;
                long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                String str6 = c0wi4LIZIZ.LIZIZ;
                String str7 = c0wi4LIZIZ.LIZJ;
                int i3 = c0wi4LIZIZ.LIZLLL;
                c0x512.getClass();
                C0X51.LIZ("query", "success", str6, i3, jElapsedRealtime3, str7, null, i);
                return matrixCursor;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = -1;
        }
        try {
            TryCatchGuardChecker.doCheck(th);
            str3 = "exception";
            simpleName = th.getClass().getSimpleName();
            throw th;
        } catch (Throwable th3) {
            th = th3;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C0X51 c0x513 = C0X51.LIZ;
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    String str8 = c0wi4LIZIZ.LIZIZ;
                    String str9 = c0wi4LIZIZ.LIZJ;
                    int i4 = c0wi4LIZIZ.LIZLLL;
                    c0x513.getClass();
                    C0X51.LIZ("query", str3, str8, i4, jElapsedRealtime4, str9, simpleName, i);
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
    }
}
