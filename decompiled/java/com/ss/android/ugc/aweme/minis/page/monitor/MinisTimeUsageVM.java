package com.ss.android.ugc.aweme.minis.page.monitor;

import X.C01GW;
import X.C01OJ;
import X.C1A7Z;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class MinisTimeUsageVM extends AssemViewModel<C1A7Z> {
    public Function0<String> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(397));
    public final List<Pair<Long, Long>> LLILZIL = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.1A7Z
        };
    }

    public final void vQ2() {
        String strInvoke;
        MinisConfigSettings.UsageTimeThresholdValue usageTimeThresholdValue;
        long jCurrentTimeMillis = 0;
        for (Pair pair : (ArrayList) this.LLILZIL) {
            jCurrentTimeMillis += (((Number) pair.getSecond()).longValue() == 0 ? System.currentTimeMillis() : ((Number) pair.getSecond()).longValue()) - ((Number) pair.getFirst()).longValue();
        }
        long j = (jCurrentTimeMillis + ((long) 500)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        Function0<String> function0 = this.LLILLJJLI;
        if (function0 == null || (strInvoke = function0.invoke()) == null || !((MinisConfigSettings.UsageTimeThreshold) this.LL.getValue()).enabled || (usageTimeThresholdValue = ((MinisConfigSettings.UsageTimeThreshold) this.LL.getValue()).miniGame) == null) {
            return;
        }
        Long l = usageTimeThresholdValue.min;
        if (l == null || j >= l.longValue()) {
            Long l2 = usageTimeThresholdValue.max;
            if (l2 == null || j <= l2.longValue()) {
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C01OJ(j, strInvoke, null), 3);
            }
        }
    }
}
