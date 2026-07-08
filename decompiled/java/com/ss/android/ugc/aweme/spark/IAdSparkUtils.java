package com.ss.android.ugc.aweme.spark;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public interface IAdSparkUtils {
    void LIZ(Context context, String str, Bundle bundle, String str2, boolean z, boolean z2, Aweme aweme, Object obj, Function1<? super Boolean, Unit> function1);

    AdSparkFragment LIZIZ(boolean z);

    AdSparkContext LIZJ(Context context, String str, Bundle bundle, Map<String, String> map, boolean z);

    void LIZLLL(SparkContext sparkContext, String str);

    void LJ(SparkContext sparkContext, Bundle bundle);
}
