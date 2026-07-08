package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel;

import X.C1421105hJ;
import X.C1728990v5t;
import X.C1729250v6J;
import X.C1730930v91;
import X.InterfaceC0148002o;
import X.InterfaceC1729810v7D;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class DiscountTemplateEditViewModel extends AssemViewModel<C1730930v91> {
    public InterfaceC1729810v7D LL;
    public final HashSet<String> LLILLJJLI = new HashSet<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1730930v91(0);
    }

    public final void vQ2(String str) {
        RootData rootData;
        String str2;
        String str3;
        boolean z;
        C1728990v5t c1728990v5tUm1;
        InterfaceC1729810v7D interfaceC1729810v7D = this.LL;
        String strLIZ = null;
        if (interfaceC1729810v7D != null && (c1728990v5tUm1 = interfaceC1729810v7D.Um1()) != null) {
            rootData = c1728990v5tUm1.LL;
        } else {
            rootData = null;
        }
        if (rootData == null || (str2 = rootData.roomId) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        if (rootData == null || (str3 = rootData.authorId) == null) {
            str3 = "";
        }
        if (rootData != null) {
            z = rootData.isNewUser;
        } else {
            z = false;
        }
        if (rootData != null) {
            strLIZ = rootData.LIZ();
        }
        Map mapLIZ = C1729250v6J.LIZ(str2, str3, strLIZ, z, "notice_board_edit", null);
        mapLIZ.put("button_name", str);
        C1421105hJ.LIZJ("livesdk_tiktokec_module_click", mapLIZ);
    }

    public final void wQ2(String str) {
        RootData rootData;
        String str2;
        String str3;
        boolean z;
        C1728990v5t c1728990v5tUm1;
        if (!this.LLILLJJLI.contains(str)) {
            InterfaceC1729810v7D interfaceC1729810v7D = this.LL;
            String strLIZ = null;
            if (interfaceC1729810v7D != null && (c1728990v5tUm1 = interfaceC1729810v7D.Um1()) != null) {
                rootData = c1728990v5tUm1.LL;
            } else {
                rootData = null;
            }
            if (rootData == null || (str2 = rootData.roomId) == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            if (rootData == null || (str3 = rootData.authorId) == null) {
                str3 = "";
            }
            if (rootData != null) {
                z = rootData.isNewUser;
            } else {
                z = false;
            }
            if (rootData != null) {
                strLIZ = rootData.LIZ();
            }
            Map mapLIZ = C1729250v6J.LIZ(str2, str3, strLIZ, z, "notice_board_edit", null);
            mapLIZ.put("button_name", str);
            C1421105hJ.LIZJ("livesdk_tiktokec_module_show", mapLIZ);
            this.LLILLJJLI.add(str);
        }
    }
}
