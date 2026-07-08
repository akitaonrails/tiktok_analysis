package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation;

import X.AbstractC738140SxQ;
import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C06IT;
import X.C06OT;
import X.C09IC;
import X.C09R3;
import X.C0HV6;
import X.C0I0B;
import X.C0P0T;
import X.C0QSJ;
import X.C0WZX;
import X.C0YNP;
import X.C127G;
import X.C1308910kAL;
import X.C1391550mJd;
import X.C1391600mJi;
import X.C13LE;
import X.C13LP;
import X.C1400340mXo;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1628906Zj;
import X.C1636706az;
import X.C1637806bA;
import X.C1637906bB;
import X.C1677606ha;
import X.C1684506ih;
import X.C1713806nQ;
import X.C1807670x8n;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C1BNE;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C418440Gaw;
import X.C447840HhG;
import X.C447850HhH;
import X.C447900HhM;
import X.C447910HhN;
import X.C447940HhQ;
import X.C451050HmR;
import X.C451310Hmr;
import X.C452110Ho9;
import X.C452501pT;
import X.C452840HpK;
import X.C452850HpL;
import X.C452880HpO;
import X.C452950HpV;
import X.C453040Hpe;
import X.C453520HqQ;
import X.C453550HqT;
import X.C453560HqU;
import X.C454070HrJ;
import X.C457780HxI;
import X.C516501zn;
import X.C687700QyG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.EnumC1596306Mv;
import X.EnumC430090Gtj;
import X.EnumC451180Hme;
import X.EnumC452870HpN;
import X.EnumC452900HpQ;
import X.EnumC452930HpT;
import X.EnumC453020Hpc;
import X.EnumC454490Hrz;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346201Wa;
import X.InterfaceC452460Hoi;
import X.InterfaceC453160Hpq;
import X.InterfaceC453460HqK;
import X.InterfaceC453640Hqc;
import Y.ACListenerS110S0200000_6;
import Y.AObjectS59S0000000_6;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.chatnotice.feature.suggestedstickers.TypingRecommendationStickerDataVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IMEditTextAbility;
import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerRecommendationViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.analytics.ReplyToStickerAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IReplyToStickerAnalytics;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.viewmodel.MentionPanelStateViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class TypingRecommendationPanelAssem extends AbstractC738140SxQ implements InterfaceC453460HqK, InterfaceC453160Hpq, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final AssemVMLazy LLJI;
    public final C2252321DDq LLJIJIL;
    public final AnonymousClass0951 LLJILJIL;
    public C452850HpL LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public final Set<String> LLJJI;
    public boolean LLJJIII;
    public C0P0T LLJJIJI;
    public AnonymousClass0956 LLJJIJIIJIL;
    public AnonymousClass0956 LLJJIJIL;
    public C1684506ih LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public volatile InterfaceC452460Hoi LLJJJJJIL;
    public C127G LLJJJJLIIL;

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
    public final void onCreate() {
        InterfaceC346201Wa c516501zn;
        super.onCreate();
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this), ChatRoomScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(C0HV6.class) : null;
        if (!(ability instanceof C0HV6)) {
            ability = null;
        }
        C0HV6 c0hv6 = (C0HV6) ability;
        if (c0hv6 == null || (c516501zn = c0hv6.LJIILLIIL()) == null) {
            c516501zn = new C516501zn(EnumC430090Gtj.NORMAL, 1);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C447850HhH(this, c516501zn, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C447840HhG(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C447900HhM(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C447910HhN(uo().yQ2(), uo().AQ2(), uo().zQ2(), this, null), 3);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TypingRecommendationPanelAssem.class, "typingRecommendationVM", "getTypingRecommendationVM()Lcom/ss/android/ugc/aweme/viewmodel/ITypingRecommendationVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TypingRecommendationPanelAssem.class, "typingRecommendationPanelVM", "getTypingRecommendationPanelVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/typingrecommendation/TypingRecommendationPanelViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TypingRecommendationPanelAssem.class, "stickerDataVM", "getStickerDataVM()Lcom/ss/android/ugc/aweme/chatnotice/feature/suggestedstickers/TypingRecommendationStickerDataVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(TypingRecommendationPanelAssem.class, "mentionPanelStateVM", "getMentionPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/MentionPanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(TypingRecommendationPanelAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(TypingRecommendationPanelAssem.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(TypingRecommendationPanelAssem.class, "suggestedEmojiViewModel", "getSuggestedEmojiViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/suggestedemoji/SuggestedEmojiViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(TypingRecommendationPanelAssem.class, "chatNoticeVM", "getChatNoticeVM()Lcom/ss/android/ugc/aweme/im/prompts/api/chatnotice/flow/base/viewmodel/ICommonChatNoticeViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(TypingRecommendationPanelAssem.class, "typingRecommendStickerAnalytics", "getTypingRecommendStickerAnalytics()Lcom/ss/android/ugc/aweme/analytics/ITypingRecommendStickerAnalytics;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    public TypingRecommendationPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ITypingRecommendationVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 287), AFwS236S0000000_6.get$arr$(159), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TypingRecommendationPanelViewModel.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 288), AFwS236S0000000_6.get$arr$(160), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TypingRecommendationStickerDataVM.class);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ3, 289), AFwS236S0000000_6.get$arr$(161), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MentionPanelStateViewModel.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ4, 290), AFwS236S0000000_6.get$arr$(162), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLILZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ5, 291), AFwS236S0000000_6.get$arr$(157), null, true);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(SendMessageVM.class);
        this.LLIZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ6, 286), AFwS236S0000000_6.get$arr$(158), null, true);
        this.LLIZLLLIL = C1636706az.LIZ(this);
        this.LLJ = C452501pT.LIZIZ(new C452110Ho9(this));
        this.LLJI = C06IT.LIZ(this);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C452840HpK(false, null, null, null, null, null, null, null, 255));
        this.LLJIJIL = c2252321DDqLIZ;
        this.LLJILJIL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLJILJILJ = new C452850HpL(0);
        this.LLJJI = new LinkedHashSet();
    }

    public final void ho() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        ((TypingRecommendationStickerDataVM) assemVMLazy.getValue()).LL.setValue(null);
        ko();
        lo();
    }

    public final void ko() {
        if (this.LLJJJIL) {
            this.LLJJJIL = false;
            so().LL.setValue(Boolean.FALSE);
            C1684506ih c1684506ih = this.LLJJJ;
            if (c1684506ih != null) {
                ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ChatRoomFakeMsgOperatorAbility.class, null);
                if (chatRoomFakeMsgOperatorAbility != null) {
                    chatRoomFakeMsgOperatorAbility.y52(c1684506ih, null);
                }
                this.LLJJJ = null;
            }
        }
    }

    public final void lo() {
        if (this.LLJJJJ) {
            this.LLJJJJ = false;
            AssemVMLazy assemVMLazy = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
            ((TypingRecommendationStickerDataVM) assemVMLazy.getValue()).LL.setValue(null);
            oo().BQ2(EnumC1596306Mv.TYPING_RECOMMENDATION);
        }
    }

    public final ICommonChatNoticeViewModel oo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (ICommonChatNoticeViewModel) assemVMLazy.getValue();
    }

    public final TypingRecommendationPanelViewModel so() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (TypingRecommendationPanelViewModel) assemVMLazy.getValue();
    }

    public final ITypingRecommendationVM uo() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (ITypingRecommendationVM) assemVMLazy.getValue();
    }

    public final boolean vo() {
        Function0<Boolean> function0;
        ReplyToStickerRecommendationViewModel replyToStickerRecommendationViewModel = (ReplyToStickerRecommendationViewModel) this.LLJ.getValue();
        return (replyToStickerRecommendationViewModel == null || replyToStickerRecommendationViewModel.LLILZ == null || (function0 = replyToStickerRecommendationViewModel.LLILZLL) == null || !function0.invoke().booleanValue()) ? false : true;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJLIIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJLIIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ITypingRecommendationVM.class, new AObjectS59S0000000_6(this, 16)}, defaultViewModelProviderFactory);
                    this.LLJJJJLIIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJJIJIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        C0P0T c0p0t = this.LLJJIJI;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        this.LLJJIJI = null;
        ho();
        ko();
        try {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this), ChatRoomScope.class);
            Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(MessagePowerListAbility.class) : null;
            MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) (ability instanceof MessagePowerListAbility ? ability : null);
            if (messagePowerListAbility != null) {
                messagePowerListAbility.LLII();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void xo() {
        RecyclerView recyclerViewLLII;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this), ChatRoomScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(MessagePowerListAbility.class) : null;
        if (!(ability instanceof MessagePowerListAbility)) {
            ability = null;
        }
        MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ability;
        if (messagePowerListAbility == null || (recyclerViewLLII = messagePowerListAbility.LLII()) == null) {
            return;
        }
        so().LLILLL.setValue((!recyclerViewLLII.canScrollVertically(1) || (recyclerViewLLII.computeVerticalScrollRange() - recyclerViewLLII.computeVerticalScrollOffset()) - recyclerViewLLII.computeVerticalScrollExtent() < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C451310Hmr.LIZ().itemHeightDp)))) ? EnumC452900HpQ.FAKE_MESSAGE : EnumC452900HpQ.FLOATING);
    }

    public static C452840HpK fo(List list) {
        return new C452840HpK(true, list, "recent_favorite", null, null, EnumC452930HpT.LLILLJJLI, EnumC452870HpN.LLILZ, null, 152);
    }

    public static String yo(StickerItem stickerItem) {
        Integer num;
        StickerBase stickerBase;
        if (stickerItem != null && (stickerBase = stickerItem.stickerBase) != null) {
            num = stickerBase.stickerType;
        } else {
            num = null;
        }
        if (C453560HqU.LIZJ(num)) {
            if (stickerItem == null) {
                return null;
            }
            return C453550HqT.LJ(stickerItem);
        }
        int type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
        if (num != null && num.intValue() == type) {
            return "aimoji";
        }
        int type2 = EnumC451180Hme.STATIC.getType();
        if (num == null || num.intValue() != type2) {
            int type3 = EnumC451180Hme.ANIMATED.getType();
            if (num != null && num.intValue() == type3) {
                return "sticker";
            }
            int type4 = EnumC451180Hme.PHOTO_COMMENT_STICKER.getType();
            if (num != null && num.intValue() == type4) {
                return "comment_sticker";
            }
            int type5 = EnumC451180Hme.INHOUSE_TENOR.getType();
            if (num == null || num.intValue() != type5) {
                return null;
            }
            return "tenor";
        }
        return "sticker";
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zo(X.C452840HpK r6) {
        /*
            r2 = 0
            if (r6 == 0) goto La
            X.0HpN r1 = r6.LJI
        L5:
            X.0HpN r0 = X.EnumC452870HpN.LLILZIL
            if (r1 != r0) goto Lc
            return
        La:
            r1 = r2
            goto L5
        Lc:
            if (r6 == 0) goto L50
            X.0HpN r1 = r6.LJI
        L10:
            X.0HpN r0 = X.EnumC452870HpN.LLILLJJLI
            if (r1 == r0) goto L89
            if (r6 == 0) goto L4e
            X.0HpN r1 = r6.LJI
        L18:
            X.0HpN r0 = X.EnumC452870HpN.LLILLL
            if (r1 == r0) goto L89
            X.0HqQ r0 = com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics r5 = X.C453520HqQ.LIZ()
            if (r5 == 0) goto L88
            if (r6 == 0) goto L52
            java.lang.String r4 = r6.LIZJ
            java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r0 = r6.LIZIZ
            if (r0 == 0) goto L53
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r0.iterator()
        L38:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.im.common.model.StickerItem r0 = (com.ss.android.ugc.aweme.im.common.model.StickerItem) r0
            java.lang.String r0 = X.C453550HqT.LIZJ(r0)
            if (r0 == 0) goto L38
            r3.add(r0)
            goto L38
        L4e:
            r1 = r2
            goto L18
        L50:
            r1 = r2
            goto L10
        L52:
            r4 = r2
        L53:
            r3 = r2
            if (r6 == 0) goto L7f
        L56:
            java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r0 = r6.LIZIZ
            if (r0 == 0) goto L7f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L63:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.im.common.model.StickerItem r0 = (com.ss.android.ugc.aweme.im.common.model.StickerItem) r0
            java.lang.Long r0 = X.C453550HqT.LIZIZ(r0)
            if (r0 == 0) goto L63
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L63
            r2.add(r0)
            goto L63
        L7f:
            X.0I0B r0 = X.C0I0B.LJFF
            X.05sz r0 = r0.LIZIZ()
            r5.LIZIZ(r4, r3, r2, r0)
        L88:
            return
        L89:
            X.0Hpe r0 = com.ss.android.ugc.aweme.im.service.analytics.IReplyToStickerAnalytics.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.analytics.IReplyToStickerAnalytics r1 = X.C453040Hpe.LIZ()
            if (r1 == 0) goto L9d
            X.0I0B r0 = X.C0I0B.LJFF
            X.05sz r0 = r0.LIZIZ()
            r1.LIZIZ(r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem.zo(X.0HpK):void");
    }

    public final void Ao(C452840HpK c452840HpK) {
        C457780HxI c457780HxI;
        SessionInfo sessionInfo;
        if (c452840HpK.LJI != EnumC452870HpN.LLILZIL && (c457780HxI = (C457780HxI) this.LL.getValue()) != null && (sessionInfo = c457780HxI.LL) != null) {
            EnumC452870HpN enumC452870HpN = c452840HpK.LJI;
            if (enumC452870HpN == EnumC452870HpN.LLILLJJLI) {
                ReplyToStickerAnalytics.LIZIZ.LJ(EnumC454490Hrz.QUOTE_VIDEO.getValue(), sessionInfo.getConversationId(), "comment_sticker", C1677606ha.LIZ(sessionInfo.getChatType()), "share_video", c452840HpK.LJII);
                return;
            }
            if (enumC452870HpN == EnumC452870HpN.LLILLL) {
                ReplyToStickerAnalytics replyToStickerAnalytics = ReplyToStickerAnalytics.LIZIZ;
                ReplyToStickerAnalytics.LIZIZ.LJ(c452840HpK.LJ, sessionInfo.getConversationId(), yo((StickerItem) C13LP.LJJJLL(c452840HpK.LIZIZ)), C1677606ha.LIZ(sessionInfo.getChatType()), null, null);
                return;
            }
            C06OT.LIZ++;
            String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LLJJI, ",", null, null, 0, null, null, 62);
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
            ((SuggestedEmojiViewModel) assemVMLazy.getValue()).ZG1(strLJJLIIIJ, this.LLJILLL, this.LLJJ, c452840HpK.LIZLLL, this.LLJJIII);
            InterfaceC452460Hoi interfaceC452460Hoi = this.LLJJJJJIL;
            if (interfaceC452460Hoi == null) {
                synchronized (this) {
                    interfaceC452460Hoi = this.LLJJJJJIL;
                    if (interfaceC452460Hoi == null) {
                        interfaceC452460Hoi = (InterfaceC452460Hoi) C1807670x8n.LLLLLLL();
                        this.LLJJJJJIL = interfaceC452460Hoi;
                    }
                }
            }
            interfaceC452460Hoi.LJIIIZ(strLJJLIIIJ);
        }
    }

    public final void Bo(C452840HpK c452840HpK) {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        TypingRecommendationStickerDataVM typingRecommendationStickerDataVM = (TypingRecommendationStickerDataVM) assemVMLazy.getValue();
        typingRecommendationStickerDataVM.LL.setValue(new C1713806nQ(c452840HpK.LIZIZ, c452840HpK.LIZJ, this, this));
    }

    public final void Co(List<StickerItem> list) {
        ArrayList arrayList = new ArrayList();
        for (StickerItem stickerItem : list) {
            if (stickerItem instanceof IMGiphyInfo) {
                arrayList.add(stickerItem);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((IMGiphyInfo) it2.next()).getSource() == 3) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.LLJJIII = z;
        this.LLJJI.clear();
        Iterator it3 = C13LP.LL(list, 10).iterator();
        while (it3.hasNext()) {
            String strLJ = C453550HqT.LJ((StickerItem) it3.next());
            if (strLJ != null) {
                this.LLJJI.add(strLJ);
            }
        }
    }

    public final void bo(C452840HpK c452840HpK) {
        C457780HxI c457780HxI;
        SessionInfo sessionInfo;
        C19EG c19egLIZ;
        if (!this.LLJJJIL && (c457780HxI = (C457780HxI) this.LL.getValue()) != null && (sessionInfo = c457780HxI.LL) != null && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            this.LLJJJIL = true;
            so().LL.setValue(Boolean.TRUE);
            C1684506ih c1684506ih = new C1684506ih();
            c1684506ih.LIZ(sessionInfo);
            c1684506ih.LIZJ = "typing_recommendation_banner";
            c1684506ih.LIZLLL(52);
            c1684506ih.LIZJ(c19egLIZ);
            ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ChatRoomFakeMsgOperatorAbility.class, null);
            if (chatRoomFakeMsgOperatorAbility != null) {
                chatRoomFakeMsgOperatorAbility.yl2(c1684506ih, null);
            }
            this.LLJJJ = c1684506ih;
        }
        Bo(c452840HpK);
    }

    @Override // X.InterfaceC453460HqK
    public final void dl(String str) {
        StickerItem next;
        Iterator<StickerItem> it2 = ((C452840HpK) this.LLJIJIL.getValue()).LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(C453560HqU.LIZIZ(next), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        StickerItem stickerItem = next;
        if (stickerItem != null) {
            int iOrdinal = ((C452840HpK) this.LLJIJIL.getValue()).LJI.ordinal();
            if (iOrdinal != 1 && iOrdinal != 2) {
                IIMEmojiAnalytics.LIZ.getClass();
                IIMEmojiAnalytics iIMEmojiAnalyticsLIZ = C453520HqQ.LIZ();
                if (iIMEmojiAnalyticsLIZ != null) {
                    iIMEmojiAnalyticsLIZ.LIZJ(stickerItem);
                    return;
                }
                return;
            }
            IReplyToStickerAnalytics.LIZ.getClass();
            IReplyToStickerAnalytics iReplyToStickerAnalyticsLIZ = C453040Hpe.LIZ();
            if (iReplyToStickerAnalyticsLIZ == null) {
                return;
            }
            iReplyToStickerAnalyticsLIZ.LIZJ(str);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m240do(C452840HpK c452840HpK) {
        String string;
        EditText editText;
        Editable editableLLJILLL;
        if (this.LLJJJJ) {
            return;
        }
        this.LLJJJJ = true;
        Bo(c452840HpK);
        IMEditTextAbility iMEditTextAbility = (IMEditTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMEditTextAbility.class, null);
        if (iMEditTextAbility == null || (editText = iMEditTextAbility.getEditText()) == null || (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMeay1PRdJ2g/OBTJHB+FOsnwyXe+5CvwB/zhIuVKaOs0yE85UhF09MR4l7ADOiZjLNrxu0WW8sKhhURxZ8z2MS9WIiFe7nA==", null))) == null || (string = editableLLJILLL.toString()) == null) {
            string = "";
        }
        oo().xQ2(new C452950HpV(string, c452840HpK.LIZIZ, string, c452840HpK.LIZJ, System.currentTimeMillis(), c452840HpK.LIZLLL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.0956, kotlinx.coroutines.JobSupport] */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.0956, kotlinx.coroutines.JobSupport] */
    /* JADX WARN: Type inference failed for: r0v65, types: [X.0956, kotlinx.coroutines.JobSupport] */
    /* JADX WARN: Type inference failed for: r0v82, types: [X.0956, kotlinx.coroutines.JobSupport] */
    /* JADX WARN: Type inference failed for: r10v8, types: [X.0HpT] */
    /* JADX WARN: Type inference failed for: r11v10, types: [X.0HpN] */
    /* JADX WARN: Type inference failed for: r11v22, types: [X.0HpM] */
    /* JADX WARN: Type inference failed for: r11v26, types: [X.0HpM] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v15, types: [X.0HpM] */
    /* JADX WARN: Type inference failed for: r12v32, types: [X.0HhT] */
    /* JADX WARN: Type inference failed for: r12v36, types: [X.0HhT] */
    /* JADX WARN: Type inference failed for: r12v37, types: [X.0HhT] */
    /* JADX WARN: Type inference failed for: r13v10, types: [X.0HhT] */
    /* JADX WARN: Type inference failed for: r13v31, types: [X.0HpM] */
    /* JADX WARN: Type inference failed for: r13v32, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r13v33, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r13v7, types: [X.0HpM] */
    /* JADX WARN: Type inference failed for: r14v10, types: [X.0HhT] */
    /* JADX WARN: Type inference failed for: r14v11, types: [X.05Vn, X.0956, X.099V, com.ss.android.ugc.aweme.im.common.model.StickerBase, java.lang.String, java.lang.String[], java.util.concurrent.CancellationException, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r14v12, types: [X.0HhT, X.0HpM, X.0HpP, X.0HpW, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v13, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v14, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v15, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v16, types: [X.0HhT, X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v17, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v18, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v19, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v20, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v21, types: [X.0HhT, X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v22, types: [X.0HhT, X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v23, types: [X.0HhT, X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v24, types: [X.0HhT, X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v25, types: [X.0HhT, X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v26, types: [X.0HhT, X.0HpM, X.0HpP, X.0HpW, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v27, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v28, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v29, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v30, types: [X.0HhT] */
    /* JADX WARN: Type inference failed for: r14v31, types: [X.0HpP] */
    /* JADX WARN: Type inference failed for: r14v32, types: [X.0HpP, X.0HpW] */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.ss.android.ugc.aweme.im.common.model.StickerUserInfo] */
    /* JADX WARN: Type inference failed for: r16v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r17v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r18v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r19v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.ss.android.ugc.aweme.im.common.model.SubOnlyStickerItem] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.ss.android.ugc.aweme.im.common.model.VideoToStickerItem] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.ss.android.ugc.aweme.im.common.model.AIMojiStickerItem] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.ss.android.ugc.aweme.im.common.model.SocialAvatarStickerItem] */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.ss.android.ugc.aweme.im.common.model.DuoAvatarStickerItem] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.ss.android.ugc.aweme.im.common.model.ThirdpartyStickerItem] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.ss.android.ugc.aweme.im.common.model.AIStickerItem] */
    /* JADX WARN: Type inference failed for: r31v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.ss.android.ugc.aweme.im.common.model.TypingRecommendationItem] */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v0, types: [com.ss.android.ugc.aweme.im.common.model.PhotoCommentStickerItem] */
    /* JADX WARN: Type inference failed for: r35v2, types: [X.0HpT] */
    /* JADX WARN: Type inference failed for: r36v0, types: [com.ss.android.ugc.aweme.im.common.model.ImagineStudioInfo] */
    /* JADX WARN: Type inference failed for: r36v2, types: [X.0HpN] */
    /* JADX WARN: Type inference failed for: r37v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r38v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo(X.InterfaceC447930HhP r46) {
        /*
            Method dump skipped, instruction units count: 2111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem.mo(X.0HhP):void");
    }

    public final void wo(View view, StickerItem stickerItem) {
        StickerBase stickerBase = stickerItem.stickerBase;
        if (stickerBase != null) {
            Integer num = stickerBase.stickerType;
            int type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
            if (num != null && num.intValue() == type) {
                return;
            }
        }
        StickerBase stickerBase2 = stickerItem.stickerBase;
        if (stickerBase2 != null) {
            Integer num2 = stickerBase2.stickerType;
            int type2 = EnumC451180Hme.AISELF_STICKER.getType();
            if (num2 != null && num2.intValue() == type2) {
                return;
            }
        }
        Context context = view.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(context.getString(R.string.s65));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zs, context);
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        frameLayout.addView(tuxTextView);
        C1391550mJd c1391550mJd = new C1391550mJd(context);
        c1391550mJd.LLILLJJLI.LIZIZ = view;
        c1391550mJd.LJII(R.attr.bx);
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c1391600mJi.LJIJJ = true;
        c1391600mJi.LJIIZILJ = frameLayout;
        c1391600mJi.LJIJJLI = true;
        c1391550mJd.LIZLLL();
        c1391550mJd.LJIIIZ(true, null);
        this.LLJJIJI = c1391550mJd.LIZIZ();
        C786410Ut5.O7(frameLayout, new ACListenerS110S0200000_6(this, stickerItem, 72));
        C0P0T c0p0t = this.LLJJIJI;
        if (c0p0t == null) {
            return;
        }
        c0p0t.show();
    }

    @Override // X.InterfaceC453160Hpq
    public final void f3(StickerItem stickerItem, View view, int i, EnumC453020Hpc enumC453020Hpc) {
        SessionInfo sessionInfo;
        IMEditTextAbility iMEditTextAbility;
        Integer num;
        String string;
        Integer num2;
        String strLIZ;
        Integer num3;
        C452840HpK c452840HpK = (C452840HpK) this.LLJIJIL.getValue();
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        if (c457780HxI != null && (sessionInfo = c457780HxI.LL) != null) {
            EnumC452870HpN enumC452870HpN = c452840HpK.LJI;
            String str = "";
            if (enumC452870HpN == EnumC452870HpN.LLILLJJLI) {
                IReplyToStickerAnalytics.LIZ.getClass();
                IReplyToStickerAnalytics iReplyToStickerAnalyticsLIZ = C453040Hpe.LIZ();
                if (iReplyToStickerAnalyticsLIZ != null) {
                    String value = EnumC454490Hrz.QUOTE_VIDEO.getValue();
                    String conversationId = sessionInfo.getConversationId();
                    String strLIZ2 = C1677606ha.LIZ(sessionInfo.getChatType());
                    String strLIZIZ = C453560HqU.LIZIZ(stickerItem);
                    if (strLIZIZ != null) {
                        str = strLIZIZ;
                    }
                    iReplyToStickerAnalyticsLIZ.LIZ(value, conversationId, "comment_sticker", strLIZ2, str, "comment_sticker", "share_video", c452840HpK.LJII, C0I0B.LJFF.LIZIZ());
                }
                if (enumC453020Hpc == EnumC453020Hpc.NORMAL) {
                    C1628906Zj.LIZ(view.getContext());
                    mo(C447940HhQ.LIZ);
                    AssemVMLazy assemVMLazy = this.LLIZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
                    ((SendMessageVM) assemVMLazy.getValue()).Up0(new C454070HrJ(stickerItem, EnumC454490Hrz.STICKER_REPLY_SUGGESTION_PANEL, C451050HmR.LIZ(view), 20));
                    ho();
                    uo().wQ2();
                    return;
                }
                return;
            }
            if (enumC452870HpN == EnumC452870HpN.LLILLL) {
                IReplyToStickerAnalytics.LIZ.getClass();
                IReplyToStickerAnalytics iReplyToStickerAnalyticsLIZ2 = C453040Hpe.LIZ();
                if (iReplyToStickerAnalyticsLIZ2 != null) {
                    String str2 = c452840HpK.LJ;
                    String conversationId2 = sessionInfo.getConversationId();
                    String strYo = yo(stickerItem);
                    String strLIZ3 = C1677606ha.LIZ(sessionInfo.getChatType());
                    String strLIZIZ2 = C453560HqU.LIZIZ(stickerItem);
                    if (strLIZIZ2 != null) {
                        str = strLIZIZ2;
                    }
                    StickerBase stickerBase = stickerItem.stickerBase;
                    if (stickerBase != null) {
                        num2 = stickerBase.stickerType;
                    } else {
                        num2 = null;
                    }
                    if (C453560HqU.LIZJ(num2)) {
                        strLIZ = C453550HqT.LJ(stickerItem);
                    } else {
                        IIMEmojiAnalytics.LIZ.getClass();
                        IIMEmojiAnalytics iIMEmojiAnalyticsLIZ = C453520HqQ.LIZ();
                        if (iIMEmojiAnalyticsLIZ != null) {
                            StickerBase stickerBase2 = stickerItem.stickerBase;
                            if (stickerBase2 != null) {
                                num3 = stickerBase2.stickerType;
                            } else {
                                num3 = null;
                            }
                            strLIZ = iIMEmojiAnalyticsLIZ.LIZ(num3);
                        } else {
                            strLIZ = null;
                        }
                    }
                    iReplyToStickerAnalyticsLIZ2.LIZ(str2, conversationId2, strYo, strLIZ3, str, strLIZ, null, null, C0I0B.LJFF.LIZIZ());
                }
                int i2 = C452880HpO.LIZIZ[enumC453020Hpc.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        wo(view, stickerItem);
                        return;
                    }
                    throw new C1954807lC();
                }
                C1628906Zj.LIZ(view.getContext());
                mo(C447940HhQ.LIZ);
                IMEditTextAbility iMEditTextAbility2 = (IMEditTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMEditTextAbility.class, null);
                if (iMEditTextAbility2 != null) {
                    iMEditTextAbility2.rv();
                }
                AssemVMLazy assemVMLazy2 = this.LLIZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJL;
                ((SendMessageVM) assemVMLazy2.getValue()).Up0(new C454070HrJ(stickerItem, EnumC454490Hrz.STICKER_REPLY_SUGGESTION_PANEL, C451050HmR.LIZ(view), 20));
                ho();
                uo().xQ2();
                return;
            }
            IIMEmojiAnalytics.LIZ.getClass();
            IIMEmojiAnalytics iIMEmojiAnalyticsLIZ2 = C453520HqQ.LIZ();
            if (iIMEmojiAnalyticsLIZ2 != null) {
                String conversationId3 = sessionInfo.getConversationId();
                String strValueOf = String.valueOf(C0YNP.LJII(sessionInfo.getConversationId()));
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                String strLIZ4 = C1677606ha.LIZ(sessionInfo.getChatType());
                String strLIZJ = C453550HqT.LIZJ(stickerItem);
                InterfaceC453640Hqc imStickerAnalytics = IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics();
                StickerBase stickerBase3 = stickerItem.stickerBase;
                if (stickerBase3 != null) {
                    num = stickerBase3.stickerType;
                } else {
                    num = null;
                }
                String strLIZ5 = imStickerAnalytics.LIZ(num);
                String string2 = null;
                String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LLJJI, ",", null, null, 0, null, null, 62);
                String str3 = c452840HpK.LIZJ;
                String str4 = this.LLJILLL;
                if (str4 != null) {
                    str = str4;
                }
                String str5 = this.LLJJ;
                boolean z = this.LLJJIII;
                Long lLIZIZ = C453550HqT.LIZIZ(stickerItem);
                if (lLIZIZ != null) {
                    string2 = lLIZIZ.toString();
                }
                List<StickerItem> list = c452840HpK.LIZIZ;
                ArrayList arrayList = new ArrayList();
                Iterator<StickerItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    String strLIZJ2 = C453550HqT.LIZJ(it2.next());
                    if (strLIZJ2 != null) {
                        arrayList.add(strLIZJ2);
                    }
                }
                List<StickerItem> list2 = c452840HpK.LIZIZ;
                ArrayList arrayList2 = new ArrayList();
                Iterator<StickerItem> it3 = list2.iterator();
                while (it3.hasNext()) {
                    Long lLIZIZ2 = C453550HqT.LIZIZ(it3.next());
                    if (lLIZIZ2 != null && (string = lLIZIZ2.toString()) != null) {
                        arrayList2.add(string);
                    }
                }
                iIMEmojiAnalyticsLIZ2.LIZLLL(conversationId3, strValueOf, curUserId, strLIZ4, strLIZJ, strLIZ5, strLJJLIIIJ, str3, str, str5, z, string2, i, arrayList, arrayList2, c452840HpK.LIZLLL, C0I0B.LJFF.LIZIZ());
            }
            int i3 = C452880HpO.LIZIZ[enumC453020Hpc.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    wo(view, stickerItem);
                    return;
                }
                throw new C1954807lC();
            }
            C1628906Zj.LIZ(view.getContext());
            mo(C447940HhQ.LIZ);
            if (c452840HpK.LJI == EnumC452870HpN.LL) {
                uo().EQ2();
            }
            if (c452840HpK.LJFF != EnumC452930HpT.LLILLJJLI && (iMEditTextAbility = (IMEditTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMEditTextAbility.class, null)) != null) {
                iMEditTextAbility.rv();
            }
            AssemVMLazy assemVMLazy3 = this.LLIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LLJJL;
            ((SendMessageVM) assemVMLazy3.getValue()).Up0(new C454070HrJ(stickerItem, EnumC454490Hrz.KEYWORD_SUGGESTION, C451050HmR.LIZ(view), 20));
            ho();
        }
    }
}
