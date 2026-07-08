package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OSPBottomNotice {

    @C09CT("arguments")
    public Map<String, String> arguments;

    @C09CT("text")
    public String text;

    public OSPBottomNotice() {
    }

    public OSPBottomNotice(String str, Map<String, String> map) {
        this.text = str;
        this.arguments = map;
    }
}
