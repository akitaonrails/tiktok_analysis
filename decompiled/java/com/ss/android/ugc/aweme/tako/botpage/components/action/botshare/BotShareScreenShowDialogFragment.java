package com.ss.android.ugc.aweme.tako.botpage.components.action.botshare;

import X.C01RB;
import X.C098200Yq;
import X.C0PEM;
import X.C1251150ifB;
import X.C12F2;
import X.C12F3;
import X.C12F7;
import X.C12F8;
import X.C12FV;
import X.C1308910kAL;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1862330yYx;
import X.C189200o6;
import X.C19723912Ez;
import X.C19EG;
import X.C19GS;
import X.C1DFH;
import X.C20600815jK;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C425260Glw;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.tako.botpage.components.action.cell.TakoActionCell;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class BotShareScreenShowDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9Kio4OS40LWsvJiIjJyspJzsgZiHELIOSQvPSY8JmsuJjsgICQ+LGERJzEfIS4hLRYvOyo2JhYkJjgXISQgJigVOiQrJCo9PA==";
    public List<Pair<Boolean, Bitmap>> LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C12F8 LLILLL;
    public final C12F3 LLILZ = new C12F3();
    public Bitmap LLILZIL;
    public Map<String, String> LLILZLL;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.LLILZ.LIZIZ.LIZ.invoke();
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        ITakoContextAbility iTakoContextAbility;
        C12F7 c12f7;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Map<String, String> commonParams = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("data");
        } else {
            serializable = null;
        }
        if ((serializable instanceof C12F7) && (c12f7 = (C12F7) serializable) != null) {
            this.LL = c12f7.bitmaps;
            this.LLILLJJLI = c12f7.scope;
            this.LLILLL = c12f7.listener;
        }
        C12F3 c12f3 = this.LLILZ;
        new AwS608S0100000_29(this, 281).invoke(c12f3.LIZIZ);
        C12F2.LIZ(c12f3, new AwS573S0100000_29(this, 492), new AwS573S0100000_29(this, 493), false, null);
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
        if (interfaceC665370Q7z != null && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null)) != null) {
            commonParams = iTakoContextAbility.getCommonParams();
        }
        this.LLILZLL = commonParams;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.LLILZ.LIZIZ.LIZIZ.invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        Context context = tuxNavBar.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxNavBar.setNavBackground(iIntValue);
        tuxNavBar.LJIIZILJ(false);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS573S0100000_29(this, 494));
        tuxNavBar.LIZIZ(c1251150ifB);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoActionCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
        for (C19723912Ez c19723912Ez : this.LLILZ.LIZ) {
            C20600815jK.LIZJ(viewOnAttachStateChangeListenerC20604515jv.getState(), new C425260Glw(c19723912Ez.LIZJ, Integer.valueOf(c19723912Ez.LIZLLL), c19723912Ez.LJ, new AwS608S0100000_29(c19723912Ez, 282), c19723912Ez.LJII, c19723912Ez.LJIIIIZZ, c19723912Ez.LJIIJJI));
        }
        C1862330yYx.LJLJJLL(24, C1862330yYx.LIZ, "conversation", "screen_shot", null, this.LLILZLL);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.kht);
        List<Pair<Boolean, Bitmap>> list = this.LL;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
        if (list != null && interfaceC665370Q7z != null) {
            C12FV c12fv = C12FV.LIZ;
            AwS369S0200000_3 awS369S0200000_3 = new AwS369S0200000_3(smartImageView, this, 8);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01RB(interfaceC665370Q7z, list, null, awS369S0200000_3), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.foq, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
