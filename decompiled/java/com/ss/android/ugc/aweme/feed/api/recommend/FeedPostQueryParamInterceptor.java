package com.ss.android.ugc.aweme.feed.api.recommend;

import X.C080U;
import X.C0X12;
import X.C0X52;
import X.C0XIR;
import X.C0XLJ;
import X.C0XLK;
import X.C0XLL;
import X.C0XMB;
import X.C1494590ozp;
import X.C1494850p0F;
import X.C2089008Gi;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class FeedPostQueryParamInterceptor implements InterfaceC1904907d9 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Object extraInfo;
        String str;
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        C1494850p0F c1494850p0F = null;
        if (request != null) {
            extraInfo = request.getExtraInfo();
        } else {
            extraInfo = null;
        }
        if (C0XLJ.LIZ(request) && (extraInfo instanceof C0XLK)) {
            C0XMB c0xmbNewBuilder = request.newBuilder();
            C0XLK c0xlk = (C0XLK) extraInfo;
            C0XLL c0xll = c0xlk.LJJI;
            ArrayList arrayList = new ArrayList(request.getHeaders());
            arrayList.addAll(c0xll.LIZLLL.LIZIZ());
            C2089008Gi c2089008Gi = new C2089008Gi(request.getUrl());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str2 : c0xll.LIZJ) {
                String strLIZJ = c0xll.LIZIZ.LIZJ(str2);
                if (strLIZJ != null) {
                    linkedHashMap.put(str2, strLIZJ);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c2089008Gi.LIZLLL((String) entry.getKey(), (String) entry.getValue());
            }
            c0xmbNewBuilder.LIZJ(c2089008Gi.LJ());
            c0xmbNewBuilder.LIZJ = arrayList;
            C0X52<?> c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(c0xmbNewBuilder.LIZ());
            T t = c0x52LIZ.LIZIZ;
            List<C080U> list = c0x52LIZ.LIZ.LIZLLL;
            if (t instanceof C0X12) {
                C0X12 c0x12 = (C0X12) t;
                if (TextUtils.isEmpty(c0x12.getRequestId())) {
                    if (list != null) {
                        for (C080U c080u : list) {
                            if (u.LJIJI("X-TT-LOGID", c080u.LIZ, true)) {
                                str = c080u.LIZIZ;
                                break;
                            }
                        }
                        str = null;
                        c0x12.setRequestId(str);
                    } else {
                        str = null;
                        c0x12.setRequestId(str);
                    }
                }
            }
            Object obj = c0x52LIZ.LIZ.LJFF;
            if (obj instanceof C1494850p0F) {
                c1494850p0F = (C1494850p0F) obj;
            }
            c0xlk.LJJIFFI = c1494850p0F;
            if (t instanceof FeedItemList) {
                FeedItemList feedItemList = (FeedItemList) t;
                if (feedItemList.status_code != 0) {
                    throw new C0XIR(feedItemList.status_code);
                }
            }
            return c0x52LIZ;
        }
        return ((C1494590ozp) interfaceC841770X0l).LIZ(request);
    }
}
