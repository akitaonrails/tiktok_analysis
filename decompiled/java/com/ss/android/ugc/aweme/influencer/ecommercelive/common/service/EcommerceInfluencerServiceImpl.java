package com.ss.android.ugc.aweme.influencer.ecommercelive.common.service;

import X.C01GW;
import X.C0O01;
import X.C1390920mIc;
import X.C1440005kM;
import X.C14KQ;
import X.C1507790pL7;
import X.C1728980v5s;
import X.C1729090v63;
import X.C1729180v6C;
import X.C1729220v6G;
import X.C1729300v6O;
import X.C1730280v7y;
import X.C1730290v7z;
import X.C1731220v9U;
import X.C2126308Ur;
import X.C2296808zG;
import X.C23250099c;
import X.C416901jj;
import X.C438901nH;
import X.C452501pT;
import X.C597630NcH;
import X.C597640NcI;
import X.C608200NtK;
import X.C767402zA;
import X.C786410Ut5;
import X.C844470XAv;
import X.C958103op;
import Y.ARunnableS102S0100000_2;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.BillboardV2Fragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.TemplateEditFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.HighlightsFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.business.beforelive.banner.GoLivePreviewEcomBannerDelegate;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.data.BottomContainerComponent;
import webcast.data.SecondaryBannerComponent;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: loaded from: classes27.dex */
public final class EcommerceInfluencerServiceImpl implements IEcommerceInfluencerService {
    public boolean LIZ = true;
    public boolean LIZIZ = true;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(567));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(221));

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final List<IInterceptor> LIZLLL() {
        return (List) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final boolean kp() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ec_labels_under_user_info", true);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final n tl() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            n nVar = C1730280v7y.LIZ;
            n nVar2 = (n) settingsManagerLIZLLL.LJIIIIZZ("ec_toggle_switch_config", n.class, nVar);
            return nVar2 != null ? nVar2 : nVar;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C1730280v7y.LIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final int ln() {
        return C0O01.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final String Xh(GoLiveECIconInfo goLiveECIconInfo) {
        boolean z;
        if (goLiveECIconInfo != null) {
            if (goLiveECIconInfo.isOldRedDotLogic) {
                z = C438901nH.LIZ.getBoolean("need_show_ec_red_dot_IN_PREVIEW_LIVEING_ROOM", true);
            } else if (!goLiveECIconInfo.independentDisplayEcIcon) {
                z = goLiveECIconInfo.displayRedDot;
            } else {
                return CardStruct.IStatusCode.DEFAULT;
            }
            if (z) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final void ld(String str) {
        C608200NtK.LIZ(C608200NtK.LIZ, str, null, null, null, null, null, 62);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final void nj(Long l) {
        C1729300v6O c1729300v6O = new C1729300v6O();
        if (l != null && l.longValue() != 0) {
            C1730290v7z.LIZ.getClass();
            if (!C1730290v7z.LJIILIIL()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1729090v63(c1729300v6O, l, null), 3);
            }
        }
        C1729220v6G c1729220v6G = new C1729220v6G();
        if (l != null && l.longValue() != 0) {
            C1728980v5s.LIZ.getClass();
            if (!C1728980v5s.LIZLLL()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1729180v6C(c1729220v6G, l, null), 3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final boolean vo(SecondaryBannerComponent secondaryBannerComponent) {
        return ((GoLivePreviewEcomBannerDelegate) this.LIZLLL.getValue()).shouldShowSubBanner(secondaryBannerComponent);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final boolean wg(String str) {
        C1730290v7z.LIZ.getClass();
        if (!C1730290v7z.LJIIJJI(str)) {
            C1728980v5s.LIZ.getClass();
            if (!C1728980v5s.LIZJ(str)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final String Bb(String str, JSONObject jSONObject) {
        return C1731220v9U.LIZLLL(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final void Gi(String str, JSONObject jSONObject) {
        C1440005kM.LIZ(new C767402zA(str, jSONObject));
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final void I7(TopRightBannerContainerComponent topRightBannerContainerComponent, boolean z) {
        String currentUserID;
        String str;
        if (topRightBannerContainerComponent.type != 51) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "live_take_page");
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
            currentUserID = "";
        }
        linkedHashMap.put("author_id", currentUserID);
        linkedHashMap.putAll(topRightBannerContainerComponent.trackExtra);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        if (z) {
            str = "livesdk_tiktokec_banner_show";
        } else {
            str = "livesdk_tiktokec_banner_click";
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ(str, linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final void LIZ(Bundle bundle, FragmentManager fragmentManager) {
        String strLIZ;
        if (this.LIZ) {
            this.LIZ = false;
            C786410Ut5.LJLIIL(700L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2(this, 61));
            bundle.putLong("start_click_time", System.currentTimeMillis());
            BillboardV2Fragment.LLJILJIL.getClass();
            Uri uri = (Uri) bundle.getParcelable("uri");
            if (uri != null) {
                strLIZ = C416901jj.LIZ(uri, "show_mask");
            } else {
                strLIZ = null;
            }
            boolean zLJFF = Intrinsics.LJFF(strLIZ, "1");
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            BillboardV2Fragment billboardV2Fragment = new BillboardV2Fragment();
            billboardV2Fragment.setArguments(bundle);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = billboardV2Fragment;
            tuxSheet.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(1);
            c1390920mIc.LIZ.LLJJIJIIJIL = zLJFF;
            int iLJ = (int) C958103op.LJ();
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJL = iLJ;
            tuxSheet2.LLJLL = true;
            tuxSheet2.show(fragmentManager, BillboardV2Fragment.class.getName());
        }
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final void LIZIZ(Bundle bundle, FragmentManager fragmentManager) {
        String strLIZ;
        HighlightsFragment.LLILLL.getClass();
        Uri uri = (Uri) bundle.getParcelable("uri");
        if (uri != null) {
            strLIZ = C416901jj.LIZ(uri, "show_mask");
        } else {
            strLIZ = null;
        }
        boolean zLJFF = Intrinsics.LJFF(strLIZ, "1");
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        HighlightsFragment highlightsFragment = new HighlightsFragment();
        highlightsFragment.setArguments(bundle);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = highlightsFragment;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJJIJIIJIL = zLJFF;
        c1390920mIc.LJIIIIZZ(1);
        int iLJ = (int) C958103op.LJ();
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLJ;
        tuxSheet2.LLJLL = true;
        tuxSheet2.show(fragmentManager, HighlightsFragment.class.getName());
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final void LIZJ(Bundle bundle, FragmentManager fragmentManager) {
        if (this.LIZIZ) {
            this.LIZIZ = false;
            C786410Ut5.LJLIIL(700L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2(this, 60));
            bundle.putLong("start_click_time", System.currentTimeMillis());
            TemplateEditFragment.LLJILJIL.getClass();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TemplateEditFragment templateEditFragment = new TemplateEditFragment();
            bundle.putInt("schema", 1);
            templateEditFragment.setArguments(bundle);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = templateEditFragment;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLLL = false;
            c1390920mIc.LJIIIIZZ(1);
            C844470XAv.LIZ.getClass();
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJL = (int) (C14KQ.LJI(C844470XAv.LIZ())[1] * 0.9f);
            tuxSheet2.LLJLL = true;
            tuxSheet2.show(fragmentManager, TemplateEditFragment.class.getName());
        }
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final void LJ(String str, String str2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C597630NcH(new C597640NcI(), str, str2, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final String Tv(int i, GoLiveECIconInfo goLiveECIconInfo) {
        return C1731220v9U.LIZ(Integer.valueOf(i), goLiveECIconInfo);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final void in(BottomContainerComponent bottomContainerComponent, boolean z) {
        String currentUserID;
        String str;
        switch (bottomContainerComponent.type) {
            case 26:
            case 27:
            case 28:
            case 29:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page_name", "live_take_page");
                IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
                if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
                    currentUserID = "";
                }
                linkedHashMap.put("author_id", currentUserID);
                linkedHashMap.putAll(bottomContainerComponent.trackExtra);
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                if (z) {
                    str = "livesdk_tiktokec_button_show";
                } else {
                    str = "livesdk_tiktokec_button_click";
                }
                c1507790pL7.getClass();
                C1507790pL7.LIZJ(str, linkedHashMap);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final View oa(Context context, TopRightBannerContainerComponent topRightBannerContainerComponent) {
        return ((GoLivePreviewEcomBannerDelegate) this.LIZLLL.getValue()).createTopBannerView(context, topRightBannerContainerComponent);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService
    public final View Yk(Context context, SecondaryBannerComponent secondaryBannerComponent, LifecycleOwner lifecycleOwner) {
        return ((GoLivePreviewEcomBannerDelegate) this.LIZLLL.getValue()).createSubBannerView(context, secondaryBannerComponent, lifecycleOwner);
    }
}
