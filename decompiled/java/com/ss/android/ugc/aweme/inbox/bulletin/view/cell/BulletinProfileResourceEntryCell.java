package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C01GW;
import X.C0OSB;
import X.C2211631BhB;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS113S0200000_9;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntry;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinProfileResourceEntryCell extends PowerCell<BulletinBizResourceEntry> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 758));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 757));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 759));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a7x;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS588S0100000_9(this, 195));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        BulletinBizResourceEntry bulletinBizResourceEntry = (BulletinBizResourceEntry) interfaceC1891350zJl;
        super.onBindItemView(bulletinBizResourceEntry);
        C0OSB.LJFF((TuxIconView) this.LLILLJJLI.getValue(), bulletinBizResourceEntry.getIconUrlModel(), null);
        ((TextView) this.LLILLL.getValue()).setText(bulletinBizResourceEntry.getName());
        C786410Ut5.I7(new ACListenerS113S0200000_9(bulletinBizResourceEntry, this, 0), this.itemView);
        View view = (View) this.LL.getValue();
        if (getBindingAdapterPosition() > 0) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }
}
