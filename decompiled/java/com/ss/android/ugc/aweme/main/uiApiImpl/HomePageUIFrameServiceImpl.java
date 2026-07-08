package com.ss.android.ugc.aweme.main.uiApiImpl;

import X.AbstractC1583710rJZ;
import X.C01GW;
import X.C1336205Ku;
import X.C1585900rN6;
import X.C1586130rNT;
import X.C1590400rUM;
import X.C1590590rUf;
import X.C1591410rVz;
import X.C1591880rWk;
import X.C19212010Ec;
import X.C19EG;
import X.C2214201BlK;
import X.C285090BFj;
import X.C341940Daq;
import X.C452501pT;
import X.C786410Ut5;
import X.C799900VZk;
import X.C844470XAv;
import X.InterfaceC1209250hZb;
import X.ViewOnClickListenerC1581820rGW;
import X.ViewOnClickListenerC1586300rNk;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopLeftIconInflate;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopRightIconInflate;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver;
import com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl;
import com.ss.android.ugc.aweme.series.feed.appdiff.ISeriesDiscoverAppDiffProtocol;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;

/* JADX INFO: loaded from: classes25.dex */
public final class HomePageUIFrameServiceImpl extends HomePageUIFrameServiceCommonImpl {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1586130rNT());

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final void removeNoticeView() {
        ((ShareService) ServiceManager.get().getService(ShareService.class)).LJJJJJL().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final Class<? extends Activity> getHomePageInflateActivityClass() {
        return MainActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final void afterTabChangedInMainPageFragment(String str) {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (!TextUtils.equals("HOME", str) && !TextUtils.equals("PGC_HOME", str) && !TextUtils.equals("PGC_PRODUCE", str) && activityLJFF != null) {
            ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIJJLI(activityLJFF);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View buildInboxIcon(C19EG c19eg) {
        if (c19eg == null) {
            return null;
        }
        C799900VZk.LIZ.getClass();
        return ((MainFragmentTopRightIconInflate) C799900VZk.LJ(MainFragmentTopRightIconInflate.class)).LJ(7, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View buildProfileIcon(C19EG c19eg) {
        if (c19eg == null) {
            return null;
        }
        C799900VZk.LIZ.getClass();
        return ((MainFragmentTopRightIconInflate) C799900VZk.LJ(MainFragmentTopRightIconInflate.class)).LJ(8, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View dmEntranceView(C19EG c19eg) {
        C799900VZk.LIZ.getClass();
        return ((MainFragmentTopRightIconInflate) C799900VZk.LJ(MainFragmentTopRightIconInflate.class)).LJ(3, c19eg);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class<? extends androidx.fragment.app.Fragment> getFragmentClass(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl.getFragmentClass(java.lang.String):java.lang.Class");
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View getInflatedLiveIcon(C19EG c19eg) {
        ViewParent parent;
        ViewGroup viewGroup;
        ImageView imageViewLJIIIIZZ;
        C799900VZk.LIZ.getClass();
        MainFragmentTopLeftIconInflate mainFragmentTopLeftIconInflate = (MainFragmentTopLeftIconInflate) C799900VZk.LJ(MainFragmentTopLeftIconInflate.class);
        if (c19eg == null) {
            return null;
        }
        if (mainFragmentTopLeftIconInflate.LL == null) {
            HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) mainFragmentTopLeftIconInflate.LLILLJJLI.getValue();
            if (homepageIconServiceApi != null) {
                imageViewLJIIIIZZ = homepageIconServiceApi.LJIIIIZZ(c19eg);
            } else {
                imageViewLJIIIIZZ = null;
            }
            mainFragmentTopLeftIconInflate.LL = imageViewLJIIIIZZ;
            if (((Boolean) C285090BFj.LJII.getValue()).booleanValue()) {
                C786410Ut5.c6(mainFragmentTopLeftIconInflate.LL, new FrameLayout.LayoutParams(C341940Daq.LIZ(56.0d), C341940Daq.LIZ(56.0d)));
            }
        }
        ImageView imageView = mainFragmentTopLeftIconInflate.LL;
        if (imageView != null) {
            parent = imageView.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(mainFragmentTopLeftIconInflate.LL, viewGroup);
        }
        ImageView imageView2 = mainFragmentTopLeftIconInflate.LL;
        mainFragmentTopLeftIconInflate.LL = null;
        return imageView2;
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View getInflatedSearchIcon(C19EG c19eg) {
        C799900VZk.LIZ.getClass();
        MainFragmentTopRightIconInflate mainFragmentTopRightIconInflate = (MainFragmentTopRightIconInflate) C799900VZk.LJ(MainFragmentTopRightIconInflate.class);
        if (c19eg == null) {
            return null;
        }
        View viewLJ = mainFragmentTopRightIconInflate.LJ(4, c19eg);
        if (viewLJ == null) {
            HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) this.LIZ.getValue();
            if (homepageIconServiceApi == null) {
                return null;
            }
            return homepageIconServiceApi.LJIIJ(c19eg);
        }
        return viewLJ;
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View getInflatedSpecialIcon(C19EG c19eg) {
        C799900VZk.LIZ.getClass();
        MainFragmentTopRightIconInflate mainFragmentTopRightIconInflate = (MainFragmentTopRightIconInflate) C799900VZk.LJ(MainFragmentTopRightIconInflate.class);
        if (c19eg == null) {
            return null;
        }
        View viewLJ = mainFragmentTopRightIconInflate.LJ(5, c19eg);
        if (viewLJ == null) {
            HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) this.LIZ.getValue();
            if (homepageIconServiceApi == null) {
                return null;
            }
            return homepageIconServiceApi.LJIIIZ(c19eg);
        }
        return viewLJ;
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View getInflatedTakoIcon(C19EG c19eg) {
        C799900VZk.LIZ.getClass();
        MainFragmentTopRightIconInflate mainFragmentTopRightIconInflate = (MainFragmentTopRightIconInflate) C799900VZk.LJ(MainFragmentTopRightIconInflate.class);
        if (c19eg == null) {
            return null;
        }
        View viewLJ = mainFragmentTopRightIconInflate.LJ(9, c19eg);
        if (viewLJ == null) {
            HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) this.LIZ.getValue();
            if (homepageIconServiceApi == null) {
                return null;
            }
            return homepageIconServiceApi.LJIIJJI(c19eg);
        }
        return viewLJ;
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final AbstractC1583710rJZ getRootNode(C19EG c19eg) {
        return C1591880rWk.LIZIZ.getRootNode(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final ImageView ivScanView(C19EG c19eg) {
        C799900VZk.LIZ.getClass();
        return (ImageView) ((MainFragmentTopRightIconInflate) C799900VZk.LJ(MainFragmentTopRightIconInflate.class)).LJ(6, c19eg);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View.OnClickListener getBottomClick(Context context, String str) {
        switch (str.hashCode()) {
            case -1382453013:
                if (str.equals("NOTIFICATION")) {
                    return C19212010Ec.LIZJ.LJLIIL(context);
                }
                return null;
            case 2223327:
                if (str.equals("HOME")) {
                    return new ViewOnClickListenerC1581820rGW(context);
                }
                return null;
            case 482617583:
                if (str.equals("PUBLISH")) {
                    return new BottomPublishObserver(context);
                }
                return null;
            case 877821105:
                if (str.equals("SERIES_DISCOVER")) {
                    ISeriesDiscoverAppDiffProtocol.LIZ.getClass();
                    C1585900rN6.LIZIZ.getValue().LIZJ();
                    return null;
                }
                return null;
            case 1055811561:
                if (str.equals("DISCOVER")) {
                    return new ViewOnClickListenerC1586300rNk(context);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final void openSessionListActivity(C19EG c19eg, Bundle bundle) {
        C1336205Ku.LIZ(false).getImChatService().LJIIL(c19eg, bundle, false, null);
    }

    @Override // com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl, com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final InterfaceC1209250hZb obtainSwitchHelper(Context context, C1591410rVz c1591410rVz, C1590400rUM c1590400rUM) {
        IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
        C844470XAv.LIZ.getClass();
        if (iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
            return new C1590590rUf(context, c1591410rVz, c1590400rUM);
        }
        return null;
    }
}
