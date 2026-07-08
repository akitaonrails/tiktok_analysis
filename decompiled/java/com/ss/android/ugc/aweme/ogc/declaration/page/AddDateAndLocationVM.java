package com.ss.android.ugc.aweme.ogc.declaration.page;

import X.C1576150r7N;
import X.C1576190r7R;
import X.C1579080rC6;
import X.C19EG;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS11S0410000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class AddDateAndLocationVM extends AssemViewModel<C1576190r7R> {
    public C1579080rC6 LL;
    public C1576150r7N LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LL = null;
        this.LLILLJJLI = null;
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1576190r7R(null, null, null);
    }

    public final void xQ2() {
        Boolean boolValueOf;
        Long l;
        C1576150r7N c1576150r7N = this.LLILLJJLI;
        LocationInfo locationInfo = null;
        C19EG c19egInvoke = c1576150r7N != null ? c1576150r7N.LIZ.invoke() : null;
        C1579080rC6 c1579080rC6 = this.LL;
        if (c1579080rC6 != null) {
            boolValueOf = Boolean.valueOf(c1579080rC6.LIZJ.LIZJ() > 0);
        } else {
            boolValueOf = null;
        }
        C1579080rC6 c1579080rC62 = this.LL;
        if (c1579080rC62 != null) {
            l = c1579080rC62.LIZ;
            locationInfo = c1579080rC62.LIZIZ;
        } else {
            l = null;
        }
        setState(new AwS11S0410000_24(l, c19egInvoke, locationInfo != null && locationInfo.isValid(), locationInfo, boolValueOf, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[PHI: r7
      0x0011: PHI (r7v10 java.lang.String) = (r7v0 java.lang.String), (r7v11 java.lang.String) binds: [B:9:0x000f, B:7:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0019 A[PHI: r7
      0x0019: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v10 java.lang.String), (r7v10 java.lang.String) binds: [B:9:0x000f, B:11:0x0013, B:13:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001c A[PHI: r6 r7
      0x001c: PHI (r6v8 java.lang.String) = (r6v0 java.lang.String), (r6v9 java.lang.String) binds: [B:15:0x001a, B:13:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r7v9 java.lang.String) = (r7v1 java.lang.String), (r7v10 java.lang.String) binds: [B:15:0x001a, B:13:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0024 A[PHI: r6 r7
      0x0024: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v8 java.lang.String), (r6v8 java.lang.String) binds: [B:15:0x001a, B:17:0x001e, B:19:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0024: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v9 java.lang.String), (r7v9 java.lang.String) binds: [B:15:0x001a, B:17:0x001e, B:19:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[PHI: r5 r6 r7
      0x0027: PHI (r5v6 java.lang.String) = (r5v0 java.lang.String), (r5v7 java.lang.String) binds: [B:21:0x0025, B:19:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r6v7 java.lang.String) = (r6v1 java.lang.String), (r6v8 java.lang.String) binds: [B:21:0x0025, B:19:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r7v8 java.lang.String) = (r7v2 java.lang.String), (r7v9 java.lang.String) binds: [B:21:0x0025, B:19:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002f A[PHI: r5 r6 r7
      0x002f: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v6 java.lang.String), (r5v6 java.lang.String) binds: [B:21:0x0025, B:23:0x0029, B:25:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v7 java.lang.String), (r6v7 java.lang.String) binds: [B:21:0x0025, B:23:0x0029, B:25:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v8 java.lang.String), (r7v8 java.lang.String) binds: [B:21:0x0025, B:23:0x0029, B:25:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032 A[PHI: r3 r5 r6 r7
      0x0032: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:27:0x0030, B:25:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r5v5 java.lang.String) = (r5v1 java.lang.String), (r5v6 java.lang.String) binds: [B:27:0x0030, B:25:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r6v6 java.lang.String) = (r6v2 java.lang.String), (r6v7 java.lang.String) binds: [B:27:0x0030, B:25:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r7v7 java.lang.String) = (r7v3 java.lang.String), (r7v8 java.lang.String) binds: [B:27:0x0030, B:25:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a A[PHI: r3 r5 r6 r7
      0x003a: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String), (r3v4 java.lang.String) binds: [B:27:0x0030, B:29:0x0034, B:31:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v5 java.lang.String), (r5v5 java.lang.String) binds: [B:27:0x0030, B:29:0x0034, B:31:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v6 java.lang.String), (r6v6 java.lang.String) binds: [B:27:0x0030, B:29:0x0034, B:31:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v7 java.lang.String), (r7v7 java.lang.String) binds: [B:27:0x0030, B:29:0x0034, B:31:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d A[PHI: r2 r3 r5 r6 r7
      0x003d: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:33:0x003b, B:31:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:33:0x003b, B:31:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v5 java.lang.String) binds: [B:33:0x003b, B:31:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r6v5 java.lang.String) = (r6v3 java.lang.String), (r6v6 java.lang.String) binds: [B:33:0x003b, B:31:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r7v6 java.lang.String) = (r7v4 java.lang.String), (r7v7 java.lang.String) binds: [B:33:0x003b, B:31:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(java.lang.String r9) {
        /*
            r8 = this;
            X.0r7N r1 = r8.LLILLJJLI
            java.lang.String r4 = ""
            if (r1 == 0) goto Le
            com.ss.android.ugc.aweme.ogc.declaration.page.PageEnterParams r0 = r1.LIZIZ
            if (r0 == 0) goto Le
            java.lang.String r7 = r0.enterFrom
            if (r7 != 0) goto L11
        Le:
            r7 = r4
            if (r1 == 0) goto L19
        L11:
            com.ss.android.ugc.aweme.ogc.declaration.page.PageEnterParams r0 = r1.LIZIZ
            if (r0 == 0) goto L19
            java.lang.String r6 = r0.creationId
            if (r6 != 0) goto L1c
        L19:
            r6 = r4
            if (r1 == 0) goto L24
        L1c:
            com.ss.android.ugc.aweme.ogc.declaration.page.PageEnterParams r0 = r1.LIZIZ
            if (r0 == 0) goto L24
            java.lang.String r5 = r0.shootWay
            if (r5 != 0) goto L27
        L24:
            r5 = r4
            if (r1 == 0) goto L2f
        L27:
            com.ss.android.ugc.aweme.ogc.declaration.page.PageEnterParams r0 = r1.LIZIZ
            if (r0 == 0) goto L2f
            java.lang.String r3 = r0.shootTabName
            if (r3 != 0) goto L32
        L2f:
            r3 = r4
            if (r1 == 0) goto L3a
        L32:
            com.ss.android.ugc.aweme.ogc.declaration.page.PageEnterParams r0 = r1.LIZIZ
            if (r0 == 0) goto L3a
            java.lang.String r2 = r0.contentSource
            if (r2 != 0) goto L3d
        L3a:
            r2 = r4
            if (r1 == 0) goto L46
        L3d:
            com.ss.android.ugc.aweme.ogc.declaration.page.PageEnterParams r0 = r1.LIZIZ
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.contentType
            if (r0 == 0) goto L46
            r4 = r0
        L46:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r0 = "disclosure_type"
            r1.put(r0, r9)
            java.lang.String r0 = "enter_from"
            r1.put(r0, r7)
            java.lang.String r0 = "creation_id"
            r1.put(r0, r6)
            java.lang.String r0 = "shoot_way"
            r1.put(r0, r5)
            java.lang.String r0 = "shoot_tab_name"
            r1.put(r0, r3)
            java.lang.String r0 = "content_source"
            r1.put(r0, r2)
            java.lang.String r0 = "content_type"
            r1.put(r0, r4)
            java.lang.String r0 = "disclosure_detail_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ogc.declaration.page.AddDateAndLocationVM.vQ2(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01de A[PHI: r3
      0x01de: PHI (r3v11 java.lang.String) = (r3v3 java.lang.String), (r3v12 java.lang.String) binds: [B:101:0x01dc, B:99:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e6 A[PHI: r3
      0x01e6: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v11 java.lang.String), (r3v11 java.lang.String) binds: [B:101:0x01dc, B:103:0x01e0, B:105:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9 A[PHI: r3 r5
      0x01e9: PHI (r3v10 java.lang.String) = (r3v4 java.lang.String), (r3v11 java.lang.String) binds: [B:107:0x01e7, B:105:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r5v12 java.lang.String) = (r5v8 java.lang.String), (r5v13 java.lang.String) binds: [B:107:0x01e7, B:105:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f1 A[PHI: r3 r5
      0x01f1: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v10 java.lang.String), (r3v10 java.lang.String) binds: [B:107:0x01e7, B:109:0x01eb, B:111:0x01ef] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r5v9 java.lang.String) = (r5v8 java.lang.String), (r5v12 java.lang.String), (r5v12 java.lang.String) binds: [B:107:0x01e7, B:109:0x01eb, B:111:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f4 A[PHI: r3 r4 r5
      0x01f4: PHI (r3v9 java.lang.String) = (r3v5 java.lang.String), (r3v10 java.lang.String) binds: [B:113:0x01f2, B:111:0x01ef] A[DONT_GENERATE, DONT_INLINE]
      0x01f4: PHI (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:113:0x01f2, B:111:0x01ef] A[DONT_GENERATE, DONT_INLINE]
      0x01f4: PHI (r5v11 java.lang.String) = (r5v9 java.lang.String), (r5v12 java.lang.String) binds: [B:113:0x01f2, B:111:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c A[PHI: r12
      0x013c: PHI (r12v7 java.lang.String) = (r12v0 java.lang.String), (r12v8 java.lang.String) binds: [B:76:0x013a, B:74:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144 A[PHI: r12
      0x0144: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v7 java.lang.String), (r12v7 java.lang.String) binds: [B:76:0x013a, B:78:0x013e, B:80:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0147 A[PHI: r12 r14
      0x0147: PHI (r12v6 java.lang.String) = (r12v1 java.lang.String), (r12v7 java.lang.String) binds: [B:82:0x0145, B:80:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r14v5 java.lang.String) = (r14v0 java.lang.String), (r14v6 java.lang.String) binds: [B:82:0x0145, B:80:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f A[PHI: r12 r14
      0x014f: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v6 java.lang.String), (r12v6 java.lang.String) binds: [B:82:0x0145, B:84:0x0149, B:86:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v5 java.lang.String), (r14v5 java.lang.String) binds: [B:82:0x0145, B:84:0x0149, B:86:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152 A[PHI: r12 r13 r14
      0x0152: PHI (r12v5 java.lang.String) = (r12v2 java.lang.String), (r12v6 java.lang.String) binds: [B:88:0x0150, B:86:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r13v3 java.lang.String) = (r13v0 java.lang.String), (r13v4 java.lang.String) binds: [B:88:0x0150, B:86:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r14v4 java.lang.String) = (r14v1 java.lang.String), (r14v5 java.lang.String) binds: [B:88:0x0150, B:86:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015a A[PHI: r12 r13 r14
      0x015a: PHI (r12v3 java.lang.String) = (r12v2 java.lang.String), (r12v5 java.lang.String), (r12v5 java.lang.String) binds: [B:88:0x0150, B:90:0x0154, B:92:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String), (r13v3 java.lang.String) binds: [B:88:0x0150, B:90:0x0154, B:92:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v4 java.lang.String), (r14v4 java.lang.String) binds: [B:88:0x0150, B:90:0x0154, B:92:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(X.InterfaceC1576140r7M r27) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ogc.declaration.page.AddDateAndLocationVM.wQ2(X.0r7M):void");
    }
}
