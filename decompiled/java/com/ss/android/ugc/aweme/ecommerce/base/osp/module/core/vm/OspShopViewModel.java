package com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm;

import X.C03CY;
import X.C03KP;
import X.C03O0;
import X.C0FJN;
import X.C0FJO;
import X.C0H1U;
import X.C10515049h;
import X.C123100dR;
import X.C15438062q;
import X.C1748720vbi;
import X.C23271099x;
import X.C418440Gaw;
import X.C719102rN;
import X.C719202rO;
import X.C720802re;
import X.C723002s0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817803Hk;
import X.C948503nH;
import X.EnumC804103Cd;
import X.InterfaceC0148002o;
import X.ViewOnClickListenerC7909037b;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopBill;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS7S0400000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OspShopViewModel extends AssemViewModel<C720802re> {
    public int LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C720802re(0);
    }

    public static boolean yQ2(C723002s0 c723002s0, LogisticDTO logisticDTO, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        ArrayList arrayList;
        List<C719102rN> list = c723002s0.LLJ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C719102rN> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LLILZLL);
        }
        List<OrderShopDigest> list2 = orderSubmitAssemViewModel.LLILZIL;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (OrderShopDigest orderShopDigest : list2) {
                if (Intrinsics.LJFF(orderShopDigest.sellerId, c723002s0.LL)) {
                    arrayList.add(orderShopDigest);
                }
            }
        } else {
            arrayList = null;
        }
        boolean z = false;
        if (arrayList != null) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                List<OrderSKUDTO> list3 = ((OrderShopDigest) it3.next()).orderSKUs;
                if (list3 != null) {
                    for (OrderSKUDTO orderSKUDTO : list3) {
                        if (arrayList2.contains(orderSKUDTO.skuId) && !Intrinsics.LJFF(orderSKUDTO.logisticsServiceId, logisticDTO.logisticsServiceId)) {
                            orderSKUDTO.logisticsServiceId = logisticDTO.logisticsServiceId;
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    public static void vQ2(View view, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C719202rO c719202rO, Integer num) {
        boolean z;
        Integer num2;
        MainOrderSetting mainOrderSetting = c719202rO.LLJJJJLIIL;
        int i = 0;
        if (mainOrderSetting != null && (num2 = mainOrderSetting.sellerCouponStyle) != null && num2.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            C786410Ut5.LJLLLLLL(0, view.findViewById(R.id.fjj));
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.yfu));
            TextView textView = (TextView) view.findViewById(R.id.fjk);
            ShopBill shopBill = c719202rO.LLJILJIL;
            if (shopBill != null) {
                str = shopBill.totalDiscount;
            }
            C0H1U.LJIIL(textView, str, true);
            ((C0FJN) view.findViewById(R.id.fjk)).LJJJJJ(72, Integer.valueOf(R.attr.a1r), Integer.valueOf(R.attr.a07), new C0FJO(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Float.valueOf(C418440Gaw.LIZIZ(6)), Float.valueOf(C418440Gaw.LIZIZ(6)), Float.valueOf(C418440Gaw.LIZIZ(4)), true);
        } else {
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.fjj));
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.fjk));
            TextView textView2 = (TextView) view.findViewById(R.id.yfu);
            ShopBill shopBill2 = c719202rO.LLJILJIL;
            if (shopBill2 != null) {
                str = shopBill2.totalDiscount;
            }
            C0H1U.LJIIL(textView2, str, true);
        }
        String str2 = c719202rO.LLJILJILJ;
        if (str2 == null || !C123100dR.LIZ(str2)) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        C786410Ut5.I7(new AjS7S0400000_1(orderSubmitAssemViewModel, c719202rO, num, view, 0), view);
        if (!Intrinsics.LJFF(c719202rO.LLJJJJ, Boolean.TRUE)) {
            C1748720vbi.LJFF(view, new C10515049h(), new AwS545S0100000_1(c719202rO, 246), new AwS367S0200000_1(c719202rO, orderSubmitAssemViewModel, 53));
        }
    }

    public final void xQ2(C723002s0 c723002s0, List<LogisticDTO> list, Context context, String str, C817803Hk c817803Hk, OrderSubmitAssemViewModel orderSubmitAssemViewModel, EnumC804103Cd enumC804103Cd, String str2) {
        orderSubmitAssemViewModel.yS2();
        C948503nH.LJI(this, C23271099x.INSTANCE, new C03KP(context, list, c723002s0, orderSubmitAssemViewModel, enumC804103Cd, str2, str, c817803Hk, this, null));
        C03O0.LJJJJZI(C03O0.LIZ, "logistics", null, 6);
        List<String> list2 = orderSubmitAssemViewModel.LLLIIL;
        if (list2 != null) {
            ((ArrayList) list2).add("click_logistic_panel");
        }
    }

    public static ViewOnClickListenerC7909037b wQ2(OspShopViewModel ospShopViewModel, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C723002s0 c723002s0, int i, Context context, LogisticExpressionArea logisticExpressionArea, C03CY c03cy, EnumC804103Cd enumC804103Cd, TuxTextView tuxTextView, String str, int i2) {
        TuxTextView tuxTextView2 = tuxTextView;
        EnumC804103Cd enumC804103Cd2 = enumC804103Cd;
        C03CY c03cy2 = c03cy;
        String str2 = null;
        if ((i2 & 32) != 0) {
            c03cy2 = null;
        }
        if ((i2 & 64) != 0) {
            enumC804103Cd2 = EnumC804103Cd.DOORSTEP;
        }
        if ((i2 & 128) != 0) {
            tuxTextView2 = null;
        }
        if ((i2 & 256) == 0) {
            str2 = str;
        }
        ospShopViewModel.getClass();
        return new ViewOnClickListenerC7909037b(c723002s0, enumC804103Cd2, ospShopViewModel, context, tuxTextView2, i, orderSubmitAssemViewModel, str2, logisticExpressionArea, c03cy2);
    }
}
