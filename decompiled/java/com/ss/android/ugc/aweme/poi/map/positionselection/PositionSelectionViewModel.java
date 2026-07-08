package com.ss.android.ugc.aweme.poi.map.positionselection;

import X.C01GW;
import X.C1177960gl8;
import X.C1178620gmC;
import X.C1198600hIQ;
import X.C1207450hWh;
import X.C19741112Lp;
import X.C19EG;
import X.EnumC1205470hTV;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS0S0100020_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS156S0110000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PositionSelectionViewModel extends AssemViewModel<C1178620gmC> {
    public final String LL = "Local Service";
    public final String LLILLJJLI = "POI Claim";
    public boolean LLILLL;
    public C1177960gl8 LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1178620gmC(0);
    }

    public static boolean vQ2(Context context, boolean z) {
        TokenCert tokenCertWith;
        if (z) {
            C01GW c01gw = C1198600hIQ.LIZ;
            tokenCertWith = TokenCert.Companion.with("bpea-user_claim_poi_auto_popup_android");
        } else {
            C01GW c01gw2 = C1198600hIQ.LIZ;
            tokenCertWith = TokenCert.Companion.with("bpea-user_claim_poi_manual_popup_android");
        }
        C19741112Lp.LIZ.getClass();
        if (!C19741112Lp.LIZLLL(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
            EnumC1205470hTV enumC1205470hTVLIZ = null;
            if (iLocationServiceForLS != null) {
                enumC1205470hTVLIZ = iLocationServiceForLS.LIZ(context, tokenCertWith, null);
            }
            if (enumC1205470hTVLIZ != EnumC1205470hTV.SUCCESS) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void wQ2(double d, double d2) {
        this.LLILZ = new C1177960gl8(d, d2);
        if (this.LLILLL) {
            return;
        }
        withState(new AwS0S0100020_18(this, d, d2, 0));
    }

    public final void xQ2(C19EG c19eg, Fragment fragment, boolean z) {
        TokenCert tokenCertWith;
        if (!vQ2(c19eg, z)) {
            return;
        }
        C19741112Lp.LIZ.getClass();
        if (!C19741112Lp.LIZLLL(c19eg, "android.permission.ACCESS_COARSE_LOCATION")) {
            C01GW c01gw = C1198600hIQ.LIZ;
            if (z) {
                tokenCertWith = TokenCert.Companion.with("bpea-user_claim_poi_auto_popup_android");
            } else {
                tokenCertWith = TokenCert.Companion.with("bpea-user_claim_poi_manual_popup_android");
            }
            C1207450hWh.LIZ.LJJI(this.LL, this.LLILLJJLI, tokenCertWith, c19eg, null, new AwS156S0110000_18(this, fragment, z, 2), AFwS231S0000000_3.get$arr$(268), AFwS285S0000000_2.get$arr$(68));
            return;
        }
        withState(new AwS105S0110000_18(this, z, 22));
    }
}
