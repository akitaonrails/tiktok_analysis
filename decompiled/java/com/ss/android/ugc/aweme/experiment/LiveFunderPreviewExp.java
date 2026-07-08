package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C452501pT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveFunderPreviewExp {
    public static final int DEFAULT = 0;
    public static final LiveFunderPreviewExp INSTANCE = new LiveFunderPreviewExp();
    public static final C01GW userType$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(LSPassThroughRecordSizeConfig.DEFAULT));

    public final int getUserType() {
        return ((Number) userType$delegate.getValue()).intValue();
    }
}
