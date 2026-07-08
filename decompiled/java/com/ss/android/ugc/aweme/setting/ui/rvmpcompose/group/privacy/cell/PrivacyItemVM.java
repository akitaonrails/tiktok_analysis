package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell;

import X.C106C;
import X.C10EY;
import X.C191862104e;
import X.C191871104n;
import X.C19205810Bs;
import X.C20684815ws;
import X.C2097608Jq;
import X.C323301Nf;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS463S0200000_28;
import kotlin.jvm.internal.AwS78S1000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class PrivacyItemVM extends BaseCellSettingsVM<C10EY> {
    public final String LL;
    public C19205810Bs LLILLJJLI;
    public boolean LLILLL;

    public void vQ2() {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        String str = this.LL;
        C106C c106cLJIIL = ComplianceServiceProvider.LJIJJ().LJIIL(str);
        if (c106cLJIIL == null) {
            return C10EY.LLJI;
        }
        AwS394S0200000_28 awS394S0200000_28 = new AwS394S0200000_28(this, c106cLJIIL, 41);
        return new C10EY(c106cLJIIL.LIZJ, c106cLJIIL.LIZIZ, c106cLJIIL.LIZLLL, str, c106cLJIIL.LIZ, awS394S0200000_28, new AwS463S0200000_28(this, c106cLJIIL, 13));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C19205810Bs c19205810Bs = this.LLILLJJLI;
        if (c19205810Bs != null) {
            C191871104n.LJ().getClass();
            C191862104e.LIZLLL(c19205810Bs);
        }
        this.LLILLJJLI = null;
        super.onCleared();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void xQ2() {
        String strLJII;
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        if (iPrivacySettingAPIService == null || (strLJII = iPrivacySettingAPIService.LJII(this.LL)) == null) {
            strLJII = "";
        }
        if (Intrinsics.LJFF(strLJII, ((C10EY) getState()).LLILLJJLI)) {
            return;
        }
        setState(new AwS78S1000000_28(strLJII, 10));
    }

    public PrivacyItemVM(String str) {
        this.LL = str;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("fix_timing_of_refresh_privacy_settings_right_label", true) && this.LLILLJJLI == null) {
            C19205810Bs c19205810Bs = new C19205810Bs(this);
            this.LLILLJJLI = c19205810Bs;
            C191871104n.LJ().getClass();
            C191862104e.LIZJ(c19205810Bs);
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C323301Nf.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("fix_timing_of_refresh_privacy_settings_right_label", true)) {
                    C19205810Bs c19205810Bs = this.LLILLJJLI;
                    if (c19205810Bs != null) {
                        C191871104n.LJ().getClass();
                        C191862104e.LIZLLL(c19205810Bs);
                    }
                    this.LLILLJJLI = null;
                    return;
                }
                return;
            }
            return;
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("fix_timing_of_refresh_privacy_settings_right_label", true) && this.LLILLJJLI == null) {
            C19205810Bs c19205810Bs2 = new C19205810Bs(this);
            this.LLILLJJLI = c19205810Bs2;
            C191871104n.LJ().getClass();
            C191862104e.LIZJ(c19205810Bs2);
        }
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        C20684815ws.LJIILLIIL("pns_tpsc_item_show", C2097608Jq.LJIIIIZZ(new Pair("page_tag", "settings"), new Pair("item_name", this.LL), new Pair("item_type", "Disclosure"), new Pair("is_enabled", "true")));
    }

    public final void wQ2(Context context, String str, Function2 function2) {
        C20684815ws.LJIILLIIL("pns_tpsc_item_click", C2097608Jq.LJIIIIZZ(new Pair("page_tag", "settings"), new Pair("item_name", this.LL), new Pair("item_type", "Disclosure"), new Pair("is_enabled", "true")));
        if (function2 != null) {
            function2.invoke(context, str);
        }
        vQ2();
    }
}
