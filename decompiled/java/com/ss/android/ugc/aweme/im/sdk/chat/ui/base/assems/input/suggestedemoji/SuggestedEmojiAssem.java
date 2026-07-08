package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C06IT;
import X.C06RM;
import X.C09R3;
import X.C0HVA;
import X.C0QSJ;
import X.C1220000hqw;
import X.C127G;
import X.C12ES;
import X.C13LE;
import X.C1559260qg8;
import X.C1636706az;
import X.C1637806bA;
import X.C1637906bB;
import X.C1673506gv;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C286290BJz;
import X.C432670Gxt;
import X.C444960Hcc;
import X.C447770Hh9;
import X.C447780HhA;
import X.C447790HhB;
import X.C447800HhC;
import X.C447820HhE;
import X.C447830HhF;
import X.C451030HmP;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C453250Hpz;
import X.C453310Hq5;
import X.C457780HxI;
import X.C462900IDg;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C787990Uvd;
import X.C994003uc;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS59S0000000_6;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.edittext.TextWatcherViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerRecommendationViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS442S0200000_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SuggestedEmojiAssem extends UIContentAssem implements C0HVA, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ = C1636706az.LIZ(this);
    public final AssemVMLazy LLJI = C06IT.LIZ(this);
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final C01GW LLJJI;
    public final C736950SvV LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public C453250Hpz LLJJL;
    public AnonymousClass0956 LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C462900IDg LLJLIL;
    public volatile IInputFieldAbility LLJLILLLLZIIL;
    public C127G LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;

    public final IInputFieldAbility Lo() {
        IInputFieldAbility iInputFieldAbility = this.LLJLILLLLZIIL;
        if (iInputFieldAbility == null) {
            synchronized (this) {
                iInputFieldAbility = this.LLJLILLLLZIIL;
                if (iInputFieldAbility == null) {
                    IInputFieldAbility iInputFieldAbilityGo = Go();
                    this.LLJLILLLLZIIL = iInputFieldAbilityGo;
                    return iInputFieldAbilityGo;
                }
            }
        }
        return iInputFieldAbility;
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

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SuggestedEmojiAssem.class, "suggestedEmojiViewModel", "getSuggestedEmojiViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/suggestedemoji/SuggestedEmojiViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SuggestedEmojiAssem.class, "chatNoticeVMV2", "getChatNoticeVMV2()Lcom/ss/android/ugc/aweme/im/prompts/api/chatnotice/flow/base/viewmodel/ICommonChatNoticeViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SuggestedEmojiAssem.class, "messageListViewModel", "getMessageListViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SuggestedEmojiAssem.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(SuggestedEmojiAssem.class, "textWatcherViewModel", "getTextWatcherViewModel()Lcom/ss/android/ugc/aweme/im/edittext/TextWatcherViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(SuggestedEmojiAssem.class, "inputFieldAbility", "getInputFieldAbility()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/IInputFieldAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(SuggestedEmojiAssem.class, "messageListFooterViewModel", "getMessageListFooterViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/mesagelist/MessageListFooterViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(SuggestedEmojiAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(SuggestedEmojiAssem.class, "inputPanelSizeViewModel", "getInputPanelSizeViewModel()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(SuggestedEmojiAssem.class, "typingRecommendationVM", "getTypingRecommendationVM()Lcom/ss/android/ugc/aweme/viewmodel/ITypingRecommendationVM;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
    }

    public SuggestedEmojiAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IIMessageListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 529), AFwS236S0000000_6.get$arr$(148), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SendMessageVM.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 530), AFwS236S0000000_6.get$arr$(149), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TextWatcherViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 531), AFwS236S0000000_6.get$arr$(150), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MessageListFooterViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ4, 532), AFwS236S0000000_6.get$arr$(151), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ5, 533), AFwS236S0000000_6.get$arr$(153), null, true);
        this.LLJJI = C452501pT.LIZIZ(new C1673506gv(this));
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 283);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(MessageReplyVM.class);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(152);
        this.LLJJIII = new C736950SvV(c19719912DlLIZ6, new AwS550S0100000_6(awS550S0100000_6, 279), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS236S0000000_6, new AwS550S0100000_6((AbstractC738140SxQ) this, 280), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(InputPanelSizeViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ7, 534), AFwS236S0000000_6.get$arr$(154), null, true);
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(ITypingRecommendationVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ8), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ8, 535), AFwS236S0000000_6.get$arr$(147), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 282));
        this.LLJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 281));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 278));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 275));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 276));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 277));
        this.LLJLIL = new C462900IDg(this, 3);
    }

    public final IInputFieldAbility Go() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJLLL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLLIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJLLIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLJLLL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        IInputFieldAbility iInputFieldAbility = (IInputFieldAbility) c0qsjLIZLLL.getAbility(IInputFieldAbility.class);
        C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        return iInputFieldAbility;
    }

    public final void Ho() {
        C453250Hpz c453250Hpz = this.LLJJL;
        if (c453250Hpz != null && c453250Hpz.isShowing()) {
            C453250Hpz c453250Hpz2 = this.LLJJL;
            if (c453250Hpz2 != null) {
                c453250Hpz2.dismiss();
            }
            this.LLJJL = null;
        }
        So().rU();
    }

    public final ICommonChatNoticeViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (ICommonChatNoticeViewModel) assemVMLazy.getValue();
    }

    public final PanelStateViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (PanelStateViewModel) assemVMLazy.getValue();
    }

    public final ReplyToStickerRecommendationViewModel Oo() {
        return (ReplyToStickerRecommendationViewModel) this.LLJJI.getValue();
    }

    public final SuggestedEmojiViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (SuggestedEmojiViewModel) assemVMLazy.getValue();
    }

    public final ITypingRecommendationVM Vo() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (ITypingRecommendationVM) assemVMLazy.getValue();
    }

    @Override // X.C0HVA
    public final String Bc() {
        return C432670Gxt.LIZ(this);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IIMessageListViewModel.class, new AObjectS59S0000000_6(this, 3), ITypingRecommendationVM.class, new AObjectS59S0000000_6(this, 2)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Ho();
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        ((TextWatcherViewModel) assemVMLazy.getValue()).wQ2(this.LLJLIL);
        AnonymousClass0956 anonymousClass0956 = this.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:39:0x007f, B:41:0x008a, B:43:0x008e, B:44:0x0092, B:49:0x00a2, B:51:0x00a8, B:54:0x00af, B:57:0x00b5, B:59:0x00bb, B:62:0x00c2, B:63:0x00c4, B:65:0x00ca, B:67:0x00d4, B:69:0x00da), top: B:86:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100 A[PHI: r0
      0x0100: PHI (r0v22 java.lang.String) = (r0v21 java.lang.String), (r0v27 java.lang.String) binds: [B:78:0x00fa, B:64:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Zo(java.lang.CharSequence r11) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiAssem.Zo(java.lang.CharSequence):void");
    }

    public final void ap(List<? extends C451030HmP> list) {
        int iIntValue;
        int iLJIIJ;
        AnonymousClass0956 anonymousClass0956 = this.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        int size = ((ArrayList) list).size();
        if (size != 1) {
            if (size != 2) {
                iIntValue = ((Number) this.LLJJJIL.getValue()).intValue();
            } else {
                iIntValue = ((Number) this.LLJJJ.getValue()).intValue();
            }
        } else {
            iIntValue = ((Number) this.LLJJIJIL.getValue()).intValue();
        }
        if (C444960Hcc.LIZIZ()) {
            iLJIIJ = ((Number) this.LLJJJJ.getValue()).intValue();
        } else {
            iLJIIJ = (C12ES.LJIIJ(getContext()) - iIntValue) - ((Number) this.LLJJJJ.getValue()).intValue();
        }
        ViewGroup viewGroup = (ViewGroup) C786410Ut5.Sd(R.layout.cob, C786410Ut5.ne(getContext()), null);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.h00);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        C453310Hq5 c453310Hq5 = new C453310Hq5(new AwS442S0200000_6(recyclerView, this, 2));
        ((ArrayList) c453310Hq5.LLILLJJLI).addAll(list);
        c453310Hq5.notifyDataSetChanged();
        recyclerView.setAdapter(c453310Hq5);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = ((Number) this.LLJJJJLIIL.getValue()).intValue();
        layoutParams.width = iIntValue;
        C786410Ut5.X5(layoutParams, viewGroup);
        if (this.LLJJL == null) {
            this.LLJJL = new C453250Hpz();
        }
        C453250Hpz c453250Hpz = this.LLJJL;
        if (c453250Hpz != null) {
            c453250Hpz.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0Hps
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C06N8 c06n8;
                    this.LL.So().LLILZIL.LIZIZ(null, null, null, C0I0B.LJFF.LIZIZ());
                    SuggestedEmojiViewModel suggestedEmojiViewModelSo = this.LL.So();
                    if (C06NJ.LIZIZ() || (c06n8 = suggestedEmojiViewModelSo.LL) == null) {
                        return;
                    }
                    c06n8.LJI(AFwS229S0000000_2.get$arr$(307));
                }
            });
            int iIntValue2 = ((Number) this.LLJJJJLIIL.getValue()).intValue();
            c453250Hpz.LL = viewGroup;
            c453250Hpz.setContentView(viewGroup);
            c453250Hpz.setWidth(-2);
            c453250Hpz.setHeight(-2);
            c453250Hpz.setOutsideTouchable(true);
            c453250Hpz.LLILLJJLI = iIntValue2;
            View viewLJJIJL = LJJIJL();
            int i = -((Number) this.LLJJJJJIL.getValue()).intValue();
            c453250Hpz.dismiss();
            if (viewLJJIJL != null) {
                int[] iArr = new int[2];
                viewLJJIJL.getLocationOnScreen(iArr);
                c453250Hpz.showAtLocation(viewLJJIJL, 0, iArr[0] + iLJIIJ, (iArr[1] - c453250Hpz.LLILLJJLI) + i);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJI(c453250Hpz);
                C787990Uvd.LIZ.getClass();
                C994003uc.LIZ();
            }
            c453250Hpz.update(iIntValue, ((Number) this.LLJJJJLIIL.getValue()).intValue());
        }
        this.LLJJLIIIJLLLLLLLZ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C447780HhA(this, null), 3);
        So().ZG1(null, null, null, null, false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        super.onViewCreated(view);
        Vo().DQ2();
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        ((TextWatcherViewModel) assemVMLazy.getValue()).vQ2(this.LLJLIL);
        if (((Number) C286290BJz.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C447770Hh9(this, null), 3);
            if (!C06RM.LIZ()) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C447830HhF(this, null), 3);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C447800HhC(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C447820HhE(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C447790HhB(this, null), 3);
        ReplyToStickerRecommendationViewModel replyToStickerRecommendationViewModelOo = Oo();
        if (replyToStickerRecommendationViewModelOo != null) {
            C736680Sv4.LJIIIIZZ(this, replyToStickerRecommendationViewModelOo, new C2217381BqS() { // from class: X.0Hpu
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C453220Hpw) obj).LL;
                }
            }, null, new AwS620S0100000_6(this, 31), 6);
        }
        ReplyToStickerRecommendationViewModel replyToStickerRecommendationViewModelOo2 = Oo();
        if (replyToStickerRecommendationViewModelOo2 != null) {
            C736680Sv4.LJIIIIZZ(this, replyToStickerRecommendationViewModelOo2, new C2217381BqS() { // from class: X.0Hpv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C453220Hpw) obj).LLILLJJLI;
                }
            }, null, new AwS620S0100000_6(this, 32), 6);
        }
        ReplyToStickerRecommendationViewModel replyToStickerRecommendationViewModelOo3 = Oo();
        if (replyToStickerRecommendationViewModelOo3 != null) {
            C736680Sv4.LJIIIIZZ(this, replyToStickerRecommendationViewModelOo3, new C2217381BqS() { // from class: X.0Hpx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C453220Hpw) obj).LLILLL;
                }
            }, null, new AwS620S0100000_6(this, 30), 6);
        }
    }
}
