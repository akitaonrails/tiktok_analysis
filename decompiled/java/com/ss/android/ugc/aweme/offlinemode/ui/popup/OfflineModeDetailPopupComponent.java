package com.ss.android.ugc.aweme.offlinemode.ui.popup;

import X.AbstractC738140SxQ;
import X.C0OCC;
import X.C0ON5;
import X.C1220000hqw;
import X.C13LE;
import X.C1954807lC;
import X.C19EG;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C612560O0w;
import X.C624790Oez;
import X.C625130OfX;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC344510Dez;
import X.EnumC624780Oey;
import X.EnumC624830Of3;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeDetailPopupComponent extends OfflineModePopupComponent {
    public final C736950SvV LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C612560O0w LLJILLL;

    @Override // com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModePopupComponent, X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        OfflineModePopupComponent.LLIZLLLIL.getClass();
        OfflineModePopupComponent.LLJI.LIZ("onParentViewCreated", null);
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0OCB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C616100OEm) obj).LLILLJJLI);
            }
        }, null, new AwS623S0100000_9(this, 129), 6);
        ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LLILLJJLI.getValue();
        if (iLoadMoreAbility != null) {
            iLoadMoreAbility.p41(this.LLJILLL);
        }
    }

    public final OfflineModeListVM oo() {
        return (OfflineModeListVM) this.LLJIJIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0O0w] */
    public OfflineModeDetailPopupComponent() {
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(291);
        this.LLJIJIL = new C736950SvV(C13LE.LIZ(OfflineModeListVM.class), aFwS195S0000000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(582), new AwS553S0100000_9((AbstractC738140SxQ) this, 1387), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILJILJ = true;
        this.LLJILLL = new C0OCC() { // from class: X.0O0w
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
            
                if ((((r0 == null || (r0 = (X.C0O10) r0.getState()) == null) ? null : r0.getListState().LLILLJJLI) instanceof X.C1623706Xj) == false) goto L47;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x0180  */
            @Override // X.C0OCC, X.InterfaceC1603270rp7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onHide() {
                /*
                    Method dump skipped, instruction units count: 390
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C612560O0w.onHide():void");
            }

            @Override // X.C0OCC, X.InterfaceC1603270rp7
            public final void onShow() {
                this.LL.LLJILJIL = true;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModePopupComponent
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void mo300do(EnumC624830Of3 enumC624830Of3) {
        int i;
        if (enumC624830Of3 != null && (i = C624790Oez.LIZIZ[enumC624830Of3.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        mo();
                        return;
                    }
                    throw new C1954807lC();
                }
                ho();
                return;
            }
            ko();
        }
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModePopupComponent
    public final void fo(EnumC624780Oey enumC624780Oey) {
        if (enumC624780Oey != null) {
            switch (C624790Oez.LIZ[enumC624780Oey.ordinal()]) {
                case -1:
                case 8:
                    return;
                case 0:
                default:
                    throw new C1954807lC();
                case 1:
                    C0ON5.LIZ(C0ON5.LIZ, C724240Sb0.LIZ(this), C724240Sb0.LJI(this), 2131838546, EnumC344510Dez.ENTER_FYP, null, null, null, new AwS553S0100000_9((OfflineModePopupComponent) this, 1771), 112);
                    C625130OfX.LJ(C625130OfX.LIZ, "show_offline_mode_toast", "offline_mode_page", null, null, null, null, null, null, null, null, null, null, null, null, null, EnumC624780Oey.RETURN_FYP.getMobName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32772, 131071);
                    return;
                case 2:
                    C0ON5 c0on5 = C0ON5.LIZ;
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    c0on5.getClass();
                    C0ON5.LIZJ(c19egLIZ, 2131838553, null);
                    C625130OfX c625130OfX = C625130OfX.LIZ;
                    EnumC624780Oey enumC624780Oey2 = EnumC624780Oey.WATCH_ALL_OFFLINE_VIDEOS_TOAST;
                    C625130OfX.LJ(c625130OfX, "show_offline_mode_toast", "offline_mode_page", null, null, null, null, null, null, null, null, null, null, null, null, null, enumC624780Oey2.getMobName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32772, 131071);
                    C625130OfX.LJ(c625130OfX, "offline_video_useout", "offline_mode_page", null, null, null, null, null, null, null, null, null, null, null, null, null, enumC624780Oey2.getMobName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32772, 131071);
                    return;
                case 3:
                    C0ON5 c0on52 = C0ON5.LIZ;
                    C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                    c0on52.getClass();
                    C0ON5.LIZJ(c19egLIZ2, 2131838555, null);
                    return;
                case 4:
                    C0ON5 c0on53 = C0ON5.LIZ;
                    C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                    c0on53.getClass();
                    C0ON5.LIZJ(c19egLIZ3, 2131838602, null);
                    return;
                case 5:
                    ko();
                    return;
                case 6:
                    ho();
                    return;
                case 7:
                    mo();
                    return;
                case BdTuring.TYPE_ECAF /* 9 */:
                    lo();
                    return;
            }
        }
    }
}
