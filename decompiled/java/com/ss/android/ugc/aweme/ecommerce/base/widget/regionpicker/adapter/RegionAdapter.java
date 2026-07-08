package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.adapter;

import X.C01GW;
import X.C03J8;
import X.C11DP;
import X.C11EA;
import X.C1397760mTe;
import X.C13LE;
import X.C1602160rnK;
import X.C19465311Dn;
import X.C19572211ho;
import X.C19719912Dl;
import X.C20094413jq;
import X.C20094813ju;
import X.C2217381BqS;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1397840mTm;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.RegionPicker;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import kotlin.jvm.internal.AwS267S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class RegionAdapter extends C11DP<Object> {
    public final LifecycleOwner LLILLL;

    public final class DistrictViewHolder extends ECJediViewHolder<District> {
        public final C01GW LLJILJIL;

        @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            C427690Gpr.LJ(this.itemView, 0.0f);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final void rr(Object obj) {
            int i;
            District district = (District) obj;
            View view = this.itemView;
            boolean z = true;
            int i2 = 0;
            if (this.LLILLL == RegionAdapter.this.getItemCount() - 1) {
                z = false;
            }
            C03J8.LIZ(view, z);
            withState((JediViewModel) this.LLJILJIL.getValue(), new AwS392S0200000_26(this, district, 48));
            View viewFindViewById = this.itemView.findViewById(R.id.sp_);
            if (((DistrictPickerViewModel) this.LLJILJIL.getValue()).jR2()) {
                i = 8;
            } else {
                i = 0;
            }
            int visibility = viewFindViewById.getVisibility();
            viewFindViewById.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, viewFindViewById);
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.iib);
            if (!((DistrictPickerViewModel) this.LLJILJIL.getValue()).jR2()) {
                i2 = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i2);
            ((TextView) this.itemView.findViewById(R.id.m44)).setText(district.name);
            C786410Ut5.I7(new AjS44S0200000_26(this, district, 38), this.itemView);
            C11EA.LJII(this, (JediViewModel) this.LLJILJIL.getValue(), new C2217381BqS() { // from class: X.0vVc
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((DistrictPickerState) obj2).getSelectedDistrict();
                }
            }, new AwS640S0100000_26(district, 28));
            int i3 = C20094413jq.LJIIZILJ;
            View view2 = this.itemView;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LJIIIZ = new AwS605S0100000_26(this, 252);
            c1397760mTe.LIZ = String.valueOf(district.name);
            c1397760mTe.LIZIZ = EnumC1397840mTm.CHECK_BOX;
            c1397760mTe.LIZJ = null;
            C20094813ju.LIZ(view2, c1397760mTe.LIZ());
        }

        public DistrictViewHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.am_, viewGroup, false));
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(DistrictPickerViewModel.class);
            this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 83));
        }
    }

    public final class IndicatorViewHolder extends ECJediViewHolder<String> {
        @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            C03J8.LIZ(this.itemView, false);
        }

        public IndicatorViewHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.am9, viewGroup, false));
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final void rr(Object obj) {
            ((TextView) this.itemView).setText((String) obj);
        }
    }

    public RegionAdapter(RegionPicker regionPicker) {
        super(regionPicker, (C19572211ho) null, 6);
        this.LLILLL = regionPicker;
    }

    @Override // X.C11DY
    public final void LLLFZ(C19465311Dn c19465311Dn) {
        c19465311Dn.LJFF(new AwS605S0100000_26(this, 715), new AwS267S0000000_26(this, 0), null);
        c19465311Dn.LJFF(new AwS605S0100000_26(this, 716), new AwS605S0100000_26(this, 253), null);
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return this.LL.LIZIZ(i);
    }
}
