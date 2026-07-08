package com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed;

import X.C09JN;
import X.C0IJT;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C1338270kvh;
import X.C1954807lC;
import X.C474500IjA;
import X.C520010KaN;
import X.C766270U4b;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.GameLiveNetworkPoorToastEvent;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameNetworkSpeedMonitorOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameLiveNetSpeedMonitorWidget extends NetSpeedMonitorWidget {
    public long LLJJIJIIJIL;
    public long LLJJ = System.currentTimeMillis();
    public long LLJJI = System.currentTimeMillis();
    public long LLJJIII = System.currentTimeMillis();
    public final long LLJJIJI = System.currentTimeMillis();
    public boolean LLJJIJIL = true;

    @Override // com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget
    public final void x1() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.DQ2(NetworkStatus.class, this, new AwS591S0100000_12(this, 221));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDetachWidget() {
        super.onDetachWidget();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget
    public final void y1(int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TtliveGameNetworkSpeedMonitorOptSetting.INSTANCE.useTTNet() && jCurrentTimeMillis - this.LLJJIJI < 30000) {
            return;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        int i3 = this.LLILZ;
        super.y1(i);
        int i4 = this.LLILLL;
        String str2 = "back";
        if (i3 != i4) {
            if (i4 == 2) {
                obj = "bad";
            } else if (i4 == 3) {
                obj = "stuck";
            } else {
                obj = "good";
            }
            if (i3 == 2) {
                obj2 = "bad";
            } else if (i3 == 3) {
                obj2 = "stuck";
            } else {
                obj2 = "good";
            }
            boolean zIsAppForeground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground();
            if (zIsAppForeground) {
                obj3 = "front";
            } else if (!zIsAppForeground) {
                obj3 = "back";
            } else {
                throw new C1954807lC();
            }
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_live_anchor_network_status_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
            c474500IjALIZIZ.LJJII(obj, "current_status");
            c474500IjALIZIZ.LJJII(obj2, "previous_status");
            c474500IjALIZIZ.LJJII(obj3, "app_status");
            c474500IjALIZIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZIZ.LIZ();
        }
        if (this.LLJJIJIL) {
            this.LLJJ = jCurrentTimeMillis;
            this.LLJJI = jCurrentTimeMillis;
            this.LLJJIII = jCurrentTimeMillis;
            this.LLJJIJIL = false;
        }
        int i5 = this.LLILLL;
        if (i5 != 1) {
            if (i5 != 2) {
                i2 = 3;
                if (i5 == 3) {
                    this.LLJJIII = jCurrentTimeMillis;
                }
            } else {
                i2 = 3;
                this.LLJJI = jCurrentTimeMillis;
            }
        } else {
            i2 = 3;
            this.LLJJ = jCurrentTimeMillis;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == i2) {
                    ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0("stuck", "g_broadcast_network_status");
                }
            } else {
                ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0("bad", "g_broadcast_network_status");
            }
        } else {
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0("good", "g_broadcast_network_status");
        }
        long j = this.LLJJI;
        long j2 = this.LLJJ;
        if (j - j2 > 30000) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJJIII - j2 > Mp4ScreenVideoLoadTimeout.CONTROL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (System.currentTimeMillis() - this.LLJJIJIIJIL >= 1800000) {
            z3 = true;
        } else {
            z3 = false;
        }
        Activity activityLJIJ = C520010KaN.LJIJ(getContext(), false);
        if (z3) {
            if (!z) {
                if (z2) {
                    str = "good_to_stuck";
                }
            } else {
                str = "good_to_bad";
            }
            boolean zIsAppForeground2 = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground();
            if (zIsAppForeground2) {
                str2 = "front";
            } else if (zIsAppForeground2) {
                throw new C1954807lC();
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_network_notification_show");
            c474500IjALIZ.LJJII(str, "notification_type");
            c474500IjALIZ.LJJII(str2, "app_status");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LIZ();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.FQ2(GameLiveNetworkPoorToastEvent.class);
            }
            this.LLJJIJIIJIL = System.currentTimeMillis();
            if (activityLJIJ != null) {
                C766270U4b.LJIIIIZZ(3000L, activityLJIJ, activityLJIJ.getString(2131841783));
            }
        }
        final int i6 = this.LLILLL;
        C11NZ.LJJJJZ(Boolean.TRUE).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.00xi
            @Override // X.C09JN
            public final void accept(Object obj4) {
                C1C7U.LIZ("GameLiveNetSpeedMonitorWidget@dce1.storeGameLiveNetworkStatusTooFeedbackDiagnose$1");
                ((IGameService) C1161920gLG.LIZJ(IGameService.class)).bx2(i6);
                C1C7U.LIZIZ("GameLiveNetSpeedMonitorWidget@dce1.storeGameLiveNetworkStatusTooFeedbackDiagnose$1");
            }
        });
    }
}
