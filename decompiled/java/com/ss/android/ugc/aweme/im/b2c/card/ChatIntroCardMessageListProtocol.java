package com.ss.android.ugc.aweme.im.b2c.card;

import X.C1763406vQ;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.content.ChatIntroCardMsgContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatIntroCardMessageListProtocol implements IMMessageListProtocol<C1763406vQ> {
    public final C898790ZNt LL = new C898790ZNt(new int[]{4074});
    public final MessageListProtocolEnum LLILLJJLI = MessageListProtocolEnum.CHAT_INTRO_CARD;
    public final Class<ChatIntroCardPowCell> LLILLL = ChatIntroCardPowCell.class;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C1763406vQ> getPowerItemClazz() {
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
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C1763406vQ> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LL;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<ChatIntroCardPowCell> getWithCell() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        UrlModel image;
        String introContent;
        ChatIntroCardMsgContent chatIntroCardMsgContent = (ChatIntroCardMsgContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ChatIntroCardMsgContent.class);
        if (chatIntroCardMsgContent != null) {
            image = chatIntroCardMsgContent.getImage();
            introContent = chatIntroCardMsgContent.getIntroContent();
            if (introContent == null) {
            }
            return new C1763406vQ(image, introContent);
        }
        image = null;
        introContent = "";
        return new C1763406vQ(image, introContent);
    }
}
