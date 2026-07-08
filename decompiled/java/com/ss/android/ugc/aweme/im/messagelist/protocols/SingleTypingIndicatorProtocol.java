package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AnonymousClass0629;
import X.C0YM0;
import X.C0YVH;
import X.C0ZQ1;
import X.C13LP;
import X.C460220I2y;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class SingleTypingIndicatorProtocol implements IMMessageListProtocol<C460220I2y> {
    public final C898790ZNt LL = new C898790ZNt(new int[]{4046});
    public final Class<? extends PowerCell<C460220I2y>> LLILLJJLI = SingleTypingIndicatorAssemContainer.class;
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.TYPING_INDICATOR_PROTOCOL;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C460220I2y> getPowerItemClazz() {
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
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C460220I2y> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LL;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C460220I2y>> getWithCell() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        C0YM0 typingIndicatorScene;
        Drawable drawable;
        C0YVH c0yvh;
        String str = (String) C13LP.LJJJLZIJ(1, a0.LJJLIIIJ(c869590Y9l.getUuid(), new char[]{','}, false, 0, 6));
        if (str == null) {
            str = "";
        }
        Long lValueOf = null;
        if ((c869590Y9l instanceof C0YVH) && (c0yvh = (C0YVH) c869590Y9l) != null) {
            typingIndicatorScene = c0yvh.getTypingIndicatorScene();
        } else {
            typingIndicatorScene = null;
        }
        IMAIServiceAPI.LIZ.getClass();
        boolean z = !AnonymousClass0629.LIZ().LIZ().LJIL(c869590Y9l.getConversationId());
        if (typingIndicatorScene == C0YM0.SMART_REPLY_USER) {
            drawable = AnonymousClass0629.LIZ().LIZ().LJII(C0ZQ1.TYPING_INDICATOR_AVATAR_LABEL, null).LIZIZ;
        } else {
            drawable = null;
        }
        C869590Y9l c869590Y9l2 = (C869590Y9l) C13LP.LJJJLZIJ(i + 1, list);
        if (c869590Y9l2 != null) {
            lValueOf = Long.valueOf(c869590Y9l2.getSender());
        }
        return new C460220I2y(z, str, !Intrinsics.LJFF(String.valueOf(lValueOf), str), c869590Y9l.getConversationId(), drawable);
    }
}
