package com.bytedance.android.livesdk.broadcast.interaction.toolbar;

import X.C01GW;
import X.C098200Yq;
import X.C0HZQ;
import X.C0I7D;
import X.C0IJT;
import X.C0UX1;
import X.C0UX3;
import X.C0WZX;
import X.C1161920gLG;
import X.C14K9;
import X.C1685300txQ;
import X.C16F5;
import X.C1834150xpV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C20736316Cj;
import X.C2204961BRm;
import X.C346530DiF;
import X.C452501pT;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C773260UUy;
import X.C786120Usc;
import X.C786410Ut5;
import Y.ARunnableS112S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveTitleAbility;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveTitleEditDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyY9PCHELIOSA+KCwnISoiZzs8JykuKD19BCw6LBs6PCkpDCs6PAElKCM8LwM+KCg+LSs4";
    public String LL;
    public final String LLILLJJLI;
    public final C0UX3 LLILLL;
    public C16F5 LLILZ;
    public C0I7D LLILZIL;
    public C0HZQ LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 163));
    public final C773260UUy LLIZLLLIL = C773260UUy.LL;
    public final C0UX1 LLJ = new InputFilter() { // from class: X.0UX1
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            boolean z;
            C0I7D c0i7d;
            C0I7D c0i7d2;
            int length = spanned.length();
            if (length >= 32) {
                z = true;
            } else {
                z = false;
            }
            int i5 = length - (i4 - i3);
            int i6 = i2 - i;
            int i7 = i5 + i6;
            if (i7 > 0) {
                C0I7D c0i7d3 = this.LL.LLILZIL;
                if ((c0i7d3 == null || c0i7d3.getGravity() != 17) && (c0i7d2 = this.LL.LLILZIL) != null) {
                    c0i7d2.setGravity(17);
                }
                if (length <= 0) {
                    this.LL.MR(true);
                }
            } else {
                C0I7D c0i7d4 = this.LL.LLILZIL;
                if ((c0i7d4 == null || c0i7d4.getGravity() != 16) && (c0i7d = this.LL.LLILZIL) != null) {
                    c0i7d.setGravity(16);
                }
                this.LL.MR(false);
            }
            if (z && i6 > 0) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, 32));
                return "";
            }
            if (i7 > 32) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, 32));
                int i8 = 32 - i5;
                if (i8 <= 0) {
                    return "";
                }
                return charSequence.subSequence(i, i8 + i);
            }
            return null;
        }
    };

    public final String NR() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).TT1();
    }

    public final boolean OR() {
        String strNR;
        return (MultiGuestLiveTitleAbility.INSTANCE.getValue() != 2 || (strNR = NR()) == null || strNR.length() == 0) ? false : true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C0I7D c0i7d = this.LLILZIL;
        if (c0i7d != null) {
            KeyBoardUtil.LIZJ(getContext(), c0i7d);
        }
        C0UX3 c0ux3 = this.LLILLL;
        if (c0ux3 != null) {
            c0ux3.LIZIZ();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Window window2 = requireDialog().getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
            View decorView2 = window2.getDecorView();
            if (decorView2 != null) {
                decorView2.setSystemUiVisibility(1280);
            }
            window2.setSoftInputMode(20);
        }
        C473410IhP.LIZJ(new ARunnableS112S0100000_12(this, 58), 200L);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void MR(boolean z) {
        if (z) {
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.f00, getContext()));
                return;
            }
            return;
        }
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 == null) {
            return;
        }
        c16f52.setTextColor(C20736316Cj.LIZIZ(R.attr.exp, getContext()));
    }

    public final void RR(String str) {
        Editable editableLLLLJI;
        int length;
        boolean z = true;
        if (str != null && str.length() != 0) {
            C0I7D c0i7d = this.LLILZIL;
            if (c0i7d != null) {
                c0i7d.setGravity(17);
            }
            C0I7D c0i7d2 = this.LLILZIL;
            if (c0i7d2 != null) {
                c0i7d2.setText(str);
            }
        } else {
            C0I7D c0i7d3 = this.LLILZIL;
            if (c0i7d3 != null) {
                c0i7d3.setGravity(16);
            }
            C0I7D c0i7d4 = this.LLILZIL;
            if (c0i7d4 != null) {
                c0i7d4.setText(new StringBuilder(""));
            }
            C0I7D c0i7d5 = this.LLILZIL;
            if (c0i7d5 != null) {
                c0i7d5.setHint(2131840910);
            }
        }
        C0I7D c0i7d6 = this.LLILZIL;
        if (c0i7d6 != null) {
            Editable editableLLLLJI2 = C2204961BRm.LLLLJI(c0i7d6, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/UIh/V6eBO3Ifp+GpxW3leuWp19Pzftx8DsgCD5EH+VPzM3BPM7uXKeT6fjZr5f", null));
            if (editableLLLLJI2 != null) {
                length = editableLLLLJI2.length();
            } else {
                length = 0;
            }
            c0i7d6.setSelection(length);
        }
        C0I7D c0i7d7 = this.LLILZIL;
        if (c0i7d7 == null || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d7, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/UIh/V6eBO3Ifp+GpxW3leuWp19Pzftx8DsgCD5EH+VPzM3BPM7uXKeT6fjZr5f", null))) == null || editableLLLLJI.length() <= 0) {
            z = false;
        }
        MR(z);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, android.R.style.Theme.Translucent.NoTitleBar);
    }

    public final void PR(String str, String str2) {
        Editable editableLLLLJI;
        String string;
        HashMap map = new HashMap();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).RA0(map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_live_title_setting_page");
        c474500IjALIZ.LJJII(this.LLILLJJLI, "enter_from");
        c474500IjALIZ.LJJII(str, "action_type");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "is_use_header");
        C0I7D c0i7d = this.LLILZIL;
        if (c0i7d != null && (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/UIh/V6eBO3Ifp+GpxW3leuWp19Pzftx8DsgCD5EH+VPzM3BPM7uXKeT6fjZr5f", null))) != null && (string = editableLLLLJI.toString()) != null) {
            str3 = string;
        }
        c474500IjALIZ.LJJII(str3, "live_title");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C16F5 c16f5;
        C0I7D c0i7d;
        View viewFindViewById;
        View viewFindViewById2;
        C0HZQ c0hzq;
        View viewFindViewById3;
        String string;
        Editable editableLLLLJI;
        View viewFindViewById4;
        View viewFindViewById5;
        super.onViewCreated(view, bundle);
        boolean zOR = OR();
        View view2 = getView();
        if (view2 != null && (viewFindViewById5 = view2.findViewById(R.id.w0u)) != null) {
            C500260Jjc.LJJZ(C497740JfY.LJIJ(), viewFindViewById5);
        }
        View view3 = getView();
        if (view3 != null && (viewFindViewById4 = view3.findViewById(R.id.db1)) != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById4, new AwS591S0100000_12(this, 701));
        }
        View view4 = getView();
        if (view4 != null) {
            c16f5 = (C16F5) view4.findViewById(R.id.g33);
        } else {
            c16f5 = null;
        }
        this.LLILZ = c16f5;
        if (c16f5 != null) {
            C500260Jjc.LJLIIIL(500L, c16f5, new AwS591S0100000_12(this, 702));
        }
        View view5 = getView();
        if (view5 != null) {
            c0i7d = (C0I7D) view5.findViewById(R.id.y1_);
        } else {
            c0i7d = null;
        }
        this.LLILZIL = c0i7d;
        int i = 0;
        if (c0i7d != null) {
            c0i7d.setFilters(new InputFilter[]{this.LLIZLLLIL, this.LLJ});
        }
        C0I7D c0i7d2 = this.LLILZIL;
        if (c0i7d2 != null) {
            c0i7d2.addTextChangedListener(new C786120Usc(this, 14));
        }
        RR(this.LL);
        View view6 = getView();
        if (view6 != null) {
            viewFindViewById = view6.findViewById(R.id.jis);
        } else {
            viewFindViewById = null;
        }
        View view7 = getView();
        if (view7 != null) {
            viewFindViewById2 = view7.findViewById(R.id.jjq);
        } else {
            viewFindViewById2 = null;
        }
        View view8 = getView();
        if (view8 != null) {
            c0hzq = (C0HZQ) view8.findViewById(R.id.jir);
        } else {
            c0hzq = null;
        }
        this.LLILZLL = c0hzq;
        if (viewFindViewById != null) {
            if (!zOR) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById2, new AwS591S0100000_12(this, 703));
        }
        C0HZQ c0hzq2 = this.LLILZLL;
        if (c0hzq2 != null) {
            C500260Jjc.LJLIIIL(500L, c0hzq2, new AwS591S0100000_12(this, 704));
        }
        C0HZQ c0hzq3 = this.LLILZLL;
        if (c0hzq3 != null) {
            C0I7D c0i7d3 = this.LLILZIL;
            if (c0i7d3 != null && (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/UIh/V6eBO3Ifp+GpxW3leuWp19Pzftx8DsgCD5EH+VPzM3BPM7uXKeT6fjZr5f", null))) != null) {
                string = editableLLLLJI.toString();
            } else {
                string = null;
            }
            c0hzq3.setChecked(Intrinsics.LJFF(string, NR()));
        }
        if (zOR && (viewFindViewById3 = view.findViewById(R.id.jis)) != null) {
            C14K9.LJIJJ(view, new C346530DiF(viewFindViewById3, 2));
            C20097313kJ.LIZJ(view);
        }
        C0UX3 c0ux3 = this.LLILLL;
        if (c0ux3 != null) {
            c0ux3.LIZ();
        }
        PR("show", null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0UX1] */
    public LiveTitleEditDialogFragment(String str, String str2, C0UX3 c0ux3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c0ux3;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewTd = C786410Ut5.Td(C1834150xpV.LIZJ(C786410Ut5.ne(getContext())), R.layout.h75, viewGroup, false);
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
