package com.bytedance.android.livesdk.chatroom.widget.skylight;

import X.C011Z;
import X.C0IJT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C635860Owq;
import X.C751980Tee;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveMainFrameworkExpandSkylightSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public final class SkylightSwitchWidget extends PerformProcessWidget {
    public LiveIconView LL;
    public ColorStateList LLILLJJLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2c;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.jxe);
        this.LL = liveIconView;
        if (liveIconView != null) {
            this.LLILLJJLI = liveIconView.getIconTintList();
        }
        View view = getView();
        if (view != null && LiveMainFrameworkExpandSkylightSetting.INSTANCE.enable()) {
            C635860Owq.LIZ.LIZJ(8, view);
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LiveIconView liveIconView = this.LL;
        LiveIconView liveIconView2 = null;
        if (liveIconView == null) {
            liveIconView = null;
        }
        liveIconView.setBackgroundResource(0);
        boolean zLJFF = Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class), Boolean.TRUE);
        LiveIconView liveIconView3 = this.LL;
        if (liveIconView3 == null) {
            liveIconView3 = null;
        }
        liveIconView3.setIconAttr(x1(zLJFF));
        DataChannelGlobal.LLILZ.EQ2(this, this, TopLiveSkylightVisibilityChannel.class, new AwS586S0100000_7(this, 89));
        View view = getView();
        if (view != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.INSTANCE.skylightRightMarginOrDefault(12));
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(iLIZIZ);
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
        LiveIconView liveIconView4 = this.LL;
        if (liveIconView4 != null) {
            liveIconView2 = liveIconView4;
        }
        C786410Ut5.g8(liveIconView2, new ACListenerS142S0100000_7(this, 47));
        y1("livesdk_skylight_entrance_show");
    }

    public final int x1(boolean z) {
        if (z) {
            ColorStateList colorStateList = this.LLILLJJLI;
            if (colorStateList != null) {
                LiveIconView liveIconView = this.LL;
                if (liveIconView == null) {
                    liveIconView = null;
                }
                if ((liveIconView instanceof LiveIconView) && liveIconView != null) {
                    liveIconView.setIconTintList(colorStateList);
                    return R.attr.d3n;
                }
                return R.attr.d3n;
            }
            return R.attr.d3n;
        }
        LiveIconView liveIconView2 = this.LL;
        if (liveIconView2 != null) {
            liveIconView2.LJ();
            return R.attr.cuc;
        }
        return R.attr.cuc;
    }

    public final void y1(String str) {
        Long lValueOf;
        Long lValueOf2;
        LiveMode liveModeLIZJ;
        Room roomLJJLIIIIJ;
        User owner;
        Room roomLJJLIIIIJ2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        DataChannel dataChannel = this.dataChannel;
        String str2 = null;
        if (dataChannel != null && (roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
            lValueOf = Long.valueOf(roomLJJLIIIIJ2.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel3)) != null) {
            str2 = liveModeLIZJ.logStreamingType;
        }
        c474500IjALIZ.LJJII(str2, "live_type");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIILIIL(), "event_page");
        c474500IjALIZ.LIZ();
    }
}
