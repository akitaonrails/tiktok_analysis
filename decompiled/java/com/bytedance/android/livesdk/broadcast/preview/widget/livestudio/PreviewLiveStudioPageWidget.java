package com.bytedance.android.livesdk.broadcast.preview.widget.livestudio;

import X.C1143680frq;
import X.C1324720kZq;
import X.C19ME;
import X.C20441214yg;
import X.C439101nJ;
import X.C786410Ut5;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveStudioIntroMaxWidthDpSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLiveStudioPageWidget extends AbstractPreviewLiveStudioPage {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1j;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.AbstractPreviewLiveStudioPage, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.AbstractPreviewLiveStudioPage, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        C19ME c19me;
        super.E1();
        C1324720kZq c1324720kZq = (C1324720kZq) findViewById(R.id.lnk);
        C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_game_demand_1", "ttlive_broadcast_live_studio_preview_page_detail_new.png");
        int value = GameLiveStudioIntroMaxWidthDpSetting.INSTANCE.getValue();
        if (value <= 0 || c1324720kZq == null) {
            return;
        }
        int iLIZ = C439101nJ.LIZ(value);
        ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            C20441214yg.LJIIL("PreviewLiveStudioPageWidget", "applyIntroMaxWidthFromSetting: layoutParams not ConstraintLayout.LayoutParams");
        } else if (c19me.matchConstraintMaxWidth != iLIZ) {
            c19me.matchConstraintMaxWidth = iLIZ;
            C786410Ut5.u6(c1324720kZq, c19me);
            c1324720kZq.requestLayout();
        }
    }
}
