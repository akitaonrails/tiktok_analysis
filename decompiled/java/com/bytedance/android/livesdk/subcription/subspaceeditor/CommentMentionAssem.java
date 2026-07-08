package com.bytedance.android.livesdk.subcription.subspaceeditor;

import X.C019F;
import X.C0IQ2;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ALAdapterS4S0100000_7;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class CommentMentionAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public FrameLayout LLJJIII;
    public float LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentMentionAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/subcription/subspaceeditor/SubSpaceEditorVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentMentionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceEditorVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 97), AFwS237S0000000_7.get$arr$(43), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hof;
    }

    public final SubSpaceEditorVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (SubSpaceEditorVM) assemVMLazy.getValue();
    }

    public final void ip(View view) {
        C786410Ut5.LJLLLLLL(0, view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight());
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new ALAdapterS4S0100000_7(view, 12));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.o7d);
        if (recyclerView != null) {
            SubSpaceEditorVM subSpaceEditorVMHp = hp();
            C0IQ2 c0iq2 = new C0IQ2(new ArrayList(), subSpaceEditorVMHp);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(c0iq2);
            subSpaceEditorVMHp.LLILZ = c0iq2;
        }
        this.LLJJIII = (FrameLayout) view.findViewById(R.id.nlo);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JC0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JC4) obj).LLILLL;
            }
        }, null, new AwS621S0100000_7(this, 14), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JBz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C0JC4) obj).LLILZLL);
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 15), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JC1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JC4) obj).LLILZIL;
            }
        }, null, new AwS621S0100000_7(this, 16), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JC2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JC4) obj).LLILZ;
            }
        }, null, new AwS621S0100000_7(this, 17), 6);
    }
}
