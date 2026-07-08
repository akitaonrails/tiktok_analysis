package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.AbstractC738140SxQ;
import X.C0OLV;
import X.C1220000hqw;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS144S0100000_9;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinQuickSendButtonAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSendMessageIconAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIII;
    public TuxIconView LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a86;
    }

    public BulletinSendMessageIconAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 449);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(BulletinEditViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(257), new AwS553S0100000_9((AbstractC738140SxQ) this, 450), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = (TuxIconView) view.findViewById(R.id.d5c);
        Context context = getContext();
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZ = R.raw.icon_arrow_up_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ob);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
            TuxIconView tuxIconView = this.LLJJIJI;
            if (tuxIconView != null) {
                tuxIconView.setImageDrawable(layerDrawableLJIILIIL);
            }
        }
        BulletinQuickSendButtonAbility bulletinQuickSendButtonAbility = (BulletinQuickSendButtonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinQuickSendButtonAbility.class, null);
        if (bulletinQuickSendButtonAbility != null) {
            bulletinQuickSendButtonAbility.Il1(new AwS588S0100000_9(this, 476));
        } else {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0OVt
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C620540OVo) obj).LLILZLL);
                }
            }, null, new AwS623S0100000_9(this, 185), 6);
        }
        TuxIconView tuxIconView2 = this.LLJJIJI;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS144S0100000_9(this, 42));
        }
    }
}
