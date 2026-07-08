package com.bytedance.push.settings;

import X.InterfaceC810260VqS;
import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public interface ILocalSettings {
    void registerValChanged(Context context, String str, String str2, InterfaceC810260VqS interfaceC810260VqS);

    void unregisterValChanged(InterfaceC810260VqS interfaceC810260VqS);
}
