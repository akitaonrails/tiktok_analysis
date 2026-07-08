package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel;

import X.C01GW;
import X.C03EY;
import X.C098200Yq;
import X.C0BMX;
import X.C1179140gn2;
import X.C1179160gn4;
import X.C1180060goW;
import X.C1180760gpe;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1184710gw1;
import X.C1184830gwD;
import X.C1184910gwL;
import X.C1184970gwR;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1186070gyD;
import X.C1189060h32;
import X.C1189400h3a;
import X.C1190820h5s;
import X.C1191160h6Q;
import X.C1203300hQ0;
import X.C1209070hZJ;
import X.C1252710ihh;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1367960lha;
import X.C13LE;
import X.C14KI;
import X.C1558520qew;
import X.C1843500y4a;
import X.C189200o6;
import X.C1954807lC;
import X.C19M4;
import X.C20642515q3;
import X.C2097608Jq;
import X.C21415018rM;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C280190AyX;
import X.C290960Bao;
import X.C290970Bap;
import X.C337180DJs;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C444960Hcc;
import X.C452501pT;
import X.C703302op;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1179480gna;
import X.EnumC1184760gw6;
import X.EnumC1184800gwA;
import X.EnumC1184810gwB;
import X.EnumC1338240kve;
import X.InterfaceC1184330gvP;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiTagCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model.PoiHeadAiSummary;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.DistanceInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.IconTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import irm.AkS0S3300000_18;
import irm.AkS0S3410000_18;
import irm.AkS2S0500000_18;
import irm.AkS3S1300000_18;
import irm.AkS6S1200000_18;
import irm.AkS87S0100000_18;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS23S1400000_18;
import kotlin.jvm.internal.AwS38S1400000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS83S1300000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailHotelHeaderAssem extends PoiDetailHeaderAssem {
    public View LLJJJJLIIL;
    public List<IconTag> LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1014));
    public final C1184710gw1 LLJL;

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Ap(View view, String str, PoiListApi.PoiDetailResponse poiDetailResponse, C1184480gve c1184480gve) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Bp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final int Jo() {
        return R.layout.e0f;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Jp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Wp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Xp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str, String str2, String str3) {
    }

    public final int lq() {
        return ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1184710gw1 c1184710gw1 = this.LLJL;
        if (c1184710gw1 != null) {
            ((LinkedHashMap) c1184710gw1.LIZ).clear();
            EnumC1184760gw6 enumC1184760gw6 = EnumC1184760gw6.UNKNOWN;
            c1184710gw1.LIZIZ = enumC1184760gw6;
            c1184710gw1.LIZJ = enumC1184760gw6;
        }
        super.onDestroy();
    }

    public PoiDetailHotelHeaderAssem() {
        this.LLJL = C0BMX.LIZ() ? new C1184710gw1() : null;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final boolean mp() {
        return lq() > 0;
    }

    public static EnumC1184800gwA yq(PoiListApi.PoiDetailResponse poiDetailResponse) {
        long jLongValue;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2;
        Long l;
        if (poiDetailResponse != null) {
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel3 = poiDetailResponse.getPoiReviewSummaryModel();
            if (poiReviewSummaryModel3 != null && (l = poiReviewSummaryModel3.totalCount) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if ((poiDetailResponse == null || (poiReviewSummaryModel2 = poiDetailResponse.getPoiReviewSummaryModel()) == null || !Intrinsics.LJFF(poiReviewSummaryModel2.noRating, Boolean.TRUE)) && jLongValue > 0 && poiDetailResponse != null && (poiReviewSummaryModel = poiDetailResponse.getPoiReviewSummaryModel()) != null && poiReviewSummaryModel.score != null) {
                return EnumC1184800gwA.MIDDLE_BLOCK_NEW;
            }
        }
        return EnumC1184800gwA.BOTTOM_TITLE_NEW;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final boolean iq(PoiListApi.PoiDetailResponse poiDetailResponse) {
        List<PoiDetailTag> poiTopTags;
        if (!C1184910gwL.LIZ() || poiDetailResponse == null || poiDetailResponse.showPoiSmallPic() || (poiTopTags = poiDetailResponse.getPoiTopTags()) == null) {
            return false;
        }
        Iterator<PoiDetailTag> it2 = poiTopTags.iterator();
        while (it2.hasNext()) {
            if (it2.next().tagType == EnumC1179480gna.POI_DETAIL_TAG_TYPE_HOTEL_RATING.getValue()) {
                if (this.LLJILJIL) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int kq(ChartInfo chartInfo) {
        Context context = getContext();
        if (context != null) {
            C03EY c03ey = new C03EY(context, null, 6);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03ey);
            c03ey.setLayoutParams(marginLayoutParams);
            C03EY.LIZ(c03ey, chartInfo.chartTopicName, 82, null, true, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)))), null, null, null, null, 7705);
            return C1180060goW.LJIILJJIL(c03ey);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void tp(View view) {
        view.findViewById(R.id.jsp);
        view.findViewById(R.id.doq);
        C1189060h32.LJJII(view.findViewById(R.id.jo4), null, 0, null, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void yp(PoiListApi.PoiDetailResponse poiDetailResponse) {
        String str;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        String str2;
        C1184480gve c1184480gve3;
        C1184480gve c1184480gve4;
        View viewFindViewById = LJJIJL().findViewById(R.id.r33);
        if (viewFindViewById != null) {
            EnumC1184800gwA enumC1184800gwAYq = yq(poiDetailResponse);
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.findViewById(R.id.rb4);
            int i = C1184830gwD.LIZ[enumC1184800gwAYq.ordinal()];
            String str3 = null;
            if (i != 1) {
                if (i == 2) {
                    String str4 = cp().LL;
                    C1184460gvc c1184460gvcOo = Oo();
                    if (c1184460gvcOo != null && (c1184480gve4 = c1184460gvcOo.LLILLL) != null) {
                        str2 = c1184480gve4.LLILLJJLI;
                    } else {
                        str2 = null;
                    }
                    C1184460gvc c1184460gvcOo2 = Oo();
                    if (c1184460gvcOo2 != null && (c1184480gve3 = c1184460gvcOo2.LLILLL) != null) {
                        str3 = c1184480gve3.LL;
                    }
                    wq(viewFindViewById, poiDetailResponse, str4, str2, str3, viewGroup);
                    return;
                }
                throw new C1954807lC();
            }
            String str5 = cp().LL;
            C1184460gvc c1184460gvcOo3 = Oo();
            if (c1184460gvcOo3 != null && (c1184480gve2 = c1184460gvcOo3.LLILLL) != null) {
                str = c1184480gve2.LLILLJJLI;
            } else {
                str = null;
            }
            C1184460gvc c1184460gvcOo4 = Oo();
            if (c1184460gvcOo4 != null && (c1184480gve = c1184460gvcOo4.LLILLL) != null) {
                str3 = c1184480gve.LL;
            }
            xq(viewFindViewById, poiDetailResponse, str5, str, str3, enumC1184800gwAYq);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024d  */
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gp(android.view.ViewGroup r29, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r30) {
        /*
            Method dump skipped, instruction units count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem.Gp(android.view.ViewGroup, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Tp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        View viewFindViewById = view.findViewById(R.id.doo);
        View viewFindViewById2 = view.findViewById(R.id.doq);
        C339190DRl.LIZIZ(viewFindViewById);
        C339190DRl.LIZIZ(viewFindViewById2);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void fq(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        PoiDetailTag next;
        String str;
        C19M4 c19m4 = (C19M4) view.findViewById(R.id.jsp);
        if (iq(poiDetailResponse)) {
            C339190DRl.LIZIZ(c19m4);
            return;
        }
        if (poiDetailResponse != null && op(poiDetailResponse)) {
            List<PoiDetailTag> poiTopTags = poiDetailResponse.getPoiTopTags();
            PoiDetailTagStyle poiDetailTagStyle = null;
            if (poiTopTags != null) {
                Iterator<PoiDetailTag> it2 = poiTopTags.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.tagType == EnumC1179480gna.POI_DETAIL_TAG_TYPE_HOTEL_RATING.getValue()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PoiDetailTag poiDetailTag = next;
                if (poiDetailTag != null) {
                    C337180DJs.LIZJ(c19m4);
                    C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                    String strValueOf = String.valueOf(poiDetailTag.tagType);
                    String strMobPicMode = poiDetailResponse.mobPicMode();
                    PageFinder pageFinderZo = Zo();
                    C1184710gw1 c1184710gw1 = this.LLJL;
                    c1185430gxB.getClass();
                    C1185430gxB.LJJJ(interfaceC665370Q7zLJIIL, false, null, strValueOf, strMobPicMode, "hotel_stars", pageFinderZo, c1184710gw1);
                    PoiDetailTagContent poiDetailTagContent = poiDetailTag.tagContent;
                    if (poiDetailTagContent != null) {
                        str = poiDetailTagContent.commonText;
                    } else {
                        str = null;
                    }
                    c19m4.setText(str);
                    C1179140gn2 c1179140gn2 = PoiTagCell.LLILLJJLI;
                    Context context = view.getContext();
                    Map<String, PoiDetailTagStyle> poiDetailTagStyleMap = poiDetailResponse.getPoiDetailTagStyleMap();
                    if (poiDetailTagStyleMap != null) {
                        poiDetailTagStyle = poiDetailTagStyleMap.get(String.valueOf(poiDetailTag.tagStyle));
                    }
                    C1179140gn2.LIZIZ(c1179140gn2, context, c19m4, poiDetailTagStyle, null, poiDetailTag, 8);
                    return;
                }
            }
            C339190DRl.LIZIZ(c19m4);
            return;
        }
        C339190DRl.LIZIZ(c19m4);
    }

    public final int pq(PoiDetailTag poiDetailTag, PoiListApi.PoiDetailResponse poiDetailResponse) {
        PoiDetailTagStyle poiDetailTagStyle;
        Map<String, PoiDetailTagStyle> poiDetailTagStyleMap;
        if (poiDetailResponse != null && (poiDetailTagStyleMap = poiDetailResponse.getPoiDetailTagStyleMap()) != null) {
            poiDetailTagStyle = poiDetailTagStyleMap.get(String.valueOf(poiDetailTag.tagStyle));
        } else {
            poiDetailTagStyle = null;
        }
        Context context = getContext();
        if (context == null) {
            return 0;
        }
        C19M4 c19m4 = new C19M4(context, null, 6);
        C786410Ut5.O6(c19m4, new ViewGroup.MarginLayoutParams(-2, -2));
        c19m4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c19m4.setTuxFont(61);
        PoiTagCell.LLILLJJLI.LIZ(c19m4, new C1179160gn4(0, poiDetailTag, poiDetailTagStyle));
        return C1180060goW.LJIILJJIL(c19m4);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void zp(View view, PoiListApi.PoiDetailResponse poiDetailResponse) {
        PoiHeadAiSummary aiSummary;
        C1180760gpe c1180760gpe = (C1180760gpe) view.findViewById(R.id.qw8);
        C339190DRl.LIZIZ(c1180760gpe);
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (poiDetailResponse != null && (aiSummary = poiDetailResponse.getAiSummary()) != null) {
            String str = aiSummary.recommendationText;
            if (str != null && str.length() > 0) {
                C337180DJs.LIZJ(c1180760gpe);
                c1180760gpe.LIZ(aiSummary);
                View viewFindViewById = c1180760gpe.findViewById(R.id.qw_);
                if (viewFindViewById != null) {
                    viewFindViewById.setPaddingRelative(viewFindViewById.getPaddingStart(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingEnd(), 0);
                }
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                String str2 = aiSummary.dimensionKey;
                PageFinder pageFinderZo = Zo();
                C1184710gw1 c1184710gw1 = this.LLJL;
                c1185430gxB.getClass();
                C1185430gxB.LJI(pageFinderZo, interfaceC665370Q7zLJIIL, c1184710gw1, str2);
            } else {
                C339190DRl.LIZIZ(c1180760gpe);
            }
            if (!Intrinsics.LJFF(aiSummary.clickEnable, Boolean.FALSE)) {
                if (c1180760gpe != null) {
                    C786410Ut5.I7(new AkS2S0500000_18(this, context, c1180760gpe, poiDetailResponse, aiSummary, 0), c1180760gpe);
                    return;
                }
                return;
            } else {
                if (c1180760gpe == null) {
                    return;
                }
                C786410Ut5.ia(c1180760gpe);
                c1180760gpe.setClickable(false);
                return;
            }
        }
        C339190DRl.LIZIZ(c1180760gpe);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    public final void Vp(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str) {
        String name;
        String name2;
        String name3;
        C21415018rM c21415018rM;
        Context context;
        Integer numValueOf;
        boolean z;
        int marginStart;
        int marginEnd;
        int iIntValue;
        int i;
        int iLIZIZ;
        PoiDetailTag poiDetailTag;
        String str2;
        PoiDetailTagStyle poiDetailTagStyle;
        Integer numValueOf2;
        PoiDetailTagContent poiDetailTagContent;
        PoiDetailTag next;
        int marginStart2;
        int marginEnd2;
        int iIntValue2;
        C1184480gve c1184480gve;
        View view2;
        int marginStart3;
        int marginEnd3;
        this.LLJILJIL = false;
        int iVo = Vo(view, poiDetailResponse);
        PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJI;
        String string = null;
        if (poiDetailResponse2 != null) {
            name = poiDetailResponse2.getName();
        } else {
            name = null;
        }
        if (poiDetailResponse != null) {
            name2 = poiDetailResponse.getName();
        } else {
            name2 = null;
        }
        if ((Intrinsics.LJFF(name, name2) && Vo(view, this.LLJJI) == iVo && !iq(poiDetailResponse) && !PoiDetailHeaderAssem.Ho(poiDetailResponse)) || poiDetailResponse == null || (name3 = poiDetailResponse.getName()) == null || name3.length() == 0 || (c21415018rM = (C21415018rM) view.findViewById(R.id.r4z)) == null || (context = getContext()) == null) {
            return;
        }
        Object parent = c21415018rM.getParent();
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart3 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart3 = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd3 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            } else {
                marginEnd3 = 0;
            }
            numValueOf = Integer.valueOf(marginStart3 + marginEnd3);
        } else {
            numValueOf = null;
        }
        C1184460gvc c1184460gvcOo = Oo();
        if (c1184460gvcOo != null && (c1184480gve = c1184460gvcOo.LLILLL) != null && c1184480gve.LLJJIII) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams3 = c21415018rM.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
            } else {
                marginStart2 = 0;
            }
            ViewGroup.LayoutParams layoutParams4 = c21415018rM.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
            } else {
                marginEnd2 = 0;
            }
            int i2 = marginStart2 + marginEnd2;
            if (numValueOf != null) {
                iIntValue2 = numValueOf.intValue();
            } else {
                iIntValue2 = 0;
            }
            i = i2 + iIntValue2;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
        } else {
            ViewGroup.LayoutParams layoutParams5 = c21415018rM.getLayoutParams();
            if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart();
            } else {
                marginStart = 0;
            }
            ViewGroup.LayoutParams layoutParams6 = c21415018rM.getLayoutParams();
            if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            int i3 = marginStart + marginEnd;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            i = i3 + iIntValue;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        }
        int iLIZIZ2 = i + iLIZIZ;
        if (PoiDetailHeaderAssem.Ho(poiDetailResponse)) {
            iLIZIZ2 += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        }
        int paddingStart = view.getPaddingStart() + view.getPaddingEnd();
        if (iq(poiDetailResponse)) {
            Context context2 = getContext();
            if (context2 != null) {
                List<PoiDetailTag> poiTopTags = poiDetailResponse.getPoiTopTags();
                if (poiTopTags != null) {
                    Iterator<PoiDetailTag> it2 = poiTopTags.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.tagType == EnumC1179480gna.POI_DETAIL_TAG_TYPE_HOTEL_RATING.getValue()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    poiDetailTag = next;
                } else {
                    poiDetailTag = null;
                }
                C19M4 c19m4 = new C19M4(context2, null, 6);
                c19m4.setTuxFont(61);
                if (poiDetailTag != null && (poiDetailTagContent = poiDetailTag.tagContent) != null) {
                    str2 = poiDetailTagContent.commonText;
                } else {
                    str2 = null;
                }
                c19m4.setText(str2);
                C1179140gn2 c1179140gn2 = PoiTagCell.LLILLJJLI;
                Map<String, PoiDetailTagStyle> poiDetailTagStyleMap = poiDetailResponse.getPoiDetailTagStyleMap();
                if (poiDetailTagStyleMap != null) {
                    if (poiDetailTag != null) {
                        numValueOf2 = Integer.valueOf(poiDetailTag.tagStyle);
                    } else {
                        numValueOf2 = null;
                    }
                    poiDetailTagStyle = poiDetailTagStyleMap.get(String.valueOf(numValueOf2));
                } else {
                    poiDetailTagStyle = null;
                }
                C1179140gn2.LIZIZ(c1179140gn2, context2, c19m4, poiDetailTagStyle, null, poiDetailTag, 8);
                new FrameLayout(context2).addView(c19m4);
                c19m4.measure(View.MeasureSpec.makeMeasureSpec(C418440Gaw.LIZLLL(context2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                c19m4.layout(0, 0, c19m4.getMeasuredWidth(), c19m4.getMeasuredHeight());
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c19m4.getWidth(), c19m4.getHeight(), Bitmap.Config.ARGB_8888);
                c19m4.draw(new Canvas(bitmapCreateBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context2.getResources(), bitmapCreateBitmap);
                bitmapDrawable.setBounds(0, 0, c19m4.getWidth(), c19m4.getHeight());
                SpannableString spannableStringNo = PoiDetailHeaderAssem.No(context2, bitmapDrawable, poiDetailResponse.getName(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                int iLIZLLL = ((C418440Gaw.LIZLLL(context) - iVo) - iLIZIZ2) - paddingStart;
                Layout layoutLo = Lo(context, spannableStringNo, iLIZLLL);
                if (layoutLo.getLineCount() > 1) {
                    int lineCount = layoutLo.getLineCount() - 1;
                    if (Intrinsics.LJFF(spannableStringNo.subSequence(layoutLo.getLineStart(lineCount), layoutLo.getLineEnd(lineCount)).toString(), "[poi_image]")) {
                        this.LLJILJIL = true;
                        layoutLo = Lo(context, poiDetailResponse.getName(), iLIZLLL);
                    }
                }
                c21415018rM.setTextLayout(layoutLo);
                this.LLJJJJ.invoke(c21415018rM, poiDetailResponse.getName(), str, Boolean.FALSE);
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                if (poiDetailTag != null) {
                    string = Integer.valueOf(poiDetailTag.tagType).toString();
                }
                String strMobPicMode = poiDetailResponse.mobPicMode();
                PageFinder pageFinderZo = Zo();
                C1184710gw1 c1184710gw1 = this.LLJL;
                c1185430gxB.getClass();
                C1185430gxB.LJJJ(interfaceC665370Q7zLJIIL, false, null, string, strMobPicMode, "hotel_stars", pageFinderZo, c1184710gw1);
                return;
            }
            return;
        }
        c21415018rM.setTextLayout(Lo(context, poiDetailResponse.getName(), ((C418440Gaw.LIZLLL(context) - iVo) - iLIZIZ2) - paddingStart));
        this.LLJJJJ.invoke(c21415018rM, poiDetailResponse.getName(), str, Boolean.FALSE);
    }

    public final void tq(View view, PoiListApi.PoiDetailResponse poiDetailResponse, ViewGroup viewGroup) {
        String address;
        EnumC1184810gwB enumC1184810gwB;
        DistanceInfo distanceInfo;
        if (((Number) C280190AyX.LIZ.getValue()).intValue() != 1 || poiDetailResponse == null) {
            return;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJI;
        String name = null;
        if (poiDetailResponse2 != null) {
            address = poiDetailResponse2.getAddress();
        } else {
            address = null;
        }
        if (Intrinsics.LJFF(address, poiDetailResponse.getAddress())) {
            PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LLJJI;
            if (poiDetailResponse3 != null) {
                distanceInfo = poiDetailResponse3.getDistanceInfo();
            } else {
                distanceInfo = null;
            }
            if (Intrinsics.LJFF(distanceInfo, poiDetailResponse.getDistanceInfo())) {
                PoiListApi.PoiDetailResponse poiDetailResponse4 = this.LLJJI;
                if (poiDetailResponse4 != null) {
                    name = poiDetailResponse4.getName();
                }
                if (Intrinsics.LJFF(name, poiDetailResponse.getName())) {
                    return;
                }
            }
        }
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.qvy);
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = view.getContext();
        int i = C1184830gwD.LIZ[yq(poiDetailResponse).ordinal()];
        if (i != 1) {
            if (i == 2) {
                enumC1184810gwB = EnumC1184810gwB.BOTTOM_NEW;
            } else {
                throw new C1954807lC();
            }
        } else {
            enumC1184810gwB = EnumC1184810gwB.MIDDLE_NEW;
        }
        c1186070gyD.getClass();
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C1186070gyD.LIZIZ(context, enumC1184810gwB));
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        C1189400h3a.LIZIZ(c1331670kl3LJIIIZ, "poi_detail", "poi_detail_address_bg", C2097608Jq.LJIIJ(new Pair("poi_id", cp().LL)));
        c1331670kl3LJIIIZ.LJJI(imageView);
        c1331670kl3LJIIIZ.LJIIJJI();
        if (lq() != 1 && lq() != 2) {
            if (lq() == 4 || lq() == 3) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            }
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.r1x);
        if (textView.getVisibility() == 0) {
            textView.setMaxLines(2);
        }
    }

    public final void vq(PoiListApi.PoiDetailResponse poiDetailResponse, String str, ViewGroup viewGroup) {
        String address;
        View viewFindViewById = viewGroup.findViewById(R.id.r4n);
        View viewFindViewById2 = viewGroup.findViewById(R.id.rdx);
        viewFindViewById2.setTag(1706771800, "phone_number");
        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        if (poiDetailResponse != null) {
            address = poiDetailResponse.getAddress();
        } else {
            address = null;
        }
        if (C703302op.LIZ(address)) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            Context context = getContext();
            if (context != null) {
                int iLq = lq();
                if (iLq != 1 && iLq != 2) {
                    if (iLq == 3 || iLq == 4) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
                        viewFindViewById.setBackground(c384050F3z.LIZ(context));
                    }
                } else {
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
                    viewFindViewById.setBackground(c384050F3z2.LIZ(context));
                }
            }
            C786410Ut5.I7(new AkS6S1200000_18(this, str, poiDetailResponse, 1), viewFindViewById);
            C427690Gpr.LJI(viewFindViewById, null);
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void qq(View view, String str, PoiListApi.PoiDetailResponse poiDetailResponse, C1184480gve c1184480gve, ViewGroup viewGroup, EnumC1184800gwA enumC1184800gwA) {
        Integer numLIZJ;
        int i;
        String str2;
        String str3;
        String str4;
        C1184480gve c1184480gve2;
        C1184480gve c1184480gve3;
        int screenWidth;
        if (poiDetailResponse == null) {
            return;
        }
        String address = poiDetailResponse.getAddress();
        if (address == null) {
            C786410Ut5.LJLZ(8, viewGroup);
            return;
        }
        int i2 = 0;
        C786410Ut5.LJLZ(0, viewGroup);
        viewGroup.setTag(1706771800, "address_bar");
        TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.qw6);
        if (tuxTextView != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (Intrinsics.LJFF(poiDetailResponse.getPoiInfoSource(), "google")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(address);
                spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_color_google_map;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view.getContext());
                tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
                C419890GdH c419890GdH = new C419890GdH(tuxIconDrawableLIZ, 2);
                c419890GdH.LIZIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C444960Hcc.LIZJ(tuxTextView.getContext()));
                C786410Ut5.q2(spannableStringBuilder, c419890GdH, 0, 1, 33);
            } else {
                spannableStringBuilder.append((CharSequence) address);
            }
            tuxTextView.setText(spannableStringBuilder);
        }
        TuxTextView tuxTextView2 = (TuxTextView) viewGroup.findViewById(R.id.r1x);
        if (C290970Bap.LIZ() || C290960Bao.LIZ()) {
            tuxTextView2.setMaxLines(2);
            tuxTextView2.setMinTextSize(12.0f);
        }
        Integer numLIZJ2 = null;
        if (poiDetailResponse.getDistanceInfo() != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            DistanceInfo distanceInfo = poiDetailResponse.getDistanceInfo();
            if (distanceInfo != null) {
                str2 = distanceInfo.distanceText;
            } else {
                str2 = null;
            }
            tuxTextView2.setText(str2);
            if (enumC1184800gwA == EnumC1184800gwA.MIDDLE_BLOCK_NEW) {
                Context context = getContext();
                if (context != null) {
                    screenWidth = ScreenUtils.getScreenWidth(context) - (((((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) + PoiDetailHeaderAssem.ep(view)) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                } else {
                    screenWidth = 0;
                }
                if (C1180060goW.LJIILJJIL(tuxTextView2) > screenWidth) {
                    tuxTextView.setMaxLines(1);
                } else {
                    tuxTextView.setMaxLines(2);
                }
            } else {
                tuxTextView.setMaxLines(1);
            }
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            String str5 = cp().LL;
            String collectInfo = poiDetailResponse.getCollectInfo();
            C1184460gvc c1184460gvcOo = Oo();
            if (c1184460gvcOo != null && (c1184480gve3 = c1184460gvcOo.LLILLL) != null) {
                str3 = c1184480gve3.LLILLJJLI;
            } else {
                str3 = null;
            }
            C1184460gvc c1184460gvcOo2 = Oo();
            if (c1184460gvcOo2 != null && (c1184480gve2 = c1184460gvcOo2.LLILLL) != null) {
                str4 = c1184480gve2.LL;
            } else {
                str4 = null;
            }
            DistanceInfo distanceInfo2 = poiDetailResponse.getDistanceInfo();
            if (distanceInfo2 != null) {
                i2 = distanceInfo2.distanceType;
            }
            Integer userLocation = poiDetailResponse.getUserLocation();
            PageFinder pageFinderZo = Zo();
            C1184710gw1 c1184710gw1 = this.LLJL;
            c1185430gxB.getClass();
            C1185430gxB.LJJJLL(interfaceC665370Q7zLJIIL, str5, collectInfo, str3, str4, i2, userLocation, pageFinderZo, c1184710gw1);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
            if (enumC1184800gwA == EnumC1184800gwA.MIDDLE_BLOCK_NEW) {
                tuxTextView.setMaxLines(3);
            } else {
                tuxTextView.setMaxLines(2);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            C1308910kAL.LIZJ(R.attr.a1h, context2);
        }
        Context context3 = getContext();
        if (context3 != null) {
            C1308910kAL.LIZJ(R.attr.a1j, context3);
        }
        int i3 = C1184830gwD.LIZ[enumC1184800gwA.ordinal()];
        int i4 = 61;
        if (i3 != 1 && i3 != 2) {
            Context context4 = getContext();
            if (context4 != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context4);
            } else {
                numLIZJ = null;
            }
            Context context5 = getContext();
            if (context5 != null) {
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context5);
            }
            i = 61;
            i4 = 52;
        } else {
            Context context6 = getContext();
            if (context6 != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a1i, context6);
            } else {
                numLIZJ = null;
            }
            if (poiDetailResponse.getDistanceInfo() != null) {
                Context context7 = getContext();
                if (context7 != null) {
                    numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context7);
                }
                i = 71;
            } else {
                Context context8 = getContext();
                if (context8 != null) {
                    numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context8);
                }
                i = 61;
            }
        }
        if (tuxTextView2 != null) {
            if (numLIZJ != null) {
                tuxTextView2.setTextColor(numLIZJ.intValue());
            }
            tuxTextView2.setTuxFont(i4);
        }
        if (numLIZJ2 != null) {
            tuxTextView.setTextColor(numLIZJ2.intValue());
        }
        tuxTextView.setTuxFont(i);
        C1209070hZJ c1209070hZJ = this.LLJJJJ;
        C1367960lha.LIZ.getClass();
        c1209070hZJ.invoke(tuxTextView, C1367960lha.LIZ().LJLI(poiDetailResponse.getName(), address), str, Boolean.TRUE);
        AwS38S1400000_18 awS38S1400000_18 = new AwS38S1400000_18(this, str, poiDetailResponse, viewGroup, c1184480gve, 2);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 23), viewGroup);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 24), tuxTextView);
        C786410Ut5.I7(new AkS87S0100000_18(awS38S1400000_18, 25), tuxTextView2);
    }

    public final void wq(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str, String str2, String str3, ViewGroup viewGroup) {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        long jLongValue;
        boolean z;
        String string;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String quantityString;
        int i2;
        Object c098200Yq;
        int i3;
        String collectInfo;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTag(1706771800, "review_entrance");
        if (poiDetailResponse != null && poiDetailResponse.getPoiReviewSummaryModel() != null) {
            PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJIII;
            if (poiDetailResponse2 != null) {
                poiReviewSummaryModel = poiDetailResponse2.getPoiReviewSummaryModel();
            } else {
                poiReviewSummaryModel = null;
            }
            if (Intrinsics.LJFF(poiReviewSummaryModel, poiDetailResponse.getPoiReviewSummaryModel())) {
                PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LLJJIII;
                if (poiDetailResponse3 != null) {
                    collectInfo = poiDetailResponse3.getCollectInfo();
                } else {
                    collectInfo = null;
                }
                if (Intrinsics.LJFF(collectInfo, poiDetailResponse.getCollectInfo())) {
                    return;
                }
            }
            this.LLJJIII = poiDetailResponse;
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2 = poiDetailResponse.getPoiReviewSummaryModel();
            TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.rbi);
            C19M4 c19m4 = (C19M4) viewGroup.findViewById(R.id.rb6);
            C1203300hQ0 c1203300hQ0 = (C1203300hQ0) viewGroup.findViewById(R.id.jkc);
            if (C1184910gwL.LIZ() && poiDetailResponse.showPoiSmallPic()) {
                C1189060h32.LJJII(viewGroup, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null);
                C1184970gwR c1184970gwR = C1184910gwL.LIZIZ;
                c19m4.setMaxLines(1);
                c19m4.LJJJJI(c1184970gwR.LJFF);
                c19m4.setMinTextSize(c1184970gwR.LJI);
                c19m4.setEllipsize(TextUtils.TruncateAt.END);
            }
            Long l = poiReviewSummaryModel2.totalCount;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (!Intrinsics.LJFF(poiReviewSummaryModel2.noRating, Boolean.TRUE) && jLongValue > 0) {
                z = false;
            } else {
                z = true;
            }
            C786410Ut5.LJLZ(0, viewGroup);
            if (z) {
                this.LLJJJ = true;
                tuxTextView.setText("");
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_star_fill;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LJ = Integer.valueOf(R.attr.a02);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view.getContext());
                tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
                Context context = getContext();
                if (context != null && C426750GoL.LIZLLL(context)) {
                    tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
                } else {
                    tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                C1189060h32.LJJII(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, null);
                if (c19m4 != null) {
                    String strLJI = C20642515q3.LJI(2131844738);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJI);
                    sbLIZ.append(' ');
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                    c19m4.setTuxFont(61);
                    c19m4.setText(spannableStringBuilder);
                    if (C444960Hcc.LIZJ(c19m4.getContext())) {
                        i3 = 4;
                    } else {
                        i3 = 3;
                    }
                    c19m4.setTextDirection(i3);
                    C1189060h32.LJJII(c19m4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, null);
                    c19m4.setEndIcon(null);
                }
                try {
                    c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                C1180060goW.LIZ(c19m4, new AwS83S1300000_18((C1185410gx9) c098200Yq, this, str, poiDetailResponse, 5));
                C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                PageFinder pageFinderZo = Zo();
                C1184710gw1 c1184710gw1 = this.LLJL;
                c1191160h6Q.getClass();
                C1191160h6Q.LJJIIJ(pageFinderZo, interfaceC665370Q7zLJIIL, c1184710gw1, "poi_detail_general_header");
                viewGroup.setClickable(false);
                if (c1203300hQ0 != null) {
                    C339190DRl.LIZIZ(c1203300hQ0);
                }
            } else {
                if (!C1190820h5s.LJI(poiReviewSummaryModel2)) {
                    if (c19m4 != null) {
                        C1189060h32.LJJII(c19m4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null);
                        Resources resources = c19m4.getResources();
                        if (resources == null || (quantityString = resources.getQuantityString(2131755624, (int) jLongValue, C1843500y4a.LIZIZ(jLongValue))) == null) {
                            quantityString = "";
                        }
                        c19m4.setText(quantityString);
                        if (C444960Hcc.LIZJ(c19m4.getContext())) {
                            i2 = 4;
                        } else {
                            i2 = 3;
                        }
                        c19m4.setTextDirection(i2);
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_chevron_right_slim_thin_ltr;
                        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.5d)));
                        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
                        c19m4.setEndIcon(c419910GdJ2);
                    }
                    C1191160h6Q c1191160h6Q2 = C1191160h6Q.LIZ;
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
                    PageFinder pageFinderZo2 = Zo();
                    C1184710gw1 c1184710gw12 = this.LLJL;
                    c1191160h6Q2.getClass();
                    C1191160h6Q.LJJII(pageFinderZo2, interfaceC665370Q7zLJIIL2, c1184710gw12, "poi_detail_general_header");
                } else {
                    if (c19m4 != null) {
                        C1189060h32.LJJII(c19m4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null);
                        Resources resources2 = c19m4.getResources();
                        if (resources2 == null || (string = resources2.getString(2131846652)) == null) {
                            string = "";
                        }
                        c19m4.setText(C786410Ut5.j4(string, Arrays.copyOf(new Object[]{poiReviewSummaryModel2.brandName}, 1)));
                        if (C444960Hcc.LIZJ(c19m4.getContext())) {
                            i = 4;
                        } else {
                            i = 3;
                        }
                        c19m4.setTextDirection(i);
                        ViewGroup.LayoutParams layoutParams = c19m4.getLayoutParams();
                        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                        }
                        C419910GdJ c419910GdJ3 = new C419910GdJ();
                        c419910GdJ3.LIZ = R.raw.icon_chevron_right_slim_thin_ltr;
                        c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(7.2d)));
                        c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(14.4d)));
                        c419910GdJ3.LJ = Integer.valueOf(R.attr.a1j);
                        c19m4.setEndIcon(c419910GdJ3);
                    }
                    C1191160h6Q c1191160h6Q3 = C1191160h6Q.LIZ;
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL3 = C1558520qew.LJIIL(this);
                    PageFinder pageFinderZo3 = Zo();
                    C1184710gw1 c1184710gw13 = this.LLJL;
                    c1191160h6Q3.getClass();
                    C1191160h6Q.LJJII(pageFinderZo3, interfaceC665370Q7zLJIIL3, c1184710gw13, "poi_detail_general_header");
                }
                viewGroup.setClickable(true);
                C427690Gpr.LJI(viewGroup, null);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, view.getContext());
                if (numLIZJ != null) {
                    tuxTextView.setTextColor(numLIZJ.intValue());
                }
                tuxTextView.setTuxFont(62);
                tuxTextView.setText(String.valueOf(poiReviewSummaryModel2.score));
                Double d = poiReviewSummaryModel2.score;
                if (d != null && d.doubleValue() > 0.0d && d != null) {
                    double dDoubleValue = d.doubleValue();
                    if (c1203300hQ0 != null) {
                        c1203300hQ0.setValue((float) dDoubleValue);
                        C337180DJs.LIZJ(c1203300hQ0);
                    }
                } else if (c1203300hQ0 != null) {
                    C337180DJs.LIZJ(c1203300hQ0);
                }
            }
            C2211631BhB.LJ(viewGroup, new AwS23S1400000_18(viewGroup, str, poiDetailResponse, poiReviewSummaryModel2, this, 1));
            C786410Ut5.I7(new AkS0S3410000_18(this, z, str, poiDetailResponse, poiReviewSummaryModel2, str2, str3, viewGroup, 0), viewGroup);
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup);
    }

    public final void xq(View view, PoiListApi.PoiDetailResponse poiDetailResponse, String str, String str2, String str3, EnumC1184800gwA enumC1184800gwA) {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel3;
        long jLongValue;
        boolean z;
        String string;
        Object c098200Yq;
        TextView textView;
        TuxTextView tuxTextView;
        String string2;
        C1203300hQ0 c1203300hQ0;
        float fDoubleValue;
        TuxTextView tuxTextView2;
        TextView textView2;
        TuxTextView tuxTextView3;
        TextView textView3;
        String string3;
        String strLIZIZ;
        String string4;
        int i;
        TuxTextView tuxTextView4;
        View viewFindViewById;
        String collectInfo;
        String collectInfo2;
        if (lq() != 1 && lq() != 2) {
            if (str == null) {
                View view2 = this.LLJJJJLIIL;
                if (view2 != null) {
                    C339190DRl.LIZIZ(view2);
                    return;
                }
                return;
            }
        } else if (!op(poiDetailResponse) || str == null) {
            View view3 = this.LLJJJJLIIL;
            if (view3 != null) {
                C339190DRl.LIZIZ(view3);
                return;
            }
            return;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LLJJIII;
        if (poiDetailResponse2 != null) {
            poiReviewSummaryModel = poiDetailResponse2.getPoiReviewSummaryModel();
        } else {
            poiReviewSummaryModel = null;
        }
        if (poiDetailResponse != null) {
            poiReviewSummaryModel2 = poiDetailResponse.getPoiReviewSummaryModel();
        } else {
            poiReviewSummaryModel2 = null;
        }
        if (Intrinsics.LJFF(poiReviewSummaryModel, poiReviewSummaryModel2)) {
            PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LLJJIII;
            if (poiDetailResponse3 != null) {
                collectInfo = poiDetailResponse3.getCollectInfo();
            } else {
                collectInfo = null;
            }
            if (poiDetailResponse != null) {
                collectInfo2 = poiDetailResponse.getCollectInfo();
            } else {
                collectInfo2 = null;
            }
            if (Intrinsics.LJFF(collectInfo, collectInfo2)) {
                return;
            }
        }
        this.LLJJIII = poiDetailResponse;
        if (this.LLJJJJLIIL == null) {
            if (enumC1184800gwA == EnumC1184800gwA.MIDDLE_BLOCK_NEW && (viewFindViewById = view.findViewById(R.id.tg2)) != null) {
                this.LLJJJJLIIL = viewFindViewById;
                C1180060goW.LJIIJJI(viewFindViewById, PoiDetailHeaderAssem.ep(view));
                View view4 = this.LLJJJJLIIL;
                if (view4 != null) {
                    view4.setTag(1706771800, "review_entrance");
                }
            } else {
                return;
            }
        }
        View view5 = this.LLJJJJLIIL;
        if (view5 != null) {
            C337180DJs.LIZJ(view5);
        }
        View view6 = this.LLJJJJLIIL;
        if (view6 != null) {
            C427690Gpr.LJI(view6, null);
        }
        if (poiDetailResponse != null && (poiReviewSummaryModel3 = poiDetailResponse.getPoiReviewSummaryModel()) != null) {
            Long l = poiReviewSummaryModel3.totalCount;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (!Intrinsics.LJFF(poiReviewSummaryModel3.noRating, Boolean.TRUE) && jLongValue > 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                View view7 = this.LLJJJJLIIL;
                if (view7 != null && (tuxTextView4 = (TuxTextView) view7.findViewById(R.id.tv_review_title)) != null) {
                    if (enumC1184800gwA == EnumC1184800gwA.MIDDLE_BLOCK_NEW) {
                        tuxTextView4.setTuxFont(22);
                        tuxTextView4.setMaxLines(1);
                        tuxTextView4.LJJJJI(20.0f);
                    } else if (C14KI.LJI(tuxTextView4.getContext())) {
                        tuxTextView4.setTuxFont(82);
                    } else {
                        tuxTextView4.setTuxFont(42);
                    }
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, view.getContext());
                    if (numLIZJ != null) {
                        tuxTextView4.setTextColor(numLIZJ.intValue());
                    }
                    tuxTextView4.setText(new SpannableStringBuilder(C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{poiReviewSummaryModel3.score}, 1))));
                }
                View view8 = this.LLJJJJLIIL;
                if (view8 != null && (textView3 = (TextView) view8.findViewById(R.id.tv_review_desc)) != null) {
                    Resources resources = textView3.getResources();
                    String str4 = "";
                    if (resources == null || (string3 = resources.getString(2131846652)) == null) {
                        string3 = "";
                    }
                    if (C1190820h5s.LJI(poiReviewSummaryModel3)) {
                        strLIZIZ = C786410Ut5.j4(string3, Arrays.copyOf(new Object[]{poiReviewSummaryModel3.brandName}, 1));
                    } else {
                        Resources resources2 = textView3.getResources();
                        if (resources2 != null && (string4 = resources2.getString(2131844856, C1843500y4a.LIZIZ(jLongValue))) != null) {
                            str4 = string4;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str4);
                        sbLIZ.append(' ');
                        sbLIZ.append(C786410Ut5.j4(string3, Arrays.copyOf(new Object[]{poiReviewSummaryModel3.brandName}, 1)));
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    textView3.setText(strLIZIZ);
                    if (C444960Hcc.LIZJ(textView3.getContext())) {
                        i = 4;
                    } else {
                        i = 3;
                    }
                    textView3.setTextDirection(i);
                }
                View view9 = this.LLJJJJLIIL;
                if (view9 != null && (tuxTextView3 = (TuxTextView) view9.findViewById(R.id.tv_review_count)) != null) {
                    tuxTextView3.setTuxFont(61);
                    tuxTextView3.setTextSize(1, 13.0f);
                    tuxTextView3.setMaxLines(1);
                    tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, view.getContext());
                    if (numLIZJ2 != null) {
                        tuxTextView3.setTextColor(numLIZJ2.intValue());
                    }
                    Object[] objArr = new Object[1];
                    Object objLIZIZ = C1843500y4a.LIZIZ(jLongValue);
                    if (objLIZIZ == null) {
                        objLIZIZ = 0;
                    }
                    objArr[0] = objLIZIZ;
                    tuxTextView3.setText(C786410Ut5.j4("(%s)", Arrays.copyOf(objArr, 1)));
                }
                if (enumC1184800gwA == EnumC1184800gwA.MIDDLE_BLOCK_NEW) {
                    View view10 = this.LLJJJJLIIL;
                    if (view10 != null) {
                        tuxTextView2 = (TuxTextView) view10.findViewById(R.id.tv_review_title);
                    } else {
                        tuxTextView2 = null;
                    }
                    View view11 = this.LLJJJJLIIL;
                    if (view11 != null) {
                        textView2 = (TextView) view11.findViewById(R.id.tv_review_count);
                    } else {
                        textView2 = null;
                    }
                    if (tuxTextView2 != null && textView2 != null) {
                        textView2.setMaxWidth(Integer.MAX_VALUE);
                        int iEp = (((PoiDetailHeaderAssem.ep(view) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                        if (iEp > 0) {
                            int iLJIILJJIL = C1180060goW.LJIILJJIL(textView2);
                            tuxTextView2.LJJJJI(20.0f);
                            if (C1180060goW.LJIILJJIL(tuxTextView2) + iLJIILJJIL > iEp) {
                                tuxTextView2.LJJJJI(15.0f);
                                int iLJIILJJIL2 = C1180060goW.LJIILJJIL(tuxTextView2);
                                if (iLJIILJJIL + iLJIILJJIL2 > iEp) {
                                    int i2 = iEp - iLJIILJJIL2;
                                    if (i2 < 0) {
                                        i2 = 0;
                                    }
                                    textView2.setMaxWidth(i2);
                                }
                            }
                        }
                    }
                }
                View view12 = this.LLJJJJLIIL;
                if (view12 != null && (c1203300hQ0 = (C1203300hQ0) view12.findViewById(R.id.jkb)) != null) {
                    Double d = poiReviewSummaryModel3.score;
                    if (d != null) {
                        fDoubleValue = (float) d.doubleValue();
                    } else {
                        fDoubleValue = 0.0f;
                    }
                    c1203300hQ0.setValue(fDoubleValue);
                }
                C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                PageFinder pageFinderZo = Zo();
                C1184710gw1 c1184710gw1 = this.LLJL;
                c1191160h6Q.getClass();
                C1191160h6Q.LJJII(pageFinderZo, interfaceC665370Q7zLJIIL, c1184710gw1, "poi_detail_hotel_header");
                View view13 = this.LLJJJJLIIL;
                if (view13 != null) {
                    C786410Ut5.I7(new AkS0S3300000_18(this, str, poiDetailResponse, poiReviewSummaryModel3, str2, str3, 1), view13);
                    return;
                }
                return;
            }
            this.LLJJJ = true;
            try {
                string = null;
                try {
                    c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } catch (Throwable th2) {
                th = th2;
                string = null;
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = string;
            }
            C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
            View view14 = this.LLJJJJLIIL;
            if (view14 != null) {
                C1180060goW.LIZ(view14, new AwS83S1300000_18(c1185410gx9, this, str, poiDetailResponse, 4));
            }
            View view15 = this.LLJJJJLIIL;
            if (view15 != null && (tuxTextView = (TuxTextView) view15.findViewById(R.id.tv_review_title)) != null) {
                tuxTextView.setTuxFont(52);
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, view.getContext());
                if (numLIZJ3 != null) {
                    tuxTextView.setTextColor(numLIZJ3.intValue());
                }
                Resources resources3 = tuxTextView.getResources();
                if (resources3 != null) {
                    string2 = resources3.getString(2131844698);
                } else {
                    string2 = string;
                }
                tuxTextView.setText(string2);
            }
            View view16 = this.LLJJJJLIIL;
            if (view16 != null && (textView = (TextView) view16.findViewById(R.id.tv_review_desc)) != null) {
                Resources resources4 = textView.getResources();
                if (resources4 != null) {
                    string = resources4.getString(2131844847);
                }
                textView.setText(string);
            }
            View view17 = this.LLJJJJLIIL;
            if (view17 != null) {
                C786410Ut5.I7(new AkS3S1300000_18(this, view, str, poiDetailResponse, 1), view17);
            }
            C1191160h6Q c1191160h6Q2 = C1191160h6Q.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
            PageFinder pageFinderZo2 = Zo();
            C1184710gw1 c1184710gw12 = this.LLJL;
            c1191160h6Q2.getClass();
            C1191160h6Q.LJJIIJ(pageFinderZo2, interfaceC665370Q7zLJIIL2, c1184710gw12, "poi_detail_hotel_header");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0277  */
    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dq(android.view.View r28, java.lang.String r29, boolean r30, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem.dq(android.view.View, java.lang.String, boolean, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
