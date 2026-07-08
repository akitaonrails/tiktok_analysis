package com.ss.android.ugc.rtc.plugin;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.rtc.spi.LyraxPluginImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_rtc_plugin_ILyraxPlugin_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_rtc_plugin_ILyraxPlugin_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_rtc_plugin_ILyraxPlugin_SPI_AAB_DELEGATE();
    public static final C01GW LyraxPluginImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(748));

    private final LyraxPluginImpl getLyraxPluginImplinstance() {
        return (LyraxPluginImpl) LyraxPluginImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ILyraxPlugin> getServices() {
        ArrayList<ILyraxPlugin> arrayList = new ArrayList<>();
        arrayList.add(getLyraxPluginImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ILyraxPlugin getService() {
        return getLyraxPluginImplinstance();
    }
}
