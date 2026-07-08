package com.ss.android.ugc.aweme.poi.detail.reviews;

import X.AbstractC1189550h3p;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C0XQ7;
import X.C1174850gg7;
import X.C1175130ggZ;
import X.C1175140gga;
import X.C1175440gh4;
import X.C1182380gsG;
import X.C1184480gve;
import X.C1184850gwF;
import X.C1185410gx9;
import X.C1185610gxT;
import X.C1185620gxU;
import X.C1186690gzD;
import X.C1187180h00;
import X.C1188440h22;
import X.C1189060h32;
import X.C1189520h3m;
import X.C1189530h3n;
import X.C1190160h4o;
import X.C1191160h6Q;
import X.C1192260h8C;
import X.C1195630hDd;
import X.C1209100hZM;
import X.C123100dR;
import X.C1252710ihh;
import X.C13LE;
import X.C1440005kM;
import X.C1483370ohj;
import X.C14EU;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1548420qOe;
import X.C1548820qPI;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C1637806bA;
import X.C1871910yoP;
import X.C189200o6;
import X.C19348710mr;
import X.C19374310qz;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2255108sX;
import X.C2365509Or;
import X.C238400w2;
import X.C262100zr;
import X.C295220Bhg;
import X.C297530BlP;
import X.C305400By6;
import X.C308370C6x;
import X.C426750GoL;
import X.C452501pT;
import X.C586460MzM;
import X.C622680Oba;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1186570gz1;
import X.EnumC19356310o5;
import X.EnumC452301pR;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1184330gvP;
import X.InterfaceC1191710h7J;
import X.InterfaceC1542790qFZ;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1871920yoQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnTouchListenerC1189420h3c;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewCellVAbility;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS75S1300000_6;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailReviewsAssem extends PoiDetailBaseAssem<PoiReviewsApi.PoiReviewListResponse> implements PoiReviewCellVAbility, InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public String LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public ViewGroup LLJLIL;
    public View LLJLILLLLZIIL;
    public C1175130ggZ LLJLL;
    public boolean LLJLLIL;
    public AwS562S0100000_18 LLJLLL;
    public long LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailReviewsAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/detail/reviews/PoiDetailReviewsViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailReviewsAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailReviewsViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 550), AFwS256S0000000_18.get$arr$(424), null, true);
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1201));
        this.LLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS562S0100000_18(this, 1202));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3j;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final PageFinder Ep() {
        return (PageFinder) this.LLJZIJLIL.getValue();
    }

    public final PoiDetailReviewsViewModel Fp() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (PoiDetailReviewsViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0h3n] */
    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewCellVAbility
    public final C1189530h3n G1() {
        return new Object() { // from class: X.0h3n
        };
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final void fm1() {
        super.fm1();
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = (PoiReviewsApi.PoiReviewListResponse) C1174850gg7.LIZJ(this);
        if (poiReviewListResponse == null) {
            return;
        }
        Fp();
        Fp();
        String str = PoiDetailReviewsViewModel.wQ2(poiReviewListResponse) ? "reviews_only" : null;
        if (C305400By6.LIZ != 1) {
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            String str2 = this.LLJJL;
            String str3 = Fp().getState().LLILZIL;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            PageFinder pageFinderEp = Ep();
            c1191160h6Q.getClass();
            C1191160h6Q.LJJI(pageFinderEp, interfaceC665370Q7zLJIIL, 0, str2, str3, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("syncReviewToNative", this);
        C1548820qPI.LJIIIIZZ("closeReviewSubmitPage", this);
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewCellVAbility
    public final InterfaceC1191710h7J r0() {
        return Fp();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = (PoiReviewsApi.PoiReviewListResponse) baseComponentData;
        super.CG1(poiReviewListResponse);
        if (!C295220Bhg.LIZIZ() && !C297530BlP.LIZ() && !C297530BlP.LIZ()) {
            PoiDetailReviewsViewModel poiDetailReviewsViewModelFp = Fp();
            if (poiReviewListResponse == null) {
                poiDetailReviewsViewModelFp.withState(new AwS597S0100000_18(poiDetailReviewsViewModelFp, 833));
                return;
            } else {
                poiDetailReviewsViewModelFp.withState(new AwS384S0200000_18(poiDetailReviewsViewModelFp, poiReviewListResponse, 216));
                return;
            }
        }
        PoiDetailReviewsViewModel poiDetailReviewsViewModelFp2 = Fp();
        if (poiReviewListResponse == null) {
            poiDetailReviewsViewModelFp2.withState(new AwS597S0100000_18(poiDetailReviewsViewModelFp2, 833));
        } else {
            poiDetailReviewsViewModelFp2.setStateImmediate(new AwS597S0100000_18(poiReviewListResponse, 837));
        }
        Gp(poiReviewListResponse);
    }

    public final void Gp(PoiReviewsApi.PoiReviewListResponse poiReviewListResponse) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C786410Ut5.LJLLLLLL(0, getContentView());
        View viewFindViewById = getContentView().findViewById(R.id.thu);
        if ((viewFindViewById instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewFindViewById) != null) {
            C786410Ut5.LJJJJI(viewGroup2);
        }
        View viewFindViewById2 = getContentView().findViewById(R.id.tho);
        if ((viewFindViewById2 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById2) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        C1554960qZC.LIZ(C1558520qew.LJIIL(this), poiReviewListResponse, PoiReviewsApi.PoiReviewListResponse.class, "source_default_key");
        C1554960qZC.LIZ(C1558520qew.LJIIL(this), C1185620gxU.LIZ((C1185610gxT) mp()), C1184480gve.class, "source_default_key");
        C723850SaN.LJII(this, C13LE.LIZ(PoiReviewsWriteEntranceAssemV0.class), null);
        C723850SaN.LJII(this, C13LE.LIZ(PoiReviewReadEntranceAssem.class), null);
        Fp();
        Fp();
        boolean zWQ2 = PoiDetailReviewsViewModel.wQ2(poiReviewListResponse);
        View view = this.LLJLILLLLZIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (zWQ2) {
            C1175130ggZ c1175130ggZ = this.LLJLL;
            if (c1175130ggZ != null) {
                int visibility = c1175130ggZ.getVisibility();
                c1175130ggZ.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1175130ggZ);
            }
            C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 353));
            return;
        }
        C1175130ggZ c1175130ggZ2 = this.LLJLL;
        if (c1175130ggZ2 == null) {
            return;
        }
        int visibility2 = c1175130ggZ2.getVisibility();
        c1175130ggZ2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c1175130ggZ2);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        Boolean boolValueOf;
        AwS562S0100000_18 awS562S0100000_18;
        String strValueOf;
        Integer numValueOf;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent - name: ");
        sbLIZ.append(c262100zr.LIZ);
        sbLIZ.append(", params: ");
        sbLIZ.append(c262100zr.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean zLIZIZ = false;
        String strLJFF2 = null;
        interfaceC1871920yoQLIZ = null;
        InterfaceC1871920yoQ interfaceC1871920yoQLIZ = null;
        if (Intrinsics.LJFF(c262100zr.LIZ, "syncReviewToNative")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                String strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd, "review_id", "");
                if (strLJFF3 != null && strLJFF3.length() != 0) {
                    strValueOf = C1871910yoP.LJFF(interfaceC1107590evd, "review_id", "");
                } else {
                    strValueOf = String.valueOf(C1871910yoP.LIZJ(interfaceC1107590evd, "review_id", 0.0d));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onReceiveJsEvent - poi_id: ");
                sbLIZ2.append(C1871910yoP.LJFF(interfaceC1107590evd, "poi_id", ""));
                sbLIZ2.append(", review_id: ");
                sbLIZ2.append(strValueOf);
                sbLIZ2.append(", create_time: ");
                sbLIZ2.append(C1871910yoP.LIZLLL(interfaceC1107590evd, "create_time", 0));
                sbLIZ2.append(", rating: ");
                sbLIZ2.append(C1871910yoP.LIZLLL(interfaceC1107590evd, "rating", 0));
                sbLIZ2.append(", review_text: ");
                sbLIZ2.append(C1871910yoP.LJFF(interfaceC1107590evd, "review_text", ""));
                sbLIZ2.append(' ');
                C2188811AlT.LIZIZ(sbLIZ2);
                C1190160h4o.LIZ.getClass();
                PoiReviewsApi.PoiReviewModel poiReviewModel = C1190160h4o.LIZJ;
                if ((poiReviewModel != null && Intrinsics.LJFF(poiReviewModel.getReviewId(), C1871910yoP.LJFF(interfaceC1107590evd, "review_id", ""))) || !C123100dR.LIZ(strValueOf) || C1871910yoP.LIZLLL(interfaceC1107590evd, "create_time", 0) <= 0) {
                    return;
                }
                if (C1871910yoP.LIZLLL(interfaceC1107590evd, "rating", 0) <= 0 && !C123100dR.LIZ(C1871910yoP.LJFF(interfaceC1107590evd, "review_text", ""))) {
                    return;
                }
                String strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd, "poi_id", "");
                String strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd, "review_id", "");
                double dLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "rating", 0);
                String strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd, "review_text", "");
                long jLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "create_time", 0);
                List listLIZJ = C1190160h4o.LIZJ(C1871910yoP.LIZ(interfaceC1107590evd, "review_images", null));
                boolean zLIZIZ2 = C1871910yoP.LIZIZ(interfaceC1107590evd, "anonymous", false);
                InterfaceC1107590evd interfaceC1107590evdLJ2 = C1871910yoP.LJ(interfaceC1107590evd, "user_level_info");
                if (interfaceC1107590evdLJ2 != null) {
                    numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evdLJ2, "level", 0));
                } else {
                    numValueOf = null;
                }
                UrlModel urlModel = new UrlModel();
                InterfaceC1107590evd interfaceC1107590evdLJ3 = C1871910yoP.LJ(interfaceC1107590evd, "user_level_info");
                if (interfaceC1107590evdLJ3 != null && (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evdLJ3, "level_badge")) != null) {
                    interfaceC1871920yoQLIZ = C1871910yoP.LIZ(interfaceC1107590evdLJ, "url_list", null);
                }
                urlModel.setUrlList(C1190160h4o.LIZJ(interfaceC1871920yoQLIZ));
                PoiReviewsApi.PoiReviewModel poiReviewModelLIZ = C1190160h4o.LIZ(strLJFF4, strLJFF5, dLIZLLL, strLJFF6, jLIZLLL, listLIZJ, zLIZIZ2, new PoiReviewsApi.PoiReviewUserLevelInfoModel(numValueOf, null, urlModel, null));
                C1190160h4o.LIZJ = poiReviewModelLIZ;
                C1190160h4o.LIZIZ = poiReviewModelLIZ.getPoiId();
                C1440005kM.LIZ(new C586460MzM(C1871910yoP.LJFF(interfaceC1107590evd, "poi_id", "")));
                this.LLJLLL = new AwS562S0100000_18(this, 1198);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(c262100zr.LIZ, "closeReviewSubmitPage")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "originalPostSource", "")) == null) {
            strLJFF = "";
        }
        AbstractC1189550h3p abstractC1189550h3p = (AbstractC1189550h3p) C1189520h3m.class.newInstance();
        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
        if (interfaceC1107590evd3 != null) {
            boolValueOf = Boolean.valueOf(C1871910yoP.LIZIZ(interfaceC1107590evd3, "isSubmitReviewSuccess", false));
        } else {
            boolValueOf = null;
        }
        InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
        if (interfaceC1107590evd4 != null) {
            zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd4, "isFinalPage", false);
        }
        if (!abstractC1189550h3p.LIZIZ(strLJFF)) {
            return;
        }
        if (!zLIZIZ) {
            this.LLJLLL = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
        if (interfaceC1107590evd5 != null) {
            strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd5, "poiID", "");
        }
        C1440005kM.LIZ(new C586460MzM(strLJFF2));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1184850gwF.LIZ.getClass();
            C1184850gwF.LIZIZ(fragmentLJI);
        }
        if (!zLIZIZ || (awS562S0100000_18 = this.LLJLLL) == null) {
            return;
        }
        awS562S0100000_18.invoke();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDeleteReviewEvent(C1187180h00 c1187180h00) {
        CharSequence text;
        Resources resources;
        if (!Intrinsics.LJFF(c1187180h00.LIZ, this.LLJJL)) {
            return;
        }
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            text = resources.getText(2131844852);
        } else {
            text = null;
        }
        long j = this.LLJZ - 1;
        if (j <= 0) {
            j = 0;
        }
        this.LLJZ = j;
        C19348710mr c19348710mr = new C19348710mr(null, null, null, 15);
        c19348710mr.LIZIZ = EnumC19356310o5.COMPACT;
        CharSequence charSequenceLIZ = C19374310qz.LIZ(Long.valueOf(this.LLJZ), c19348710mr, null, 0, 28);
        if (this.LLJZ <= 0) {
            return;
        }
        if (C426750GoL.LJFF()) {
            C1175130ggZ c1175130ggZ = this.LLJLL;
            if (c1175130ggZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('(');
                sbLIZ.append((Object) charSequenceLIZ);
                sbLIZ.append(") ");
                sbLIZ.append((Object) text);
                c1175130ggZ.LIZIZ(new C1175140gga(C2188811AlT.LIZIZ(sbLIZ), null));
                return;
            }
            return;
        }
        C1175130ggZ c1175130ggZ2 = this.LLJLL;
        if (c1175130ggZ2 == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append((Object) text);
        sbLIZ2.append(" (");
        sbLIZ2.append((Object) charSequenceLIZ);
        sbLIZ2.append(')');
        c1175130ggZ2.LIZIZ(new C1175140gga(C2188811AlT.LIZIZ(sbLIZ2), null));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPoiWriteReviewSuccess(C586460MzM c586460MzM) {
        ViewGroup viewGroup;
        if (Intrinsics.LJFF(c586460MzM.LIZ, this.LLJJL) && (viewGroup = this.LLJL) != null && viewGroup.getVisibility() == 0) {
            View view = this.LLJLILLLLZIIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            ViewGroup viewGroup2 = this.LLJL;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String poiId;
        String fromGroupId;
        C1195630hDd tvViewAll;
        C1185410gx9 c1185410gx9Nf;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C1188440h22 c1188440h22;
        super.onViewCreated(view);
        String str = "";
        if (!this.LLJLLIL) {
            this.LLJLLIL = true;
            String strLJFF = C1174850gg7.LJFF(this);
            if (strLJFF == null) {
                strLJFF = "";
            }
            C1175440gh4.LIZ(this, strLJFF, null, 10);
            pH(new AwS597S0100000_18(this, 827));
        }
        C1192260h8C.LIZ(this, "poi_detail_reviews", new AwS597S0100000_18(this, 826));
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), "source_default_key", C1188440h22.class, null)) != null && (c1188440h22 = (C1188440h22) interfaceC1555100qZQLIZIZ.getSource()) != null) {
            poiId = c1188440h22.getPoiId();
        } else {
            poiId = null;
        }
        this.LLJJL = poiId;
        PoiDetailReviewsViewModel poiDetailReviewsViewModelFp = Fp();
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null && (c1185410gx9Nf = interfaceC1184330gvP.Nf()) != null) {
            fromGroupId = c1185410gx9Nf.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        poiDetailReviewsViewModelFp.LL = fromGroupId;
        this.LLJLILLLLZIIL = getContentView().findViewById(R.id.thj);
        this.LLJL = (ViewGroup) getContentView().findViewById(R.id.thu);
        this.LLJLIL = (ViewGroup) getContentView().findViewById(R.id.tho);
        C1175130ggZ c1175130ggZ = (C1175130ggZ) getContentView().findViewById(R.id.thr);
        this.LLJLL = c1175130ggZ;
        if (c1175130ggZ != null) {
            c1175130ggZ.LIZJ(0);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, PoiReviewCellVAbility.class, null, null);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI2, null);
            IPoiReviewsAbility iPoiReviewsAbility = new IPoiReviewsAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsAssem.onViewCreated.2
                @Override // com.ss.android.ugc.aweme.poi.detail.reviews.IPoiReviewsAbility
                public final void h3(Integer num) {
                    String initialPoiId;
                    String initialPoiFromGroupId;
                    String initialEnterFrom;
                    String initialEnterMethod;
                    String fromGroupId2;
                    String name;
                    String displayInfo;
                    String displayInfo2;
                    SparkContext sparkContext;
                    String strLJ = null;
                    C1185410gx9 c1185410gx9Nf2 = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ(PoiDetailReviewsAssem.this, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
                    final PoiDetailReviewsAssem poiDetailReviewsAssem = PoiDetailReviewsAssem.this;
                    if (c1185410gx9Nf2 != null) {
                        initialPoiId = c1185410gx9Nf2.getInitialPoiId();
                    } else {
                        initialPoiId = null;
                    }
                    if (initialPoiId == null) {
                        initialPoiId = "";
                    }
                    if (c1185410gx9Nf2 == null || (initialPoiFromGroupId = c1185410gx9Nf2.getInitialPoiFromGroupId()) == null) {
                        initialPoiFromGroupId = "";
                    }
                    if (c1185410gx9Nf2 == null || (initialEnterFrom = c1185410gx9Nf2.getInitialEnterFrom()) == null) {
                        initialEnterFrom = "";
                    }
                    if (c1185410gx9Nf2 == null || (initialEnterMethod = c1185410gx9Nf2.getInitialEnterMethod()) == null) {
                        initialEnterMethod = "";
                    }
                    String strLJ2 = ((C1185610gxT) PoiDetailReviewsAssem.this.mp()).LJ();
                    if (strLJ2 == null) {
                        strLJ2 = "";
                    }
                    String strLJIIJJI = ((C1185610gxT) PoiDetailReviewsAssem.this.mp()).LJIIJJI();
                    if (strLJIIJJI == null) {
                        strLJIIJJI = "";
                    }
                    if (c1185410gx9Nf2 != null) {
                        fromGroupId2 = c1185410gx9Nf2.getFromGroupId();
                    } else {
                        fromGroupId2 = null;
                    }
                    String str2 = (String) PoiDetailReviewsAssem.this.LLL.getValue();
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(PoiDetailReviewsAssem.this);
                    poiDetailReviewsAssem.getClass();
                    if (!C123100dR.LIZ(null)) {
                        strLJ = C2365509Or.LJ(C308370C6x.LIZ(null));
                    }
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    Context context = poiDetailReviewsAssem.LJJIJL().getContext();
                    SparkContext sparkContext2 = new SparkContext();
                    String strLIZIZ = TiktokPoiLynxSettings.LIZIZ("poi_review_post");
                    if (strLIZIZ == null) {
                        strLIZIZ = "";
                    }
                    sparkContext2.LJJLIIJ(strLIZIZ);
                    String str3 = poiDetailReviewsAssem.LLJJL;
                    if (str3 == null) {
                        str3 = "";
                    }
                    sparkContext2.LJJJZ("poi_id", str3);
                    PoiListApi.PoiDetailResponse poiDetailResponseLp = poiDetailReviewsAssem.lp();
                    if (poiDetailResponseLp == null || (name = poiDetailResponseLp.getName()) == null) {
                        name = "";
                    }
                    sparkContext2.LJJJZ("poi_name", Uri.encode(name));
                    sparkContext2.LJJJLZIJ(EnumC1186570gz1.POI_DETAIL_PAGE.getValue(), "post_source");
                    String str4 = poiDetailReviewsAssem.Fp().getState().LLILZIL;
                    if (str4 == null) {
                        str4 = "";
                    }
                    sparkContext2.LJJJZ("collect_info", Uri.encode(str4));
                    String str5 = poiDetailReviewsAssem.Fp().getState().LLILZ;
                    if (str5 == null) {
                        str5 = "";
                    }
                    sparkContext2.LJJJZ("review_config", Uri.encode(str5));
                    sparkContext2.LJJJZ("associated_video_id", "");
                    sparkContext2.LJJJZ("enter_method", "reviews_section");
                    sparkContext2.LJJJZ("enter_from", "poi_detail");
                    if (num != null) {
                        sparkContext2.LJJJLZIJ(num.intValue(), "review_star");
                    }
                    sparkContext2.LJJJZ("initial_poi_id", initialPoiId);
                    sparkContext2.LJJJZ("initial_poi_from_group_id", initialPoiFromGroupId);
                    sparkContext2.LJJJZ("initial_poi_enter_from", initialEnterFrom);
                    sparkContext2.LJJJZ("initial_poi_enter_method", initialEnterMethod);
                    sparkContext2.LJJJZ("poi_detail_enter_from", strLJIIJJI);
                    sparkContext2.LJJJZ("poi_detail_enter_method", strLJ2);
                    sparkContext2.LJJJZ("log_extra", strLJ);
                    PoiReviewsApi.PoiReviewListResponse poiReviewListResponseLIZ = poiDetailReviewsAssem.Fp().getState().LLJI.LIZ();
                    if (poiReviewListResponseLIZ == null || (displayInfo = poiReviewListResponseLIZ.getDisplayInfo()) == null) {
                        displayInfo = "";
                    }
                    sparkContext2.LJJJZ("poi_detail_display_info", displayInfo);
                    if (str2 == null) {
                        str2 = "";
                    }
                    sparkContext2.LJJJZ("poi_session_id", str2);
                    if (fromGroupId2 != null) {
                        sparkContext2.LJJJZ("from_group_id", fromGroupId2);
                    }
                    try {
                        Map mapLJII = C1182380gsG.LJII(interfaceC665370Q7zLJIIL);
                        if (!mapLJII.isEmpty()) {
                            C1548420qOe.LIZIZ(sparkContext2, "poi_general_track_params", C2365509Or.LJ(mapLJII));
                            sparkContext = sparkContext2;
                        } else {
                            sparkContext = null;
                        }
                        C189200o6.m2constructorimpl(sparkContext);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    sparkContext2.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0TUU
                        @Override // X.InterfaceC1163130gND
                        public final void release() {
                        }

                        @Override // X.InterfaceC1542790qFZ
                        public final C1725480v0E LJJJJI() {
                            return !C444960Hcc.LIZJ(poiDetailReviewsAssem.getContext()) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
                        }

                        @Override // X.InterfaceC1542790qFZ
                        public final C1725480v0E LJJLI() {
                            return !C444960Hcc.LIZJ(poiDetailReviewsAssem.getContext()) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
                        }
                    });
                    sparkContext2.LJJJJZI(new C1209100hZM(poiDetailReviewsAssem, 11));
                    c1537900q7g.getClass();
                    new C1541950qED(context, sparkContext2).LIZIZ();
                    C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                    String str6 = poiDetailReviewsAssem.LLJJL;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = poiDetailReviewsAssem.Fp().getState().LLILZIL;
                    PoiReviewsApi.PoiReviewListResponse poiReviewListResponseLIZ2 = poiDetailReviewsAssem.Fp().getState().LLJI.LIZ();
                    if (poiReviewListResponseLIZ2 != null) {
                        displayInfo2 = poiReviewListResponseLIZ2.getDisplayInfo();
                    } else {
                        displayInfo2 = null;
                    }
                    String str8 = initialEnterMethod;
                    String str9 = initialEnterFrom;
                    String str10 = initialPoiId;
                    C1191160h6Q.LJIJJ(c1191160h6Q, str10, str9, str8, strLJ2, strLJIIJJI, null, "poi_detail", "reviews_section", str6, str7, displayInfo2, null, null, null, fromGroupId2, C1558520qew.LJIIL(poiDetailReviewsAssem), null, poiDetailReviewsAssem.Ep(), 159744);
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.reviews.IPoiReviewsAbility
                public final void Uc2(View view2, Aweme aweme) {
                    PoiDetailReviewsAssem poiDetailReviewsAssem = PoiDetailReviewsAssem.this;
                    poiDetailReviewsAssem.getClass();
                    Fragment fragmentLJI3 = C724240Sb0.LJI(poiDetailReviewsAssem);
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
                    C786410Ut5.LJJJI("userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), bundle);
                    C786410Ut5.LJJJI("sec_userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), bundle);
                    C786410Ut5.LJJJI("enter_from", "poi_detail", bundle);
                    C786410Ut5.LJJJI("enter_method", "reviews_section", bundle);
                    C786410Ut5.LJJJI("previous_page", "poi_detail", bundle);
                    C786410Ut5.LJJJI("poi_fullscreen", "1", bundle);
                    C786410Ut5.LJJJI("page_poi_id", poiDetailReviewsAssem.LLJJL, bundle);
                    C786410Ut5.LJJJI("video_from", "poi_detail_write_review", bundle);
                    bundle.putBoolean("hide_poi_anchor", true);
                    bundle.putInt("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme));
                    bundle.putInt("is_from_video", 1);
                    bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
                    C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(view2, view2.getWidth(), view2.getHeight());
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragmentLJI3, "//aweme/detail");
                    smartRouteBuildRoute.withParam(bundle);
                    smartRouteBuildRoute.withBundleAnimation(c1606420ruCLIZ.LJFF());
                    smartRouteBuildRoute.withParam("activity_has_activity_options", true);
                    smartRouteBuildRoute.open();
                    C1483370ohj.LIZ(aweme);
                }
            };
            AwS75S1300000_6 awS75S1300000_6 = new AwS75S1300000_6(this, interfaceC665370Q7zLJFF, iPoiReviewsAbility, null, 6);
            if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                awS75S1300000_6.invoke();
            } else {
                C1189060h32.LJIJ(new ARunnableS106S0100000_6((Object) awS75S1300000_6, 93));
            }
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiReviewsAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiReviewsAbility, IPoiReviewsAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iPoiReviewsAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iPoiReviewsAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiReviewsAbility.class.getClassLoader(), new Class[]{IPoiReviewsAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiReviewsAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.reviews.IPoiReviewsAbility");
                    }
                }
            }
        }
        C1175130ggZ c1175130ggZ2 = this.LLJLL;
        if (c1175130ggZ2 != null) {
            PageFinder pageFinderEp = Ep();
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1200);
            View view2 = c1175130ggZ2.LLILLJJLI;
            C238400w2 c238400w2 = new C238400w2();
            if (view2 != null) {
                view2.setOnTouchListener(new ViewOnTouchListenerC1189420h3c(c238400w2, "review_top_view_all", pageFinderEp, awS562S0100000_18));
            }
        }
        C1175130ggZ c1175130ggZ3 = this.LLJLL;
        if (c1175130ggZ3 != null) {
            String strLJFF2 = C1174850gg7.LJFF(this);
            if (strLJFF2 != null) {
                str = strLJFF2;
            }
            C1175130ggZ.LIZ(c1175130ggZ3, str);
        }
        C1175130ggZ c1175130ggZ4 = this.LLJLL;
        if (c1175130ggZ4 != null) {
            c1175130ggZ4.setStandardDebounceOnClickListener(new ACListenerS153S0100000_18(this, 61));
        }
        C1175130ggZ c1175130ggZ5 = this.LLJLL;
        if (c1175130ggZ5 != null && (tvViewAll = c1175130ggZ5.getTvViewAll()) != null) {
            C2211631BhB.LJ(tvViewAll, new AwS384S0200000_18(this, tvViewAll, 106));
        }
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0h3d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1189620h3w) obj).LLILZLL;
            }
        }, null, new AwS632S0100000_18(this, 123), 6);
        Fp().asyncSubscribe(new C2217381BqS() { // from class: X.0h3e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1189620h3w) obj).LLJI;
            }
        }, this, C736820SvI.LIZJ(), new AwS597S0100000_18(this, 355), new AwS562S0100000_18(this, 1199), new AwS597S0100000_18(this, 354));
        C622680Oba.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onWriteReviewEvent(C1186690gzD c1186690gzD) {
        CharSequence text;
        Resources resources;
        if (!Intrinsics.LJFF(c1186690gzD.LIZ, this.LLJJL)) {
            return;
        }
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            text = resources.getText(2131844852);
        } else {
            text = null;
        }
        this.LLJZ++;
        C19348710mr c19348710mr = new C19348710mr(null, null, null, 15);
        c19348710mr.LIZIZ = EnumC19356310o5.COMPACT;
        CharSequence charSequenceLIZ = C19374310qz.LIZ(Long.valueOf(this.LLJZ), c19348710mr, null, 0, 28);
        if (this.LLJZ <= 0) {
            return;
        }
        if (C426750GoL.LJFF()) {
            C1175130ggZ c1175130ggZ = this.LLJLL;
            if (c1175130ggZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('(');
                sbLIZ.append((Object) charSequenceLIZ);
                sbLIZ.append(") ");
                sbLIZ.append((Object) text);
                c1175130ggZ.LIZIZ(new C1175140gga(C2188811AlT.LIZIZ(sbLIZ), null));
                return;
            }
            return;
        }
        C1175130ggZ c1175130ggZ2 = this.LLJLL;
        if (c1175130ggZ2 == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append((Object) text);
        sbLIZ2.append(" (");
        sbLIZ2.append((Object) charSequenceLIZ);
        sbLIZ2.append(')');
        c1175130ggZ2.LIZIZ(new C1175140gga(C2188811AlT.LIZIZ(sbLIZ2), null));
    }
}
