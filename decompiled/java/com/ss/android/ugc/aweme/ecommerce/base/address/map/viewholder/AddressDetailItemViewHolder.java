package com.ss.android.ugc.aweme.ecommerce.base.address.map.viewholder;

import X.C01GW;
import X.C13LE;
import X.C1745290vWB;
import X.C1745300vWC;
import X.C1745340vWG;
import X.C1745680vWo;
import X.C197039127h;
import X.C19719912Dl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C992303uL;
import X.EnumC1154240g8s;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressDetailItemViewHolder extends ECJediViewHolder<C1745680vWo> {
    public final AddressMapDetailFragment LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressMapDetailViewModel W5() {
        return (AddressMapDetailViewModel) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C1745300vWC c1745300vWC;
        String str;
        String str2;
        C197039127h c197039127h;
        String string;
        C1745680vWo c1745680vWo = (C1745680vWo) obj;
        View view = this.itemView;
        String str3 = null;
        if ((view instanceof C1745300vWC) && (c1745300vWC = (C1745300vWC) view) != null) {
            c1745300vWC.LJI(null, null, null, null, true);
            c1745300vWC.LIZIZ();
            C426750GoL.LJIIL(c1745300vWC, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
            c1745300vWC.LIZLLL(c1745680vWo.LIZ.title, false);
            TextView textView = (TextView) c1745300vWC.findViewById(R.id.xkj);
            if (textView != null) {
                textView.setHint(c1745680vWo.LIZ.hint);
                Object obj2 = c1745680vWo.LIZIZ;
                if (obj2 != null) {
                    string = obj2.toString();
                } else {
                    string = null;
                }
                textView.setText(string);
            }
            C786410Ut5.I7(new AjS44S0200000_26(this, c1745300vWC, 42), c1745300vWC);
            if (c1745680vWo.LIZJ == null) {
                W5().mR2(c1745680vWo);
            }
            C1745340vWG c1745340vWG = c1745680vWo.LIZJ;
            if (c1745340vWG != null && (str = c1745340vWG.LIZ) != null && !a0.LJJJIL(str)) {
                c1745300vWC.LJFF(c1745340vWG);
                c1745300vWC.LIZJ();
                if (c1745340vWG.LIZIZ == EnumC1154240g8s.ERROR && (c197039127h = this.LLJILJIL.LLJJJJJIL) != null) {
                    c197039127h.setEnabled(false);
                }
                AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = W5().LLILZIL;
                if (addressMapDetailEnterParams != null) {
                    str2 = addressMapDetailEnterParams.previousPage;
                } else {
                    str2 = null;
                }
                String str4 = c1745340vWG.LIZ;
                if (str4 == null) {
                    str4 = "";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("previous_page", str2);
                linkedHashMap.put("toast_name", str4);
                C1745290vWB.LJFF("tiktokec_toast_show", linkedHashMap);
            }
            AddressMapDetailViewModel addressMapDetailViewModelW5 = W5();
            if (!addressMapDetailViewModelW5.LLJILJILJ) {
                AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams2 = addressMapDetailViewModelW5.LLILZIL;
                if (addressMapDetailEnterParams2 != null) {
                    str3 = addressMapDetailEnterParams2.previousPage;
                }
                C1745290vWB.LIZJ(str3, "edit_address");
                addressMapDetailViewModelW5.LLJILJILJ = true;
            }
        }
    }

    public AddressDetailItemViewHolder(ViewGroup viewGroup, AddressMapDetailFragment addressMapDetailFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aj2, viewGroup));
        this.LLJILJIL = addressMapDetailFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressMapDetailViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 31));
    }
}
