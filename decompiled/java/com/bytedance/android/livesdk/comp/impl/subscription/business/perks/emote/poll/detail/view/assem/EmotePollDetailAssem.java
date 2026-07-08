package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem;

import X.C019F;
import X.C01GW;
import X.C09JN;
import X.C0J1N;
import X.C0JRE;
import X.C0JRL;
import X.C0JRO;
import X.C0JRP;
import X.C0JRQ;
import X.C0JRR;
import X.C0JRS;
import X.C0JRT;
import X.C0UO0;
import X.C1162104gd;
import X.C11NZ;
import X.C11RD;
import X.C11S5;
import X.C12967055p;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C16FZ;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C452501pT;
import X.C480460Ism;
import X.C491870JQr;
import X.C510380Jzw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC510330Jzr;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.model.repository.EmotePollApi;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollDetailAssem extends UISlotAssem implements EmotePollDetailAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public C0JRE LLJJIII;
    public FrameLayout LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmotePollDetailAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/poll/detail/vm/EmotePollDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EmotePollDetailAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmotePollDetailVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12967055p(c19719912DlLIZ), new C0JRT(), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C0JRS());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hnd;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C0JRE hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JRE.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0JRE) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm.EmotePollDetailAbility
    public final void pN1() {
        C0J1N c0j1n;
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        final EmotePollDetailVM emotePollDetailVM = (EmotePollDetailVM) assemVMLazy.getValue();
        final C0JRR c0jrr = new C0JRR(this);
        final C0JRP c0jrp = new C0JRP(this);
        C0JRE c0jreWQ2 = emotePollDetailVM.wQ2();
        Long l = c0jreWQ2 != null ? c0jreWQ2.LLILLJJLI : null;
        C0JRE c0jreWQ22 = emotePollDetailVM.wQ2();
        Long l2 = c0jreWQ22 != null ? c0jreWQ22.LLILLL : null;
        C0JRE c0jreWQ23 = emotePollDetailVM.wQ2();
        String str = c0jreWQ23 != null ? c0jreWQ23.LLILZ : null;
        if (l2 == null || l2.longValue() <= 0 || str == null || str.length() == 0) {
            c0jrp.invoke(new IllegalArgumentException("pollId is null"));
            return;
        }
        C480460Ism.LIZ().getClass();
        C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((EmotePollApi) C480460Ism.LIZLLL(EmotePollApi.class)).emotePollInfo(l != null ? l.longValue() : 0L, l2.longValue(), str).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "EmotePollDetailVM", "emote_poll/info", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
        if (c11nzLJIILJJIL == null || (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(emotePollDetailVM))) == null) {
            return;
        }
        c0j1n.LIZ(new C09JN() { // from class: X.0JRk
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:172:0x0262  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 864
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C492060JRk.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.07xx
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EmotePollDetailVM@7fdb.fetchEmotePollDetail$2");
                c0jrp.invoke(obj);
                C1C7U.LIZIZ("EmotePollDetailVM@7fdb.fetchEmotePollDetail$2");
            }
        });
    }

    public final void LJ() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = this.LLJJIJI;
        if (frameLayout != null && frameLayout.getChildCount() == 0) {
            C16FZ c16fz = new C16FZ(context, null);
            FrameLayout frameLayout2 = this.LLJJIJI;
            if (frameLayout2 != null) {
                frameLayout2.addView(c16fz);
            }
        }
        FrameLayout frameLayout3 = this.LLJJIJI;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(0, frameLayout3);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), EmotePollDetailAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0JRN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C316840CbS) obj).LLILLL;
            }
        }, null, new C0JRO(this), 6);
        C0JRE c0jreHp = hp();
        if (c0jreHp != null && Intrinsics.LJFF(c0jreHp.LL, Boolean.TRUE)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            C786410Ut5.W5(view, layoutParams);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, EmotePollDetailAbility.class, null, null);
        }
        this.LLJJIJI = (FrameLayout) view.findViewById(R.id.nlo);
        ((C491870JQr) this.LLJJIJIIJIL.getValue()).LIZIZ(view, new C0JRQ(this));
        LJ();
        C723850SaN.LIZLLL(this, new C0JRL(this));
        C723850SaN.LIZLLL(this, new C1162104gd(this, view));
    }
}
