package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search;

import X.C2097608Jq;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultSearchDependencyService implements ISearchDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public boolean enableMergeMain() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public JSONObject getEcommerceSearchInfo() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public String getLatestSearchId() {
        return "";
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public boolean isRootFragmentExperimentP2LCEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public Map<String, String> fetchSearchParams(String str, String str2) {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public Map<String, String> getLogParamsFromSearch(String str, String str2, String... strArr) {
        return C2097608Jq.LJ();
    }
}
