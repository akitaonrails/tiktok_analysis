package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class IssueCategory {

    @C09CT("category")
    public String category;

    @C09CT("issues")
    public List<String> issues;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.category != null) {
            sb.append(", category=");
            sb.append(this.category);
        }
        List<String> list = this.issues;
        if (list != null && !list.isEmpty()) {
            sb.append(", issues=");
            sb.append(this.issues);
        }
        sb.replace(0, 2, "IssueCategory{");
        sb.append('}');
        return sb.toString();
    }
}
