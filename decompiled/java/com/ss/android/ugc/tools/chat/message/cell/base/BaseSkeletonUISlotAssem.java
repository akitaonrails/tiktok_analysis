package com.ss.android.ugc.tools.chat.message.cell.base;

import X.C03H5;
import X.C0BA3;
import X.C0H94;
import X.C0IB2;
import X.C0IDR;
import X.C13IQ;
import X.C19719912Dl;
import X.C218800ss;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C910260ZnM;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseSkeletonUISlotAssem<RECEIVER extends C03H5, ITEM extends C0H94> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<C910260ZnM> {
    public final C13IQ<? extends Object> LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final BPEAHandler LLJLILLLLZIIL = new BPEAHandler(Looper.getMainLooper());

    public abstract void sp(C0H94 c0h94);

    public void tp() {
    }

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
    }

    public abstract void up(View view);

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public void yp() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (C0IB2.LIZ()) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LLJLILLLLZIIL, new ARunnableS106S0100000_6(this, 131));
    }

    public BaseSkeletonUISlotAssem(C19719912Dl c19719912Dl) {
        this.LLJJLIIIJLLLLLLLZ = c19719912Dl;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        up(view);
        LJJIJL().addOnAttachStateChangeListener(new C0IDR(this, 6));
        if (this.LLJLIL) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (this.LLJL) {
                op(null);
            } else {
                this.LLJLIL = true;
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = true;
    }

    public final void op(List list) {
        C0H94 c0h94;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        Object obj2 = ((LinkedHashMap) ((C910260ZnM) obj).LLILZIL).get(this.LLJJLIIIJLLLLLLLZ);
        if ((obj2 instanceof C0H94) && (c0h94 = (C0H94) obj2) != null) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            yp();
            if (((Boolean) C0BA3.LIZ.getValue()).booleanValue() && list != null) {
                for (Object obj3 : list) {
                    if ((obj3 instanceof C218800ss) && ((C218800ss) obj3).LIZ.contains(this.LLJJLIIIJLLLLLLLZ)) {
                        return;
                    }
                }
            }
            sp(c0h94);
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        tp();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C910260ZnM c910260ZnM) {
        if (this.LLJL) {
            op(null);
        } else {
            this.LLJLIL = true;
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C910260ZnM c910260ZnM) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C910260ZnM c910260ZnM) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        if (this.LLJL) {
            op(list);
        } else {
            this.LLJLIL = true;
        }
    }
}
