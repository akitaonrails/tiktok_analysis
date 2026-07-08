package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel;

import X.C01GW;
import X.C0IJT;
import X.C0KBP;
import X.C0KUP;
import X.C0KUW;
import X.C1103300eoi;
import X.C13BV;
import X.C1554960qZC;
import X.C1784870wY1;
import X.C1822330xWR;
import X.C1822530xWl;
import X.C1822600xWs;
import X.C1822680xX0;
import X.C1822770xX9;
import X.C1822780xXA;
import X.C1826730xdX;
import X.C2003007sy;
import X.C2097608Jq;
import X.C452501pT;
import X.C474500IjA;
import X.C500260Jjc;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1782150wTd;
import X.InterfaceC1822900xXM;
import X.InterfaceC517590KRp;
import X.InterfaceC665370Q7z;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServicePlusSingleSkuEnableSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleDMAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleFormAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceBioVM extends AssemViewModel<C0KUP> {
    public static final /* synthetic */ int LLJJIJI = 0;
    public InterfaceC665370Q7z LL;
    public C1822330xWR LLILLJJLI;
    public C1822680xX0 LLILZ;
    public Integer LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJILLL;
    public UISlotAssem LLJJ;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1822600xWs(this));
    public List<? extends InterfaceC1782150wTd> LLJI = C13BV.INSTANCE;
    public final C1822780xXA LLJIJIL = new C1822780xXA();
    public final C1822770xX9 LLJILJIL = new C1822770xX9();
    public final Set<InterfaceC1822900xXM> LLJILJILJ = new LinkedHashSet();
    public String LLJJI = "multi";
    public String LLJJIII = "";

    public final boolean CQ2() {
        return LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue() && !Intrinsics.LJFF(yQ2(this.LLJI), "multi");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0KUP(0);
    }

    public final String getPreviousPage() {
        String strYQ2 = yQ2(this.LLJI);
        int iHashCode = strYQ2.hashCode();
        return iHashCode != -636905084 ? iHashCode != 3209 ? (iHashCode == 3148996 && strYQ2.equals("form")) ? "form_landing_page" : "service_plus_audience_page" : strYQ2.equals("dm") ? "dm_landing_page" : "service_plus_audience_page" : strYQ2.equals("third_party_service") ? "third_party_service_landing_page" : "service_plus_audience_page";
    }

    public final C1822330xWR zQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            C1822330xWR c1822330xWR = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C1822330xWR.class, null)) != null) {
                c1822330xWR = (C1822330xWR) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLJJLI = c1822330xWR;
        }
        return this.LLILLJJLI;
    }

    public final void AQ2() {
        View viewM12;
        View viewM122;
        C1822330xWR c1822330xWRZQ2 = zQ2();
        if (c1822330xWRZQ2 == null || !c1822330xWRZQ2.LLILZ) {
            PcsServiceBioAbility pcsServiceBioAbility = (PcsServiceBioAbility) this.LLILLL.getValue();
            if (pcsServiceBioAbility == null || (viewM12 = pcsServiceBioAbility.M12()) == null) {
                return;
            }
            C500260Jjc.LJIILIIL(viewM12);
            return;
        }
        PcsServiceBioAbility pcsServiceBioAbility2 = (PcsServiceBioAbility) this.LLILLL.getValue();
        if (pcsServiceBioAbility2 == null || (viewM122 = pcsServiceBioAbility2.M12()) == null) {
            return;
        }
        C500260Jjc.LLFFF(viewM122);
    }

    public final void FQ2() {
        C1822330xWR c1822330xWRZQ2 = zQ2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_title_copy_email_toast");
        c474500IjALIZ.LJJII(c1822330xWRZQ2 != null ? c1822330xWRZQ2.LLJ : null, "anchor_id");
        c474500IjALIZ.LJJII(c1822330xWRZQ2 != null ? c1822330xWRZQ2.LLILLL : null, "room_id");
        c474500IjALIZ.LIZ();
        C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_service_bio_email_click_count_live_session");
    }

    public static String xQ2(List list) {
        String schema;
        InterfaceC1822900xXM interfaceC1822900xXMLIZIZ = C1822530xWl.LIZIZ(list);
        if (interfaceC1822900xXMLIZIZ == null) {
            return "";
        }
        LivePcsServicePlusSingleSkuEnableSetting livePcsServicePlusSingleSkuEnableSetting = LivePcsServicePlusSingleSkuEnableSetting.INSTANCE;
        if (((!livePcsServicePlusSingleSkuEnableSetting.getValue() || !Intrinsics.LJFF(interfaceC1822900xXMLIZIZ.getKey(), "direct_message")) && !C1822530xWl.LIZLLL(interfaceC1822900xXMLIZIZ) && (!livePcsServicePlusSingleSkuEnableSetting.getValue() || !Intrinsics.LJFF(interfaceC1822900xXMLIZIZ.getKey(), "third_party_link"))) || (schema = interfaceC1822900xXMLIZIZ.getSchema()) == null) {
            return "";
        }
        return schema;
    }

    public static String yQ2(List list) {
        boolean z;
        InterfaceC1822900xXM interfaceC1822900xXMLIZIZ;
        if (list == null) {
            return "unknown";
        }
        if (((ArrayList) C1822530xWl.LIZ(list)).size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (interfaceC1822900xXMLIZIZ = C1822530xWl.LIZIZ(list)) == null) {
            return "multi";
        }
        if (LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue() && Intrinsics.LJFF(interfaceC1822900xXMLIZIZ.getKey(), "direct_message")) {
            return "dm";
        }
        if (C1822530xWl.LIZLLL(interfaceC1822900xXMLIZIZ)) {
            return "form";
        }
        if (!LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue() || !Intrinsics.LJFF(interfaceC1822900xXMLIZIZ.getKey(), "third_party_link")) {
            return "multi";
        }
        return "third_party_service";
    }

    public static Pair DQ2(UISlotAssem uISlotAssem, List list) {
        String key;
        if (LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue()) {
            if (((ArrayList) C1822530xWl.LIZ(list)).size() > 1) {
                return new Pair(Boolean.valueOf(uISlotAssem instanceof PcsServiceBioContentAssem), "");
            }
            if (((ArrayList) C1822530xWl.LIZ(list)).size() == 1) {
                String strXQ2 = xQ2(list);
                InterfaceC1822900xXM interfaceC1822900xXMLIZIZ = C1822530xWl.LIZIZ(list);
                if (interfaceC1822900xXMLIZIZ == null || (key = interfaceC1822900xXMLIZIZ.getKey()) == null) {
                    key = "";
                }
                if (strXQ2.length() > 0) {
                    if (Intrinsics.LJFF(key, "direct_message")) {
                        return new Pair(Boolean.valueOf(uISlotAssem instanceof PcsServiceBioSingleDMAssem), strXQ2);
                    }
                    if (Intrinsics.LJFF(key, "fill_form")) {
                        Uri uri = UriProtector.parse(strXQ2);
                        if (Intrinsics.LJFF(uri.getHost(), "webcast_pcs") && Intrinsics.LJFF(uri.getPath(), "/service/form")) {
                            return new Pair(Boolean.valueOf(uISlotAssem instanceof PcsServiceBioContentAssem), "");
                        }
                        return new Pair(Boolean.valueOf(uISlotAssem instanceof PcsServiceBioSingleFormAssem), strXQ2);
                    }
                    return new Pair(Boolean.valueOf(uISlotAssem instanceof PcsServiceBioContentAssem), "");
                }
            }
        }
        return new Pair(Boolean.valueOf(uISlotAssem instanceof PcsServiceBioContentAssem), "");
    }

    public final void EQ2(String str, String str2) {
        String str3;
        C1822330xWR c1822330xWRZQ2 = zQ2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_title_call_phone_panel");
        String str4 = null;
        if (c1822330xWRZQ2 != null) {
            str3 = c1822330xWRZQ2.LLJ;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "anchor_id");
        if (c1822330xWRZQ2 != null) {
            str4 = c1822330xWRZQ2.LLILLL;
        }
        c474500IjALIZ.LJJII(str4, "room_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJIIZ(str2, "click_position", new C2003007sy(str));
        c474500IjALIZ.LIZ();
        if (Intrinsics.LJFF(str, "click")) {
            C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_service_bio_phone_click_count_live_session");
        }
    }

    public final void GQ2(String str, boolean z) {
        Object obj;
        String str2;
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            int i = this.LLIZ;
            Pair[] pairArr = new Pair[5];
            String str3 = "1";
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[0] = new Pair("is_cache", obj);
            if (!CQ2()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[1] = new Pair("is_single_sku", str3);
            if (!this.LLIZLLLIL) {
                str2 = "unknown";
            } else {
                str2 = str;
            }
            pairArr[2] = new Pair("sku_type", str2);
            pairArr[3] = new Pair("sku_type_final", str);
            pairArr[4] = new Pair("prev_sku_type", this.LLJJI);
            interfaceC517590KRpLIZJ.LJI(new C0KBP(i, C2097608Jq.LJIIJ(pairArr)));
        }
    }

    public final Map<String, String> vQ2(boolean z, boolean z2) {
        boolean z3;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        String str2;
        C1822330xWR c1822330xWRZQ2 = zQ2();
        if (c1822330xWRZQ2 != null) {
            z3 = c1822330xWRZQ2.LLILZ;
        } else {
            z3 = false;
        }
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("is_single_sku", String.valueOf(z ? 1 : 0));
        pairArr[1] = new Pair("is_cache", String.valueOf(z2 ? 1 : 0));
        pairArr[2] = new Pair("is_service_plus_revamp", CardStruct.IStatusCode.DEFAULT);
        pairArr[3] = new Pair("is_anchor", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0));
        C1822330xWR c1822330xWRZQ22 = zQ2();
        String string = null;
        if (c1822330xWRZQ22 != null) {
            numValueOf = Integer.valueOf(c1822330xWRZQ22.LIZIZ() ? 1 : 0);
        } else {
            numValueOf = null;
        }
        pairArr[4] = new Pair("has_kyb_verified", String.valueOf(numValueOf));
        C1822330xWR c1822330xWRZQ23 = zQ2();
        if (c1822330xWRZQ23 != null) {
            numValueOf2 = Integer.valueOf(c1822330xWRZQ23.LIZJ() ? 1 : 0);
        } else {
            numValueOf2 = null;
        }
        pairArr[5] = new Pair("has_kyc_verified", String.valueOf(numValueOf2));
        w.LIZ.getClass();
        pairArr[6] = new Pair("request_id", w.LJIJI());
        C1822330xWR c1822330xWRZQ24 = zQ2();
        if (c1822330xWRZQ24 != null) {
            string = Integer.valueOf(c1822330xWRZQ24.LLJJJJJIL).toString();
        }
        String str3 = "";
        if (string == null) {
            string = "";
        }
        pairArr[7] = new Pair("sku_cnt", string);
        C1822330xWR c1822330xWRZQ25 = zQ2();
        if (c1822330xWRZQ25 == null || (str = c1822330xWRZQ25.LL) == null) {
            str = "";
        }
        pairArr[8] = new Pair("traffic_type", str);
        C1822330xWR c1822330xWRZQ26 = zQ2();
        if (c1822330xWRZQ26 != null && (str2 = c1822330xWRZQ26.LL) != null) {
            str3 = str2;
        }
        pairArr[9] = new Pair("show_entrance", str3);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public final String wQ2(boolean z, boolean z2) {
        boolean z3;
        Integer numValueOf;
        String str;
        String str2;
        C1822330xWR c1822330xWRZQ2 = zQ2();
        if (c1822330xWRZQ2 != null) {
            z3 = c1822330xWRZQ2.LLILZ;
        } else {
            z3 = false;
        }
        Gson gson = new Gson();
        Pair[] pairArr = new Pair[16];
        pairArr[0] = new Pair("is_service_plus", String.valueOf(1));
        pairArr[1] = new Pair("is_single_sku", String.valueOf(z ? 1 : 0));
        pairArr[2] = new Pair("is_cache", String.valueOf(z2 ? 1 : 0));
        pairArr[3] = new Pair("is_service_plus_revamp", CardStruct.IStatusCode.DEFAULT);
        pairArr[4] = new Pair("is_anchor", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0));
        C1822330xWR c1822330xWRZQ22 = zQ2();
        Integer numValueOf2 = null;
        if (c1822330xWRZQ22 != null) {
            numValueOf = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c1822330xWRZQ22.LIZIZ())) ? 1 : 0);
        } else {
            numValueOf = null;
        }
        pairArr[5] = new Pair("has_kyb_verified", numValueOf);
        C1822330xWR c1822330xWRZQ23 = zQ2();
        if (c1822330xWRZQ23 != null) {
            numValueOf2 = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c1822330xWRZQ23.LIZJ())) ? 1 : 0);
        }
        pairArr[6] = new Pair("has_kyc_verified", numValueOf2);
        w.LIZ.getClass();
        pairArr[7] = new Pair("request_id", w.LJIJI());
        pairArr[8] = new Pair("anchor_id", String.valueOf(w.LJ()));
        pairArr[9] = new Pair("room_id", String.valueOf(w.LJIJJ()));
        pairArr[10] = new Pair("traffic_action_type", w.LIZLLL());
        String str3 = "";
        pairArr[11] = new Pair("enter_from", "");
        pairArr[12] = new Pair("enter_from_merge", w.LJIIIZ());
        pairArr[13] = new Pair("enter_method", w.LJIIL());
        C1822330xWR c1822330xWRZQ24 = zQ2();
        if (c1822330xWRZQ24 == null || (str = c1822330xWRZQ24.LL) == null) {
            str = "";
        }
        pairArr[14] = new Pair("traffic_type", str);
        C1822330xWR c1822330xWRZQ25 = zQ2();
        if (c1822330xWRZQ25 != null && (str2 = c1822330xWRZQ25.LL) != null) {
            str3 = str2;
        }
        pairArr[15] = new Pair("show_entrance", str3);
        return GsonProtectorUtils.toJson(gson, C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void BQ2(PcsServiceBioVM pcsServiceBioVM, C1784870wY1 c1784870wY1, Throwable th, int i) {
        if ((i & 1) != 0) {
            c1784870wY1 = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        pcsServiceBioVM.getClass();
        pcsServiceBioVM.setState(new C0KUW(c1784870wY1, th));
    }
}
