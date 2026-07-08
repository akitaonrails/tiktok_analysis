package com.bytedance.hybrid.spark.autoservice;

import X.InterfaceC1541990qEH;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.autoservice.IHybridInnerAutoService;

/* JADX INFO: loaded from: classes24.dex */
public interface ISparkInnerPIA extends IHybridInnerAutoService {
    void initGlobal(Context context);

    boolean isPia(String str);

    void onPostKitCreated(InterfaceC1541990qEH interfaceC1541990qEH);

    void warmup(SparkContext sparkContext, Context context);
}
