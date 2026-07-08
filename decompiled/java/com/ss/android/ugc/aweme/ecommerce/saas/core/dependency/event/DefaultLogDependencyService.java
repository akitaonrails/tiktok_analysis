package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event;

import X.C13BV;
import X.C18C6;
import X.C1BMS;
import X.C2211641BhC;
import X.C443120HZe;
import X.C786410Ut5;
import X.InterfaceC2190351Anx;
import X.InterfaceC799320VXe;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultLogDependencyService implements ILogDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void addAppLogEventPreProcessStageObserver(C1BMS c1bms) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void addAppLogEventPreProcessStageObserverV2(InterfaceC799320VXe interfaceC799320VXe) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void addApplogTrackEventObserver(InterfaceC2190351Anx interfaceC2190351Anx) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void commonLogE(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void commonLogI(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void crashlyticsWrapperCatchException(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void crashlyticsWrapperLog(int i, String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void crashlyticsWrapperLogException(Throwable th) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public JSONObject getHeaderCopy() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public String getIid() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public String getInstallId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public String getPageRecordChainStringData(boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public String getPageRecordChainStringDataSubPage(View view, boolean z, String str) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public String getServerDeviceId() {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void mobClickCombinerEventV3(String str, Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void onEventV3(String str, Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void onEventV3(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void onEventV3WithAppLogNewUtils(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public Pair<Boolean, Boolean> getBDBTMReplaceSwitch() {
        Boolean bool = Boolean.FALSE;
        return new Pair<>(bool, bool);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public ExecutorService getExecutorService() {
        return C786410Ut5.h4();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public List<C443120HZe<String, String, JSONObject>> getBDBTMList(View view) {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public List<C2211641BhC> getPageRecordChain(boolean z) {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public Pair<C18C6, C18C6> getBTMChain(View view, String str) {
        return new Pair<>(new C18C6(), new C18C6());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public List<C2211641BhC> getPageRecordChain(View view, boolean z) {
        return C13BV.INSTANCE;
    }
}
