package com.ss.android.ugc.aweme.setting.serverpush.ui;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C14X5;
import X.C19EG;
import X.C19EH;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginComposeFragment;
import com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginComposeFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC836760Ws6
public final class PushSettingManagerPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOiHELIOSohPiA+OTogIGs5IGEDPTYkGionPCwiLgIyJiQrLD0DKSIp";
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS274S0000000_30.get$arr$(78), "scroll_to_category_by_item_id", String.class);

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f66;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String stringExtra;
        Intent intent;
        super.onViewCreated(view, bundle);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("FRAGMENT_PUSH_MANAGER_LIST");
            if (fragmentLJJJJZI == null) {
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    PushSettingsUnLoginComposeFragment.LLILLL.getClass();
                    fragmentLJJJJZI = new PushSettingsUnLoginComposeFragment();
                    fragmentLJJJJZI.setArguments(new Bundle());
                } else {
                    C14X5 c14x5 = PushSettingsLoginComposeFragment.LLIZ;
                    String str = (String) this.LLJ.getValue();
                    c14x5.getClass();
                    fragmentLJJJJZI = new PushSettingsLoginComposeFragment();
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJJI("scroll_to_category_by_item_id", str, bundle2);
                    fragmentLJJJJZI.setArguments(bundle2);
                }
            }
            Bundle bundle3 = new Bundle();
            Bundle arguments = fragmentLJJJJZI.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C786410Ut5.LJJIIJZLJL(bundle3, arguments);
            C19EG activity = getActivity();
            if (activity != null && (intent = activity.getIntent()) != null) {
                try {
                    stringExtra = intent.getStringExtra("enter_from");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
            } else {
                stringExtra = null;
            }
            C786410Ut5.LJJJI("enter_from", stringExtra, bundle3);
            fragmentLJJJJZI.setArguments(bundle3);
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, fragmentLJJJJZI, "FRAGMENT_PUSH_MANAGER_LIST");
            c19ehLJIIJ.LJIIJ();
        }
    }
}
