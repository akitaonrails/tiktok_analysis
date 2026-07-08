package com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.guide;

import X.C098200Yq;
import X.C0OM1;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C422830Gi1;
import X.C631580Opw;
import X.C632320Or8;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.ab.FanSpotlightConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FanSpotlightGuideSheetFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwZiMtJzwjJzEgICg7PGs8OyA1HELIOSISkpJDogISY4KC19LzAlLSp9DiQiGj88PCklLicnDzAlLSoAICApPQkhKSIhLCEn";

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String quantityString;
        Resources resources;
        boolean z;
        String fanSpotlightGuideImageUrl;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eg3, viewGroup, false);
        C19GS c19gs = null;
        if (viewTd != null) {
            SmartImageView smartImageView = (SmartImageView) viewTd.findViewById(R.id.hnf);
            if (smartImageView != null) {
                Context context = getContext();
                if (context != null && C960203pA.LIZIZ(context)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    FanSpotlightConfig fanSpotlightConfig = C632320Or8.LIZ;
                    FanSpotlightConfig fanSpotlightConfig2 = (FanSpotlightConfig) settingsManagerLIZLLL.LJIIIIZZ("fan_spotlight_settings", FanSpotlightConfig.class, fanSpotlightConfig);
                    if (fanSpotlightConfig2 != null) {
                        fanSpotlightConfig = fanSpotlightConfig2;
                    }
                    fanSpotlightGuideImageUrl = fanSpotlightConfig.getFanSpotlightGuideImageUrlForDarkMode();
                } else {
                    SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                    FanSpotlightConfig fanSpotlightConfig3 = C632320Or8.LIZ;
                    FanSpotlightConfig fanSpotlightConfig4 = (FanSpotlightConfig) settingsManagerLIZLLL2.LJIIIIZZ("fan_spotlight_settings", FanSpotlightConfig.class, fanSpotlightConfig3);
                    if (fanSpotlightConfig4 != null) {
                        fanSpotlightConfig3 = fanSpotlightConfig4;
                    }
                    fanSpotlightGuideImageUrl = fanSpotlightConfig3.getFanSpotlightGuideImageUrl();
                }
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(fanSpotlightGuideImageUrl);
                int[] iArrLIZ = C422830Gi1.LIZ(302);
                if (iArrLIZ != null) {
                    c1331670kl3LJIIIZ.LJJIJ(iArrLIZ);
                }
                c1331670kl3LJIIIZ.LJJ(smartImageView);
                c1331670kl3LJIIIZ.LIZLLL("FanSpotlightGuideSheetFragment");
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
            View viewFindViewById = viewTd.findViewById(R.id.hnd);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new AbS691S0100000_9(this, 20, 42), viewFindViewById);
            }
            View viewFindViewById2 = viewTd.findViewById(R.id.s2c);
            if (viewFindViewById2 != null) {
                C786410Ut5.I7(new AbS691S0100000_9(this, 21, 42), viewFindViewById2);
            }
            TextView textView = (TextView) viewTd.findViewById(R.id.hne);
            if (textView != null) {
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null) {
                    quantityString = resources.getQuantityString(2131755307, C631580Opw.LIZ().getFanSpotlightVideoExpiredWeeks(), Integer.valueOf(C631580Opw.LIZ().getFanSpotlightVideoExpiredWeeks()));
                } else {
                    quantityString = null;
                }
                textView.setText(quantityString);
            }
        } else {
            viewTd = null;
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
