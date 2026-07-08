package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.assem;

import X.C019F;
import X.C01GW;
import X.C06JQ;
import X.C09JN;
import X.C0J1N;
import X.C0JQJ;
import X.C0JQW;
import X.C0JQX;
import X.C0JQY;
import X.C0JQZ;
import X.C0UO0;
import X.C1140604dA;
import X.C1141004dE;
import X.C1162704gj;
import X.C11NZ;
import X.C11RD;
import X.C11S5;
import X.C12968055q;
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
import X.C786410Ut5;
import X.EnumC510330Jzr;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.model.repository.EmotePollApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm.EmotePollStartAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm.EmotePollStartVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.UserEmotePollOptionsResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollStartAssem extends UISlotAssem implements EmotePollStartAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public C0JQJ LLJJIII;
    public FrameLayout LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EmotePollStartAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/poll/start/vm/EmotePollStartVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EmotePollStartAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmotePollStartVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12968055q(c19719912DlLIZ), new C06JQ(), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C0JQZ());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hng;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm.EmotePollStartAbility
    public final UserEmotePollOptionsResponse.Data iW1() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JQJ.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0JQJ) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        C0JQJ c0jqj = this.LLJJIII;
        if (c0jqj != null) {
            return c0jqj.LLILLL;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm.EmotePollStartAbility
    public final void rp1() {
        Room room;
        User owner;
        String secUid;
        C0J1N c0j1n;
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        final EmotePollStartVM emotePollStartVM = (EmotePollStartVM) assemVMLazy.getValue();
        final C0JQY c0jqy = new C0JQY(this);
        final C0JQW c0jqw = new C0JQW(this);
        C0JQJ c0jqjVQ2 = emotePollStartVM.vQ2();
        if (c0jqjVQ2 == null || (room = c0jqjVQ2.LLILLJJLI) == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null || secUid.length() == 0) {
            c0jqw.invoke(new IllegalArgumentException("secAnchorId is null"));
            return;
        }
        C480460Ism.LIZ().getClass();
        C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((EmotePollApi) C480460Ism.LIZLLL(EmotePollApi.class)).emotePollOptions(secUid, 0L, 20L).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "EmotePollStartVM", "user_emote/poll_options", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
        if (c11nzLJIILJJIL == null || (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(emotePollStartVM))) == null) {
            return;
        }
        c0j1n.LIZ(new C09JN() { // from class: X.0JQL
            /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 279
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0JQL.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.07y7
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EmotePollStartVM@5506.fetchEmoteData$2");
                c0jqw.invoke(obj);
                C1C7U.LIZIZ("EmotePollStartVM@5506.fetchEmoteData$2");
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
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), EmotePollStartAbility.class, null);
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
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, EmotePollStartAbility.class, null, null);
        }
        this.LLJJIJI = (FrameLayout) view.findViewById(R.id.nlo);
        ((C491870JQr) this.LLJJIJIIJIL.getValue()).LIZIZ(view, new C0JQX(this));
        LJ();
        C723850SaN.LIZLLL(this, new C1140604dA(this));
        C723850SaN.LIZLLL(this, new C1141004dE(this));
        C723850SaN.LIZLLL(this, new C1162704gj(this, view));
    }
}
