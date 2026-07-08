package com.ss.android.ugc.aweme.setting.page.security;

import X.C01GW;
import X.C0XQ7;
import X.C1069520dwE;
import X.C11G4;
import X.C20662615tI;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import Y.AObserverS217S0100000_13;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityVerificationCell extends RightTextCell<C20662615tI> {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 127));

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell, android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i;
        C11G4 c11g4 = this.LLILLL;
        if (c11g4 != null) {
            CharSequence charSequenceLJIIL = c11g4.LJIIL();
            Activity activity = this.LL;
            String string2 = null;
            if (activity != null) {
                string = activity.getString(2131848822);
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(charSequenceLJIIL, string)) {
                i = 1;
            } else {
                Activity activity2 = this.LL;
                if (activity2 != null) {
                    string2 = activity2.getString(2131848821);
                }
                if (Intrinsics.LJFF(charSequenceLJIIL, string2)) {
                    i = 0;
                } else {
                    i = -1;
                }
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "state");
            C20684815ws.LJIILLIIL("click_2_step_authentication", c2344009Gk.LIZ);
            Activity activity3 = this.LL;
            if (activity3 != null) {
                C0XQ7.LJ();
                C0XQ7.LIZ.LJFF().openTwoStepVerificationManageActivity(activity3, "settings_security");
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated(Object obj) {
        SecurityViewModel securityViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        super.onItemViewCreated();
        setItem((C1069520dwE) obj);
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner != null && (securityViewModel = (SecurityViewModel) this.LLILZ.getValue()) != null && (mutableLiveData = securityViewModel.LL) != null) {
            mutableLiveData.observe(currentLifecycleOwner, new AObserverS217S0100000_13(this, 8));
        }
    }
}
