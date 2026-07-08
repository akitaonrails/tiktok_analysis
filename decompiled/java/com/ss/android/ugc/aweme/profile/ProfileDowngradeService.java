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
import X.C1284660jXE;
import X.C13IQ;
import X.C13LE;
import X.C19EG;
import X.C2188811AlT;
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
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
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

/* JADX INFO: loaded from: classes20.dex */
public class ProfileDowngradeService implements IProfileService {
    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void blockUser(Context context, LifecycleOwner lifecycleOwner, String str, String str2, int i, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean canShowProfileFixedEntrance() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkAndHandleSaveFile(Bitmap bitmap, File file) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDLocal(String str, Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDNet(String str, String str2, String str3, Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean enableShowFeatureVideoEntrance() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE> getAvatarProfileAdapter() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC800130Va7 getCampusEducationSheetStatusRequestLegoTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getEnterpriseType(User user) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment getFavoriteVideoListFragment(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Bundle getFavoriteVideoListFragmentArgs(Context context, int i, Boolean bool, String str, boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final PowerViewPagerFragmentItem<?> getFavoriteVideoListFragmentItem(Context context, int i, Boolean bool, String str, boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C1197160hG6 getFavoriteVideoListTabMetadata(Context context) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment getFavoriteVideoSearchResultFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getLiveEventsUrl() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getMessageProfile() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final IProfileAssemService getProfileAssemService() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C0CCZ getProfilePageModelPreloadTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getProfileSortType() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C13IQ<? extends AbstractC738140SxQ> getSocialActivityAssem() {
        return C13LE.LIZ(BaseMainContainerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPath(boolean z) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPermissionsPath() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getViewRawBottomY(View view) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean hasLiveEventPermissionSettings() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isHitLeftAlignSmallAvatar() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isNotificationEnabled(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isProfileViewersEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void jumpToOrgAccountPage(Context context, String str, String str2, String str3, String str4) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobClickEnterProfileViewer() {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobRefreshInProfileAweme(AbstractC1255880imo<?, ?> abstractC1255880imo, List<? extends Aweme> list) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowCompleteProfileGuideBar() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowSafeInfoNotice() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainMyProfileFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainUserProfileFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfile(C19EG c19eg, String str) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i, EnumC1254690ikt enumC1254690ikt) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C11NZ<RelationSearchResponse> queryRelationSearchList(int i, String str, String str2, Integer num) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldDetailLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldHideThoughtBubbleAndPlus(User user) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldShowProfileViewerPushItem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateCoverIfMyProfileVisible(C19EG c19eg, String str, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageEnterMethod(Fragment fragment, String str) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePermission(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateSavePostChoose(Activity activity, String str, AvatarUri avatarUri, String str2, Function0<Unit> function0, Function1<? super Exception, Unit> function1) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateUserInfo(Fragment fragment, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC1255880imo<Aweme, ?> createAwemeModel() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean getAdFakeUserProfileBugfixSetting() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C0OO0 getAvatarPresenter() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nMyProfileFragment() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nUserProfileFragment() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC1893000zMQ getProfileBioLinkTitleBarProvider() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends CommonPageFragment> getProfilePageFragmentClass() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Object getPushSettingCallback() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getTabNameInGuideUserUtil() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C0CCZ getYoutubeRefreshTask() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isShowGuideCreateVideoInGuideUserUtil() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isTooltipInGuideUserUtil() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowBindPhoneNumberNotice() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC1232320iAo newUserPresenter() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC1255890imp provideAwemeModel() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment providePushSettingNotificationChoiceFragment() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeAllCache() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showBubbleInCouponKeva() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean userNameLegitimate() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends Activity> profileActivityClz() {
        return Activity.class;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void checkAndRefreshUser(Fragment fragment) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC20660715sz getMyProfilePartScreenScene(C19EG c19eg) {
        return new InterfaceC20660715sz() { // from class: X.0il7
            @Override // X.InterfaceC20658015sY
            public final boolean Xu() {
                return false;
            }

            @Override // X.InterfaceC20658015sY
            public final C688120Qyw i2() {
                return null;
            }

            @Override // X.InterfaceC20660715sz
            public final boolean t2() {
                return false;
            }

            @Override // X.InterfaceC20658015sY
            public final String getSceneId() {
                return C634060Otw.LIZ(this);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nMyProfileFragment(Fragment fragment) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nUserProfileFragment(Fragment fragment) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isUserProfileFragment(Fragment fragment) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void postDarkModeStatusEvent(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void runYoutubeRefreshTask(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBarInCouponKeva(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBubbleInCouponKeva(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownStarInCouponKeva(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateFirstTimeInCouponKeva(JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void disLikeAwemeApi(String str, Map<String, String> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C0QTN getAsyncInflater(Activity activity, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final long getLastTimeShowPublishSuccessWindow(String str, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponse(Handler handler, EnumC1254690ikt enumC1254690ikt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeCacheByUser(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setLastTimeShowPublishSuccessWindow(String str, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showCouponIconInCouponKeva(String str, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditActivity(Activity activity, Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditBioUrlActivity(Activity activity, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final User queryUser(String str, boolean z, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryUserResponse(String str, boolean z, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfileInfoAndAwemePost(Aweme aweme, Integer num, int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileWithId(Handler handler, String str, int i, EnumC1254690ikt enumC1254690ikt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String disLikeAweme(Aweme aweme, int i, String str, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str, boolean z, boolean z2, Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String userUrl(String str, String str2, String str3, int i, EnumC1254690ikt enumC1254690ikt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void showInChooseAccountBottomSheet(FragmentManager fragmentManager, C1255390im1 c1255390im1, String str, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC1257400ipG getMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Object updateUserSocialAvatar(Activity activity, boolean z, boolean z2, int i, int i2, Map<String, String> map, long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void longPressProfileCell(String str, Aweme aweme, Activity activity, String str2, String str3, int i, View view, Fragment fragment, C0HTT<C737030Svd> c0htt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryAwemeWithID(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }
}
