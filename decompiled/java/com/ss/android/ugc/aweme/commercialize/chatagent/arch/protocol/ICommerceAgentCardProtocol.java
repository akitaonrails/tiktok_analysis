package com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol;

import X.C03H5;
import X.C06KX;
import X.C13IQ;
import X.InterfaceC1467705op;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;

/* JADX INFO: loaded from: classes3.dex */
public interface ICommerceAgentCardProtocol<T extends InterfaceC1467705op> extends C06KX {
    Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2();

    C13IQ<T> getDataType();

    InterfaceC1891350zJl vC(T t);

    boolean z11(T t);
}
