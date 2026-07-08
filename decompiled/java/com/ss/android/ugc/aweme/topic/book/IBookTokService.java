package com.ss.android.ugc.aweme.topic.book;

import X.C0O3E;
import X.C0O7A;
import X.C0OFH;
import X.C19EG;
import X.InterfaceC346201Wa;
import android.content.Context;
import com.ss.android.ugc.aweme.favorites.business.monitor.TopicApiNetworkPartner;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IBookTokService<T extends C0O3E, S extends C0O3E, D, E> {
    TopicApiNetworkPartner LIZ();

    boolean LIZIZ(int i, C19EG c19eg, List list);

    C0OFH LIZJ(Context context);

    InterfaceC346201Wa<C0O7A<S>> LIZLLL(String str);

    InterfaceC346201Wa<C0O7A<T>> LJ(String str);
}
