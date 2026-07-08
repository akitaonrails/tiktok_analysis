package com.ss.android.ugc.aweme.livewallpaper;

import X.C08TN;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188811AlT;
import X.C2362209Nk;
import X.C842910X4v;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class WallPaperDataProvider extends ContentProvider {
    public static final Uri LLILLL;
    public static final Uri LLILZ;
    public static final Uri LLILZIL;
    public volatile ContentProvider LL;
    public final Object LLILLJJLI = new Object();

    public final ContentProvider LIZ() {
        ContentProvider contentProvider = this.LL;
        if (contentProvider != null) {
            return contentProvider;
        }
        C842910X4v c842910X4v = C842910X4v.LIZ;
        c842910X4v.getClass();
        if (!C842910X4v.LIZ()) {
            c842910X4v.LIZIZ();
            return null;
        }
        synchronized (this.LLILLJJLI) {
            try {
                if (this.LL != null) {
                    return this.LL;
                }
                try {
                    if (getContext() == null) {
                        return null;
                    }
                    Object objNewInstance = Class.forName("nyf.b").newInstance();
                    if (!(objNewInstance instanceof ContentProvider)) {
                        return null;
                    }
                    ContentProvider contentProvider2 = (ContentProvider) objNewInstance;
                    contentProvider2.attachInfo(getContext(), getContext().getPackageManager().getProviderInfo(new ComponentName(getContext(), (Class<?>) WallPaperDataProvider.class), 0));
                    this.LL = contentProvider2;
                    return contentProvider2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content://");
        sbLIZ.append("com.zhiliaoapp.musically.wallpapercaller");
        sbLIZ.append("/");
        sbLIZ.append("video_path");
        UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("content://");
        sbLIZ2.append("com.zhiliaoapp.musically.wallpapercaller");
        sbLIZ2.append("/");
        sbLIZ2.append("video_width");
        UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("content://");
        sbLIZ3.append("com.zhiliaoapp.musically.wallpapercaller");
        sbLIZ3.append("/");
        sbLIZ3.append("video_height");
        UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("content://");
        sbLIZ4.append("com.zhiliaoapp.musically.wallpapercaller");
        sbLIZ4.append("/");
        sbLIZ4.append("ab_info");
        UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("content://");
        sbLIZ5.append("com.zhiliaoapp.musically.wallpapercaller");
        sbLIZ5.append("/");
        sbLIZ5.append("wallpaper_json");
        LLILLL = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ5));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("content://");
        sbLIZ6.append("com.zhiliaoapp.musically.wallpapercaller");
        sbLIZ6.append("/");
        sbLIZ6.append("fall_back_video_path");
        LLILZ = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ6));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("content://");
        sbLIZ7.append("com.zhiliaoapp.musically.wallpapercaller");
        sbLIZ7.append("/");
        sbLIZ7.append("set_wp_result");
        LLILZIL = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ7));
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("content://");
        sbLIZ8.append("com.zhiliaoapp.musically.wallpapercaller");
        sbLIZ8.append("/");
        sbLIZ8.append("source");
        UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ8));
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("content://");
        sbLIZ9.append("com.zhiliaoapp.musically.wallpapercaller");
        sbLIZ9.append("/");
        sbLIZ9.append("volume");
        UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ9));
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("content://");
        sbLIZ10.append("com.zhiliaoapp.musically.wallpapercaller");
        sbLIZ10.append("/");
        sbLIZ10.append("need_tighten");
        UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ10));
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C08TN.LIZ().LJ("WallPaperDataProvider", false);
        C08TN.LIZ().LJI("WallPaperDataProvider");
        return true;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        String type;
        ContentProvider contentProviderLIZ = LIZ();
        if (contentProviderLIZ == null || (type = contentProviderLIZ.getType(uri)) == null) {
            return "";
        }
        return type;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        C2362209Nk.LIZ(uri, "insert");
        ContentProvider contentProviderLIZ = LIZ();
        if (contentProviderLIZ == null) {
            return null;
        }
        return contentProviderLIZ.insert(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        ContentProvider contentProviderLIZ = LIZ();
        if (contentProviderLIZ == null) {
            return null;
        }
        return contentProviderLIZ.openFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) throws Throwable {
        String str3 = str;
        Bundle bundle2 = bundle;
        String str4 = str2;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11067, "com/ss/android/ugc/aweme/livewallpaper/WallPaperDataProvider", "call", this, new Object[]{str3, str4, bundle2}, "android.os.Bundle", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZrZ3T78Y8KqlKrYPaJBGLHnLwyA+EkLrcZ1gSDwzOvr", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (Bundle) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str3 = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str4 = (String) obj2;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                bundle2 = (Bundle) obj3;
            }
        }
        ContentProvider contentProviderLIZ = LIZ();
        if (contentProviderLIZ == null) {
            return bundle2;
        }
        return contentProviderLIZ.call(str3, str4, bundle2);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        ContentProvider contentProviderLIZ = LIZ();
        if (contentProviderLIZ == null) {
            return 0;
        }
        return contentProviderLIZ.delete(uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        ContentProvider contentProviderLIZ = LIZ();
        if (contentProviderLIZ == null) {
            return 0;
        }
        return contentProviderLIZ.update(uri, contentValues, str, strArr);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2;
        String[] strArr3;
        String str3;
        String[] strArr4;
        String str4;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/ss/android/ugc/aweme/livewallpaper/WallPaperDataProvider", "query", this, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZrZ3T78Y8KqlKrYPaJBGLHnLwyA+EkLrcZ1gSDwzOvr", null)));
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
            if (obj2 != null) {
                strArr3 = (String[]) obj2;
            } else {
                strArr3 = strArr;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                str3 = (String) obj3;
            } else {
                str3 = str;
            }
            Object obj4 = objArr[3];
            if (obj4 != null) {
                strArr4 = (String[]) obj4;
            } else {
                strArr4 = strArr2;
            }
            Object obj5 = objArr[4];
            if (obj5 != null) {
                str4 = (String) obj5;
            } else {
                str4 = str2;
            }
        } else {
            uri2 = uri;
            strArr3 = strArr;
            str3 = str;
            strArr4 = strArr2;
            str4 = str2;
        }
        C2362209Nk.LIZ(uri2, "query");
        ContentProvider contentProviderLIZ = LIZ();
        if (contentProviderLIZ == null) {
            return null;
        }
        return contentProviderLIZ.query(uri2, strArr3, str3, strArr4, str4);
    }
}
