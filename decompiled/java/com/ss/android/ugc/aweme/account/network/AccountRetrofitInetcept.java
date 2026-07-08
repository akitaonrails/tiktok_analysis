package com.ss.android.ugc.aweme.account.network;

import X.C0W8M;
import X.C0WOT;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.retrofit2.client.Request;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountRetrofitInetcept implements InterfaceC1904907d9 {
    public static final AccountRetrofitInetcept LL = new AccountRetrofitInetcept();
    public static String LLILLJJLI;

    static {
        PatternProtector.compile(".*/passport/.*");
        LLILLJJLI = "";
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String str;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        if (!C0W8M.LIZJ("AccountRetrofitInetcept", c1494590ozp.LIZJ.getUrl())) {
            return c1494590ozp.LIZ(c1494590ozp.LIZJ);
        }
        Request request = c1494590ozp.LIZJ;
        String url = request.getUrl();
        if (a0.LJJIIZI(url, "?", false)) {
            str = url + "&support_webview=1";
        } else {
            str = url + "?support_webview=1";
        }
        if (!TextUtils.isEmpty(LLILLJJLI)) {
            str = str + "&interstitial_token=" + LLILLJJLI;
        }
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ(str);
        Request requestLIZ = c0xmbNewBuilder.LIZ();
        C0WOT.LIZ(requestLIZ, c1494590ozp.LIZJ, "AccountRetrofitInetcept");
        return c1494590ozp.LIZ(requestLIZ);
    }
}
