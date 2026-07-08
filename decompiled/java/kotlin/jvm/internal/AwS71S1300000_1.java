package kotlin.jvm.internal;

import X.AnonymousClass0376;
import X.AnonymousClass0408;
import X.C03X9;
import X.C03XA;
import X.C03XH;
import X.C09AY;
import X.C1005503wT;
import X.C10513049f;
import X.C10516049i;
import X.C1391600mJi;
import X.C1748720vbi;
import X.C2188811AlT;
import X.C259800zU;
import X.C450720Hlu;
import X.C714302qb;
import X.C719202rO;
import X.C720002rW;
import X.C722302rt;
import X.C940303lx;
import X.C955103oL;
import X.EnumC1005603wU;
import X.EnumC1235690iGF;
import X.EnumC969503qf;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3.SeaProductSelectUserRightVOV3;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3.SeaUserRightViewHolderV3;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS71S1300000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS71S1300000_1 awS71S1300000_1) {
        C450720Hlu c450720Hlu = new C450720Hlu((Activity) awS71S1300000_1.l1);
        View view = (View) awS71S1300000_1.l2;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = (EnumC1235690iGF) awS71S1300000_1.l3;
        c1391600mJi.LJII = 3000L;
        c450720Hlu.LLILZ = awS71S1300000_1.s0;
        c450720Hlu.LIZIZ().show();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS71S1300000_1 awS71S1300000_1) {
        String str;
        String str2;
        PdpBottomArea pdpBottomArea;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skuSelectedInfo?.skuId ");
        SkuPanelState skuPanelStatePv0 = ((PdpViewModel) awS71S1300000_1.l1).Pv0();
        String str3 = null;
        if (skuPanelStatePv0 != null) {
            str = skuPanelStatePv0.skuId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" curId ");
        sbLIZ.append((String) ((C259800zU) awS71S1300000_1.l2).element);
        sbLIZ.append(" id ");
        sbLIZ.append(awS71S1300000_1.s0);
        sbLIZ.append(" skuItem?.bottomAreaId ");
        SkuItem skuItem = (SkuItem) awS71S1300000_1.l3;
        if (skuItem != null) {
            str2 = skuItem.bottomAreaId;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(" productInfoPack?.bottomArea?.defaultAreaId ");
        ProductPackStruct productPackStruct = ((PdpViewModel) awS71S1300000_1.l1).LLJILLL;
        if (productPackStruct != null && (pdpBottomArea = productPackStruct.bottomArea) != null) {
            str3 = pdpBottomArea.defaultAreaId;
        }
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS71S1300000_1 awS71S1300000_1) {
        int value;
        C1005503wT c1005503wT = C1005503wT.LIZ;
        Context context = ((SeaUserRightViewHolderV3) awS71S1300000_1.l1).itemView.getContext();
        SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) ((SeaUserRightViewHolderV3) awS71S1300000_1.l1).LLJJIJIL.getValue();
        SeaProductSelectUserRightVOV3 seaProductSelectUserRightVOV3 = (SeaProductSelectUserRightVOV3) awS71S1300000_1.l2;
        String str = seaProductSelectUserRightVOV3.schema;
        Integer num = seaProductSelectUserRightVOV3.schemaType;
        if (num != null) {
            value = num.intValue();
        } else {
            value = EnumC1005603wU.COUPON.getValue();
        }
        Map<String, String> map = ((SeaProductSelectUserRightVOV3) awS71S1300000_1.l2).trackParamsForSchema;
        String str2 = awS71S1300000_1.s0;
        View view = ((SeaUserRightViewHolderV3) awS71S1300000_1.l1).itemView;
        c1005503wT.getClass();
        C1005503wT.LIZJ(context, seaPdpViewModel, str, value, map, str2, view);
        C1748720vbi.LJ(((SeaUserRightViewHolderV3) awS71S1300000_1.l1).itemView, new C10516049i(), awS71S1300000_1.s0, (PageFinder) awS71S1300000_1.l3, new AwS580S0100000_1((SeaProductSelectUserRightVOV3) awS71S1300000_1.l2, 483));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS71S1300000_1 awS71S1300000_1) {
        C03X9 c03x9 = (C03X9) awS71S1300000_1.l1;
        BillInfoData billInfoData = (BillInfoData) awS71S1300000_1.l2;
        Integer num = (Integer) awS71S1300000_1.l3;
        String str = awS71S1300000_1.s0;
        c03x9.getClass();
        C03X9.LJIIIZ(billInfoData, num, str);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS71S1300000_1 awS71S1300000_1) {
        C03X9 c03x9 = (C03X9) awS71S1300000_1.l1;
        BillInfoData billInfoData = (BillInfoData) awS71S1300000_1.l2;
        Integer num = (Integer) awS71S1300000_1.l3;
        String str = awS71S1300000_1.s0;
        c03x9.getClass();
        C03X9.LJIIIZ(billInfoData, num, str);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS71S1300000_1 awS71S1300000_1) {
        int iLJIIJJI;
        int size;
        C03X9 c03x9 = (C03X9) awS71S1300000_1.l1;
        List<InterfaceC1891350zJl> list = (List) awS71S1300000_1.l2;
        Integer num = (Integer) awS71S1300000_1.l3;
        String str = awS71S1300000_1.s0;
        c03x9.getClass();
        C03XA.LIZ.getClass();
        if (list != null && !list.isEmpty() && (iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(num), "order_submit", null, null, 12)) != EnumC969503qf.US_OSP_V1.getTemplate()) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if (interfaceC1891350zJl instanceof AnonymousClass0376) {
                    arrayList.add(C03XH.LIZ(R.layout.b3w, 1));
                } else if (interfaceC1891350zJl instanceof C719202rO) {
                    arrayList.add(C03XH.LIZ(R.layout.b47, ((C719202rO) interfaceC1891350zJl).LLJIJIL.size()));
                } else if (interfaceC1891350zJl instanceof C720002rW) {
                    arrayList.add(C03XH.LIZ(R.layout.ap1, 1));
                } else if (interfaceC1891350zJl instanceof C722302rt) {
                    arrayList.add(C03XH.LIZ(R.layout.b4a, 1));
                    C722302rt c722302rt = (C722302rt) interfaceC1891350zJl;
                    arrayList.add(C03XH.LIZ(R.layout.b3y, c722302rt.LLILZLL.size()));
                    Iterator<C714302qb> it2 = c722302rt.LLILZLL.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        List<BillItem> list2 = it2.next().LJIIJ;
                        if (list2 != null) {
                            size = list2.size();
                        } else {
                            size = 0;
                        }
                        i += size;
                    }
                    arrayList.add(C03XH.LIZ(R.layout.b4b, i));
                }
            }
            ((C940303lx) C03XA.LIZIZ.getValue()).LIZIZ(Integer.valueOf(C03XA.LIZIZ()), C03XA.LJFF(arrayList, C03XA.LJ(Integer.valueOf(iLJIIJJI), str)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS71S1300000_1 awS71S1300000_1) {
        C1748720vbi.LIZLLL((LinearLayout) awS71S1300000_1.l1, new C10513049f(), new AwS86S1200000_1((Map) awS71S1300000_1.l2, (Map<String, Object>) awS71S1300000_1.l3, (BillItem) awS71S1300000_1.s0, (String) 47));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S1300000_1(C03X9 c03x9, BillInfoData billInfoData, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c03x9;
        this.l2 = billInfoData;
        this.l3 = null;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S1300000_1(C03X9 c03x9, BillInfoData billInfoData, Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c03x9;
        this.l2 = billInfoData;
        this.l3 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS71S1300000_1(C03X9 c03x9, C03X9 c03x92, List<InterfaceC1891350zJl> list, Integer num, String str) {
        super(0);
        this.$t = str;
        this.l1 = c03x9;
        this.l2 = c03x92;
        this.l3 = list;
        this.s0 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S1300000_1(Activity activity, View view, EnumC1235690iGF enumC1235690iGF, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = activity;
        this.l2 = view;
        this.l3 = enumC1235690iGF;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS71S1300000_1(LinearLayout linearLayout, LinearLayout linearLayout2, Map<String, Object> map, BillItem billItem, String str) {
        super(0);
        this.$t = str;
        this.l1 = linearLayout;
        this.l2 = linearLayout2;
        this.l3 = map;
        this.s0 = billItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S1300000_1(PageFinder pageFinder, SeaProductSelectUserRightVOV3 seaProductSelectUserRightVOV3, SeaUserRightViewHolderV3 seaUserRightViewHolderV3, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = seaUserRightViewHolderV3;
        this.l2 = seaProductSelectUserRightVOV3;
        this.s0 = str;
        this.l3 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS71S1300000_1(PdpViewModel pdpViewModel, PdpViewModel pdpViewModel2, C259800zU<String> c259800zU, String str, SkuItem skuItem) {
        super(0);
        this.$t = skuItem;
        this.l1 = pdpViewModel;
        this.l2 = pdpViewModel2;
        this.s0 = c259800zU;
        this.l3 = str;
    }
}
