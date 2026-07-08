package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem;

import X.C019F;
import X.C0JRE;
import X.C0JRF;
import X.C0JRG;
import X.C0JRH;
import X.C0JRI;
import X.C0JRJ;
import X.C1324720kZq;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C492040JRi;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollInfoAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public C0JRE LLJJIII;
    public TextView LLJJIJI;
    public TextView LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public C1324720kZq LLJJJ;
    public C16FS LLJJJIL;
    public View LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmotePollInfoAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/poll/detail/vm/EmotePollDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EmotePollInfoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmotePollDetailVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C0JRH(c19719912DlLIZ), new C0JRJ(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hnf;
    }

    public final C0JRE hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JRE.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0JRE) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final EmotePollDetailVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (EmotePollDetailVM) assemVMLazy.getValue();
    }

    public final void kp() {
        C492040JRi c492040JRi;
        TextView textView;
        C0JRE c0jreHp = hp();
        if (c0jreHp == null || (c492040JRi = c0jreHp.LLJILLL) == null) {
            return;
        }
        if (c492040JRi.LIZIZ) {
            C500260Jjc.LLFFF(this.LLJJJJ);
        } else {
            C500260Jjc.LJIILIIL(this.LLJJJJ);
        }
        if (c492040JRi.LJFF) {
            C500260Jjc.LLFFF(this.LLJJJIL);
        } else {
            C500260Jjc.LJIILIIL(this.LLJJJIL);
        }
        String str = c492040JRi.LIZJ;
        if (str == null || (textView = this.LLJJIJIIJIL) == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C500260Jjc.LJIILIIL(LJJIJL());
        this.LLJJIJI = (TextView) view.findViewById(R.id.zz2);
        this.LLJJIJIIJIL = (TextView) view.findViewById(R.id.tv_timer);
        this.LLJJIJIL = (TextView) view.findViewById(R.id.tv_vote_count);
        this.LLJJJ = (C1324720kZq) view.findViewById(R.id.bh2);
        this.LLJJJIL = (C16FS) view.findViewById(R.id.cq2);
        this.LLJJJJ = view.findViewById(R.id.user_panel);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Cj4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C316840CbS) obj).LLILLJJLI;
            }
        }, null, new C0JRF(this), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JRM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C316840CbS) obj).LLILLL;
            }
        }, null, new C0JRI(this), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0CiB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C316840CbS) obj).LLILZ;
            }
        }, null, new C0JRG(this), 6);
        kp();
    }
}
