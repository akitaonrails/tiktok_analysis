package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C011Z;
import X.C0IJT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C5183020f;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import qo2.w;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewShoppingManageLiveWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1o;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        String string;
        RoomCreateInfo roomCreateInfo;
        super.E1();
        View view = getView();
        if (view != null) {
            C500260Jjc.LJLIIIL(500L, view, new C5183020f(this, 93));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("tiktokec_button_show");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null || (string = Long.valueOf(roomCreateInfo.mLastRoomId).toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "room_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII("manage_live_button", "button_name");
        c474500IjALIZ.LJJII("live_take_page", "page_name");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }
}
