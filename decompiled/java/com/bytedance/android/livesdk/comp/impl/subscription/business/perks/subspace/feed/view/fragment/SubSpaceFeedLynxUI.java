package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment;

import X.C508340Jwe;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;

/* JADX INFO: loaded from: classes32.dex */
public final class SubSpaceFeedLynxUI extends LynxUI<C508340Jwe> {
    public SubSpaceFeedLynxUI(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C508340Jwe(context);
    }

    @InterfaceC1312540kGC(name = "base_info")
    public final void setInitDataMap(ReadableMap readableMap) {
        ((C508340Jwe) this.mView).setInitDataMap(readableMap);
    }
}
