package com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol;

import X.C01GW;
import X.C06KX;
import X.C0IB0;
import X.C869590Y9l;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC902770ZbH;
import X.InterfaceC902780ZbI;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;

/* JADX INFO: loaded from: classes15.dex */
public interface SkeletonMessageListProtocol<SEND extends InterfaceC461380I7k, RECEIVE extends InterfaceC461380I7k> extends InterfaceC902770ZbH, InterfaceC902780ZbI<SEND, RECEIVE>, C06KX {
    C902710ZbB Vx2(C01GW c01gw);

    Class<? extends IMSkeletonLayoutPowerCell<?, SEND>> da();

    Class<? extends IMSkeletonLayoutPowerCell<?, RECEIVE>> gr();

    InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0);

    InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0);
}
