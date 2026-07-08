package com.ss.android.ugc.aweme.poi.detail.postcard.cell;

import X.C01GW;
import X.C0T48;
import X.C1057880ddS;
import X.C1175120ggY;
import X.C1178990gmn;
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
import X.C1188090h1T;
import X.C1188390h1x;
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
import X.C960203pA;
import X.EnumC1177490gkN;
import X.EnumC1203020hPY;
import X.EnumC1334360kpO;
import X.InterfaceC1173990gej;
import X.InterfaceC1184330gvP;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import android.view.ContextThemeWrapper;
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
public class PoiLimitedPostHorizontalBaseReuseAssem extends ReusedUISlotAssem<PoiLimitedPostHorizontalBaseReuseAssem> implements InterfaceC712990Rxx<C1187600h0g> {
    public static final C0T48 LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static TuxIconDrawable LLJLL;
    public static TuxIconDrawable LLJLLIL;
    public static TuxIconDrawable LLJLLL;
    public final C166X LLJJLIIIJLLLLLLLZ = new C166X(new AwS597S0100000_18((ReusedUISlotAssem) this, 348));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1191));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiLimitedPostHorizontalBaseReuseAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiDetailLimitedPostHorizontalCellBinding;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLIL = new C0T48();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e0k;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final PoiPostPageShareVM tp() {
        return (PoiPostPageShareVM) this.LLJL.getValue();
    }

    public final C1188390h1x up() {
        C166X c166x = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (C1188390h1x) c166x.LIZ(this);
    }

    public final Context sp() {
        Context context = getContext();
        return (context == null || C960203pA.LIZIZ(context)) ? new ContextThemeWrapper(LJJIJL().getContext(), R.style.y3) : LJJIJL().getContext();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS597S0100000_18(this, 347));
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 104));
        up().LLIZ.getLayoutParams().height = (up().LLIZ.getLineHeight() * 2) + up().LLIZ.getPaddingBottom() + up().LLIZ.getPaddingTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void op(C1187600h0g c1187600h0g) {
        String strS2;
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
        C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(up().LLJIJIL, up().LLJIJIL.getWidth(), up().LLJIJIL.getHeight());
        LruCache<String, String> lruCache = C1180320gow.LIZ;
        C1180320gow.LIZIZ(c1187600h0g.LLILLJJLI.getAid(), c1187600h0g.LL);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        Bundle bundleLJFF = c1606420ruCLIZ.LJFF();
        Aweme aweme = c1187600h0g.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c7535.d8692_i");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        String strLIZ = C18JG.LIZ(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via((View) up().LLJIJIL), null);
        int i = c1187600h0g.LLILZIL;
        InterfaceC1173990gej<?> interfaceC1173990gejLIZ = C1178990gmn.LIZ(this);
        if (interfaceC1173990gejLIZ != null) {
            strS2 = interfaceC1173990gejLIZ.S2();
        } else {
            strS2 = null;
        }
        interfaceC1184330gvP.Oe(bundleLJFF, aweme, strLIZ, 52, "POI_LIMITED_POST_PAGE_ENTRANCE", "limited", null, i, new LinkedHashMap(), strS2);
        Aweme aweme2 = c1187600h0g.LLILLJJLI;
        String str3 = c1187600h0g.LL;
        if (str3 == null) {
            str3 = "";
        }
        int iLIZIZ = C631370Opb.LIZIZ(this);
        PoiPostPageShareVM poiPostPageShareVMTp = tp();
        if (poiPostPageShareVMTp != null && (c1187610h0h3 = poiPostPageShareVMTp.LLILZIL) != null && (poiDetailResponse = c1187610h0h3.poiDetailResponse) != null) {
            collectInfo = poiDetailResponse.getCollectInfo();
        } else {
            collectInfo = null;
        }
        PoiPostPageShareVM poiPostPageShareVMTp2 = tp();
        if (poiPostPageShareVMTp2 != null && (c1187610h0h2 = poiPostPageShareVMTp2.LLILZIL) != null && (c1185410gx9 = c1187610h0h2.poiDetailParams) != null) {
            fromGroupId = c1185410gx9.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        Boolean bool = Boolean.FALSE;
        PoiPostPageShareVM poiPostPageShareVMTp3 = tp();
        if (poiPostPageShareVMTp3 != null && (c1187610h0h = poiPostPageShareVMTp3.LLILZIL) != null) {
            c1185490gxH = c1187610h0h.poiAnchorMobData;
        } else {
            c1185490gxH = null;
        }
        PoiPostPageShareVM poiPostPageShareVMTp4 = tp();
        if (poiPostPageShareVMTp4 != null && (c1187970h1H = (C1187970h1H) poiPostPageShareVMTp4.getState()) != null && (postTag = c1187970h1H.LL) != null) {
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
    public final /* bridge */ /* synthetic */ boolean ur(C1187600h0g c1187600h0g) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: yp, reason: merged with bridge method [inline-methods] */
    public final void up(C1187600h0g c1187600h0g) {
        int iIntValue;
        Integer numValueOf;
        Integer numValueOf2;
        UrlModel cover;
        Integer numValueOf3;
        Integer numValueOf4;
        int i;
        int i2;
        Context context;
        TuxIconDrawable tuxIconDrawable;
        String desc;
        PhotoModeImageInfo photoModeImageInfo;
        UrlModel avatarThumb;
        String customVerify;
        String enterpriseVerifyReason;
        Integer numLIZJ;
        Integer numLIZJ2;
        C1187970h1H c1187970h1H;
        C1188090h1T c1188090h1T;
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        Object obj;
        TuxIconDrawable tuxIconDrawable2;
        Integer numLIZJ3;
        Aweme aweme = c1187600h0g.LLILLJJLI;
        int i3 = 8;
        C786410Ut5.LLLLLLZZ(up().LLJ, 8);
        C786410Ut5.LLLLZLL(up().LLIZ, 8);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
        Context context2 = getContext();
        if (context2 != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.a02, context2)) != null) {
            iIntValue = numLIZJ3.intValue();
        } else {
            iIntValue = 0;
        }
        c1331750klB.LIZJ = iIntValue;
        c1331750klB.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        Context context3 = getContext();
        EnumC1177490gkN enumC1177490gkN = EnumC1177490gkN.FALLBACK_32_PX;
        C1180580gpM c1180580gpM = new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12)));
        ViewGroup.LayoutParams layoutParams = up().LLILZLL.getLayoutParams();
        if (layoutParams != null) {
            numValueOf = Integer.valueOf(layoutParams.width);
        } else {
            numValueOf = null;
        }
        Integer numValueOf5 = Integer.valueOf(C1175120ggY.LIZJ(numValueOf));
        ViewGroup.LayoutParams layoutParams2 = up().LLILZLL.getLayoutParams();
        if (layoutParams2 != null) {
            numValueOf2 = Integer.valueOf(layoutParams2.height);
        } else {
            numValueOf2 = null;
        }
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_limited_post_cover", new C1180560gpK(context3, enumC1177490gkN, c1180580gpM, new Pair(numValueOf5, Integer.valueOf(C1175120ggY.LIZJ(numValueOf2)))));
        Video video = aweme.getVideo();
        if (video != null) {
            cover = video.getCover();
        } else {
            cover = null;
        }
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(cover));
        c1189360h3WLIZ.LIZ.LJJIJL(getContext());
        Context context4 = getContentView().getContext();
        ViewGroup.LayoutParams layoutParams3 = up().LLILZLL.getLayoutParams();
        if (layoutParams3 != null) {
            numValueOf3 = Integer.valueOf(layoutParams3.width);
        } else {
            numValueOf3 = null;
        }
        int iLIZJ = C1175120ggY.LIZJ(numValueOf3);
        ViewGroup.LayoutParams layoutParams4 = up().LLILZLL.getLayoutParams();
        if (layoutParams4 != null) {
            numValueOf4 = Integer.valueOf(layoutParams4.height);
        } else {
            numValueOf4 = null;
        }
        C1180070goX.LIZ(c1189360h3WLIZ, context4, iLIZJ, C1175120ggY.LIZJ(numValueOf4), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        ViewGroup.LayoutParams layoutParams5 = up().LLILZLL.getLayoutParams();
        if (layoutParams5 != null) {
            i = layoutParams5.width;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams6 = up().LLILZLL.getLayoutParams();
        if (layoutParams6 != null) {
            i2 = layoutParams6.height;
        } else {
            i2 = 0;
        }
        c1189360h3WLIZ.LJI(i, i2);
        C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
        C1331670kl3 c1331670kl3 = c1189360h3WLIZ.LIZ;
        c1331670kl3.LJJI = c1331730kl9;
        c1331670kl3.LJJIII = EnumC1334360kpO.HIGH;
        c1189360h3WLIZ.LIZLLL(up().LLILZLL);
        c1189360h3WLIZ.LIZIZ();
        Context context5 = getContext();
        if (context5 != null && C960203pA.LIZIZ(context5)) {
            context = new ContextThemeWrapper(LJJIJL().getContext(), R.style.y3);
        } else {
            context = LJJIJL().getContext();
        }
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.z_, context);
        if (numLIZJ4 != null) {
            up().LLIZLLLIL.setShadeColorRes(numLIZJ4.intValue());
        }
        boolean zIsPhotoMode = AwemeExtKt.isPhotoMode(aweme);
        Integer numValueOf6 = Integer.valueOf(R.attr.zi);
        if (zIsPhotoMode) {
            TuxIconView tuxIconView = up().LLJ;
            Context context6 = getContext();
            if (context6 == null) {
                tuxIconDrawable2 = null;
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
                        c419910GdJ.LJ = numValueOf6;
                        c419910GdJ.LJFF = true;
                        LLJLLIL = c419910GdJ.LIZ(context6);
                    }
                    tuxIconDrawable2 = LLJLLIL;
                } else {
                    if (LLJLL == null) {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_square_corner_border_fill;
                        c419910GdJ2.LJ = numValueOf6;
                        c419910GdJ2.LJFF = true;
                        LLJLL = c419910GdJ2.LIZ(context6);
                    }
                    tuxIconDrawable2 = LLJLL;
                }
            }
            tuxIconView.setImageDrawable(tuxIconDrawable2);
            C786410Ut5.LLLLLLZZ(up().LLJ, 0);
        } else {
            TuxIconView tuxIconView2 = up().LLJ;
            Context context7 = getContext();
            if (context7 == null) {
                tuxIconDrawable = null;
            } else {
                if (LLJLLL == null) {
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    c419910GdJ3.LIZ = R.raw.icon_play_fill;
                    c419910GdJ3.LJ = numValueOf6;
                    c419910GdJ3.LJFF = true;
                    LLJLLL = c419910GdJ3.LIZ(context7);
                }
                tuxIconDrawable = LLJLLL;
            }
            tuxIconView2.setImageDrawable(tuxIconDrawable);
            C786410Ut5.LLLLLLZZ(up().LLJ, 0);
        }
        PoiPostPageShareVM poiPostPageShareVMTp = tp();
        if (poiPostPageShareVMTp == null || (c1187970h1H = (C1187970h1H) poiPostPageShareVMTp.getState()) == null || (c1188090h1T = c1187970h1H.LLILLJJLI) == null || (poiMergedListResponse = c1188090h1T.poiInitPostModule) == null || !poiMergedListResponse.getHidePoiPostCardDesc()) {
            if ((!AwemeExtKt.isPhotoMode(aweme) || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (desc = photoModeImageInfo.getTitle()) == null || !C123100dR.LIZ(desc)) && (desc = aweme.getDesc()) == null) {
                desc = "";
            }
            if (C123100dR.LIZ(desc)) {
                C786410Ut5.LLLLZLL(up().LLIZ, 0);
                up().LLIZ.setText(desc);
            }
        }
        C427660Gpo c427660Gpo = up().LLILLL;
        User author = aweme.getAuthor();
        if (author != null) {
            avatarThumb = author.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 1022);
        up().LLILZ.setText(C1057880ddS.LIZIZ("Nearby", null, aweme));
        Context contextSp = sp();
        if (contextSp != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, contextSp)) != null) {
            up().LLILZ.setTextColor(numLIZJ2.intValue());
        }
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
        TuxIconView tuxIconView3 = up().LLILLJJLI;
        if (C1908030zkf.LIZLLL(userVerify)) {
            i3 = 0;
        }
        C786410Ut5.LJLLLLLL(i3, tuxIconView3);
        Context contextSp2 = sp();
        if (contextSp2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0o, contextSp2)) != null) {
            int iIntValue2 = numLIZJ.intValue();
            up().LLJILJIL.setInactiveIconTintColor(iIntValue2);
            up().LLJILJILJ.setTextColor(iIntValue2);
        }
        C786410Ut5.I7(new AbS508S0200000_18(this, c1187600h0g, 11, 42), up().LLILZIL);
        C786410Ut5.I7(new AbS508S0200000_18(this, c1187600h0g, 12, 42), up().LLJI);
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
