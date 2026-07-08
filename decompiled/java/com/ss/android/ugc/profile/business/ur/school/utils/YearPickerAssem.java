package com.ss.android.ugc.profile.business.ur.school.utils;

import X.C019F;
import X.C061R;
import X.C1246150iX7;
import X.C13LE;
import X.C13LZ;
import X.C15438062q;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1846520y9S;
import X.C19719912Dl;
import X.C19737012Ka;
import X.C2217381BqS;
import X.C531650Kt9;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC489860JIy;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.school.utils.YearPickerAssem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class YearPickerAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C061R.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public C19737012Ka LLJJIJI;
    public final Map<Integer, Integer> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(YearPickerAssem.class, "yearPickerVM", "getYearPickerVM()Lcom/ss/android/ugc/profile/business/ur/school/utils/YearPickerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public YearPickerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(YearPickerViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 886), AFwS232S0000000_4.get$arr$(128), null, true);
        this.LLJJIJIIJIL = new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        String str;
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        C1246150iX7.LIZ.getClass();
        int i = C1246150iX7.LIZ().graduationYearMax;
        int i2 = C1246150iX7.LIZ().graduationYearMin;
        ArrayList arrayList = new ArrayList();
        C061R c061r = (C061R) this.LLJJI.getValue();
        int i3 = 0;
        if (c061r != null && (str = c061r.LL) != null) {
            this.LLJJIJIIJIL.put(-1, 0);
            arrayList.add(str);
            i3 = 1;
        }
        C1846520y9S c1846520y9SLJIIIZ = C13LZ.LJIIIZ(i, i2);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(c1846520y9SLJIIIZ, 10));
        C531650Kt9 it2 = c1846520y9SLJIIIZ.iterator();
        while (it2.LLILLL) {
            int iNextInt = it2.nextInt();
            this.LLJJIJIIJIL.put(Integer.valueOf(iNextInt), Integer.valueOf(i3));
            arrayList2.add(Boolean.valueOf(arrayList.add(String.valueOf(iNextInt))));
            i3++;
        }
        C19737012Ka c19737012Ka = new C19737012Ka(context, null, 6);
        c19737012Ka.LJ(c19737012Ka.LIZLLL(arrayList), new InterfaceC489860JIy() { // from class: X.0DhR
            @Override // X.InterfaceC489860JIy
            public final void LIZ(int i4, String str2) {
                Integer numValueOf;
                try {
                    AssemVMLazy assemVMLazy = this.LIZ.LLJJIII;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = YearPickerAssem.LLJJIJIL;
                    AssemViewModel value = assemVMLazy.getValue();
                    if (str2 != null) {
                        numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str2));
                    } else {
                        numValueOf = null;
                    }
                    value.setState(new AwS583S0100000_4(numValueOf, 327));
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AssemVMLazy assemVMLazy2 = this.LIZ.LLJJIII;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = YearPickerAssem.LLJJIJIL;
                    assemVMLazy2.getValue().setState(new AwS583S0100000_4((Integer) null, 327));
                }
            }
        });
        Zo(c19737012Ka);
        this.LLJJIJI = c19737012Ka;
        super.xo();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0DKO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2005407tM) obj).LL;
            }
        }, null, new AwS618S0100000_4(this, 42), 6);
    }
}
