package com.ss.android.ugc.aweme.main.assems;

import X.C0QSJ;
import X.C0SPE;
import X.C1017070cZd;
import X.C1017370ca7;
import X.C1150504el;
import X.C1398110mUD;
import X.C13LE;
import X.C14EU;
import X.C1567240qt0;
import X.C1594070raH;
import X.C1908480zlO;
import X.C19EG;
import X.C2217381BqS;
import X.C279180Awu;
import X.C680080Qly;
import X.C687700QyG;
import X.C714530S1b;
import X.C724240Sb0;
import X.C739490Szb;
import X.C786410Ut5;
import X.C810560Vqw;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ARunnableS93S0200000_24;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class MainLegacyEventBusAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public volatile HomePageViewPagerAbility LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C0QSJ LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MainLegacyEventBusAssem.class, "homepageViewPagerAbility", "getHomepageViewPagerAbility()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MainLegacyEventBusAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onHideLivePopupWindowEvent(C1594070raH c1594070raH) {
        if (((Boolean) C279180Awu.LIZ.getValue()).booleanValue()) {
            return;
        }
        C1908480zlO.LIZIZ.LIZ("ad");
    }

    @C14EU
    public final void onMobEnterFromEvent(C1567240qt0 c1567240qt0) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        C680080Qly.LIZIZ(c19egLIZ).setEventType(c1567240qt0.LIZ);
    }

    @C14EU
    public final void onMobRequestIdEvent(C739490Szb c739490Szb) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        C680080Qly.LIZIZ(c19egLIZ).LLJ = c739490Szb.LIZ;
    }

    @C14EU
    public final void onScrollToProfileEvent(C0SPE c0spe) {
        MainActivity mainActivity;
        if (c0spe == null) {
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if ((c19egLIZ instanceof MainActivity) && (mainActivity = (MainActivity) c19egLIZ) != null) {
            HomePageDataViewModel homePageDataViewModelLIZIZ = C680080Qly.LIZIZ(mainActivity);
            C1017370ca7 c1017370ca7 = mainActivity.mCommerceActivityObserver;
            String str = c0spe.LIZJ;
            if (str == null) {
                str = "";
            }
            if (c0spe.LIZ != mainActivity.hashCode()) {
                return;
            }
            boolean z = c0spe.LIZLLL;
            homePageDataViewModelLIZIZ.LLJJ = z;
            if (z) {
                bo(mainActivity, homePageDataViewModelLIZIZ, str);
            } else if (!c1017370ca7.LIZ(str, homePageDataViewModelLIZIZ.getEventType())) {
                bo(mainActivity, homePageDataViewModelLIZIZ, str);
            }
        }
    }

    @C14EU
    public final void onVideoPageChangeEvent(C714530S1b c714530S1b) {
        MainActivity mainActivity;
        String aid;
        MainActivity mainActivity2;
        Aweme aweme;
        if (c714530S1b.LIZ == null) {
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if ((c19egLIZ instanceof MainActivity) && (mainActivity = (MainActivity) c19egLIZ) != null) {
            HomePageDataViewModel homePageDataViewModelLIZIZ = C680080Qly.LIZIZ(mainActivity);
            String authorUid = AwemeExtKt.getAuthorUid(c714530S1b.LIZ);
            Aweme aweme2 = c714530S1b.LIZ;
            homePageDataViewModelLIZIZ.LLJILJILJ = aweme2;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = "";
            }
            C1398110mUD.LIZIZ = aid;
            Aweme aweme3 = homePageDataViewModelLIZIZ.LLJILJILJ;
            if (aweme3 != null) {
                aweme3.getAid();
            }
            if (TextUtils.equals(homePageDataViewModelLIZIZ.LLILZ, authorUid)) {
                return;
            }
            homePageDataViewModelLIZIZ.LLILZ = authorUid;
            mainActivity.mCommerceActivityObserver.LIZJ.onVideoPageChangeEvent(c714530S1b.LIZ, c714530S1b.LIZIZ);
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if ((c19egLIZ2 instanceof MainActivity) && (mainActivity2 = (MainActivity) c19egLIZ2) != null) {
                HomePageDataViewModel homePageDataViewModelLIZIZ2 = C680080Qly.LIZIZ(mainActivity2);
                Aweme aweme4 = c714530S1b.LIZ;
                if (aweme4 == null || !AwemeExtKt.isAdTraffic(aweme4) || (aweme = c714530S1b.LIZ) == null || !C1017070cZd.LL(aweme)) {
                    C810560Vqw.LIZLLL(new ARunnableS93S0200000_24(mainActivity2, homePageDataViewModelLIZIZ2, 50), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                }
                mainActivity2.mCommerceActivityObserver.LIZIZ();
                ContentLanguageGuideServiceImpl.LIZ().LJ(mainActivity2, null);
                Aweme aweme5 = c714530S1b.LIZ;
                if (aweme5 != null && AwemeExtKt.isAdTraffic(aweme5)) {
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJFF();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bo(com.ss.android.ugc.aweme.main.MainActivity r6, com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r7, java.lang.String r8) {
        /*
            r5 = this;
            boolean r0 = X.C297720Bli.LIZ()
            r4 = 0
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r1 = r5.LL
            if (r1 != 0) goto L59
            monitor-enter(r5)
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r1 = r5.LL     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L48
            X.0QSJ r1 = r5.LLILLL     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L30
            X.0Q7z r3 = r5.LLILLJJLI     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L1e
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L4a
            r5.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L4a
        L1e:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L4a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L4a
            r5.LLILLL = r1     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L30
            r1 = r4
            goto L38
        L30:
            java.lang.Class<com.ss.android.ugc.aweme.base.HomePageViewPagerAbility> r0 = com.ss.android.ugc.aweme.base.HomePageViewPagerAbility.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L4a
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r1 = (com.ss.android.ugc.aweme.base.HomePageViewPagerAbility) r1     // Catch: java.lang.Throwable -> L4a
        L38:
            r5.LL = r1     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L59
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L48:
            monitor-exit(r5)
            goto L59
        L4a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L4d:
            X.0Q7z r1 = X.C1558360qeg.LJI(r6, r4)
            java.lang.Class<com.ss.android.ugc.aweme.base.HomePageViewPagerAbility> r0 = com.ss.android.ugc.aweme.base.HomePageViewPagerAbility.class
            X.01wD r1 = X.C1558520qew.LIZJ(r1, r0)
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r1 = (com.ss.android.ugc.aweme.base.HomePageViewPagerAbility) r1
        L59:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLJILJILJ
            r1.ph(r4, r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.MainLegacyEventBusAssem.bo(com.ss.android.ugc.aweme.main.MainActivity, com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel, java.lang.String):void");
    }
}
