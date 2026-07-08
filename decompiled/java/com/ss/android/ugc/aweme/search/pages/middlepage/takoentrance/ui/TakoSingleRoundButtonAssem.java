package com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui;

import X.C1847607Lm;
import X.C301340BrY;
import X.C418440Gaw;
import X.C467860IWi;
import X.C657990PrR;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS145S0100000_10;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoSingleRoundButtonAssem extends BaseTakoFloatingButtonAssem {
    public TuxIconView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
    public final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final int LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final float LLJLL = C418440Gaw.LIZIZ(1);

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void bp() {
        View view;
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            view2.setClipToOutline(true);
        }
        if (!C301340BrY.LIZ() || (view = this.LLJIJIL) == null) {
            return;
        }
        view.setElevation(this.LLJLL);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void ap() {
        NextLiveData<Integer> nextLiveDataXQ2;
        super.ap();
        SearchStartViewModel searchStartViewModel = this.LLJI;
        if (searchStartViewModel != null && (nextLiveDataXQ2 = searchStartViewModel.xQ2()) != null) {
            nextLiveDataXQ2.observe(this, new AObserverS214S0100000_10(this, 38), true);
        }
        Vo().vQ2(this.LLJJL, ((Number) this.LLJJIJI.getValue()).intValue(), 0, 0);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void ip() {
        if (C467860IWi.LIZ(getContext())) {
            View view = this.LLJIJIL;
            if (view != null) {
                view.setBackgroundResource(R.drawable.d3g);
                return;
            }
            return;
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.d3h);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final int Ho() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final int Jo() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final int Lo() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final View Zo(ViewStub viewStub) {
        C657990PrR.LIZJ(viewStub, AFwS241S0000000_10.get$arr$(198));
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.eyl);
            return C786410Ut5.LJLLLL(viewStub);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void cp(View view) {
        String string;
        super.cp(view);
        this.LLJLIL = (TuxIconView) view.findViewById(R.id.x7o);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.xcp);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.x7p);
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS145S0100000_10(this, 19));
        }
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(Go());
        }
        Integer numLIZ = C1847607Lm.LIZ();
        if (numLIZ != null) {
            int iIntValue = numLIZ.intValue();
            TuxTextView tuxTextView = this.LLJLILLLLZIIL;
            if (tuxTextView != null) {
                Context context = getContext();
                if (context != null) {
                    string = context.getString(iIntValue);
                } else {
                    string = null;
                }
                tuxTextView.setText(string);
            }
        }
        if (C467860IWi.LIZ(getContext())) {
            TuxIconView tuxIconView2 = this.LLJLIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            }
            TuxIconView tuxIconView3 = this.LLJLIL;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                return;
            }
            return;
        }
        TuxIconView tuxIconView4 = this.LLJLIL;
        if (tuxIconView4 != null) {
            tuxIconView4.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        }
        TuxIconView tuxIconView5 = this.LLJLIL;
        if (tuxIconView5 == null) {
            return;
        }
        tuxIconView5.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
    }
}
