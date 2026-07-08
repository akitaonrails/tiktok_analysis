package com.ss.android.ugc.aweme.feed.collection.sub.video.component;

import X.C786410Ut5;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.feed.platform.cell.pinch.PinchComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes34.dex */
public final class VideoPinchComponent extends PinchComponent {
    public View LLL;

    @Override // com.ss.android.ugc.feed.platform.cell.pinch.PinchComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1479031592) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.pinch.PinchComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLL = view.findViewById(R.id.kvf);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.pinch.PinchComponent
    public final void kp(long j, boolean z, boolean z2) {
        int i;
        float f;
        super.kp(j, z, z2);
        View view = this.LLL;
        if (view != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.T4(view, f);
        }
        View view2 = this.LLL;
        if (view2 != null) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
    }
}
