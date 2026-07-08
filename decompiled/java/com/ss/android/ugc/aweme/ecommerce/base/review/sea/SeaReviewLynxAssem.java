package com.ss.android.ugc.aweme.ecommerce.base.review.sea;

import X.C019F;
import X.C01GW;
import X.C1018703yb;
import X.C1074804Ig;
import X.C13LE;
import X.C1537710q7N;
import X.C1537720q7O;
import X.C1637806bA;
import X.C1741890vQh;
import X.C1760260vuK;
import X.C1760290vuN;
import X.C1760300vuO;
import X.C1760330vuR;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1760230vuH;
import X.InterfaceC1760340vuS;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PdpReviewClickEvent;
import com.ss.android.ugc.aweme.ecommerce.base.review.sea.SeaReviewLynxAssem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaReviewLynxAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public C1760300vuO LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaReviewLynxAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/review/sea/SeaReviewLynxViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeaReviewLynxAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaReviewLynxViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 320), AFwS268S0000000_26.get$arr$(250), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 319));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 318));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final SeaReviewLynxViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (SeaReviewLynxViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1760300vuO c1760300vuO = this.LLJI;
        if (c1760300vuO != null) {
            c1760300vuO.LIZIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1760300vuO c1760300vuO = this.LLJI;
        View viewLIZJ = c1760300vuO != null ? c1760300vuO.LIZJ() : null;
        if (viewLIZJ instanceof C1537710q7N) {
            ((C1537710q7N) viewLIZJ).onShow();
        }
        if (viewLIZJ instanceof C1537720q7O) {
            ((C1537720q7O) viewLIZJ).onShow();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C1760300vuO c1760300vuO = this.LLJI;
        View viewLIZJ = c1760300vuO != null ? c1760300vuO.LIZJ() : null;
        if (viewLIZJ instanceof C1537710q7N) {
            ((C1537710q7N) viewLIZJ).onHide();
        }
        if (viewLIZJ instanceof C1537720q7O) {
            ((C1537720q7O) viewLIZJ).onHide();
        }
    }

    public final void Ho(Object obj) {
        C1760300vuO c1760300vuO;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR2;
        Integer numLJIIJJI;
        Integer num;
        String str;
        String str2;
        String str3;
        Context context = getContext();
        if (context != null && (c1760300vuO = this.LLJI) != null) {
            String str4 = C1074804Ig.LIZIZ().lynxSchema;
            if (str4 == null || !(!a0.LJJJIL(str4))) {
                str4 = "aweme://lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_ecommerce_pdp_sea_view_review%2Fpages%2Freview_secondary_page%2Ftemplate.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&trans_status_bar=1&user_spark=1";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("seller_id", Go().LLILLJJLI.LIZIZ);
            linkedHashMap2.put("product_id", Go().LLILLJJLI.LIZ);
            PdpReviewClickEvent pdpReviewClickEvent = Go().LL;
            if (pdpReviewClickEvent != null && (str3 = pdpReviewClickEvent.clickedReviewId) != null) {
                linkedHashMap2.put("clicked_review_id", str3);
            }
            PdpReviewClickEvent pdpReviewClickEvent2 = Go().LL;
            if (pdpReviewClickEvent2 != null && (str2 = pdpReviewClickEvent2.clickedFilterId) != null) {
                linkedHashMap2.put("clicked_filter_id", str2);
            }
            PdpReviewClickEvent pdpReviewClickEvent3 = Go().LL;
            if (pdpReviewClickEvent3 != null && (str = pdpReviewClickEvent3.clickedFilterType) != null) {
                linkedHashMap2.put("clicked_filter_type", str);
            }
            PdpReviewClickEvent pdpReviewClickEvent4 = Go().LL;
            if (pdpReviewClickEvent4 != null && (num = pdpReviewClickEvent4.clickedFilterCount) != null) {
                linkedHashMap2.put("clicked_filter_count", Integer.valueOf(num.intValue()));
            }
            linkedHashMap2.put("page_type", Integer.valueOf(Go().LLILLJJLI.LIZJ));
            Integer num2 = Go().LLILLJJLI.LIZLLL;
            if (num2 != null) {
                linkedHashMap2.put("biz_type", Integer.valueOf(num2.intValue()));
            }
            String str5 = Go().LLILLJJLI.LJ;
            if (str5 != null) {
                linkedHashMap2.put("da_info", str5);
            }
            String str6 = Go().LLILLJJLI.LJFF;
            if (str6 != null) {
                linkedHashMap2.put("kol_id", str6);
            }
            String str7 = Go().LLILLJJLI.LJII;
            if (str7 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str7)) != null) {
                linkedHashMap2.put("product_source_info", Integer.valueOf(numLJIIJJI.intValue()));
            }
            ArrayList<Integer> arrayList = Go().LLILLJJLI.LJI;
            if (arrayList != null) {
                linkedHashMap2.put("traffic_source_list", arrayList);
            }
            String str8 = Go().LLILLJJLI.LJIIIIZZ;
            if (str8 != null) {
                linkedHashMap2.put("unique_id", str8);
            }
            String str9 = Go().LLILLJJLI.LJIIIZ;
            if (str9 != null) {
                linkedHashMap2.put("review_page_request_params", str9);
            }
            linkedHashMap.put("common_params", linkedHashMap2);
            if (obj != null) {
                linkedHashMap.put("response_data", C1741890vQh.LJIIIIZZ(obj));
            }
            HashMap<String, Object> map = Go().LLILLL;
            if (map != null) {
                linkedHashMap.put("track_params", map);
            }
            SeaPdpViewModel seaPdpViewModel = ((SeaReviewLynxFragment) this.LLJIJIL.getValue()).LLJILJILJ;
            if (seaPdpViewModel != null) {
                iSeaPdpCommunicationServiceTR2 = seaPdpViewModel.TR2();
            } else {
                iSeaPdpCommunicationServiceTR2 = null;
            }
            c1760300vuO.LIZLLL(context, new C1760290vuN(str4, linkedHashMap, null, iSeaPdpCommunicationServiceTR2, 104), null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object obj;
        Object obj2;
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0a1N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C917130ZyR) obj3).LL;
            }
        }, null, new AwS640S0100000_26(this, 185), 6);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("load_step", "start");
        C1018703yb.LJ("rd_tiktokec_sea_review_lynx_load", linkedHashMap);
        Go().LLILZIL = false;
        this.LLJI = C1760260vuK.LIZ(InterfaceC1760230vuH.LIZ, new C1760330vuR((ViewGroup) this.LLJ.getValue(), true), 1);
        Context context = getContext();
        if (context != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            HashMap<String, Object> map = Go().LLILLL;
            Object obj3 = "";
            if (map == null || (obj = map.get("enter_from")) == null) {
                obj = "";
            }
            linkedHashMap2.put("enter_from", obj);
            HashMap<String, Object> map2 = Go().LLILLL;
            if (map2 != null && (obj2 = map2.get("previous_page")) != null) {
                obj3 = obj2;
            }
            linkedHashMap2.put("previous_page", obj3);
            linkedHashMap2.put("review_start_timestamp", Long.valueOf(jCurrentTimeMillis));
            C1760300vuO c1760300vuO = this.LLJI;
            View viewLIZLLL = null;
            ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR2 = null;
            if (c1760300vuO != null) {
                String str = C1074804Ig.LIZIZ().lynxSchema;
                if (str == null || !(true ^ a0.LJJJIL(str))) {
                    str = "aweme://lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_ecommerce_pdp_sea_view_review%2Fpages%2Freview_secondary_page%2Ftemplate.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&trans_status_bar=1&user_spark=1";
                }
                SeaPdpViewModel seaPdpViewModel = ((SeaReviewLynxFragment) this.LLJIJIL.getValue()).LLJILJILJ;
                if (seaPdpViewModel != null) {
                    iSeaPdpCommunicationServiceTR2 = seaPdpViewModel.TR2();
                }
                viewLIZLLL = c1760300vuO.LIZLLL(context, new C1760290vuN(str, null, linkedHashMap2, iSeaPdpCommunicationServiceTR2, 96), new InterfaceC1760340vuS() { // from class: X.0vuc
                    @Override // X.InterfaceC1760340vuS
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1760340vuS
                    public final void LJIJJLI() {
                        this.LIZ.Go().LLILZIL = true;
                        if (this.LIZ.Go().LLILZ != null) {
                            SeaReviewLynxAssem seaReviewLynxAssem = this.LIZ;
                            seaReviewLynxAssem.Ho(seaReviewLynxAssem.Go().LLILZ);
                        }
                        C1760470vuf.LIZ(null, true);
                    }

                    @Override // X.InterfaceC1760340vuS
                    public final void LJJ() {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("load_step", "first_screen");
                        linkedHashMap3.put("load_time", Long.valueOf(jCurrentTimeMillis2));
                        C1018703yb.LJ("rd_tiktokec_sea_review_lynx_load", linkedHashMap3);
                    }

                    @Override // X.InterfaceC1760340vuS
                    public final void LJIL(String str2) {
                        C1760470vuf.LIZ(str2, false);
                    }
                });
            }
            ViewGroup viewGroup = (ViewGroup) this.LLJ.getValue();
            if (viewGroup != null) {
                viewGroup.addView(viewLIZLLL);
            }
        }
    }
}
