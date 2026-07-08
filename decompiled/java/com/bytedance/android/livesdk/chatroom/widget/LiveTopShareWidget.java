package com.bytedance.android.livesdk.chatroom.widget;

import X.C1161920gLG;
import X.C1CC2;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1102740eno;
import X.EnumC1102750enp;
import X.InterfaceViewOnClickListenerC1102800enu;
import X.ViewOnLongClickListenerC1151640g4g;
import Y.ACListenerS152S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public class LiveTopShareWidget extends LiveRecyclableWidget implements View.OnClickListener {
    public InterfaceViewOnClickListenerC1102800enu LL;
    public View LLILLJJLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hyl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLILLJJLI = null;
        this.LL = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        LiveMode streamType;
        if (this.LL == null) {
            Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
            if (room == null) {
                C1CC2.LIZ("current room is null when watch live", new NullPointerException());
                streamType = LiveMode.VIDEO;
            } else {
                streamType = room.getStreamType();
            }
            this.LL = ((IShareService) C1161920gLG.LIZJ(IShareService.class)).K72(C500260Jjc.LJ(this.context), this.context, streamType, this);
        }
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu = this.LL;
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.SHARE;
        enumC1102750enp.load(this.dataChannel, interfaceViewOnClickListenerC1102800enu);
        View view = enumC1102750enp.getView(this.dataChannel);
        this.LLILLJJLI = view;
        if (view != null && getView() != null) {
            View viewFindViewById = this.LLILLJJLI.findViewById(R.id.y7a);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            ViewGroup viewGroup = (ViewGroup) this.LLILLJJLI.getParent();
            if (viewGroup != null) {
                this.LLILLJJLI.clearAnimation();
                viewGroup.setLayoutTransition(null);
                C786410Ut5.LJJJLZIJ(this.LLILLJJLI, viewGroup);
            }
            View view2 = this.LLILLJJLI;
            EnumC1102740eno.SHARE.hide(this.dataChannel);
            C786410Ut5.I7(new ACListenerS152S0100000_17(interfaceViewOnClickListenerC1102800enu, 29), this.LLILLJJLI);
            this.LLILLJJLI.setOnLongClickListener(new ViewOnLongClickListenerC1151640g4g(interfaceViewOnClickListenerC1102800enu, 3));
            FrameLayout frameLayout = (FrameLayout) getView();
            C786410Ut5.LJJJLL(frameLayout);
            frameLayout.addView(view2, new FrameLayout.LayoutParams(-2, -2, 17));
            frameLayout.setClipChildren(false);
            C786410Ut5.O7(frameLayout, this);
        }
    }
}
