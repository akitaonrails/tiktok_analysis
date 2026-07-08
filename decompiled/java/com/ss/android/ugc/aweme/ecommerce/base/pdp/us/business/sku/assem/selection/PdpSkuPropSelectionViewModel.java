package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection;

import X.C03DW;
import X.C04CS;
import X.C04DA;
import X.C04DB;
import X.C04FN;
import X.C1156570gCd;
import X.C13LP;
import X.C1405970mgt;
import X.C1406590mht;
import X.C1406880miM;
import X.C1406890miN;
import X.C1406900miO;
import X.C7869035n;
import X.EnumC1064704Ej;
import X.EnumC1066604Fc;
import X.InterfaceC0148002o;
import X.InterfaceC1065004Em;
import X.InterfaceC1406920miQ;
import X.InterfaceC1407210mit;
import X.InterfaceC1761670vwb;
import X.InterfaceC7870035o;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.IAiTryOnAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS16S1210000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpSkuPropSelectionViewModel extends PdpBodyListBaseCardViewModel<C1156570gCd, C1405970mgt> implements C03DW, InterfaceC1407210mit {
    public final IAiTryOnAbility LL;
    public final ISkuManagerAbility LLILLJJLI;
    public final InterfaceC7870035o LLILLL;
    public final C04CS LLILZ;
    public final InterfaceC1761670vwb LLILZIL;
    public final InterfaceC1065004Em LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1156570gCd(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C03DW
    public final void Hz1(Map<String, String> map) {
        int iFC1;
        String str;
        String str2;
        C04CS c04cs;
        List<String> list;
        ISkuManagerAbility iSkuManagerAbility = this.LLILLJJLI;
        if (iSkuManagerAbility != null) {
            iFC1 = iSkuManagerAbility.FC1();
        } else {
            iFC1 = -1;
        }
        C1405970mgt item = getItem();
        if (item != null && (list = item.LLIZLLLIL) != null) {
            str = (String) C13LP.LJJJLZIJ(iFC1, list);
        } else {
            str = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null && str.length() != 0) {
            linkedHashMap.put("color_id", str);
        }
        C04FN c04fn = ((C1156570gCd) getState()).LL;
        if (c04fn != null && map != null && (str2 = map.get(EnumC1066604Fc.BUTTON_SHOW.getValue())) != null && (c04cs = this.LLILZ) != null) {
            c04cs.LJI(c04fn, str2, linkedHashMap);
        }
    }

    @Override // X.InterfaceC1407210mit
    public final void Ju1(int i, List list) {
        InterfaceC1761670vwb interfaceC1761670vwb;
        if (this.LLIZ || (interfaceC1761670vwb = this.LLILZIL) == null) {
            return;
        }
        C1406590mht.LIZ().LIZ(interfaceC1761670vwb.jf2(), new C1406880miM(interfaceC1761670vwb.iH1(Integer.valueOf(interfaceC1761670vwb.Tg2())), list, i));
        this.LLIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel
    public final InterfaceC0148002o vQ2(InterfaceC0148002o interfaceC0148002o, C1405970mgt c1405970mgt) {
        C04FN c04fn = c1405970mgt.LLJIJIL;
        interfaceC0148002o.getClass();
        return new C1156570gCd(c04fn);
    }

    @Override // X.InterfaceC1407210mit
    public final void KD0(String str, PropValue propValue, Image image) {
        InterfaceC1065004Em interfaceC1065004Em = this.LLILZLL;
        if (interfaceC1065004Em != null) {
            String str2 = propValue.propValueId;
            ISkuManagerAbility iSkuManagerAbility = this.LLILLJJLI;
            boolean z = false;
            if (iSkuManagerAbility != null && iSkuManagerAbility.Gw1(str)) {
                z = true;
            }
            interfaceC1065004Em.g4(image, str2, z);
        }
    }

    @Override // X.InterfaceC1407210mit
    public final void Zf1(int i, int i2, EnumC1064704Ej enumC1064704Ej, List list) {
        InterfaceC1761670vwb interfaceC1761670vwb;
        if (list.isEmpty() || (interfaceC1761670vwb = this.LLILZIL) == null) {
            return;
        }
        C1406590mht.LIZ().LIZ(interfaceC1761670vwb.jf2(), new C1406900miO(interfaceC1761670vwb.iH1(Integer.valueOf(interfaceC1761670vwb.Tg2())), list, enumC1064704Ej, i, i2));
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
        C1405970mgt item = getItem();
        if (item != null && (propButton = item.LLILLJJLI) != null) {
            ISkuManagerAbility iSkuManagerAbility = this.LLILLJJLI;
            if (iSkuManagerAbility != null) {
                iFC1 = iSkuManagerAbility.FC1();
            } else {
                iFC1 = -1;
            }
            C1405970mgt item2 = getItem();
            if (item2 != null && (list = item2.LLIZLLLIL) != null) {
                str2 = (String) C13LP.LJJJLZIJ(iFC1, list);
            } else {
                str2 = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str2 != null && str2.length() != 0) {
                linkedHashMap.put("color_id", str2);
            }
            C04FN c04fn = ((C1156570gCd) getState()).LL;
            if (c04fn != null && map != null && (str3 = map.get(EnumC1066604Fc.BUTTON_CLICK.getValue())) != null && (c04cs = this.LLILZ) != null) {
                c04cs.LJI(c04fn, str3, linkedHashMap);
            }
            C7869035n.LIZ(eCBaseFragment, context, propButton, str, this.LL, this.LLILLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1407210mit
    public final void JW0(String str, PropValue propValue, boolean z, boolean z2, Image image) {
        String str2;
        Map<String, String> map;
        String str3;
        C04CS c04cs;
        if (z) {
            str2 = "select";
        } else {
            str2 = "cancel";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("select_type", str2);
        linkedHashMap.put("sale_prop_status", Boolean.valueOf(z2));
        C04FN c04fn = ((C1156570gCd) getState()).LL;
        if (c04fn != null && (map = propValue.eventTrackingTriggerKeys) != null && (str3 = map.get(EnumC1066604Fc.BUTTON_SHOW.getValue())) != null && (c04cs = this.LLILZ) != null) {
            c04cs.LJI(c04fn, str3, linkedHashMap);
        }
        InterfaceC1065004Em interfaceC1065004Em = this.LLILZLL;
        if (interfaceC1065004Em != null) {
            ISkuManagerAbility iSkuManagerAbility = this.LLILLJJLI;
            boolean z3 = false;
            if (iSkuManagerAbility != null && iSkuManagerAbility.Gw1(str)) {
                z3 = true;
            }
            interfaceC1065004Em.eg(image, z3);
        }
    }

    public PdpSkuPropSelectionViewModel(IAiTryOnAbility iAiTryOnAbility, ISkuManagerAbility iSkuManagerAbility, InterfaceC7870035o interfaceC7870035o, C04CS c04cs, InterfaceC1761670vwb interfaceC1761670vwb, InterfaceC1065004Em interfaceC1065004Em) {
        this.LL = iAiTryOnAbility;
        this.LLILLJJLI = iSkuManagerAbility;
        this.LLILLL = interfaceC7870035o;
        this.LLILZ = c04cs;
        this.LLILZIL = interfaceC1761670vwb;
        this.LLILZLL = interfaceC1065004Em;
    }

    @Override // X.InterfaceC1407210mit
    public final void bI2(List<String> list, String str, PropValue propValue, int i, int i2, Image image, Boolean bool, boolean z, View view, int i3, List<? extends InterfaceC1406920miQ> list2, int i4) {
        String str2;
        ImageSelectData imageSelectData;
        C04DA c04da;
        int i5 = i2;
        if (Intrinsics.LJFF(C13LP.LJJJLZIJ(i, list), propValue.propValueId)) {
            str2 = "cancel";
        } else {
            str2 = "select";
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE) && Intrinsics.LJFF(str2, "cancel")) {
            return;
        }
        if (image != null) {
            C04DB c04db = C04DB.SKU_ENTRANCE;
            ISkuManagerAbility iSkuManagerAbility = this.LLILLJJLI;
            if (iSkuManagerAbility != null && iSkuManagerAbility.Gw1(str)) {
                c04da = C04DA.SKC;
            } else {
                c04da = C04DA.SKU;
            }
            if (Intrinsics.LJFF(str2, "cancel")) {
                i5 = -1;
            }
            imageSelectData = new ImageSelectData(image, c04db, c04da, i5);
        } else {
            imageSelectData = null;
        }
        ISkuManagerAbility iSkuManagerAbility2 = this.LLILLJJLI;
        if (iSkuManagerAbility2 != null) {
            String str3 = propValue.propValueId;
            if (str3 == null) {
                str3 = "";
            }
            iSkuManagerAbility2.ev2(i, str3, imageSelectData, view, new AwS16S1210000_26(str2, z, this, propValue, 1));
        }
        InterfaceC1761670vwb interfaceC1761670vwb = this.LLILZIL;
        if (image != null && interfaceC1761670vwb != null) {
            C1406590mht.LIZ().LIZ(interfaceC1761670vwb.jf2(), new C1406890miN(interfaceC1761670vwb.iH1(Integer.valueOf(interfaceC1761670vwb.Tg2())), i3, list2, i4));
        }
    }
}
