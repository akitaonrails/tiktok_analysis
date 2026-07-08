package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C0I7D;
import X.C1019103yf;
import X.C13LE;
import X.C13LP;
import X.C1743750vTh;
import X.C1745300vWC;
import X.C1745680vWo;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452501pT;
import X.C7741030p;
import X.C7742030q;
import X.C814420VxA;
import X.C992303uL;
import X.EnumC1014603xw;
import X.InterfaceC998610c5r;
import Y.ARunnableS106S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import eha.a0;
import java.util.List;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class DoubleTextItemViewHolder extends ECJediViewHolder<C1745680vWo> implements InterfaceC998610c5r {
    public final AddressEditFragment LLJILJIL;
    public final C01GW LLJILJILJ;
    public a0 LLJILLL;
    public a0 LLJJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        a0 a0Var = this.LLJILLL;
        if (a0Var != null && a0Var.w2()) {
            return a0Var.l();
        }
        a0 a0Var2 = this.LLJJ;
        if (a0Var2 != null && a0Var2.w2()) {
            return a0Var2.l();
        }
        a0 a0Var3 = this.LLJILLL;
        if (a0Var3 != null) {
            return a0Var3.l();
        }
        return null;
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        a0 a0Var = this.LLJILLL;
        if (a0Var == null) {
            return false;
        }
        if (a0Var.w2()) {
            return true;
        }
        a0 a0Var2 = this.LLJJ;
        if (a0Var2 != null) {
            return a0Var2.w2();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        a0 a0Var = this.LLJILLL;
        if (a0Var != null) {
            CandHelper candHelper = a0Var.LLILZLL;
            PopupWindow popupWindow = candHelper.LIZJ;
            if (popupWindow == null) {
                popupWindow = null;
            }
            popupWindow.dismiss();
            candHelper.LJIILIIL.removeMessages(1);
        }
        a0 a0Var2 = this.LLJJ;
        if (a0Var2 != null) {
            CandHelper candHelper2 = a0Var2.LLILZLL;
            PopupWindow popupWindow2 = candHelper2.LIZJ;
            (popupWindow2 != null ? popupWindow2 : null).dismiss();
            candHelper2.LJIILIIL.removeMessages(1);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        List list;
        a0 a0Var;
        C0I7D c0i7dL;
        String str;
        Object obj2 = ((C1745680vWo) obj).LIZIZ;
        if ((obj2 instanceof List) && (list = (List) obj2) != null) {
            C1745300vWC c1745300vWC = (C1745300vWC) this.itemView.findViewById(R.id.ml_);
            C1745300vWC c1745300vWC2 = (C1745300vWC) this.itemView.findViewById(R.id.tmj);
            C1745680vWo c1745680vWo = (C1745680vWo) C13LP.LJJJLZIJ(0, list);
            if (c1745680vWo != null) {
                if (this.LLJILLL == null) {
                    if (c1745300vWC != null) {
                        c1745300vWC.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
                        this.LLJILLL = new a0(c1745300vWC, this.LLJILJIL, (AddressEditViewModel) this.LLJILJILJ.getValue(), true);
                    }
                    if ((C7741030p.LIZ() || C7742030q.LIZ()) && c1745680vWo.LJFF) {
                        Object obj3 = c1745680vWo.LIZIZ;
                        if ((!(obj3 instanceof String) || (str = (String) obj3) == null || str.length() == 0) && (a0Var = this.LLJILLL) != null && (c0i7dL = a0Var.l()) != null) {
                            try {
                                HandlerHook.viewPostDelay(c0i7dL, new ARunnableS106S0100000_6((Object) c0i7dL, 208), 200L);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR40;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("GECC EditText.focus(), ");
                                sbLIZ.append(e);
                                C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
                            }
                        }
                    }
                }
                a0 a0Var2 = this.LLJILLL;
                if (a0Var2 != null) {
                    a0Var2.LIZJ(c1745680vWo);
                }
            }
            C1745680vWo c1745680vWo2 = (C1745680vWo) C13LP.LJJJLZIJ(1, list);
            if (c1745680vWo2 != null) {
                if (this.LLJJ == null && c1745300vWC2 != null) {
                    if (c1745300vWC != null) {
                        c1745300vWC.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
                    }
                    c1745300vWC2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
                    this.LLJJ = new a0(c1745300vWC2, this.LLJILJIL, (AddressEditViewModel) this.LLJILJILJ.getValue(), true);
                }
                a0 a0Var3 = this.LLJJ;
                if (a0Var3 != null) {
                    a0Var3.LIZJ(c1745680vWo2);
                }
            }
        }
    }

    public DoubleTextItemViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aib, viewGroup));
        this.LLJILJIL = addressEditFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 19));
    }
}
