package kotlin.jvm.internal;

import X.AbstractC1604130rqV;
import X.AbstractC738140SxQ;
import X.AnonymousClass0616;
import X.C05P0;
import X.C05P1;
import X.C05VC;
import X.C05VD;
import X.C09AY;
import X.C0PEM;
import X.C0SZ5;
import X.C1147304eF;
import X.C118300cf;
import X.C1184530gvj;
import X.C1371605Yk;
import X.C1397620mTQ;
import X.C13IQ;
import X.C1558520qew;
import X.C1636906b1;
import X.C1668306g5;
import X.C1668706g9;
import X.C1677606ha;
import X.C1684206ie;
import X.C1684506ih;
import X.C1690080u58;
import X.C1734206qi;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C291001Au;
import X.C786410Ut5;
import X.C816040Vzm;
import X.C817503Hh;
import X.C869590Y9l;
import X.C909290Zln;
import X.EnumC12936054k;
import X.EnumC1665006fY;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailFragment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.launcershortcut.LauncherShortcutService;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFBizIconsAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.dynamicbutton.PoiDetailHeaderDynamicButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.PoiScrollBottomBarComponent;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.rectangle.PoiRectangleBottomBarComponent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.assem.NavBarRightButtonsAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y5o.n0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS101S0400000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unzipAndFindJson summary: zip=");
        sbLIZ.append(((File) awS101S0400000_2.l0).getAbsolutePath());
        sbLIZ.append(", entryCount=");
        sbLIZ.append(((C118300cf) awS101S0400000_2.l1).element);
        sbLIZ.append(", jsonCount=");
        sbLIZ.append(((List) awS101S0400000_2.l2).size());
        sbLIZ.append(", extractDir=");
        sbLIZ.append(((File) awS101S0400000_2.l3).getAbsolutePath());
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiDetailHeaderDynamicButtonAssem) awS101S0400000_2.l0, new AwS581S0100000_2((C1184530gvj) awS101S0400000_2.l1, 8));
        assembler.EQ2((PoiDetailHeaderDynamicButtonAssem) awS101S0400000_2.l0, new AwS581S0100000_2((PoiButton) awS101S0400000_2.l2, 9));
        assembler.RQ2((PoiDetailHeaderDynamicButtonAssem) awS101S0400000_2.l0, new AwS581S0100000_2((FrameLayout) awS101S0400000_2.l3, 10));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService != null) {
            iIMBusinessChatService.LJII((ChatFeatureListConf) awS101S0400000_2.l0, assembler, (Fragment) awS101S0400000_2.l1, (C909290Zln) awS101S0400000_2.l2, (SingleChatAssem) awS101S0400000_2.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Activity activity = (Activity) awS101S0400000_2.l0;
        IMUser iMUser = (IMUser) awS101S0400000_2.l1;
        C1684206ie c1684206ie = C1684206ie.LIZ;
        C869590Y9l c869590Y9l = (C869590Y9l) awS101S0400000_2.l2;
        c1684206ie.getClass();
        new BlockUserController(activity, iMUser, C1684206ie.LIZIZ(c869590Y9l), "inline_message", null, null, null, C1677606ha.LIZ(((SessionInfo) awS101S0400000_2.l3).getChatType()), ((SessionInfo) awS101S0400000_2.l3).getConversationId(), null, 624).LIZ(AFwS187S0000000_2.get$arr$(538), AFwS187S0000000_2.get$arr$(539));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((NavBarRightButtonsAssem) awS101S0400000_2.l0, new AwS581S0100000_2((C1184530gvj) awS101S0400000_2.l1, 554));
        NavBarRightButtonsAssem navBarRightButtonsAssem = (NavBarRightButtonsAssem) awS101S0400000_2.l0;
        assembler.EQ2(navBarRightButtonsAssem, new AwS384S0200000_18((PoiButton) awS101S0400000_2.l2, navBarRightButtonsAssem, 238));
        assembler.RQ2((NavBarRightButtonsAssem) awS101S0400000_2.l0, new AwS581S0100000_2((View) awS101S0400000_2.l3, 555));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.RQ2((UIAssem) awS101S0400000_2.l0, new AwS368S0200000_2((FrameLayout) awS101S0400000_2.l2, (Function1) awS101S0400000_2.l1, 150));
        assembler.RQ2((UIAssem) awS101S0400000_2.l0, new AwS368S0200000_2((FrameLayout) awS101S0400000_2.l2, (Function1) awS101S0400000_2.l3, 151));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Function2 function2 = (Function2) awS101S0400000_2.l0;
        if (function2 != null) {
            function2.invoke("setting", "setting");
        }
        LauncherShortcutService launcherShortcutService = (LauncherShortcutService) awS101S0400000_2.l1;
        Context context = (Context) awS101S0400000_2.l2;
        Function0 function0 = (Function0) awS101S0400000_2.l3;
        if (Build.VERSION.SDK_INT < 26) {
            launcherShortcutService.getClass();
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            ((AbstractC1604130rqV) launcherShortcutService.LIZ.getValue()).LJIIIZ("openPermissionSettingPage");
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1371605Yk(function0, launcherShortcutService, context, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131835533, new AwS101S0400000_2((Function2) awS101S0400000_2.l0, (Function2<? super String, ? super String, Unit>) awS101S0400000_2.l1, (LauncherShortcutService) awS101S0400000_2.l2, (Context) awS101S0400000_2.l3, (Function0<Unit>) 14));
        c1397620mTQ.LJII(2131835532, new AwS368S0200000_2((Function0) awS101S0400000_2.l3, (Function0<Unit>) awS101S0400000_2.l0, (Function2<? super String, ? super String, Unit>) 158));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C05P1 c05p1 = (C05P1) awS101S0400000_2.l1;
        int i = n0.LLJLL;
        if (!((Boolean) c05p1.getValue()).booleanValue()) {
            C23250099c.LIZLLL((InterfaceC497601wk) awS101S0400000_2.l0, null, null, new C05VC((C1690080u58) awS101S0400000_2.l2, iIntValue, (n0) awS101S0400000_2.l3, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C05P1 c05p1 = (C05P1) awS101S0400000_2.l1;
        int i = n0.LLJLL;
        if (!((Boolean) c05p1.getValue()).booleanValue()) {
            C23250099c.LIZLLL((InterfaceC497601wk) awS101S0400000_2.l0, null, null, new C05VD((C1690080u58) awS101S0400000_2.l2, iIntValue, (n0) awS101S0400000_2.l3, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        C1636906b1 c1636906b1 = (C1636906b1) obj;
        PreshownStickerSceneConfig preshownStickerSceneConfig = c1636906b1.LL;
        C291001Au<Boolean> c291001Au = c1636906b1.LLILLJJLI;
        if (preshownStickerSceneConfig == null) {
            MessageListFooterViewModel messageListFooterViewModel = (MessageListFooterViewModel) awS101S0400000_2.l0;
            C1684506ih c1684506ih = messageListFooterViewModel.LLILLL;
            if (c1684506ih != null) {
                ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL((UIAssem) awS101S0400000_2.l3), ChatRoomFakeMsgOperatorAbility.class, null);
                if (chatRoomFakeMsgOperatorAbility != null) {
                    chatRoomFakeMsgOperatorAbility.y52(c1684506ih, null);
                }
                messageListFooterViewModel.LLILLL = null;
            }
        } else if (Intrinsics.LJFF(c291001Au.LIZ(), Boolean.TRUE)) {
            MessageListFooterViewModel messageListFooterViewModel2 = (MessageListFooterViewModel) awS101S0400000_2.l0;
            if (messageListFooterViewModel2.LLILLL == null) {
                C1684506ih c1684506ih2 = new C1684506ih();
                c1684506ih2.LIZ((SessionInfo) awS101S0400000_2.l1);
                String str = preshownStickerSceneConfig.sceneId;
                if (str == null) {
                    str = "preshown_sticker";
                }
                c1684506ih2.LIZJ = str;
                c1684506ih2.LIZLLL(20);
                c1684506ih2.LIZJ((Context) awS101S0400000_2.l2);
                ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility2 = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL((UIAssem) awS101S0400000_2.l3), ChatRoomFakeMsgOperatorAbility.class, null);
                if (chatRoomFakeMsgOperatorAbility2 != null) {
                    chatRoomFakeMsgOperatorAbility2.yl2(c1684506ih2, null);
                }
                messageListFooterViewModel2.LLILLL = c1684506ih2;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((ChatDetailFragment) awS101S0400000_2.l0, new AwS581S0100000_2((AnonymousClass0616) awS101S0400000_2.l1, 51));
        assembler.QQ2((ChatDetailFragment) awS101S0400000_2.l0, AFwS229S0000000_2.get$arr$(37));
        assembler.RQ2((ChatDetailFragment) awS101S0400000_2.l0, new AwS581S0100000_2((IMAIBotInfo) awS101S0400000_2.l2, 52));
        assembler.RQ2((ChatDetailFragment) awS101S0400000_2.l0, new AwS581S0100000_2((IMAIBotInfo) awS101S0400000_2.l2, 53));
        assembler.RQ2((ChatDetailFragment) awS101S0400000_2.l0, AFwS229S0000000_2.get$arr$(38));
        assembler.RQ2((ChatDetailFragment) awS101S0400000_2.l0, AFwS229S0000000_2.get$arr$(39));
        assembler.RQ2((ChatDetailFragment) awS101S0400000_2.l0, AFwS229S0000000_2.get$arr$(40));
        assembler.QQ2((ChatDetailFragment) awS101S0400000_2.l0, new AwS581S0100000_2((View) awS101S0400000_2.l3, 54));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.RQ2((Fragment) awS101S0400000_2.l0, new AwS581S0100000_2((C13IQ) awS101S0400000_2.l1, (C13IQ<? extends UISlotAssem>) 86));
        assembler.vQ2((Fragment) awS101S0400000_2.l0, new AwS581S0100000_2((C13IQ) awS101S0400000_2.l2, (C13IQ<? extends UISlotAssem>) 88));
        if (C1147304eF.LIZ()) {
            assembler.vQ2((Fragment) awS101S0400000_2.l0, new AwS581S0100000_2((C13IQ) awS101S0400000_2.l3, (C13IQ<? extends UISlotAssem>) 89));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$5(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        ViewParent parent;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ((ChatRoomAssembler) awS101S0400000_2.l0).LJIIIZ = (IMGroupChatApi) obj;
        View view = (View) ((C259800zU) awS101S0400000_2.l1).element;
        ViewParent parent2 = null;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ((View) ((C259800zU) awS101S0400000_2.l1).element, viewGroup2);
        }
        View view2 = (View) ((C259800zU) awS101S0400000_2.l2).element;
        if (view2 != null) {
            parent2 = view2.getParent();
        }
        if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
            C786410Ut5.LJJJLZIJ((View) ((C259800zU) awS101S0400000_2.l2).element, viewGroup);
        }
        ((Function0) awS101S0400000_2.l3).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((MFBizIconsAssem) awS101S0400000_2.l0, AFwS229S0000000_2.get$arr$(399));
        assembler.QQ2((MFBizIconsAssem) awS101S0400000_2.l0, new AwS368S0200000_2((View) awS101S0400000_2.l3, (C13IQ) awS101S0400000_2.l2, 50));
        ((Function1) awS101S0400000_2.l1).invoke(EnumC12936054k.STORY_TOOLBAR_ASSEM);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiScrollBottomBarComponent) awS101S0400000_2.l0, new AwS581S0100000_2((C1184530gvj) awS101S0400000_2.l1, 418));
        assembler.EQ2((PoiScrollBottomBarComponent) awS101S0400000_2.l0, new AwS581S0100000_2((PoiButton) awS101S0400000_2.l2, 419));
        assembler.RQ2((PoiScrollBottomBarComponent) awS101S0400000_2.l0, new AwS581S0100000_2((FrameLayout) awS101S0400000_2.l3, 420));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiRectangleBottomBarComponent) awS101S0400000_2.l0, new AwS581S0100000_2((C1184530gvj) awS101S0400000_2.l1, 432));
        assembler.EQ2((PoiRectangleBottomBarComponent) awS101S0400000_2.l0, new AwS581S0100000_2((PoiButton) awS101S0400000_2.l2, 433));
        assembler.RQ2((PoiRectangleBottomBarComponent) awS101S0400000_2.l0, new AwS581S0100000_2((FrameLayout) awS101S0400000_2.l3, 434));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS101S0400000_2 awS101S0400000_2, Object obj) {
        PopupManager.LJIIZILJ(new C1734206qi((Context) awS101S0400000_2.l0, (FragmentManager) awS101S0400000_2.l1, (String) ((Pair) awS101S0400000_2.l2).getFirst(), (EnumC1665006fY) ((Pair) awS101S0400000_2.l2).getSecond(), (Pair) obj, (InboxFragmentV2) awS101S0400000_2.l3), new C1668306g5("professional_inbox_upgrade_guide"));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(InterfaceC497601wk interfaceC497601wk, C05P0 c05p0, C1690080u58 c1690080u58, n0 n0Var, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = c05p0;
        this.l2 = c1690080u58;
        this.l3 = n0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(Activity activity, C869590Y9l c869590Y9l, SessionInfo sessionInfo, IMUser iMUser, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = iMUser;
        this.l2 = c869590Y9l;
        this.l3 = sessionInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S0400000_2(Context context, Context context2, FragmentManager fragmentManager, Pair<String, ? extends EnumC1665006fY> pair, InboxFragmentV2 inboxFragmentV2) {
        super(1);
        this.$t = inboxFragmentV2;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = fragmentManager;
        this.l3 = pair;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S0400000_2(Fragment fragment, Fragment fragment2, C13IQ<? extends UISlotAssem> c13iq, C13IQ<? extends AbstractC738140SxQ> c13iq2, C13IQ<? extends AbstractC738140SxQ> c13iq3) {
        super(1);
        this.$t = c13iq3;
        this.l0 = fragment;
        this.l1 = fragment2;
        this.l2 = c13iq;
        this.l3 = c13iq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S0400000_2(UIAssem uIAssem, UIAssem uIAssem2, Function1<? super C0SZ5, Unit> function1, FrameLayout frameLayout, Function1<? super C0SZ5, Unit> function12) {
        super(1);
        this.$t = function12;
        this.l0 = uIAssem;
        this.l1 = uIAssem2;
        this.l2 = function1;
        this.l3 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(ChatRoomAssembler chatRoomAssembler, C259800zU c259800zU, C259800zU c259800zU2, AwS546S0100000_2 awS546S0100000_2, int i) {
        super(1);
        this.$t = i;
        this.l0 = chatRoomAssembler;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
        this.l3 = awS546S0100000_2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(MessageListFooterViewModel messageListFooterViewModel, SessionInfo sessionInfo, Context context, UIAssem uIAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = messageListFooterViewModel;
        this.l1 = sessionInfo;
        this.l2 = context;
        this.l3 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(ChatDetailFragment chatDetailFragment, AnonymousClass0616 anonymousClass0616, IMAIBotInfo iMAIBotInfo, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = chatDetailFragment;
        this.l1 = anonymousClass0616;
        this.l2 = iMAIBotInfo;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(ChatFeatureListConf chatFeatureListConf, Fragment fragment, C909290Zln c909290Zln, SingleChatAssem singleChatAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = chatFeatureListConf;
        this.l1 = fragment;
        this.l2 = c909290Zln;
        this.l3 = singleChatAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S0400000_2(MFBizIconsAssem mFBizIconsAssem, MFBizIconsAssem mFBizIconsAssem2, Function1<? super EnumC12936054k, Unit> function1, C13IQ<? extends UIContentAssem> c13iq, View view) {
        super(1);
        this.$t = view;
        this.l0 = mFBizIconsAssem;
        this.l1 = mFBizIconsAssem2;
        this.l2 = function1;
        this.l3 = c13iq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(PoiDetailHeaderDynamicButtonAssem poiDetailHeaderDynamicButtonAssem, C1184530gvj c1184530gvj, PoiButton poiButton, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiDetailHeaderDynamicButtonAssem;
        this.l1 = c1184530gvj;
        this.l2 = poiButton;
        this.l3 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(PoiScrollBottomBarComponent poiScrollBottomBarComponent, C1184530gvj c1184530gvj, PoiButton poiButton, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiScrollBottomBarComponent;
        this.l1 = c1184530gvj;
        this.l2 = poiButton;
        this.l3 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(PoiRectangleBottomBarComponent poiRectangleBottomBarComponent, C1184530gvj c1184530gvj, PoiButton poiButton, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiRectangleBottomBarComponent;
        this.l1 = c1184530gvj;
        this.l2 = poiButton;
        this.l3 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(NavBarRightButtonsAssem navBarRightButtonsAssem, C1184530gvj c1184530gvj, PoiButton poiButton, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = navBarRightButtonsAssem;
        this.l1 = c1184530gvj;
        this.l2 = poiButton;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S0400000_2(File file, File file2, C118300cf c118300cf, List<File> list, File file3) {
        super(1);
        this.$t = file3;
        this.l0 = file;
        this.l1 = file2;
        this.l2 = c118300cf;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS101S0400000_2(Function2 function2, Function2<? super String, ? super String, Unit> function22, LauncherShortcutService launcherShortcutService, Context context, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = function2;
        this.l1 = function22;
        this.l2 = launcherShortcutService;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S0400000_2(AwS192S1100000_13 awS192S1100000_13, LauncherShortcutService launcherShortcutService, Context context, C816040Vzm c816040Vzm, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS192S1100000_13;
        this.l1 = launcherShortcutService;
        this.l2 = context;
        this.l3 = c816040Vzm;
    }
}
