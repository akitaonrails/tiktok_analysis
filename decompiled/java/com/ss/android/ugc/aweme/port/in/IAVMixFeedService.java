package com.ss.android.ugc.aweme.port.in;

import X.InterfaceC1169320gXC;
import android.app.Activity;

/* JADX INFO: loaded from: classes15.dex */
public interface IAVMixFeedService {
    boolean needCreateFirstMix();

    boolean needShowAddOrRemoveButton();

    void showAddToMixInPublishPage(Activity activity, InterfaceC1169320gXC interfaceC1169320gXC, String str, String str2, String str3, String str4);

    void updateFeedEvent(String str);
}
