package com.ss.android.ugc.aweme.inbox.bulletin.assem.input;

import X.AbstractC738140SxQ;
import X.C0OLV;
import X.C0OWL;
import X.C10UZ;
import X.C1220000hqw;
import X.C1336205Ku;
import X.C1361400lX0;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.ability.InputEmojiButtonAbility;
import com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputEmojiAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiButtonAssem extends UISlotAssem implements BulletinEditInputEmojiAbility, InterfaceC1554640qYg {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C0OWL.class, "bulletin_board_edit_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public Function1<? super Integer, Unit> LLJJIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a6u;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 658253938) {
            return null;
        }
        return this;
    }

    public BulletinEmojiButtonAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 385);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(BulletinEditViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(223), new AwS553S0100000_9((AbstractC738140SxQ) this, 386), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputEmojiAbility
    public final void cY0(int i) {
        int iIntValue;
        C1361400lX0 c1361400lX0 = new C1361400lX0(getContext(), i);
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        int iIntValue2 = 0;
        if (tuxIconView != null) {
            Integer numLIZ = C10UZ.LIZ(R.attr.a1h, c1361400lX0);
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxIconView.setTintColor(iIntValue);
        }
        Function1<? super Integer, Unit> function1 = this.LLJJIJIL;
        if (function1 != null) {
            Integer numLIZ2 = C10UZ.LIZ(R.attr.a1h, c1361400lX0);
            if (numLIZ2 != null) {
                iIntValue2 = numLIZ2.intValue();
            }
            function1.invoke(Integer.valueOf(iIntValue2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEmojiButtonAssem$onViewCreated$1$2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEmojiButtonAssem$onViewCreated$1$1] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1336205Ku.LIZ(false).getAssembleEmojiPanelService().LIZ(this, new RequestKeyboardAbility() { // from class: com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEmojiButtonAssem$onViewCreated$1$1
            @Override // com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility
            public final void Fr() {
                ((BulletinEditViewModel) this.LL.LLJJIJI.getValue()).yQ2(true);
            }
        }, new InputEmojiButtonAbility() { // from class: com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEmojiButtonAssem$onViewCreated$1$2
            @Override // com.ss.android.ugc.aweme.im.ability.InputEmojiButtonAbility
            public final void ZW1(AwS581S0100000_2 awS581S0100000_2) {
                this.LL.LLJJIJIL = awS581S0100000_2;
            }

            @Override // com.ss.android.ugc.aweme.im.ability.InputEmojiButtonAbility
            public final void mU(TuxIconView tuxIconView) {
                this.LL.LLJJIJIIJIL = tuxIconView;
            }
        });
    }
}
