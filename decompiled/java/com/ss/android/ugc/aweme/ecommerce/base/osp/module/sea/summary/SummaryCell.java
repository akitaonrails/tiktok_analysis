package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03GO;
import X.C03IJ;
import X.C03J8;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C03XU;
import X.C09R3;
import X.C13LE;
import X.C13LP;
import X.C1741890vQh;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C714302qb;
import X.C722102rr;
import X.C722302rt;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C756302xN;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OrderSummaryViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckoutBottomBarInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderSummarySetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SummaryCell extends ECPowerCell<C722302rt> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLJ;
    public volatile boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public C722302rt LLJILLL;
    public final LinkedList<C03GO> LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SummaryCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SummaryCell.class, "summaryVM", "getSummaryVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/core/vm/OrderSummaryViewModel;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SummaryCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 448);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(91);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 439), awS545S0100000_1, AFwS207S0000000_19.get$arr$(144), new AwS545S0100000_1((C03K6) this, 432), new AwS545S0100000_1((C03K6) this, 440), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 442), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1164), null, new AwS545S0100000_1((C03K6) this, 445));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 428);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 430);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 433);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 56));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1159);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1161);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1162);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1163);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1165);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 446), awS545S0100000_1, AFwS207S0000000_19.get$arr$(143), new AwS545S0100000_1((C03K6) this, 449), new AwS545S0100000_1((C03K6) this, 450), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 451), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1170), null, new AwS545S0100000_1((C03K6) this, 452));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 453), awS545S0100000_1, AFwS207S0000000_19.get$arr$(145), new AwS545S0100000_1((C03K6) this, 455), new AwS545S0100000_1((C03K6) this, 457), new AwS545S0100000_1((C03K6) this, 460), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 461));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OrderSummaryViewModel.class);
        AwS545S0100000_1 awS545S0100000_15 = new AwS545S0100000_1(c19719912DlLIZ2, 463);
        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(90);
        if (Intrinsics.LJFF(obj, obj)) {
            new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 427), awS545S0100000_15, AFwS207S0000000_19.get$arr$(142), new AwS545S0100000_1((C03K6) this, 431), new AwS545S0100000_1((C03K6) this, 434), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 436), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1160), null, new AwS545S0100000_1((C03K6) this, 441));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_16 = new AwS545S0100000_1((C03K6) this, 443);
            AwS545S0100000_1 awS545S0100000_17 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 444);
            AwS545S0100000_1 awS545S0100000_18 = new AwS545S0100000_1(c19719912DlLIZ2, 447);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_16, 57));
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ2, 1166);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ2, 1167);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ2, 1168);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ2, 1169);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ2, 1171);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            new AssemVMLazy(awS545S0100000_18, awS545S0100000_15, new C452080Ho6(), awS563S0100000_196, awS563S0100000_197, awS545S0100000_17, aFwS228S0000000_12, awS563S0100000_198, awS563S0100000_199, awS563S0100000_1910);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 454), awS545S0100000_15, AFwS207S0000000_19.get$arr$(146), new AwS545S0100000_1((C03K6) this, 456), new AwS545S0100000_1((C03K6) this, 458), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 459), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1172), null, new AwS545S0100000_1((C03K6) this, 462));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 426), awS545S0100000_15, AFwS207S0000000_19.get$arr$(141), new AwS545S0100000_1((C03K6) this, 429), new AwS545S0100000_1((C03K6) this, 435), new AwS545S0100000_1((C03K6) this, 437), aFwS228S0000000_12, null, null, new AwS545S0100000_1((C03K6) this, 438));
        }
        this.LLJJ = new LinkedList<>();
    }

    public final OrderSubmitAssemViewModel P5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = P5().LLZIL;
        if (moduleManager != null) {
            moduleManager.LIZ("order_summary", this.itemView);
        }
        ModuleManager moduleManager2 = P5().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "order_summary");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    public final void R5(C722302rt c722302rt) {
        C714302qb next;
        String str;
        List<BillItem> list;
        BillItem billItem;
        Price price;
        String priceStr;
        String priceStr2;
        List<BillItem> list2;
        List<BillItem> list3;
        String priceStr3;
        if (!this.LLJI) {
            this.LLJI = true;
            Iterator<C714302qb> it2 = c722302rt.LLILZLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Integer num = next.LJIIIIZZ;
                    if (num != null && num.intValue() == 10) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C714302qb c714302qb = next;
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = P5().hi1(false);
            if (c714302qb != null) {
                mapHi1.put("small_order_fee", c714302qb.LIZIZ);
            }
            String strLIZ = C722102rr.LIZ(c722302rt);
            if (strLIZ != null) {
                mapHi1.put("summary_info", strLIZ);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<C714302qb> it3 = c722302rt.LLILZLL.iterator();
            while (true) {
                str = "";
                if (!it3.hasNext()) {
                    break;
                }
                C714302qb next2 = it3.next();
                String str2 = next2.LJJ;
                if (str2 != null) {
                    String str3 = next2.LIZIZ;
                    if (str3 == null) {
                        str3 = "";
                    }
                    linkedHashMap.put(str2, str3);
                    List<BillItem> list4 = next2.LJIIJ;
                    if (list4 != null && C756302xN.LIZ(list4) && (list2 = next2.LJIIJ) != null && list2.size() > 1 && (list3 = next2.LJIIJ) != null) {
                        for (BillItem billItem2 : list3) {
                            String str4 = billItem2.itemNameEn;
                            if (str4 != null) {
                                Price price2 = billItem2.itemPrice;
                                if (price2 == null || (priceStr3 = price2.getPriceStr()) == null) {
                                    priceStr3 = "";
                                }
                                linkedHashMap.put(str4, priceStr3);
                            }
                        }
                    }
                }
            }
            Price price3 = c722302rt.LLIZ;
            if (price3 != null && (priceStr2 = price3.getPriceStr()) != null) {
                str = priceStr2;
            }
            linkedHashMap.put("total", str);
            CheckoutBottomBarInfo checkoutBottomBarInfo = c722302rt.LLJILLL;
            if (checkoutBottomBarInfo != null && (list = checkoutBottomBarInfo.billItems) != null && (billItem = (BillItem) C13LP.LJJJLL(list)) != null && (price = billItem.itemPrice) != null && (priceStr = price.getPriceStr()) != null) {
                linkedHashMap.put("cashback_bonus", priceStr);
            }
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap);
            if (strLJIIIIZZ != null) {
                mapHi1.put("order_summary_info", strLJIIIIZZ);
            }
            C03O0.LJJJZ(c03o0, "order_summary", mapHi1, null, null, null, null, null, null, null, null, null, null, null, 1048572);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean zBooleanValue;
        int i;
        int i2;
        int i3;
        TuxTextView tuxTextView;
        Integer num;
        C722302rt c722302rt = (C722302rt) interfaceC1891350zJl;
        this.LLIZLLLIL = System.currentTimeMillis();
        super.onBindItemView(c722302rt);
        View view = this.itemView;
        boolean z = false;
        if (P5().LLZILL) {
            if (Intrinsics.LJFF(c722302rt.LLJIJIL, Boolean.TRUE)) {
                C786410Ut5.LJLLLLLL(4, this.itemView);
                return;
            }
            C786410Ut5.LJLLLLLL(0, this.itemView);
        }
        if (!this.LL) {
            this.LL = true;
            C786410Ut5.LJJJJJL((LinearLayout) view.findViewById(R.id.wos));
        }
        C03J8.LIZ(view, true);
        Boolean bool = c722302rt.LLJI;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        View viewFindViewById = view.findViewById(R.id.ps2);
        int i4 = 8;
        if (zBooleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.ps3);
        if (zBooleanValue) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.ps4);
        if (zBooleanValue) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.ps5);
        if (zBooleanValue) {
            i4 = 0;
        }
        C786410Ut5.LJLLLLLL(i4, viewFindViewById4);
        if (!Intrinsics.LJFF(c722302rt.LLJI, Boolean.TRUE)) {
            this.LLJILJILJ = c722302rt.LLJJL;
            L5(view, c722302rt);
            OrderSummarySetting orderSummarySetting = c722302rt.LLJJI;
            if (orderSummarySetting != null && (num = orderSummarySetting.orderSummaryStyle) != null && num.intValue() == 1) {
                z = true;
            }
            if (z) {
                this.LLJILJIL = true;
                ((TuxTextView) view.findViewById(R.id.title)).setTextColorRes(R.attr.a1i);
                this.LLJIJIL = true;
            }
            S5(view, c722302rt);
            N5(view, c722302rt);
            R5(c722302rt);
            if (P5().uS2() && (tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.title)) != null) {
                tuxTextView.setTuxFont(52);
            }
            if (!c722302rt.LLJJJJ || !C03XU.LIZIZ().disableSubscribeSummary) {
                C736680Sv4.LJIIIIZZ(this, P5(), new C2217381BqS() { // from class: X.03Ui
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C03JV) obj).LLILLL;
                    }
                }, null, new AwS437S0200000_1(this, view, 28), 6);
            }
        }
        ModuleManager moduleManager = P5().LLZIL;
        if (moduleManager == null) {
            return;
        }
        moduleManager.LJIIJ(System.currentTimeMillis() - this.LLIZLLLIL, "order_summary");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b4a, viewGroup, false);
    }

    public static void N5(View view, C722302rt c722302rt) {
        if (C03XU.LIZIZ().enableSummarySimpleMode && c722302rt.LLJJJJ) {
            C03DZ.LIZ(view.findViewById(R.id.title));
            C03DZ.LIZ(view.findViewById(R.id.fk2));
            C03DZ.LIZ(view.findViewById(R.id.total_title));
            C03DZ.LIZ(view.findViewById(R.id.total_price));
            C03DZ.LIZ(view.findViewById(R.id.osp_summary_product_tax_desc));
            C03DZ.LIZ(view.findViewById(R.id.fk3));
        }
    }

    public final void L5(View view, C722302rt c722302rt) {
        int i;
        if (C03XU.LIZIZ().enableSummarySimpleMode && c722302rt.LLJJJJ) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.title);
        if (!this.LLJILJILJ) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(android.view.View r25, X.C722302rt r26) {
        /*
            Method dump skipped, instruction units count: 1275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary.SummaryCell.S5(android.view.View, X.02rt):void");
    }
}
