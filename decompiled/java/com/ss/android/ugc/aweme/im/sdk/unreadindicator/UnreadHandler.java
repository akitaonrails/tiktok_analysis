package com.ss.android.ugc.aweme.im.sdk.unreadindicator;

import X.C06KX;
import X.C910580Zns;
import X.C910680Zo2;
import X.C910740Zo8;
import X.EnumC910600Znu;
import X.InterfaceC1364105Vn;
import X.InterfaceC910720Zo6;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;

/* JADX INFO: loaded from: classes15.dex */
public interface UnreadHandler extends C06KX {
    public static final C910580Zns LJJIIJZLJL = C910580Zns.LIZ;

    boolean HZ0(long j, long j2);

    Object kQ1(InterfaceC910720Zo6 interfaceC910720Zo6, InterfaceC1364105Vn<? super C910740Zo8> interfaceC1364105Vn);

    Object mN1(long j, InterfaceC910720Zo6 interfaceC910720Zo6, MessageListScrollAbility messageListScrollAbility, InterfaceC1364105Vn<? super C910680Zo2> interfaceC1364105Vn);

    C910680Zo2 nz1(MessageListScrollAbility messageListScrollAbility, C910740Zo8 c910740Zo8);

    int tJ();

    EnumC910600Znu tP2();
}
