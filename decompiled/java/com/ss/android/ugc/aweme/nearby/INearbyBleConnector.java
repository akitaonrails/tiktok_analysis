package com.ss.android.ugc.aweme.nearby;

import X.AbstractC19484711Kz;
import X.C1689710u4X;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public interface INearbyBleConnector {
    AbstractC19484711Kz<Pair<C1689710u4X, String>> LIZ(Context context, C1689710u4X c1689710u4X, BluetoothManager bluetoothManager);

    void disconnect();
}
