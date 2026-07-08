package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C03IT;
import X.C0H9H;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1745180vW0;
import X.C1745680vWo;
import X.C19719912Dl;
import X.C2097908Jt;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C992303uL;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.Pair;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressMapEntryViewHolder extends BaseViewHolder {
    public final AddressEditFragment LLJILJILJ;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel a6() {
        return (AddressEditViewModel) this.LLJILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        int iLIZIZ;
        AddressLocation addressLocation;
        Icon icon;
        Image imageRequireImage;
        C03IT thumbFirstImageUrlModel;
        String str;
        super.rr(c1745680vWo);
        View viewFindViewById = this.itemView.findViewById(R.id.ah_);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.f664aha);
        TextView textView = (TextView) this.itemView.findViewById(R.id.ahc);
        Integer num = (Integer) withState(a6(), new AwS605S0100000_26(c1745680vWo, 166));
        if (num != null && num.intValue() == 20) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        C0H9H.LJI(iLIZIZ, viewFindViewById);
        if (!this.LLJJI) {
            this.LLJJI = true;
            a6().LLJJIJIL.LJIIIZ("map_pin", a6().LLJJIJIIJIL, C2097908Jt.LIZJ(new Pair("address_authorization_type", C1745180vW0.LIZJ())));
        }
        if (!this.LLJJ && C1745180vW0.LJFF()) {
            this.LLJJ = true;
            AddressEditViewModel.pR2(a6());
        }
        Object obj = c1745680vWo.LIZIZ;
        if (obj instanceof AddressLocation) {
            addressLocation = (AddressLocation) obj;
        } else {
            addressLocation = null;
        }
        if (textView != null) {
            if (addressLocation == null || (str = addressLocation.tipText) == null) {
                str = "";
            }
            textView.setText(str);
        }
        if (addressLocation != null && (icon = addressLocation.tipIcon) != null && (imageRequireImage = icon.requireImage(this.itemView.getContext())) != null && (thumbFirstImageUrlModel = imageRequireImage.toThumbFirstImageUrlModel()) != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(thumbFirstImageUrlModel);
            c1331670kl3LJIIJ.LJJI(imageView);
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 5), viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public AddressMapEntryViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.f873aj7, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 13));
    }
}
