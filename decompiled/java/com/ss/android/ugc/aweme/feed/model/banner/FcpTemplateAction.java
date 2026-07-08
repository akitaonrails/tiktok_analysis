package com.ss.android.ugc.aweme.feed.model.banner;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class FcpTemplateAction implements Serializable {
    public transient List<TaskFilter> filters;

    @C09CT("next")
    public List<FcpTemplateAction> next;

    @C09CT("params")
    public String params;
    public transient C01GW paramsMap$delegate;

    @C09CT("type")
    public String type;

    public FcpTemplateAction() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpTemplateAction(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(", next=");
        sbLIZ.append(this.next);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<String, Object> getParamsMap() {
        return (Map) this.paramsMap$delegate.getValue();
    }

    public final void prepare() {
        getParamsMap();
        List<TaskFilter> list = this.filters;
        if (list != null) {
            Iterator<TaskFilter> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().prepare();
            }
        }
        List<FcpTemplateAction> list2 = this.next;
        if (list2 != null) {
            Iterator<FcpTemplateAction> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().prepare();
            }
        }
    }

    public FcpTemplateAction(String str, String str2, List<FcpTemplateAction> list) {
        this.type = str;
        this.params = str2;
        this.next = list;
        this.paramsMap$delegate = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1494));
    }
}
