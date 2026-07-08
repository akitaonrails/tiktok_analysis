package com.bytedance.android.livesdk.programmedlive.ui;

import X.C1850730yGF;
import X.C20743416Fc;
import X.C21627319kV;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class ProgrammedLiveOnlineAudienceLandscapeWidget extends ProgrammedLiveOnlineAudienceWidget {
    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hjo;
    }

    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget
    public final void x1() {
        C20743416Fc c20743416Fc = this.LL;
        if (c20743416Fc != null) {
            c20743416Fc.setText(c20743416Fc.getContext().getResources().getQuantityString(2131755590, this.LLILLJJLI, C21627319kV.LIZJ().LJFF(C1850730yGF.LIZJ(this.LLILLJJLI))));
        }
    }
}
