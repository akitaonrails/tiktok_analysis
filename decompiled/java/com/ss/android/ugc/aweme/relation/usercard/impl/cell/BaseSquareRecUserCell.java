package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AbstractC21673619ry;
import X.C1261540ivw;
import X.C1261570ivz;
import X.C1261580iw0;
import X.C1261650iw7;
import X.C1261680iwA;
import X.C1261860iwS;
import X.C1262090iwp;
import X.C1264070j01;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427870Gq9;
import X.C428150Gqb;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC428940Grs;
import Y.ARunnableS0S0204000_1;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS420S0200000_19;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseSquareRecUserCell<ITEM extends C1261650iw7> extends AbsRecUserCell<ITEM> {
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final int a6() {
        return R.layout.eli;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell
    public final C1261580iw0 L5() {
        C1261540ivw.LIZ.getClass();
        C1261570ivz c1261570ivz = C1261540ivw.LIZIZ;
        if (c1261570ivz.LIZ != 3) {
            c1261570ivz.LIZ = 3;
            c1261570ivz.LIZJ = 0;
            c1261570ivz.LIZIZ = 0;
        }
        return new C1261580iw0(0.99f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C428150Gqb.LIZ(this.itemView.findViewById(R.id.fki), EnumC428940Grs.ALPHA, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void D6(C1262090iwp c1262090iwp, ITEM item) {
        super.D6(c1262090iwp, item);
        if (this.itemView.getBackground() != null) {
            return;
        }
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        Integer numValueOf = c1262090iwp.LJJJLL;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(R.attr.c7);
        }
        c384050F3z.LIZIZ = numValueOf;
        c384050F3z.LIZJ = Float.valueOf(P5());
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void J6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        C1261680iwA.LIZIZ((TuxTextView) this.itemView.findViewById(R.id.p93), c1261860iwS);
        MatchedFriendStruct matchedFriendStruct = c1261860iwS.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            r6(this.itemView.findViewById(R.id.t4q));
            RelationLabelTextView.LJJJJL((RelationLabelTextView) this.itemView.findViewById(R.id.t4q), matchedFriendStruct, C1264070j01.LJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void S6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        int itemCount;
        View view;
        int bindingAdapterPosition = getBindingAdapterPosition();
        AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
        if (bindingAdapter != null) {
            itemCount = bindingAdapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (bindingAdapterPosition < itemCount - 1) {
            C426750GoL.LJIIIZ(this.itemView, null, null, Integer.valueOf(c1262090iwp.LJIILIIL), null, false, 27);
        } else {
            C426750GoL.LJIIIZ(this.itemView, null, null, 0, null, false, 27);
        }
        if (c1262090iwp.LJJJJ) {
            View viewFindViewById = this.itemView.findViewById(R.id.fki);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            if (viewFindViewById != null) {
                Object parent = viewFindViewById.getParent();
                if ((parent instanceof View) && (view = (View) parent) != null) {
                    HandlerHook.viewPost(view, new ARunnableS0S0204000_1(iLIZIZ, iLIZIZ2, iLIZIZ3, iLIZIZ4, viewFindViewById, view, 1));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void T6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        Integer numValueOf = Integer.valueOf(((TextView) this.itemView.findViewById(R.id.p93)).getCurrentTextColor());
        if (numValueOf.intValue() != R.attr.a1h) {
            numValueOf.intValue();
            ((TuxTextView) this.itemView.findViewById(R.id.p93)).setTextColorRes(R.attr.a1h);
        }
        ((TuxIconView) this.itemView.findViewById(R.id.fki)).setTintColorRes(R.attr.a1k);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void v6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        W5((C427870Gq9) this.itemView.findViewById(R.id.y9d), new AwS420S0200000_19(c1261860iwS, c1262090iwp, 190));
        C426750GoL.LJIIIZ(this.itemView.findViewById(R.id.y9d), null, Integer.valueOf(c1262090iwp.LJJIZ), null, null, false, 29);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void w6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        int i;
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.cb8);
        K6(relationButton, c1261860iwS, c1262090iwp, false, false);
        C426750GoL.LJIIIZ(relationButton, null, null, null, Integer.valueOf(c1262090iwp.LJJJ), false, 23);
        View viewFindViewById = this.itemView.findViewById(R.id.fki);
        int i2 = c1262090iwp.LIZLLL;
        if (i2 != 203 && i2 != 200) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        if (viewFindViewById.getVisibility() == 0) {
            C786410Ut5.I7(new AbS700S0100000_19(this, 18), viewFindViewById);
        }
    }
}
