package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter;

import X.C0IJT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class TryModeLiveCenterEntranceWidget extends LiveWidget {
    public View LL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g1s;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        this.LL = view != null ? view.findViewById(R.id.bnu) : null;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_live_center_icon");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJ("show");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_violation");
        c474500IjALIZ.LIZ();
        View view2 = getView();
        if (view2 != null) {
            C500260Jjc.LJLIIIL(500L, view2, new AwS591S0100000_12(this, 208));
        }
        if (C497740JfY.LJJ()) {
            View view3 = this.LL;
            if (view3 != null) {
                view3.setBackgroundResource(R.drawable.enl);
                return;
            }
            return;
        }
        View view4 = this.LL;
        if (view4 != null) {
            view4.setBackgroundResource(R.drawable.enh);
        }
    }
}
