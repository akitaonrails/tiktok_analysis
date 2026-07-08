package com.bytedance.ve.standalone.fileinfo;

import X.C08OF;
import X.C09NT;
import X.C0VSJ;
import X.C20144413ru;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.vesdk.VEUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class StandaloneVideoFileInfoTool {
    public static volatile boolean sSoLoaded = loadNativeLibrary();
    public static volatile Context sAppContext = null;
    public static volatile boolean sDebugLogEnabled = false;

    public static void dispatchJavaLog(int i, String str) {
    }

    public static boolean loadNativeLibrary() {
        try {
            INVOKESTATIC_com_bytedance_ve_standalone_fileinfo_StandaloneVideoFileInfoTool_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("standalone_fileinfo");
            return true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static native int nativeCheckAudioFile(String str);

    public static native int nativeGetAudioFileInfo(String str, int[] iArr);

    public static native VEUtils.VEVideoFileInfo nativeGetVideoFileInfo(String str);

    public static boolean isNativeLoaded() {
        return sSoLoaded;
    }

    public static void INVOKESTATIC_com_bytedance_ve_standalone_fileinfo_StandaloneVideoFileInfoTool_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static int checkAudioFile(String str) {
        if (TextUtils.isEmpty(str)) {
            dispatchJavaLog(4, "checkAudioFile: empty path");
            return -1;
        }
        if (!str.contains("://")) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists() || !c0vsj.canRead()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkAudioFile: file not exist or not readable, path=");
                sbLIZ.append(str);
                dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ));
                return -2;
            }
        }
        try {
            int iNativeCheckAudioFile = nativeCheckAudioFile(str);
            if (iNativeCheckAudioFile != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("checkAudioFile: native ret=");
                sbLIZ2.append(iNativeCheckAudioFile);
                sbLIZ2.append(", path=");
                sbLIZ2.append(str);
                dispatchJavaLog(3, C2188811AlT.LIZIZ(sbLIZ2));
            }
            return iNativeCheckAudioFile;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("checkAudioFile: native lib not loaded: ");
            sbLIZ3.append(e);
            dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ3));
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("checkAudioFile: unexpected error, path=");
            sbLIZ4.append(str);
            sbLIZ4.append(", err=");
            sbLIZ4.append(th);
            dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ4));
            return -1;
        }
    }

    public static VEUtils.VEVideoFileInfo getVideoFileInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            dispatchJavaLog(4, "getVideoFileInfo: empty path");
            return null;
        }
        if (!str.contains("://")) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists() || !c0vsj.canRead()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getVideoFileInfo: file not exist or not readable, path=");
                sbLIZ.append(str);
                dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        try {
            VEUtils.VEVideoFileInfo vEVideoFileInfoNativeGetVideoFileInfo = nativeGetVideoFileInfo(str);
            if (vEVideoFileInfoNativeGetVideoFileInfo == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getVideoFileInfo: native parse failed, path=");
                sbLIZ2.append(str);
                dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ2));
            }
            return vEVideoFileInfoNativeGetVideoFileInfo;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getVideoFileInfo: native lib not loaded: ");
            sbLIZ3.append(e);
            dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ3));
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("getVideoFileInfo: unexpected error, path=");
            sbLIZ4.append(str);
            sbLIZ4.append(", err=");
            sbLIZ4.append(th);
            dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ4));
            return null;
        }
    }

    public static synchronized boolean init(Context context) {
        Context contextN3;
        boolean z;
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        if (contextN3 != null) {
            sAppContext = contextN3;
            if ((contextN3.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            sDebugLogEnabled = z;
        }
        if (sSoLoaded) {
            return true;
        }
        boolean zLIZJ = C08OF.LIZJ(contextN3);
        sSoLoaded = zLIZJ;
        return zLIZJ;
    }

    public static int checkAudioFile(Context context, Uri uri) {
        if (context != null && uri != null) {
            Context contextN3 = C786410Ut5.N3(context);
            if (contextN3 != null) {
                sAppContext = contextN3;
            }
            return checkAudioFile(uri.toString());
        }
        dispatchJavaLog(4, "checkAudioFile(Uri): null context or uri");
        return -1;
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        try {
            int iNativeGetAudioFileInfo = nativeGetAudioFileInfo(str, iArr);
            if (str.endsWith(".aac")) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                String strLJ = C20144413ru.LJ(mediaMetadataRetriever);
                if (strLJ != null && strLJ.startsWith("audio/aac")) {
                    dispatchJavaLog(3, "getAudioFileInfo use Android sys to get aac duration because ffmpeg is not accurate");
                    iArr[3] = CastIntegerProtector.parseInt(C20144413ru.LIZJ(mediaMetadataRetriever));
                }
                try {
                    mediaMetadataRetriever.release();
                    return iNativeGetAudioFileInfo;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return iNativeGetAudioFileInfo;
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAudioFileInfo: native lib not loaded: ");
            sbLIZ.append(e2);
            dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ));
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getAudioFileInfo: unexpected error, path=");
            sbLIZ2.append(str);
            sbLIZ2.append(", err=");
            sbLIZ2.append(th);
            dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ2));
            return -1;
        }
    }

    public static VEUtils.VEVideoFileInfo getVideoFileInfo(Context context, Uri uri) {
        if (context != null && uri != null) {
            Context contextN3 = C786410Ut5.N3(context);
            if (contextN3 != null) {
                sAppContext = contextN3;
            }
            return getVideoFileInfo(uri.toString());
        }
        dispatchJavaLog(4, "getVideoFileInfo(Uri): null context or uri");
        return null;
    }

    public static int nativeResolveContentUriFd(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            Context context = sAppContext;
            if (context == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("nativeResolveContentUriFd: no ApplicationContext available, call init(Context) once or use the (Context, Uri) overload. uri=");
                sbLIZ.append(str);
                dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ));
                return -1;
            }
            if (str2 == null || str2.isEmpty()) {
                str2 = "r";
            }
            ParcelFileDescriptor parcelFileDescriptor = null;
            try {
                ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(context.getContentResolver(), UriProtector.parse(str), str2);
                if (parcelFileDescriptorLIZLLL == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("nativeResolveContentUriFd: openFileDescriptor returned null, uri=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", mode=");
                    sbLIZ2.append(str2);
                    dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ2));
                    return -1;
                }
                int iDetachFd = parcelFileDescriptorLIZLLL.detachFd();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("nativeResolveContentUriFd: ok uri=");
                sbLIZ3.append(str);
                sbLIZ3.append(" mode=");
                sbLIZ3.append(str2);
                sbLIZ3.append(" fd=");
                sbLIZ3.append(iDetachFd);
                dispatchJavaLog(2, C2188811AlT.LIZIZ(sbLIZ3));
                return iDetachFd;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("nativeResolveContentUriFd: failed uri=");
                sbLIZ4.append(str);
                sbLIZ4.append(" mode=");
                sbLIZ4.append(str2);
                sbLIZ4.append(" err=");
                sbLIZ4.append(th);
                dispatchJavaLog(4, C2188811AlT.LIZIZ(sbLIZ4));
                if (0 != 0) {
                    try {
                        parcelFileDescriptor.close();
                        return -1;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        return -1;
                    }
                }
                return -1;
            }
        }
        dispatchJavaLog(4, "nativeResolveContentUriFd: empty uri");
        return -1;
    }

    public static int getAudioFileInfo(Context context, Uri uri, int[] iArr) {
        if (context != null && uri != null) {
            Context contextN3 = C786410Ut5.N3(context);
            if (contextN3 != null) {
                sAppContext = contextN3;
            }
            return getAudioFileInfo(uri.toString(), iArr);
        }
        dispatchJavaLog(4, "getAudioFileInfo(Uri): null context or uri");
        return -1;
    }
}
