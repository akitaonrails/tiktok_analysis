package com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage;

import X.C019F;
import X.C0IDP;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2157208ck;
import X.C2157308cl;
import X.C2217381BqS;
import X.C259800zU;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnGlobalLayoutListenerC462880IDe;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatroomHeightViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0001000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ChatroomHeightAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatroomHeightAssem.class, "chatroomHeightVM", "getChatroomHeightVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/ChatroomHeightViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ChatroomHeightAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatroomHeightViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 330), AFwS236S0000000_6.get$arr$(183), null, true);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.0IDe] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        final View viewFindViewById = view.findViewById(R.id.dpp);
        View viewFindViewById2 = view.findViewById(R.id.dpq);
        if (viewFindViewById2 != null) {
            if (viewFindViewById2.isLaidOut() && !viewFindViewById2.isLayoutRequested()) {
                AssemVMLazy assemVMLazy = this.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
                assemVMLazy.getValue().setStateImmediate(new AwS21S0001000_6(viewFindViewById2.getHeight(), 19));
            } else {
                viewFindViewById2.addOnLayoutChangeListener(new C0IDP(this, 17));
            }
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(this, viewFindViewById, 15);
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.ChatroomHeightAssem$subscribeToHeightChange$lifecycleEventObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int i = C2157208ck.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && C2157308cl.LIZ()) {
                            C786410Ut5.C3(viewFindViewById.getViewTreeObserver(), c259800zU.element);
                            c259800zU.element = null;
                            return;
                        }
                        return;
                    }
                    C786410Ut5.C3(viewFindViewById.getViewTreeObserver(), c259800zU.element);
                    return;
                }
                C786410Ut5.x3(viewFindViewById.getViewTreeObserver(), c259800zU.element);
            }
        });
    }
}
