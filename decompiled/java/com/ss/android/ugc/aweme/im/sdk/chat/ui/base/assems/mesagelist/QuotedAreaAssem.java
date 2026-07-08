package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C06Z6;
import X.C09R3;
import X.C0I4X;
import X.C0I82;
import X.C0PEM;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C460880I5m;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C869590Y9l;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.InterfaceC904740ZeS;
import Y.AObjectS59S0000000_6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.dto.QuotedMessageInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.IQuotedMessageCacheAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class QuotedAreaAssem extends AbstractC738140SxQ implements IMessageEventProtocol, IQuotedMessageCacheAbility, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LL;
    public final C1559260qg8 LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final C06Z6 LLILZ;
    public final C01GW LLILZIL;
    public volatile MessagePowerListAbility LLILZLL;
    public C127G LLIZ;
    public InterfaceC665370Q7z LLIZLLLIL;
    public C0QSJ LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuotedAreaAssem.class, "quotedMessageViewModel", "getQuotedMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/QuotedMessageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(QuotedAreaAssem.class, "messageListViewModel", "getMessageListViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(QuotedAreaAssem.class, "messagePowerListAbility", "getMessagePowerListAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessagePowerListAbility;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public QuotedAreaAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedMessageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 293), AFwS236S0000000_6.get$arr$(165), null, true);
        this.LLILLJJLI = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        AFwS192S0000000_6 aFwS192S0000000_6 = AFwS192S0000000_6.get$arr$(88);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IAwemeStatusViewModel.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 294), AFwS236S0000000_6.get$arr$(166), aFwS192S0000000_6, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(IIMessageListViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ3, 295), AFwS236S0000000_6.get$arr$(167), null, true);
        this.LLILZ = C06Z6.WORKER;
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 292));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -845297968) {
            return null;
        }
        return this;
    }

    public final MessagePowerListAbility bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLIZLLLIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLIZLLLIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLJ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) c0qsjLIZLLL.getAbility(MessagePowerListAbility.class);
        C687700QyG.LJ(messagePowerListAbility, MessagePowerListAbility.class);
        return messagePowerListAbility;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLIZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLIZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IIMessageListViewModel.class, new AObjectS59S0000000_6(this, 0)}, defaultViewModelProviderFactory);
                    this.LLIZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, IMessageEventProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.QuotedAreaAssem$onCreate$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, IMessageEventProtocol.class, this);
                    }
                }
            });
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.IQuotedMessageCacheAbility
    public final void D81(C869590Y9l c869590Y9l) {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        QuotedMessageViewModel quotedMessageViewModel = (QuotedMessageViewModel) assemVMLazy.getValue();
        long msgId = c869590Y9l.getMsgId();
        QuotedMessageInfo.Companion.getClass();
        QuotedMessageInfo quotedMessageInfoLIZ = C0I82.LIZ(c869590Y9l);
        if (quotedMessageInfoLIZ != null) {
            quotedMessageViewModel.LLILLJJLI.put(Long.valueOf(msgId), quotedMessageInfoLIZ);
            quotedMessageViewModel.LL.put(Long.valueOf(msgId), c869590Y9l);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class}).unbindAbility(this.LLILZIL.getValue(), C0I4X.class);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        QuotedMessageViewModel quotedMessageViewModel = (QuotedMessageViewModel) assemVMLazy.getValue();
        MessagePowerListAbility messagePowerListAbilityBo = this.LLILZLL;
        if (messagePowerListAbilityBo == null) {
            synchronized (this) {
                messagePowerListAbilityBo = this.LLILZLL;
                if (messagePowerListAbilityBo == null) {
                    messagePowerListAbilityBo = bo();
                    this.LLILZLL = messagePowerListAbilityBo;
                }
            }
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(quotedMessageViewModel), C0PEM.LIZ, null, new C460880I5m(interfaceC904740ZeS, quotedMessageViewModel, messagePowerListAbilityBo.vi2(), null), 2);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class}).bindAbility(this.LLILZIL.getValue(), C0I4X.class);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }
}
