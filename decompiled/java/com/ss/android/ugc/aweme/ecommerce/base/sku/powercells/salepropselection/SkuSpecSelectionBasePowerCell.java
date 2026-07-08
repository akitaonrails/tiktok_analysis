package com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03C8;
import X.C03DZ;
import X.C03EA;
import X.C03IJ;
import X.C03K6;
import X.C042W;
import X.C042Y;
import X.C047J;
import X.C049X;
import X.C049Y;
import X.C04AS;
import X.C04AT;
import X.C04FD;
import X.C10296040w;
import X.C10515049h;
import X.C12ES;
import X.C13LE;
import X.C13LQ;
import X.C1697810uHb;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C827203La;
import X.InterfaceC1748810vbr;
import X.InterfaceC2172581A0y;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC746802vq;
import Y.AObjectS208S0300000_1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import g1c.AjS40S0200000_1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS23S0202000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS4S1202000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SkuSpecSelectionBasePowerCell<T extends InterfaceC746802vq> extends PowerCell<T> implements InterfaceC2172581A0y, C04FD {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuSpecSelectionBasePowerCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/vm/SkuPanelAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract FrameLayout N5();

    public abstract TuxTextView P5();

    public SkuSpecSelectionBasePowerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkuPanelAssemVM.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1419);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(352);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1409), awS545S0100000_1, AFwS204S0000000_16.get$arr$(159), new AwS545S0100000_1((C03K6) this, 1411), new AwS545S0100000_1((C03K6) this, 1413), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1415), aFwS228S0000000_1, new AwS560S0100000_16((C03K6) this, 223), null, new AwS545S0100000_1((C03K6) this, 1417));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1412);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1414);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1416);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS417S0200000_16((InterfaceC451590HnJ) obj, awS545S0100000_12, 19));
            AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(c01gwLIZIZ, 224);
            AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16(c01gwLIZIZ, 225);
            AwS560S0100000_16 awS560S0100000_163 = new AwS560S0100000_16(c01gwLIZIZ, 226);
            AwS560S0100000_16 awS560S0100000_164 = new AwS560S0100000_16(c01gwLIZIZ, 227);
            AwS560S0100000_16 awS560S0100000_165 = new AwS560S0100000_16(c01gwLIZIZ, 228);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS560S0100000_16, awS560S0100000_162, awS545S0100000_13, aFwS228S0000000_1, awS560S0100000_163, awS560S0100000_164, awS560S0100000_165);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1418), awS545S0100000_1, AFwS204S0000000_16.get$arr$(160), new AwS545S0100000_1((C03K6) this, 1420), new AwS545S0100000_1((C03K6) this, 1421), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1422), aFwS228S0000000_1, new AwS560S0100000_16((C03K6) this, 229), null, new AwS545S0100000_1((C03K6) this, 1423));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1403), awS545S0100000_1, AFwS204S0000000_16.get$arr$(158), new AwS545S0100000_1((C03K6) this, 1404), new AwS545S0100000_1((C03K6) this, 1405), new AwS545S0100000_1((C03K6) this, 1406), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1408));
        }
        this.LL = assemVMLazy;
    }

    public SkuPanelAssemVM R5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return (SkuPanelAssemVM) assemVMLazy.getValue();
    }

    @Override // X.C04FD
    public final void LJLJLLL(SizeGuide sizeGuide) {
        BaseSkuFragment<?> baseSkuFragment;
        SkuPanelAssemVM skuPanelAssemVMR5 = R5();
        Fragment fragmentLIZIZ = C827203La.LIZIZ(getCurrentLifecycleOwner());
        if (fragmentLIZIZ instanceof BaseSkuFragment) {
            baseSkuFragment = (BaseSkuFragment) fragmentLIZIZ;
        } else {
            baseSkuFragment = null;
        }
        skuPanelAssemVMR5.SQ2(baseSkuFragment);
    }

    @Override // X.C04FD
    public final void LLLLZLL(View view) {
        if (view != null) {
            C1748720vbi.LJFF(view, new C049X(), AFwS185S0000000_1.get$arr$(144), AFwS228S0000000_1.get$arr$(406));
            C1748720vbi.LJFF(view, new C10515049h(), AFwS185S0000000_1.get$arr$(145), new AwS580S0100000_1(this, (SkuSpecSelectionBasePowerCell<InterfaceC746802vq>) 374));
        }
    }

    public final void S5(SaleProp saleProp) {
        C1748720vbi.LJFF(this.itemView, new C10515049h(), new AwS545S0100000_1(saleProp, 1410), new AwS367S0200000_1((SkuSpecSelectionBasePowerCell) this, saleProp, (SaleProp) 125));
    }

    @Override // X.C04FD
    public final void Tk(int i, int i2, C042Y c042y) {
        String str;
        int size;
        String[] strArr;
        ECBaseBottomSheetDialogFragment eCBaseBottomSheetDialogFragment;
        String str2;
        List<SaleProp> list;
        List<SaleProp> list2;
        String[] strArr2;
        String str3;
        if (c042y != null && c042y.LLJIJIL != C042W.NOT_EXPANDABLE) {
            if (!R5().LLIZLLLIL.containsKey(Integer.valueOf(i))) {
                R5().LLIZLLLIL.put(Integer.valueOf(i), Boolean.FALSE);
            } else {
                if (((Boolean) ((LinkedHashMap) R5().LLIZLLLIL).get(Integer.valueOf(i))) != null) {
                    R5().LLIZLLLIL.put(Integer.valueOf(i), Boolean.valueOf(!r0.booleanValue()));
                }
            }
            R5().Oy();
            return;
        }
        SkuPanelState skuPanelState = R5().LLIZ;
        if (skuPanelState != null && (strArr2 = skuPanelState.checkedSkuIds) != null) {
            Object objLJJIIZ = C13LQ.LJJIIZ(i, strArr2);
            if (c042y != null) {
                str3 = c042y.LL;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(objLJJIIZ, str3)) {
                str = "cancel";
            } else {
                str = "select";
            }
        } else {
            str = null;
        }
        if (c042y != null && c042y.LLILZIL && Intrinsics.LJFF(str, "cancel")) {
            return;
        }
        ProductPackStruct productPackStruct = R5().LLJIJIL;
        if (productPackStruct != null && (list2 = productPackStruct.saleProps) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        SkuPanelState skuPanelState2 = R5().LLIZ;
        String str4 = "";
        if (skuPanelState2 == null || (strArr = skuPanelState2.checkedSkuIds) == null) {
            strArr = new String[size];
            for (int i3 = 0; i3 < size; i3++) {
                strArr[i3] = "";
            }
        }
        if (strArr.length < size) {
            strArr = new String[size];
            int i4 = 0;
            do {
                strArr[i4] = "";
                i4++;
            } while (i4 < size);
        }
        if (i < strArr.length) {
            if (Intrinsics.LJFF(str, "cancel")) {
                strArr[i] = "";
            } else {
                if (c042y != null && (str2 = c042y.LL) != null) {
                    str4 = str2;
                }
                strArr[i] = str4;
            }
            R5().dc(false, strArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SkuInfo skuInfo = R5().LLJ;
            if (skuInfo != null && (list = skuInfo.salePropList) != null) {
                int i5 = 0;
                for (SaleProp saleProp : list) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        SaleProp saleProp2 = saleProp;
                        List<SalePropValue> list3 = saleProp2.salePropValueList;
                        if (list3 != null && list3.size() > 1) {
                            linkedHashMap.put(Integer.valueOf(i5), saleProp2);
                        }
                        i5 = i6;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            if (true ^ linkedHashMap.isEmpty()) {
                R5().Oy();
            }
        }
        Fragment fragmentLIZIZ = C827203La.LIZIZ(getCurrentLifecycleOwner());
        if ((fragmentLIZIZ instanceof BaseSkuFragment) && (eCBaseBottomSheetDialogFragment = (ECBaseBottomSheetDialogFragment) fragmentLIZIZ) != null) {
            C1748720vbi.LIZIZ(eCBaseBottomSheetDialogFragment, new C049Y(), new AwS4S1202000_1((SkuSpecSelectionBasePowerCell) this, str, (String) i, i2, (int) c042y, (C042Y) 1));
        }
    }

    public final void I5(Context context, ECRichText eCRichText, InterfaceC1748810vbr interfaceC1748810vbr, String str) {
        TuxTextView tuxTextViewP5 = P5();
        if (tuxTextViewP5 != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextViewP5);
            C03C8.LJ(tuxTextViewP5, eCRichText, "SALE_PROP_INFO", new AObjectS208S0300000_1(context, interfaceC1748810vbr, eCRichText, 1));
            C1748720vbi.LJFF(tuxTextViewP5, new C10515049h(), new AwS86S1000000_1(str, 13), new AwS580S0100000_1(eCRichText, 272));
        }
    }

    @Override // X.C04FD
    public final void LLLLZLLLI(View view, int i, int i2, C042Y c042y) {
        if (view != null) {
            C1748720vbi.LJFF(view, new C049X(), new AwS545S0100000_1(c042y, 1407), new AwS23S0202000_1((SkuSpecSelectionBasePowerCell) this, c042y, (C042Y) i, i2, 2));
        }
    }

    public final void L5(Context context, InterfaceC1748810vbr interfaceC1748810vbr, SaleProp saleProp, SizeGuide sizeGuide, boolean z) {
        View viewLIZ;
        Object obj;
        String str;
        TryOnData tryOnData;
        Map<String, Object> map;
        Map<String, ? extends Object> mapLIZIZ = null;
        if (sizeGuide != null) {
            C03EA c03ea = C03EA.LIZ;
            FrameLayout frameLayoutN5 = N5();
            c03ea.getClass();
            viewLIZ = C03EA.LIZ(frameLayoutN5, sizeGuide, 51);
        } else {
            viewLIZ = null;
        }
        if (viewLIZ != null && sizeGuide != null) {
            C12ES.LJIILL(0, N5());
            if (N5().getChildCount() != 0) {
                C786410Ut5.LJJJJIZL(N5());
            }
            N5().addView(viewLIZ);
            LLLLZLL(N5());
            C786410Ut5.I7(new AjS40S0200000_1(this, sizeGuide, 20), N5());
            return;
        }
        if (z) {
            SkuPanelStarter.SkuEnterParams skuEnterParams = R5().LLJI;
            if (skuEnterParams != null && (map = skuEnterParams.trackParams) != null) {
                obj = map.get("source_page_type");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            ProductPackStruct productPackStruct = R5().LLJIJIL;
            if (productPackStruct != null) {
                tryOnData = productPackStruct.tryOnData;
            } else {
                tryOnData = null;
            }
            C04AS c04as = new C04AS(tryOnData, R5().LLJILJIL, null, null, R5().LLL, "c62226.d49471", context, null, interfaceC1748810vbr, "try_on_clolors_sku", str, R5().LLJI, R5(), 12);
            View viewLIZJ = c04as.LIZJ(saleProp, C047J.LIZ());
            if (viewLIZJ == null) {
                return;
            }
            TryOnData tryOnData2 = c04as.LIZ;
            if (tryOnData2 != null) {
                mapLIZIZ = C04AT.LIZIZ(tryOnData2);
            }
            if (!R5().LLLLII) {
                R5().LLLLII = true;
                C10296040w.LIZ.getClass();
                c04as.LJFF(mapLIZIZ, C10296040w.LIZIZ);
            }
            C786410Ut5.I7(new AjS40S0200000_1(c04as, mapLIZIZ, 27), viewLIZJ);
            FrameLayout frameLayoutN52 = N5();
            if (frameLayoutN52 == null) {
                return;
            }
            C12ES.LJIILL(0, frameLayoutN52);
            if (frameLayoutN52.getChildCount() > 0) {
                C786410Ut5.LJJJJIZL(frameLayoutN52);
            }
            frameLayoutN52.addView(viewLIZJ);
            return;
        }
        C03DZ.LIZ(N5());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5 A[EDGE_INSN: B:64:0x00d5->B:52:0x00d5 BREAK  A[LOOP:1: B:21:0x0041->B:25:0x0051], PHI: r10
      0x00d5: PHI (r10v2 int) = (r10v0 int), (r10v4 int) binds: [B:28:0x0057, B:64:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void T5(java.util.List r17, com.bytedance.tux.input.TuxTextView r18, com.bytedance.tux.input.TuxTextView r19, com.bytedance.tux.input.TuxTextView r20, java.lang.String r21, com.bytedance.tux.input.TuxTextView r22) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuSpecSelectionBasePowerCell.T5(java.util.List, com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, java.lang.String, com.bytedance.tux.input.TuxTextView):void");
    }
}
