package com.bytedance.android.livesdk.commonactionpanel;

import X.AbstractC752950TgD;
import X.C19322110iZ;
import X.C750530TcJ;
import X.C750580TcO;
import X.C750600TcQ;
import X.C750620TcS;
import X.C750960Td0;
import X.C750970Td1;
import X.C752340TfE;
import X.C752350TfF;
import X.C752910Tg9;
import X.C753050TgN;
import X.C755120Tji;
import X.C755130Tjj;
import X.C755140Tjk;
import X.EnumC755280Tjy;
import X.InterfaceC1090170eTX;
import X.InterfaceC752920TgA;
import Y.AObjectS288S0200000_12;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.commonactionpanel.ISheetPanelService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public class SheetPanelService implements ISheetPanelService {
    @Override // com.bytedance.android.live.commonactionpanel.ISheetPanelService
    public final C750530TcJ qw2(C750620TcS c750620TcS) {
        return new C750530TcJ(c750620TcS);
    }

    @Override // com.bytedance.android.live.commonactionpanel.ISheetPanelService
    public final C752340TfE uG2(C752350TfF c752350TfF) {
        return new C752340TfE(c752350TfF);
    }

    @Override // com.bytedance.android.live.commonactionpanel.ISheetPanelService
    public final C750580TcO uq0(C750600TcQ c750600TcQ) {
        return new C750580TcO(c750600TcQ);
    }

    @Override // com.bytedance.android.live.commonactionpanel.ISheetPanelService
    public final C750960Td0 wI2(C750970Td1 c750970Td1) {
        return new C750960Td0(c750970Td1);
    }

    @Override // com.bytedance.android.live.commonactionpanel.ISheetPanelService
    public final void tX(FragmentManager fragmentManager, List list) {
        LiveCommentSheetPanel liveCommentSheetPanel = new LiveCommentSheetPanel();
        liveCommentSheetPanel.LLJZ = list;
        C19322110iZ.LJFF(fragmentManager, liveCommentSheetPanel, "live_hot_comment_click", new InterfaceC1090170eTX() { // from class: X.0Tjn
            @Override // X.InterfaceC1090170eTX
            public final void LIZ(long j) {
            }
        }, 0);
    }

    @Override // com.bytedance.android.live.commonactionpanel.ISheetPanelService
    public final C752910Tg9 as2(Room room, User user, DataChannel dataChannel) {
        return new C752910Tg9(room, user, dataChannel);
    }

    @Override // com.bytedance.android.live.commonactionpanel.ISheetPanelService
    public final C755140Tjk fd0(List list, InterfaceC752920TgA interfaceC752920TgA, EnumC755280Tjy enumC755280Tjy) {
        C755140Tjk c755140Tjk = new C755140Tjk(enumC755280Tjy, interfaceC752920TgA);
        c755140Tjk.LIZ(list);
        return c755140Tjk;
    }

    @Override // com.bytedance.android.live.commonactionpanel.ISheetPanelService
    public final void vB2(FragmentManager fragmentManager, List list, C753050TgN c753050TgN, User user, Room room, AObjectS288S0200000_12 aObjectS288S0200000_12) {
        C755120Tji c755120Tji = new C755120Tji(aObjectS288S0200000_12);
        c755120Tji.LLILLL = "live_public_screen_long_press";
        c755120Tji.LLILZ = fragmentManager;
        c755120Tji.LLILZIL = c753050TgN;
        c755120Tji.LLILZLL = list;
        if (!((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((AbstractC752950TgD) ((Pair) it2.next()).getSecond()).LJI(c755120Tji.LLILLJJLI)) {
                    if (room != null) {
                        if (c755120Tji.LLIZ == null) {
                            LiveLoadActionPanel liveLoadActionPanel = new LiveLoadActionPanel();
                            c755120Tji.LLIZ = liveLoadActionPanel;
                            liveLoadActionPanel.LLJZIJLIL = new C755130Tjj(user, room);
                            liveLoadActionPanel.LLL.attachView(c755120Tji);
                        }
                        C19322110iZ.LJFF(fragmentManager, c755120Tji.LLIZ, "live_public_screen_long_press", c753050TgN, 0);
                        return;
                    }
                }
            }
        }
        c755120Tji.LIZ(fragmentManager, c753050TgN, "live_public_screen_long_press", list);
    }
}
