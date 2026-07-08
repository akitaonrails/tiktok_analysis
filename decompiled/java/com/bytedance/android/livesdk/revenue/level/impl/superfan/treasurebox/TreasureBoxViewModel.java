package com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox;

import X.C01GW;
import X.C0KTH;
import X.C452501pT;
import X.C497280Jeo;
import X.C500260Jjc;
import X.C517830KSn;
import X.C517840KSo;
import X.EnumC517850KSp;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS193S0000000_7;
import tikcast.api.fans.GetSuperFansTreasureBoxDataResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class TreasureBoxViewModel extends LiveWidgetViewModel {
    public C517840KSo LL;
    public final C01GW LLILLJJLI;
    public GetSuperFansTreasureBoxDataResponse.Data LLILLL;

    public TreasureBoxViewModel() {
        C517830KSn.LIZ = new WeakReference<>(this);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(88));
    }

    public final void vQ2(boolean z) {
        WeakReference<Fragment> weakReference;
        Fragment fragment;
        DataChannel dataChannel;
        MutableLiveData<EnumC517850KSp> mutableLiveData;
        MutableLiveData<EnumC517850KSp> mutableLiveData2;
        C517840KSo c517840KSo = this.LL;
        if (c517840KSo != null && (weakReference = c517840KSo.LIZIZ) != null && (fragment = weakReference.get()) != null && (dataChannel = getDataChannel()) != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            if (C497280Jeo.LIZ) {
                BroadcastTunnelVM broadcastTunnelVM = (BroadcastTunnelVM) C0KTH.LIZIZ(BroadcastTunnelVM.class, fragment);
                if (z) {
                    if (broadcastTunnelVM != null && (mutableLiveData2 = broadcastTunnelVM.LL) != null) {
                        mutableLiveData2.setValue(EnumC517850KSp.STREAM_ON);
                        return;
                    }
                    return;
                }
                if (broadcastTunnelVM == null || (mutableLiveData = broadcastTunnelVM.LL) == null) {
                    return;
                }
                mutableLiveData.setValue(EnumC517850KSp.STREAM_PAUSE);
                return;
            }
            BroadcastTunnelVM broadcastTunnelVM2 = (BroadcastTunnelVM) C0KTH.LIZ(fragment.getActivity(), BroadcastTunnelVM.class);
            if (z) {
                broadcastTunnelVM2.LL.setValue(EnumC517850KSp.STREAM_ON);
            } else {
                broadcastTunnelVM2.LL.setValue(EnumC517850KSp.STREAM_PAUSE);
            }
        }
    }
}
