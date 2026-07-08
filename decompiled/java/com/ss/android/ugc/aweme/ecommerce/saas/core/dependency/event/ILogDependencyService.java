package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event;

import X.C18C6;
import X.C1BMS;
import X.C2211641BhC;
import X.C443120HZe;
import X.InterfaceC2190351Anx;
import X.InterfaceC799320VXe;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public interface ILogDependencyService extends IECommerceHostService {
    void addAppLogEventPreProcessStageObserver(C1BMS c1bms);

    void addAppLogEventPreProcessStageObserverV2(InterfaceC799320VXe interfaceC799320VXe);

    void addApplogTrackEventObserver(InterfaceC2190351Anx interfaceC2190351Anx);

    void commonLogE(String str, String str2);

    void commonLogI(String str, String str2);

    void crashlyticsWrapperCatchException(Exception exc);

    void crashlyticsWrapperLog(int i, String str, String str2);

    void crashlyticsWrapperLogException(Throwable th);

    List<C443120HZe<String, String, JSONObject>> getBDBTMList(View view);

    Pair<Boolean, Boolean> getBDBTMReplaceSwitch();

    Pair<C18C6, C18C6> getBTMChain(View view, String str);

    ExecutorService getExecutorService();

    JSONObject getHeaderCopy();

    String getIid();

    String getInstallId();

    List<C2211641BhC> getPageRecordChain(View view, boolean z);

    List<C2211641BhC> getPageRecordChain(boolean z);

    String getPageRecordChainStringData(boolean z);

    String getPageRecordChainStringDataSubPage(View view, boolean z, String str);

    String getServerDeviceId();

    void mobClickCombinerEventV3(String str, Map<String, String> map);

    void onEventV3(String str, Map<String, String> map);

    void onEventV3(String str, JSONObject jSONObject);

    void onEventV3WithAppLogNewUtils(String str, JSONObject jSONObject);
}
