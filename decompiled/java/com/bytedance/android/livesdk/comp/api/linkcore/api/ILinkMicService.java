package com.bytedance.android.livesdk.comp.api.linkcore.api;

import X.C006A;
import X.C1303170k15;
import X.C1AXM;
import X.C2181461AZc;
import X.C965680bEk;
import X.EnumC945310aht;
import X.InterfaceC925040aBC;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes16.dex */
public interface ILinkMicService extends C006A {
    void VH2(View view);

    C1AXM Ws2(long j, long j2, Context context, EnumC945310aht enumC945310aht, String str, boolean z, boolean z2);

    InterfaceC925040aBC builder();

    C965680bEk jz2();

    C2181461AZc l31(Context context, long j, long j2, String str, EnumC945310aht enumC945310aht, boolean z);

    C1303170k15 y22();

    boolean zu(View view, ViewGroup.LayoutParams layoutParams, String str);
}
