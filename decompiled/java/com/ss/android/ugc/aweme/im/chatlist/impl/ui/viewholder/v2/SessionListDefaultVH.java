package com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2;

import X.C01GW;
import X.C0Z86;
import X.C0Z8E;
import X.C452501pT;
import X.C883710Yld;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SessionListDefaultVH extends SessionListIMBaseVH<C0Z86, C883710Yld> {
    public final C01GW LLLILZJ;

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final String b6() {
        return "default_vh";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean k7(C0Z86 c0z86) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final C0Z8E b7() {
        return (C0Z8E) this.LLLILZJ.getValue();
    }

    public SessionListDefaultVH(View view) {
        super(view);
        this.LLLILZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 428));
    }
}
