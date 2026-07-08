package com.ss.android.ugc.aweme.im.sdk.unreadindicator;

import X.C019F;
import X.C01GW;
import X.C06Q7;
import X.C09R3;
import X.C0I0B;
import X.C0ZP4;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C23250099c;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C910540Zno;
import X.C910680Zo2;
import X.C910700Zo4;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS56S1200000_14;
import Y.ALAdapterS10S0100000_14;
import Y.AObjectS67S0000000_14;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.ChatLongPressVM;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage.RecallMsgViewModel;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class UnreadIndicatorAssemV2 extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public TuxTextView LLJI;
    public Animator LLJIJIL;
    public Animator LLJILJIL;
    public Animator LLJILJILJ;
    public boolean LLJILLL;
    public C0ZP4 LLJJ;
    public Animator LLJJI;
    public final AssemVMLazy LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public C127G LLJJLIIIJLLLLLLLZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1039));
    public final List<View> LLJ = new ArrayList();
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1033));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1031));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1030));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1032));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UnreadIndicatorAssemV2.class, "chatCommonVM", "getChatCommonVM()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(UnreadIndicatorAssemV2.class, "messageListViewModel", "getMessageListViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(UnreadIndicatorAssemV2.class, "recallMsgViewModel", "getRecallMsgViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/recallmessage/RecallMsgViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(UnreadIndicatorAssemV2.class, "longPressVM", "getLongPressVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/ChatLongPressVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(UnreadIndicatorAssemV2.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/sdk/unreadindicator/UnreadIndicatorVM;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public UnreadIndicatorAssemV2() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatCommonViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 1034), AFwS248S0000000_14.get$arr$(282), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IIMessageListViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 1035), AFwS248S0000000_14.get$arr$(283), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(RecallMsgViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 1036), AFwS248S0000000_14.get$arr$(284), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ChatLongPressVM.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ4, 1037), AFwS248S0000000_14.get$arr$(285), null, true);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1040);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(UnreadIndicatorVM.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ5, 1038), AFwS248S0000000_14.get$arr$(281), awS558S0100000_14, true);
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

    public final SessionInfo Jo() {
        return (SessionInfo) this.LLJJIJI.getValue();
    }

    public final LinearLayout Lo() {
        return (LinearLayout) this.LLIZLLLIL.getValue();
    }

    public final UnreadIndicatorVM No() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (UnreadIndicatorVM) assemVMLazy.getValue();
    }

    public final void Oo() {
        Animator animator = this.LLJIJIL;
        if (animator != null) {
            animator.cancel();
        }
        if (this.LLJILJIL != null) {
            return;
        }
        Context context = getContext();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(Lo(), "translationX", 0.0f, C418440Gaw.LIZIZ(Integer.valueOf((context == null || !C426750GoL.LIZLLL(context)) ? 120 : -120)));
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(240L);
            objectAnimatorOfFloat.addListener(new ALAdapterS10S0100000_14(this, 0));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        } else {
            objectAnimatorOfFloat = null;
        }
        this.LLJILJIL = objectAnimatorOfFloat;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJLIIIJLLLLLLLZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJLIIIJLLLLLLLZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS67S0000000_14(this, 22), IIMessageListViewModel.class, new AObjectS67S0000000_14(this, 23)}, defaultViewModelProviderFactory);
                    this.LLJJLIIIJLLLLLLLZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Animator animator = this.LLJIJIL;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LLJILJIL;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.LLJILJILJ;
        if (animator3 != null) {
            animator3.cancel();
        }
        Animator animator4 = this.LLJJI;
        if (animator4 != null) {
            animator4.cancel();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R.id.kaw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, 0);
        layoutParams.gravity = 8388613;
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(1);
        C786410Ut5.LJZL(8, linearLayout);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.i54);
        int iIndexOfChild = viewGroup.indexOfChild(viewGroup.findViewById(R.id.wah));
        if (iIndexOfChild == -1) {
            viewGroup.addView(linearLayout);
        } else {
            viewGroup.addView(linearLayout, iIndexOfChild);
        }
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0Zo5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C910570Znr) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 73), 6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C910540Zno(this, null), 3);
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        this.LLJJ = C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06t4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1593606Lu) obj).LLILZ;
            }
        }, null, new AwS628S0100000_14(this, 74), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJJJ.getValue(), new C2217381BqS() { // from class: X.06tB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C06PE) obj).LLILZLL;
            }
        }, null, new AwS628S0100000_14(this, 71), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJJJJIL.getValue(), new C2217381BqS() { // from class: X.0IAl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C462160IAk) obj).LLILLL);
            }
        }, null, new AwS628S0100000_14(this, 72), 6);
    }

    public static final Long Zo(RecyclerView recyclerView, Function0<? extends List<? extends C869590Y9l>> function0) {
        int iLJIIL = ((ChatLinearLayoutManager) recyclerView.getLayoutManager()).LJIIL();
        List<? extends C869590Y9l> listInvoke = function0.invoke();
        if (listInvoke == null || iLJIIL < 0 || iLJIIL >= listInvoke.size()) {
            return null;
        }
        return Long.valueOf(((C869590Y9l) ListProtector.get(listInvoke, iLJIIL)).getIndex());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C910700Zo4 Go(int i, int i2) {
        TuxIconView tuxIconView;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 8388613;
        int i3 = 0;
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(1);
        linearLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.LJZL(8, linearLayout);
        linearLayout.setElevation(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.c3);
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
        Context context = getContext();
        TuxTextView tuxTextView = null;
        if (context != null) {
            tuxIconView = new TuxIconView(context, null, 0, 6, null);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1r);
            c419910GdJ.LIZ = R.raw.icon_chevron_up_double_fill;
            tuxIconView.setTuxIcon(c419910GdJ);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            C786410Ut5.M6(tuxIconView, layoutParams2);
        } else {
            tuxIconView = null;
        }
        Context context2 = getContext();
        if (context2 != null) {
            TuxTextView tuxTextView2 = new TuxTextView(context2, null == true ? 1 : 0, 6, i3);
            tuxTextView2.setId(i2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 16;
            layoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            C786410Ut5.R6(tuxTextView2, layoutParams3);
            tuxTextView2.setTextColorRes(R.attr.a1r);
            tuxTextView2.setTuxFont(62);
            tuxTextView = tuxTextView2;
        }
        linearLayout.addView(tuxIconView);
        linearLayout.addView(tuxTextView);
        return new C910700Zo4(linearLayout, tuxTextView);
    }

    public final CharSequence Ho(int i, long j) {
        String strValueOf;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (j > 99) {
            strValueOf = context.getString(2131835824);
        } else {
            strValueOf = String.valueOf(j);
        }
        return context.getResources().getQuantityString(i, (int) Math.min(99L, j), strValueOf);
    }

    public final void So(long j, String str, boolean z) {
        String str2;
        String strLIZJ;
        String conversationId;
        SessionInfo sessionInfoJo = Jo();
        if (sessionInfoJo != null && sessionInfoJo.isChatroomAnalyticsBlocked()) {
            return;
        }
        if (z) {
            str2 = "ttsocial_dm_back_btn_click";
        } else {
            str2 = "ttsocial_dm_back_btn_show";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IIMChatRoomAnalytics.LIZ.getClass();
        IIMChatRoomAnalytics iIMChatRoomAnalyticsLIZ = C06Q7.LIZ();
        if (iIMChatRoomAnalyticsLIZ != null) {
            strLIZJ = iIMChatRoomAnalyticsLIZ.LIZJ(Jo());
        } else {
            strLIZJ = null;
        }
        String str3 = "";
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        SessionInfo sessionInfoJo2 = Jo();
        if (sessionInfoJo2 != null && (conversationId = sessionInfoJo2.getConversationId()) != null) {
            str3 = conversationId;
        }
        linkedHashMap.put("conversation_id", str3);
        linkedHashMap.put("message_num", String.valueOf(j));
        linkedHashMap.put("position", "dm_top");
        linkedHashMap.put("chat_type", strLIZJ);
        linkedHashMap.put("enter_from", "chat");
        linkedHashMap.put("notice_type", str);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL(str2, linkedHashMap);
    }

    public final void Vo(LinearLayout linearLayout, TuxTextView tuxTextView, C910680Zo2 c910680Zo2) {
        if (tuxTextView != null) {
            tuxTextView.setText(Ho(c910680Zo2.LIZJ, c910680Zo2.LIZIZ));
        }
        C337180DJs.LIZJ(linearLayout);
        String mobValue = c910680Zo2.LIZ.toMobValue();
        if (c910680Zo2.LIZLLL == null) {
            C786410Ut5.R7(linearLayout, new ACListenerS56S1200000_14(this, c910680Zo2, mobValue, 2));
        } else {
            C786410Ut5.R7(linearLayout, new ACListenerS56S1200000_14(this, c910680Zo2, mobValue, 3));
        }
        ((ArrayList) this.LLJ).add(linearLayout);
        So(c910680Zo2.LIZIZ, mobValue, false);
    }
}
