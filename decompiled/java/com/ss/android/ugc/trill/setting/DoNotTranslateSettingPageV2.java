package com.ss.android.ugc.trill.setting;

import X.AbstractC20085213iM;
import X.C01GW;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C1669670tYD;
import X.C1839820xye;
import X.C19719212De;
import X.C19EG;
import X.C20088213iq;
import X.C20684815ws;
import X.C20698915z9;
import X.C20700215zM;
import X.C20700315zN;
import X.C20700915zT;
import X.C2344009Gk;
import X.C294270Bg9;
import X.C343970De7;
import X.C452501pT;
import X.EnumC1427810nG7;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC836760Ws6
public final class DoNotTranslateSettingPageV2 extends BasePage {
    public static final C20698915z9 LLJJIII = new C20698915z9();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZjYpPTs6HELIOSJiJiDSAdJzEYOy49OyktPSoALTE4ICE0GCQrLBlh";
    public ComposeView LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1296));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1297));
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final List<ContentLanguage> LLJJ;
    public final List<String> LLJJI;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f6k;
    }

    public final Boolean aS() {
        return (Boolean) this.LLJILLL.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LLJIJIL.getValue();
    }

    public DoNotTranslateSettingPageV2() {
        List<String> listLJJLL;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1295));
        this.LLJILJIL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1299));
        this.LLJILJILJ = c01gwLIZIZ2;
        this.LLJILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1298));
        List<ContentLanguage> doNotTranslateList = C1839820xye.LIZ().LJIIIIZZ().getDoNotTranslateList();
        if (doNotTranslateList == null && (doNotTranslateList = (List) c01gwLIZIZ.getValue()) == null) {
            doNotTranslateList = C13BV.INSTANCE;
        }
        this.LLJJ = doNotTranslateList;
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        String[] strArrLIZJ = C20700315zN.LIZJ();
        if ((strArrLIZJ == null || (listLJJLL = C13LQ.LJJLL(strArrLIZJ)) == null) && (listLJJLL = (List) c01gwLIZIZ2.getValue()) == null) {
            listLJJLL = C13BV.INSTANCE;
        }
        this.LLJJI = listLJJLL;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById = this.LLJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.eoa);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (ComposeView) viewFindViewById;
        }
        ((AbstractC20085213iM) viewFindViewById).setViewCompositionStrategy(C20088213iq.LIZIZ);
        View view3 = this.LLJ;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.eoa);
            }
            this.LLJ = (ComposeView) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C1669670tYD.LJ((ComposeView) view3, EnumC1427810nG7.Auto, new C19719212De(1660136328, new AwS460S0200000_25(this, view, 26), true));
    }

    public final void ZR(List<String> list, C20700915zT c20700915zT, List<String> list2) {
        String[] strArrFindRemovedLanguages;
        String uid;
        String strLJJJ;
        C19EG activity;
        User currentUser;
        if (Intrinsics.LJFF(C13LP.LLIIJI(list2), C13LP.LLIIJI(list))) {
            if (Intrinsics.LJFF(aS(), Boolean.TRUE)) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(this, C343970De7.LIZ);
                return;
            } else {
                SR();
                return;
            }
        }
        C20700215zM c20700215zMLJIIIIZZ = C1839820xye.LIZ().LJIIIIZZ();
        Integer numValueOf = null;
        if (C294270Bg9.LIZ()) {
            c20700215zMLJIIIIZZ.getClass();
            String[] strArrLIZ = C20700315zN.LIZ();
            if (strArrLIZ != null) {
                strArrFindRemovedLanguages = c20700215zMLJIIIIZZ.findRemovedLanguages(strArrLIZ, (String[]) list.toArray(new String[0]));
            } else {
                strArrFindRemovedLanguages = null;
            }
            c20700215zMLJIIIIZZ.clearDefaultDNTLangsAndSetHasUserManuallyModifiedDNTs();
        } else {
            strArrFindRemovedLanguages = null;
        }
        c20700215zMLJIIIIZZ.setSelectedDoNotTranslateLanguageCodes((String[]) list.toArray(new String[0]));
        c20700915zT.LIZ((String[]) list.toArray(new String[0]));
        C2344009Gk c2344009Gk = new C2344009Gk();
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("user_id", uid);
        c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLJI.getValue());
        c2344009Gk.LJIIIIZZ("enter_method", getEnterMethod());
        c2344009Gk.LJIIIIZZ("not_translate_langs", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("prev_not_translate_langs", C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62));
        if (strArrFindRemovedLanguages != null) {
            strLJJJ = C13LQ.LJJJ(strArrFindRemovedLanguages, ",", null, null, null, 62);
        } else {
            strLJJJ = null;
        }
        c2344009Gk.LJIIIIZZ("unselect_default_langs", strLJJJ);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("aweme_type")) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                numValueOf = Integer.valueOf(arguments2.getInt("aweme_type"));
            }
            c2344009Gk.LJ(numValueOf, "aweme_type");
        }
        C20684815ws.LJIILLIIL("save_not_translate_langs", c2344009Gk.LIZ);
        if (Intrinsics.LJFF(aS(), Boolean.TRUE) && Intrinsics.LJFF(getEnterMethod(), "FEED_DNT_TOAST") && (activity = getActivity()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(getString(2131832338));
            c1389890mGx.LJIIJJI();
        }
    }
}
