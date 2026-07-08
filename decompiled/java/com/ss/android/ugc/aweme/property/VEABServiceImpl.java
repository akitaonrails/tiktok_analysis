package com.ss.android.ugc.aweme.property;

import X.C1954807lC;
import X.C2208671BcP;
import X.C2208681BcQ;
import X.C2208701BcS;
import X.EnumC2208691BcR;
import X.InterfaceC2208731BcV;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.IVEABService;
import java.util.Map;
import kotlin.Pair;
import lth.o;

/* JADX INFO: loaded from: classes35.dex */
public final class VEABServiceImpl implements IVEABService {
    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final void clearPanel() {
        C2208681BcQ c2208681BcQLJ = o.LJJIFFI.LJ();
        synchronized (c2208681BcQLJ) {
            c2208681BcQLJ.LIZIZ.clear();
            c2208681BcQLJ.LIZ.edit().clear().apply();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final Map<String, InterfaceC2208731BcV> getVESDKABPropertyMap() {
        o.LJJIFFI.getClass();
        return C2208671BcP.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final Pair<Object, Integer> getABValue(InterfaceC2208731BcV interfaceC2208731BcV) {
        return o.LJJIFFI.LIZ(interfaceC2208731BcV);
    }

    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final void setABPanelValue(InterfaceC2208731BcV interfaceC2208731BcV, String str) {
        C2208671BcP c2208671BcP = o.LJJIFFI;
        if (str == null) {
            C2208681BcQ c2208681BcQLJ = c2208671BcP.LJ();
            synchronized (c2208681BcQLJ) {
                c2208681BcQLJ.LIZIZ.remove(interfaceC2208731BcV.key());
                interfaceC2208731BcV.LIZIZ();
                c2208681BcQLJ.LIZ.edit().remove(interfaceC2208731BcV.key()).apply();
            }
            return;
        }
        c2208671BcP.getClass();
        EnumC2208691BcR enumC2208691BcRType = interfaceC2208731BcV.type();
        if (enumC2208691BcRType != null) {
            int i = C2208701BcS.LIZ[enumC2208691BcRType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                c2208671BcP.LJ().LJIIIIZZ(interfaceC2208731BcV, str);
                                return;
                            }
                        } else {
                            c2208671BcP.LJ().LJFF(interfaceC2208731BcV, CastFloatProtector.parseFloat(str));
                            return;
                        }
                    } else {
                        c2208671BcP.LJ().LJII(interfaceC2208731BcV, CastLongProtector.parseLong(str));
                        return;
                    }
                } else {
                    c2208671BcP.LJ().LJI(interfaceC2208731BcV, CastIntegerProtector.parseInt(str));
                    return;
                }
            } else {
                try {
                    c2208671BcP.LJ().LJ(interfaceC2208731BcV, Boolean.parseBoolean(str));
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
        throw new C1954807lC();
    }
}
