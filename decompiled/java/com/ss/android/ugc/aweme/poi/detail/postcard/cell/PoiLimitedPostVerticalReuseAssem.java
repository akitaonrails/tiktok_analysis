package com.ss.android.ugc.aweme.poi.detail.postcard.cell;

import X.C01GW;
import X.C0T47;
import X.C1057880ddS;
import X.C1175120ggY;
import X.C1180070goX;
import X.C1180320gow;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1185410gx9;
import X.C1185490gxH;
import X.C1187240h06;
import X.C1187600h0g;
import X.C1187610h0h;
import X.C1187970h1H;
import X.C1188400h1y;
import X.C1188410h1z;
import X.C1189060h32;
import X.C1189360h3W;
import X.C123100dR;
import X.C1252710ihh;
import X.C1308910kAL;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C1558360qeg;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C166X;
import X.C18JG;
import X.C1908030zkf;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427660Gpo;
import X.C438710HIf;
import X.C452501pT;
import X.C631370Opb;
import X.C720360SNm;
import X.C723830SaL;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1203020hPY;
import X.EnumC1334360kpO;
import X.InterfaceC1184330gvP;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import wh6.AbS508S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLimitedPostVerticalReuseAssem extends ReusedUISlotAssem<PoiLimitedPostVerticalReuseAssem> implements InterfaceC712990Rxx<C1187600h0g> {
    public static final C0T47 LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static TuxIconDrawable LLJLL;
    public static TuxIconDrawable LLJLLIL;
    public final C166X LLJJLIIIJLLLLLLLZ = new C166X(new AwS597S0100000_18((ReusedUISlotAssem) this, 350));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1192));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiLimitedPostVerticalReuseAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiDetailLimitedPostVerticalCellBinding;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLIL = new C0T47();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e0l;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final PoiPostPageShareVM sp() {
        return (PoiPostPageShareVM) this.LLJL.getValue();
    }

    public final C1188400h1y tp() {
        C166X c166x = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (C1188400h1y) c166x.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS597S0100000_18(this, 349));
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 105));
        tp().LLIZ.getLayoutParams().height = (tp().LLIZ.getLineHeight() * 2) + tp().LLIZ.getPaddingBottom() + tp().LLIZ.getPaddingTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void op(C1187600h0g c1187600h0g) {
        String collectInfo;
        String fromGroupId;
        C1185490gxH c1185490gxH;
        String str;
        C1187970h1H c1187970h1H;
        PoiListApi.PostTag postTag;
        C1187610h0h c1187610h0h;
        C1187610h0h c1187610h0h2;
        C1185410gx9 c1185410gx9;
        C1187610h0h c1187610h0h3;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        String str2 = c1187600h0g.LL;
        if (str2 != null) {
            C1187240h06.LIZ.put(str2, Integer.valueOf(C631370Opb.LIZIZ(this)));
        }
        C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(tp().LLJI, tp().LLJI.getWidth(), tp().LLJI.getHeight());
        LruCache<String, String> lruCache = C1180320gow.LIZ;
        C1180320gow.LIZIZ(c1187600h0g.LLILLJJLI.getAid(), c1187600h0g.LL);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        Bundle bundleLJFF = c1606420ruCLIZ.LJFF();
        Aweme aweme = c1187600h0g.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c7535.d8692_i");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        interfaceC1184330gvP.Oe(bundleLJFF, aweme, C18JG.LIZ(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via((View) tp().LLJI), null), 52, "POI_LIMITED_POST_PAGE_ENTRANCE", "limited", null, c1187600h0g.LLILZIL, new LinkedHashMap(), null);
        Aweme aweme2 = c1187600h0g.LLILLJJLI;
        String str3 = c1187600h0g.LL;
        if (str3 == null) {
            str3 = "";
        }
        int iLIZIZ = C631370Opb.LIZIZ(this);
        PoiPostPageShareVM poiPostPageShareVMSp = sp();
        if (poiPostPageShareVMSp != null && (c1187610h0h3 = poiPostPageShareVMSp.LLILZIL) != null && (poiDetailResponse = c1187610h0h3.poiDetailResponse) != null) {
            collectInfo = poiDetailResponse.getCollectInfo();
        } else {
            collectInfo = null;
        }
        PoiPostPageShareVM poiPostPageShareVMSp2 = sp();
        if (poiPostPageShareVMSp2 != null && (c1187610h0h2 = poiPostPageShareVMSp2.LLILZIL) != null && (c1185410gx9 = c1187610h0h2.poiDetailParams) != null) {
            fromGroupId = c1185410gx9.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        Boolean bool = Boolean.FALSE;
        PoiPostPageShareVM poiPostPageShareVMSp3 = sp();
        if (poiPostPageShareVMSp3 != null && (c1187610h0h = poiPostPageShareVMSp3.LLILZIL) != null) {
            c1185490gxH = c1187610h0h.poiAnchorMobData;
        } else {
            c1185490gxH = null;
        }
        PoiPostPageShareVM poiPostPageShareVMSp4 = sp();
        if (poiPostPageShareVMSp4 != null && (c1187970h1H = (C1187970h1H) poiPostPageShareVMSp4.getState()) != null && (postTag = c1187970h1H.LL) != null) {
            str = postTag.tagCode;
        } else {
            str = null;
        }
        PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        }
        C1188410h1z.LIZIZ(aweme2, str3, iLIZIZ, collectInfo, fromGroupId, bool, c1185490gxH, "post_card", null, str, null, pageFinderVia, interfaceC665370Q7zLJFF, 64);
    }

    @Override // X.InterfaceC712990Rxx
    public final void up(C1187600h0g c1187600h0g) {
        int iIntValue;
        UrlModel cover;
        Integer numValueOf;
        Integer numValueOf2;
        int i;
        int i2;
        String title;
        UrlModel avatarThumb;
        String customVerify;
        String enterpriseVerifyReason;
        PhotoModeImageInfo photoModeImageInfo;
        Object obj;
        TuxIconDrawable tuxIconDrawable;
        Integer numLIZJ;
        Aweme aweme = c1187600h0g.LLILLJJLI;
        int i3 = 8;
        C786410Ut5.LLLLLLZZ(tp().LLIZLLLIL, 8);
        String str = "";
        tp().LLIZ.setText("");
        C0T47 c0t47 = LLJLIL;
        Context context = getContext();
        c0t47.getClass();
        Pair pairLIZ = C0T47.LIZ(context);
        int iIntValue2 = ((Number) pairLIZ.getFirst()).intValue();
        int iIntValue3 = ((Number) pairLIZ.getSecond()).intValue();
        ViewGroup.LayoutParams layoutParams = tp().LLILZLL.getLayoutParams();
        if (layoutParams == null || layoutParams.width != iIntValue2) {
            ViewGroup.LayoutParams layoutParams2 = tp().LLILZLL.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = iIntValue2;
            }
            ViewGroup.LayoutParams layoutParams3 = tp().LLILZLL.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.height = iIntValue3;
            }
        }
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context2)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1331750klB.LIZJ = iIntValue;
        c1331750klB.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_limited_post_cover", new C1180560gpK(getContext(), EnumC1177490gkN.FALLBACK_32_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(8))), null));
        Video video = aweme.getVideo();
        if (video != null) {
            cover = video.getCover();
        } else {
            cover = null;
        }
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(cover));
        c1189360h3WLIZ.LIZ.LJJIJL(getContext());
        Context context3 = getContentView().getContext();
        ViewGroup.LayoutParams layoutParams4 = tp().LLILZLL.getLayoutParams();
        if (layoutParams4 != null) {
            numValueOf = Integer.valueOf(layoutParams4.width);
        } else {
            numValueOf = null;
        }
        int iLIZJ = C1175120ggY.LIZJ(numValueOf);
        ViewGroup.LayoutParams layoutParams5 = tp().LLILZLL.getLayoutParams();
        if (layoutParams5 != null) {
            numValueOf2 = Integer.valueOf(layoutParams5.height);
        } else {
            numValueOf2 = null;
        }
        C1180070goX.LIZ(c1189360h3WLIZ, context3, iLIZJ, C1175120ggY.LIZJ(numValueOf2), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        ViewGroup.LayoutParams layoutParams6 = tp().LLILZLL.getLayoutParams();
        if (layoutParams6 != null) {
            i = layoutParams6.width;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams7 = tp().LLILZLL.getLayoutParams();
        if (layoutParams7 != null) {
            i2 = layoutParams7.height;
        } else {
            i2 = 0;
        }
        c1189360h3WLIZ.LJI(i, i2);
        C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
        C1331670kl3 c1331670kl3 = c1189360h3WLIZ.LIZ;
        c1331670kl3.LJJI = c1331730kl9;
        c1331670kl3.LJJIII = EnumC1334360kpO.HIGH;
        c1189360h3WLIZ.LIZLLL(tp().LLILZLL);
        c1189360h3WLIZ.LIZIZ();
        if (AwemeExtKt.isPhotoMode(aweme)) {
            TuxIconView tuxIconView = tp().LLIZLLLIL;
            Context context4 = getContext();
            if (context4 == null) {
                tuxIconDrawable = null;
            } else {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                if (C720360SNm.LJIIL(((C1187600h0g) obj).LLILLJJLI)) {
                    if (LLJLLIL == null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_horizontal_bars;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                        c419910GdJ.LJFF = true;
                        LLJLLIL = c419910GdJ.LIZ(context4);
                    }
                    tuxIconDrawable = LLJLLIL;
                } else {
                    if (LLJLL == null) {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_square_corner_border_fill;
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.zi);
                        c419910GdJ2.LJFF = true;
                        LLJLL = c419910GdJ2.LIZ(context4);
                    }
                    tuxIconDrawable = LLJLL;
                }
            }
            tuxIconView.setImageDrawable(tuxIconDrawable);
            C786410Ut5.LLLLLLZZ(tp().LLIZLLLIL, 0);
        }
        if (!AwemeExtKt.isPhotoMode(aweme) || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (title = photoModeImageInfo.getTitle()) == null || !C123100dR.LIZ(title)) {
            String desc = aweme.getDesc();
            if (desc != null) {
                str = desc;
            }
            title = str;
        }
        if (C123100dR.LIZ(title)) {
            C786410Ut5.LLLLZLL(tp().LLIZ, 0);
            tp().LLIZ.setText(title);
        }
        C427660Gpo c427660Gpo = tp().LLILLL;
        User author = aweme.getAuthor();
        if (author != null) {
            avatarThumb = author.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 1022);
        tp().LLILZ.setText(C1057880ddS.LIZIZ("Nearby", null, aweme));
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            customVerify = author2.getCustomVerify();
        } else {
            customVerify = null;
        }
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            enterpriseVerifyReason = author3.getEnterpriseVerifyReason();
        } else {
            enterpriseVerifyReason = null;
        }
        UserVerify userVerify = new UserVerify(null, customVerify, enterpriseVerifyReason, -1);
        TuxIconView tuxIconView2 = tp().LLILLJJLI;
        if (C1908030zkf.LIZLLL(userVerify)) {
            i3 = 0;
        }
        C786410Ut5.LJLLLLLL(i3, tuxIconView2);
        C786410Ut5.I7(new AbS508S0200000_18(this, c1187600h0g, 13, 42), tp().LLILZIL);
        C786410Ut5.I7(new AbS508S0200000_18(this, c1187600h0g, 14, 42), tp().LLJ);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1187600h0g c1187600h0g) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1187600h0g c1187600h0g) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C1187600h0g c1187600h0g = (C1187600h0g) interfaceC1587906Jp;
        if (list == null || list.isEmpty()) {
            up(c1187600h0g);
        }
    }
}
