package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C259800zU;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.text.SeaSkuTextSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.text.SeaSkuThreeRowExpandableFlowLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AwS34S1400000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS34S1400000_1 awS34S1400000_1) {
        ((C013C) awS34S1400000_1.l1).element = ((ECRouterInterceptor) awS34S1400000_1.l2).LJIJ((RouteIntent) awS34S1400000_1.l3, awS34S1400000_1.s0, (Integer) ((C259800zU) awS34S1400000_1.l4).element);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS34S1400000_1 awS34S1400000_1) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) awS34S1400000_1.l1;
        final SeaSkuTextSpecCell seaSkuTextSpecCell = (SeaSkuTextSpecCell) awS34S1400000_1.l2;
        final SaleProp saleProp = (SaleProp) awS34S1400000_1.l3;
        final String str = awS34S1400000_1.s0;
        final SeaSkuThreeRowExpandableFlowLayoutManager seaSkuThreeRowExpandableFlowLayoutManager = (SeaSkuThreeRowExpandableFlowLayoutManager) awS34S1400000_1.l4;
        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new Runnable() { // from class: X.03pG
            public final void LIZ() {
                int i;
                SeaSkuTextSpecCell seaSkuTextSpecCell2 = seaSkuTextSpecCell;
                SaleProp saleProp2 = saleProp;
                String str2 = str;
                SeaSkuThreeRowExpandableFlowLayoutManager seaSkuThreeRowExpandableFlowLayoutManager2 = seaSkuThreeRowExpandableFlowLayoutManager;
                if (((HashSet) seaSkuTextSpecCell2.T5().LLIZLLLIL).contains(str2) || Intrinsics.LJFF(((HashMap) seaSkuTextSpecCell2.T5().LLIZ).get(str2), Boolean.TRUE) || !seaSkuThreeRowExpandableFlowLayoutManager2.LLILZLL) {
                    return;
                }
                List list = saleProp2.salePropValueList;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (true) {
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    SalePropValue salePropValue = (SalePropValue) next;
                    if (salePropValue.propValueId != null && salePropValue.propValue != null) {
                        arrayList.add(next);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(((SalePropValue) it3.next()).isDefaultSelected, Boolean.TRUE)) {
                        if (i < 0 || i <= seaSkuThreeRowExpandableFlowLayoutManager2.LLILZIL) {
                            return;
                        }
                        ((HashSet) seaSkuTextSpecCell2.T5().LLIZLLLIL).add(str2);
                        SeaSkuSpecViewModel seaSkuSpecViewModelT5 = seaSkuTextSpecCell2.T5();
                        Object obj = ((HashMap) seaSkuSpecViewModelT5.LLIZ).get(str2);
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.LJFF(obj, bool)) {
                            return;
                        }
                        ((HashMap) seaSkuSpecViewModelT5.LLIZ).put(str2, bool);
                        seaSkuSpecViewModelT5.setState(new AwS52S1000000_1(str2, 47));
                        return;
                    }
                    i++;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SeaSkuTextSpecCell@e8fe.bindSpec$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SeaSkuTextSpecCell@e8fe.bindSpec$1$1");
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS34S1400000_1(C013C c013c, C013C c013c2, ECRouterInterceptor eCRouterInterceptor, RouteIntent routeIntent, String str, C259800zU<Integer> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l1 = c013c;
        this.l2 = c013c2;
        this.l3 = eCRouterInterceptor;
        this.s0 = routeIntent;
        this.l4 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S1400000_1(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, SeaSkuTextSpecCell seaSkuTextSpecCell, SaleProp saleProp, String str, SeaSkuThreeRowExpandableFlowLayoutManager seaSkuThreeRowExpandableFlowLayoutManager, int i) {
        super(0);
        this.$t = i;
        this.l1 = viewOnAttachStateChangeListenerC20604515jv;
        this.l2 = seaSkuTextSpecCell;
        this.l3 = saleProp;
        this.s0 = str;
        this.l4 = seaSkuThreeRowExpandableFlowLayoutManager;
    }
}
