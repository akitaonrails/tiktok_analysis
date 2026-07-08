package com.ss.android.ugc.aweme.slash.component;

import X.C1002290cBn;
import X.C1173980gei;
import X.C1174000gek;
import X.C1174850gg7;
import X.C1180170goh;
import X.C1180920gpu;
import X.C1558520qew;
import X.InterfaceC1173960geg;
import X.InterfaceC1173970geh;
import X.InterfaceC1181010gq3;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import java.util.Map;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseSlashSlotAssemComponent<T extends BaseComponentData> extends UISlotAssem implements InterfaceC1173970geh<T> {
    public void Jr2(C1180920gpu c1180920gpu) {
    }

    public void hp(float f, float f2) {
    }

    public boolean nJ() {
        return false;
    }

    @Override // X.InterfaceC1173990gej
    public Map<String, String> vt() {
        return null;
    }

    @Override // X.InterfaceC1173990gej
    public final T B() {
        return (T) C1174850gg7.LIZJ(this);
    }

    public InterfaceC1181010gq3 BK2() {
        return C1174850gg7.LIZ(this);
    }

    @Override // X.InterfaceC1173990gej
    public final Map<String, EventModel> FN2() {
        return C1174850gg7.LIZLLL(this);
    }

    @Override // X.InterfaceC1173990gej
    public final String IY1() {
        return C1174850gg7.LIZIZ(this);
    }

    @Override // X.InterfaceC1173990gej
    public final String S2() {
        return C1173980gei.LIZ(this);
    }

    @Override // X.InterfaceC1173990gej
    public final String Wc() {
        return C1174850gg7.LJFF(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        C1002290cBn c1002290cBn;
        InterfaceC1181010gq3 interfaceC1181010gq3BK2;
        C1174000gek c1174000gekBr;
        super.onCreate();
        if (!C1173980gei.LIZIZ(this) && (interfaceC1181010gq3BK2 = BK2()) != null && (c1174000gekBr = interfaceC1181010gq3BK2.Br()) != null) {
            c1174000gekBr.LJII(this);
        }
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof C1002290cBn) || (c1002290cBn = (C1002290cBn) viewLJJIJL) == null) {
            return;
        }
        c1002290cBn.setOnDragEndListener(new AwS632S0100000_18((BaseSlashSlotAssemComponent) this, (BaseSlashSlotAssemComponent<BaseComponentData>) 262));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        C1174000gek c1174000gekBr;
        C1174000gek c1174000gekBr2;
        super.onDestroy();
        if (C1173980gei.LIZIZ(this)) {
            return;
        }
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 != null && (c1174000gekBr2 = interfaceC1181010gq3BK2.Br()) != null) {
            c1174000gekBr2.LJI(this);
        }
        InterfaceC1181010gq3 interfaceC1181010gq3BK22 = BK2();
        if (interfaceC1181010gq3BK22 == null || (c1174000gekBr = interfaceC1181010gq3BK22.Br()) == null) {
            return;
        }
        c1174000gekBr.LJFF(this);
    }

    @Override // X.InterfaceC1173970geh
    public final boolean yK1() {
        return C1173980gei.LIZIZ(this);
    }

    public void fm1() {
        C1174850gg7.LJII(this);
    }

    public void CG1(T t) {
        InterfaceC1181010gq3 interfaceC1181010gq3BK2;
        C1174000gek c1174000gekBr;
        C1173980gei.LIZLLL(this);
        View contentView = getContentView();
        InterfaceC1173960geg interfaceC1173960geg = C1180170goh.LIZ;
        contentView.setTag(-916066015, C1173980gei.LIZ(this));
        getContentView().setTag(-1990768404, C1174850gg7.LJFF(this));
        if (!C1173980gei.LIZIZ(this) && (interfaceC1181010gq3BK2 = BK2()) != null && (c1174000gekBr = interfaceC1181010gq3BK2.Br()) != null) {
            c1174000gekBr.LJIIJJI(this, t);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        InterfaceC1181010gq3 interfaceC1181010gq3BK2;
        C1174000gek c1174000gekBr;
        super.onViewCreated(view);
        C1173980gei.LIZJ(this, view, C1558520qew.LJIIL(this));
        if (!C1173980gei.LIZIZ(this) && (interfaceC1181010gq3BK2 = BK2()) != null && (c1174000gekBr = interfaceC1181010gq3BK2.Br()) != null) {
            c1174000gekBr.LJJ(this, view);
        }
    }

    public void La(View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        C1174850gg7.LJI(this, view, interfaceC665370Q7z);
    }
}
