package kotlin.jvm.internal;

import X.AnonymousClass0378;
import X.C043Y;
import X.C04E2;
import X.C09AY;
import X.C1054104Ah;
import X.C1741890vQh;
import X.C23250099c;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpViewModelDelegate;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.services.cartservice.CartService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS13S0600000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS13S0600000_1 r22) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS13S0600000_1.invoke$0(kotlin.jvm.internal.AwS13S0600000_1):java.lang.Object");
    }

    public static final Object invoke$1(AwS13S0600000_1 awS13S0600000_1) {
        SeaPdpViewModel.kR2((SeaPdpViewModel) awS13S0600000_1.l0, (View) awS13S0600000_1.l1, (View) awS13S0600000_1.l2, (SeaPdpFragment) awS13S0600000_1.l3, null, null, null, null, null, null, 4072);
        if (((SeaPdpViewModel) awS13S0600000_1.l0).jS2()) {
            IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
            PdpViewModelDelegate pdpViewModelDelegate = (PdpViewModelDelegate) awS13S0600000_1.l4;
            SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS13S0600000_1.l0;
            pdpViewModelDelegate.getClass();
            iEventCenterLIZ.LIZ("ec_add_cart_click", C1741890vQh.LJIIIIZZ(PdpViewModelDelegate.LIZ(seaPdpViewModel, true, true)));
        } else {
            C1054104Ah c1054104Ah = ((SeaPdpViewModel) awS13S0600000_1.l0).LLJLIL;
            if (c1054104Ah != null) {
                C1054104Ah.LJJI(c1054104Ah, "add_to_cart", Boolean.TRUE, null, null, null, 28);
            }
            SeaPdpViewModel seaPdpViewModel2 = (SeaPdpViewModel) awS13S0600000_1.l0;
            C1054104Ah c1054104Ah2 = seaPdpViewModel2.LLJLIL;
            if (c1054104Ah2 != null) {
                ((PdpViewModelDelegate) awS13S0600000_1.l4).getClass();
                C1054104Ah.LJIIJJI(c1054104Ah2, "add_to_cart", PdpViewModelDelegate.LIZ(seaPdpViewModel2, true, true), (Map) awS13S0600000_1.l5, null, 44);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((SeaPdpFragment) awS13S0600000_1.l3), null, null, new C04E2((SeaPdpViewModel) awS13S0600000_1.l0, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS13S0600000_1(AddItemToCartData addItemToCartData, AddItemToCartData addItemToCartData2, CartService cartService, View view, Response<n> response, C043Y c043y, EnterCartParam enterCartParam) {
        super(0);
        this.$t = enterCartParam;
        this.l0 = addItemToCartData;
        this.l1 = addItemToCartData2;
        this.l2 = cartService;
        this.l3 = view;
        this.l4 = response;
        this.l5 = c043y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS13S0600000_1(SeaPdpViewModel seaPdpViewModel, SeaPdpViewModel seaPdpViewModel2, View view, View view2, SeaPdpFragment seaPdpFragment, PdpViewModelDelegate pdpViewModelDelegate, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l0 = seaPdpViewModel;
        this.l1 = seaPdpViewModel2;
        this.l2 = view;
        this.l3 = view2;
        this.l4 = seaPdpFragment;
        this.l5 = pdpViewModelDelegate;
    }
}
