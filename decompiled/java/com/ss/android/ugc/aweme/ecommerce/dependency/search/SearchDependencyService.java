package com.ss.android.ugc.aweme.ecommerce.dependency.search;

import X.C04TD;
import X.C07H4;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class SearchDependencyService implements ISearchDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public boolean enableMergeMain() {
        SAFHelper.LIZ.getClass();
        return SAFHelper.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public JSONObject getEcommerceSearchInfo() {
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService != null) {
            return iSearchService.getEcommerceSearchInfo();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public String getLatestSearchId() {
        String latestSearchId;
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        return (iSearchService == null || (latestSearchId = iSearchService.getLatestSearchId()) == null) ? "" : latestSearchId;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public boolean isRootFragmentExperimentP2LCEnable() {
        return C07H4.LIZ();
    }

    public static ISearchDependencyService createISearchDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ISearchDependencyService.class, z);
        if (objLIZ != null) {
            return (ISearchDependencyService) objLIZ;
        }
        if (C04TD.P == null) {
            synchronized (ISearchDependencyService.class) {
                if (C04TD.P == null) {
                    C04TD.P = new SearchDependencyService();
                }
            }
        }
        return C04TD.P;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public Map<String, String> fetchSearchParams(String str, String str2) {
        Map<String, String> mapFetchSearchParams;
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService == null || (mapFetchSearchParams = iSearchService.fetchSearchParams(str, str2)) == null) {
            return new LinkedHashMap();
        }
        return mapFetchSearchParams;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService
    public Map<String, String> getLogParamsFromSearch(String str, String str2, String... strArr) {
        return ((ISearchService) ServiceManager.get().getService(ISearchService.class)).getLogParamsFromSearch(str, str2, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
