package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C06SA;
import X.C06Z6;
import X.C09R3;
import X.C0I3V;
import X.C0IB0;
import X.C0ICS;
import X.C0QSJ;
import X.C0ZZ0;
import X.C0ZZ1;
import X.C0ZZ2;
import X.C0ZZ3;
import X.C0ZZ4;
import X.C0ZZ6;
import X.C0ZZ7;
import X.C0ZZ9;
import X.C0ZZB;
import X.C0ZZV;
import X.C0ZZW;
import X.C1233604sA;
import X.C1233704sB;
import X.C13LE;
import X.C1509305vX;
import X.C1509705vb;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1622006Ws;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1746006sc;
import X.C1758306ub;
import X.C1761906vB;
import X.C1762006vC;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C460290I3f;
import X.C460510I4b;
import X.C462620ICe;
import X.C687700QyG;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C895820ZCi;
import X.C898790ZNt;
import X.C901700ZYy;
import X.C901710ZYz;
import X.C902710ZbB;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import X.InterfaceC904740ZeS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS130S1200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareLiveMessageProtocol extends AbstractC738140SxQ implements SkeletonMessageListProtocol<C0ZZ7, C0ZZ6>, C0ZZ4, IMessageEventProtocol, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final ShareLiveMessageProtocol LL = this;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZZ7>> LLILLJJLI = ShareLiveCardSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZZ6>> LLILLL = ShareLiveCardReceivePowerCell.class;
    public final C898790ZNt LLILZ = new C898790ZNt(new int[]{21, 1021});
    public final MessageListProtocolEnum LLILZIL = MessageListProtocolEnum.LIVE_CARD;
    public final AssemVMLazy LLILZLL;
    public final C01GW LLIZ;
    public volatile ChatroomEventAbility LLIZLLLIL;
    public InterfaceC665370Q7z LLJ;
    public C0QSJ LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShareLiveMessageProtocol.class, "chatroomEventAbility", "getChatroomEventAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/ChatroomEventAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ShareLiveMessageProtocol.class, "liveCardViewModel", "getLiveCardViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/protocols/LiveCardViewModel;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ShareLiveMessageProtocol() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveCardViewModel.class);
        this.LLILZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 548), AFwS248S0000000_14.get$arr$(140), null, true);
        this.LLIZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 547));
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ZZ6> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ZZ7> Wh() {
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
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

    public final ChatroomEventAbility bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJI;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLJI = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        ChatroomEventAbility chatroomEventAbility = (ChatroomEventAbility) c0qsjLIZLLL.getAbility(ChatroomEventAbility.class);
        C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
        return chatroomEventAbility;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, SkeletonMessageListProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveMessageProtocol$onParentSet$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, SkeletonMessageListProtocol.class, this);
                    }
                }
            });
        }
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL2, IMessageEventProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle2 = getLifecycle();
        if (lifecycle2 != null) {
            lifecycle2.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveMessageProtocol$onParentSet$$inlined$registerProtocol$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL2, IMessageEventProtocol.class, this);
                    }
                }
            });
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C901700ZYy(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZZ7>> da() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZZ6>> gr() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return C06Z6.WORKER;
    }

    public static C0ZZ1 fo(C869590Y9l c869590Y9l) {
        ShareLiveContent shareLiveContent;
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareLiveContent.class);
        if (!(orParseJsonContent instanceof ShareLiveContent) || (shareLiveContent = (ShareLiveContent) orParseJsonContent) == null) {
            return null;
        }
        return new C0ZZ1(shareLiveContent.getRoomId(), shareLiveContent.getRoomOwnerId(), shareLiveContent.getRoomSecOwnerId(), shareLiveContent.getRoomOwnerName(), shareLiveContent.getRoomOwnerAvatar(), shareLiveContent.getRoomCover());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class}).unbindAbility(this.LL, C0ZZ4.class);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        Pair pairEQ2;
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        LiveCardViewModel liveCardViewModel = (LiveCardViewModel) assemVMLazy.getValue();
        if (!((Boolean) liveCardViewModel.LLJILJILJ.getValue()).booleanValue()) {
            if (interfaceC904740ZeS instanceof C1758306ub) {
                Iterator<C869590Y9l> it2 = ((C1758306ub) interfaceC904740ZeS).LIZ.iterator();
                while (it2.hasNext()) {
                    Pair pairEQ22 = LiveCardViewModel.EQ2(it2.next());
                    if (pairEQ22 != null) {
                        liveCardViewModel.xQ2((String) pairEQ22.getFirst(), (String) pairEQ22.getSecond());
                    }
                }
                return;
            }
            if (interfaceC904740ZeS instanceof C1509705vb) {
                Iterator<C869590Y9l> it3 = ((C1509705vb) interfaceC904740ZeS).LIZ.iterator();
                while (it3.hasNext()) {
                    Pair pairEQ23 = LiveCardViewModel.EQ2(it3.next());
                    if (pairEQ23 != null) {
                        liveCardViewModel.xQ2((String) pairEQ23.getFirst(), (String) pairEQ23.getSecond());
                    }
                }
                return;
            }
            if (interfaceC904740ZeS instanceof C1761906vB) {
                Iterator<C869590Y9l> it4 = ((C1761906vB) interfaceC904740ZeS).LIZ.iterator();
                while (it4.hasNext()) {
                    Pair pairEQ24 = LiveCardViewModel.EQ2(it4.next());
                    if (pairEQ24 != null) {
                        liveCardViewModel.xQ2((String) pairEQ24.getFirst(), (String) pairEQ24.getSecond());
                    }
                }
                return;
            }
            if (interfaceC904740ZeS instanceof C1762006vC) {
                Iterator<C869590Y9l> it5 = ((C1762006vC) interfaceC904740ZeS).LIZ.iterator();
                while (it5.hasNext()) {
                    Pair pairEQ25 = LiveCardViewModel.EQ2(it5.next());
                    if (pairEQ25 != null) {
                        liveCardViewModel.xQ2((String) pairEQ25.getFirst(), (String) pairEQ25.getSecond());
                    }
                }
                return;
            }
            if (interfaceC904740ZeS instanceof C1746006sc) {
                Iterator<C869590Y9l> it6 = ((C1746006sc) interfaceC904740ZeS).LIZ.iterator();
                while (it6.hasNext()) {
                    Pair pairEQ26 = LiveCardViewModel.EQ2(it6.next());
                    if (pairEQ26 != null) {
                        liveCardViewModel.xQ2((String) pairEQ26.getFirst(), (String) pairEQ26.getSecond());
                    }
                }
                return;
            }
            if ((interfaceC904740ZeS instanceof C06SA) && (pairEQ2 = LiveCardViewModel.EQ2(((C06SA) interfaceC904740ZeS).LIZJ)) != null) {
                liveCardViewModel.xQ2((String) pairEQ2.getFirst(), (String) pairEQ2.getSecond());
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class}).bindAbility(this.LL, C0ZZ4.class);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final C0ZZ3 m234do(C869590Y9l c869590Y9l, C0ZZ1 c0zz1) {
        ShareLiveContent shareLiveContent;
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareLiveContent.class);
        if ((orParseJsonContent instanceof ShareLiveContent) && (shareLiveContent = (ShareLiveContent) orParseJsonContent) != null && c0zz1 != null && c0zz1.LIZ != null) {
            AssemVMLazy assemVMLazy = this.LLILZLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            LiveCardViewModel liveCardViewModel = (LiveCardViewModel) assemVMLazy.getValue();
            String str = c0zz1.LIZIZ;
            if (str == null) {
                str = "";
            }
            if (((Boolean) liveCardViewModel.LLJILJILJ.getValue()).booleanValue()) {
                return new C901710ZYz(new C1233704sB(2131831116, (List<String>) null), null, liveCardViewModel.yQ2(str, shareLiveContent.getRoomSecOwnerId()));
            }
            if (!Intrinsics.LJFF(liveCardViewModel.zQ2().get(str), Boolean.FALSE)) {
                return C0ZZ2.LIZ;
            }
            C0ZZV c0zzv = liveCardViewModel.BQ2().get(str);
            if (c0zzv != null) {
                switch (C0ZZW.LIZ[c0zzv.ordinal()]) {
                    case -1:
                        break;
                    case 0:
                    default:
                        throw new C1954807lC();
                    case 1:
                        return new C0ZZ0(new C1233704sB(2131842395, (List<String>) null));
                    case 2:
                        return new C0ZZ0(new C1233704sB(2131851047, (List<String>) null));
                    case 3:
                        return new C0ZZ0(new C1233704sB(2131840715, (List<String>) null));
                    case 4:
                    case 5:
                        return new C0ZZ0(new C1233704sB(2131846521, (List<String>) null));
                    case 6:
                        return new C0ZZ0(new C1233704sB(2131832518, (List<String>) null));
                    case 7:
                    case 8:
                        return new C0ZZ0(new C1233704sB(2131832516, (List<String>) null));
                }
            }
            NewLiveRoomStruct newLiveRoomStruct = liveCardViewModel.AQ2().get(str);
            if (newLiveRoomStruct == null) {
                return new C901710ZYz(new C1233704sB(2131847878, (List<String>) null), shareLiveContent.getShareLiveIntent(), liveCardViewModel.yQ2(str, shareLiveContent.getRoomSecOwnerId()));
            }
            if (C895820ZCi.LIZIZ(shareLiveContent)) {
                return new C0ZZB(new C1233604sA("pm_mt_multi_invite_badge", AFwS248S0000000_14.get$arr$(375)), new C0I3V(new C1233604sA("pm_mt_multi_invite_joinfriendasguest", AFwS248S0000000_14.get$arr$(376))), new C1622006Ws(newLiveRoomStruct.roomStructConstructor()), shareLiveContent.getShareLiveIntent(), null, 16);
            }
            if (newLiveRoomStruct.getLiveSubOnlyEnable()) {
                return new C0ZZB(new C1233704sB(2131856628, (List<String>) null), C460510I4b.LIZ, new C1622006Ws(newLiveRoomStruct.roomStructConstructor()), null, new C1622006Ws(new AwS130S1200000_14(liveCardViewModel, str, shareLiveContent, 2)), 8);
            }
            if (Intrinsics.LJFF(shareLiveContent.getShareLiveIntent(), "play_together_invite")) {
                return new C0ZZB(new C1233704sB(2131847875, (List<String>) null), new C0I3V(new C460290I3f(C895820ZCi.LIZ(shareLiveContent, c869590Y9l, true), Collections.singletonList(""))), new C1622006Ws(newLiveRoomStruct.roomStructConstructor()), null, null, 24);
            }
            return new C0ZZB(new C1233704sB(2131847875, (List<String>) null), C460510I4b.LIZ, new C1622006Ws(newLiveRoomStruct.roomStructConstructor()), null, null, 24);
        }
        return C0ZZ2.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        final C0ZZ1 c0zz1Fo = fo(c869590Y9l);
        final C462620ICe c462620ICeLIZ = C0ICS.LIZ(true);
        final C0ZZ3 c0zz3M234do = m234do(c869590Y9l, c0zz1Fo);
        return new C0ZZ9(c0ib0, c462620ICeLIZ, c0zz1Fo, c0zz3M234do) { // from class: X.0ZZ7
            public final C0IB0 LL;
            public final C462620ICe LLILLJJLI;
            public final C0ZZ1 LLILLL;
            public final C0ZZ3 LLILZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0ZZ7)) {
                    return false;
                }
                C0ZZ7 c0zz7 = (C0ZZ7) obj;
                return Intrinsics.LJFF(this.LL, c0zz7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zz7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0zz7.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0zz7.LLILZ);
            }

            public final int hashCode() {
                int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
                C0ZZ1 c0zz1 = this.LLILLL;
                return ((iHashCode + (c0zz1 == null ? 0 : c0zz1.hashCode())) * 31) + this.LLILZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareLiveSendPowerItem(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", roomInfo=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", liveCardUIState=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0ZZ9
            public final ShareLiveContent getContent() {
                BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ(this), BaseContent.class);
                if (orParseJsonContent instanceof ShareLiveContent) {
                    return (ShareLiveContent) orParseJsonContent;
                }
                return null;
            }

            @Override // X.C0ZZ9
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.C0ZZ9
            public final C0ZZ3 LJJJLL() {
                return this.LLILZ;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LL;
            }

            @Override // X.C0ZZ9
            public final C0ZZ1 getRoomInfo() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C461450I7r.LIZ(this, interfaceC1891350zJl);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C0ZZ8.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0ib0;
                this.LLILLJJLI = c462620ICeLIZ;
                this.LLILLL = c0zz1Fo;
                this.LLILZ = c0zz3M234do;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, final C0IB0 c0ib0) {
        final C0ZZ1 c0zz1Fo = fo(c869590Y9l);
        final C462620ICe c462620ICeLIZ = C0ICS.LIZ(false);
        final C0ZZ3 c0zz3M234do = m234do(c869590Y9l, c0zz1Fo);
        return new C0ZZ9(c0ib0, c462620ICeLIZ, c0zz1Fo, c0zz3M234do) { // from class: X.0ZZ6
            public final C0IB0 LL;
            public final C462620ICe LLILLJJLI;
            public final C0ZZ1 LLILLL;
            public final C0ZZ3 LLILZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0ZZ6)) {
                    return false;
                }
                C0ZZ6 c0zz6 = (C0ZZ6) obj;
                return Intrinsics.LJFF(this.LL, c0zz6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zz6.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0zz6.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0zz6.LLILZ);
            }

            public final int hashCode() {
                int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
                C0ZZ1 c0zz1 = this.LLILLL;
                return ((iHashCode + (c0zz1 == null ? 0 : c0zz1.hashCode())) * 31) + this.LLILZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShareLiveReceivePowerItem(skeletonLayoutData=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", roomInfo=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", liveCardUIState=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0ZZ9
            public final ShareLiveContent getContent() {
                BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ(this), BaseContent.class);
                if (orParseJsonContent instanceof ShareLiveContent) {
                    return (ShareLiveContent) orParseJsonContent;
                }
                return null;
            }

            @Override // X.C0ZZ9
            public final C462620ICe LIZJ() {
                return this.LLILLJJLI;
            }

            @Override // X.C0ZZ9
            public final C0ZZ3 LJJJLL() {
                return this.LLILZ;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LL;
            }

            @Override // X.C0ZZ9
            public final C0ZZ1 getRoomInfo() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C461450I7r.LIZ(this, interfaceC1891350zJl);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C0ZZ8.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = c0ib0;
                this.LLILLJJLI = c462620ICeLIZ;
                this.LLILLL = c0zz1Fo;
                this.LLILZ = c0zz3M234do;
            }
        };
    }
}
