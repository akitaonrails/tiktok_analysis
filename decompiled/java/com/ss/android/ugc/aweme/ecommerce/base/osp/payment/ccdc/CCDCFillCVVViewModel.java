package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.C887403dQ;
import X.C891503e5;
import X.EnumC899103fJ;
import X.InterfaceC0148002o;
import X.InterfaceC1164530gPT;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS11S2000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCFillCVVViewModel extends AssemViewModel<C891503e5> implements InterfaceC1164530gPT {
    public C887403dQ LL;
    public RedirectDetails LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public PaymentInfo LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C891503e5(0);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "payment_bindcard_3ds_result")) {
            if (u.LJIJI(new JSONObject(str2).optString("payment_bindcard_3ds_result"), EnumC899103fJ.SUCCESS.getValue(), true)) {
                setState(AFwS228S0000000_1.get$arr$(196));
            } else {
                setState(new AwS11S2000000_1(null, null, 8));
            }
        }
    }
}
