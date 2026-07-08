package com.bytedance.hybrid.spark.raven.debugtool;

import X.InterfaceC1161530gKd;
import android.content.Context;
import com.bytedance.lynx.hybrid.autoservice.IHybridInnerAutoService;

/* JADX INFO: loaded from: classes19.dex */
public interface IRavenVitalStatsViewProvider extends IHybridInnerAutoService {
    boolean enableRaveDebugTool();

    InterfaceC1161530gKd provideRavenVitalStatsView(Context context);

    void setEnableRaveDebugTool(boolean z);
}
