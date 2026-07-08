package com.ss.android.ugc.aweme.ecommerce.dependency;

import X.C04TD;
import X.C0T1N;
import X.C1047200dME;
import X.C1168160gVK;
import X.C1168200gVO;
import X.C1551950qUL;
import X.C1552050qUV;
import X.C1553670qX7;
import X.C1553710qXB;
import X.C2097608Jq;
import android.content.Context;
import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class HybridDependencyService implements IHybridDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public void handleSaaSSparkContext(SparkContext sparkContext, String str) {
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public String geckoXRootDir() {
        C1553670qX7.LIZ.getClass();
        return "offlineX";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public String getGeckoHost() {
        C1553670qX7.LIZ.getClass();
        return C1553670qX7.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public boolean isLocalTestChannel() {
        Context context = C1552050qUV.LIZ;
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public String getAccessKey() {
        return C1553670qX7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public Forest getForestProvider() {
        return C0T1N.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public GeckoGlobalConfig.ENVType getGeckoEnvironment() {
        return C1552050qUV.LJII();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public String getGeckoXDeployment() {
        return C1552050qUV.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public Map<String, String> getNetworkCommonParams() {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public C1551950qUL initGeckoXMultiClient() {
        return C1552050qUV.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public Map<String, Object> provideCustomGlobalProps() {
        return C2097608Jq.LJ();
    }

    public static IHybridDependencyService createIHybridDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IHybridDependencyService.class, z);
        if (objLIZ != null) {
            return (IHybridDependencyService) objLIZ;
        }
        if (C04TD.LLZLI == null) {
            synchronized (IHybridDependencyService.class) {
                if (C04TD.LLZLI == null) {
                    C04TD.LLZLI = new HybridDependencyService();
                }
            }
        }
        return C04TD.LLZLI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public Uri bulletUriOrdToNew(String str) {
        return C1047200dME.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public List<C1168160gVK> getSettings(List<C1168200gVO> list) {
        return C1553710qXB.LIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public boolean isGeckoBundleExists(String str) {
        return C1552050qUV.LJIIZILJ(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService
    public Long getLatestChannelVersion(String str, String str2, String str3) {
        return C1552050qUV.LJIIL(str2, str3);
    }
}
