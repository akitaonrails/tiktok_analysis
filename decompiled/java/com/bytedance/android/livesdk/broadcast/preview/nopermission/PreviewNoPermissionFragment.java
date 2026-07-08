package com.bytedance.android.livesdk.broadcast.preview.nopermission;

import X.C098200Yq;
import X.C0HTI;
import X.C1322090kVb;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.room.EntranceConditionsPopup;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewNoPermissionFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlHELIOSLDh9Jio8LD0+ITY/ICA9ZhU+LDk6LTICJh82OiglOjw6JysKOy40JSAiPQ==";
    public EntranceConditionsPopup LL;
    public LinearLayout LLILLJJLI;
    public Function0<Unit> LLILLL;

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        final Context context;
        List<EntranceConditionsPopup.Condition> list;
        super.onViewCreated(view, bundle);
        Context context2 = getContext();
        if (context2 != null) {
            C1322090kVb c1322090kVb = (C1322090kVb) view.findViewById(R.id.pa5);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.qe;
            c1322090kVb.setImageDrawable(c0hti.LIZ(context2));
        }
        this.LLILLJJLI = (LinearLayout) view.findViewById(R.id.o99);
        if (this.LL != null && (context = getContext()) != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = C439101nJ.LIZ(16);
            EntranceConditionsPopup entranceConditionsPopup = this.LL;
            if (entranceConditionsPopup != null && (list = entranceConditionsPopup.conditions) != null) {
                for (final EntranceConditionsPopup.Condition condition : list) {
                    LinearLayout linearLayout = this.LLILLJJLI;
                    if (linearLayout != null) {
                        linearLayout.addView(new ConstraintLayout(context, condition) { // from class: X.01lo
                            {
                                Boolean boolValueOf;
                                int i;
                                Boolean boolValueOf2;
                                String str2;
                                Boolean boolValueOf3;
                                int iLIZIZ;
                                super(context, null, 0);
                                ViewGroup.inflate(context, R.layout.hht, this);
                                TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.dq9);
                                TextView textView = (TextView) findViewById(R.id.o_6);
                                View viewFindViewById = findViewById(R.id.uncheck_icon);
                                if (condition != null) {
                                    boolValueOf = Boolean.valueOf(condition.match);
                                } else {
                                    boolValueOf = null;
                                }
                                if (C176600m4.LIZIZ(boolValueOf)) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                C786410Ut5.LLLLLLZZ(tuxIconView, i);
                                if (condition != null) {
                                    boolValueOf2 = Boolean.valueOf(condition.match);
                                } else {
                                    boolValueOf2 = null;
                                }
                                if (C176600m4.LIZIZ(boolValueOf2)) {
                                    C419910GdJ c419910GdJ = new C419910GdJ();
                                    c419910GdJ.LIZ = R.raw.icon_tick_tiny_fill;
                                    c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.f04, context);
                                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                    tuxIconView.setTuxIcon(c419910GdJ);
                                }
                                if (textView != null) {
                                    if (condition != null) {
                                        str2 = condition.text;
                                    } else {
                                        str2 = null;
                                    }
                                    textView.setText(str2);
                                    if (condition != null) {
                                        boolValueOf3 = Boolean.valueOf(condition.match);
                                    } else {
                                        boolValueOf3 = null;
                                    }
                                    if (C176600m4.LIZIZ(boolValueOf3)) {
                                        iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezq, context);
                                    } else {
                                        iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezt, context);
                                    }
                                    textView.setTextColor(iLIZIZ);
                                }
                                C786410Ut5.LJLLLLLL(C176600m4.LIZIZ(condition != null ? Boolean.valueOf(condition.match) : null) ? 8 : 0, viewFindViewById);
                            }
                        }, layoutParams);
                    }
                }
            }
        }
        ((TextView) view.findViewById(R.id.enj)).setText(C497740JfY.LJIJI(2131842050));
        C500260Jjc.LJLIIIL(500L, view.findViewById(R.id.enj), new AwS586S0100000_7(this, 33));
        TextView textView = (TextView) view.findViewById(R.id.pa4);
        EntranceConditionsPopup entranceConditionsPopup2 = this.LL;
        if (entranceConditionsPopup2 != null) {
            str = entranceConditionsPopup2.title;
        } else {
            str = null;
        }
        textView.setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hhs, viewGroup, false);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
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
