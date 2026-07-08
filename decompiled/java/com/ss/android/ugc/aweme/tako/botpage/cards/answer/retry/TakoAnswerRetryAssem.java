package com.ss.android.ugc.aweme.tako.botpage.cards.answer.retry;

import X.C0HZQ;
import X.C1857070yQT;
import X.C1859620yUa;
import X.C427660Gpo;
import X.C786410Ut5;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerRetryAssem extends TakoBaseAssem<C1857070yQT> {
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public C1857070yQT LLLF;

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final /* bridge */ /* synthetic */ C0HZQ Bp() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fml;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final /* bridge */ /* synthetic */ C427660Gpo sp() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] */
    public final void up(C1857070yQT c1857070yQT) {
        this.LLLF = c1857070yQT;
        Context context = getContext();
        if (context != null) {
            TuxTextView tuxTextView = this.LLJZIJLIL;
            if (tuxTextView != null) {
                tuxTextView.setText(context.getString(c1857070yQT.LLILLJJLI));
            }
            TuxTextView tuxTextView2 = this.LLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(context.getString(c1857070yQT.LLILLL));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.kvz);
        if (C1859620yUa.LIZIZ()) {
            viewFindViewById.setPadding(0, 0, 0, 0);
        }
        this.LLJZIJLIL = (TuxTextView) view.findViewById(R.id.ql7);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.kw0);
        this.LLL = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS161S0100000_27(this, 67));
        }
    }
}
