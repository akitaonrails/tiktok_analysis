package com.ss.android.ugc.aweme.lemon;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13LP;
import X.C13LQ;
import X.C2362209Nk;
import X.C306970C1n;
import X.C786410Ut5;
import X.C844470XAv;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class TTReferrerForLemon8Provider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    public static String LIZ(Signature signature) throws NoSuchAlgorithmException {
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

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        String asString;
        String asString2;
        C2362209Nk.LIZ(uri, "insert");
        String str = "";
        if (contentValues == null || (asString = contentValues.getAsString("pid")) == null) {
            asString = "";
        }
        if (contentValues != null && (asString2 = contentValues.getAsString("amp_extra")) != null) {
            str = asString2;
        }
        String[] strArr = (String[]) C306970C1n.LIZIZ.getValue();
        Keva.getRepo("lemon8_tt_referrer").storeString("pid", asString);
        Keva.getRepo("lemon8_tt_referrer").storeString("amp_extra", str);
        Keva.getRepo("lemon8_tt_referrer").storeStringArray("keva_app_signature_list", strArr);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        Keva.getRepo("lemon8_tt_referrer").clear();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2;
        String strLJJLIIIJ;
        ArrayList arrayList;
        boolean z = false;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/ss/android/ugc/aweme/lemon/TTReferrerForLemon8Provider", "query", this, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatbpDAkgZTFSPN3FXzgVJCzNyoVNxCNW3cSMsn49iMLA==", null)));
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
        String callingPackage = getCallingPackage();
        C844470XAv.LIZ.getClass();
        PackageManager packageManager = C844470XAv.LIZ().getPackageManager();
        if (callingPackage == null) {
            strLJJLIIIJ = "";
        } else if (Build.VERSION.SDK_INT >= 28) {
            try {
                SigningInfo signingInfo = C786410Ut5.Y3(packageManager, callingPackage, 134217728).signingInfo;
                if (signingInfo != null) {
                    if (signingInfo.hasMultipleSigners()) {
                        Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                        arrayList = new ArrayList(apkContentsSigners.length);
                        for (Signature signature : apkContentsSigners) {
                            arrayList.add(LIZ(signature));
                        }
                    } else {
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        arrayList = new ArrayList(signingCertificateHistory.length);
                        for (Signature signature2 : signingCertificateHistory) {
                            arrayList.add(LIZ(signature2));
                        }
                    }
                    strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            strLJJLIIIJ = "";
        } else {
            try {
                Signature[] signatureArr = C786410Ut5.Y3(packageManager, callingPackage, 64).signatures;
                if (signatureArr != null) {
                    arrayList = new ArrayList(signatureArr.length);
                    for (Signature signature3 : signatureArr) {
                        arrayList.add(LIZ(signature3));
                    }
                    strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            strLJJLIIIJ = "";
        }
        if (C13LQ.LJJIJIIJI(strLJJLIIIJ, Keva.getRepo("lemon8_tt_referrer").getStringArray("keva_app_signature_list", new String[0])) >= 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"pid", "amp_extra"});
        matrixCursor.newRow().add("pid", Keva.getRepo("lemon8_tt_referrer").getString("pid", "")).add("amp_extra", Keva.getRepo("lemon8_tt_referrer").getString("amp_extra", ""));
        return matrixCursor;
    }
}
