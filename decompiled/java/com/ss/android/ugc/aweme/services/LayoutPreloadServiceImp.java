package com.ss.android.ugc.aweme.services;

import X.C1647240sy2;
import X.C1697810uHb;
import X.C21146717pB;
import X.C280060AyK;
import X.C280080AyM;
import X.C524780Ki4;
import X.C786410Ut5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class LayoutPreloadServiceImp implements ILayoutPreloadService {
    public static final int $stable = 8;
    public boolean isPreloadLayoutConsumed = true;
    public final List<Integer> layoutListNeedPreload;
    public final List<Integer> layoutListNeedPreloadV2;

    public LayoutPreloadServiceImp() {
        Integer numValueOf = Integer.valueOf(R.layout.c9n);
        Integer numValueOf2 = Integer.valueOf(R.layout.eqp);
        Integer numValueOf3 = Integer.valueOf(R.layout.d93);
        Integer numValueOf4 = Integer.valueOf(R.layout.i97);
        Integer numValueOf5 = Integer.valueOf(R.layout.ftd);
        Integer numValueOf6 = Integer.valueOf(R.layout.d9y);
        this.layoutListNeedPreload = C1697810uHb.LJIIJJI(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6);
        this.layoutListNeedPreloadV2 = C1697810uHb.LJIIJJI(Integer.valueOf(R.layout.kn), numValueOf, numValueOf2, numValueOf3, Integer.valueOf(R.layout.i91), numValueOf4, numValueOf5, numValueOf6);
    }

    private final List<Integer> getLayoutListNeedPreload() {
        return C280080AyM.LIZ() ? this.layoutListNeedPreloadV2 : this.layoutListNeedPreload;
    }

    private final boolean isNeedPreloadLayout() {
        return !C280080AyM.LIZ() || this.isPreloadLayoutConsumed;
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService
    public void preloadLayoutFiles() {
        if (C280060AyK.LIZ() && isNeedPreloadLayout()) {
            this.isPreloadLayoutConsumed = false;
            Iterator<Integer> it2 = getLayoutListNeedPreload().iterator();
            while (it2.hasNext()) {
                C21146717pB.LIZJ(null, it2.next().intValue());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService
    public void preloadLayoutSerial() {
        if (C280060AyK.LIZ() && isNeedPreloadLayout()) {
            this.isPreloadLayoutConsumed = false;
            List<Integer> layoutListNeedPreload = getLayoutListNeedPreload();
            C21146717pB.LIZJ.getClass();
            C21146717pB.LJ(null, null, layoutListNeedPreload);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService
    public View loadLayoutFiles(String str, Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        View viewTd;
        boolean z2 = !C1647240sy2.LIZ().disableHighFreqPerfMob;
        if (z2) {
            C524780Ki4.LIZ.start("camera_preload_layout", "start");
        }
        if (C280060AyK.LIZ() && context != null) {
            this.isPreloadLayoutConsumed = true;
            viewTd = C21146717pB.LIZIZ(context, i, viewGroup, z);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, z);
        }
        if (z2) {
            C524780Ki4.LIZ.end("camera_preload_layout", "end");
        }
        return viewTd;
    }
}
