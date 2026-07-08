package com.ss.android.ugc.aweme.crash.cp;

import X.C08MT;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188811AlT;
import X.C2362209Nk;
import X.C2362709Np;
import X.C2362809Nq;
import X.C2362909Nr;
import X.C786410Ut5;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.legoimpl.FlippedTask;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ShellProvider extends ContentProvider {
    public volatile boolean LL;
    public final Map<String, ContentProvider> LLILLJJLI = new ConcurrentHashMap();
    public final Map<String, ProviderInfo> LLILLL = new ConcurrentHashMap();
    public Context LLILZ;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z;
        this.LLILZ = getContext();
        ArrayList<ProviderInfo> arrayList = new ArrayList();
        for (C2362909Nr c2362909Nr : (ArrayList) C2362709Np.LIZ) {
            ProviderInfo providerInfo = new ProviderInfo();
            providerInfo.name = c2362909Nr.LIZ;
            String str = c2362909Nr.LIZIZ;
            if (str == null || !str.contains("${applicationId}")) {
                String str2 = c2362909Nr.LIZIZ;
                if (str2 == null || !str2.contains("${APP_ID}")) {
                    providerInfo.authority = c2362909Nr.LIZIZ;
                } else {
                    providerInfo.authority = c2362909Nr.LIZIZ.replace("${APP_ID}", String.valueOf(1233));
                }
            } else {
                providerInfo.authority = c2362909Nr.LIZIZ.replace("${applicationId}", this.LLILZ.getPackageName());
            }
            providerInfo.exported = c2362909Nr.LIZLLL;
            providerInfo.processName = null;
            providerInfo.multiprocess = c2362909Nr.LIZJ;
            providerInfo.readPermission = c2362909Nr.LJ;
            providerInfo.writePermission = c2362909Nr.LJFF;
            providerInfo.grantUriPermissions = c2362909Nr.LJI;
            providerInfo.applicationInfo = this.LLILZ.getApplicationInfo();
            if (c2362909Nr.LJII != null) {
                providerInfo.metaData = new Bundle();
                for (Map.Entry<String, Object> entry : c2362909Nr.LJII.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        C786410Ut5.LJJJI(entry.getKey(), (String) value, providerInfo.metaData);
                    } else if (value instanceof Integer) {
                        providerInfo.metaData.putInt(entry.getKey(), ((Integer) value).intValue());
                    } else if (value instanceof C2362809Nq) {
                        Resources resources = this.LLILZ.getResources();
                        value.getClass();
                        providerInfo.metaData.putInt(entry.getKey(), C786410Ut5.n3(resources, null, null, this.LLILZ.getPackageName()));
                    }
                }
            }
            providerInfo.packageName = this.LLILZ.getPackageName();
            arrayList.add(providerInfo);
        }
        Context context = getContext();
        try {
            FlippedTask.LIZ();
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("installContentProviders", Context.class, List.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(objInvoke, context, arrayList);
            z = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            z = false;
        }
        this.LL = z;
        if (!this.LL) {
            String strLIZ = C08MT.LIZ(this.LLILZ);
            for (ProviderInfo providerInfo2 : arrayList) {
                String str3 = providerInfo2.processName;
                if (str3 == null) {
                    str3 = this.LLILZ.getApplicationInfo().processName;
                }
                if (providerInfo2.multiprocess || strLIZ.equals(str3)) {
                    try {
                        ContentProvider contentProvider = (ContentProvider) Class.forName(providerInfo2.name).newInstance();
                        contentProvider.attachInfo(getContext(), providerInfo2);
                        ((ConcurrentHashMap) this.LLILLJJLI).put(providerInfo2.authority, contentProvider);
                        ((ConcurrentHashMap) this.LLILLL).put(providerInfo2.authority, providerInfo2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            }
        }
        return true;
    }

    public final void LIZ(Uri uri) {
        ProviderInfo providerInfo = (ProviderInfo) ((ConcurrentHashMap) this.LLILLL).get(uri.getAuthority());
        if (providerInfo != null) {
            String str = providerInfo.writePermission;
            if (str == null) {
                if (!providerInfo.grantUriPermissions) {
                    return;
                }
            } else if (this.LLILZ.checkCallingOrSelfPermission(str) == 0) {
                return;
            }
            if (providerInfo.grantUriPermissions && this.LLILZ.checkUriPermission(uri, Binder.getCallingPid(), Binder.getCallingUid(), 2) == 0) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Permission Denial: writing ");
            sbLIZ.append(providerInfo.authority);
            sbLIZ.append(" from pid=");
            sbLIZ.append(Binder.getCallingPid());
            sbLIZ.append(", uid=");
            sbLIZ.append(Binder.getCallingUid());
            sbLIZ.append(" requires ");
            sbLIZ.append(providerInfo.writePermission);
            sbLIZ.append(" or grantUriPermission()");
            throw new SecurityException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Permission check failed: No provider info found for authority ");
        sbLIZ2.append(uri.getAuthority());
        throw new SecurityException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final ContentProvider LIZIZ(Uri uri) {
        return (ContentProvider) ((ConcurrentHashMap) this.LLILLJJLI).get(uri.getAuthority());
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        ContentProvider contentProviderLIZIZ = LIZIZ(uri);
        if (contentProviderLIZIZ != null) {
            return contentProviderLIZIZ.getType(uri);
        }
        return "";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        C2362209Nk.LIZ(uri, "insert");
        ContentProvider contentProviderLIZIZ = LIZIZ(uri);
        if (contentProviderLIZIZ != null) {
            LIZ(uri);
            return contentProviderLIZIZ.insert(uri, contentValues);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        ContentProvider contentProviderLIZIZ = LIZIZ(uri);
        if (contentProviderLIZIZ != null) {
            LIZ(uri);
            return contentProviderLIZIZ.delete(uri, str, strArr);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        ContentProvider contentProviderLIZIZ = LIZIZ(uri);
        if (contentProviderLIZIZ != null) {
            LIZ(uri);
            return contentProviderLIZIZ.update(uri, contentValues, str, strArr);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2;
        String[] strArr3;
        String str3;
        String[] strArr4;
        String str4;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/ss/android/ugc/aweme/crash/cp/ShellProvider", "query", this, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6YozGkjE8dhe3R3wQluiP3Olngxg=", null)));
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
        ContentProvider contentProviderLIZIZ = LIZIZ(uri2);
        if (contentProviderLIZIZ == null) {
            return null;
        }
        ProviderInfo providerInfo = (ProviderInfo) ((ConcurrentHashMap) this.LLILLL).get(uri2.getAuthority());
        if (providerInfo != null) {
            String str5 = providerInfo.readPermission;
            if (str5 != null ? this.LLILZ.checkCallingOrSelfPermission(str5) != 0 : providerInfo.grantUriPermissions) {
                if (!providerInfo.grantUriPermissions || this.LLILZ.checkUriPermission(uri2, Binder.getCallingPid(), Binder.getCallingUid(), 1) != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Permission Denial: reading ");
                    sbLIZ.append(providerInfo.authority);
                    sbLIZ.append(" from pid=");
                    sbLIZ.append(Binder.getCallingPid());
                    sbLIZ.append(", uid=");
                    sbLIZ.append(Binder.getCallingUid());
                    sbLIZ.append(" requires ");
                    sbLIZ.append(providerInfo.readPermission);
                    sbLIZ.append(" or grantUriPermission()");
                    throw new SecurityException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            return contentProviderLIZIZ.query(uri2, strArr3, str3, strArr4, str4);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Permission check failed: No provider info found for authority ");
        sbLIZ2.append(uri2.getAuthority());
        throw new SecurityException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
