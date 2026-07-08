package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C041J;
import X.C1308910kAL;
import X.C13LE;
import X.C1745300vWC;
import X.C1745340vWG;
import X.C1745350vWH;
import X.C1745680vWo;
import X.C1746460vY4;
import X.C1746880vYk;
import X.C19719912Dl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C948503nH;
import X.C992303uL;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS22S0300000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressToCandidateItemViewHolder extends BaseViewHolder {
    public final AddressEditFragment LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel a6() {
        return (AddressEditViewModel) this.LLJILLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.05Vn, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        super.rr(c1745680vWo);
        View view = this.itemView;
        C1745300vWC c1745300vWC = (C1745300vWC) view;
        View viewFindViewById = view.findViewById(R.id.euf);
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.ahh);
        TextView textView = (TextView) this.itemView.findViewById(R.id.i02);
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.itemView.findViewById(R.id.ugt);
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.agr);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.ahg);
        int i = 8;
        ?? r11 = 0;
        r11 = 0;
        r11 = 0;
        String string = null;
        c1745300vWC.LJI(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, true);
        c1745300vWC.LIZIZ();
        c1745300vWC.LIZLLL(c1745680vWo.LIZ.title, c1745680vWo.LIZJ());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, c1745300vWC.getContext());
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            viewFindViewById.setBackground(gradientDrawable);
        }
        if (viewFindViewById != null) {
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, 26);
        }
        Object obj = c1745680vWo.LIZIZ;
        if (obj != null) {
            string = obj.toString();
        }
        if (string != null && !a0.LJJJIL(string)) {
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
            if (textView != null) {
                textView.setText(string);
            }
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(0, viewGroup2);
            }
            if (appCompatTextView != null) {
                appCompatTextView.setText(C1746880vYk.LIZIZ(a6().LLJJI));
                CharSequence text = appCompatTextView.getText();
                if (text != null && C041J.LIZ(text)) {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, appCompatTextView);
            }
            if (viewGroup2 != null) {
                r11 = 0;
                C426750GoL.LJIIL(viewGroup2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 20);
            }
        } else {
            if (textView2 != null) {
                textView2.setHint(c1745680vWo.LIZ.hint);
            }
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
        }
        if (string != null && string.length() != 0) {
            C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
            String str = c1745680vWo.LIZ.key;
            c1746460vY4.getClass();
            if (C1746460vY4.LIZIZ(str)) {
                C948503nH.LJIIIIZZ(this.LLJILJILJ, new C1745350vWH(this, (C1745680vWo) this.LLILLJJLI, c1745680vWo, r11));
                c1745680vWo.LJIIL = r11;
            }
        }
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AjS22S0300000_26(this, c1745300vWC, c1745680vWo, 1), viewFindViewById);
        }
        C1745340vWG c1745340vWG = c1745680vWo.LIZJ;
        if (c1745340vWG != null) {
            c1745300vWC.LJFF(c1745340vWG);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public AddressToCandidateItemViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aj8, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 15));
    }
}
