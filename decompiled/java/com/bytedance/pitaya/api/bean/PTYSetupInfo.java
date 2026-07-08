package com.bytedance.pitaya.api.bean;

import X.C1AWN;
import X.InterfaceC1294060jmO;
import com.bytedance.pitaya.api.PTYCustomURLHost;
import com.bytedance.pitaya.api.PTYDIDCallback;
import com.bytedance.pitaya.api.PTYLLMInferenceHandler;
import com.bytedance.pitaya.api.PTYPackageFilterCallback;
import com.bytedance.pitaya.api.PTYPyBinderCallback;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.api.PTYUIDCallback;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class PTYSetupInfo implements ReflectionCall {
    public String aid;
    public long appStartTime;
    public String appVersion;
    public boolean autoRequestUpdate;
    public PTYCepMode cepMode;
    public String channel;
    public PTYCleanStrategy cleanStrategy;
    public PTYCustomURLHost customURLHost;
    public PTYDIDCallback didCallback;
    public int downloadConcurrency;
    public boolean enableResourcePolicyCheck;
    public boolean flEnable;
    public boolean idleDownloadEnable;
    public boolean isDebugMode;
    public PTYLLMInferenceHandler llmInferenceHandler;
    public List<String> moduleList;
    public PTYPackageFilterCallback packageFilterCallback;
    public String pluginVersion;
    public PTYPyBinderCallback pyBinder;
    public int pyConcurrency;
    public PTYSettingsCallback settingsCallback;
    public JSONObject settingsContent;
    public PTYSetupMode setupMode;
    public PTYUIDCallback uidCallback;

    @InterfaceC1294060jmO
    public PTYSetupInfo() {
        this(new C1AWN());
    }

    public final String getAid() {
        return this.aid;
    }

    public final long getAppStartTime() {
        return this.appStartTime;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final boolean getAutoRequestUpdate() {
        return this.autoRequestUpdate;
    }

    public final PTYCepMode getCepMode() {
        return this.cepMode;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final PTYCleanStrategy getCleanStrategy() {
        return this.cleanStrategy;
    }

    public final PTYCustomURLHost getCustomURLHost() {
        return this.customURLHost;
    }

    public final PTYDIDCallback getDidCallback() {
        return this.didCallback;
    }

    public final int getDownloadConcurrency() {
        return this.downloadConcurrency;
    }

    public final boolean getEnableResourcePolicyCheck() {
        return this.enableResourcePolicyCheck;
    }

    public final boolean getFlEnable() {
        return this.flEnable;
    }

    public final boolean getIdleDownloadEnable() {
        return this.idleDownloadEnable;
    }

    public final PTYLLMInferenceHandler getLlmInferenceHandler() {
        return this.llmInferenceHandler;
    }

    public final List<String> getModuleList() {
        return this.moduleList;
    }

    public final PTYPackageFilterCallback getPackageFilterCallback() {
        return this.packageFilterCallback;
    }

    public final String getPluginVersion() {
        return this.pluginVersion;
    }

    public final PTYPyBinderCallback getPyBinder() {
        return this.pyBinder;
    }

    public final int getPyConcurrency() {
        return this.pyConcurrency;
    }

    public final PTYSettingsCallback getSettingsCallback() {
        return this.settingsCallback;
    }

    public final JSONObject getSettingsContent() {
        return this.settingsContent;
    }

    public final PTYSetupMode getSetupMode() {
        return this.setupMode;
    }

    public final PTYUIDCallback getUidCallback() {
        return this.uidCallback;
    }

    public final boolean isDebugMode() {
        return this.isDebugMode;
    }

    public PTYSetupInfo(C1AWN c1awn) {
        this.aid = "";
        this.appVersion = "";
        this.channel = "";
        this.downloadConcurrency = 2;
        this.autoRequestUpdate = true;
        this.pyConcurrency = 2;
        this.setupMode = PTYSetupMode.Normal;
        this.cleanStrategy = PTYCleanStrategy.Normal;
        this.cepMode = PTYCepMode.Dependent;
        this.aid = c1awn.LIZ;
        this.appVersion = c1awn.LIZIZ;
        this.channel = c1awn.LIZJ;
        this.didCallback = c1awn.LIZLLL;
        this.uidCallback = c1awn.LJ;
        this.packageFilterCallback = c1awn.LJFF;
        this.settingsCallback = c1awn.LJI;
        this.settingsContent = c1awn.LJII;
        this.downloadConcurrency = c1awn.LJIIIIZZ;
        this.autoRequestUpdate = c1awn.LJIIIZ;
        this.idleDownloadEnable = false;
        this.pluginVersion = c1awn.LJIIJ;
        this.pyConcurrency = c1awn.LJIIJJI;
        this.pyBinder = null;
        this.flEnable = false;
        this.isDebugMode = c1awn.LJIIL;
        this.customURLHost = null;
        this.moduleList = c1awn.LJIILIIL;
        this.setupMode = c1awn.LJIILJJIL;
        this.cleanStrategy = c1awn.LJIILL;
        this.cepMode = c1awn.LJIILLIIL;
        this.appStartTime = 0L;
        this.enableResourcePolicyCheck = c1awn.LJIIZILJ;
        this.llmInferenceHandler = null;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setAppStartTime(long j) {
        this.appStartTime = j;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setAutoRequestUpdate(boolean z) {
        this.autoRequestUpdate = z;
    }

    public final void setCepMode(PTYCepMode pTYCepMode) {
        this.cepMode = pTYCepMode;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final void setCleanStrategy(PTYCleanStrategy pTYCleanStrategy) {
        this.cleanStrategy = pTYCleanStrategy;
    }

    public final void setCustomURLHost(PTYCustomURLHost pTYCustomURLHost) {
        this.customURLHost = pTYCustomURLHost;
    }

    public final void setDebugMode(boolean z) {
        this.isDebugMode = z;
    }

    public final void setDidCallback(PTYDIDCallback pTYDIDCallback) {
        this.didCallback = pTYDIDCallback;
    }

    public final void setDownloadConcurrency(int i) {
        this.downloadConcurrency = i;
    }

    public final void setEnableResourcePolicyCheck(boolean z) {
        this.enableResourcePolicyCheck = z;
    }

    public final void setFlEnable(boolean z) {
        this.flEnable = z;
    }

    public final void setIdleDownloadEnable(boolean z) {
        this.idleDownloadEnable = z;
    }

    public final void setLlmInferenceHandler(PTYLLMInferenceHandler pTYLLMInferenceHandler) {
        this.llmInferenceHandler = pTYLLMInferenceHandler;
    }

    public final void setModuleList(List<String> list) {
        this.moduleList = list;
    }

    public final void setPackageFilterCallback(PTYPackageFilterCallback pTYPackageFilterCallback) {
        this.packageFilterCallback = pTYPackageFilterCallback;
    }

    public final void setPluginVersion(String str) {
        this.pluginVersion = str;
    }

    public final void setPyBinder(PTYPyBinderCallback pTYPyBinderCallback) {
        this.pyBinder = pTYPyBinderCallback;
    }

    public final void setPyConcurrency(int i) {
        this.pyConcurrency = i;
    }

    public final void setSettingsCallback(PTYSettingsCallback pTYSettingsCallback) {
        this.settingsCallback = pTYSettingsCallback;
    }

    public final void setSettingsContent(JSONObject jSONObject) {
        this.settingsContent = jSONObject;
    }

    public final void setSetupMode(PTYSetupMode pTYSetupMode) {
        this.setupMode = pTYSetupMode;
    }

    public final void setUidCallback(PTYUIDCallback pTYUIDCallback) {
        this.uidCallback = pTYUIDCallback;
    }

    @InterfaceC1294060jmO
    public PTYSetupInfo(String str, String str2, String str3, PTYDIDCallback pTYDIDCallback, PTYUIDCallback pTYUIDCallback, PTYPackageFilterCallback pTYPackageFilterCallback, PTYSettingsCallback pTYSettingsCallback, int i, boolean z, String str4, int i2, PTYPyBinderCallback pTYPyBinderCallback, boolean z2, boolean z3, PTYCustomURLHost pTYCustomURLHost) {
        this(new C1AWN());
        this.aid = str;
        this.appVersion = str2;
        this.channel = str3;
        this.didCallback = pTYDIDCallback;
        this.uidCallback = pTYUIDCallback;
        this.packageFilterCallback = pTYPackageFilterCallback;
        this.settingsCallback = pTYSettingsCallback;
        this.downloadConcurrency = i;
        this.autoRequestUpdate = z;
        this.pluginVersion = str4;
        this.pyConcurrency = i2;
        this.pyBinder = pTYPyBinderCallback;
        this.flEnable = z2;
        this.isDebugMode = z3;
        this.customURLHost = pTYCustomURLHost;
    }

    @InterfaceC1294060jmO
    public PTYSetupInfo(String str, String str2, String str3, PTYDIDCallback pTYDIDCallback, PTYUIDCallback pTYUIDCallback, PTYPackageFilterCallback pTYPackageFilterCallback, PTYSettingsCallback pTYSettingsCallback, int i, boolean z, boolean z2, String str4, int i2, PTYPyBinderCallback pTYPyBinderCallback, boolean z3, boolean z4, PTYCustomURLHost pTYCustomURLHost) {
        this(new C1AWN());
        this.aid = str;
        this.appVersion = str2;
        this.channel = str3;
        this.didCallback = pTYDIDCallback;
        this.uidCallback = pTYUIDCallback;
        this.packageFilterCallback = pTYPackageFilterCallback;
        this.settingsCallback = pTYSettingsCallback;
        this.downloadConcurrency = i;
        this.autoRequestUpdate = z;
        this.idleDownloadEnable = z2;
        this.pluginVersion = str4;
        this.pyConcurrency = i2;
        this.pyBinder = pTYPyBinderCallback;
        this.flEnable = z3;
        this.isDebugMode = z4;
        this.customURLHost = pTYCustomURLHost;
    }
}
