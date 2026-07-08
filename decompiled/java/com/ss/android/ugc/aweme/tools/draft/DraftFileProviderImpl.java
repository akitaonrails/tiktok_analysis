package com.ss.android.ugc.aweme.tools.draft;

import X.C08RN;
import X.C098200Yq;
import X.C0VSJ;
import X.C0WJO;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13LQ;
import X.C189200o6;
import X.C1BWL;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2362209Nk;
import X.C786450Ut9;
import X.InterfaceC318260Cdk;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.IDraftPackService;
import com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query.IDraftQueryService;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class DraftFileProviderImpl extends ContentProvider implements IDraftFileProviderService {
    public static final UriMatcher LL;
    public static final UriMatcher LLILLJJLI;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.zhiliaoapp.musically.draftprovider", "count", 1);
        uriMatcher.addURI("com.zhiliaoapp.musically.draftprovider", "query_file/*", 8);
        uriMatcher.addURI("com.zhiliaoapp.musically.draftprovider", "query_public_file/*", 10);
        uriMatcher.addURI("com.zhiliaoapp.musically.draftprovider", "available", 0);
        uriMatcher.addURI("com.zhiliaoapp.musically.draftprovider", "finish", 3);
        uriMatcher.addURI("com.zhiliaoapp.musically.draftprovider", "info_table", 6);
        uriMatcher.addURI("com.zhiliaoapp.musically.draftprovider", "all_completed", 7);
        uriMatcher.addURI("com.zhiliaoapp.musically.draftprovider", "ame_draft_id_list", 4);
        uriMatcher.addURI("com.zhiliaoapp.musically.draftprovider", "ame_pack_file", 9);
        LL = uriMatcher;
        UriMatcher uriMatcher2 = new UriMatcher(-1);
        uriMatcher2.addURI("com.zhiliaoapp.musically.draftprovider", "file/*", 2);
        uriMatcher2.addURI("com.zhiliaoapp.musically.draftprovider", "public_file/*", 11);
        uriMatcher2.addURI("com.zhiliaoapp.musically.draftprovider", "ame_draft_file/*", 5);
        LLILLJJLI = uriMatcher2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.DraftFileProviderImpl.LIZJ():boolean");
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public final void LIZIZ(Uri uri) throws IOException {
        String strLJJJJZ;
        Object c098200Yq;
        String path = uri.getPath();
        if (path != null) {
            int iMatch = LLILLJJLI.match(uri);
            if (iMatch != 2) {
                if (iMatch != 5) {
                    if (iMatch == 11) {
                        strLJJJJZ = a0.LJJJJZ("/public_file/", path);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported URI for query: ");
                        sbLIZ.append(uri);
                        throw new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    strLJJJJZ = a0.LJJJJZ("/ame_draft_file/", path);
                }
            } else {
                strLJJJJZ = a0.LJJJJZ("/file/", path);
            }
            if (!a0.LJJIIZI(strLJJJJZ, "..", false)) {
                Context context = getContext();
                if (context != null) {
                    try {
                        c098200Yq = LIZ(context);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    File file = (File) c098200Yq;
                    if (file != null) {
                        C0VSJ c0vsj = new C0VSJ(file, strLJJJJZ);
                        if (u.LJJIIJZLJL(c0vsj.getCanonicalPath(), file.getCanonicalPath(), false)) {
                            return;
                        } else {
                            throw new SecurityException("Access outside base directory forbidden");
                        }
                    }
                    throw new RuntimeException("filesDir is null");
                }
                throw new RuntimeException("Context is null");
            }
            throw new SecurityException("Invalid path");
        }
        throw new FileNotFoundException("URI path is null");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        int iMatch = LL.match(uri);
        if (iMatch != 0) {
            if (iMatch != 1) {
                if (iMatch == 2) {
                    return "application/octet-stream";
                }
                if (iMatch != 3) {
                    if (iMatch != 6) {
                        if (iMatch != 7) {
                            if (iMatch != 8) {
                                if (iMatch != 10) {
                                    if (iMatch == 11) {
                                        return "application/octet-stream";
                                    }
                                    return null;
                                }
                                return "vnd.android.cursor.item/vnd.com.zhiliaoapp.musically.draftprovider.query_public_file";
                            }
                            return "vnd.android.cursor.item/vnd.com.zhiliaoapp.musically.draftprovider.query_file";
                        }
                        return "vnd.android.cursor.item/vnd.com.zhiliaoapp.musically.draftprovider.all_completed";
                    }
                    return "vnd.android.cursor.item/vnd.com.zhiliaoapp.musically.draftprovider.info_table";
                }
                return "vnd.android.cursor.item/vnd.com.zhiliaoapp.musically.draftprovider.finish";
            }
            return "vnd.android.cursor.item/vnd.com.zhiliaoapp.musically.draftprovider.count";
        }
        return "vnd.android.cursor.item/vnd.com.zhiliaoapp.musically.draftprovider.available";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        C2362209Nk.LIZ(uri, "insert");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.DraftFileProviderImpl.openFile(android.net.Uri, java.lang.String):android.os.ParcelFileDescriptor");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014a A[PHI: r4 r17 r18
      0x014a: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v9 java.lang.String) binds: [B:98:0x0147, B:86:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r17v2 int) = (r17v1 int), (r17v8 int) binds: [B:98:0x0147, B:86:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r18v1 int) = (r18v0 int), (r18v7 int) binds: [B:98:0x0147, B:86:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014d A[PHI: r1 r4 r17 r18
      0x014d: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v6 java.lang.String) binds: [B:100:0x014a, B:89:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v8 java.lang.String) binds: [B:100:0x014a, B:89:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r17v3 int) = (r17v2 int), (r17v7 int) binds: [B:100:0x014a, B:89:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r18v2 int) = (r18v1 int), (r18v6 int) binds: [B:100:0x014a, B:89:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0152 A[PHI: r1 r4 r16 r17 r18
      0x0152: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v5 java.lang.String) binds: [B:103:0x014f, B:92:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v7 java.lang.String) binds: [B:103:0x014f, B:92:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r16v1 int) = (r16v0 int), (r16v3 int) binds: [B:103:0x014f, B:92:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r17v4 int) = (r17v3 int), (r17v6 int) binds: [B:103:0x014f, B:92:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r18v3 int) = (r18v2 int), (r18v5 int) binds: [B:103:0x014f, B:92:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[PHI: r5
      0x0037: PHI (r5v16 java.lang.String) = (r5v4 java.lang.String), (r5v17 java.lang.String) binds: [B:18:0x0035, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070 A[PHI: r5 r6 r7 r8 r9
      0x0070: PHI (r5v11 java.lang.String) = (r5v8 java.lang.String), (r5v12 java.lang.String) binds: [B:48:0x008a, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r6v8 boolean) = (r6v5 boolean), (r6v9 boolean) binds: [B:48:0x008a, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r7v7 int) = (r7v4 int), (r7v8 int) binds: [B:48:0x008a, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r8v5 int) = (r8v2 int), (r8v6 int) binds: [B:48:0x008a, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r9v4 int) = (r9v1 int), (r9v5 int) binds: [B:48:0x008a, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[PHI: r5 r6 r7 r8 r9 r10
      0x0073: PHI (r5v9 java.lang.String) = (r5v11 java.lang.String), (r5v12 java.lang.String) binds: [B:34:0x0071, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r6v6 boolean) = (r6v8 boolean), (r6v9 boolean) binds: [B:34:0x0071, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r7v5 int) = (r7v7 int), (r7v8 int) binds: [B:34:0x0071, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r8v3 int) = (r8v5 int), (r8v6 int) binds: [B:34:0x0071, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r9v2 int) = (r9v4 int), (r9v5 int) binds: [B:34:0x0071, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r10v1 java.lang.String) = (r10v3 java.lang.String), (r10v4 java.lang.String) binds: [B:34:0x0071, B:32:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[PHI: r5
      0x007d: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v16 java.lang.String) binds: [B:18:0x0035, B:20:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081 A[PHI: r5 r6
      0x0081: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v15 java.lang.String) binds: [B:39:0x007e, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r6v3 boolean) = (r6v2 boolean), (r6v12 boolean) binds: [B:39:0x007e, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085 A[PHI: r5 r6 r7
      0x0085: PHI (r5v7 java.lang.String) = (r5v6 java.lang.String), (r5v14 java.lang.String) binds: [B:42:0x0082, B:26:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r6v4 boolean) = (r6v3 boolean), (r6v11 boolean) binds: [B:42:0x0082, B:26:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r7v3 int) = (r7v2 int), (r7v10 int) binds: [B:42:0x0082, B:26:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089 A[PHI: r5 r6 r7 r8
      0x0089: PHI (r5v8 java.lang.String) = (r5v7 java.lang.String), (r5v13 java.lang.String) binds: [B:45:0x0086, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r6v5 boolean) = (r6v4 boolean), (r6v10 boolean) binds: [B:45:0x0086, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r7v4 int) = (r7v3 int), (r7v9 int) binds: [B:45:0x0086, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r8v2 int) = (r8v1 int), (r8v7 int) binds: [B:45:0x0086, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105 A[PHI: r4
      0x0105: PHI (r4v11 java.lang.String) = (r4v0 java.lang.String), (r4v12 java.lang.String) binds: [B:78:0x0103, B:76:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0140 A[PHI: r4
      0x0140: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v11 java.lang.String) binds: [B:78:0x0103, B:80:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0145 A[PHI: r4 r17
      0x0145: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v10 java.lang.String) binds: [B:95:0x0142, B:83:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r17v1 int) = (r17v0 int), (r17v9 int) binds: [B:95:0x0142, B:83:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int update(android.net.Uri r22, android.content.ContentValues r23, java.lang.String r24, java.lang.String[] r25) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.DraftFileProviderImpl.update(android.net.Uri, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2;
        String str3;
        String[] strArr3;
        boolean z;
        InterfaceC318260Cdk interfaceC318260CdkDraftService;
        InterfaceC318260Cdk interfaceC318260CdkDraftService2;
        Long lLJIILIIL;
        Object c098200Yq;
        String str4;
        boolean z2 = false;
        String currentUserID = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/ss/android/ugc/aweme/tools/draft/DraftFileProviderImpl", "query", this, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkjb1xjMDJZX5xzzpFusoblqoG7A6DNw85rQ1BA==", null)));
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
            if (obj3 != null) {
                str3 = (String) obj3;
            } else {
                str3 = str;
            }
            Object obj4 = objArr[3];
            if (obj4 != null) {
                strArr3 = (String[]) obj4;
            } else {
                strArr3 = strArr2;
            }
            Object obj5 = objArr[4];
        } else {
            uri2 = uri;
            str3 = str;
            strArr3 = strArr2;
        }
        C2362209Nk.LIZ(uri2, "query");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("query: ");
        sbLIZ.append(uri2);
        sbLIZ.append("  , selection = ");
        sbLIZ.append(str3);
        C0WJO.LIZ("verify", C2188811AlT.LIZIZ(sbLIZ));
        if (LIZJ()) {
            int iMatch = LL.match(uri2);
            if (iMatch != 0) {
                if (iMatch != 1) {
                    if (iMatch != 4) {
                        switch (iMatch) {
                            case 8:
                                if (str3 == null) {
                                    C0WJO.LIZIZ("verify", "CODE_DRAFT_QUERY_FILE, No uid specified");
                                    return null;
                                }
                                if (strArr3 != null && (str4 = (String) C13LQ.LJJIIZ(0, strArr3)) != null) {
                                    lLJIILIIL = C2095008Iq.LJIILIIL(str4);
                                } else {
                                    lLJIILIIL = null;
                                }
                                if (lLJIILIIL == null) {
                                    C0WJO.LIZIZ("verify", "CODE_DRAFT_QUERY_FILE, No version specified");
                                    return null;
                                }
                                String lastPathSegment = uri2.getLastPathSegment();
                                if (lastPathSegment != null) {
                                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(lastPathSegment, new String[]{"&"}, 0, 6);
                                    if (listLJJLIIIJILLIZJL.size() == 2) {
                                        String str5 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                                        try {
                                            if (CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL.get(1)) == 1) {
                                                z2 = true;
                                            }
                                            c098200Yq = Boolean.valueOf(z2);
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            c098200Yq = new C098200Yq(th);
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        }
                                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                            c098200Yq = null;
                                        }
                                        boolean zLJFF = Intrinsics.LJFF(c098200Yq, Boolean.TRUE);
                                        IDraftPackService iDraftPackService = (IDraftPackService) PluggableExtentionKt.pluggableSpi$default(IDraftPackService.class, false, false, false, 14, null);
                                        if (iDraftPackService != null) {
                                            return iDraftPackService.LIZLLL(C1BWL.LIZ(), str5, zLJFF, lLJIILIIL.longValue(), str3, uri2);
                                        }
                                    }
                                }
                                break;
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
                                if (iEffectCreatorService != null && (interfaceC318260CdkDraftService2 = iEffectCreatorService.draftService()) != null) {
                                    return interfaceC318260CdkDraftService2.LIZIZ(uri2, str3, getContext());
                                }
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                if (str3 == null) {
                                    C0WJO.LIZIZ("verify", "CODE_DRAFT_QUERY_PUBLIC_FILE, No uid specified");
                                    return null;
                                }
                                IDraftPackService iDraftPackService2 = (IDraftPackService) PluggableExtentionKt.pluggableSpi$default(IDraftPackService.class, false, false, false, 14, null);
                                if (iDraftPackService2 != null) {
                                    return iDraftPackService2.LIZ(uri2, str3, C1BWL.LIZ());
                                }
                                break;
                        }
                    } else {
                        IEffectCreatorService iEffectCreatorService2 = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
                        if (iEffectCreatorService2 != null && (interfaceC318260CdkDraftService = iEffectCreatorService2.draftService()) != null) {
                            return interfaceC318260CdkDraftService.LJ(getContext(), strArr3);
                        }
                    }
                } else {
                    IDraftQueryService iDraftQueryService = (IDraftQueryService) PluggableExtentionKt.pluggableSpi$default(IDraftQueryService.class, false, false, false, 14, null);
                    if (iDraftQueryService != null) {
                        return iDraftQueryService.LIZ(uri2, str3, C1BWL.LIZ());
                    }
                }
            } else {
                MatrixCursor matrixCursor = new MatrixCursor(new String[]{"available"});
                if (str3 != null && str3.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                    if (iUserService != null) {
                        currentUserID = iUserService.getCurrentUserID();
                    }
                    if (Intrinsics.LJFF(currentUserID, str3)) {
                        matrixCursor.addRow(new Integer[]{1});
                        return matrixCursor;
                    }
                }
                matrixCursor.addRow(new Integer[]{0});
                return matrixCursor;
            }
        }
        return null;
    }
}
