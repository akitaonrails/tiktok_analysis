package com.ss.android.ugc.aweme.chatnotice;

import X.C019F;
import X.C01GW;
import X.C067L;
import X.C067X;
import X.C068I;
import X.C068K;
import X.C069E;
import X.C06AH;
import X.C06LC;
import X.C06NK;
import X.C06O6;
import X.C06O9;
import X.C06OD;
import X.C06OO;
import X.C06SA;
import X.C09R3;
import X.C0QSJ;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z6T;
import X.C0ZFW;
import X.C1229100i5c;
import X.C127G;
import X.C13LE;
import X.C1509305vX;
import X.C1509705vb;
import X.C1558520qew;
import X.C1559260qg8;
import X.C15606069c;
import X.C1600706On;
import X.C1601406Ou;
import X.C1632706aL;
import X.C1632806aM;
import X.C1632906aN;
import X.C1635606ao;
import X.C1636306av;
import X.C1637806bA;
import X.C1637906bB;
import X.C1638806bK;
import X.C1639006bM;
import X.C1649806d6;
import X.C1692806k2;
import X.C1697810uHb;
import X.C1698906l1;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C899270ZPp;
import X.C913140Zs0;
import X.EnumC1596306Mv;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import X.InterfaceC876950Yaj;
import X.InterfaceC904740ZeS;
import Y.AObjectS378S0100000_2;
import Y.AObjectS55S0000000_2;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.chatnotice.banner.ShareGroupForAIGroupShotPopup;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.group.ChatConvUpdateVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.IMChatNoticeHandlerFactory;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.tools.IMMediaPublishEventApi;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.QuickChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.publicgroup.preview.ChatPreviewModeVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupChatNoticeAssem extends CommonChatNoticeAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLJ;
    public final C1559260qg8 LLLIIIL = new C1559260qg8(new C723590SZx(this, C15606069c.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLLIIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLLIILIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 86));
    public final C01GW LLLIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 83));
    public final C01GW LLLILZ = C1509305vX.LIZ(new AwS546S0100000_2(this, 82));
    public final AssemVMLazy LLLILZJ = C06LC.LIZ(this);
    public final AssemVMLazy LLLILZLLLI;
    public final AssemVMLazy LLLIZZ;
    public final AssemVMLazy LLLJ;
    public final AssemVMLazy LLLJIL;
    public final AssemVMLazy LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public C1638806bK LLLLIIL;
    public final C01GW LLLLIILL;
    public C127G LLLLIILLL;
    public InterfaceC665370Q7z LLLLIL;
    public C0QSJ LLLLILI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupChatNoticeAssem.class, "groupChatNoticeViewModel", "getGroupChatNoticeViewModel()Lcom/ss/android/ugc/aweme/chatnotice/GroupChatNoticeViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GroupChatNoticeAssem.class, "chatConvUpdateVM", "getChatConvUpdateVM()Lcom/ss/android/ugc/aweme/group/ChatConvUpdateVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(GroupChatNoticeAssem.class, "groupChatViewModel", "getGroupChatViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/group/GroupChatVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(GroupChatNoticeAssem.class, "quickChatViewModel", "getQuickChatViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quickinteraction/viewmodel/QuickChatViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(GroupChatNoticeAssem.class, "chatRoomCameraVM", "getChatRoomCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(GroupChatNoticeAssem.class, "previewModeVM", "getPreviewModeVM()Lcom/ss/android/ugc/aweme/publicgroup/preview/ChatPreviewModeVM;", 0);
        c09r3.getClass();
        LLLLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public GroupChatNoticeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatConvUpdateVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLILZLLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 96), AFwS229S0000000_2.get$arr$(98), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GroupChatVM.class);
        this.LLLIZZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 79), AFwS229S0000000_2.get$arr$(94), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(QuickChatViewModel.class);
        this.LLLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 81), AFwS229S0000000_2.get$arr$(95), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ChatRoomCameraVM.class);
        this.LLLJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ4, 84), AFwS229S0000000_2.get$arr$(96), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(ChatPreviewModeVM.class);
        this.LLLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ5, 85), AFwS229S0000000_2.get$arr$(97), null, true);
        this.LLLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 80));
        this.LLLLII = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(194));
        this.LLLLIIIILLL = C1509305vX.LIZ(AFwS187S0000000_2.get$arr$(195));
        this.LLLLIILL = C1509305vX.LIZ(new AwS546S0100000_2(this, 87));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem
    public final String hp() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem
    public final String kp() {
        return "";
    }

    public final C913140Zs0 Ap() {
        return (C913140Zs0) this.LLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        final C1600706On c1600706On = new C1600706On(new C06O9(C452501pT.LIZIZ(new AwS546S0100000_2(this, 89)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 90)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 91)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 92)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 93))), C067L.GROUP, getContext(), C724240Sb0.LIZ(this), C724240Sb0.LJI(this), C1558520qew.LJIIL(this), Ap(), ((Boolean) this.LLLIILIL.getValue()).booleanValue(), C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(196)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 94)), null, Vo(C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(197)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 95))));
        C1638806bK c1638806bK = new C1638806bK(c1600706On, new C1632906aN(this), new C1632806aM(this));
        this.LLLLIIL = c1638806bK;
        cp().IQ2(c1600706On, C1697810uHb.LJIILJJIL(new C06O6<C06OO>(c1600706On) { // from class: X.06bq
            public final C1600706On LLILZ;
            public final C1634706af LLILZIL;
            public C1684506ih LLILZLL;
            public final C06OC LLIZ;
            public final Set<EnumC1596306Mv> LLIZLLLIL;
            public final Set<C067L> LLJ;

            @Override // X.C06O6
            public final boolean LIZLLL() {
                if (!C369001c0.LIZ()) {
                    return false;
                }
                List<C869590Y9l> listOM0 = this.LLILZIL.LJIILJJIL.getValue().OM0();
                ArrayList arrayList = new ArrayList();
                for (C869590Y9l c869590Y9l : listOM0) {
                    C869590Y9l c869590Y9l2 = c869590Y9l;
                    if (!C0ZDX.LJJIJIL(c869590Y9l2) && !C068M.LIZ(c869590Y9l2) && !C0ZDX.LJJJJL(c869590Y9l2)) {
                        arrayList.add(c869590Y9l);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((C869590Y9l) next).getSender() == C461720I8s.LIZJ()) {
                        if (next != null) {
                            C12858051k.LIZIZ(this.LLILZ.LJI.getConversationId(), "send_msg_recently");
                            return false;
                        }
                    }
                }
                return true;
            }

            @Override // X.AnonymousClass0684
            public final Set<EnumC1596306Mv> LIZIZ() {
                return this.LLIZLLLIL;
            }

            @Override // X.C06O6
            public final C067K LJI() {
                return this.LLIZ;
            }

            @Override // X.C06O6
            public final Set<C067L> LJII() {
                return this.LLJ;
            }

            {
                super(c1600706On);
                this.LLILZ = c1600706On;
                this.LLILZIL = (C1634706af) c1600706On.LJIIJJI;
                this.LLIZ = new C06OC(R.layout.cik);
                this.LLIZLLLIL = Collections.singleton(EnumC1596306Mv.GROUP_SHARE_POST_BANNER);
                this.LLJ = Collections.singleton(C067L.GROUP);
            }

            @Override // X.C06O6
            public final void LJIIIZ(C06OO c06oo) {
                C1684506ih c1684506ih = this.LLILZLL;
                if (c1684506ih != null) {
                    ((ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZJ(this.LLILZ.LJFF, ChatRoomFakeMsgOperatorAbility.class)).y52(c1684506ih, null);
                    this.LLILZLL = null;
                }
            }

            @Override // X.C06O6
            public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
                if (C1647306ch.LIZLLL()) {
                    C0ZLD.LIZ.getClass();
                    C0ZLD c0zldLIZ = C0ZLE.LIZ();
                    if (c0zldLIZ != null && c0zldLIZ.LIZLLL()) {
                        return C06OI.LIZ;
                    }
                }
                if (C1646706cb.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILZ.LJI.getConversationId()))) {
                    return C06OI.LIZ;
                }
                return new C06OH("Checks failed");
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
            @Override // X.C06O6
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJIIJ(X.C06OO r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof X.C1642106br
                    if (r0 == 0) goto L5d
                    r4 = r7
                    X.06br r4 = (X.C1642106br) r4
                    int r2 = r4.LLILLL
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L5d
                    int r2 = r2 - r1
                    r4.LLILLL = r2
                L12:
                    java.lang.Object r3 = r4.LL
                    java.lang.Object r2 = X.C099R.LJFF()
                    int r1 = r4.LLILLL
                    r0 = 1
                    if (r1 == 0) goto L53
                    if (r1 != r0) goto L63
                    X.C155000ia.LIZIZ(r3)
                L22:
                    X.06ih r2 = new X.06ih
                    r2.<init>()
                    X.06On r0 = r5.LLILZ
                    com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LJI
                    r2.LIZ(r0)
                    java.lang.String r0 = "group_share_post_banner_fake_msg_uuid"
                    r2.LIZJ = r0
                    r0 = 28
                    r2.LIZLLL(r0)
                    X.06On r0 = r5.LLILZ
                    android.content.Context r0 = r0.LIZJ
                    r2.LIZJ(r0)
                    X.06On r0 = r5.LLILZ
                    X.0Q7z r1 = r0.LJFF
                    java.lang.Class<com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility> r0 = com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility.class
                    X.01wD r1 = X.C1558520qew.LIZJ(r1, r0)
                    com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility r1 = (com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility) r1
                    r0 = 0
                    r1.yl2(r2, r0)
                    r5.LLILZLL = r2
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                L53:
                    X.C155000ia.LIZIZ(r3)
                    r4.LLILLL = r0
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    if (r0 != r2) goto L22
                    return r2
                L5d:
                    X.06br r4 = new X.06br
                    r4.<init>(r5, r7)
                    goto L12
                L63:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1642006bq.LJIIJ(X.06OO, X.05Vn):java.lang.Object");
            }
        }, c1638806bK, new C06O6<C06AH>(c1600706On) { // from class: X.069J
            public final C1600706On LLILZ;
            public final C01GW LLILZIL;
            public final Set<C067L> LLILZLL;
            public final Set<EnumC1596306Mv> LLIZ;

            @Override // X.C06O6
            public final boolean LIZLLL() {
                return true;
            }

            @Override // X.C06O6
            public final C067K LJI() {
                return (C067K) this.LLILZIL.getValue();
            }

            @Override // X.AnonymousClass0684
            public final Set<EnumC1596306Mv> LIZIZ() {
                return this.LLIZ;
            }

            @Override // X.C06O6
            public final Set<C067L> LJII() {
                return this.LLILZLL;
            }

            {
                super(c1600706On);
                this.LLILZ = c1600706On;
                this.LLILZIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1088));
                this.LLILZLL = Collections.singleton(C067L.GROUP);
                this.LLIZ = Collections.singleton(EnumC1596306Mv.TURN_ON_GO_LIVE_NOTIFICATION_GUIDE_CARD_BANNER);
            }

            @Override // X.C06O6
            public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
                return C06OI.LIZ;
            }

            @Override // X.C06O6
            public final Object LJIIJ(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
                C1684506ih c1684506ih = new C1684506ih();
                c1684506ih.LIZLLL(54);
                c1684506ih.LIZLLL = 0L;
                c1684506ih.LIZJ = "turn_on_go_live_notification_guide_card_fake_msg_uuid";
                FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
                if (fakeMsgOperatorService != null) {
                    fakeMsgOperatorService.LIZIZ(this.LLILZ.LJI.getConversationId(), c1684506ih, this.LLILZ.LJI.getUuid(), null, null);
                }
                return Unit.LIZ;
            }
        }, new C1692806k2(c1600706On)));
        up();
        cp().yQ2(new C067X(this, null), true);
        if (Ap().isPreviewMode()) {
            AssemVMLazy assemVMLazy = this.LLLJL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLJ;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZPW
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C899290ZPr) obj).LL;
                }
            }, null, new AwS616S0100000_2(this, 82), 6);
        }
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.06aO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C069B) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 78), 4);
        AssemVMLazy assemVMLazy2 = this.LLLILZLLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLLLJ;
        ((ChatConvUpdateVM) assemVMLazy2.getValue()).LLILZLL.put(this, new C069E(zp()));
        C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.069b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C15604069a) obj).LL);
            }
        }, null, new AwS616S0100000_2(this, 79), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLLIZZ.getValue(), new C2217381BqS() { // from class: X.06eH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1657506eL) obj).LLILZ);
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 80), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLLIZZ.getValue(), new C2217381BqS() { // from class: X.06e9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657506eL) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 81), 4);
        IMMediaPublishEventApi iMMediaPublishEventApi = (IMMediaPublishEventApi) this.LLLLII.getValue();
        if (iMMediaPublishEventApi != null) {
            iMMediaPublishEventApi.LJ(new AwS546S0100000_2(this, 88));
        }
        IMMediaPublishEventApi iMMediaPublishEventApi2 = (IMMediaPublishEventApi) this.LLLLII.getValue();
        if (iMMediaPublishEventApi2 != null) {
            iMMediaPublishEventApi2.LIZ();
        }
    }

    public final GroupChatNoticeViewModel zp() {
        AssemVMLazy assemVMLazy = this.LLLILZJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLJ;
        return (GroupChatNoticeViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLLIILLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLLIILLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{GroupChatVM.class, new AObjectS378S0100000_2(this, 3), ChatPreviewModeVM.class, new AObjectS55S0000000_2(this, 22)}, defaultViewModelProviderFactory);
                    this.LLLLIILLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IMMediaPublishEventApi iMMediaPublishEventApi = (IMMediaPublishEventApi) this.LLLLII.getValue();
        if (iMMediaPublishEventApi != null) {
            iMMediaPublishEventApi.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, X.AbstractC738140SxQ
    public final void onResume() {
        C0Y8T c0y8tLIZ;
        super.onResume();
        C1638806bK c1638806bK = this.LLLLIIL;
        if (c1638806bK == null || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c1638806bK.LLILZ.LJI.getConversationId())) == null || !C1229100i5c.LJII(c0y8tLIZ.getConversationId()) || Intrinsics.LJFF(C0ZFW.LIZ.LJJIIJ(c0y8tLIZ.getConversationId()), Boolean.TRUE) || c0y8tLIZ.isMember() || c0y8tLIZ.isDissolved()) {
            return;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) c1638806bK.LLIZLLLIL.getValue(), null, null, new C1639006bM(c0y8tLIZ, c1638806bK, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem
    public final void up() {
        EnterChatParams enterChatParams;
        super.up();
        zp().LL.LJIIIZ(new C1649806d6(this, Ap(), (ViewGroup) this.LLJILJIL.getValue()));
        AssemVMLazy assemVMLazy = this.LLLJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLJ;
        if (((ChatRoomCameraVM) assemVMLazy.getValue()).Ei0() && !C1636306av.LIZ()) {
            IMChatNoticeHandlerFactory.LIZ.getClass();
            IMChatNoticeHandlerFactory value = C1632706aL.LIZIZ.getValue();
            if (value != null) {
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                C1698906l1 c1698906l1LIZ = value.LIZ(fragmentLJI != null ? fragmentLJI.getActivity() : null, Ap(), ip());
                if (c1698906l1LIZ != null) {
                    zp().LL.LJIIIZ(c1698906l1LIZ);
                }
            }
        }
        if (((C0Z6T) this.LLLLIIIILLL.getValue()).LJ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ((String) this.LLLILZ.getValue())) && (enterChatParams = ((C457780HxI) this.LLLIIL.getValue()).LLILLL) != null && C899270ZPp.LIZ(enterChatParams)) {
            GroupChatNoticeViewModel groupChatNoticeViewModelZp = zp();
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            final C19EG activity = fragmentLJI2 != null ? fragmentLJI2.getActivity() : null;
            final C913140Zs0 c913140Zs0Ap = Ap();
            groupChatNoticeViewModelZp.LL.LJIIIZ(new C06OD<C06OO>(activity, c913140Zs0Ap) { // from class: X.06Uo
                public final C1616506Up LLILLL;
                public boolean LLILZ;

                @Override // X.C06OD
                public final void LIZLLL() {
                    TuxSheet tuxSheet;
                    C1616506Up c1616506Up = this.LLILLL;
                    if (c1616506Up == null || (tuxSheet = c1616506Up.LLILZ) == null || tuxSheet.isStateSaved()) {
                        return;
                    }
                    TuxSheet tuxSheet2 = c1616506Up.LLILZ;
                    if (tuxSheet2 != null) {
                        tuxSheet2.dismiss();
                    }
                    c1616506Up.LLZLI();
                }

                @Override // X.C06OD
                public final Object LJI(C06OO c06oo) {
                    C1616506Up c1616506Up = this.LLILLL;
                    if (c1616506Up != null) {
                        String str = ShareGroupForAIGroupShotPopup._pnsPageId;
                        C19EG c19eg = c1616506Up.LLILLJJLI;
                        String str2 = c1616506Up.LLILLL;
                        ShareGroupForAIGroupShotPopup shareGroupForAIGroupShotPopup = new ShareGroupForAIGroupShotPopup();
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("conversation_id", str2, bundle);
                        shareGroupForAIGroupShotPopup.setArguments(bundle);
                        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
                        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                        c1390920mIc.LIZ.LLJJIJI = shareGroupForAIGroupShotPopup;
                        c1390920mIc.LJIIIIZZ(4);
                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                        tuxSheet.LLJLILLLLZIIL = false;
                        tuxSheet.show(supportFragmentManager, "ShareGroupForAIGroupShotPopup");
                        IMCameraBridgeApi.LIZ.getClass();
                        IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
                        if (iMCameraBridgeApiLIZ != null) {
                            iMCameraBridgeApiLIZ.LJIIIZ(str2);
                        }
                        c1616506Up.LLILZ = tuxSheet;
                        this.LLILZ = true;
                        return c1616506Up;
                    }
                    return null;
                }

                {
                    super(EnumC1596306Mv.GROUP_SHOT_QR_SHARE_GROUP_POPUP);
                    if (activity != null) {
                        this.LLILLL = new C1616506Up(activity, c913140Zs0Ap.getConversationId());
                    }
                }

                @Override // X.C06OD
                public final Object LJII(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                    return Boolean.valueOf(!this.LLILZ);
                }
            });
        }
        if (C06NK.LIZ()) {
            return;
        }
        tp();
    }

    public final void Bp(boolean z) {
        if (z) {
            View view = (View) this.LLLLIILL.getValue();
            if (view.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = (View) this.LLLLIILL.getValue();
        if (view2.getVisibility() != 0) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        super.df1(interfaceC904740ZeS);
        GroupChatNoticeViewModel groupChatNoticeViewModelZp = zp();
        if (interfaceC904740ZeS instanceof C1509705vb) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(groupChatNoticeViewModelZp), null, null, new C068I((C1509705vb) interfaceC904740ZeS, groupChatNoticeViewModelZp, null), 3);
        } else {
            if (!(interfaceC904740ZeS instanceof C06SA)) {
                return;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(groupChatNoticeViewModelZp), null, null, new C068K((C06SA) interfaceC904740ZeS, groupChatNoticeViewModelZp, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC1596306Mv enumC1596306Mv;
        C0Y8T c0y8tLIZ;
        super.onViewCreated(view);
        if (Ap().isPreviewMode()) {
            enumC1596306Mv = EnumC1596306Mv.GROUP_PREVIEW_BOTTOM_BAR;
        } else {
            if (!((C0Z6T) this.LLLLIIIILLL.getValue()).LJIIJJI((String) this.LLLILZ.getValue())) {
                enumC1596306Mv = EnumC1596306Mv.GROUP_INVALID;
            }
            c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ((String) this.LLLILZ.getValue());
            if (c0y8tLIZ != null && Intrinsics.LJFF(((C0Z6T) this.LLLLIIIILLL.getValue()).LJI(c0y8tLIZ), C1635606ao.LIZ)) {
                Bp(false);
            }
            C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.06aX
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1636906b1) obj).LL;
                }
            }, null, new AwS616S0100000_2(this, 19), 6);
        }
        if (enumC1596306Mv != null) {
            C1601406Ou hidesComponents = enumC1596306Mv.getHidesComponents();
            yp(hidesComponents.LIZ, hidesComponents.LIZIZ, hidesComponents.LIZLLL, hidesComponents.LIZJ, hidesComponents.LJ);
        }
        c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ((String) this.LLLILZ.getValue());
        if (c0y8tLIZ != null) {
            Bp(false);
        }
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.06aX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1636906b1) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 19), 6);
    }
}
