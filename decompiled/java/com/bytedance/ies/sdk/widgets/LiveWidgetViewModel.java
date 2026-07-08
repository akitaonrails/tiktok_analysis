package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes8.dex */
public class LiveWidgetViewModel extends ViewModel {
    public DataChannel dataChannel;

    public final DataChannel getDataChannel() {
        return this.dataChannel;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.dataChannel = dataChannel;
    }
}
