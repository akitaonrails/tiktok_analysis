package com.ss.android.ugc.profile.business.ur.ui;

import X.AbstractC1250290idn;
import X.C0WZX;
import X.C1232180iAa;
import X.C1250250idj;
import X.C1250300ido;
import X.C1308910kAL;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C1389600mGU;
import X.C1EDI;
import X.C2204961BRm;
import X.C444960Hcc;
import X.C787200UuM;
import X.EnumC638250P1r;
import X.InterfaceC197023126r;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileEditInputFragment extends ProfileDetailEditFragment {
    public static final C1232180iAa LLILZ = new Object() { // from class: X.0iAa
    };
    public static final int LLILZIL = 8;
    public TuxNavBar LLILLJJLI;
    public TextView LLILLL;

    public final boolean bS() {
        return true;
    }

    public abstract void gS();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return WR(this, bundle);
    }

    public void LLFII() {
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            tuxNavBar.LJJ(AFwS257S0000000_19.get$arr$(475), "save");
        }
    }

    public void LLIZLLLIL() {
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            tuxNavBar.LJJ(AFwS257S0000000_19.get$arr$(474), "save");
        }
    }

    public final AbstractC1250290idn dS() {
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "cancel";
        c1250300ido.LIZJ = getString(C1EDI.LJ() ? 2131838866 : 2131828217);
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ = new InterfaceC197023126r() { // from class: X.0iAZ
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                this.LIZ.onBackPressed();
            }
        };
        return c1250300ido;
    }

    public boolean onBackPressed() {
        Dialog dialog;
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return true;
    }

    public final TextView ZR() {
        return this.LLILLL;
    }

    public final TuxNavBar aS() {
        return this.LLILLJJLI;
    }

    public Dialog VR(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0iAY
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 4 && keyEvent.getAction() == 1) {
                    this.LL.onBackPressed();
                    return false;
                }
                return false;
            }
        });
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        return dialogOnCreateDialog;
    }

    public final C1250250idj cS(String str) {
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        c1250250idj.LIZIZ = "title";
        return c1250250idj;
    }

    public final void hS(TextView textView) {
        this.LLILLL = textView;
    }

    public final void iS(TuxNavBar tuxNavBar) {
        this.LLILLJJLI = tuxNavBar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (C444960Hcc.LIZIZ()) {
            i = R.style.af3;
        } else {
            i = R.style.af2;
        }
        setStyle(1, i);
    }

    public static Dialog WR(ProfileEditInputFragment profileEditInputFragment, Bundle bundle) {
        View decorView;
        Dialog dialogVR = profileEditInputFragment.VR(bundle);
        Window window = dialogVR.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, profileEditInputFragment);
        }
        C1389600mGU.LIZJ(dialogVR);
        return dialogVR;
    }

    public final boolean UR(EditText editText, int i) throws Throwable {
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzT87V+xopd7ac7TSsM", null));
        if (editableLLJILLL.length() <= i) {
            return false;
        }
        int selectionEnd = Selection.getSelectionEnd(editableLLJILLL);
        editText.setText(editableLLJILLL.toString().substring(0, i));
        Editable editableLLJILLL2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzT87V+xopd7ac7TSsM", null));
        if (selectionEnd > editableLLJILLL2.length()) {
            selectionEnd = editableLLJILLL2.length();
        }
        Selection.setSelection(editableLLJILLL2, selectionEnd);
        return true;
    }

    public final void RR(boolean z, int i, int i2, boolean z2, boolean z3) {
        int i3;
        ForegroundColorSpan foregroundColorSpan;
        Integer numLIZJ;
        if (z) {
            i3 = R.attr.zs;
        } else if (z3) {
            i3 = R.attr.a1p;
        } else {
            i3 = R.attr.a1k;
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i3, context)) != null) {
            foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
        } else {
            foregroundColorSpan = null;
        }
        if (!C1EDI.LJ() || !z2) {
            i = Math.min(i, i2);
        }
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZJ(C787200UuM.LIZ(i), foregroundColorSpan, 33);
        c1360520lVa.LJI("/");
        c1360520lVa.LIZ.append((CharSequence) C787200UuM.LIZ(i2));
        C1360500lVY c1360500lVY = c1360520lVa.LIZ;
        TextView textView = this.LLILLL;
        if (textView != null) {
            textView.setText(c1360500lVY);
        }
    }

    public static /* synthetic */ void SR(ProfileEditInputFragment profileEditInputFragment, boolean z, int i, int i2, boolean z2, boolean z3, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 8) != 0) {
                z2 = false;
            }
            if ((i3 & 16) != 0) {
                z3 = false;
            }
            profileEditInputFragment.RR(z, i, i2, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeEditLengthHint");
    }
}
