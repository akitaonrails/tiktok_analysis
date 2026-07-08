package com.ss.android.ugc.aweme.series.innerfeed.serviceimpl;

import X.C098200Yq;
import X.C1279104zV;
import X.C189200o6;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.series.profile.view.SeriesProfileFragment;
import com.ss.android.ugc.aweme.service.ISeriesProfileService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class SeriesProfileServiceImpl implements ISeriesProfileService {
    @Override // com.ss.android.ugc.aweme.service.ISeriesProfileService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesProfileService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesProfileService
    public final SeriesProfileFragment LIZIZ(C1279104zV c1279104zV) {
        SeriesProfileFragment seriesProfileFragment = new SeriesProfileFragment();
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("CreatorUid", c1279104zV.LIZ);
            bundle.putBoolean("EXTRA_IS_MY_PROFILE", c1279104zV.LIZIZ);
            bundle.putBoolean("EXTRA_IS_FROM_MAIN_STATE", c1279104zV.LIZJ);
            seriesProfileFragment.setArguments(bundle);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return seriesProfileFragment;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return seriesProfileFragment;
        }
    }
}
