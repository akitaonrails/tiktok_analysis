package com.ss.android.ugc.aweme.poi.detail.reviews.v2;

import X.AbstractC1186480gys;
import X.AbstractC1189550h3p;
import X.C01GW;
import X.C03IJ;
import X.C07ZP;
import X.C09AY;
import X.C0C64;
import X.C1173300gdc;
import X.C1173980gei;
import X.C1174850gg7;
import X.C1175440gh4;
import X.C1180170goh;
import X.C1181120gqE;
import X.C1181930grX;
import X.C1184480gve;
import X.C1184850gwF;
import X.C1185600gxS;
import X.C1185610gxT;
import X.C1185620gxU;
import X.C1186450gyp;
import X.C1186690gzD;
import X.C1186840gzS;
import X.C1188440h22;
import X.C1189060h32;
import X.C1189470h3h;
import X.C1189480h3i;
import X.C1189520h3m;
import X.C1190160h4o;
import X.C1192260h8C;
import X.C1227904rF;
import X.C123100dR;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1548820qPI;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1871910yoP;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2255108sX;
import X.C262100zr;
import X.C289330BVr;
import X.C295220Bhg;
import X.C297530BlP;
import X.C298370Bml;
import X.C452501pT;
import X.C586460MzM;
import X.C622680Oba;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C991130btn;
import X.EnumC452301pR;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1180270gor;
import X.InterfaceC1181010gq3;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1871920yoQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailWriteReviewViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.SlashParam;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS102S1200000_18;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS75S1300000_6;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailWriteReviewAssemV2 extends PoiDetailBaseAssem<PoiReviewsApi.PoiWriteReviewResponse> implements InterfaceC1180270gor, InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJJL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS562S0100000_18(this, 1212));
    public String LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public C09AY LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public boolean LLJLL;
    public C1189480h3i LLJLLIL;
    public boolean LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailWriteReviewAssemV2.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/detail/reviews/PoiDetailWriteReviewViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailWriteReviewAssemV2() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailWriteReviewViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 554), AFwS256S0000000_18.get$arr$(430), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3r;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final PoiDetailWriteReviewViewModel Fp() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (PoiDetailWriteReviewViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1186840gzS c1186840gzSLw1;
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        C1548820qPI.LJIIIIZZ("syncReviewToNative", this);
        C1548820qPI.LJIIIIZZ("closeReviewSubmitPage", this);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        if (interfaceC665370Q7zLJIIL != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJIIL, IPoiWriteReviewsAbility.class, null);
        }
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 == null || (c1186840gzSLw1 = interfaceC1181010gq3BK2.lw1()) == null) {
            return;
        }
        c1186840gzSLw1.LIZJ("PoiLocationEvent", this);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final void fm1() {
        super.fm1();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        String collectInfo;
        PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse = (PoiReviewsApi.PoiWriteReviewResponse) baseComponentData;
        super.CG1(poiWriteReviewResponse);
        PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        if (poiDetailResponseLp != null) {
            collectInfo = poiDetailResponseLp.getCollectInfo();
        } else {
            collectInfo = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        if (interfaceC665370Q7zLJIIL != null) {
            C1554960qZC.LIZ(interfaceC665370Q7zLJIIL, new C07ZP(collectInfo, 2), C07ZP.class, "source_default_key");
        }
        if (!C295220Bhg.LIZIZ() && !C297530BlP.LIZ() && !C297530BlP.LIZ()) {
            PoiDetailWriteReviewViewModel poiDetailWriteReviewViewModelFp = Fp();
            if (poiWriteReviewResponse != null) {
                poiDetailWriteReviewViewModelFp.withState(new AwS102S1200000_18(poiDetailWriteReviewViewModelFp, poiWriteReviewResponse, collectInfo, 12));
            }
        } else {
            PoiDetailWriteReviewViewModel poiDetailWriteReviewViewModelFp2 = Fp();
            if (poiWriteReviewResponse != null) {
                poiDetailWriteReviewViewModelFp2.setStateImmediate(new AwS132S1100000_18(poiWriteReviewResponse, collectInfo, 16));
            }
        }
        Boolean needEvent = poiWriteReviewResponse.getNeedEvent();
        if (needEvent != null) {
            boolean zBooleanValue = needEvent.booleanValue();
            this.LLJLLL = zBooleanValue;
            Ep(this.LLJLLIL, Boolean.valueOf(zBooleanValue));
        }
        if (C295220Bhg.LIZIZ() || C297530BlP.LIZ() || C297530BlP.LIZ()) {
            Gp(poiWriteReviewResponse);
        }
    }

    public final void Gp(PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse) {
        ViewGroup viewGroup;
        C786410Ut5.LJLLLLLL(0, getContentView());
        View viewFindViewById = getContentView().findViewById(R.id.thu);
        if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        C1554960qZC.LIZ(C1558520qew.LJIIL(this), poiWriteReviewResponse, PoiReviewsApi.PoiWriteReviewResponse.class, "source_default_key");
        C1554960qZC.LIZ(C1558520qew.LJIIL(this), C1185620gxU.LIZ((C1185610gxT) mp()), C1184480gve.class, "source_default_key");
        C723850SaN.LJII(this, C13LE.LIZ(PoiReviewWriteEntranceWithAvatarSingleAssemV2.class), null);
        Fp();
        if (PoiDetailWriteReviewViewModel.vQ2(poiWriteReviewResponse, this.LLJJLIIIJLLLLLLLZ)) {
            C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 360));
        } else {
            Bp(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        Boolean boolValueOf;
        ?? r0;
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
                C1190160h4o c1190160h4o = C1190160h4o.LIZ;
                c1190160h4o.getClass();
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
                PoiReviewsApi.PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel = new PoiReviewsApi.PoiReviewUserLevelInfoModel(numValueOf, null, urlModel, null);
                c1190160h4o.getClass();
                PoiReviewsApi.PoiReviewModel poiReviewModelLIZ = C1190160h4o.LIZ(strLJFF4, strLJFF5, dLIZLLL, strLJFF6, jLIZLLL, listLIZJ, false, poiReviewUserLevelInfoModel);
                C1190160h4o.LIZJ = poiReviewModelLIZ;
                C1190160h4o.LIZIZ = poiReviewModelLIZ.getPoiId();
                C1440005kM.LIZ(new C1186690gzD(poiReviewModelLIZ, this.LLJJLIIIJLLLLLLLZ));
                C1440005kM.LIZ(new C586460MzM(C1871910yoP.LJFF(interfaceC1107590evd, "poi_id", "")));
                this.LLJLIL = new AwS562S0100000_18(this, 1209);
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
            this.LLJLIL = null;
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
        if (!zLIZIZ || (r0 = this.LLJLIL) == 0) {
            return;
        }
        r0.invoke();
    }

    @Override // X.InterfaceC1180270gor
    public void onEvent(AbstractC1186480gys abstractC1186480gys) {
        C1186450gyp c1186450gyp;
        C1189480h3i c1189480h3i;
        if ((abstractC1186480gys instanceof C1186450gyp) && (c1186450gyp = (C1186450gyp) abstractC1186480gys) != null && (c1189480h3i = c1186450gyp.LL) != null) {
            this.LLJLLIL = c1189480h3i;
            Ep(c1189480h3i, Boolean.valueOf(this.LLJLLL));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPoiWriteReviewSuccess(C586460MzM c586460MzM) {
        ViewGroup viewGroup;
        if (Intrinsics.LJFF(c586460MzM.LIZ, this.LLJJLIIIJLLLLLLLZ) && (viewGroup = this.LLJLILLLLZIIL) != null && viewGroup.getVisibility() == 0) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_common_write_review_entrance", true) == 2 && C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_detail_page_review_opt", false) <= 2) {
                this.LLJLLL = true;
                Ep(this.LLJLLIL, Boolean.TRUE);
            } else {
                Bp(false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReviewsSubmitPageClosed(C991130btn c991130btn) {
        ?? r0;
        String str = c991130btn.LIZIZ;
        AbstractC1189550h3p abstractC1189550h3p = (AbstractC1189550h3p) C1189520h3m.class.newInstance();
        boolean z = c991130btn.LIZJ;
        boolean z2 = c991130btn.LIZLLL;
        if (!abstractC1189550h3p.LIZIZ(String.valueOf(str))) {
            return;
        }
        this.LLJLIL = new AwS562S0100000_18(this, 1210);
        if (!z2) {
            this.LLJLIL = null;
        }
        if (z) {
            C1440005kM.LIZ(new C586460MzM(c991130btn.LIZ));
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                C1184850gwF.LIZ.getClass();
                C1184850gwF.LIZIZ(fragmentLJI);
            }
            if (z2 && (r0 = this.LLJLIL) != 0) {
                r0.invoke();
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String poiId;
        C1186840gzS c1186840gzSLw1;
        C1173300gdc c1173300gdcQr0;
        C1185600gxS c1185600gxS;
        C1189480h3i c1189480h3i;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C1188440h22 c1188440h22;
        super.onViewCreated(view);
        Bp(false);
        if (!this.LLJLL) {
            this.LLJLL = true;
            C1175440gh4.LIZ(this, "poi_write_review_entrance", null, 10);
            pH(new AwS597S0100000_18(this, 865));
        }
        C1192260h8C.LIZ(this, "poi_detail_reviews", new AwS597S0100000_18(this, 864));
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), "source_default_key", C1188440h22.class, null)) != null && (c1188440h22 = (C1188440h22) interfaceC1555100qZQLIZIZ.getSource()) != null) {
            poiId = c1188440h22.getPoiId();
        } else {
            poiId = null;
        }
        this.LLJJLIIIJLLLLLLLZ = poiId;
        this.LLJLILLLLZIIL = (ViewGroup) getContentView().findViewById(R.id.thu);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        IPoiWriteReviewsAbility iPoiWriteReviewsAbility = new IPoiWriteReviewsAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.reviews.v2.PoiDetailWriteReviewAssemV2.onViewCreated.1
            @Override // com.ss.android.ugc.aweme.poi.detail.reviews.v2.IPoiWriteReviewsAbility
            public final boolean Yv() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.poi.detail.reviews.v2.IPoiWriteReviewsAbility
            public final void Qo() {
                PoiDetailWriteReviewAssemV2.this.Bp(true);
            }

            @Override // com.ss.android.ugc.aweme.poi.detail.reviews.v2.IPoiWriteReviewsAbility
            public final void Zb() {
                if (C298370Bml.LIZ()) {
                    PoiDetailWriteReviewAssemV2 poiDetailWriteReviewAssemV2 = PoiDetailWriteReviewAssemV2.this;
                    int i = PoiDetailBaseAssem.LLJJJJLIIL;
                    poiDetailWriteReviewAssemV2.Ap(true);
                }
                PoiDetailWriteReviewAssemV2.this.Bp(true);
            }

            /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
            @Override // com.ss.android.ugc.aweme.poi.detail.reviews.v2.IPoiWriteReviewsAbility
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void h3(java.lang.Integer r31) {
                /*
                    Method dump skipped, instruction units count: 645
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.reviews.v2.PoiDetailWriteReviewAssemV2.AnonymousClass1.h3(java.lang.Integer):void");
            }
        };
        AwS75S1300000_6 awS75S1300000_6 = new AwS75S1300000_6(this, interfaceC665370Q7zLJIIL, iPoiWriteReviewsAbility, null, 8);
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            awS75S1300000_6.invoke();
        } else {
            C1189060h32.LJIJ(new ARunnableS106S0100000_6((Object) awS75S1300000_6, 95));
        }
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IPoiWriteReviewsAbility.class, null);
        if (interfaceC494301wDLIZ == null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIIL, iPoiWriteReviewsAbility, IPoiWriteReviewsAbility.class, null, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiWriteReviewsAbility);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiWriteReviewsAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiWriteReviewsAbility.class.getClassLoader(), new Class[]{IPoiWriteReviewsAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJIIL, (InterfaceC494301wD) objNewProxyInstance, IPoiWriteReviewsAbility.class, null, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.reviews.v2.IPoiWriteReviewsAbility");
                }
            }
        }
        Fp().asyncSubscribe(new C2217381BqS() { // from class: X.0h3g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1189410h3b) obj).LLILZ;
            }
        }, this, C736820SvI.LIZJ(), new AwS597S0100000_18(this, 361), new AwS562S0100000_18(this, 1211), new AwS597S0100000_18(this, 362));
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 != null && (c1173300gdcQr0 = interfaceC1181010gq3BK2.qr0()) != null && (c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ) != null && (c1189480h3i = c1185600gxS.LJIIJJI) != null) {
            this.LLJLLIL = c1189480h3i;
            Ep(c1189480h3i, Boolean.valueOf(this.LLJLLL));
        }
        InterfaceC1181010gq3 interfaceC1181010gq3BK22 = BK2();
        if (interfaceC1181010gq3BK22 != null && (c1186840gzSLw1 = interfaceC1181010gq3BK22.lw1()) != null) {
            c1186840gzSLw1.LIZIZ("PoiLocationEvent", this);
        }
    }

    public final void Ep(C1189480h3i c1189480h3i, Boolean bool) {
        String str;
        InterfaceC1181010gq3 interfaceC1181010gq3BK2;
        List<SlashParam> listSingletonList;
        String string;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            if ((C289330BVr.LIZ() == 1 || ((C289330BVr.LIZ() == 2 && c1189480h3i != null) || C1189470h3h.LIZ())) && (str = (String) this.LLJJL.getValue()) != null && str.length() != 0 && (interfaceC1181010gq3BK2 = BK2()) != null) {
                String strLIZ = C1173980gei.LIZ(this);
                String str2 = "";
                if (strLIZ == null) {
                    strLIZ = "";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (c1189480h3i != null) {
                    String str3 = c1189480h3i.LIZ;
                    if (str3 == null) {
                        str3 = "";
                    }
                    linkedHashMap.put("event_encrypted_lat", str3);
                    String str4 = c1189480h3i.LIZIZ;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    linkedHashMap.put("event_encrypted_lng", str2);
                    Boolean bool2 = c1189480h3i.LIZJ;
                    if (bool2 == null || (string = bool2.toString()) == null) {
                        string = "false";
                    }
                    linkedHashMap.put("high_accuracy", string);
                }
                SlashParam slashParamLIZJ = C1180170goh.LIZJ(str, strLIZ);
                String.valueOf(slashParamLIZJ);
                C1181930grX c1181930grXPu2 = interfaceC1181010gq3BK2.Pu2();
                String str5 = c1181930grXPu2.LIZ;
                String str6 = c1181930grXPu2.LIZIZ;
                C1227904rF.LIZ.getClass();
                SlashRequestParam slashRequestParam = new SlashRequestParam(str5, str6, C1227904rF.LJI(slashParamLIZJ), linkedHashMap, null, null);
                if (slashParamLIZJ != null) {
                    listSingletonList = Collections.singletonList(slashParamLIZJ);
                } else {
                    listSingletonList = null;
                }
                interfaceC1181010gq3BK2.ex2(slashRequestParam, strLIZ, listSingletonList, null, new C1181120gqE(false, false));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final void La(View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        C1174850gg7.LJI(this, view, interfaceC665370Q7z);
    }
}
