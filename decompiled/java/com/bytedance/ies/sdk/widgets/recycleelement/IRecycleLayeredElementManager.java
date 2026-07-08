package com.bytedance.ies.sdk.widgets.recycleelement;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes18.dex */
public interface IRecycleLayeredElementManager {
    boolean needReuse();

    void recycle();

    void reuse(Fragment fragment, DataChannel dataChannel);
}
