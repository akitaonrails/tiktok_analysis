package com.ss.android.ugc.aweme.services;

import X.AbstractC1338480kw2;
import X.AbstractC1585770rMt;
import X.AbstractC19484711Kz;
import X.ActivityC21503719Dn;
import X.C04TD;
import X.C09AJ;
import X.C0C64;
import X.C0XPA;
import X.C0XPB;
import X.C0XPY;
import X.C10EU;
import X.C11NZ;
import X.C11S5;
import X.C1291860jiq;
import X.C1701940uOG;
import X.C1911880zqs;
import X.C19296410eQ;
import X.C19EG;
import X.C1C7U;
import X.C1E90;
import X.C2018507vT;
import X.C2277881EDy;
import X.C627150Oin;
import X.C683660Qrk;
import X.C786410Ut5;
import X.C846160XHi;
import X.InterfaceC1054790dYT;
import X.InterfaceC1259570isl;
import X.InterfaceC1260100itc;
import X.InterfaceC1291870jir;
import X.InterfaceC1478005qU;
import X.InterfaceC1685420txc;
import X.InterfaceC2329309At;
import X.InterfaceC300801Eo;
import X.InterfaceC683650Qrj;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.newfollow.ui.DiscoverCompassTabProtocol;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.profiletab.ProfileTabProtocol;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class ProfileDependentComponentImpl implements IProfileDependentComponentService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public InterfaceC1054790dYT adUtilsService() {
        return new AdUtilsServiceImpl();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public BridgeServiceImpl bridgeService() {
        return new BridgeServiceImpl();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public FavoritesMobUtilsServiceImpl favoritesMobUtilsService() {
        return new FavoritesMobUtilsServiceImpl();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public AbstractC1585770rMt getDiscoverTabProtocol() {
        return new AbstractC1585770rMt() { // from class: X.0qZM
            @Override // X.AbstractC1585770rMt
            public final BottomTabProtocol LIZ() {
                return new DiscoverCompassTabProtocol();
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.DISCOVER;
            }
        };
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public AbstractC1585770rMt getProfileTabProtocol() {
        return new AbstractC1585770rMt() { // from class: X.0qzA
            @Override // X.AbstractC1585770rMt
            public final BottomTabProtocol LIZ() {
                return new ProfileTabProtocol();
            }

            @Override // X.AbstractC1585770rMt
            public final InterfaceC1570900qyu LIZJ() {
                return new C1571260qzU();
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.PROFILE;
            }
        };
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public C11NZ<Boolean> needShowDiskManagerGuideView() {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl.needShowDiskManagerGuideView.1
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Boolean> c09aj) {
                C1C7U.LIZ("ProfileDependentComponentImpl@216f.needShowDiskManagerGuideView$1");
                try {
                    c09aj.onNext(Boolean.valueOf(C19296410eQ.LIZIZ.needShowProfileGuideView()));
                    c09aj.onComplete();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c09aj.onError(e);
                }
                C1C7U.LIZIZ("ProfileDependentComponentImpl@216f.needShowDiskManagerGuideView$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public boolean platformInfoManagerHasPlatformBinded() {
        C0XPA c0xpa = C0XPA.LIZLLL;
        c0xpa.getClass();
        c0xpa.LIZIZ(C0XPY.LIZIZ);
        C0XPB[] c0xpbArr = c0xpa.LIZIZ;
        for (C0XPB c0xpb : c0xpbArr) {
            if (c0xpb.LIZJ) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public boolean shouldUseRecyclerPartialUpdate() {
        return C1E90.LIZIZ.shouldUseRecyclerPartialUpdate();
    }

    public boolean isEnableSettingDiskManager() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_setting_disk_manager", true) == 1;
    }

    public void logShowProfileDiskManagerGuideView() {
        C2018507vT.LIZ().storeBoolean("has_show_disk_manager_guide", true);
    }

    public InterfaceC1685420txc<Activity, Fragment, Integer, String, String, Unit> getStartCameraActivity() {
        return ProfileDependentComponentImpl$startCameraActivity$1.INSTANCE;
    }

    public static IProfileDependentComponentService createIProfileDependentComponentServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IProfileDependentComponentService.class, z);
        if (objLIZ != null) {
            return (IProfileDependentComponentService) objLIZ;
        }
        return new ProfileDependentComponentImpl();
    }

    public void clearNinePatchBubbleState(Context context) {
        if (context == null) {
            return;
        }
        C1911880zqs.LIZ.LIZ.storeBoolean("bubble_state", false);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public boolean isDetailActivity(Activity activity) {
        return activity instanceof DetailActivity;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public boolean isUserProfileActivity(Activity activity) {
        if (activity instanceof ActivityC21503719Dn) {
            if (C2277881EDy.LIZIZ.isUserProfileFragment(((ActivityC21503719Dn) activity).getPowerAttachRootFragment())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public InterfaceC1259570isl mainAnimViewModel(C19EG c19eg) {
        return new InterfaceC1259570isl(c19eg) { // from class: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl.mainAnimViewModel.1
            public final MainAnimViewModel mainAnimViewModel;

            @Override // X.InterfaceC1259570isl
            public MutableLiveData<Boolean> isUserProfileFragmentVisible2() {
                return this.mainAnimViewModel.LLILLJJLI;
            }

            public final MainAnimViewModel getMainAnimViewModel() {
                return this.mainAnimViewModel;
            }

            {
                this.mainAnimViewModel = (MainAnimViewModel) ViewModelProviders.of(c19eg).get(MainAnimViewModel.class);
            }
        };
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public boolean onAntiCrawlerEvent(String str) {
        if (str == null) {
            return false;
        }
        if (!a0.LJJIIZI(str, "/aweme/v1/aweme/post/?", false) && !a0.LJJIIZI(str, "/aweme/v1/aweme/favorite/?", false) && !a0.LJJIIZI(str, "/aweme/v1/aweme/listcollection/?", false)) {
            return false;
        }
        return true;
    }

    public void startDiskManagerActivity(Context context) {
        SmartRouter.buildRoute(context, "//setting/diskmanager_compose").open();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public AbstractC19484711Kz<BaseResponse> setPrivateSettingItem(final String str, final int i) {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl.setPrivateSettingItem.1
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<BaseResponse> interfaceC2329309At) {
                interfaceC2329309At.onSuccess(C19296410eQ.LIZIZ.setPushPrivateSettingItem(str, i));
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ());
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public void startDownloadControlSettingActivity(Activity activity, int i) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//setting/download");
        smartRouteBuildRoute.withParam("enter_from", "personal_homepage");
        smartRouteBuildRoute.open();
    }

    public void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        C2277881EDy.LIZIZ.startHeaderDetailActivity(activity, bundle);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public C1291860jiq newLiveBlurProcessor(int i, float f, InterfaceC1260100itc interfaceC1260100itc) {
        return new C1291860jiq(i, f, new InterfaceC1291870jir(interfaceC1260100itc) { // from class: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl.newLiveBlurProcessor.1
            public final /* synthetic */ InterfaceC1260100itc $listener;

            @Override // X.InterfaceC1291870jir
            public final void processorFinish(Object obj) {
            }
        });
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, InterfaceC683650Qrj interfaceC683650Qrj, AbstractC1338480kw2 abstractC1338480kw2, boolean z) {
        C683660Qrk.LIZ(recyclerView, interfaceC683650Qrj, abstractC1338480kw2, 10, z);
        return recyclerView;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public void startHeaderDetailActivity(Activity activity, View view, String str, User user) {
        String[] strArrLJI;
        C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
        C627150Oin c627150Oin = new C627150Oin();
        C786410Ut5.LJJIJL(c627150Oin.LIZ, "extra_zoom_info", ZoomAnimationUtils.LIZ(view));
        c627150Oin.LIZ.putBoolean("enable_edit_img", false);
        if (TextUtils.isEmpty(str)) {
            strArrLJI = C10EU.LJI(C10EU.LIZLLL(user));
        } else {
            strArrLJI = new String[]{str};
        }
        c627150Oin.LIZ.putStringArray("uri", strArrLJI);
        c627150Oin.LIZ.putBoolean("enable_download_img", true);
        C786410Ut5.LJJIZ(c627150Oin.LIZ, "share_info", user);
        c2277881EDy.startHeaderDetailActivity(activity, c627150Oin.LIZ);
    }

    public void startHeaderDetailActivityForViewAvatar(Activity activity, View view, String str, User user) {
        String[] strArrLJI = C10EU.LJI(C10EU.LJII(user));
        if (strArrLJI == null) {
            strArrLJI = C10EU.LJI(C10EU.LIZLLL(user));
        }
        C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
        C627150Oin c627150Oin = new C627150Oin();
        C786410Ut5.LJJIJL(c627150Oin.LIZ, "extra_zoom_info", ZoomAnimationUtils.LIZ(view));
        c627150Oin.LIZ.putBoolean("enable_edit_img", false);
        if (!TextUtils.isEmpty(str)) {
            strArrLJI = new String[]{str};
        }
        c627150Oin.LIZ.putStringArray("uri", strArrLJI);
        c627150Oin.LIZ.putBoolean("enable_download_img", true);
        C786410Ut5.LJJIZ(c627150Oin.LIZ, "share_info", user);
        c2277881EDy.startHeaderDetailActivity(activity, c627150Oin.LIZ);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public void watchLiveMob(Context context, User user, String str, String str2) {
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterFromMerge = str;
        roomsData.enterMethod = str2;
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LJIIIIZZ(context, user, enterRoomConfig);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        C2277881EDy.LIZIZ.startHeaderDetailActivity(activity, view, user, z);
    }

    public void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        C2277881EDy.LIZIZ.startHeaderDetailActivity(activity, view, user, z, z2);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3, Object obj) {
        boolean zLJI = MethodIDManager.LJI(137833);
        boolean zLJI2 = MethodIDManager.LJI(196728);
        String str4 = Api.LIZ;
        boolean zLJI3 = MethodIDManager.LJI(137651);
        T t = (T) Api.LIZLLL(0, str, cls, str2, null, obj);
        if (zLJI3) {
            MethodIDManager.LJ();
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return t;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C846160XHi c846160XHi, boolean z, String str3) {
        boolean zLJI = MethodIDManager.LJI(137833);
        boolean zLJI2 = MethodIDManager.LJI(196728);
        String str4 = Api.LIZ;
        boolean zLJI3 = MethodIDManager.LJI(137651);
        T t = (T) Api.LIZLLL(i, str, cls, str2, c846160XHi, null);
        if (zLJI3) {
            MethodIDManager.LJ();
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return t;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle, boolean z2) {
        C2277881EDy.LIZIZ.gotoCrop(fragment, str, z, f, i, i2, i3, i4, i5, bundle, z2);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
        C2277881EDy.LIZIZ.gotoCrop(activity, str, z, f, i, i2, i3, i4, i5, z2, bundle, z3);
    }
}
