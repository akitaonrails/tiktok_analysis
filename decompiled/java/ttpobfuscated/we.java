package ttpobfuscated;

import X.AbstractC23140094w;
import X.C09DV;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: loaded from: classes24.dex */
public final class we {

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.configuration.StoredConfigLoaderKt", f = "StoredConfigLoader.kt", l = {68, 70, 79}, m = "loadStoredConfig")
    public final class a extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws x7 {
            C1C7U.LIZ("we@102b.b$1");
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            Object objB = we.b(null, null, null, null, null, this);
            C1C7U.LIZIZ("we@102b.b$1");
            return objB;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.configuration.StoredConfigLoaderKt", f = "StoredConfigLoader.kt", l = {23, 25, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT, 35, 48, 49}, m = "loadStoredConfigWithFallback")
    public final class b extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int h;

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C1C7U.LIZ("we@102b.a$1");
            this.g = obj;
            this.h |= Integer.MIN_VALUE;
            Object objA = we.a(null, null, null, null, null, null, this);
            C1C7U.LIZIZ("we@102b.a$1");
            return objA;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ttpobfuscated.d1 r11, ttp.orbu.sdk.configuration.model.ConfigType r12, ttpobfuscated.pb r13, ttpobfuscated.qb r14, ttpobfuscated.t1 r15, X.InterfaceC1364105Vn<? super ttp.orbu.sdk.configuration.model.Config> r16) throws ttpobfuscated.x7 {
        /*
            r8 = r13
            r10 = r14
            r2 = r15
            r4 = r16
            boolean r0 = r4 instanceof ttpobfuscated.we.a
            if (r0 == 0) goto L9c
            r15 = r4
            ttpobfuscated.we$a r15 = (ttpobfuscated.we.a) r15
            int r3 = r15.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L9c
            int r3 = r3 - r1
            r15.e = r3
        L17:
            java.lang.Object r9 = r15.d
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r15.e
            r4 = 3
            r7 = 2
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            if (r1 == r0) goto L41
            if (r1 == r7) goto L78
            if (r1 != r4) goto La3
            X.C155000ia.LIZIZ(r9)
        L2e:
            return r9
        L2f:
            X.C155000ia.LIZIZ(r9)
            r15.a = r8
            r15.b = r10
            r15.c = r2
            r15.e = r0
            java.lang.Object r9 = r11.b(r12, r15)
            if (r9 != r5) goto L50
            return r5
        L41:
            java.lang.Object r2 = r15.c
            ttpobfuscated.t1 r2 = (ttpobfuscated.t1) r2
            java.lang.Object r10 = r15.b
            ttpobfuscated.qb r10 = (ttpobfuscated.qb) r10
            java.lang.Object r8 = r15.a
            ttpobfuscated.pb r8 = (ttpobfuscated.pb) r8
            X.C155000ia.LIZIZ(r9)
        L50:
            r6 = r9
            ttpobfuscated.se r6 = (ttpobfuscated.se) r6
            ttpobfuscated.re r1 = ttpobfuscated.re.CONFIG
            int r0 = r6.n()
            java.security.PublicKey r13 = r8.a(r1, r0)
            java.lang.String r11 = r6.k()
            java.lang.String r12 = r6.l()
            ttpobfuscated.re r14 = r6.m()
            r15.a = r2
            r15.b = r6
            r15.c = r3
            r15.e = r7
            java.lang.Object r9 = r10.a(r11, r12, r13, r14, r15)
            if (r9 != r5) goto L83
            return r5
        L78:
            java.lang.Object r6 = r15.b
            ttpobfuscated.se r6 = (ttpobfuscated.se) r6
            java.lang.Object r2 = r15.a
            ttpobfuscated.t1 r2 = (ttpobfuscated.t1) r2
            X.C155000ia.LIZIZ(r9)
        L83:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto Lab
            java.lang.String r0 = r6.k()
            r15.a = r3
            r15.b = r3
            r15.e = r4
            java.lang.Object r9 = r2.a(r0, r15)
            if (r9 != r5) goto L2e
            return r5
        L9c:
            ttpobfuscated.we$a r15 = new ttpobfuscated.we$a
            r15.<init>(r4)
            goto L17
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lab:
            ttpobfuscated.x7 r0 = new ttpobfuscated.x7
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.we.b(ttpobfuscated.d1, ttp.orbu.sdk.configuration.model.ConfigType, ttpobfuscated.pb, ttpobfuscated.qb, ttpobfuscated.t1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ttp.orbu.sdk.configuration.model.ConfigType r9, ttpobfuscated.d1 r10, ttpobfuscated.d1 r11, ttpobfuscated.pb r12, ttpobfuscated.qb r13, ttpobfuscated.t1 r14, X.InterfaceC1364105Vn<? super ttp.orbu.sdk.configuration.model.Config> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.we.a(ttp.orbu.sdk.configuration.model.ConfigType, ttpobfuscated.d1, ttpobfuscated.d1, ttpobfuscated.pb, ttpobfuscated.qb, ttpobfuscated.t1, X.05Vn):java.lang.Object");
    }
}
