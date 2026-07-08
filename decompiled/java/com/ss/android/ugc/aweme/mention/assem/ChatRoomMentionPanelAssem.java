package com.ss.android.ugc.aweme.mention.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0I0B;
import X.C0I10;
import X.C0I12;
import X.C0I15;
import X.C0I16;
import X.C0I18;
import X.C0I1K;
import X.C1308910kAL;
import X.C1388820mFE;
import X.C13LE;
import X.C1509305vX;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20673215v0;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C457780HxI;
import X.C459690I0x;
import X.C459700I0y;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.C830490Whz;
import X.InterfaceC1388810mFD;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.edittext.TextWatcherViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.MentionPanelStateViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.mention.IMentionPanelFactory;
import com.ss.android.ugc.aweme.mention.ability.ChatRoomMentionInputAbility;
import com.ss.android.ugc.aweme.mention.ability.ChatRoomMentionPanelAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ChatRoomMentionPanelAssem extends UIContentAssem implements TextWatcher, ChatRoomMentionPanelAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C1559260qg8 LLJILLL;
    public final C01GW LLJJ;
    public C0I12 LLJJI;
    public ViewGroup LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatRoomMentionPanelAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ChatRoomMentionPanelAssem.class, "inputPanelSizeViewModel", "getInputPanelSizeViewModel()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(ChatRoomMentionPanelAssem.class, "mentionPanelStateViewModel", "getMentionPanelStateViewModel()Lcom/ss/android/ugc/aweme/im/viewmodel/MentionPanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(ChatRoomMentionPanelAssem.class, "panelStateViewModel", "getPanelStateViewModel()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(ChatRoomMentionPanelAssem.class, "textWatcherViewModel", "getTextWatcherViewModel()Lcom/ss/android/ugc/aweme/im/edittext/TextWatcherViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(ChatRoomMentionPanelAssem.class, "draftVM", "getDraftVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/draft/MessageDraftVM;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public ChatRoomMentionPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputFieldVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 677), AFwS236S0000000_6.get$arr$(216), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InputPanelSizeViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 678), AFwS236S0000000_6.get$arr$(217), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MentionPanelStateViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 679), AFwS236S0000000_6.get$arr$(218), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ4, 680), AFwS236S0000000_6.get$arr$(219), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(TextWatcherViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ5, 681), AFwS236S0000000_6.get$arr$(214), null, true);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(MessageDraftVM.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ6, 676), AFwS236S0000000_6.get$arr$(215), null, true);
        this.LLJILLL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJJ = C1509305vX.LIZ(AFwS187S0000000_2.get$arr$(585));
        this.LLJJIJIIJIL = C1509305vX.LIZ(new AwS550S0100000_6(this, 461));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 41217937) {
            return null;
        }
        return this;
    }

    public final synchronized void Go() {
        C1388820mFE c1388820mFELIZ;
        C830490Whz c830490WhzLJIIJ;
        if (this.LLJJI != null) {
            return;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            IMentionPanelFactory iMentionPanelFactory = (IMentionPanelFactory) this.LLJJ.getValue();
            View viewLJJIJL = LJJIJL();
            InterfaceC1388810mFD interfaceC1388810mFD = (InterfaceC1388810mFD) this.LLJJIJIIJIL.getValue();
            String conversationId = ((C457780HxI) this.LLJILLL.getValue()).LL.getConversationId();
            C0I18 c0i18 = C0I18.VIEW_STUB;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, LJJIJL().getContext());
            C0I16 c0i16 = new C0I16(c0i18, Integer.valueOf(numLIZJ != null ? numLIZJ.intValue() : 0), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 30);
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "chat"), new Pair("enter_method", "keyword"));
            IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
            if (iMGroupChatApiLIZ != null && (c830490WhzLJIIJ = iMGroupChatApiLIZ.LJIIJ(((C457780HxI) this.LLJILLL.getValue()).LL.getConversationId(), C0I0B.LJFF.LIZIZ())) != null) {
                mapLJIIJ.putAll(c830490WhzLJIIJ);
            }
            c1388820mFELIZ = iMentionPanelFactory.LIZ(viewLJJIJL, fragmentLJI, interfaceC1388810mFD, new C0I15(conversationId, c0i16, mapLJIIJ, new AwS585S0100000_6(this, 124)));
        } else {
            c1388820mFELIZ = null;
        }
        this.LLJJI = c1388820mFELIZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        ((TextWatcherViewModel) assemVMLazy.getValue()).wQ2(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.mention.ability.ChatRoomMentionPanelAbility
    public final void Ef1(List<String> list) {
        Go();
        C0I12 c0i12 = this.LLJJI;
        if (c0i12 != null) {
            c0i12.LIZLLL(list);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C0I12 c0i12;
        String str;
        C0I12 c0i122 = this.LLJJI;
        if (c0i122 != null) {
            C0I10 c0i10Xn = null;
            ChatRoomMentionInputAbility chatRoomMentionInputAbility = (ChatRoomMentionInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ChatRoomMentionInputAbility.class, null);
            if (chatRoomMentionInputAbility != null && (c0i10Xn = chatRoomMentionInputAbility.xn()) != null && (str = c0i10Xn.LIZ) != null) {
                c0i122.LJIIIIZZ(str);
            }
            if (c0i10Xn != null && c0i10Xn.LIZIZ && (((this.LLJJIJI && !c0i122.LJ()) || !this.LLJJIJI) && (c0i12 = this.LLJJI) != null)) {
                c0i12.LJIIIZ(new AwS550S0100000_6(this, 460));
            }
            this.LLJJIJI = false;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C20673215v0.LJI(R.layout.cp0, getContext());
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0HzU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C457640Hx4) obj).LL);
            }
        }, null, new AwS620S0100000_6(this, 39), 6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C459690I0x(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C459700I0y(this, null), 3);
        ((TextWatcherViewModel) this.LLJILJIL.getValue()).vQ2(this);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C0I12 c0i12;
        C0I12 c0i122 = this.LLJJI;
        if (c0i122 != null && c0i122.LJ() && (charSequence instanceof SpannableStringBuilder) && i2 > 0 && i3 >= 0) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int i4 = i2 + i;
            C0I1K[] c0i1kArr = (C0I1K[]) spannableStringBuilder.getSpans(i, i4, C0I1K.class);
            if (c0i1kArr != null && c0i1kArr.length != 0) {
                for (C0I1K c0i1k : c0i1kArr) {
                    String str = c0i1k.LIZIZ;
                    if (str != null && (c0i12 = this.LLJJI) != null) {
                        c0i12.LJFF(str);
                    }
                    spannableStringBuilder.removeSpan(c0i1k);
                }
                this.LLJJIJI = true;
            }
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannableStringBuilder.getSpans(i, i4, CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length != 0) {
                for (CharacterStyle characterStyle : characterStyleArr) {
                    spannableStringBuilder.removeSpan(characterStyle);
                }
                return;
            }
            return;
        }
        this.LLJJIJI = false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null && charSequence.length() != 0 && i3 > 0 && i2 < charSequence.length() && charSequence.charAt((i + i3) - 1) == '@') {
            AssemVMLazy assemVMLazy = this.LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
            if (((Boolean) ((MessageDraftVM) assemVMLazy.getValue()).LLIZ.getValue()).booleanValue() && so()) {
                Go();
                C0I12 c0i12 = this.LLJJI;
                if (c0i12 != null) {
                    c0i12.show();
                }
            }
        }
    }
}
