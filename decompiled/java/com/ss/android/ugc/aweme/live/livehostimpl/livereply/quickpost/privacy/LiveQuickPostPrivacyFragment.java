package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.privacy;

import X.AnonymousClass1278;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C11GO;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1391190mJ3;
import X.C1685300txQ;
import X.C176600m4;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C343970De7;
import X.C452501pT;
import X.C485260J1g;
import X.C497740JfY;
import X.C786410Ut5;
import X.EnumC1216650hlX;
import X.EnumC1813540xIG;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostPrivacyConfigModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveQuickPostPrivacyFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklPyohLTHELIOSUgMGEiPSwvIj88OzFiOT06PiQvMGEfITMpGDo6Ky4cJjwnGDclPy4wMQM+KCg+LSs4";
    public int LLIZ;
    public final C01GW LLIZLLLIL;
    public Function1<? super Integer, Unit> LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public int LLJILLL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        Integer numLIZJ;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LJIIIIZZ = getString(2131823353);
        c1251150ifB.LIZJ(new AwS571S0100000_27(this, 413));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131858432);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        if (C176600m4.LIZIZ(Boolean.valueOf(((PostPrivacyConfigModel) this.LLIZLLLIL.getValue()).getForceDarkMode()))) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1e, new C1361400lX0(getContext(), R.style.y0));
            c0om1.LIZJ(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
            return c0om1;
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        c0om1.LIZJ(iIntValue);
        return c0om1;
    }

    public LiveQuickPostPrivacyFragment() {
        EnumC1813540xIG enumC1813540xIG = EnumC1813540xIG.PUBLIC;
        this.LLIZ = enumC1813540xIG.getValue();
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 414));
        this.LLJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 418));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 415));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 416));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 417));
        this.LLJILLL = enumC1813540xIG.getValue();
    }

    public static String UR(int i) {
        if (i == EnumC1813540xIG.PUBLIC.getValue()) {
            return "public";
        }
        if (i == EnumC1813540xIG.FRIENDS.getValue()) {
            return "friends";
        }
        if (i == EnumC1813540xIG.ONLY_YOU.getValue()) {
            return "private";
        }
        return "";
    }

    public final void SR(int i) {
        if (this.LLIZ == i) {
            return;
        }
        C485260J1g c485260J1g = C485260J1g.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("from_status", UR(this.LLIZ));
        c2344009Gk.LJIIIIZZ("to_status", UR(i));
        Map<String, String> map = c2344009Gk.LIZ;
        c485260J1g.getClass();
        C20684815ws.LJIILLIIL("livesdk_anchor_change_video_visibility", map);
        this.LLIZ = i;
        VR(i);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
        Function1<? super Integer, Unit> function1 = this.LLJ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    public final void VR(int i) {
        C127M accessory;
        C127M accessory2;
        C11GO c11go;
        C11GO c11go2;
        C11GO c11go3;
        C127M accessory3;
        C127M accessory4;
        C11GO c11go4;
        C11GO c11go5;
        C11GO c11go6;
        C127M accessory5;
        C127M accessory6;
        C11GO c11go7;
        C11GO c11go8;
        C11GO c11go9;
        C127M accessory7 = null;
        if (i == EnumC1813540xIG.PUBLIC.getValue()) {
            C127K c127k = (C127K) this.LLJIJIL.getValue();
            if (c127k != null) {
                accessory5 = c127k.getAccessory();
            } else {
                accessory5 = null;
            }
            if ((accessory5 instanceof AnonymousClass1278) && (c11go9 = (C11GO) accessory5) != null) {
                c11go9.LJIILJJIL(true);
            }
            C127K c127k2 = (C127K) this.LLJILJIL.getValue();
            if (c127k2 != null) {
                accessory6 = c127k2.getAccessory();
            } else {
                accessory6 = null;
            }
            if ((accessory6 instanceof AnonymousClass1278) && (c11go8 = (C11GO) accessory6) != null) {
                c11go8.LJIILJJIL(false);
            }
            C127K c127k3 = (C127K) this.LLJILJILJ.getValue();
            if (c127k3 != null) {
                accessory7 = c127k3.getAccessory();
            }
            if ((accessory7 instanceof AnonymousClass1278) && (c11go7 = (C11GO) accessory7) != null) {
                c11go7.LJIILJJIL(false);
                return;
            }
            return;
        }
        if (i == EnumC1813540xIG.FRIENDS.getValue()) {
            C127K c127k4 = (C127K) this.LLJIJIL.getValue();
            if (c127k4 != null) {
                accessory3 = c127k4.getAccessory();
            } else {
                accessory3 = null;
            }
            if ((accessory3 instanceof AnonymousClass1278) && (c11go6 = (C11GO) accessory3) != null) {
                c11go6.LJIILJJIL(false);
            }
            C127K c127k5 = (C127K) this.LLJILJIL.getValue();
            if (c127k5 != null) {
                accessory4 = c127k5.getAccessory();
            } else {
                accessory4 = null;
            }
            if ((accessory4 instanceof AnonymousClass1278) && (c11go5 = (C11GO) accessory4) != null) {
                c11go5.LJIILJJIL(true);
            }
            C127K c127k6 = (C127K) this.LLJILJILJ.getValue();
            if (c127k6 != null) {
                accessory7 = c127k6.getAccessory();
            }
            if (!(accessory7 instanceof AnonymousClass1278) || (c11go4 = (C11GO) accessory7) == null) {
                return;
            }
            c11go4.LJIILJJIL(false);
            return;
        }
        if (i != EnumC1813540xIG.ONLY_YOU.getValue()) {
            return;
        }
        C127K c127k7 = (C127K) this.LLJIJIL.getValue();
        if (c127k7 != null) {
            accessory = c127k7.getAccessory();
        } else {
            accessory = null;
        }
        if ((accessory instanceof AnonymousClass1278) && (c11go3 = (C11GO) accessory) != null) {
            c11go3.LJIILJJIL(false);
        }
        C127K c127k8 = (C127K) this.LLJILJIL.getValue();
        if (c127k8 != null) {
            accessory2 = c127k8.getAccessory();
        } else {
            accessory2 = null;
        }
        if ((accessory2 instanceof AnonymousClass1278) && (c11go2 = (C11GO) accessory2) != null) {
            c11go2.LJIILJJIL(false);
        }
        C127K c127k9 = (C127K) this.LLJILJILJ.getValue();
        if (c127k9 != null) {
            accessory7 = c127k9.getAccessory();
        }
        if (!(accessory7 instanceof AnonymousClass1278) || (c11go = (C11GO) accessory7) == null) {
            return;
        }
        c11go.LJIILJJIL(true);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJILLL = ((PostPrivacyConfigModel) this.LLIZLLLIL.getValue()).getCurrentType();
        C485260J1g c485260J1g = C485260J1g.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("current_status", UR(this.LLJILLL));
        Map<String, String> map = c2344009Gk.LIZ;
        c485260J1g.getClass();
        C20684815ws.LJIILLIIL("livesdk_anchor_show_private_setting_popup", map);
    }

    public final void WR(C127K c127k, int i) {
        String string;
        if (i == EnumC1813540xIG.PUBLIC.getValue()) {
            string = getResources().getString(2131829276);
        } else if (i == EnumC1813540xIG.FRIENDS.getValue()) {
            string = getResources().getString(2131829278);
        } else if (i == EnumC1813540xIG.ONLY_YOU.getValue()) {
            string = getResources().getString(2131829280);
        } else {
            string = "";
        }
        c127k.setTitle(string);
        c127k.LIZJ(EnumC1216650hlX.PADDING_28, EnumC1216650hlX.PADDING_16);
        c127k.setCellEnabled(true);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C11GO c11go;
        C11GO c11go2;
        C11GO c11go3;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) this.LLJI.getValue();
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131855474));
        }
        if (getContext() != null) {
            VR(this.LLIZ);
            C127K c127k = (C127K) this.LLJIJIL.getValue();
            if (c127k != null) {
                WR(c127k, EnumC1813540xIG.PUBLIC.getValue());
                C127M accessory = c127k.getAccessory();
                if ((accessory instanceof AnonymousClass1278) && (c11go3 = (C11GO) accessory) != null) {
                    c11go3.LJIILL(new AwS571S0100000_27(this, c127k, 6));
                }
            }
            C127K c127k2 = (C127K) this.LLJILJIL.getValue();
            if (c127k2 != null) {
                WR(c127k2, EnumC1813540xIG.FRIENDS.getValue());
                C127M accessory2 = c127k2.getAccessory();
                if ((accessory2 instanceof AnonymousClass1278) && (c11go2 = (C11GO) accessory2) != null) {
                    c11go2.LJIILL(new AwS571S0100000_27(this, c127k2, 7));
                }
            }
            C127K c127k3 = (C127K) this.LLJILJILJ.getValue();
            if (c127k3 != null) {
                WR(c127k3, EnumC1813540xIG.ONLY_YOU.getValue());
                C127M accessory3 = c127k3.getAccessory();
                if ((accessory3 instanceof AnonymousClass1278) && (c11go = (C11GO) accessory3) != null) {
                    c11go.LJIILL(new AwS571S0100000_27(this, c127k3, 8));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Boolean boolValueOf;
        int i;
        PostPrivacyConfigModel postPrivacyConfigModel = (PostPrivacyConfigModel) this.LLIZLLLIL.getValue();
        C19GS c19gs = null;
        if (postPrivacyConfigModel != null) {
            boolValueOf = Boolean.valueOf(postPrivacyConfigModel.getForceDarkMode());
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            i = R.style.y0;
        } else {
            i = R.style.my;
        }
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(getContext(), i)), R.layout.dda, viewGroup, false);
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
