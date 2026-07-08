package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.infoheader;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C055W;
import X.C0H7O;
import X.C1119920fFW;
import X.C13LE;
import X.C1637806bA;
import X.C16F5;
import X.C176600m4;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C384050F3z;
import X.C419910GdJ;
import X.C496670Jdp;
import X.C497740JfY;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SMBIndustryVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsViewerIndustryBadgeSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.infoheader.PcsServiceInfoHeaderAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.dialog.PcsVerifiedIntroDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.item.PcsVerifiedIntroItem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.newui.PcsVerifiedIntroV2Dialog;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class PcsServiceInfoHeaderAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public C16F5 LLJJI;
    public C16F5 LLJJIII;
    public ConstraintLayout LLJJIJI;
    public LiveIconView LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceInfoHeaderAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/common/assem/infoheader/PcsServiceInfoHeaderVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServiceInfoHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceInfoHeaderVM.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055W(c19719912DlLIZ), new C0H7O(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hg6;
    }

    public final ConstraintLayout ip() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.verified_badge) : null;
            this.LLJJIJI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C16F5 kp() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.verified_title) : null;
            this.LLJJIII = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final PcsServiceInfoHeaderVM lp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (PcsServiceInfoHeaderVM) assemVMLazy.getValue();
    }

    public final void hp(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ez3);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContentView().getContext());
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.verified_icon);
            } else {
                viewFindViewById = null;
            }
            this.LLJJIJIIJIL = (LiveIconView) viewFindViewById;
        }
        LiveIconView liveIconView = (LiveIconView) viewFindViewById;
        if (liveIconView != null) {
            liveIconView.setIcon(tuxIconDrawableLIZ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C384050F3z c384050F3z = new C384050F3z();
        float f = 26;
        c384050F3z.LJIIIZ = Float.valueOf(C497740JfY.LIZIZ(f));
        c384050F3z.LJIIIIZZ = Float.valueOf(C497740JfY.LIZIZ(f));
        float f2 = 0;
        c384050F3z.LJIIJJI = Float.valueOf(C497740JfY.LIZIZ(f2));
        c384050F3z.LJIIJ = Float.valueOf(C497740JfY.LIZIZ(f2));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.erk);
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        ConstraintLayout constraintLayoutIp = ip();
        if (constraintLayoutIp != null) {
            HandlerHook.viewPost(constraintLayoutIp, new Runnable() { // from class: X.0Geu
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    View view2;
                    C1C7U.LIZ("PcsServiceInfoHeaderAssem@c34b.initView$3");
                    try {
                        ConstraintLayout constraintLayoutIp2 = this.LL.ip();
                        Object parent = constraintLayoutIp2 != null ? constraintLayoutIp2.getParent() : null;
                        int width = (!(parent instanceof View) || (view2 = (View) parent) == null) ? 0 : view2.getWidth();
                        ConstraintLayout constraintLayoutIp3 = this.LL.ip();
                        if (constraintLayoutIp3 != null) {
                            constraintLayoutIp3.setMaxWidth((int) ((width * 0.55f) + C497740JfY.LIZIZ(18)));
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PcsServiceInfoHeaderAssem@c34b.initView$3");
                }
            });
        }
        View viewFindViewById = this.LLJJI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.uu8);
            } else {
                viewFindViewById = null;
            }
            this.LLJJI = (C16F5) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (textView != null) {
            textView.setTypeface(C1119920fFW.LIZJ(12.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, C176600m4.LIZ()));
        }
        View view2 = this.LLJJI;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.uu8);
            }
            this.LLJJI = (C16F5) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        TextView textView2 = (TextView) view2;
        if (textView2 != null) {
            textView2.setTextSize(12.0f);
        }
        C1119920fFW.LJFF(kp(), 9, 500);
        C16F5 c16f5Kp = kp();
        if (c16f5Kp != null) {
            c16f5Kp.setTextColor(C20736316Cj.LIZIZ(R.attr.ez3, getContentView().getContext()));
        }
        ConstraintLayout constraintLayoutIp2 = ip();
        if (constraintLayoutIp2 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jdr
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view3) {
                    String str;
                    String str2;
                    if (view3 != null && this.LLILZ.lp().getState().LL.LJIIJ) {
                        PcsServiceInfoHeaderAssem pcsServiceInfoHeaderAssem = this.LLILZ;
                        C496700Jds c496700Jds = pcsServiceInfoHeaderAssem.lp().getState().LL;
                        SMBVerificationInfo sMBVerificationInfoLIZIZ = c496700Jds.LIZIZ();
                        if (sMBVerificationInfoLIZIZ != null) {
                            SMBIndustryVerificationInfo sMBIndustryVerificationInfo = sMBVerificationInfoLIZIZ.industryVerificationInfo;
                            if (sMBIndustryVerificationInfo != null && sMBIndustryVerificationInfo.status == 3) {
                                str = sMBIndustryVerificationInfo.approvedIndustryBadgeName;
                            } else {
                                str = null;
                            }
                            String string = "";
                            if (str == null) {
                                str = "";
                            }
                            FragmentManager fragmentManagerLIZJ = C507500JvI.LIZJ((Context) C507500JvI.LIZIZ().get());
                            if (LivePcsViewerIndustryBadgeSetting.INSTANCE.getValue()) {
                                String str3 = PcsVerifiedIntroV2Dialog._pnsPageId;
                                C496660Jdo.LIZ(fragmentManagerLIZJ, c496700Jds.LJIIIIZZ, (String) c496700Jds.LJIIJJI.getValue(), sMBVerificationInfoLIZIZ, str, c496700Jds.LIZLLL, c496700Jds.LIZIZ, c496700Jds.LJIIIZ);
                            } else {
                                PcsVerifiedIntroItem[] pcsVerifiedIntroItemArrLIZJ = C1822100xW4.LIZJ(sMBVerificationInfoLIZIZ, pcsServiceInfoHeaderAssem.LJJIJL().getContext());
                                Context context = pcsServiceInfoHeaderAssem.LJJIJL().getContext();
                                if (C496680Jdq.LIZ(sMBVerificationInfoLIZIZ)) {
                                    String string2 = context.getString(2131850967);
                                    SMBKYBInfo sMBKYBInfo = sMBVerificationInfoLIZIZ.kybInfo;
                                    if (sMBKYBInfo != null && (str2 = sMBKYBInfo.identification) != null) {
                                        string = str2;
                                    }
                                    if (string.length() > 0) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(string2);
                                        sbLIZ.append(" (");
                                        sbLIZ.append(string);
                                        sbLIZ.append(')');
                                        string = C2188811AlT.LIZIZ(sbLIZ);
                                    } else {
                                        string = string2;
                                    }
                                } else if (C496680Jdq.LIZIZ(sMBVerificationInfoLIZIZ)) {
                                    string = context.getString(2131850968);
                                }
                                Bundle bundle = new Bundle();
                                C786410Ut5.LJJJI("avatar", c496700Jds.LJIIIIZZ, bundle);
                                C786410Ut5.LJJJI("nickname", (String) c496700Jds.LJIIJJI.getValue(), bundle);
                                C786410Ut5.LJJIJLIJ(bundle, "verified_info_list", pcsVerifiedIntroItemArrLIZJ);
                                C786410Ut5.LJJJI("industry_badge_name", str, bundle);
                                C786410Ut5.LJJJI("verified_info_line", string, bundle);
                                C786410Ut5.LJJJI("anchor_id", c496700Jds.LIZLLL, bundle);
                                C786410Ut5.LJJJI("show_entrance", c496700Jds.LIZIZ, bundle);
                                bundle.putBoolean("has_kyb_verified", C496680Jdq.LIZ(sMBVerificationInfoLIZIZ));
                                bundle.putBoolean("has_kyc_verified", C496680Jdq.LIZIZ(sMBVerificationInfoLIZIZ));
                                C786410Ut5.LJJJI("previous_page", c496700Jds.LJIIIZ, bundle);
                                C19322110iZ.LIZLLL(fragmentManagerLIZJ, PcsVerifiedIntroDialog.class, "live_smb_verified_intro_sheet", null, bundle);
                            }
                            C1822730xX5.LIZ("click", "verify_label", pcsServiceInfoHeaderAssem.lp().getState().LL, pcsServiceInfoHeaderAssem.lp().getState().LL.LIZ());
                        }
                    }
                }
            }, constraintLayoutIp2);
        }
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0HI4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C496720Jdu) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new C496670Jdp(this), 4);
    }
}
