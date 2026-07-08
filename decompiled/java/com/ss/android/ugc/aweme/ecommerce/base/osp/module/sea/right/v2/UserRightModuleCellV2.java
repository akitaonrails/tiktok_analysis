package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.right.v2;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03O0;
import X.C1007603wo;
import X.C1007803wq;
import X.C1008603wy;
import X.C13LE;
import X.C15438062q;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C720302rZ;
import X.C736902uF;
import X.C737910Sx3;
import X.C855703Vz;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserRightModuleCellV2 extends ECPowerCell<C736902uF> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserRightModuleCellV2.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public UserRightModuleCellV2() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 391);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(89);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 401), awS545S0100000_1, AFwS207S0000000_19.get$arr$(140), new AwS545S0100000_1((C03K6) this, 383), new AwS545S0100000_1((C03K6) this, 385), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 387), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1152), null, new AwS545S0100000_1((C03K6) this, 389));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 384);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 386);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 388);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 55));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1153);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1154);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1155);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1156);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1157);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 390), awS545S0100000_1, AFwS207S0000000_19.get$arr$(138), new AwS545S0100000_1((C03K6) this, 392), new AwS545S0100000_1((C03K6) this, 393), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 394), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1158), null, new AwS545S0100000_1((C03K6) this, 395));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 396), awS545S0100000_1, AFwS207S0000000_19.get$arr$(139), new AwS545S0100000_1((C03K6) this, 397), new AwS545S0100000_1((C03K6) this, 398), new AwS545S0100000_1((C03K6) this, 399), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 400));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final HashMap<String, Object> L5() {
        Summary summary;
        HashMap<String, Object> mapHi1 = N5().hi1(false);
        BillInfoData billInfoData = N5().LLJJI;
        if (billInfoData != null && (summary = billInfoData.summary) != null) {
            C855703Vz.LIZJ(C720302rZ.LJ(summary), mapHi1);
        }
        Pair[] pairArr = new Pair[1];
        BillInfoData billInfoData2 = N5().LLJJI;
        pairArr[0] = new Pair("delivery_info", billInfoData2 != null ? C720302rZ.LIZ(billInfoData2) : null);
        C1008603wy.LIZ(mapHi1, pairArr);
        C1008603wy.LIZ(mapHi1, new Pair("cart_item_id", N5().uR2()));
        return mapHi1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1007603wo c1007603wo;
        C736902uF c736902uF = (C736902uF) interfaceC1891350zJl;
        super.onBindItemView(c736902uF);
        ExposeUserRightPanel exposeUserRightPanel = c736902uF.LL;
        View view = this.itemView;
        C1007803wq c1007803wq = null;
        ArrayList arrayList = null;
        if ((view instanceof C1007603wo) && (c1007603wo = (C1007603wo) view) != null) {
            if (exposeUserRightPanel != null) {
                String str = exposeUserRightPanel.title;
                List<ExposeUserRight> list = exposeUserRightPanel.exposeUserRights;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<ExposeUserRight> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str2 = it2.next().name;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList.add(str2);
                    }
                }
                c1007803wq = new C1007803wq(str, arrayList);
            }
            c1007603wo.setUserRight(c1007803wq);
            c1007603wo.setUserRightModuleClickListener$ecommerce_transaction_release(new AwS545S0100000_1(this, 1592));
            c1007603wo.setUserRightSlideListener$ecommerce_transaction_release(new AwS580S0100000_1(this, 576));
        }
        C03O0.LJJJZ(C03O0.LIZ, "user_rights", L5(), null, null, null, null, null, null, null, null, null, null, null, 1048572);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C1007603wo c1007603wo = new C1007603wo(viewGroup.getContext(), null);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1007603wo);
        c1007603wo.setLayoutParams(layoutParams);
        return c1007603wo;
    }
}
