package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.C09JN;
import X.C0J1R;
import X.C0JFL;
import X.C0JFN;
import X.C0JFO;
import X.C0UO0;
import X.C1085120eLO;
import X.C1099610eil;
import X.C16F5;
import X.C16FS;
import X.C19322110iZ;
import X.C21382118m3;
import X.C482260Ivg;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C748880TZe;
import X.C784440Upu;
import Y.AfS176S0100000_7;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import webcast.api.interaction.pictionary.PictionaryRankResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessRoundSummaryDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzElJiF9HELIOSLDctPigmLTY/Zzo6ZgE+KDgUPSA/Oh08PSsoGjo+JSQ+MAs6KSkjLg==";
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public ViewStub LLILLL;
    public View LLILZ;
    public RecyclerView LLILZIL;
    public ViewStub LLILZLL;
    public LiveIconView LLIZ;
    public LiveIconView LLIZLLLIL;
    public C16FS LLJ;
    public C16F5 LLJI;
    public C16F5 LLJIJIL;
    public C16F5 LLJILJIL;
    public C16F5 LLJILJILJ;
    public C1099610eil LLJILLL;
    public ConstraintLayout LLJJ;
    public boolean LLJJI;
    public PictionaryRankResponse.ResponseData LLJJIII;
    public DrawGuessWord LLJJIJI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final ViewStub MR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.chv) : null;
            this.LLILZLL = (ViewStub) viewFindViewById;
        }
        return (ViewStub) viewFindViewById;
    }

    public final ViewStub NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h3n) : null;
            this.LLILLL = (ViewStub) viewFindViewById;
        }
        return (ViewStub) viewFindViewById;
    }

    public final RecyclerView OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0q) : null;
            this.LLILZIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C16F5 PR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.word) : null;
            this.LL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5p);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 60;
        return c500980Jkm;
    }

    public final void RR() {
        FragmentManager fragmentManager;
        dismiss();
        DataChannel dataChannel = this.dataChannel;
        DrawGuessWord drawGuessWord = this.LLJJIJI;
        C0JFO.LJIIIIZZ(dataChannel, drawGuessWord != null ? drawGuessWord.word : null, "next_word");
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class)) == null) {
            return;
        }
        C19322110iZ.LJFF(fragmentManager, C0JFL.LIZ(true, true), "draw_and_guess", null, 0);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    public final void SR(DrawGuessWord drawGuessWord) {
        if (drawGuessWord == null) {
            return;
        }
        this.LLJJIJI = drawGuessWord;
        C16F5 c16f5PR = PR();
        if (c16f5PR != null) {
            c16f5PR.setText(drawGuessWord.word);
        }
        C21382118m3.LIZIZ(PR(), 10, 20, 1, 1);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long jLongValue;
        super.onCreate(bundle);
        DrawGuessApi drawGuessApi = (DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class);
        long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(this.dataChannel);
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c0jfn.getClass();
        Long lLJIJJ = C0JFN.LJIJJ(dataChannel);
        if (lLJIJJ != null) {
            jLongValue = lLJIJJ.longValue();
        } else {
            jLongValue = 0;
        }
        drawGuessApi.getRoundSummaryData(jLJJLIIIJ, jLongValue, 0L, 99L).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this)).LJJLL(new AfS176S0100000_7(this, 70), new C09JN() { // from class: X.0JFZ
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("DrawGuessRoundSummaryDialog@a975.onCreate$2");
                C1C7U.LIZIZ("DrawGuessRoundSummaryDialog@a975.onCreate$2");
            }
        });
        C784440Upu.LIZ().LIZJ(this, C1085120eLO.class).LIZJ(new AfS176S0100000_7(this, 71));
    }
}
