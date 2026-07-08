package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem;

import X.C0KUG;
import X.C1822330xWR;
import X.C1822530xWl;
import X.C1822780xXA;
import X.C1822790xXB;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C518260KUe;
import X.C736680Sv4;
import X.EnumC518250KUd;
import X.InterfaceC1822470xWf;
import X.InterfaceC1822900xXM;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceBioSingleDMAssem extends PcsServiceBioSingleSkuAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz3;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem
    public final int lp() {
        return R.attr.zp;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem
    public final String op() {
        return "dm";
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem
    public final int tp() {
        return 2131855966;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1822780xXA c1822780xXA = up().LLJIJIL;
        InterfaceC1822470xWf interfaceC1822470xWf = c1822780xXA.LIZJ;
        if (interfaceC1822470xWf != null) {
            interfaceC1822470xWf.LLLILZ();
        }
        C1822790xXB[] c1822790xXBArr = c1822780xXA.LIZIZ;
        for (C1822790xXB c1822790xXB : c1822790xXBArr) {
            c1822790xXB.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem
    public final void yp() {
        PcsServiceBioAbility pcsServiceBioAbilityMp = mp();
        if (pcsServiceBioAbilityMp != null) {
            pcsServiceBioAbilityMp.b81();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem
    public final void Bp(String str) {
        LinearLayout linearLayoutVd2;
        boolean z;
        int i;
        boolean z2;
        InterfaceC1822900xXM interfaceC1822900xXMLIZIZ;
        String schema = str;
        super.Bp(schema);
        PcsServiceBioAbility pcsServiceBioAbilityMp = mp();
        String str2 = null;
        if (pcsServiceBioAbilityMp != null) {
            linearLayoutVd2 = pcsServiceBioAbilityMp.vd2();
        } else {
            linearLayoutVd2 = null;
        }
        hp(linearLayoutVd2);
        Ap();
        boolean z3 = false;
        if (schema.length() == 0 && ((interfaceC1822900xXMLIZIZ = C1822530xWl.LIZIZ(up().LLJI)) == null || (schema = interfaceC1822900xXMLIZIZ.getSchema()) == null)) {
            return;
        }
        PcsServiceBioAbility pcsServiceBioAbilityMp2 = mp();
        if (pcsServiceBioAbilityMp2 != null && pcsServiceBioAbilityMp2.Zk0() != null) {
            z = false;
        } else {
            z = true;
        }
        if (!z && Intrinsics.LJFF(up().LLJJIII, schema)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadSchema no changed schema=");
            sbLIZ.append(schema);
            C20441214yg.LIZIZ("PcsServiceBioSingleDMAssem", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadSchema changed schema=");
            sbLIZ2.append(schema);
            C20441214yg.LIZIZ("PcsServiceBioSingleDMAssem", C2188811AlT.LIZIZ(sbLIZ2));
            PcsServiceBioAbility pcsServiceBioAbilityMp3 = mp();
            if (pcsServiceBioAbilityMp3 != null) {
                pcsServiceBioAbilityMp3.b81();
            }
            if (up().LLJJIII.length() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            int i2 = i ^ 1;
            C1822780xXA c1822780xXA = up().LLJIJIL;
            EnumC518250KUd enumC518250KUd = this.LLJJJJJIL;
            EnumC518250KUd enumC518250KUd2 = EnumC518250KUd.LOAD_FROM_CACHE;
            if (enumC518250KUd == enumC518250KUd2) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1822330xWR c1822330xWRSp = sp();
            if (c1822330xWRSp != null) {
                str2 = c1822330xWRSp.LL;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            c1822780xXA.LIZ(schema, true, z2, i2, str2, sp());
            PcsServiceBioAbility pcsServiceBioAbilityMp4 = mp();
            if (pcsServiceBioAbilityMp4 != null) {
                String str4 = this.LLJJJIL;
                if (str4 != null) {
                    str3 = str4;
                }
                if (this.LLJJJJJIL == enumC518250KUd2) {
                    z3 = true;
                }
                pcsServiceBioAbilityMp4.Fj1(str3, schema, z3);
            }
            up().LLJJIII = schema;
        }
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            C500260Jjc.LJIILIIL(linearLayout);
        }
        PcsServiceBioAbility pcsServiceBioAbilityMp5 = mp();
        if (pcsServiceBioAbilityMp5 != null) {
            pcsServiceBioAbilityMp5.kY(1);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        zp(view);
        C736680Sv4.LJIIIIZZ(this, up(), C0KUG.LL, null, new C518260KUe(this), 6);
        up().LLJIJIL.LIZIZ();
    }
}
