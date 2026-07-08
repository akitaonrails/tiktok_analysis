package com.ss.android.ugc.aweme.im.ai.impl.smartreply.entrance.protocol;

import X.C002M;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SmartReplyIntroBannerProtocol implements IMMessageListProtocol<C002M> {
    public final C898790ZNt LL = new C898790ZNt(new int[]{4076});
    public final Class<? extends PowerCell<C002M>> LLILLJJLI = SmartReplyEntrancePowerCell.class;
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.SMART_REPLY_ENTRANCE_CARD;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C002M> getPowerItemClazz() {
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
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C002M> toMessageListProtocol() {
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
    public final Class<? extends PowerCell<C002M>> getWithCell() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        String content = c869590Y9l.getContent();
        if (content == null) {
            content = "";
        }
        return new InterfaceC1891350zJl(content) { // from class: X.002M
            public final String LL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C002M) && Intrinsics.LJFF(this.LL, ((C002M) obj).LL);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return null;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SmartReplyEntranceCellData(text=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return this.LL.hashCode();
            }

            {
                this.LL = content;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                Object obj;
                C002M c002m;
                String str = this.LL;
                if (!(interfaceC1891350zJl instanceof C002M) || (c002m = (C002M) interfaceC1891350zJl) == null || (obj = c002m.LL) == null) {
                    obj = Boolean.FALSE;
                }
                return Intrinsics.LJFF(str, obj);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return interfaceC1891350zJl instanceof C002M;
            }
        };
    }
}
