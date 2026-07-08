package com.ss.android.ugc.aweme.services;

import X.AbstractC2238408pq;
import X.C06MM;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C1389890mGx;
import X.C155000ia;
import X.C19EG;
import X.C1C7U;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C558570LvT;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lth.o;
import njp.a;

/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.services.AVPublishServiceImpl$getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1", f = "AVPublishServiceImpl.kt", l = {1810}, m = "invokeSuspend")
public final class AVPublishServiceImpl$getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $it;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVPublishServiceImpl$getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1(String str, Context context, InterfaceC1364105Vn<? super AVPublishServiceImpl$getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.$it = str;
        this.$context = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AVPublishServiceImpl$getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1(this.$it, this.$context, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.services.AVPublishServiceImpl$getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1$1", f = "AVPublishServiceImpl.kt", l = {}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ AwemeDraft $targetDraft;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, AwemeDraft awemeDraft, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$context = context;
            this.$targetDraft = awemeDraft;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass1(this.$context, this.$targetDraft, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Activity activityLIZ;
            C1C7U.LIZ("AVPublishServiceImpl@3ff8.getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1$1");
            C099R.LJFF();
            if (this.label == 0) {
                C155000ia.LIZIZ(obj);
                Context context = this.$context;
                if (context != null) {
                    activityLIZ = C06MM.LIZ(context);
                } else {
                    activityLIZ = null;
                }
                if ((activityLIZ instanceof C19EG) && activityLIZ != null) {
                    AwemeDraft awemeDraft = this.$targetDraft;
                    if (awemeDraft != null) {
                        o.LJIL.LJI().LJJ(activityLIZ, awemeDraft, 5, null);
                    } else {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131829521);
                        c1389890mGx.LJIIJJI();
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AVPublishServiceImpl@3ff8.getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1$1");
                return unit;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AVPublishServiceImpl@3ff8.getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AwemeDraft awemeDraftLJI = o.LJIL.LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(this.$it, 0, null, 6, null), true, true, true));
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, awemeDraftLJI, null);
            this.label = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, anonymousClass1) == objLJFF) {
                C1C7U.LIZIZ("AVPublishServiceImpl@3ff8.getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AVPublishServiceImpl@3ff8.getDraftNotificationDeeplinkInterceptor$1$onInterceptRoute$1$1");
        return unit;
    }
}
