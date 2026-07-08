package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview;

import X.C01GW;
import X.C04IH;
import X.C1071004Gu;
import X.C1074304Ib;
import X.C1074404Ic;
import X.C1308910kAL;
import X.C13LE;
import X.C1602160rnK;
import X.C1750140ve0;
import X.C1755030vlt;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.C756302xN;
import X.C786410Ut5;
import X.C958103op;
import Y.ARunnableS101S0100000_1;
import Y.ARunnableS34S0300000_1;
import Y.ARunnableS70S0200000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpShopReviewHeadViewHolder extends AbsFullSpanVH<C04IH> {
    public final C01GW LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel c6() {
        return (SeaPdpViewModel) this.LLJJIJIL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        SeaPdpViewModel seaPdpViewModelC6;
        b6(new C1755030vlt(this.LLILLJJLI));
        if (this.itemView.getY() >= C958103op.LIZJ() || (seaPdpViewModelC6 = c6()) == null || seaPdpViewModelC6.LLJLIL == null) {
            return;
        }
        new AwS545S0100000_1(this, 1357).invoke();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        c6();
        C1750140ve0.LIZ(this.itemView, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpShopReviewHeadViewHolder(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.ax7, context, viewGroup, false, true));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 73));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C04IH c04ih = (C04IH) obj;
        c6().XR2().LIZIZ(C2097908Jt.LIZJ(new Pair("if_review_show", "1")));
        View view = this.itemView;
        if (C1071004Gu.LIZIZ().LIZ()) {
            ((TuxTextView) view.findViewById(R.id.v7s)).setTuxFont(102);
            view.findViewById(R.id.vrl).setBackground(C1308910kAL.LJ(R.attr.a03, view.getContext()));
        }
        TextView textView = (TextView) view.findViewById(R.id.v7s);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.itemView.getContext().getString(2131833071));
        sbLIZ.append(" (");
        String string = c04ih.LLILLJJLI;
        if (string == null) {
            Object obj2 = c04ih.LL;
            if (obj2 == null) {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            string = obj2.toString();
        }
        sbLIZ.append(string);
        sbLIZ.append(')');
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(c04ih.LLILZ, Boolean.TRUE)) {
            C786410Ut5.LJLLLLLL(0, view.findViewById(R.id.vrl));
        } else {
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.vrl));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<ReviewFilterStruct> list = c04ih.LLILLL;
        if (list != null) {
            for (ReviewFilterStruct reviewFilterStruct : list) {
                Integer num = reviewFilterStruct.type;
                if (num != null && num.intValue() == 3) {
                    arrayList2.add(reviewFilterStruct);
                } else {
                    arrayList.add(reviewFilterStruct);
                }
            }
        }
        if (C756302xN.LIZ(arrayList2)) {
            View viewFindViewById = view.findViewById(R.id.vxv);
            int visibility = viewFindViewById.getVisibility();
            viewFindViewById.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, viewFindViewById);
            View viewFindViewById2 = view.findViewById(R.id.tgg);
            int visibility2 = viewFindViewById2.getVisibility();
            viewFindViewById2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, viewFindViewById2);
            c6();
            View view2 = this.itemView;
            ARunnableS34S0300000_1 aRunnableS34S0300000_1 = new ARunnableS34S0300000_1(view, arrayList2, this, 7);
            if (view2 != null) {
                HandlerHook.viewPost(view2, new ARunnableS101S0100000_1(aRunnableS34S0300000_1, 68));
            }
        } else if (arrayList2.isEmpty() && C756302xN.LIZ(arrayList)) {
            View viewFindViewById3 = view.findViewById(R.id.vxv);
            int visibility3 = viewFindViewById3.getVisibility();
            viewFindViewById3.setVisibility(0);
            C1602160rnK.LIZIZ(visibility3, 0, viewFindViewById3);
            View viewFindViewById4 = view.findViewById(R.id.tgg);
            int visibility4 = viewFindViewById4.getVisibility();
            viewFindViewById4.setVisibility(8);
            C1602160rnK.LIZIZ(visibility4, 8, viewFindViewById4);
            c6();
            View view3 = this.itemView;
            ARunnableS70S0200000_1 aRunnableS70S0200000_1 = new ARunnableS70S0200000_1(view, arrayList, 23);
            if (view3 != null) {
                HandlerHook.viewPost(view3, new ARunnableS101S0100000_1(aRunnableS70S0200000_1, 68));
            }
        } else {
            View viewFindViewById5 = view.findViewById(R.id.vxv);
            int visibility5 = viewFindViewById5.getVisibility();
            viewFindViewById5.setVisibility(8);
            C1602160rnK.LIZIZ(visibility5, 8, viewFindViewById5);
            View viewFindViewById6 = view.findViewById(R.id.tgg);
            int visibility6 = viewFindViewById6.getVisibility();
            viewFindViewById6.setVisibility(8);
            C1602160rnK.LIZIZ(visibility6, 8, viewFindViewById6);
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 113), view.findViewById(R.id.epz));
        C786410Ut5.I7(new AjS60S0100000_1(this, 114), view.findViewById(R.id.tgg));
        C786410Ut5.I7(new AjS60S0100000_1(this, 115), view.findViewById(R.id.vxv));
        ((C1074304Ib) view.findViewById(R.id.tgg)).setOnSelectedChangeListener(new AwS437S0200000_1(this, view, 31));
        ((C1074404Ic) view.findViewById(R.id.vxv)).setOnSelectedChangeListener(new AwS437S0200000_1(this, view, 32));
    }
}
