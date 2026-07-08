package com.ss.android.ugc.nearby.component;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C20684815ws;
import X.C2097608Jq;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class NearbyNonPersonalizedUIComponent extends BasePanelUIComponent implements INonPersonalizedShowToast, InterfaceC1554640qYg {
    public ViewGroup LLJIJIL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1989385907) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.nearby.component.INonPersonalizedShowToast
    public final void Sh() {
        Resources resources;
        ViewGroup viewGroup = this.LLJIJIL;
        String string = null;
        TextView textView = viewGroup != null ? (TextView) viewGroup.findViewById(R.id.pgb) : null;
        int i = Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.FALSE) ? 2131838203 : 2131838202;
        if (textView != null) {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                string = resources.getString(i);
            }
            textView.setText(string);
        }
        ViewGroup viewGroup2 = this.LLJIJIL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("login_type", ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("scenario", CardStruct.IStatusCode.DEFAULT);
        pairArr[2] = new Pair("enter_from", "homepage_nearby");
        C20684815ws.LJIILLIIL("show_feed_personalization_toast", C2097608Jq.LJIIIIZZ(pairArr));
        ViewGroup viewGroup3 = this.LLJIJIL;
        if (viewGroup3 != null) {
            HandlerHook.viewPostDelay(viewGroup3, new ARunnableS109S0100000_9(this, 158), 3000L);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.frb);
        this.LLJIJIL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 36, 42), viewGroup);
        }
    }
}
