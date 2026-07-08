package com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem;

import X.C03H5;
import X.C14IR;
import X.C2485509ob;
import X.C461020I6a;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C869590Y9l;
import X.InterfaceC1587906Jp;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.ARunnableS114S0100000_14;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS258S0300000_14;
import kotlin.jvm.internal.AwS415S0200000_14;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ReusedSkeletonUISlotAssem<RECEIVER extends C03H5, ITEM> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<InterfaceC461380I7k> {
    public final C14IR LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public Function0<Unit> LLJLILLLLZIIL;
    public final BPEAHandler LLJLL = new BPEAHandler(Looper.getMainLooper());

    public abstract void Ap(View view);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        this.LLJLIL = true;
    }

    public void sp() {
    }

    public abstract void tp(C869590Y9l c869590Y9l, ITEM item);

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public void yp() {
    }

    public void zp() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (this.LLJLIL) {
            this.LLJLIL = false;
            if (C2485509ob.LIZ()) {
                zp();
            } else {
                C786410Ut5.LJJZZIII(this.LLJLL, new ARunnableS114S0100000_14(this, 16));
            }
        }
    }

    public final Object op() {
        T t;
        C724270Sb3 c724270Sb3 = this.LLJI;
        C461020I6a<? extends Object> c461020I6a = ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILII().LIZJ.get(this.LLJJLIIIJLLLLLLLZ);
        if (c461020I6a != null && (t = c461020I6a.LIZ) != 0) {
            return t;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public ReusedSkeletonUISlotAssem(C14IR c14ir) {
        this.LLJJLIIIJLLLLLLLZ = c14ir;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        LifecycleOwner hostLifecycleOwner = getHostLifecycleOwner();
        if (hostLifecycleOwner instanceof Fragment) {
            Fragment fragment = (Fragment) hostLifecycleOwner;
            if (fragment.getFragmentManager() == null || fragment.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                return;
            }
        } else if (hostLifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        Ap(view);
        sp();
        LJJIJL().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(this, 4));
        Function0<Unit> function0 = this.LLJLILLLLZIIL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLJLILLLLZIIL = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC461380I7k interfaceC461380I7k) {
        AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14((ReusedSkeletonUISlotAssem) this, (ReusedSkeletonUISlotAssem<C03H5, Object>) interfaceC461380I7k, (InterfaceC461380I7k) 93);
        if (this.LLJL) {
            awS415S0200000_14.invoke();
        } else {
            this.LLJLILLLLZIIL = awS415S0200000_14;
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC461380I7k interfaceC461380I7k) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC461380I7k interfaceC461380I7k) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        AwS258S0300000_14 awS258S0300000_14 = new AwS258S0300000_14(list, (List<? extends Object>) this, (ReusedSkeletonUISlotAssem<C03H5, Object>) interfaceC1587906Jp, (InterfaceC461380I7k) 16);
        if (this.LLJL) {
            awS258S0300000_14.invoke();
        } else {
            this.LLJLILLLLZIIL = awS258S0300000_14;
        }
    }

    public void up(C869590Y9l c869590Y9l, ITEM item, boolean z) {
        tp(c869590Y9l, item);
    }
}
