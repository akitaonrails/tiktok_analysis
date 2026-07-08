package com.ss.android.ugc.aweme.ecommerce.core.services.cartservice;

import X.AnonymousClass0378;
import X.AnonymousClass0431;
import X.C01K1;
import X.C03U5;
import X.C043N;
import X.C043U;
import X.C043Y;
import X.C1025203ze;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1388190mED;
import X.C13LE;
import X.C1741890vQh;
import X.C1754020vkG;
import X.C19EG;
import X.C2371409Qy;
import X.InterfaceC1164530gPT;
import X.InterfaceC1752700vi8;
import X.InterfaceC1754160vkU;
import X.InterfaceC859903Xp;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CartService implements ICartService, InterfaceC1164530gPT {
    public Boolean LL;
    public String LLILLJJLI;
    public final List<Function1<CartRefreshEvent, Unit>> LLILLL = new ArrayList();
    public final C043U LLILZ = new InterfaceC1164530gPT() { // from class: X.043U
        @Override // X.InterfaceC1164530gPT
        public final synchronized void onEvent(String str, String str2) {
            if (Intrinsics.LJFF(str, "ec_cart_refresh")) {
                CartRefreshEvent cartRefreshEventLIZ = C049Q.LIZ(str2);
                Iterator<Function1<CartRefreshEvent, Unit>> it2 = this.LL.LLILLL.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(cartRefreshEventLIZ);
                }
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService
    public final InterfaceC1754160vkU LJ() {
        InterfaceC859903Xp interfaceC859903XpCreateBuilder;
        C01K1 c01k1Build;
        IECRetrofitFactory iECRetrofitFactory = (IECRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IECRetrofitFactory.class, false, false, false, 14, null);
        if (iECRetrofitFactory == null || (interfaceC859903XpCreateBuilder = iECRetrofitFactory.createBuilder("https://oec-api.tiktokv.com/")) == null || (c01k1Build = interfaceC859903XpCreateBuilder.build()) == null) {
            return null;
        }
        return (InterfaceC1754160vkU) c01k1Build.create(InterfaceC1754160vkU.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService
    public final synchronized void LIZIZ(AwS605S0100000_26 awS605S0100000_26) {
        ((ArrayList) this.LLILLL).remove(awS605S0100000_26);
        if (((ArrayList) this.LLILLL).isEmpty()) {
            AnonymousClass0378.LIZ().LIZJ("ec_cart_refresh", this.LLILZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService
    public final synchronized void LIZJ(AwS605S0100000_26 awS605S0100000_26) {
        if (((ArrayList) this.LLILLL).isEmpty()) {
            AnonymousClass0378.LIZ().LIZLLL("ec_cart_refresh", this.LLILZ);
        }
        ((ArrayList) this.LLILLL).add(awS605S0100000_26);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService
    public final InterfaceC1752700vi8 LJFF(Context context) {
        return new C1754020vkG(context);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Type type;
        if (Intrinsics.LJFF(str, "ec_sku_panel_close")) {
            String str3 = null;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(SkuPanelState.class));
                } else {
                    type = new TypeToken<SkuPanelState>() { // from class: X.043w
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof SkuPanelState)) {
                    objFromJson = null;
                }
                SkuPanelState skuPanelState = (SkuPanelState) objFromJson;
                if (skuPanelState != null) {
                    str3 = skuPanelState.productId;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (Intrinsics.LJFF(str3, this.LLILLJJLI)) {
                this.LL = Boolean.TRUE;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(java.lang.String r16, X.C043Y r17, X.C10372043u r18, android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.services.cartservice.CartService.LJII(java.lang.String, X.043Y, X.043u, android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService
    public final void LIZ(Context context, String str, String str2, Map map, String str3) {
        HashMap map2;
        C1025203ze.LIZ.getClass();
        if (map != null) {
            map2 = new HashMap(map);
        } else {
            map2 = null;
        }
        C1025203ze.LIZJ(context, map2, null, null, str2, str, false, str3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService
    public final void LIZLLL(View view, C043Y c043y, AnonymousClass0431 anonymousClass0431, boolean z, EnterCartParam enterCartParam) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null) {
            C03U5.LIZ(new C043N(this, c043y, z, anonymousClass0431, view, enterCartParam), c19egLIZIZ, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0202  */
    /* JADX WARN: Type inference failed for: r8v13, types: [X.043u] */
    /* JADX WARN: Type inference failed for: r8v25, types: [X.043u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(android.view.View r36, X.C043Y r37, com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam r38, X.AnonymousClass0431 r39, X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.services.cartservice.CartService.LJI(android.view.View, X.043Y, com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam, X.0431, X.05Vn):java.lang.Object");
    }
}
