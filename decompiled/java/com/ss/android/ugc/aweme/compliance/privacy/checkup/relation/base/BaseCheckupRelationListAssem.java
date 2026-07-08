package com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base;

import X.AbstractC1223200hw6;
import X.C01GW;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724240Sb0;
import X.C736820SvI;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS46S0100000_19;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseCheckupRelationListAssem<C, B extends AbstractC1223200hw6<C>> extends UIListContentAssem<BaseCheckupRelationViewModel<C, B>> {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19((BaseCheckupRelationListAssem) this, 861));

    public abstract Class<? extends PowerCell<?>> Lo();

    public abstract String No();

    public abstract void Oo();

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 10;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        String string;
        Bundle arguments;
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0hvb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C326270Cqf c326270Cqf = (C326270Cqf) obj;
                c326270Cqf.getClass();
                return C627260Oiy.LIZLLL(c326270Cqf);
            }
        }, this, null, new AwS385S0200000_19(view, (View) this, 18), new AwS420S0200000_19(view, (View) this, 35), new AwS385S0200000_19(view, (View) this, 19), 4, null);
        Go().addOnScrollListener(new AsS46S0100000_19(this, 2));
        AssemViewModel assemViewModelJo = ip();
        subscribe(assemViewModelJo, C736820SvI.LIZIZ(assemViewModelJo.usedInReusedScene), null, new AwS633S0100000_19(this, 34));
        BaseCheckupRelationViewModel baseCheckupRelationViewModelJo = ip();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (arguments = fragmentLJI.getArguments()) == null || (string = arguments.getString("enter_from")) == null) {
            string = "";
        }
        baseCheckupRelationViewModelJo.LLILLJJLI = string;
        ip().LLILLL = No();
    }
}
