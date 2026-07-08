package com.bytedance.ies.xbridge.base.runtime.depend;

import X.C1059860dge;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface IHostFrameworkDepend {
    void addObserverEvent(C1059860dge c1059860dge, String str, List<String> list, List<? extends JSONObject> list2);

    String getContainerID(C1059860dge c1059860dge);
}
