package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C1161920gLG;
import X.C760180Trs;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.host.IHostEcommerce;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.LiveGoLivePageContainer;
import webcast.data.SecondaryBannerComponent;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewEcomSubBannerWidget extends MultiGuestPreviewSubWidget {
    public static final /* synthetic */ int LLILZLL = 0;
    public View LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1s;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean z1() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget
    public final boolean G1() {
        return this.LLILZIL != null;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        RoomCreateInfo roomCreateInfo;
        Map<Integer, LiveGoLivePageContainer> map;
        LiveGoLivePageContainer liveGoLivePageContainerLIZIZ;
        SecondaryBannerComponent secondaryBannerComponent;
        IHostEcommerce iHostEcommerce;
        ViewGroup viewGroup;
        boolean z;
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null || (map = roomCreateInfo.modeGoLivePageContainers) == null || (liveGoLivePageContainerLIZIZ = C760180Trs.LIZIZ(dataChannel, map)) == null || (secondaryBannerComponent = liveGoLivePageContainerLIZIZ.secondaryBanner) == null || (iHostEcommerce = (IHostEcommerce) C1161920gLG.LIZJ(IHostEcommerce.class)) == null) {
            return;
        }
        this.LLILZIL = iHostEcommerce.Yk(this.context, secondaryBannerComponent, this);
        View view = getView();
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            viewGroup.addView(view2, new FrameLayout.LayoutParams(-1, -2));
        }
        if (this.LLILZIL != null) {
            z = true;
            show();
        } else {
            z = false;
            hide();
        }
        Function1<? super Boolean, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }
}
