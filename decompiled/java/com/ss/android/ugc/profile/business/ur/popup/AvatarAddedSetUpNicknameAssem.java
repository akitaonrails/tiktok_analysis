package com.ss.android.ugc.profile.business.ur.popup;

import X.C019F;
import X.C01GW;
import X.C1169840gY2;
import X.C1252710ihh;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C422840Gi2;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1169630gXh;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class AvatarAddedSetUpNicknameAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public C422840Gi2 LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AvatarAddedSetUpNicknameAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/popup/AvatarAndNicknamePopupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AvatarAddedSetUpNicknameAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AvatarAndNicknamePopupViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2407), AFwS256S0000000_18.get$arr$(814), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2406));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final AvatarAndNicknamePopupViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (AvatarAndNicknamePopupViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((ViewStub) LJJIJL()).setOnInflateListener(null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C422840Gi2 c422840Gi2 = this.LLJ;
        if (c422840Gi2 != null) {
            C1169840gY2.LIZ(c422840Gi2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((ViewStub) view).setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.0gXr
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view2) {
                String nickname;
                User curUser;
                this.LIZ.LLJ = (C422840Gi2) view2.findViewById(R.id.jjh);
                C422840Gi2 c422840Gi2 = this.LIZ.LLJ;
                if (c422840Gi2 != null) {
                    C1169840gY2.LIZ(c422840Gi2);
                }
                TextView textView = (TextView) view2.findViewById(R.id.user_id);
                IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                if (iAccountUserServiceLJFF == null || (curUser = iAccountUserServiceLJFF.getCurUser()) == null || (nickname = curUser.getNickname()) == null) {
                    nickname = "";
                }
                textView.setText(nickname);
                C197039127h c197039127h = (C197039127h) view2.findViewById(R.id.gqs);
                if (c197039127h != null) {
                    C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18(this.LIZ, 138));
                }
                C197039127h c197039127h2 = (C197039127h) view2.findViewById(R.id.pc9);
                if (c197039127h2 != null) {
                    C786410Ut5.U8(c197039127h2, new ACListenerS153S0100000_18(this.LIZ, 139));
                }
                C786410Ut5.a9((TuxIconView) view2.findViewById(R.id.s16), new ACListenerS153S0100000_18(this.LIZ, 140));
            }
        });
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0gXs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1169650gXj) obj).LL;
            }
        }, null, new AwS632S0100000_18(view, 207), 6);
        C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC1169630gXh.class), new C2217381BqS() { // from class: X.0gXt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1169640gXi) obj).LIZ;
            }
        }, new AwS597S0100000_18(this, 620));
    }
}
