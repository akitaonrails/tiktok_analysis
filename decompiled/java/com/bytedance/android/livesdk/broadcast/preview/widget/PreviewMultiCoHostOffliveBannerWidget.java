package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C13LE;
import X.C13LP;
import X.C427760Gpy;
import X.C770220UJg;
import X.C786410Ut5;
import X.C842240X2g;
import X.EnumC429060Gs4;
import Y.ACListenerS152S0100000_17;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.MultiCoHostOffliveInviterUserChannel;
import com.bytedance.android.livesdk.dataChannel.MultiCoHostOffliveBannerVisibilityChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class PreviewMultiCoHostOffliveBannerWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hhq;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        C427760Gpy c427760Gpy;
        List<String> listLIZ;
        Object objLJJJLL;
        LiveIconView liveIconView;
        super.C1();
        hide();
        View view = getView();
        if (view != null && (liveIconView = (LiveIconView) view.findViewById(R.id.e1y)) != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS152S0100000_17(this, 20));
        }
        View view2 = getView();
        if (view2 == null || (c427760Gpy = (C427760Gpy) view2.findViewById(R.id.br7)) == null) {
            c427760Gpy = null;
        } else {
            c427760Gpy.setTotalCount(2);
            c427760Gpy.setStacking(EnumC429060Gs4.LAST_ON_TOP);
            ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
            if (avatarThumb != null && (listLIZ = C842240X2g.LIZ(avatarThumb)) != null && (objLJJJLL = C13LP.LJJJLL(listLIZ)) != null) {
                C427760Gpy.LIZ(c427760Gpy, 0, objLJJJLL, "", null, null, false, null, 2040);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, MultiCoHostOffliveInviterUserChannel.class, new AwS383S0200000_17(this, c427760Gpy, 16));
        }
    }
}
