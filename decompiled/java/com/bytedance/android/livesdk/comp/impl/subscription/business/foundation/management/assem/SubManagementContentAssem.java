package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.assem;

import X.C019F;
import X.C055O;
import X.C06LA;
import X.C09JN;
import X.C0JKW;
import X.C0JU4;
import X.C1142704dV;
import X.C1161920gLG;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C176600m4;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C490150JKb;
import X.C490170JKd;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC500940Jki;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.subscription.lifecycleawarecomponents.SubscriptionSuspensionLifecycleObserver;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.vm.SubManagementPageVM;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public final class SubManagementContentAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public C0JKW LLJJIII;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubManagementContentAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/foundation/management/vm/SubManagementPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubManagementContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubManagementPageVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055O(c19719912DlLIZ), new C06LA(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hnm;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C0JKW hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JKW.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0JKW) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubManagementPageVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (SubManagementPageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        ip();
        getOwnLifecycleOwner();
        DataChannelGlobal.LLILZ.zQ2(this);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJIJI;
        ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        this.LLJJIJI = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() throws JSONException {
        super.onResume();
        ip().xQ2();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Boolean bool;
        String strSubManagementHomePopup;
        String str;
        Map map;
        Bundle arguments;
        Boolean boolValueOf;
        Bundle arguments2;
        int i;
        Bundle arguments3;
        String string;
        Bundle arguments4;
        super.onViewCreated(view);
        C1554960qZC.LIZ(C1558520qew.LJIIL(this), new C0JKW(), C0JKW.class, "source_default_key");
        C0JKW c0jkwHp = hp();
        String strLIZIZ = "";
        if (c0jkwHp != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI == null || (arguments4 = fragmentLJI.getArguments()) == null || (string = arguments4.getString("enter_from", "")) == null) {
                string = "";
            }
            c0jkwHp.LLILLJJLI = string;
        }
        C0JKW c0jkwHp2 = hp();
        if (c0jkwHp2 != null) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && (arguments3 = fragmentLJI2.getArguments()) != null) {
                i = arguments3.getInt("from_onboarding_completed", 0);
            } else {
                i = 0;
            }
            c0jkwHp2.LL = i;
        }
        C0JKW c0jkwHp3 = hp();
        if (c0jkwHp3 != null) {
            Fragment fragmentLJI3 = C724240Sb0.LJI(this);
            if (fragmentLJI3 != null && (arguments2 = fragmentLJI3.getArguments()) != null) {
                boolValueOf = Boolean.valueOf(arguments2.getBoolean("popup", false));
            } else {
                boolValueOf = Boolean.FALSE;
            }
            c0jkwHp3.LLILLL = boolValueOf;
        }
        ip().LL = C1558520qew.LJIIL(this);
        SubManagementPageVM subManagementPageVMIp = ip();
        getOwnLifecycleOwner();
        DataChannelGlobal.LLILZ.CQ2(PreviewSubOnlyLiveSwitchChannel.class, this, new C490170JKd(subManagementPageVMIp));
        C784440Upu.LIZ().LIZJ(this, C0JU4.class).LIZJ(new C09JN() { // from class: X.0JKa
            @Override // X.C09JN
            public final void accept(Object obj) {
                InterfaceC490160JKc interfaceC490160JKc;
                C1C7U.LIZ("SubManagementContentAssem@8877.registerRxBus$1");
                C128Y c128yLJI = C724240Sb0.LJI(this.LL);
                if ((c128yLJI instanceof InterfaceC490160JKc) && (interfaceC490160JKc = (InterfaceC490160JKc) c128yLJI) != null) {
                    interfaceC490160JKc.closePanel();
                }
                C1C7U.LIZIZ("SubManagementContentAssem@8877.registerRxBus$1");
            }
        });
        getLifecycle().addObserver(new SubscriptionSuspensionLifecycleObserver(new C490150JKb(this)));
        getLifecycle().addObserver(new SubManagementLifecycleObserver(ip()));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.yuw);
        Serializable serializable = null;
        if ((viewGroup instanceof FrameLayout) && viewGroup != null) {
            C0JKW c0jkwHp4 = hp();
            if (c0jkwHp4 != null) {
                bool = c0jkwHp4.LLILLL;
            } else {
                bool = null;
            }
            if (C176600m4.LIZIZ(bool)) {
                strSubManagementHomePopup = LiveSubscriptionAnchorUrlSetting.subManagementHome();
            } else {
                strSubManagementHomePopup = LiveSubscriptionAnchorUrlSetting.subManagementHomePopup();
            }
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            String strLJIJ = interfaceC500940JkiUser.LJIJ(interfaceC500940JkiUser.getCurrentUserId());
            C0JKW c0jkwHp5 = hp();
            if (c0jkwHp5 != null) {
                str = c0jkwHp5.LLILLJJLI;
            } else {
                str = null;
            }
            Context context = viewGroup.getContext();
            if (context != null) {
                String strKp = kp(kp(kp(strSubManagementHomePopup, "user_id", String.valueOf(currentUserId)), "sec_user_id", strLJIJ), "show_entrance", String.valueOf(str));
                Fragment fragmentLJI4 = C724240Sb0.LJI(this);
                if (fragmentLJI4 != null && (arguments = fragmentLJI4.getArguments()) != null) {
                    serializable = arguments.getSerializable("query_params");
                }
                if ((serializable instanceof Map) && (map = (Map) serializable) != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append('&');
                        sbLIZ.append(str2);
                        sbLIZ.append('=');
                        sbLIZ.append(str3);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strKp);
                sbLIZ2.append(strLIZIZ);
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(context, C2188811AlT.LIZIZ(sbLIZ2), this, true, null);
                C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, new FrameLayout.LayoutParams(-1, -1));
                viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1);
                this.LLJJIJI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
            }
        }
        C723850SaN.LIZLLL(this, new C1142704dV(this));
    }

    public static final String kp(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('&');
        sbLIZ.append(str2);
        sbLIZ.append('=');
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
