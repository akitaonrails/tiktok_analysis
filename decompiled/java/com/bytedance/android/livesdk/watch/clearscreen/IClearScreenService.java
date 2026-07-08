package com.bytedance.android.livesdk.watch.clearscreen;

import X.C006A;
import X.InterfaceC1081980eGK;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredElementManager;

/* JADX INFO: loaded from: classes18.dex */
public interface IClearScreenService extends C006A {
    void cC(Room room);

    void iE2(Room room, Fragment fragment, DataChannel dataChannel, View view, LayeredElementManager<?> layeredElementManager);

    InterfaceC1081980eGK wy2(Room room, DataChannel dataChannel);
}
