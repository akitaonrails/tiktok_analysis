package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel;

import X.AbstractC316870CbV;
import X.AnonymousClass0956;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C1728230v4f;
import X.C1728460v52;
import X.C1728720v5S;
import X.C1728990v5t;
import X.C1729550v6n;
import X.C1729860v7I;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1728700v5Q;
import X.InterfaceC1729810v7D;
import X.InterfaceC1891350zJl;
import X.InterfaceC20673515v3;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.UploadConfigData;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ImageListViewModel extends AssemListViewModel<C1729860v7I, ImageItem, Integer> {
    public static final /* synthetic */ int LLJ = 0;
    public final C1728230v4f LL = new C1728230v4f();
    public final C1729550v6n LLILLJJLI = new Object() { // from class: X.0v6n
    };
    public final InterfaceC1728700v5Q LLILLL;
    public final C1728720v5S LLILZ;
    public InterfaceC1729810v7D LLILZIL;
    public final HashSet<String> LLILZLL;
    public AnonymousClass0956 LLIZ;
    public long LLIZLLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1729860v7I(0);
    }

    public final void vQ2() {
        AnonymousClass0956 anonymousClass0956;
        try {
            AnonymousClass0956 anonymousClass09562 = this.LLIZ;
            if (anonymousClass09562 == null || !anonymousClass09562.isActive() || (anonymousClass0956 = this.LLIZ) == null) {
                return;
            }
            anonymousClass0956.LIZIZ(new CancellationException("manual cancel upload image"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0v6n] */
    public ImageListViewModel() {
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        this.LLILLL = interfaceC20673515v3K4 != null ? interfaceC20673515v3K4.LLI() : null;
        this.LLILZ = new C1728720v5S();
        this.LLILZLL = new HashSet<>();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<ImageItem> c627660Ojc) {
        setState(new AwS605S0100000_26(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 336));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[PHI: r3
      0x002e: PHI (r3v2 java.util.List) = (r3v1 java.util.List), (r3v3 java.util.List) binds: [B:16:0x002c, B:14:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1729770v79
            if (r0 == 0) goto L6e
            r5 = r7
            X.0v79 r5 = (X.C1729770v79) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L51
            if (r0 != r2) goto L98
            X.C155000ia.LIZIZ(r4)
        L22:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageListData r4 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageListData) r4
            if (r4 == 0) goto L2a
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem> r3 = r4.imageList
            if (r3 != 0) goto L2e
        L2a:
            X.13BV r3 = X.C13BV.INSTANCE
            if (r4 == 0) goto L88
        L2e:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L88
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 337(0x151, float:4.72E-43)
            r1.<init>(r4, r0)
            r6.setState(r1)
            int r1 = r3.size()
            int r0 = r4.total
            if (r1 < r0) goto L74
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r2 = new X.0Cb8
            r2.<init>(r3)
            return r2
        L51:
            X.C155000ia.LIZIZ(r4)
            X.0v7D r0 = r6.LLILZIL
            if (r0 == 0) goto La0
            X.0v5t r0 = r0.Um1()
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r0 = r0.LL
            if (r0 == 0) goto La0
            java.lang.String r1 = r0.authorId
            r5.LLILLL = r2
            r0 = 0
            java.lang.Object r4 = r6.wQ2(r0, r1, r5)
            if (r4 != r3) goto L22
            return r3
        L6e:
            X.0v79 r5 = new X.0v79
            r5.<init>(r6, r7)
            goto L12
        L74:
            X.0CcB r2 = X.AbstractC316870CbV.LIZ
            int r0 = r3.size()
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            r2.getClass()
            X.0Cm0 r2 = new X.0Cm0
            r0 = 0
            r2.<init>(r0, r1, r3)
            return r2
        L88:
            r0 = 372(0x174, float:5.21E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            r6.setState(r0)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cb8 r0 = X.C317290CcB.LIZIZ(r0)
            return r0
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La0:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cb8 r0 = X.C317290CcB.LIZIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.UploadConfigData> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1729790v7B
            if (r0 == 0) goto L21
            r5 = r7
            X.0v7B r5 = (X.C1729790v7B) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r0 = 0
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            goto L43
        L21:
            X.0v7B r5 = new X.0v7B
            r5.<init>(r6, r7)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            X.0v4f r1 = r6.LL     // Catch: java.lang.Throwable -> L49
            X.0v4e r1 = r1.LLILLJJLI     // Catch: java.lang.Throwable -> L49
            r5.LLILLL = r2     // Catch: java.lang.Throwable -> L49
            X.0v4f r1 = r1.LL     // Catch: java.lang.Throwable -> L49
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.repo.BillboardNetApi r1 = r1.LL     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = r1.getUploadConfig(r5)     // Catch: java.lang.Throwable -> L49
            if (r4 != r3) goto L46
            return r3
        L43:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L49
        L46:
            X.0X52 r4 = (X.C0X52) r4     // Catch: java.lang.Throwable -> L49
            goto L4e
        L49:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            r4 = r0
        L4e:
            if (r4 == 0) goto L58
            T r1 = r4.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r1
            if (r1 == 0) goto L58
            T r0 = r1.data
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel.xQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(int r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1729780v7A
            if (r0 == 0) goto L59
            r4 = r8
            X.0v7A r4 = (X.C1729780v7A) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L99
            int r5 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageListData r3 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageListData) r3
            if (r3 != 0) goto L5f
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cb8 r0 = X.C317290CcB.LIZIZ(r0)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r3)
            java.util.List r0 = r6.listGetAll()
            if (r0 == 0) goto L57
            int r5 = r0.size()
        L3c:
            X.0v7D r0 = r6.LLILZIL
            if (r0 == 0) goto La1
            X.0v5t r0 = r0.Um1()
            if (r0 == 0) goto La1
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r0 = r0.LL
            if (r0 == 0) goto La1
            java.lang.String r0 = r0.authorId
            r4.LL = r5
            r4.LLILZ = r1
            java.lang.Object r3 = r6.wQ2(r5, r0, r4)
            if (r3 != r2) goto L24
            return r2
        L57:
            r5 = 0
            goto L3c
        L59:
            X.0v7A r4 = new X.0v7A
            r4.<init>(r6, r8)
            goto L12
        L5f:
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem> r2 = r3.imageList
            if (r2 != 0) goto L65
            X.13BV r2 = X.C13BV.INSTANCE
        L65:
            int r1 = r2.size()
            int r1 = r1 + r5
            int r0 = r3.total
            if (r1 < r0) goto L79
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r2)
            return r0
        L79:
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem> r4 = r3.imageList
            if (r4 != 0) goto L7f
            X.13BV r4 = X.C13BV.INSTANCE
        L7f:
            X.0CcB r3 = X.AbstractC316870CbV.LIZ
            int r0 = r5 + (-1)
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
            int r0 = r4.size()
            int r5 = r5 + r0
            java.lang.Integer r1 = X.C2286608xc.LJ(r5)
            r3.getClass()
            X.0Cm0 r0 = new X.0Cm0
            r0.<init>(r2, r1, r4)
            return r0
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La1:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cb8 r0 = X.C317290CcB.LIZIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel.onLoadMore(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.InterfaceC1729810v7D r8, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1729760v78
            if (r0 == 0) goto L24
            r6 = r9
            X.0v78 r6 = (X.C1729760v78) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 0
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            X.0v7D r8 = r6.LL
            goto L54
        L24:
            X.0v78 r6 = new X.0v78
            r6.<init>(r7, r9)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r5)
            if (r8 == 0) goto L42
            X.0v5t r0 = r8.Um1()
            if (r0 == 0) goto L42
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r0.LLILZIL
        L3f:
            if (r0 != 0) goto L6c
            goto L44
        L42:
            r0 = r2
            goto L3f
        L44:
            X.0v7z r0 = X.C1730290v7z.LIZ     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L67
            r6.LL = r8     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L67
            r6.LLILZ = r1     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L67
            r0.getClass()     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L67
            java.lang.Object r5 = X.C1730290v7z.LIZLLL(r3, r6)     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L67
            if (r5 != r4) goto L57
            return r4
        L54:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L67
        L57:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r5 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r5     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L67
            r2 = r5
            goto L5f
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5f:
            if (r2 == 0) goto L66
            if (r8 == 0) goto L66
            r8.wh1(r2, r3)
        L66:
            return r2
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel.yQ2(X.0v7D, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(int r12, java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C1729800v7C
            if (r0 == 0) goto L21
            r10 = r14
            X.0v7C r10 = (X.C1729800v7C) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r5 = r10.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L27
            goto L5b
        L21:
            X.0v7C r10 = new X.0v7C
            r10.<init>(r11, r14)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r5)
            r0 = 619(0x26b, float:8.67E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            r11.setState(r0)
            X.0v4f r0 = r11.LL     // Catch: java.lang.Throwable -> L61
            X.0v4e r2 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L61
            r7 = 8
            X.0v7D r0 = r11.LLILZIL     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L58
            boolean r9 = r0.UG0()     // Catch: java.lang.Throwable -> L61
        L49:
            r10.LLILLL = r4     // Catch: java.lang.Throwable -> L61
            X.0v4f r0 = r2.LL     // Catch: java.lang.Throwable -> L61
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.repo.BillboardNetApi r5 = r0.LL     // Catch: java.lang.Throwable -> L61
            r6 = r13
            r8 = r12
            java.lang.Object r5 = r5.getBillboardImages(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L61
            if (r5 != r3) goto L5e
            goto L5a
        L58:
            r9 = 0
            goto L49
        L5a:
            return r3
        L5b:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L61
        L5e:
            X.0X52 r5 = (X.C0X52) r5     // Catch: java.lang.Throwable -> L61
            goto L66
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r5 = r1
        L66:
            if (r5 == 0) goto L8c
            boolean r0 = r5.LIZJ()
            if (r0 == 0) goto L8c
            X.06Xi r3 = new X.06Xi
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.<init>(r0)
        L77:
            kotlin.jvm.internal.AwS605S0100000_26 r2 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 640(0x280, float:8.97E-43)
            r2.<init>(r3, r0)
            r11.setState(r2)
            if (r5 == 0) goto L8b
            T r0 = r5.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L8b
            T r1 = r0.data
        L8b:
            return r1
        L8c:
            X.01vg r3 = new X.01vg
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r0 = "fetch image list failed"
            r2.<init>(r0)
            r3.<init>(r2)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel.wQ2(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Object BQ2(String str, UploadConfigData uploadConfigData, AwS605S0100000_26 awS605S0100000_26, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1729550v6n c1729550v6n = this.LLILLJJLI;
        String str2 = uploadConfigData.imagexHost;
        String str3 = uploadConfigData.accessKey;
        String str4 = uploadConfigData.secretKey;
        String str5 = uploadConfigData.sessionToken;
        String str6 = uploadConfigData.serviceId;
        final AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(c2252611DEt, 737);
        final AwS601S0100000_22 awS601S0100000_222 = new AwS601S0100000_22(c2252611DEt, 738);
        final AwS605S0100000_26 awS605S0100000_262 = new AwS605S0100000_26(awS605S0100000_26, 611);
        c1729550v6n.getClass();
        BDImageXUploader bDImageXUploader = new BDImageXUploader();
        bDImageXUploader.setFilePath(1, new String[]{str});
        bDImageXUploader.setUploadDomain(str2);
        bDImageXUploader.setTopAccessKey(str3);
        bDImageXUploader.setTopSecretKey(str4);
        bDImageXUploader.setTopSessionToken(str5);
        bDImageXUploader.setServiceID(str6);
        bDImageXUploader.setSliceSize(524288);
        bDImageXUploader.setSocketNum(2);
        bDImageXUploader.setSliceRetryCount(3);
        bDImageXUploader.setFileRetryCount(3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eclive_billboard_upload_");
        sbLIZ.append(UUID.randomUUID());
        bDImageXUploader.setTraceId(C2188811AlT.LIZIZ(sbLIZ));
        bDImageXUploader.setOpenBoe(false);
        bDImageXUploader.setListener(new BDImageXUploaderListener() { // from class: X.0v77
            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final int imageXUploadCheckNetState(int i, int i2) {
                return 1;
            }

            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final void onLog(int i, int i2, String str7) {
            }

            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
                Long lValueOf;
                try {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 6) {
                                    if (i != 7) {
                                        return;
                                    }
                                } else if (bDImageXInfo != null) {
                                    awS601S0100000_22.invoke(new C1729540v6m(bDImageXInfo.mImageTosKey));
                                    return;
                                } else {
                                    awS601S0100000_222.invoke(new Throwable("upload response tos key is null"));
                                    return;
                                }
                            } else {
                                awS601S0100000_222.invoke(new Throwable("upload canceled"));
                                return;
                            }
                        }
                        Function1<Throwable, Unit> function1 = awS601S0100000_222;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("upload failed, error: ");
                        if (bDImageXInfo == null) {
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(bDImageXInfo.mErrorCode);
                        }
                        sbLIZ2.append(lValueOf);
                        function1.invoke(new Throwable(C2188811AlT.LIZIZ(sbLIZ2)));
                        return;
                    }
                    awS605S0100000_262.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Function1<Throwable, Unit> function12 = awS601S0100000_222;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("upload failed: ");
                    sbLIZ3.append(th.getMessage());
                    function12.invoke(new Throwable(C2188811AlT.LIZIZ(sbLIZ3)));
                }
            }
        });
        bDImageXUploader.start();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void zQ2(Integer num, String str, boolean z, boolean z2) {
        C1728990v5t c1728990v5tUm1;
        String resourceId;
        String str2;
        String str3;
        InterfaceC1729810v7D interfaceC1729810v7D = this.LLILZIL;
        if (interfaceC1729810v7D != null && (c1728990v5tUm1 = interfaceC1729810v7D.Um1()) != null) {
            RootData rootData = c1728990v5tUm1.LL;
            LiveEffect liveEffect = c1728990v5tUm1.LLILZIL;
            if (liveEffect == null || (resourceId = liveEffect.getResourceId()) == null) {
                resourceId = "";
            }
            if (z) {
                str2 = "image_upload";
            } else {
                str2 = "image_list";
            }
            if (z2) {
                str3 = "display_total_success";
            } else {
                str3 = "display_total_fail";
            }
            C1728460v52.LIZ(rootData, "notice_board_template", resourceId, str2, str3, "display_total", z2, Long.valueOf(System.currentTimeMillis() - this.LLIZLLLIL), num, str);
        }
    }
}
