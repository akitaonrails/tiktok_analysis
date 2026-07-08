package com.ss.android.ugc.aweme.ecommerce.base.ordercenter;

import X.C0X52;
import X.C11NZ;
import X.C1499810p8F;
import X.C1697810uHb;
import X.C20161413ue;
import X.C2097608Jq;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.ListOrderComponentFilter;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.ListOrderComponentReq;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.ListOrderPromptReq;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.ListOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.OrderCenterApi;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public final class GlobalOrderListPreLoad implements InterfaceC727570SgN<OrderCenterApi, C11NZ<C0X52<TypedInput>>> {
    public static final int $stable = 0;
    public static final C20161413ue Companion = new C20161413ue();

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    private final ListOrderRequest genListOrderComponentReq(Integer num) {
        return new ListOrderRequest(C1697810uHb.LJIILJJIL(new ListOrderComponentReq(4, C2097608Jq.LJII(new Pair("tab", num), new Pair("filter", C1697810uHb.LJIILJJIL(new ListOrderComponentFilter(0))), new Pair("cursor", 0), new Pair("size", 10), new Pair("index", ""), new Pair("is_new_payment", Boolean.TRUE)), null), new ListOrderComponentReq(3, null, new ListOrderPromptReq(num)), new ListOrderComponentReq(5, null, null)));
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(true, "https://oec-api.tiktokv.com/", null, 0, false, 25);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<C0X52<TypedInput>> preload2(Bundle bundle, Function1<? super Class<OrderCenterApi>, ? extends OrderCenterApi> function1) {
        Integer numValueOf;
        if (bundle != null) {
            numValueOf = Integer.valueOf(bundle.getInt("tab"));
        } else {
            numValueOf = null;
        }
        return function1.invoke(OrderCenterApi.class).getGlobalOrderList(genListOrderComponentReq(numValueOf));
    }
}
