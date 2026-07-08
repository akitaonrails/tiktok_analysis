package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget;

import X.C03DZ;
import X.C041K;
import X.C044V;
import X.C04CU;
import X.C04E4;
import X.C04EI;
import X.C0H9H;
import X.C1018703yb;
import X.C10366043o;
import X.C10494048m;
import X.C10503048v;
import X.C1077704Jj;
import X.C11EA;
import X.C13LQ;
import X.C1745060vVo;
import X.C2097608Jq;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C23271099x;
import X.C300330Bpv;
import X.C786410Ut5;
import X.C948503nH;
import X.C957703ol;
import X.EnumC10360043i;
import Y.ATListenerS437S0100000_1;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPanelBottomWidgetNew extends SkuPanelBaseWidget {
    public final int LLJI;
    public final SeaSkuPanelFragment LLJIJIL;
    public C04E4 LLJILJIL;
    public C10503048v LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final int LLJJI = R.layout.ayy;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIIZZ() {
        C11EA.LJII(this, LJII(), new C2217371BqR() { // from class: X.045P
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getAddToCartButton();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((SkuState) obj).setAddToCartButton((AddToCartButton) obj2);
            }
        }, new AwS615S0100000_1(this, 66));
        C11EA.LJIIJ(this, LJII(), new C2217381BqS() { // from class: X.045O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getBuyButton();
            }
        }, new C2217381BqS() { // from class: X.045T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getBuyButtonInterestId();
            }
        }, new C2217381BqS() { // from class: X.045R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getButtonDynamicData();
            }
        }, new C1077704Jj(this, 4));
        C11EA.LJII(this, LJII(), new C2217381BqS() { // from class: X.045Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuStockInfo();
            }
        }, new AwS615S0100000_1(this, 67));
        if (this.LLJI == 17) {
            LJII().s60(new C2217381BqS() { // from class: X.043y
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SkuState) obj).getCutPriceSkuPanel();
                }
            }, new AwS580S0100000_1(this, 292));
        }
    }

    public final Map<String, Object> LJIIJJI() {
        Integer num;
        String str;
        Pair[] pairArr = new Pair[3];
        C10503048v c10503048v = this.LLJILJILJ;
        pairArr[0] = new Pair("if_ellipses_show", Integer.valueOf((c10503048v == null || !c10503048v.LIZIZ()) ? 0 : 1));
        SkuItem skuItem = LJII().LLJJJJ;
        pairArr[1] = new Pair("if_low_stock", Integer.valueOf(((skuItem == null || (str = skuItem.lowStockWarning) == null || a0.LJJJIL(str)) ? 1 : 0) ^ 1));
        pairArr[2] = new Pair("checkout_type", "normal_checkout");
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        SkuItem skuItem2 = LJII().LLJJJJ;
        if (skuItem2 != null && (num = skuItem2.stockNum) != null) {
            mapLJIIJ.put("stock_num", Integer.valueOf(num.intValue()));
        }
        return mapLJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIZ() {
        C04E4 c04e4;
        C10503048v c10503048v;
        ProductPackStruct productPackStruct;
        BuyButton buyButton;
        Integer num;
        ProductPackStruct productPackStruct2;
        AddToCartButton addToCartButton;
        Integer num2;
        int iLIZ = C04CU.LIZ();
        View view = this.LLILZ;
        if (view != null && C04EI.LIZ()) {
            int i = SeaPdpBottomNavBarWidgetNew.LLJJLIIIJLLLLLLLZ;
            view.setPadding(i, i, i, i);
            view.getLayoutParams().height = SeaPdpBottomNavBarWidgetNew.LLJL;
            view.requestLayout();
        }
        View view2 = this.LLILZ;
        C10503048v c10503048v2 = null;
        if (view2 == null || (c04e4 = (C04E4) view2.findViewById(R.id.vh6)) == null) {
            c04e4 = null;
        } else {
            c04e4.setMaxLines(2);
            c04e4.setSupportClickWhenDisable(true);
            c04e4.setEnabled((!LJIIL() || (productPackStruct2 = LJII().LLJILJILJ) == null || (addToCartButton = productPackStruct2.addToCartButton) == null || (num2 = addToCartButton.status) == null || num2.intValue() != 1) ? false : true);
            c04e4.setStyle(Integer.valueOf(iLIZ));
            C786410Ut5.I7(new AjS40S0200000_1(c04e4, this, 21), c04e4);
        }
        this.LLJILJIL = c04e4;
        View view3 = this.LLILZ;
        if (view3 != null && (c10503048v = (C10503048v) view3.findViewById(R.id.cnx)) != null) {
            c10503048v.setSupportClickWhenDisable(true);
            c10503048v.setEnabled(LJIIL() && (!C300330Bpv.LIZ() || (productPackStruct = LJII().LLJILJILJ) == null || (buyButton = productPackStruct.buyButton) == null || (num = buyButton.status) == null || num.intValue() != 2));
            c10503048v.LIZLLL(iLIZ);
            c10503048v.setOnTouchListener(new ATListenerS437S0100000_1(this, 1));
            C786410Ut5.I7(new AjS40S0200000_1(c10503048v, this, 22), c10503048v);
            c10503048v2 = c10503048v;
        }
        this.LLJILJILJ = c10503048v2;
        int i2 = this.LLJI;
        if (i2 == 1) {
            C04E4 c04e42 = this.LLJILJIL;
            if (c04e42 != null) {
                C03DZ.LIZ(c04e42);
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                if (c10503048v2 != null) {
                    C03DZ.LIZ(c10503048v2);
                }
                C04E4 c04e43 = this.LLJILJIL;
                if (c04e43 != null) {
                    C0H9H.LIZLLL(0, c04e43);
                }
                C04E4 c04e44 = this.LLJILJIL;
                if (c04e44 != null) {
                    c04e44.setButtonVariant(0);
                }
                C04E4 c04e45 = this.LLJILJIL;
                if (c04e45 != null) {
                    c04e45.setText(2131832616);
                    return;
                }
                return;
            }
            if (i2 != 7 && i2 != 8) {
                if (i2 == 17) {
                    if (c10503048v2 != null) {
                        C03DZ.LIZ(c10503048v2);
                    }
                    C04E4 c04e46 = this.LLJILJIL;
                    if (c04e46 != null) {
                        C0H9H.LIZLLL(0, c04e46);
                    }
                    C04E4 c04e47 = this.LLJILJIL;
                    if (c04e47 != null) {
                        c04e47.setButtonVariant(0);
                    }
                    C04E4 c04e48 = this.LLJILJIL;
                    if (c04e48 != null) {
                        c04e48.setText(2131848124);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (c10503048v2 != null) {
            C03DZ.LIZ(c10503048v2);
        }
        C04E4 c04e49 = this.LLJILJIL;
        if (c04e49 != null) {
            C0H9H.LIZLLL(0, c04e49);
        }
        C04E4 c04e410 = this.LLJILJIL;
        if (c04e410 != null) {
            c04e410.setButtonVariant(0);
        }
    }

    public final boolean LJIIL() {
        Integer num;
        ProductPackStruct productPackStruct = LJII().LLJILJILJ;
        return (productPackStruct == null || (num = productPackStruct.status) == null || num.intValue() != 1) ? false : true;
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return this.LLJJI;
    }

    public SkuPanelBottomWidgetNew(int i, SeaSkuPanelFragment seaSkuPanelFragment) {
        this.LLJI = i;
        this.LLJIJIL = seaSkuPanelFragment;
    }

    public final void LJIIJ(Function0<Unit> function0, Function0<Unit> function02) {
        String strHR2 = LJII().hR2();
        if (strHR2 != null) {
            LJII().lR2(null, C1745060vVo.LIZ(this).getResources().getString(2131832582, strHR2));
            C044V.LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C044V.LIZIZ);
            linkedHashMap.put("toast_name", strHR2);
            C1018703yb.LIZIZ("tiktokec_toast_show", linkedHashMap);
            SeaSkuPanelViewModel seaSkuPanelViewModelLJII = LJII();
            seaSkuPanelViewModelLJII.getClass();
            C948503nH.LJFF(seaSkuPanelViewModelLJII, C23271099x.INSTANCE, new C041K(seaSkuPanelViewModelLJII, strHR2, null));
            if (function02 != null) {
                function02.invoke();
                return;
            }
            return;
        }
        int i = SeaPdpBottomNavBarWidgetNew.LLJJLIIIJLLLLLLLZ;
        C10494048m.LIZ(C1745060vVo.LIZ(this), new AwS545S0100000_1(function0, (Function0<Unit>) 1428));
    }

    public final void LJIILL(C10366043o c10366043o, AddToCartButton addToCartButton) {
        EnumC10360043i enumC10360043i;
        Integer num;
        boolean z = false;
        if (LJIIL()) {
            EnumC10360043i enumC10360043i2 = null;
            if (c10366043o != null) {
                enumC10360043i = c10366043o.LIZ;
            } else {
                enumC10360043i = null;
            }
            if (enumC10360043i != EnumC10360043i.CUR_COMBO_STOCK_OUT) {
                if (c10366043o != null) {
                    enumC10360043i2 = c10366043o.LIZ;
                }
                if (enumC10360043i2 != EnumC10360043i.ALL_STOCK_OUT) {
                    C04E4 c04e4 = this.LLJILJIL;
                    if (c04e4 != null) {
                        if (addToCartButton != null && (num = addToCartButton.status) != null && num.intValue() == 1) {
                            z = true;
                        }
                        c04e4.setEnabled(z);
                        return;
                    }
                    return;
                }
            }
            C04E4 c04e42 = this.LLJILJIL;
            if (c04e42 == null) {
                return;
            }
            c04e42.setEnabled(false);
            return;
        }
        C04E4 c04e43 = this.LLJILJIL;
        if (c04e43 == null) {
            return;
        }
        c04e43.setEnabled(false);
    }

    public final void LJIILLIIL(C10366043o c10366043o, BuyButton buyButton) {
        EnumC10360043i enumC10360043i;
        Integer num;
        boolean z = false;
        if (LJIIL()) {
            EnumC10360043i enumC10360043i2 = null;
            if (c10366043o != null) {
                enumC10360043i = c10366043o.LIZ;
            } else {
                enumC10360043i = null;
            }
            if (enumC10360043i != EnumC10360043i.CUR_COMBO_STOCK_OUT) {
                if (c10366043o != null) {
                    enumC10360043i2 = c10366043o.LIZ;
                }
                if (enumC10360043i2 != EnumC10360043i.ALL_STOCK_OUT) {
                    C10503048v c10503048v = this.LLJILJILJ;
                    if (c10503048v != null) {
                        if (!C300330Bpv.LIZ() || buyButton == null || (num = buyButton.status) == null || num.intValue() != 2) {
                            z = true;
                        }
                        c10503048v.setEnabled(z);
                        return;
                    }
                    return;
                }
            }
            C10503048v c10503048v2 = this.LLJILJILJ;
            if (c10503048v2 == null) {
                return;
            }
            c10503048v2.setEnabled(false);
            return;
        }
        C10503048v c10503048v3 = this.LLJILJILJ;
        if (c10503048v3 == null) {
            return;
        }
        c10503048v3.setEnabled(false);
    }

    public final void LJIILJJIL(String str, String str2, String str3, Map<String, ? extends Object> map) {
        String str4;
        List<SkuItem> list;
        String[] strArr;
        C044V c044v = C044V.LIZ;
        SkuPanelState skuPanelState = LJII().LLJI;
        SkuSupply skuSupply = null;
        if (skuPanelState != null && (strArr = skuPanelState.checkedSkuIds) != null) {
            str4 = (String) C13LQ.LJJIFFI(strArr);
        } else {
            str4 = null;
        }
        LJII().getClass();
        SkuPanelState skuPanelState2 = LJII().LLJI;
        if (skuPanelState2 != null) {
            SkuInfo skuInfo = LJII().LLJIJIL;
            if (skuInfo != null) {
                list = skuInfo.skuList;
            } else {
                list = null;
            }
            SkuItem skuItemLIZLLL = skuPanelState2.LIZLLL(list);
            if (skuItemLIZLLL != null) {
                skuSupply = skuItemLIZLLL.skuSupply;
            }
        }
        c044v.getClass();
        C1018703yb.LIZLLL("tiktokec_button_show", new C957703ol(null, skuSupply, null, null, str, str2, null, str4, null, null, str3, C044V.LIZIZ, map));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew r22, java.lang.String r23, java.lang.String r24, java.util.Map r25, java.util.Map r26, java.lang.String r27, int r28) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew.LJIILIIL(com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew, java.lang.String, java.lang.String, java.util.Map, java.util.Map, java.lang.String, int):void");
    }
}
