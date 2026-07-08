package com.ss.android.ugc.aweme.poi.reviews.landing.ui;

import X.AbstractC1189550h3p;
import X.AbstractC848400XPy;
import X.C019F;
import X.C098200Yq;
import X.C0C64;
import X.C0P0T;
import X.C0XQ7;
import X.C1182380gsG;
import X.C1184850gwF;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1190160h4o;
import X.C1190820h5s;
import X.C1190910h61;
import X.C1190920h62;
import X.C1191160h6Q;
import X.C1209100hZM;
import X.C123100dR;
import X.C1308910kAL;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1637806bA;
import X.C1871910yoP;
import X.C189200o6;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2365509Or;
import X.C2519709u7;
import X.C262100zr;
import X.C586460MzM;
import X.C634060Otw;
import X.C688120Qyw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C991130btn;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1542790qFZ;
import X.InterfaceC1871920yoQ;
import X.InterfaceC20660615sy;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewsListAbility;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsNavAssem extends UIContentAssem implements InterfaceC20660615sy, InterfaceC1141530foN, PoiReviewNavAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public TuxAlertBadgeLayout LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public C0P0T LLJJ;
    public SmartImageView LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewsNavAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsLandingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiReviewsNavAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsLandingViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1844), AFwS256S0000000_18.get$arr$(596), null, true);
        this.LLJILLL = 3;
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    public final PoiReviewsLandingViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (PoiReviewsLandingViewModel) assemVMLazy.getValue();
    }

    public final void Lo() {
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str = Go().LLILLJJLI;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        C1185430gxB.LJJIJL(c1185430gxB, str, "click", fragmentLJIIJ != null ? C1558360qeg.LJFF(fragmentLJIIJ, null) : null, "poi_secondary_reviews_page", "poi_review", PageFinder.via(LJJIJL()));
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewNavAbility
    public final void xD0() {
        C1548820qPI.LIZLLL("syncReviewToNative", this);
        C1548820qPI.LIZLLL("closeReviewSubmitPage", this);
        C1548820qPI.LIZLLL("syncPOIReviewDeleted", this);
    }

    public final Integer Ho() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "review_center_mvp", false) != 2) {
            return null;
        }
        TuxAlertBadgeLayout tuxAlertBadgeLayout = this.LLJILJIL;
        if (tuxAlertBadgeLayout == null || !tuxAlertBadgeLayout.LLJIJIL) {
            return 0;
        }
        return Integer.valueOf(tuxAlertBadgeLayout.getCount());
    }

    public final void Jo() {
        withState(Go(), AFwS256S0000000_18.get$arr$(595));
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = LJJIJL().getContext();
        SparkContext sparkContext = new SparkContext();
        String strLIZIZ = TiktokPoiLynxSettings.LIZIZ("poi_review_center");
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        sparkContext.LJJLIIJ(strLIZIZ);
        sparkContext.LJJJZ("enter_method", "icon");
        sparkContext.LJJJZ("enter_from", "poi_reviews");
        withState(Go(), new AwS597S0100000_18(sparkContext, 469));
        SparkContext sparkContext2 = null;
        sparkContext.LJJJZ("poi_review_landing_params", C786410Ut5.J3(Go().rE(null, C1558520qew.LJIIL(this))));
        String str = Go().LLJI;
        sparkContext.LJJJZ("from_group_id", str != null ? str : "");
        try {
            Map mapLJII = C1182380gsG.LJII(C1558520qew.LJIIL(this));
            if (!mapLJII.isEmpty()) {
                sparkContext.LJJJZ("poi_general_track_params", C2365509Or.LJ(mapLJII));
                sparkContext2 = sparkContext;
            }
            C189200o6.m2constructorimpl(sparkContext2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0h5r
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJJJI() {
                return !C444960Hcc.LIZJ(this.LL.getContext()) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJLI() {
                return !C444960Hcc.LIZJ(this.LL.getContext()) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
            }
        });
        sparkContext.LJJJJZI(new C1209100hZM(this, 5));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        Lo();
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        Integer numHo = Ho();
        int i = this.LLJILLL;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIIZ(false, numHo, i, interfaceC665370Q7zLJIIL, pageFinderVia);
        withState(Go(), new AwS597S0100000_18(this, 470));
        Keva kevaLIZJ = C1190820h5s.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_review_center_anime_has_shown_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLIZJ.storeInt(C2188811AlT.LIZIZ(sbLIZ), 999);
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        return (fragmentLJI == null || (lifecycle = fragmentLJI.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) ? false : true;
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return C634060Otw.LIZ(this);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context context = getContext();
        if (context != null) {
            return new C688120Qyw(context, this, null);
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("syncReviewToNative", this);
        C1548820qPI.LJIIIIZZ("closeReviewSubmitPage", this);
        C1548820qPI.LJIIIIZZ("syncPOIReviewDeleted", this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        String strValueOf;
        Fragment fragmentLJI;
        PoiReviewsListAbility poiReviewsListAbility;
        String strLJFF;
        Boolean boolValueOf;
        String strLJFF2;
        String strValueOf2;
        PoiReviewsListAbility poiReviewsListAbility2;
        Integer numValueOf;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent - name: ");
        sbLIZ.append(c262100zr.LIZ);
        sbLIZ.append(", params: ");
        sbLIZ.append(c262100zr.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1871920yoQ interfaceC1871920yoQLIZ = null;
        if (Intrinsics.LJFF(c262100zr.LIZ, "syncReviewToNative")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                String strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd2, "review_id", "");
                if (strLJFF3 != null && strLJFF3.length() != 0) {
                    strValueOf2 = C1871910yoP.LJFF(interfaceC1107590evd2, "review_id", "");
                } else {
                    strValueOf2 = String.valueOf(C1871910yoP.LIZJ(interfaceC1107590evd2, "review_id", 0.0d));
                }
                String strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd2, "poi_id", "");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onReceiveJsEvent - poi_id: ");
                sbLIZ2.append(C1871910yoP.LJFF(interfaceC1107590evd2, "poi_id", ""));
                sbLIZ2.append(", review_id: ");
                sbLIZ2.append(strValueOf2);
                sbLIZ2.append(", create_time: ");
                sbLIZ2.append(C1871910yoP.LIZLLL(interfaceC1107590evd2, "create_time", 0));
                sbLIZ2.append(", rating: ");
                sbLIZ2.append(C1871910yoP.LIZLLL(interfaceC1107590evd2, "rating", 0));
                sbLIZ2.append(", review_text: ");
                sbLIZ2.append(C1871910yoP.LJFF(interfaceC1107590evd2, "review_text", ""));
                sbLIZ2.append(' ');
                C2188811AlT.LIZIZ(sbLIZ2);
                if (!C1578630rBN.LJIIIZ(this) && Intrinsics.LJFF(strLJFF4, Go().LL)) {
                    C1190160h4o.LIZ.getClass();
                    PoiReviewsApi.PoiReviewModel poiReviewModel = C1190160h4o.LIZJ;
                    if ((poiReviewModel == null || !Intrinsics.LJFF(poiReviewModel.getReviewId(), C1871910yoP.LJFF(interfaceC1107590evd2, "review_id", ""))) && C123100dR.LIZ(strValueOf2) && C1871910yoP.LIZLLL(interfaceC1107590evd2, "create_time", 0) > 0) {
                        if (C1871910yoP.LIZLLL(interfaceC1107590evd2, "rating", 0) > 0 || C123100dR.LIZ(C1871910yoP.LJFF(interfaceC1107590evd2, "review_text", ""))) {
                            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                            if (fragmentLJI2 != null && (poiReviewsListAbility2 = (PoiReviewsListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), PoiReviewsListAbility.class, null)) != null) {
                                String strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd2, "poi_id", "");
                                String strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd2, "review_id", "");
                                double dLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd2, "rating", 0);
                                String strLJFF7 = C1871910yoP.LJFF(interfaceC1107590evd2, "review_text", "");
                                long jLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd2, "create_time", 0);
                                List listLIZJ = C1190160h4o.LIZJ(C1871910yoP.LIZ(interfaceC1107590evd2, "review_images", null));
                                boolean zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd2, "anonymous", false);
                                InterfaceC1107590evd interfaceC1107590evdLJ2 = C1871910yoP.LJ(interfaceC1107590evd2, "user_level_info");
                                if (interfaceC1107590evdLJ2 != null) {
                                    numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evdLJ2, "level", 0));
                                } else {
                                    numValueOf = null;
                                }
                                UrlModel urlModel = new UrlModel();
                                InterfaceC1107590evd interfaceC1107590evdLJ3 = C1871910yoP.LJ(interfaceC1107590evd2, "user_level_info");
                                if (interfaceC1107590evdLJ3 != null && (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evdLJ3, "level_badge")) != null) {
                                    interfaceC1871920yoQLIZ = C1871910yoP.LIZ(interfaceC1107590evdLJ, "url_list", null);
                                }
                                urlModel.setUrlList(C1190160h4o.LIZJ(interfaceC1871920yoQLIZ));
                                poiReviewsListAbility2.F90(C1190160h4o.LIZ(strLJFF5, strLJFF6, dLIZLLL, strLJFF7, jLIZLLL, listLIZJ, zLIZIZ, new PoiReviewsApi.PoiReviewUserLevelInfoModel(numValueOf, null, urlModel, null)));
                            }
                            C1440005kM.LIZ(new C586460MzM(C1871910yoP.LJFF(interfaceC1107590evd2, "poi_id", "")));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "closeReviewSubmitPage")) {
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd3, "originalPostSource", "")) == null) {
                strLJFF = "";
            }
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            if (interfaceC1107590evd4 != null) {
                boolValueOf = Boolean.valueOf(C1871910yoP.LIZIZ(interfaceC1107590evd4, "isSubmitReviewSuccess", false));
            } else {
                boolValueOf = null;
            }
            AbstractC1189550h3p abstractC1189550h3p = (AbstractC1189550h3p) C1190920h62.class.newInstance();
            AbstractC1189550h3p abstractC1189550h3p2 = (AbstractC1189550h3p) C1190910h61.class.newInstance();
            if ((abstractC1189550h3p.LIZIZ(strLJFF) || abstractC1189550h3p2.LIZIZ(strLJFF)) && !C1578630rBN.LJIIIZ(this) && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                Fragment fragmentLJI3 = C724240Sb0.LJI(this);
                if (fragmentLJI3 != null) {
                    C1184850gwF.LIZ.getClass();
                    C1184850gwF.LIZIZ(fragmentLJI3);
                }
                InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                if (interfaceC1107590evd5 != null) {
                    strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd5, "poiID", "");
                } else {
                    strLJFF2 = null;
                }
                C1440005kM.LIZ(new C586460MzM(strLJFF2));
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "syncPOIReviewDeleted") && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
            String strLJFF8 = C1871910yoP.LJFF(interfaceC1107590evd, "review_id", "");
            if (strLJFF8 != null && strLJFF8.length() != 0) {
                strValueOf = C1871910yoP.LJFF(interfaceC1107590evd, "review_id", "");
            } else {
                strValueOf = String.valueOf(C1871910yoP.LIZJ(interfaceC1107590evd, "review_id", 0.0d));
            }
            String strLJFF9 = C1871910yoP.LJFF(interfaceC1107590evd, "poi_id", "");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onReceiveJsEvent - poi_id: ");
            sbLIZ3.append(strLJFF9);
            sbLIZ3.append(", review_id: ");
            sbLIZ3.append(strValueOf);
            sbLIZ3.append(", create_time: ");
            sbLIZ3.append(C1871910yoP.LIZLLL(interfaceC1107590evd, "create_time", 0));
            sbLIZ3.append(", rating: ");
            sbLIZ3.append(C1871910yoP.LIZLLL(interfaceC1107590evd, "rating", 0));
            sbLIZ3.append(", review_text: ");
            sbLIZ3.append(C1871910yoP.LJFF(interfaceC1107590evd, "review_text", ""));
            sbLIZ3.append(' ');
            C2188811AlT.LIZIZ(sbLIZ3);
            if (!C1578630rBN.LJIIIZ(this) && (fragmentLJI = C724240Sb0.LJI(this)) != null && (poiReviewsListAbility = (PoiReviewsListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), PoiReviewsListAbility.class, null)) != null) {
                poiReviewsListAbility.iM2(strValueOf, strLJFF9);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReviewsSubmitPageClosed(C991130btn c991130btn) {
        String str = c991130btn.LIZIZ;
        boolean z = c991130btn.LIZJ;
        AbstractC1189550h3p abstractC1189550h3p = (AbstractC1189550h3p) C1190920h62.class.newInstance();
        AbstractC1189550h3p abstractC1189550h3p2 = (AbstractC1189550h3p) C1190910h61.class.newInstance();
        if ((abstractC1189550h3p.LIZIZ(String.valueOf(str)) || abstractC1189550h3p2.LIZIZ(String.valueOf(str))) && !C1578630rBN.LJIIIZ(this) && z) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                C1184850gwF.LIZ.getClass();
                C1184850gwF.LIZIZ(fragmentLJI);
            }
            C1440005kM.LIZ(new C586460MzM(c991130btn.LIZ));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, PoiReviewNavAbility.class, null, null);
        }
        View viewFindViewById = view.findViewById(R.id.bmy);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 94), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.k16);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 29, 42), viewFindViewById2);
        }
        this.LLJ = (TuxTextView) view.findViewById(R.id.title);
        this.LLJI = (TuxIconView) view.findViewById(R.id.k1z);
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.k16);
        this.LLJILJIL = (TuxAlertBadgeLayout) view.findViewById(R.id.tfy);
        this.LLJJI = (SmartImageView) view.findViewById(R.id.k1h);
        TuxAlertBadgeLayout tuxAlertBadgeLayout = this.LLJILJIL;
        if (tuxAlertBadgeLayout != null) {
            tuxAlertBadgeLayout.setMaxCount(2);
        }
        TuxAlertBadgeLayout tuxAlertBadgeLayout2 = this.LLJILJIL;
        if (tuxAlertBadgeLayout2 != null) {
            tuxAlertBadgeLayout2.LIZIZ();
        }
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 1.0f);
        }
        TuxTextView tuxTextView2 = this.LLJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(33);
        }
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        int iIntValue = 0;
        if (C2519709u7.LIZ == 1) {
            TuxIconView tuxIconView2 = this.LLJI;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_star_smile);
            }
            TuxIconView tuxIconView3 = this.LLJI;
            if (tuxIconView3 != null) {
                Context context = getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                }
                tuxIconView3.setTintColor(iIntValue);
            }
        }
        TuxIconView tuxIconView4 = this.LLJI;
        if (tuxIconView4 != null) {
            HandlerHook.viewPostDelay(tuxIconView4, new ARunnableS118S0100000_18(this, 42), 2000L);
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0h5u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1190280h50) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 159), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0h5v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1190280h50) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 160), 6);
    }
}
