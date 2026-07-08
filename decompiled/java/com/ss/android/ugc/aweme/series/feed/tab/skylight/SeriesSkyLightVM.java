package com.ss.android.ugc.aweme.series.feed.tab.skylight;

import X.C1577250r99;
import X.C1579520rCo;
import X.EnumC1579440rCg;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSeriesSkyLightVM;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesSkyLightVM extends BaseSeriesSkyLightVM {
    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSeriesSkyLightVM
    public final SeriesFeedRepository wQ2() {
        return SeriesFeedRepository.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSeriesSkyLightVM
    public final C1577250r99 xQ2() {
        return C1577250r99.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSeriesSkyLightVM
    public final boolean vQ2(C1579520rCo c1579520rCo) {
        EnumC1579440rCg enumC1579440rCg = c1579520rCo.LIZIZ;
        EnumC1579440rCg enumC1579440rCg2 = EnumC1579440rCg.FIRST_SHOW;
        if (enumC1579440rCg == enumC1579440rCg2) {
            if (enumC1579440rCg == enumC1579440rCg2) {
                SeriesFeedRepository.LIZ.getClass();
                if (!SeriesFeedRepository.LIZIZ) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
