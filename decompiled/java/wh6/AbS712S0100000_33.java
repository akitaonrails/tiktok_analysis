package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0KSH;
import X.C12OY;
import X.C13BV;
import X.C19322110iZ;
import X.C19EG;
import X.C1AGW;
import X.C1AH3;
import X.C1AI0;
import X.C1AI1;
import X.C1AI2;
import X.C1AI6;
import X.C1AI9;
import X.C2176551AGf;
import X.C2176561AGg;
import X.C2176651AGp;
import X.C2176881AHm;
import X.C2183561Ad0;
import X.C500260Jjc;
import X.C724240Sb0;
import X.C748880TZe;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC1095410ebz;
import X.EnumC774050UXz;
import X.InterfaceC2183581Ad2;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.ExchangeCellStyle2;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListViewModel;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.RechargeCellStyle1;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.RechargeCellStyle2;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.FansClubJoinDialogV4;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.superfan.SuperFanPrivilegeContentAssem;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.superfan.SuperFansClubJoinDialog;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesMoreSettingsPage;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsDisplayFAQPage;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.adapter.widget.hotcomment.PreviewHotCommentWidget;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendV3LiveAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class AbS712S0100000_33 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

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
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS712S0100000_33(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS712S0100000_33 abS712S0100000_33, View view) {
        if (view != null) {
            AssemVMLazy assemVMLazy = ((ExchangeCellStyle2) abS712S0100000_33.l0).LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ExchangeCellStyle2.LLILLL;
            ((PackageListViewModel) assemVMLazy.getValue()).wQ2(((ExchangeCellStyle2) abS712S0100000_33.l0).getItem());
        }
    }

    public static final void LIZ$1(AbS712S0100000_33 abS712S0100000_33, View view) {
        if (view != null) {
            ((RechargeCellStyle1) abS712S0100000_33.l0).I5().wQ2(((RechargeCellStyle1) abS712S0100000_33.l0).getItem());
        }
    }

    public static final void LIZ$10(AbS712S0100000_33 abS712S0100000_33, View view) {
        FragmentManager fragmentManager;
        if (view != null) {
            String str = ViewerWishesSettingsDisplayFAQPage._pnsPageId;
            DataChannel dataChannel = ((ViewerWishesMoreSettingsPage) abS712S0100000_33.l0).LLJLLL;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                ViewerWishesSettingsDisplayFAQPage viewerWishesSettingsDisplayFAQPage = new ViewerWishesSettingsDisplayFAQPage();
                viewerWishesSettingsDisplayFAQPage.LLJLLL = 1;
                C19322110iZ.LJFF(fragmentManager, viewerWishesSettingsDisplayFAQPage, "viewer_wishes_display_points_and_timer_dialog", null, 0);
            }
            C1AI2 c1ai2 = new C1AI2(null, null, null, null, null, null, null, 0L, 0L, "display_round_duration", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -513, 2097151);
            C1AI1.LIZ(c1ai2, ((ViewerWishesMoreSettingsPage) abS712S0100000_33.l0).LLJLLL, true);
            C1AI0.LJIILJJIL(c1ai2);
        }
    }

    public static final void LIZ$11(AbS712S0100000_33 abS712S0100000_33, View view) {
        C2176881AHm c2176881AHm;
        EnumC774050UXz enumC774050UXz;
        if (view != null) {
            DataChannel dataChannel = ((ViewerWishesMoreSettingsPage) abS712S0100000_33.l0).LLJLLL;
            if (dataChannel != null && (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) != null && (enumC774050UXz = c2176881AHm.LIZ) != null && enumC774050UXz.isInViewerWishesCreator()) {
                C766270U4b.LIZLLL(2131856971);
                return;
            }
            ViewerWishesMoreSettingsPage viewerWishesMoreSettingsPage = (ViewerWishesMoreSettingsPage) abS712S0100000_33.l0;
            C1AI9 c1ai9 = viewerWishesMoreSettingsPage.LLJZ;
            if (c1ai9 != null) {
                c1ai9.LJI = viewerWishesMoreSettingsPage.LLL;
                c1ai9.LJIIIZ = viewerWishesMoreSettingsPage.LLLF;
                c1ai9.LJII = viewerWishesMoreSettingsPage.LLLFF;
                c1ai9.LJIIIIZZ = viewerWishesMoreSettingsPage.LLLFFI;
                C1AI9.LJIJJLI(c1ai9, false, false, true, 10);
            }
            String strLIZIZ = C1AI1.LIZIZ(((ViewerWishesMoreSettingsPage) abS712S0100000_33.l0).LLJZIJLIL);
            String strLIZLLL = C1AI1.LIZLLL(((ViewerWishesMoreSettingsPage) abS712S0100000_33.l0).LLJZIJLIL);
            ViewerWishesMoreSettingsPage viewerWishesMoreSettingsPage2 = (ViewerWishesMoreSettingsPage) abS712S0100000_33.l0;
            C1AI6 c1ai6 = viewerWishesMoreSettingsPage2.LLJZIJLIL;
            C1AI2 c1ai2 = new C1AI2(null, null, strLIZIZ, "save_settings", null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strLIZLLL, c1ai6.LJ, c1ai6.LJIIIIZZ, false, null, null, null, null, null, 0, null, 0L, -13, 2096927);
            C1AI1.LIZ(c1ai2, viewerWishesMoreSettingsPage2.LLJLLL, true);
            C1AI0.LJIJ(c1ai2);
            ((ViewerWishesMoreSettingsPage) abS712S0100000_33.l0).close(1);
        }
    }

    public static final void LIZ$12(AbS712S0100000_33 abS712S0100000_33, View view) {
        List<C2176651AGp> listLLLFZ;
        if (view != null) {
            C12OY.LJIILLIIL(C12OY.LIZ, ((C2176551AGf) abS712S0100000_33.l0).getDataChannel(), C1AH3.GROWTH.getReportName(), "click", null, 0, null, null, 120);
            C2176551AGf c2176551AGf = (C2176551AGf) abS712S0100000_33.l0;
            C1AGW c1agw = c2176551AGf.LLIZ;
            if (c1agw != null) {
                listLLLFZ = c1agw.LLLFZ();
            } else {
                listLLLFZ = C13BV.INSTANCE;
            }
            c2176551AGf.R5(listLLLFZ, C2176561AGg.LJFF);
            C786410Ut5.LJZL(8, ((C2176551AGf) abS712S0100000_33.l0).LLILLL);
            ((C2176551AGf) abS712S0100000_33.l0).LLILZLL = false;
        }
    }

    public static final void LIZ$13(AbS712S0100000_33 abS712S0100000_33, View view) {
        if (view != null) {
            C0KSH.LIZJ = true;
            FansClubJoinDialogV4 fansClubJoinDialogV4 = (FansClubJoinDialogV4) abS712S0100000_33.l0;
            C0KSH.LJIILJJIL(fansClubJoinDialogV4.LLL, fansClubJoinDialogV4.LLJZ);
            ((FansClubJoinDialogV4) abS712S0100000_33.l0).wS(true);
            FansClubJoinDialogV4 fansClubJoinDialogV42 = (FansClubJoinDialogV4) abS712S0100000_33.l0;
            JoinDialogProxyViewModel joinDialogProxyViewModel = fansClubJoinDialogV42.LLJZIJLIL;
            if (joinDialogProxyViewModel != null) {
                joinDialogProxyViewModel.vQ2(fansClubJoinDialogV42.LLLF, fansClubJoinDialogV42.uS());
            }
        }
    }

    public static final void LIZ$14(AbS712S0100000_33 abS712S0100000_33, View view) {
        RecyclerView recyclerView;
        if (view != null && ((SuperFanPrivilegeContentAssem) abS712S0100000_33.l0).LLJJJIL.size() > 4) {
            SuperFanPrivilegeContentAssem superFanPrivilegeContentAssem = (SuperFanPrivilegeContentAssem) abS712S0100000_33.l0;
            boolean z = !superFanPrivilegeContentAssem.LLJJJJ;
            superFanPrivilegeContentAssem.LLJJJJ = z;
            if (C500260Jjc.LJJIFFI(Boolean.valueOf(z)) && (recyclerView = ((SuperFanPrivilegeContentAssem) abS712S0100000_33.l0).LLJJI) != null) {
                recyclerView.scrollToPosition(0);
            }
            ((SuperFanPrivilegeContentAssem) abS712S0100000_33.l0).hp();
            SuperFanPrivilegeContentAssem superFanPrivilegeContentAssem2 = (SuperFanPrivilegeContentAssem) abS712S0100000_33.l0;
            superFanPrivilegeContentAssem2.ip(superFanPrivilegeContentAssem2.LLJJJIL);
        }
    }

    public static final void LIZ$15(AbS712S0100000_33 abS712S0100000_33, View view) {
        if (view != null) {
            C0KSH.LIZJ = true;
            SuperFansClubJoinDialog superFansClubJoinDialog = (SuperFansClubJoinDialog) abS712S0100000_33.l0;
            C0KSH.LJIILJJIL(superFansClubJoinDialog.LLJZIJLIL, superFansClubJoinDialog.LLJLLL);
            ((SuperFansClubJoinDialog) abS712S0100000_33.l0).wS(true);
            SuperFansClubJoinDialog superFansClubJoinDialog2 = (SuperFansClubJoinDialog) abS712S0100000_33.l0;
            JoinDialogProxyViewModel joinDialogProxyViewModel = superFansClubJoinDialog2.LLJZ;
            if (joinDialogProxyViewModel != null) {
                joinDialogProxyViewModel.vQ2(EnumC1095410ebz.ONLY_SUPER_FAN, superFansClubJoinDialog2.uS());
            }
        }
    }

    public static final void LIZ$16(AbS712S0100000_33 abS712S0100000_33, View view) {
        InterfaceC2183581Ad2 actionsListener = ((C2183561Ad0) abS712S0100000_33.l0).getActionsListener();
        if (actionsListener != null) {
            actionsListener.LIZ();
        }
    }

    public static final void LIZ$2(AbS712S0100000_33 abS712S0100000_33, View view) {
        if (view != null) {
            ((RechargeCellStyle2) abS712S0100000_33.l0).I5().wQ2(((RechargeCellStyle2) abS712S0100000_33.l0).getItem());
        }
    }

    public static final void LIZ$3(AbS712S0100000_33 abS712S0100000_33, View view) {
        if (view != null) {
            ((PreviewHotCommentWidget) abS712S0100000_33.l0).O1();
        }
    }

    public static final void LIZ$4(AbS712S0100000_33 abS712S0100000_33, View view) {
        if (view != null) {
            ((PreviewHotCommentWidget) abS712S0100000_33.l0).O1();
        }
    }

    public static final void LIZ$5(AbS712S0100000_33 abS712S0100000_33, View view) {
        if (view != null) {
            ((FriendV3LiveAssem) abS712S0100000_33.l0).Fp();
        }
    }

    public static final void LIZ$6(AbS712S0100000_33 abS712S0100000_33, View view) {
        if (view != null) {
            ((FriendV3LiveAssem) abS712S0100000_33.l0).Fp();
        }
    }

    public static final void LIZ$7(AbS712S0100000_33 abS712S0100000_33, View view) {
        C19EG c19egLIZ;
        if (view != null && (c19egLIZ = C724240Sb0.LIZ((ChatActionAssem) abS712S0100000_33.l0)) != null) {
            ChatActionAssem chatActionAssem = (ChatActionAssem) abS712S0100000_33.l0;
            chatActionAssem.hp().LIZIZ().invoke(chatActionAssem.kp(), c19egLIZ);
        }
    }

    public static final void LIZ$8(AbS712S0100000_33 abS712S0100000_33, View view) {
        if (view != null) {
            ((ViewerWishesMoreSettingsPage) abS712S0100000_33.l0).close(1);
        }
    }

    public static final void LIZ$9(AbS712S0100000_33 abS712S0100000_33, View view) {
        FragmentManager fragmentManager;
        if (view != null) {
            String str = ViewerWishesSettingsDisplayFAQPage._pnsPageId;
            DataChannel dataChannel = ((ViewerWishesMoreSettingsPage) abS712S0100000_33.l0).LLJLLL;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                ViewerWishesSettingsDisplayFAQPage viewerWishesSettingsDisplayFAQPage = new ViewerWishesSettingsDisplayFAQPage();
                viewerWishesSettingsDisplayFAQPage.LLJLLL = 0;
                C19322110iZ.LJFF(fragmentManager, viewerWishesSettingsDisplayFAQPage, "viewer_wishes_display_points_and_timer_dialog", null, 0);
            }
            C1AI2 c1ai2 = new C1AI2(null, null, null, null, null, null, null, 0L, 0L, "display_point", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -513, 2097151);
            C1AI1.LIZ(c1ai2, ((ViewerWishesMoreSettingsPage) abS712S0100000_33.l0).LLJLLL, true);
            C1AI0.LJIILJJIL(c1ai2);
        }
    }

    public AbS712S0100000_33(C2183561Ad0 c2183561Ad0, int i) {
        this.$t = i;
        this.l0 = c2183561Ad0;
    }
}
