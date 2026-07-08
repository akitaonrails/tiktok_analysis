package com.ss.android.ugc.profile.business.ur.aigc;

import X.AbstractC214823195h;
import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAigcStyleAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAigcStyleAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/aigc/ProfileAigcStyleViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ProfileAigcStyleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileAigcStyleViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2241), AFwS257S0000000_19.get$arr$(381), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.evr);
        this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = null;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ChooseStyleCell.class);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 2);
        gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.0hsT
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                return i == 0 ? 2 : 1;
            }
        };
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(gridLayoutManager);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewOnAttachStateChangeListenerC20604515jv.getContext());
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv3 == null) {
            viewOnAttachStateChangeListenerC20604515jv3 = null;
        }
        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.ebb, viewOnAttachStateChangeListenerC20604515jv3, false);
        ((TextView) viewTd.findViewById(R.id.title)).setText(viewOnAttachStateChangeListenerC20604515jv.getResources().getString(2131820649));
        ((TuxTextView) viewTd.findViewById(R.id.title)).LJJJJI(32.0f);
        ((TextView) viewTd.findViewById(R.id.wlq)).setText(viewOnAttachStateChangeListenerC20604515jv.getResources().getString(2131820648));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv4;
        }
        viewOnAttachStateChangeListenerC20604515jv2.LJ(0, viewTd);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hsR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NPS) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 129), 6);
    }
}
