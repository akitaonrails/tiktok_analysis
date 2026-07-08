package com.ss.android.ugc.aweme.live.liveevent.sticker.sheet.base;

import X.AnonymousClass1278;
import X.C098200Yq;
import X.C0OM1;
import X.C11GO;
import X.C127K;
import X.C127M;
import X.C1389600mGU;
import X.C1406260mhM;
import X.C1685300txQ;
import X.C1854060yLc;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C418440Gaw;
import X.C786410Ut5;
import X.DialogC1389100mFg;
import X.InterfaceC1844390y61;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS32S0201000_27;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class SingleOptionSelectionSheet extends BaseSheet implements InterfaceC1844390y61 {
    public static final float LLJLLL = C418440Gaw.LIZIZ(14);
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LColLSs4ZzwnISHELIOSYnLD19Oy0pLDt9KiQ/LGEAISsrJSocODElJiEALSkpKjs6JysfISo2PA==";
    public C0OM1 LLJJIII;
    public int LLJJIJI;
    public List<C1406260mhM> LLJJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJ;
    public ViewGroup LLJJJIL;
    public C197039127h LLJJJJJIL;
    public String LLJJJJLIIL;
    public Function2<? super SingleOptionSelectionSheet, ? super Integer, Unit> LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public Function2<? super SingleOptionSelectionSheet, ? super Integer, Unit> LLJL;
    public Function2<? super SingleOptionSelectionSheet, ? super Integer, Unit> LLJLILLLLZIIL;
    public boolean LLJLL;
    public float LLJLLIL;
    public final int LLJJIJIIJIL = -1;
    public boolean LLJJJJ = true;
    public int LLJLIL = -1;

    public static final class SingleSelectionCell extends PowerCell<C1406260mhM> {
        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
            C127K c127k;
            C11GO c11go;
            C1406260mhM c1406260mhM = (C1406260mhM) interfaceC1891350zJl;
            super.onBindItemView(c1406260mhM);
            View view = this.itemView;
            if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
                c127k.setTitle(c1406260mhM.LLILLJJLI);
                c127k.setSubtitle(c1406260mhM.LLILLL);
                C127M accessory = c127k.getAccessory();
                if ((accessory instanceof AnonymousClass1278) && (c11go = (C11GO) accessory) != null) {
                    c11go.LJIILJJIL(c1406260mhM.LLILZIL);
                }
            }
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup viewGroup) {
            C127K c127k = new C127K(viewGroup.getContext(), null, 6);
            C786410Ut5.Y6(c127k, new ViewGroup.LayoutParams(-1, -2));
            AnonymousClass1278 anonymousClass1278 = new AnonymousClass1278(viewGroup.getContext());
            anonymousClass1278.LJIILL(new AwS571S0100000_27(this, 293));
            c127k.setAccessory(anonymousClass1278);
            return c127k;
        }
    }

    @Override // X.InterfaceC1844390y61
    public final void gG2(int i) {
        C20600815jK<InterfaceC1891350zJl> state;
        C1406260mhM c1406260mhM;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            int i2 = this.LLJLIL;
            C1406260mhM c1406260mhM2 = null;
            if (i2 != -1) {
                InterfaceC1891350zJl interfaceC1891350zJlLJI = state.LJI(i2);
                if ((interfaceC1891350zJlLJI instanceof C1406260mhM) && (c1406260mhM = (C1406260mhM) interfaceC1891350zJlLJI) != null) {
                    int i3 = this.LLJLIL;
                    C1406260mhM c1406260mhMLIZ = C1406260mhM.LIZ(c1406260mhM);
                    c1406260mhMLIZ.LLILZIL = false;
                    state.LJIILJJIL(i3, c1406260mhMLIZ);
                }
            }
            InterfaceC1891350zJl interfaceC1891350zJlLJI2 = state.LJI(i);
            if (interfaceC1891350zJlLJI2 instanceof C1406260mhM) {
                c1406260mhM2 = (C1406260mhM) interfaceC1891350zJlLJI2;
            }
            if (c1406260mhM2 != null) {
                C1406260mhM c1406260mhMLIZ2 = C1406260mhM.LIZ(c1406260mhM2);
                c1406260mhMLIZ2.LLILZIL = true;
                state.LJIILJJIL(i, c1406260mhMLIZ2);
            }
            this.LLJLIL = i;
            C197039127h c197039127h = this.LLJJJJJIL;
            if (c197039127h != null) {
                c197039127h.setEnabled(true);
            }
            Function2<? super SingleOptionSelectionSheet, ? super Integer, Unit> function2 = this.LLJLILLLLZIIL;
            if (function2 != null) {
                function2.invoke(this, Integer.valueOf(i));
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        setCancelable(this.LLJLL);
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        DialogC1389100mFg dialogC1389100mFg = (DialogC1389100mFg) dialogOnCreateDialog;
        dialogC1389100mFg.setCanceledOnTouchOutside(this.LLJLL);
        dialogC1389100mFg.setCancelable(this.LLJLL);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C20600815jK<InterfaceC1891350zJl> state;
        Window window;
        boolean z;
        List<C1406260mhM> list;
        C1406260mhM c1406260mhM;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dcn, viewGroup, false);
        RadiusLayout radiusLayout = (RadiusLayout) viewTd.findViewById(R.id.spp);
        if (radiusLayout != null) {
            float f = LLJLLL;
            radiusLayout.LIZ(f, f, 0.0f, 0.0f);
        }
        C1854060yLc c1854060yLc = (C1854060yLc) viewTd.findViewById(R.id.un6);
        c1854060yLc.setFixedHeightPx(this.LLJJIJIIJIL);
        c1854060yLc.setVariant(this.LLJJIJI);
        c1854060yLc.setDragable(this.LLJJJJ);
        c1854060yLc.setDismissFunc(new AwS571S0100000_27(this, 294));
        TuxNavBar tuxNavBar = (TuxNavBar) viewTd.findViewById(R.id.un2);
        tuxNavBar.setNavBackground(0);
        C0OM1 c0om1 = this.LLJJIII;
        if (c0om1 != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        int i = this.LLJLIL;
        int i2 = -1;
        if (i != -1 && (list = this.LLJJIJIL) != null && (c1406260mhM = (C1406260mhM) ListProtector.get(list, i)) != null) {
            c1406260mhM.LLILZIL = true;
        }
        String str = this.LLJJJJLIIL;
        if (str != null) {
            C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.un4);
            this.LLJJJJJIL = c197039127h;
            if (c197039127h != null) {
                c197039127h.setText(str);
            }
            C197039127h c197039127h2 = this.LLJJJJJIL;
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, new ACListenerS161S0100000_27(this, 39));
            }
            C197039127h c197039127h3 = this.LLJJJJJIL;
            if (c197039127h3 != null) {
                List<C1406260mhM> list2 = this.LLJJIJIL;
                if (list2 != null && !list2.isEmpty()) {
                    Iterator<C1406260mhM> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().LLILZIL) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    c197039127h3.setEnabled(z);
                } else {
                    z = false;
                    c197039127h3.setEnabled(z);
                }
            }
        }
        String str2 = this.LLJJLIIIJLLLLLLLZ;
        if (str2 != null) {
            C197039127h c197039127h4 = (C197039127h) viewTd.findViewById(R.id.un3);
            c197039127h4.setText(str2);
            C786410Ut5.U8(c197039127h4, new ACListenerS161S0100000_27(this, 40));
        }
        this.LLJJJIL = (ViewGroup) viewTd.findViewById(R.id.umz);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.addFlags(2);
            window.setDimAmount(this.LLJLLIL);
        }
        List<C1406260mhM> list3 = this.LLJJIJIL;
        C19GS c19gs = null;
        if (list3 != null) {
            this.LLJJJ = (ViewOnAttachStateChangeListenerC20604515jv) viewTd.findViewById(R.id.un5);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
            }
            Iterator<C1406260mhM> it3 = list3.iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (it3.next().LLILZIL) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(SingleSelectionCell.class);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                state.LIZLLL(list3, null);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jv4.getAdapter()).LLLLII(this, SingleOptionSelectionSheet.class);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv5, new ARunnableS32S0201000_27(i2, linearLayoutManager, this, 4));
            }
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
