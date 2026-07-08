package com.ss.android.ugc.profile.platform.framework.service;

import X.AbstractC1255880imo;
import X.AbstractC1255890imp;
import X.AbstractC1608810ry3;
import X.AbstractC1893000zMQ;
import X.AbstractC738140SxQ;
import X.C09Z8;
import X.C0CCZ;
import X.C0HTT;
import X.C0HZJ;
import X.C0OO0;
import X.C0QTN;
import X.C0SSX;
import X.C0TGX;
import X.C0XQ7;
import X.C10FJ;
import X.C1197160hG6;
import X.C11NZ;
import X.C1220000hqw;
import X.C1232410iAx;
import X.C1254580iki;
import X.C1254650ikp;
import X.C1254710ikv;
import X.C1255390im1;
import X.C1255780ime;
import X.C1256520inq;
import X.C1256630io1;
import X.C1257420ipI;
import X.C13IQ;
import X.C13LE;
import X.C15O7;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C19EG;
import X.C21508119Ff;
import X.C452070Ho5;
import X.C621180OYa;
import X.C680080Qly;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737030Svd;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1254690ikt;
import X.InterfaceC1254680iks;
import X.InterfaceC1257400ipG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1606880ruw;
import X.InterfaceC426680GoE;
import X.InterfaceC800130Va7;
import Y.ACallableS424S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.profile.IProfileAssemService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.profile.business.avatar.profile.AvatarPersonDataAdapter;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierActivity;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.redpoint.UserProfileBlockVM;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS47S0010000_35;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseProfileServiceImpl implements IProfileService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean canShowProfileFixedEntrance();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean checkAndHandleSaveFile(Bitmap bitmap, File file);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void checkAndRefreshUser(Fragment fragment);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean checkIDLocal(String str, Context context);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean checkIDNet(String str, String str2, String str3, Context context);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String disLikeAweme(Aweme aweme, int i, String str, int i2, int i3);

    public abstract /* synthetic */ String disLikeAweme(Aweme aweme, LinkData linkData);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void disLikeAwemeApi(String str, Map<String, String> map);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean enableShowFeatureVideoEntrance();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean getAdFakeUserProfileBugfixSetting();

    public abstract /* synthetic */ boolean getAndResetPauseAvatarAnim();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ C0QTN getAsyncInflater(Activity activity, int i);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ C0OO0 getAvatarPresenter();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ InterfaceC800130Va7 getCampusEducationSheetStatusRequestLegoTask();

    public abstract /* synthetic */ Drawable getEaseInOutGradientDrawable(float f, int i, boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ int getEnterpriseType(User user);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Fragment getFavoriteVideoListFragment(Context context, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Bundle getFavoriteVideoListFragmentArgs(Context context, int i, Boolean bool, String str, boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ PowerViewPagerFragmentItem<?> getFavoriteVideoListFragmentItem(Context context, int i, Boolean bool, String str, boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ C1197160hG6 getFavoriteVideoListTabMetadata(Context context);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Fragment getFavoriteVideoSearchResultFragment();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ AmeBaseFragment getI18nMyProfileFragment();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ AmeBaseFragment getI18nUserProfileFragment();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ long getLastTimeShowPublishSuccessWindow(String str, long j);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String getLiveEventsUrl();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ InterfaceC1257400ipG getMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public int getMessageProfile() {
        return 0;
    }

    public abstract /* synthetic */ Class<? extends Fragment> getMyProfileClass();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ IProfileAssemService getProfileAssemService();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ AbstractC1893000zMQ getProfileBioLinkTitleBarProvider();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Class<? extends CommonPageFragment> getProfilePageFragmentClass();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ C0CCZ getProfilePageModelPreloadTask();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ int getProfileSortType();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ C13IQ<? extends AbstractC738140SxQ> getSocialActivityAssem();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String getTabNameInGuideUserUtil();

    public abstract /* synthetic */ String getUserApi();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String getUserPath(boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String getUserPermissionsPath();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ int getViewRawBottomY(View view);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ C0CCZ getYoutubeRefreshTask();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void gotoCrop(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void gotoCrop(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle, boolean z2);

    public abstract /* synthetic */ boolean hasDefaultUri(User user);

    public abstract /* synthetic */ boolean hasLiveEventPermission();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean hasLiveEventPermissionSettings();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isHitLeftAlignSmallAvatar();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isI18nMyProfileFragment(Fragment fragment);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isI18nUserProfileFragment(Fragment fragment);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isNotificationEnabled(Context context);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isProfileViewersEnable();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isShowGuideCreateVideoInGuideUserUtil();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isTooltipInGuideUserUtil();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isUserProfileFragment(Fragment fragment);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void mobClickEnterProfileViewer();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean needShowBindPhoneNumberNotice();

    public boolean needShowCompleteProfileGuide() {
        return false;
    }

    public abstract /* synthetic */ AwemeListFragment newAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void postDarkModeStatusEvent(boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void preloadProfileInfoAndAwemePost(Aweme aweme, Integer num, int i, String str);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Class<? extends Activity> profileActivityClz();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ AbstractC1255890imp<?, ?> provideAwemeModel();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Fragment providePushSettingNotificationChoiceFragment();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void queryAwemeWithID(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void queryProfileResponse(Handler handler, EnumC1254690ikt enumC1254690ikt);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void queryProfileWithId(Handler handler, String str, int i, EnumC1254690ikt enumC1254690ikt);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ C11NZ<RelationSearchResponse> queryRelationSearchList(int i, String str, String str2, Integer num);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void queryUserResponse(String str, boolean z, String str2);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void removeAllCache();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void removeCacheByUser(String str, String str2);

    public abstract /* synthetic */ void requestUser(String str, String str2, InterfaceC1254680iks interfaceC1254680iks);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void runYoutubeRefreshTask(Context context);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void setLastTimeShowPublishSuccessWindow(String str, long j);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void setShownBarInCouponKeva(boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void setShownBubbleInCouponKeva(boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void setShownStarInCouponKeva(boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean shouldDetailLoadLatest();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean shouldHideThoughtBubbleAndPlus(User user);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean shouldShowProfileViewerPushItem();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean showBubbleInCouponKeva();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean showCouponIconInCouponKeva(String str, int i);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void showInChooseAccountBottomSheet(FragmentManager fragmentManager, C1255390im1 c1255390im1, String str, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startHeaderDetailActivity(Activity activity, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr);

    public abstract /* synthetic */ void startHeaderDetailActivity(Activity activity, View view, float f, String... strArr);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startHeaderDetailActivity(Activity activity, View view, User user, boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startProfileEditActivity(Activity activity, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startProfileEditBioUrlActivity(Activity activity, String str);

    public void tryRefreshProfile(Fragment fragment) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateCoverIfMyProfileVisible(C19EG c19eg, String str, Aweme aweme);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateFirstTimeInCouponKeva(JSONObject jSONObject);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateProfilePageEnterMethod(Fragment fragment, String str);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateProfilePageFragmentParams(Fragment fragment, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateProfilePageFragmentParams(Fragment fragment, String str);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateProfilePageFragmentParams(Fragment fragment, String str, boolean z, boolean z2, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateSavePostChoose(Activity activity, String str, AvatarUri avatarUri, String str2, Function0<Unit> function0, Function1<? super Exception, Unit> function1);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Object updateUserSocialAvatar(Activity activity, boolean z, boolean z2, int i, int i2, Map<String, String> map, long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean userNameLegitimate();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public AbstractC1255880imo<Aweme, ?> createAwemeModel() {
        return new C1255780ime();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public boolean needShowSafeInfoNotice() {
        return C1257420ipI.LIZIZ.needShowSafeInfoNotice();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public C1232410iAx newUserPresenter() {
        return new C1232410iAx();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public boolean needShowCompleteProfileGuideBar() {
        User curUser = C0XQ7.LJFF().getCurUser();
        float f = curUser.profileCompletion;
        boolean z = f > 0.0f && f <= 0.7f;
        if (needShowCompleteProfileGuide()) {
            return z || curUser.nicknameUpdateReminder() || curUser.avatarUpdateReminder();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public Fragment obtainMyProfileFragment() {
        IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
        C844470XAv.LIZ.getClass();
        if (iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
            return new I18nMyProfileFragment();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public Fragment obtainUserProfileFragment() {
        IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
        C844470XAv.LIZ.getClass();
        if (!iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
            return null;
        }
        I18nUserProfileFragment i18nUserProfileFragment = new I18nUserProfileFragment();
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(C844470XAv.LIZ())) {
            i18nUserProfileFragment.setEventType("homepage_hot");
        }
        return i18nUserProfileFragment;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE> getAvatarProfileAdapter() {
        return new AbstractC1608810ry3<C1256520inq, C1256630io1>() { // from class: X.0io3
            @Override // X.InterfaceC1608800ry2
            public final EnumC1607270rvZ LIZ() {
                return EnumC1607270rvZ.PERSON;
            }

            @Override // X.InterfaceC1608800ry2
            public final InterfaceC1608870ry9 LIZIZ(InterfaceC426680GoE interfaceC426680GoE) {
                return new AvatarPersonDataAdapter((C1256630io1) interfaceC426680GoE);
            }

            @Override // X.InterfaceC1608800ry2
            public final AbstractC1608790ry1 LIZJ(InterfaceC426680GoE interfaceC426680GoE) {
                return new C1608730rxv((C1256630io1) interfaceC426680GoE);
            }

            @Override // X.AbstractC1608810ry3
            public final InterfaceC1606880ruw LJ(InterfaceC1606880ruw interfaceC1606880ruw) {
                if (!(interfaceC1606880ruw instanceof C1256520inq)) {
                    return null;
                }
                return interfaceC1606880ruw;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public Object getPushSettingCallback() {
        return new C10FJ() { // from class: X.0ikw
            @Override // X.C10FJ
            public final void onFailed(Exception exc) {
            }

            @Override // X.C10FJ
            public final void Hl(PushSettings pushSettings) {
                Keva repo = Keva.getRepo("keva_repo_profile_component");
                int i = pushSettings.emptyProfileMission;
                C0TMQ.LIZ.getClass();
                if (i > repo.getInt(C0TMQ.LIZ("post_guide_count_follow_from_recommend"), 0)) {
                    repo.storeInt(C0TMQ.LIZ("post_guide_count_follow_from_recommend"), pushSettings.emptyProfileMission);
                }
                C1076010e6h.LIZJ.LJJIIJ(pushSettings.contactStatus);
            }
        };
    }

    public static final UserProfileBlockVM blockUser$lambda$0(C736950SvV<C09Z8, UserProfileBlockVM> c736950SvV) {
        return (UserProfileBlockVM) c736950SvV.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public C0TGX getMyProfilePartScreenScene(C19EG c19eg) {
        return C0HZJ.LIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void updateProfilePermission(boolean z) {
        MyProfileGuideViewModel myProfileGuideViewModel;
        WeakReference<MyProfileGuideViewModel> weakReference = C1254650ikp.LIZIZ;
        if (weakReference != null && (myProfileGuideViewModel = weakReference.get()) != null) {
            myProfileGuideViewModel.setState(new AwS47S0010000_35(z, 0));
        }
        C1254650ikp.LIZ = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void mobRefreshInProfileAweme(AbstractC1255880imo<?, ?> abstractC1255880imo, List<? extends Aweme> list) {
        if (abstractC1255880imo instanceof C1255780ime) {
            abstractC1255880imo.getClass();
            abstractC1255880imo.setItems(new ArrayList(list));
            ((FeedItemList) abstractC1255880imo.mData).cursor = list.size();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void preloadProfile(C19EG c19eg, String str) {
        Aweme aweme = C680080Qly.LIZIZ(c19eg).LLILZIL;
        if (aweme != null && !AwemeBizExtKt.isPreloadScroll(aweme) && TextUtils.equals(str, "page_profile")) {
            AwemeBizExtKt.setPreloadScroll(aweme, true);
            C15O7.LIZJ(new ACallableS424S0100000_19(aweme, 14));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void updateUserInfo(Fragment fragment, Aweme aweme) {
        IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
        C844470XAv.LIZ.getClass();
        if (iMSAdaptionService.LIZJ(C844470XAv.LIZ()) && (fragment instanceof C0SSX)) {
            ((C0SSX) fragment).Ob(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public User queryUser(String str, boolean z, String str2) {
        return C1254710ikv.LIZ(str, z, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void jumpToOrgAccountPage(Context context, String str, String str2, String str3, String str4) {
        String str5 = ProfileIdentifierActivity._pnsPageId;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//profile/identifier");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("user_id", str2);
        smartRouteBuildRoute.withParam("sec_user_id", str3);
        smartRouteBuildRoute.withParam("scene_id", str4);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public String userUrl(String str, String str2, String str3, int i, EnumC1254690ikt enumC1254690ikt) {
        return C1254710ikv.LIZIZ(str, str2, null, i, Boolean.TRUE, enumC1254690ikt);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void blockUser(Context context, LifecycleOwner lifecycleOwner, String str, String str2, int i, int i2) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UserProfileBlockVM.class);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(501);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
        if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        blockUser$lambda$0(new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS257S0000000_19, null, null, null)).vQ2(context, i, str, i2, str2);
    }

    public AwemeListFragment newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        if (str2 == null) {
            str2 = "";
        }
        Bundle bundle = new Bundle();
        AwemeListFragmentImpl awemeListFragmentImpl = new AwemeListFragmentImpl();
        bundle.putInt("type", i2);
        C786410Ut5.LJJJI("uid", str, bundle);
        C786410Ut5.LJJJI("sec_user_id", str2, bundle);
        bundle.putBoolean("is_my_profile", z);
        bundle.putBoolean("is_scene_transition_enable", false);
        bundle.putInt("bottom_bar_height", i);
        bundle.putBoolean("should_refresh_on_init_data", z2);
        awemeListFragmentImpl.setArguments(bundle);
        return awemeListFragmentImpl;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i, EnumC1254690ikt enumC1254690ikt) {
        C1254580iki c1254580ikiLIZ = C1254580iki.LIZ();
        Boolean bool = Boolean.TRUE;
        c1254580ikiLIZ.getClass();
        C1254580iki.LIZIZ(C1254710ikv.LIZIZ(str2, str, str3, i, bool, enumC1254690ikt), handler);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void longPressProfileCell(String str, Aweme aweme, Activity activity, String str2, String str3, int i, View view, Fragment fragment, C0HTT<C737030Svd> c0htt) {
        C621180OYa.LIZIZ.LJIJJ(aweme, activity, str2, str3, i);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2) {
        String str2 = CropActivity._pnsPageId;
        C21508119Ff.LIZ(activity, str, z, f, i, i2, i3, i4, i5, z2, null, true, true, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle) {
        String str2 = CropActivity._pnsPageId;
        C21508119Ff.LIZ(activity, str, z, f, i, i2, i3, i4, i5, z2, bundle, true, true, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
        String str2 = CropActivity._pnsPageId;
        C21508119Ff.LIZ(activity, str, z, f, i, i2, i3, i4, i5, z2, bundle, z3, true, false);
    }
}
