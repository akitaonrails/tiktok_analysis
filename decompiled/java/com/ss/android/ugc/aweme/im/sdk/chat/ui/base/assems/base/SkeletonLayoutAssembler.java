package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base;

import X.AbstractC738140SxQ;
import X.AbstractC899510ZQn;
import X.AnonymousClass0629;
import X.C007O;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C0I0B;
import X.C0I3C;
import X.C0I4X;
import X.C0QSJ;
import X.C0Y8T;
import X.C0YNY;
import X.C0YSQ;
import X.C0ZDX;
import X.C0ZOA;
import X.C0ZOD;
import X.C0ZOE;
import X.C0ZOF;
import X.C0ZOG;
import X.C0ZOH;
import X.C0ZOI;
import X.C0ZOJ;
import X.C0ZOL;
import X.C0ZOM;
import X.C0ZOS;
import X.C0ZOW;
import X.C0ZP4;
import X.C0ZPC;
import X.C0ZPD;
import X.C0ZSN;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1275104yr;
import X.C127G;
import X.C13LE;
import X.C14IR;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1628906Zj;
import X.C1637806bA;
import X.C1637906bB;
import X.C1661306ex;
import X.C1770850wBP;
import X.C1807670x8n;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C21652419oY;
import X.C2217381BqS;
import X.C23250099c;
import X.C271540Aka;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C454980Hsm;
import X.C457780HxI;
import X.C459160HzW;
import X.C461720I8s;
import X.C462500IBs;
import X.C462510IBt;
import X.C462520IBu;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C788940UxA;
import X.C788950UxB;
import X.C788960UxC;
import X.C788980UxE;
import X.C817503Hh;
import X.C869590Y9l;
import X.C891480YyA;
import X.C892180YzI;
import X.C892220YzM;
import X.C892380Yzc;
import X.C897260ZHw;
import X.C897270ZHx;
import X.C898560ZMw;
import X.C898880ZOc;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1233504s9;
import X.InterfaceC1493505sz;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1693306k7;
import X.InterfaceC1808750xAX;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC788970UxD;
import X.InterfaceC874680YTa;
import X.InterfaceC876950Yaj;
import X.InterfaceC879330YeZ;
import Y.AObjectS67S0000000_14;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.report.IChatReportPageViewModelProvider;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.lightinteract.api.vm.AbsChatPageLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.EasterEggShareMessageAnimatorAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.lightinteraction.IMessageListLightInteractionAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.tracker.MessageListTracker;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IStoryV2AnimViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.wheedmbadge.WheeDmBadgeMessageListViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.wheeexclusive.WheeExclusiveBubbleMessageListViewModel;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMReadMessageAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AvatarState;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AvatarStateKt;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageStatusDataKt;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.IIMQuotedAreaService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.IMPendingReactionViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerRecommendationViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.slot.NoticeReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.AvatarReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.BotAvatarReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.GroupChatMessageStatusReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.InlineLabelReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.ReactionReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.ReportPageUIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SingleChatMessageStatusReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.UsernameReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.AISelfStickerInlineViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IAddStickerToFavViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import com.ss.android.ugc.aweme.utils.ChatCustomizeMessageListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS72S0301000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SkeletonLayoutAssembler extends AbstractC738140SxQ implements InterfaceC724530SbT, SkeletonLayoutAssemblerBridge, MessageListTracker, IMessageListLightInteractionAbility, InterfaceC1146704e9 {
    public static final C0ZOJ LLJLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C736950SvV LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final C1559260qg8 LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public Map<C14IR, ? extends Function0<? extends AbstractC899510ZQn<?, ?>>> LLJJJIL;
    public final C0ZOL LLJJJJ;
    public volatile InterfaceC1808750xAX LLJJJJJIL;
    public volatile SessionInfo LLJJJJLIIL;
    public volatile ChatroomEventAbility LLJJL;
    public volatile MessagePowerListAbility LLJJLIIIJLLLLLLLZ;
    public volatile C0I4X LLJL;
    public C127G LLJLIL;
    public InterfaceC665370Q7z LLJLILLLLZIIL;
    public C0QSJ LLJLL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final InterfaceC1808750xAX lo() {
        InterfaceC1808750xAX interfaceC1808750xAX = this.LLJJJJJIL;
        if (interfaceC1808750xAX == null) {
            synchronized (this) {
                interfaceC1808750xAX = this.LLJJJJJIL;
                if (interfaceC1808750xAX == null) {
                    InterfaceC1808750xAX interfaceC1808750xAX2 = (InterfaceC1808750xAX) C1807670x8n.LLLLZIL();
                    this.LLJJJJJIL = interfaceC1808750xAX2;
                    return interfaceC1808750xAX2;
                }
            }
        }
        return interfaceC1808750xAX;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [X.0ZOJ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkeletonLayoutAssembler.class, "replyToStickerVM", "getReplyToStickerVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/replytosticker/ReplyToStickerRecommendationViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(SkeletonLayoutAssembler.class, "addStickerToFavVM", "getAddStickerToFavVM()Lcom/ss/android/ugc/aweme/im/sticker/api/viewmodel/IAddStickerToFavViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "storyV2AnimViewModel", "getStoryV2AnimViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IStoryV2AnimViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "chatReportPageViewModel", "getChatReportPageViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/report/ChatReportPageViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "messageListViewModel", "getMessageListViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "photo2StickerRepo", "getPhoto2StickerRepo()Lcom/ss/android/ugc/aweme/im/sticker/api/service/photo2sticker/Photo2StickerInlineRepository;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "photo2StickerSessionInfo", "getPhoto2StickerSessionInfo()Lcom/ss/android/ugc/aweme/im/chatroom/api/model/SessionInfo;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "photo2StickerViewModel", "getPhoto2StickerViewModel()Lcom/ss/android/ugc/aweme/im/sticker/api/viewmodel/Photo2StickerViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "aiselfMessageViewModel", "getAiselfMessageViewModel()Lcom/ss/android/ugc/aweme/im/sticker/api/viewmodel/AISelfStickerInlineViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "chatroomEventAbility", "getChatroomEventAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/ChatroomEventAbility;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "messagePowerListAbility", "getMessagePowerListAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessagePowerListAbility;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "voiceTranscriptViewHandler", "getVoiceTranscriptViewHandler()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/voice/IMVoiceTranscriptViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "chatRoomCameraVM", "getChatRoomCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "chatCustomizeVM", "getChatCustomizeVM()Lcom/ss/android/ugc/aweme/utils/ChatCustomizeMessageListViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "wheeDmBadgeVM", "getWheeDmBadgeVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/wheedmbadge/WheeDmBadgeMessageListViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "wheeExclusiveBubbleVM", "getWheeExclusiveBubbleVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/wheeexclusive/WheeExclusiveBubbleMessageListViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "lightInteractionViewModel", "getLightInteractionViewModel()Lcom/ss/android/ugc/aweme/im/lightinteract/api/vm/AbsChatPageLightInteractionViewModel;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "quotedAreaFactory", "getQuotedAreaFactory()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quoted/factory/IQuotedItemUIStateFactory;", 0), new C2217381BqS(SkeletonLayoutAssembler.class, "pendingReactionViewModel", "getPendingReactionViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/reaction/IMPendingReactionViewModel;", 0)};
        LLJLLIL = new Object() { // from class: X.0ZOJ
        };
    }

    public SkeletonLayoutAssembler() {
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReplyToStickerRecommendationViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ, 154), AFwS248S0000000_14.get$arr$(201), null, true);
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(204);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IAddStickerToFavViewModel.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ2, 159), AFwS248S0000000_14.get$arr$(187), aFwS201S0000000_14, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(IStoryV2AnimViewModel.class);
        AwS558S0100000_14 awS558S0100000_14 = null;
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ3, 146), AFwS248S0000000_14.get$arr$(188), null, true);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) PluggableExtentionKt.pluggableSpiForReal(IChatReportPageViewModelProvider.class);
        if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
            awS558S0100000_14 = new AwS558S0100000_14(defaultViewModelProviderFactory, 723);
        }
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ChatReportPageViewModel.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ4, 147), AFwS248S0000000_14.get$arr$(190), awS558S0100000_14, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(IIMessageListViewModel.class);
        this.LLILZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ5, 149), AFwS248S0000000_14.get$arr$(189), null, true);
        AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14(this, 725);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(Photo2StickerViewModel.class);
        this.LLIZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ6, 148), AFwS248S0000000_14.get$arr$(191), awS558S0100000_142, true);
        AFwS201S0000000_14 aFwS201S0000000_142 = AFwS201S0000000_14.get$arr$(205);
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(AISelfStickerInlineViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ7, 150), AFwS248S0000000_14.get$arr$(193), aFwS201S0000000_142, true);
        AwS558S0100000_14 awS558S0100000_143 = new AwS558S0100000_14(this, 722);
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(IMVoiceTranscriptViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ8), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ8, 151), AFwS248S0000000_14.get$arr$(194), awS558S0100000_143, true);
        AwS558S0100000_14 awS558S0100000_144 = new AwS558S0100000_14(this, 717);
        this.LLJI = new C736950SvV(C13LE.LIZ(MessageReplyVM.class), new AwS558S0100000_14(awS558S0100000_144, 720), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS248S0000000_14.get$arr$(192), new AwS558S0100000_14((AbstractC738140SxQ) this, 721), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(ChatRoomCameraVM.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ9), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ9, 152), AFwS248S0000000_14.get$arr$(195), null, true);
        C19719912Dl c19719912DlLIZ10 = C13LE.LIZ(ChatCustomizeMessageListViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ10), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ10, 153), AFwS248S0000000_14.get$arr$(196), null, true);
        C19719912Dl c19719912DlLIZ11 = C13LE.LIZ(WheeDmBadgeMessageListViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ11), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ11, 155), AFwS248S0000000_14.get$arr$(197), null, true);
        C19719912Dl c19719912DlLIZ12 = C13LE.LIZ(WheeExclusiveBubbleMessageListViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ12), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ12, 156), AFwS248S0000000_14.get$arr$(198), null, true);
        C19719912Dl c19719912DlLIZ13 = C13LE.LIZ(AbsChatPageLightInteractionViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ13), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ13, 157), AFwS248S0000000_14.get$arr$(199), null, true);
        this.LLJJI = new C1559260qg8(new C723580SZw(this, C1661306ex.class, null), checkSupervisorPrepared());
        C19719912Dl c19719912DlLIZ14 = C13LE.LIZ(IMPendingReactionViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ14), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ14, 158), AFwS248S0000000_14.get$arr$(200), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 719));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 718));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1707));
        this.LLJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 724));
        this.LLJJJJ = C0ZOL.LIZ;
    }

    public final C0QSJ bo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLILLLLZIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJLILLLLZIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLJLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final C457780HxI fo() {
        return (C457780HxI) this.LL.getValue();
    }

    public final ChatroomEventAbility ho() {
        ChatroomEventAbility chatroomEventAbility;
        ChatroomEventAbility chatroomEventAbility2 = this.LLJJL;
        if (chatroomEventAbility2 == null) {
            synchronized (this) {
                chatroomEventAbility2 = this.LLJJL;
                if (chatroomEventAbility2 == null) {
                    C0QSJ c0qsjBo = bo();
                    if (c0qsjBo != null) {
                        chatroomEventAbility = (ChatroomEventAbility) c0qsjBo.getAbility(ChatroomEventAbility.class);
                        C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
                    } else {
                        chatroomEventAbility = null;
                    }
                    this.LLJJL = chatroomEventAbility;
                    return chatroomEventAbility;
                }
            }
        }
        return chatroomEventAbility2;
    }

    public final IIMessageListViewModel ko() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (IIMessageListViewModel) assemVMLazy.getValue();
    }

    public final C0I4X mo() {
        C0I4X c0i4x = this.LLJL;
        if (c0i4x == null) {
            synchronized (this) {
                c0i4x = this.LLJL;
                if (c0i4x == null) {
                    C0QSJ c0qsjBo = bo();
                    c0i4x = c0qsjBo != null ? (C0I4X) c0qsjBo.getAbility(C0I4X.class) : null;
                    this.LLJL = c0i4x;
                    if (c0i4x == null) {
                        return new C0I4X() { // from class: X.0I4W
                            public static final C13BV LIZIZ = C13BV.INSTANCE;

                            @Override // X.C0I4X
                            public final List<InterfaceC460500I4a> LIZ() {
                                return LIZIZ;
                            }

                            @Override // X.C0I4X
                            public final C460810I5f LIZIZ(C869590Y9l c869590Y9l) {
                                return C0I4U.LIZ(this, c869590Y9l);
                            }
                        };
                    }
                }
            }
        }
        return c0i4x;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IStoryV2AnimViewModel.class, new AObjectS67S0000000_14(this, 3), ChatReportPageViewModel.class, new AObjectS67S0000000_14(this, 4), IIMessageListViewModel.class, new AObjectS67S0000000_14(this, 1), AbsChatPageLightInteractionViewModel.class, new AObjectS67S0000000_14(this, 2)}, defaultViewModelProviderFactory);
                    this.LLJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge
    public final boolean mz0() {
        SessionInfo sessionInfo;
        C457780HxI c457780HxIFo = fo();
        return (c457780HxIFo == null || (sessionInfo = c457780HxIFo.LL) == null || !sessionInfo.isChatroomAnalyticsBlocked()) ? false : true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, SkeletonLayoutAssemblerBridge.class, null, null);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI2, null), this, MessageListTracker.class, null, null);
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI3, null), this, IMessageListLightInteractionAbility.class, null, null);
        }
        Fragment fragmentLJI4 = C724240Sb0.LJI(this);
        if (fragmentLJI4 != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI4, null), new EasterEggShareMessageAnimatorAbility(), EasterEggShareMessageAnimatorAbility.class, null, null);
        }
        Object obj = getConfig().LLILZ.get("slots_override");
        this.LLJJJIL = obj instanceof Map ? (Map) obj : null;
    }

    public final boolean so() {
        SessionInfo sessionInfo;
        C0Y8T c0y8tLIZ;
        C457780HxI c457780HxIFo = fo();
        if (c457780HxIFo == null || (sessionInfo = c457780HxIFo.LL) == null || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId())) == null) {
            return false;
        }
        IMAIServiceAPI.LIZ.getClass();
        return AnonymousClass0629.LIZ().LIZ().LJIIIZ(c0y8tLIZ);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static View m237do(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isClickable()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewM237do = m237do(viewGroup.getChildAt(i));
                if (viewM237do != null) {
                    return viewM237do;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge
    public final C0ZOE Af2(C869590Y9l c869590Y9l) {
        SessionInfo sessionInfo;
        C457780HxI c457780HxIFo = fo();
        if (c457780HxIFo != null && (sessionInfo = c457780HxIFo.LL) != null && sessionInfo.isReportPage()) {
            return new C0ZOA(new AwS450S0200000_14(this, c869590Y9l, 6));
        }
        return C0ZOM.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.lightinteraction.IMessageListLightInteractionAbility
    public final void YW0(C869590Y9l c869590Y9l) {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        ((AbsChatPageLightInteractionViewModel) assemVMLazy.getValue()).vQ2(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge
    public final AbstractC899510ZQn<?, ?> fQ2(C14IR c14ir) {
        C457780HxI c457780HxIFo;
        SessionInfo sessionInfo;
        String conversationId;
        SessionInfo sessionInfo2;
        SessionInfo sessionInfo3;
        SessionInfo sessionInfo4;
        SessionInfo sessionInfo5;
        Function0<? extends AbstractC899510ZQn<?, ?>> function0;
        Map<C14IR, ? extends Function0<? extends AbstractC899510ZQn<?, ?>>> map = this.LLJJJIL;
        if (map != null && (function0 = map.get(c14ir)) != null) {
            return function0.invoke();
        }
        if (Intrinsics.LJFF(c14ir, C0ZOG.LIZ)) {
            return null;
        }
        boolean z = true;
        if (Intrinsics.LJFF(c14ir, C897270ZHx.LIZ)) {
            if (((Boolean) this.LLJJIJIL.getValue()).booleanValue()) {
                return null;
            }
            C457780HxI c457780HxIFo2 = fo();
            if (c457780HxIFo2 != null && (sessionInfo5 = c457780HxIFo2.LL) != null && sessionInfo5.isSingleChat()) {
                if (so()) {
                    return new AbstractC899510ZQn<SingleChatMessageStatusReusedSkeletonUIContent, C1275104yr>() { // from class: X.0ZHN
                        public String LIZJ;

                        {
                            super(new C899520ZQo(C13LE.LIZ(SingleChatMessageStatusReusedSkeletonUIContent.class), C1163440gNi.LIZJ));
                        }

                        @Override // X.AbstractC899510ZQn
                        public final void LIZIZ(List<? extends C869590Y9l> list) {
                            SessionInfo sessionInfo6;
                            InterfaceC881630YiH interfaceC881630YiHLJIIIIZZ;
                            C0YHX c0yhxLIZ;
                            C457780HxI c457780HxIFo3 = this.LIZLLL.fo();
                            String strBinarySearchReadMessage = null;
                            if (c457780HxIFo3 != null) {
                                sessionInfo6 = c457780HxIFo3.LL;
                            } else {
                                sessionInfo6 = null;
                            }
                            boolean zIsUnacceptedOrReceiverIsFiltered = MessageStatusDataKt.isUnacceptedOrReceiverIsFiltered(sessionInfo6);
                            if (sessionInfo6 != null && !zIsUnacceptedOrReceiverIsFiltered) {
                                IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class);
                                if (iIMCoreProxyService != null && (c0yhxLIZ = iIMCoreProxyService.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null) {
                                    interfaceC881630YiHLJIIIIZZ = c0yhxLIZ.LJIIIIZZ();
                                } else {
                                    interfaceC881630YiHLJIIIIZZ = null;
                                }
                                strBinarySearchReadMessage = MessageStatusDataKt.binarySearchReadMessage(list, sessionInfo6, interfaceC881630YiHLJIIIIZZ);
                            }
                            this.LIZJ = strBinarySearchReadMessage;
                        }

                        @Override // X.AbstractC899510ZQn
                        public final C461020I6a<C1275104yr> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                            boolean z2;
                            if (Intrinsics.LJFF(c869590Y9l.getUuid(), this.LIZJ) && !C1668706g9.LIZ(IIMBusinessChatService.LIZ).getFeedbackService().LIZ(c869590Y9l, list)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            return new C461020I6a<>(new C1275104yr(z2), z2);
                        }
                    };
                }
                return new AbstractC899510ZQn<SingleChatMessageStatusReusedSkeletonUIContent, C1275104yr>() { // from class: X.0ZHO
                    public String LIZJ;

                    {
                        super(new C899520ZQo(C13LE.LIZ(SingleChatMessageStatusReusedSkeletonUIContent.class), C1163440gNi.LIZJ));
                    }

                    @Override // X.AbstractC899510ZQn
                    public final void LIZIZ(List<? extends C869590Y9l> list) {
                        SessionInfo sessionInfo6;
                        InterfaceC881630YiH interfaceC881630YiHLJIIIIZZ;
                        C0YHX c0yhxLIZ;
                        C457780HxI c457780HxIFo3 = this.LIZLLL.fo();
                        String strBinarySearchReadMessage = null;
                        if (c457780HxIFo3 != null) {
                            sessionInfo6 = c457780HxIFo3.LL;
                        } else {
                            sessionInfo6 = null;
                        }
                        boolean zReceiverIsFilteredOrMessageRequest = MessageStatusDataKt.receiverIsFilteredOrMessageRequest(sessionInfo6);
                        if (sessionInfo6 != null && !zReceiverIsFilteredOrMessageRequest && this.LIZLLL.ko().getState().LLILLL) {
                            IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class);
                            if (iIMCoreProxyService != null && (c0yhxLIZ = iIMCoreProxyService.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null) {
                                interfaceC881630YiHLJIIIIZZ = c0yhxLIZ.LJIIIIZZ();
                            } else {
                                interfaceC881630YiHLJIIIIZZ = null;
                            }
                            strBinarySearchReadMessage = MessageStatusDataKt.binarySearchReadMessage(list, sessionInfo6, interfaceC881630YiHLJIIIIZZ);
                        }
                        this.LIZJ = strBinarySearchReadMessage;
                    }

                    @Override // X.AbstractC899510ZQn
                    public final C461020I6a<C1275104yr> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                        boolean z2;
                        if (Intrinsics.LJFF(c869590Y9l.getUuid(), this.LIZJ) && !C1668706g9.LIZ(IIMBusinessChatService.LIZ).getFeedbackService().LIZ(c869590Y9l, list)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return new C461020I6a<>(new C1275104yr(z2), z2);
                    }
                };
            }
            return new AbstractC899510ZQn<GroupChatMessageStatusReusedSkeletonUIContent, C007O>() { // from class: X.0YkT
                public Pair<String, ? extends Set<Long>> LIZJ;

                {
                    super(new C899520ZQo(C13LE.LIZ(GroupChatMessageStatusReusedSkeletonUIContent.class), C1163440gNi.LIZJ));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
                @Override // X.AbstractC899510ZQn
                public final void LIZIZ(List<? extends C869590Y9l> list) {
                    C457780HxI c457780HxIFo3;
                    SessionInfo sessionInfo6;
                    C869590Y9l next;
                    IIMCoreProxyService iIMCoreProxyService;
                    C0YHX c0yhxLIZ;
                    InterfaceC881630YiH interfaceC881630YiHLJIIIIZZ;
                    ?? arrayList;
                    List<Long> memberIds;
                    long jLongValue;
                    this.LIZJ = null;
                    if (!C881730YiR.LIZIZ || (c457780HxIFo3 = this.LIZLLL.fo()) == null || (sessionInfo6 = c457780HxIFo3.LL) == null || !C1727806pg.LIZ.LIZ("group_chat_operation_enable_read_status", sessionInfo6.getConversationId(), C461720I8s.LIZIZ(), false) || MessageStatusDataKt.receiverIsFilteredOrMessageRequest(sessionInfo6)) {
                        return;
                    }
                    Iterator<? extends C869590Y9l> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            C869590Y9l c869590Y9l = next;
                            if (C0ZDR.LIZ(c869590Y9l) || c869590Y9l.getMessageStatus() == C0YUT.RECALLED) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C869590Y9l c869590Y9l2 = next;
                    if (c869590Y9l2 != null && C0ZDX.LJJJJIZL(c869590Y9l2) && c869590Y9l2.isSuccessStatus() && (!Intrinsics.LJFF(c869590Y9l2.getLocalExt().get("s:message_index_is_local"), "1")) && (iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class)) != null && (c0yhxLIZ = iIMCoreProxyService.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (interfaceC881630YiHLJIIIIZZ = c0yhxLIZ.LJIIIIZZ()) != null) {
                        long jLIZJ = C461720I8s.LIZJ();
                        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo6.getConversationId());
                        if (c0y8tLIZ != null && (memberIds = c0y8tLIZ.getMemberIds()) != null) {
                            arrayList = new ArrayList();
                            for (Long l : memberIds) {
                                Long l2 = l;
                                if (l2 == null || l2.longValue() != jLIZJ) {
                                    Long lLIZLLL = interfaceC881630YiHLJIIIIZZ.LIZLLL(l2.longValue(), sessionInfo6.getConversationId());
                                    if (lLIZLLL != null) {
                                        jLongValue = lLIZLLL.longValue();
                                    } else {
                                        jLongValue = 0;
                                    }
                                    if (jLongValue >= c869590Y9l2.getIndex()) {
                                        arrayList.add(l);
                                    }
                                }
                            }
                        } else {
                            arrayList = C13BV.INSTANCE;
                        }
                        this.LIZJ = new Pair<>(c869590Y9l2.getUuid(), C13LP.LLIIJI(arrayList));
                    }
                }

                @Override // X.AbstractC899510ZQn
                public final C461020I6a<C007O> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                    Pair<String, ? extends Set<Long>> pair = this.LIZJ;
                    if (pair == null) {
                        return new C461020I6a<>(new C007O(C08CX.INSTANCE), false);
                    }
                    String first = pair.getFirst();
                    Set<Long> second = pair.getSecond();
                    if (Intrinsics.LJFF(first, c869590Y9l.getUuid())) {
                        return new C461020I6a<>(new C007O(second), !second.isEmpty());
                    }
                    return new C461020I6a<>(new C007O(C08CX.INSTANCE), false);
                }
            };
        }
        if (Intrinsics.LJFF(c14ir, C897260ZHw.LIZ)) {
            if (!((Boolean) this.LLJJIJIL.getValue()).booleanValue()) {
                return null;
            }
            return new AbstractC899510ZQn<InlineLabelReusedSkeletonUIContent, InterfaceC1233504s9>() { // from class: X.0ZHe
                {
                    super(new C899520ZQo(C13LE.LIZ(InlineLabelReusedSkeletonUIContent.class), C1163440gNi.LIZJ));
                }

                @Override // X.AbstractC899510ZQn
                public final void LIZIZ(List<? extends C869590Y9l> list) {
                    EnumC897070ZHd first;
                    C897090ZHf c897090ZHf = (C897090ZHf) this.LIZJ.LLJJJ.getValue();
                    c897090ZHf.getClass();
                    C823170WQx<Pair<EnumC897070ZHd, InterfaceC1233004s4>> c823170WQx = new C823170WQx<>();
                    c823170WQx.addAll(c897090ZHf.LJFF);
                    for (InterfaceC897100ZHg interfaceC897100ZHg : c897090ZHf.LIZ) {
                        if (interfaceC897100ZHg.LIZ()) {
                            if (!c897090ZHf.LJ.contains(interfaceC897100ZHg.getType())) {
                                c897090ZHf.LJ.add(interfaceC897100ZHg.getType());
                                List<InterfaceC1233004s4> listLIZIZ = interfaceC897100ZHg.LIZIZ(list);
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
                                Iterator<InterfaceC1233004s4> it2 = listLIZIZ.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(new Pair(interfaceC897100ZHg.getType(), it2.next()));
                                }
                                c897090ZHf.LJFF.addAll(arrayList);
                                c823170WQx.addAll(arrayList);
                            }
                        } else {
                            Iterator<InterfaceC1233004s4> it3 = interfaceC897100ZHg.LIZIZ(list).iterator();
                            while (it3.hasNext()) {
                                c823170WQx.add(new Pair<>(interfaceC897100ZHg.getType(), it3.next()));
                            }
                        }
                    }
                    c897090ZHf.LIZJ = c823170WQx;
                    for (Pair<EnumC897070ZHd, InterfaceC1233004s4> pair : c823170WQx) {
                        EnumC897070ZHd first2 = pair.getFirst();
                        InterfaceC1233004s4 second = pair.getSecond();
                        Pair<EnumC897070ZHd, String> pair2 = new Pair<>(first2, second.LIZ());
                        if (!c897090ZHf.LIZLLL.contains(pair2)) {
                            Pair<EnumC897070ZHd, InterfaceC1233004s4> pairLIZ = c897090ZHf.LIZ(second.LIZ());
                            if (pairLIZ != null) {
                                first = pairLIZ.getFirst();
                            } else {
                                first = null;
                            }
                            if (first == first2) {
                                c897090ZHf.LIZLLL.add(pair2);
                            }
                        }
                    }
                }

                @Override // X.AbstractC899510ZQn
                public final C461020I6a<InterfaceC1233504s9> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                    Pair<EnumC897070ZHd, InterfaceC1233004s4> pairLIZ = ((C897090ZHf) this.LIZJ.LLJJJ.getValue()).LIZ(c869590Y9l.getUuid());
                    if (pairLIZ == null) {
                        return new C461020I6a<>(C897160ZHm.LIZ, false);
                    }
                    EnumC897070ZHd first = pairLIZ.getFirst();
                    InterfaceC1233004s4 second = pairLIZ.getSecond();
                    if (second instanceof C1232804s2) {
                        CharSequence charSequenceInvoke = ((C1232804s2) second).LIZIZ.invoke();
                        return new C461020I6a<>(new C897050ZHb(first, new C1233604sA(charSequenceInvoke.toString(), new AwS593S0100000_14(charSequenceInvoke, 88))), true);
                    }
                    if (second instanceof C1232904s3) {
                        return new C461020I6a<>(new C1233404s8(((C1232904s3) second).LIZIZ), true);
                    }
                    throw new C1954807lC();
                }
            };
        }
        if (Intrinsics.LJFF(c14ir, C0ZOH.LIZ)) {
            return new AbstractC899510ZQn<NoticeReusedSkeletonUIContent, C898880ZOc>() { // from class: X.0ZOb
                {
                    super(new C899530ZQp(C13LE.LIZ(NoticeReusedSkeletonUIContent.class), R.layout.cp2));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:65:0x01a5 A[PHI: r5
                  0x01a5: PHI (r5v6 com.ss.android.ugc.aweme.im.message.content.SystemContent) = 
                  (r5v1 com.ss.android.ugc.aweme.im.message.content.SystemContent)
                  (r5v7 com.ss.android.ugc.aweme.im.message.content.SystemContent)
                 binds: [B:64:0x01a3, B:47:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference failed for: r3v0, types: [X.06Wv, com.ss.android.ugc.aweme.im.message.content.SystemContent] */
                /* JADX WARN: Type inference failed for: r3v11 */
                /* JADX WARN: Type inference failed for: r3v12 */
                @Override // X.AbstractC899510ZQn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C461020I6a<X.C898880ZOc> LIZ(java.util.List<? extends X.C869590Y9l> r13, X.C869590Y9l r14, int r15) {
                    /*
                        Method dump skipped, instruction units count: 488
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C898870ZOb.LIZ(java.util.List, X.0Y9l, int):X.0I6a");
                }
            };
        }
        if (Intrinsics.LJFF(c14ir, C898560ZMw.LIZ)) {
            return new AbstractC899510ZQn<ReactionReusedSkeletonUIContent, MessageReactionsState>() { // from class: X.0Z6z
                {
                    new C899530ZQp(C13LE.LIZ(ReactionReusedSkeletonUIContent.class), R.layout.co7);
                }

                @Override // X.AbstractC899510ZQn
                public final C461020I6a<MessageReactionsState> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                    MessageReactionsState messageReactionsStateBuildFromMessage = MessageReactionsState.Companion.buildFromMessage(c869590Y9l);
                    return new C461020I6a<>(messageReactionsStateBuildFromMessage, MessageReactionsState.NoReactions.INSTANCE.hasReaction(messageReactionsStateBuildFromMessage));
                }
            };
        }
        if (Intrinsics.LJFF(c14ir, C462510IBt.LIZ)) {
            return new AbstractC899510ZQn<SideMessageStatusReusedSkeletonUISlot, MessageLeftIconState>() { // from class: X.0ZOB
                {
                    super(new C899520ZQo(C13LE.LIZ(SideMessageStatusReusedSkeletonUISlot.class), C1163440gNi.LIZLLL));
                }

                /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
                @Override // X.AbstractC899510ZQn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(java.util.List<? extends X.C869590Y9l> r15) {
                    /*
                        Method dump skipped, instruction units count: 476
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0ZOB.LIZIZ(java.util.List):void");
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:118:0x01d6, code lost:
                
                    if (r5.equals("now_bonus_invite") == false) goto L161;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:121:0x01e0, code lost:
                
                    if (r5.equals("now_invite") == false) goto L161;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:124:0x01ea, code lost:
                
                    if (r5.equals("now_signup") == false) goto L161;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:127:0x01f4, code lost:
                
                    if (r5.equals("point_of_interest") == false) goto L161;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:130:0x01fe, code lost:
                
                    if (r5.equals("now_post") == false) goto L161;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:139:0x0221, code lost:
                
                    if (r6.contentMenus.contains("forward") != false) goto L161;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:144:0x0238, code lost:
                
                    if (X.C882340YjQ.LJI(r0) == false) goto L161;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:160:0x0278, code lost:
                
                    if (X.C2242161CpK.LIZ(X.C0Z2Z.LIZ(r10, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate.class)) == false) goto L161;
                 */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // X.AbstractC899510ZQn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C461020I6a<com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState> LIZ(java.util.List<? extends X.C869590Y9l> r9, X.C869590Y9l r10, int r11) {
                    /*
                        Method dump skipped, instruction units count: 692
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0ZOB.LIZ(java.util.List, X.0Y9l, int):X.0I6a");
                }
            };
        }
        if (Intrinsics.LJFF(c14ir, C462520IBu.LIZ)) {
            IIMQuotedAreaService iIMQuotedAreaService = (IIMQuotedAreaService) PluggableExtentionKt.pluggableSpiForReal(IIMQuotedAreaService.class);
            if (iIMQuotedAreaService == null) {
                return null;
            }
            AssemVMLazy assemVMLazy = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
            return iIMQuotedAreaService.LIZ((IStoryV2AnimViewModel) assemVMLazy.getValue(), mo(), C1558520qew.LJIIL(this));
        }
        if (Intrinsics.LJFF(c14ir, C0ZOI.LIZ)) {
            C457780HxI c457780HxIFo3 = fo();
            if (c457780HxIFo3 != null && (sessionInfo4 = c457780HxIFo3.LL) != null && sessionInfo4.isGroupChat()) {
                return new AbstractC899510ZQn<UsernameReusedSkeletonUIContent, C0ZOS>() { // from class: X.0ZOR
                    {
                        super(new C899530ZQp(C13LE.LIZ(UsernameReusedSkeletonUIContent.class), R.layout.cp3));
                    }

                    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
                    @Override // X.AbstractC899510ZQn
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.C461020I6a<X.C0ZOS> LIZ(java.util.List<? extends X.C869590Y9l> r14, X.C869590Y9l r15, int r16) {
                        /*
                            r13 = this;
                            r7 = r16
                            int r0 = r7 + 1
                            r5 = r14
                            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r0, r5)
                            X.0Y9l r1 = (X.C869590Y9l) r1
                            kotlin.jvm.internal.AwS72S0301000_14 r3 = new kotlin.jvm.internal.AwS72S0301000_14
                            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler r4 = r13.LIZJ
                            r8 = 0
                            r6 = r15
                            r3.<init>(r4, r5, r6, r7, r8)
                            X.01GW r2 = X.C452501pT.LIZIZ(r3)
                            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler r0 = r13.LIZJ
                            X.0HxI r0 = r0.fo()
                            r3 = 0
                            if (r0 == 0) goto La9
                            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LL
                        L23:
                            boolean r1 = X.C0ZOT.LIZ(r6, r1)
                            if (r0 != 0) goto L33
                            X.0ZOS r0 = X.C0ZOS.LIZJ
                        L2b:
                            X.0I6a r2 = new X.0I6a
                            boolean r1 = r0.LIZ
                            r2.<init>(r0, r1)
                            return r2
                        L33:
                            boolean r0 = r0.isGroupChat()
                            if (r0 != 0) goto L3c
                            X.0ZOS r0 = X.C0ZOS.LIZJ
                            goto L2b
                        L3c:
                            boolean r0 = X.C0ZDX.LJJJJIZL(r6)
                            if (r0 == 0) goto L45
                            X.0ZOS r0 = X.C0ZOS.LIZJ
                            goto L2b
                        L45:
                            if (r1 != 0) goto L4a
                            X.0ZOS r0 = X.C0ZOS.LIZJ
                            goto L2b
                        L4a:
                            java.lang.Object r0 = r2.getValue()
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            if (r0 == 0) goto L59
                            X.0ZOS r0 = X.C0ZOS.LIZJ
                            goto L2b
                        L59:
                            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
                            r0.getClass()
                            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
                            X.1BGS r2 = r0.LJ()
                            long r0 = r6.getSender()
                            java.lang.String r0 = java.lang.String.valueOf(r0)
                            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r5 = r2.LJ(r0, r3)
                            if (r5 == 0) goto La6
                            java.lang.Class<com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService> r7 = com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService.class
                            r8 = 0
                            r11 = 14
                            r12 = 0
                            r9 = r8
                            r10 = r8
                            java.lang.Object r4 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
                            com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService r4 = (com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService) r4
                            r3 = 0
                            r2 = 1
                            if (r4 == 0) goto La6
                            java.lang.String r1 = r6.getConversationId()
                            java.lang.String r0 = r5.getUid()
                            if (r0 != 0) goto L92
                            java.lang.String r0 = ""
                        L92:
                            boolean r0 = r4.LIZLLL(r1, r0, r3)
                            if (r0 != r2) goto La6
                            java.lang.String r0 = r6.getConversationId()
                            java.lang.String r1 = X.C892130YzD.LIZ(r5, r0)
                            X.0ZOS r0 = new X.0ZOS
                            r0.<init>(r2, r1)
                            goto L2b
                        La6:
                            X.0ZOS r0 = X.C0ZOS.LIZLLL
                            goto L2b
                        La9:
                            r0 = r3
                            goto L23
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0ZOR.LIZ(java.util.List, X.0Y9l, int):X.0I6a");
                    }
                };
            }
            return new AbstractC899510ZQn<UsernameReusedSkeletonUIContent, C0ZOS>() { // from class: X.0ZOQ
                {
                    super(new C899530ZQp(C13LE.LIZ(UsernameReusedSkeletonUIContent.class), R.layout.cp3));
                }

                @Override // X.AbstractC899510ZQn
                public final C461020I6a<C0ZOS> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                    boolean z2;
                    String str;
                    C0ZOS c0zos;
                    C869590Y9l c869590Y9l2 = (C869590Y9l) C13LP.LJJJLZIJ(i + 1, list);
                    if (!this.LIZJ.so()) {
                        c0zos = C0ZOS.LIZJ;
                    } else {
                        IMAIServiceAPI.LIZ.getClass();
                        InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
                        boolean z3 = false;
                        if (c869590Y9l2 != null && interfaceC1693306k7LIZ.LJJIIJ(c869590Y9l) != interfaceC1693306k7LIZ.LJJIIJ(c869590Y9l2)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS72S0301000_14(this.LIZJ, (SkeletonLayoutAssembler) list, (List<? extends C869590Y9l>) c869590Y9l, (C869590Y9l) i, 1));
                        C0Z2Q c0z2qLJII = interfaceC1693306k7LIZ.LJII(C0ZQ1.MESSAGE_CARD_TOP_LABEL, c869590Y9l);
                        SessionInfo sessionInfo6 = null;
                        if (c0z2qLJII.LIZ) {
                            str = (String) c0z2qLJII.LJ.getValue();
                        } else {
                            str = null;
                        }
                        C457780HxI c457780HxIFo4 = this.LIZJ.fo();
                        if (c457780HxIFo4 != null) {
                            sessionInfo6 = c457780HxIFo4.LL;
                        }
                        boolean zLIZ = C0ZOT.LIZ(c869590Y9l, c869590Y9l2);
                        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId());
                        if (c0y8tLIZ != null && AnonymousClass0629.LIZ().LIZ().LJJ(c0y8tLIZ)) {
                            z3 = true;
                        }
                        if (sessionInfo6 == null) {
                            c0zos = C0ZOS.LIZJ;
                        } else if (C0ZDX.LJJJJIZL(c869590Y9l) && !z3) {
                            c0zos = C0ZOS.LIZJ;
                        } else if (!zLIZ && !z2) {
                            c0zos = C0ZOS.LIZJ;
                        } else if (((Boolean) c01gwLIZIZ.getValue()).booleanValue()) {
                            if (AnonymousClass0629.LIZ().LIZ().LJJIIJ(c869590Y9l)) {
                                c0zos = new C0ZOS(true, str);
                            } else {
                                c0zos = C0ZOS.LIZLLL;
                            }
                        } else if (str != null) {
                            c0zos = new C0ZOS(true, str);
                        } else {
                            c0zos = C0ZOS.LIZLLL;
                        }
                    }
                    return new C461020I6a<>(c0zos, c0zos.LIZ);
                }
            };
        }
        if (Intrinsics.LJFF(c14ir, C0ZOF.LIZ)) {
            C457780HxI c457780HxIFo4 = fo();
            if (c457780HxIFo4 == null || (sessionInfo3 = c457780HxIFo4.LL) == null || !sessionInfo3.isGroupChat()) {
                z = false;
            }
            IMAIServiceAPI.LIZ.getClass();
            InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
            C457780HxI c457780HxIFo5 = fo();
            if (c457780HxIFo5 == null || (sessionInfo2 = c457780HxIFo5.LL) == null || (conversationId = sessionInfo2.getConversationId()) == null) {
                conversationId = "";
            }
            boolean zLJIL = interfaceC1693306k7LIZ.LJIL(conversationId);
            if (z) {
                return new AbstractC899510ZQn<AvatarReusedSkeletonUIContent, AvatarState>() { // from class: X.0ZOx
                    {
                        new C899520ZQo(C13LE.LIZ(AvatarReusedSkeletonUIContent.class), C1163440gNi.LIZJ);
                        C1EES c1ees = C1EES.LIZ;
                    }

                    @Override // X.AbstractC899510ZQn
                    public final C461020I6a<AvatarState> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                        boolean zAvatarVisibility = AvatarStateKt.avatarVisibility(c869590Y9l, (C869590Y9l) C13LP.LJJJLZIJ(i - 1, list), false);
                        return new C461020I6a<>(new AvatarState(zAvatarVisibility, null), zAvatarVisibility);
                    }
                };
            }
            if (zLJIL) {
                return new AbstractC899510ZQn<BotAvatarReusedSkeletonUIContent, AvatarState>() { // from class: X.0ZOv
                    {
                        new C899520ZQo(C13LE.LIZ(BotAvatarReusedSkeletonUIContent.class), C1163440gNi.LIZJ);
                    }

                    @Override // X.AbstractC899510ZQn
                    public final C461020I6a<AvatarState> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                        return new C461020I6a<>(new AvatarState(false, null), true);
                    }
                };
            }
            return new AbstractC899510ZQn<AvatarReusedSkeletonUIContent, AvatarState>() { // from class: X.0ZOw
                {
                    new C899520ZQo(C13LE.LIZ(AvatarReusedSkeletonUIContent.class), C1163440gNi.LIZJ);
                    C1EES c1ees = C1EES.LIZ;
                }

                @Override // X.AbstractC899510ZQn
                public final C461020I6a<AvatarState> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                    C1622006Ws c1622006Ws;
                    boolean z2 = true;
                    C869590Y9l c869590Y9l2 = (C869590Y9l) C13LP.LJJJLZIJ(i - 1, list);
                    IMAIServiceAPI.LIZ.getClass();
                    InterfaceC1693306k7 interfaceC1693306k7LIZ2 = AnonymousClass0629.LIZ().LIZ();
                    if (c869590Y9l2 == null || interfaceC1693306k7LIZ2.LJJIIJ(c869590Y9l) == interfaceC1693306k7LIZ2.LJJIIJ(c869590Y9l2)) {
                        z2 = false;
                    }
                    boolean zAvatarVisibility = AvatarStateKt.avatarVisibility(c869590Y9l, c869590Y9l2, z2);
                    Drawable drawable = interfaceC1693306k7LIZ2.LJII(C0ZQ1.CHAT_ROOM_AVATAR_LABEL, c869590Y9l).LIZIZ;
                    if (drawable != null) {
                        c1622006Ws = new C1622006Ws(drawable);
                    } else {
                        c1622006Ws = null;
                    }
                    return new C461020I6a<>(new AvatarState(zAvatarVisibility, c1622006Ws), zAvatarVisibility);
                }
            };
        }
        if (!Intrinsics.LJFF(c14ir, C462500IBs.LIZ) || (c457780HxIFo = fo()) == null || (sessionInfo = c457780HxIFo.LL) == null || !sessionInfo.isReportPage()) {
            return null;
        }
        return new AbstractC899510ZQn<ReportPageUIContentAssem, Boolean>() { // from class: X.0ZHS
            {
                super(new C899530ZQp(C13LE.LIZ(ReportPageUIContentAssem.class), R.layout.cpg));
            }

            @Override // X.AbstractC899510ZQn
            public final C461020I6a<Boolean> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                IReportUtils.LIZ.getClass();
                IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
                if (iReportUtilsLIZ != null && iReportUtilsLIZ.LIZIZ(c869590Y9l) && c869590Y9l.isSuccessStatus()) {
                    AssemVMLazy assemVMLazy2 = this.LIZJ.LLILZIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = SkeletonLayoutAssembler.LLJLLL;
                    return new C461020I6a<>(Boolean.valueOf(((ChatReportPageViewModel) assemVMLazy2.getValue()).xQ2().contains(c869590Y9l)), true);
                }
                return new C461020I6a<>(Boolean.FALSE, false);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.tracker.MessageListTracker
    public final void nc0(InterfaceC788970UxD interfaceC788970UxD) {
        SessionInfo sessionInfo;
        if (!(interfaceC788970UxD instanceof C788960UxC) && !(interfaceC788970UxD instanceof C788950UxB)) {
            if (interfaceC788970UxD instanceof C788940UxA) {
                IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAdapterAnalytics.class);
                if (iIMMessageAdapterAnalytics != null) {
                    iIMMessageAdapterAnalytics.LJIILJJIL(((C788940UxA) interfaceC788970UxD).LIZ);
                    return;
                }
                return;
            }
            if (interfaceC788970UxD instanceof C788980UxE) {
                C788980UxE c788980UxE = (C788980UxE) interfaceC788970UxD;
                if (!c788980UxE.LIZJ) {
                    return;
                }
                IMReadMessageAnalytics iMReadMessageAnalytics = IMReadMessageAnalytics.LIZIZ;
                C869590Y9l c869590Y9l = c788980UxE.LIZ;
                C457780HxI c457780HxIFo = fo();
                if (c457780HxIFo != null) {
                    sessionInfo = c457780HxIFo.LL;
                } else {
                    sessionInfo = null;
                }
                iMReadMessageAnalytics.LIZ(c869590Y9l, sessionInfo, new C891480YyA(), C0I0B.LJFF.LIZIZ(), C817503Hh.LL, C0YNY.LIZ(InterfaceC874680YTa.LIZ));
                C869590Y9l c869590Y9l2 = c788980UxE.LIZ;
                C891480YyA c891480YyA = new C891480YyA();
                InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                C817503Hh c817503Hh = C817503Hh.LL;
                if (!((Boolean) C271540Aka.LIZ.getValue()).booleanValue() || c869590Y9l2 == null || C0ZDX.LJJJJIZL(c869590Y9l2)) {
                    return;
                }
                if (c869590Y9l2.getMsgType() != 1802 && c869590Y9l2.getMsgType() != 1803 && c869590Y9l2.getMsgType() != 1813) {
                    return;
                }
                C23250099c.LIZLLL(c817503Hh, null, null, new C892220YzM(c869590Y9l2, c891480YyA, interfaceC1493505szLIZIZ, null), 3);
                return;
            }
            throw new C1954807lC();
        }
    }

    public final C869590Y9l oo(InterfaceC461380I7k interfaceC461380I7k) {
        Object ability;
        List<C869590Y9l> listVi2;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this), ChatRoomScope.class);
        C869590Y9l c869590Y9l = null;
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(MessagePowerListAbility.class);
        } else {
            ability = null;
        }
        if (!(ability instanceof MessagePowerListAbility)) {
            ability = null;
        }
        MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ability;
        if (messagePowerListAbility != null && (listVi2 = messagePowerListAbility.vi2()) != null) {
            Iterator<C869590Y9l> it2 = listVi2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C869590Y9l next = it2.next();
                if (Intrinsics.LJFF(next.getUuid(), interfaceC461380I7k.LLILII().LIZ.LIZ.getUuid())) {
                    c869590Y9l = next;
                    break;
                }
            }
            C869590Y9l c869590Y9l2 = c869590Y9l;
            if (c869590Y9l2 != null) {
                return c869590Y9l2;
            }
        }
        return interfaceC461380I7k.LLILII().LIZ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge
    public final C0ZSN mN2(final List<? extends C869590Y9l> list, final C0ZOW c0zow) {
        return new C0ZSN(c0zow, this, list) { // from class: X.0ZOU
            public final Map<C14IR, AbstractC899510ZQn<?, ?>> LIZ;
            public final /* synthetic */ SkeletonLayoutAssembler LIZIZ;

            {
                Map<C14IR, AbstractC899510ZQn<?, ?>> mapLJ;
                this.LIZIZ = this;
                if (Intrinsics.LJFF(c0zow, C0ZOX.LIZ)) {
                    Set<C14IR> set = C0ZO9.LIZ;
                    List<C14IR> list2 = C0ZO9.LIZJ;
                    ArrayList arrayList = new ArrayList();
                    for (C14IR c14ir : list2) {
                        AbstractC899510ZQn<?, ?> abstractC899510ZQnFQ2 = this.fQ2(c14ir);
                        if (abstractC899510ZQnFQ2 != null) {
                            arrayList.add(new Pair(c14ir, abstractC899510ZQnFQ2));
                        }
                    }
                    mapLJ = C2097608Jq.LJIILLIIL(arrayList);
                } else if (!(c0zow instanceof C223300tb)) {
                    if (c0zow instanceof C0ZOY) {
                        List listSingletonList = Collections.singletonList(((C0ZOY) c0zow).LIZ);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : listSingletonList) {
                            AbstractC899510ZQn<?, ?> abstractC899510ZQnFQ22 = this.fQ2((C14IR) obj);
                            if (abstractC899510ZQnFQ22 != null) {
                                arrayList2.add(new Pair(obj, abstractC899510ZQnFQ22));
                            }
                        }
                        mapLJ = C2097608Jq.LJIILLIIL(arrayList2);
                    } else if (c0zow instanceof C899500ZQm) {
                        mapLJ = C2097608Jq.LJ();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c0zow.getClass();
                    new ArrayList();
                    throw null;
                }
                this.LIZ = mapLJ;
                Iterator<T> it2 = mapLJ.values().iterator();
                while (it2.hasNext()) {
                    ((AbstractC899510ZQn) it2.next()).LIZIZ(list);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[LOOP:0: B:21:0x0084->B:23:0x008a, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[PHI: r16
              0x00aa: PHI (r16v1 boolean) = (r16v0 boolean), (r16v5 boolean) binds: [B:26:0x00a7, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[PHI: r16 r17
              0x00af: PHI (r16v2 boolean) = (r16v1 boolean), (r16v4 boolean) binds: [B:29:0x00ac, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]
              0x00af: PHI (r17v1 boolean) = (r17v0 boolean), (r17v3 boolean) binds: [B:29:0x00ac, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C0ZSN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0IB0 LIZ(java.util.List<? extends X.C869590Y9l> r21, X.C869590Y9l r22, int r23) {
                /*
                    r20 = this;
                    X.06XP r2 = new X.06XP
                    r4 = r22
                    r2.<init>(r4)
                    r7 = r20
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler r0 = r7.LIZIZ
                    X.0ZOL r0 = r0.LLJJJJ
                    r0.getClass()
                    r3 = r23
                    int r0 = r3 + 1
                    r5 = r21
                    X.C13LP.LJJJLZIJ(r0, r5)
                    int r0 = r3 + (-1)
                    java.lang.Object r10 = X.C13LP.LJJJLZIJ(r0, r5)
                    X.0Y9l r10 = (X.C869590Y9l) r10
                    X.0ZqV r6 = X.EnumC912210ZqV.NO_PADDING
                    boolean r13 = X.C0ZDX.LJJIJIL(r4)
                    boolean r14 = X.C0ZOT.LIZIZ(r4, r10)
                    java.util.Map r0 = r4.getPropertyItemListMap()
                    r1 = 1
                    if (r0 == 0) goto Lb2
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto Lb2
                    r0 = 0
                L39:
                    r15 = r0 ^ 1
                    if (r10 == 0) goto La5
                    boolean r0 = X.C0ZDX.LJJIJIL(r10)
                    if (r0 != r1) goto La5
                    r16 = 1
                L45:
                    long r11 = r4.getSender()
                    long r8 = r10.getSender()
                    int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                    if (r0 != 0) goto Laa
                    r17 = 1
                L53:
                    boolean r0 = X.C0ZDX.LJJJ(r10)
                    if (r0 != r1) goto Laf
                    r18 = 1
                L5b:
                    if (r3 != 0) goto La2
                    r19 = 1
                L5f:
                    X.0ZqV r9 = X.C912220ZqW.LIZ(r13, r14, r15, r16, r17, r18, r19)
                    X.0ZOV r8 = new X.0ZOV
                    X.0ZOa r0 = new X.0ZOa
                    r0.<init>(r1, r1, r1, r1)
                    r8.<init>(r6, r9, r0)
                    java.util.Map<X.14IR, X.0ZQn<?, ?>> r1 = r7.LIZ
                    java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                    int r0 = r1.size()
                    int r0 = X.C2097908Jt.LIZIZ(r0)
                    r7.<init>(r0)
                    java.util.Set r0 = r1.entrySet()
                    java.util.Iterator r6 = r0.iterator()
                L84:
                    boolean r0 = r6.hasNext()
                    if (r0 == 0) goto Lb4
                    java.lang.Object r0 = r6.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r1 = r0.getKey()
                    java.lang.Object r0 = r0.getValue()
                    X.0ZQn r0 = (X.AbstractC899510ZQn) r0
                    X.0I6a r0 = r0.LIZ(r5, r4, r3)
                    r7.put(r1, r0)
                    goto L84
                La2:
                    r19 = 0
                    goto L5f
                La5:
                    r16 = 0
                    if (r10 == 0) goto Laa
                    goto L45
                Laa:
                    r17 = 0
                    if (r10 == 0) goto Laf
                    goto L53
                Laf:
                    r18 = 0
                    goto L5b
                Lb2:
                    r0 = 1
                    goto L39
                Lb4:
                    X.0IB0 r0 = new X.0IB0
                    r0.<init>(r2, r8, r7)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0ZOU.LIZ(java.util.List, X.0Y9l, int):X.0IB0");
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mi0(X.InterfaceC461380I7k r13, X.C0ZPD r14) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler.mi0(X.0I7k, X.0ZPD):boolean");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge
    public final void xs0(C869590Y9l c869590Y9l, InterfaceC879330YeZ interfaceC879330YeZ) {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        IMPendingReactionViewModel iMPendingReactionViewModel = (IMPendingReactionViewModel) assemVMLazy.getValue();
        iMPendingReactionViewModel.LL.put(c869590Y9l.getUuid(), interfaceC879330YeZ);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge
    public final void Ep0(C21652419oY c21652419oY, InterfaceC461380I7k interfaceC461380I7k, C0ZPD c0zpd) {
        Map<String, String> extraMobParams;
        SessionInfo sessionInfo;
        int i = C0ZPC.LIZ[c0zpd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ((MessageReplyVM) this.LLJI.getValue()).qH1(new C454980Hsm(interfaceC461380I7k.LLILII().LIZ.LIZ, C0I3C.SWIPE_TO_REPLY));
                        IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAdapterAnalytics.class);
                        if (iIMMessageAdapterAnalytics != null) {
                            iIMMessageAdapterAnalytics.LIZIZ(interfaceC461380I7k.LLILII().LIZ.LIZ, C0I0B.LJFF.LIZIZ());
                        }
                        ((Keva) C0ZOD.LIZ.getValue()).storeBoolean("key_has_swipe_for_reply", true);
                        return;
                    }
                    throw new C1954807lC();
                }
                return;
            }
            Context context = c21652419oY.getContext();
            C869590Y9l c869590Y9l = interfaceC461380I7k.LLILII().LIZ.LIZ;
            C1628906Zj.LIZ(context);
            AssemVMLazy assemVMLazy = this.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
            IMPendingReactionViewModel iMPendingReactionViewModel = (IMPendingReactionViewModel) assemVMLazy.getValue();
            String uuid = c869590Y9l.getUuid();
            C459160HzW c459160HzW = C892380Yzc.LIZ;
            iMPendingReactionViewModel.LL.put(uuid, c459160HzW);
            String strLIZIZ = C461720I8s.LIZIZ();
            strLIZIZ.toString();
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId());
            if (c0y8tLIZ != null) {
                C457780HxI c457780HxIFo = fo();
                if (c457780HxIFo != null && (sessionInfo = c457780HxIFo.LL) != null) {
                    extraMobParams = sessionInfo.getExtraMobParams();
                } else {
                    extraMobParams = null;
                }
                C892180YzI.LIZ("double_click", c869590Y9l, strLIZIZ, c0y8tLIZ, c459160HzW, null, extraMobParams);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
