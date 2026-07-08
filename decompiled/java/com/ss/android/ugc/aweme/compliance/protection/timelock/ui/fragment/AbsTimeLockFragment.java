package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment;

import X.C0I7D;
import X.C197039127h;
import X.C19773412Ya;
import X.C786410Ut5;
import X.RunnableC514801zW;
import X.ViewOnFocusChangeListenerC19509211Uk;
import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public abstract class AbsTimeLockFragment extends AmeBaseFragment {
    public C0I7D LL;
    public C197039127h LLILLJJLI;

    public abstract void MR(String str);

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0I7D c0i7d = (C0I7D) view.findViewById(R.id.gsl);
        this.LL = c0i7d;
        c0i7d.setTextSize(36.0f);
        C0I7D c0i7d2 = this.LL;
        c0i7d2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC19509211Uk(this, c0i7d2, c0i7d2.getOnFocusChangeListener()));
        HandlerHook.viewPost(c0i7d2, new RunnableC514801zW(c0i7d2, 101));
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.osi);
        this.LLILLJJLI = c197039127h;
        C786410Ut5.LLLLLLJ(c197039127h, 0);
        C786410Ut5.w5(this.LLILLJJLI, 0.5f);
        C786410Ut5.U8(this.LLILLJJLI, new ACListenerS163S0100000_29(this, 29));
        this.LL.addTextChangedListener(new C19773412Ya(this, 2));
    }
}
