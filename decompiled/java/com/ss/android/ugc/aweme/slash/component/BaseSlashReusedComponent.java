package com.ss.android.ugc.aweme.slash.component;

import X.C1174000gek;
import X.C1174850gg7;
import X.C1180170goh;
import X.C1558520qew;
import X.C2211631BhB;
import X.C724270Sb3;
import X.InterfaceC1173990gej;
import X.InterfaceC1181010gq3;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseSlashReusedComponent<T extends BaseComponentData> extends ReusedUISlotAssem<BaseSlashReusedComponent<T>> implements InterfaceC1173990gej<T>, InterfaceC712990Rxx<T> {
    public View LLJJLIIIJLLLLLLLZ;

    @Override // X.InterfaceC1173990gej
    public final Map<String, String> vt() {
        return null;
    }

    @Override // X.InterfaceC1173990gej
    public final String S2() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((BaseComponentData) (c724270Sb3 != null ? c724270Sb3.LL : null)).instanceId;
    }

    @Override // X.InterfaceC1173990gej
    public final T B() {
        return (T) C1174850gg7.LIZJ(this);
    }

    @Override // X.InterfaceC1173990gej
    public final InterfaceC1181010gq3 BK2() {
        return C1174850gg7.LIZ(this);
    }

    public String IY1() {
        return C1174850gg7.LIZIZ(this);
    }

    @Override // X.InterfaceC1173990gej
    public final String Wc() {
        return C1174850gg7.LJFF(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1174000gek c1174000gekBr;
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18((BaseSlashReusedComponent) this, 2232));
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ == null || (c1174000gekBr = interfaceC1181010gq3LIZ.Br()) == null) {
            return;
        }
        c1174000gekBr.LJFF(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18((BaseSlashReusedComponent) this, 2233));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18((BaseSlashReusedComponent) this, 2234));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18((BaseSlashReusedComponent) this, 2231));
    }

    public void unBind() {
        C1174000gek c1174000gekBr;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null && (c1174000gekBr = interfaceC1181010gq3LIZ.Br()) != null) {
            c1174000gekBr.LJI(this);
        }
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18((BaseSlashReusedComponent) this, 2237));
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18((BaseSlashReusedComponent) this, 2235));
    }

    public void fm1() {
        C1174850gg7.LJII(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C1174000gek c1174000gekBr;
        C1174000gek c1174000gekBr2;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null && (c1174000gekBr2 = interfaceC1181010gq3LIZ.Br()) != null) {
            c1174000gekBr2.LJII(this);
        }
        this.LLJJLIIIJLLLLLLLZ = view;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ2 != null && (c1174000gekBr = interfaceC1181010gq3LIZ2.Br()) != null) {
            c1174000gekBr.LJJ(this, view);
        }
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18((BaseSlashReusedComponent) this, 2236));
        C2211631BhB.LJ(view, new AwS597S0100000_18((BaseSlashReusedComponent) this, 564));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op */
    public void up(T t) {
        C1174000gek c1174000gekBr;
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C1174850gg7.LJI(this, view, C1558520qew.LJIIL(this));
        }
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18((BaseSlashReusedComponent) this, 2230));
        LJJIJL().setTag(-916066015, S2());
        LJJIJL().setTag(-1990768404, C1174850gg7.LJFF(this));
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null && (c1174000gekBr = interfaceC1181010gq3LIZ.Br()) != null) {
            c1174000gekBr.LJIIJJI(this, t);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void vr(Object obj) {
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18((BaseSlashReusedComponent) this, 2568));
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
