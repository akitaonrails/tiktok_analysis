package com.ss.android.ugc.aweme.contactselect;

import X.AbstractC1387200mCc;
import X.C013C;
import X.C01GW;
import X.C098200Yq;
import X.C0H25;
import X.C0OM1;
import X.C1251150ifB;
import X.C13LE;
import X.C1668880tWw;
import X.C1669670tYD;
import X.C1683130ttv;
import X.C1683380tuK;
import X.C1683510tuX;
import X.C1685300txQ;
import X.C1783520wVq;
import X.C1783550wVt;
import X.C1790740whU;
import X.C1790750whV;
import X.C189200o6;
import X.C1906580ziK;
import X.C1954807lC;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C259800zU;
import X.C336720DHy;
import X.C452501pT;
import X.EnumC1427810nG7;
import X.EnumC452301pR;
import X.InterfaceC1683480tuU;
import X.InterfaceC1790780whY;
import X.InterfaceC344240DeY;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS155S0400000_27;
import kotlin.jvm.internal.AwS304S0300000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ContactSelectPanel extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJzHELIOSsyKzE/LCM2KzFiCiA9PCQvPRw2JCAvPR8yJiAg";
    public ComposeView LLIZ;
    public C1790750whV LLIZLLLIL;
    public IMAiGroupShotConfig LLJ;
    public boolean LLJI;
    public final ViewModelLazy LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    public final ContactSelectViewModel SR() {
        return (ContactSelectViewModel) this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS571S0100000_27(this, 222));
        c0om1.LIZIZ(c1251150ifB);
        if (this.LLJI) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB2.LIZJ(new AwS571S0100000_27(this, 223));
            c0om1.LJ(c1251150ifB2);
        }
        return c0om1;
    }

    public final IMAiGroupShotConfig UR() {
        IMAiGroupShotConfig iMAiGroupShotConfig = this.LLJ;
        if (iMAiGroupShotConfig != null) {
            return iMAiGroupShotConfig;
        }
        "init config fail".toString();
        throw new IllegalStateException("init config fail");
    }

    public ContactSelectPanel() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS571S0100000_27(new AwS571S0100000_27((Fragment) this, 226), (Function0<Unit>) 227));
        this.LLJIJIL = C336720DHy.LIZ(this, C13LE.LIZ(ContactSelectViewModel.class), new AwS571S0100000_27(c01gwLIZ, 228), new AwS428S0200000_27((Function0) null, c01gwLIZ, 10), new AwS428S0200000_27(this, c01gwLIZ, 11));
        this.LLJILJIL = C1BNE.LIZ(0);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 225));
        this.LLJILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 224));
    }

    public final IMAiGroupShotConfig.ContactSelectConfig.Selecting VR() {
        IMAiGroupShotConfig.ContactSelectConfig.Selecting selecting;
        IMAiGroupShotConfig.ContactSelectConfig contactSelectConfig = UR().contactSelectConfig;
        if ((contactSelectConfig instanceof IMAiGroupShotConfig.ContactSelectConfig.Selecting) && (selecting = (IMAiGroupShotConfig.ContactSelectConfig.Selecting) contactSelectConfig) != null) {
            return selecting;
        }
        "should have skipped this page".toString();
        throw new IllegalStateException("should have skipped this page");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0H25 c0h25 = (C0H25) this.LLJILJILJ.getValue();
        if (c0h25 != null) {
            c0h25.onPause();
            c0h25.LLILZIL.remove(this.LLJILLL.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0H25 c0h25 = (C0H25) this.LLJILJILJ.getValue();
        if (c0h25 != null) {
            c0h25.onResume();
            c0h25.LJJIIJ((C1790740whU) this.LLJILLL.getValue());
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IMAiGroupShotConfig iMAiGroupShotConfig;
        boolean z;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            iMAiGroupShotConfig = (IMAiGroupShotConfig) arguments.getParcelable("config");
        } else {
            iMAiGroupShotConfig = null;
        }
        this.LLJ = iMAiGroupShotConfig;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("enable_back_button");
        } else {
            z = false;
        }
        this.LLJI = z;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.0ttv] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IMAiGroupShotConfig.TemplateConfig.Selected selected;
        String str;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Object value;
        InterfaceC1683480tuU c1683380tuK;
        String string;
        super.onViewCreated(view, bundle);
        ContactSelectViewModel contactSelectViewModelSR = SR();
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        IMAiGroupShotConfig iMAiGroupShotConfigUR = UR();
        IMAiGroupShotConfig.ContactSelectConfig.Selecting selectingVR = VR();
        contactSelectViewModelSR.getClass();
        C1783520wVq.LL.LIZJ();
        IMAiGroupShotConfig.TemplateConfig templateConfig = iMAiGroupShotConfigUR.templateConfig;
        if ((templateConfig instanceof IMAiGroupShotConfig.TemplateConfig.Selected) && (selected = (IMAiGroupShotConfig.TemplateConfig.Selected) templateConfig) != null && (str = selected.templateId) != null && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            C2252321DDq c2252321DDq = contactSelectViewModelSR.LLILLL;
            do {
                value = c2252321DDq.getValue();
                IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction customTopActionInvoke = selectingVR.provideCustomTopAction.invoke(str);
                if (Intrinsics.LJFF(customTopActionInvoke, IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.None.INSTANCE)) {
                    c1683380tuK = C1683510tuX.LIZ;
                } else if (customTopActionInvoke instanceof IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible) {
                    IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible visible = (IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible) customTopActionInvoke;
                    C1668880tWw c1668880tWw = new C1668880tWw(visible.startIconRes);
                    IMAiGroupShotConfig.Text text = visible.text;
                    if (text instanceof IMAiGroupShotConfig.Text.FromRes) {
                        string = activityLIZIZ.getString(((IMAiGroupShotConfig.Text.FromRes) text).res);
                    } else if (text instanceof IMAiGroupShotConfig.Text.FromString) {
                        string = ((IMAiGroupShotConfig.Text.FromString) text).string;
                    } else {
                        throw new C1954807lC();
                    }
                    c1683380tuK = new C1683380tuK(c1668880tWw, string, new C1668880tWw(visible.endIconRes));
                    contactSelectViewModelSR.LL = new AwS155S0400000_27(customTopActionInvoke, activity, this, iMAiGroupShotConfigUR, 10);
                } else {
                    throw new C1954807lC();
                }
            } while (!c2252321DDq.compareAndSet(value, c1683380tuK));
            contactSelectViewModelSR.LLILLJJLI = selectingVR.minimumSelectedContacts;
            C2252321DDq c2252321DDq2 = contactSelectViewModelSR.LLILZLL;
            while (!c2252321DDq2.compareAndSet(c2252321DDq2.getValue(), selectingVR.preselectedUids)) {
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(contactSelectViewModelSR), null, null, new C1783550wVt(contactSelectViewModelSR, selectingVR, null), 3);
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new C1683130ttv(0.0f, 0.0f, 0.0f, 0.0f);
        final C013C c013c = new C013C();
        C1790750whV c1790750whV = this.LLIZLLLIL;
        if (c1790750whV != null) {
            c1790750whV.setCallback(new InterfaceC1790780whY() { // from class: X.0whW
                @Override // X.InterfaceC1790780whY
                public final boolean LIZ(MotionEvent motionEvent) {
                    if (motionEvent.getY() <= c259800zU.element.LIZIZ || motionEvent.getY() >= c259800zU.element.LIZLLL || c013c.element) {
                        return false;
                    }
                    return true;
                }
            });
            ComposeView composeView = this.LLIZ;
            if (composeView != null) {
                C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(981068486, new AwS304S0300000_27(this, (ContactSelectPanel) c259800zU, (C259800zU<C1683130ttv>) c013c, (C013C) 2), true));
                return;
            } else {
                "init composeView fail".toString();
                throw new IllegalStateException("init composeView fail");
            }
        }
        "init touchFrame fail".toString();
        throw new IllegalStateException("init touchFrame fail");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1790750whV c1790750whV;
        Context context;
        C19GS c19gs = null;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            this.LLIZ = new ComposeView(context, null, 6);
            c1790750whV = new C1790750whV(context);
            c1790750whV.addView(this.LLIZ);
            this.LLIZLLLIL = c1790750whV;
        } else {
            c1790750whV = null;
        }
        if (!(c1790750whV instanceof View)) {
            c1790750whV = null;
        }
        if (c1790750whV != null) {
            try {
                ViewTreeLifecycleOwner.set(c1790750whV, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(c1790750whV, this);
                c1790750whV.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return c1790750whV;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return c1790750whV;
    }
}
