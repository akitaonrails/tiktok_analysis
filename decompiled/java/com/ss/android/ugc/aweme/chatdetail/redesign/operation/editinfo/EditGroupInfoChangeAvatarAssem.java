package com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo;

import X.AnonymousClass0204;
import X.C019F;
import X.C01GW;
import X.C0I0B;
import X.C0PEM;
import X.C0ZBR;
import X.C0ZBU;
import X.C1331660kl2;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C2274381E0m;
import X.C23250099c;
import X.C337180DJs;
import X.C427660Gpo;
import X.C431260Gvc;
import X.C444940Hca;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C898670ZNh;
import X.InterfaceC1255040ilS;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS128S1100000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlinx.coroutines.CoroutineExceptionHandler;
import wh6.AbS695S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class EditGroupInfoChangeAvatarAssem extends UIContentAssem implements InterfaceC1255040ilS {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditGroupInfoChangeAvatarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/editinfo/EditGroupInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditGroupInfoChangeAvatarAssem() {
        checkSupervisorPrepared();
        new C723580SZw(this, C0ZBR.class, null);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditGroupInfoViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 129), AFwS248S0000000_14.get$arr$(35), null, true);
        this.LLJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 126));
        this.LLJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 128));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 127));
    }

    @Override // X.InterfaceC1255040ilS
    public final void Eb0(AvatarUri avatarUri) {
    }

    @Override // X.InterfaceC1255040ilS
    public final void hO(Exception exc) {
    }

    public final EditGroupInfoViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (EditGroupInfoViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        BaseActivity baseActivity;
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (!(c19egLIZ instanceof BaseActivity) || (baseActivity = (BaseActivity) c19egLIZ) == null) {
            return;
        }
        baseActivity.activityConfiguration(new AwS593S0100000_14(this, 14));
    }

    @Override // X.InterfaceC1255040ilS
    public final void dN2(String str) {
        if (str != null) {
            C1331660kl2.LIZJ().LIZ();
            EditGroupInfoViewModel editGroupInfoViewModelGo = Go();
            editGroupInfoViewModelGo.setState(new AwS128S1100000_14(editGroupInfoViewModelGo, str, 14));
            IMGroupChatDetailAnalytics.LIZ.LJFF("click_save_group_photo", new Pair[]{new Pair("enter_from", editGroupInfoViewModelGo.xQ2().LLILLJJLI)}, C0I0B.LJFF.LIZIZ());
            if (str.length() == 0) {
                editGroupInfoViewModelGo.setState(AFwS248S0000000_14.get$arr$(571));
            } else {
                if (!C2274381E0m.LIZIZ.LIZJ(true, true)) {
                    return;
                }
                C23250099c.LIZLLL(editGroupInfoViewModelGo.getAssemVMScope(), C0PEM.LIZJ.plus(new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 19)), null, new C0ZBU(editGroupInfoViewModelGo, str, System.currentTimeMillis(), null), 2);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C427660Gpo.LJIIJJI((C427660Gpo) this.LLJ.getValue(), Go().getState().LL, false, null, null, false, false, null, null, false, null, 1022);
        C786410Ut5.I7(new AbS695S0100000_14(this, 15), (View) this.LLJ.getValue());
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null) {
            iMCrossAppFeatureDiffApiLIZIZ.LJIILJJIL();
            TextView textView = (TextView) this.LLJI.getValue();
            textView.setMovementMethod(C431260Gvc.LIZ);
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = C1383370m6R.LJIIJ(2131831395);
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZIZ(62);
            c444940Hca.LIZLLL(5);
            c444940Hca.LJIIIIZZ = new AwS558S0100000_14(this, 1800);
            textView.setText(c444940Hca.LIZ(textView.getContext()));
        } else {
            C337180DJs.LIZ((View) this.LLJI.getValue());
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0ZBg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZBZ) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 6), 4);
    }
}
