package com.ss.android.ugc.aweme.aigc.graph.plugin;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitWorkflowQuotaPlugin;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_aigc_graph_plugin_IAIGCWorkflowPlugin_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_aigc_graph_plugin_IAIGCWorkflowPlugin_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_aigc_graph_plugin_IAIGCWorkflowPlugin_SPI_AAB_DELEGATE();
    public static final C01GW AIPortraitWorkflowQuotaPlugininstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(176));

    private final AIPortraitWorkflowQuotaPlugin getAIPortraitWorkflowQuotaPlugininstance() {
        return (AIPortraitWorkflowQuotaPlugin) AIPortraitWorkflowQuotaPlugininstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IAIGCWorkflowPlugin> getServices() {
        ArrayList<IAIGCWorkflowPlugin> arrayList = new ArrayList<>();
        arrayList.add(getAIPortraitWorkflowQuotaPlugininstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IAIGCWorkflowPlugin getService() {
        return getAIPortraitWorkflowQuotaPlugininstance();
    }
}
