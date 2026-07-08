package com.ss.android.ugc.aweme.setting.services;

import X.AbstractC666100QAu;
import X.C10E3;
import X.C10F0;
import X.C10F3;
import X.C10F6;
import X.C10F8;
import X.C10FJ;
import X.C1260870iur;
import X.C844320XAg;
import X.InterfaceC1642506bv;
import X.InterfaceC1910030znt;
import X.InterfaceC19279210be;
import X.InterfaceC19572111hn;
import Y.ACallableS1S1001000_28;
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
public abstract class BaseSettingServiceImpl implements ISettingService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ BatchUpdatePushSwitchesResp batchSetPushSettingItems(String str, int i, boolean z, String str2, Function1<? super Exception, Unit> function1);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ BatchUpdatePushSwitchesResp batchSetPushSettingItems(String str, boolean z, Function1<? super Exception, Unit> function1);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String buildFeedbackUrl(String str, Map<String, String> map);

    public abstract /* synthetic */ boolean enableBACALogic();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getAbi();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getAppLanguage();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getAppLogRegion();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getCarrierRegionV2();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ Locale getCountryLocale();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ InterfaceC1910030znt getCurrentI18nItem(Context context);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ InterfaceC19572111hn getEventTracker();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ C10E3 getFetchPushOffReasonManager();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ List<InterfaceC1910030znt> getI18nItems();

    public abstract /* synthetic */ List<String> getInteractionPushSettingItemsString(String str);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getLanguage(Locale locale);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ Locale getLocale(String str);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ Map<String, InterfaceC1910030znt> getLocaleMap();

    public abstract /* synthetic */ C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> getPrivateSettingChangePresenter();

    public abstract /* synthetic */ C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> getPushSettingFetchPresenter();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getSysLanguage();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ String getTheme(int i);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ void installCommonParams();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean isArabicLang(Context context);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean isFirstShowBAOrCARedDot();

    public abstract /* synthetic */ boolean isIndonesiaByMcc();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean isKorean();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean isShowFamilyPairingForNotLoginUser();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean isStudioInappM10nCenterRevampEnabled();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean needShowProfileGuideView();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean needShowRedDotOnMyProfileMore();

    public abstract /* synthetic */ void openTermsPage(Activity activity);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ List<C10FJ> providePushSettingCallbackList();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ void requestTurnOnAdAuthorization(Context context, InterfaceC19279210be interfaceC19279210be);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ BaseResponse setPushPrivateSettingItem(String str, int i);

    public abstract /* synthetic */ void setTheme(int i, String str);

    public abstract /* synthetic */ boolean shouldShowBusinessAccount();

    public abstract /* synthetic */ boolean shouldShowCreatorToolsDot();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean shouldUseFasterPaging();

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ void showDMSettingSheet(InterfaceC1642506bv interfaceC1642506bv);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public abstract /* synthetic */ boolean startFeedbackRecordActivity(Activity activity, String str, Integer num);

    public abstract /* synthetic */ void switchLocale(String str, String str2, Context context);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> providePrivateSettingChangePresenter() {
        return new C10F3();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> providePushSettingChangePresenter() {
        return new C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0>() { // from class: X.10F1
            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onSuccess() {
                K k;
                T t = this.LL;
                if (t == 0 || t.getData() == null || (k = this.LLILLJJLI) == 0) {
                    return;
                }
                ((C10F0) k).A();
            }

            {
                LJIIJ(new AbstractC666100QAu<BaseResponse>() { // from class: X.10F2
                    @Override // X.AbstractC666100QAu
                    public final boolean checkParams(Object... objArr) {
                        if (objArr.length == 2) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.AbstractC666100QAu
                    public final boolean sendRequest(Object... objArr) {
                        if (!super.sendRequest(objArr)) {
                            return false;
                        }
                        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS1S1001000_28((String) objArr[0], ((Integer) objArr[1]).intValue(), 0), 0);
                        return true;
                    }
                });
            }

            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onFailed(Exception exc) {
                K k = this.LLILLJJLI;
                if (k != 0) {
                    ((C10F0) k).rY();
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> providePushSettingFetchPresenter() {
        return new C10F6();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public String getReleaseBuildString() {
        return C844320XAg.LIZ();
    }
}
