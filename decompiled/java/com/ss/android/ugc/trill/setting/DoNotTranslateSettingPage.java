package com.ss.android.ugc.trill.setting;

import X.AbstractC20085213iM;
import X.C01GW;
import X.C1669670tYD;
import X.C19719212De;
import X.C20088213iq;
import X.C20699015zA;
import X.C452501pT;
import X.EnumC1427810nG7;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC836760Ws6
public final class DoNotTranslateSettingPage extends BasePage {
    public static final C20699015zA LLJILLL = new C20699015zA();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZjYpPTs6HELIOSJiJiDSAdJzEYOy49OyktPSoALTE4ICE0GCQrLA==";
    public ComposeView LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(325));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1293));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1292));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1294));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f6k;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById = this.LLJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.eoa);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (ComposeView) viewFindViewById;
        }
        ((AbstractC20085213iM) viewFindViewById).setViewCompositionStrategy(C20088213iq.LIZIZ);
        View view3 = this.LLJ;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.eoa);
            }
            this.LLJ = (ComposeView) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C1669670tYD.LJ((ComposeView) view3, EnumC1427810nG7.Auto, new C19719212De(1052704000, new AwS460S0200000_25(this, view, 25), true));
    }
}
