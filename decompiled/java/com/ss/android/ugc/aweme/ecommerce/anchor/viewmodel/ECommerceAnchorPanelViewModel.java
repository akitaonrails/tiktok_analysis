package com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel;

import X.AbstractC1335900krs;
import X.AbstractC21274918Nn;
import X.AnonymousClass0317;
import X.AnonymousClass0956;
import X.C034S;
import X.C03DZ;
import X.C0C13;
import X.C0PEM;
import X.C1010603xI;
import X.C1018703yb;
import X.C1120604Zw;
import X.C123100dR;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LP;
import X.C13LQ;
import X.C15MV;
import X.C1735640vGc;
import X.C1742080vR0;
import X.C1743690vTb;
import X.C1766860w4y;
import X.C18LA;
import X.C18MT;
import X.C1AQS;
import X.C20642515q3;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C21271118Mb;
import X.C21271918Mj;
import X.C21272018Mk;
import X.C21272218Mm;
import X.C21272518Mp;
import X.C21272618Mq;
import X.C21273718Nb;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C438710HIf;
import X.C754940TjQ;
import X.C770702zh;
import X.C786410Ut5;
import X.EnumC1769850w9n;
import X.EnumC19366010pe;
import X.InterfaceC1392640mLO;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilege;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorSuffixInfo;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.ClaimIncentiveInfo;
import com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.search.saas.EcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommercePhotoService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.ShopAnchorSellingPointData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import defpackage.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS118S0110000_32;
import kotlin.jvm.internal.AwS181S1100000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class ECommerceAnchorPanelViewModel extends ViewModel {
    public static final /* synthetic */ int LLJJJJ = 0;
    public InterfaceC1392640mLO LL;
    public ProductListModel LLILLJJLI;
    public AnchorCommonStruct LLILLL;
    public int LLILZ;
    public AnchorProductInfoModel LLIZ;
    public String LLJI;
    public boolean LLJJI;
    public final C2344009Gk LLJJIII;
    public C2344009Gk LLJJIJI;
    public AnonymousClass0956 LLJJIJIIJIL;
    public final MutableLiveData<Integer> LLJJIJIL;
    public final Map<Integer, Integer> LLJJJ;
    public Map<String, AnchorProductInfoModel> LLJJJIL;
    public List<AnchorProductInfoModel> LLILZIL = new ArrayList();
    public final MutableLiveData<GetAnchorMotionInfoResponse> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLIZLLLIL = new MutableLiveData<>();
    public String LLJ = "";
    public Map<String, Object> LLJIJIL = new LinkedHashMap();
    public final List<Observer<List<C21271118Mb>>> LLJILJIL = new ArrayList();
    public final MutableLiveData<Boolean> LLJILJILJ = new MutableLiveData<>();
    public String LLJILLL = "video_multi_anchor";
    public final MutableLiveData<List<C21271118Mb>> LLJJ = new MutableLiveData<>();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String GQ2() {
        /*
            r5 = this;
            r2 = 0
            X.0mLO r0 = r5.LL     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJJLIIIJJIZ()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L52
            java.lang.String r4 = r0.getAnchorsExtras()     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L52
            com.google.gson.Gson r3 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            r0.getClass()     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            if (r0 == 0) goto L26
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            r0 = 1
            if (r1 != r0) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 == 0) goto L2a
            goto L34
        L2a:
            X.18ON r0 = new X.18ON     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            r0.<init>()     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            goto L3e
        L34:
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
        L3e:
            java.lang.Object r1 = r3.LJIIIIZZ(r4, r0)     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.AnchorsExtras     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            if (r0 != 0) goto L47
            r1 = r2
        L47:
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r1 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r1     // Catch: com.google.gson.s -> L4a java.lang.Throwable -> L60
            goto L4f
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L60
            r1 = r2
        L4f:
            if (r1 == 0) goto L52
            goto L54
        L52:
            r1 = r2
            goto L5c
        L54:
            com.ss.android.ugc.aweme.feed.model.ECAnchorInfo r0 = r1.getEcAnchorInfo()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L52
            java.lang.String r1 = r0.daAdsAnchorTag     // Catch: java.lang.Throwable -> L60
        L5c:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L60
            goto L6c
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L6c:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L73
            r2 = r1
        L73:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.GQ2():java.lang.String");
    }

    public final boolean KQ2() {
        AnchorProductInfo anchorProductInfo;
        AnchorProductInfoModel anchorProductInfoModel = this.LLIZ;
        if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
            Integer num = anchorProductInfo.productStatus;
            int value = EnumC19366010pe.PRODUCT_STATUS_DOWN.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
        }
        return false;
    }

    public final void MQ2() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        TQ2(-1, interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null);
        ((LinkedHashMap) this.LLJJJ).clear();
    }

    public final String VQ2() {
        AnchorProductInfo anchorProductInfo;
        AnchorSuffixInfo anchorSuffixInfo;
        String str;
        AnchorProductInfoModel anchorProductInfoModel = this.LLIZ;
        return (anchorProductInfoModel == null || (anchorProductInfo = anchorProductInfoModel.extraData) == null || (anchorSuffixInfo = anchorProductInfo.anchorSuffixInfo) == null || (str = anchorSuffixInfo.anchorSuffixText) == null) ? "" : str;
    }

    public final String WQ2() {
        int i = this.LLILZ;
        if (i > 1 && i == this.LLILZIL.size()) {
            return C20642515q3.LJI(2131858247);
        }
        int i2 = this.LLILZ;
        return (i2 <= 1 || i2 == this.LLILZIL.size()) ? XQ2() : C20642515q3.LJI(2131858246);
    }

    public final String XQ2() {
        AnchorProductInfoModel anchorProductInfoModel = this.LLIZ;
        if (anchorProductInfoModel == null) {
            return C20642515q3.LJI(2131826555);
        }
        if (!TextUtils.isEmpty(anchorProductInfoModel.extraData.videoAnchorTitle)) {
            String str = anchorProductInfoModel.extraData.videoAnchorTitle;
            return str != null ? str : "";
        }
        Integer num = anchorProductInfoModel.type;
        if (num == null || num.intValue() != 33) {
            Integer num2 = anchorProductInfoModel.type;
            if (num2 != null && num2.intValue() == 6) {
                return anchorProductInfoModel.keyword;
            }
        } else {
            String str2 = anchorProductInfoModel.extraData.elasticTitle;
            if (TextUtils.isEmpty(str2)) {
                String str3 = anchorProductInfoModel.extraData.title;
                if (str3 != null) {
                    return str3;
                }
            } else if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public ECommerceAnchorPanelViewModel() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        this.LLJJIII = c2344009Gk;
        this.LLJJIJI = c2344009Gk;
        this.LLJJIJIL = new MutableLiveData<>(-1);
        this.LLJJJ = new LinkedHashMap();
        this.LLJJJIL = C2097608Jq.LJ();
    }

    public static int FQ2(ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel) {
        Aweme awemeLJJLIIIJJIZ;
        int iDQ2;
        int iIntValue;
        InterfaceC1392640mLO interfaceC1392640mLO = eCommerceAnchorPanelViewModel.LL;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        eCommerceAnchorPanelViewModel.getClass();
        C21272618Mq.LIZ.getClass();
        if (C21272618Mq.LJIIJ(awemeLJJLIIIJJIZ) && (iDQ2 = eCommerceAnchorPanelViewModel.DQ2(awemeLJJLIIIJJIZ)) >= 0) {
            Integer num = (Integer) ((LinkedHashMap) eCommerceAnchorPanelViewModel.LLJJJ).get(Integer.valueOf(iDQ2));
            if (num == null || (iIntValue = num.intValue()) < 1) {
                return 1;
            }
            return iIntValue;
        }
        return -1;
    }

    public static boolean wQ2(ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel) {
        boolean z;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        eCommerceAnchorPanelViewModel.getClass();
        if (eCommerceAnchorPanelViewModel.LLILZLL.getValue() != null) {
            z = true;
        } else {
            z = false;
        }
        ProductListModel productListModel = eCommerceAnchorPanelViewModel.LLILLJJLI;
        if (productListModel != null && (aweme = productListModel.aweme) != null && aweme.isAd()) {
            if (!z) {
                ProductListModel productListModel2 = eCommerceAnchorPanelViewModel.LLILLJJLI;
                Integer numValueOf = null;
                if (productListModel2 != null) {
                    awemeRawAd = productListModel2.awemeRawAd;
                } else {
                    awemeRawAd = null;
                }
                Map<String, Object> map = eCommerceAnchorPanelViewModel.LLJIJIL;
                Integer[] numArr = {1, 2};
                if (awemeRawAd != null && (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) != null) {
                    numValueOf = Integer.valueOf(shopAnchorSellingPoints.getType());
                }
                if (C13LQ.LJJIJIIJI(numValueOf, numArr) < 0 || !map.containsKey("ad_key_subtitle_text")) {
                    return false;
                }
            }
            return true;
        }
        return z;
    }

    public final void AQ2(int i) {
        Aweme aweme;
        Aweme aweme2;
        List<AnchorProductInfoModel> list = this.LLILZIL;
        ArrayList arrayList = new ArrayList();
        Iterator<AnchorProductInfoModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next().extraData.productId));
        }
        C21272618Mq c21272618Mq = C21272618Mq.LIZ;
        ProductListModel productListModel = this.LLILLJJLI;
        if (productListModel != null) {
            aweme = productListModel.aweme;
        } else {
            aweme = null;
        }
        c21272618Mq.getClass();
        if (!C21272618Mq.LJIILIIL(aweme) ? C21272618Mq.LIZ(aweme) > 0 : t1.LIZIZ().ecSvShouldPhotoModeShowSecondLine.delayCallSec > 0) {
            ProductListModel productListModel2 = this.LLILLJJLI;
            if (productListModel2 != null) {
                aweme2 = productListModel2.aweme;
            } else {
                aweme2 = null;
            }
            AnonymousClass0956 anonymousClass0956 = this.LLJJIJIIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJJIJIIJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C754940TjQ(aweme2, this, arrayList, 1, i, null), 3);
            return;
        }
        zQ2(1, i, arrayList);
    }

    public final void CQ2(AbstractC21274918Nn abstractC21274918Nn) {
        Aweme aweme;
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        ProductListModel productListModel = this.LLILLJJLI;
        Aweme aweme2 = null;
        if (productListModel != null) {
            aweme = productListModel.aweme;
        } else {
            aweme = null;
        }
        anchorBizUtils.getClass();
        String strLJJIJL = AnchorBizUtils.LJJIJL(aweme);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_should_enable_prefix_vector_images", true)) {
            C21273718Nb c21273718Nb = C21273718Nb.LIZ;
            ProductListModel productListModel2 = this.LLILLJJLI;
            if (productListModel2 != null) {
                aweme2 = productListModel2.aweme;
            }
            AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(abstractC21274918Nn, 60);
            AwS181S1100000_32 awS181S1100000_32 = new AwS181S1100000_32(abstractC21274918Nn, strLJJIJL, 4);
            AwS181S1100000_32 awS181S1100000_322 = new AwS181S1100000_32(abstractC21274918Nn, strLJJIJL, 5);
            c21273718Nb.getClass();
            C21273718Nb.LIZJ(aweme2, abstractC21274918Nn, awS611S0100000_32, awS181S1100000_32, awS181S1100000_322);
            return;
        }
        if (abstractC21274918Nn == null) {
            return;
        }
        abstractC21274918Nn.setPreTitle(strLJJIJL);
    }

    public final int DQ2(Aweme aweme) {
        InterfaceC665370Q7z interfaceC665370Q7zK0;
        int iIntValue;
        C21272618Mq.LIZ.getClass();
        int iLIZIZ = -1;
        if (!C21272618Mq.LJIIJ(aweme)) {
            return -1;
        }
        if (!C0C13.LIZ()) {
            Integer value = this.LLJJIJIL.getValue();
            if (value != null && value.intValue() == -1) {
                JQ2(aweme);
            }
            Integer value2 = this.LLJJIJIL.getValue();
            if (value2 == null) {
                return -1;
            }
            return value2.intValue();
        }
        Integer value3 = this.LLJJIJIL.getValue();
        if (value3 != null && (iIntValue = value3.intValue()) != -1) {
            return iIntValue;
        }
        IECommercePhotoService iECommercePhotoService = (IECommercePhotoService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommercePhotoService.class));
        if (iECommercePhotoService != null) {
            if (aweme != null) {
                aweme.getAid();
            }
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO != null) {
                interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
            } else {
                interfaceC665370Q7zK0 = null;
            }
            iLIZIZ = iECommercePhotoService.LIZIZ(interfaceC665370Q7zK0);
        }
        TQ2(iLIZIZ, aweme);
        return iLIZIZ;
    }

    public final void JQ2(Aweme aweme) {
        int iLIZIZ;
        InterfaceC665370Q7z interfaceC665370Q7zK0;
        IECommercePhotoService iECommercePhotoService = (IECommercePhotoService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommercePhotoService.class));
        if (iECommercePhotoService != null) {
            if (aweme != null) {
                aweme.getAid();
            }
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO != null) {
                interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
            } else {
                interfaceC665370Q7zK0 = null;
            }
            iLIZIZ = iECommercePhotoService.LIZIZ(interfaceC665370Q7zK0);
        } else {
            iLIZIZ = -1;
        }
        TQ2(iLIZIZ, aweme);
    }

    public final void PQ2(final SmartImageView smartImageView) {
        AnchorProductInfoModel anchorProductInfoModel;
        AnchorProductInfo anchorProductInfo;
        if (smartImageView != null && (anchorProductInfoModel = this.LLIZ) != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
            AnchorBizUtils.LIZ.getClass();
            String strLJJJJJ = AnchorBizUtils.LJJJJJ(anchorProductInfo, 0);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(strLJJJJJ);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            c1331670kl3LIZLLL.LJIIJ(new AbstractC1335900krs() { // from class: X.18Nj
                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    C03DZ.LIZIZ(smartImageView);
                    this.LLJILJILJ.postValue(Boolean.FALSE);
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    C03DZ.LIZIZ(smartImageView);
                    this.LLJILJILJ.postValue(Boolean.TRUE);
                }
            });
        }
    }

    public final void RQ2(boolean z) {
        Long l;
        String str;
        AnchorProductInfo anchorProductInfo;
        AnchorPanelConfig anchorPanelConfig;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        ProductListModel productListModel = this.LLILLJJLI;
        String str2 = this.LLJILLL;
        List<AnchorProductInfoModel> list = this.LLILZIL;
        int i = 1;
        boolean z2 = !z;
        AnchorBizUtils.LIZ.getClass();
        C15MV c15mvLJJJJJL = AnchorBizUtils.LJJJJJL(list);
        ProductListModel productListModel2 = this.LLILLJJLI;
        if (productListModel2 != null && (anchorPanelConfig = productListModel2.panelConfig) != null) {
            i = anchorPanelConfig.panelStyle;
        }
        String strLJJ = this.LLJ;
        HashMap<String, String> map = null;
        if (!C123100dR.LIZ(strLJJ) || strLJJ == null) {
            AnchorProductInfoModel anchorProductInfoModel = this.LLIZ;
            if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
                l = anchorProductInfo.productId;
            } else {
                l = null;
            }
            String strValueOf = String.valueOf(l);
            ProductListModel productListModel3 = this.LLILLJJLI;
            if (productListModel3 != null) {
                str = productListModel3.aid;
                map = productListModel3.mobParams;
            } else {
                str = null;
            }
            strLJJ = AnchorBizUtils.LJJ(strValueOf, str, map);
        }
        C21271918Mj.LJJIIZ(c21271918Mj, productListModel, str2, list, z2, 0L, c15mvLJJJJJL, i, strLJJ);
    }

    public final void YQ2(String str) {
        AnchorPrivilege anchorPrivilege;
        List<AnchorPrivilegeItem> anchorPrivilegeItems;
        GetAnchorMotionInfoResponse value = this.LLILZLL.getValue();
        if (value != null && (anchorPrivilege = value.anchorPrivilege) != null && (anchorPrivilegeItems = anchorPrivilege.getAnchorPrivilegeItems()) != null) {
            Iterator<AnchorPrivilegeItem> it2 = anchorPrivilegeItems.iterator();
            while (it2.hasNext()) {
                ClaimIncentiveInfo claimIncentiveInfo = it2.next().getClaimIncentiveInfo();
                if (claimIncentiveInfo != null && Intrinsics.LJFF(claimIncentiveInfo.needRequest, Boolean.TRUE) && claimIncentiveInfo.getRequestInfoObj() != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1735640vGc(str, claimIncentiveInfo, null), 3);
                }
            }
        }
    }

    public static void yQ2(int i, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel) {
        boolean z;
        Integer num;
        String str;
        AnchorProductInfo anchorProductInfo;
        AnchorProductInfo anchorProductInfo2;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        eCommerceAnchorPanelViewModel.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnchorProductInfoModel anchorProductInfoModel = eCommerceAnchorPanelViewModel.LLIZ;
        String str2 = null;
        if (anchorProductInfoModel != null && (anchorProductInfo2 = anchorProductInfoModel.extraData) != null) {
            num = anchorProductInfo2.platform;
        } else {
            num = null;
        }
        linkedHashMap.put("product_source", String.valueOf(num));
        AnchorProductInfoModel anchorProductInfoModel2 = eCommerceAnchorPanelViewModel.LLIZ;
        if (anchorProductInfoModel2 != null && (anchorProductInfo = anchorProductInfoModel2.extraData) != null) {
            str = anchorProductInfo.source;
        } else {
            str = null;
        }
        linkedHashMap.put("source", String.valueOf(str));
        ProductListModel productListModel = eCommerceAnchorPanelViewModel.LLILLJJLI;
        if (productListModel != null) {
            str2 = productListModel.eventType;
        }
        linkedHashMap.put("enter_from", str2);
        linkedHashMap.put("anchor_anim_type", 0);
        linkedHashMap.put("rd_extra", "custom");
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = "";
            }
            linkedHashMap2.put(key, value);
        }
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("rd_tiktok_video_anchor_show", new AwS118S0110000_32(z, (boolean) linkedHashMap2, (Map<String, ? extends Object>) 13));
    }

    public final void BQ2(TuxIconView tuxIconView, SmartImageView smartImageView) {
        UrlModel newStyleBubbleIcon;
        if (tuxIconView != null) {
            AwS433S0200000_32 awS433S0200000_32 = new AwS433S0200000_32(this, tuxIconView, 11);
            if (smartImageView == null) {
                awS433S0200000_32.invoke();
            }
            AnchorCommonStruct anchorCommonStruct = this.LLILLL;
            if (anchorCommonStruct != null && (newStyleBubbleIcon = anchorCommonStruct.getNewStyleBubbleIcon()) != null && this.LLJJI) {
                C03DZ.LIZ(tuxIconView);
                C03DZ.LIZJ(smartImageView);
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(newStyleBubbleIcon);
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModelLIZ);
                c1331670kl3LIZLLL.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LIZLLL);
                return;
            }
            awS433S0200000_32.invoke();
        }
    }

    public final void HQ2(ProductListModel productListModel, Map<String, Object> map) {
        AnonymousClass0317 anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin;
        HashMap<String, String> map2;
        String str;
        Integer numLJIIJJI;
        String string;
        Integer numLJIIJJI2;
        String str2;
        boolean z;
        String name;
        boolean z2;
        String name2;
        if (productListModel == null) {
            return;
        }
        String str3 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = ISearchDependencyService.class.getName();
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISearchDependencyService.class);
        }
        map.putAll(((ISearchDependencyService) anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin).getLogParamsFromSearch(productListModel.eventType, null, "search_result_id", "search_id", "click_recom_search_entrance", "list_item_id", "last_from_group_id", "origin_is_mall_tab"));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = EcomSearchDependencyService.createIEcomSearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IEcomSearchDependencyService.class.getName();
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IEcomSearchDependencyService.class);
        }
        IEcomSearchDependencyService iEcomSearchDependencyService = (IEcomSearchDependencyService) anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin;
        String paramByName = iEcomSearchDependencyService.getParamByName("search_entrance");
        if (paramByName != null && C123100dR.LIZ(paramByName)) {
            map.put("search_entrance", paramByName);
        }
        String paramByName2 = iEcomSearchDependencyService.getParamByName("search_entrance_second");
        if (paramByName2 != null && C123100dR.LIZ(paramByName2)) {
            map.put("search_entrance_second", paramByName2);
        }
        String paramByName3 = iEcomSearchDependencyService.getParamByName("source_module");
        if (paramByName3 != null && C123100dR.LIZ(paramByName3)) {
            map.put("source_module", paramByName3);
        }
        ProductListModel productListModel2 = this.LLILLJJLI;
        if (productListModel2 != null) {
            str3 = productListModel2.eventType;
        }
        if (Intrinsics.LJFF(str3, "general_search")) {
            map.put("list_item_id", productListModel.aid);
        }
        String paramByName4 = iEcomSearchDependencyService.getParamByName("ec_inflow_scene");
        if (paramByName4 != null && C123100dR.LIZ(paramByName4) && Intrinsics.LJFF(paramByName4, "ecom_search")) {
            C1766860w4y.LIZ.getClass();
            Map mapLIZJ = C1766860w4y.LIZJ("outer_result_id");
            if (mapLIZJ != null) {
                for (Map.Entry entry : mapLIZJ.entrySet()) {
                    if (Intrinsics.LJFF(entry.getKey(), "outer_result_id") && (str2 = (String) entry.getValue()) != null && str2.length() > 0) {
                        map.put("outer_result_id", str2);
                    }
                }
            }
            map.put("list_item_id", productListModel.aid);
        }
        if (Intrinsics.LJFF(iEcomSearchDependencyService.getParamByName("ec_inflow_scene"), "ecom_search")) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object obj = linkedHashMap.get("rank_inner");
            if (((obj != null && (string = obj.toString()) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(string)) != null && numLJIIJJI2.intValue() > 0) || ((map2 = productListModel.mobParams) != null && (str = map2.get("rank_inner")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null && numLJIIJJI.intValue() > 0)) && linkedHashMap.get("list_item_id") != null) {
                map.put("search_result_id", linkedHashMap.get("list_item_id"));
                map.remove("list_item_id");
            }
        }
    }

    public final void TQ2(int i, Aweme aweme) {
        C21272618Mq.LIZ.getClass();
        if (!C21272618Mq.LJIIJ(aweme)) {
            ZQ2(0, aweme);
            this.LLJJIJIL.postValue(-1);
        } else {
            ZQ2(i, aweme);
            this.LLJJIJIL.postValue(Integer.valueOf(i));
        }
    }

    public final void ZQ2(int i, Aweme aweme) {
        Object obj;
        AnchorProductInfoModel anchorProductInfoModel;
        AnchorBizUtils.LIZ.getClass();
        Map mapLJJIJIIJIL = AnchorBizUtils.LJJIJIIJIL(aweme);
        if (mapLJJIJIIJIL != null && (obj = mapLJJIJIIJIL.get(Integer.valueOf(i))) != null && (anchorProductInfoModel = this.LLJJJIL.get(obj)) != null) {
            this.LLIZ = anchorProductInfoModel;
        } else {
            this.LLIZ = (AnchorProductInfoModel) C13LP.LJJJLL(this.LLILZIL);
        }
    }

    public final void vQ2(String str, String str2) {
        Integer num;
        String str3;
        boolean zBooleanValue;
        Boolean boolIsSingleAnchor;
        AnchorProductInfo anchorProductInfo;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnchorProductInfoModel anchorProductInfoModel = this.LLIZ;
        if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
            num = anchorProductInfo.platform;
        } else {
            num = null;
        }
        linkedHashMap.put("product_source", String.valueOf(num));
        ProductListModel productListModel = this.LLILLJJLI;
        if (productListModel == null || (str3 = productListModel.eventType) == null) {
            str3 = "";
        }
        linkedHashMap.put("enter_from", str3);
        linkedHashMap.put("rd_extra", str2);
        if (KQ2()) {
            linkedHashMap.put("shopping_status", "product_not_available");
        } else {
            linkedHashMap.put("shopping_status", "product_available");
        }
        ProductListModel productListModel2 = this.LLILLJJLI;
        if (productListModel2 != null && (boolIsSingleAnchor = productListModel2.isSingleAnchor()) != null) {
            zBooleanValue = boolIsSingleAnchor.booleanValue();
        } else {
            zBooleanValue = true;
        }
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("rd_tiktok_video_anchor_click", new C18MT(str, linkedHashMap, zBooleanValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(int r21, int r22, java.util.List r23) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.zQ2(int, int, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OQ2(final java.util.List r26, boolean r27, int r28, final kotlin.jvm.functions.Function1 r29) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.OQ2(java.util.List, boolean, int, kotlin.jvm.functions.Function1):void");
    }

    public final void SQ2(int i, int i2, long j, String str) {
        int i3;
        Long l;
        String str2;
        AnchorProductInfo anchorProductInfo;
        AnchorPanelConfig anchorPanelConfig;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        ProductListModel productListModel = this.LLILLJJLI;
        String str3 = this.LLJILLL;
        List<AnchorProductInfoModel> list = this.LLILZIL;
        AnchorBizUtils.LIZ.getClass();
        C15MV c15mvLJJJJJL = AnchorBizUtils.LJJJJJL(list);
        ProductListModel productListModel2 = this.LLILLJJLI;
        if (productListModel2 != null && (anchorPanelConfig = productListModel2.panelConfig) != null) {
            i3 = anchorPanelConfig.panelStyle;
        } else {
            i3 = 1;
        }
        String strLJJ = this.LLJ;
        HashMap<String, String> map = null;
        if (!C123100dR.LIZ(strLJJ) || strLJJ == null) {
            AnchorProductInfoModel anchorProductInfoModel = this.LLIZ;
            if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
                l = anchorProductInfo.productId;
            } else {
                l = null;
            }
            String strValueOf = String.valueOf(l);
            ProductListModel productListModel3 = this.LLILLJJLI;
            if (productListModel3 != null) {
                str2 = productListModel3.aid;
                map = productListModel3.mobParams;
            } else {
                str2 = null;
            }
            strLJJ = AnchorBizUtils.LJJ(strValueOf, str2, map);
        }
        C21271918Mj.LJJIIZI(c21271918Mj, productListModel, str3, i2, list, c15mvLJJJJJL, j, str, i, i3, strLJJ);
    }

    public final void UQ2(int i, int i2, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        Integer num;
        Aweme awemeLJJLIIIJJIZ;
        AnchorProductInfo anchorProductInfo;
        AnchorProductInfo anchorProductInfo2;
        AnchorProductInfo anchorProductInfo3;
        String str7;
        this.LLJI = str;
        C21272518Mp c21272518Mp = C21272518Mp.LIZ;
        ProductListModel productListModel = this.LLILLJJLI;
        Aweme awemeLJJLIIIJJIZ2 = null;
        if (productListModel != null) {
            str2 = productListModel.aid;
        } else {
            str2 = null;
        }
        Map<String, Object> map = this.LLJIJIL;
        Integer numValueOf = Integer.valueOf(i2);
        c21272518Mp.getClass();
        C21272518Mp.LJIIZILJ(str2, numValueOf, str, map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ProductListModel productListModel2 = this.LLILLJJLI;
        if (productListModel2 != null) {
            str3 = productListModel2.aid;
        } else {
            str3 = null;
        }
        linkedHashMap.put("group_id", str3);
        ProductListModel productListModel3 = this.LLILLJJLI;
        if (productListModel3 != null) {
            str4 = productListModel3.eventType;
        } else {
            str4 = null;
        }
        linkedHashMap.put("enter_from", str4);
        ProductListModel productListModel4 = this.LLILLJJLI;
        if (productListModel4 != null) {
            str5 = productListModel4.authorUid;
        } else {
            str5 = null;
        }
        linkedHashMap.put("author_id", str5);
        if (z) {
            str6 = "video_single_anchor";
        } else {
            str6 = "video_multi_anchor";
        }
        linkedHashMap.put("entrance_form", str6);
        linkedHashMap.put("info_list", str);
        if (!z) {
            linkedHashMap.put("multi_anchor_display", Integer.valueOf(i));
        }
        AnchorProductInfoModel anchorProductInfoModel = this.LLIZ;
        if (anchorProductInfoModel != null && (anchorProductInfo3 = anchorProductInfoModel.extraData) != null && (str7 = anchorProductInfo3.anchorTitleDaInfo) != null) {
            linkedHashMap.putAll(C1010603xI.LIZ(str7));
        }
        ProductListModel productListModel5 = this.LLILLJJLI;
        int i3 = 0;
        if (productListModel5 != null && Intrinsics.LJFF(productListModel5.isPhotoMode(), Boolean.TRUE)) {
            i3 = 150;
        }
        linkedHashMap.put("aweme_type", Integer.valueOf(i3));
        linkedHashMap.put("anchor_animation", Integer.valueOf(i2));
        AnchorProductInfoModel anchorProductInfoModel2 = this.LLIZ;
        if (anchorProductInfoModel2 != null && (anchorProductInfo2 = anchorProductInfoModel2.extraData) != null) {
            l = anchorProductInfo2.productId;
        } else {
            l = null;
        }
        linkedHashMap.put("product_id", l);
        AnchorProductInfoModel anchorProductInfoModel3 = this.LLIZ;
        if (anchorProductInfoModel3 != null && (anchorProductInfo = anchorProductInfoModel3.extraData) != null) {
            num = anchorProductInfo.platform;
        } else {
            num = null;
        }
        linkedHashMap.put("product_source", num);
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        c21272018Mk.getClass();
        linkedHashMap.put("anchor_tag", C21272018Mk.LJIIL(awemeLJJLIIIJJIZ, z));
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        ProductListModel productListModel6 = this.LLILLJJLI;
        anchorBizUtils.getClass();
        linkedHashMap.put("pure_ecommerce", Integer.valueOf(AnchorBizUtils.LJJJZ(productListModel6) ? 1 : 0));
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 != null) {
            awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ();
        }
        linkedHashMap.putAll(C1010603xI.LIZ(C21272018Mk.LJIILIIL(awemeLJJLIIIJJIZ2)));
        linkedHashMap.putAll(this.LLJIJIL);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = "";
            }
            linkedHashMap2.put(key, value);
        }
        C21271918Mj.LIZ.getClass();
        C21271918Mj.LJJIJIIJI(linkedHashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0499  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void xQ2(com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel r20, X.C2344009Gk r21, java.util.HashMap r22, java.lang.Boolean r23, int r24) {
        /*
            Method dump skipped, instruction units count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.xQ2(com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel, X.09Gk, java.util.HashMap, java.lang.Boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IQ2(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r6, X.InterfaceC1392640mLO r7, boolean r8, int r9, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r10) {
        /*
            r5 = this;
            r5.LL = r7
            r5.LLILLL = r6
            r5.LLILZ = r9
            r5.LLJJI = r8
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r5.LLIZLLLIL
            r3 = 0
            r0.setValue(r3)
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r5.LLJILJILJ
            r0.setValue(r3)
            if (r10 != 0) goto L6b
            if (r7 == 0) goto L69
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJJLIIIJJIZ()
        L1b:
            com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r0 = X.C21272218Mm.LJJIJL(r0, r7, r3, r3, r3)
        L1f:
            r5.LLILLJJLI = r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel> r0 = r0.products
            r1 = 0
            if (r0 == 0) goto L5f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
        L2b:
            r5.LLILZIL = r2
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            int r1 = X.C2097908Jt.LIZIZ(r0)
            r0 = 16
            if (r1 >= r0) goto L3d
            r1 = 16
        L3d:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L46:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r0
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r0.extraData
            java.lang.Long r0 = r0.productId
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.put(r0, r1)
            goto L46
        L5f:
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            r0.getClass()
            java.util.List r2 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJZZIII(r6, r1)
            goto L2b
        L69:
            r0 = r3
            goto L1b
        L6b:
            r0 = r10
            goto L1f
        L6d:
            r5.LLJJJIL = r4
            X.0mLO r0 = r5.LL
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.LJJLIIIJJIZ()
        L77:
            X.18Mq r0 = X.C21272618Mq.LIZ
            r0.getClass()
            boolean r0 = X.C21272618Mq.LJIIJ(r3)
            if (r0 == 0) goto Lb0
            r5.JQ2(r3)
        L85:
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            r0.getClass()
            if (r10 == 0) goto Lad
            java.util.List<com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel> r1 = r10.products
            java.util.List<com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct> r0 = r10.anchors
            if (r1 == 0) goto Lab
            int r1 = r1.size()
        L96:
            if (r0 == 0) goto La9
            int r0 = r0.size()
        L9c:
            int r1 = r1 + r0
            int r1 = r1 + (-1)
            if (r1 < 0) goto Lad
            r0 = 1
            if (r1 <= r0) goto Lad
            java.lang.String r0 = "video_multi_anchor"
        La6:
            r5.LLJILLL = r0
            return
        La9:
            r0 = 0
            goto L9c
        Lab:
            r1 = 0
            goto L96
        Lad:
            java.lang.String r0 = "video_single_anchor"
            goto La6
        Lb0:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel> r0 = r5.LLILZIL
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r0
            r5.LLIZ = r0
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.IQ2(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, X.0mLO, boolean, int, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel):void");
    }

    public final void QQ2(Context context, View view, final AnchorProductInfoModel anchorProductInfoModel, int i, boolean z, String str, Aweme aweme) {
        Aweme aweme2;
        String str2;
        HashMap<String, String> map;
        ProductListModel productListModel;
        String str3;
        String str4;
        Aweme aweme3;
        Map map2;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z2;
        Map<String, String> map3;
        Integer num;
        String str5;
        HashMap<String, String> map4;
        if (C770702zh.LIZ(anchorProductInfoModel.extraData.schema)) {
            int i2 = C1742080vR0.LIZ;
            ProductListModel productListModel2 = this.LLILLJJLI;
            String name = null;
            if (productListModel2 != null) {
                aweme2 = productListModel2.aweme;
            } else {
                aweme2 = null;
            }
            int[] iArrLJ = C1742080vR0.LJ(aweme2);
            if (this.LLJ.length() == 0) {
                AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                String strValueOf = String.valueOf(anchorProductInfoModel.extraData.productId);
                ProductListModel productListModel3 = this.LLILLJJLI;
                if (productListModel3 != null) {
                    str5 = productListModel3.aid;
                    map4 = productListModel3.mobParams;
                } else {
                    str5 = null;
                    map4 = null;
                }
                anchorBizUtils.getClass();
                this.LLJ = AnchorBizUtils.LJJ(strValueOf, str5, map4);
            }
            Integer num2 = anchorProductInfoModel.type;
            if (num2 != null && num2.intValue() == 33 && (num = anchorProductInfoModel.extraData.platform) != null && num.intValue() == 100) {
                ProductListModel productListModel4 = this.LLILLJJLI;
                if (productListModel4 != null) {
                    name = productListModel4.eventType;
                }
                C21272218Mm.LJJIJ(context, anchorProductInfoModel, productListModel4, name, this.LLJILLL, this.LLJ);
                vQ2("actual", "");
                return;
            }
            ProductListModel productListModel5 = this.LLILLJJLI;
            if (productListModel5 != null) {
                str2 = productListModel5.eventType;
            } else {
                str2 = null;
            }
            String strLJJIII = C21272218Mm.LJJIII(anchorProductInfoModel, productListModel5, z, str2, this.LLJILLL, this.LLJ, i, iArrLJ);
            ProductListModel productListModel6 = this.LLILLJJLI;
            if (productListModel6 != null) {
                map = productListModel6.mobParams;
            } else {
                map = null;
            }
            if ((map == null || (str3 = map.get("request_id")) == null) && ((productListModel = this.LLILLJJLI) == null || (str3 = productListModel.requestId) == null)) {
                str3 = "";
            }
            if (map == null || (str4 = map.get("rec_session_id")) == null) {
                str4 = "";
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("video_anchor", true);
            C786410Ut5.LJJJI("title", String.valueOf(anchorProductInfoModel.extraData.title), bundle);
            C786410Ut5.LJJJI("price", String.valueOf(anchorProductInfoModel.extraData.formatPrice), bundle);
            int iLJIJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIJ();
            String strLJI = anchorProductInfoModel.extraData.coverUrl;
            if (strLJI == null) {
                strLJI = "";
            }
            try {
                strLJI = C1743690vTb.LJI(strLJI, iLJIJ, iLJIJ, EnumC1769850w9n.VIDEO_MULTI_ANCHOR);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C786410Ut5.LJJJI("cover", strLJI, bundle);
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, String.valueOf(anchorProductInfoModel.extraData.productId), bundle);
            if (this.LLJ.length() > 0) {
                C786410Ut5.LJJJI("track_id", this.LLJ, bundle);
            }
            if (str3.length() > 0) {
                C786410Ut5.LJJJI("request_id", str3, bundle);
            }
            if (str4.length() > 0) {
                C786410Ut5.LJJJI("rec_session_id", str4, bundle);
            }
            if (iArrLJ.length != 0) {
                bundle.putIntArray("traffic_source_list", iArrLJ);
            }
            if (aweme == null) {
                ProductListModel productListModel7 = this.LLILLJJLI;
                if (productListModel7 != null) {
                    aweme3 = productListModel7.aweme;
                } else {
                    aweme3 = null;
                }
            } else {
                aweme3 = aweme;
            }
            if (C0C13.LIZ()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                BcmStandardTrack bcmStandardTrack = anchorProductInfoModel.extraData.bcmStandardTrack;
                if (bcmStandardTrack != null && (map3 = bcmStandardTrack.chainParam) != null) {
                    linkedHashMap.putAll(map3);
                }
                C21272018Mk c21272018Mk = C21272018Mk.LIZ;
                int iDQ2 = DQ2(aweme3);
                c21272018Mk.getClass();
                linkedHashMap.putAll(C21272018Mk.LJIJ(iDQ2, aweme3));
                map2 = linkedHashMap;
            } else {
                BcmStandardTrack bcmStandardTrack2 = anchorProductInfoModel.extraData.bcmStandardTrack;
                if (bcmStandardTrack2 != null) {
                    map2 = bcmStandardTrack2.chainParam;
                } else {
                    map2 = null;
                }
            }
            String strLJFF = C18LA.LJFF(view, strLJJIII, str, map2);
            if (aweme != null && aweme.isAd() && strLJFF != null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name2 = IAdDependencyService.class.getName();
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
                }
                strLJFF = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).handleECAnchorSchemaIfNeeded(strLJFF, aweme);
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, strLJFF);
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.18Ng
                @Override // com.bytedance.router.OpenResultCallback
                public final void onActionResult(Object obj) {
                }

                @Override // com.bytedance.router.OpenResultCallback
                public final /* synthetic */ void onEmpty() {
                    C1951107kb.LIZ(this);
                }

                @Override // com.bytedance.router.OpenResultCallback
                public final void onIntercept(String str6) {
                }

                @Override // com.bytedance.router.OpenResultCallback
                public final void onMatched(String str6) {
                }

                @Override // com.bytedance.router.OpenResultCallback
                public final void onMissed(String str6) {
                }

                @Override // com.bytedance.router.OpenResultCallback
                public final /* synthetic */ void onOpen(Intent intent) {
                    C1951107kb.LIZIZ(this, intent);
                }

                @Override // com.bytedance.router.OpenResultCallback
                public final void onSuccess(Intent intent) {
                    this.LIZ.vQ2("route", "");
                }

                @Override // com.bytedance.router.OpenResultCallback
                public final void onFail(String str6, String str7) {
                    String str8;
                    ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZ;
                    if (str7 == null) {
                        str7 = "-1";
                    }
                    eCommerceAnchorPanelViewModel.vQ2("route", str7);
                    AnchorBizUtils anchorBizUtils2 = AnchorBizUtils.LIZ;
                    AnchorProductInfoModel anchorProductInfoModel2 = anchorProductInfoModel;
                    ProductListModel productListModel8 = this.LIZ.LLILLJJLI;
                    if (productListModel8 != null) {
                        str8 = productListModel8.eventType;
                    } else {
                        str8 = null;
                    }
                    anchorBizUtils2.getClass();
                    AnchorBizUtils.LJIIJ(anchorProductInfoModel2, false, str8, true);
                }
            });
            smartRouteBuildRoute.open();
            return;
        }
        AnchorBizUtils anchorBizUtils2 = AnchorBizUtils.LIZ;
        ProductListModel productListModel8 = this.LLILLJJLI;
        String str6 = this.LLJILLL;
        anchorBizUtils2.getClass();
        AnchorBizUtils.LJLI(context, productListModel8, str6, anchorProductInfoModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void NQ2(com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel r31, android.content.Context r32, android.view.View r33, java.lang.String r34, java.lang.String r35, java.util.HashMap r36, java.lang.Boolean r37, boolean r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.NQ2(com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel, android.content.Context, android.view.View, java.lang.String, java.lang.String, java.util.HashMap, java.lang.Boolean, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LQ2(com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r27, int r28, boolean r29, java.lang.String r30, java.lang.String r31, java.lang.Boolean r32, boolean r33, java.util.Map<java.lang.String, java.lang.String> r34, java.util.Map<java.lang.String, java.lang.Object> r35, java.lang.String r36) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel.LQ2(com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, int, boolean, java.lang.String, java.lang.String, java.lang.Boolean, boolean, java.util.Map, java.util.Map, java.lang.String):void");
    }
}
