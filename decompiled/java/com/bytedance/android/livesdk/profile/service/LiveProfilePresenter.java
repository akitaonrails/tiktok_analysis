package com.bytedance.android.livesdk.profile.service;

import X.C0J1N;
import X.C1085120eLO;
import X.C1161920gLG;
import X.C11RD;
import X.C495970Jch;
import X.C784440Upu;
import X.InterfaceC495890JcZ;
import Y.AfS176S0100000_7;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.ShowUserProfileEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.live.room.DismissUserProfileEvent;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.livesdk.api.revenue.BorderInfoUpdateEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.profile.ui.LiveProfileSheet;
import com.bytedance.android.livesdk.revenue.level.api.event.ClearProfilePreloadResponse;
import com.bytedance.android.livesdk.revenue.level.api.event.QuitFansClubEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveProfilePresenter implements GenericLifecycleObserver {
    public final BaseFragment LL;
    public final DataChannel LLILLJJLI;
    public final boolean LLILLL;
    public InterfaceC495890JcZ LLILZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        InterfaceC495890JcZ interfaceC495890JcZ;
        DataChannelGlobal.LLILZ.zQ2(this);
        InterfaceC495890JcZ interfaceC495890JcZ2 = this.LLILZ;
        if (interfaceC495890JcZ2 != null && interfaceC495890JcZ2.isShowing() && (interfaceC495890JcZ = this.LLILZ) != null) {
            interfaceC495890JcZ.dismiss();
        }
        this.LLILZ = null;
    }

    public final void onEvent(UserProfileEvent userProfileEvent) {
        Context context;
        FragmentManager fragmentManager;
        Room room;
        long id;
        if (this.LL.isViewValid()) {
            InterfaceC495890JcZ interfaceC495890JcZ = this.LLILZ;
            if ((interfaceC495890JcZ != null && interfaceC495890JcZ.isShowing()) || (context = this.LL.getContext()) == null || (fragmentManager = this.LL.getFragmentManager()) == null || (room = (Room) this.LLILLJJLI.gg0(RoomChannel.class)) == null || room.isOfficial() || room == null) {
                return;
            }
            ILiveProfileService iLiveProfileService = (ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class);
            DataChannel dataChannel = this.LLILLJJLI;
            boolean z = this.LLILLL;
            User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
            User user = userProfileEvent.user;
            if (user != null) {
                id = user.getId();
            } else {
                id = userProfileEvent.userId;
            }
            LiveProfileSheet liveProfileSheetRP = iLiveProfileService.rP(context, dataChannel, z, room, userLJIJJLI, id, userProfileEvent);
            liveProfileSheetRP.BS(fragmentManager);
            this.LLILZ = liveProfileSheetRP;
        }
    }

    public LiveProfilePresenter(BaseFragment baseFragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner) {
        Object obj;
        this.LL = baseFragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = z;
        lifecycleOwner.getLifecycle().addObserver(this);
        dataChannel.BQ2(baseFragment, ShowUserProfileEvent.class, new C495970Jch(this));
        dataChannel.BQ2(baseFragment, DismissUserProfileEvent.class, new AwS586S0100000_7(this, 166));
        ((C0J1N) UserService.getInstance().user().LJFF().LIZJ(C11RD.LIZLLL(baseFragment))).LIZJ(new AfS176S0100000_7(this, 90));
        dataChannel.BQ2(baseFragment, RoomUserChannel.class, new AwS586S0100000_7(this, 167));
        dataChannel.BQ2(baseFragment, BorderInfoUpdateEvent.class, new AwS586S0100000_7(this, 168));
        dataChannel.BQ2(baseFragment, QuitFansClubEvent.class, new AwS586S0100000_7(this, 169));
        dataChannel.BQ2(baseFragment, ClearProfilePreloadResponse.class, new AwS586S0100000_7(this, 170));
        if (LiveProfileMemleakOptSetting.INSTANCE.getValue()) {
            obj = baseFragment;
        } else {
            obj = this;
        }
        DataChannelGlobal.LLILZ.BQ2(obj, this.LL, SubscribeSuccessEvent.class, new AwS586S0100000_7(this, 171));
        C784440Upu.LIZ().LJI(baseFragment, UserProfileEvent.class).LIZJ(new AfS176S0100000_7(this, 91));
        C784440Upu.LIZ().LJI(baseFragment, DismissUserProfileEvent.class).LIZJ(new AfS176S0100000_7(this, 88));
        C784440Upu.LIZ().LJI(baseFragment, C1085120eLO.class).LIZJ(new AfS176S0100000_7(this, 89));
    }
}
