package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C03J8;
import X.C049X;
import X.C127A;
import X.C127K;
import X.C13LE;
import X.C1745680vWo;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C452501pT;
import X.C586610Mzb;
import X.C786410Ut5;
import X.C992303uL;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class SwitchInputItemViewHolder extends BaseViewHolder {
    public final int LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel a6() {
        return (AddressEditViewModel) this.LLJILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(final C1745680vWo c1745680vWo) {
        String str;
        TuxTextView tuxTextView;
        super.rr(c1745680vWo);
        View view = this.itemView;
        boolean z = true;
        if (getLayoutPosition() == this.LLJILJILJ - 1) {
            z = false;
        }
        C03J8.LIZ(view, z);
        final C127K c127k = (C127K) this.itemView;
        c127k.setTitle(c1745680vWo.LIZ.title);
        c127k.setSubtitle(c1745680vWo.LIZ.hint);
        ClientConfig clientConfig = a6().LLL;
        if (clientConfig != null) {
            str = clientConfig.uiStyle;
        } else {
            str = null;
        }
        if (C586610Mzb.LIZ(str) && (tuxTextView = (TuxTextView) c127k.findViewById(R.id.y3j)) != null) {
            tuxTextView.setTuxFont(102);
        }
        final C127A c127a = (C127A) c127k.getAccessory();
        Object obj = c1745680vWo.LIZIZ;
        if ((obj instanceof String) && obj != null) {
            c127a.LJIILJJIL(Intrinsics.LJFF(obj, "1"));
        }
        C1748720vbi.LIZLLL(c127k, new C049X(), new AwS392S0200000_26(c127a, this, 34));
        c127a.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0vYP
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                String str2;
                c127a.LJIILJJIL(z2);
                C1745680vWo c1745680vWo2 = c1745680vWo;
                if (c127a.LJIILIIL()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c1745680vWo2.LIZIZ = str2;
                this.a6().LLJJIJI = true;
                C1748720vbi.LIZLLL(c127k, new C049Y(), new AwS392S0200000_26(c127a, this, 35));
            }
        });
        if (!c1745680vWo.LJFF) {
            C786410Ut5.Y7((ConstraintLayout) this.itemView.findViewById(R.id.dlh), null);
            C786410Ut5.I7(new AjS70S0100000_26(this, 73), this.itemView.findViewById(R.id.dlh));
            ((C127K) this.itemView).setCellEnabled(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public SwitchInputItemViewHolder(int i, ViewGroup viewGroup) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aje, viewGroup));
        this.LLJILJILJ = i;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 122));
    }
}
