package com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.gift;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C719102rN;
import X.C719202rO;
import X.C723002s0;
import X.C737910Sx3;
import X.C798803Ac;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USHalfFreeGiftCell extends ECPowerCell<C719202rO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USHalfFreeGiftCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b0x;
    }

    public USHalfFreeGiftCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1680);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(80);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1691), awS577S0100000_33, AFwS224S0000000_33.get$arr$(229), new AwS577S0100000_33((C03K6) this, 1666), new AwS577S0100000_33((C03K6) this, 1668), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1670), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1672), null, new AwS577S0100000_33((C03K6) this, 1673));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1667);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1669);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1671);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 62));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1674);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1675);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1676);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1677);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1678);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1679), awS577S0100000_33, AFwS224S0000000_33.get$arr$(227), new AwS577S0100000_33((C03K6) this, 1681), new AwS577S0100000_33((C03K6) this, 1682), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1683), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1684), null, new AwS577S0100000_33((C03K6) this, 1685));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1686), awS577S0100000_33, AFwS224S0000000_33.get$arr$(228), new AwS577S0100000_33((C03K6) this, 1687), new AwS577S0100000_33((C03K6) this, 1688), new AwS577S0100000_33((C03K6) this, 1689), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1690));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final int L5(C719202rO c719202rO) {
        List<C798803Ac> list;
        int iIntValue;
        int iIntValue2;
        int i = 0;
        if (c719202rO != null) {
            if (c719202rO.LLJLIL) {
                Iterator<C723002s0> it2 = c719202rO.LLJIJIL.iterator();
                i = 0;
                while (it2.hasNext()) {
                    Iterator<C719102rN> it3 = it2.next().LLJ.iterator();
                    while (it3.hasNext()) {
                        List<C798803Ac> list2 = it3.next().LLLLLJLJLL;
                        if (list2 != null) {
                            Iterator<C798803Ac> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                Integer num = it4.next().LJFF;
                                if (num != null) {
                                    iIntValue2 = num.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                i += iIntValue2;
                            }
                        }
                    }
                }
            } else {
                List<C723002s0> list3 = c719202rO.LLJIJIL;
                if (list3 != null) {
                    Iterator<C723002s0> it5 = list3.iterator();
                    i = 0;
                    while (it5.hasNext()) {
                        C719102rN c719102rN = it5.next().LLJLIL;
                        if (c719102rN != null && (list = c719102rN.LLLLLJLJLL) != null) {
                            Iterator<C798803Ac> it6 = list.iterator();
                            while (it6.hasNext()) {
                                Integer num2 = it6.next().LJFF;
                                if (num2 != null) {
                                    iIntValue = num2.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                i += iIntValue;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r8) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.gift.USHalfFreeGiftCell.onBindItemView(X.0zJl):void");
    }
}
