package com.ss.android.ugc.aweme.live.reminder;

import X.C003C;
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

/* JADX INFO: loaded from: classes3.dex */
public final class TurnOnGoLiveNotificationGuideCardProtocol implements IMMessageListProtocol<C003C> {
    public final C898790ZNt LL = new C898790ZNt(new int[]{4082});
    public final Class<? extends PowerCell<C003C>> LLILLJJLI = TurnOnGoLiveBannerGuideCardPowerCell.class;
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.CHATROOM_GUIDE_GO_LIVE_NOTIFICATION_BANNER_PROTOCOL;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C003C> getPowerItemClazz() {
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
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C003C> toMessageListProtocol() {
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
    public final Class<? extends PowerCell<C003C>> getWithCell() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        return new InterfaceC1891350zJl(c869590Y9l.getUuid()) { // from class: X.003C
            public final String LL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C003C) && Intrinsics.LJFF(this.LL, ((C003C) obj).LL);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return null;
            }

            public final int hashCode() {
                String str = this.LL;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TurnOnGoLiveBannerGuideCardCellData(messageUuid=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LL = str;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                if ((interfaceC1891350zJl instanceof C003C) && Intrinsics.LJFF(this.LL, ((C003C) interfaceC1891350zJl).LL)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                if ((interfaceC1891350zJl instanceof C003C) && Intrinsics.LJFF(this.LL, ((C003C) interfaceC1891350zJl).LL)) {
                    return true;
                }
                return false;
            }
        };
    }
}
