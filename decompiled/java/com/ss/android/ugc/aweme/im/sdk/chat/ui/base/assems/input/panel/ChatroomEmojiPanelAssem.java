package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C05YD;
import X.C06PF;
import X.C06PG;
import X.C0BB2;
import X.C0I06;
import X.C0I0B;
import X.C0QSJ;
import X.C1220000hqw;
import X.C127G;
import X.C1389890mGx;
import X.C13LE;
import X.C1400340mXo;
import X.C1440005kM;
import X.C14EU;
import X.C15580068c;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2038107yd;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2273121DyA;
import X.C23250099c;
import X.C289850BXr;
import X.C443950Haz;
import X.C450210Hl5;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C457180HwK;
import X.C457770HxH;
import X.C457780HxI;
import X.C458060Hxk;
import X.C458080Hxm;
import X.C458090Hxn;
import X.C494501wF;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.EnumC2038207ye;
import X.InterfaceC1146704e9;
import X.InterfaceC1632206aG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC450290HlD;
import X.InterfaceC453710Hqj;
import Y.AObjectS59S0000000_6;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.emoji.common.emojipagev2.EmojiPanelShowingStateVM;
import com.ss.android.ugc.aweme.im.common.model.SubscriptionStatus;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatroomHeightViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.viewmodel.IMStickerPanelEventVMAbility;
import com.ss.android.ugc.aweme.viewmodel.Photo2StickerCreateEventAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS442S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes7.dex */
public final class ChatroomEmojiPanelAssem extends BaseEmojiPanelAssem implements C0I06, IMStickerPanelEventVMAbility, InterfaceC1146704e9 {
    public static final C458090Hxn LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C19719912Dl LLJJJ = C13LE.LIZ(InterfaceC1632206aG.class);
    public final C1559260qg8 LLJJJIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJJJ;
    public final C736950SvV LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public volatile InterfaceC450290HlD LLJLIL;
    public C127G LLJLILLLLZIIL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Hxn] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatroomEmojiPanelAssem.class, "chatroomHeightVM", "getChatroomHeightVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/ChatroomHeightViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(ChatroomEmojiPanelAssem.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0), new C2217381BqS(ChatroomEmojiPanelAssem.class, "emojiPanelShowingStateVM", "getEmojiPanelShowingStateVM()Lcom/ss/android/ugc/aweme/emoji/common/emojipagev2/EmojiPanelShowingStateVM;", 0), new C2217381BqS(ChatroomEmojiPanelAssem.class, "stickersRepository", "getStickersRepository()Lcom/ss/android/ugc/aweme/im/sticker/api/repo/IMStickerRepository;", 0), new C2217381BqS(ChatroomEmojiPanelAssem.class, "messageListVM", "getMessageListVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0)};
        LLJLL = new Object() { // from class: X.0Hxn
        };
    }

    @Override // X.C0I06
    public final Integer Ga() {
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

    public ChatroomEmojiPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatroomHeightViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 259), AFwS236S0000000_6.get$arr$(132), null, true);
        C458060Hxk c458060Hxk = new C458060Hxk(this);
        this.LLJJJJJIL = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), c458060Hxk, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(136), new AwS550S0100000_6((AbstractC738140SxQ) this, 263), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SendMessageVM.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 260), AFwS236S0000000_6.get$arr$(133), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(EmojiPanelShowingStateVM.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ3, 261), AFwS236S0000000_6.get$arr$(134), null, true);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(86));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(IIMessageListViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ4, 262), AFwS236S0000000_6.get$arr$(135), null, true);
    }

    @Override // X.C0I06
    public final int fJ() {
        Keva kevaLIZ = C458080Hxm.LIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emoji_type");
        sbLIZ.append(curUserId);
        return kevaLIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), -1);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLILLLLZIIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLILLLLZIIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IIMessageListViewModel.class, new AObjectS59S0000000_6(this, 1)}, defaultViewModelProviderFactory);
                    this.LLJLILLLLZIIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.C0I06
    public final long hN() {
        Keva kevaLIZ = C458080Hxm.LIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sticker_set_id");
        sbLIZ.append(curUserId);
        return kevaLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C15580068c.LIZ.getClass();
        C15580068c.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C15580068c.LIZ.getClass();
        C15580068c.LIZIZ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IMStickerPanelEventVMAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.BaseEmojiPanelAssem, com.ss.android.ugc.aweme.im.assem.BasePanelAssem
    public final C19719912Dl ip() {
        return this.LLJJJ;
    }

    @Override // X.C0I06
    public final void Dg(int i) {
        Keva kevaLIZ = C458080Hxm.LIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emoji_type");
        sbLIZ.append(curUserId);
        kevaLIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    @Override // X.C0I06
    public final void c8(long j) {
        Keva kevaLIZ = C458080Hxm.LIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sticker_set_id");
        sbLIZ.append(curUserId);
        kevaLIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }

    @Override // X.C0I06
    public final void la(int i) {
        Keva kevaLIZ = C458080Hxm.LIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scroll_offset");
        sbLIZ.append(curUserId);
        kevaLIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        view.getLayoutParams().height = -1;
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        boolean z = false;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Hxl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C458160Hxu) obj).LL);
            }
        }, null, new AwS442S0200000_6(view, this, 1), 6);
        LLJLL.getClass();
        if (((Number) C289850BXr.LIZ.getValue()).intValue() == 2) {
            z = true;
        }
        if (z) {
            ChatroomEmojiPanelAssem$Companion$tryPreloadStickerResourceOnResume$lifecycleObserver$1 chatroomEmojiPanelAssem$Companion$tryPreloadStickerResourceOnResume$lifecycleObserver$1 = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomEmojiPanelAssem$Companion$tryPreloadStickerResourceOnResume$lifecycleObserver$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJJIIJ(null);
                    }
                }
            };
            IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJJIIJ(null);
            getLifecycle().addObserver(chatroomEmojiPanelAssem$Companion$tryPreloadStickerResourceOnResume$lifecycleObserver$1);
        }
        ViewGroup viewGroup = (ViewGroup) LJJIJL().findViewById(R.id.ui_slot_panel_container);
        boolean zBooleanValue = ((Boolean) C2273121DyA.LIZIZ.getValue()).booleanValue();
        if (zBooleanValue) {
            final AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 257);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomEmojiPanelAssem$Companion$subscribeToUseStickerSetEventBeforeAssemble$lifecycleObserver$1
                @C14EU(threadMode = ThreadMode.MAIN)
                public final void onUseStickerSet(C443950Haz c443950Haz) {
                    C15580068c.LIZ.getClass();
                    C15580068c.LIZIZ(this);
                    this.getLifecycle().removeObserver(this);
                    EventBus.LIZLLL().LJIJ(c443950Haz);
                    awS550S0100000_6.invoke();
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C15580068c.LIZ.getClass();
                        C15580068c.LIZIZ(this);
                    }
                }
            };
            C15580068c.LIZ.getClass();
            C15580068c.LIZ(lifecycleEventObserver);
            getLifecycle().addObserver(lifecycleEventObserver);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) C494501wF.LIZ.getValue(), null, new C06PF(this, viewGroup, R.attr.zq, zBooleanValue, null), 2);
        } else {
            kp(this, viewGroup, R.attr.zq, zBooleanValue);
        }
        AssemViewModel value = this.LLJJJJJIL.getValue();
        subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new AwS620S0100000_6(this, 27));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C06PG(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C450210Hl5(this, null), 3);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void stickerCreationComplete(C2038107yd c2038107yd) {
        Object ability;
        C05YD<Boolean> canOpenStickerPanelUponCreationEvent;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this), ChatRoomScope.class);
        Object obj = null;
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(Photo2StickerCreateEventAbility.class);
        } else {
            ability = null;
        }
        if (ability instanceof Photo2StickerCreateEventAbility) {
            obj = ability;
        }
        Photo2StickerCreateEventAbility photo2StickerCreateEventAbility = (Photo2StickerCreateEventAbility) obj;
        if (c2038107yd.LIZ == EnumC2038207ye.VIDEO_STICKER || (C0BB2.LIZ() && photo2StickerCreateEventAbility != null && (canOpenStickerPanelUponCreationEvent = photo2StickerCreateEventAbility.getCanOpenStickerPanelUponCreationEvent()) != null && canOpenStickerPanelUponCreationEvent.getValue().booleanValue() && c2038107yd.LIZ == EnumC2038207ye.PHOTO_STICKER)) {
            if (photo2StickerCreateEventAbility != null) {
                photo2StickerCreateEventAbility.setCanOpenStickerPanel(false);
            }
            C1440005kM.LIZ(new C443950Haz(new StickerSetInfo(null, null, null, null, 7, null, null, null, null, null, null, null, null, null, SubscriptionStatus.UNKNOWN, null, null, null, null, null, null, "click", "icon", null)));
            C1389890mGx c1389890mGx = new C1389890mGx(getContentView());
            c1389890mGx.LJIIIZ(2131848838);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.C0I06
    public final void z4(int i) {
        Keva kevaLIZ = C458080Hxm.LIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scroll_position");
        sbLIZ.append(curUserId);
        kevaLIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    public static final void kp(ChatroomEmojiPanelAssem chatroomEmojiPanelAssem, ViewGroup viewGroup, int i, boolean z) {
        C457770HxH c457770HxH = InterfaceC453710Hqj.LIZ;
        LifecycleOwnerKt.getLifecycleScope(chatroomEmojiPanelAssem);
        C457180HwK c457180HwK = new C457180HwK(chatroomEmojiPanelAssem, z, i, chatroomEmojiPanelAssem);
        c457770HxH.getClass();
        C457770HxH.LIZ(viewGroup, c457180HwK);
        C458090Hxn c458090Hxn = LLJLL;
        final AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(chatroomEmojiPanelAssem, 258);
        c458090Hxn.getClass();
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomEmojiPanelAssem$Companion$subscribeToUseStickerSetEvent$lifecycleObserver$1
            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onUseStickerSet(C443950Haz c443950Haz) {
                awS550S0100000_6.invoke();
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C15580068c.LIZ.getClass();
                    C15580068c.LIZIZ(this);
                }
            }
        };
        C15580068c.LIZ.getClass();
        C15580068c.LIZ(lifecycleEventObserver);
        chatroomEmojiPanelAssem.getLifecycle().addObserver(lifecycleEventObserver);
    }
}
