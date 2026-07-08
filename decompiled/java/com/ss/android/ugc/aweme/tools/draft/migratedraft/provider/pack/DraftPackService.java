package com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack;

import X.C01GW;
import X.C0CHQ;
import X.C0PEM;
import X.C0WJ1;
import X.C23250099c;
import X.C452501pT;
import X.C563430M7x;
import X.C817503Hh;
import X.C821060WIu;
import X.C821070WIv;
import X.C821100WIy;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class DraftPackService implements IDraftPackService {
    public volatile C821070WIv LIZIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(698));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(171));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(172));

    @Override // com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.IDraftPackService
    public final C821070WIv LIZJ() {
        C821070WIv c821070WIv = this.LIZIZ;
        this.LIZIZ = null;
        return c821070WIv;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.IDraftPackService
    public final C821070WIv LIZIZ(String str) {
        C821070WIv c821070WIv = (C821070WIv) ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
        ((ConcurrentHashMap) this.LIZ.getValue()).remove(str);
        return c821070WIv;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.IDraftPackService
    public final Cursor LIZ(Uri uri, String str, Context context) {
        C821100WIy c821100WIy;
        String[] strArr = {"queryDraftFile", "reason"};
        if (!Intrinsics.LJFF(str, C0CHQ.LIZ().getAccountService().getCurrentUserID())) {
            MatrixCursor matrixCursor = new MatrixCursor(strArr);
            matrixCursor.addRow(new String[]{C0WJ1.FAILED_BY_UID.getState(), "mis match uid"});
            return matrixCursor;
        }
        String str2 = null;
        if (this.LIZIZ == null) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C821060WIu(this, context, uri, null), 2);
            MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
            matrixCursor2.addRow(new String[]{C0WJ1.NOT_READY.getState(), "not ready"});
            return matrixCursor2;
        }
        MatrixCursor matrixCursor3 = new MatrixCursor(strArr);
        C821070WIv c821070WIv = this.LIZIZ;
        if (c821070WIv != null && c821070WIv.LIZLLL) {
            matrixCursor3.addRow(new String[]{C0WJ1.SUCCESS.getState(), "success"});
        } else {
            C821070WIv c821070WIv2 = this.LIZIZ;
            if (c821070WIv2 != null && (c821100WIy = c821070WIv2.LIZIZ) != null) {
                String[] strArr2 = new String[2];
                strArr2[0] = c821100WIy.LIZ.getState();
                C821070WIv c821070WIv3 = this.LIZIZ;
                if (c821070WIv3 != null) {
                    str2 = c821070WIv3.LIZJ;
                }
                strArr2[1] = str2;
                matrixCursor3.addRow(strArr2);
                return matrixCursor3;
            }
        }
        return matrixCursor3;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.IDraftPackService
    public final Cursor LIZLLL(Context context, String str, boolean z, long j, String str2, Uri uri) {
        String[] strArr = {"queryDraftFile", "reason"};
        if (!Intrinsics.LJFF(str2, C0CHQ.LIZ().getAccountService().getCurrentUserID())) {
            MatrixCursor matrixCursor = new MatrixCursor(strArr);
            matrixCursor.addRow(new String[]{C0WJ1.FAILED_BY_UID.getState(), "mis match uid"});
            return matrixCursor;
        }
        C821070WIv c821070WIv = (C821070WIv) ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
        if (c821070WIv == null) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C563430M7x(this, context, str, z, str2, j, uri, null), 2);
            MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
            matrixCursor2.addRow(new String[]{C0WJ1.NOT_READY.getState(), "not ready"});
            return matrixCursor2;
        }
        MatrixCursor matrixCursor3 = new MatrixCursor(strArr);
        if (c821070WIv.LIZLLL) {
            matrixCursor3.addRow(new String[]{C0WJ1.SUCCESS.getState(), "success"});
        } else {
            C821100WIy c821100WIy = c821070WIv.LIZIZ;
            if (c821100WIy != null) {
                matrixCursor3.addRow(new String[]{c821100WIy.LIZ.getState(), c821070WIv.LIZJ});
                return matrixCursor3;
            }
        }
        return matrixCursor3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005f -> B:11:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.content.Context r13, java.lang.String r14, boolean r15, java.lang.String r16, long r17, X.InterfaceC1364105Vn<? super X.C821070WIv> r19) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.DraftPackService.LJ(android.content.Context, java.lang.String, boolean, java.lang.String, long, X.05Vn):java.lang.Object");
    }
}
