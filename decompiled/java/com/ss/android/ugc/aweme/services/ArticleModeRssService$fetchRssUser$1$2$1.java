package com.ss.android.ugc.aweme.services;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C1166090gRz;
import X.C155000ia;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.services.ArticleModeRssService$fetchRssUser$1$2$1", f = "ArticleModeRssService.kt", l = {}, m = "invokeSuspend")
public final class ArticleModeRssService$fetchRssUser$1$2$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<C1166090gRz, Unit> $onSuccess;
    public final /* synthetic */ C1166090gRz $rssUser;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArticleModeRssService$fetchRssUser$1$2$1(Function1<? super C1166090gRz, Unit> function1, C1166090gRz c1166090gRz, InterfaceC1364105Vn<? super ArticleModeRssService$fetchRssUser$1$2$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.$onSuccess = function1;
        this.$rssUser = c1166090gRz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new ArticleModeRssService$fetchRssUser$1$2$1(this.$onSuccess, this.$rssUser, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArticleModeRssService@eaab.fetchRssUser$1$2$1");
        C099R.LJFF();
        if (this.label == 0) {
            C155000ia.LIZIZ(obj);
            this.$onSuccess.invoke(this.$rssUser);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ArticleModeRssService@eaab.fetchRssUser$1$2$1");
            return unit;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
