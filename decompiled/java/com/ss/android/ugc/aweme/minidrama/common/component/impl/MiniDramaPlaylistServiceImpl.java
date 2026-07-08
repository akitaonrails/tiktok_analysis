package com.ss.android.ugc.aweme.minidrama.common.component.impl;

import X.C1613520s5e;
import X.C718460SGe;
import X.InterfaceC1613700s5w;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaPlaylistServiceImpl implements MiniDramaPlayListService {
    public final CopyOnWriteArraySet<InterfaceC1613700s5w> LIZIZ = new CopyOnWriteArraySet<>();

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService
    public final List Qn(String str) {
        Iterator<InterfaceC1613700s5w> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            List listQn = it2.next().Qn(str);
            if (listQn != null) {
                return listQn;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService
    public final void Rn(InterfaceC1613700s5w interfaceC1613700s5w) {
        this.LIZIZ.remove(interfaceC1613700s5w);
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService
    public final void Sn(String str) {
        Iterator<InterfaceC1613700s5w> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().wf0(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService
    public final void Un(InterfaceC1613700s5w interfaceC1613700s5w) {
        this.LIZIZ.add(interfaceC1613700s5w);
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService
    public final void Wn(String str) {
        Iterator<InterfaceC1613700s5w> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().H20(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService
    public final CollectionDetailModel cj(String str) {
        Iterator<InterfaceC1613700s5w> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            CollectionDetailModel collectionDetailModelCj = it2.next().cj(str);
            if (collectionDetailModelCj != null) {
                return collectionDetailModelCj;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService
    public final Pair<String, String> kj(String str) {
        Iterator<InterfaceC1613700s5w> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            Pair<String, String> pairKj = it2.next().kj(str);
            if (pairKj != null) {
                return pairKj;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[PHI: r5 r12 r13 r14 r15 r17
      0x0036: PHI (r5v15 int) = (r5v0 int), (r5v16 int) binds: [B:73:0x00dd, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r12v17 boolean) = (r12v2 boolean), (r12v18 boolean) binds: [B:73:0x00dd, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r13v16 boolean) = (r13v1 boolean), (r13v17 boolean) binds: [B:73:0x00dd, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r14v16 java.lang.String) = (r14v1 java.lang.String), (r14v17 java.lang.String) binds: [B:73:0x00dd, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r15v16 long) = (r15v1 long), (r15v17 long) binds: [B:73:0x00dd, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r17v15 boolean) = (r17v0 boolean), (r17v16 boolean) binds: [B:73:0x00dd, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a A[PHI: r1 r5 r12 r13 r14 r15 r17
      0x003a: PHI (r1v0 com.ss.android.ugc.aweme.feed.model.SeriesCategory) = (r1v16 com.ss.android.ugc.aweme.feed.model.SeriesCategory), (r1v17 com.ss.android.ugc.aweme.feed.model.SeriesCategory) binds: [B:26:0x0038, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r5v1 int) = (r5v15 int), (r5v16 int) binds: [B:26:0x0038, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r12v3 boolean) = (r12v17 boolean), (r12v18 boolean) binds: [B:26:0x0038, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r13v2 boolean) = (r13v16 boolean), (r13v17 boolean) binds: [B:26:0x0038, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r14v2 java.lang.String) = (r14v16 java.lang.String), (r14v17 java.lang.String) binds: [B:26:0x0038, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r15v2 long) = (r15v16 long), (r15v17 long) binds: [B:26:0x0038, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r17v1 boolean) = (r17v15 boolean), (r17v16 boolean) binds: [B:26:0x0038, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab A[PHI: r1 r5 r12 r13 r14 r15 r17
      0x00ab: PHI (r1v15 com.ss.android.ugc.aweme.feed.model.SeriesCategory) = (r1v0 com.ss.android.ugc.aweme.feed.model.SeriesCategory), (r1v16 com.ss.android.ugc.aweme.feed.model.SeriesCategory) binds: [B:28:0x003c, B:26:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r5v14 int) = (r5v1 int), (r5v15 int) binds: [B:28:0x003c, B:26:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r12v16 boolean) = (r12v3 boolean), (r12v17 boolean) binds: [B:28:0x003c, B:26:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r13v15 boolean) = (r13v2 boolean), (r13v16 boolean) binds: [B:28:0x003c, B:26:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r14v15 java.lang.String) = (r14v2 java.lang.String), (r14v16 java.lang.String) binds: [B:28:0x003c, B:26:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r15v15 long) = (r15v2 long), (r15v16 long) binds: [B:28:0x003c, B:26:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r17v14 boolean) = (r17v1 boolean), (r17v15 boolean) binds: [B:28:0x003c, B:26:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0 A[PHI: r1 r5 r12 r13 r14 r15 r17 r20
      0x00b0: PHI (r1v14 com.ss.android.ugc.aweme.feed.model.SeriesCategory) = (r1v1 com.ss.android.ugc.aweme.feed.model.SeriesCategory), (r1v15 com.ss.android.ugc.aweme.feed.model.SeriesCategory) binds: [B:31:0x0042, B:49:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r5v13 int) = (r5v2 int), (r5v14 int) binds: [B:31:0x0042, B:49:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r12v15 boolean) = (r12v4 boolean), (r12v16 boolean) binds: [B:31:0x0042, B:49:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r13v14 boolean) = (r13v3 boolean), (r13v15 boolean) binds: [B:31:0x0042, B:49:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r14v14 java.lang.String) = (r14v3 java.lang.String), (r14v15 java.lang.String) binds: [B:31:0x0042, B:49:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r15v14 long) = (r15v3 long), (r15v15 long) binds: [B:31:0x0042, B:49:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r17v13 boolean) = (r17v2 boolean), (r17v14 boolean) binds: [B:31:0x0042, B:49:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r20v12 boolean) = (r20v1 boolean), (r20v13 boolean) binds: [B:31:0x0042, B:49:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3 A[PHI: r1 r5 r12 r13 r14 r15 r17 r20 r21
      0x00b3: PHI (r1v13 com.ss.android.ugc.aweme.feed.model.SeriesCategory) = (r1v2 com.ss.android.ugc.aweme.feed.model.SeriesCategory), (r1v14 com.ss.android.ugc.aweme.feed.model.SeriesCategory) binds: [B:34:0x004a, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r5v12 int) = (r5v3 int), (r5v13 int) binds: [B:34:0x004a, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r12v14 boolean) = (r12v5 boolean), (r12v15 boolean) binds: [B:34:0x004a, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r13v13 boolean) = (r13v4 boolean), (r13v14 boolean) binds: [B:34:0x004a, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r14v13 java.lang.String) = (r14v4 java.lang.String), (r14v14 java.lang.String) binds: [B:34:0x004a, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r15v13 long) = (r15v4 long), (r15v14 long) binds: [B:34:0x004a, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r17v12 boolean) = (r17v3 boolean), (r17v13 boolean) binds: [B:34:0x004a, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r20v11 boolean) = (r20v2 boolean), (r20v12 boolean) binds: [B:34:0x004a, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r21v11 java.lang.String) = (r21v2 java.lang.String), (r21v0 java.lang.String) binds: [B:34:0x004a, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8 A[PHI: r1 r5 r12 r13 r14 r15 r17 r20 r21 r22
      0x00b8: PHI (r1v12 com.ss.android.ugc.aweme.feed.model.SeriesCategory) = (r1v3 com.ss.android.ugc.aweme.feed.model.SeriesCategory), (r1v13 com.ss.android.ugc.aweme.feed.model.SeriesCategory) binds: [B:37:0x0052, B:54:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r5v11 int) = (r5v4 int), (r5v12 int) binds: [B:37:0x0052, B:54:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r12v13 boolean) = (r12v6 boolean), (r12v14 boolean) binds: [B:37:0x0052, B:54:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r13v12 boolean) = (r13v5 boolean), (r13v13 boolean) binds: [B:37:0x0052, B:54:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r14v12 java.lang.String) = (r14v5 java.lang.String), (r14v13 java.lang.String) binds: [B:37:0x0052, B:54:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r15v12 long) = (r15v5 long), (r15v13 long) binds: [B:37:0x0052, B:54:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r17v11 boolean) = (r17v4 boolean), (r17v12 boolean) binds: [B:37:0x0052, B:54:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r20v10 boolean) = (r20v3 boolean), (r20v11 boolean) binds: [B:37:0x0052, B:54:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r21v10 java.lang.String) = (r21v3 java.lang.String), (r21v11 java.lang.String) binds: [B:37:0x0052, B:54:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r22v8 boolean) = (r22v1 boolean), (r22v9 boolean) binds: [B:37:0x0052, B:54:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd A[PHI: r1 r5 r12 r13 r14 r15 r17 r20 r21 r22 r24
      0x00bd: PHI (r1v11 com.ss.android.ugc.aweme.feed.model.SeriesCategory) = (r1v4 com.ss.android.ugc.aweme.feed.model.SeriesCategory), (r1v12 com.ss.android.ugc.aweme.feed.model.SeriesCategory) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r5v10 int) = (r5v5 int), (r5v11 int) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r12v12 boolean) = (r12v7 boolean), (r12v13 boolean) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r13v11 boolean) = (r13v6 boolean), (r13v12 boolean) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r14v11 java.lang.String) = (r14v6 java.lang.String), (r14v12 java.lang.String) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r15v11 long) = (r15v6 long), (r15v12 long) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r17v10 boolean) = (r17v5 boolean), (r17v11 boolean) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r20v9 boolean) = (r20v4 boolean), (r20v10 boolean) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r21v9 java.lang.String) = (r21v4 java.lang.String), (r21v10 java.lang.String) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r22v7 boolean) = (r22v2 boolean), (r22v8 boolean) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r24v6 boolean) = (r24v1 boolean), (r24v7 boolean) binds: [B:40:0x005a, B:57:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2 A[PHI: r1 r5 r8 r12 r13 r14 r15 r17 r20 r21 r22 r23 r24
      0x00c2: PHI (r1v5 com.ss.android.ugc.aweme.feed.model.SeriesCategory) = (r1v10 com.ss.android.ugc.aweme.feed.model.SeriesCategory), (r1v11 com.ss.android.ugc.aweme.feed.model.SeriesCategory) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r5v6 int) = (r5v9 int), (r5v10 int) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r8v0 X.0s4A) = (r8v3 X.0s4A), (r8v4 X.0s4A) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r12v8 boolean) = (r12v11 boolean), (r12v12 boolean) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r13v7 boolean) = (r13v10 boolean), (r13v11 boolean) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r14v7 java.lang.String) = (r14v10 java.lang.String), (r14v11 java.lang.String) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r15v7 long) = (r15v10 long), (r15v11 long) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r17v6 boolean) = (r17v9 boolean), (r17v10 boolean) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r20v5 boolean) = (r20v8 boolean), (r20v9 boolean) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r21v5 java.lang.String) = (r21v8 java.lang.String), (r21v9 java.lang.String) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r22v3 boolean) = (r22v6 boolean), (r22v7 boolean) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r23v1 boolean) = (r23v4 boolean), (r23v5 boolean) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r24v2 boolean) = (r24v5 boolean), (r24v6 boolean) binds: [B:43:0x0064, B:61:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3 A[PHI: r12
      0x00d3: PHI (r12v1 boolean) = (r12v0 boolean), (r12v20 boolean) binds: [B:66:0x00cf, B:18:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vn(androidx.fragment.app.Fragment r34, X.C1613690s5v r35) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.component.impl.MiniDramaPlaylistServiceImpl.Vn(androidx.fragment.app.Fragment, X.0s5v):void");
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService
    public final void Xn(String str, C1613520s5e c1613520s5e) {
        synchronized (C718460SGe.LIZ) {
            if (C718460SGe.LIZIZ != null) {
                C718460SGe.LIZIZ = null;
            }
        }
        Iterator<InterfaceC1613700s5w> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().PN0(str, c1613520s5e);
        }
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService
    public final void Tn(String str, String str2, String str3) {
        Iterator<InterfaceC1613700s5w> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().kv2(str, str2, str3);
        }
    }
}
