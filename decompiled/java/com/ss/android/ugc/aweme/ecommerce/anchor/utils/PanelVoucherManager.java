package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1018703yb;
import X.C1104190eq9;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13LE;
import X.C13LP;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C1739800vNK;
import X.C1741890vQh;
import X.C18LM;
import X.C18LV;
import X.C18LY;
import X.C2097608Jq;
import X.C21268418La;
import X.C21269818Lo;
import X.C21271918Mj;
import X.C21272518Mp;
import X.C2371409Qy;
import X.C262100zr;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC21274418Ni;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.ExpansionVoucher;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.model.PanelExpansionVoucher;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS1S4000000_26;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS5S3200000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class PanelVoucherManager implements InterfaceC1141530foN {
    public final ViewGroup LL;
    public final Map<String, String> LLILLJJLI;
    public C18LY LLILLL;
    public String LLILZ = "video_anchor";
    public String LLILZIL = "video_anchor";
    public String LLILZLL = "c92278.d2841";

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C18LY c18ly;
        List<PanelVoucherInfo> list;
        PanelVoucherInfo panelVoucherInfo;
        String strLJIIIIZZ;
        Type type;
        PanelVoucherInfo panelVoucherInfo2;
        Map<String, Object> mapLIZ;
        Object obj;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "mystery_coupon_entrance_update")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && (mapLIZ = interfaceC1107590evd.LIZ()) != null && (obj = mapLIZ.get("expansionVoucher")) != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj);
            } else {
                strLJIIIIZZ = null;
            }
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(ExpansionVoucher.class));
                } else {
                    type = new TypeToken<ExpansionVoucher>() { // from class: X.18LX
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strLJIIIIZZ, type);
                if (!(objFromJson instanceof ExpansionVoucher)) {
                    objFromJson = null;
                }
                ExpansionVoucher expansionVoucher = (ExpansionVoucher) objFromJson;
                if (expansionVoucher != null && (panelVoucherInfo2 = expansionVoucher.expandedVoucherInfo) != null) {
                    LIZ(panelVoucherInfo2, this.LLILZLL);
                    String str2 = this.LLILLJJLI.get("source_content_id");
                    LIZJ(str2, "video_anchor", panelVoucherInfo2);
                    LIZJ(str2, "comment_anchor", panelVoucherInfo2);
                    return;
                }
                return;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (Intrinsics.LJFF(str, "mystery_coupon_entrance_refresh") && (c18ly = this.LLILLL) != null && (list = c18ly.LIZ) != null && (panelVoucherInfo = (PanelVoucherInfo) C13LP.LJJJLL(list)) != null) {
            LIZ(panelVoucherInfo, this.LLILZLL);
            String str3 = this.LLILLJJLI.get("source_content_id");
            LIZJ(str3, "video_anchor", null);
            LIZJ(str3, "comment_anchor", null);
        }
    }

    public final void LIZ(PanelVoucherInfo panelVoucherInfo, String str) {
        C21268418La c21268418La = new C21268418La(this.LL.getContext());
        C786410Ut5.LJLLLLLL(0, this.LL);
        C786410Ut5.LJJJJI(this.LL);
        this.LL.addView(c21268418La, -1, -2);
        C1739800vNK c1739800vNK = C1739800vNK.LIZ;
        Context context = this.LL.getContext();
        String str2 = this.LLILLJJLI.get("enter_from");
        String str3 = this.LLILLJJLI.get("entrance_form");
        String str4 = this.LLILLJJLI.get("source_content_id");
        String str5 = this.LLILZ;
        String str6 = this.LLILZIL;
        c1739800vNK.getClass();
        Map mapLIZ = C1104190eq9.LIZ(c21268418La, str);
        C21268418La.LIZIZ(c21268418La, panelVoucherInfo, new AwS5S3200000_32(str4, (String) panelVoucherInfo, (PanelVoucherInfo) str2, str3, (String) mapLIZ, (Map<String, String>) 0), new C18LV(context, str4, str2, str3, str6, str5, mapLIZ), new AwS5S3200000_32(context, str4, str2, mapLIZ, str3, 2));
    }

    public PanelVoucherManager(final LifecycleOwner lifecycleOwner, ViewGroup viewGroup, Map<String, String> map) {
        this.LL = viewGroup;
        this.LLILLJJLI = map;
        C1548820qPI.LIZLLL("mystery_coupon_entrance_update", this);
        C1548820qPI.LIZLLL("mystery_coupon_entrance_refresh", this);
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.anchor.utils.PanelVoucherManager.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                C1548820qPI.LJIIIIZZ("mystery_coupon_entrance_update", PanelVoucherManager.this);
                C1548820qPI.LJIIIIZZ("mystery_coupon_entrance_refresh", PanelVoucherManager.this);
                lifecycleOwner.getLifecycle().removeObserver(this);
            }
        });
    }

    public static void LIZJ(String str, String str2, PanelVoucherInfo panelVoucherInfo) {
        GetItemProductInfoResponseData getItemProductInfoResponseDataLIZ;
        C21272518Mp c21272518Mp = C21272518Mp.LIZ;
        EnumC21274418Ni enumC21274418Ni = EnumC21274418Ni.DEFAULT;
        c21272518Mp.getClass();
        GetItemProductInfoResponseData getItemProductInfoResponseDataLJI = C21272518Mp.LJI(str, str2, null, enumC21274418Ni);
        if (getItemProductInfoResponseDataLJI != null) {
            if (panelVoucherInfo == null) {
                getItemProductInfoResponseDataLIZ = GetItemProductInfoResponseData.LIZ(getItemProductInfoResponseDataLJI, null, 3071);
            } else {
                getItemProductInfoResponseDataLIZ = GetItemProductInfoResponseData.LIZ(getItemProductInfoResponseDataLJI, C1697810uHb.LJIILJJIL(panelVoucherInfo), 3007);
            }
            C21272518Mp.LJIILL(str, str2, getItemProductInfoResponseDataLIZ);
        }
    }

    public final void LIZIZ(C18LY c18ly, String str, String str2) {
        String str3;
        PanelVoucherInfo panelVoucherInfo;
        ExpansionVoucher expansionVoucher;
        Image image;
        String str4;
        this.LLILLL = c18ly;
        this.LLILZ = str;
        this.LLILZIL = str2;
        if (Intrinsics.LJFF(str2, "video_anchor")) {
            str3 = "c92278.d2841";
        } else {
            str3 = "c5427.d8786";
        }
        this.LLILZLL = str3;
        PanelExpansionVoucher panelExpansionVoucher = c18ly.LIZIZ;
        if (panelExpansionVoucher == null || (((expansionVoucher = panelExpansionVoucher.expansionVoucher) != null && expansionVoucher.displayForm == 0) || !(!false))) {
            List<PanelVoucherInfo> list = c18ly.LIZ;
            if (list != null && (panelVoucherInfo = (PanelVoucherInfo) C13LP.LJJJLL(list)) != null) {
                LIZ(panelVoucherInfo, this.LLILZLL);
                return;
            }
            return;
        }
        final C18LM c18lm = new C18LM(this.LL.getContext());
        C786410Ut5.LJLLLLLL(0, this.LL);
        C786410Ut5.LJJJJI(this.LL);
        this.LL.addView(c18lm, -1, -2);
        final String str5 = this.LLILZLL;
        final Map<String, String> map = this.LLILLJJLI;
        c18lm.LLILZLL = C2097608Jq.LJIIL(map, C1104190eq9.LIZ(c18lm, str5));
        final ExpansionVoucher expansionVoucher2 = panelExpansionVoucher.expansionVoucher;
        if (expansionVoucher2 != null) {
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            Image image2 = panelExpansionVoucher.bannerIcon;
            SmartImageView ivVoucherIconFromXml = c18lm.getIvVoucherIconFromXml();
            AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(c18lm, 285);
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c18lm, 525);
            anchorBizUtils.getClass();
            AnchorBizUtils.LJJLIIIJLJLI(image2, ivVoucherIconFromXml, awS611S0100000_32, awS576S0100000_32);
            if (C960203pA.LIZIZ(c18lm.getContext())) {
                image = panelExpansionVoucher.bannerBgDark;
            } else {
                image = panelExpansionVoucher.bannerBg;
            }
            AnchorBizUtils.LJJLIIIJLJLI(image, c18lm.getIvVoucherBgFromXml(), null, null);
            c18lm.getTvVoucherTitleFromXml().setText(panelExpansionVoucher.bannerText);
            C21269818Lo c21269818Lo = C21269818Lo.LIZ;
            TuxTextView tvVoucherTitleFromXml = c18lm.getTvVoucherTitleFromXml();
            c21269818Lo.getClass();
            C21269818Lo.LIZIZ(tvVoucherTitleFromXml);
            c18lm.getTvVoucherContentFromXml().setText(panelExpansionVoucher.bannerDescText);
            TuxTextView tvVoucherContentFromXml = c18lm.getTvVoucherContentFromXml();
            c21269818Lo.getClass();
            C21269818Lo.LIZIZ(tvVoucherContentFromXml);
            c18lm.getVoucherActionBtnFromXml().setText(panelExpansionVoucher.bannerButtonText);
            C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.18LN
                @Override // X.AbstractViewOnClickListenerC420730Ged
                public final void LIZ(View view) {
                    String str6;
                    String str7;
                    String str8;
                    String str9;
                    InterfaceC497601wk lifecycleScope;
                    Map<String, String> map2;
                    String str10;
                    if (view != null) {
                        ExpansionVoucher expansionVoucher3 = expansionVoucher2;
                        int i = expansionVoucher3.displayForm;
                        if (i != 1) {
                            if (i == 2) {
                                c18lm.LIZ(expansionVoucher3);
                                c18lm.LIZJ(expansionVoucher2);
                            }
                        } else {
                            C18LM c18lm2 = c18lm;
                            String str11 = str5;
                            c18lm2.getClass();
                            String str12 = (String) ((HashMap) C1104190eq9.LIZ(c18lm2, str11)).get("btm");
                            PanelVoucherInfo panelVoucherInfo2 = expansionVoucher3.expandedVoucherInfo;
                            if (panelVoucherInfo2 != null) {
                                str6 = panelVoucherInfo2.voucherTypeId;
                            } else {
                                str6 = null;
                            }
                            Integer numValueOf = Integer.valueOf(expansionVoucher3.displayForm);
                            PanelVoucherInfo panelVoucherInfo3 = expansionVoucher3.basicVoucherInfo;
                            if (panelVoucherInfo3 != null) {
                                str7 = panelVoucherInfo3.voucherTypeId;
                                str8 = panelVoucherInfo3.voucherId;
                                BcmStandardTrack bcmStandardTrack = panelVoucherInfo3.bcmStandardTrack;
                                if (bcmStandardTrack != null && (map2 = bcmStandardTrack.trackParam) != null) {
                                    str9 = map2.get("bcm_coupon_id");
                                } else {
                                    str9 = null;
                                }
                            } else {
                                str7 = null;
                                str8 = null;
                                str9 = null;
                            }
                            ClaimExpansionVoucherRequest claimExpansionVoucherRequest = new ClaimExpansionVoucherRequest("video_multi_anchor", str6, numValueOf, str7, str8, str9, str12, 3, null);
                            LifecycleOwner lifecycleOwnerLIZ = C843803Rk.LIZ(c18lm2.getContext());
                            if (lifecycleOwnerLIZ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) == null) {
                                lifecycleScope = C817503Hh.LL;
                            }
                            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C18LO(claimExpansionVoucherRequest, c18lm2, expansionVoucher3, null), 2);
                        }
                        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
                        int i2 = expansionVoucher2.displayForm;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                str10 = "";
                            } else {
                                str10 = "to_upgrade";
                            }
                        } else {
                            str10 = "get_new_voucher";
                        }
                        String str13 = (String) map.get("enter_from");
                        String str14 = (String) map.get("entrance_form");
                        c21271918Mj.getClass();
                        C1018703yb.LIZLLL("tiktokec_module_click", new AwS1S4000000_26(str13, str14, str10, 0));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(700L);
                }
            }, c18lm.getVoucherActionBtnFromXml());
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            int i = expansionVoucher2.displayForm;
            if (i != 1) {
                if (i != 2) {
                    str4 = "";
                } else {
                    str4 = "to_upgrade";
                }
            } else {
                str4 = "get_new_voucher";
            }
            String str6 = map.get("enter_from");
            String str7 = map.get("entrance_form");
            c21271918Mj.getClass();
            C1018703yb.LIZLLL("tiktokec_module_show", new AwS1S4000000_26(str6, str7, str4, 1));
        }
    }
}
