package com.ss.android.ugc.aweme.im.sticker.basic.stickerstore;

import X.AbstractC450030Hkn;
import X.AbstractC450200Hl4;
import X.C01S9;
import X.C05YD;
import X.C098200Yq;
import X.C09R3;
import X.C1389890mGx;
import X.C13LE;
import X.C1807670x8n;
import X.C189200o6;
import X.C2217381BqS;
import X.C450100Hku;
import X.C450160Hl0;
import X.EnumC441530HTb;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC450290HlD;
import X.InterfaceC450440HlS;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.ss.android.ugc.aweme.util.IStickerStoreHelper;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class BasicStickerStoreHelper implements IStickerStoreHelper {
    public static final BasicStickerStoreHelper LIZLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public volatile InterfaceC450290HlD LIZIZ;
    public volatile C450100Hku LIZJ;

    public static final class Service implements IStickerStoreHelper {
        public final /* synthetic */ BasicStickerStoreHelper LIZIZ = BasicStickerStoreHelper.LIZLLL;

        @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
        public final Object LIZ(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
            return this.LIZIZ.LIZ(str, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
        public final Object LIZIZ(String str, String str2, View view, long j, String str3, int i, String str4, Integer num, InterfaceC450440HlS interfaceC450440HlS, Function0<Unit> function0, boolean z, Integer num2, Integer num3, boolean z2, String str5, EnumC441530HTb enumC441530HTb, Integer num4, String str6, boolean z3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return this.LIZIZ.LIZIZ(str, str2, view, j, str3, i, str4, num, interfaceC450440HlS, function0, z, num2, num3, z2, str5, enumC441530HTb, num4, str6, z3, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
        public final StickerTemplate LIZJ(StickerItem stickerItem, Context context) {
            this.LIZIZ.getClass();
            return null;
        }

        @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
        public final boolean LIZLLL(String str) {
            return this.LIZIZ.LIZLLL(str);
        }

        @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
        public final Object LJ(Long l, String str, InterfaceC1364105Vn<? super StickerSetInfo> interfaceC1364105Vn) {
            return this.LIZIZ.LJ(l, "comment", interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
        public final Object LJFF(View view, Long l, String str, Integer num, String str2, Long l2, Integer num2, InterfaceC450440HlS interfaceC450440HlS, Integer num3, String str3, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return this.LIZIZ.LJFF(view, l, str, num, str2, l2, num2, interfaceC450440HlS, num3, str3, z, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
        public final C01S9<AbstractC450200Hl4> getFavouriteStickerUpdateFlow() {
            return this.LIZIZ.getFavouriteStickerUpdateFlow();
        }

        @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
        public final void updateFavStickerVariant(long j, @StickerVariant int i) {
            this.LIZIZ.updateFavStickerVariant(j, i);
        }
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BasicStickerStoreHelper.class, "stickersRepository", "getStickersRepository()Lcom/ss/android/ugc/aweme/im/sticker/api/repo/IMStickerRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BasicStickerStoreHelper.class, "basicStickerRepository", "getBasicStickerRepository()Lcom/ss/android/ugc/aweme/im/sticker/basic/repo/BasicStickerRepository;", 0);
        c09r3.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LIZLLL = new BasicStickerStoreHelper();
    }

    @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
    public final StickerTemplate LIZJ(StickerItem stickerItem, Context context) {
        return null;
    }

    public final InterfaceC450290HlD LJI() {
        InterfaceC450290HlD interfaceC450290HlD = this.LIZIZ;
        if (interfaceC450290HlD == null) {
            synchronized (this) {
                interfaceC450290HlD = this.LIZIZ;
                if (interfaceC450290HlD == null) {
                    InterfaceC450290HlD interfaceC450290HlD2 = (InterfaceC450290HlD) C1807670x8n.LLLLLZ();
                    this.LIZIZ = interfaceC450290HlD2;
                    return interfaceC450290HlD2;
                }
            }
        }
        return interfaceC450290HlD;
    }

    @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
    public final C01S9<AbstractC450200Hl4> getFavouriteStickerUpdateFlow() {
        C450100Hku c450100Hku = this.LIZJ;
        if (c450100Hku == null) {
            synchronized (this) {
                c450100Hku = this.LIZJ;
                if (c450100Hku == null) {
                    c450100Hku = (C450100Hku) C1807670x8n.LLLLZLLLI((C450160Hl0) C1807670x8n.LLLLZLLIL());
                    this.LIZJ = c450100Hku;
                }
            }
        }
        return c450100Hku.getFavouriteStickerUpdateFlow();
    }

    @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
    public final boolean LIZLLL(String str) {
        Object c098200Yq;
        AbstractC450030Hkn<List<StickerItem>> value;
        List<StickerItem> listLIZ;
        String string;
        Long l;
        try {
            C05YD<AbstractC450030Hkn<List<StickerItem>>> favouriteStickersFlow = LJI().getFavouriteStickersFlow();
            boolean z = false;
            if (favouriteStickersFlow != null && (value = favouriteStickersFlow.getValue()) != null && (listLIZ = value.LIZ()) != null && !listLIZ.isEmpty()) {
                for (StickerItem stickerItem : listLIZ) {
                    StickerBase stickerBase = stickerItem.stickerBase;
                    String str2 = null;
                    if (stickerBase != null && (l = stickerBase.id) != null) {
                        string = l.toString();
                    } else {
                        string = null;
                    }
                    if (!Intrinsics.LJFF(string, str)) {
                        StickerBase stickerBase2 = stickerItem.stickerBase;
                        if (stickerBase2 != null) {
                            str2 = stickerBase2.thirdPartyStickerId;
                        }
                        if (Intrinsics.LJFF(str2, str)) {
                        }
                    }
                    z = true;
                }
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static void LJII(int i, View view) {
        try {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
    public final Object LIZ(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return Boolean.valueOf(LIZLLL(str));
    }

    @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
    public final void updateFavStickerVariant(long j, int i) {
        LJI().updateFavStickerVariant(j, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.Long r8, java.lang.String r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C450430HlR
            if (r0 == 0) goto L23
            r6 = r10
            X.0HlR r6 = (X.C450430HlR) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L31
            if (r0 != r4) goto L29
            java.lang.Object r8 = r6.LL
            goto L5b
        L23:
            X.0HlR r6 = new X.0HlR
            r6.<init>(r7, r10)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            if (r8 != 0) goto L37
            return r3
        L37:
            X.00Ef r2 = X.C452670Hp3.LIZ()     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L93
            r0 = 91
            r1.append(r0)     // Catch: java.lang.Throwable -> L93
            r1.append(r8)     // Catch: java.lang.Throwable -> L93
            r0 = 93
            r1.append(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L93
            r6.LL = r8     // Catch: java.lang.Throwable -> L93
            r6.LLILZ = r4     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = r2.LJIIJ(r0, r9, r6)     // Catch: java.lang.Throwable -> L93
            if (r1 != r5) goto L5e
            return r5
        L5b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L93
        L5e:
            com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetDetailListResponse r1 = (com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetDetailListResponse) r1     // Catch: java.lang.Throwable -> L93
            java.util.List r0 = r1.getStickerSetList()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L91
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L93
        L6a:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8f
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L93
            r0 = r1
            com.ss.android.ugc.aweme.im.sticker.api.model.StickerSet r0 = (com.ss.android.ugc.aweme.im.sticker.api.model.StickerSet) r0     // Catch: java.lang.Throwable -> L93
            com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo r0 = r0.info     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8d
            java.lang.Long r0 = r0.setId     // Catch: java.lang.Throwable -> L93
        L7d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L6a
        L83:
            com.ss.android.ugc.aweme.im.sticker.api.model.StickerSet r1 = (com.ss.android.ugc.aweme.im.sticker.api.model.StickerSet) r1     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L91
            com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo r1 = r1.info     // Catch: java.lang.Throwable -> L93
        L89:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L93
            goto L9f
        L8d:
            r0 = r3
            goto L7d
        L8f:
            r1 = r3
            goto L83
        L91:
            r1 = r3
            goto L89
        L93:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L9f:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto La6
            return r1
        La6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper.LJ(java.lang.Long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(android.view.View r20, java.lang.Long r21, java.lang.String r22, java.lang.Integer r23, java.lang.String r24, java.lang.Long r25, java.lang.Integer r26, X.InterfaceC450440HlS r27, java.lang.Integer r28, java.lang.String r29, boolean r30, X.InterfaceC1364105Vn<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper.LJFF(android.view.View, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Integer, X.0HlS, java.lang.Integer, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00de A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:43:0x00d8, B:45:0x00de), top: B:81:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:49:0x0113, B:52:0x0121, B:51:0x011b), top: B:79:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    @Override // com.ss.android.ugc.aweme.util.IStickerStoreHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r24, java.lang.String r25, android.view.View r26, long r27, java.lang.String r29, int r30, java.lang.String r31, java.lang.Integer r32, X.InterfaceC450440HlS r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, boolean r35, java.lang.Integer r36, java.lang.Integer r37, boolean r38, java.lang.String r39, X.EnumC441530HTb r40, java.lang.Integer r41, java.lang.String r42, boolean r43, X.InterfaceC1364105Vn<? super kotlin.Unit> r44) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper.LIZIZ(java.lang.String, java.lang.String, android.view.View, long, java.lang.String, int, java.lang.String, java.lang.Integer, X.0HlS, kotlin.jvm.functions.Function0, boolean, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, X.0HTb, java.lang.Integer, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
