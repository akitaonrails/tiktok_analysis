package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C019F;
import X.C01D1;
import X.C13LE;
import X.C1622206Wu;
import X.C1896007bi;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902730ZbD;
import X.C987103tV;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.chatnotice.viewmodel.MessageRequestPromptViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestFakeInlineMsgProtocol implements IMMessageListProtocol<C1896007bi> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final Fragment LL;
    public boolean LLILLJJLI = true;
    public final AssemVMLazy LLILLL;
    public final C898790ZNt LLILZ;
    public final Class<? extends PowerCell<C1896007bi>> LLILZIL;
    public final AwS558S0100000_14 LLILZLL;
    public final MessageListProtocolEnum LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestFakeInlineMsgProtocol.class, "messageRequestPromptViewModel", "getMessageRequestPromptViewModel()Lcom/ss/android/ugc/aweme/chatnotice/viewmodel/MessageRequestPromptViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C1896007bi> getPowerItemClazz() {
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
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C1896007bi> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C1896007bi>> getWithCell() {
        return this.LLILZIL;
    }

    public MessageRequestFakeInlineMsgProtocol(Fragment fragment) {
        AssemVMLazy assemVMLazy;
        char c;
        this.LL = fragment;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestPromptViewModel.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 528);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(138);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 529), aFwS248S0000000_14, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
            c = 0;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new AwS558S0100000_14(fragment, 530), aFwS248S0000000_14, null, null, null);
            c = 0;
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            c = 0;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 531), aFwS248S0000000_14, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILLL = assemVMLazy;
        int[] iArr = new int[1];
        iArr[c] = 1;
        this.LLILZ = new C898790ZNt(iArr, new AwS593S0100000_14(this, 57));
        this.LLILZIL = MessageRequestFakeInlineMsgCell.class;
        this.LLILZLL = new AwS558S0100000_14(this, 527);
        this.LLIZ = MessageListProtocolEnum.FAKE_MESSAGE_REQUEST_INLINE_MSG;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        return new C1896007bi(c869590Y9l.getConversationId(), this.LLILZLL);
    }
}
