package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0IJT;
import X.C0KSH;
import X.C0KT5;
import X.C1095140ebY;
import X.C16FS;
import X.C19322110iZ;
import X.C1AI0;
import X.C1AI1;
import X.C1AI2;
import X.C1AI6;
import X.C1AI9;
import X.C474500IjA;
import X.C475510Ikn;
import X.C518180KTw;
import X.C748880TZe;
import X.C766270U4b;
import X.InterfaceC517920KSw;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.superfan.SuperFansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesMoreSettingsPage;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsPage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class AbS163S0110000_33 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS163S0110000_33 abS163S0110000_33, View view) {
        FragmentManager fragmentManager;
        if (view != null) {
            if (abS163S0110000_33.z1) {
                C766270U4b.LIZLLL(2131856559);
                return;
            }
            String strLIZIZ = C1AI1.LIZIZ(((ViewerWishesSettingsPage) abS163S0110000_33.l0).LLLFF);
            String strLIZLLL = C1AI1.LIZLLL(((ViewerWishesSettingsPage) abS163S0110000_33.l0).LLLFF);
            ViewerWishesSettingsPage viewerWishesSettingsPage = (ViewerWishesSettingsPage) abS163S0110000_33.l0;
            C1AI6 c1ai6 = viewerWishesSettingsPage.LLLFF;
            C1AI2 c1ai2 = new C1AI2(null, null, strLIZIZ, "more_setting", null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strLIZLLL, c1ai6.LJ, c1ai6.LJIIIIZZ, false, null, null, null, null, null, 0, null, 0L, -13, 2096927);
            C1AI1.LIZ(c1ai2, viewerWishesSettingsPage.LLJLLL, true);
            C1AI0.LJIJ(c1ai2);
            String str = ViewerWishesMoreSettingsPage._pnsPageId;
            ViewerWishesSettingsPage viewerWishesSettingsPage2 = (ViewerWishesSettingsPage) abS163S0110000_33.l0;
            DataChannel dataChannel = viewerWishesSettingsPage2.LLJLLL;
            C1AI9 c1ai9 = viewerWishesSettingsPage2.LLLF;
            C1AI6 c1ai62 = viewerWishesSettingsPage2.LLLFF;
            if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
                return;
            }
            ViewerWishesMoreSettingsPage viewerWishesMoreSettingsPage = new ViewerWishesMoreSettingsPage();
            viewerWishesMoreSettingsPage.LLJLLL = dataChannel;
            viewerWishesMoreSettingsPage.LLJZ = c1ai9;
            viewerWishesMoreSettingsPage.LLJZIJLIL = c1ai62;
            C19322110iZ.LJFF(fragmentManager, viewerWishesMoreSettingsPage, "viewer_wishes_more_setting_dialog", null, 0);
        }
    }

    public static final void LIZ$1(AbS163S0110000_33 abS163S0110000_33, View view) {
        boolean z;
        String str;
        C1095140ebY c1095140ebY;
        if (view != null) {
            C16FS c16fs = ((SuperFansClubJoinDialog) abS163S0110000_33.l0).LLL;
            if (c16fs != null) {
                if (!c16fs.LLJJIJI) {
                    c16fs.LJ();
                } else {
                    return;
                }
            }
            SuperFansClubJoinDialog superFansClubJoinDialog = (SuperFansClubJoinDialog) abS163S0110000_33.l0;
            JoinDialogProxyViewModel joinDialogProxyViewModel = superFansClubJoinDialog.LLJZ;
            if (joinDialogProxyViewModel != null) {
                C0KT5 c0kt5US = superFansClubJoinDialog.uS();
                final SuperFansClubJoinDialog superFansClubJoinDialog2 = (SuperFansClubJoinDialog) abS163S0110000_33.l0;
                InterfaceC517920KSw interfaceC517920KSw = new InterfaceC517920KSw() { // from class: X.1AFb
                    @Override // X.InterfaceC517920KSw
                    public final void onFailure() {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS577S0100000_33(superFansClubJoinDialog2, 4077));
                    }

                    @Override // X.InterfaceC517920KSw
                    public final void onSuccess() {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS577S0100000_33(superFansClubJoinDialog2, 4078));
                    }
                };
                SuperFanViewModel superFanViewModel = joinDialogProxyViewModel.LLILLJJLI;
                if (superFanViewModel != null) {
                    superFanViewModel.zQ2(c0kt5US, interfaceC517920KSw);
                }
            }
            SuperFansClubJoinDialog superFansClubJoinDialog3 = (SuperFansClubJoinDialog) abS163S0110000_33.l0;
            JoinDialogProxyViewModel joinDialogProxyViewModel2 = superFansClubJoinDialog3.LLJZ;
            if (joinDialogProxyViewModel2 != null) {
                z = joinDialogProxyViewModel2.LLILZ;
            } else {
                z = false;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_superfan_purchase_page_click");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(superFansClubJoinDialog3));
            c474500IjALIZ.LJJII(superFansClubJoinDialog3.LLJLLL, "source_page");
            DataChannel dataChannelLJ = C475510Ikn.LJ(superFansClubJoinDialog3);
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
            SuperFansClubJoinDialog superFansClubJoinDialog4 = (SuperFansClubJoinDialog) abS163S0110000_33.l0;
            C0KSH.LJIILL(superFansClubJoinDialog4.LLJZIJLIL, superFansClubJoinDialog4.uS().LIZIZ, abS163S0110000_33.z1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS163S0110000_33(Object obj, boolean z, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
