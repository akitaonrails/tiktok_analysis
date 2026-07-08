package kotlin.jvm.internal;

import X.C013C;
import X.C07GM;
import X.C07IT;
import X.C07IU;
import X.C07IV;
import X.C09AY;
import X.C0CNO;
import X.C0SMO;
import X.C0SZT;
import X.C123100dR;
import X.C1263404wy;
import X.C1360500lVY;
import X.C1388190mED;
import X.C13LN;
import X.C1558520qew;
import X.C1829607Eo;
import X.C21419418s4;
import X.C2188811AlT;
import X.C2487409ou;
import X.C259800zU;
import X.C271390AkL;
import X.C272050AlP;
import X.C301210BrL;
import X.C301280BrS;
import X.C301310BrV;
import X.C341990Dav;
import X.C418440Gaw;
import X.C426490Gnv;
import X.C426750GoL;
import X.C444200HbO;
import X.C444830HcP;
import X.C475630Ikz;
import X.C645130PSd;
import X.C668120QIo;
import X.C668360QJm;
import X.C668370QJn;
import X.C668410QJr;
import X.C674830QdV;
import X.C674850QdX;
import X.C674940Qdg;
import X.C675150Qe1;
import X.C676050QfT;
import X.C685530Qul;
import X.C685540Qum;
import X.C688690Qzr;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC431710GwL;
import X.EnumC435440H5q;
import X.EnumC644330PPb;
import X.EnumC682700QqC;
import X.InterfaceC1587906Jp;
import X.InterfaceC328600CuQ;
import X.InterfaceC659300PtY;
import X.InterfaceC685020Qtw;
import X.InterfaceC685480Qug;
import X.InterfaceC685490Quh;
import Y.ARunnableS79S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchForceInterveneCard;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.RichHisInfo;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.pages.middlepage.historytag.ui.HistoryLiveLottieDrawable;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleMarkdownAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.IMarkdownSupTagSpanClickAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.IMarkdownTextClickAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovMarkdownAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS78S1300000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS78S1300000_10 awS78S1300000_10) {
        String strLJZL;
        Top1NimbleMarkdownAssem top1NimbleMarkdownAssem;
        C688690Qzr c688690Qzr;
        int iIntValue;
        EnumC682700QqC enumC682700QqCZJ;
        Object objLIZIZ;
        Object objUv2;
        InterfaceC685020Qtw interfaceC685020Qtw;
        Integer numLJLJLJ;
        int i;
        boolean zBooleanValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind:  content=");
        String str = awS78S1300000_10.s0;
        C1263404wy c1263404wy = null;
        if (str != null) {
            strLJZL = C13LN.LJZL(10, str);
        } else {
            strLJZL = null;
        }
        sbLIZ.append(strLJZL);
        C2188811AlT.LIZIZ(sbLIZ);
        Top1NimbleMarkdownAssem top1NimbleMarkdownAssem2 = (Top1NimbleMarkdownAssem) awS78S1300000_10.l1;
        top1NimbleMarkdownAssem2.LLJZIJLIL = null;
        int iIntValue2 = 0;
        if (top1NimbleMarkdownAssem2.sp()) {
            Top1NimbleMarkdownAssem top1NimbleMarkdownAssem3 = (Top1NimbleMarkdownAssem) awS78S1300000_10.l1;
            AssemViewModel assemViewModel = (AssemViewModel) top1NimbleMarkdownAssem3.LLJLL.getValue(top1NimbleMarkdownAssem3, Top1NimbleBaseAssem.LLJLLL[0]);
            String strYp = ((Top1NimbleMarkdownAssem) awS78S1300000_10.l1).yp();
            assemViewModel.getClass();
            assemViewModel.setStateImmediate(new AwS61S1000000_10(strYp, 9));
        }
        if (Intrinsics.LJFF(((C685530Qul) awS78S1300000_10.l2).LLJJIJIIJIL, Boolean.FALSE)) {
            Top1NimbleMarkdownAssem top1NimbleMarkdownAssem4 = (Top1NimbleMarkdownAssem) awS78S1300000_10.l1;
            C688690Qzr c688690Qzr2 = top1NimbleMarkdownAssem4.LLJZ;
            if (c688690Qzr2 != null) {
                top1NimbleMarkdownAssem4.Fp(c688690Qzr2);
                IMarkdownTextClickAbility iMarkdownTextClickAbility = (IMarkdownTextClickAbility) C1558520qew.LIZ(top1NimbleMarkdownAssem4.LLIIJLIL(), ISearchPovMarkdownAbility.class, null);
                if (iMarkdownTextClickAbility != null) {
                    iMarkdownTextClickAbility.WW(c688690Qzr2);
                }
            }
        } else if (Intrinsics.LJFF(((C685530Qul) awS78S1300000_10.l2).LLJJIJIL, "new_block") && (c688690Qzr = (top1NimbleMarkdownAssem = (Top1NimbleMarkdownAssem) awS78S1300000_10.l1).LLJZ) != null) {
            top1NimbleMarkdownAssem.Fp(c688690Qzr);
        }
        C688690Qzr c688690Qzr3 = (C688690Qzr) awS78S1300000_10.l3;
        C685530Qul c685530Qul = (C685530Qul) awS78S1300000_10.l2;
        Top1NimbleMarkdownAssem top1NimbleMarkdownAssem5 = (Top1NimbleMarkdownAssem) awS78S1300000_10.l1;
        EnumC431710GwL enumC431710GwL = c685530Qul.LLILZ;
        if (enumC431710GwL != null) {
            if (((Number) C272050AlP.LIZ.getValue()).intValue() == 0) {
                c688690Qzr3.setShowMaxLines(c685530Qul.LLILLL);
            }
            c688690Qzr3.setTruncateType(enumC431710GwL);
            c688690Qzr3.setCustomShowTruncateIcon(true);
        } else {
            c688690Qzr3.setShowMaxLines(EnumC435440H5q.NO_LIMIT.getLines());
        }
        c688690Qzr3.setEnableToggleAction(false);
        c688690Qzr3.setEnableHeightTruncation(c685530Qul.LLILZIL);
        if (C1829607Eo.LIZ()) {
            ViewGroup.LayoutParams layoutParams = c688690Qzr3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                C786410Ut5.W5(c688690Qzr3, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Context context = c688690Qzr3.getContext();
        Integer num = c685530Qul.LLJILLL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 41;
        }
        C341990Dav.LIZ(c688690Qzr3, context, iIntValue, 0, (ISearchPovMarkdownAbility) top1NimbleMarkdownAssem5.LLLF.getValue(), 4);
        if (C301280BrS.LIZ()) {
            if (C07GM.LIZ()) {
                c688690Qzr3.setUseSurroundLayout(true);
            } else {
                c688690Qzr3.setUseSurroundLayout(false);
                if (C426750GoL.LJFF()) {
                    i = 4;
                } else {
                    i = 3;
                }
                c688690Qzr3.setTextDirection(i);
            }
            List<Integer> list = c685530Qul.LLJJIII;
            if (list != null) {
                Boolean bool = c685530Qul.LLJJIJI;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                c688690Qzr3.LJJL(c685530Qul.LLJJJ, list, zBooleanValue);
            }
        }
        InterfaceC685490Quh interfaceC685490Quh = (InterfaceC685490Quh) top1NimbleMarkdownAssem5.LLLF.getValue();
        if (interfaceC685490Quh != null) {
            INimbleContainerAbility iNimbleContainerAbility = (INimbleContainerAbility) top1NimbleMarkdownAssem5.LLJJLIIIJLLLLLLLZ.getValue();
            if (iNimbleContainerAbility != null) {
                objUv2 = iNimbleContainerAbility.uv2();
            } else {
                objUv2 = null;
            }
            if ((objUv2 instanceof InterfaceC685020Qtw) && (interfaceC685020Qtw = (InterfaceC685020Qtw) objUv2) != null && (numLJLJLJ = interfaceC685020Qtw.LJLJLJ()) != null) {
                iIntValue2 = numLJLJLJ.intValue();
            }
            interfaceC685490Quh.wN(c688690Qzr3, iIntValue2);
        }
        Integer num2 = ((C685530Qul) awS78S1300000_10.l2).LLJJ;
        if (num2 != null) {
            ((C688690Qzr) awS78S1300000_10.l3).setTextColor(num2.intValue());
        }
        C688690Qzr c688690Qzr4 = (C688690Qzr) awS78S1300000_10.l3;
        String str2 = awS78S1300000_10.s0;
        if (str2 == null) {
            str2 = "";
        }
        int i2 = Top1NimbleMarkdownAssem.LLLFF;
        C685530Qul c685530Qul2 = (C685530Qul) awS78S1300000_10.l2;
        boolean zZp = ((Top1NimbleMarkdownAssem) awS78S1300000_10.l1).zp();
        InterfaceC685480Qug interfaceC685480Qug = (InterfaceC685480Qug) ((Top1NimbleMarkdownAssem) awS78S1300000_10.l1).LLLF.getValue();
        if (interfaceC685480Qug != null) {
            enumC682700QqCZJ = interfaceC685480Qug.ZJ();
        } else {
            enumC682700QqCZJ = null;
        }
        C21419418s4 c21419418s4LIZ = C685540Qum.LIZ(c688690Qzr4, c685530Qul2, zZp, enumC682700QqCZJ);
        final Top1NimbleMarkdownAssem top1NimbleMarkdownAssem6 = (Top1NimbleMarkdownAssem) awS78S1300000_10.l1;
        InterfaceC328600CuQ interfaceC328600CuQ = new InterfaceC328600CuQ() { // from class: X.0Qub
            @Override // X.InterfaceC328600CuQ
            public final void LIZ(View view, InterfaceC431020GvE interfaceC431020GvE, CharSequence charSequence, CharSequence charSequence2) {
                int iIntValue3;
                String string;
                Integer numLJIIJJI;
                if (charSequence != null && (string = charSequence.toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
                    iIntValue3 = numLJIIJJI.intValue();
                } else {
                    iIntValue3 = 0;
                }
                IMarkdownSupTagSpanClickAbility iMarkdownSupTagSpanClickAbility = (IMarkdownSupTagSpanClickAbility) C1558520qew.LIZ(top1NimbleMarkdownAssem6.LLIIJLIL(), ISearchPovMarkdownAbility.class, null);
                if (iMarkdownSupTagSpanClickAbility != null) {
                    iMarkdownSupTagSpanClickAbility.lu0(iIntValue3 - 1);
                }
            }

            @Override // X.InterfaceC328600CuQ
            public final void LIZIZ(View view, InterfaceC431020GvE interfaceC431020GvE, List<? extends CharSequence> list2, Map<String, ? extends Object> map) {
                String strLJJLIIIJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("widget = ");
                sbLIZ2.append(view);
                sbLIZ2.append(", span = ");
                sbLIZ2.append(interfaceC431020GvE.getClass());
                sbLIZ2.append(", indexList = ");
                if (list2 != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(list2, null, null, null, 0, null, null, 63);
                } else {
                    strLJJLIIIJ = null;
                }
                sbLIZ2.append(strLJJLIIIJ);
                C2188811AlT.LIZIZ(sbLIZ2);
                IMarkdownSupTagSpanClickAbility iMarkdownSupTagSpanClickAbility = (IMarkdownSupTagSpanClickAbility) C1558520qew.LIZ(top1NimbleMarkdownAssem6.LLIIJLIL(), ISearchPovMarkdownAbility.class, null);
                if (iMarkdownSupTagSpanClickAbility != null) {
                    iMarkdownSupTagSpanClickAbility.yZ(list2, map);
                }
            }
        };
        if (!top1NimbleMarkdownAssem6.zp()) {
            Map<String, Object> mapUp = ((Top1NimbleMarkdownAssem) awS78S1300000_10.l1).up();
            if (mapUp != null) {
                objLIZIZ = C444200HbO.LIZIZ("cache_strategy", mapUp);
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ instanceof C1263404wy) {
                c1263404wy = (C1263404wy) objLIZIZ;
            }
        }
        c688690Qzr4.LJJLIIIIJ(str2, c21419418s4LIZ, interfaceC328600CuQ, null, null, c1263404wy, Intrinsics.LJFF(((C685530Qul) awS78S1300000_10.l2).LLJJIJIIJIL, Boolean.TRUE), !Intrinsics.LJFF(((C685530Qul) awS78S1300000_10.l2).LLJJIJIIJIL, r1), null, false);
        if (!((Top1NimbleMarkdownAssem) awS78S1300000_10.l1).sp()) {
            ((Top1NimbleMarkdownAssem) awS78S1300000_10.l1).LLJZIJLIL = ((C688690Qzr) awS78S1300000_10.l3).getMarkdownContent();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS78S1300000_10 awS78S1300000_10) {
        TypedByteArray typedByteArray;
        String str;
        String str2;
        String str3;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        C674830QdV c674830QdV = new C674830QdV();
        C674850QdX c674850QdX = (C674850QdX) awS78S1300000_10.l1;
        String str4 = c674850QdX.apiVersion;
        C676050QfT c676050QfT = c674850QdX.photoSearch;
        if (c676050QfT != null) {
            typedByteArray = c676050QfT.image;
            str = c676050QfT.imageTosUri;
            str2 = c676050QfT.detection;
            str3 = c676050QfT.detectionIdx;
        } else {
            typedByteArray = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        String str5 = c674850QdX.searchChannel;
        if (str5 == null) {
            str5 = "tiktok_mall_photo_search";
        }
        long j = ((C675150Qe1) awS78S1300000_10.l2).LIZ;
        String str6 = c674850QdX.keyword;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = c674850QdX.enterFrom;
        Integer num = c674850QdX.count;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 8;
        }
        Integer num2 = ((C674850QdX) awS78S1300000_10.l1).hotSearch;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        C674850QdX c674850QdX2 = (C674850QdX) awS78S1300000_10.l1;
        String str8 = c674850QdX2.searchId;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = c674850QdX2.lastSearchId;
        String str10 = c674850QdX2.source;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = c674850QdX2.searchSource;
        if (str11 == null) {
            str11 = "";
        }
        Integer num3 = c674850QdX2.correctType;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        C674850QdX c674850QdX3 = (C674850QdX) awS78S1300000_10.l1;
        String str12 = c674850QdX3.searchContext;
        String str13 = c674850QdX3.attachProducts;
        String str14 = c674850QdX3.trafficSourceList;
        String str15 = c674850QdX3.ecSearchSessionId;
        String str16 = c674850QdX3.searchSessionId;
        String str17 = c674850QdX3.productDetailUri;
        Integer num4 = c674850QdX3.recallShield;
        String str18 = c674850QdX3.photoSearchExtra;
        List<PhotoSearchForceInterveneCard> list = c674850QdX3.forceInterveneCard;
        Long l = c674850QdX3.endToEndSearchSessionId;
        String strLJLIL = null;
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService != null) {
            strLJLIL = iEcomSearchService.LJLIL(null, "");
        }
        C674850QdX c674850QdX4 = (C674850QdX) awS78S1300000_10.l1;
        String str19 = c674850QdX4.userRtActs;
        String str20 = c674850QdX4.passThroughParams;
        String str21 = c674850QdX4.photoProductInfo;
        C675150Qe1 c675150Qe1 = (C675150Qe1) awS78S1300000_10.l2;
        int i = c675150Qe1.LJIIIZ;
        long j2 = c675150Qe1.LIZIZ;
        return C674830QdV.LIZ(c674830QdV, awS78S1300000_10.s0, str5, j, str6, str7, iIntValue, iIntValue2, str8, str9, str10, str11, iIntValue3, str12, str13, str14, str15, str19, str4, str16, str20, c674850QdX4.enterFromSecond, strLJLIL, i, c674850QdX4.rootEnterFromType, typedByteArray, str, str2, str3, str21, c674850QdX4.ecPageFeatureParams, list, Long.valueOf(j2), str17, num4, str18, l, null, Integer.valueOf(c675150Qe1.LJIIJ), String.valueOf(((C674940Qdg) awS78S1300000_10.l3).hashCode()), null, 16);
    }

    public static final Object invoke$2(AwS78S1300000_10 awS78S1300000_10) throws Throwable {
        int iIntValue;
        int value;
        boolean z;
        Layout layoutLIZLLL;
        String str;
        if ((C301310BrV.LIZ() || C07IV.LIZ) && C668410QJr.LIZ((SearchHistory) awS78S1300000_10.l1, ((C668360QJm) awS78S1300000_10.l2).itemView)) {
            C668360QJm c668360QJm = (C668360QJm) awS78S1300000_10.l2;
            int i = c668360QJm.LL;
            Context context = c668360QJm.itemView.getContext();
            C668360QJm c668360QJm2 = (C668360QJm) awS78S1300000_10.l2;
            View view = c668360QJm2.LLIZ;
            if (view == null) {
                view = c668360QJm2.itemView;
            }
            HistoryLiveLottieDrawable historyLiveLottieDrawable = c668360QJm2.LLJJ;
            SearchHistory searchHistory = (SearchHistory) awS78S1300000_10.l1;
            String strLJLL = awS78S1300000_10.s0;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), spannableStringBuilder);
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Activity activityLIZ = C1388190mED.LIZ(view.getContext());
            sAFHelper.getClass();
            Integer numLJJIJIIJIL = SAFHelper.LJJIJIIJIL(activityLIZ, view);
            if (numLJJIJIIJIL != null) {
                iIntValue = numLJJIJIIJIL.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZ = searchHistory.LIZ(Integer.valueOf(iIntValue));
            if (numLIZ != null) {
                value = numLIZ.intValue();
            } else {
                value = EnumC644330PPb.NONE.getValue();
            }
            if (((Number) C07IT.LIZ.getValue()).intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            HistoryLiveLottieDrawable historyLiveLottieDrawable2 = null;
            if (z && value == EnumC644330PPb.LIVE.getValue()) {
                if (historyLiveLottieDrawable instanceof Drawable) {
                    historyLiveLottieDrawable2 = historyLiveLottieDrawable;
                }
                C668370QJn.LIZ(spannableStringBuilder, historyLiveLottieDrawable2, view.getContext());
                C0CNO.LIZLLL(0L, new AwS554S0100000_10(historyLiveLottieDrawable, 1239));
            } else {
                C668370QJn.LIZIZ(spannableStringBuilder, C668370QJn.LJI(value), context);
            }
            if (C07IU.LIZ()) {
                RichHisInfo richHisInfo = searchHistory.LIZJ.get(Integer.valueOf(iIntValue));
                if (richHisInfo != null && C668120QIo.LIZ(searchHistory.keyword) && (str = richHisInfo.subTitle) != null && C123100dR.LIZ(str)) {
                    if (!C07IU.LIZIZ && C668410QJr.LIZIZ(Integer.valueOf(value))) {
                        C668370QJn.LIZJ(context, spannableStringBuilder, "·");
                        C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), spannableStringBuilder);
                    }
                    C668370QJn.LIZJ(context, spannableStringBuilder, str);
                }
            }
            if (((Boolean) C271390AkL.LIZ.getValue()).booleanValue()) {
                Layout layoutLIZLLL2 = C668370QJn.LIZLLL(context, C668370QJn.LJFF(spannableStringBuilder, strLJLL, false), i);
                int ellipsisCount = layoutLIZLLL2.getEllipsisCount(0);
                int lineEnd = layoutLIZLLL2.getLineEnd(0) - ellipsisCount;
                C1360500lVY c1360500lVYLJFF = C668370QJn.LJFF(spannableStringBuilder, strLJLL, false);
                if (ellipsisCount == 0) {
                    layoutLIZLLL = C668370QJn.LIZLLL(context, C668370QJn.LJ(spannableStringBuilder, strLJLL, false), i);
                } else {
                    if (spannableStringBuilder.length() + 1 <= lineEnd) {
                        strLJLL = c1360500lVYLJFF.subSequence(spannableStringBuilder.length() + 1, lineEnd).toString();
                    }
                    while (C668370QJn.LIZLLL(context, C668370QJn.LJFF(spannableStringBuilder, strLJLL, true), i).getEllipsisCount(0) > 0 && strLJLL.length() > 0) {
                        strLJLL = C13LN.LJLL(1, strLJLL);
                    }
                    layoutLIZLLL = C668370QJn.LIZLLL(context, C668370QJn.LJ(spannableStringBuilder, strLJLL, true), i);
                }
            } else {
                layoutLIZLLL = C668370QJn.LIZLLL(context, C668370QJn.LJ(spannableStringBuilder, strLJLL, false), i);
                int ellipsisCount2 = layoutLIZLLL.getEllipsisCount(0);
                if (ellipsisCount2 != 0) {
                    String strLJLL2 = C13LN.LJLL(ellipsisCount2, strLJLL);
                    while (true) {
                        layoutLIZLLL = C668370QJn.LIZLLL(context, C668370QJn.LJ(spannableStringBuilder, strLJLL2, true), i);
                        if (layoutLIZLLL.getEllipsisCount(0) <= 0 || strLJLL2.length() <= 0) {
                            break;
                        }
                        strLJLL2 = C13LN.LJLL(1, strLJLL2);
                    }
                }
            }
        } else {
            C444830HcP c444830HcP = new C444830HcP();
            c444830HcP.LIZIZ.LJ = ((C668360QJm) awS78S1300000_10.l2).LL;
            c444830HcP.LIZLLL = true;
            c444830HcP.LJIILIIL((SpannableString) awS78S1300000_10.l3);
            c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
            c444830HcP.LJIIIZ(1);
            c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
            c444830HcP.LJIILJJIL(C475630Ikz.LIZIZ(R.attr.a1h, ((C668360QJm) awS78S1300000_10.l2).itemView.getContext()));
            c444830HcP.LJII(C301210BrL.LIZ());
            layoutLIZLLL = c444830HcP.LIZIZ();
        }
        C2487409ou.LIZJ(new ARunnableS79S0200000_10((C668360QJm) awS78S1300000_10.l2, layoutLIZLLL, 72));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS78S1300000_10 awS78S1300000_10) {
        View view = (View) awS78S1300000_10.l1;
        C645130PSd c645130PSd = (C645130PSd) awS78S1300000_10.l2;
        InterfaceC659300PtY interfaceC659300PtY = c645130PSd.LLILLL;
        ClickSearchViewModel clickSearchViewModel = c645130PSd.LLJJI;
        C0SZT<C0SMO<?, ?>, InterfaceC1587906Jp> c0szt = c645130PSd.LLJLL;
        Fragment fragment = (Fragment) awS78S1300000_10.l3;
        SearchVideoHolder searchVideoHolder = new SearchVideoHolder(view, "", interfaceC659300PtY, clickSearchViewModel, c0szt, fragment, awS78S1300000_10.s0, new AwS554S0100000_10(fragment, 1082));
        searchVideoHolder.A5(((C645130PSd) awS78S1300000_10.l2).LLILLJJLI);
        return searchVideoHolder;
    }

    public static final Object invoke$4(AwS78S1300000_10 awS78S1300000_10) {
        View view = (View) awS78S1300000_10.l1;
        C645130PSd c645130PSd = (C645130PSd) awS78S1300000_10.l2;
        InterfaceC659300PtY interfaceC659300PtY = c645130PSd.LLILLL;
        ClickSearchViewModel clickSearchViewModel = c645130PSd.LLJJI;
        C0SZT<C0SMO<?, ?>, InterfaceC1587906Jp> c0szt = c645130PSd.LLJLL;
        Fragment fragment = (Fragment) awS78S1300000_10.l3;
        SearchVideoHolder searchVideoHolder = new SearchVideoHolder(view, "", interfaceC659300PtY, clickSearchViewModel, c0szt, fragment, awS78S1300000_10.s0, new AwS554S0100000_10(fragment, 1088));
        searchVideoHolder.A5(((C645130PSd) awS78S1300000_10.l2).LLILLJJLI);
        return searchVideoHolder;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Boolean] */
    public static final Object invoke$5(AwS78S1300000_10 awS78S1300000_10) {
        ((FeedSearchBottomBarAssem) awS78S1300000_10.l1).Qp().LIZ(((FeedSearchBottomBarAssem) awS78S1300000_10.l1).LLLFFI, awS78S1300000_10.s0, true);
        ((C013C) awS78S1300000_10.l2).element = ((FeedSearchBottomBarAssem) awS78S1300000_10.l1).Vp();
        ((C259800zU) awS78S1300000_10.l3).element = Boolean.valueOf(((C013C) awS78S1300000_10.l2).element);
        return Boolean.valueOf(((C013C) awS78S1300000_10.l2).element);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S1300000_10(C674850QdX c674850QdX, C675150Qe1 c675150Qe1, C674940Qdg c674940Qdg, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c674850QdX;
        this.l2 = c675150Qe1;
        this.l3 = c674940Qdg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S1300000_10(View view, C645130PSd c645130PSd, Fragment fragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = view;
        this.l2 = c645130PSd;
        this.l3 = fragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S1300000_10(SearchHistory searchHistory, C668360QJm c668360QJm, String str, SpannableString spannableString, int i) {
        super(0);
        this.$t = i;
        this.l1 = searchHistory;
        this.l2 = c668360QJm;
        this.s0 = str;
        this.l3 = spannableString;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS78S1300000_10(FeedSearchBottomBarAssem feedSearchBottomBarAssem, FeedSearchBottomBarAssem feedSearchBottomBarAssem2, String str, C013C c013c, C259800zU<Boolean> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l1 = feedSearchBottomBarAssem;
        this.s0 = feedSearchBottomBarAssem2;
        this.l2 = str;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S1300000_10(String str, Top1NimbleMarkdownAssem top1NimbleMarkdownAssem, C685530Qul c685530Qul, C688690Qzr c688690Qzr, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = top1NimbleMarkdownAssem;
        this.l2 = c685530Qul;
        this.l3 = c688690Qzr;
    }
}
