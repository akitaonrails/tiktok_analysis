package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base;

import X.C01GW;
import X.C0DJ1;
import X.C0QSJ;
import X.C1308910kAL;
import X.C1558520qew;
import X.C1860130yVP;
import X.C321330Cih;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C724270Sb3;
import X.InterfaceC1146704e9;
import X.InterfaceC1860810yWV;
import X.InterfaceC687730QyJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CommerceAgentAnswerBaseAssem<T extends C321330Cih> extends CommerceAgentBaseAssem<T> implements CommerceAgentCardAbility, C0QSJ, InterfaceC1146704e9 {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS548S0100000_4((CommerceAgentAnswerBaseAssem) this, 55));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS548S0100000_4((CommerceAgentAnswerBaseAssem) this, 54));

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final void D71() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final void EF0() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final void Kk(View view, List<? extends CharSequence> list, String str, String str2) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommerceAgentAnswerCardScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommerceAgentAnswerCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommerceAgentAnswerCardScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final void hw(C1860130yVP c1860130yVP) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final void jJ0() {
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public abstract InterfaceC1860810yWV sp();

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final Message LI2() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C321330Cih) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final ViewGroup Y4() {
        Object objSp = sp();
        if (objSp instanceof ViewGroup) {
            return (ViewGroup) objSp;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), CommerceAgentCardAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, CommerceAgentCardAbility.class, null, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public void up(T t) {
        View view;
        Integer numLIZJ;
        InterfaceC1860810yWV interfaceC1860810yWVSp = sp();
        if (interfaceC1860810yWVSp != null) {
            interfaceC1860810yWVSp.setHasLeftTail(true);
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            InterfaceC1860810yWV interfaceC1860810yWVSp2 = sp();
            if (interfaceC1860810yWVSp2 != null) {
                interfaceC1860810yWVSp2.setBackgroundDrawColor(iIntValue);
            }
        }
        InterfaceC1860810yWV interfaceC1860810yWVSp3 = sp();
        if (interfaceC1860810yWVSp3 != null) {
            interfaceC1860810yWVSp3.LIZ(t.LL.LJ, true, false, LJJIJL(), null, null, null, null, true);
        }
        Object objSp = sp();
        if (objSp instanceof View) {
            view = (View) objSp;
        } else {
            view = null;
        }
        C0DJ1.LIZJ(view);
    }
}
