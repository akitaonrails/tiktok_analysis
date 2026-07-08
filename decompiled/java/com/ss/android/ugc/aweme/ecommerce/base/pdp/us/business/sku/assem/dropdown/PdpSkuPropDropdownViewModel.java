package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown;

import X.C03DW;
import X.C04CS;
import X.C04FN;
import X.C1156560gCc;
import X.C13LP;
import X.C1405960mgs;
import X.C1776180wK0;
import X.C7869035n;
import X.EnumC1066604Fc;
import X.InterfaceC0148002o;
import X.InterfaceC1420660n4a;
import X.InterfaceC1761670vwb;
import X.InterfaceC7870035o;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.IAiTryOnAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpSkuPropDropdownViewModel extends PdpBodyListBaseCardViewModel<C1156560gCc, C1405960mgs> implements C03DW, InterfaceC1420660n4a {
    public final InterfaceC7870035o LL;
    public final IAiTryOnAbility LLILLJJLI;
    public final C04CS LLILLL;
    public final InterfaceC1761670vwb LLILZ;
    public final ISkuManagerAbility LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1156560gCc(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C03DW
    public final void Hz1(Map<String, String> map) {
        int iFC1;
        String str;
        String str2;
        C04CS c04cs;
        List<String> list;
        ISkuManagerAbility iSkuManagerAbility = this.LLILZIL;
        if (iSkuManagerAbility != null) {
            iFC1 = iSkuManagerAbility.FC1();
        } else {
            iFC1 = -1;
        }
        C1405960mgs item = getItem();
        if (item != null && (list = item.LLIZ) != null) {
            str = (String) C13LP.LJJJLZIJ(iFC1, list);
        } else {
            str = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null && str.length() != 0) {
            linkedHashMap.put("color_id", str);
        }
        C04FN c04fn = ((C1156560gCc) getState()).LL;
        if (c04fn != null && map != null && (str2 = map.get(EnumC1066604Fc.BUTTON_SHOW.getValue())) != null && (c04cs = this.LLILLL) != null) {
            c04cs.LJI(c04fn, str2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1420660n4a
    public final void f20(Map<String, String> map) {
        int i;
        String str;
        C04CS c04cs;
        Integer numValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ISkuManagerAbility iSkuManagerAbility = this.LLILZIL;
        if (iSkuManagerAbility != null && (numValueOf = Integer.valueOf(iSkuManagerAbility.M01())) != null && numValueOf.intValue() == 2) {
            i = 0;
        } else {
            i = 1;
        }
        linkedHashMap.put("sale_prop_status", Integer.valueOf(i));
        C04FN c04fn = ((C1156560gCc) getState()).LL;
        if (c04fn != null && map != null && (str = map.get(EnumC1066604Fc.BUTTON_SHOW.getValue())) != null && (c04cs = this.LLILLL) != null) {
            c04cs.LJI(c04fn, str, linkedHashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel
    public final InterfaceC0148002o vQ2(InterfaceC0148002o interfaceC0148002o, C1405960mgs c1405960mgs) {
        C04FN c04fn = c1405960mgs.LLJILJIL;
        interfaceC0148002o.getClass();
        return new C1156560gCc(c04fn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1420660n4a
    public final void Td2(View view, Fragment fragment, Map map) {
        int i;
        String str;
        C04CS c04cs;
        Integer numValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ISkuManagerAbility iSkuManagerAbility = this.LLILZIL;
        View view2 = null;
        if (iSkuManagerAbility != null && (numValueOf = Integer.valueOf(iSkuManagerAbility.M01())) != null && numValueOf.intValue() == 2) {
            i = 0;
        } else {
            i = 1;
        }
        linkedHashMap.put("sale_prop_status", Integer.valueOf(i));
        C04FN c04fn = ((C1156560gCc) getState()).LL;
        if (c04fn != null && map != null && (str = (String) map.get(EnumC1066604Fc.BUTTON_CLICK.getValue())) != null && (c04cs = this.LLILLL) != null) {
            c04cs.LJI(c04fn, str, linkedHashMap);
        }
        PdpViewModel pdpViewModelLX = this.LLILZ.lX();
        if (fragment != null) {
            view2 = fragment.getView();
        }
        PdpViewModel.iS2(pdpViewModelLX, view2, 0, new C1776180wK0(view, this, fragment, 1), true, null, null, false, null, null, 1008);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C03DW
    public final void aE2(ECBaseFragment eCBaseFragment, Context context, String str, Map<String, String> map) {
        PropButton propButton;
        int iFC1;
        String str2;
        String str3;
        C04CS c04cs;
        List<String> list;
        C1405960mgs item = getItem();
        if (item != null && (propButton = item.LLILLJJLI) != null) {
            ISkuManagerAbility iSkuManagerAbility = this.LLILZIL;
            if (iSkuManagerAbility != null) {
                iFC1 = iSkuManagerAbility.FC1();
            } else {
                iFC1 = -1;
            }
            C1405960mgs item2 = getItem();
            if (item2 != null && (list = item2.LLIZ) != null) {
                str2 = (String) C13LP.LJJJLZIJ(iFC1, list);
            } else {
                str2 = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str2 != null && str2.length() != 0) {
                linkedHashMap.put("color_id", str2);
            }
            C04FN c04fn = ((C1156560gCc) getState()).LL;
            if (c04fn != null && map != null && (str3 = map.get(EnumC1066604Fc.BUTTON_CLICK.getValue())) != null && (c04cs = this.LLILLL) != null) {
                c04cs.LJI(c04fn, str3, null);
            }
            C7869035n.LIZ(eCBaseFragment, context, propButton, str, this.LLILLJJLI, this.LL);
        }
    }

    public PdpSkuPropDropdownViewModel(InterfaceC7870035o interfaceC7870035o, IAiTryOnAbility iAiTryOnAbility, C04CS c04cs, InterfaceC1761670vwb interfaceC1761670vwb, ISkuManagerAbility iSkuManagerAbility) {
        this.LL = interfaceC7870035o;
        this.LLILLJJLI = iAiTryOnAbility;
        this.LLILLL = c04cs;
        this.LLILZ = interfaceC1761670vwb;
        this.LLILZIL = iSkuManagerAbility;
    }
}
