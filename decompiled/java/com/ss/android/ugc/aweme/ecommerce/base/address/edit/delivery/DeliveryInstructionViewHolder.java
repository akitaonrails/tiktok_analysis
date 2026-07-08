package com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery;

import X.C01GW;
import X.C03WM;
import X.C1397760mTe;
import X.C13LE;
import X.C1745300vWC;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C19719912Dl;
import X.C20094413jq;
import X.C20094813ju;
import X.C2097908Jt;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1397840mTm;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS3S1200000_26;
import kotlin.Pair;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class DeliveryInstructionViewHolder extends BaseViewHolder {
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public DeliveryInstructionViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ai7, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJJI = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 9));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        DeliveryInstructionInfo deliveryInstructionInfo;
        String str;
        String strLJJIFFI;
        String str2;
        super.rr(c1745680vWo);
        int i = C20094413jq.LJIIZILJ;
        View view = this.itemView;
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
        View viewFindViewById = null;
        c1397760mTe.LIZJ = null;
        C20094813ju.LIZ(view, c1397760mTe.LIZ());
        ((C1745300vWC) this.itemView.findViewById(R.id.kps)).setVerifyResult(c1745680vWo.LIZJ);
        Object obj = c1745680vWo.LIZIZ;
        if (obj instanceof DeliveryInstructionInfo) {
            deliveryInstructionInfo = (DeliveryInstructionInfo) obj;
        } else {
            deliveryInstructionInfo = null;
        }
        if (Intrinsics.LJFF(C03WM.LIZ(deliveryInstructionInfo), "add")) {
            str = "add_delivery_instructions";
        } else {
            str = "edit_delivery_instructions";
        }
        if (!this.LLJJ) {
            this.LLJJ = true;
            C1745480vWU.LJFF(((AddressEditViewModel) this.LLJJI.getValue()).LLJJIJIL, "delivery_instructions", C2097908Jt.LIZJ(new Pair("button_type", str)), null, 4);
        }
        if (deliveryInstructionInfo != null && (str2 = deliveryInstructionInfo.instruction) != null && str2.length() != 0) {
            strLJJIFFI = u.LJJIFFI(this.itemView.getResources().getString(2131832675), "{{instructions}}", str2, false);
        } else {
            strLJJIFFI = c1745680vWo.LIZ.hint;
        }
        View viewFindViewById2 = this.LLJILJILJ;
        if (viewFindViewById2 == null) {
            View view2 = this.itemView;
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.z3d);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJILJILJ = (TuxTextView) viewFindViewById2;
        }
        ((TextView) viewFindViewById2).setText(c1745680vWo.LIZ.title);
        View view3 = this.LLJILLL;
        if (view3 == null) {
            View view4 = this.itemView;
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.z3c);
            }
            this.LLJILLL = (TuxTextView) viewFindViewById;
            view3 = viewFindViewById;
        }
        ((TextView) view3).setText(strLJJIFFI);
        C786410Ut5.I7(new AjS3S1200000_26(this, str, deliveryInstructionInfo, 0), this.itemView);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }
}
