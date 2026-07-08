package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.bottombar;

import X.C1173300gdc;
import X.C1174850gg7;
import X.C1183240gte;
import X.C1183250gtf;
import X.C1184490gvf;
import X.C13LE;
import X.C723850SaN;
import X.C786410Ut5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBottomButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS115S0400000_18;
import kotlin.jvm.internal.AwS52S0500000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureBottomBarAssem extends BaseSlashContentAssemComponent<PoiRecommendFeatureBottomBarModule> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        C1183250gtf c1183250gtf;
        C1183240gte c1183240gte;
        List<PoiButton> list;
        PoiRecommendFeatureBottomBarModule poiRecommendFeatureBottomBarModule = (PoiRecommendFeatureBottomBarModule) baseComponentData;
        super.CG1(poiRecommendFeatureBottomBarModule);
        C723850SaN.LJII(this, C13LE.LIZ(PoiRecommendFeatureBottomBarFavAssem.class), null);
        C723850SaN.LJII(this, C13LE.LIZ(PoiRecommendFeatureBottomBarShareAssem.class), null);
        C786410Ut5.LJLLLLLL(8, LJJIJL().findViewById(R.id.r_z));
        C786410Ut5.LJLLLLLL(8, LJJIJL().findViewById(R.id.rae));
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ != null && (c1183250gtf = (C1183250gtf) c1173300gdcLJ.LIZ) != null && (c1183240gte = c1183250gtf.LIZ) != null) {
            C1184490gvf c1184490gvf = c1183240gte.shareParams;
            PoiBottomButtonGroup poiBottomButtonGroup = poiRecommendFeatureBottomBarModule.getPoiBottomButtonGroup();
            if (poiBottomButtonGroup != null && (list = poiBottomButtonGroup.buttonList) != null) {
                for (PoiButton poiButton : list) {
                    Integer num = poiButton.buttonType;
                    if (num != null) {
                        if (num.intValue() == 1) {
                            C786410Ut5.LJLLLLLL(0, LJJIJL().findViewById(R.id.r_z));
                            C723850SaN.LIZLLL(this, new AwS52S0500000_18(this, poiRecommendFeatureBottomBarModule, c1184490gvf, poiButton, c1183240gte, 0));
                        } else if (num.intValue() == 2) {
                            C786410Ut5.LJLLLLLL(0, LJJIJL().findViewById(R.id.rae));
                            C723850SaN.LIZLLL(this, new AwS115S0400000_18(this, poiRecommendFeatureBottomBarModule, c1184490gvf, poiButton, 0));
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(view.getContext());
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        C786410Ut5.Td(layoutInflaterNe, R.layout.e6n, viewGroup, true);
    }
}
