package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C1161920gLG;
import X.C20337914i1;
import X.C419501k9;
import X.C474500IjA;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.ViewOnClickListenerC512201z6;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewNrVoiceChatGuideWidget extends MultiGuestPreviewSubWidget {
    public static final /* synthetic */ int LLILZLL = 0;
    public Boolean LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1p;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget
    public final boolean G1() {
        Boolean bool = this.LLILZIL;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zLIZ = C419501k9.LIZ(this.dataChannel);
        this.LLILZIL = Boolean.valueOf(zLIZ);
        return zLIZ;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        H1("show");
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.u9;
        if (c20337914i1.LIZIZ().booleanValue()) {
            c20337914i1.LJFF(Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 24), view);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean z1() {
        return G1();
    }

    public static void H1(String str) {
        long curUserId;
        IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
        if (iHostUser != null) {
            curUserId = iHostUser.getCurUserId();
        } else {
            curUserId = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_voice_chat_bubble");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(curUserId), "anchor_id");
        c474500IjALIZ.LJJII("device_camera", "page_type");
        c474500IjALIZ.LIZ();
    }
}
