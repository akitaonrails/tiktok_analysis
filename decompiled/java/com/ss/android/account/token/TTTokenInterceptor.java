package com.ss.android.account.token;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C20667087t;
import X.C2175508fh;
import X.C847400XMc;
import X.C847530XMp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class TTTokenInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) throws JSONException {
        ArrayList arrayList;
        Map<String, String> map;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(request.getHeaders());
        C847530XMp c847530XMpLIZIZ = C847400XMc.LIZIZ(request.getUrl(), arrayList2);
        if (c847530XMpLIZIZ != null && (map = c847530XMpLIZIZ.LIZ) != null) {
            HashMap map2 = (HashMap) map;
            if (!map2.isEmpty()) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        arrayList2.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
            }
        }
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ = arrayList2;
        C0X52 c0x52LIZ = c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
        String url = request.getUrl();
        C2175508fh c2175508fh = c0x52LIZ.LIZ;
        List<C080U> list = c2175508fh.LIZLLL;
        if (list != null && !list.isEmpty()) {
            arrayList = new ArrayList();
            for (C080U c080u : list) {
                if (c080u != null && !TextUtils.isEmpty(c080u.LIZ) && !TextUtils.isEmpty(c080u.LIZIZ)) {
                    arrayList.add(new C20667087t(c080u.LIZ, c080u.LIZIZ));
                }
            }
        } else {
            arrayList = null;
        }
        C847400XMc.LJIIL(url, c847530XMpLIZIZ, c2175508fh, arrayList);
        return c0x52LIZ;
    }
}
