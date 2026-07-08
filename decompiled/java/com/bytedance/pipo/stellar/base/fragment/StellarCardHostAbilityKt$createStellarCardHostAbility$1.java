package com.bytedance.pipo.stellar.base.fragment;

import X.C1720710usX;
import X.InterfaceC1720700usW;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarCardHostAbilityKt$createStellarCardHostAbility$1 implements StellarCardHostAbility {
    public final WeakHashMap<ViewOnAttachStateChangeListenerC20604515jv, InterfaceC1720700usW> LL = new WeakHashMap<>();
    public final /* synthetic */ Function0<InterfaceC1720700usW> LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public StellarCardHostAbilityKt$createStellarCardHostAbility$1(Function0<? extends InterfaceC1720700usW> function0) {
        this.LLILLJJLI = function0;
    }

    @Override // com.bytedance.pipo.stellar.base.fragment.StellarCardHostAbility
    public final InterfaceC1720700usW ju1(View view) {
        InterfaceC1720700usW interfaceC1720700usW;
        while (view != null) {
            if ((view instanceof ViewOnAttachStateChangeListenerC20604515jv) && (interfaceC1720700usW = this.LL.get(view)) != null) {
                return interfaceC1720700usW;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return this.LLILLJJLI.invoke();
    }

    @Override // com.bytedance.pipo.stellar.base.fragment.StellarCardHostAbility
    public final void Bz1(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C1720710usX c1720710usX) {
        this.LL.put(viewOnAttachStateChangeListenerC20604515jv, c1720710usX);
    }
}
