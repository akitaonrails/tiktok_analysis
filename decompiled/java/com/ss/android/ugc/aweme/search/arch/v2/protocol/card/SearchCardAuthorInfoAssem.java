package com.ss.android.ugc.aweme.search.arch.v2.protocol.card;

import X.C07E5;
import X.C0PXI;
import X.C10EU;
import X.C1559260qg8;
import X.C1838907Id;
import X.C1908030zkf;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C437920HFe;
import X.C657150Pq5;
import X.C661350Pwr;
import X.C662390PyX;
import X.C723580SZw;
import X.C814420VxA;
import X.C823050WQl;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC712990Rxx;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardAuthorInfoAssem extends ReusedUISlotAssem<SearchCardAuthorInfoAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public C427870Gq9 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxIconView LLJLIL;
    public final C1559260qg8 LLJLILLLLZIIL = new C1559260qg8(new C723580SZw(this, C437920HFe.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.etw;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C427870Gq9 c427870Gq9;
        this.LLJJLIIIJLLLLLLLZ = (C427870Gq9) view.findViewById(R.id.bbz);
        if (C1838907Id.LIZ() && (c427870Gq9 = this.LLJJLIIIJLLLLLLLZ) != null) {
            C662390PyX.LIZ.getClass();
            C662390PyX.LJ(c427870Gq9, true);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.bc9);
        this.LLJL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setTextDirection(5);
        }
        this.LLJLIL = (TuxIconView) view.findViewById(R.id.bcd);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        int iLIZIZ;
        Integer num;
        int iIntValue;
        Integer num2;
        int iIntValue2;
        Integer num3;
        String strLIZIZ;
        User author = interfaceC435460H5s.getAweme().getAuthor();
        if (author == null) {
            C661350Pwr.LIZJ(this.LLJJLIIIJLLLLLLLZ);
            C661350Pwr.LIZJ(this.LLJL);
            C661350Pwr.LIZJ(this.LLJLIL);
            return;
        }
        C427870Gq9 c427870Gq9 = this.LLJJLIIIJLLLLLLLZ;
        if (c427870Gq9 != null) {
            C661350Pwr.LJIIL(c427870Gq9);
        }
        C823050WQl.LIZJ().execute(new ARunnableS79S0200000_10(author, this, 48));
        C661350Pwr.LJIIL(this.LLJL);
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            if (C10EU.LJIJ(author)) {
                C657150Pq5.LIZ.getClass();
                strLIZIZ = C657150Pq5.LIZJ(author);
            } else {
                C657150Pq5.LIZ.getClass();
                strLIZIZ = C657150Pq5.LIZIZ(author);
            }
            tuxTextView.setText(strLIZIZ);
        }
        TuxTextView tuxTextView2 = this.LLJL;
        if (tuxTextView2 != null) {
            C437920HFe c437920HFe = (C437920HFe) this.LLJLILLLLZIIL.getValue();
            if (c437920HFe != null && (num3 = c437920HFe.LL) != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = R.attr.zi;
            }
            tuxTextView2.setTextColorRes(iIntValue2);
        }
        TuxTextView tuxTextView3 = this.LLJL;
        if (tuxTextView3 != null) {
            C437920HFe c437920HFe2 = (C437920HFe) this.LLJLILLLLZIIL.getValue();
            if (c437920HFe2 != null && (num2 = c437920HFe2.LLILLJJLI) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 62;
            }
            tuxTextView3.setTuxFont(iIntValue);
        }
        TuxTextView tuxTextView4 = this.LLJL;
        if (tuxTextView4 != null) {
            C437920HFe c437920HFe3 = (C437920HFe) this.LLJLILLLLZIIL.getValue();
            if (c437920HFe3 != null && (num = c437920HFe3.LLILLL) != null) {
                iLIZIZ = num.intValue();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            }
            C0PXI.LIZIZ(tuxTextView4, iLIZIZ);
        }
        if (C1908030zkf.LIZLLL(new UserVerify(null, author.getCustomVerify(), author.getEnterpriseVerifyReason(), -1))) {
            C661350Pwr.LJIIL(this.LLJLIL);
        } else {
            C661350Pwr.LIZJ(this.LLJLIL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
