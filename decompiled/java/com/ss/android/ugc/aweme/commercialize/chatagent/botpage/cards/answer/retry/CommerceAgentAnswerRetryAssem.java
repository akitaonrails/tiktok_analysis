package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.retry;

import X.C322670Ckr;
import X.C786410Ut5;
import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentAnswerRetryAssem extends CommerceAgentBaseAssem<C322670Ckr> {
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public C322670Ckr LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ajz;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (TuxTextView) view.findViewById(R.id.ql7);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.kw0);
        this.LLJLIL = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS139S0100000_4(this, 12));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public final void up(C322670Ckr c322670Ckr) {
        this.LLJLILLLLZIIL = c322670Ckr;
        Context context = getContext();
        if (context != null) {
            TuxTextView tuxTextView = this.LLJL;
            if (tuxTextView != null) {
                tuxTextView.setText(context.getString(c322670Ckr.LLILLJJLI));
            }
            TuxTextView tuxTextView2 = this.LLJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(context.getString(c322670Ckr.LLILLL));
            }
        }
    }
}
