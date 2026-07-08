package com.ss.android.ugc.aweme.poi.search.assem;

import X.AbstractC1335900krs;
import X.C1180060goW;
import X.C1180600gpO;
import X.C1189360h3W;
import X.C1197940hHM;
import X.C1331730kl9;
import X.C1331750klB;
import X.C384050F3z;
import X.C418440Gaw;
import X.C654910PmT;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.search.PoiSearchBannerResModel;
import com.ss.android.ugc.aweme.poi.search.PoiSearchTopBanner;
import com.zhiliaoapp.musically.R;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchBannerAssem extends UISlotAssem {
    public FrameLayout LLJJI;
    public ViewGroup LLJJIII;
    public ConstraintLayout LLJJIJI;
    public SmartImageView LLJJIJIIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e8n;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        PoiSearchBannerResModel poiSearchBannerResModel;
        String str;
        FrameLayout frameLayout;
        try {
            this.LLJJI = (FrameLayout) view.findViewById(R.id.video_generated_dialog_close_btn);
            this.LLJJIII = (ViewGroup) view.findViewById(R.id.rcq);
            this.LLJJIJI = (ConstraintLayout) view.findViewById(R.id.rcl);
            this.LLJJIJIIJIL = (SmartImageView) view.findViewById(R.id.rcp);
            ConstraintLayout constraintLayout = this.LLJJIJI;
            if (constraintLayout != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                constraintLayout.setBackground(c384050F3z.LIZ(constraintLayout.getContext()));
                C786410Ut5.I7(new AbS699S0100000_18(this, 31), constraintLayout);
            }
            Context context = getContext();
            if (context != null && (frameLayout = this.LLJJI) != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZ = Integer.valueOf(C1180060goW.LJII("#80000000"));
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(999));
                frameLayout.setBackground(c384050F3z2.LIZ(context));
            }
            FrameLayout frameLayout2 = this.LLJJI;
            if (frameLayout2 != null) {
                C786410Ut5.I7(new AbS699S0100000_18(this, 30), frameLayout2);
            }
            PoiSearchTopBanner poiSearchTopBanner = C1197940hHM.LIZ;
            if (poiSearchTopBanner != null && (poiSearchBannerResModel = poiSearchTopBanner.banner) != null && (str = poiSearchBannerResModel.resource) != null) {
                C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("poi_search_page", "top_banner", null).LIZIZ(str);
                c1189360h3WLIZIZ.LIZLLL(this.LLJJIJIIJIL);
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = C654910PmT.LIZ(8.0f, getContext());
                c1189360h3WLIZIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
                c1189360h3WLIZIZ.LIZJ(new AbstractC1335900krs() { // from class: X.0hHN
                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view2, Throwable th) {
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
