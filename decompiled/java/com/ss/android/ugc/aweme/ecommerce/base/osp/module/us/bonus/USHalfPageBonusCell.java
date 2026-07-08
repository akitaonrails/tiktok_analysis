package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.bonus;

import X.AnonymousClass0319;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03C8;
import X.C03DZ;
import X.C03IJ;
import X.C03J8;
import X.C03K6;
import X.C03XA;
import X.C04JO;
import X.C0H1U;
import X.C0H9H;
import X.C0P0T;
import X.C10515049h;
import X.C1391600mJi;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.InterfaceC1391650mJn;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USHalfPageBonusCell extends ECPowerCell<AnonymousClass0319> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;
    public C0P0T LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USHalfPageBonusCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USHalfPageBonusCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1384);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(69);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1395), awS577S0100000_33, AFwS224S0000000_33.get$arr$(196), new AwS577S0100000_33((C03K6) this, 1370), new AwS577S0100000_33((C03K6) this, 1372), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1374), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1376), null, new AwS577S0100000_33((C03K6) this, 1377));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1371);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1373);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1375);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 51));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1378);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1379);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1380);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1381);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1382);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1383), awS577S0100000_33, AFwS224S0000000_33.get$arr$(194), new AwS577S0100000_33((C03K6) this, 1385), new AwS577S0100000_33((C03K6) this, 1386), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1387), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1388), null, new AwS577S0100000_33((C03K6) this, 1389));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1390), awS577S0100000_33, AFwS224S0000000_33.get$arr$(195), new AwS577S0100000_33((C03K6) this, 1391), new AwS577S0100000_33((C03K6) this, 1392), new AwS577S0100000_33((C03K6) this, 1393), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1394));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean zLJFF;
        boolean z;
        Integer num;
        AnonymousClass0319 anonymousClass0319 = (AnonymousClass0319) interfaceC1891350zJl;
        if (anonymousClass0319.LLILZLL.bonusInfo == null) {
            C786410Ut5.LJLLLLLL(8, this.itemView);
            return;
        }
        super.onBindItemView(anonymousClass0319);
        C786410Ut5.LJLLLLLL(0, this.itemView);
        C03J8.LIZ(this.itemView, true);
        C0H1U.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), this.itemView);
        C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), this.itemView);
        C0H9H.LJI(0, this.itemView.findViewById(R.id.ty6));
        C03DZ.LIZ(this.itemView.findViewById(R.id.ok3));
        BonusModule bonusModule = anonymousClass0319.LLILZLL;
        BonusInfo bonusInfo = bonusModule.bonusInfo;
        if (bonusInfo != null) {
            zLJFF = Intrinsics.LJFF(bonusInfo.redeemCanBeUsed, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        BonusInfo bonusInfo2 = bonusModule.bonusInfo;
        if (bonusInfo2 != null && (num = bonusInfo2.bonusUiVersion) != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!zLJFF && z) {
            C786410Ut5.LLLLZI((C21411818qq) this.itemView.findViewById(R.id.ty5), 8);
        } else {
            C786410Ut5.LLLLZI((C21411818qq) this.itemView.findViewById(R.id.ty5), 0);
        }
        BonusModule bonusModule2 = anonymousClass0319.LLILZLL;
        final BonusInfo bonusInfo3 = bonusModule2.bonusInfo;
        if (bonusInfo3 != null) {
            C0H1U.LJIIL((TextView) this.itemView.findViewById(R.id.ty6), bonusModule2.title, true);
            C786410Ut5.I7(new AjS40S0200000_1(this, bonusInfo3, 31), this.itemView.findViewById(R.id.ty2));
            C03C8.LJ((TextView) this.itemView.findViewById(R.id.ty1), bonusInfo3.bonusTitle, "jp_s_points_bonus_title", null);
            final C21411818qq c21411818qq = (C21411818qq) this.itemView.findViewById(R.id.ty5);
            c21411818qq.setChecked(Intrinsics.LJFF(bonusInfo3.useBonusRedeem, Boolean.TRUE));
            L5().q = c21411818qq.isChecked();
            if (bonusInfo3.popupTip != null && c21411818qq.getVisibility() == 0) {
                C450720Hlu c450720Hlu = new C450720Hlu(c21411818qq.getContext());
                String str = bonusInfo3.popupTip.content;
                if (str == null) {
                    str = "";
                }
                c450720Hlu.LLILZ = str;
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = c21411818qq;
                c1391600mJi.LJIIL = true;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c1391600mJi.LJIIIZ = false;
                c450720Hlu.LJIIIZ(true, null);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
                c1391600mJi2.LJIIIIZZ = iLIZIZ;
                c1391600mJi2.LJIJJ = true;
                c1391600mJi2.LJIJJLI = false;
                c1391600mJi2.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
                this.LLJI = c0p0tLIZIZ;
                c0p0tLIZIZ.LJIJ(new InterfaceC1391650mJn() { // from class: X.03lH
                    @Override // X.InterfaceC1391650mJn
                    public final void onShow() {
                        OrderSubmitAssemViewModel orderSubmitAssemViewModelL5 = this.LIZ.L5();
                        String str2 = bonusInfo3.popupTip.freqControlKey;
                        if (str2 == null) {
                            str2 = "";
                        }
                        C948503nH.LJI(orderSubmitAssemViewModelL5, C23271099x.INSTANCE, new C857303Wp(EnumC857403Wq.RENDER_USBONUS_POPUP_TIP, str2, null));
                        C1748720vbi.LIZLLL(c21411818qq, new C10484048c(), new AwS367S0200000_1(this.LIZ, bonusInfo3, 163));
                    }
                });
                L5().a0 = this.LLJI;
                L5().setState(AFwS228S0000000_1.get$arr$(423));
            }
            C786410Ut5.C7(c21411818qq, new C04JO(this, bonusInfo3, c21411818qq, 0));
            C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS224S0000000_33.get$arr$(552), new AwS367S0200000_1(this, bonusInfo3, 165));
        }
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.19z9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 32), 6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        View viewLIZJ = C03XA.LIZJ(context, R.layout.b0u, viewGroup, false);
        viewLIZJ.setTag("s_points_item_view");
        return viewLIZJ;
    }
}
