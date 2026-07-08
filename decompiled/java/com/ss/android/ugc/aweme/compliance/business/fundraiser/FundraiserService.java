package com.ss.android.ugc.aweme.compliance.business.fundraiser;

import X.AbstractC848400XPy;
import X.C036E;
import X.C0C64;
import X.C0CQT;
import X.C0LAB;
import X.C0X9S;
import X.C0XQ7;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1391020mIm;
import X.C1398100mUC;
import X.C13LP;
import X.C1486450omh;
import X.C1537480q70;
import X.C1910500zoe;
import X.C19334010kU;
import X.C19336910kx;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2089008Gi;
import X.C2188811AlT;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC1216660hlY;
import X.EnumC1486440omg;
import X.EnumC1910570zol;
import X.EnumC1910580zom;
import X.InterfaceC1059280dfi;
import X.InterfaceC1631620sYq;
import X.InterfaceC1910510zof;
import X.InterfaceC2661011f;
import X.InterfaceC594300NSq;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS2S0010000_19;
import Y.ARunnableS71S0200000_2;
import Y.ARunnableS85S0200000_16;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sidesheet.TuxSideSheet;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.compliance.api.model.DonationSessionRequest;
import com.ss.android.ugc.aweme.compliance.api.model.DonationSessionResponse;
import com.ss.android.ugc.aweme.compliance.api.model.FundraiserDetailsResponse;
import com.ss.android.ugc.aweme.compliance.api.model.Organization;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.FundraiserService;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.network.DonationSessionApi;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.network.FundraiserDetailsApi;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.network.UpdateProfileFundraiserApi;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.network.UpdateProfileFundraiserResponse;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class FundraiserService implements IFundraiserService, LifecycleEventObserver {
    public final Set<String> LL = new LinkedHashSet();
    public InterfaceC1910510zof LLILLJJLI;
    public C1910500zoe LLILLL;
    public WeakReference<C19GS> LLILZ;
    public Organization LLILZIL;
    public String LLILZLL;
    public long LLIZ;
    public final UpdateProfileFundraiserApi LLIZLLLIL;
    public final FundraiserDetailsApi LLJ;
    public final DonationSessionApi LLJI;

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final void LJIIIZ() {
        this.LLILZIL = null;
    }

    public static SparkContext LJIJJLI() {
        C1537480q70.Companion.getClass();
        for (C1537480q70 c1537480q70 : C13LP.LLIIII(C1537480q70.hybridContextMap.values())) {
            String strLJII = c1537480q70.LJII();
            if (strLJII != null && a0.LJJIIZI(strLJII, "pns_product_poseidon/donation", false)) {
                if (c1537480q70 instanceof SparkContext) {
                    return (SparkContext) c1537480q70;
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final FundraiserInterceptor LJ() {
        return new FundraiserInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final void LJI() {
        C1910500zoe c1910500zoe = this.LLILLL;
        if (c1910500zoe != null) {
            c1910500zoe.LIZLLL();
        }
        this.LLILLJJLI = new InterfaceC1910510zof() { // from class: X.0hzB
            @Override // X.InterfaceC1910510zof
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1910510zof
            public final void onCanceled() {
            }

            @Override // X.InterfaceC1910510zof
            public final void LIZLLL(Organization organization, Map<String, String> map) {
                if (organization != null) {
                    this.LIZ.getClass();
                    FundraiserService.LJJI(organization);
                }
            }

            @Override // X.InterfaceC1910510zof
            public final void LJ(Organization organization, Map<String, String> map) {
                this.LIZ.LLILZIL = organization;
                C1398100mUC.LIZ.getClass();
                C1398100mUC.LIZIZ = map;
                C1398100mUC.LIZLLL("associated_fundraiser_video_create_button");
            }

            @Override // X.InterfaceC1910510zof
            public final void LJI(Organization organization, Map<String, String> map) {
                if (organization != null) {
                    this.LIZ.getClass();
                    FundraiserService.LJJI(organization);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
            @Override // X.InterfaceC1910510zof
            public final void LJFF(Organization organization, boolean z, Map<String, String> map) {
                this.LIZ.LLILZIL = organization;
                C1398100mUC.LIZ.getClass();
                C1398100mUC.LIZIZ = map;
                this.LIZ.getClass();
                if (organization != null) {
                    C1398100mUC.LIZJ.clear();
                    C19EG c19egLIZIZ = C1398100mUC.LIZIZ();
                    if (c19egLIZIZ != null) {
                        C259800zU c259800zU = new C259800zU();
                        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                        C0OM1 c0om1 = new C0OM1();
                        C1250250idj c1250250idj = new C1250250idj();
                        c1250250idj.LIZJ = c19egLIZIZ.getResources().getString(2131824866);
                        c0om1.LIZJ = c1250250idj;
                        C1251150ifB c1251150ifB = new C1251150ifB();
                        c1251150ifB.LIZLLL();
                        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                        c1251150ifB.LIZJ(new AwS556S0100000_12(c259800zU, (C259800zU<TuxSheet>) 686));
                        c0om1.LIZIZ(c1251150ifB);
                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                        tuxSheet.LLJJIJIL = c0om1;
                        tuxSheet.LLJJJ = null;
                        C1225170hzH c1225170hzH = new C1225170hzH(c19egLIZIZ);
                        c1225170hzH.setOrganization(organization);
                        c1225170hzH.setHasFundraiser(z);
                        c1225170hzH.setActionListener(new InterfaceC1225130hzD() { // from class: X.0hzC
                            @Override // X.InterfaceC1225130hzD
                            public final void LIZ(EnumC1225150hzF enumC1225150hzF, Organization organization2) {
                                Activity activityLIZIZ;
                                SocMediaPickerService socMediaPickerService;
                                C563770M9f c563770M9fLIZLLL;
                                int i = C1225140hzE.LIZ[enumC1225150hzF.ordinal()];
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            C1398100mUC.LIZJ.add("profile");
                                            C1398100mUC.LIZ.getClass();
                                            C1398100mUC.LIZJ("fundraiser_amplification_sheet_click", C2097908Jt.LIZJ(new Pair("action", "profile")));
                                            C19EG c19egLIZIZ2 = C1398100mUC.LIZIZ();
                                            if (c19egLIZIZ2 != null) {
                                                IFundraiserService iFundraiserServiceLJIILL = ComplianceServiceProvider.LJIILL();
                                                String str = organization2.fundraiserId;
                                                if (str == null) {
                                                    str = "";
                                                }
                                                C0XQ7.LJ();
                                                String curSecUserId = C0XQ7.LIZ.LJIIJ().getCurSecUserId();
                                                String str2 = organization2.orgId;
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                iFundraiserServiceLJIILL.LJIIJ(str, curSecUserId, str2, new AwS598S0100000_19(c19egLIZIZ2, 510), new AwS563S0100000_19(c19egLIZIZ2, 2683));
                                                return;
                                            }
                                            return;
                                        }
                                        throw new C1954807lC();
                                    }
                                    C1398100mUC.LIZJ.add("post");
                                    C1398100mUC.LIZ.getClass();
                                    C1398100mUC.LIZLLL("amplify_fundraiser_button");
                                    return;
                                }
                                C1398100mUC.LIZJ.add("story");
                                C1398100mUC.LIZ.getClass();
                                C1398100mUC.LIZJ("fundraiser_amplification_sheet_click", C2097908Jt.LIZJ(new Pair("action", "story")));
                                C1398100mUC.LIZ();
                                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                                if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null)) == null || (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) == null) {
                                    return;
                                }
                                c563770M9fLIZLLL.openStoryRecordingPageDirectly(activityLIZIZ, new EnterStoryParam(null, "amplify_fundraiser_button", "amplify_fundraiser", null, null, null, null, null, null, false, false, false, 0, 0.0f, 0, null, null, null, null, null, null, false, null, false, null, null, 67108857, null), null);
                            }
                        });
                        DialogFragment dialogFragment = (DialogFragment) c259800zU.element;
                        if (dialogFragment != null) {
                            dialogFragment.dismiss();
                        }
                        c1390920mIc.LIZ.LLJJIII = c1225170hzH;
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, c19egLIZIZ);
                        ?? r2 = c1390920mIc.LIZ;
                        r2.LLJI = numLIZJ;
                        r2.LLILLJJLI = new DialogInterfaceOnDismissListenerC1265960j34(c259800zU, 4);
                        c259800zU.element = r2;
                        r2.show(c19egLIZIZ.getSupportFragmentManager(), "FundraiserShareSheet");
                        C1398100mUC.LIZJ("fundraiser_amplification_sheet_show", null);
                    }
                }
            }
        };
        C1910500zoe c1910500zoe2 = new C1910500zoe();
        this.LLILLL = c1910500zoe2;
        c1910500zoe2.LIZIZ();
        C1910500zoe c1910500zoe3 = this.LLILLL;
        if (c1910500zoe3 != null) {
            c1910500zoe3.LLILZ = this.LLILLJJLI;
        }
        SparkContext sparkContextLJIJJLI = LJIJJLI();
        if (sparkContextLJIJJLI != null) {
            sparkContextLJIJJLI.LJJJJZI(new C19336910kx(this, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL() {
        /*
            r6 = this;
            X.0zoe r0 = r6.LLILLL
            r1 = 0
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.compliance.api.model.Organization r5 = r0.LLILLJJLI
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.LL
            if (r4 != 0) goto Lf
        Lb:
            java.util.Map r4 = X.C2097608Jq.LJ()
        Lf:
            X.0zoe r0 = r6.LLILLL
            if (r0 == 0) goto L75
            java.lang.String r3 = r0.LLILLL
            if (r3 == 0) goto L75
            int r2 = r3.hashCode()
            r0 = -1521356763(0xffffffffa551f025, float:-1.8209224E-16)
            if (r2 == r0) goto L65
            r0 = -1191855776(0xffffffffb8f5b960, float:-1.1717039E-4)
            if (r2 == r0) goto L55
            r0 = 1972463301(0x759166c5, float:3.6863645E32)
            if (r2 != r0) goto L75
            java.lang.String r0 = "donation_removed_nonprofit"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L75
            X.0zof r0 = r6.LLILLJJLI
            if (r0 == 0) goto L39
            r0.LIZJ()
        L39:
            X.0zoe r0 = r6.LLILLL
            if (r0 == 0) goto L40
            r0.LIZLLL()
        L40:
            r6.LLILLL = r1
            X.0LAB r2 = new X.0LAB
            r2.<init>()
            java.lang.String r1 = "is_popup"
            r0 = 0
            r2.LJFF(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "customize_fundraiser_webview_closed"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L55:
            java.lang.String r0 = "donation_updated_nonprofit"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L75
            X.0zof r0 = r6.LLILLJJLI
            if (r0 == 0) goto L39
            r0.LIZLLL(r5, r4)
            goto L39
        L65:
            java.lang.String r0 = "donation_added_nonprofit"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L75
            X.0zof r0 = r6.LLILLJJLI
            if (r0 == 0) goto L39
            r0.LJI(r5, r4)
            goto L39
        L75:
            X.0zof r0 = r6.LLILLJJLI
            if (r0 == 0) goto L39
            r0.onCanceled()
            goto L39
        L7d:
            r5 = r1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.fundraiser.FundraiserService.LJIL():void");
    }

    public FundraiserService() {
        InterfaceC2661011f interfaceC2661011fLIZ;
        InterfaceC2661011f interfaceC2661011fLIZ2;
        InterfaceC2661011f interfaceC2661011fLIZ3;
        UpdateProfileFundraiserApi updateProfileFundraiserApi = null;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        DonationSessionApi donationSessionApi = null;
        if (iRetrofitFactory != null && (interfaceC2661011fLIZ3 = iRetrofitFactory.LIZ(C0CQT.LIZJ)) != null) {
            updateProfileFundraiserApi = (UpdateProfileFundraiserApi) interfaceC2661011fLIZ3.create(UpdateProfileFundraiserApi.class);
        }
        this.LLIZLLLIL = updateProfileFundraiserApi;
        IRetrofitFactory iRetrofitFactory2 = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        this.LLJ = (iRetrofitFactory2 == null || (interfaceC2661011fLIZ2 = iRetrofitFactory2.LIZ(C0CQT.LIZJ)) == null) ? null : (FundraiserDetailsApi) interfaceC2661011fLIZ2.create(FundraiserDetailsApi.class);
        IRetrofitFactory iRetrofitFactory3 = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory3 != null && (interfaceC2661011fLIZ = iRetrofitFactory3.LIZ(C0CQT.LIZJ)) != null) {
            donationSessionApi = (DonationSessionApi) interfaceC2661011fLIZ.create(DonationSessionApi.class);
        }
        this.LLJI = donationSessionApi;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final boolean LIZ() {
        return LJII() && this.LLILZIL != null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final int LIZIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_disclaimer_text", true);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final void LIZLLL() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContextLJIJJLI = LJIJJLI();
        if (sparkContextLJIJJLI == null || (interfaceC1059280dfiLJJIJLIJ = sparkContextLJIJJLI.LJJIJLIJ()) == null) {
            return;
        }
        interfaceC1059280dfiLJJIJLIJ.close();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final boolean LJII() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_fundraiser_amplification", true, false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final boolean LJIIIIZZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_edit_tooltip_for_uncustomized_fundraiser", true, false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final boolean LJIIJJI() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_customize_fundraiser_for_profile", true, false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final boolean LJIILL() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_customize_fundraiser_for_video", true, false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final Organization LIZJ() {
        return this.LLILZIL;
    }

    public static BannerCommonStruct LJIJI(Aweme aweme) {
        String str;
        BannerCommonStruct next;
        Iterator<BannerCommonStruct> it2 = aweme.getBanners().iterator();
        do {
            str = null;
            if (!it2.hasNext()) {
                return null;
            }
            next = it2.next();
            BannerCommonKey bannerCommonKey = next.bannerKey;
            if (bannerCommonKey != null) {
                str = bannerCommonKey.componentKey;
            }
        } while (!Intrinsics.LJFF(str, "bottom_banner_fundraiser_customize"));
        return next;
    }

    public static String LJIJJ(Aweme aweme) {
        boolean z;
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
            if (interactStickerStruct.getType() == 6) {
                try {
                    return (String) ((HashMap) C7740030o.LIZ().getGson().LJIIIIZZ(interactStickerStruct.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.04jV
                    }.getType())).get("organization_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }

    public static void LJJI(Organization organization) {
        if (!Intrinsics.LJFF(((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI(), "personal_homepage")) {
            return;
        }
        IFundraiserService iFundraiserServiceLJIILL = ComplianceServiceProvider.LJIILL();
        String str = organization.fundraiserId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C0XQ7.LJ();
        String curSecUserId = C0XQ7.LIZ.LJIIJ().getCurSecUserId();
        String str3 = organization.orgId;
        if (str3 != null) {
            str2 = str3;
        }
        iFundraiserServiceLJIILL.LJIIJ(str, curSecUserId, str2, AFwS257S0000000_19.get$arr$(103), AFwS207S0000000_19.get$arr$(76));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final void LJFF(Aweme aweme) {
        String strLJIJJ;
        BannerCommonStruct bannerCommonStructLJIJI = LJIJI(aweme);
        if (bannerCommonStructLJIJI == null || (strLJIJJ = LJIJJ(aweme)) == null) {
            return;
        }
        Set<String> set = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJJ);
        sbLIZ.append('_');
        sbLIZ.append(bannerCommonStructLJIJI.customizedInfo);
        set.add(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final void LJIIL(boolean z) {
        C786410Ut5.LJLIIL(2000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS2S0010000_19(z, 0));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final boolean LJIILLIIL(Aweme aweme) {
        BannerCommonStruct bannerCommonStructLJIJI;
        List<BannerCommonStruct> banners = aweme.getBanners();
        if (banners == null || banners.isEmpty() || (bannerCommonStructLJIJI = LJIJI(aweme)) == null || bannerCommonStructLJIJI.customizedInfo == null || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_customize_fundraiser_bottom_banner", true, false)) {
            return false;
        }
        String strLJIJJ = LJIJJ(aweme);
        if (strLJIJJ == null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("anchor_type", bannerCommonStructLJIJI.customizedInfo);
            C20684815ws.LJIILLIIL("customize_fundraiser_banner_org_parse_error", c0lab.LIZ);
            return false;
        }
        Set<String> set = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJJ);
        sbLIZ.append('_');
        sbLIZ.append(bannerCommonStructLJIJI.customizedInfo);
        return !set.contains(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C1486450omh.LIZ[event.ordinal()] == 1) {
            LJIL();
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    public static void LJJ(FundraiserService fundraiserService, boolean z, long j, int i) {
        String str;
        fundraiserService.getClass();
        Bundle bundle = new Bundle();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("isSuccess", str, bundle);
        C786410Ut5.LJJJI("service", "FundraiserSetProfile", bundle);
        C786410Ut5.LJJJI("code", String.valueOf(i), bundle);
        C786410Ut5.LJJJI("duration", String.valueOf(j), bundle);
        C20684815ws.LJIILL("compliance_api_status", bundle);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final void LJIIJ(String str, String str2, String str3, final Function1<? super Boolean, Unit> function1, final Function0<Unit> function0) {
        C0X9S<UpdateProfileFundraiserResponse> c0x9sUpdateProfileFundraiser;
        C1398100mUC.LIZ.getClass();
        C19EG c19egLIZIZ = C1398100mUC.LIZIZ();
        if (c19egLIZIZ == null) {
            return;
        }
        c19egLIZIZ.getBaseContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                UpdateProfileFundraiserApi updateProfileFundraiserApi = this.LLIZLLLIL;
                if (updateProfileFundraiserApi != null && (c0x9sUpdateProfileFundraiser = updateProfileFundraiserApi.updateProfileFundraiser(str, str2, str3)) != null) {
                    c0x9sUpdateProfileFundraiser.enqueue(new InterfaceC594300NSq<UpdateProfileFundraiserResponse>() { // from class: X.0bsC
                        public final long LL = System.currentTimeMillis();

                        @Override // X.InterfaceC594300NSq
                        public final void onFailure(C0X9S<UpdateProfileFundraiserResponse> c0x9s, Throwable th) {
                            FundraiserService.LJJ(this.LLILLJJLI, true, System.currentTimeMillis() - this.LL, C632190Oqv.LIZ(th));
                            function0.invoke();
                        }

                        @Override // X.InterfaceC594300NSq
                        public final void onResponse(C0X9S<UpdateProfileFundraiserResponse> c0x9s, C0X52<UpdateProfileFundraiserResponse> c0x52) {
                            boolean z;
                            int i = c0x52.LIZIZ.statusCode;
                            long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
                            if (c0x52.LIZJ() && i == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            FundraiserService.LJJ(this.LLILLJJLI, z, jCurrentTimeMillis, i);
                            if (z) {
                                function0.invoke();
                            } else {
                                function1.invoke(Boolean.valueOf(c0x52.LIZIZ.fundraiserAlreadyExists));
                            }
                        }
                    });
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIIZ(2131829438);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final void LJIJ(int i, String str, String str2, String str3, final AwS394S0200000_28 awS394S0200000_28) {
        C0X9S<DonationSessionResponse> c0x9sCreateDonationSession;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        DonationSessionRequest donationSessionRequest = new DonationSessionRequest(str3, i, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), str, str2);
        DonationSessionApi donationSessionApi = this.LLJI;
        if (donationSessionApi != null && (c0x9sCreateDonationSession = donationSessionApi.createDonationSession(donationSessionRequest)) != null) {
            c0x9sCreateDonationSession.enqueue(new InterfaceC594300NSq<DonationSessionResponse>() { // from class: X.0brz
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<DonationSessionResponse> c0x9s, Throwable th) {
                    C632140Oqq.LIZ(C632190Oqv.LIZ(th), System.currentTimeMillis() - jCurrentTimeMillis, "/tiktok/v1/donation/session/create/", false);
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(awS394S0200000_28, 6));
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<DonationSessionResponse> c0x9s, C0X52<DonationSessionResponse> c0x52) {
                    C632140Oqq.LIZ(0, System.currentTimeMillis() - jCurrentTimeMillis, "/tiktok/v1/donation/session/create/", true);
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS85S0200000_16(awS394S0200000_28, c0x52.LIZIZ, 0));
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final void LJIILJJIL(int i, int i2, String str, String str2, String str3, final Function1 function1) {
        C0X9S<FundraiserDetailsResponse> fundraiserDetails;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
        FundraiserDetailsApi fundraiserDetailsApi = this.LLJ;
        if (fundraiserDetailsApi != null && (fundraiserDetails = fundraiserDetailsApi.getFundraiserDetails(str, str2, i, str3, curSecUserId, i2, false)) != null) {
            fundraiserDetails.enqueue(new InterfaceC594300NSq<FundraiserDetailsResponse>() { // from class: X.0bs0
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<FundraiserDetailsResponse> c0x9s, Throwable th) {
                    C632140Oqq.LIZ(C632190Oqv.LIZ(th), System.currentTimeMillis() - jCurrentTimeMillis, "/tiktok/v1/donation/panel/get", false);
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(function1, 7));
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<FundraiserDetailsResponse> c0x9s, C0X52<FundraiserDetailsResponse> c0x52) {
                    C632140Oqq.LIZ(0, System.currentTimeMillis() - jCurrentTimeMillis, "/tiktok/v1/donation/panel/get", true);
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS85S0200000_16(function1, c0x52.LIZIZ, 1));
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final void LJIILIIL(Context context, final String str, final EnumC1910580zom enumC1910580zom, final EnumC1910570zol enumC1910570zol, boolean z, String str2, final InterfaceC1631620sYq<? super Organization, ? super EnumC1216660hlY, ? super Map<String, String>, Unit> interfaceC1631620sYq) {
        Context context2;
        SmartRoute smartRouteBuildRoute;
        C1910500zoe c1910500zoe = this.LLILLL;
        if (c1910500zoe != null) {
            c1910500zoe.LIZLLL();
        }
        if (context instanceof C19GS) {
            context2 = context;
        } else {
            context2 = null;
        }
        this.LLILZ = new WeakReference<>(context2);
        this.LLILLJJLI = new InterfaceC1910510zof() { // from class: X.0hki
            @Override // X.InterfaceC1910510zof
            public final void LJ(Organization organization, Map<String, String> map) {
            }

            @Override // X.InterfaceC1910510zof
            public final void LJFF(Organization organization, boolean z2, Map<String, String> map) {
            }

            @Override // X.InterfaceC1910510zof
            public final void LIZJ() {
                interfaceC1631620sYq.invoke(null, EnumC1216660hlY.REMOVED, C2097608Jq.LJ());
            }

            @Override // X.InterfaceC1910510zof
            public final void onCanceled() {
                interfaceC1631620sYq.invoke(null, EnumC1216660hlY.CANCELED, C2097608Jq.LJ());
            }

            @Override // X.InterfaceC1910510zof
            public final void LIZLLL(Organization organization, Map<String, String> map) {
                interfaceC1631620sYq.invoke(organization, EnumC1216660hlY.UPDATED, map);
            }

            @Override // X.InterfaceC1910510zof
            public final void LJI(Organization organization, Map<String, String> map) {
                interfaceC1631620sYq.invoke(organization, EnumC1216660hlY.ADDED, map);
            }
        };
        C1910500zoe c1910500zoe2 = new C1910500zoe();
        this.LLILLL = c1910500zoe2;
        c1910500zoe2.LIZIZ();
        C2089008Gi c2089008Gi = new C2089008Gi("https://inapp.tiktokv.com/tpp/inapp/pns_product_poseidon/donation-creation.html");
        c2089008Gi.LIZIZ(enumC1910580zom.getValue(), "item_type");
        c2089008Gi.LIZLLL("enter_from", enumC1910570zol.getValue());
        c2089008Gi.LIZIZ(C0C64.LJIILLIIL().LJIJ(31744, 0, "fundraiser_list_page_variant", true), "fundraiser_list_page_variant");
        c2089008Gi.LIZLLL("keyboard_adjust", CardStruct.IStatusCode.DEFAULT);
        c2089008Gi.LIZLLL("disable_back_press", "1");
        if (str2 != null) {
            c2089008Gi.LIZLLL("fundraiser_id", str2);
        }
        if (str != null && str.length() != 0) {
            c2089008Gi.LIZLLL("organization_id", str);
        }
        String strLJ = c2089008Gi.LJ();
        if (z) {
            smartRouteBuildRoute = SmartRouter.buildRoute(context, UriProtector.parse("aweme://webview_popup").buildUpon().appendQueryParameter("url", strLJ).appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_spark", "1").appendQueryParameter("show_loading", "1").appendQueryParameter("should_full_screen", "1").appendQueryParameter("allow_webview_gesture", "1").appendQueryParameter("variable_height", "100%").appendQueryParameter("height", "89%").appendQueryParameter("keyboard_adjust", "2").appendQueryParameter("keyboard_compat", "1").appendQueryParameter("webview_scroll_first_when_expanded", "1").appendQueryParameter("show_mask", "1").appendQueryParameter("mask_bg_color", "00000080").toString());
        } else {
            smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
            smartRouteBuildRoute.withParam("url", strLJ);
            smartRouteBuildRoute.withParam("hide_nav_bar", "1");
            smartRouteBuildRoute.withParam("use_spark", "1");
            smartRouteBuildRoute.withParam("show_loading", "1");
            smartRouteBuildRoute.withParam("disable_bounces", "1");
        }
        smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.0zoh
            @Override // com.bytedance.router.OpenResultCallback
            public final void onActionResult(Object obj) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onEmpty() {
                C1951107kb.LIZ(this);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onFail(String str3, String str4) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onIntercept(String str3) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMatched(String str3) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMissed(String str3) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onOpen(Intent intent) {
                C1951107kb.LIZIZ(this, intent);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                boolean z2;
                Uri data;
                String string;
                WeakReference<C19GS> weakReference;
                C19GS c19gs;
                FundraiserService fundraiserService = this.LIZ;
                fundraiserService.getClass();
                if (intent != null && (data = intent.getData()) != null && (string = data.toString()) != null && a0.LJJIIZI(string, "webview_popup", false) && (weakReference = fundraiserService.LLILZ) != null && (c19gs = weakReference.get()) != null) {
                    C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS71S0200000_2(c19gs, fundraiserService, 1));
                }
                C0LAB c0lab = new C0LAB();
                String str3 = str;
                if (str3 != null && str3.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c0lab.LJFF("has_organization_id", !z2);
                c0lab.LJ("enter_from", enumC1910570zol.getValue());
                c0lab.LIZ(enumC1910580zom.getValue(), "item_type");
                c0lab.LJFF("is_popup", false);
                C20684815ws.LJIILLIIL("customize_fundraiser_webview_open", c0lab.LIZ);
            }
        });
        smartRouteBuildRoute.open(1234, new C19334010kU(this, 0));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService
    public final void LJIIZILJ(Context context, String str, String str2, String str3, String str4, int i, String str5, boolean z, Integer num, Integer num2) {
        EnumC1486440omg enumC1486440omg;
        C19EG c19egLIZIZ;
        DialogFragment dialogFragment;
        if (z) {
            enumC1486440omg = EnumC1486440omg.FULLSCREEN;
        } else {
            enumC1486440omg = EnumC1486440omg.BOTTOMSHEET;
        }
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enumC1486440omg.name());
            sbLIZ.append('|');
            sbLIZ.append(str);
            sbLIZ.append('|');
            sbLIZ.append(str2);
            sbLIZ.append('|');
            sbLIZ.append(i);
            sbLIZ.append('|');
            sbLIZ.append(str5);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Intrinsics.LJFF(strLIZIZ, this.LLILZLL) && jElapsedRealtime - this.LLIZ < 600) {
                return;
            }
            this.LLILZLL = strLIZIZ;
            this.LLIZ = jElapsedRealtime;
            int i2 = C1486450omh.LIZIZ[enumC1486440omg.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19egLIZIZ, "//pns/fundraiser/page");
                    smartRouteBuildRoute.withParam("arg_org_id", str);
                    smartRouteBuildRoute.withParam("arg_fundraiser_id", str2);
                    smartRouteBuildRoute.withParam("arg_enter_from", str3);
                    smartRouteBuildRoute.withParam("arg_item_type", i);
                    smartRouteBuildRoute.withParam("arg_item_id", str5);
                    if (num != null) {
                        smartRouteBuildRoute.withParam("arg_donation_optimize", num.intValue());
                    }
                    if (num2 != null) {
                        smartRouteBuildRoute.withParam("arg_is_anchor", num2.intValue());
                    }
                    smartRouteBuildRoute.open();
                    return;
                }
                throw new C1954807lC();
            }
            FundraiserContainerFragment fundraiserContainerFragment = new FundraiserContainerFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("arg_org_id", str, bundle);
            C786410Ut5.LJJJI("arg_fundraiser_id", str2, bundle);
            C786410Ut5.LJJJI("arg_enter_from", str3, bundle);
            C786410Ut5.LJJJI("arg_enter_method", str4, bundle);
            bundle.putInt("arg_item_type", i);
            C786410Ut5.LJJJI("arg_item_id", str5, bundle);
            if (num != null) {
                bundle.putInt("arg_donation_optimize", num.intValue());
            }
            if (num2 != null) {
                bundle.putInt("arg_is_anchor", num2.intValue());
            }
            fundraiserContainerFragment.setArguments(bundle);
            if (c19egLIZIZ.getResources().getConfiguration().orientation == 2) {
                double screenWidth = ((double) ScreenUtils.getScreenWidth(c19egLIZIZ)) * 0.4d;
                C1391020mIm c1391020mIm = new C1391020mIm();
                TuxSideSheet tuxSideSheet = c1391020mIm.LIZ;
                tuxSideSheet.LLILLL = fundraiserContainerFragment;
                tuxSideSheet.LL = false;
                tuxSideSheet.LLILZ = Integer.valueOf((int) screenWidth);
                dialogFragment = c1391020mIm.LIZ;
            } else {
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = fundraiserContainerFragment;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.LLJLLL = false;
                c1390920mIc.LJIIIIZZ(1);
                dialogFragment = c1390920mIc.LIZ;
            }
            dialogFragment.show(c19egLIZIZ.getSupportFragmentManager(), "FundraiserBottomsheet");
        }
    }
}
