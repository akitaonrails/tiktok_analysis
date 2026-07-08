package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticdistrict;

import X.C01GW;
import X.C03DZ;
import X.C11EA;
import X.C123100dR;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C1749190vcT;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.C969703qh;
import X.EnumC1749210vcV;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import java.util.List;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class USLogisticSelectByDistrictVH extends ECJediViewHolder<C969703qh> {
    public final ViewGroup LLJILJIL;
    public final FragmentManager LLJILJILJ;
    public C1749190vcT LLJILLL;
    public final C01GW LLJJ;
    public View LLJJI;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressSelectViewModel X5() {
        return (AddressSelectViewModel) this.LLJJ.getValue();
    }

    public static String W5(List list) {
        List listLJJJJIZL;
        List listLJLJJLL;
        String strLIZIZ;
        Region region = (Region) C13LP.LJJLIIIJL(list);
        String strLIZIZ2 = "";
        if (list.size() >= 2 && (listLJLJJLL = C13LP.LJLJJLL((listLJJJJIZL = C13LP.LJJJJIZL(C13LP.LJJJJJ(1, list), 1)))) != null) {
            int i = 0;
            for (Object obj : listLJLJJLL) {
                int i2 = i + 1;
                if (i >= 0) {
                    Region region2 = (Region) obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ2);
                    if (i == listLJJJJIZL.size() - 1) {
                        strLIZIZ = region2.code;
                        if (strLIZIZ == null) {
                            strLIZIZ = region2.name;
                        }
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        String str = region2.code;
                        if (str == null) {
                            str = region2.name;
                        }
                        sbLIZ2.append(str);
                        sbLIZ2.append(", ");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        String str2 = strLIZIZ2 + ' ';
        if (region != null) {
            return str2 + region.name;
        }
        return str2;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        View viewFindViewById;
        View view;
        TextView textView;
        View viewFindViewById2;
        View viewFindViewById3;
        C1841350y17 c1841350y17;
        TextView textView2;
        String str;
        C969703qh c969703qh = (C969703qh) obj;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLJILJIL.getContext()), R.layout.b1e, this.LLJILJIL, false);
        this.LLJJI = viewTd;
        String str2 = null;
        if (viewTd != null && (textView2 = (TextView) viewTd.findViewById(R.id.t3q)) != null) {
            ChangeLocationData changeLocationDataLR2 = X5().lR2();
            if (changeLocationDataLR2 != null) {
                str = changeLocationDataLR2.zipcodePlaceHolderHint;
            } else {
                str = null;
            }
            textView2.setHint(str);
        }
        View view2 = this.LLJJI;
        if (view2 != null && (c1841350y17 = (C1841350y17) view2.findViewById(R.id.t3l)) != null) {
            c1841350y17.setChecked(false);
        }
        View view3 = this.LLJJI;
        if (view3 != null && (viewFindViewById3 = view3.findViewById(R.id.t3m)) != null) {
            C786410Ut5.I7(new AjS40S0200000_1(c969703qh, this, 100), viewFindViewById3);
        }
        View view4 = this.LLJJI;
        if (view4 != null) {
            viewFindViewById = view4.findViewById(R.id.t3j);
        } else {
            viewFindViewById = null;
        }
        C03DZ.LIZJ(viewFindViewById);
        View view5 = this.LLJJI;
        if (view5 != null && (viewFindViewById2 = view5.findViewById(R.id.t3j)) != null) {
            C786410Ut5.I7(new AjS60S0100000_1(this, 147), viewFindViewById2);
        }
        List<Region> list = c969703qh.LIZ;
        if (list != null && (view = this.LLJJI) != null && (textView = (TextView) view.findViewById(R.id.t3q)) != null) {
            textView.setText(W5(list));
        }
        View viewFindViewById4 = this.LLJILLL;
        if (viewFindViewById4 == null) {
            View view6 = this.itemView;
            if (view6 != null) {
                viewFindViewById4 = view6.findViewById(R.id.t3o);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJILLL = (C1749190vcT) viewFindViewById4;
        }
        C1749190vcT c1749190vcT = (C1749190vcT) viewFindViewById4;
        if (c1749190vcT != null) {
            c1749190vcT.setFormField(this.LLJJI);
            c1749190vcT.LIZIZ(EnumC1749210vcV.NONE);
            ChangeLocationData changeLocationDataLR22 = X5().lR2();
            if (changeLocationDataLR22 != null) {
                str2 = changeLocationDataLR22.zipcodeTitle;
            }
            if (C123100dR.LIZ(str2)) {
                c1749190vcT.LJII(str2);
            }
            c1749190vcT.LJI();
        }
        C11EA.LJII(this, X5(), new C2217381BqS() { // from class: X.03qp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((AddressSelectState) obj2).getCurrentAddressSelectType());
            }
        }, new AwS615S0100000_1(this, 347));
    }

    public USLogisticSelectByDistrictVH(ViewGroup viewGroup, FragmentManager fragmentManager) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b1f, viewGroup, false));
        this.LLJILJIL = viewGroup;
        this.LLJILJILJ = fragmentManager;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressSelectViewModel.class);
        this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 88));
    }
}
