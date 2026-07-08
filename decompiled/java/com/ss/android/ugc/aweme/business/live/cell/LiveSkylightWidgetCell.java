package com.ss.android.ugc.aweme.business.live.cell;

import X.C01GW;
import X.C0I7Z;
import X.C1596320rdu;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C20642515q3;
import X.C20684815ws;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C486660J6q;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1606080rte;
import X.InterfaceC1605330rsR;
import X.InterfaceC1891350zJl;
import Y.ACListenerS155S0100000_21;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveSkylightWidgetCell extends PowerCell<C1596320rdu> implements InterfaceC1605330rsR {
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 97));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 98));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 99));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 96));

    @Override // X.InterfaceC1605330rsR
    public final String getAuthorId() {
        return null;
    }

    @Override // X.InterfaceC1605330rsR
    public final String getEnterFrom() {
        return "homepage_follow";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c7f;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) this.LL.getValue();
        if (iSkylightListAbility != null) {
            iSkylightListAbility.kf1((TuxTextView) this.LLILLL.getValue());
        }
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        EnumC1606080rte enumC1606080rte = EnumC1606080rte.FOLLOW_SKYLIGHT;
        View view = this.itemView;
        c1607400rvm.LIZIZ(enumC1606080rte, new C1608320rxG(view, view.findViewById(R.id.bi2), (View) this.LLILZ.getValue(), (View) this.LLILLL.getValue(), (TuxIconView) null, 48), false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        boolean z = C486660J6q.LIZ;
        HashMap map = new HashMap();
        map.put("position", "follow_tab_cover");
        C20684815ws.LJIILLIIL("livesdk_widget_tutorial_show", map);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1596320rdu c1596320rdu = (C1596320rdu) interfaceC1891350zJl;
        super.onBindItemView(c1596320rdu);
        C2271391DvN.LIZ((View) this.LLILLJJLI.getValue(), C2271381DvM.LIZ());
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 240), (View) this.LLILLJJLI.getValue());
        ((TextView) this.LLILLL.getValue()).setText(C20642515q3.LJI(2131849162));
        View view = (View) this.LLILZ.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bt);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJIJ();
        if (c1596320rdu.LL) {
            C0I7Z.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)), (View) this.LLILLJJLI.getValue());
        }
    }
}
