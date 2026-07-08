package com.ss.android.ugc.aweme.ecommerce.search.vision;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C099500Zd;
import X.C0A5H;
import X.C0A5K;
import X.C0BT7;
import X.C0C4E;
import X.C0C64;
import X.C0H9H;
import X.C0QL2;
import X.C0QM4;
import X.C0QX7;
import X.C0QXR;
import X.C1361400lX0;
import X.C13IQ;
import X.C13LE;
import X.C1622206Wu;
import X.C1744700vVE;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C2217401BqU;
import X.C285620BHk;
import X.C285840BIg;
import X.C293640Bf8;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C5182020e;
import X.C668910QLp;
import X.C675840Qf8;
import X.C676160Qfe;
import X.C677190QhJ;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC1594550rb3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC676400Qg2;
import X.InterfaceC676430Qg5;
import X.InterfaceC724760Sbq;
import Y.ACListenerS77S0300000_10;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.ECPhotoSearchBubbleVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.view.ECPhotoSearchBubbleAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.tag.model.SearchShopTabData;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.vision.IPhotoSearchService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.ProductInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS108S0400000_10;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public final class EComPhotoSearchServiceImpl implements IPhotoSearchService {
    public static final C0QX7 LIZLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public String LIZ;
    public String LIZIZ;
    public long LIZJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0QX7] */
    static {
        C2217401BqU c2217401BqU = new C2217401BqU(EComPhotoSearchServiceImpl.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217401BqU};
        LIZLLL = new Object() { // from class: X.0QX7
        };
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final C13IQ<? extends AbstractC738140SxQ> LIZIZ() {
        return C13LE.LIZ(ECPhotoSearchBubbleAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final String LIZJ() {
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || !iUserService.isLogin()) {
            return "no_login";
        }
        C0C4E.LIZ.getClass();
        if (!C0C4E.LIZIZ()) {
            return "minors";
        }
        if (C285620BHk.LIZ() && !((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LJIILL()) {
            return "toko_unauthorized";
        }
        if (((Boolean) C0A5K.LIZ.getValue()).booleanValue()) {
            return null;
        }
        return "no_ecom_region";
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final InterfaceC1594550rb3 LJ() {
        return new InterfaceC1594550rb3() { // from class: X.0QgX
            @Override // X.InterfaceC1594550rb3
            public final void LIZ() {
            }

            @Override // X.InterfaceC1594550rb3
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1594550rb3
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1594550rb3
            public final void LJI() {
            }

            @Override // X.InterfaceC1594550rb3
            public final void LJII() {
            }

            @Override // X.InterfaceC1594550rb3
            public final void onPageSelected() {
            }

            @Override // X.InterfaceC1594550rb3
            public final String LIZLLL(Context context) {
                return context.getString(2131858277);
            }

            @Override // X.InterfaceC1594550rb3
            public final boolean LJ(C676750Qgb c676750Qgb) {
                String region;
                boolean z;
                Object[] objArr;
                User author;
                boolean zIsLogin = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
                boolean zBooleanValue = ((Boolean) C275230AqX.LIZ.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) C0A53.LIZ.getValue()).booleanValue();
                Aweme aweme = c676750Qgb.LIZ;
                if (aweme != null && (author = aweme.getAuthor()) != null) {
                    region = author.getRegion();
                } else {
                    region = null;
                }
                if (region != null && (objArr = (Object[]) SettingsManager.LIZLLL().LJIIIIZZ("photo_search_feed_region_black_list", String[].class, null)) != null && C13LQ.LJJIJIIJI(region.toUpperCase(Locale.ROOT), objArr) < 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!zIsLogin || zBooleanValue || !zBooleanValue2 || z) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1594550rb3
            public final Map LJFF(C676750Qgb c676750Qgb) {
                return C2097608Jq.LJIIIIZZ(new Pair("search_entrance", c676750Qgb.LIZIZ), new Pair("enter_from_second", c676750Qgb.LIZIZ), new Pair("photo_search_module", "pause_panel"), new Pair("raw_photo_source", "content_product_pic"), new Pair("previous_page", c676750Qgb.LIZJ), new Pair("page_name", c676750Qgb.LIZIZ));
            }

            @Override // X.InterfaceC1594550rb3
            public final void LJIIIIZZ(View view, C676750Qgb c676750Qgb) {
                HashMap map;
                String nickname;
                AnchorProductInfo anchorProductInfo;
                Aweme aweme = c676750Qgb.LIZ;
                if (aweme != null) {
                    List<AnchorProductInfo> listLJJLIIIJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLIIIJ(aweme);
                    map = new HashMap();
                    if (listLJJLIIIJ != null && (anchorProductInfo = (AnchorProductInfo) C13LP.LJJJLL(listLJJLIIIJ)) != null) {
                        Long l = anchorProductInfo.productId;
                        if (l != null) {
                            map.put("product_id", Long.valueOf(l.longValue()));
                        }
                        String str = anchorProductInfo.sellerId;
                        if (str != null) {
                            map.put("seller_id", str);
                        }
                        String str2 = anchorProductInfo.title;
                        if (str2 != null) {
                            map.put("product_title", str2);
                        }
                    }
                    String aid = aweme.getAid();
                    if (aid != null) {
                        map.put("video_id", aid);
                    }
                    String desc = aweme.getDesc();
                    if (desc != null) {
                        map.put("video_title", desc);
                    }
                    User author = aweme.getAuthor();
                    if (author != null && (nickname = author.getNickname()) != null) {
                        map.put("video_author_nick_name", nickname);
                    }
                    String fromUserId = AwemeExtKt.getFromUserId(aweme);
                    if (fromUserId != null) {
                        map.put("user_id", fromUserId);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (listLJJLIIIJ != null) {
                        for (AnchorProductInfo anchorProductInfo2 : listLJJLIIIJ) {
                            arrayList.add(new ProductInfo(String.valueOf(anchorProductInfo2.productId), anchorProductInfo2.title));
                        }
                    }
                    map.put("product_info_list", arrayList);
                } else {
                    map = null;
                }
                c676750Qgb.LIZ(new AwS219S0300000_10(c676750Qgb, map, view, 14));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final TuxIconView LJFF(View view) {
        LIZLLL.getClass();
        return (TuxIconView) view.findViewById(R.id.qdd);
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View LJIIIIZZ(View view) {
        LIZLLL.getClass();
        return view.findViewById(R.id.qdi);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0288  */
    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r15) {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.EComPhotoSearchServiceImpl.LJIIJ(com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams):void");
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final C0QM4 LJIIJJI(SearchResultFragmentNew searchResultFragmentNew) {
        AssemVMLazy assemVMLazy;
        try {
            SAFHelper.LIZ.getClass();
            InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(ECPhotoSearchBubbleVM.class);
            C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 225);
            AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(426);
            if (Intrinsics.LJFF(interfaceC724760SbqLJJJIL, C01D1.LIZ)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(searchResultFragmentNew, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(searchResultFragmentNew, true), new C338490DOt(searchResultFragmentNew, true), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) searchResultFragmentNew, 973), aFwS241S0000000_10, new C451460Hn6(searchResultFragmentNew, true), new C451620HnM(searchResultFragmentNew, true), new C987103tV(searchResultFragmentNew, true));
            } else if (interfaceC724760SbqLJJJIL instanceof InterfaceC451590HnJ) {
                assemVMLazy = C451650HnP.LIZ(searchResultFragmentNew, (InterfaceC451590HnJ) interfaceC724760SbqLJJJIL, C724750Sbp.LJIIJ(searchResultFragmentNew, c19719912DlLIZ), c5182020e, new AwS554S0100000_10((Fragment) searchResultFragmentNew, 974), aFwS241S0000000_10, null, null, null);
            } else if (Intrinsics.LJFF(interfaceC724760SbqLJJJIL, C019F.LIZ)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(searchResultFragmentNew, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(searchResultFragmentNew), C724750Sbp.LJIIIZ(searchResultFragmentNew), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) searchResultFragmentNew, 975), aFwS241S0000000_10, new C451460Hn6(searchResultFragmentNew, false), new C451620HnM(searchResultFragmentNew, false), new C987103tV(searchResultFragmentNew, false));
            } else {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJ;
            return (ECPhotoSearchBubbleVM) assemVMLazy.getValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Object c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            return (C0QM4) c098200Yq;
        }
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View LJIIL(View view) {
        LIZLLL.getClass();
        return view.findViewById(R.id.qdh);
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View getSimilarPhotoSearchView(Context context) {
        if (((Boolean) C285840BIg.LIZ.getValue()).booleanValue()) {
            return C786410Ut5.Sd(R.layout.brz, C786410Ut5.ne(context), null);
        }
        int iLIZ = C293640Bf8.LIZ();
        if (iLIZ != 1) {
            if (iLIZ != 2) {
                return null;
            }
            return C786410Ut5.Sd(R.layout.brx, C786410Ut5.ne(context), null);
        }
        return C786410Ut5.Sd(R.layout.bry, C786410Ut5.ne(context), null);
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final void LIZ(Context context, final Intent intent) {
        LJII(context, new InterfaceC676430Qg5() { // from class: X.0QSS
            /* JADX WARN: Removed duplicated region for block: B:5:0x004a  */
            @Override // X.InterfaceC676430Qg5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams LIZ() {
                /*
                    Method dump skipped, instruction units count: 202
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0QSS.LIZ():com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams");
            }

            @Override // X.InterfaceC676430Qg5
            public final PhotoSearchLogEnterParams LIZIZ() {
                PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(null, null, null, null, null, null, null, null, null, null, null, null, null);
                Intent intent2 = intent;
                String strLIZJ = intent2 != null ? LIZJ(intent2, "search_entrance") : null;
                if (Intrinsics.LJFF("mall", strLIZJ)) {
                    strLIZJ = LIZJ(intent2, "enter_from");
                }
                photoSearchLogEnterParams.setSearchEntrance(strLIZJ);
                photoSearchLogEnterParams.setSourcePageName(intent2 != null ? LIZJ(intent2, "source_page_name") : null);
                photoSearchLogEnterParams.setEnterFromSecond(intent2 != null ? LIZJ(intent2, "enter_from_second") : null);
                photoSearchLogEnterParams.setSearchType(intent2 != null ? LIZJ(intent2, "search_type") : null);
                return photoSearchLogEnterParams;
            }

            public static String LIZJ(Intent intent2, String str) {
                try {
                    return intent2.getStringExtra(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(android.content.Context r21, X.InterfaceC676430Qg5 r22) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.EComPhotoSearchServiceImpl.LJII(android.content.Context, X.0Qg5):void");
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final InterfaceC676400Qg2 LJIILIIL(Fragment fragment, C19EG c19eg) {
        return C676160Qfe.LIZ(fragment, c19eg);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x00d3. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(android.content.Context r40, android.net.Uri r41) {
        /*
            Method dump skipped, instruction units count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.EComPhotoSearchServiceImpl.LJIILJJIL(android.content.Context, android.net.Uri):void");
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final PowerViewPagerFragmentItem<?> LIZLLL(PhotoSearchEnterParams photoSearchEnterParams, Fragment fragment, C19EG c19eg, C1361400lX0 c1361400lX0) throws JSONException {
        String str;
        String str2;
        String strLIZJ = LIZJ();
        boolean z = false;
        if (strLIZJ != null && strLIZJ.length() > 0) {
            z = true;
        }
        Integer numValueOf = null;
        if (z) {
            return null;
        }
        PhotoSearchBaseVM photoSearchBaseVMLIZ = C676160Qfe.LIZ(fragment, c19eg);
        if (photoSearchBaseVMLIZ != null) {
            LJIIJ(photoSearchEnterParams);
            photoSearchBaseVMLIZ.EQ2(photoSearchEnterParams);
            photoSearchBaseVMLIZ.LLJLILLLLZIIL = c1361400lX0;
        }
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams;
        if (photoSearchBusinessEnterParams != null) {
            str = photoSearchBusinessEnterParams.enterFrom;
            str2 = photoSearchBusinessEnterParams.enterMethod;
            numValueOf = Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType);
        } else {
            str = null;
            str2 = null;
        }
        C675840Qf8.LIZJ("open_search_result", "search_result", null, numValueOf, str, str2, new AwS589S0100000_10(photoSearchEnterParams, 92), 500);
        return new SearchShopTabData();
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View LJI(Context context, C0QL2 c0ql2, InterfaceC676430Qg5 interfaceC676430Qg5, Function0 function0) throws JSONException {
        C0QL2 c0ql22 = C0QL2.MALL;
        int i = R.attr.a1h;
        int i2 = R.raw.icon_scan_magnifying_glass;
        if (c0ql2 == c0ql22) {
            C675840Qf8.LJFF(PageFinder.via(BtmSDK.INSTANCE.getCurrentResumedPage()), Integer.valueOf(C0QXR.MALL.getValue()), "mall", "homepage", "", "", "", "c3886.d7767", null);
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            tuxIconView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            if (!((Boolean) C0A5H.LIZ.getValue()).booleanValue()) {
                i2 = R.raw.icon_camera;
            }
            tuxIconView.setIconRes(i2);
            if (!C0BT7.LIZ()) {
                i = R.attr.a1j;
            }
            tuxIconView.setTintColorRes(i);
            C786410Ut5.a9(tuxIconView, new ACListenerS77S0300000_10((Object) this, (View) context, (Map<String, String>) interfaceC676430Qg5, (View) 4));
            new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))).gravity = 16;
            int i3 = C668910QLp.LIZ;
            C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_photo_search_entrance_style", true);
            return tuxIconView;
        }
        View viewSd = C786410Ut5.Sd(R.layout.bqr, C786410Ut5.ne(context), null);
        C01GW c01gw = C099500Zd.LIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) c01gw.getValue()).intValue() - 20))) / 2;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) - iLIZIZ;
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) - iLIZIZ;
        TuxIconView tuxIconView2 = (TuxIconView) viewSd.findViewById(R.id.qdd);
        if (tuxIconView2 != null) {
            C1744700vVE.LJIIL(tuxIconView2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) c01gw.getValue()).intValue()))));
            C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) c01gw.getValue()).intValue()))), tuxIconView2);
            tuxIconView2.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
            C0H9H.LJFF(iLIZIZ2, tuxIconView2);
            C0H9H.LIZLLL(iLIZIZ3, tuxIconView2);
            if (((Boolean) C0A5H.LIZ.getValue()).booleanValue()) {
                tuxIconView2.setIconRes(R.raw.icon_scan_magnifying_glass);
            }
            if (C0BT7.LIZ()) {
                tuxIconView2.setTintColorRes(R.attr.a1h);
            }
        }
        viewSd.setOnTouchListener(new C677190QhJ(new AwS108S0400000_10(function0, (Function0<Unit>) this, (EComPhotoSearchServiceImpl) context, (Context) interfaceC676430Qg5, (InterfaceC676430Qg5) 2)));
        return viewSd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (X.C1A3X.LIZIZ(r22) != false) goto L11;
     */
    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(android.content.Context r22, com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r23, android.graphics.Bitmap r24, com.ss.android.ugc.aweme.search.model.SearchResultParam r25, android.graphics.Bitmap r26) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.EComPhotoSearchServiceImpl.LJIIIZ(android.content.Context, com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams, android.graphics.Bitmap, com.ss.android.ugc.aweme.search.model.SearchResultParam, android.graphics.Bitmap):void");
    }
}
