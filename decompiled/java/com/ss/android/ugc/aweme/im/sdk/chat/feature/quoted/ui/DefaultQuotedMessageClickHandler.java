package com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui;

import X.C019F;
import X.C01D1;
import X.C06NL;
import X.C06NM;
import X.C09R3;
import X.C0I5R;
import X.C0PEM;
import X.C0QSJ;
import X.C0YNY;
import X.C0Z92;
import X.C0ZFW;
import X.C0ZQ7;
import X.C0ZU4;
import X.C0ZVS;
import X.C1383370m6R;
import X.C138600fw;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C15616069m;
import X.C15620069q;
import X.C15622069s;
import X.C15623069t;
import X.C1622206Wu;
import X.C1720706oX;
import X.C19719912Dl;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2274381E0m;
import X.C23250099c;
import X.C327340CsO;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C454880Hsc;
import X.C454890Hsd;
import X.C461160I6o;
import X.C5182020e;
import X.C687700QyG;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C913060Zrs;
import X.C987103tV;
import X.EnumC899970ZSh;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC874680YTa;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.b2c.card.DefaultShareProductClickHandler;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.message.content.ShareMusicContent;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.DefaultGroupInviteCardClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.comment.DefaultCommentClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.live.DefaultShareLiveEventClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.repost.DefaultRepostClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.user.DefaultShareUserClickHandler;
import com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultQuotedMessageClickHandler implements MessageListQuotedMessageClickAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final SessionInfo LL;
    public final Fragment LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public final long LLIZ;
    public volatile DefaultGifClickHandler LLIZLLLIL;
    public volatile DefaultCommentClickHandler LLJ;
    public volatile DefaultShareUserClickHandler LLJI;
    public volatile C0ZQ7 LLJIJIL;
    public volatile DefaultShareProductClickHandler LLJILJIL;
    public volatile DefaultRepostClickHandler LLJILJILJ;
    public volatile DefaultShareLiveEventClickHandler LLJILLL;
    public volatile DefaultGroupInviteCardClickHandler LLJJ;
    public volatile DefaultStickerClickHandler LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "scrollToMessageViewModel", "getScrollToMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/messagelist/skeleton/ability/ScrollToMessageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "greetingCardVM", "getGreetingCardVM()Lcom/ss/android/ugc/aweme/viewmodel/GreetingCardViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "gifClick", "getGifClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListGifClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "commentClick", "getCommentClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListCommentClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "shareUserClick", "getShareUserClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListShareUserClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "multiShareClick", "getMultiShareClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListMultiShareShareMusicClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "shareProductClick", "getShareProductClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListShareProductClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "repostClick", "getRepostClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListRepostClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "shareLiveEventClick", "getShareLiveEventClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListShareLiveEventClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "groupInviteClick", "getGroupInviteClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListGroupInviteCardClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(DefaultQuotedMessageClickHandler.class, "stickerClick", "getStickerClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListStickerClickAbility;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11};
    }

    public final MessagePowerListAbility LIZ() {
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(this.LLILLJJLI, null), ChatRoomScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(MessagePowerListAbility.class) : null;
        return (MessagePowerListAbility) (ability instanceof MessagePowerListAbility ? ability : null);
    }

    public final MessageListStickerClickAbility LIZIZ() {
        DefaultStickerClickHandler defaultStickerClickHandler = this.LLJJI;
        if (defaultStickerClickHandler == null) {
            synchronized (this) {
                defaultStickerClickHandler = this.LLJJI;
                if (defaultStickerClickHandler == null) {
                    DefaultStickerClickHandler defaultStickerClickHandler2 = new DefaultStickerClickHandler(this.LLILLJJLI, this.LL);
                    this.LLJJI = defaultStickerClickHandler2;
                    return defaultStickerClickHandler2;
                }
            }
        }
        return defaultStickerClickHandler;
    }

    public final synchronized boolean LJFF(long j) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (j != this.LLILZIL || jElapsedRealtime - this.LLILZLL >= this.LLIZ) {
            z = false;
            this.LLILZIL = j;
            this.LLILZLL = jElapsedRealtime;
        } else {
            z = true;
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void Qz0(ShareUserContent shareUserContent) {
        DefaultShareUserClickHandler defaultShareUserClickHandler = this.LLJI;
        if (defaultShareUserClickHandler == null) {
            synchronized (this) {
                defaultShareUserClickHandler = this.LLJI;
                if (defaultShareUserClickHandler == null) {
                    defaultShareUserClickHandler = new DefaultShareUserClickHandler();
                    this.LLJI = defaultShareUserClickHandler;
                }
            }
        }
        defaultShareUserClickHandler.kw1(shareUserContent);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void lU1(long j) {
        C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(j);
        if (c869590Y9lLJJJ != null && !c869590Y9lLJJJ.isDeleted()) {
            AssemVMLazy assemVMLazy = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
            ((GreetingCardViewModel) assemVMLazy.getValue()).zQ2(c869590Y9lLJJJ, false);
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx.LJIIJ(C1383370m6R.LJIIJ(2131831558));
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void q01(ShareMusicContent shareMusicContent) {
        C0ZQ7 c0zq7 = this.LLJIJIL;
        if (c0zq7 == null) {
            synchronized (this) {
                c0zq7 = this.LLJIJIL;
                if (c0zq7 == null) {
                    c0zq7 = new C0ZQ7(this.LL);
                    this.LLJIJIL = c0zq7;
                }
            }
        }
        c0zq7.o3(shareMusicContent);
    }

    public DefaultQuotedMessageClickHandler(Fragment fragment, SessionInfo sessionInfo) {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        this.LL = sessionInfo;
        this.LLILLJJLI = fragment;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ScrollToMessageViewModel.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 284);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(421);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 1410), aFwS248S0000000_14, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
            z = false;
            z2 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new AwS558S0100000_14(fragment, 1411), aFwS248S0000000_14, null, null, null);
            z = false;
            z2 = true;
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 1412), aFwS248S0000000_14, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GreetingCardViewModel.class);
        C5182020e c5182020e2 = new C5182020e((C13IQ) c19719912DlLIZ2, 285);
        AFwS248S0000000_14 aFwS248S0000000_142 = AFwS248S0000000_14.get$arr$(422);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), c5182020e2, new C452070Ho5(), new C1622206Wu(fragment, z2), new C338490DOt(fragment, z2), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 1413), aFwS248S0000000_142, new C451460Hn6(fragment, z2), new C451620HnM(fragment, z2), new C987103tV(fragment, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), c5182020e2, new AwS558S0100000_14(fragment, 1414), aFwS248S0000000_142, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), c5182020e2, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 1409), aFwS248S0000000_142, new C451460Hn6(fragment, z), new C451620HnM(fragment, z), new C987103tV(fragment, z));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILZ = assemVMLazy2;
        this.LLILZIL = -1L;
        this.LLIZ = ViewConfiguration.getJumpTapTimeout();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void G10(C869590Y9l c869590Y9l, GroupInviteCardContent groupInviteCardContent) {
        DefaultGroupInviteCardClickHandler defaultGroupInviteCardClickHandler = this.LLJJ;
        if (defaultGroupInviteCardClickHandler == null) {
            synchronized (this) {
                defaultGroupInviteCardClickHandler = this.LLJJ;
                if (defaultGroupInviteCardClickHandler == null) {
                    defaultGroupInviteCardClickHandler = new DefaultGroupInviteCardClickHandler(this.LL);
                    this.LLJJ = defaultGroupInviteCardClickHandler;
                }
            }
        }
        defaultGroupInviteCardClickHandler.lB1(c869590Y9l, groupInviteCardContent);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mV1(long r14, java.lang.Long r16) {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r13.LL
            java.lang.String r6 = r0.getConversationId()
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L18
            r0 = 0
            r7 = 0
            if (r0 == 0) goto L1c
        L18:
            java.lang.String r7 = r5.toString()
        L1c:
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r13.LL
            int r0 = r0.getChatType()
            java.lang.String r9 = X.C1677606ha.LIZ(r0)
            r10 = 0
            r11 = 0
            r8 = r16
            r12 = r10
            X.C1599006Nw.LIZIZ(r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler.mV1(long, java.lang.Long):void");
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void ED1(View view, long j, Long l) {
        C19EG c19egLIZIZ;
        LIZLLL(j, l, null, false);
        MessageListStickerClickAbility messageListStickerClickAbilityLIZIZ = LIZIZ();
        Context context = view.getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            messageListStickerClickAbilityLIZIZ.xj2(new C454880Hsc(c19egLIZIZ, view, j));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void OI2(View view, C869590Y9l c869590Y9l, CommentContent commentContent) {
        DefaultCommentClickHandler defaultCommentClickHandler = this.LLJ;
        if (defaultCommentClickHandler == null) {
            synchronized (this) {
                defaultCommentClickHandler = this.LLJ;
                if (defaultCommentClickHandler == null) {
                    defaultCommentClickHandler = new DefaultCommentClickHandler(this.LL);
                    this.LLJ = defaultCommentClickHandler;
                }
            }
        }
        Context context = view.getContext();
        String awemeId = commentContent.getAwemeId();
        if (awemeId == null) {
            return;
        }
        defaultCommentClickHandler.Sa1(context, c869590Y9l, awemeId, commentContent.getCommentId());
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void Zb1(Context context, String str, FeatureAttachmentContent featureAttachmentContent) {
        IMUser singleChatFromUser;
        String uid;
        String secUid;
        List listLJJLIIIJILLIZJL;
        if (this.LL.isGroupChat() && !C0ZFW.LIZ.LJIIJJI(this.LL.getConversationId())) {
            return;
        }
        List<String> listSingletonList = null;
        str = null;
        String str2 = null;
        if (!this.LL.isGroupChat()) {
            singleChatFromUser = this.LL.getSingleChatFromUser();
            if (singleChatFromUser == null) {
                return;
            }
        } else {
            singleChatFromUser = null;
        }
        if (featureAttachmentContent != null && featureAttachmentContent.type == 12) {
            VibeFeedRuntimeFeature vibeFeedRuntimeFeatureLIZ = VibeFeedRuntimeFeature.LIZ.LIZ();
            if (vibeFeedRuntimeFeatureLIZ != null) {
                String conversationId = this.LL.getConversationId();
                String strValueOf = String.valueOf(featureAttachmentContent.originalCreateTime);
                String str3 = featureAttachmentContent.id;
                if (str3 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6)) != null) {
                    str2 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
                }
                vibeFeedRuntimeFeatureLIZ.LIZJ(context, str, singleChatFromUser, conversationId, strValueOf, str2);
                return;
            }
            return;
        }
        VibeEntranceFeature vibeEntranceFeatureLIZ = VibeEntranceFeature.LIZ.LIZ();
        if (vibeEntranceFeatureLIZ == null) {
            return;
        }
        String conversationId2 = this.LL.getConversationId();
        if (singleChatFromUser == null || (uid = singleChatFromUser.getUid()) == null) {
            uid = "";
        }
        if (singleChatFromUser != null) {
            secUid = singleChatFromUser.getSecUid();
        } else {
            secUid = null;
        }
        if (str != null) {
            listSingletonList = Collections.singletonList(str);
        }
        vibeEntranceFeatureLIZ.LJI(context, conversationId2, uid, secUid, "shared_feed_message", "chat", listSingletonList);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void kn0(View view, long j, Long l) {
        LIZLLL(j, l, null, false);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI), C0PEM.LIZJ, null, new C15620069q(this, j, view, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void oQ2(View view, C869590Y9l c869590Y9l, ShareLiveEventContent shareLiveEventContent) {
        DefaultShareLiveEventClickHandler defaultShareLiveEventClickHandler = this.LLJILLL;
        if (defaultShareLiveEventClickHandler == null) {
            synchronized (this) {
                defaultShareLiveEventClickHandler = this.LLJILLL;
                if (defaultShareLiveEventClickHandler == null) {
                    defaultShareLiveEventClickHandler = new DefaultShareLiveEventClickHandler();
                    this.LLJILLL = defaultShareLiveEventClickHandler;
                }
            }
        }
        defaultShareLiveEventClickHandler.CC2(view, c869590Y9l, shareLiveEventContent);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void qQ2(View view, C869590Y9l c869590Y9l, ShareProductContent shareProductContent) {
        DefaultShareProductClickHandler defaultShareProductClickHandler = this.LLJILJIL;
        if (defaultShareProductClickHandler == null) {
            synchronized (this) {
                defaultShareProductClickHandler = this.LLJILJIL;
                if (defaultShareProductClickHandler == null) {
                    defaultShareProductClickHandler = new DefaultShareProductClickHandler();
                    this.LLJILJIL = defaultShareProductClickHandler;
                }
            }
        }
        defaultShareProductClickHandler.eX0(view, c869590Y9l, shareProductContent);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void EL2(View view, long j, Long l, GifContent gifContent) {
        LIZLLL(j, l, null, false);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI), null, null, new C15616069m(this, gifContent, view, j, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void KZ0(long j, Long l, long j2, long j3) {
        LIZLLL(j, l, null, false);
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        ScrollToMessageViewModel scrollToMessageViewModel = (ScrollToMessageViewModel) assemVMLazy.getValue();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(scrollToMessageViewModel), C0PEM.LIZJ, null, new C461160I6o(j3, scrollToMessageViewModel, j2, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(long r14, java.lang.Long r16, java.lang.String r17, boolean r18) {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r13.LL
            java.lang.String r6 = r0.getConversationId()
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L18
            r0 = 0
            r7 = 0
            if (r0 == 0) goto L1c
        L18:
            java.lang.String r7 = r5.toString()
        L1c:
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r13.LL
            int r0 = r0.getChatType()
            java.lang.String r9 = X.C1677606ha.LIZ(r0)
            r10 = 1
            r12 = r18
            r11 = r17
            r8 = r16
            X.C1599006Nw.LIZIZ(r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler.LIZLLL(long, java.lang.Long, java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void RK(View view, long j, Long l, String str) {
        if (!C2274381E0m.LIZIZ.LIZJ(true, true)) {
            return;
        }
        if ((this.LL.isGroupChat() && !C0ZFW.LIZ.LJIIJJI(this.LL.getConversationId())) || LJFF(j)) {
            return;
        }
        LIZLLL(j, l, null, false);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C15622069s(this, view, str, j, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void S52(Context context, C869590Y9l c869590Y9l, String str, String str2) {
        DefaultRepostClickHandler defaultRepostClickHandler = this.LLJILJILJ;
        if (defaultRepostClickHandler == null) {
            synchronized (this) {
                defaultRepostClickHandler = this.LLJILJILJ;
                if (defaultRepostClickHandler == null) {
                    defaultRepostClickHandler = new DefaultRepostClickHandler(this.LL);
                    this.LLJILJILJ = defaultRepostClickHandler;
                }
            }
        }
        defaultRepostClickHandler.eI2(context, c869590Y9l, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void TQ0(View view, long j, Long l, String str) {
        if (!C2274381E0m.LIZIZ.LIZJ(true, true)) {
            return;
        }
        if ((this.LL.isGroupChat() && !C0ZFW.LIZ.LJIIJJI(this.LL.getConversationId())) || LJFF(j)) {
            return;
        }
        LIZLLL(j, l, null, false);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C15623069t(this, view, str, j, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void UZ0(View view, long j, Long l, String str) {
        LIZLLL(j, l, null, false);
        if (C138600fw.LIZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI), C0PEM.LIZJ, null, new C15620069q(this, j, view, null), 2);
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ == null) {
            return;
        }
        ((DefaultStickerClickHandler) LIZIZ()).LIZLLL(new C454890Hsd(c19egLIZIZ, str, this.LL.getConversationId()));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void W32(View view, long j, Long l, ShareLiveContent shareLiveContent) {
        long j2;
        LIZLLL(j, l, null, false);
        Bundle bundle = new Bundle();
        User user = new User();
        user.setUid(shareLiveContent.getRoomOwnerId());
        user.setSecUid(shareLiveContent.getRoomSecOwnerId());
        try {
            String roomId = shareLiveContent.getRoomId();
            if (roomId != null) {
                j2 = CastLongProtector.parseLong(roomId);
            } else {
                j2 = 0;
            }
            user.setBroadcasterRoomId(j2);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        IMLiveService.LIZ.getClass();
        IMLiveService iMLiveServiceLIZ = C0ZVS.LIZ();
        if (iMLiveServiceLIZ != null) {
            iMLiveServiceLIZ.LIZJ(view.getContext(), user, null, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void lC1(View view, long j, Long l, C0I5R c0i5r) {
        if ((!this.LL.isGroupChat() || C0ZFW.LIZ.LJIIJJI(this.LL.getConversationId())) && !Intrinsics.LJFF(c0i5r.LJFF, "share_highlight_story") && !Intrinsics.LJFF(c0i5r.LJFF, "share_highlight_story_collection")) {
            LIZLLL(j, l, c0i5r.LJFF, false);
            String str = c0i5r.LIZ;
            String str2 = c0i5r.LIZIZ;
            Boolean boolValueOf = c0i5r.LIZLLL;
            if (str == null) {
                return;
            }
            Aweme awemeLIZ = C327340CsO.LIZ(str);
            if (awemeLIZ != null) {
                boolValueOf = Boolean.valueOf(awemeLIZ.getIsTikTokStory());
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                IAwemeOpenHelper.LIZ.getClass();
                IAwemeOpenHelper iAwemeOpenHelperLIZ = C1720706oX.LIZ();
                if (iAwemeOpenHelperLIZ != null) {
                    iAwemeOpenHelperLIZ.LIZ(str, null, str2, this.LL.getConversationId(), "click_quoted_message", this.LL, C0ZU4.CHAT);
                }
            } else {
                C869590Y9l c869590Y9l = new C869590Y9l();
                c869590Y9l.setMsgId(j);
                c869590Y9l.setConversationId(this.LL.getConversationId());
                C1720706oX.LIZIZ(IAwemeOpenHelper.LIZ, view.getContext(), view, C0Z92.NORMAL, awemeLIZ, EnumC899970ZSh.REPLY_QUOTED_VIDEO, str, c869590Y9l, this.LL, null, false, "click_quoted_message", null, null, null, 14336);
            }
            C913060Zrs.LIZ(str, 0, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void v10(View view, long j, Long l, C06NM c06nm) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        LIZLLL(j, l, null, false);
        if (IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().isEnabled() && (c19egLIZIZ = C1388190mED.LIZIZ(view.getContext())) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI), null, null, new C06NL(this, c06nm, view, supportFragmentManager, j, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9 A[PHI: r3
      0x00a9: PHI (r3v1 java.lang.Boolean) = 
      (r3v0 java.lang.Boolean)
      (r3v0 java.lang.Boolean)
      (r3v4 java.lang.Boolean)
      (r3v4 java.lang.Boolean)
      (r3v4 java.lang.Boolean)
      (r3v4 java.lang.Boolean)
      (r3v4 java.lang.Boolean)
     binds: [B:8:0x0045, B:10:0x004b, B:17:0x008a, B:19:0x0090, B:22:0x009a, B:24:0x00a0, B:25:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wz0(long r22, java.lang.Long r24, android.content.Context r25, int r26, X.C0I5R r27) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler.wz0(long, java.lang.Long, android.content.Context, int, X.0I5R):void");
    }
}
