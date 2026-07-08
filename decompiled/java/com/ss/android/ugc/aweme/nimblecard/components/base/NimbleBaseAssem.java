package com.ss.android.ugc.aweme.nimblecard.components.base;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1587906Jp;
import X.InterfaceC685620Quu;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.nimblecard.components.image.ui.NimbleImageListAssem;
import java.util.List;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public abstract class NimbleBaseAssem<T extends InterfaceC685620Quu> extends ReusedUISlotAssem<NimbleBaseAssem<T>> implements InterfaceC712990Rxx<T> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS574S0100000_30((NimbleBaseAssem) this, 68));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS574S0100000_30((NimbleBaseAssem) this, 69));

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        ((NimbleImageListAssem) this).up(interfaceC1587906Jp);
    }
}
