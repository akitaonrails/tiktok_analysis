package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class FcpTemplateActionGroup implements Serializable {

    @C09CT("events")
    public List<FcpTemplateAction> events;

    @C09CT("key")
    public String key;

    @C09CT("timing_keys")
    public List<String> timings;

    public FcpTemplateActionGroup() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpTemplateActionGroup(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", timings=");
        sbLIZ.append(this.timings);
        sbLIZ.append(", events=");
        sbLIZ.append(this.events);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void prepare() {
        List<FcpTemplateAction> list = this.events;
        if (list != null) {
            Iterator<FcpTemplateAction> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().prepare();
            }
        }
    }

    public FcpTemplateActionGroup(String str, List<String> list, List<FcpTemplateAction> list2) {
        this.key = str;
        this.timings = list;
        this.events = list2;
    }
}
