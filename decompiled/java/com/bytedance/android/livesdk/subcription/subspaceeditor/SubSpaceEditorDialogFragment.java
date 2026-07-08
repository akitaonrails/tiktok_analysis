package com.bytedance.android.livesdk.subcription.subspaceeditor;

import X.C019F;
import X.C01D1;
import X.C0JCM;
import X.C0JCN;
import X.C0JCU;
import X.C0KPJ;
import X.C1308910kAL;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C20337914i1;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS5S0000001_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceEditorDialogFragment extends SubEmojiInputDialogFragment {
    public static final C0JCU LLLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OzAuKj06ODElJiF9OzHELIOSAuOj8yKyApLSYnJzdiGjoxGzUtKioWLCw4Jj0XISQgJigVOiQrJCo9PA==";
    public EditText LLLLIIL;
    public final AssemVMLazy LLLLIILL;
    public C0JCM LLLLIILLL;
    public C0JCN LLLLIL;
    public LiveIconView LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0JCU] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceEditorDialogFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/subcription/subspaceeditor/SubSpaceEditorVM;", 0);
        C13LE.LIZ.getClass();
        LLLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLL = new Object() { // from class: X.0JCU
        };
    }

    @Override // com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment
    public final int SR() {
        return 140;
    }

    public SubSpaceEditorDialogFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceEditorVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 100);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(45);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 101), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 102), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 103), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLLIILL = assemVMLazy;
    }

    public final C0JCM hS() {
        if (this.LLLLIILLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0JCM.class, null);
            this.LLLLIILLL = interfaceC1555100qZQLIZIZ != null ? (C0JCM) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLLLIILLL;
    }

    public final SubSpaceEditorVM iS() {
        AssemVMLazy assemVMLazy = this.LLLLIILL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLIL;
        return (SubSpaceEditorVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment
    public final void dS(int i) {
        super.dS(i);
        iS().setState(new AwS5S0000001_7(i, 0));
    }

    @Override // com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment
    public final void gS(boolean z) {
        if (z) {
            LiveIconView liveIconView = this.LLLLILI;
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 8);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LLLLILI;
        if (liveIconView2 == null) {
            return;
        }
        C786410Ut5.LLJJIJIL(liveIconView2, 0);
    }

    @Override // com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0JCM(), C0JCM.class, "source_default_key");
    }

    @Override // com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        EditText editText = this.LLLLIIL;
        if (editText != null) {
            editText.removeTextChangedListener(iS().LLILZLL);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment
    public final View OR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.gjj, viewGroup, false);
    }

    @Override // com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        iS().LLILLJJLI = C1558360qeg.LJFF(this, null);
        iS().LL = this.LLLLIL;
        C0JCM c0jcmHS = hS();
        if (c0jcmHS != null) {
            c0jcmHS.LLILLJJLI = this.LLLLJ;
        }
        C0JCM c0jcmHS2 = hS();
        if (c0jcmHS2 != null) {
            c0jcmHS2.LLILZ = this.LLLLJI;
        }
        C0JCN c0jcn = this.LLLLIL;
        if (c0jcn != null) {
            c0jcn.Rd(this);
        }
        this.LLLLILI = (LiveIconView) view.findViewById(R.id.upp);
        this.LLLLIIL = (EditText) view.findViewById(R.id.grz);
        View viewFindViewById = view.findViewById(R.id.view_shadow);
        C786410Ut5.T4(viewFindViewById, 0.0f);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c95, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        viewFindViewById.setBackgroundColor(iIntValue);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.ALPHA, 0.0f, 0.5f);
        objectAnimatorOfFloat.setDuration(200L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 186), 3);
        C20337914i1<Boolean> c20337914i1 = C0KPJ.Ce;
        if (!c20337914i1.LIZIZ().booleanValue()) {
            c20337914i1.LJFF(Boolean.TRUE);
            C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 13), 3);
        }
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 187), 3);
    }
}
