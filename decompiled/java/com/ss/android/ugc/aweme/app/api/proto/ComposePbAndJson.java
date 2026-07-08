package com.ss.android.ugc.aweme.app.api.proto;

import X.C09CT;
import X.C0X12;
import X.C0XPK;
import X.C1516280pYo;
import X.C1516490pZ9;
import X.InterfaceC1487280oo2;
import X.InterfaceC1516270pYn;
import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.feed.model.HttpDnsResult;
import com.ss.android.ugc.aweme.feed.model.MediaBasicInfo;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class ComposePbAndJson<P extends Message, J> implements C0X12, C0XPK {
    public final J LL;
    public final P LLILLJJLI;
    public transient Long LLILLL;

    @C09CT("rid")
    public String requestId;

    @Override // X.C0X12
    public final String getRequestId() {
        return this.requestId;
    }

    public static ComposePbAndJson LIZ(Object obj) {
        return new ComposePbAndJson(obj, null);
    }

    public static <T extends Message> ComposePbAndJson LIZIZ(T t) {
        return new ComposePbAndJson(null, t);
    }

    public final J LIZJ(InterfaceC1487280oo2<P, J> interfaceC1487280oo2) {
        List<HttpDnsResult> list;
        J jApply = this.LL;
        if (jApply == null) {
            jApply = interfaceC1487280oo2.apply(this.LLILLJJLI);
        }
        if (jApply instanceof C0X12) {
            ((C0X12) jApply).setRequestId(this.requestId);
        }
        if (jApply instanceof InterfaceC1516270pYn) {
            C1516490pZ9 value = C1516490pZ9.LIZIZ.getValue();
            MediaBasicInfo mediaBasicInfo = ((InterfaceC1516270pYn) jApply).getMediaBasicInfo();
            value.getClass();
            if (mediaBasicInfo != null && (list = mediaBasicInfo.httpDnsResultList) != null && (!list.isEmpty())) {
                value.LIZ.clear();
                for (HttpDnsResult httpDnsResult : list) {
                    String str = httpDnsResult.domain;
                    if (str != null) {
                        value.LIZ.put(str, new C1516280pYo(httpDnsResult.ipList, httpDnsResult.validTime));
                    }
                }
            }
        }
        if (jApply instanceof C0XPK) {
            ((C0XPK) jApply).setNetworkInfoKey(this.LLILLL);
        }
        return jApply;
    }

    @Override // X.C0XPK
    public final void setNetworkInfoKey(Long l) {
        this.LLILLL = l;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public ComposePbAndJson(J j, P p) {
        if (j == null && p == null) {
            throw new IllegalArgumentException("wrong args");
        }
        this.LL = j;
        this.LLILLJJLI = p;
    }
}
