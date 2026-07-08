package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC954103oB;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomAddressInterceptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS128S0201000_1 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS128S0201000_1 awS128S0201000_1) {
        EcomAddressInterceptor ecomAddressInterceptor = (EcomAddressInterceptor) awS128S0201000_1.l0;
        Object obj = awS128S0201000_1.l1;
        int i = awS128S0201000_1.i2;
        ecomAddressInterceptor.getClass();
        EcomAddressInterceptor.LIZ(0, i, obj, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS128S0201000_1 awS128S0201000_1) {
        PlatformDiscountsCell platformDiscountsCell = (PlatformDiscountsCell) awS128S0201000_1.l0;
        TuxIconView tuxIconView = (TuxIconView) awS128S0201000_1.l1;
        int i = awS128S0201000_1.i2;
        int i2 = awS128S0201000_1.i2;
        platformDiscountsCell.getClass();
        PlatformDiscountsCell.V5(tuxIconView, i, i2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS128S0201000_1 r7) {
        /*
            java.lang.Object r0 = r7.l0
            X.03oB r0 = (X.InterfaceC954103oB) r0
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem) r0
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r0 = r0.getViewModel()
            X.043D r2 = r0.LLLFFI
            if (r2 == 0) goto L30
            java.lang.Object r1 = r7.l0
            X.03oB r1 = (X.InterfaceC954103oB) r1
            boolean r0 = r2.LIZLLL()
            if (r0 == 0) goto L30
            boolean r0 = r2.LIZJ()
            if (r0 != 0) goto L30
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem r1 = (com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem) r1
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r1 = r1.getViewModel()
            X.042z r0 = X.EnumC10351042z.BUY_NOW
            int r0 = r0.getValue()
            r1.NQ2(r0)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            java.lang.Object r6 = r7.l1
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L2d
            java.lang.Object r5 = r7.l0
            X.03oB r5 = (X.InterfaceC954103oB) r5
            int r4 = r7.i2
            X.04CD r3 = X.C1054504Al.LIZIZ
            int r0 = r3.LIZIZ
            int r2 = r0 + 1
            r1 = 5
            r0 = 0
            X.04CD r0 = X.C04CD.LIZ(r3, r0, r2, r0, r1)
            X.C1054504Al.LIZIZ = r0
            com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem r5 = (com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem) r5
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r3 = r5.getViewModel()
            android.content.Context r2 = r6.getContext()
            java.lang.String r1 = X.C960603pE.LIZLLL(r6)
            com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment r0 = r5.ip()
            r3.wQ2(r2, r1, r0, r4)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS128S0201000_1.invoke$2(kotlin.jvm.internal.AwS128S0201000_1):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0201000_1(InterfaceC954103oB interfaceC954103oB, View view, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = interfaceC954103oB;
        this.l1 = view;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0201000_1(PlatformDiscountsCell platformDiscountsCell, TuxIconView tuxIconView, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = platformDiscountsCell;
        this.l1 = tuxIconView;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0201000_1(EcomAddressInterceptor ecomAddressInterceptor, Object obj, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = ecomAddressInterceptor;
        this.l1 = obj;
        this.i2 = i;
    }
}
