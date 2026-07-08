package com.bytedance.applog.priority;

import X.C786410Ut5;
import X.InterfaceC2190741Aoa;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class NativeLazyString {
    public final InterfaceC2190741Aoa<JSONObject> loader;

    public String getValue() {
        return C786410Ut5.J3(this.loader.load());
    }

    public NativeLazyString(InterfaceC2190741Aoa<JSONObject> interfaceC2190741Aoa) {
        this.loader = interfaceC2190741Aoa;
    }
}
