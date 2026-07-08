package com.ss.android.ugc.aweme.profile;

import X.AbstractC1255880imo;
import X.AbstractC1255890imp;
import X.AbstractC1608810ry3;
import X.AbstractC1893000zMQ;
import X.AbstractC738140SxQ;
import X.C0CCZ;
import X.C0HTT;
import X.C0OO0;
import X.C0QTN;
import X.C1197160hG6;
import X.C11NZ;
import X.C1255390im1;
import X.C13IQ;
import X.C19EG;
import X.C737030Svd;
import X.EnumC1254690ikt;
import X.InterfaceC1232320iAo;
import X.InterfaceC1257400ipG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1606880ruw;
import X.InterfaceC20660715sz;
import X.InterfaceC426680GoE;
import X.InterfaceC800130Va7;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public interface IProfileService {
    void blockUser(Context context, LifecycleOwner lifecycleOwner, String str, String str2, int i, int i2);

    boolean canShowProfileFixedEntrance();

    boolean checkAndHandleSaveFile(Bitmap bitmap, File file);

    void checkAndRefreshUser(Fragment fragment);

    boolean checkIDLocal(String str, Context context);

    boolean checkIDNet(String str, String str2, String str3, Context context);

    AbstractC1255880imo<Aweme, ?> createAwemeModel();

    String disLikeAweme(Aweme aweme, int i, String str, int i2, int i3);

    void disLikeAwemeApi(String str, Map<String, String> map);

    boolean enableShowFeatureVideoEntrance();

    boolean getAdFakeUserProfileBugfixSetting();

    C0QTN getAsyncInflater(Activity activity, int i);

    C0OO0 getAvatarPresenter();

    AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE> getAvatarProfileAdapter();

    InterfaceC800130Va7 getCampusEducationSheetStatusRequestLegoTask();

    int getEnterpriseType(User user);

    Fragment getFavoriteVideoListFragment(Context context, Bundle bundle);

    Bundle getFavoriteVideoListFragmentArgs(Context context, int i, Boolean bool, String str, boolean z);

    PowerViewPagerFragmentItem<?> getFavoriteVideoListFragmentItem(Context context, int i, Boolean bool, String str, boolean z);

    C1197160hG6 getFavoriteVideoListTabMetadata(Context context);

    Fragment getFavoriteVideoSearchResultFragment();

    AmeBaseFragment getI18nMyProfileFragment();

    AmeBaseFragment getI18nUserProfileFragment();

    long getLastTimeShowPublishSuccessWindow(String str, long j);

    String getLiveEventsUrl();

    InterfaceC1257400ipG getMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle);

    int getMessageProfile();

    InterfaceC20660715sz getMyProfilePartScreenScene(C19EG c19eg);

    IProfileAssemService getProfileAssemService();

    AbstractC1893000zMQ getProfileBioLinkTitleBarProvider();

    Class<? extends CommonPageFragment> getProfilePageFragmentClass();

    C0CCZ getProfilePageModelPreloadTask();

    int getProfileSortType();

    Object getPushSettingCallback();

    C13IQ<? extends AbstractC738140SxQ> getSocialActivityAssem();

    String getTabNameInGuideUserUtil();

    String getUserPath(boolean z);

    String getUserPermissionsPath();

    int getViewRawBottomY(View view);

    C0CCZ getYoutubeRefreshTask();

    void gotoCrop(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3);

    void gotoCrop(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle, boolean z2);

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2);

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle);

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3);

    boolean hasLiveEventPermissionSettings();

    boolean isHitLeftAlignSmallAvatar();

    boolean isI18nMyProfileFragment(Fragment fragment);

    boolean isI18nUserProfileFragment(Fragment fragment);

    boolean isNotificationEnabled(Context context);

    boolean isProfileViewersEnable();

    boolean isShowGuideCreateVideoInGuideUserUtil();

    boolean isTooltipInGuideUserUtil();

    boolean isUserProfileFragment(Fragment fragment);

    void jumpToOrgAccountPage(Context context, String str, String str2, String str3, String str4);

    void longPressProfileCell(String str, Aweme aweme, Activity activity, String str2, String str3, int i, View view, Fragment fragment, C0HTT<C737030Svd> c0htt);

    void mobClickEnterProfileViewer();

    void mobRefreshInProfileAweme(AbstractC1255880imo<?, ?> abstractC1255880imo, List<? extends Aweme> list);

    boolean needShowBindPhoneNumberNotice();

    boolean needShowCompleteProfileGuideBar();

    boolean needShowSafeInfoNotice();

    InterfaceC1232320iAo newUserPresenter();

    Fragment obtainMyProfileFragment();

    Fragment obtainUserProfileFragment();

    void postDarkModeStatusEvent(boolean z);

    void preloadProfile(C19EG c19eg, String str);

    void preloadProfileInfoAndAwemePost(Aweme aweme, Integer num, int i, String str);

    Class<? extends Activity> profileActivityClz();

    AbstractC1255890imp<?, ?> provideAwemeModel();

    Fragment providePushSettingNotificationChoiceFragment();

    void queryAwemeWithID(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4);

    void queryProfileResponse(Handler handler, EnumC1254690ikt enumC1254690ikt);

    void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i, EnumC1254690ikt enumC1254690ikt);

    void queryProfileWithId(Handler handler, String str, int i, EnumC1254690ikt enumC1254690ikt);

    C11NZ<RelationSearchResponse> queryRelationSearchList(int i, String str, String str2, Integer num);

    User queryUser(String str, boolean z, String str2);

    void queryUserResponse(String str, boolean z, String str2);

    void removeAllCache();

    void removeCacheByUser(String str, String str2);

    void runYoutubeRefreshTask(Context context);

    void setLastTimeShowPublishSuccessWindow(String str, long j);

    void setShownBarInCouponKeva(boolean z);

    void setShownBubbleInCouponKeva(boolean z);

    void setShownStarInCouponKeva(boolean z);

    boolean shouldDetailLoadLatest();

    boolean shouldHideThoughtBubbleAndPlus(User user);

    boolean shouldShowProfileViewerPushItem();

    boolean showBubbleInCouponKeva();

    boolean showCouponIconInCouponKeva(String str, int i);

    void showInChooseAccountBottomSheet(FragmentManager fragmentManager, C1255390im1 c1255390im1, String str, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener);

    void startHeaderDetailActivity(Activity activity, Bundle bundle);

    void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2);

    void startProfileEditActivity(Activity activity, Bundle bundle);

    void startProfileEditBioUrlActivity(Activity activity, String str);

    void updateCoverIfMyProfileVisible(C19EG c19eg, String str, Aweme aweme);

    void updateFirstTimeInCouponKeva(JSONObject jSONObject);

    void updateProfilePageEnterMethod(Fragment fragment, String str);

    void updateProfilePageFragmentParams(Fragment fragment, Bundle bundle);

    void updateProfilePageFragmentParams(Fragment fragment, String str);

    void updateProfilePageFragmentParams(Fragment fragment, String str, boolean z, boolean z2, Bundle bundle);

    void updateProfilePermission(boolean z);

    void updateSavePostChoose(Activity activity, String str, AvatarUri avatarUri, String str2, Function0<Unit> function0, Function1<? super Exception, Unit> function1);

    void updateUserInfo(Fragment fragment, Aweme aweme);

    Object updateUserSocialAvatar(Activity activity, boolean z, boolean z2, int i, int i2, Map<String, String> map, long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    boolean userNameLegitimate();

    String userUrl(String str, String str2, String str3, int i, EnumC1254690ikt enumC1254690ikt);
}
