package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C049Y;
import X.C04CH;
import X.C0I7D;
import X.C0WZX;
import X.C10510049c;
import X.C10511049d;
import X.C13LE;
import X.C1743750vTh;
import X.C1744320vUc;
import X.C1744460vUq;
import X.C1745100vVs;
import X.C1745680vWo;
import X.C1747730va7;
import X.C1747750va9;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C259800zU;
import X.C418440Gaw;
import X.C426750GoL;
import X.C434070H0j;
import X.C452501pT;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.C948503nH;
import X.C960203pA;
import X.C992303uL;
import X.InterfaceC1744450vUp;
import X.InterfaceC1744490vUt;
import X.InterfaceC1748860vbw;
import X.InterfaceC998610c5r;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS16S0002000_26;
import kotlin.jvm.internal.AwS1S0001100_26;
import kotlin.jvm.internal.AwS204S1100000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class SearchInputItemViewHolder extends BaseViewHolder implements InterfaceC1744450vUp, InterfaceC1744490vUt<CandInputData>, InterfaceC998610c5r {
    public final AddressEditFragment LLJILJILJ;
    public final C01GW LLJILLL;
    public final C1744460vUq<CandInputData> LLJJ;
    public String LLJJI;
    public long LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public long LLJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        InputMethodManager inputMethodManager;
        Object objH2 = C786410Ut5.H2(this.itemView.getContext(), "input_method");
        if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.itemView.getWindowToken(), 0);
    }

    public final AddressEditViewModel a6() {
        return (AddressEditViewModel) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        C1744460vUq<CandInputData> c1744460vUq = this.LLJJ;
        if (c1744460vUq != null) {
            return c1744460vUq.getSearchEditFromXml();
        }
        return null;
    }

    @Override // X.InterfaceC1744490vUt
    public final void lD() {
        C1748720vbi.LIZLLL(this.itemView, new C049Y(), AFwS268S0000000_26.get$arr$(162));
        b6(false);
        LJLZ();
        AddressEditViewModel addressEditViewModelA6 = a6();
        Boolean bool = Boolean.FALSE;
        AddressEditViewModel.zR2(addressEditViewModelA6, 0, bool, bool, null, null, 24);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        new C04CH("SearchInputItemViewHolder").LIZJ(false);
        C1744460vUq<CandInputData> c1744460vUq = this.LLJJ;
        if (c1744460vUq != null) {
            c1744460vUq.LIZIZ(this);
        }
        C786410Ut5.I7(new AjS70S0100000_26(this, 6), this.itemView.findViewById(R.id.nzd));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        C1744460vUq<CandInputData> c1744460vUq;
        C0I7D searchEditFromXml;
        return ((C1745680vWo) this.LLILLJJLI).LJFF && (c1744460vUq = this.LLJJ) != null && (searchEditFromXml = c1744460vUq.getSearchEditFromXml()) != null && String.valueOf(C2204961BRm.LLLLJI(searchEditFromXml, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6P7QKR8crTAunbvOvzV1bjhBOyZct6A0quiw8coRXBYbBE9KI=", null))).length() == 0;
    }

    @Override // X.InterfaceC1744450vUp
    public final void LJJIJIIJIL() {
        AddressEditViewModel addressEditViewModelA6 = a6();
        addressEditViewModelA6.getClass();
        addressEditViewModelA6.setState(AFwS268S0000000_26.get$arr$(733));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        C1744460vUq<CandInputData> c1744460vUq = this.LLJJ;
        if (c1744460vUq != null) {
            ((ArrayList) c1744460vUq.LLILLL).remove(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1744450vUp
    public final void A2(String str) {
        if (!Intrinsics.LJFF(str, ((C1745680vWo) this.LLILLJJLI).LIZIZ)) {
            a6().LLJJIJI = true;
        }
        ((C1745680vWo) this.LLILLJJLI).LIZIZ = str;
        AddressEditViewModel.vR2(a6(), ((C1745680vWo) this.LLILLJJLI).LIZ.key, null, null, new AwS204S1100000_26(this, str, 1), 14);
    }

    @Override // X.InterfaceC1744490vUt
    public final void W2(int i) {
        this.LLJJIJIL = false;
        if (this.LLJJJ != 0) {
            C1748720vbi.LIZLLL(this.itemView, new C1747750va9(), new AwS1S0001100_26(i, SystemClock.elapsedRealtime() - this.LLJJJ, 1));
            this.LLJJJ = 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        C0I7D searchEditFromXml;
        C1744460vUq<CandInputData> c1744460vUq;
        super.rr(c1745680vWo);
        String str = c1745680vWo.LIZ.hint;
        if (str != null && (c1744460vUq = this.LLJJ) != null) {
            c1744460vUq.setHint(str);
        }
        b6(true);
        if (!c1745680vWo.LJFF) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 71), this.itemView.findViewById(R.id.ntn));
            this.itemView.findViewById(R.id.ntn).findViewById(R.id.u5_).setFocusable(false);
            ((TextView) this.itemView.findViewById(R.id.ntn).findViewById(R.id.u5_)).setCursorVisible(false);
            this.itemView.findViewById(R.id.ntn).findViewById(R.id.u5_).setFocusableInTouchMode(false);
            ((TextView) this.itemView.findViewById(R.id.ntn).findViewById(R.id.u5_)).setHintTextColor(C960203pA.LIZ(R.attr.a1p, this.itemView.getContext()));
            C786410Ut5.I7(new AjS70S0100000_26(this, 72), this.itemView.findViewById(R.id.ntn).findViewById(R.id.u5_));
        }
        Integer num = ((C1745680vWo) this.LLILLJJLI).LJIIIIZZ;
        if (num != null) {
            int iIntValue = num.intValue();
            C1744460vUq<CandInputData> c1744460vUq2 = this.LLJJ;
            if (c1744460vUq2 != null && (searchEditFromXml = c1744460vUq2.getSearchEditFromXml()) != null) {
                searchEditFromXml.setImeOptions(iIntValue);
            }
        }
    }

    public final void b6(boolean z) {
        int i = 0;
        boolean z2 = true;
        if (a6().LLLIIII != 1 || a6().LLJ != null || !z) {
            z2 = false;
        }
        View viewFindViewById = this.itemView.findViewById(R.id.nzd);
        if (!z2) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public SearchInputItemViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.ajd, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 27));
        this.LLJJI = "";
        C1744460vUq<CandInputData> c1744460vUq = new C1744460vUq<>(this.itemView.getContext());
        C426750GoL.LJIIL(c1744460vUq, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), 16);
        c1744460vUq.setBackground(C800330VaR.LIZIZ(c1744460vUq.getContext(), R.drawable.b40));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1744460vUq);
        c1744460vUq.setLayoutParams(layoutParams);
        this.LLJJ = c1744460vUq;
        ((ViewGroup) this.itemView.findViewById(R.id.ntn)).addView(c1744460vUq, 0);
        C1748730vbj.LJ(this.itemView, new InterfaceC1748860vbw() { // from class: X.0vW3
            @Override // X.InterfaceC1748860vbw
            public final void Q3(C1748770vbn c1748770vbn) {
                C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", AFwS268S0000000_26.get$arr$(161));
            }
        });
    }

    @Override // X.InterfaceC1744490vUt
    public final void EC(C1744320vUc<CandInputData> c1744320vUc, int i, int i2) {
        this.LLJJIJIIJIL = true;
        if (a6().LLLIIII != 0) {
            AddressEditViewModel addressEditViewModelA6 = a6();
            Boolean bool = Boolean.FALSE;
            AddressEditViewModel.zR2(addressEditViewModelA6, 0, bool, bool, new AwS427S0200000_26(this, (SearchInputItemViewHolder) c1744320vUc, (C1744320vUc<CandInputData>) 13), null, 16);
        } else {
            AddressEditViewModel addressEditViewModelA62 = a6();
            CandInputData candInputData = c1744320vUc.LIZ;
            AddressEditViewModel.dS2(addressEditViewModelA62, candInputData.address, this.LLJJI, candInputData.autocompleteAddressId, candInputData.placeType, null, null, null, new AwS605S0100000_26(this, 174), 112);
        }
        a6().LLJLIL = null;
        C1748720vbi.LIZLLL(this.itemView, new C1747730va7(), new AwS16S0002000_26(i, i2, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1744450vUp
    public final void p(View view, boolean z, String str) {
        int length;
        T t;
        int length2 = 0;
        if (z) {
            a6().LLJJIJI = true;
            if (str != null) {
                length2 = str.length();
            }
            this.LLJJIJI = length2;
            this.LLJJIII = SystemClock.elapsedRealtime();
            C1748720vbi.LIZLLL(this.itemView, new C10510049c(), null);
            b6(true);
            C948503nH.LJIIIIZZ(this.LLJILJILJ, new C434070H0j(this, null));
            return;
        }
        this.LLJILJILJ.uS(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJJIII;
        if (str != null) {
            length = str.length();
        } else {
            length = -this.LLJJIJI;
        }
        C259800zU c259800zU = new C259800zU();
        if (length > 0) {
            t = "add";
        } else if (length < 0) {
            t = "del";
        } else {
            t = "";
        }
        c259800zU.element = t;
        C1748720vbi.LIZLLL(this.itemView, new C10511049d(), new C1745100vVs(jElapsedRealtime, c259800zU, str, this));
        this.LLJJIJIIJIL = false;
    }
}
