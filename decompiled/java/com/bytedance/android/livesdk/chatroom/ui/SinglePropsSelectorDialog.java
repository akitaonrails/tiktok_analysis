package com.bytedance.android.livesdk.chatroom.ui;

import X.C0PEM;
import X.C0U56;
import X.C0U6J;
import X.C1766560w4U;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C422470GhR;
import X.C500980Jkm;
import X.C753560ThC;
import X.C753570ThD;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC1836610xtT;
import Y.AObjectS387S0100000_12;
import Y.AObjectS528S0100000_12;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.viewmodel.SinglePropsViewModel;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS626S0100000_12;
import u4.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class SinglePropsSelectorDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPTHELIOS08JyhiPCZ9GywiLiM2GDcjOTwALSkpKjs8OgElKCM8Lw==";
    public final String LL;
    public final Function2<String, ImageModel, Unit> LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public LinearLayout LLILZ;
    public RunnableC781530UlD LLILZIL;
    public ViewOnClickListenerC1836610xtT LLILZLL;
    public C0U6J LLIZ;
    public SinglePropsViewModel LLIZLLLIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g_l);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 50;
        c500980Jkm.LJI = 0.5f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LIZJ(false, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LJFF(-16777216);
        tuxImmersionBarLIZJ.LIZIZ.LJII(false);
        tuxImmersionBarLIZJ.LIZLLL();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C0U56 getPanelType() {
        return C0U56.PANEL_STICKER_PLAYBOOK;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        Drawable background;
        super.onViewCreated(view, bundle);
        this.LLILZ = (LinearLayout) view.findViewById(R.id.trr);
        this.LLILZIL = (RunnableC781530UlD) view.findViewById(R.id.se0);
        this.LLILZLL = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.w72);
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null && (background = linearLayout.getBackground()) != null) {
            background.setAlpha(255);
        }
        LinearLayout linearLayout2 = this.LLILZ;
        if (linearLayout2 != null && (viewFindViewById = linearLayout2.findViewById(R.id.title)) != null) {
            q0.LJIJI(viewFindViewById, true);
        }
        C0U6J c0u6j = new C0U6J(new AwS626S0100000_12(this, 15), true);
        this.LLIZ = c0u6j;
        c0u6j.LLIZ = this.LL;
        RunnableC781530UlD runnableC781530UlD = this.LLILZIL;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setLayoutManager(new GridLayoutManager(getContext(), 3));
            runnableC781530UlD.setAdapter(this.LLIZ);
            runnableC781530UlD.addItemDecoration(new C422470GhR());
        }
        SinglePropsViewModel singlePropsViewModel = (SinglePropsViewModel) ViewModelProviders.of(this).get(SinglePropsViewModel.class);
        this.LLIZLLLIL = singlePropsViewModel;
        if (singlePropsViewModel != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C753570ThD(singlePropsViewModel, this, null), 2);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C753560ThC(this, null), 2);
    }

    public SinglePropsSelectorDialog(String str, AObjectS387S0100000_12 aObjectS387S0100000_12, AObjectS528S0100000_12 aObjectS528S0100000_12) {
        this.LL = str;
        this.LLILLJJLI = aObjectS528S0100000_12;
        this.LLILLL = aObjectS387S0100000_12;
    }
}
