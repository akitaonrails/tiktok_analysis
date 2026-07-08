package com.ss.android.ugc.aweme.inbox.bulletin.assem.profile;

import X.AbstractC738140SxQ;
import X.C0OLV;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSettingEditCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSettingLabelCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSettingNewEntryCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSettingParentCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSettingSwitchCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSwitchCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardProfileSettingAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;
    public boolean LLJIJIL;

    public BulletinBoardProfileSettingAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 483);
        this.LLJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(271), new AwS553S0100000_9((AbstractC738140SxQ) this, 484), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.czg);
        this.LLJI = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(BulletinSettingSwitchCell.class, BulletinSwitchCell.class, BulletinSettingParentCell.class, BulletinSettingEditCell.class, BulletinSettingLabelCell.class, BulletinSettingNewEntryCell.class);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0OJ3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJJ;
            }
        }, null, new AwS623S0100000_9(this, 62), 6);
    }
}
