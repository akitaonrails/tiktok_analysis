package com.ss.android.ugc.aweme.poi.osp.component;

import X.C01GW;
import X.C1174850gg7;
import X.C1189060h32;
import X.C1192740h8y;
import X.C2188811AlT;
import X.C337180DJs;
import X.C452501pT;
import X.InterfaceC1181010gq3;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.poi.osp.repo.model.CouponModuleData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.ss.android.ugc.aweme.slash.data.PageInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitCouponAssem extends BaseSlashReusedComponent<CouponModuleData> {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1657));
    public CouponModuleData LLJLIL;
    public String LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e5b;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    public final String IY1() {
        String couponTrackInfo;
        CouponModuleData couponModuleData = this.LLJLIL;
        return (couponModuleData == null || (couponTrackInfo = couponModuleData.getCouponTrackInfo()) == null) ? "" : couponTrackInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2 A[PHI: r17
      0x00a2: PHI (r17v3 java.util.Map<java.lang.String, java.lang.Object>) = (r17v0 java.util.Map<java.lang.String, java.lang.Object>), (r17v4 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:56:0x00a0, B:54:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8 A[PHI: r17
      0x00a8: PHI (r17v2 java.util.Map<java.lang.String, java.lang.Object>) = (r17v0 java.util.Map<java.lang.String, java.lang.Object>), (r17v3 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:56:0x00a0, B:58:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5  */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fm1() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitCouponAssem.fm1():void");
    }

    public final C1192740h8y sp() {
        return (C1192740h8y) this.LLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1189060h32.LJJIIJ(view, new AwS597S0100000_18(this, 423));
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public final void up(CouponModuleData couponModuleData) {
        String imprId;
        PageInfo pageInfoYW;
        LogPbBean logPbBean;
        super.up(couponModuleData);
        this.LLJLIL = couponModuleData;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttls_coupon_panel_cache_");
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null && (pageInfoYW = interfaceC1181010gq3LIZ.YW()) != null && (logPbBean = pageInfoYW.logPb) != null) {
            imprId = logPbBean.getImprId();
        } else {
            imprId = null;
        }
        sbLIZ.append(imprId);
        this.LLJLILLLLZIIL = C2188811AlT.LIZIZ(sbLIZ);
        sp().LLILLL.setText(couponModuleData.getTitle());
        TuxTextView tuxTextView = sp().LLILZ;
        String titleTag = couponModuleData.getTitleTag();
        if (titleTag == null) {
            titleTag = "";
        }
        tuxTextView.setText(titleTag);
        if (couponModuleData.getTitleTag() != null) {
            C337180DJs.LIZJ(sp().LLILZ);
        } else {
            C337180DJs.LIZIZ(sp().LLILZ);
        }
        if (couponModuleData.getDiscountAmount() != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("- ");
            sbLIZ2.append(couponModuleData.getDiscountAmount().symbol);
            sbLIZ2.append(couponModuleData.getDiscountAmount().amount);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C337180DJs.LIZJ(sp().LLILLJJLI);
            sp().LLILLJJLI.setText(strLIZIZ);
            return;
        }
        C337180DJs.LIZIZ(sp().LLILLJJLI);
    }
}
