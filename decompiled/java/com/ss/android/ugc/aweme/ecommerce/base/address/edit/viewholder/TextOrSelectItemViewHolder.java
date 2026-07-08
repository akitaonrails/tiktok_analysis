package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.AnonymousClass0378;
import X.C01GW;
import X.C13LE;
import X.C1743750vTh;
import X.C1745680vWo;
import X.C19719912Dl;
import X.C452501pT;
import X.C992303uL;
import X.InterfaceC998610c5r;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import eha.a0;
import eha.k;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import p8b.c;

/* JADX INFO: loaded from: classes27.dex */
public final class TextOrSelectItemViewHolder extends BaseViewHolder implements InterfaceC998610c5r, c {
    public final AddressEditFragment LLJILJILJ;
    public final C01GW LLJILLL;
    public a0 LLJJ;
    public k LLJJI;
    public k LLJJIII;
    public final C01GW LLJJIJI;

    @Override // p8b.c
    public final String getViewName() {
        return "TextOrSelectItemViewHolder";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            return a0Var.l();
        }
        return null;
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            return a0Var.w2();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            CandHelper candHelper = a0Var.LLILZLL;
            PopupWindow popupWindow = candHelper.LIZJ;
            if (popupWindow == null) {
                popupWindow = null;
            }
            popupWindow.dismiss();
            candHelper.LJIILIIL.removeMessages(1);
        }
        k kVar = this.LLJJI;
        if (kVar != null) {
            AnonymousClass0378.LIZ().LIZJ("ec_district_select", kVar);
        }
        k kVar2 = this.LLJJIII;
        if (kVar2 != null) {
            AnonymousClass0378.LIZ().LIZJ("ec_district_select", kVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x016c  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(X.C1745680vWo r13) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.TextOrSelectItemViewHolder.rr(X.0vWo):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public TextOrSelectItemViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.ajg, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 29));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 174));
    }
}
