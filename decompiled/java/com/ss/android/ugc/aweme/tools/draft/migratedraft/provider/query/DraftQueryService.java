package com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query;

import X.C01GW;
import X.C059X;
import X.C0PEM;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftQueryService implements IDraftQueryService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(699));

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169 A[PHI: r3
      0x0169: PHI (r3v4 java.util.List) = (r3v2 java.util.List), (r3v5 java.util.List) binds: [B:77:0x0167, B:75:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Pair<? extends java.util.List<java.lang.String>, ? extends java.util.List<java.lang.String>>> r11) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query.DraftQueryService.LIZJ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query.IDraftQueryService
    public final Cursor LIZ(Uri uri, String str, Context context) {
        boolean z;
        String currentUserID = null;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            currentUserID = iUserService.getCurrentUserID();
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && Intrinsics.LJFF(currentUserID, str)) {
            Cursor cursor = (Cursor) ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
            if (cursor == null) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C059X(this, context, str, uri, null), 2);
                MatrixCursor matrixCursor = new MatrixCursor(new String[]{"queryDraftCountAndSize"});
                matrixCursor.addRow(new Integer[]{0});
                return matrixCursor;
            }
            ((ConcurrentHashMap) this.LIZ.getValue()).remove(str);
            return cursor;
        }
        MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"queryDraftCountAndSize"});
        matrixCursor2.addRow(new Integer[]{1});
        return matrixCursor2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.Context r23, android.net.Uri r24, java.lang.String r25, X.InterfaceC1364105Vn r26) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query.DraftQueryService.LIZIZ(android.content.Context, android.net.Uri, java.lang.String, X.05Vn):java.lang.Object");
    }
}
