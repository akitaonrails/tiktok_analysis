package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0I4X;
import X.C0IB0;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C461410I7n;
import X.C461440I7q;
import X.C687700QyG;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902710ZbB;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import Y.AObjectS59S0000000_6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IStoryV2AnimViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryReactionProtocol extends AbstractC738140SxQ implements SkeletonMessageListProtocol<C461440I7q, C461410I7n>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LL;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461440I7q>> LLILLJJLI;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461410I7n>> LLILLL;
    public final C898790ZNt LLILZ;
    public final MessageListProtocolEnum LLILZIL;
    public volatile C0I4X LLILZLL;
    public C127G LLIZ;
    public InterfaceC665370Q7z LLIZLLLIL;
    public C0QSJ LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryReactionProtocol.class, "quotedAreaAbility", "getQuotedAreaAbility()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quoted/factory/IQuotedItemUIStateFactory;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(StoryReactionProtocol.class, "storyV2AnimViewModel", "getStoryV2AnimViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IStoryV2AnimViewModel;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public StoryReactionProtocol() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IStoryV2AnimViewModel.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 152), AFwS236S0000000_6.get$arr$(93), null, true);
        this.LLILLJJLI = StoryReactionSendPowerCell.class;
        this.LLILLL = StoryReactionReceivePowerCell.class;
        this.LLILZ = new C898790ZNt(new int[]{7, 1805}, new AwS585S0100000_6(this, 78));
        this.LLILZIL = MessageListProtocolEnum.STORY_2_0_REACTION;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C461410I7n> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C461440I7q> Wh() {
        return null;
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

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLIZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLIZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IStoryV2AnimViewModel.class, new AObjectS59S0000000_6(this, 6)}, defaultViewModelProviderFactory);
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
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, SkeletonMessageListProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.messagelist.protocols.StoryReactionProtocol$onCreate$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, SkeletonMessageListProtocol.class, this);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461440I7q>> da() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C461410I7n>> gr() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        ((IStoryV2AnimViewModel) assemVMLazy.getValue()).wQ2(list);
        return list;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C461440I7q(c0ib0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C461410I7n(c0ib0);
    }
}
