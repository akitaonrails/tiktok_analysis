package com.ss.android.ugc.aweme.servicimpl;

import X.C01GW;
import X.C452501pT;
import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAutoCutService;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoCutServiceImpl implements IAutoCutService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(652));

    @Override // com.ss.android.ugc.aweme.IAutoCutService
    public final Set<Class<? extends Activity>> LIZ() {
        return Collections.singleton(SAAActivity.class);
    }

    @Override // com.ss.android.ugc.aweme.IAutoCutService
    public final long LIZIZ() {
        return ((Keva) this.LIZ.getValue()).getLong("last_auto_cut_use_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.IAutoCutService
    public final void LIZJ(long j) {
        ((Keva) this.LIZ.getValue()).storeLong("last_auto_cut_use_time", j);
    }
}
