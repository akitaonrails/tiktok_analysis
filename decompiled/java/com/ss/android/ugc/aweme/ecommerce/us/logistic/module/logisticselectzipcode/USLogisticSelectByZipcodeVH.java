package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode;

import X.AnonymousClass0378;
import X.C01GW;
import X.C0I7D;
import X.C11EA;
import X.C123100dR;
import X.C12ES;
import X.C13LE;
import X.C1743750vTh;
import X.C1748470vbJ;
import X.C1749190vcT;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.C970103ql;
import X.C973103rF;
import X.C984403t4;
import X.EnumC1749210vcV;
import X.InterfaceC984903t9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USLogisticSelectByZipcodeVH extends ECJediViewHolder<C973103rF> {
    public final ViewGroup LLJILJIL;
    public LinearLayout LLJILJILJ;
    public C1749190vcT LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public View LLJJIII;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C984403t4 W5() {
        return (C984403t4) this.LLJJI.getValue();
    }

    public final C1749190vcT X5() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.zipcode_input_item) : null;
            this.LLJILLL = (C1749190vcT) viewFindViewById;
        }
        return (C1749190vcT) viewFindViewById;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        AnonymousClass0378.LIZ().LIZLLL("ec_zipcode_locate_address", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_zipcode_confirm", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1748470vbJ c1748470vbJ;
        C1743750vTh.LIZ(this);
        AnonymousClass0378.LIZ().LIZJ("ec_zipcode_locate_address", this);
        AnonymousClass0378.LIZ().LIZJ("ec_zipcode_confirm", this);
        View view = this.LLJJIII;
        if (view != null && (c1748470vbJ = (C1748470vbJ) view.findViewById(R.id.zipcode_edit_text)) != null) {
            C984403t4 c984403t4W5 = W5();
            C0I7D editText = c1748470vbJ.getEditText();
            c984403t4W5.getClass();
            C984403t4.LIZJ(editText);
        }
        C984403t4 c984403t4W52 = W5();
        c984403t4W52.LIZJ = false;
        c984403t4W52.LIZLLL = "";
        c984403t4W52.LJ = 0;
        c984403t4W52.LJFF = false;
    }

    public USLogisticSelectByZipcodeVH(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b1g, viewGroup, false));
        this.LLJILJIL = viewGroup;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressSelectViewModel.class);
        this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 92));
        this.LLJJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1490));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C1748470vbJ c1748470vbJ;
        C1748470vbJ c1748470vbJ2;
        C1748470vbJ c1748470vbJ3;
        String str;
        View viewFindViewById;
        View viewFindViewById2;
        C1841350y17 c1841350y17;
        C973103rF c973103rF = (C973103rF) obj;
        View viewFindViewById3 = this.LLJILJILJ;
        C0I7D editText = null;
        if (viewFindViewById3 == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById3 = view.findViewById(R.id.zipcode_input_layout);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJILJILJ = (LinearLayout) viewFindViewById3;
        }
        if (viewFindViewById3 != null) {
            C12ES.LJIILL(0, viewFindViewById3);
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLJILJIL.getContext()), R.layout.b1e, this.LLJILJIL, false);
        this.LLJJIII = viewTd;
        if (viewTd != null && (c1841350y17 = (C1841350y17) viewTd.findViewById(R.id.t3l)) != null) {
            c1841350y17.setChecked(false);
        }
        View view2 = this.LLJJIII;
        if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.t3m)) != null) {
            C786410Ut5.I7(new AjS40S0200000_1(c973103rF, this, 2), viewFindViewById2);
        }
        View view3 = this.LLJJIII;
        if (view3 != null && (viewFindViewById = view3.findViewById(R.id.zipcode_edit_text)) != null) {
            C12ES.LJIILL(0, viewFindViewById);
        }
        C984403t4 c984403t4W5 = W5();
        View view4 = this.LLJJIII;
        if (view4 != null) {
            c1748470vbJ = (C1748470vbJ) view4.findViewById(R.id.zipcode_edit_text);
        } else {
            c1748470vbJ = null;
        }
        ChangeLocationData changeLocationDataLR2 = ((AddressSelectViewModel) this.LLJJ.getValue()).lR2();
        c984403t4W5.getClass();
        C984403t4.LJ(c1748470vbJ, changeLocationDataLR2);
        C984403t4 c984403t4W52 = W5();
        View view5 = this.LLJJIII;
        if (view5 != null) {
            c1748470vbJ2 = (C1748470vbJ) view5.findViewById(R.id.zipcode_edit_text);
        } else {
            c1748470vbJ2 = null;
        }
        c984403t4W52.LIZLLL(c1748470vbJ2, c973103rF, new AwS580S0100000_1(this, 19));
        C1749190vcT c1749190vcTX5 = X5();
        if (c1749190vcTX5 != null) {
            c1749190vcTX5.setFormField(this.LLJJIII);
            c1749190vcTX5.LIZIZ(EnumC1749210vcV.NONE);
            ChangeLocationData changeLocationDataLR22 = ((AddressSelectViewModel) this.LLJJ.getValue()).lR2();
            if (changeLocationDataLR22 != null) {
                str = changeLocationDataLR22.zipcodeTitle;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                c1749190vcTX5.LJII(str);
            }
            c1749190vcTX5.LJI();
        }
        C984403t4 c984403t4W53 = W5();
        View view6 = this.LLJJIII;
        if (view6 != null && (c1748470vbJ3 = (C1748470vbJ) view6.findViewById(R.id.zipcode_edit_text)) != null) {
            editText = c1748470vbJ3.getEditText();
        }
        c984403t4W53.LIZ(editText);
        C11EA.LJII(this, (JediViewModel) this.LLJJ.getValue(), new C2217381BqS() { // from class: X.03r8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((AddressSelectState) obj2).getCurrentAddressSelectType());
            }
        }, new AwS615S0100000_1(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) throws Throwable {
        C1748470vbJ c1748470vbJ;
        C0I7D editText;
        C1748470vbJ c1748470vbJ2;
        C1748470vbJ c1748470vbJ3;
        C1748470vbJ c1748470vbJ4;
        C1748470vbJ c1748470vbJ5 = null;
        if (Intrinsics.LJFF(str, "ec_zipcode_locate_address")) {
            ZipcodeLocateAddress zipcodeLocateAddressLIZ = C970103ql.LIZ(str2);
            Integer num = zipcodeLocateAddressLIZ.type;
            if (num != null) {
                if (num.intValue() == 0) {
                    if (Intrinsics.LJFF(zipcodeLocateAddressLIZ.isCheck, Boolean.TRUE)) {
                        W5().LJFF(((C973103rF) this.LLILLJJLI).LIZ, false);
                    }
                    String string = zipcodeLocateAddressLIZ.error;
                    if (string == null || string.length() == 0) {
                        string = this.itemView.getContext().getString(2131832874);
                    }
                    X5().LJFF(true);
                    X5().LIZJ(string);
                    View view = this.LLJJIII;
                    if (view != null && (c1748470vbJ4 = (C1748470vbJ) view.findViewById(R.id.zipcode_edit_text)) != null) {
                        c1748470vbJ4.LJI(true);
                    }
                    View view2 = this.LLJJIII;
                    if (view2 != null && (c1748470vbJ3 = (C1748470vbJ) view2.findViewById(R.id.zipcode_edit_text)) != null) {
                        c1748470vbJ3.LJIILJJIL(false);
                        return;
                    }
                    return;
                }
                if (num.intValue() == -1) {
                    Boolean bool = zipcodeLocateAddressLIZ.isCheck;
                    if (bool != null && Intrinsics.LJFF(bool, Boolean.TRUE)) {
                        W5().LJFF(((C973103rF) this.LLILLJJLI).LIZ, true);
                    }
                    String str3 = zipcodeLocateAddressLIZ.zipcode;
                    if (str3 != null) {
                        ((C973103rF) this.LLILLJJLI).LIZ = str3;
                        View view3 = this.LLJJIII;
                        if (view3 != null && (c1748470vbJ2 = (C1748470vbJ) view3.findViewById(R.id.zipcode_edit_text)) != null) {
                            c1748470vbJ2.LJIILIIL(str3);
                        }
                        View view4 = this.LLJJIII;
                        if (view4 != null && (c1748470vbJ = (C1748470vbJ) view4.findViewById(R.id.zipcode_edit_text)) != null && (editText = c1748470vbJ.getEditText()) != null) {
                            editText.setSelection(str3.length());
                        }
                    }
                    X5().LJFF(false);
                    X5().LIZJ("");
                    return;
                }
                num.intValue();
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "ec_zipcode_confirm")) {
            return;
        }
        C984403t4 c984403t4W5 = W5();
        View view5 = this.LLJJIII;
        if (view5 != null) {
            c1748470vbJ5 = (C1748470vbJ) view5.findViewById(R.id.zipcode_edit_text);
        }
        c984403t4W5.LIZIZ(c1748470vbJ5, (InterfaceC984903t9) this.LLILLJJLI);
    }
}
