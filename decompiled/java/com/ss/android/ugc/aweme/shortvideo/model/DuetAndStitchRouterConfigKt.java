package com.ss.android.ugc.aweme.shortvideo.model;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final class DuetAndStitchRouterConfigKt {
    public static final void mobIsEcommerce(DuetAndStitchRouterConfig duetAndStitchRouterConfig, Function1<? super String, Unit> function1) {
        String str;
        if (duetAndStitchRouterConfig != null) {
            if (duetAndStitchRouterConfig.isEcommerce) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            function1.invoke(str);
        }
    }
}
