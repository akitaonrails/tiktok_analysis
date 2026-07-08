package com.ss.android.ugc.aweme.offlinemode.ui.banner;

import X.C0NII;
import X.C0NIZ;
import X.C0SGE;
import X.C0SH2;
import X.C13LP;
import X.C13LQ;
import X.C20642515q3;
import X.C297220Bku;
import X.C638170P1j;
import X.C638260P1s;
import X.C718260SFk;
import X.C718360SFu;
import X.InterfaceC707420Roy;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonContent;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonText;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonUIStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerTracerInfoStruct;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class OfflineModeFypBottomBannerProtocol extends FeedCommonBannerProtocol {
    public static final Set<String> LLIZLLLIL = C13LQ.LJLIIL(new String[]{"bottom_banner_take_down", "bottom_banner_audio_violation", "bottom_banner_customized_notice", "bottom_banner_video_vpa", "bottom_banner_warning", "bottom_banner_promote_ads", "bottom_banner_tcm", "bottom_banner_ad_deduction", "bottom_banner_manga", "bottom_banner_series_mini_drama", "bottom_banner_content_check_bar", "bottom_banner_nr_banner", "bottom_banner_under_water"});
    public final String LLILZIL;
    public final C638170P1j LLILZLL;
    public final C638260P1s LLIZ;

    public OfflineModeFypBottomBannerProtocol() {
        this(0);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final String LIZJ() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final InterfaceC707420Roy LJFF() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final C0SH2 LJI() {
        return this.LLILZLL;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0P1j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0P1s] */
    public OfflineModeFypBottomBannerProtocol(int i) {
        this.LLILZIL = "bottom_banner_offline_mode";
        final C718360SFu c718360SFu = this.LL;
        this.LLILZLL = new C0SGE(c718360SFu) { // from class: X.0P1j
            @Override // X.C0SGE, X.C0SH2
            public final void LIZ(int i2, String str) {
            }

            @Override // X.C0SGE, X.C0SH2
            public final boolean LIZJ(VideoItemParams videoItemParams) {
                Aweme aweme;
                if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || AwemeBizExtKt.getCacheSourceType(aweme) != C0N9C.OFFLINE_MODE.ordinal()) {
                    return false;
                }
                return true;
            }

            @Override // X.C0SGE, X.C0SH2
            public final void LIZIZ(BannerCommonTailAction.BannerActionType bannerActionType, C0SH1 c0sh1) {
                C0RJN c0rjnLIZIZ;
                Fragment fragment;
                Context context;
                String str;
                String aid;
                C690870R8b c690870R8b = this.LIZ.LJ;
                if (c690870R8b != null && (c0rjnLIZIZ = c690870R8b.LIZIZ()) != null && (fragment = c0rjnLIZIZ.LJ) != null && (context = fragment.getContext()) != null) {
                    String str2 = this.LIZ.LJFF;
                    if (str2 == null) {
                        str2 = "";
                    }
                    EnumC638200P1m enumC638200P1m = c0sh1.LIZ;
                    if (enumC638200P1m != null && C638180P1k.LIZ[enumC638200P1m.ordinal()] == 1) {
                        C625130OfX c625130OfX = C625130OfX.LIZ;
                        Aweme aweme = this.LIZ.LIZJ;
                        if (aweme != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        C625130OfX.LJ(c625130OfX, "offline_mode_manage_click", "homepage_hot", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, aid, "banner", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -25165828, 131071);
                        str = "click_manage";
                    } else {
                        str = "click_banner";
                    }
                    C1EE1.LIZIZ.LJJJJIZL(context, str, str2, true, EnumC616320OFi.OFFLINE_MODE_PANEL);
                }
            }
        };
        final C718360SFu c718360SFu2 = this.LL;
        this.LLIZ = new C718260SFk(c718360SFu2) { // from class: X.0P1s
            public final Map<String, String> LIZLLL() {
                Aweme aweme = this.LIZ.LIZJ;
                return C2097908Jt.LIZJ(new Pair("offline_mode_banner_type", (aweme == null || AwemeBizExtKt.getOfflineUnwatchedCount(aweme) == 0) ? "manage_banner" : "normal_banner"));
            }

            @Override // X.C718260SFk, X.InterfaceC707420Roy
            public final Map<String, String> LIZ() {
                return LIZLLL();
            }

            @Override // X.C718260SFk, X.InterfaceC707420Roy
            public final Map<String, String> LIZIZ() {
                return LIZLLL();
            }

            @Override // X.C718260SFk, X.InterfaceC707420Roy
            public final Map<String, String> LIZJ() {
                return LIZLLL();
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final void LJII(VideoItemParams videoItemParams) {
        Aweme aweme;
        List<BannerCommonStruct> listSingletonList;
        String str;
        String str2;
        String str3;
        if (!C297220Bku.LIZ() || (aweme = videoItemParams.getAweme()) == null || !C0NIZ.LIZIZ(aweme)) {
            return;
        }
        List<BannerCommonStruct> banners = aweme.getBanners();
        String str4 = null;
        if (C0NIZ.LIZ(aweme)) {
            if (banners != null && !banners.isEmpty()) {
                Iterator<BannerCommonStruct> it2 = banners.iterator();
                while (it2.hasNext()) {
                    BannerCommonKey bannerCommonKey = it2.next().bannerKey;
                    if (bannerCommonKey != null) {
                        str2 = bannerCommonKey.componentKey;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, "bottom_banner_offline_mode")) {
                        ArrayList arrayList = new ArrayList();
                        for (BannerCommonStruct bannerCommonStruct : banners) {
                            BannerCommonKey bannerCommonKey2 = bannerCommonStruct.bannerKey;
                            if (bannerCommonKey2 != null) {
                                str3 = bannerCommonKey2.componentKey;
                            } else {
                                str3 = null;
                            }
                            if (!Intrinsics.LJFF(str3, "bottom_banner_offline_mode")) {
                                arrayList.add(bannerCommonStruct);
                            }
                        }
                        aweme.setBanners(arrayList);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (banners != null && !banners.isEmpty()) {
            Iterator<BannerCommonStruct> it3 = banners.iterator();
            while (it3.hasNext()) {
                BannerCommonKey bannerCommonKey3 = it3.next().bannerKey;
                if (bannerCommonKey3 != null) {
                    str = bannerCommonKey3.componentKey;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, "bottom_banner_offline_mode")) {
                    return;
                }
            }
        }
        BannerCommonStruct bannerCommonStruct2 = new BannerCommonStruct(new BannerCommonKey("bottom_banner_offline_mode", ""), new BannerCommonUIStruct("cloud_arrow_down_fill", new BannerCommonContent(Collections.singletonList(new BannerCommonText(C20642515q3.LJI(2131838492), null, null, BannerCommonText.BannerTextActionType.BANNER_TEXT_ACTION_TYPE_NONE.getType())), 1), new BannerCommonTailAction(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_SEARCH_TAKO_TEXT_ICON.getType(), Collections.singletonList(new BannerCommonAction("", C20642515q3.LJI(2131838493), "arrow")))), "", new BannerTracerInfoStruct(null));
        if (banners != null && !banners.isEmpty()) {
            Set<String> set = LLIZLLLIL;
            BannerCommonKey bannerCommonKey4 = ((BannerCommonStruct) C13LP.LJJJJZI(banners)).bannerKey;
            if (bannerCommonKey4 != null) {
                str4 = bannerCommonKey4.componentKey;
            }
            if (C13LP.LJJJJ(str4, set)) {
                listSingletonList = C13LP.LJLIL(C13LP.LJJJJIZL(banners, 1), C13LP.LJLILLLLZI(bannerCommonStruct2, Collections.singletonList(C13LP.LJJJJZI(banners))));
            } else {
                listSingletonList = C13LP.LJLIL(banners, Collections.singletonList(bannerCommonStruct2));
            }
        } else {
            listSingletonList = Collections.singletonList(bannerCommonStruct2);
        }
        aweme.setBanners(listSingletonList);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final BannerCommonStruct LJIIIIZZ(BannerCommonStruct bannerCommonStruct) {
        String str;
        String aid;
        String strLJI;
        String strLJI2;
        List<BannerCommonAction> list;
        BannerCommonKey bannerCommonKey = bannerCommonStruct.bannerKey;
        if (bannerCommonKey != null) {
            str = bannerCommonKey.componentKey;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "bottom_banner_offline_mode")) {
            return bannerCommonStruct;
        }
        int iMax = C0NII.LJ;
        List<String> list2 = C0NII.LJFF;
        Aweme aweme = this.LL.LIZJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!C13LP.LJJJJ(aid, list2)) {
            iMax = Math.max(0, iMax - 1);
        }
        Aweme aweme2 = this.LL.LIZJ;
        if (aweme2 != null) {
            AwemeBizExtKt.setOfflineUnwatchedCount(aweme2, iMax);
        }
        if (iMax > 0) {
            strLJI = C20642515q3.LJ(2131755436, iMax, Integer.valueOf(iMax));
            strLJI2 = null;
        } else {
            strLJI = C20642515q3.LJI(2131838492);
            strLJI2 = C20642515q3.LJI(2131838493);
        }
        BannerCommonUIStruct bannerCommonUIStruct = bannerCommonStruct.bannerUIStruct;
        if (bannerCommonUIStruct == null) {
            bannerCommonUIStruct = new BannerCommonUIStruct(null, null, null);
            bannerCommonStruct.setBannerUIStruct(bannerCommonUIStruct);
        }
        BannerCommonContent bannerCommonContent = bannerCommonUIStruct.content;
        if (bannerCommonContent == null) {
            bannerCommonContent = new BannerCommonContent(null, 1);
            bannerCommonUIStruct.setContent(bannerCommonContent);
        }
        List<BannerCommonText> list3 = bannerCommonContent.bannerTexts;
        if (list3 != null && !list3.isEmpty()) {
            ((BannerCommonText) C13LP.LJJJJZI(list3)).setTextBody(strLJI);
        } else {
            bannerCommonContent.setBannerTexts(Collections.singletonList(new BannerCommonText(strLJI, null, null, BannerCommonText.BannerTextActionType.BANNER_TEXT_ACTION_TYPE_NONE.getType())));
        }
        BannerCommonTailAction bannerCommonTailAction = bannerCommonUIStruct.tailAction;
        if (bannerCommonTailAction != null && (list = bannerCommonTailAction.actions) != null) {
            Iterator<BannerCommonAction> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setText(strLJI2);
            }
        }
        return bannerCommonStruct;
    }
}
