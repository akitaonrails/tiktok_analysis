package com.ss.android.ugc.aweme.upvote.detail.replypanel.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0I06;
import X.C1220000hqw;
import X.C1355330lND;
import X.C13LE;
import X.C2217381BqS;
import X.C449650HkB;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C457770HxH;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC449720HkI;
import X.InterfaceC453710Hqj;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class ReplyEmojiAssem extends UIContentAssem implements C0I06 {
    public final C736950SvV LLIZLLLIL;
    public C1355330lND LLJ;
    public final C01GW LLJI;

    @Override // X.C0I06
    public final void Dg(int i) {
    }

    @Override // X.C0I06
    public final Integer Ga() {
        return null;
    }

    @Override // X.C0I06
    public final void c8(long j) {
    }

    @Override // X.C0I06
    public final int fJ() {
        return 0;
    }

    @Override // X.C0I06
    public final long hN() {
        return 0L;
    }

    @Override // X.C0I06
    public final void la(int i) {
    }

    @Override // X.C0I06
    public final void z4(int i) {
    }

    public ReplyEmojiAssem() {
        AFwS209S0000000_21 aFwS209S0000000_21 = AFwS209S0000000_21.get$arr$(364);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), aFwS209S0000000_21, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(252), new AwS565S0100000_21((AbstractC738140SxQ) this, 939), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 938));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJ = (C1355330lND) view.findViewById(R.id.grz);
        C449650HkB c449650HkB = new C449650HkB(Collections.singletonList(EnumC449720HkI.SYSTEM_EMOJI), R.attr.a1b, R.attr.a1b, null, null, "repost_reply_sticker", false, false, "", "", null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -872, 255);
        C457770HxH c457770HxH = InterfaceC453710Hqj.LIZ;
        ViewGroup viewGroup = (ViewGroup) LJJIJL();
        LifecycleOwnerKt.getLifecycleScope(this);
        AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(this, c449650HkB, 65);
        c457770HxH.getClass();
        C457770HxH.LIZ(viewGroup, awS422S0200000_21);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0lW1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 99), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0lW4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LLILLJJLI;
            }
        }, null, new AwS635S0100000_21(this, 100), 6);
    }
}
