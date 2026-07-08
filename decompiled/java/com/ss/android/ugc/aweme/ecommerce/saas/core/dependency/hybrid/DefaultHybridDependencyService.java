package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid;

import X.C05FI;
import X.C1168160gVK;
import X.C1168200gVO;
import X.C13BV;
import X.C1551080qSw;
import X.C1551950qUL;
import X.C2097608Jq;
import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class DefaultHybridDependencyService implements IHybridDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public String geckoXRootDir() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public String getGeckoHost() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public String getGeckoXDeployment() {
        return "online";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public Long getLatestChannelVersion(String str, String str2, String str3) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public void handleSaaSSparkContext(SparkContext sparkContext, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public C1551950qUL initGeckoXMultiClient() {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public boolean isGeckoBundleExists(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public boolean isLocalTestChannel() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public Forest getForestProvider() {
        throw new C05FI("must override this func.");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public String getAccessKey() {
        int i = C1551080qSw.LIZ[getGeckoEnvironment().ordinal()];
        return i != 1 ? i != 2 ? "5ae177d789b2f86a9611d44282aa47c0" : "cb50eeeb5df4705aa5544c9c8db87c4c" : "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public Map<String, String> getNetworkCommonParams() {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public Map<String, Object> provideCustomGlobalProps() {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public GeckoGlobalConfig.ENVType getGeckoEnvironment() {
        return GeckoGlobalConfig.ENVType.DEV;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public Uri bulletUriOrdToNew(String str) {
        return UriProtector.parse(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public List<C1168160gVK> getSettings(List<C1168200gVO> list) {
        return C13BV.INSTANCE;
    }
}
