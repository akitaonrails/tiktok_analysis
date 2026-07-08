package com.ss.android.ugc.aweme.poi.reviews.landing.ui;

import X.AbstractC1189550h3p;
import X.C019F;
import X.C01GW;
import X.C0C64;
import X.C1184850gwF;
import X.C1190160h4o;
import X.C1190460h5I;
import X.C1190900h60;
import X.C123100dR;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1578630rBN;
import X.C1637806bA;
import X.C1871910yoP;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C262100zr;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C586460MzM;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C991130btn;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1871920yoQ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewsListAbility;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsBottomEntranceAssem extends UISlotAssem implements InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1190460h5I.class, "PoiReviewHierarchyData"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public C427660Gpo LLJJIJIL;
    public ImageView LLJJJ;
    public SmartImageView LLJJJIL;
    public C197039127h LLJJJJ;
    public String LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public PoiReviewsApi.PoiReviewEligibleResponse LLJL;
    public PoiReviewsApi.PoiReviewListResponse LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewsBottomEntranceAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsLandingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiReviewsBottomEntranceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsLandingViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1831), AFwS256S0000000_18.get$arr$(578), null, true);
        this.LLJJL = true;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1830));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e7z;
    }

    public final PoiReviewsLandingViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (PoiReviewsLandingViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("syncReviewToNative", this);
        C1548820qPI.LJIIIIZZ("closeReviewSubmitPage", this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        Boolean boolValueOf;
        String strValueOf;
        PoiReviewsListAbility poiReviewsListAbility;
        Integer numValueOf;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent - name: ");
        sbLIZ.append(c262100zr.LIZ);
        sbLIZ.append(", params: ");
        sbLIZ.append(c262100zr.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
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
                if (C1578630rBN.LJIIIZ(this)) {
                    return;
                }
                C1190160h4o.LIZ.getClass();
                PoiReviewsApi.PoiReviewModel poiReviewModel = C1190160h4o.LIZJ;
                if ((poiReviewModel == null || !Intrinsics.LJFF(poiReviewModel.getReviewId(), C1871910yoP.LJFF(interfaceC1107590evd, "review_id", ""))) && C123100dR.LIZ(strValueOf) && C1871910yoP.LIZLLL(interfaceC1107590evd, "create_time", 0) > 0) {
                    if (C1871910yoP.LIZLLL(interfaceC1107590evd, "rating", 0) > 0 || C123100dR.LIZ(C1871910yoP.LJFF(interfaceC1107590evd, "review_text", ""))) {
                        Fragment fragmentLJI = C724240Sb0.LJI(this);
                        if (fragmentLJI != null && (poiReviewsListAbility = (PoiReviewsListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), PoiReviewsListAbility.class, null)) != null) {
                            String strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd, "poi_id", "");
                            String strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd, "review_id", "");
                            double dLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "rating", 0);
                            String strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd, "review_text", "");
                            long jLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "create_time", 0);
                            List listLIZJ = C1190160h4o.LIZJ(C1871910yoP.LIZ(interfaceC1107590evd, "review_images", null));
                            boolean zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd, "anonymous", false);
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
                            poiReviewsListAbility.F90(C1190160h4o.LIZ(strLJFF4, strLJFF5, dLIZLLL, strLJFF6, jLIZLLL, listLIZJ, zLIZIZ, new PoiReviewsApi.PoiReviewUserLevelInfoModel(numValueOf, null, urlModel, null)));
                        }
                        C1440005kM.LIZ(new C586460MzM(C1871910yoP.LJFF(interfaceC1107590evd, "poi_id", "")));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "closeReviewSubmitPage")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "originalPostSource", "")) == null) {
                strLJFF = "";
            }
            AbstractC1189550h3p abstractC1189550h3p = (AbstractC1189550h3p) C1190900h60.class.newInstance();
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 != null) {
                boolValueOf = Boolean.valueOf(C1871910yoP.LIZIZ(interfaceC1107590evd3, "isSubmitReviewSuccess", false));
            } else {
                boolValueOf = null;
            }
            if (abstractC1189550h3p.LIZIZ(strLJFF) && !C1578630rBN.LJIIIZ(this) && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                if (fragmentLJI2 != null) {
                    C1184850gwF.LIZ.getClass();
                    C1184850gwF.LIZIZ(fragmentLJI2);
                }
                InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                if (interfaceC1107590evd4 != null) {
                    strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd4, "poiID", "");
                }
                C1440005kM.LIZ(new C586460MzM(strLJFF2));
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReviewsSubmitPageClosed(C991130btn c991130btn) {
        String str = c991130btn.LIZIZ;
        AbstractC1189550h3p abstractC1189550h3p = (AbstractC1189550h3p) C1190900h60.class.newInstance();
        boolean z = c991130btn.LIZJ;
        if (abstractC1189550h3p.LIZIZ(String.valueOf(str)) && !C1578630rBN.LJIIIZ(this) && z) {
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
        super.onViewCreated(view);
        this.LLJJIJIL = (C427660Gpo) getContentView().findViewById(R.id.rbr);
        this.LLJJJ = (ImageView) getContentView().findViewById(R.id.rbo);
        this.LLJJJIL = (SmartImageView) getContentView().findViewById(R.id.rbq);
        this.LLJJIJI = (TuxTextView) getContentView().findViewById(R.id.rbx);
        this.LLJJIJIIJIL = (TuxTextView) getContentView().findViewById(R.id.rbw);
        this.LLJJJJ = (C197039127h) getContentView().findViewById(R.id.rbs);
        this.LLJJJJLIIL = (TuxTextView) getContentView().findViewById(R.id.rby);
        getContentView().setClickable(true);
        C786410Ut5.LJLLLLLL(8, getContentView());
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_write_review_enlarge_area", false) == 2) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 90), getContentView());
        }
        C197039127h c197039127h = this.LLJJJJ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18(this, 91));
        }
        C197039127h c197039127h2 = this.LLJJJJ;
        if (c197039127h2 != null) {
            c197039127h2.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(203)));
        }
        C197039127h c197039127h3 = this.LLJJJJ;
        if (c197039127h3 != null) {
            c197039127h3.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
        }
        C736680Sv4.LJIIIZ(this, hp(), new C2217381BqS() { // from class: X.0h5n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1190280h50) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0h5o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1190280h50) obj).LLILLJJLI;
            }
        }, null, new AwS667S0100000_18(this, 20), 12);
        C2211631BhB.LJ(getContentView(), new AwS597S0100000_18(this, 461));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsBottomEntranceAssem.ip(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
