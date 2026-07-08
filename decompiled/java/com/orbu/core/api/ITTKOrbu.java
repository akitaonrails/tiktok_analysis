package com.orbu.core.api;

import android.content.Context;
import com.orbu.core.adapter.TTKOrbuContext;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.config.BootConfig;
import com.orbu.core.config.IConfigCenter;
import com.orbu.core.init.HardBlockConfig;
import com.orbu.core.init.HardBlockConfigManager;
import com.orbu.core.init.TTKNativeNetworkManager;
import ttp.orbu.sdk.TTPOrbuUtil;

/* JADX INFO: loaded from: classes14.dex */
public interface ITTKOrbu {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void activeOrbu(TTKOrbuContext tTKOrbuContext, String str, ITTKOrbusActiveCallback iTTKOrbusActiveCallback);

    int cleanUpTTP(Context context, String str);

    boolean enableInterceptor();

    BootConfig getBootConfig();

    String getCurOrbuInternalState();

    String getCurOrbuState();

    String getExperimentGroup();

    String getOrbuSDKVersion();

    String getRuleHash();

    String getStoreRegion();

    boolean hitSampleDrop();

    int nativeReportStrategy();

    void setConfigCenter(IConfigCenter iConfigCenter);

    void setDebug(boolean z);

    void setDelegate(ITTKOrbu iTTKOrbu);

    void setHardBlockConfig(HardBlockConfig hardBlockConfig);

    <T extends ITTKOrbuRequestPayload> TTKResponse shouldInterceptTTKRequest(ITTKOrbuRequest<? extends T> iTTKOrbuRequest);

    public static final class DefaultImpls {
        public static String getCurOrbuInternalState(ITTKOrbu iTTKOrbu) {
            return "unknown";
        }

        public static String getExperimentGroup(ITTKOrbu iTTKOrbu) {
            return null;
        }

        public static String getStoreRegion(ITTKOrbu iTTKOrbu) {
            return null;
        }

        public static boolean hitSampleDrop(ITTKOrbu iTTKOrbu) {
            return false;
        }

        public static int nativeReportStrategy(ITTKOrbu iTTKOrbu) {
            return 0;
        }

        public static void setConfigCenter(ITTKOrbu iTTKOrbu, IConfigCenter iConfigCenter) {
        }

        public static void setDelegate(ITTKOrbu iTTKOrbu, ITTKOrbu iTTKOrbu2) {
        }

        public static String getOrbuSDKVersion(ITTKOrbu iTTKOrbu) {
            String str = TTPOrbuUtil.INSTANCE.getVersion().get("orbuculum");
            if (str == null) {
                return "0.17.0-alpha.0";
            }
            return str;
        }

        public static String getRuleHash(ITTKOrbu iTTKOrbu) {
            return TTPOrbuUtil.INSTANCE.getVersion().get("orbuHash");
        }

        public static void setDebug(ITTKOrbu iTTKOrbu, boolean z) {
            TTKNativeNetworkManager.setDebug(z);
        }

        public static void setHardBlockConfig(ITTKOrbu iTTKOrbu, HardBlockConfig hardBlockConfig) {
            HardBlockConfigManager.INSTANCE.setConfig(hardBlockConfig);
        }

        public static int cleanUpTTP(ITTKOrbu iTTKOrbu, Context context, String str) {
            return TTPOrbuUtil.INSTANCE.cleanupTTP(context, str).getCode();
        }
    }
}
