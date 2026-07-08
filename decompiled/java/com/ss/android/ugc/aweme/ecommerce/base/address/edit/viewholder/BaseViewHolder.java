package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C1308910kAL;
import X.C13LE;
import X.C1744700vVE;
import X.C1745090vVr;
import X.C1745680vWo;
import X.C19719912Dl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1745080vVq;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes27.dex */
public abstract class BaseViewHolder extends ECJediViewHolder<C1745680vWo> {
    public final C01GW LLJILJIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X5() {
        if (((C1745680vWo) this.LLILLJJLI).LJII) {
            C1744700vVE.LJIIIIZZ(0, this.itemView);
        } else {
            C1744700vVE.LJIIIIZZ(-2, this.itemView);
        }
    }

    public BaseViewHolder(View view) {
        super(view);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 17));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: W5, reason: merged with bridge method [inline-methods] */
    public void rr(C1745680vWo c1745680vWo) {
        EnumC1745080vVq enumC1745080vVq = c1745680vWo.LJ;
        if (enumC1745080vVq != null) {
            int i = C1745090vVr.LIZ[enumC1745080vVq.ordinal()];
            int iIntValue = R.attr.bx;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!((AddressEditViewModel) this.LLJILJIL.getValue()).LLILZIL) {
                            View view = this.itemView;
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, view.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            }
                            view.setBackgroundColor(iIntValue);
                        } else {
                            this.itemView.setBackgroundResource(R.drawable.b19);
                        }
                        C426750GoL.LJIIL(this.itemView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 23);
                        return;
                    }
                    return;
                }
                View view2 = this.itemView;
                view2.setBackgroundColor(C960203pA.LIZ(R.attr.bx, view2.getContext()));
                return;
            }
            if (!((AddressEditViewModel) this.LLJILJIL.getValue()).LLILZIL) {
                View view3 = this.itemView;
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, view3.getContext());
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                }
                view3.setBackgroundColor(iIntValue);
                return;
            }
            this.itemView.setBackgroundResource(R.drawable.b1_);
        }
    }
}
