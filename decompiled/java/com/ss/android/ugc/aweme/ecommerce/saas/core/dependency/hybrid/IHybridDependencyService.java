package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid;

import X.C1168160gVK;
import X.C1168200gVO;
import X.C1551950qUL;
import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface IHybridDependencyService extends IECommerceHostService {
    Uri bulletUriOrdToNew(String str);

    String geckoXRootDir();

    String getAccessKey();

    Forest getForestProvider();

    GeckoGlobalConfig.ENVType getGeckoEnvironment();

    String getGeckoHost();

    String getGeckoXDeployment();

    Long getLatestChannelVersion(String str, String str2, String str3);

    Map<String, String> getNetworkCommonParams();

    List<C1168160gVK> getSettings(List<C1168200gVO> list);

    void handleSaaSSparkContext(SparkContext sparkContext, String str);

    C1551950qUL initGeckoXMultiClient();

    boolean isGeckoBundleExists(String str);

    boolean isLocalTestChannel();

    Map<String, Object> provideCustomGlobalProps();
}
