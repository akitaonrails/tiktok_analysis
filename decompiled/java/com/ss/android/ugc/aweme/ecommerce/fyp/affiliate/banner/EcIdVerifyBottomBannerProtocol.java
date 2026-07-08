package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.banner;

import X.C04S2;
import X.C0SH0;
import X.C0SH2;
import X.C0SH5;
import X.C1733730vDX;
import X.C718360SFu;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonContent;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonText;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonUIStruct;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class EcIdVerifyBottomBannerProtocol extends FeedCommonBannerProtocol implements C0SH5 {
    public final String LLILZIL;
    public final C1733730vDX LLILZLL;

    public EcIdVerifyBottomBannerProtocol() {
        this(0);
    }

    @Override // X.C0SH5
    public final Float LIZ() {
        return null;
    }

    @Override // X.C0SH5
    public final Float LIZLLL() {
        if (((Boolean) C04S2.LIZ.getValue()).booleanValue()) {
            return Float.valueOf(12.0f);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final C0SH0 LJ() {
        final C718360SFu c718360SFu = this.LL;
        final C1733730vDX c1733730vDX = this.LLILZLL;
        return new C0SH0(c718360SFu, c1733730vDX) { // from class: X.0Rub
            public final C718360SFu LIZ;
            public final C1733730vDX LIZIZ;

            @Override // X.C0SH0
            public final void H() {
            }

            @Override // X.C0SH0
            public final void LJJIIJ() {
            }

            @Override // X.C0SH0
            public final void LJJIIJZLJL() {
            }

            @Override // X.C0SH0
            public final void LJJIIZ() {
            }

            @Override // X.C0SH0
            public final void LJJLJLI() {
            }

            @Override // X.C0SH0
            public final void LJL() {
            }

            @Override // X.C0SH0
            public final void LJLLLL() {
            }

            @Override // X.C0SH0
            public final void I(Aweme aweme) {
                String authorUid;
                C1733730vDX c1733730vDX2 = this.LIZIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String aid = null;
                if (aweme != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                } else {
                    authorUid = null;
                }
                linkedHashMap.put("author_id", authorUid);
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                linkedHashMap.put("item_id", aid);
                linkedHashMap.put("page_name", this.LIZ.LJFF);
                c1733730vDX2.getClass();
                linkedHashMap.putAll(linkedHashMap);
                C1733730vDX c1733730vDX3 = this.LIZIZ;
                c1733730vDX3.getClass();
                C1018703yb.LIZIZ("affiliate_page_show", c1733730vDX3.LIZ);
            }

            {
                this.LIZ = c718360SFu;
                this.LIZIZ = c1733730vDX;
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final C0SH2 LJI() {
        final C718360SFu c718360SFu = this.LL;
        final C1733730vDX c1733730vDX = this.LLILZLL;
        return new C0SH2(c718360SFu, c1733730vDX) { // from class: X.0SGR
            public final C718360SFu LIZ;
            public final C1733730vDX LIZIZ;

            @Override // X.C0SH2
            public final void LIZIZ(BannerCommonTailAction.BannerActionType bannerActionType, C0SH1 c0sh1) {
            }

            @Override // X.C0SH2
            public final boolean LIZJ(VideoItemParams videoItemParams) {
                return true;
            }

            {
                this.LIZ = c718360SFu;
                this.LIZIZ = c1733730vDX;
            }

            @Override // X.C0SH2
            public final void LIZ(int i, String str) {
                int size;
                C0RJN c0rjnLIZIZ;
                Fragment fragment;
                Context context;
                BannerCommonUIStruct bannerCommonUIStruct;
                BannerCommonContent bannerCommonContent;
                List<BannerCommonText> list;
                BannerCommonStruct bannerCommonStruct = this.LIZ.LIZLLL;
                if (bannerCommonStruct != null && (bannerCommonUIStruct = bannerCommonStruct.bannerUIStruct) != null && (bannerCommonContent = bannerCommonUIStruct.content) != null && (list = bannerCommonContent.bannerTexts) != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                if (i == size - 1 && str != null && str.length() != 0) {
                    C1733730vDX c1733730vDX2 = this.LIZIZ;
                    c1733730vDX2.getClass();
                    C1018703yb.LIZIZ("affiliate_button_click", c1733730vDX2.LIZ);
                    C690870R8b c690870R8b = this.LIZ.LJ;
                    if (c690870R8b != null && (c0rjnLIZIZ = c690870R8b.LIZIZ()) != null && (fragment = c0rjnLIZIZ.LJ) != null && (context = fragment.getContext()) != null) {
                        SmartRouter.buildRoute(context, str).open();
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
    public final String LIZJ() {
        return this.LLILZIL;
    }

    public EcIdVerifyBottomBannerProtocol(int i) {
        this.LLILZIL = "bottom_banner_id_verification";
        this.LLILZLL = new C1733730vDX();
    }
}
