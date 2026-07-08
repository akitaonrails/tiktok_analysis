package kotlin.jvm.internal;

import X.AnonymousClass0378;
import X.AnonymousClass0431;
import X.C013C;
import X.C043Y;
import X.C04E3;
import X.C09AY;
import X.C10372043u;
import X.C1054104Ah;
import X.C1062904Dr;
import X.C1741890vQh;
import X.C23250099c;
import X.C259800zU;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.router.RouteIntent;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpViewModelDelegate;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS65S0500000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS65S0500000_1 awS65S0500000_1) {
        C013C c013c = (C013C) awS65S0500000_1.l0;
        ECRouterInterceptor eCRouterInterceptor = (ECRouterInterceptor) awS65S0500000_1.l1;
        RouteIntent routeIntent = (RouteIntent) awS65S0500000_1.l2;
        Context context = (Context) awS65S0500000_1.l3;
        Integer num = (Integer) ((C259800zU) awS65S0500000_1.l4).element;
        eCRouterInterceptor.getClass();
        c013c.element = ECRouterInterceptor.LJIILJJIL(routeIntent, context, num);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: all -> 0x00e8, CancellationException -> 0x00fc, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00fc, all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0014, B:9:0x0021, B:11:0x0025, B:13:0x0029, B:18:0x003c, B:23:0x004c, B:25:0x0050, B:27:0x0054, B:28:0x0056, B:30:0x005d, B:31:0x005f, B:39:0x009f, B:45:0x00b8, B:47:0x00c5, B:49:0x00c9, B:51:0x00cd, B:52:0x00cf, B:44:0x00b4, B:38:0x009b, B:22:0x0046), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[Catch: all -> 0x00e8, CancellationException -> 0x00fc, TryCatch #2 {CancellationException -> 0x00fc, all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0014, B:9:0x0021, B:11:0x0025, B:13:0x0029, B:18:0x003c, B:23:0x004c, B:25:0x0050, B:27:0x0054, B:28:0x0056, B:30:0x005d, B:31:0x005f, B:39:0x009f, B:45:0x00b8, B:47:0x00c5, B:49:0x00c9, B:51:0x00cd, B:52:0x00cf, B:44:0x00b4, B:38:0x009b, B:22:0x0046), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[Catch: all -> 0x00e8, CancellationException -> 0x00fc, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00fc, all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0014, B:9:0x0021, B:11:0x0025, B:13:0x0029, B:18:0x003c, B:23:0x004c, B:25:0x0050, B:27:0x0054, B:28:0x0056, B:30:0x005d, B:31:0x005f, B:39:0x009f, B:45:0x00b8, B:47:0x00c5, B:49:0x00c9, B:51:0x00cd, B:52:0x00cf, B:44:0x00b4, B:38:0x009b, B:22:0x0046), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4 A[Catch: all -> 0x00e8, CancellationException -> 0x00fc, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00fc, all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0014, B:9:0x0021, B:11:0x0025, B:13:0x0029, B:18:0x003c, B:23:0x004c, B:25:0x0050, B:27:0x0054, B:28:0x0056, B:30:0x005d, B:31:0x005f, B:39:0x009f, B:45:0x00b8, B:47:0x00c5, B:49:0x00c9, B:51:0x00cd, B:52:0x00cf, B:44:0x00b4, B:38:0x009b, B:22:0x0046), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS65S0500000_1 r22) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS65S0500000_1.invoke$1(kotlin.jvm.internal.AwS65S0500000_1):java.lang.Object");
    }

    public static final Object invoke$2(AwS65S0500000_1 awS65S0500000_1) {
        PaymentInfoViewModel.AQ2((PaymentInfoViewModel) awS65S0500000_1.l0, (FragmentManager) awS65S0500000_1.l1, (PaymentMethod) awS65S0500000_1.l2, (OrderSubmitAssemViewModel) awS65S0500000_1.l3, null, null, null, (Context) awS65S0500000_1.l4, false, true, 184);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.05Vn, X.099V, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r11v3 */
    public static final Object invoke$3(AwS65S0500000_1 awS65S0500000_1) {
        boolean zLJFF;
        ProductBase productBase;
        ProductPrice productPrice;
        ?? r11 = 0;
        r11 = 0;
        SeaPdpViewModel.tS2((SeaPdpViewModel) awS65S0500000_1.l0, ((SeaPdpFragment) awS65S0500000_1.l1).getView(), null, (Map) awS65S0500000_1.l2, null, null, null, null, 2012);
        if (((SeaPdpViewModel) awS65S0500000_1.l0).jS2()) {
            IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
            PdpViewModelDelegate pdpViewModelDelegate = (PdpViewModelDelegate) awS65S0500000_1.l3;
            SeaPdpFragment seaPdpFragment = (SeaPdpFragment) awS65S0500000_1.l1;
            SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS65S0500000_1.l0;
            C1062904Dr c1062904Dr = (C1062904Dr) awS65S0500000_1.l4;
            pdpViewModelDelegate.getClass();
            AwS6S0220000_1 awS6S0220000_1 = new AwS6S0220000_1(seaPdpViewModel, true, c1062904Dr, true, 4);
            seaPdpFragment.getClass();
            iEventCenterLIZ.LIZ("ec_buy_now_click", C1741890vQh.LJIIIIZZ(awS6S0220000_1.invoke(seaPdpViewModel.FQ2())));
        } else {
            SeaPdpViewModel seaPdpViewModel2 = (SeaPdpViewModel) awS65S0500000_1.l0;
            C1054104Ah c1054104Ah = seaPdpViewModel2.LLJLIL;
            if (c1054104Ah != null) {
                Boolean bool = Boolean.TRUE;
                ProductPackStruct productPackStruct = seaPdpViewModel2.LLJIJIL;
                if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (productPrice = productBase.priceInfo) != null) {
                    zLJFF = Intrinsics.LJFF(productPrice.needIcon, bool);
                } else {
                    zLJFF = false;
                }
                C1054104Ah.LJJI(c1054104Ah, "buy_now", bool, Boolean.valueOf(zLJFF), null, null, 24);
            }
            SeaPdpViewModel seaPdpViewModel3 = (SeaPdpViewModel) awS65S0500000_1.l0;
            C1054104Ah c1054104Ah2 = seaPdpViewModel3.LLJLIL;
            if (c1054104Ah2 != null) {
                PdpViewModelDelegate pdpViewModelDelegate2 = (PdpViewModelDelegate) awS65S0500000_1.l3;
                SeaPdpFragment seaPdpFragment2 = (SeaPdpFragment) awS65S0500000_1.l1;
                C1062904Dr c1062904Dr2 = (C1062904Dr) awS65S0500000_1.l4;
                pdpViewModelDelegate2.getClass();
                AwS6S0220000_1 awS6S0220000_12 = new AwS6S0220000_1(seaPdpViewModel3, true, c1062904Dr2, true, 4);
                seaPdpFragment2.getClass();
                r11 = 0;
                C1054104Ah.LJIIJJI(c1054104Ah2, "buy_now", (HashMap) awS6S0220000_12.invoke(seaPdpViewModel3.FQ2()), (Map) awS65S0500000_1.l2, null, 44);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((SeaPdpFragment) awS65S0500000_1.l1), r11, r11, new C04E3((SeaPdpViewModel) awS65S0500000_1.l0, r11), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS65S0500000_1(C013C c013c, C013C c013c2, ECRouterInterceptor eCRouterInterceptor, RouteIntent routeIntent, Context context, C259800zU<Integer> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = eCRouterInterceptor;
        this.l3 = routeIntent;
        this.l4 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS65S0500000_1(AnonymousClass0431 anonymousClass0431, AnonymousClass0431 anonymousClass04312, C10372043u c10372043u, Response<n> response, C043Y c043y, AddItemToCartData addItemToCartData) {
        super(0);
        this.$t = addItemToCartData;
        this.l0 = anonymousClass0431;
        this.l1 = anonymousClass04312;
        this.l2 = c10372043u;
        this.l3 = response;
        this.l4 = c043y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0500000_1(PaymentInfoViewModel paymentInfoViewModel, FragmentManager fragmentManager, PaymentMethod paymentMethod, OrderSubmitAssemViewModel orderSubmitAssemViewModel, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentInfoViewModel;
        this.l1 = fragmentManager;
        this.l2 = paymentMethod;
        this.l3 = orderSubmitAssemViewModel;
        this.l4 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS65S0500000_1(SeaPdpViewModel seaPdpViewModel, SeaPdpViewModel seaPdpViewModel2, SeaPdpFragment seaPdpFragment, Map<String, ? extends Object> map, PdpViewModelDelegate pdpViewModelDelegate, C1062904Dr c1062904Dr) {
        super(0);
        this.$t = c1062904Dr;
        this.l0 = seaPdpViewModel;
        this.l1 = seaPdpViewModel2;
        this.l2 = seaPdpFragment;
        this.l3 = map;
        this.l4 = pdpViewModelDelegate;
    }
}
