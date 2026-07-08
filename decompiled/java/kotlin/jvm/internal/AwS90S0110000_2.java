package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C060A;
import X.C060B;
import X.C06GX;
import X.C06XH;
import X.C09AY;
import X.C0PEM;
import X.C0SZ4;
import X.C0XQ7;
import X.C0Y8T;
import X.C0YSQ;
import X.C1163440gNi;
import X.C1229100i5c;
import X.C1389905cH;
import X.C13LE;
import X.C15442062u;
import X.C1611806Su;
import X.C1628206Zc;
import X.C1639906bV;
import X.C1654006dm;
import X.C1654406dq;
import X.C1654506dr;
import X.C1715206ne;
import X.C1715706nj;
import X.C1715806nk;
import X.C1716106nn;
import X.C1727806pg;
import X.C2273121DyA;
import X.C2296808zG;
import X.C23250099c;
import X.C291001Au;
import X.C300640BqQ;
import X.C441201ne;
import X.C457780HxI;
import X.C461720I8s;
import X.C625420Og0;
import X.C625470Og5;
import X.C625520OgA;
import X.C723850SaN;
import X.C888370Yt9;
import X.EnumC624770Oex;
import X.InterfaceC2217461Bqa;
import X.InterfaceC876950Yaj;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatroom.BusinessGroupChatInputAssem;
import com.ss.android.ugc.aweme.chatroom.GroupChatAssem;
import com.ss.android.ugc.aweme.chatroom.GroupChatroomInputAssem;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarUIAssem;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackReason;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.StreakAlphaVideoAssem;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.offlinemode.OfflineModeTask;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBaseBottomButtonsComponent;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.titlebar.GroupTitleBarAssem;
import com.ss.android.ugc.aweme.titlebar.quicktitlebar.QuickGroupTitleBarAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS90S0110000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        Class cls;
        Assembler assembler = (Assembler) obj;
        GroupChatAssem groupChatAssem = (GroupChatAssem) awS90S0110000_2.l0;
        if (groupChatAssem.Oo().getShowTitleBar()) {
            if (((C457780HxI) groupChatAssem.LLIZLLLIL.getValue()).LLILLJJLI) {
                cls = QuickGroupTitleBarAssem.class;
            } else {
                cls = GroupTitleBarAssem.class;
            }
            assembler.RQ2(groupChatAssem, new AwS581S0100000_2(C13LE.LIZ(cls), 681));
        }
        GroupChatAssem groupChatAssem2 = (GroupChatAssem) awS90S0110000_2.l0;
        assembler.RQ2(groupChatAssem2, new AwS90S0110000_2(groupChatAssem2.LJJIJL().findViewById(R.id.krm), awS90S0110000_2.z1, 8));
        assembler.QQ2(groupChatAssem2, new AwS581S0100000_2(groupChatAssem2, 684));
        GroupChatAssem groupChatAssem3 = (GroupChatAssem) awS90S0110000_2.l0;
        groupChatAssem3.getClass();
        groupChatAssem3.Go(new AwS616S0100000_2(groupChatAssem3, 149));
        GroupChatAssem groupChatAssem4 = (GroupChatAssem) awS90S0110000_2.l0;
        if (groupChatAssem4.LLJJJIL == null) {
            synchronized (groupChatAssem4) {
                if (groupChatAssem4.LLJJJIL == null) {
                    groupChatAssem4.LLJJJIL = new C1654406dq();
                }
            }
        }
        groupChatAssem4.Go(new AwS438S0200000_2(groupChatAssem4, C13LE.LIZ(ActionBarUIAssem.class), 25));
        GroupChatAssem groupChatAssem5 = (GroupChatAssem) awS90S0110000_2.l0;
        groupChatAssem5.getClass();
        groupChatAssem5.Go(new AwS616S0100000_2(groupChatAssem5, 150));
        GroupChatAssem groupChatAssem6 = (GroupChatAssem) awS90S0110000_2.l0;
        groupChatAssem6.getClass();
        if (C1716106nn.LIZ() || ((Number) C1654506dr.LIZ.getValue()).intValue() != 0) {
            if (C2273121DyA.LIZIZ()) {
                C1654006dm c1654006dm = ChatRoomAlphaVideoAssem.LLJJIJIIJIL;
                AssemVMLazy assemVMLazy = groupChatAssem6.LLJJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatAssem.LLJJL;
                ChatRoomAlphaVideoViewModel chatRoomAlphaVideoViewModel = (ChatRoomAlphaVideoViewModel) assemVMLazy.getValue();
                c1654006dm.getClass();
                C441201ne.LIZ(groupChatAssem6, C1654006dm.LIZ(groupChatAssem6, chatRoomAlphaVideoViewModel), "eoyAnimation", new AwS581S0100000_2(groupChatAssem6, 683));
            } else {
                assembler.QQ2(groupChatAssem6, AFwS229S0000000_2.get$arr$(907));
            }
        }
        GroupChatAssem groupChatAssem7 = (GroupChatAssem) awS90S0110000_2.l0;
        groupChatAssem7.getClass();
        if (C06GX.LIZ()) {
            if (C2273121DyA.LIZIZ()) {
                C1628206Zc c1628206Zc = StreakAlphaVideoAssem.LLJJIJIIJIL;
                AssemVMLazy assemVMLazy2 = groupChatAssem7.LLJJIII;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = GroupChatAssem.LLJJL;
                ChatRoomStreakViewModel chatRoomStreakViewModel = (ChatRoomStreakViewModel) assemVMLazy2.getValue();
                c1628206Zc.getClass();
                C441201ne.LIZ(groupChatAssem7, C1628206Zc.LIZ(groupChatAssem7, chatRoomStreakViewModel), "streakUnlockAnimation", new AwS581S0100000_2(groupChatAssem7, 679));
            } else {
                assembler.QQ2(groupChatAssem7, AFwS229S0000000_2.get$arr$(901));
            }
        }
        GroupChatAssem groupChatAssem8 = (GroupChatAssem) awS90S0110000_2.l0;
        groupChatAssem8.getClass();
        if (C300640BqQ.LIZ()) {
            assembler.QQ2(groupChatAssem8, AFwS229S0000000_2.get$arr$(897));
        }
        GroupChatAssem groupChatAssem9 = (GroupChatAssem) awS90S0110000_2.l0;
        groupChatAssem9.getClass();
        assembler.vQ2(groupChatAssem9, AFwS229S0000000_2.get$arr$(902));
        GroupChatAssem groupChatAssem10 = (GroupChatAssem) awS90S0110000_2.l0;
        groupChatAssem10.getClass();
        if (C1611806Su.LIZ()) {
            groupChatAssem10.Go(new AwS616S0100000_2(groupChatAssem10, 151));
        }
        GroupChatAssem groupChatAssem11 = (GroupChatAssem) awS90S0110000_2.l0;
        groupChatAssem11.getClass();
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(((C457780HxI) groupChatAssem11.LLIZLLLIL.getValue()).LL.getConversationId());
        if (c0y8tLIZ != null && C1727806pg.LIZ.LIZ("group_chat_insert_qr_code_msg", c0y8tLIZ.getConversationId(), C461720I8s.LIZIZ(), false)) {
            C723850SaN.LIZLLL(groupChatAssem11, new AwS581S0100000_2(groupChatAssem11, 680));
        }
        GroupChatAssem groupChatAssem12 = (GroupChatAssem) awS90S0110000_2.l0;
        groupChatAssem12.getClass();
        if (C1229100i5c.LIZ.LJIIJJI(groupChatAssem12.Oo().getConversationId())) {
            assembler.vQ2(groupChatAssem12, AFwS229S0000000_2.get$arr$(896));
        }
        GroupChatAssem groupChatAssem13 = (GroupChatAssem) awS90S0110000_2.l0;
        groupChatAssem13.getClass();
        assembler.vQ2(groupChatAssem13, AFwS229S0000000_2.get$arr$(903));
        GroupChatAssem groupChatAssem14 = (GroupChatAssem) awS90S0110000_2.l0;
        if (groupChatAssem14.Oo().isPreviewMode()) {
            assembler.vQ2(groupChatAssem14, AFwS229S0000000_2.get$arr$(898));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C625470Og5 c625470Og5 = C625470Og5.LL;
        boolean z = awS90S0110000_2.z1;
        c625470Og5.getClass();
        C23250099c.LIZLLL(C625470Og5.LLIZLLLIL, null, null, new C625520OgA(false, iIntValue, z, null), 3);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && C625420Og0.LJFF() != EnumC624770Oex.UNINITIALIZED) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1389905cH((OfflineModeTask) awS90S0110000_2.l0, null), 3);
        } else {
            ((OfflineModeTask) awS90S0110000_2.l0).LL.LJIIIZ("unLogin clearUserCache skip");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        ((ChatRoomAlphaVideoViewModel) awS90S0110000_2.l0).LL.bc(true);
        ((ChatRoomAlphaVideoViewModel) awS90S0110000_2.l0).setState(new AwS90S0110000_2((DataSource) obj, awS90S0110000_2.z1, 9));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        PoiPostPageFragment poiPostPageFragment = (PoiPostPageFragment) awS90S0110000_2.l0;
        assembler.DQ2(poiPostPageFragment, new AwS581S0100000_2(poiPostPageFragment, 734));
        assembler.QQ2((PoiPostPageFragment) awS90S0110000_2.l0, AFwS229S0000000_2.get$arr$(952));
        assembler.QQ2((PoiPostPageFragment) awS90S0110000_2.l0, new AwS17S0010000_2(awS90S0110000_2.z1, 20));
        assembler.QQ2((PoiPostPageFragment) awS90S0110000_2.l0, AFwS229S0000000_2.get$arr$(953));
        assembler.QQ2((PoiPostPageFragment) awS90S0110000_2.l0, AFwS229S0000000_2.get$arr$(954));
        assembler.RQ2((PoiPostPageFragment) awS90S0110000_2.l0, AFwS229S0000000_2.get$arr$(955));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        AVMusic aVMusic;
        AVMusic aVMusic2 = (AVMusic) obj;
        if (awS90S0110000_2.z1 && (aVMusic = (AVMusic) awS90S0110000_2.l0) != null) {
            return aVMusic.getMusicId();
        }
        if (aVMusic2 != null) {
            return aVMusic2.getMusicId();
        }
        return null;
    }

    public static final Object invoke$3(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiBaseBottomButtonsComponent) awS90S0110000_2.l0, new AwS17S0010000_2(awS90S0110000_2.z1, 9));
        assembler.RQ2((PoiBaseBottomButtonsComponent) awS90S0110000_2.l0, AFwS229S0000000_2.get$arr$(566));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        String str;
        String str2;
        IMAIBotInfo iMAIBotInfo = (IMAIBotInfo) obj;
        if (iMAIBotInfo != null) {
            boolean z = awS90S0110000_2.z1;
            if (z) {
                str = "feedback";
                str2 = "chat";
            } else {
                str = "setting_insights";
                str2 = "notification_page";
            }
            C888370Yt9 c888370Yt9 = C888370Yt9.LIZ;
            Context context = (Context) awS90S0110000_2.l0;
            c888370Yt9.getClass();
            C888370Yt9.LIZ(context, iMAIBotInfo, z, str, str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        return ((SingleTitleBarCenterViewModel) awS90S0110000_2.l0).vQ2(C1639906bV.LIZ((C1639906bV) obj, null, null, null, false, null, awS90S0110000_2.z1, null, null, null, 959), false);
    }

    public static final Object invoke$6(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        C060A c060a = (C060A) obj;
        if (awS90S0110000_2.z1) {
            return new C060A(c060a.LL, C15442062u.LJIIIIZZ((BotFeedbackReason) awS90S0110000_2.l0, c060a.LLILLJJLI));
        }
        return new C060A(c060a.LL, C15442062u.LJI((BotFeedbackReason) awS90S0110000_2.l0, c060a.LLILLJJLI));
    }

    public static final Object invoke$7(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        C060B c060b = (C060B) obj;
        if (awS90S0110000_2.z1) {
            return C060B.LIZ(c060b, null, C15442062u.LJIIIIZZ((BotFeedbackReason) awS90S0110000_2.l0, c060b.LLILLL), 3);
        }
        return C060B.LIZ(c060b, null, C15442062u.LJI((BotFeedbackReason) awS90S0110000_2.l0, c060b.LLILLL), 3);
    }

    public static final Object invoke$8(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        Class cls;
        C0SZ4 c0sz4 = (C0SZ4) obj;
        if (awS90S0110000_2.z1) {
            cls = BusinessGroupChatInputAssem.class;
        } else {
            cls = GroupChatroomInputAssem.class;
        }
        c0sz4.LL = C13LE.LIZ(cls);
        c0sz4.LLIZLLLIL = R.id.ui_slot_input_layout_redesign;
        c0sz4.LLJIJIL = C1163440gNi.LIZJ;
        View view = (View) awS90S0110000_2.l0;
        if (view != null) {
            c0sz4.LJ(view, "EXTRA_VIEW_KEY");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS90S0110000_2 awS90S0110000_2, Object obj) {
        C1715706nj c1715706nj;
        C1715206ne c1715206ne = (C1715206ne) obj;
        DataSource dataSource = (DataSource) awS90S0110000_2.l0;
        if (awS90S0110000_2.z1) {
            c1715706nj = new C1715706nj(C06XH.LIGHT_INTERACTION_ANIMATION);
        } else {
            c1715706nj = null;
        }
        return C1715206ne.LIZ(c1715206ne, new C291001Au(new C1715806nk(dataSource, c1715706nj, 14)), null, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(Context context, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(View view, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(GroupChatAssem groupChatAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = groupChatAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(AVMusic aVMusic, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = aVMusic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(BotFeedbackReason botFeedbackReason, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = botFeedbackReason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(SingleTitleBarCenterViewModel singleTitleBarCenterViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = singleTitleBarCenterViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(ChatRoomAlphaVideoViewModel chatRoomAlphaVideoViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = chatRoomAlphaVideoViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(DataSource dataSource, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = dataSource;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(PoiBaseBottomButtonsComponent poiBaseBottomButtonsComponent, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiBaseBottomButtonsComponent;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(PoiPostPageFragment poiPostPageFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiPostPageFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0110000_2(boolean z, OfflineModeTask offlineModeTask, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = offlineModeTask;
    }
}
