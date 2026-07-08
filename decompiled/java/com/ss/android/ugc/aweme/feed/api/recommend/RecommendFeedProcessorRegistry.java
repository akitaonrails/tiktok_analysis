package com.ss.android.ugc.aweme.feed.api.recommend;

import X.C01GW;
import X.C0XLL;
import X.C19719612Di;
import X.C452501pT;
import X.InterfaceC1333005Jo;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendFeedProcessorRegistry {
    public static final RecommendFeedProcessorRegistry INSTANCE = new RecommendFeedProcessorRegistry();
    public static final C01GW providers$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(323));
    public static final int $stable = 8;

    private final List<IRecommendFeedProcessorProvider> getProviders() {
        return (List) providers$delegate.getValue();
    }

    public final List<InterfaceC1333005Jo<C0XLL>> requestProcessors() {
        List<IRecommendFeedProcessorProvider> providers = getProviders();
        ArrayList arrayList = new ArrayList();
        Iterator<IRecommendFeedProcessorProvider> it2 = providers.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().LIZ(), arrayList);
        }
        return arrayList;
    }

    public final List<InterfaceC1333005Jo<FeedItemList>> responseProcessors() {
        List<IRecommendFeedProcessorProvider> providers = getProviders();
        ArrayList arrayList = new ArrayList();
        Iterator<IRecommendFeedProcessorProvider> it2 = providers.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().LIZIZ(), arrayList);
        }
        return arrayList;
    }
}
