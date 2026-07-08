package com.ss.android.ugc.aweme.inbox.bulletin.assem.emojideatil;

import X.AbstractC738140SxQ;
import X.C0OZL;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1749280vcc;
import X.C1846060y8i;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiDetailSheetStatusAssem extends UIContentAssem {
    public C1749280vcc LLIZLLLIL;
    public C1846060y8i LLJ;
    public ViewOnAttachStateChangeListenerC20631115oD LLJI;
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723580SZw(this, C0OZL.class, "BulletinEmojiDetailSheetHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJILJIL;

    public final C1749280vcc Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d0p) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C1846060y8i Ho() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d0r) : null;
            this.LLJ = (C1846060y8i) viewFindViewById;
        }
        return (C1846060y8i) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20631115oD Jo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d0s) : null;
            this.LLJI = (ViewOnAttachStateChangeListenerC20631115oD) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20631115oD) viewFindViewById;
    }

    public BulletinEmojiDetailSheetStatusAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 369);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(BulletinEmojiDetailViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(217), new AwS553S0100000_9((AbstractC738140SxQ) this, 368), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILJIL.getValue(), new C2217381BqS() { // from class: X.0Obb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C622710Obd) obj).LL;
            }
        }, null, new AwS618S0100000_4(this, 12), 6);
    }
}
