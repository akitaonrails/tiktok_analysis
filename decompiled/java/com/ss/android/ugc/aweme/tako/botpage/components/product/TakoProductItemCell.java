package com.ss.android.ugc.aweme.tako.botpage.components.product;

import X.C01GW;
import X.C05PU;
import X.C0Q72;
import X.C1196320hEk;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C1554610qYd;
import X.C1847340yAm;
import X.C1857910yRp;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC665370Q7z;
import X.ViewOnLongClickListenerC1864690ycl;
import Y.ACListenerS161S0100000_27;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoProductItemCell extends PowerCell<C1857910yRp> implements ITakoHighLightAnimProtocol {
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(135));
    public TuxTextView LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public TuxTextView LLJ;
    public View LLJI;
    public C1857910yRp LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 797));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 798));

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final int Lm0() {
        return LSPassThroughRecordSizeConfig.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final boolean isClosed() {
        return true;
    }

    public final TakoCardAbility I5() {
        return (TakoCardAbility) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LLJI = this.itemView.findViewById(R.id.ryb);
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.rye);
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.ryc);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.ryo);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.ryg);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.ryf);
        this.LLILZLL = this.itemView.findViewById(R.id.ryi);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.ryh);
        this.LLIZLLLIL = this.itemView.findViewById(R.id.ryk);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.ryj);
        View view = this.itemView;
        C427690Gpr.LJ(view, 0.0f);
        C0Q72.LIZ(view, 8.0f);
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 82), view);
        view.setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 8));
        View view2 = this.LLJI;
        if (view2 != null) {
            view2.setPaddingRelative(view2.getPaddingStart(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), view2.getPaddingEnd(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = C1308910kAL.LIZ(R.attr.zq, view2.getContext());
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            c384050F3z.LJ = C1308910kAL.LIZ(R.attr.a01, view2.getContext());
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            view2.setBackground(c384050F3z.LIZ(view2.getContext()));
            C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(151)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(251)), view2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        if (interfaceC665370Q7zLIZ != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zLIZ, ITakoHighLightAnimProtocol.class, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final C05PU dz(int i) {
        return new C1847340yAm(this.itemView);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0361  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r49) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.product.TakoProductItemCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fle, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final boolean wv1(Message message, int i) {
        TakoMixFeed takoMixFeedLJIIIZ;
        C1857910yRp item;
        if (message != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == 11 && (item = getItem()) != null && i == item.LL) {
            return true;
        }
        return false;
    }
}
