package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.fragment;

import X.C511470K4b;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;

/* JADX INFO: loaded from: classes32.dex */
public final class SubSpaceFeedLynxUI extends LynxUI<C511470K4b> {
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C511470K4b(context);
    }

    @InterfaceC1312540kGC(name = "base_info")
    public final void setInitDataMap(ReadableMap readableMap) {
        ((C511470K4b) this.mView).setInitDataMap(readableMap);
    }
}
