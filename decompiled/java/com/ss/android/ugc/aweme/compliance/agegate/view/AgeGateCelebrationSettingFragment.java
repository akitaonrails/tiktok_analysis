package com.ss.android.ugc.aweme.compliance.agegate.view;

import X.AbstractC1250290idn;
import X.C01GW;
import X.C098200Yq;
import X.C0HTI;
import X.C0OM1;
import X.C10WS;
import X.C10WW;
import X.C11G4;
import X.C123100dR;
import X.C1250250idj;
import X.C1250280idm;
import X.C1251150ifB;
import X.C127K;
import X.C127M;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1685300txQ;
import X.C189200o6;
import X.C19258510Vz;
import X.C19298010eg;
import X.C19298610em;
import X.C19299010eq;
import X.C19299910ez;
import X.C19301110fB;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC19298510el;
import X.EnumC19300210f2;
import X.EnumC19300410f4;
import X.EnumC19300510f5;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.zhiliaoapp.musically.R;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateCelebrationSettingFragment extends BaseFragment implements C10WS {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KSIpLi4nHELIOSLWs6ICokZgQrLAgyPCAPLCM2KjctPSY8JhYpPTs6JiIKOy40JSAiPQ==";
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;
    public final int LLJIJIL;
    public final boolean LLJILJIL;
    public C127K LLJILJILJ;
    public C127K LLJILLL;
    public TuxNavBar LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public SmartImageView LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final String LLJJJIL;

    public AgeGateCelebrationSettingFragment() {
        this("", true, -1, -1, false, 0);
    }

    @Override // X.C10WS
    public final void Kq(String str) {
    }

    @Override // X.C10WS
    public final MutableLiveData<Integer> MM() {
        return null;
    }

    @Override // X.C10WS
    public final LiveData<C19258510Vz> Un() {
        return null;
    }

    @Override // X.C10WS
    public final void er(String str) {
    }

    @Override // X.C10WS
    public final void qh() {
    }

    public final boolean SR() {
        if (!this.LLJI) {
            return false;
        }
        C19298610em c19298610em = EnumC19298510el.Companion;
        int i = this.LLJIJIL;
        c19298610em.getClass();
        return i <= EnumC19298510el.SHOW_UNCHECKED.getFlag() && EnumC19298510el.SHOW_CHECKED.getFlag() <= i;
    }

    public final TuxTextView aS() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dl9) : null;
            this.LLJJIII = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final SmartImageView bS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dl_) : null;
            this.LLJJIJI = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final TuxNavBar cS() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dla) : null;
            this.LLJJ = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final C127K dS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dlc) : null;
            this.LLJILLL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final Map<String, String> gS() {
        return (Map) this.LLJJIJIIJIL.getValue();
    }

    public final BirthdaySettingsViewModel hS() {
        return (BirthdaySettingsViewModel) this.LLJJIJIL.getValue();
    }

    @Override // X.C10WS
    public final MutableLiveData<Unit> bJ() {
        return hS().LLJ;
    }

    @Override // X.C10WS
    public final LiveData<Boolean> iz() {
        return hS().LLIZLLLIL;
    }

    @Override // X.C10WS
    public final LiveData<Date> mD() {
        return hS().LLIZ;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C19EG activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            int i = window.getAttributes().softInputMode;
            if ((i & 240) != 16) {
                window.setSoftInputMode((i & (-241)) ^ 16);
            }
        }
    }

    @Override // X.C10WS
    public final void Kz(boolean z) {
        hS().LLILZ.setValue(Boolean.valueOf(z));
    }

    public final void UR(PNSErrorModel pNSErrorModel) {
        if (this.LLIZ != -1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("user_type", "edit");
            C19298010eg.LJ("age_gate_error", linkedHashMap, C2097608Jq.LJ());
        }
        Integer num = pNSErrorModel.errorType;
        if (num != null) {
            int iIntValue = num.intValue();
            EnumC19300510f5.Companion.getClass();
            int i = C19299910ez.LIZIZ[C19301110fB.LIZ(iIntValue).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String string = pNSErrorModel.errorMessage;
                        if (string != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(this);
                            if (string.length() == 0) {
                                string = getString(2131837962);
                            }
                            c1389890mGx.LJIIJ(string);
                            c1389890mGx.LJIIJJI();
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                hS().LLJI.setValue(pNSErrorModel.errorMessage);
                return;
            }
            hS().LLJI.setValue(pNSErrorModel.errorMessage);
        }
    }

    public final void VR(String str) {
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(getContext(), str).open();
        }
    }

    public final AbstractC1250290idn ZR(PNSNavButton pNSNavButton) {
        EnumC19300210f2 enumC19300210f2;
        if (pNSNavButton != null && (enumC19300210f2 = pNSNavButton.type) != null) {
            switch (C19299910ez.LIZ[enumC19300210f2.ordinal()]) {
            }
            return new C1250280idm();
        }
        return new C1250280idm();
    }

    @Override // X.C10WS
    public final void jF(boolean z) {
        hS().LLILZIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.C10WS
    public final void lu(C19299010eq c19299010eq) {
        boolean z;
        PNSNavButton pNSNavButton;
        PNSNavButton pNSNavButton2;
        C19EG activity;
        Context contextP3;
        Resources resources;
        C11G4 c11g4;
        if (c19299010eq == null) {
            return;
        }
        String str = c19299010eq.title;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLLLZLL(aS(), 8);
        } else {
            String str2 = c19299010eq.title;
            TuxTextView tuxTextViewAS = aS();
            tuxTextViewAS.setText(str2);
            C786410Ut5.LLLLZLL(tuxTextViewAS, 0);
            C786410Ut5.LLLLZLL(aS(), 0);
        }
        List<PNSNavButton> list = c19299010eq.navButtons;
        String str3 = c19299010eq.header;
        if (list != null) {
            pNSNavButton = null;
            pNSNavButton2 = null;
            for (PNSNavButton pNSNavButton3 : list) {
                EnumC19300410f4 enumC19300410f4 = pNSNavButton3.position;
                if (enumC19300410f4 == EnumC19300410f4.LEFT) {
                    pNSNavButton = pNSNavButton3;
                } else if (enumC19300410f4 == EnumC19300410f4.RIGHT) {
                    pNSNavButton2 = pNSNavButton3;
                }
            }
        } else {
            pNSNavButton = null;
            pNSNavButton2 = null;
        }
        C786410Ut5.LLLLZLLLI(cS(), 0);
        TuxNavBar tuxNavBarCS = cS();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(ZR(pNSNavButton));
        C1250250idj c1250250idj = new C1250250idj();
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        c1250250idj.LIZJ = str3;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(ZR(pNSNavButton2));
        c0om1.LIZLLL = false;
        tuxNavBarCS.setNavActions(c0om1);
        String str5 = c19299010eq.imageUrl;
        if (str5 == null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.yl;
            bS().setImageDrawable(c0hti.LIZ(requireContext()));
            C786410Ut5.LLFF(0, bS());
        } else if (a0.LJJJIL(str5)) {
            C786410Ut5.LLFF(8, bS());
        } else if (!a0.LJJJIL(str5)) {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str5));
            c1331670kl3LJI.LJJ(bS());
            C786410Ut5.h3(c1331670kl3LJI);
            C786410Ut5.LLFF(0, bS());
        }
        hS().LLILZLL.setValue(c19299010eq.nextBtnText);
        String str6 = c19299010eq.inputPlaceHolder;
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.c23);
            } else {
                viewFindViewById = null;
            }
            this.LLJILJILJ = (C127K) viewFindViewById;
        }
        C127K c127k = (C127K) viewFindViewById;
        if (c127k != null) {
            C127M accessory = c127k.getAccessory();
            if ((accessory instanceof C11G4) && (c11g4 = (C11G4) accessory) != null) {
                if (str6 != null) {
                    str4 = str6;
                }
                c11g4.LJIILJJIL(str4);
            }
        }
        Date date = c19299010eq.defaultDate;
        if (date == null) {
            date = new Date();
        }
        hS().LL.setValue(date);
        Date date2 = c19299010eq.upperBound;
        if (date2 == null) {
            date2 = new Date();
        }
        hS().LLILLJJLI.setValue(date2);
        if (this.LLIZ != -1 && this.LLJI && (activity = getActivity()) != null && (contextP3 = C786410Ut5.P3(activity)) != null && (resources = contextP3.getResources()) != null) {
            resources.getQuantityString(2131755084, C10WW.LIZLLL(c19299010eq.defaultDate), Integer.valueOf(C10WW.LIZLLL(c19299010eq.defaultDate)));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS271S0000000_28.get$arr$(35));
        activityConfiguration(AFwS271S0000000_28.get$arr$(36));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0mTM, X.0mTY] */
    @Override // X.C10WS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Iq(com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel r23, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateCelebrationSettingFragment.Iq(com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel, kotlin.jvm.functions.Function1):void");
    }

    public final C1251150ifB WR(int i, Function0 function0) {
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = i;
        c1251150ifB.LJI = true;
        c1251150ifB.LIZJ(new AwS572S0100000_28(function0, (Function0<Unit>) 1069));
        return c1251150ifB;
    }

    public final void iS(Integer num, String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(hS().vQ2());
        if (C123100dR.LIZ(str)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        linkedHashMap.put("verification_required", str2);
        if (num != null) {
            linkedHashMap.put("verification_reason", String.valueOf(num.intValue()));
        }
        C19298010eg.LJ("age_edit_confirm_click", linkedHashMap, gS());
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0226  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateCelebrationSettingFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getContext().setTheme(R.style.my);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dx6, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public AgeGateCelebrationSettingFragment(String str, boolean z, int i, int i2, boolean z2, int i3) {
        this.LLIZ = i;
        this.LLIZLLLIL = str;
        this.LLJ = i2;
        this.LLJI = z;
        this.LLJIJIL = i3;
        this.LLJILJIL = z2;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(762));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1070));
        this.LLJJJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(104));
        this.LLJJJIL = "";
    }
}
