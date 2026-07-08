package com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem;

import X.C01GW;
import X.C042Y;
import X.C046T;
import X.C049X;
import X.C049Y;
import X.C04FA;
import X.C04FD;
import X.C0H1U;
import X.C10515049h;
import X.C15438062q;
import X.C16GA;
import X.C1748720vbi;
import X.C19719612Di;
import X.C2217381BqS;
import X.C452501pT;
import X.C704702p3;
import X.C7911037d;
import X.EnumC10415045l;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SubscribePeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AwS109S0101000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS16S1201000_1;
import kotlin.jvm.internal.AwS17S2200000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;
import o5b.a;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPurchaseMethodReusedAssem extends SkuPanelBaseReusedAssem<SkuPurchaseMethodReusedAssem, C704702p3> implements C04FD {
    public final String LLJLIL = "SkuPurchaseMethodAssem init error";
    public final LinkedList<C04FA> LLJLILLLLZIIL = new LinkedList<>();
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1402));
    public LinearLayout LLJLLIL;

    @Override // X.C04FD
    public final void LJLJLLL(SizeGuide sizeGuide) {
    }

    @Override // X.C04FD
    public final void LLLLZLL(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.asv;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void Ap() {
        this.LLJLLIL = (LinearLayout) op(R.id.ngr);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void zp() {
        getViewModel().TQ2(new C2217381BqS() { // from class: X.042F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, new C2217381BqS() { // from class: X.042B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getForceRefresh();
            }
        }, new AwS615S0100000_1(this, 204));
        getViewModel().s60(new C2217381BqS() { // from class: X.041E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSelectedPurchaseMethod();
            }
        }, new AwS580S0100000_1(this, 814));
        getViewModel().s60(new C2217381BqS() { // from class: X.041F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSelectedPeriodText();
            }
        }, new AwS580S0100000_1(this, 815));
    }

    public final C04FA Ep(Context context) {
        C04FA c04fa = (C04FA) C19719612Di.LJJIIZI(this.LLJLILLLLZIIL);
        if (c04fa == null) {
            c04fa = new C04FA(sp(), tp(), (a) this.LLJLL.getValue());
        }
        C16GA c16ga = new C16GA(-1, -2);
        c04fa.setTextLayoutMargin(((a) this.LLJLL.getValue()).LJFF);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c04fa);
        c04fa.setLayoutParams(c16ga);
        up();
        C0H1U.LJIIJ(C046T.LJIILIIL(), c04fa);
        up();
        C0H1U.LJII(C046T.LJIIL(), c04fa);
        c04fa.j0();
        ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
        scrollTopLinearLayoutManager.setOrientation(0);
        c04fa.setLayoutManager(scrollTopLinearLayoutManager);
        return c04fa;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }

    public static List Bp(List list, Integer num) {
        boolean z;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PurchaseMethodItem purchaseMethodItem = (PurchaseMethodItem) it2.next();
            String strLIZ = C7911037d.LIZ(purchaseMethodItem.title);
            C042Y c042y = new C042Y(strLIZ, strLIZ, null, null, false, null, purchaseMethodItem.title);
            if (num != null && Intrinsics.LJFF(purchaseMethodItem.purchaseMethodType, num)) {
                z = true;
            } else {
                z = false;
            }
            c042y.LLJI = z;
            arrayList.add(c042y);
        }
        return arrayList;
    }

    public final void Fp(PurchaseMethodInfo purchaseMethodInfo, Integer num, String str) {
        String string;
        PurchaseMethodItem next;
        SubscribePeriodInfo subscribePeriodInfo;
        List<SnsPeriodInfo> list;
        Context context = getContext();
        if (context != null) {
            C04FA c04faEp = Ep(context);
            List<C042Y> listBp = Bp(purchaseMethodInfo.itemList, num);
            Resources resources = context.getResources();
            String string2 = null;
            if (resources != null) {
                string = resources.getString(2131848574);
            } else {
                string = null;
            }
            c04faEp.e0(string, listBp, 0, null, "purchase_method", true, null, null);
            c04faEp.setClickListener(this);
            LinearLayout linearLayout = this.LLJLLIL;
            if (linearLayout != null) {
                linearLayout.addView(c04faEp);
            }
            C1748720vbi.LIZLLL(c04faEp, new C10515049h(), new AwS367S0200000_1(this, num, 124));
            Iterator<PurchaseMethodItem> it2 = purchaseMethodInfo.itemList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Integer num2 = next.purchaseMethodType;
                    int value = EnumC10415045l.SUBSCRIBE.getValue();
                    if (num2 != null && num2.intValue() == value) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PurchaseMethodItem purchaseMethodItem = next;
            if (purchaseMethodItem != null && (subscribePeriodInfo = purchaseMethodItem.periodInfo) != null && (list = subscribePeriodInfo.periodInfoList) != null) {
                C04FA c04faEp2 = Ep(context);
                ArrayList arrayList = new ArrayList();
                Iterator<SnsPeriodInfo> it3 = list.iterator();
                while (it3.hasNext()) {
                    String str2 = it3.next().periodText;
                    if (str2 != null) {
                        C042Y c042y = new C042Y(str2, str2, null, null, false, null);
                        c042y.LLJI = Intrinsics.LJFF(str2, str);
                        arrayList.add(c042y);
                    }
                }
                Resources resources2 = context.getResources();
                if (resources2 != null) {
                    string2 = resources2.getString(2131848573);
                }
                c04faEp2.e0(string2, arrayList, 1, null, "subscribe_frequency", true, null, null);
                c04faEp2.setClickListener(this);
                int value2 = EnumC10415045l.SUBSCRIBE.getValue();
                if (num != null && num.intValue() == value2) {
                    C1748720vbi.LIZLLL(c04faEp, new C10515049h(), new AwS86S1200000_1(this, num, str, 9));
                } else {
                    C0H1U.LIZIZ(c04faEp2);
                }
                LinearLayout linearLayout2 = this.LLJLLIL;
                if (linearLayout2 != null) {
                    linearLayout2.addView(c04faEp2);
                }
            }
        }
    }

    @Override // X.C04FD
    public final void Tk(int i, int i2, C042Y c042y) {
        String str;
        SkuPanelAssemVM viewModel = getViewModel();
        String str2 = null;
        if (c042y != null) {
            str2 = c042y.LL;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 1) {
                    return;
                }
            } else {
                viewModel.withState(new AwS115S1100000_1(viewModel, str2, 20));
            }
            str = "subscribe_frequency";
        } else {
            viewModel.withState(new AwS109S0101000_1(viewModel, i2, 3));
            str = "purchase_method";
        }
        C1748720vbi.LIZIZ(tp(), new C049Y(), new AwS16S1201000_1(str, c042y, i, this, 2));
    }

    @Override // X.C04FD
    public final void LLLLZLLLI(View view, int i, int i2, C042Y c042y) {
        String str;
        String str2 = null;
        if (i != 0) {
            if (i != 1) {
                str = null;
            } else {
                str = "subscribe_frequency";
            }
        } else {
            str = "purchase_method";
        }
        if (c042y != null) {
            str2 = c042y.LL;
        }
        String strValueOf = String.valueOf(str2);
        if (view != null) {
            C1748720vbi.LJFF(view, new C049X(), new AwS86S1000000_1(strValueOf, 12), new AwS17S2200000_1(str, strValueOf, this, c042y, 3));
        }
    }
}
