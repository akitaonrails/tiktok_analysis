package com.ss.android.ugc.profile.platform.framework.service;

import X.AbstractC1255890imp;
import X.AbstractC1387200mCc;
import X.AbstractC1893000zMQ;
import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C013C;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0BL9;
import X.C0BLA;
import X.C0BXU;
import X.C0C10;
import X.C0C11;
import X.C0CCZ;
import X.C0CXE;
import X.C0DMM;
import X.C0OO0;
import X.C0QTN;
import X.C0S4U;
import X.C0SSZ;
import X.C0WYJ;
import X.C0WZX;
import X.C0XQ7;
import X.C1017290cZz;
import X.C1027190cpx;
import X.C1047050dLz;
import X.C1055030dYr;
import X.C1197160hG6;
import X.C11NZ;
import X.C1202420hOa;
import X.C1215760hk6;
import X.C1232050iAN;
import X.C1232060iAO;
import X.C1232140iAW;
import X.C1238700iL6;
import X.C1247640iZW;
import X.C1251210ifH;
import X.C1252470ihJ;
import X.C1252550ihR;
import X.C1252710ihh;
import X.C1253590ij7;
import X.C1254530ikd;
import X.C1254560ikg;
import X.C1254580iki;
import X.C1254610ikl;
import X.C1254630ikn;
import X.C1254710ikv;
import X.C1254790il3;
import X.C1255030ilR;
import X.C1255380im0;
import X.C1255390im1;
import X.C1255780ime;
import X.C1255950imv;
import X.C1256130inD;
import X.C1259870itF;
import X.C1260090itb;
import X.C1386870mC5;
import X.C1386890mC7;
import X.C13IQ;
import X.C13LE;
import X.C1440005kM;
import X.C1701330uNH;
import X.C1723306ox;
import X.C1906580ziK;
import X.C19633311rf;
import X.C19EG;
import X.C1BVK;
import X.C1EE2;
import X.C21508119Ff;
import X.C21509519Ft;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2286608xc;
import X.C23260099m;
import X.C268330AfP;
import X.C288970BUh;
import X.C293501Bt;
import X.C299890BpD;
import X.C421540Gfw;
import X.C686870Qwv;
import X.C690970R8l;
import X.C724240Sb0;
import X.C744870TJt;
import X.C786410Ut5;
import X.C800330VaR;
import X.C824390WVp;
import X.C830320Whi;
import X.C830330Whj;
import X.C830340Whk;
import X.C844470XAv;
import X.C846160XHi;
import X.C990310bsT;
import X.EnumC1216940hm0;
import X.EnumC1253510iiz;
import X.EnumC1254690ikt;
import X.EnumC1254850il9;
import X.InterfaceC1054930dYh;
import X.InterfaceC1232420iAy;
import X.InterfaceC1249800id0;
import X.InterfaceC1254660ikq;
import X.InterfaceC1254680iks;
import X.InterfaceC1257400ipG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1603190roz;
import X.InterfaceC800130Va7;
import Y.ACallableS27S1000000_19;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.aweme.storage.StorageCleanServiceImpl;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.profile.IProfileAssemService;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.profile.business.ci.SocialActivityAssem;
import com.ss.android.ugc.profile.business.ci.experiment.ProfileViewersExpConfig;
import com.ss.android.ugc.profile.business.common.ProfilePageFragment;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.PushSettingNotificationChoiceFragment;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.ss.android.ugc.profile.business.profile.tab.FavoriteInvalidAwemeListFragment;
import com.ss.android.ugc.profile.business.profile.tab.FavoriteSearchResultFragment;
import com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.ss.android.ugc.profile.business.ur.NaviAssetUploadHandler;
import com.ss.android.ugc.profile.business.ur.edit.YoutubeRefreshTask;
import com.ss.android.ugc.profile.business.ur.following.repository.RelationSearchApi;
import com.ss.android.ugc.profile.business.ur.school.educationsheet.CampusEducationSheetStatusRequestLegoTask;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlActivity;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootComponent;
import com.ss.android.ugc.profile.platform.base.cache.ProfilePageModelPreloadTask;
import com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssem;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.UserProfileFragment;
import com.ss.android.ugc.profile.platform.framework.service.ProfileServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.ur.socialavatar.UpdateSocialAvatarStruct;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileServiceImpl extends BaseProfileServiceImpl {
    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean enableShowFeatureVideoEntrance() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean getAdFakeUserProfileBugfixSetting() {
        boolean zLIZ = true;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_ad_fake_user_profile_bugfix", true);
            return zLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return zLIZ;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final C13IQ<? extends AbstractC738140SxQ> getSocialActivityAssem() {
        return C13LE.LIZ(SocialActivityAssem.class);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final C0OO0 getAvatarPresenter() {
        return new C1255030ilR();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC800130Va7 getCampusEducationSheetStatusRequestLegoTask() {
        return new CampusEducationSheetStatusRequestLegoTask();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment getFavoriteVideoSearchResultFragment() {
        FavoriteSearchResultFragment favoriteSearchResultFragment = new FavoriteSearchResultFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", 25);
        bundle.putBoolean("is_my_profile", true);
        bundle.putBoolean("should_refresh_on_init_data", true);
        favoriteSearchResultFragment.setArguments(bundle);
        return favoriteSearchResultFragment;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nMyProfileFragment() {
        return new I18nMyProfileFragment();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nUserProfileFragment() {
        return new I18nUserProfileFragment();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String getLiveEventsUrl() {
        C1251210ifH.LIZ.getClass();
        return C1251210ifH.LIZ();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final IProfileAssemService getProfileAssemService() {
        return new IProfileAssemService() { // from class: X.0ike
            @Override // com.ss.android.ugc.aweme.profile.IProfileAssemService
            public final void changeTabFragments(AbstractC738140SxQ abstractC738140SxQ) {
                InterfaceC1252070igf interfaceC1252070igf = (InterfaceC1252070igf) C1252710ihh.LJFF(abstractC738140SxQ, C13LE.LIZ(InterfaceC1252070igf.class), null);
                if (interfaceC1252070igf != null) {
                    interfaceC1252070igf.Bm();
                }
            }

            @Override // com.ss.android.ugc.aweme.profile.IProfileAssemService
            public final void selectSubscribeProfileInfoServiceUserUpdateEvent(AbstractC738140SxQ abstractC738140SxQ, Function1<? super C291001Au<? extends User>, Unit> function1) {
                C1252710ihh.LJIIJ(abstractC738140SxQ, C13LE.LIZ(InterfaceC1252070igf.class), new C2217381BqS() { // from class: X.0ikj
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1251330ifT) obj).LIZIZ;
                    }
                }, function1);
            }
        };
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC1893000zMQ getProfileBioLinkTitleBarProvider() {
        return new C1047050dLz();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final C0CCZ getProfilePageModelPreloadTask() {
        return new ProfilePageModelPreloadTask();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final int getProfileSortType() {
        C1256130inD.LIZ.getClass();
        return C1256130inD.LIZ();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String getTabNameInGuideUserUtil() {
        C1252550ihR.LIZ.getClass();
        return C1252550ihR.LIZJ;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final String getUserApi() {
        return UriProtector.parse(C1254710ikv.LIZ).buildUpon().toString();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPermissionsPath() {
        String str = C1254710ikv.LIZ;
        return "/tiktok/user/permission/get/v1/";
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final C0CCZ getYoutubeRefreshTask() {
        return new YoutubeRefreshTask();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isShowGuideCreateVideoInGuideUserUtil() {
        C1252550ihR.LIZ.getClass();
        return C1252550ihR.LJ;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isTooltipInGuideUserUtil() {
        C1252550ihR.LIZ.getClass();
        return C1252550ihR.LJI;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobClickEnterProfileViewer() {
        C1386890mC7.LIZ.getClass();
        C421540Gfw.LIZ(AFwS207S0000000_19.get$arr$(817));
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowBindPhoneNumberNotice() {
        C1252550ihR.LIZ.getClass();
        return C1252550ihR.LJIILJJIL() && !C1252550ihR.LIZLLL;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC1255890imp provideAwemeModel() {
        return new C1255780ime();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment providePushSettingNotificationChoiceFragment() {
        return new PushSettingNotificationChoiceFragment();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldShowProfileViewerPushItem() {
        Boolean bool;
        C1386870mC5.LIZ.getClass();
        boolean zLIZ = C1253590ij7.LIZ();
        ProfileViewersExpConfig profileViewersExpConfig = (ProfileViewersExpConfig) C1253590ij7.LIZIZ.getValue();
        boolean z = zLIZ && ((profileViewersExpConfig == null || (bool = profileViewersExpConfig.profileViewersPushEnable) == null) ? false : bool.booleanValue());
        IPrivacyService iPrivacyService = (IPrivacyService) ServiceManager.get().getService(IPrivacyService.class);
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = iPrivacyService.LJIIIZ(0, "profile_view_history");
        Integer numValueOf = privacySettingsRestrictionItemLJIIIZ != null ? Integer.valueOf(privacySettingsRestrictionItemLJIIIZ.showType) : null;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ2 = iPrivacyService.LJIIIZ(0, "viewer_history");
        Integer numValueOf2 = privacySettingsRestrictionItemLJIIIZ2 != null ? Integer.valueOf(privacySettingsRestrictionItemLJIIIZ2.showType) : null;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = iPrivacyService.LJIIIIZZ();
        Integer numLIZ = privacyUserSettingsV2LJIIIIZZ != null ? privacyUserSettingsV2LJIIIIZZ.LIZ("profile_view_history") : null;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ2 = iPrivacyService.LJIIIIZZ();
        Integer numLIZ2 = privacyUserSettingsV2LJIIIIZZ2 != null ? privacyUserSettingsV2LJIIIIZZ2.LIZ("viewer_history") : null;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("profileViewerRestrictionShowType is ");
        sbLIZ.append(numValueOf);
        sbLIZ.append(" \n profileViewerSwitchStatus is ");
        sbLIZ.append(numLIZ);
        sbLIZ.append("\ncanShowPushSettings is ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z2 = numValueOf != null && numValueOf.intValue() == 0;
        boolean z3 = numValueOf2 != null && numValueOf2.intValue() == 0;
        boolean z4 = numLIZ != null && numLIZ.intValue() == 1;
        boolean z5 = numLIZ2 != null && numLIZ2.intValue() == 1;
        if (z) {
            return (z2 && z4) || (z3 && z5);
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean canShowProfileFixedEntrance() {
        Boolean bool;
        boolean zLIZ = C1253590ij7.LIZ();
        ProfileViewersExpConfig profileViewersExpConfig = (ProfileViewersExpConfig) C1253590ij7.LIZIZ.getValue();
        return zLIZ && ((profileViewersExpConfig == null || (bool = profileViewersExpConfig.profileViewersFixedEntrance) == null) ? false : bool.booleanValue());
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final boolean hasLiveEventPermission() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("live_event_permission", false);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean hasLiveEventPermissionSettings() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("live_event_permission", false);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isHitLeftAlignSmallAvatar() {
        return C268330AfP.LJIIL();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isProfileViewersEnable() {
        return C1253590ij7.LIZ();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeAllCache() {
        PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v1/user/profile/other/", null);
        PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v1/aweme/post/", null);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldDetailLoadLatest() {
        return C299890BpD.LIZ();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showBubbleInCouponKeva() {
        return !C1254790il3.LIZ().LIZJ.getBoolean("show_bubble", true);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean userNameLegitimate() {
        return C1238700iL6.LIZIZ();
    }

    public static final class FavoriteInvalidAwemeListFragmentData extends PowerViewPagerFragmentItem<FavoriteInvalidAwemeListFragment> implements InterfaceC1254660ikq {
        public final Bundle argsBundle;
        public static final Parcelable.Creator<FavoriteInvalidAwemeListFragmentData> CREATOR = new Parcelable.Creator<FavoriteInvalidAwemeListFragmentData>() { // from class: X.0il1
            @Override // android.os.Parcelable.Creator
            public final ProfileServiceImpl.FavoriteInvalidAwemeListFragmentData createFromParcel(Parcel parcel) {
                return new ProfileServiceImpl.FavoriteInvalidAwemeListFragmentData(parcel.readBundle(ProfileServiceImpl.FavoriteInvalidAwemeListFragmentData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ProfileServiceImpl.FavoriteInvalidAwemeListFragmentData[] newArray(int i) {
                return new ProfileServiceImpl.FavoriteInvalidAwemeListFragmentData[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FavoriteInvalidAwemeListFragmentData) && Intrinsics.LJFF(this.argsBundle, ((FavoriteInvalidAwemeListFragmentData) obj).argsBundle);
        }

        public final int hashCode() {
            return this.argsBundle.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FavoriteInvalidAwemeListFragmentData(argsBundle=");
            sbLIZ.append(this.argsBundle);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.argsBundle);
        }

        @Override // X.InterfaceC1254660ikq
        public final Bundle LIZLLL() {
            return this.argsBundle;
        }

        public FavoriteInvalidAwemeListFragmentData(Bundle bundle) {
            this.argsBundle = bundle;
        }
    }

    public static final class FavoriteVideoCollectionFragmentData extends PowerViewPagerFragmentItem<AwemeListFragmentImpl> implements InterfaceC1254660ikq {
        public final Bundle argsBundle;
        public static final Parcelable.Creator<FavoriteVideoCollectionFragmentData> CREATOR = new Parcelable.Creator<FavoriteVideoCollectionFragmentData>() { // from class: X.0il2
            @Override // android.os.Parcelable.Creator
            public final ProfileServiceImpl.FavoriteVideoCollectionFragmentData createFromParcel(Parcel parcel) {
                return new ProfileServiceImpl.FavoriteVideoCollectionFragmentData(parcel.readBundle(ProfileServiceImpl.FavoriteVideoCollectionFragmentData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ProfileServiceImpl.FavoriteVideoCollectionFragmentData[] newArray(int i) {
                return new ProfileServiceImpl.FavoriteVideoCollectionFragmentData[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FavoriteVideoCollectionFragmentData) && Intrinsics.LJFF(this.argsBundle, ((FavoriteVideoCollectionFragmentData) obj).argsBundle);
        }

        public final int hashCode() {
            return this.argsBundle.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FavoriteVideoCollectionFragmentData(argsBundle=");
            sbLIZ.append(this.argsBundle);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.argsBundle);
        }

        @Override // X.InterfaceC1254660ikq
        public final Bundle LIZLLL() {
            return this.argsBundle;
        }

        public FavoriteVideoCollectionFragmentData(Bundle bundle) {
            this.argsBundle = bundle;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final boolean getAndResetPauseAvatarAnim() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final Class<? extends Fragment> getMyProfileClass() {
        return I18nMyProfileFragment.class;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends CommonPageFragment> getProfilePageFragmentClass() {
        return ProfilePageFragment.class;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends Activity> profileActivityClz() {
        return ProfileEditActivity.class;
    }

    public static boolean LIZIZ(Bundle bundle) {
        boolean z = bundle.getBoolean("is_my_profile");
        boolean z2 = bundle.getBoolean("is_from_main");
        if (!z || !z2) {
            return false;
        }
        if ((C0BLA.LIZ() || ((Number) C288970BUh.LIZ.getValue()).intValue() <= 0) && !C0BL9.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void checkAndRefreshUser(Fragment fragment) {
        if (fragment instanceof I18nMyProfileFragment) {
            ((I18nMyProfileFragment) fragment).rS(EnumC1253510iiz.TAB_CHANGE);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final int getEnterpriseType(User user) {
        if (user == null) {
            return 0;
        }
        return user.getCommerceUserLevel();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final C1197160hG6 getFavoriteVideoListTabMetadata(Context context) {
        int i;
        if (C1EE2.LIZIZ.LIZIZ()) {
            i = 2131839859;
        } else {
            i = 2131828943;
        }
        String string = context.getString(i);
        if (!Intrinsics.LJFF(string, "video")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String strSubstring = string.substring(0, 1);
            Locale locale = Locale.ROOT;
            sbLIZ.append(strSubstring.toUpperCase(locale));
            sbLIZ.append(string.substring(1).toLowerCase(locale));
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        return new C1197160hG6(string, context.getString(2131834445));
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPath(boolean z) {
        String str = C1254710ikv.LIZ;
        if (z) {
            return "/aweme/v1/user/profile/self/";
        }
        return "/aweme/v1/user/profile/other/";
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final int getViewRawBottomY(View view) {
        return C1254630ikn.LIZ(view);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final boolean hasDefaultUri(User user) {
        C1252550ihR.LIZ.getClass();
        return !C1252550ihR.LJIIJJI(user, "photo", "video");
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nMyProfileFragment(Fragment fragment) {
        return fragment instanceof I18nMyProfileFragment;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nUserProfileFragment(Fragment fragment) {
        return fragment instanceof I18nUserProfileFragment;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isNotificationEnabled(Context context) {
        return C824390WVp.LIZJ(context);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isUserProfileFragment(Fragment fragment) {
        return fragment instanceof UserProfileFragment;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void postDarkModeStatusEvent(boolean z) {
        C1440005kM.LIZ(new C744870TJt());
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void runYoutubeRefreshTask(Context context) {
        new YoutubeRefreshTask().run(context);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBarInCouponKeva(boolean z) {
        C1254790il3.LIZ().LIZIZ(z);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBubbleInCouponKeva(boolean z) {
        C1254790il3 c1254790il3LIZ = C1254790il3.LIZ();
        if (!z && c1254790il3LIZ.LIZJ.getBoolean("show_bubble", false)) {
            return;
        }
        c1254790il3LIZ.LIZJ.storeBoolean("show_bubble", z);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownStarInCouponKeva(boolean z) {
        C1254790il3 c1254790il3LIZ = C1254790il3.LIZ();
        if (!c1254790il3LIZ.LIZJ.getBoolean("show_star", false)) {
            c1254790il3LIZ.LIZJ.storeBoolean("show_star", false);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldHideThoughtBubbleAndPlus(User user) {
        if (!C0BXU.LIZ() || !hasDefaultUri(user) || user == null || user.getFollowerCount() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final void tryRefreshProfile(Fragment fragment) {
        if (fragment instanceof I18nMyProfileFragment) {
            ((I18nMyProfileFragment) fragment).sS();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateFirstTimeInCouponKeva(JSONObject jSONObject) {
        C1254790il3 c1254790il3LIZ = C1254790il3.LIZ();
        c1254790il3LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFirstTime:");
        sbLIZ.append(C786410Ut5.J3(jSONObject));
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "activity_id");
            Date date = new Date();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setFirstTime:");
            sbLIZ2.append(date.toString());
            sbLIZ2.append("activityId:");
            sbLIZ2.append(string);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1254790il3LIZ.LIZJ.storeString(string, c1254790il3LIZ.LIZ.format(date));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkAndHandleSaveFile(Bitmap bitmap, File file) throws InterruptedException {
        if (file == null) {
            return false;
        }
        String parent = file.getParent();
        if (parent == null) {
            parent = "";
        }
        String name = file.getName();
        C830320Whi c830320Whi = C830320Whi.LIZ;
        if (C830320Whi.LIZIZ) {
            return c830320Whi.LIZJ(bitmap, parent, name, false);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C013C c013c = new C013C();
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("clear_storage_available_space_minimum_limitation", 1048576);
        long jLJFF = C0WYJ.LJFF(C1202420hOa.LIZ());
        if (jLJFF < iLJ) {
            C1232140iAW c1232140iAW = C1232140iAW.LIZ;
            Application applicationLIZ = C1202420hOa.LIZ();
            c1232140iAW.getClass();
            C1232140iAW.LIZJ(applicationLIZ, "checkAndHandleSaveFile storage low", null, null, jLJFF, null);
            Application applicationLIZ2 = C1202420hOa.LIZ();
            StorageCleanServiceImpl.LIZJ().LIZIZ(applicationLIZ2, new C830330Whj(applicationLIZ2, new C830340Whk(c013c, bitmap, parent, name, countDownLatch)));
            countDownLatch.await();
            return c013c.element;
        }
        return c830320Whi.LIZJ(bitmap, parent, name, false);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDLocal(String str, Context context) {
        return C1215760hk6.LIZ(str, context);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final String disLikeAweme(Aweme aweme, LinkData linkData) {
        return C1255950imv.LIZIZ(aweme, C990310bsT.LIZ(aweme));
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void disLikeAwemeApi(String str, Map<String, String> map) {
        C1255950imv.LIZJ(str, map);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final C0QTN getAsyncInflater(final Activity activity, int i) {
        final long j = i;
        return new C686870Qwv(j, activity) { // from class: X.0Qwz
            {
                super(activity);
                this.LIZJ = j;
            }
        };
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment getFavoriteVideoListFragment(Context context, Bundle bundle) {
        String name;
        if (LIZIZ(bundle)) {
            name = FavoriteInvalidAwemeListFragment.class.getName();
        } else {
            name = AwemeListFragmentImpl.class.getName();
        }
        Fragment fragmentInstantiate = Fragment.instantiate(context, name, bundle);
        if (!(fragmentInstantiate instanceof Fragment)) {
            return null;
        }
        return fragmentInstantiate;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final long getLastTimeShowPublishSuccessWindow(String str, long j) {
        C19633311rf c19633311rf = C1238700iL6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_time_show_publish_success_window_");
        sbLIZ.append(str);
        return c19633311rf.LIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponse(Handler handler, EnumC1254690ikt enumC1254690ikt) {
        boolean zLJI = MethodIDManager.LJI(202446);
        C1254580iki.LIZ().getClass();
        C1254580iki.LIZIZ(C1254710ikv.LIZIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), null, 0, Boolean.FALSE, enumC1254690ikt), handler);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeCacheByUser(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            if (r8 == 0) goto L81
            int r0 = r8.length()
            if (r0 == 0) goto L81
            r0 = 0
        Le:
            java.lang.String r3 = "both secUid and uid are null, unable to remove cache"
            java.lang.String r1 = "unique_id"
            java.lang.String r6 = "user_id"
            java.lang.String r5 = "sec_user_id"
            java.lang.String r4 = ""
            if (r0 != 0) goto L67
            r2.put(r5, r8)
            r2.put(r6, r4)
            r2.put(r1, r4)
        L23:
            com.bytedance.ies.ugc.aweme.network.IPowerPreload r1 = com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl.LIZIZ()
            java.lang.String r0 = "/aweme/v1/user/profile/other/"
            r1.LIZ(r0, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            if (r8 == 0) goto L39
            int r0 = r8.length()
            if (r0 != 0) goto L49
        L39:
            if (r9 == 0) goto L47
            int r0 = r9.length()
            if (r0 == 0) goto L47
            r2.put(r6, r9)
            r2.put(r5, r4)
        L47:
            if (r8 == 0) goto L55
        L49:
            int r0 = r8.length()
            if (r0 == 0) goto L55
            r2.put(r5, r8)
            r2.put(r6, r4)
        L55:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L83
            com.bytedance.ies.ugc.aweme.network.IPowerPreload r1 = com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl.LIZIZ()
            java.lang.String r0 = "/aweme/v1/aweme/post/"
            r1.LIZ(r0, r2)
            return
        L67:
            if (r9 == 0) goto L79
            int r0 = r9.length()
            if (r0 == 0) goto L79
            r2.put(r6, r9)
            r2.put(r5, r4)
            r2.put(r1, r4)
            goto L23
        L79:
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "profile_preload"
            X.C1720106oR.LIZ(r0, r3)
            goto L23
        L81:
            r0 = 1
            goto Le
        L83:
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "aweme_post_preload"
            X.C1720106oR.LIZ(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.framework.service.ProfileServiceImpl.removeCacheByUser(java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void setLastTimeShowPublishSuccessWindow(String str, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C19633311rf c19633311rf = C1238700iL6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_time_show_publish_success_window_");
        sbLIZ.append(str);
        c19633311rf.LIZLLL().putLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis).apply();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showCouponIconInCouponKeva(String str, int i) {
        C1254790il3 c1254790il3LIZ = C1254790il3.LIZ();
        String string = c1254790il3LIZ.LIZJ.getString(str, "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showCouponIcon,activityId:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!TextUtils.equals(string, "")) {
            try {
                if ((new Date().getTime() - c1254790il3LIZ.LIZ.parse(string).getTime()) / TimeUnit.DAYS.toMillis(1L) < i) {
                    return true;
                }
            } catch (ParseException e) {
                TryCatchGuardChecker.doCheck(e);
                c1254790il3LIZ.LIZJ.storeString(str, "");
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String str = HeaderDetailActivity._pnsPageId;
        C1254530ikd.LIZ(activity, bundle);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditActivity(Activity activity, Bundle bundle) {
        String str = ProfileEditActivity._pnsPageId;
        if (activity != null) {
            if (bundle == null) {
                Intent intent = new Intent(activity, (Class<?>) ProfileEditActivity.class);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzb/rFixKVb9Q==", null));
                return;
            }
            Intent intent2 = new Intent(activity, (Class<?>) ProfileEditActivity.class);
            intent2.putExtras(bundle);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
            C1701330uNH.LIZ(intent2, activity);
            C2204961BRm.LJIILLIIL(activity, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzb/rFixKVb9Q==", null));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditBioUrlActivity(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        String str2 = ProfileEditBioUrlActivity._pnsPageId;
        if (str == null) {
            str = "";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//profile/edit_bio");
        smartRouteBuildRoute.withParam("bio_url", str);
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageEnterMethod(Fragment fragment, String str) {
        C0SSZ c0ssz;
        I18nUserProfileFragment i18nUserProfileFragment;
        Object objCS;
        if (fragment instanceof ProfilePageFragment) {
            ProfilePageFragment profilePageFragment = (ProfilePageFragment) fragment;
            String str2 = profilePageFragment.LLJI;
            str2.getClass();
            switch (str2.hashCode()) {
                case 267192787:
                    if (str2.equals("page_my_fragment") && (c0ssz = profilePageFragment.LLILLJJLI) != null) {
                        c0ssz.b2(str);
                        profilePageFragment.LLILLJJLI.setPreviousPage(profilePageFragment.LLJILJILJ);
                        break;
                    }
                    break;
                case 929385108:
                    if (str2.equals("page_user_fragment") && (i18nUserProfileFragment = profilePageFragment.LL) != null) {
                        i18nUserProfileFragment.b2(str);
                        break;
                    }
                    break;
                case 1157058698:
                    if (str2.equals("page_fake_user_fragment") && (objCS = profilePageFragment.cS(InterfaceC1054930dYh.class, "page_fake_user_fragment")) != null) {
                        ((InterfaceC1054930dYh) objCS).PG();
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, Bundle bundle) {
        if (C690970R8l.LIZ() && (fragment instanceof ProfilePageFragment)) {
            ProfilePageFragment profilePageFragment = (ProfilePageFragment) fragment;
            Bundle arguments = profilePageFragment.getArguments();
            if (arguments != null) {
                if (bundle != null) {
                    C786410Ut5.LJJIIJZLJL(arguments, bundle);
                }
            } else {
                arguments = bundle;
            }
            profilePageFragment.setArguments(arguments);
            I18nUserProfileFragment i18nUserProfileFragment = profilePageFragment.LL;
            if (i18nUserProfileFragment != null) {
                i18nUserProfileFragment.sS(C1252470ihJ.LIZIZ(bundle));
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str) {
        I18nUserProfileFragment i18nUserProfileFragment;
        if ((fragment instanceof ProfilePageFragment) && (i18nUserProfileFragment = ((ProfilePageFragment) fragment).LL) != null) {
            i18nUserProfileFragment.LLIZ(str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final Drawable getEaseInOutGradientDrawable(float f, int i, boolean z) {
        if (z) {
            C844470XAv.LIZ.getClass();
            return C800330VaR.LIZIZ(C844470XAv.LIZ(), R.drawable.d0q);
        }
        if (C1254610ikl.LIZJ == null) {
            PointF pointF = C1254610ikl.LIZ;
            pointF.x = 0.42f;
            pointF.y = 0.0f;
            PointF pointF2 = C1254610ikl.LIZIZ;
            pointF2.x = 0.58f;
            pointF2.y = 1.0f;
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RectShape());
            final int[] iArr = new int[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
            int i2 = 0;
            do {
                float f2 = (i2 * 1.0f) / 4095;
                float f3 = 1 - f2;
                float f4 = f2 * f2;
                float f5 = f3 * f3;
                float f6 = 3;
                iArr[i2] = (((int) Math.ceil(255 * ((((((f5 * f3) * 0) + (((f5 * f6) * f2) * C1254610ikl.LIZ.y)) + (((f6 * f3) * f4) * C1254610ikl.LIZIZ.y)) + ((f4 * f2) * r2)) * f))) << 24) & i;
                i2++;
            } while (i2 < 4096);
            paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: X.0GQY
                @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                public final Shader resize(int i3, int i4) {
                    float f7 = i3 * 0.0f;
                    float f8 = i4;
                    return new LinearGradient(f7, f8 * 0.0f, f7, f8 * 1.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
                }
            });
            C1254610ikl.LIZJ = paintDrawable;
        }
        Drawable drawable = C1254610ikl.LIZJ;
        if (drawable != null) {
            return drawable;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryUserResponse(String str, boolean z, String str2) {
        String str3 = C1254710ikv.LIZ;
        C1260090itb.LIZIZ.apiExecuteGetJSONObject(str, UserResponse.class, "", z, str2, null);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final void requestUser(String str, String str2, InterfaceC1254680iks interfaceC1254680iks) {
        C1254560ikg c1254560ikg = new C1254560ikg() { // from class: X.0ikf
            @Override // X.C1260870iur, X.InterfaceC1526205yG
            public final void onSuccess() {
                UserResponse userResponse = (UserResponse) this.LL.getData();
                if (userResponse == null) {
                    return;
                }
                userResponse.getUser();
            }

            @Override // X.C1254560ikg, X.C1260870iur, X.InterfaceC1526205yG
            public final void onFailed(Exception exc) {
                super.onFailed(exc);
            }
        };
        c1254560ikg.LJIILL();
        c1254560ikg.LIZJ(str, str2);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateCoverIfMyProfileVisible(C19EG c19eg, String str, Aweme aweme) {
        Object obj;
        Fragment fragmentH62;
        AssemSupervisor assemSupervisorLIZJ;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        InterfaceC1249800id0 interfaceC1249800id0;
        HomeTabAbility homeTabAbilityLIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            obj = abstractC1387200mCcLJ.LIZ;
        } else {
            obj = null;
        }
        if ((obj instanceof InterfaceC1603190roz) && obj != null) {
            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
            if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                fragmentH62 = homeTabAbilityLIZ.h62();
            } else {
                fragmentH62 = null;
            }
            if ((fragmentH62 instanceof I18nMyProfileFragment) && fragmentH62.isVisible() && str.length() != 0 && (assemSupervisorLIZJ = C724240Sb0.LIZJ(fragmentH62)) != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                    if ((abstractC738140SxQ instanceof ProfileRootComponent) && (assemSupervisorLJ = C724240Sb0.LJ(abstractC738140SxQ)) != null && (copyOnWriteArrayList2 = assemSupervisorLJ.LLJILLL) != null) {
                        for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList2) {
                            if ((abstractC738140SxQ2 instanceof MineAwemePagerAssem) && (interfaceC1249800id0 = (InterfaceC1249800id0) C1252710ihh.LJI(abstractC738140SxQ2, C13LE.LIZ(InterfaceC1249800id0.class), null)) != null) {
                                interfaceC1249800id0.YF(str, aweme);
                            }
                        }
                    }
                }
            }
        }
    }

    public static Bundle LIZ(int i, Boolean bool, String str, boolean z) {
        boolean zBooleanValue;
        String uniqueId;
        Bundle bundle = new Bundle();
        bundle.putInt("type", 4);
        C786410Ut5.LJJJI("uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), bundle);
        C786410Ut5.LJJJI("sec_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), bundle);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        bundle.putBoolean("is_my_profile", zBooleanValue);
        bundle.putBoolean("is_scene_transition_enable", false);
        bundle.putInt("bottom_bar_height", i);
        bundle.putBoolean("should_refresh_on_init_data", true);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null) {
            uniqueId = curUser.getUniqueId();
        } else {
            uniqueId = null;
        }
        C786410Ut5.LJJJI("user_unique_id", uniqueId, bundle);
        C786410Ut5.LJJJI("tab_name", C1259870itF.LIZ(8), bundle);
        C786410Ut5.LJJJI("previous_page", str, bundle);
        bundle.putBoolean("show_cover", true);
        bundle.putBoolean("is_from_main", z);
        return bundle;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDNet(String str, String str2, String str3, Context context) {
        return C1215760hk6.LIZIZ(str, str2, str3, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[PHI: r7
      0x008e: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v5 java.lang.String) binds: [B:30:0x008b, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[PHI: r6 r7
      0x0092: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:33:0x008f, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String) binds: [B:33:0x008f, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preloadProfileInfoAndAwemePost(com.ss.android.ugc.aweme.feed.model.Aweme r16, final java.lang.Integer r17, final int r18, final java.lang.String r19) {
        /*
            r15 = this;
            r9 = 0
            if (r16 == 0) goto L8a
            com.ss.android.ugc.aweme.profile.model.User r0 = r16.getAuthor()
            if (r0 == 0) goto L8a
            java.lang.String r7 = r0.getSecUid()
        Ld:
            com.ss.android.ugc.aweme.profile.model.User r0 = r16.getAuthor()
            if (r0 == 0) goto L8e
            java.lang.String r6 = r0.getUid()
        L17:
            com.ss.android.ugc.aweme.profile.model.User r0 = r16.getAuthor()
            if (r0 == 0) goto L92
            java.lang.String r11 = r0.getUniqueId()
        L21:
            if (r7 == 0) goto L7f
            int r0 = r7.length()
            if (r0 == 0) goto L7f
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            X.0ikt r5 = X.EnumC1254690ikt.OTHER_OLD
            r3 = 0
            r0 = r7
            r1 = r9
            r2 = r9
            java.lang.String r3 = X.C1254710ikv.LIZIZ(r0, r1, r2, r3, r4, r5)
        L35:
            X.01GW r2 = X.C0BM9.LIZIZ
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = r19
            r5 = r18
            r8 = r17
            if (r0 == 0) goto L56
            X.0inB r1 = new X.0inB
            r1.<init>()
            X.13tJ r0 = X.C20152913tH.LIZLLL
            r0.getClass()
            X.C20153113tJ.LIZJ(r1)
        L56:
            if (r7 == 0) goto L5f
            int r0 = r7.length()
            if (r0 == 0) goto L5f
            r6 = r9
        L5f:
            java.lang.String r0 = X.C1255950imv.LIZ
            long r9 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7e
            X.0inA r3 = new X.0inA
            r3.<init>()
            X.13tJ r0 = X.C20152913tH.LIZLLL
            r0.getClass()
            X.C20153113tJ.LIZJ(r3)
        L7e:
            return
        L7f:
            r12 = 0
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            X.0ikt r14 = X.EnumC1254690ikt.OTHER_OLD
            r10 = r6
            java.lang.String r3 = X.C1254710ikv.LIZIZ(r9, r10, r11, r12, r13, r14)
            goto L35
        L8a:
            r7 = r9
            if (r16 == 0) goto L8e
            goto Ld
        L8e:
            r6 = r9
            if (r16 == 0) goto L92
            goto L17
        L92:
            r11 = r9
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.framework.service.ProfileServiceImpl.preloadProfileInfoAndAwemePost(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, int, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileWithId(Handler handler, String str, int i, EnumC1254690ikt enumC1254690ikt) {
        C1254580iki.LIZ().getClass();
        String strLIZIZ = C1254710ikv.LIZIZ(null, str, null, i, Boolean.TRUE, enumC1254690ikt);
        C1723306ox.LIZ(strLIZIZ);
        C1BVK.LIZIZ().LIZ(handler, new ACallableS27S1000000_19(strLIZIZ, 1), 0);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final C11NZ<RelationSearchResponse> queryRelationSearchList(int i, String str, String str2, Integer num) {
        RelationSearchApi.LIZ.getClass();
        return C1247640iZW.LIZIZ.getValue().queryRelationSearchList(i, str, str2, C0C10.LIZ(), C0C11.LIZ(), "", num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startHeaderDetailActivity(android.app.Activity r10, android.view.View r11, com.ss.android.ugc.aweme.profile.model.User r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity._pnsPageId
            r5 = r12
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = X.C10EU.LIZLLL(r5)
            boolean r0 = X.C1245170iVX.LIZIZ(r5, r4)
            if (r0 != 0) goto L17
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = X.C10EU.LJII(r5)
            if (r4 != 0) goto L19
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = X.C10EU.LIZLLL(r5)
        L17:
            if (r4 == 0) goto L4c
        L19:
            java.util.List r0 = r4.getUrlList()
            boolean r0 = X.C1256140inE.LIZIZ(r0)
            if (r0 == 0) goto L4c
            java.util.List r0 = r4.getUrlList()
            int r3 = r0.size()
            java.lang.String[] r2 = new java.lang.String[r3]
            r1 = 0
        L2e:
            if (r1 >= r3) goto L3d
            java.util.List r0 = r4.getUrlList()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L2e
        L3d:
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r6 = r13
            r3 = r11
            r2 = r10
            X.C1254530ikd.LIZIZ(r2, r3, r4, r5, r6, r7, r8)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.framework.service.ProfileServiceImpl.startHeaderDetailActivity(android.app.Activity, android.view.View, com.ss.android.ugc.aweme.profile.model.User, boolean):void");
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final void startHeaderDetailActivity(Activity activity, View view, float f, String... strArr) {
        String str = HeaderDetailActivity._pnsPageId;
        C1254530ikd.LIZIZ(activity, view, f, null, false, null, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String disLikeAweme(Aweme aweme, int i, String str, int i2, int i3) {
        return C1255950imv.LIZ(aweme, i, str, i2, i3);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Bundle getFavoriteVideoListFragmentArgs(Context context, int i, Boolean bool, String str, boolean z) {
        return LIZ(i, bool, str, z);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final PowerViewPagerFragmentItem<?> getFavoriteVideoListFragmentItem(Context context, int i, Boolean bool, String str, boolean z) {
        Bundle bundleLIZ = LIZ(i, bool, str, z);
        if (LIZIZ(bundleLIZ)) {
            return new FavoriteInvalidAwemeListFragmentData(bundleLIZ);
        }
        return new FavoriteVideoCollectionFragmentData(bundleLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startHeaderDetailActivity(android.app.Activity r6, android.view.View r7, com.ss.android.ugc.aweme.profile.model.User r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            java.lang.String r0 = com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity._pnsPageId
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = X.C10EU.LIZLLL(r8)
            boolean r0 = X.C1245170iVX.LIZIZ(r8, r4)
            if (r0 != 0) goto L16
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = X.C10EU.LJII(r8)
            if (r4 != 0) goto L18
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = X.C10EU.LIZLLL(r8)
        L16:
            if (r4 == 0) goto L70
        L18:
            java.util.List r0 = r4.getUrlList()
            boolean r0 = X.C1256140inE.LIZIZ(r0)
            if (r0 == 0) goto L70
            java.util.List r0 = r4.getUrlList()
            int r3 = r0.size()
            java.lang.String[] r2 = new java.lang.String[r3]
            r1 = 0
        L2d:
            if (r1 >= r3) goto L3c
            java.util.List r0 = r4.getUrlList()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L2d
        L3c:
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.ss.android.ugc.aweme.utils.ZoomAnimationUtils$ZoomInfo r1 = com.ss.android.ugc.aweme.utils.ZoomAnimationUtils.LIZ(r7)
            java.lang.String r0 = "extra_zoom_info"
            X.C786410Ut5.LJJIJL(r2, r0, r1)
            java.lang.String r0 = "uri"
            r2.putStringArray(r0, r3)
            java.lang.String r0 = "enable_edit_img"
            r2.putBoolean(r0, r10)
            java.lang.String r1 = "wh_ratio"
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.putFloat(r1, r0)
            java.lang.String r0 = "enable_download_img"
            r2.putBoolean(r0, r9)
            if (r8 == 0) goto L6d
            java.lang.String r0 = "share_info"
            X.C786410Ut5.LJJIZ(r2, r0, r8)
        L6d:
            X.C1254530ikd.LIZ(r6, r2)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.framework.service.ProfileServiceImpl.startHeaderDetailActivity(android.app.Activity, android.view.View, com.ss.android.ugc.aweme.profile.model.User, boolean, boolean):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str, boolean z, boolean z2, Bundle bundle) {
        C0SSZ c0ssz;
        I18nUserProfileFragment i18nUserProfileFragment;
        Object objCS;
        C1055030dYr c1055030dYr;
        Fragment fragment2;
        if (fragment instanceof ProfilePageFragment) {
            ProfilePageFragment profilePageFragment = (ProfilePageFragment) fragment;
            profilePageFragment.LLJJJJ = str;
            C1017290cZz.LIZIZ(str);
            C1017290cZz.LIZIZ(profilePageFragment.LLJJJJ);
            C1055030dYr c1055030dYr2 = profilePageFragment.LLJLILLLLZIIL;
            if (c1055030dYr2 != null) {
                c1055030dYr2.LIZIZ = str;
                C0CXE.LIZ.getClass();
                if (C0CXE.LIZ() && !TextUtils.equals(str, "scroll_to_slide") && !TextUtils.equals(str, "click_top_icon") && (fragment2 = (c1055030dYr = profilePageFragment.LLJLILLLLZIIL).LJFF) != null && !fragment2.isHidden() && c1055030dYr.LJII) {
                    profilePageFragment.N7();
                }
            }
            String str2 = profilePageFragment.LLJI;
            str2.getClass();
            switch (str2.hashCode()) {
                case 267192787:
                    if (str2.equals("page_my_fragment") && (c0ssz = profilePageFragment.LLILLJJLI) != null) {
                        c0ssz.b2(str);
                        profilePageFragment.LLILLJJLI.setPreviousPage(profilePageFragment.LLJILJILJ);
                    }
                    break;
                case 929385108:
                    if (str2.equals("page_user_fragment") && (i18nUserProfileFragment = profilePageFragment.LL) != null) {
                        i18nUserProfileFragment.b2(str);
                    }
                    break;
                case 1157058698:
                    if (str2.equals("page_fake_user_fragment") && (objCS = profilePageFragment.cS(InterfaceC1054930dYh.class, "page_fake_user_fragment")) != null) {
                        ((InterfaceC1054930dYh) objCS).PG();
                    }
                    break;
            }
            if (z) {
                profilePageFragment.LLJILLL = "main_head";
            }
            profilePageFragment.LLL.LJIIIIZZ(new C1027190cpx(z2));
            updateProfilePageFragmentParams(fragment, bundle);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void showInChooseAccountBottomSheet(FragmentManager fragmentManager, C1255390im1 c1255390im1, String str, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener) {
        C1255380im0.LIZ(fragmentManager, c1255390im1, str, bundle, onDismissListener, onCancelListener);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateSavePostChoose(final Activity activity, String str, AvatarUri avatarUri, String str2, final Function0<Unit> function0, final Function1<? super Exception, Unit> function1) {
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        C1232050iAN c1232050iAN = new C1232050iAN(str, EnumC1216940hm0.PHOTO_AVATAR);
        c1232050iAN.LJ = "checked";
        C1232060iAO c1232060iAO = new C1232060iAO(c1232050iAN);
        c1232140iAW.getClass();
        C1232140iAW.LJ(c1232060iAO);
        HashMap map = new HashMap();
        map.put("avatar_uri", avatarUri.uri);
        map.put("avatar_source", str2);
        map.put("static_avatar", "");
        map.put("page_from", String.valueOf(EnumC1254850il9.TWO_HEADER.getValue()));
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLJLI(new NaviAssetUploadHandler(activity, new InterfaceC1232420iAy() { // from class: X.0hkq
            @Override // X.InterfaceC1232420iAy
            public final void Pc0(boolean z) {
            }

            @Override // X.InterfaceC1232420iAy
            public final void aL0(String str3, boolean z) {
            }

            @Override // X.InterfaceC1232420iAy
            public final void JE2(int i, Exception exc) {
                String message;
                if (activity != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                    c1389890mGx.LJIIIZ(2131829445);
                    c1389890mGx.LJIIJJI();
                }
                if (exc != null) {
                    message = exc.getMessage();
                } else {
                    message = null;
                }
                C2237308pf.LIZ(message, "stage: edit_page_post_to_story result: user update fail");
                function1.invoke(exc);
            }

            @Override // X.InterfaceC1232420iAy
            public final void Ud0(int i, User user) {
                function0.invoke();
            }
        }), map);
        C21509519Ft.LIZ(true);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl
    public final AwemeListFragment newAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle) {
        return MTAwemeListFragment.HU(i, i2, str, str2, z, false, false, bundle);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC1257400ipG getMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle) {
        return MTAwemeListFragment.HU(i, i2, str, str2, z, z2, z3, new Bundle());
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr) {
        String str = HeaderDetailActivity._pnsPageId;
        C1254530ikd.LIZIZ(activity, view, f, user, z, challenge, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Object updateUserSocialAvatar(final Activity activity, boolean z, boolean z2, int i, int i2, Map<String, String> map, long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Integer numLJ;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        HashMap map2 = new HashMap();
        if (z2) {
            numLJ = C2286608xc.LJ(1);
        } else {
            numLJ = null;
        }
        map2.put("social_avatar", GsonProtectorUtils.toJson(C293501Bt.LIZ(), new UpdateSocialAvatarStruct(numLJ, C2286608xc.LJ(i), C2286608xc.LJ(i2), map.get("compiled_avatar"), map.get("static_avatar"), map.get("dynamic_avatar"), C2286608xc.LJFF(j))));
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLJLI(new NaviAssetUploadHandler(activity, new InterfaceC1232420iAy() { // from class: X.0hkr
            @Override // X.InterfaceC1232420iAy
            public final void Pc0(boolean z3) {
            }

            @Override // X.InterfaceC1232420iAy
            public final void aL0(String str, boolean z3) {
            }

            @Override // X.InterfaceC1232420iAy
            public final void JE2(int i3, Exception exc) {
                String message;
                if (activity != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                    c1389890mGx.LJIIIZ(2131829445);
                    c1389890mGx.LJIIJJI();
                }
                if (exc != null) {
                    message = exc.getMessage();
                } else {
                    message = null;
                }
                C2237308pf.LIZ(message, "stage: edit_page_post_to_story result: user update fail");
                InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                C098200Yq c098200Yq = new C098200Yq(new C0HHE(exc));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn2.resumeWith(c098200Yq);
            }

            @Override // X.InterfaceC1232420iAy
            public final void Ud0(int i3, User user) {
                InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn2.resumeWith(unit);
            }
        }), map2);
        C21509519Ft.LIZ(z);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryAwemeWithID(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4) {
        C1255950imv.LJI(z, str, str2, i, j, i2, str3, new C846160XHi(), false, "aweme_render_first_frame_preload");
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle, boolean z2) {
        String str2 = CropActivity._pnsPageId;
        C21508119Ff.LIZIZ(fragment, str, z, f, i, i2, i3, i4, i5, true, bundle, z2, true, false);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.service.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
        String str2 = CropActivity._pnsPageId;
        C21508119Ff.LIZ(activity, str, z, f, i, i2, i3, i4, i5, z2, bundle, z3, true, false);
    }
}
