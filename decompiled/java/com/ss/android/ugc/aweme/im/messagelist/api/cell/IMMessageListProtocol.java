package com.ss.android.ugc.aweme.im.messagelist.api.cell;

import X.C06KX;
import X.C869590Y9l;
import X.InterfaceC1891350zJl;
import X.InterfaceC902770ZbH;
import X.InterfaceC902790ZbJ;
import X.InterfaceC904590ZeD;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface IMMessageListProtocol<T extends InterfaceC1891350zJl> extends InterfaceC902770ZbH, InterfaceC902790ZbJ<T>, C06KX {
    T mapToPowerItem(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i);

    InterfaceC904590ZeD<MessageListProtocolEnum, T> toMessageListProtocol();
}
