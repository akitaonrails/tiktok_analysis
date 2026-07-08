package com.ss.android.ugc.aweme.tako.botpage.components.botcenter;

import X.AbstractC738140SxQ;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C20237414Gm;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS304S0300000_27;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoBotCenterRecentlyChatAssem extends UISlotAssem {
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(TakoBotCenterViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS274S0000000_30.get$arr$(153), new AwS574S0100000_30((AbstractC738140SxQ) this, 240), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C20237414Gm.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fli;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.svs);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.svy);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(RecentlyAddCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        C736680Sv4.LJIIIIZZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.14Gj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1576320r7e) obj).LLILZ;
            }
        }, null, new AwS304S0300000_27(viewOnAttachStateChangeListenerC20604515jv, tuxTextView, this, 4), 6);
    }
}
