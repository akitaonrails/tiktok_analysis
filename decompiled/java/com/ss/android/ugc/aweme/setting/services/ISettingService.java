package com.ss.android.ugc.aweme.setting.services;

import X.AbstractC666100QAu;
import X.C10E3;
import X.C10F0;
import X.C10F8;
import X.C10FJ;
import X.C1260870iur;
import X.InterfaceC1642506bv;
import X.InterfaceC1910030znt;
import X.InterfaceC19279210be;
import X.InterfaceC19572111hn;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public interface ISettingService {
    BatchUpdatePushSwitchesResp batchSetPushSettingItems(String str, int i, boolean z, String str2, Function1<? super Exception, Unit> function1);

    BatchUpdatePushSwitchesResp batchSetPushSettingItems(String str, boolean z, Function1<? super Exception, Unit> function1);

    String buildFeedbackUrl(String str, Map<String, String> map);

    String getAbi();

    String getAppLanguage();

    String getAppLogRegion();

    String getCarrierRegionV2();

    Locale getCountryLocale();

    InterfaceC1910030znt getCurrentI18nItem(Context context);

    InterfaceC19572111hn getEventTracker();

    C10E3 getFetchPushOffReasonManager();

    List<InterfaceC1910030znt> getI18nItems();

    String getLanguage(Locale locale);

    Locale getLocale(String str);

    Map<String, InterfaceC1910030znt> getLocaleMap();

    String getReleaseBuildString();

    String getSysLanguage();

    String getTheme(int i);

    void installCommonParams();

    boolean isArabicLang(Context context);

    boolean isFirstShowBAOrCARedDot();

    boolean isKorean();

    boolean isShowFamilyPairingForNotLoginUser();

    boolean isStudioInappM10nCenterRevampEnabled();

    boolean needShowProfileGuideView();

    boolean needShowRedDotOnMyProfileMore();

    C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> providePrivateSettingChangePresenter();

    List<C10FJ> providePushSettingCallbackList();

    C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> providePushSettingChangePresenter();

    C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> providePushSettingFetchPresenter();

    void requestTurnOnAdAuthorization(Context context, InterfaceC19279210be interfaceC19279210be);

    BaseResponse setPushPrivateSettingItem(String str, int i);

    boolean shouldUseFasterPaging();

    void showDMSettingSheet(InterfaceC1642506bv interfaceC1642506bv);

    boolean startFeedbackRecordActivity(Activity activity, String str, Integer num);
}
