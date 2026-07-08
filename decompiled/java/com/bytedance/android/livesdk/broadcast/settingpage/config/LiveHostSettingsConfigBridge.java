package com.bytedance.android.livesdk.broadcast.settingpage.config;

import X.C13LP;
import X.C20484615Do;
import X.C356901a3;
import X.C499990JjB;
import X.C751980Tee;
import X.C781270Ukn;
import X.InterfaceC499980JjA;
import X.InterfaceC781810Ulf;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.broadcast.settingpage.SettingsViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS105S0400000_7;
import kotlin.jvm.internal.AwS216S0300000_7;
import kotlin.jvm.internal.AwS373S0200000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostSettingsConfigBridge implements InterfaceC781810Ulf, GenericLifecycleObserver {
    public final Fragment LL;
    public final DataChannel LLILLJJLI;
    public final C20484615Do LLILLL;
    public final LifecycleOwner LLILZ;
    public final InterfaceC499980JjA LLILZIL;

    @Override // X.InterfaceC781810Ulf
    public final void b42() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // X.InterfaceC781810Ulf
    public final void init() {
        InterfaceC499980JjA interfaceC499980JjA = this.LLILZIL;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.init();
        }
    }

    @Override // X.InterfaceC781810Ulf
    public final void onHiddenChanged(boolean z) {
        InterfaceC499980JjA interfaceC499980JjA = this.LLILZIL;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.onHiddenChanged(z);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        InterfaceC499980JjA interfaceC499980JjA = this.LLILZIL;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.onResume(lifecycleOwner);
        }
    }

    @Override // X.InterfaceC781810Ulf
    public final void onViewCreated(View view) {
        Room room;
        InterfaceC499980JjA interfaceC499980JjA = this.LLILZIL;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.onViewCreated(view);
        }
        Fragment fragment = this.LL;
        DataChannel dataChannel = this.LLILLJJLI;
        C20484615Do c20484615Do = this.LLILLL;
        InterfaceC499980JjA interfaceC499980JjA2 = this.LLILZIL;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        LiveMode liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
        SettingsViewModel settingsViewModel = (SettingsViewModel) new ViewModelProvider(fragment).get(SettingsViewModel.class);
        C499990JjB c499990JjB = new C499990JjB(settingsViewModel);
        c499990JjB.LIZ(R.id.mzl, new AwS105S0400000_7(fragment, interfaceC499980JjA2, liveModeLIZJ, c20484615Do, dataChannel, 8));
        c499990JjB.LIZ(R.id.mzo, new AwS373S0200000_7(fragment, dataChannel, liveModeLIZJ, 101));
        c499990JjB.LIZ(R.id.mzn, new AwS216S0300000_7(fragment, interfaceC499980JjA2, liveModeLIZJ, dataChannel, 22));
        c499990JjB.LIZ(R.id.mzp, new AwS105S0400000_7(fragment, interfaceC499980JjA2, dataChannel, room, liveModeLIZJ, 7));
        c499990JjB.LIZ(R.id.mzm, new AwS216S0300000_7(fragment, interfaceC499980JjA2, liveModeLIZJ, dataChannel, 23));
        settingsViewModel.LLILZ = true;
        settingsViewModel.LLIZ.setValue(C13LP.LLIIII(settingsViewModel.LLILLL));
        settingsViewModel.vQ2();
    }

    public LiveHostSettingsConfigBridge(Fragment fragment, DataChannel dataChannel, C20484615Do c20484615Do, LifecycleOwner lifecycleOwner) {
        this.LL = fragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = c20484615Do;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = C781270Ukn.LIZIZ().PE0(fragment, dataChannel, c20484615Do, lifecycleOwner);
    }
}
