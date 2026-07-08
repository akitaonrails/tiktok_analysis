package com.bytedance.android.livesdk.wishlistv2.dialog;

import X.C16F5;
import X.C238100vz;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC2262081DgM;
import X.InterfaceC518400KUs;
import Y.ACListenerS142S0100000_7;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveStreamGoalMessageDialog extends LiveDialogFragment implements InterfaceC518400KUs {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Pyw/ISM6OzHELIOSE6e2E3ISQgJih9BCw6LBwnOiAtJAg8KSkBLDwgKSIpDSYyJCor";
    public InterfaceC2262081DgM LLILLJJLI;
    public C16F5 LLILLL;
    public LiveEditText LLILZIL;
    public final ArrayList<C238100vz> LL = new ArrayList<>();
    public Long LLILZ = 0L;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0175 A[PHI: r1
      0x0175: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v9 java.lang.String) binds: [B:51:0x010f, B:58:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
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
    public final void MR() {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wishlistv2.dialog.LiveStreamGoalMessageDialog.MR():void");
    }

    @Override // X.InterfaceC518400KUs
    public final void ae() {
        Iterator<C238100vz> it2 = this.LL.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().LIZ) {
                i++;
            }
        }
        if (i > 0) {
            C16F5 c16f5 = this.LLILLL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJJ(2131842020, Integer.valueOf(i)));
            }
            C16F5 c16f52 = this.LLILLL;
            if (c16f52 != null) {
                C786410Ut5.l8(c16f52, new ACListenerS142S0100000_7(this, 121));
            }
            C16F5 c16f53 = this.LLILLL;
            if (c16f53 != null) {
                c16f53.setTextColor(C497740JfY.LJFF(R.color.ao));
            }
            C16F5 c16f54 = this.LLILLL;
            if (c16f54 != null) {
                c16f54.setBackgroundColor(C497740JfY.LJFF(R.color.c8));
                return;
            }
            return;
        }
        C16F5 c16f55 = this.LLILLL;
        if (c16f55 != null) {
            c16f55.setText(C497740JfY.LJIJI(2131844052));
        }
        C16F5 c16f56 = this.LLILLL;
        if (c16f56 != null) {
            C786410Ut5.l8(c16f56, new View.OnClickListener() { // from class: X.0KUr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        C16F5 c16f57 = this.LLILLL;
        if (c16f57 != null) {
            c16f57.setTextColor(C497740JfY.LJFF(R.color.f571dc));
        }
        C16F5 c16f58 = this.LLILLL;
        if (c16f58 != null) {
            c16f58.setBackgroundColor(C497740JfY.LJFF(R.color.aj));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gax);
        c500980Jkm.LJIILIIL = 32;
        c500980Jkm.LJII = 80;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Context context;
        Dialog dialog;
        View currentFocus;
        if (this.isViewValid && (context = getContext()) != null && (dialog = getDialog()) != null && (currentFocus = dialog.getCurrentFocus()) != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(context, "input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wishlistv2.dialog.LiveStreamGoalMessageDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
