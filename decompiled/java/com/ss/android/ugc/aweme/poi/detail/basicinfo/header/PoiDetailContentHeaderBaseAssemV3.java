package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C019F;
import X.C01GW;
import X.C062W;
import X.C0C64;
import X.C1174860gg8;
import X.C1175120ggY;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1184550gvl;
import X.C1186970gzf;
import X.C1189060h32;
import X.C1190820h5s;
import X.C1191160h6Q;
import X.C1192290h8F;
import X.C123100dR;
import X.C1308910kAL;
import X.C1367960lha;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1843500y4a;
import X.C19719912Dl;
import X.C20642515q3;
import X.C21415018rM;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427690Gpr;
import X.C444830HcP;
import X.C444840HcQ;
import X.C444960Hcc;
import X.C452501pT;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1184730gw3;
import X.EnumC1190240h4w;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS121S0200000_18;
import Y.ATListenerS451S0100000_18;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiSlashContextAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingProviderInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel;
import com.ss.android.ugc.aweme.poi.map.LocationDetailMobParam;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.model.PoiReviewsMobParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PoiDetailContentHeaderBaseAssemV3 extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public View LLIZLLLIL;
    public ViewGroup LLJ;
    public C21415018rM LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C1559260qg8 LLJILJIL;
    public final String LLJILJILJ;
    public final C01GW LLJILLL;
    public final AwS667S0100000_18 LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailContentHeaderBaseAssemV3.class, "poiCollectStatusViewModel", "getPoiCollectStatusViewModel()Lcom/ss/android/ugc/aweme/poi/collect/PoiCollectStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailContentHeaderBaseAssemV3() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCollectStatusViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 535), AFwS256S0000000_18.get$arr$(346), null, true);
        this.LLJILJIL = new C1559260qg8(new C723580SZw(this, C1184460gvc.class, "PoiDetailContentHeaderHierarchyDataV3"), checkSupervisorPrepared());
        this.LLJILJILJ = "poi_detail";
        this.LLJILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 996));
        this.LLJJ = new AwS667S0100000_18(this, 12);
    }

    public abstract void ap(View view);

    public final C1184460gvc Jo() {
        return (C1184460gvc) this.LLJILJIL.getValue();
    }

    public final View Lo() {
        View view = this.LLIZLLLIL;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final void bp() {
        C1184480gve c1184480gve;
        TuxIconView tuxIconView;
        C1184460gvc c1184460gvcJo = Jo();
        if (c1184460gvcJo == null || (c1184480gve = c1184460gvcJo.LLILLL) == null || !c1184480gve.LLJJIII) {
            return;
        }
        if (this.LLIZLLLIL != null && (tuxIconView = (TuxIconView) Lo().findViewById(R.id.jzi)) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C1189060h32.LJJIIJ(tuxIconView, new AwS597S0100000_18(this, 1068));
        }
        C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 1070));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean No(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r5) {
        /*
            X.0C64 r0 = X.C0C64.LJIILLIIL()
            r4 = 31744(0x7c00, float:4.4483E-41)
            r3 = 0
            java.lang.String r1 = "poi_detail_takeout"
            int r0 = r0.LJIJ(r4, r3, r1, r3)
            r2 = 1
            if (r0 == r2) goto L45
            X.0C64 r0 = X.C0C64.LJIILLIIL()
            int r1 = r0.LJIJ(r4, r3, r1, r3)
            r0 = 2
            if (r1 == r0) goto L45
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo r0 = r5.getBookingInfo()
            r2 = 0
            if (r0 == 0) goto L42
            java.util.List<com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingProviderInfo> r0 = r0.providers
            if (r0 == 0) goto L42
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingProviderInfo r1 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingProviderInfo) r1
            if (r1 == 0) goto L43
            java.lang.String r0 = r1.url
        L30:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L41
            if (r1 == 0) goto L3a
            java.lang.String r2 = r1.title
        L3a:
            boolean r0 = X.C123100dR.LIZ(r2)
            if (r0 == 0) goto L41
        L40:
            r3 = 1
        L41:
            return r3
        L42:
            r1 = r2
        L43:
            r0 = r2
            goto L30
        L45:
            java.util.List r0 = r5.getPoiShopBookingInfoList()
            if (r0 == 0) goto L41
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r0)
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo r0 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo) r0
            if (r0 == 0) goto L41
            boolean r0 = r0.isValid()
            if (r0 != r2) goto L41
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3.No(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):boolean");
    }

    public final void Go(SpannableStringBuilder spannableStringBuilder) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, Lo().getContext()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
    }

    public final void Zo(PoiListApi.PoiDetailResponse poiDetailResponse) {
        int i;
        ViewGroup viewGroup = (ViewGroup) Lo().findViewById(R.id.r28);
        FatherPoiModel fatherPoi = poiDetailResponse.getFatherPoi();
        if (fatherPoi != null && C123100dR.LIZ(fatherPoi.keyword)) {
            C786410Ut5.LJLZ(0, viewGroup);
            TextView textView = (TextView) Lo().findViewById(R.id.r27);
            textView.setText(new SpannableStringBuilder(fatherPoi.keyword));
            if (C444960Hcc.LIZJ(textView.getContext())) {
                i = 4;
            } else {
                i = 3;
            }
            textView.setTextDirection(i);
            C786410Ut5.T7(textView, new ACListenerS121S0200000_18(fatherPoi, this, 15));
            textView.setOnTouchListener(new ATListenerS451S0100000_18(this, 7));
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean zLJFF;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        ViewGroup viewGroup = (ViewGroup) view;
        this.LLIZLLLIL = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e03, viewGroup, true);
        this.LLJ = (ViewGroup) viewGroup.findViewById(R.id.r52);
        this.LLJI = (C21415018rM) viewGroup.findViewById(R.id.r4z);
        C1184460gvc c1184460gvcJo = Jo();
        if (c1184460gvcJo != null && (poiDetailResponse = c1184460gvcJo.LLILLJJLI) != null) {
            zLJFF = Intrinsics.LJFF(poiDetailResponse.getDataFromAnchor(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        String strLIZIZ = C1174860gg8.LIZIZ(this);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        C1192290h8F.LIZ(this, strLIZIZ, "poi_head_info", zLJFF, null, null, 24);
        C1192290h8F.LIZJ(this, new AwS105S0110000_18(zLJFF, this, 10));
        ap(view);
    }

    public static void hp(MotionEvent motionEvent, View view) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                C786410Ut5.T4(view, 1.0f);
                return;
            } else {
                C786410Ut5.T4(view, 1.0f);
                return;
            }
        }
        C786410Ut5.T4(view, 0.2f);
    }

    public final void So(String str, PoiListApi.PoiDetailResponse poiDetailResponse) {
        boolean z;
        PoiBookingProviderInfo poiBookingProviderInfo;
        String string;
        String str2;
        String str3;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        List<PoiBookingProviderInfo> list;
        PoiBookingProviderInfo poiBookingProviderInfo2;
        Integer num;
        List<PoiBookingProviderInfo> list2;
        List<PoiShopBookingInfo> poiShopBookingInfoList;
        PoiShopBookingInfo poiShopBookingInfo;
        PoiShopBookingInfo poiShopBookingInfo2;
        PoiShopBookingInfo poiShopBookingInfo3;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_detail_takeout", false) != 1 && C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_detail_takeout", false) != 2) {
            z = false;
        } else {
            z = true;
        }
        String str4 = null;
        if (z) {
            List<PoiShopBookingInfo> poiShopBookingInfoList2 = poiDetailResponse.getPoiShopBookingInfoList();
            if (poiShopBookingInfoList2 != null && !poiShopBookingInfoList2.isEmpty() && (poiShopBookingInfoList = poiDetailResponse.getPoiShopBookingInfoList()) != null) {
                int size = poiShopBookingInfoList.size();
                if (size == 1) {
                    List<PoiShopBookingInfo> poiShopBookingInfoList3 = poiDetailResponse.getPoiShopBookingInfoList();
                    if (poiShopBookingInfoList3 != null && (poiShopBookingInfo3 = (PoiShopBookingInfo) ListProtector.get(poiShopBookingInfoList3, 0)) != null && poiShopBookingInfo3.isValid()) {
                        Ho(poiShopBookingInfo3, str, poiDetailResponse, true);
                        return;
                    }
                    return;
                }
                if (size < 2) {
                    return;
                }
                List<PoiShopBookingInfo> poiShopBookingInfoList4 = poiDetailResponse.getPoiShopBookingInfoList();
                if (poiShopBookingInfoList4 != null && (poiShopBookingInfo2 = (PoiShopBookingInfo) ListProtector.get(poiShopBookingInfoList4, 0)) != null && poiShopBookingInfo2.isValid()) {
                    Ho(poiShopBookingInfo2, str, poiDetailResponse, true);
                }
                List<PoiShopBookingInfo> poiShopBookingInfoList5 = poiDetailResponse.getPoiShopBookingInfoList();
                if (poiShopBookingInfoList5 == null || (poiShopBookingInfo = (PoiShopBookingInfo) ListProtector.get(poiShopBookingInfoList5, 1)) == null || !poiShopBookingInfo.isValid()) {
                    return;
                }
                Ho(poiShopBookingInfo, str, poiDetailResponse, false);
                return;
            }
            return;
        }
        if (!No(poiDetailResponse)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) Lo().findViewById(R.id.r2d);
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        PoiBookingInfo bookingInfo = poiDetailResponse.getBookingInfo();
        if (bookingInfo != null && (list2 = bookingInfo.providers) != null) {
            poiBookingProviderInfo = (PoiBookingProviderInfo) C13LP.LJJJLL(list2);
        } else {
            poiBookingProviderInfo = null;
        }
        if (poiBookingProviderInfo != null && (num = poiBookingProviderInfo.provider) != null) {
            string = num.toString();
        } else {
            string = null;
        }
        String cityCode = poiDetailResponse.getCityCode();
        String regionCode = poiDetailResponse.getRegionCode();
        String typeLevel = poiDetailResponse.getTypeLevel();
        String collectInfo = poiDetailResponse.getCollectInfo();
        PoiBookingInfo bookingInfo2 = poiDetailResponse.getBookingInfo();
        if (bookingInfo2 != null && (list = bookingInfo2.providers) != null && (poiBookingProviderInfo2 = (PoiBookingProviderInfo) C13LP.LJJJLL(list)) != null) {
            str2 = poiBookingProviderInfo2.track_info;
        } else {
            str2 = null;
        }
        C1184460gvc c1184460gvcJo = Jo();
        if (c1184460gvcJo != null && (c1184480gve2 = c1184460gvcJo.LLILLL) != null) {
            str3 = c1184480gve2.LLILLJJLI;
        } else {
            str3 = null;
        }
        C1184460gvc c1184460gvcJo2 = Jo();
        if (c1184460gvcJo2 != null && (c1184480gve = c1184460gvcJo2.LLILLL) != null) {
            str4 = c1184480gve.LL;
        }
        C723850SaN.LIZLLL(this, new AwS211S0300000_2(this, poiDetailResponse, new C1186970gzf(string, str, cityCode, regionCode, typeLevel, collectInfo, str2, str3, str4, null), 32));
    }

    public final void cp(String str, PoiListApi.PoiDetailResponse poiDetailResponse) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZLLL;
        int marginEnd;
        View view;
        String name = poiDetailResponse.getName();
        if (name != null && name.length() != 0) {
            C21415018rM c21415018rM = this.LLJI;
            ViewGroup.LayoutParams layoutParams = null;
            if (c21415018rM == null) {
                c21415018rM = null;
            }
            Context context = getContext();
            if (context != null) {
                Object parent = c21415018rM.getParent();
                if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                    layoutParams = view.getLayoutParams();
                }
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    C1184460gvc c1184460gvcJo = Jo();
                    if (c1184460gvcJo != null && c1184460gvcJo.LLILZ) {
                        iLIZLLL = (C418440Gaw.LIZLLL(context) - marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd();
                        marginEnd = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(92));
                    } else {
                        iLIZLLL = C418440Gaw.LIZLLL(context) - marginLayoutParams.getMarginStart();
                        marginEnd = marginLayoutParams.getMarginEnd();
                    }
                    C444830HcP c444830HcP = new C444830HcP();
                    c444830HcP.LJIILIIL(poiDetailResponse.getName());
                    c444830HcP.LIZIZ.LJ = iLIZLLL - marginEnd;
                    c444830HcP.LJIIIZ(2);
                    TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
                    c444840HcQ.LJIIIZ = textDirectionHeuristic;
                    c444840HcQ.LJII = TextUtils.TruncateAt.END;
                    c444830HcP.LJII(13);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                    if (numLIZJ != null) {
                        c444830HcP.LJIILJJIL(numLIZJ.intValue());
                    }
                    c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.0f, false, C1697810uHb.LJIIJJI(new Pair(32, 32), new Pair(28, 30)), 27));
                    this.LLJJ.invoke(c21415018rM, poiDetailResponse.getName(), str);
                }
            }
        }
    }

    public final void Oo(final String str, PoiListApi.PoiDetailResponse poiDetailResponse, final C1184480gve c1184480gve) {
        int i;
        ViewGroup viewGroup = (ViewGroup) Lo().findViewById(R.id.qvz);
        String address = poiDetailResponse.getAddress();
        if (address != null) {
            C786410Ut5.LJLZ(0, viewGroup);
            TextView textView = (TextView) Lo().findViewById(R.id.qvw);
            textView.setText(address);
            if (C444960Hcc.LIZJ(textView.getContext())) {
                i = 4;
            } else {
                i = 3;
            }
            textView.setTextDirection(i);
            TuxTextView tuxTextView = (TuxTextView) Lo().findViewById(R.id.qvw);
            AwS667S0100000_18 awS667S0100000_18 = this.LLJJ;
            C1367960lha.LIZ.getClass();
            awS667S0100000_18.invoke(tuxTextView, C1367960lha.LIZ().LJLI(poiDetailResponse.getName(), address), str);
            C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0gvW
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1185410gx9 c1185410gx9Nf;
                    C1188440h22 c1188440h22;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    Map<String, String> map;
                    Boolean bool;
                    String anchorInteractMethod;
                    String initialEnterFrom;
                    C1184480gve c1184480gve2;
                    PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = this.LL;
                    String str7 = str;
                    AssemVMLazy assemVMLazy = poiDetailContentHeaderBaseAssemV3.LLJIJIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiDetailContentHeaderBaseAssemV3.LLJJI;
                    boolean z = ((C1155540gAy) assemVMLazy.getValue().getState()).LL;
                    C1184480gve c1184480gve3 = c1184480gve;
                    String str8 = null;
                    String strLIZ = C18JG.LIZ("c74061.d38819", PageFinder.via(view), null);
                    Context context = poiDetailContentHeaderBaseAssemV3.getContext();
                    if (context != null) {
                        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(poiDetailContentHeaderBaseAssemV3, C13LE.LIZ(InterfaceC1184330gvP.class), null);
                        if (interfaceC1184330gvP != null) {
                            c1185410gx9Nf = interfaceC1184330gvP.Nf();
                        } else {
                            c1185410gx9Nf = null;
                        }
                        if (c1184480gve3 != null) {
                            c1188440h22 = c1184480gve3.LLILZLL;
                            str2 = c1184480gve3.LL;
                            str3 = c1184480gve3.LLILLJJLI;
                            str4 = c1184480gve3.LLIZLLLIL;
                            str8 = c1184480gve3.LLJ;
                            str5 = c1184480gve3.LLJI;
                            str6 = c1184480gve3.LLJIJIL;
                            map = c1184480gve3.LLJILJILJ;
                        } else {
                            c1188440h22 = null;
                            str2 = null;
                            str3 = null;
                            str4 = null;
                            str5 = null;
                            str6 = null;
                            map = null;
                        }
                        C1184460gvc c1184460gvcJo = poiDetailContentHeaderBaseAssemV3.Jo();
                        if (c1184460gvcJo != null && (c1184480gve2 = c1184460gvcJo.LLILLL) != null) {
                            bool = c1184480gve2.LLJILLL;
                        } else {
                            bool = null;
                        }
                        if (c1185410gx9Nf != null) {
                            anchorInteractMethod = c1185410gx9Nf.getAnchorInteractMethod();
                            initialEnterFrom = c1185410gx9Nf.getInitialEnterFrom();
                        } else {
                            anchorInteractMethod = null;
                            initialEnterFrom = null;
                        }
                        C1188530h2B c1188530h2BJN = null;
                        C1188440h22 c1188440h222 = c1188440h22;
                        LocationDetailMobParam locationDetailMobParam = new LocationDetailMobParam(c1188440h222, "click_address", str2, str3, str4, str8, str5, str6, map, bool, anchorInteractMethod, initialEnterFrom);
                        InterfaceC1184330gvP interfaceC1184330gvP2 = (InterfaceC1184330gvP) C1252710ihh.LJI(poiDetailContentHeaderBaseAssemV3, C13LE.LIZ(InterfaceC1184330gvP.class), null);
                        if (interfaceC1184330gvP2 != null) {
                            c1188530h2BJN = interfaceC1184330gvP2.jN(false, null, null, null);
                        }
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//poi/map");
                        smartRouteBuildRoute.withParam("poi_id", str7);
                        smartRouteBuildRoute.withParam("enter_from", poiDetailContentHeaderBaseAssemV3.LLJILJILJ);
                        smartRouteBuildRoute.withParam("is_collected", z);
                        smartRouteBuildRoute.withParam("mob_param", locationDetailMobParam);
                        smartRouteBuildRoute.withParam("poi_collect_mob_data", c1188530h2BJN);
                        smartRouteBuildRoute.withParam("source_btm_token", strLIZ);
                        smartRouteBuildRoute.open();
                    }
                }
            });
            tuxTextView.setOnTouchListener(new ATListenerS451S0100000_18(this, 6));
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup);
    }

    public final void Ho(PoiShopBookingInfo poiShopBookingInfo, String str, PoiListApi.PoiDetailResponse poiDetailResponse, boolean z) {
        int i;
        String string;
        String str2;
        String str3;
        String str4;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        List<PoiBookingProviderInfo> list;
        PoiBookingProviderInfo poiBookingProviderInfo;
        if (z) {
            i = R.id.r2d;
        } else {
            i = R.id.r2e;
        }
        View viewFindViewById = Lo().findViewById(i);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        Integer num = poiShopBookingInfo.provider;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        String cityCode = poiDetailResponse.getCityCode();
        String regionCode = poiDetailResponse.getRegionCode();
        String typeLevel = poiDetailResponse.getTypeLevel();
        String collectInfo = poiDetailResponse.getCollectInfo();
        PoiBookingInfo bookingInfo = poiDetailResponse.getBookingInfo();
        if (bookingInfo != null && (list = bookingInfo.providers) != null && (poiBookingProviderInfo = (PoiBookingProviderInfo) C13LP.LJJJLL(list)) != null) {
            str2 = poiBookingProviderInfo.track_info;
        } else {
            str2 = null;
        }
        C1184460gvc c1184460gvcJo = Jo();
        if (c1184460gvcJo != null && (c1184480gve2 = c1184460gvcJo.LLILLL) != null) {
            str3 = c1184480gve2.LLILLJJLI;
        } else {
            str3 = null;
        }
        C1184460gvc c1184460gvcJo2 = Jo();
        if (c1184460gvcJo2 != null && (c1184480gve = c1184460gvcJo2.LLILLL) != null) {
            str4 = c1184480gve.LL;
        } else {
            str4 = null;
        }
        C723850SaN.LIZLLL(this, new C062W(this, poiShopBookingInfo, new C1186970gzf(string, str, cityCode, regionCode, typeLevel, collectInfo, str2, str3, str4, null), z, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[PHI: r8 r33
      0x005f: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String) binds: [B:34:0x00be, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r33v3 java.lang.String) = (r33v0 java.lang.String), (r33v4 java.lang.String) binds: [B:34:0x00be, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[PHI: r8 r33
      0x00c1: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:34:0x00be, B:25:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r33v1 java.lang.String) = (r33v0 java.lang.String), (r33v3 java.lang.String) binds: [B:34:0x00be, B:25:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca A[PHI: r18
      0x00ca: PHI (r18v1 java.lang.String) = (r18v0 java.lang.String), (r18v5 java.lang.String) binds: [B:38:0x00c6, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0 A[PHI: r18 r19
      0x00d0: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v4 java.lang.String) binds: [B:41:0x00cc, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r19v1 java.lang.String) = (r19v0 java.lang.String), (r19v3 java.lang.String) binds: [B:41:0x00cc, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vo(java.lang.String r41, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r42, android.content.Context r43, X.C1184480gve r44) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3.Vo(java.lang.String, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, android.content.Context, X.0gve):void");
    }

    public final void dp(final PoiListApi.PoiDetailResponse poiDetailResponse, final String str, final String str2, final String str3) {
        long jLongValue;
        long jLongValue2;
        String strJ4;
        long jLongValue3;
        String string;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String strLIZIZ;
        int i2;
        String string2;
        String string3;
        int i3;
        String str4;
        float fDoubleValue;
        int value;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        Long l;
        final ViewGroup viewGroup = (ViewGroup) Lo().findViewById(R.id.rb4);
        if (viewGroup != null) {
            final PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = poiDetailResponse.getPoiReviewSummaryModel();
            if (poiReviewSummaryModel == null) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) viewGroup.findViewById(R.id.rbi);
            TextView textView = (TextView) viewGroup.findViewById(R.id.rb6);
            Long l2 = poiReviewSummaryModel.totalCount;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            if (C1184550gvl.LIZ() && ((l = poiReviewSummaryModel.totalCount) == null || l.longValue() <= 0)) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            int iLongValue = 0;
            C786410Ut5.LJLZ(0, viewGroup);
            Long l3 = poiReviewSummaryModel.totalCount;
            if (l3 != null) {
                jLongValue2 = l3.longValue();
            } else {
                jLongValue2 = 0;
            }
            String str5 = "";
            if (jLongValue2 <= 0) {
                strJ4 = "";
            } else {
                strJ4 = C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{poiReviewSummaryModel.score}, 1));
            }
            appCompatTextView.setText(strJ4);
            Long l4 = poiReviewSummaryModel.totalCount;
            if (l4 != null) {
                jLongValue3 = l4.longValue();
            } else {
                jLongValue3 = 0;
            }
            if (jLongValue3 <= 0) {
                if (textView != null) {
                    String strLJI = C20642515q3.LJI(2131844738);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJI);
                    sbLIZ.append(' ');
                    textView.setText(new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ)));
                    if (C444960Hcc.LIZJ(textView.getContext())) {
                        i4 = 4;
                    } else {
                        i4 = 3;
                    }
                    textView.setTextDirection(i4);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    }
                }
            } else if (!C1190820h5s.LJI(poiReviewSummaryModel)) {
                if (textView != null) {
                    Resources resources = textView.getResources();
                    if (resources == null || (strLIZIZ = resources.getQuantityString(2131755624, (int) jLongValue, C1843500y4a.LIZIZ(jLongValue))) == null) {
                        strLIZIZ = "";
                    }
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_review_enrich_review", false) != 0) {
                        Resources resources2 = textView.getResources();
                        if (resources2 == null || (string2 = resources2.getString(2131846652)) == null) {
                            string2 = "";
                        }
                        Object[] objArr = new Object[1];
                        Resources resources3 = textView.getResources();
                        if (resources3 == null || (string3 = resources3.getString(2131846653)) == null) {
                            string3 = "";
                        }
                        objArr[0] = string3;
                        String strJ42 = C786410Ut5.j4(string2, Arrays.copyOf(objArr, 1));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strJ42);
                        sbLIZ2.append(' ');
                        sbLIZ2.append(strLIZIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append(' ');
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ3));
                    Go(spannableStringBuilder);
                    textView.setText(spannableStringBuilder);
                    if (C444960Hcc.LIZJ(textView.getContext())) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                    textView.setTextDirection(i2);
                }
            } else if (textView != null) {
                Resources resources4 = textView.getResources();
                if (resources4 == null || (string = resources4.getString(2131846652)) == null) {
                    string = "";
                }
                String strJ43 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{poiReviewSummaryModel.brandName}, 1));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strJ43);
                sbLIZ4.append(' ');
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ4));
                Go(spannableStringBuilder2);
                textView.setText(spannableStringBuilder2);
                if (C444960Hcc.LIZJ(textView.getContext())) {
                    i = 4;
                } else {
                    i = 3;
                }
                textView.setTextDirection(i);
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                }
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_star_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            Long l5 = poiReviewSummaryModel.totalCount;
            if (l5 != null && l5.longValue() > 0) {
                i3 = R.attr.ny;
            } else {
                i3 = R.attr.a02;
            }
            c419910GdJ.LJ = Integer.valueOf(i3);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(Lo().getContext());
            tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
            appCompatTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            String collectInfo = poiDetailResponse.getCollectInfo();
            if (collectInfo != null) {
                str5 = collectInfo;
            }
            Double d = poiReviewSummaryModel.score;
            if (d != null) {
                fDoubleValue = (float) d.doubleValue();
            } else {
                fDoubleValue = 0.0f;
            }
            Long l6 = poiReviewSummaryModel.totalCount;
            if (l6 != null) {
                iLongValue = (int) l6.longValue();
            }
            Integer num = poiReviewSummaryModel.source;
            if (num != null) {
                value = num.intValue();
            } else {
                value = EnumC1190240h4w.PoiReviewSource_Unknown.getValue();
            }
            Integer numValueOf = Integer.valueOf(value);
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            PageFinder pageFinder = (PageFinder) this.LLJILLL.getValue();
            c1191160h6Q.getClass();
            C1191160h6Q.LJJIJL(str4, str5, fDoubleValue, iLongValue, numValueOf, interfaceC665370Q7zLJIIL, pageFinder, null);
            if (C1184550gvl.LIZ() || C1175120ggY.LIZLLL(poiReviewSummaryModel.totalCount) > 0) {
                C427690Gpr.LJI(viewGroup, null);
            }
            C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0gvn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1185410gx9 c1185410gx9Nf;
                    String initialEnterFrom;
                    String initialEnterMethod;
                    String collectInfo2;
                    float fDoubleValue2;
                    int iLongValue2;
                    int value2;
                    Boolean bool;
                    String fromGroupId;
                    String initialEnterFrom2;
                    String initialEnterMethod2;
                    String initialPoiFromGroupId;
                    String str6;
                    C1184480gve c1184480gve;
                    String initialPoiId;
                    C1184480gve c1184480gve2;
                    if (!C1184550gvl.LIZ() && C1175120ggY.LIZLLL(poiReviewSummaryModel.totalCount) <= 0) {
                        return;
                    }
                    String initialPoiId2 = null;
                    InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
                    if (interfaceC1184330gvP != null) {
                        c1185410gx9Nf = interfaceC1184330gvP.Nf();
                    } else {
                        c1185410gx9Nf = null;
                    }
                    C1191160h6Q c1191160h6Q2 = C1191160h6Q.LIZ;
                    if (c1185410gx9Nf != null) {
                        initialPoiId2 = c1185410gx9Nf.getInitialPoiId();
                    }
                    String str7 = "";
                    if (initialPoiId2 == null) {
                        initialPoiId2 = "";
                    }
                    if (c1185410gx9Nf == null || (initialEnterFrom = c1185410gx9Nf.getInitialEnterFrom()) == null) {
                        initialEnterFrom = "";
                    }
                    if (c1185410gx9Nf == null || (initialEnterMethod = c1185410gx9Nf.getInitialEnterMethod()) == null) {
                        initialEnterMethod = "";
                    }
                    String str8 = str2;
                    if (str8 == null) {
                        str8 = "";
                    }
                    String str9 = str3;
                    if (str9 == null) {
                        str9 = "";
                    }
                    String str10 = str;
                    if (str10 == null) {
                        str10 = "";
                    }
                    PoiListApi.PoiDetailResponse poiDetailResponse2 = poiDetailResponse;
                    if (poiDetailResponse2 == null || (collectInfo2 = poiDetailResponse2.getCollectInfo()) == null) {
                        collectInfo2 = "";
                    }
                    Double d2 = poiReviewSummaryModel.score;
                    if (d2 != null) {
                        fDoubleValue2 = (float) d2.doubleValue();
                    } else {
                        fDoubleValue2 = 0.0f;
                    }
                    Long l7 = poiReviewSummaryModel.totalCount;
                    if (l7 != null) {
                        iLongValue2 = (int) l7.longValue();
                    } else {
                        iLongValue2 = 0;
                    }
                    Integer num2 = poiReviewSummaryModel.source;
                    if (num2 != null) {
                        value2 = num2.intValue();
                    } else {
                        value2 = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
                    }
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
                    PageFinder pageFinder2 = (PageFinder) this.LLJILLL.getValue();
                    c1191160h6Q2.getClass();
                    C1191160h6Q.LJIIL(initialPoiId2, initialEnterFrom, initialEnterMethod, str9, str8, "click_reviews_summary", str10, collectInfo2, fDoubleValue2, iLongValue2, value2, interfaceC665370Q7zLJIIL2, pageFinder2);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.getContext(), "//poi/review_list");
                    smartRouteBuildRoute.withParam("poi_id", str);
                    smartRouteBuildRoute.withParam("enter_from", "poi_detail");
                    smartRouteBuildRoute.withParam("enter_method", "click_reviews_summary");
                    C1184460gvc c1184460gvcJo = this.Jo();
                    if (c1184460gvcJo != null && (c1184480gve2 = c1184460gvcJo.LLILLL) != null) {
                        bool = c1184480gve2.LLJILLL;
                    } else {
                        bool = null;
                    }
                    smartRouteBuildRoute.withParam("poi_detail_in_sheet_mode", bool);
                    if (c1185410gx9Nf == null || (fromGroupId = c1185410gx9Nf.getFromGroupId()) == null) {
                        fromGroupId = "";
                    }
                    smartRouteBuildRoute.withParam("from_group_id", fromGroupId);
                    if (c1185410gx9Nf == null || (initialEnterFrom2 = c1185410gx9Nf.getInitialEnterFrom()) == null) {
                        initialEnterFrom2 = "";
                    }
                    smartRouteBuildRoute.withParam("initial_poi_enter_from", initialEnterFrom2);
                    if (c1185410gx9Nf == null || (initialEnterMethod2 = c1185410gx9Nf.getInitialEnterMethod()) == null) {
                        initialEnterMethod2 = "";
                    }
                    smartRouteBuildRoute.withParam("initial_poi_enter_method", initialEnterMethod2);
                    if (c1185410gx9Nf == null || (initialPoiFromGroupId = c1185410gx9Nf.getInitialPoiFromGroupId()) == null) {
                        initialPoiFromGroupId = "";
                    }
                    smartRouteBuildRoute.withParam("initial_poi_from_group_id", initialPoiFromGroupId);
                    if (c1185410gx9Nf != null && (initialPoiId = c1185410gx9Nf.getInitialPoiId()) != null) {
                        str7 = initialPoiId;
                    }
                    smartRouteBuildRoute.withParam("initial_poi_id", str7);
                    smartRouteBuildRoute.withParam("poi_detail_enter_from", str2);
                    smartRouteBuildRoute.withParam("poi_detail_enter_method", str3);
                    C1184460gvc c1184460gvcJo2 = this.Jo();
                    if (c1184460gvcJo2 != null && (c1184480gve = c1184460gvcJo2.LLILLL) != null) {
                        str6 = c1184480gve.LLIZLLLIL;
                    } else {
                        str6 = null;
                    }
                    smartRouteBuildRoute.withParam("poi_reviews_mob_params", new PoiReviewsMobParams(str6));
                    smartRouteBuildRoute.withParam("source_btm_token", C18JG.LIZ("c74061.d0477", PageFinder.via((View) viewGroup), null));
                    PoiCommonMobParams poiCommonMobParamsLJ = C1182380gsG.LJ(C1558520qew.LJIIL(this));
                    if (poiCommonMobParamsLJ != null) {
                        smartRouteBuildRoute.withParam("poi_common_mob_params", poiCommonMobParamsLJ);
                    }
                    smartRouteBuildRoute.open();
                }
            });
        }
    }

    public final void ep(final String str, final boolean z, final PoiListApi.PoiDetailResponse poiDetailResponse, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        Context context;
        Resources resources;
        String string;
        Resources resources2;
        String string2;
        String str8;
        int i;
        ViewGroup viewGroup = (ViewGroup) Lo().findViewById(R.id.r3i);
        int i2 = 0;
        C786410Ut5.LJLZ(0, viewGroup);
        String poiThirdPartyKeyInfo = poiDetailResponse.getPoiThirdPartyKeyInfo();
        if (poiThirdPartyKeyInfo == null || !C123100dR.LIZ(poiThirdPartyKeyInfo)) {
            ArrayList arrayList = new ArrayList();
            String averagePrice = poiDetailResponse.getAveragePrice();
            if (averagePrice != null && C123100dR.LIZ(averagePrice) && !Intrinsics.LJFF(poiDetailResponse.poiTypeName(), EnumC1184730gw3.INDEPENDENT.getTypeName())) {
                arrayList.add(averagePrice);
            }
            String categoryName = poiDetailResponse.getCategoryName();
            if (categoryName != null && C123100dR.LIZ(categoryName)) {
                arrayList.add(categoryName);
            }
            StoreInfoModel storeInfo = poiDetailResponse.getStoreInfo();
            if (storeInfo != null && (str8 = storeInfo.openingHoursForPoiDetail) != null && C123100dR.LIZ(str8)) {
                arrayList.add(str8);
            }
            StringBuilder sb = new StringBuilder();
            if (arrayList.size() == 0) {
                Context context2 = getContext();
                if (context2 != null && (resources2 = context2.getResources()) != null && (string2 = resources2.getString(2131844803)) != null) {
                    sb.append(string2);
                }
            } else {
                if (arrayList.size() == 1 && (context = getContext()) != null && (resources = context.getResources()) != null && (string = resources.getString(2131844802)) != null) {
                    arrayList.add(string);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int i3 = i2 + 1;
                    sb.append((String) it2.next());
                    if (i2 != arrayList.size() - 1) {
                        sb.append(" · ");
                    }
                    i2 = i3;
                }
            }
            poiThirdPartyKeyInfo = sb.toString();
        }
        final TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.r3h);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(poiThirdPartyKeyInfo);
        sbLIZ.append(' ');
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        Go(spannableStringBuilder);
        tuxTextView.setText(spannableStringBuilder);
        if (C444960Hcc.LIZJ(tuxTextView.getContext())) {
            i = 4;
        } else {
            i = 3;
        }
        tuxTextView.setTextDirection(i);
        C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0gvV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strLJ;
                C1185410gx9 c1185410gx9Nf;
                String groupId;
                Object obj;
                boolean zLJFF;
                PoiCurrentSessionInfo poiCurrentSessionInfoA50;
                C1184480gve c1184480gve;
                C1184480gve c1184480gve2;
                C1185490gxH c1185490gxH;
                Map<String, Object> extraParam;
                C1184480gve c1184480gve3;
                C1185490gxH c1185490gxH2;
                PoiCurrentSessionInfo poiCurrentSessionInfoA502;
                String str9 = null;
                IPoiSlashContextAbility iPoiSlashContextAbility = (IPoiSlashContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(tuxTextView, null), IPoiSlashContextAbility.class, null);
                if (iPoiSlashContextAbility == null || (poiCurrentSessionInfoA502 = iPoiSlashContextAbility.a50()) == null || (strLJ = C2365509Or.LJ(poiCurrentSessionInfoA502)) == null) {
                    strLJ = "";
                }
                C1186070gyD c1186070gyD = C1186070gyD.LIZ;
                Context context3 = tuxTextView.getContext();
                String str10 = str;
                boolean z2 = z;
                PoiListApi.PoiDetailResponse poiDetailResponse2 = poiDetailResponse;
                String str11 = str2;
                String str12 = str3;
                String str13 = str4;
                String str14 = str5;
                String str15 = str6;
                String str16 = str7;
                String strLIZ = C18JG.LIZ("c74061.d2545", PageFinder.via(view), null);
                InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
                if (interfaceC1184330gvP != null) {
                    c1185410gx9Nf = interfaceC1184330gvP.Nf();
                } else {
                    c1185410gx9Nf = null;
                }
                PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = this;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiDetailContentHeaderBaseAssemV3.LLJJI;
                C1184460gvc c1184460gvcJo = poiDetailContentHeaderBaseAssemV3.Jo();
                if (c1184460gvcJo != null && (c1184480gve3 = c1184460gvcJo.LLILLL) != null && (c1185490gxH2 = c1184480gve3.LLIZ) != null) {
                    groupId = c1185490gxH2.getGroupId();
                } else {
                    groupId = null;
                }
                C1184460gvc c1184460gvcJo2 = this.Jo();
                if (c1184460gvcJo2 != null && (c1184480gve2 = c1184460gvcJo2.LLILLL) != null && (c1185490gxH = c1184480gve2.LLIZ) != null && (extraParam = c1185490gxH.getExtraParam()) != null) {
                    obj = extraParam.get("aweme_type");
                } else {
                    obj = null;
                }
                C1184460gvc c1184460gvcJo3 = this.Jo();
                if (c1184460gvcJo3 != null && (c1184480gve = c1184460gvcJo3.LLILLL) != null) {
                    zLJFF = Intrinsics.LJFF(c1184480gve.LLJILLL, Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                if (iPoiSlashContextAbility != null && (poiCurrentSessionInfoA50 = iPoiSlashContextAbility.a50()) != null) {
                    str9 = poiCurrentSessionInfoA50.poiSessionId;
                }
                C1186070gyD.LIZJ(c1186070gyD, context3, view, str10, z2, poiDetailResponse2, str11, str12, str13, str14, str15, str16, strLIZ, c1185410gx9Nf, groupId, obj, zLJFF, strLJ, null, str9, null, null, null, 3801088);
            }
        });
        tuxTextView.setOnTouchListener(new ATListenerS451S0100000_18(this, 8));
    }
}
