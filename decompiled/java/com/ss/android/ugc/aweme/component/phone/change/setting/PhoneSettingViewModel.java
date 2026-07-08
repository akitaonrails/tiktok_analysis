package com.ss.android.ugc.aweme.component.phone.change.setting;

import X.C0PEM;
import X.C1559260qg8;
import X.C1716310ulR;
import X.C1717230umv;
import X.C1717590unV;
import X.C1717600unW;
import X.C1717630unZ;
import X.C1717740unk;
import X.C1717770unn;
import X.C2097608Jq;
import X.C23250099c;
import X.C723600SZy;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.component.phone.PhoneApi;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PhoneSettingViewModel extends AssemViewModel<C1717630unZ> {
    public PhoneApi LL;
    public C1717230umv LLILLJJLI;
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C1717230umv.class, "SOURCE_DATA"), true);
    public long LLILZ;
    public long LLILZIL;
    public C1717740unk LLILZLL;

    public final void AQ2() {
        if (this.LL == null) {
            return;
        }
        setState(AFwS268S0000000_26.get$arr$(113));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1717590unV(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1717630unZ(0);
    }

    public final Map<String, String> wQ2() {
        C1717740unk c1717740unk;
        String str;
        C1717740unk c1717740unk2;
        String str2;
        String str3;
        C1717740unk c1717740unk3;
        String str4;
        String str5;
        Pair[] pairArr = new Pair[9];
        C1717230umv c1717230umvXQ2 = xQ2();
        String str6 = "";
        if ((c1717230umvXQ2 == null || (str = c1717230umvXQ2.LLILLJJLI) == null) && ((c1717740unk = this.LLILZLL) == null || (str = c1717740unk.LIZJ) == null)) {
            str = "";
        }
        pairArr[0] = new Pair("merchant_id", str);
        C1717230umv c1717230umvXQ22 = xQ2();
        if ((c1717230umvXQ22 == null || (str2 = c1717230umvXQ22.LLILLL) == null) && ((c1717740unk2 = this.LLILZLL) == null || (str2 = c1717740unk2.LIZLLL) == null)) {
            str2 = "";
        }
        pairArr[1] = new Pair("merchant_user_id", str2);
        pairArr[2] = new Pair("country", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        pairArr[3] = new Pair("prority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        C1717230umv c1717230umvXQ23 = xQ2();
        if (c1717230umvXQ23 == null || (str3 = c1717230umvXQ23.LL) == null) {
            C1717740unk c1717740unk4 = this.LLILZLL;
            str3 = c1717740unk4 != null ? c1717740unk4.LIZ : "";
        }
        pairArr[4] = new Pair("busi_type", str3);
        pairArr[5] = new Pair("timestamp", String.valueOf(System.currentTimeMillis()));
        pairArr[6] = new Pair("page_id", "phone_number_page");
        C1717230umv c1717230umvXQ24 = xQ2();
        if ((c1717230umvXQ24 == null || (str4 = c1717230umvXQ24.LLILZLL) == null) && ((c1717740unk3 = this.LLILZLL) == null || (str4 = c1717740unk3.LIZIZ) == null)) {
            str4 = "";
        }
        pairArr[7] = new Pair("source_id", str4);
        C1717230umv c1717230umvXQ25 = xQ2();
        if (c1717230umvXQ25 != null && (str5 = c1717230umvXQ25.LLIZ) != null) {
            str6 = str5;
        }
        pairArr[8] = new Pair("previous_page_id", str6);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public final C1717230umv xQ2() {
        return (C1717230umv) this.LLILLL.getValue();
    }

    public final void onEventPageClick(String str) {
        Map<String, String> mapWQ2 = wQ2();
        mapWQ2.put("obj_id", str);
        mapWQ2.put("click_use_time", String.valueOf(System.currentTimeMillis() - this.LLILZ));
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> mapWQ22 = wQ2();
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("fp_sdk_phone_number_page_click", mapWQ22);
    }

    public final void onEventVerifyClick(String str) {
        Map<String, String> mapWQ2 = wQ2();
        mapWQ2.put("page_id", "phone_number_change");
        mapWQ2.put("previousPageId", "phone_number_page");
        mapWQ2.put("obj_id", str);
        mapWQ2.put("click_use_time", String.valueOf(System.currentTimeMillis() - this.LLILZIL));
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> mapWQ22 = wQ2();
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("fp_sdk_phone_number_change_verify_click", mapWQ22);
    }

    public final void zQ2(String str) {
        String str2;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("popup_id", str));
        mapLJIIJ.putAll(wQ2());
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        C1717230umv c1717230umvXQ2 = xQ2();
        if (c1717230umvXQ2 == null || (str2 = c1717230umvXQ2.LLIZ) == null) {
            str2 = "";
        }
        c1716310ulR.getClass();
        C1716310ulR.LIZJ("fp_sdk_bnpl_popup_show", "phone_number_page", str2, mapLJIIJ);
    }

    public final void vQ2(String str, String str2) {
        setState(AFwS268S0000000_26.get$arr$(112));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1717600unW(this, str, str2, null), 2);
    }

    public final void yQ2(String str, String str2) {
        String str3;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("popup_id", str), new Pair("obj_id", str2));
        mapLJIIJ.putAll(wQ2());
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        C1717230umv c1717230umvXQ2 = xQ2();
        if (c1717230umvXQ2 == null || (str3 = c1717230umvXQ2.LLIZ) == null) {
            str3 = "";
        }
        c1716310ulR.getClass();
        C1716310ulR.LIZJ("fp_sdk_bnpl_popup_click", "phone_number_page", str3, mapLJIIJ);
    }
}
