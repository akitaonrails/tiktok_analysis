package com.bytedance.android.livesdk.hashtag;

import X.C0IJT;
import X.C0TZX;
import X.C1161920gLG;
import X.C19322110iZ;
import X.C467770IVz;
import X.C474500IjA;
import X.C497740JfY;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public final class AudienceHashTagWidget extends BaseHashTagWidget {
    public boolean LLIZLLLIL;

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void G1(Hashtag hashtag) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final boolean z1() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void E1() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_topic_click");
        c474500IjALIZ.LJJII(C497740JfY.LJIL() ? "portrait" : "landscape", "room_orientation");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void F1() {
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_viewer_topic_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void C1() throws JSONException {
        B1();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void D1(FragmentManager fragmentManager) {
        C19322110iZ.LJFF(fragmentManager, new HashtagAudienceDialogV2(), "foundation_topic_ranking", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... objArr) {
        super.initConstructor(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget
    public final void onGetRoomInfo(Room room) {
        I1();
        attach();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean boolValueOf;
        super.onLoad(objArr);
        this.LLIZLLLIL = false;
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService != null) {
            boolValueOf = Boolean.valueOf(iMicRoomService.On1());
        } else {
            boolValueOf = null;
        }
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolValueOf, bool)) {
            this.dataChannel.SX0(C0TZX.class, Boolean.FALSE);
            hide();
        } else {
            this.dataChannel.SX0(C0TZX.class, bool);
            H1();
        }
        this.dataChannel.FQ2(RefreshMoreRedDotEvent.class);
    }
}
