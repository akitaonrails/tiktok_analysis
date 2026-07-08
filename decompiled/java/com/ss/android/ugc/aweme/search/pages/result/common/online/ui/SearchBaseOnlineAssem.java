package com.ss.android.ugc.aweme.search.pages.result.common.online.ui;

import X.C01GW;
import X.C03H5;
import X.C452501pT;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC488230JCr;
import X.InterfaceC2217241BqE;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import df3.o;
import java.util.Set;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS649S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public abstract class SearchBaseOnlineAssem<ONLINE_REQUEST_STATE extends o, RECEIVER extends C03H5> extends ReusedUISlotAssem<RECEIVER> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS579S0100000_35((SearchBaseOnlineAssem) this, 149));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS579S0100000_35((SearchBaseOnlineAssem) this, 148));

    public abstract Set<EnumC488230JCr> op();

    public abstract AssemViewModel<ONLINE_REQUEST_STATE> sp();

    public abstract InterfaceC2217241BqE<ONLINE_REQUEST_STATE, EnumC488230JCr> tp();

    public abstract AssemViewModel<ONLINE_REQUEST_STATE> up();

    public abstract boolean zp();

    public final InterfaceC665370Q7z LLIIJLIL() {
        return (InterfaceC665370Q7z) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public void Ap() {
        C786410Ut5.LJLLLLLL(0, getContentView());
    }

    public void yp() {
        C786410Ut5.LJLLLLLL(8, getContentView());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        if (zp()) {
            C736680Sv4.LJIIIIZZ(this, up(), tp(), null, new AwS649S0100000_35(this, 15), 6);
        } else {
            C736680Sv4.LJIIIIZZ(this, sp(), tp(), null, new AwS649S0100000_35(this, 16), 6);
        }
    }
}
