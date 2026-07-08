package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search;

import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public interface ISearchDependencyService extends IECommerceHostService {
    boolean enableMergeMain();

    Map<String, String> fetchSearchParams(String str, String str2);

    JSONObject getEcommerceSearchInfo();

    String getLatestSearchId();

    Map<String, String> getLogParamsFromSearch(String str, String str2, String... strArr);

    boolean isRootFragmentExperimentP2LCEnable();
}
