package com.bytedance.ies.xbridge.base.runtime.depend;

import X.AbstractC1059760dgU;
import X.C1059860dge;
import X.EnumC1059790dgX;
import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface IHostRouterDepend {
    boolean closeView(C1059860dge c1059860dge, EnumC1059790dgX enumC1059790dgX, String str, boolean z);

    boolean openSchema(C1059860dge c1059860dge, String str, Map<String, ? extends Object> map, EnumC1059790dgX enumC1059790dgX, Context context);

    AbstractC1059760dgU provideRouteOpenExceptionHandler(C1059860dge c1059860dge);

    List<AbstractC1059760dgU> provideRouteOpenHandlerList(C1059860dge c1059860dge);
}
