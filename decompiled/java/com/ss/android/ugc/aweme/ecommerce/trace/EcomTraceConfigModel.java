package com.ss.android.ugc.aweme.ecommerce.trace;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class EcomTraceConfigModel {

    @C09CT("debug")
    public final boolean debug;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("hippo")
    public final EcomTraceConfigHippoModel hippo;

    @C09CT("log")
    public final boolean log;

    @C09CT("delay_end")
    public final long delayEnd = 20000;

    @C09CT("native_routes")
    public final List<EcomNativeTraceRoute> nativeRoutes = C13BV.INSTANCE;
}
