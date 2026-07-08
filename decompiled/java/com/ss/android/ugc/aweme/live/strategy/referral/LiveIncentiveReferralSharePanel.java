package com.ss.android.ugc.aweme.live.strategy.referral;

import X.AbstractC1377610lx9;
import X.C1161920gLG;
import X.C1369580lkC;
import X.C1370940lmO;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1380160m1G;
import X.C19R0;
import X.C20441214yg;
import X.C418440Gaw;
import X.C621180OYa;
import X.C786410Ut5;
import X.InterfaceC1362720lZ8;
import X.InterfaceC1366490lfD;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.ss.android.ugc.aweme.live.strategy.referral.LiveReferralShareModel;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveIncentiveReferralSharePanel extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9OzE+KDs2LzxiOyHELIOSo1LTc+KCN9BCw6LAY9KyAiPSYlLRcpLyohOiQgGicyOiAcKCE2JA==";
    public final C1380160m1G LLJLLL = new InterfaceC1366490lfD() { // from class: X.0m1G
        @Override // X.InterfaceC1366490lfD
        public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
        }

        @Override // X.InterfaceC1366490lfD
        public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
        }

        @Override // X.InterfaceC1366490lfD
        public final void LJFF(Context context, BaseSharePackage baseSharePackage, List list) {
        }

        @Override // X.InterfaceC1366490lfD
        public final void LJI(Context context, BaseSharePackage baseSharePackage) {
        }

        @Override // X.InterfaceC1366490lfD
        public final void LJ(Context context, BaseSharePackage baseSharePackage) {
            C20441214yg.LIZIZ("LiveIncentiveReferralSharePanel", "onCancelClicked");
        }

        @Override // X.InterfaceC1366490lfD
        public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
            C20441214yg.LIZIZ("LiveIncentiveReferralSharePanel", "onSharePanelShow");
        }

        @Override // X.InterfaceC1361850lXj
        public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
            String str;
            String strKey = interfaceC1369790lkX.key();
            if (Intrinsics.LJFF(strKey, "copy")) {
                str = "link";
            } else {
                str = "others";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_referral_share");
            c474500IjALIZ.LJJII(str, "share_source");
            c474500IjALIZ.LJJII("share_panel", "page_type");
            c474500IjALIZ.LJJII(strKey, "other_media_source");
            c474500IjALIZ.LIZ();
        }

        @Override // X.InterfaceC1361850lXj
        public final Object LJII(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
            Unit unit = Unit.LIZ;
            C099R.LJFF();
            return unit;
        }
    };

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return 0;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(6, null);
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 2;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.e2l);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 81), viewFindViewById);
        }
        C19R0 c19r0 = (C19R0) view.findViewById(R.id.uyv);
        c19r0.setTopStartRadius(C418440Gaw.LIZIZ(26));
        c19r0.setTopEndRadius(C418440Gaw.LIZIZ(26));
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("bottom_container_schema", "");
        } else {
            string = null;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view.findViewById(R.id.ch4);
        if (string != null && string.length() != 0) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJ(((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).wZ0(string, null));
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
        } else {
            View viewFindViewById2 = view.findViewById(R.id.j55);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
            ViewGroup.LayoutParams layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
            } else {
                layoutParams = null;
            }
            C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, layoutParams);
            C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 4);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string3 = arguments2.getString("top_container_schema", "")) != null && string3.length() > 0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view.findViewById(R.id.ydj);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJIJ(((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).wZ0(string3, null));
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJIIIIZZ();
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString("share_link", "")) != null && string2.length() > 0) {
            C1369580lkC c1369580lkC = (C1369580lkC) view.findViewById(R.id.uyu);
            ShareService shareService = C621180OYa.LIZ;
            final LiveReferralShareModel liveReferralShareModel = new LiveReferralShareModel(string2);
            C1370940lmO c1370940lmOLJIIIIZZ = new AbstractC1377610lx9(liveReferralShareModel) { // from class: X.0lQX
                public final LiveReferralShareModel LIZ;

                @Override // X.AbstractC1377630lxB
                public final String LIZ() {
                    return "";
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZIZ() {
                    return "";
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZJ() {
                    return "live";
                }

                @Override // X.AbstractC1377630lxB
                public final String LJI() {
                    return "";
                }

                @Override // X.AbstractC1377630lxB
                public final Bundle LJFF() {
                    return new Bundle();
                }

                @Override // X.AbstractC1377630lxB
                public final String LJII() {
                    return this.LIZ.shareLink;
                }

                @Override // X.AbstractC1377630lxB
                public final ShareModel LJ() {
                    return this.LIZ;
                }

                {
                    this.LIZ = liveReferralShareModel;
                }
            }.LJIIIIZZ();
            C1371600lnS c1371600lnS = new C1371600lnS();
            c1371600lnS.LJJIIJ = new LiveReferralSharePackage(c1370940lmOLJIIIIZZ);
            c1371600lnS.LJJIL = this.LLJLLL;
            c1371600lnS.LJJIIJZLJL = false;
            c1371600lnS.LIZ.add(new CopyLinkChannel(false));
            c1371600lnS.LJIIZILJ = false;
            c1371600lnS.LJII(getView());
            C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, getActivity(), true);
            shareService.LJJJ(new C1371590lnR(c1371600lnS), c1369580lkC, c1369580lkC.getContext(), new InterfaceC1362720lZ8() { // from class: X.0m1H
                @Override // X.InterfaceC1362720lZ8
                public final void Ds(Function0<Unit> function0) {
                }

                @Override // X.InterfaceC1362720lZ8
                public final void F8(AbstractC343940De4 abstractC343940De4) {
                }

                @Override // X.InterfaceC1362720lZ8
                public final void s1(int i) {
                }
            });
            C20441214yg.LIZIZ("LiveIncentiveReferralSharePanel", "setupChannels");
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.de7, viewGroup, false);
    }
}
