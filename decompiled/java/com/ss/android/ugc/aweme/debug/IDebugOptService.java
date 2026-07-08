package com.ss.android.ugc.aweme.debug;

import X.InterfaceC2144108ad;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public interface IDebugOptService {
    void addDebugInfo(Map<String, String> map);

    void addDebugInfo(JSONObject jSONObject);

    boolean enableArtOpt();

    boolean enableEcommerce();

    boolean enableOpenPlatform();

    void enableSpi(String str);

    boolean enableTv();

    Class<? extends Fragment> getAnoleStubFragment();

    Class<? extends Fragment> getComplianceStubFragment();

    Class<? extends Fragment> getConfigStubFragment();

    Class<? extends Fragment> getDebugPanelClassName();

    boolean getDebugSceneStatus(InterfaceC2144108ad interfaceC2144108ad);

    Class<? extends Fragment> getNewUserStubFragment();

    Class<? extends Fragment> getVESDKStubFragment();

    boolean hasLiveCode();

    void init();

    boolean isEnableAotCompilationBeforeLaunch();

    boolean isEnableArtOpt();

    boolean isInDebugOptMode();

    boolean isOpen();

    boolean isSpiEnable(String str);

    void killAndRestart();

    void registerDebugScenes(HashSet<String> hashSet, HashSet<String> hashSet2);

    void saveDebugSceneStatus(boolean z, InterfaceC2144108ad interfaceC2144108ad);

    void showDebugOptTips();
}
