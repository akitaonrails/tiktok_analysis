package com.ss.android.ugc.aweme.poi.osp.component;

import X.C01GW;
import X.C1173300gdc;
import X.C1174850gg7;
import X.C1180090goZ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1187080gzq;
import X.C1189060h32;
import X.C1192550h8f;
import X.C1192560h8g;
import X.C1192650h8p;
import X.C1308910kAL;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2365509Or;
import X.C431260Gvc;
import X.C452501pT;
import X.C610220Nwa;
import X.InterfaceC1181010gq3;
import X.InterfaceC1192660h8q;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitCashierAbility;
import com.ss.android.ugc.aweme.poi.osp.repo.model.DisclaimerData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.DisclaimerInfoData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.HighlightWord;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitPrivacyPolicyAssem extends BaseSlashReusedComponent<DisclaimerInfoData> {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1668));
    public DisclaimerInfoData LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e5m;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    public final String IY1() {
        View view = this.LLJJLIIIJLLLLLLLZ;
        return String.valueOf(view != null ? view.hashCode() : 0);
    }

    public final C1192560h8g sp() {
        return (C1192560h8g) this.LLJL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    public final void fm1() {
        String mobProductIds;
        String str;
        DisclaimerData disclaimer;
        List<HighlightWord> list;
        String str2;
        Map<String, Object> trackInfo;
        C1173300gdc c1173300gdcQr0;
        C1174850gg7.LJII(this);
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        SkuListData skuListData = interfaceC1181010gq3LIZ != null ? (SkuListData) interfaceC1181010gq3LIZ.ta2(new C1180090goZ("osp_buy_sku_info")) : null;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(this);
        C1187080gzq c1187080gzq = (interfaceC1181010gq3LIZ2 == null || (c1173300gdcQr0 = interfaceC1181010gq3LIZ2.qr0()) == null) ? null : (C1187080gzq) c1173300gdcQr0.LIZ;
        String mobMerchantIds = skuListData != null ? skuListData.getMobMerchantIds() : null;
        if (mobMerchantIds == null) {
            mobMerchantIds = "";
        }
        if (skuListData == null || (mobProductIds = skuListData.getMobProductIds()) == null) {
            mobProductIds = "";
        }
        if (c1187080gzq == null || (str = c1187080gzq.LIZ) == null) {
            str = "";
        }
        PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "order_submit_page");
        linkedHashMap.put("poi_id", str);
        linkedHashMap.put("merchant_ids", mobMerchantIds);
        linkedHashMap.put("product_ids", mobProductIds);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("show_terms_and_policy_module", linkedHashMap, c1185050gwZ);
        DisclaimerInfoData disclaimerInfoData = this.LLJLIL;
        if (disclaimerInfoData == null || (disclaimer = disclaimerInfoData.getDisclaimer()) == null || (list = disclaimer.highlightWords) == null) {
            return;
        }
        for (HighlightWord highlightWord : list) {
            C1192650h8p c1192650h8p = c1187080gzq != null ? c1187080gzq.LJFF : null;
            String str3 = highlightWord.name;
            if (str3 == null) {
                str3 = "";
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("enter_from", "order_submit_page");
            if (c1187080gzq == null || (str2 = c1187080gzq.LIZ) == null) {
                str2 = "";
            }
            linkedHashMap2.put("poi_id", str2);
            C1189060h32.LJII((c1192650h8p == null || (trackInfo = c1192650h8p.getTrackInfo()) == null) ? null : C2365509Or.LJ(trackInfo), linkedHashMap2);
            C610220Nwa.LIZIZ(PageFinder.via(C1189060h32.LJIIJ(this)), str3, linkedHashMap2);
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        PoiOrderSubmitCashierAbility poiOrderSubmitCashierAbility;
        InterfaceC1192660h8q interfaceC1192660h8qN8;
        super.onViewCreated(view);
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ == null || (poiOrderSubmitCashierAbility = (PoiOrderSubmitCashierAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiOrderSubmitCashierAbility.class, null)) == null || (interfaceC1192660h8qN8 = poiOrderSubmitCashierAbility.n8()) == null || (view2 = interfaceC1192660h8qN8.LJIILL(sp().LLILLJJLI)) == null) {
            view2 = new View(sp().LLILLJJLI.getContext());
        }
        sp().LLILLJJLI.addView(view2);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public final void up(DisclaimerInfoData disclaimerInfoData) {
        SpannableStringBuilder spannableStringBuilderLIZ;
        View childAt;
        Fragment fragmentLJIIJ;
        PoiOrderSubmitCashierAbility poiOrderSubmitCashierAbility;
        InterfaceC1192660h8q interfaceC1192660h8qN8;
        int iIntValue;
        int iIntValue2;
        Integer numLIZJ;
        Integer numLIZJ2;
        super.up(disclaimerInfoData);
        TuxTextView tuxTextView = sp().LLILLL;
        DisclaimerData disclaimer = disclaimerInfoData.getDisclaimer();
        if (disclaimer != null) {
            Context context = getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context)) != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1i, context2)) != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            spannableStringBuilderLIZ = C1192550h8f.LIZ(disclaimer, 71, numValueOf, 72, iIntValue2, new AwS597S0100000_18(this, 430));
        } else {
            spannableStringBuilderLIZ = null;
        }
        tuxTextView.setText(spannableStringBuilderLIZ);
        sp().LLILLL.setMovementMethod(C431260Gvc.LIZ);
        this.LLJLIL = disclaimerInfoData;
        if (getContext() != null && (childAt = sp().LLILLJJLI.getChildAt(0)) != null && (fragmentLJIIJ = C1189060h32.LJIIJ(this)) != null && (poiOrderSubmitCashierAbility = (PoiOrderSubmitCashierAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiOrderSubmitCashierAbility.class, null)) != null && (interfaceC1192660h8qN8 = poiOrderSubmitCashierAbility.n8()) != null) {
            C1189060h32.LJIIJ(this);
            interfaceC1192660h8qN8.LJIIJ(childAt);
        }
    }
}
