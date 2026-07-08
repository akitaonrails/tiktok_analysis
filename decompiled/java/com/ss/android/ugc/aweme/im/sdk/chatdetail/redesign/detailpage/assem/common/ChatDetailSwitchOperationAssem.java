package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common;

import X.C01GW;
import X.C127A;
import X.C127K;
import X.C1509305vX;
import X.C1767606w6;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C426750GoL;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1216650hlX;
import X.EnumC1695106kP;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.bot.BotDetailSwitchOperationAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ChatDetailSwitchOperationAssem extends UISlotAssem {
    public final C01GW LLJJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 574));
    public final C01GW LLJJIII = C1509305vX.LIZ(new AwS546S0100000_2(this, 575));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cnt;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numValueOf;
        Integer numValueOf2;
        super.onViewCreated(view);
        getContentView().setBackground(null);
        int i = 0;
        C426750GoL.LJIIIZ(getContentView(), 0, 0, 0, null, false, 24);
        BotDetailSwitchOperationAssem botDetailSwitchOperationAssem = (BotDetailSwitchOperationAssem) this;
        EnumC1695106kP enumC1695106kP = EnumC1695106kP.MUTE_NOTIFICATION;
        C127K c127k = (C127K) botDetailSwitchOperationAssem.LLJJI.getValue();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = enumC1695106kP.getIconRes();
        if (enumC1695106kP.getIconTintColor() != 0) {
            numValueOf = Integer.valueOf(enumC1695106kP.getIconTintColor());
        } else if (enumC1695106kP.getNegative()) {
            numValueOf = Integer.valueOf(R.attr.zs);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c127k.setIcon(c419910GdJ);
        c127k.setTitle(c127k.getContext().getString(enumC1695106kP.getTitle()));
        EnumC1216650hlX enumC1216650hlX = EnumC1216650hlX.PADDING_16;
        c127k.setInset(enumC1216650hlX);
        C127A c127a = new C127A(c127k.getContext());
        c127a.LJIILLIIL(new C1767606w6(botDetailSwitchOperationAssem, 6));
        c127k.setAccessory(c127a);
        C736680Sv4.LJIIIIZZ(botDetailSwitchOperationAssem, botDetailSwitchOperationAssem.hp(), new C2217381BqS() { // from class: X.06WC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1694606kK) obj).LL);
            }
        }, null, new AwS616S0100000_2(c127k, 162), 6);
        EnumC1695106kP enumC1695106kP2 = EnumC1695106kP.PIN_TO_TOP;
        C127K c127k2 = (C127K) botDetailSwitchOperationAssem.LLJJIII.getValue();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = enumC1695106kP2.getIconRes();
        if (enumC1695106kP2.getIconTintColor() != 0) {
            numValueOf2 = Integer.valueOf(enumC1695106kP2.getIconTintColor());
        } else if (enumC1695106kP2.getNegative()) {
            numValueOf2 = Integer.valueOf(R.attr.zs);
        } else {
            numValueOf2 = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ2.LJ = numValueOf2;
        c127k2.setIcon(c419910GdJ2);
        c127k2.setTitle(c127k2.getContext().getString(enumC1695106kP2.getTitle()));
        c127k2.setInset(enumC1216650hlX);
        C127A c127a2 = new C127A(c127k2.getContext());
        c127a2.LJIILL(new AwS403S0200000_2(botDetailSwitchOperationAssem, c127a2, 94));
        c127k2.setAccessory(c127a2);
        C736680Sv4.LJIIIIZZ(botDetailSwitchOperationAssem, botDetailSwitchOperationAssem.hp(), new C2217381BqS() { // from class: X.06WB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1694606kK) obj).LLILLJJLI);
            }
        }, null, new AwS616S0100000_2(c127k2, 163), 6);
        View contentView = getContentView();
        if (((View) this.LLJJI.getValue()).getVisibility() != 0 && ((View) this.LLJJIII.getValue()).getVisibility() != 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, contentView);
    }
}
