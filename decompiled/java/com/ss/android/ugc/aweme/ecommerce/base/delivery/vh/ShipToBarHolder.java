package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.C01GW;
import X.C03DZ;
import X.C03FV;
import X.C03IT;
import X.C03J8;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C19719912Dl;
import X.C259800zU;
import X.C452501pT;
import X.C688502mR;
import X.C786410Ut5;
import X.C811603Fa;
import X.EnumC1338240kve;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchTo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.LogisticIcon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class ShipToBarHolder extends ECJediViewHolder<C03FV> {
    public final boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final String LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        if (C811603Fa.LIZ()) {
            C03J8.LIZ(this.itemView, false);
        } else {
            C03J8.LIZ(this.itemView, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.String] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: W5, reason: merged with bridge method [inline-methods] */
    public void rr(C03FV c03fv) {
        LogisticIcon logisticIcon;
        String str;
        C03IT thumbFirstImageUrlModel;
        View viewFindViewById;
        String str2;
        String str3 = null;
        if (C811603Fa.LIZ()) {
            C03DZ.LIZ(this.itemView.findViewById(R.id.luz));
            C03DZ.LIZJ(this.itemView.findViewById(R.id.koc));
            TextView textView = (TextView) this.itemView.findViewById(R.id.lv1);
            DispatchTo dispatchTo = c03fv.LIZIZ;
            if (dispatchTo != null) {
                str2 = dispatchTo.title;
            } else {
                str2 = null;
            }
            textView.setText(str2);
            C03DZ.LIZJ(this.itemView.findViewById(R.id.lv1));
        }
        C03DZ.LIZJ(this.itemView.findViewById(R.id.p76));
        Context context = this.itemView.getContext();
        DispatchTo dispatchTo2 = c03fv.LIZIZ;
        if (dispatchTo2 != null) {
            logisticIcon = dispatchTo2.iconTo;
        } else {
            logisticIcon = null;
        }
        Image imageLIZ = C688502mR.LIZ(context, logisticIcon);
        if (imageLIZ != null && (thumbFirstImageUrlModel = imageLIZ.toThumbFirstImageUrlModel()) != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(thumbFirstImageUrlModel);
            c1331670kl3LJIIJ.LJJIIZ(R.drawable.b5n);
            c1331670kl3LJIIJ.LJJ = EnumC1338240kve.FIT_XY;
            if (C811603Fa.LIZ()) {
                viewFindViewById = this.itemView.findViewById(R.id.koc);
            } else {
                viewFindViewById = this.itemView.findViewById(R.id.p76).findViewById(R.id.luz);
            }
            c1331670kl3LJIIJ.LJJI((ImageView) viewFindViewById);
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.l8t);
        DispatchTo dispatchTo3 = c03fv.LIZIZ;
        if (dispatchTo3 != null) {
            str = dispatchTo3.text;
        } else {
            str = null;
        }
        int i = 0;
        if (C123100dR.LIZ(str)) {
            DispatchTo dispatchTo4 = c03fv.LIZIZ;
            if (dispatchTo4 != null) {
                str3 = dispatchTo4.text;
            }
        } else {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = this.itemView.getContext().getString(2131832565);
            ((C03FV) this.LLILLJJLI).LIZJ(new AwS367S0200000_1(c259800zU, (C259800zU<String>) this, (ShipToBarHolder) 1));
            ((C03FV) this.LLILLJJLI).LIZLLL(new AwS580S0100000_1(c259800zU, (C259800zU<String>) 5));
            if (((CharSequence) c259800zU.element).length() == 0) {
                c259800zU.element = this.itemView.getContext().getString(2131832565);
            }
            str3 = (String) c259800zU.element;
        }
        textView2.setText(str3);
        C786410Ut5.I7(new AjS60S0100000_1(this, 0), this.itemView);
        this.itemView.setClickable(this.LLJILJIL);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.lhi);
        if (!this.LLJILJIL) {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShipToBarHolder(ViewGroup viewGroup, int i, int i2) {
        boolean z;
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), (i2 & 4) != 0 ? R.layout.alx : i, viewGroup, false));
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILJIL = z;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 1));
        this.LLJILLL = "c27802.d8061";
    }
}
