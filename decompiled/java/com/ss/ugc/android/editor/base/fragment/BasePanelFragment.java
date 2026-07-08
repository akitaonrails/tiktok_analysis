package com.ss.ugc.android.editor.base.fragment;

import X.C01GW;
import X.C0E46;
import X.C365830EVx;
import X.C473601ss;
import X.C786410Ut5;
import X.InterfaceC360730ECh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BasePanelFragment extends BaseFragment {
    public View LLILLJJLI;
    public final InterfaceC360730ECh LLILLL;

    @Override // com.ss.ugc.android.editor.base.fragment.BaseFragment
    public final void MR() {
    }

    public abstract int OR();

    public BasePanelFragment() {
        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
        this.LLILLL = C0E46.LIZ().LIZ().LIZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.ss.ugc.android.editor.base.fragment.BaseFragment
    public final void NR(View view, LayoutInflater layoutInflater) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.pp8);
        if (OR() > 0) {
            if (getContext() == null) {
                return;
            }
            C786410Ut5.Td(layoutInflater, OR(), viewGroup, true);
            view.findViewById(R.id.tv_panel_name);
            this.LLILLJJLI = view.findViewById(R.id.tph);
            C473601ss.LIZ(600L, view.findViewById(R.id.lqi), new AwS584S0100000_5(this, 798));
            return;
        }
        throw new IllegalStateException("contentViewLayoutId is invalid.");
    }
}
