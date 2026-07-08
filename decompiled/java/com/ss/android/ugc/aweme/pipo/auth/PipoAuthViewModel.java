package com.ss.android.ugc.aweme.pipo.auth;

import X.C1559260qg8;
import X.C1723260uwe;
import X.C1723270uwf;
import X.C1905707dH;
import X.C723600SZy;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoAuthViewModel extends AssemViewModel<C1723270uwf> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1723260uwe.class, "HIERARCHY_KEY_PIPO_AUTH"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1723270uwf(null, null, null, null);
    }

    public final C1723260uwe wQ2() {
        return (C1723260uwe) this.LL.getValue();
    }

    public static void vQ2(PipoAuthViewModel pipoAuthViewModel, int i, Integer num, String str, Throwable th, int i2) {
        String message;
        String str2;
        long jCurrentTimeMillis;
        String str3;
        String str4;
        String str5;
        String str6;
        Map<String, String> map;
        String str7;
        if ((i2 & 2) != 0) {
            num = 0;
        }
        String str8 = "";
        if ((i2 & 4) != 0) {
            str = "";
        }
        if ((i2 & 8) != 0) {
            th = null;
        }
        pipoAuthViewModel.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("success", String.valueOf(i));
        linkedHashMap.put("error_type", String.valueOf(num));
        if (th == null || (message = th.getMessage()) == null) {
            message = "get_exception";
        }
        linkedHashMap.put("error_msg", message);
        C1723260uwe c1723260uweWQ2 = pipoAuthViewModel.wQ2();
        if (c1723260uweWQ2 == null || (str2 = c1723260uweWQ2.LL) == null) {
            str2 = "";
        }
        linkedHashMap.put("schema", str2);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C1723260uwe c1723260uweWQ22 = pipoAuthViewModel.wQ2();
        if (c1723260uweWQ22 != null) {
            jCurrentTimeMillis = c1723260uweWQ22.LLJ;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        linkedHashMap.put("duration", String.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
        linkedHashMap.put("logId", String.valueOf(str));
        C1723260uwe c1723260uweWQ23 = pipoAuthViewModel.wQ2();
        if (c1723260uweWQ23 != null && c1723260uweWQ23.LLIZLLLIL) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("use_native_priority_region", str3);
        C1723260uwe c1723260uweWQ24 = pipoAuthViewModel.wQ2();
        if (c1723260uweWQ24 == null || (str4 = c1723260uweWQ24.LLILZ) == null) {
            str4 = "";
        }
        linkedHashMap.put("merchant_id", str4);
        C1723260uwe c1723260uweWQ25 = pipoAuthViewModel.wQ2();
        if (c1723260uweWQ25 == null || (str5 = c1723260uweWQ25.LLILZIL) == null) {
            str5 = "";
        }
        linkedHashMap.put("auth_type", str5);
        C1723260uwe c1723260uweWQ26 = pipoAuthViewModel.wQ2();
        if (c1723260uweWQ26 == null || (str6 = c1723260uweWQ26.LLILZLL) == null) {
            str6 = "";
        }
        linkedHashMap.put("login_scene", str6);
        C1723260uwe c1723260uweWQ27 = pipoAuthViewModel.wQ2();
        if (c1723260uweWQ27 != null && (str7 = c1723260uweWQ27.LLIZ) != null) {
            str8 = str7;
        }
        linkedHashMap.put("country", str8);
        C1723260uwe c1723260uweWQ28 = pipoAuthViewModel.wQ2();
        if (c1723260uweWQ28 != null && (map = c1723260uweWQ28.LLJI) != null) {
            linkedHashMap.putAll(map);
        }
        C1905707dH.LIZ("rd_pipo_auth_login", linkedHashMap);
    }
}
