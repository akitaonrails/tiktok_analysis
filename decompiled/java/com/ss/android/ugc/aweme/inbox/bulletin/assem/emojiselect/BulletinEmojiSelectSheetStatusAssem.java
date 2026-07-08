package com.ss.android.ugc.aweme.inbox.bulletin.assem.emojiselect;

import X.AbstractC738140SxQ;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1749280vcc;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C616840OHi;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiSelectSheetStatusAssem extends UIContentAssem {
    public C1749280vcc LLIZLLLIL;
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C616840OHi.class, "BulletinSelectEmojiSheetHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJI;

    public final C1749280vcc Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d4q) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public BulletinEmojiSelectSheetStatusAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 375);
        this.LLJI = new C736950SvV(C13LE.LIZ(BulletinEmojiViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(220), new AwS553S0100000_9((AbstractC738140SxQ) this, 374), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.0ORL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ORD) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 49), 6);
    }
}
