package com.ss.android.ugc.aweme.poi.osp.component;

import X.C01GW;
import X.C1189060h32;
import X.C1308910kAL;
import X.C1558360qeg;
import X.C1558520qew;
import X.C452501pT;
import X.InterfaceC1192660h8q;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitCashierAbility;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PaymentInfoData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitCashierAssem extends BaseSlashReusedComponent<PaymentInfoData> {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1656));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e5_;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        ViewGroup viewGroup;
        PoiOrderSubmitCashierAbility poiOrderSubmitCashierAbility;
        InterfaceC1192660h8q interfaceC1192660h8qN8;
        super.onViewCreated(view);
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ == null || (poiOrderSubmitCashierAbility = (PoiOrderSubmitCashierAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiOrderSubmitCashierAbility.class, null)) == null || (interfaceC1192660h8qN8 = poiOrderSubmitCashierAbility.n8()) == null || (view2 = interfaceC1192660h8qN8.LIZJ()) == null) {
            view2 = new View(view.getContext());
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, view.getContext());
        if (numLIZJ != null) {
            view2.setBackgroundColor(numLIZJ.intValue());
        }
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(view2);
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public final void up(PaymentInfoData paymentInfoData) {
        ViewGroup viewGroup;
        View childAt;
        Fragment fragmentLJIIJ;
        PoiOrderSubmitCashierAbility poiOrderSubmitCashierAbility;
        InterfaceC1192660h8q interfaceC1192660h8qN8;
        super.up(paymentInfoData);
        if (getContext() != null) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null && (childAt = viewGroup.getChildAt(0)) != null && (fragmentLJIIJ = C1189060h32.LJIIJ(this)) != null && (poiOrderSubmitCashierAbility = (PoiOrderSubmitCashierAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiOrderSubmitCashierAbility.class, null)) != null && (interfaceC1192660h8qN8 = poiOrderSubmitCashierAbility.n8()) != null) {
                interfaceC1192660h8qN8.LJIILIIL(childAt, C1189060h32.LJIIJ(this));
            }
        }
    }
}
