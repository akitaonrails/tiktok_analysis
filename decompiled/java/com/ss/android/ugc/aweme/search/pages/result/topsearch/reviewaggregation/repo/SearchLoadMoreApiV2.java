package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501190pAT;
import X.InterfaceC1501240pAY;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchLoadMoreApiV2 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1844));

    public interface Api {
        @InterfaceC1501240pAY("/aweme/v2/search/loadmore/")
        @InterfaceC1485505rh
        Object LIZ(@InterfaceC1501190pAT Map<String, String> map, InterfaceC1364105Vn<? super SearchLoadMoreV2Response> interfaceC1364105Vn);

        @InterfaceC1501240pAY("{path}")
        @InterfaceC1485505rh
        Object loadMore(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501190pAT Map<String, String> map, InterfaceC1364105Vn<? super SearchLoadMoreV2Response> interfaceC1364105Vn);
    }
}
