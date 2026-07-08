package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C10515049h;
import X.C13LE;
import X.C1744700vVE;
import X.C1745680vWo;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.C992303uL;
import X.InterfaceC1748860vbw;
import Y.ACListenerS160S0100000_26;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public class UnFoldBtnViewHolder extends BaseViewHolder {
    public final C01GW LLJILJILJ;
    public final View LLJILLL;
    public final TuxTextView LLJJ;
    public boolean LLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel b6() {
        return (AddressEditViewModel) this.LLJILJILJ.getValue();
    }

    public UnFoldBtnViewHolder(ViewGroup viewGroup) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.ay0, viewGroup));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 123));
        this.LLJILLL = this.itemView.findViewById(R.id.csv);
        this.LLJJ = (TuxTextView) this.itemView.findViewById(R.id.tv_one_search_address_manually);
        this.LLJJI = true;
        C1748730vbj.LJ(this.itemView, new InterfaceC1748860vbw() { // from class: X.0vYz
            @Override // X.InterfaceC1748860vbw
            public final void Q3(C1748770vbn c1748770vbn) {
                C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS605S0100000_26(this.LL, 550));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        super.rr(c1745680vWo);
        this.LLJJ.setText(c1745680vWo.LIZ.hint);
        C786410Ut5.I7(new ACListenerS160S0100000_26(this, 26), this.LLJILLL);
        if (b6().LLLLLLJ && !b6().LLLLLLL) {
            if (this.LLJJI) {
                C1748720vbi.LIZLLL(this.itemView, new C10515049h(), AFwS268S0000000_26.get$arr$(165));
                this.LLJJI = false;
                return;
            }
            return;
        }
        C1744700vVE.LJIIIIZZ(0, this.itemView);
    }

    public final RecyclerView.ViewHolder a6(RecyclerView.ViewHolder viewHolder) {
        RecyclerView recyclerView;
        int childAdapterPosition;
        ViewParent parent = viewHolder.itemView.getParent();
        if (!(parent instanceof RecyclerView) || (recyclerView = (RecyclerView) parent) == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(viewHolder.itemView)) == -1) {
            return null;
        }
        return recyclerView.findViewHolderForAdapterPosition(childAdapterPosition + 1);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }
}
