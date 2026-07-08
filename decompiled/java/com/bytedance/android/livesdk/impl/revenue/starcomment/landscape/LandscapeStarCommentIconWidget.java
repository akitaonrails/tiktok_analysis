package com.bytedance.android.livesdk.impl.revenue.starcomment.landscape;

import X.C0IJT;
import X.C1161920gLG;
import X.C20441214yg;
import X.C474500IjA;
import X.C497740JfY;
import X.C498310JgT;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.api.revenue.starcomment.StarCommentEntranceVisibleEvent;
import com.bytedance.android.livesdk.dataChannel.EnigmaStatus;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LandscapeStarCommentIconWidget extends RoomRecycleWidget {
    public boolean LL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hvr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void y1() {
        Boolean bool = (Boolean) this.dataChannel.gg0(StarCommentEntranceVisibleEvent.class);
        if (Boolean.valueOf((bool == null || !bool.booleanValue() || C498310JgT.LIZ() || this.LL) ? false : true).booleanValue()) {
            View view = this.contentView;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            x1(this.dataChannel);
            return;
        }
        C20441214yg.LJ("LandscapeStarCommentIconWidget", "StarCommentEntranceVisibleEvent is false.");
        View view2 = this.contentView;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
    }

    public static void x1(DataChannel dataChannel) {
        if (dataChannel == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_guidance_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.FALSE)) {
            c474500IjALIZ.LJJII(Integer.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).WS1()), "user_rank");
        }
        c474500IjALIZ.LJJII("landscape_live_room", "position");
        if (C497740JfY.LJIL()) {
            c474500IjALIZ.LJJII("portrait", "room_orientation");
        } else {
            c474500IjALIZ.LJJII("landscape", "room_orientation");
        }
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        y1();
        View view = this.contentView;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 0), view);
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, EnigmaStatus.class, new AwS596S0100000_17(this, 164));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, StarCommentEntranceVisibleEvent.class, new AwS596S0100000_17(this, 165));
        }
    }
}
