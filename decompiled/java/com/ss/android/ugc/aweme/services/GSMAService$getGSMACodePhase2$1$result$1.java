package com.ss.android.ugc.aweme.services;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C19EG;
import X.C1C7U;
import X.C1DFB;
import X.C23250099c;
import X.EnumC852910Xd3;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService$getGSMACodePhase2$1$result$1", f = "GSMAService.kt", l = {129}, m = "invokeSuspend")
public final class GSMAService$getGSMACodePhase2$1$result$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GSMAGetCodeResult>, Object> {
    public final /* synthetic */ C19EG $activity;
    public final /* synthetic */ String $enterFrom;
    public final /* synthetic */ String $enterMethod;
    public final /* synthetic */ String $loginPanelType;
    public final /* synthetic */ String $phone;
    public final /* synthetic */ EnumC852910Xd3 $step;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSMAService$getGSMACodePhase2$1$result$1(C19EG c19eg, String str, EnumC852910Xd3 enumC852910Xd3, String str2, String str3, String str4, InterfaceC1364105Vn<? super GSMAService$getGSMACodePhase2$1$result$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.$activity = c19eg;
        this.$phone = str;
        this.$step = enumC852910Xd3;
        this.$enterFrom = str2;
        this.$enterMethod = str3;
        this.$loginPanelType = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new GSMAService$getGSMACodePhase2$1$result$1(this.$activity, this.$phone, this.$step, this.$enterFrom, this.$enterMethod, this.$loginPanelType, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GSMAGetCodeResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.GSMAService$getGSMACodePhase2$1$result$1$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService$getGSMACodePhase2$1$result$1$1", f = "GSMAService.kt", l = {130}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GSMAGetCodeResult>, Object> {
        public final /* synthetic */ C19EG $activity;
        public final /* synthetic */ String $enterFrom;
        public final /* synthetic */ String $enterMethod;
        public final /* synthetic */ String $loginPanelType;
        public final /* synthetic */ String $phone;
        public final /* synthetic */ EnumC852910Xd3 $step;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19EG c19eg, String str, EnumC852910Xd3 enumC852910Xd3, String str2, String str3, String str4, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$activity = c19eg;
            this.$phone = str;
            this.$step = enumC852910Xd3;
            this.$enterFrom = str2;
            this.$enterMethod = str3;
            this.$loginPanelType = str4;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass1(this.$activity, this.$phone, this.$step, this.$enterFrom, this.$enterMethod, this.$loginPanelType, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GSMAGetCodeResult> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("GSMAService@d4af.getGSMACodePhase2$1$result$1$1");
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
                GSMAService gSMAService = GSMAService.INSTANCE;
                C19EG c19eg = this.$activity;
                String str = this.$phone;
                EnumC852910Xd3 enumC852910Xd3 = this.$step;
                String str2 = this.$enterFrom;
                String str3 = this.$enterMethod;
                String str4 = this.$loginPanelType;
                this.label = 1;
                obj = gSMAService.requestGsmaCode(c19eg, str, enumC852910Xd3, str2, str3, str4, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GSMAService@d4af.getGSMACodePhase2$1$result$1$1");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("GSMAService@d4af.getGSMACodePhase2$1$result$1$1");
            return obj;
        }
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GSMAService@d4af.getGSMACodePhase2$1$result$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, this.$phone, this.$step, this.$enterFrom, this.$enterMethod, this.$loginPanelType, null);
            this.label = 1;
            obj = C23250099c.LJI(this, c1dfb, anonymousClass1);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GSMAService@d4af.getGSMACodePhase2$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GSMAService@d4af.getGSMACodePhase2$1$result$1");
        return obj;
    }
}
