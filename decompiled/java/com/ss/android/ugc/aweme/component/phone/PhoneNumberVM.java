package com.ss.android.ugc.aweme.component.phone;

import X.C099R;
import X.C0PEM;
import X.C0TUO;
import X.C1411320mpW;
import X.C1559260qg8;
import X.C1716310ulR;
import X.C1717910uo1;
import X.C1717920uo2;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C23250099c;
import X.EnumC1717850unv;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PhoneRule;
import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS140S1100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PhoneNumberVM extends AssemViewModel<C1717920uo2> {
    public String LLILLJJLI;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1717910uo1.class, (Class<Object>) "phone_number_data", (String) 13), true);
    public String LLILLL = "";
    public final ArrayList<RegionMobileCodeItem> LLILZ = new ArrayList<>();
    public String LLILZIL = "";
    public ArrayList<PhoneRule> LLILZLL = new ArrayList<>();
    public String LLJIJIL = "manual";
    public String LLJILJIL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1717920uo2(C0TUO.EDIT, null, null, false, EnumC1717850unv.NOT_START, null, null, null, 0, null);
    }

    public final C1717910uo1 xQ2() {
        return (C1717910uo1) this.LL.getValue();
    }

    public final String wQ2() {
        String str = xQ2().LLIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1346339041) {
            return iHashCode != -785523403 ? (iHashCode == -619271790 && str.equals("reset_mobile")) ? "phone_number_change" : "bnpl_activate_phone_number" : str.equals("direct_set_mobile") ? "phone_number_set" : "bnpl_activate_phone_number";
        }
        str.equals("set_mobile");
        return "bnpl_activate_phone_number";
    }

    public final void CQ2(String str) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, xQ2().LLILLL), new Pair("busi_type", xQ2().LLILLL), new Pair("popup_id", str));
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        String str2 = xQ2().LLILZLL;
        c1716310ulR.getClass();
        mapLJIIJ.putAll(C1716310ulR.LIZ(str2));
        C1716310ulR.LIZJ("fp_sdk_bnpl_popup_show", wQ2(), xQ2().LL, mapLJIIJ);
    }

    public final void onEventShow(Map<String, String> map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("interface_return_cost", CardStruct.IStatusCode.DEFAULT), new Pair(Scene.SCENE_SERVICE, xQ2().LLILLL), new Pair("busi_type", xQ2().LLILLL));
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        String str = xQ2().LLILZLL;
        c1716310ulR.getClass();
        mapLJIIJ.putAll(C1716310ulR.LIZ(str));
        C1716310ulR.LIZJ("fp_sdk_bnpl_phone_number_show", wQ2(), xQ2().LL, mapLJIIJ);
    }

    public final void BQ2(String str, String str2) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, xQ2().LLILLL), new Pair("busi_type", xQ2().LLILLL), new Pair("popup_id", str), new Pair("obj_id", "got_it"));
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        String str3 = xQ2().LLILZLL;
        c1716310ulR.getClass();
        mapLJIIJ.putAll(C1716310ulR.LIZ(str3));
        C1716310ulR.LIZJ("fp_sdk_bnpl_popup_click", wQ2(), xQ2().LL, mapLJIIJ);
    }

    public final void zQ2(String str, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("obj_id", str);
        pairArr[1] = new Pair("before_phone_region", this.LLJILJIL);
        String str2 = this.LLILLL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("after_phone_region", str2);
        pairArr[3] = new Pair("click_use_time", String.valueOf(jCurrentTimeMillis));
        pairArr[4] = new Pair(Scene.SCENE_SERVICE, xQ2().LLILLL);
        pairArr[5] = new Pair("if_filled", String.valueOf(this.LLIZLLLIL ? 1 : 0));
        String str4 = this.LLILLL;
        if (str4 != null) {
            str3 = str4;
        }
        pairArr[6] = new Pair("phone_country", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(map);
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        String str5 = xQ2().LLILZLL;
        c1716310ulR.getClass();
        mapLJIIJ.putAll(C1716310ulR.LIZ(str5));
        C1716310ulR.LIZJ("fp_sdk_bnpl_phone_number_click", wQ2(), xQ2().LL, mapLJIIJ);
    }

    public final void AQ2(String str, String str2, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("obj_id", "phone_number"), new Pair("finish_timestamp", String.valueOf(jCurrentTimeMillis)), new Pair("duration", String.valueOf(jCurrentTimeMillis - this.LLIZ)), new Pair(Scene.SCENE_SERVICE, xQ2().LLILLL));
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        String str3 = xQ2().LLILZLL;
        c1716310ulR.getClass();
        mapLJIIJ.putAll(C1716310ulR.LIZ(str3));
        mapLJIIJ.put("fill_type", this.LLJIJIL);
        if (str != null) {
            mapLJIIJ.put("error_code", str);
        }
        if (str2 != null) {
            mapLJIIJ.put("error_msg", str2);
        }
        C1716310ulR.LIZJ("fp_sdk_bnpl_phone_number_fillin", wQ2(), xQ2().LL, mapLJIIJ);
    }

    public final void vQ2(String str, String str2, boolean z) {
        if (z) {
            this.LLJILJIL = str2;
        }
        this.LLILZIL = str;
        this.LLILLL = str2;
        for (RegionMobileCodeItem regionMobileCodeItem : this.LLILZ) {
            if (TextUtils.equals(regionMobileCodeItem.getAlpha2(), str2) && TextUtils.equals(str, regionMobileCodeItem.getMobileCode())) {
                this.LLILZLL = regionMobileCodeItem.getMobileRuleList();
            }
        }
        withState(new AwS140S1100000_26(this, str, 5));
    }

    public final Object yQ2(String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C1411320mpW(this, str, str2, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
