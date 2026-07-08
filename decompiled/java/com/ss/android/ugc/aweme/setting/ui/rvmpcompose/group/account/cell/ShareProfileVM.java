package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09QQ;
import X.C0XQ7;
import X.C1388190mED;
import X.C13BV;
import X.C1669660tYC;
import X.C1927707gp;
import X.C2019207va;
import X.C2025607wc;
import X.C2025707wd;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C621180OYa;
import X.C666390QBx;
import X.InterfaceC0148002o;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareProfileVM extends BaseCellSettingsVM<C2025707wd> {
    public final C2025607wc LL = new Object() { // from class: X.07wc
        @C14EU
        public final void onEvent(C1365870leD c1365870leD) {
            if (TextUtils.equals("user", c1365870leD.LIZLLL)) {
                this.LIZ.setState(new AwS582S0100000_3(c1365870leD, 51));
            }
        }
    };
    public final C01GW<List<Aweme>> LLILLJJLI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(544));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2025707wd(new C1927707gp(this), null, C1669660tYC.LJJII, 2131847712, null, C1669660tYC.LJJIFFI, null, new AwS617S0100000_3(this, 39), null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C09QQ.LIZIZ(this.LL);
        if (this.LLILLJJLI.isInitialized()) {
            if (C666390QBx.LIZIZ == this.LLILLJJLI.getValue()) {
                C666390QBx.LIZIZ = null;
            }
        }
        super.onCleared();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C2019207va.LIZ[event.ordinal()] == 1) {
            C09QQ.LIZ(this.LL);
        }
    }

    public final void vQ2(Context context, String str) {
        User curUser;
        List<Aweme> value;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("click_share_person", c2344009Gk.LIZ);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null || (curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) == null) {
            return;
        }
        if (this.LLILLJJLI.isInitialized()) {
            value = this.LLILLJJLI.getValue();
        } else {
            value = C13BV.INSTANCE;
        }
        C621180OYa.LIZ.LJJLIIIJL(null, activityLIZ, curUser, value, "", str, 2);
    }
}
