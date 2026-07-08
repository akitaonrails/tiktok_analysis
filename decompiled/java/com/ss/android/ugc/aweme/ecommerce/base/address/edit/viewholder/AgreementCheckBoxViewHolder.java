package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C049X;
import X.C0HZQ;
import X.C13LE;
import X.C1745680vWo;
import X.C1748720vbi;
import X.C1775830wJR;
import X.C1775870wJV;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.C992303uL;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AgreementCheckBoxViewHolder extends BaseViewHolder {
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public C0HZQ LLJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AgreementCheckBoxViewHolder(ViewGroup viewGroup) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.ahv, viewGroup));
        this.LLJILJILJ = true;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 16));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        C0HZQ c0hzq;
        super.rr(c1745680vWo);
        TextView textView = (TextView) this.itemView.findViewById(R.id.dqr);
        if (textView != null) {
            textView.setText(c1745680vWo.LIZ.title);
        }
        C0HZQ c0hzq2 = (C0HZQ) this.itemView.findViewById(R.id.zd9);
        this.LLJJ = c0hzq2;
        if (c0hzq2 != null) {
            Object obj = c1745680vWo.LIZIZ;
            if ((obj instanceof String) && obj != null) {
                c0hzq2.setChecked(Intrinsics.LJFF(obj, "1"));
            }
            C786410Ut5.D7(c0hzq2, new C1775870wJV(c0hzq2, c1745680vWo, this, 0));
        }
        if (this.LLJILJILJ) {
            ((AddressEditViewModel) this.LLJILLL.getValue()).LLLFF = true;
            C1748720vbi.LIZLLL(this.itemView, new C049X(), AFwS268S0000000_26.get$arr$(155));
            this.LLJILJILJ = false;
        }
        if (!c1745680vWo.LJFF && (c0hzq = this.LLJJ) != null) {
            C786410Ut5.D7(c0hzq, new C1775830wJR(c0hzq, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }
}
