package com.ss.android.ugc.feed.platform.tablet;

import X.C098200Yq;
import X.C10GR;
import X.C1389340mG4;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20656615sK;
import X.C688120Qyw;
import X.C786410Ut5;
import X.InterfaceC20647615qs;
import Y.ACListenerS139S0100000_4;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20647615qs("tablet_external_device_education")
public final class TabletExternalDeviceEducationPopTask extends C10GR {
    public static boolean LLILZ;
    public final C19EG LL;
    public final boolean LLILLJJLI;
    public final int LLILLL = 405;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    public static final class Companion {

        public static final class ExternalDeviceEducationFragment extends AppCompatDialogFragment {
            public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiMpLCt9OCktPSk8OihiPS4xJCA4ZxsyKikpPQorPCA+Jy4/DCA6ICw2HELIOSDSE5Ki4nISoiGSAjHCQ/ImsQJyg8KCE6JytoDDcnLTciKCMXLTMlKioWLDAvKDs6JysKOy40JSAiPQ==";
            public final Function0<Unit> LL;
            public final boolean LLILLJJLI;

            @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
            public final void onConfigurationChanged(Configuration configuration) {
                super.onConfigurationChanged(configuration);
                if (configuration.screenHeightDp < 696) {
                    dismissAllowingStateLoss();
                }
            }

            @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
            public final Dialog onCreateDialog(Bundle bundle) {
                View decorView;
                Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
                Window window = dialogOnCreateDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                Window window2 = dialogOnCreateDialog.getWindow();
                if (window2 != null) {
                    window2.requestFeature(1);
                }
                Window window3 = dialogOnCreateDialog.getWindow();
                if (window3 != null && (decorView = window3.getDecorView()) != null) {
                    decorView.setTag(R.id.yzv, this);
                }
                C1389600mGU.LIZJ(dialogOnCreateDialog);
                return dialogOnCreateDialog;
            }

            @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                super.onDismiss(dialogInterface);
                this.LL.invoke();
            }

            public ExternalDeviceEducationFragment(AwS548S0100000_4 awS548S0100000_4, boolean z) {
                this.LL = awS548S0100000_4;
                this.LLILLJJLI = z;
            }

            @Override // androidx.fragment.app.Fragment
            public final void onViewCreated(View view, Bundle bundle) {
                super.onViewCreated(view, bundle);
                C786410Ut5.I7(new ACListenerS139S0100000_4(this, 52), view.findViewById(R.id.wzt));
                C786410Ut5.I7(new ACListenerS139S0100000_4(this, 53), view.findViewById(R.id.wzw));
            }

            @Override // androidx.fragment.app.Fragment
            public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                int i;
                if (this.LLILLJJLI) {
                    i = R.layout.b9i;
                } else {
                    i = R.layout.b9j;
                }
                View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
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
    }

    public TabletExternalDeviceEducationPopTask(C19EG c19eg, boolean z) {
        this.LL = c19eg;
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c20656615sK, 312);
        if (C1389340mG4.LIZJ(this.LL, null).LIZ() >= 696) {
            new Companion.ExternalDeviceEducationFragment(awS548S0100000_4, this.LLILLJJLI).show(this.LL.getSupportFragmentManager(), "tablet_external_device_support_education_pop_up");
        } else {
            awS548S0100000_4.invoke();
        }
    }
}
