package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EnterRegionMatch {

    @C09CT("allow_list")
    public List<String> allowList;

    @C09CT("deny_list")
    public List<String> denyList;

    @C09CT("type")
    public Long type;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        List<String> list = this.allowList;
        if (list != null && !list.isEmpty()) {
            sb.append(", allow_list=");
            sb.append(this.allowList);
        }
        List<String> list2 = this.denyList;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", deny_list=");
            sb.append(this.denyList);
        }
        sb.replace(0, 2, "EnterRegionMatch{");
        sb.append('}');
        return sb.toString();
    }
}
