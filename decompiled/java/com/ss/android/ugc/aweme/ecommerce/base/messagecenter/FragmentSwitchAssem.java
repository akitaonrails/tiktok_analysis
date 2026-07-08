package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.AbstractC738140SxQ;
import X.AnonymousClass0208;
import X.C1215090hj1;
import X.C1243880iTS;
import X.C1243940iTY;
import X.C1266290j3b;
import X.C13LE;
import X.C19719912Dl;
import X.C19EH;
import X.C1AF0;
import X.C2217381BqS;
import X.C23250099c;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1216680hla;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS598S0100000_19;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentSwitchAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public C1215090hj1 LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public MessageCenterFragment LLJI;
    public MsgCreatorFragment LLJIJIL;
    public EnumC1216680hla LLJILJIL;
    public long LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FragmentSwitchAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/base/messagecenter/FragmentSwitchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        FragmentSwitchViewModel fragmentSwitchViewModelGo = Go();
        if (C1243940iTY.LIZ.LIZIZ() == null) {
            fragmentSwitchViewModelGo.setState(AFwS257S0000000_19.get$arr$(631));
        }
        C23250099c.LIZLLL(fragmentSwitchViewModelGo.getAssemVMScope(), null, null, new C1243880iTS(fragmentSwitchViewModelGo, null), 3);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0iTO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1243830iTN) obj).LLILZ);
            }
        }, null, AnonymousClass0208.get$arr$(27), 6);
        FragmentSwitchViewModel fragmentSwitchViewModelGo2 = Go();
        selectSubscribe(fragmentSwitchViewModelGo2, new C2217381BqS() { // from class: X.0iTP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1243830iTN) obj).LLILZ);
            }
        }, new C2217381BqS() { // from class: X.0iTK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1243830iTN) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0iTL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1243830iTN) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0iTM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1243830iTN) obj).LLILLL;
            }
        }, C736820SvI.LIZIZ(fragmentSwitchViewModelGo2.usedInReusedScene), null, new C1266290j3b(this, 2));
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.p2b) : null;
            this.LLIZLLLIL = (C1215090hj1) viewFindViewById;
        }
        ((C1215090hj1) viewFindViewById).setOnSelectTabListener(new AwS598S0100000_19(this, 140));
        View view = this.LLIZLLLIL;
        if (view == null) {
            View viewLJJIJL2 = LJJIJL();
            View viewFindViewById2 = viewLJJIJL2 != null ? viewLJJIJL2.findViewById(R.id.p2b) : null;
            this.LLIZLLLIL = (C1215090hj1) viewFindViewById2;
            view = viewFindViewById2;
        }
        ((C1215090hj1) view).setBackBtnClick(new AwS546S0100000_2(this, 162));
    }

    public final FragmentSwitchViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (FragmentSwitchViewModel) assemVMLazy.getValue();
    }

    public FragmentSwitchAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FragmentSwitchViewModel.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 163);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(147);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS546S0100000_2((AbstractC738140SxQ) this, 164), aFwS257S0000000_19, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJ = assemVMLazy;
    }

    public final void Ho() {
        Bundle bundle;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return;
        }
        C19EH c19ehLJIIJ = fragmentLJI.getChildFragmentManager().LJIIJ();
        MsgCreatorFragment msgCreatorFragment = this.LLJIJIL;
        if (msgCreatorFragment != null) {
            c19ehLJIIJ.LJIL(msgCreatorFragment, Lifecycle.State.STARTED);
            c19ehLJIIJ.LJIILL(msgCreatorFragment);
        }
        MessageCenterFragment messageCenterFragment = this.LLJI;
        if (messageCenterFragment == null) {
            MessageCenterFragment messageCenterFragment2 = new MessageCenterFragment();
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 == null || (bundle = fragmentLJI2.getArguments()) == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle(bundle);
            Boolean bool = Go().getState().LL;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            bundle2.putBoolean("hide_inbox_nav_bar", zBooleanValue);
            bundle2.putBoolean("hide_creator_msg", zBooleanValue);
            bundle2.putBoolean("has_parent_page_fragment", true);
            if (this.LLJILJIL == EnumC1216680hla.CREATOR) {
                String string = bundle2.getString("trackParams");
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        jSONObject.put("start_click_time", this.LLJILJILJ);
                        C786410Ut5.LJJJI("trackParams", C786410Ut5.J3(jSONObject), bundle2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }
                C786410Ut5.LJJJI("previous_page", "creator_message", bundle2);
            }
            messageCenterFragment2.setArguments(bundle2);
            this.LLJI = messageCenterFragment2;
            c19ehLJIIJ.LIZJ(R.id.weh, messageCenterFragment2, "message_shop_fragment");
            c19ehLJIIJ.LJIL(messageCenterFragment2, Lifecycle.State.RESUMED);
        } else {
            c19ehLJIIJ.LJIL(messageCenterFragment, Lifecycle.State.RESUMED);
            c19ehLJIIJ.LJJIFFI(messageCenterFragment);
        }
        c19ehLJIIJ.LJIIL();
        this.LLJILJIL = EnumC1216680hla.SHOP;
    }
}
