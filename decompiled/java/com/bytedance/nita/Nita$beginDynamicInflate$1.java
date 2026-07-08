package com.bytedance.nita;

import X.EnumC21153717qJ;
import X.InterfaceC21263718Jf;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.nita.api.NitaActivityDynamicView;

/* JADX INFO: loaded from: classes33.dex */
public final class Nita$beginDynamicInflate$1 extends NitaActivityDynamicView {
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC21263718Jf LLILZLL;
    public final /* synthetic */ EnumC21153717qJ LLIZ;

    @Override // com.bytedance.nita.api.NitaActivityDynamicView, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.nita.api.NitaActivityDynamicView, X.InterfaceC21263418Jc
    public final EnumC21153717qJ LIZLLL() {
        return this.LLIZ;
    }

    @Override // X.AbstractC21264018Ji, X.InterfaceC21263418Jc
    public final InterfaceC21263718Jf LJFF() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC21263418Jc
    public final String LJIIIZ() {
        return this.LLILZIL;
    }

    public Nita$beginDynamicInflate$1(String str, InterfaceC21263718Jf interfaceC21263718Jf, EnumC21153717qJ enumC21153717qJ) {
        this.LLILZIL = str;
        this.LLILZLL = interfaceC21263718Jf;
        this.LLIZ = enumC21153717qJ;
    }
}
