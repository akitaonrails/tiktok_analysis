package com.ss.android.ugc.aweme.search.arch.v2.protocol.card;

import X.C03H5;
import X.C0PHI;
import X.C13IQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchCardProtocol<T extends InterfaceC594520NTm> extends ISearchCardBaseProtocol {
    boolean Hd1(T t);

    ReusedUIAssem<? extends C03H5> IM2();

    Class<? extends PowerCell<? extends InterfaceC1891350zJl>> T2();

    InterfaceC655050Pmh U42(T t);

    String Zm1();

    C0PHI<T> getConfig();

    C13IQ<T> getDataType();
}
