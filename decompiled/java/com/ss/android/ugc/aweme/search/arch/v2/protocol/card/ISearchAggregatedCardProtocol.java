package com.ss.android.ugc.aweme.search.arch.v2.protocol.card;

import X.C03H5;
import X.InterfaceC1891350zJl;
import X.InterfaceC652500Pia;
import X.InterfaceC652570Pih;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchAggregatedCardProtocol extends ISearchCardProtocol<SearchMixFeed> {
    Class<? extends SearchAggregatedSubCardAssem<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> Kf0();

    List<InterfaceC1891350zJl> cJ1(InterfaceC652500Pia interfaceC652500Pia);

    InterfaceC652570Pih cW();
}
