package com.ss.android.ugc.aweme.account.switchaccount;

import X.C19EG;
import X.C486860J7k;
import Y.AObserverS185S0200000_24;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public final class ProfileTabLongPressHandlerImpl implements IProfileTabLongPressHandler {
    public WeakReference<Fragment> LIZ;

    @Override // com.ss.android.ugc.aweme.account.switchaccount.IProfileTabLongPressHandler
    public final void init(Fragment fragment) {
        Fragment fragment2;
        WeakReference<Fragment> weakReference = this.LIZ;
        if (weakReference != null) {
            fragment2 = weakReference.get();
        } else {
            fragment2 = null;
        }
        if (fragment2 == fragment) {
            return;
        }
        this.LIZ = new WeakReference<>(fragment);
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(activity);
        scrollSwitchStateManagerLIZIZ.LLJJ.observe(fragment, new AObserverS185S0200000_24(this, fragment, 0));
    }
}
