package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem;

import X.C003A;
import X.C01GW;
import X.C1509305vX;
import X.C457780HxI;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ProfileProtocol implements IMMessageListProtocol<C003A> {
    public final C898790ZNt LL = new C898790ZNt(new int[]{4001});
    public final Class<? extends PowerCell<C003A>> LLILLJJLI = ProfilePowerCell.class;
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.PROFILE_MESSAGE;
    public final C01GW LLILZ;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C003A> getPowerItemClazz() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C003A> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LL;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C003A>> getWithCell() {
        return this.LLILLJJLI;
    }

    public ProfileProtocol(C457780HxI c457780HxI) {
        this.LLILZ = C1509305vX.LIZ(new AwS558S0100000_14(c457780HxI, 1005));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        int chatType;
        SessionInfo sessionInfo = (SessionInfo) this.LLILZ.getValue();
        if (sessionInfo != null) {
            chatType = sessionInfo.getChatType();
        } else {
            chatType = -1;
        }
        return new C003A(chatType);
    }
}
