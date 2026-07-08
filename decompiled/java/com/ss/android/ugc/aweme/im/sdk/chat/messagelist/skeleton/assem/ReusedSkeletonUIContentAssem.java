package com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem;

import X.C03H5;
import X.C0IB1;
import X.C0IDR;
import X.C14IR;
import X.C461020I6a;
import X.C724270Sb3;
import X.C869590Y9l;
import X.InterfaceC1587906Jp;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ReusedSkeletonUIContentAssem<RECEIVER extends C03H5, ITEM> extends ReusedUIContentAssem<RECEIVER> implements InterfaceC712990Rxx<InterfaceC461380I7k> {
    public final C14IR LLJJJJ;

    public void dp() {
    }

    public abstract void ep(C869590Y9l c869590Y9l, ITEM item);

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
    }

    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final Object cp() {
        T t;
        C724270Sb3 c724270Sb3 = this.LLJI;
        C461020I6a<? extends Object> c461020I6a = ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILII().LIZJ.get(this.LLJJJJ);
        if (c461020I6a != null && (t = c461020I6a.LIZ) != 0) {
            return t;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public ReusedSkeletonUIContentAssem(C14IR c14ir) {
        this.LLJJJJ = c14ir;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void Eo(View view) {
        LifecycleOwner hostLifecycleOwner = getHostLifecycleOwner();
        if (hostLifecycleOwner instanceof Fragment) {
            Fragment fragment = (Fragment) hostLifecycleOwner;
            if (fragment.getFragmentManager() == null || fragment.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                return;
            }
        } else if (hostLifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        dp();
        LJJIJL().addOnAttachStateChangeListener(new C0IDR(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC461380I7k interfaceC461380I7k) {
        hp(interfaceC461380I7k.LLILII().LIZ.LIZ, cp(), true);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC461380I7k interfaceC461380I7k) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC461380I7k interfaceC461380I7k) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        InterfaceC461380I7k interfaceC461380I7k = (InterfaceC461380I7k) interfaceC1587906Jp;
        if (C0IB1.LIZJ(list, this.LLJJJJ)) {
            hp(interfaceC461380I7k.LLILII().LIZ.LIZ, cp(), C0IB1.LIZ(list));
        }
    }

    public void hp(C869590Y9l c869590Y9l, ITEM item, boolean z) {
        ep(c869590Y9l, item);
    }
}
