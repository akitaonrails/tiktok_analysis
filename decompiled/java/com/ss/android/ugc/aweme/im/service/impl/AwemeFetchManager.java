package com.ss.android.ugc.aweme.im.service.impl;

import X.AbstractC2252651DEx;
import X.AnonymousClass0951;
import X.C05YD;
import X.C09IC;
import X.C327160Cs6;
import X.C327170Cs7;
import X.C327180Cs8;
import X.C327190Cs9;
import X.C327210CsB;
import X.InterfaceC1364105Vn;
import X.InterfaceC327200CsA;
import X.InterfaceC332260D0u;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class AwemeFetchManager implements IAwemeFetchManager {
    public static final AwemeFetchManager LIZIZ = new AwemeFetchManager();
    public static final ConcurrentHashMap<String, InterfaceC332260D0u<InterfaceC327200CsA>> LIZJ = new ConcurrentHashMap<>();

    public static final class Service implements IAwemeFetchManager {
        public final /* synthetic */ AwemeFetchManager LIZIZ = AwemeFetchManager.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
        public final Object LIZ(List<String> list, boolean z, AbstractC2252651DEx abstractC2252651DEx, InterfaceC1364105Vn<? super C327180Cs8> interfaceC1364105Vn) {
            return this.LIZIZ.LIZ(list, z, abstractC2252651DEx, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
        public final boolean LIZIZ(String str) {
            return this.LIZIZ.LIZIZ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
        public final C327170Cs7 LIZJ(String str) {
            return this.LIZIZ.LIZJ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
        public final C05YD<InterfaceC327200CsA> LIZLLL(String str) {
            return this.LIZIZ.LIZLLL(str);
        }

        @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
        public final UrlModel LJ(String str) {
            return this.LIZIZ.LJ(str);
        }
    }

    public static void LJI(String str) {
        InterfaceC332260D0u<InterfaceC327200CsA> interfaceC332260D0u = LIZJ.get(str);
        if (interfaceC332260D0u != null) {
            interfaceC332260D0u.setValue(C327210CsB.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
    public final boolean LIZIZ(String str) {
        InterfaceC327200CsA value;
        InterfaceC332260D0u<InterfaceC327200CsA> interfaceC332260D0u = LIZJ.get(str);
        if (interfaceC332260D0u != null) {
            value = interfaceC332260D0u.getValue();
        } else {
            value = null;
        }
        if (value instanceof C327160Cs6) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[PHI: r2
      0x002e: PHI (r2v1 X.0Cs7) = (r2v0 X.0Cs7), (r2v3 X.0Cs7) binds: [B:13:0x0029, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C327170Cs7 LIZJ(java.lang.String r5) {
        /*
            r4 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0D0u<X.0CsA>> r3 = com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager.LIZJ
            java.lang.Object r0 = r3.get(r5)
            X.0D0u r0 = (X.InterfaceC332260D0u) r0
            r2 = 0
            if (r0 == 0) goto L1d
            java.lang.Object r1 = r0.getValue()
            X.0CsA r1 = (X.InterfaceC327200CsA) r1
        L11:
            boolean r0 = r1 instanceof X.C327210CsB
            if (r0 == 0) goto L18
            r3.remove(r5)
        L18:
            boolean r0 = r1 instanceof X.C327190Cs9
            if (r0 != 0) goto L1f
            return r2
        L1d:
            r1 = r2
            goto L11
        L1f:
            X.0Cs9 r1 = (X.C327190Cs9) r1
            X.0Cs7 r1 = r1.LIZ
            boolean r0 = X.C327170Cs7.LIZ(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L2e
            r2 = r1
            if (r1 != 0) goto L31
        L2e:
            r3.remove(r5)
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager.LIZJ(java.lang.String):X.0Cs7");
    }

    @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
    public final C05YD<InterfaceC327200CsA> LIZLLL(String str) {
        InterfaceC332260D0u<InterfaceC327200CsA> interfaceC332260D0u = LIZJ.get(str);
        if (interfaceC332260D0u != null) {
            return C09IC.LIZIZ(interfaceC332260D0u);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
    public final UrlModel LJ(String str) {
        Aweme aweme;
        Video video;
        C327170Cs7 c327170Cs7LIZJ = LIZJ(str);
        if (c327170Cs7LIZJ != null && (aweme = c327170Cs7LIZJ.LIZIZ) != null && (video = aweme.getVideo()) != null) {
            return video.getCover();
        }
        return null;
    }

    public final boolean LJFF(String str) {
        InterfaceC327200CsA interfaceC327200CsA;
        C05YD<InterfaceC327200CsA> c05ydLIZLLL = LIZLLL(str);
        if (c05ydLIZLLL != null) {
            interfaceC327200CsA = (InterfaceC327200CsA) ((AnonymousClass0951) c05ydLIZLLL).getValue();
        } else {
            interfaceC327200CsA = null;
        }
        if ((interfaceC327200CsA instanceof C327190Cs9) && !C327170Cs7.LIZ(((C327190Cs9) interfaceC327200CsA).LIZ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    @Override // com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<java.lang.String> r11, boolean r12, X.AbstractC2252651DEx r13, X.InterfaceC1364105Vn<? super X.C327180Cs8> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C323570CmJ
            if (r0 == 0) goto Lb1
            r4 = r14
            X.0CmJ r4 = (X.C323570CmJ) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb1
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 1
            if (r0 == 0) goto L54
            if (r0 != r5) goto Lbe
            java.lang.Object r11 = r4.LL
            java.util.List r11 = (java.util.List) r11
            X.C155000ia.LIZIZ(r1)
        L26:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r11.iterator()
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager r0 = com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager.LIZIZ
            X.0Cs7 r0 = r0.LIZJ(r1)
            if (r0 != 0) goto L50
            boolean r0 = r3.add(r1)
            java.lang.Boolean.valueOf(r0)
            goto L34
        L50:
            r4.put(r1, r0)
            goto L34
        L54:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r11.iterator()
        L65:
            boolean r0 = r9.hasNext()
            r8 = 0
            if (r0 == 0) goto La1
            java.lang.Object r7 = r9.next()
            java.lang.String r7 = (java.lang.String) r7
            com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager r6 = com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager.LIZIZ
            r6.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0D0u<X.0CsA>> r0 = com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager.LIZJ
            java.lang.Object r0 = r0.get(r7)
            X.0D0u r0 = (X.InterfaceC332260D0u) r0
            if (r0 == 0) goto L85
            java.lang.Object r8 = r0.getValue()
        L85:
            boolean r0 = r8 instanceof X.C327160Cs6
            if (r0 == 0) goto L91
            boolean r0 = r2.add(r7)
            java.lang.Boolean.valueOf(r0)
            goto L65
        L91:
            boolean r0 = r6.LJFF(r7)
            if (r0 == 0) goto L99
            if (r12 != 0) goto L65
        L99:
            boolean r0 = r1.add(r7)
            java.lang.Boolean.valueOf(r0)
            goto L65
        La1:
            X.0CmI r0 = new X.0CmI
            r0.<init>(r2, r1, r13, r8)
            r4.LL = r11
            r4.LLILZ = r5
            java.lang.Object r0 = X.C23250099c.LJI(r4, r13, r0)
            if (r0 != r3) goto L26
            return r3
        Lb1:
            X.0CmJ r4 = new X.0CmJ
            r4.<init>(r10, r14)
            goto L12
        Lb8:
            X.0Cs8 r0 = new X.0Cs8
            r0.<init>(r4, r3)
            return r0
        Lbe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager.LIZ(java.util.List, boolean, X.1DEx, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.lang.String r5, com.ss.android.ugc.aweme.im.common.model.AwemeStatusBean r6, com.ss.android.ugc.aweme.feed.model.Aweme r7, boolean r8) {
        /*
            r4 = this;
            if (r7 == 0) goto L48
            com.ss.android.ugc.aweme.feed.model.VideoMaskInfo r0 = r7.getContentClassificationMaskInfo()
            if (r0 == 0) goto L2a
            java.lang.Boolean r1 = r0.showMask
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L82
            java.lang.String r0 = "1027"
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.setStatus(r0)
            com.ss.android.ugc.aweme.feed.model.VideoMaskInfo r0 = r7.getContentClassificationMaskInfo()
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.title
        L27:
            r6.setStatusText(r0)
        L2a:
            if (r8 != 0) goto L3b
            X.06QN r0 = com.ss.android.ugc.aweme.im.saas.host.api.feature.upvote.UpvoteFeature.LIZ
            com.ss.android.ugc.aweme.im.saas.host.api.feature.upvote.UpvoteFeature r1 = r0.LIZ()
            if (r1 == 0) goto L3b
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r1.LIZ(r0)
        L3b:
            java.lang.Class<com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService> r0 = com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService r0 = (com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService) r0
            if (r0 == 0) goto L48
            r0.LLILLL(r7)
        L48:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0D0u<X.0CsA>> r3 = com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager.LIZJ
            java.lang.Object r2 = r3.get(r5)
            X.0D0u r2 = (X.InterfaceC332260D0u) r2
            if (r2 != 0) goto L72
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZJ()
            boolean r0 = X.C894660Z7w.LIZJ()
            if (r0 != 0) goto L85
            X.0Cs9 r1 = new X.0Cs9
            X.0Cs7 r0 = new X.0Cs7
            r0.<init>(r6, r7)
            r1.<init>(r0)
            X.1DDq r0 = X.C1BNE.LIZ(r1)
            r3.put(r5, r0)
        L6e:
            r4.LIZJ(r5)
            return
        L72:
            X.0Cs9 r1 = new X.0Cs9
            X.0Cs7 r0 = new X.0Cs7
            r0.<init>(r6, r7)
            r1.<init>(r0)
            r2.setValue(r1)
            goto L6e
        L80:
            r0 = 0
            goto L27
        L82:
            if (r7 == 0) goto L48
            goto L2a
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Should be added to AwemeCache prior to querying!!!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager.LJII(java.lang.String, com.ss.android.ugc.aweme.im.common.model.AwemeStatusBean, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }
}
