package com.bytedance.android.livesdk.pad;

import X.C1161920gLG;
import X.EnumC469210Iad;
import X.InterfaceC465670INx;
import X.InterfaceC469390Iav;
import android.os.Bundle;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.livesetting.message.LivePadMultiScreenSetting;
import com.bytedance.android.livesdk.livesetting.message.LivePadMultiScreenStatePersistenceSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class PadMultiScreenService implements IPadMultiScreenService {
    public WeakReference<InterfaceC469390Iav> LL = new WeakReference<>(null);

    @Override // com.bytedance.android.livesdk.pad.IPadMultiScreenService
    public final boolean ah0() {
        return ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && LivePadMultiScreenSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.pad.IPadMultiScreenService
    public final PadLiveRoomMultiScreenFragment fO() {
        Bundle bundle = new Bundle();
        PadLiveRoomMultiScreenFragment padLiveRoomMultiScreenFragment = new PadLiveRoomMultiScreenFragment();
        padLiveRoomMultiScreenFragment.setArguments(bundle);
        Bundle bundle2 = new Bundle();
        EnumC469210Iad enumC469210Iad = EnumC469210Iad.LIVE_CONTAINER;
        LiveDrawerDialogV3 liveDrawerDialogV3 = new LiveDrawerDialogV3();
        liveDrawerDialogV3.LLJILLL = null;
        liveDrawerDialogV3.LLJILJIL = bundle2;
        liveDrawerDialogV3.LLJIJIL = null;
        liveDrawerDialogV3.LLJILJILJ = enumC469210Iad;
        padLiveRoomMultiScreenFragment.LLILZ = liveDrawerDialogV3;
        return padLiveRoomMultiScreenFragment;
    }

    @Override // com.bytedance.android.livesdk.pad.IPadMultiScreenService
    public final boolean vH1() {
        return ah0() && LivePadMultiScreenStatePersistenceSetting.INSTANCE.getValue() && InterfaceC465670INx.LJLJJL.LIZIZ().booleanValue();
    }

    @Override // com.bytedance.android.livesdk.pad.IPadMultiScreenService
    public final WeakReference<InterfaceC469390Iav> MR() {
        return this.LL;
    }

    @Override // com.bytedance.android.livesdk.pad.IPadMultiScreenService
    public final void d82(InterfaceC469390Iav interfaceC469390Iav) {
        this.LL = new WeakReference<>(interfaceC469390Iav);
    }
}
