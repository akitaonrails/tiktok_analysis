package com.ss.android.ugc.aweme.music.search.title;

import X.C019F;
import X.C0I7D;
import X.C0P4X;
import X.C0WZX;
import X.C127G;
import X.C12ES;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C631230OpN;
import X.C633670OtJ;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC633700OtM;
import Y.ACListenerS113S0200000_9;
import Y.ACListenerS144S0100000_9;
import Y.AObjectS62S0000000_9;
import Y.ARunnableS78S0200000_9;
import Y.AUListenerS255S0100000_5;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchMusicTitleAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final long LLIZLLLIL = 300;
    public final AssemVMLazy LLJ;
    public C127G LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMusicTitleAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/search/SearchMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchMusicTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchMusicListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1188), AFwS240S0000000_9.get$arr$(510), null, true);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SearchMusicListViewModel.class, new AObjectS62S0000000_9(this, 30)}, defaultViewModelProviderFactory);
                    this.LLJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void Go(View view) {
        if (String.valueOf(C2204961BRm.LLLLJI((C0I7D) view.findViewById(R.id.hdh), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkiG5yF2dQ0asENiaFAVX+oPxJaxx0Qc/P4XbZN5ZRum8bXw=", null))).length() > 0) {
            KeyboardUtils.LIZIZ(view.findViewById(R.id.hdh));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.l_a), new ACListenerS144S0100000_9(this, 75));
        C786410Ut5.h9((TuxTextView) view.findViewById(R.id.zo0), new ACListenerS113S0200000_9(this, view, 14));
        ((C633670OtJ) view.findViewById(R.id.wrq)).setDispatchTouchEventListener(new InterfaceC633700OtM() { // from class: X.0OtL
            @Override // X.InterfaceC633700OtM
            public final void LIZ() {
                this.LIZ.Go(view);
            }
        });
        ((TextView) view.findViewById(R.id.hdh)).addTextChangedListener(new C0P4X(this, 3));
        ((TextView) view.findViewById(R.id.hdh)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0OtK
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 3) {
                    this.LL.Go(view);
                    return true;
                }
                return true;
            }
        });
        C0I7D c0i7d = (C0I7D) view.findViewById(R.id.hdh);
        HandlerHook.viewPost(c0i7d, new ARunnableS78S0200000_9(c0i7d, view, 32));
        int iMeasureText = (int) ((TextView) view.findViewById(R.id.zo0)).getPaint().measureText(((AppCompatTextView) view.findViewById(R.id.zo0)).getText().toString());
        C631230OpN.LIZIZ(view.findViewById(R.id.nhc), Float.valueOf(C418440Gaw.LIZIZ(8)));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(view, 34));
        valueAnimatorOfFloat.setDuration(this.LLIZLLLIL);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) C12ES.LIZJ(16.0f, view.getContext()), ((int) C12ES.LIZJ(32.0f, view.getContext())) + iMeasureText);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(view, 120));
        valueAnimatorOfInt.setDuration(this.LLIZLLLIL);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat((-C12ES.LIZJ(16.0f, view.getContext())) + (iMeasureText / 2.0f), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS256S0100000_6(view, 121));
        valueAnimatorOfFloat2.setDuration(this.LLIZLLLIL);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfInt).with(valueAnimatorOfFloat).with(valueAnimatorOfFloat2);
        animatorSet.start();
    }
}
