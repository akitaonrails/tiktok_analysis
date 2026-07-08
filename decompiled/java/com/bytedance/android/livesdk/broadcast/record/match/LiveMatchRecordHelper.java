package com.bytedance.android.livesdk.broadcast.record.match;

import X.C1161920gLG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C356901a3;
import X.C466310IQj;
import X.C766270U4b;
import X.C774850UaR;
import X.InterfaceC466320IQk;
import X.InterfaceC774810UaN;
import X.InterfaceC774830UaP;
import X.InterfaceC980390bcT;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.publicscreen.api.event.RoomMessageAttachEvent;
import com.bytedance.android.livesdk.broadcast.record.LiveRecordManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMatchRecordSwitch;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveMatchRecordHelper implements DefaultLifecycleObserver, InterfaceC774810UaN, InterfaceC774830UaP, GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final DataChannel LLILLJJLI;
    public boolean LLILLL;
    public C466310IQj LLILZ;

    @Override // X.InterfaceC774810UaN
    public final void LIZ() {
    }

    @Override // X.InterfaceC774810UaN
    public final void LIZJ() {
    }

    @Override // X.InterfaceC774810UaN
    public final void LIZLLL() {
        this.LLILLL = false;
    }

    @Override // X.InterfaceC774810UaN
    public final void LJ() {
    }

    @Override // X.InterfaceC774810UaN
    public final void LJFF(String str) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
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

    @Override // X.InterfaceC774830UaP
    public final void LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartRecorderMethod start record scene : ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveMatchRecordHelper", C2188811AlT.LIZIZ(sbLIZ));
        ILiveMatchService iLiveMatchService = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
        if (iLiveMatchService != null && iLiveMatchService.co0()) {
            if (i == 1) {
                if (LiveMatchRecordSwitch.INSTANCE.enableToast()) {
                    C766270U4b.LIZLLL(2131855674);
                    C774850UaR.LJI(this.LLILLJJLI, "1");
                }
                this.LLILLL = true;
                return;
            }
            Long lLIZIZ = InterfaceC980390bcT.Sa.LIZIZ();
            if ((lLIZIZ != null && lLIZIZ.longValue() == 0) || System.currentTimeMillis() - lLIZIZ.longValue() >= 60000) {
                return;
            }
            if (LiveMatchRecordSwitch.INSTANCE.enableToast()) {
                C766270U4b.LIZLLL(2131855674);
                C774850UaR.LJI(this.LLILLJJLI, "1");
            }
            this.LLILLL = true;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        LiveRecordManager.LL.getClass();
        ((ArrayList) LiveRecordManager.LLJIJIL).remove(this);
        LiveRecordManager.LLJILJIL = null;
        C466310IQj c466310IQj = this.LLILZ;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        this.LLILZ = null;
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    public LiveMatchRecordHelper(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = dataChannel;
        C20441214yg.LIZIZ("LiveMatchRecordHelper", "LiveMatchRecordHelper init !");
        this.LLILZ = new C466310IQj(15000L, 1000L, new InterfaceC466320IQk() { // from class: X.0Unr
            @Override // X.InterfaceC466320IQk
            public final void LJJI(long j) {
            }

            @Override // X.InterfaceC466320IQk
            public final void onStart() {
            }

            @Override // X.InterfaceC466320IQk
            public final void LIZLLL() {
                C20441214yg.LIZIZ("LiveMatchRecordHelper", "timer finish stop record !");
                LiveRecordManager.LL.getClass();
                LiveRecordManager.LJ("match_ends", true, false);
            }
        });
        dataChannel.BQ2(lifecycleOwner, BattleStateChannel.class, new AwS591S0100000_12(this, 451));
        dataChannel.BQ2(lifecycleOwner, RoomMessageAttachEvent.class, AFwS245S0000000_12.get$arr$(46));
        lifecycleOwner.getLifecycle().addObserver(this);
        LiveRecordManager.LL.getClass();
        ((ArrayList) LiveRecordManager.LLJIJIL).add(this);
        LiveRecordManager.LLJILJIL = this;
    }
}
