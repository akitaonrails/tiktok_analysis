package com.ss.android.ugc.aweme.ecommerce.base.ordercenter;

import X.C0X52;
import X.C11NZ;
import X.C1499810p8F;
import X.C20161513uf;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.OrderCenterApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public final class OrderListPreLoad implements InterfaceC727570SgN<OrderCenterApi, C11NZ<C0X52<TypedInput>>> {
    public static final int $stable = 0;
    public static final C20161513uf Companion = new C20161513uf();

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
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
        return function1.invoke(OrderCenterApi.class).getOrderList(0, numValueOf, 10, true, "", true, false, 1);
    }
}
