package com.bytedance.hybrid.spark.security.impl.service;

import X.C1544870qIv;
import X.C1544930qJ1;
import X.C1544980qJ6;
import X.C1545000qJ8;
import X.C828220WeK;
import X.EnumC1544890qIx;
import X.InterfaceC842120X1u;
import android.webkit.WebResourceResponse;
import java.util.Collections;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: loaded from: classes24.dex */
public final class InlineJsInjectServiceTool implements InterfaceC842120X1u {
    public String getBid() {
        return "inline_js_inject";
    }

    @Override // X.InterfaceC1075470e5p
    public void onRegister(String str) {
    }

    @Override // X.InterfaceC1075470e5p
    public void onUnRegister() {
    }

    @Override // X.InterfaceC842120X1u
    public void inject(int i, long j, String str, String str2, String str3, boolean z, WebResourceResponse webResourceResponse) throws JSONException {
        Integer num;
        C1544870qIv c1544870qIv = new C1544870qIv(j);
        C1545000qJ8 c1545000qJ8 = c1544870qIv.LJI;
        boolean z2 = false;
        Integer num2 = 0;
        if (z) {
            num = num2;
        } else {
            num = 1;
        }
        c1545000qJ8.LIZIZ = num;
        C1545000qJ8 c1545000qJ82 = c1544870qIv.LJI;
        if (!z) {
            num2 = 1;
        }
        c1545000qJ82.LIZJ = num2;
        C1544980qJ6 c1544980qJ6 = c1544870qIv.LIZJ;
        c1544980qJ6.LIZLLL = str3;
        c1544980qJ6.LJ = str2;
        c1544980qJ6.LIZIZ = EnumC1544890qIx.VERY_BEGINNING;
        c1544980qJ6.LIZ = "ajax_js";
        Pair pairLIZLLL = C828220WeK.LIZLLL(webResourceResponse);
        boolean zBooleanValue = ((Boolean) pairLIZLLL.getFirst()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pairLIZLLL.getSecond()).booleanValue();
        if (zBooleanValue) {
            c1544870qIv.LJFF.LJFF = 1;
        }
        C1544930qJ1 c1544930qJ1 = c1544870qIv.LJFF;
        if (!zBooleanValue2 || C828220WeK.LJ(webResourceResponse) || C828220WeK.LIZIZ(webResourceResponse, Collections.singletonList(str), Collections.singleton(c1544870qIv))) {
            z2 = true;
        }
        c1544930qJ1.LJII = z2;
        C1544930qJ1 c1544930qJ12 = c1544870qIv.LJFF;
        c1544930qJ12.LJI = 1;
        c1544930qJ12.LIZLLL = 1;
        c1544930qJ12.LJIIJ = true;
        c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - j);
        c1544870qIv.LIZ(i, true, "js_inject_manage_client_inline_main", null, null, null);
    }
}
