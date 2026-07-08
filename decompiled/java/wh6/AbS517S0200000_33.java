package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C013C;
import X.C0IJT;
import X.C0KSH;
import X.C0KT5;
import X.C1095140ebY;
import X.C16FS;
import X.C474500IjA;
import X.C475510Ikn;
import X.C518180KTw;
import X.EnumC1095410ebz;
import X.InterfaceC517920KSw;
import android.view.View;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.FansClubJoinDialogV4;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes34.dex */
public class AbS517S0200000_33 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS517S0200000_33 abS517S0200000_33, View view) {
        if (view != null) {
            ((Function1) abS517S0200000_33.l0).invoke((View) abS517S0200000_33.l1);
        }
    }

    public static final void LIZ$1(AbS517S0200000_33 abS517S0200000_33, View view) {
        if (view != null) {
            ((Function1) abS517S0200000_33.l0).invoke((View) abS517S0200000_33.l1);
        }
    }

    public static final void LIZ$2(AbS517S0200000_33 abS517S0200000_33, View view) {
        if (view != null) {
            ((Function1) abS517S0200000_33.l0).invoke((View) abS517S0200000_33.l1);
        }
    }

    public static final void LIZ$3(AbS517S0200000_33 abS517S0200000_33, View view) {
        if (view != null) {
            ((Function1) abS517S0200000_33.l0).invoke((View) abS517S0200000_33.l1);
        }
    }

    public static final void LIZ$4(AbS517S0200000_33 abS517S0200000_33, View view) {
        boolean z;
        String str;
        C1095140ebY c1095140ebY;
        if (view != null) {
            C16FS c16fs = ((FansClubJoinDialogV4) abS517S0200000_33.l0).LLLI;
            if (c16fs != null) {
                if (!c16fs.LLJJIJI) {
                    c16fs.LJ();
                } else {
                    return;
                }
            }
            FansClubJoinDialogV4 fansClubJoinDialogV4 = (FansClubJoinDialogV4) abS517S0200000_33.l0;
            JoinDialogProxyViewModel joinDialogProxyViewModel = fansClubJoinDialogV4.LLJZIJLIL;
            if (joinDialogProxyViewModel != null) {
                C0KT5 c0kt5US = fansClubJoinDialogV4.uS();
                final FansClubJoinDialogV4 fansClubJoinDialogV42 = (FansClubJoinDialogV4) abS517S0200000_33.l0;
                InterfaceC517920KSw interfaceC517920KSw = new InterfaceC517920KSw() { // from class: X.1AFa
                    @Override // X.InterfaceC517920KSw
                    public final void onFailure() {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS577S0100000_33(fansClubJoinDialogV42, 4047));
                    }

                    @Override // X.InterfaceC517920KSw
                    public final void onSuccess() {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS577S0100000_33(fansClubJoinDialogV42, 4048));
                    }
                };
                SuperFanViewModel superFanViewModel = joinDialogProxyViewModel.LLILLJJLI;
                if (superFanViewModel != null) {
                    superFanViewModel.zQ2(c0kt5US, interfaceC517920KSw);
                }
            }
            FansClubJoinDialogV4 fansClubJoinDialogV43 = (FansClubJoinDialogV4) abS517S0200000_33.l0;
            JoinDialogProxyViewModel joinDialogProxyViewModel2 = fansClubJoinDialogV43.LLJZIJLIL;
            if (joinDialogProxyViewModel2 != null) {
                z = joinDialogProxyViewModel2.LLILZ;
            } else {
                z = false;
            }
            EnumC1095410ebz enumC1095410ebz = fansClubJoinDialogV43.LLLF;
            if (enumC1095410ebz == EnumC1095410ebz.ONLY_SUPER_FAN) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_superfan_purchase_page_click");
                c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(fansClubJoinDialogV43));
                c474500IjALIZ.LJJII(fansClubJoinDialogV43.LLJZ, "source_page");
                DataChannel dataChannelLJ = C475510Ikn.LJ(fansClubJoinDialogV43);
                if (dataChannelLJ != null && (c1095140ebY = (C1095140ebY) dataChannelLJ.gg0(FansClubChannel.class)) != null) {
                    c474500IjALIZ.LJJII(Long.valueOf(c1095140ebY.LIZ), "fans_club_level");
                    c474500IjALIZ.LJJII(C518180KTw.LJJII(c1095140ebY.LJ, c1095140ebY.LIZ, false), "fans_club_status");
                }
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(str, "if_discount");
                c474500IjALIZ.LIZ();
            } else if (enumC1095410ebz == EnumC1095410ebz.BOTH) {
                C518180KTw.LJJIIJ(C475510Ikn.LJ(fansClubJoinDialogV43), fansClubJoinDialogV43.LLJZ, "superfan", -1, z, false);
            }
            FansClubJoinDialogV4 fansClubJoinDialogV44 = (FansClubJoinDialogV4) abS517S0200000_33.l0;
            C0KSH.LJIILL(fansClubJoinDialogV44.LLL, fansClubJoinDialogV44.uS().LIZIZ, ((C013C) abS517S0200000_33.l1).element);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AbS517S0200000_33(android.view.View r4, kotlin.jvm.functions.Function1 r5, int r6) {
        /*
            r3 = this;
            r3.$t = r6
            switch(r6) {
                case 0: goto L10;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r0 = 500(0x1f4, double:2.47E-321)
        Lc:
            r2.<init>(r0)
            return
        L10:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r0 = 300(0x12c, double:1.48E-321)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS517S0200000_33.<init>(android.view.View, kotlin.jvm.functions.Function1, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS517S0200000_33(View view, AwS596S0100000_17 awS596S0100000_17, int i) {
        super(500L);
        this.$t = i;
        this.l0 = awS596S0100000_17;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS517S0200000_33(FansClubJoinDialogV4 fansClubJoinDialogV4, C013C c013c, int i) {
        super(300L);
        this.$t = i;
        this.l0 = fansClubJoinDialogV4;
        this.l1 = c013c;
    }
}
