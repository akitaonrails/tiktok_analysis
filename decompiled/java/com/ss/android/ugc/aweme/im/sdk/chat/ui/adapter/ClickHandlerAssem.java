package com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter;

import X.AbstractC738140SxQ;
import X.C06NM;
import X.C0I5R;
import X.C0ZQ7;
import X.C0ZUH;
import X.C0ZUI;
import X.C0ZUK;
import X.C0ZUR;
import X.C0ZUS;
import X.C0ZUT;
import X.C0ZUV;
import X.C0ZUW;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19EG;
import X.C2244401Csw;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C869590Y9l;
import X.C898030ZKv;
import X.EnumC461080I6g;
import X.InterfaceC1146704e9;
import X.InterfaceC454950Hsj;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.card.DefaultShareProductClickHandler;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.message.content.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareEffectContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.message.content.ShareMusicContent;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSearchContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSubscribeInviteContent;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import com.ss.android.ugc.aweme.im.message.content.ShareWebContent;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.messagelist.DefaultRecentActivityHandler;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAllTouchAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAvatarClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAwemeCardClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListCommentClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListContentFollowClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListForwardShareMessageAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListGifClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListGroupInviteCardClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListMultiShareClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPortraitCardClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListRecentActivityAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListRepostClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListResendMessageAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareLiveEventClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareProductClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareUserClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareWebClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextBigEmojiClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListVideoClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.deeplink.IActionNavigationService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.select.IMMessageListSelectTextAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.DefaultAwemeCardClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.camera.DefaultPhotoClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.camera.DefaultVideoClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.comment.DefaultCommentClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.live.DefaultShareLiveEventClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.portrait.DefaultPortraitCardClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.repost.DefaultRepostClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.DefaultAvatarClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.DefaultForwardShareMessageHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.DefaultResendMessageHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.DefaultTextBigEmojiClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.DefaultTextClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unified.DefaultShareWebClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.user.DefaultContentFollowClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.user.DefaultShareUserClickHandler;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutCL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS223S0300000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ClickHandlerAssem extends AbstractC738140SxQ implements MessageListAllTouchAbility, InterfaceC1146704e9 {
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public C0ZUH LLILLJJLI;

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

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ZUQ] */
    @Override // X.C0ZUW
    public final void Ok() {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh == null || c0zuh.LJIILLIIL != null) {
            return;
        }
        synchronized (c0zuh) {
            if (c0zuh.LJIILLIIL == null) {
                c0zuh.LJIILLIIL = new C0ZUW() { // from class: X.0ZUQ
                    @Override // X.C0ZUW
                    public final void Ok() {
                        throw null;
                    }
                };
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ZUP] */
    @Override // X.C0ZUV
    public final void x8() {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh == null || c0zuh.LJIJ != null) {
            return;
        }
        synchronized (c0zuh) {
            if (c0zuh.LJIJ == null) {
                c0zuh.LJIJ = new C0ZUV() { // from class: X.0ZUP
                    @Override // X.C0ZUV
                    public final void x8() {
                        throw null;
                    }
                };
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        SessionInfo sessionInfo;
        Fragment fragmentLJI;
        super.onCreate();
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        if (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return;
        }
        this.LLILLJJLI = new C0ZUH(fragmentLJI, sessionInfo);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListAwemeCardClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListStickerClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListGifClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListPhotoClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListVideoClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListCommentClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListShareLiveEventClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListAvatarClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListGroupInviteCardClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListShareProductClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListPortraitCardClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListContentFollowClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListShareUserClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListMultiShareClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListQuotedMessageClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListShareWebClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListResendMessageAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListForwardShareMessageAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListRecentActivityAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListRepostClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListTextBigEmojiClickAbility.class, null, this);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, MessageListTextClickAbility.class, null, this);
        if (C898030ZKv.LIZ()) {
            C1558520qew.LJII(interfaceC665370Q7zLJFF, new IMMessageListSelectTextAbility(), IMSelectTextAbility.class, null, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAvatarClickAbility
    public final void NW0(String str) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultAvatarClickHandler defaultAvatarClickHandler = c0zuh.LJIIIZ;
            if (defaultAvatarClickHandler == null) {
                synchronized (c0zuh) {
                    defaultAvatarClickHandler = c0zuh.LJIIIZ;
                    if (defaultAvatarClickHandler == null) {
                        defaultAvatarClickHandler = new DefaultAvatarClickHandler(c0zuh.LIZ);
                        c0zuh.LJIIIZ = defaultAvatarClickHandler;
                    }
                }
            }
            defaultAvatarClickHandler.NW0(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void Qz0(ShareUserContent shareUserContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().Qz0(shareUserContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareUserClickAbility
    public final void kw1(ShareUserContent shareUserContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultShareUserClickHandler defaultShareUserClickHandler = c0zuh.LJIILJJIL;
            if (defaultShareUserClickHandler == null) {
                synchronized (c0zuh) {
                    defaultShareUserClickHandler = c0zuh.LJIILJJIL;
                    if (defaultShareUserClickHandler == null) {
                        defaultShareUserClickHandler = new DefaultShareUserClickHandler();
                        c0zuh.LJIILJJIL = defaultShareUserClickHandler;
                    }
                }
            }
            defaultShareUserClickHandler.kw1(shareUserContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void lU1(long j) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().lU1(j);
        }
    }

    @Override // X.InterfaceC461540I8a
    public final void o3(ShareMusicContent shareMusicContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            C0ZQ7 c0zq7 = c0zuh.LJIILL;
            if (c0zq7 == null) {
                synchronized (c0zuh) {
                    c0zq7 = c0zuh.LJIILL;
                    if (c0zq7 == null) {
                        c0zq7 = new C0ZQ7(c0zuh.LIZ);
                        c0zuh.LJIILL = c0zq7;
                    }
                }
            }
            c0zq7.o3(shareMusicContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void q01(ShareMusicContent shareMusicContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().q01(shareMusicContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void xj2(InterfaceC454950Hsj interfaceC454950Hsj) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultStickerClickHandler) c0zuh.LJ()).xj2(interfaceC454950Hsj);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextBigEmojiClickAbility
    public final void B21(View view, String str) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LJFF().B21(view, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void G10(C869590Y9l c869590Y9l, GroupInviteCardContent groupInviteCardContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().G10(c869590Y9l, groupInviteCardContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void LG1(RoundingCornerLayout roundingCornerLayout, StickerTemplate stickerTemplate) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultStickerClickHandler) c0zuh.LJ()).LG1(roundingCornerLayout, stickerTemplate);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListResendMessageAbility
    public final void MI(View view, C869590Y9l c869590Y9l) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultResendMessageHandler defaultResendMessageHandler = c0zuh.LJJ;
            if (defaultResendMessageHandler == null) {
                synchronized (c0zuh) {
                    defaultResendMessageHandler = c0zuh.LJJ;
                    if (defaultResendMessageHandler == null) {
                        defaultResendMessageHandler = new DefaultResendMessageHandler();
                        c0zuh.LJJ = defaultResendMessageHandler;
                    }
                }
            }
            defaultResendMessageHandler.MI(view, c869590Y9l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ZUK] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ZUK] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // X.C0ZUT
    public final void Ve(Context context, ShareEffectContent shareEffectContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            C0ZUK c0zuk = c0zuh.LJIJI;
            ?? r0 = c0zuk;
            if (c0zuk == null) {
                synchronized (c0zuh) {
                    C0ZUK c0zuk2 = c0zuh.LJIJI;
                    r0 = c0zuk2;
                    if (c0zuk2 == null) {
                        ?? r02 = new C0ZUT() { // from class: X.0ZUK
                            @Override // X.C0ZUT
                            public final void Ve(Context context2, ShareEffectContent shareEffectContent2) {
                                String stickerId = shareEffectContent2.getStickerId();
                                if (stickerId == null) {
                                    stickerId = "";
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("aweme://stickers/detail?id=");
                                sbLIZ.append(stickerId);
                                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context2, C2188811AlT.LIZIZ(sbLIZ));
                                smartRouteBuildRoute.withParam("prop_page_enter_from", "chat");
                                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, stickerId);
                                smartRouteBuildRoute.open();
                                IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMessageAdapterAnalytics.class, false, false, false, 14, null);
                                if (iIMMessageAdapterAnalytics != null) {
                                    iIMMessageAdapterAnalytics.LJ(shareEffectContent2.getStickerId(), C0I0B.LJFF.LIZIZ());
                                }
                            }
                        };
                        c0zuh.LJIJI = r02;
                        r0 = r02;
                    }
                }
            }
            r0.Ve(context, shareEffectContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareWebClickAbility
    public final void W00(View view, ShareSubscribeInviteContent shareSubscribeInviteContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultShareWebClickHandler) c0zuh.LIZLLL()).W00(view, shareSubscribeInviteContent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ZUI] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ZUI] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // X.C0ZUS
    public final void Zg(Context context, ShareChallengeContent shareChallengeContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            C0ZUI c0zui = c0zuh.LJIIZILJ;
            ?? r0 = c0zui;
            if (c0zui == null) {
                synchronized (c0zuh) {
                    C0ZUI c0zui2 = c0zuh.LJIIZILJ;
                    r0 = c0zui2;
                    if (c0zui2 == null) {
                        final SessionInfo sessionInfo = c0zuh.LIZ;
                        ?? r02 = new C0ZUS(sessionInfo) { // from class: X.0ZUI
                            public final SessionInfo LL;

                            {
                                this.LL = sessionInfo;
                            }

                            @Override // X.C0ZUS
                            public final void Zg(Context context2, ShareChallengeContent shareChallengeContent2) {
                                String str;
                                String challengeId = shareChallengeContent2.getChallengeId();
                                if (challengeId == null) {
                                    return;
                                }
                                boolean zIsCommerce = shareChallengeContent2.isCommerce();
                                String string = UUID.randomUUID().toString();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("aweme://challenge/detail/");
                                sbLIZ.append(challengeId);
                                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context2, C2188811AlT.LIZIZ(sbLIZ));
                                if (zIsCommerce) {
                                    str = "1";
                                } else {
                                    str = CardStruct.IStatusCode.DEFAULT;
                                }
                                smartRouteBuildRoute.withParam("is_commerce", str);
                                smartRouteBuildRoute.withParam("enter_from", "chat");
                                smartRouteBuildRoute.withParam("process_id", string);
                                smartRouteBuildRoute.open();
                                IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMessageAdapterAnalytics.class, false, false, false, 14, null);
                                if (iIMMessageAdapterAnalytics != null) {
                                    iIMMessageAdapterAnalytics.LJII(challengeId, this.LL.getSingleChatFromUserId(), this.LL.getConversationId(), string, C0I0B.LJFF.LIZIZ());
                                }
                            }
                        };
                        c0zuh.LJIIZILJ = r02;
                        r0 = r02;
                    }
                }
            }
            r0.Zg(context, shareChallengeContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListGroupInviteCardClickAbility
    public final void lB1(C869590Y9l c869590Y9l, GroupInviteCardContent groupInviteCardContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultGroupInviteCardClickHandler defaultGroupInviteCardClickHandler = c0zuh.LJIIJ;
            if (defaultGroupInviteCardClickHandler == null) {
                synchronized (c0zuh) {
                    defaultGroupInviteCardClickHandler = c0zuh.LJIIJ;
                    if (defaultGroupInviteCardClickHandler == null) {
                        defaultGroupInviteCardClickHandler = new DefaultGroupInviteCardClickHandler(c0zuh.LIZ);
                        c0zuh.LJIIJ = defaultGroupInviteCardClickHandler;
                    }
                }
            }
            defaultGroupInviteCardClickHandler.lB1(c869590Y9l, groupInviteCardContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void mV1(long j, Long l) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().mV1(j, l);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListContentFollowClickAbility
    public final void sp0(View view, C869590Y9l c869590Y9l) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultContentFollowClickHandler defaultContentFollowClickHandler = c0zuh.LJIILIIL;
            if (defaultContentFollowClickHandler == null) {
                synchronized (c0zuh) {
                    defaultContentFollowClickHandler = c0zuh.LJIILIIL;
                    if (defaultContentFollowClickHandler == null) {
                        defaultContentFollowClickHandler = new DefaultContentFollowClickHandler();
                        c0zuh.LJIILIIL = defaultContentFollowClickHandler;
                    }
                }
            }
            defaultContentFollowClickHandler.sp0(view, c869590Y9l);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextClickAbility
    public final void uZ1(View view, String str) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LJI().uZ1(view, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareWebClickAbility
    public final void ux0(View view, ShareSearchContent shareSearchContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZLLL().ux0(view, shareSearchContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareLiveEventClickAbility
    public final void CC2(View view, C869590Y9l c869590Y9l, ShareLiveEventContent shareLiveEventContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultShareLiveEventClickHandler defaultShareLiveEventClickHandler = c0zuh.LJIIIIZZ;
            if (defaultShareLiveEventClickHandler == null) {
                synchronized (c0zuh) {
                    defaultShareLiveEventClickHandler = c0zuh.LJIIIIZZ;
                    if (defaultShareLiveEventClickHandler == null) {
                        defaultShareLiveEventClickHandler = new DefaultShareLiveEventClickHandler();
                        c0zuh.LJIIIIZZ = defaultShareLiveEventClickHandler;
                    }
                }
            }
            defaultShareLiveEventClickHandler.CC2(view, c869590Y9l, shareLiveEventContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void ED1(View view, long j, Long l) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().ED1(view, j, l);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void Gl1(C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultStickerClickHandler) c0zuh.LJ()).Gl1(c19eg, c869590Y9l, stickerTemplate);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void OI2(View view, C869590Y9l c869590Y9l, CommentContent commentContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().OI2(view, c869590Y9l, commentContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListGifClickAbility
    public final void Qw2(GifContent gifContent, C869590Y9l c869590Y9l, View view) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultGifClickHandler defaultGifClickHandler = c0zuh.LJ;
            if (defaultGifClickHandler == null) {
                synchronized (c0zuh) {
                    defaultGifClickHandler = c0zuh.LJ;
                    if (defaultGifClickHandler == null) {
                        defaultGifClickHandler = new DefaultGifClickHandler(c0zuh.LIZIZ, c0zuh.LIZ);
                        c0zuh.LJ = defaultGifClickHandler;
                    }
                }
            }
            defaultGifClickHandler.Qw2(gifContent, c869590Y9l, view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Csw] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1Csw] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // X.C0ZUR
    public final void Yf(View view, C869590Y9l c869590Y9l, ImageCardTemplate imageCardTemplate) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            C2244401Csw c2244401Csw = c0zuh.LJIJJ;
            ?? r0 = c2244401Csw;
            if (c2244401Csw == null) {
                synchronized (c0zuh) {
                    C2244401Csw c2244401Csw2 = c0zuh.LJIJJ;
                    r0 = c2244401Csw2;
                    if (c2244401Csw2 == null) {
                        ?? r02 = new C0ZUR() { // from class: X.1Csw
                            @Override // X.C0ZUR
                            public final void Yf(View view2, C869590Y9l c869590Y9l2, ImageCardTemplate imageCardTemplate2) {
                                InterfaceC2244421Csy interfaceC2244421CsyLIZ;
                                IActionNavigationService.LIZ.getClass();
                                C01GW<IActionNavigationService> c01gw = C2244411Csx.LIZIZ;
                                IActionNavigationService value = c01gw.getValue();
                                if (value != null && (interfaceC2244421CsyLIZ = value.LIZ(c869590Y9l2.getScene())) != null) {
                                    interfaceC2244421CsyLIZ.LIZ(view2, imageCardTemplate2.actionLinkComponent);
                                    return;
                                }
                                IActionNavigationService value2 = c01gw.getValue();
                                if (value2 == null) {
                                    return;
                                }
                                value2.LIZIZ(view2.getContext(), imageCardTemplate2.actionLinkComponent);
                            }
                        };
                        c0zuh.LJIJJ = r02;
                        r0 = r02;
                    }
                }
            }
            r0.Yf(view, c869590Y9l, imageCardTemplate);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void Zb1(Context context, String str, FeatureAttachmentContent featureAttachmentContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().Zb1(context, str, featureAttachmentContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareProductClickAbility
    public final void eX0(View view, C869590Y9l c869590Y9l, ShareProductContent shareProductContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultShareProductClickHandler defaultShareProductClickHandler = c0zuh.LJIIJJI;
            if (defaultShareProductClickHandler == null) {
                synchronized (c0zuh) {
                    defaultShareProductClickHandler = c0zuh.LJIIJJI;
                    if (defaultShareProductClickHandler == null) {
                        defaultShareProductClickHandler = new DefaultShareProductClickHandler();
                        c0zuh.LJIIJJI = defaultShareProductClickHandler;
                    }
                }
            }
            defaultShareProductClickHandler.eX0(view, c869590Y9l, shareProductContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAwemeCardClickAbility
    public final void gs2(RoundingCornerLayoutCL roundingCornerLayoutCL, C869590Y9l c869590Y9l, AwemeCardTemplate awemeCardTemplate) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultAwemeCardClickHandler) c0zuh.LIZ()).gs2(roundingCornerLayoutCL, c869590Y9l, awemeCardTemplate);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void iA0(SessionInfo sessionInfo, StickerTemplate stickerTemplate, AwS215S0300000_6 awS215S0300000_6) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultStickerClickHandler) c0zuh.LJ()).iA0(sessionInfo, stickerTemplate, awS215S0300000_6);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void kn0(View view, long j, Long l) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().kn0(view, j, l);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareWebClickAbility
    public final void nP1(View view, C869590Y9l c869590Y9l, ShareWebContent shareWebContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZLLL().nP1(view, c869590Y9l, shareWebContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void oQ2(View view, C869590Y9l c869590Y9l, ShareLiveEventContent shareLiveEventContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().oQ2(view, c869590Y9l, shareLiveEventContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextBigEmojiClickAbility
    public final void qI2(SessionInfo sessionInfo, String str, AwS215S0300000_6 awS215S0300000_6) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultTextBigEmojiClickHandler) c0zuh.LJFF()).qI2(sessionInfo, str, awS215S0300000_6);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void qQ2(View view, C869590Y9l c869590Y9l, ShareProductContent shareProductContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().qQ2(view, c869590Y9l, shareProductContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPortraitCardClickAbility
    public final void r52(C869590Y9l c869590Y9l, View view, PortraitCardTemplate portraitCardTemplate) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultPortraitCardClickHandler defaultPortraitCardClickHandler = c0zuh.LJIIL;
            if (defaultPortraitCardClickHandler == null) {
                synchronized (c0zuh) {
                    defaultPortraitCardClickHandler = c0zuh.LJIIL;
                    if (defaultPortraitCardClickHandler == null) {
                        defaultPortraitCardClickHandler = new DefaultPortraitCardClickHandler();
                        c0zuh.LJIIL = defaultPortraitCardClickHandler;
                    }
                }
            }
            defaultPortraitCardClickHandler.r52(c869590Y9l, view, portraitCardTemplate);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextClickAbility
    public final void xN1(SessionInfo sessionInfo, String str, AwS223S0300000_14 awS223S0300000_14) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultTextClickHandler) c0zuh.LJI()).xN1(sessionInfo, str, awS223S0300000_14);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void EL2(View view, long j, Long l, GifContent gifContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().EL2(view, j, l, gifContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility
    public final void KG0(View view, C869590Y9l c869590Y9l, PictureCardTemplate pictureCardTemplate, Aweme aweme) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultPhotoClickHandler) c0zuh.LIZIZ()).KG0(view, c869590Y9l, pictureCardTemplate, aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void KZ0(long j, Long l, long j2, long j3) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().KZ0(j, l, j2, j3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAwemeCardClickAbility
    public final void Li2(RoundingCornerLayoutCL roundingCornerLayoutCL, C869590Y9l c869590Y9l, AwemeCardTemplate awemeCardTemplate, SessionInfo sessionInfo) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultAwemeCardClickHandler) c0zuh.LIZ()).Li2(roundingCornerLayoutCL, c869590Y9l, awemeCardTemplate, sessionInfo);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void MS(RoundingCornerLayout roundingCornerLayout, C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultStickerClickHandler) c0zuh.LJ()).MS(roundingCornerLayout, c19eg, c869590Y9l, stickerTemplate);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void RK(View view, long j, Long l, String str) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().RK(view, j, l, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void S52(Context context, C869590Y9l c869590Y9l, String str, String str2) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().S52(context, c869590Y9l, str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListCommentClickAbility
    public final void Sa1(Context context, C869590Y9l c869590Y9l, String str, String str2) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultCommentClickHandler defaultCommentClickHandler = c0zuh.LJII;
            if (defaultCommentClickHandler == null) {
                synchronized (c0zuh) {
                    defaultCommentClickHandler = c0zuh.LJII;
                    if (defaultCommentClickHandler == null) {
                        defaultCommentClickHandler = new DefaultCommentClickHandler(c0zuh.LIZ);
                        c0zuh.LJII = defaultCommentClickHandler;
                    }
                }
            }
            defaultCommentClickHandler.Sa1(context, c869590Y9l, str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void TQ0(View view, long j, Long l, String str) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().TQ0(view, j, l, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void UZ0(View view, long j, Long l, String str) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().UZ0(view, j, l, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void W32(View view, long j, Long l, ShareLiveContent shareLiveContent) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().W32(view, j, l, shareLiveContent);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void dH1(View view, C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultStickerClickHandler) c0zuh.LJ()).dH1(view, c19eg, c869590Y9l, stickerTemplate);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListRepostClickAbility
    public final void eI2(Context context, C869590Y9l c869590Y9l, String str, String str2) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultRepostClickHandler defaultRepostClickHandler = c0zuh.LJJII;
            if (defaultRepostClickHandler == null) {
                synchronized (c0zuh) {
                    defaultRepostClickHandler = c0zuh.LJJII;
                    if (defaultRepostClickHandler == null) {
                        defaultRepostClickHandler = new DefaultRepostClickHandler(c0zuh.LIZ);
                        c0zuh.LJJII = defaultRepostClickHandler;
                    }
                }
            }
            defaultRepostClickHandler.eI2(context, c869590Y9l, str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void lC1(View view, long j, Long l, C0I5R c0i5r) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().lC1(view, j, l, c0i5r);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void up1(View view, FragmentManager fragmentManager, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultStickerClickHandler) c0zuh.LJ()).up1(view, fragmentManager, c869590Y9l, stickerTemplate);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void v10(View view, long j, Long l, C06NM c06nm) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultQuotedMessageClickHandler) c0zuh.LIZJ()).v10(view, j, l, c06nm);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListForwardShareMessageAbility
    public final void xA0(View view, C869590Y9l c869590Y9l, BaseContent baseContent, BaseTemplate baseTemplate) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultForwardShareMessageHandler defaultForwardShareMessageHandler = c0zuh.LJJI;
            if (defaultForwardShareMessageHandler == null) {
                synchronized (c0zuh) {
                    defaultForwardShareMessageHandler = c0zuh.LJJI;
                    if (defaultForwardShareMessageHandler == null) {
                        defaultForwardShareMessageHandler = new DefaultForwardShareMessageHandler(c0zuh.LIZIZ, c0zuh.LIZ);
                        c0zuh.LJJI = defaultForwardShareMessageHandler;
                    }
                }
            }
            defaultForwardShareMessageHandler.xA0(view, c869590Y9l, baseContent, baseTemplate);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility
    public final void zM(View view, C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultStickerClickHandler) c0zuh.LJ()).zM(view, c19eg, c869590Y9l, stickerTemplate);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListVideoClickAbility
    public final void PJ(View view, C869590Y9l c869590Y9l, Aweme aweme, BaseTemplate baseTemplate, boolean z) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultVideoClickHandler defaultVideoClickHandler = c0zuh.LJI;
            if (defaultVideoClickHandler == null) {
                synchronized (c0zuh) {
                    defaultVideoClickHandler = c0zuh.LJI;
                    if (defaultVideoClickHandler == null) {
                        defaultVideoClickHandler = new DefaultVideoClickHandler(c0zuh.LIZ);
                        c0zuh.LJI = defaultVideoClickHandler;
                    }
                }
            }
            defaultVideoClickHandler.PJ(view, c869590Y9l, aweme, baseTemplate, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility
    public final void wM0(View view, C869590Y9l c869590Y9l, Aweme aweme, BaseTemplate baseTemplate, boolean z) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            ((DefaultPhotoClickHandler) c0zuh.LIZIZ()).wM0(view, c869590Y9l, aweme, baseTemplate, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility
    public final void wz0(long j, Long l, Context context, int i, C0I5R c0i5r) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            c0zuh.LIZJ().wz0(j, l, context, i, c0i5r);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListRecentActivityAbility
    public final void GY0(Context context, String str, EnumC461080I6g enumC461080I6g, Aweme aweme, String str2, String str3) {
        C0ZUH c0zuh = this.LLILLJJLI;
        if (c0zuh != null) {
            DefaultRecentActivityHandler defaultRecentActivityHandler = c0zuh.LJJIFFI;
            if (defaultRecentActivityHandler == null) {
                synchronized (c0zuh) {
                    defaultRecentActivityHandler = c0zuh.LJJIFFI;
                    if (defaultRecentActivityHandler == null) {
                        defaultRecentActivityHandler = new DefaultRecentActivityHandler(c0zuh.LIZ);
                        c0zuh.LJJIFFI = defaultRecentActivityHandler;
                    }
                }
            }
            defaultRecentActivityHandler.GY0(context, str, enumC461080I6g, aweme, str2, str3);
        }
    }
}
