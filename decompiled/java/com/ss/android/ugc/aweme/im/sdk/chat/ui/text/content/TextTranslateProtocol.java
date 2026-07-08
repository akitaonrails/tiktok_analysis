package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content;

import X.C01GW;
import X.C0IB0;
import X.C0ZS1;
import X.C0ZS2;
import X.C0ZS3;
import X.C0ZS4;
import X.C0ZXS;
import X.C0ZYF;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C901130ZWt;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.IMTranslationData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import com.ss.android.ugc.aweme.utils.IChatCustomizeResourceHelper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TextTranslateProtocol implements SkeletonMessageListProtocol<C0ZS4, C0ZS3> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZS4>> LL = TextTranslateSendCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZS3>> LLILLJJLI = TextTranslateReceiveCell.class;
    public final C0ZS2 LLILLL = new InterfaceC902790ZbJ<C0ZS4>(this) { // from class: X.0ZS2
        public final Class<C0ZS4> LL = C0ZS4.class;

        @Override // X.InterfaceC902790ZbJ
        public final Integer getCustomViewPoolSize() {
            return 15;
        }

        @Override // X.InterfaceC902790ZbJ
        public final Class<C0ZS4> getPowerItemClazz() {
            return this.LL;
        }

        {
            this.getClass();
        }
    };
    public final C0ZS1 LLILZ = new InterfaceC902790ZbJ<C0ZS3>(this) { // from class: X.0ZS1
        public final Class<C0ZS3> LL = C0ZS3.class;

        @Override // X.InterfaceC902790ZbJ
        public final Integer getCustomViewPoolSize() {
            return 15;
        }

        @Override // X.InterfaceC902790ZbJ
        public final Class<C0ZS3> getPowerItemClazz() {
            return this.LL;
        }

        {
            this.getClass();
        }
    };
    public final C898790ZNt LLILZIL = new C898790ZNt(new int[]{7});
    public final MessageListProtocolEnum LLILZLL = MessageListProtocolEnum.TRANSLATE_TEXT;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ZS3> An() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ZS4> Wh() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZS4>> da() {
        return this.LL;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZS3>> gr() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        MessageBubbleStyle bubbleStyleForMessage;
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (objPluggableSpiForReal != null) {
            IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) objPluggableSpiForReal;
            IChatCustomizeResourceHelper.LIZ.getClass();
            IChatCustomizeResourceHelper iChatCustomizeResourceHelperLIZ = C0ZYF.LIZ();
            String str = null;
            if (iChatCustomizeResourceHelperLIZ != null) {
                bubbleStyleForMessage = iChatCustomizeResourceHelperLIZ.getBubbleStyleForMessage(c869590Y9l);
            } else {
                bubbleStyleForMessage = null;
            }
            C0ZXS c0zxsLJI = iIMMessageBubbleService.LJI(bubbleStyleForMessage);
            IMTranslationData iMTranslationDataLJIIIIZZ = C901130ZWt.LIZIZ.LJIIIIZZ(c869590Y9l);
            if (iMTranslationDataLJIIIIZZ != null) {
                str = iMTranslationDataLJIIIIZZ.sourceLanguage;
            }
            return new C0ZS4(c0ib0, c0zxsLJI, str, Intrinsics.LJFF(c869590Y9l.getLocalExt().get("is_mock"), "1"));
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        MessageBubbleStyle bubbleStyleForMessage;
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (objPluggableSpiForReal != null) {
            IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) objPluggableSpiForReal;
            IChatCustomizeResourceHelper.LIZ.getClass();
            IChatCustomizeResourceHelper iChatCustomizeResourceHelperLIZ = C0ZYF.LIZ();
            String str = null;
            if (iChatCustomizeResourceHelperLIZ != null) {
                bubbleStyleForMessage = iChatCustomizeResourceHelperLIZ.getBubbleStyleForMessage(c869590Y9l);
            } else {
                bubbleStyleForMessage = null;
            }
            C0ZXS c0zxsLIZLLL = iIMMessageBubbleService.LIZLLL(bubbleStyleForMessage);
            IMTranslationData iMTranslationDataLJIIIIZZ = C901130ZWt.LIZIZ.LJIIIIZZ(c869590Y9l);
            if (iMTranslationDataLJIIIIZZ != null) {
                str = iMTranslationDataLJIIIIZZ.sourceLanguage;
            }
            return new C0ZS3(c0ib0, c0zxsLIZLLL, str, Intrinsics.LJFF(c869590Y9l.getLocalExt().get("is_mock"), "1"));
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
