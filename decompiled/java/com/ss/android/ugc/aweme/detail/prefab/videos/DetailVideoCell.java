package com.ss.android.ugc.aweme.detail.prefab.videos;

import X.C01GW;
import X.C13LE;
import X.C607770Nsd;
import X.C737910Sx3;
import X.EnumC452301pR;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.ViewOnLayoutChangeListenerC20306814d0;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.detail.arch.videos.CollisionResolver;
import com.ss.android.ugc.aweme.detail.prefab.videos.DetailVideoCellAssem;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public abstract class DetailVideoCell<ASSEM extends DetailVideoCellAssem, T extends C607770Nsd> extends AssemPowerCell<ASSEM, T> {
    public final C01GW LLIZ = C737910Sx3.LIZLLL(this, C13LE.LIZ(CollisionResolver.class), AFwS274S0000000_30.get$arr$(52), EnumC452301pR.SYNCHRONIZED);

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return null;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        this.itemView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC20306814d0(this, 0));
    }
}
