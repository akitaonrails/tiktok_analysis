package com.ss.android.ugc.aweme.notification.module.cell;

import X.C01GW;
import X.C0DTR;
import X.C1242300iQu;
import X.C1242410iR5;
import X.C1266090j3H;
import X.C13LE;
import X.C2217381BqS;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS122S0200000_19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderCell extends BaseChunkCell<C1242410iR5> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1266090j3H LLILZIL = new C1266090j3H(this, 1);
    public final C01GW LLILZLL = C0DTR.LIZJ(new AwS563S0100000_19(this, 1631));
    public final C01GW LLIZ = C0DTR.LIZJ(new AwS563S0100000_19(this, 1630));
    public final C01GW LLIZLLLIL = C0DTR.LIZJ(new AwS563S0100000_19(this, 1629));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HeaderCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/notification/module/NotificationChunk$CellControl;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ((C1242300iQu) this.LLILZIL.getValue(this, LLJ[0])).LL.LJJ().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(C1242410iR5 c1242410iR5) {
        super.onBindItemView(c1242410iR5);
        ((TextView) this.LLILZLL.getValue()).setText(c1242410iR5.LLILLJJLI);
        String str = c1242410iR5.LLILLL;
        if (str != null && str.length() != 0) {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLIZ.getValue(), 0);
            C786410Ut5.LLLLLLZZ((TuxIconView) this.LLIZLLLIL.getValue(), 0);
            ((TextView) this.LLIZ.getValue()).setText(c1242410iR5.LLILLL);
            C786410Ut5.I7(new ACListenerS122S0200000_19(this, c1242410iR5, 19), this.itemView);
            return;
        }
        C786410Ut5.LLLLZLL((TuxTextView) this.LLIZ.getValue(), 8);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLIZLLLIL.getValue(), 8);
        C786410Ut5.I7(null, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_o, viewGroup, false);
    }
}
