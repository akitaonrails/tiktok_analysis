package com.ss.android.ugc.aweme.ad.feed.adexperience.event;

import X.AbstractC1023470cjx;
import X.C1019660cdo;
import X.C1023630ckD;
import com.ss.android.ugc.aweme.ad.feed.adexperience.IAdExperienceEventLogger;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdExperienceEventLogger extends AbstractC1023470cjx implements IAdExperienceEventLogger {
    public final C1023630ckD<?>[] LIZ;

    public AdExperienceEventLogger() {
        this(new Object[]{null});
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public AdExperienceEventLogger(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C1019660cdo.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1019660cdo.LIZIZ, AFwS252S0000000_16.get$arr$(78))};
    }
}
