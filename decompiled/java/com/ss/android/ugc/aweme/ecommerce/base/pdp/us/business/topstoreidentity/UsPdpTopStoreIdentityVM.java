package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity;

import X.C045D;
import X.C1284660jXE;
import X.C1761640vwY;
import X.C2188811AlT;
import X.C817803Hk;
import X.C919503ib;
import X.InterfaceC0148002o;
import X.InterfaceC1053404Aa;
import X.InterfaceC1761670vwb;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class UsPdpTopStoreIdentityVM extends PdpBodyListBaseCardViewModel<C1761640vwY, UsPdpTopStoreIdentityModuleVO> {
    public final InterfaceC1761670vwb LL;
    public final InterfaceC1053404Aa LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0vwY
        };
    }

    public static String wQ2(UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO) {
        String str = usPdpTopStoreIdentityModuleVO.btm;
        if (str == null || !(!a0.LJJJIL(str))) {
            return null;
        }
        return C045D.LIZ(str, usPdpTopStoreIdentityModuleVO.liveInfoBtm);
    }

    public final Map<String, Object> xQ2(UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO) {
        InterfaceC1053404Aa interfaceC1053404Aa;
        String strWQ2 = wQ2(usPdpTopStoreIdentityModuleVO);
        if (strWQ2 == null || (interfaceC1053404Aa = this.LLILLJJLI) == null) {
            return null;
        }
        return interfaceC1053404Aa.LIZJ(new C817803Hk(strWQ2, null));
    }

    public UsPdpTopStoreIdentityVM(InterfaceC1761670vwb interfaceC1761670vwb, InterfaceC1053404Aa interfaceC1053404Aa) {
        this.LL = interfaceC1761670vwb;
        this.LLILLJJLI = interfaceC1053404Aa;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel
    public final InterfaceC0148002o vQ2(InterfaceC0148002o interfaceC0148002o, UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void yQ2(Context context, String str, String str2, Map<String, ? extends Object> map) {
        InterfaceC1053404Aa interfaceC1053404Aa;
        String strLJII;
        if (str2 != null && !a0.LJJJIL(str2) && (interfaceC1053404Aa = this.LLILLJJLI) != null && (strLJII = interfaceC1053404Aa.LJII(str2, str, null)) != null) {
            str = strLJII;
        }
        C919503ib.LIZIZ(context, str, map, false).open();
    }
}
