package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode;

import X.AnonymousClass0378;
import X.C01GW;
import X.C03DZ;
import X.C049X;
import X.C0I7D;
import X.C11EA;
import X.C123100dR;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C1743750vTh;
import X.C1745180vW0;
import X.C1748470vbJ;
import X.C1748720vbi;
import X.C1749190vcT;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C756302xN;
import X.C786410Ut5;
import X.C970103ql;
import X.C973203rG;
import X.C984403t4;
import X.EnumC1749210vcV;
import X.InterfaceC984903t9;
import Y.ACListenerS136S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS56S0210000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EULogisticSelectByZipcodeVH extends ECJediViewHolder<C973203rG> {
    public final ViewGroup LLJILJIL;
    public LinearLayout LLJILJILJ;
    public C1749190vcT LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C984403t4 W5() {
        return (C984403t4) this.LLJJI.getValue();
    }

    public final View X5() {
        return (View) this.LLJJIII.getValue();
    }

    public final AddressSelectViewModel a6() {
        return (AddressSelectViewModel) this.LLJJ.getValue();
    }

    public final C1749190vcT b6() {
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
        C11EA.LJII(this, a6(), new C2217381BqS() { // from class: X.03r1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressSelectState) obj).getChooseLocation();
            }
        }, new AwS615S0100000_1(this, 80));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        AnonymousClass0378.LIZ().LIZJ("ec_zipcode_locate_address", this);
        AnonymousClass0378.LIZ().LIZJ("ec_zipcode_confirm", this);
        C1748470vbJ c1748470vbJ = (C1748470vbJ) X5().findViewById(R.id.zipcodeEditText);
        if (c1748470vbJ != null) {
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

    public EULogisticSelectByZipcodeVH(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b1g, viewGroup, false));
        this.LLJILJIL = viewGroup;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressSelectViewModel.class);
        this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 91));
        this.LLJJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1488));
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1489));
    }

    public final void c6(boolean z) {
        Integer numLIZJ;
        if (z) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.zs, this.itemView.getContext());
        } else {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a01, this.itemView.getContext());
        }
        if (numLIZJ != null) {
            numLIZJ.intValue();
            X5().findViewById(R.id.uqc).setBackgroundColor(numLIZJ.intValue());
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        View viewFindViewById;
        List<ChangeLocationData> list;
        int i;
        C973203rG c973203rG = (C973203rG) obj;
        View viewFindViewById2 = this.LLJILJILJ;
        C0I7D editText = null;
        if (viewFindViewById2 == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById2 = view.findViewById(R.id.zipcode_input_layout);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJILJILJ = (LinearLayout) viewFindViewById2;
        }
        if (viewFindViewById2 != null) {
            C12ES.LJIILL(0, viewFindViewById2);
        }
        View viewFindViewById3 = X5().findViewById(R.id.zipcodeEditText);
        if (viewFindViewById3 != null) {
            viewFindViewById = viewFindViewById3.findViewById(R.id.uqb);
        } else {
            viewFindViewById = null;
        }
        C03DZ.LIZ(viewFindViewById);
        TuxTextView tuxTextView = (TuxTextView) X5().findViewById(R.id.t3g);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS136S0100000_1(this, 0));
        }
        View viewFindViewById4 = X5().findViewById(R.id.j46);
        DeliveryData deliveryData = a6().LLIZ;
        if (deliveryData != null) {
            list = deliveryData.changeLocationSelections;
        } else {
            list = null;
        }
        if (C756302xN.LIZ(list)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById4);
        if (X5().findViewById(R.id.j46).getVisibility() == 0) {
            C1748720vbi.LIZLLL(this.itemView, new C049X(), AFwS228S0000000_1.get$arr$(9));
        }
        C1841350y17 c1841350y17 = (C1841350y17) X5().findViewById(R.id.t3f);
        if (c1841350y17 != null) {
            c1841350y17.setChecked(false);
        }
        View viewFindViewById5 = X5().findViewById(R.id.spa);
        if (viewFindViewById5 != null) {
            C786410Ut5.I7(new AjS40S0200000_1(this, c973203rG, 1), viewFindViewById5);
        }
        ChangeLocationData changeLocationDataLR2 = a6().lR2();
        if (changeLocationDataLR2 == null) {
            DeliveryData deliveryData2 = a6().LLIZ;
            if (deliveryData2 != null) {
                changeLocationDataLR2 = deliveryData2.changeLocationData;
            } else {
                changeLocationDataLR2 = null;
            }
        }
        d6(changeLocationDataLR2, false);
        W5().LIZLLL((C1748470vbJ) X5().findViewById(R.id.zipcodeEditText), c973203rG, new AwS580S0100000_1(this, 18));
        C984403t4 c984403t4W5 = W5();
        C1748470vbJ c1748470vbJ = (C1748470vbJ) X5().findViewById(R.id.zipcodeEditText);
        if (c1748470vbJ != null) {
            editText = c1748470vbJ.getEditText();
        }
        c984403t4W5.LIZ(editText);
        C11EA.LJII(this, a6(), new C2217381BqS() { // from class: X.03r7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((AddressSelectState) obj2).getCurrentAddressSelectType());
            }
        }, new AwS615S0100000_1(this, 0));
    }

    public final void d6(ChangeLocationData changeLocationData, boolean z) {
        String strLIZIZ;
        String strLIZIZ2;
        Region region;
        Region region2;
        withState(a6(), new AwS56S0210000_1(changeLocationData, this, z, 2));
        TextView textView = (TextView) X5().findViewById(R.id.t3g);
        String str = null;
        if (changeLocationData != null && (region2 = changeLocationData.region) != null) {
            strLIZIZ = region2.LIZIZ();
        } else {
            strLIZIZ = null;
        }
        textView.setText(strLIZIZ);
        C984403t4 c984403t4W5 = W5();
        C1748470vbJ c1748470vbJ = (C1748470vbJ) X5().findViewById(R.id.zipcodeEditText);
        c984403t4W5.getClass();
        C984403t4.LJ(c1748470vbJ, changeLocationData);
        TextView textView2 = (TextView) X5().findViewById(R.id.t3g);
        ChangeLocationData changeLocationDataLR2 = a6().lR2();
        if (changeLocationDataLR2 != null && (region = changeLocationDataLR2.region) != null) {
            strLIZIZ2 = region.LIZIZ();
        } else {
            strLIZIZ2 = null;
        }
        textView2.setText(strLIZIZ2);
        C1749190vcT c1749190vcTB6 = b6();
        if (c1749190vcTB6 != null) {
            c1749190vcTB6.setFormField(X5());
            c1749190vcTB6.LIZIZ(EnumC1749210vcV.NONE);
            if (changeLocationData != null) {
                str = changeLocationData.zipcodeTitle;
            }
            if (C123100dR.LIZ(str)) {
                c1749190vcTB6.LJII(str);
            }
            c1749190vcTB6.LJI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) throws Throwable {
        Region region;
        Region region2;
        C0I7D editText;
        if (Intrinsics.LJFF(str, "ec_zipcode_locate_address")) {
            ZipcodeLocateAddress zipcodeLocateAddressLIZ = C970103ql.LIZ(str2);
            Integer num = zipcodeLocateAddressLIZ.type;
            if (num != null) {
                if (num.intValue() == 0) {
                    if (Intrinsics.LJFF(zipcodeLocateAddressLIZ.isCheck, Boolean.TRUE)) {
                        W5().LJFF(((C973203rG) this.LLILLJJLI).LIZ, false);
                    }
                    String string = zipcodeLocateAddressLIZ.error;
                    if (string == null || string.length() == 0) {
                        string = this.itemView.getContext().getString(2131832874);
                    }
                    b6().LJFF(true);
                    b6().LIZJ(string);
                    c6(true);
                    C1748470vbJ c1748470vbJ = (C1748470vbJ) X5().findViewById(R.id.zipcodeEditText);
                    if (c1748470vbJ != null) {
                        c1748470vbJ.LJIILJJIL(false);
                        return;
                    }
                    return;
                }
                if (num.intValue() == -1) {
                    Boolean bool = zipcodeLocateAddressLIZ.isCheck;
                    if (bool != null && Intrinsics.LJFF(bool, Boolean.TRUE)) {
                        W5().LJFF(((C973203rG) this.LLILLJJLI).LIZ, true);
                    }
                    String str3 = zipcodeLocateAddressLIZ.zipcode;
                    if (str3 != null) {
                        ((C973203rG) this.LLILLJJLI).LIZ = str3;
                        C1748470vbJ c1748470vbJ2 = (C1748470vbJ) X5().findViewById(R.id.zipcodeEditText);
                        if (c1748470vbJ2 != null) {
                            c1748470vbJ2.LJIILIIL(str3);
                        }
                        C1748470vbJ c1748470vbJ3 = (C1748470vbJ) X5().findViewById(R.id.zipcodeEditText);
                        if (c1748470vbJ3 != null && (editText = c1748470vbJ3.getEditText()) != null) {
                            editText.setSelection(str3.length());
                        }
                    }
                    b6().LJFF(false);
                    c6(false);
                    b6().LIZJ("");
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
        ChangeLocationData changeLocationDataLR2 = a6().lR2();
        if (changeLocationDataLR2 != null) {
            region = changeLocationDataLR2.region;
        } else {
            region = null;
        }
        if (C1745180vW0.LJI(region)) {
            ChangeLocationData changeLocationDataLR22 = a6().lR2();
            if (changeLocationDataLR22 == null || (region2 = changeLocationDataLR22.region) == null) {
                return;
            }
            a6().oR2("", Collections.singletonList(region2));
            return;
        }
        W5().LIZIZ((C1748470vbJ) X5().findViewById(R.id.zipcodeEditText), (InterfaceC984903t9) this.LLILLJJLI);
    }
}
