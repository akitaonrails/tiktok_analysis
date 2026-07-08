package com.ss.android.ugc.aweme.poi.detail.container.bottom.stable;

import X.C1173300gdc;
import X.C1174850gg7;
import X.C1183770guV;
import X.C13LE;
import X.C337180DJs;
import X.C339190DRl;
import X.C723850SaN;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBaseBottomButtonsComponent;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailWriteReviewButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.share.PoiDetailShareButtonAssem;
import kotlin.jvm.internal.AwS70S0210000_18;
import kotlin.jvm.internal.AwS90S0110000_2;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiStableBottomBarComponent extends PoiBaseBottomButtonsComponent {
    public boolean LLJJ = true;

    @Override // com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBaseBottomButtonsComponent
    public final void Lo(PoiStableBottomBarModule poiStableBottomBarModule) {
        Object obj;
        PoiListApi.PoiDetailResponse poiDetailResponseGo = Go();
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ != null) {
            obj = c1173300gdcLJ.LIZ;
        } else {
            obj = null;
        }
        if (poiStableBottomBarModule.getWriteReviewEnable() && poiStableBottomBarModule.getShareInfo() != null && poiStableBottomBarModule.getServiceButton() != null && poiDetailResponseGo != null && obj != null) {
            this.LLJJ = false;
        }
        Oo(poiStableBottomBarModule, this.LLJJ);
        No(poiStableBottomBarModule, this.LLJJ);
        boolean z = this.LLJJ;
        if (poiStableBottomBarModule.getWriteReviewEnable()) {
            if (!poiStableBottomBarModule.getWriteReviewEnable()) {
                C723850SaN.LJII(this, C13LE.LIZ(PoiDetailWriteReviewButtonAssem.class), null);
                View view = this.LLJILJILJ;
                if (view != null) {
                    C339190DRl.LIZIZ(view);
                    return;
                }
                return;
            }
            View view2 = this.LLJILJILJ;
            if (view2 != null) {
                C337180DJs.LIZJ(view2);
            }
            C723850SaN.LIZLLL(this, new AwS70S0210000_18(this, z, poiStableBottomBarModule, 5));
            return;
        }
        if (poiStableBottomBarModule.getShareInfo() != null && C1183770guV.LIZ()) {
            View view3 = this.LLJILJILJ;
            if (view3 != null) {
                C337180DJs.LIZJ(view3);
            }
            C723850SaN.LIZLLL(this, new AwS90S0110000_2(this, z, 3));
            return;
        }
        View view4 = this.LLJILJILJ;
        if (view4 != null) {
            C339190DRl.LIZIZ(view4);
        }
        C723850SaN.LJII(this, C13LE.LIZ(PoiDetailShareButtonAssem.class), null);
    }
}
