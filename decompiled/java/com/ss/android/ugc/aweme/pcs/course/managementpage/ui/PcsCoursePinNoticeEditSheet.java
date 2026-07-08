package com.ss.android.ugc.aweme.pcs.course.managementpage.ui;

import X.C1220000hqw;
import X.C13LE;
import X.C16F5;
import X.C20736316Cj;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C489110JGb;
import X.C500980Jkm;
import X.C521830KdJ;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.ViewOnFocusChangeListenerC521740KdA;
import Y.ACListenerS142S0100000_7;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCoursePinNoticeEditSheet extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvOmEwJzA+Oip9JSQiKCHELIOSg2JSAiPT8yLyBiPCZ9GCY/CiAmOjYpGSY9Bio4ICw2DSElPRw7LSA4";
    public final C736950SvV LL = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(134), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    public EditText LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public Integer LLILZIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final PcsCourseManageVM MR() {
        return (PcsCourseManageVM) this.LL.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.dh_);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJJI = 73;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Window window;
        Integer num;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (num = this.LLILZIL) != null) {
            window.setSoftInputMode(num.intValue());
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
            this.LLILZIL = Integer.valueOf(window2.getAttributes().softInputMode);
            window2.setSoftInputMode(48);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = (EditText) view.findViewById(R.id.gp6);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.tkl);
        c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.f00, c16f5.getContext()));
        this.LLILLL = c16f5;
        this.LLILZ = (C16F5) view.findViewById(R.id.gp7);
        EditText editText = this.LLILLJJLI;
        if (editText != null) {
            editText.addTextChangedListener(new C521830KdJ(this, editText, 2));
            editText.setText(MR().getState().LLJI.LIZ);
            editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC521740KdA(this, 2));
        }
        C16F5 c16f52 = this.LLILLL;
        if (c16f52 != null) {
            C786410Ut5.l8(c16f52, new ACListenerS142S0100000_7(this, 197));
        }
        C489110JGb.LJFF(MR().zQ2(), "", "show");
    }
}
