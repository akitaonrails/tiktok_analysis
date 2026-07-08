package com.ss.android.ugc.aweme.toplive.cell;

import X.AbstractC482420Ivw;
import X.C03H8;
import X.C197039127h;
import X.C481820Iuy;
import X.C482300Ivk;
import X.C482370Ivr;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS142S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS585S0100000_6;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: loaded from: classes8.dex */
public final class HangoutSectionMultiGuestButtonCell extends ToplivePagePowerCell<C482370Ivr> implements C03H8 {
    public C197039127h LLILLJJLI;

    public HangoutSectionMultiGuestButtonCell() {
        super(true);
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell
    public final void L5() {
        String str;
        String str2;
        ToplivePageItem toplivePageItem;
        C481820Iuy c481820Iuy = C481820Iuy.LIZ;
        C482300Ivk.LIZ.getClass();
        ToplivePageItem toplivePageItem2 = C482300Ivk.LIZJ;
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) getItem();
        ToplivePageItem toplivePageItem3 = abstractC482420Ivw != null ? abstractC482420Ivw.LL : null;
        AbstractC482420Ivw abstractC482420Ivw2 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw2 == null || (str = abstractC482420Ivw2.LLILLL) == null) {
            str = "";
        }
        AbstractC482420Ivw abstractC482420Ivw3 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw3 == null || (str2 = abstractC482420Ivw3.LLILLJJLI) == null) {
            str2 = "hangout";
        }
        c481820Iuy.getClass();
        C481820Iuy.LIZLLL(toplivePageItem2, toplivePageItem3, str, str2);
        AbstractC482420Ivw abstractC482420Ivw4 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw4 == null || (toplivePageItem = abstractC482420Ivw4.LL) == null) {
            return;
        }
        Room room = toplivePageItem.room;
        String str3 = toplivePageItem.enterMethod;
        AbstractC482420Ivw abstractC482420Ivw5 = (AbstractC482420Ivw) getItem();
        C481820Iuy.LJ(room, str3, abstractC482420Ivw5 != null ? abstractC482420Ivw5.LLILLL : null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.watch_multiguest_live);
        this.LLILLJJLI = c197039127h;
        if (c197039127h != null) {
            c197039127h.LJJJJL(new AwS585S0100000_6(c197039127h, 203));
        }
    }

    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell
    /* JADX INFO: renamed from: I5 */
    public final void onBindItemView(AbstractC482420Ivw abstractC482420Ivw) {
        super.onBindItemView(abstractC482420Ivw);
        C197039127h c197039127h = this.LLILLJJLI;
        if (c197039127h != null) {
            c197039127h.setText(abstractC482420Ivw.LL.cardTitle);
        }
        C197039127h c197039127h2 = this.LLILLJJLI;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS142S0100000_7(this, 296));
        }
    }

    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) interfaceC1891350zJl;
        super.onBindItemView(abstractC482420Ivw);
        C197039127h c197039127h = this.LLILLJJLI;
        if (c197039127h != null) {
            c197039127h.setText(abstractC482420Ivw.LL.cardTitle);
        }
        C197039127h c197039127h2 = this.LLILLJJLI;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS142S0100000_7(this, 296));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.die, viewGroup, false);
    }
}
