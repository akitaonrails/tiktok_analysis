package com.ss.android.ugc.aweme.feed.spi;

import X.C13BV;
import X.C1601650rmV;
import X.InterfaceC1333005Jo;
import com.ss.android.ugc.aweme.feed.api.recommend.IRecommendFeedProcessorProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class RecordComponentParseRecommendFeedProcessorProvider implements IRecommendFeedProcessorProvider {
    @Override // com.ss.android.ugc.aweme.feed.api.recommend.IRecommendFeedProcessorProvider
    public final List<InterfaceC1333005Jo<FeedItemList>> LIZIZ() {
        return Collections.singletonList(new C1601650rmV() { // from class: X.0rmJ
            @Override // X.C1601650rmV, X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<FeedItemList> c1440305kP) {
                if (!C04VM.LIZ()) {
                    return;
                }
                super.LIZ(c1440305kP);
            }

            @Override // X.C1601650rmV
            public final void LIZIZ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
                if (!C04VM.LIZ()) {
                    return;
                }
                final String strLIZ = C0T4A.LIZ(c1601460rmC.LIZ);
                final int i = c1601460rmC.LIZIZ;
                List<Aweme> items = feedItemList.getItems();
                if (items != null) {
                    for (final Aweme aweme : items) {
                        final String aid = aweme.getAid();
                        if (aid != null) {
                            C20684815ws.LJFF().submit(new Runnable() { // from class: X.01YY
                                public final void LIZ() {
                                    Pair pairLIZIZ = C705402pA.LIZIZ(aweme);
                                    String str = (String) pairLIZIZ.getFirst();
                                    int iIntValue = ((Number) pairLIZIZ.getSecond()).intValue();
                                    if (str.length() == 0) {
                                        return;
                                    }
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LJIIIIZZ("group_id", aid);
                                    c2344009Gk.LIZJ(i, "pull_type");
                                    c2344009Gk.LJIIIIZZ("enter_from", strLIZ);
                                    c2344009Gk.LIZJ(iIntValue, "component_count");
                                    c2344009Gk.LJIIIIZZ("server_return_component_ids", str);
                                    C20684815ws.LJIILLIIL("record_component_parse", c2344009Gk.LIZ);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("RecordComponentMobReporter@b928.reportComponentParse$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("RecordComponentMobReporter@b928.reportComponentParse$1");
                                }
                            });
                        }
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.feed.api.recommend.IRecommendFeedProcessorProvider
    public final C13BV LIZ() {
        return C13BV.INSTANCE;
    }
}
