package com.ss.android.ugc.profile.platform.standard.protocol.component;

import X.C0BMT;
import X.C1308910kAL;
import X.C1558420qem;
import X.C1558520qew;
import X.C2097608Jq;
import X.C2532609wC;
import X.C2537109wv;
import X.C268330AfP;
import X.C426770GoN;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;
import com.ss.android.ugc.profile.platform.business.header.advanced.IHeaderAdvancedFeatureAbility;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AdvancedFeatureProtocol extends ProfilePlatformProtocol<AdvancedFeatureBaseData> {
    public ProfileHeaderAdvancedFeatureViewModel LLJJJIL;
    public AdvancedFeatureBaseData LLJJJJ;
    public boolean LLJJJJJIL;
    public AwS563S0100000_19 LLJJJJLIIL;
    public AwS563S0100000_19 LLJJL;
    public AwS598S0100000_19 LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public void LJJJLZIJ(n nVar) {
    }

    public void LJJLIIIJLJLI() {
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJ() {
        if (C268330AfP.LJ()) {
            return null;
        }
        if (C2532609wC.LIZ()) {
            Context context = getContext();
            if (context != null) {
                return C1308910kAL.LIZJ(R.attr.a00, context);
            }
            return null;
        }
        if (C2537109wv.LIZIZ()) {
            Context context2 = getContext();
            if (context2 != null) {
                return C1308910kAL.LIZJ(R.attr.a1h, context2);
            }
            return null;
        }
        Context context3 = getContext();
        if (context3 != null) {
            return C1308910kAL.LIZJ(R.attr.a04, context3);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJIIJ() {
        Context context = getContext();
        if (context != null) {
            return C1308910kAL.LIZJ(R.attr.a1h, context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJJJJ() {
        return Integer.valueOf(C2532609wC.LIZ() ? 62 : 52);
    }

    public final boolean LJJLJLI() {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility == null) {
            return false;
        }
        String name = getName();
        if (name == null) {
            name = "";
        }
        return iHeaderAdvancedFeatureAbility.pA1(name);
    }

    public final void LJJZZI() {
        IProfilePlatformVM iProfilePlatformVM;
        User userVQ2;
        if (!C0BMT.LIZ() || ((this.LLJI || (iProfilePlatformVM = this.LLIZLLLIL) == null || (userVQ2 = iProfilePlatformVM.vQ2()) == null || !userVQ2.isBlock) && !this.LLJJJJJIL)) {
            this.LLJJJJJIL = true;
            if (this.LLILZIL != null) {
                IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IHeaderAdvancedFeatureAbility.class, null);
                if (iHeaderAdvancedFeatureAbility != null) {
                    String name = getName();
                    if (name == null) {
                        name = "";
                    }
                    C2097608Jq.LJ();
                    iHeaderAdvancedFeatureAbility.OY1(name);
                }
                AwS563S0100000_19 awS563S0100000_19 = this.LLJJJJLIIL;
                if (awS563S0100000_19 != null) {
                    awS563S0100000_19.invoke();
                }
            }
        }
    }

    public final void LJLIIIL() {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String name = getName();
            if (name == null) {
                name = "";
            }
            iHeaderAdvancedFeatureAbility.Vk1(this.LLJ, name);
        }
    }

    public static void LJJLL(AdvancedFeatureProtocol advancedFeatureProtocol) {
        advancedFeatureProtocol.LLJJJJJIL = false;
        if (advancedFeatureProtocol.LLILZIL != null) {
            IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(advancedFeatureProtocol), IHeaderAdvancedFeatureAbility.class, null);
            if (iHeaderAdvancedFeatureAbility != null) {
                String name = advancedFeatureProtocol.getName();
                if (name == null) {
                    name = "";
                }
                C2097608Jq.LJ();
                iHeaderAdvancedFeatureAbility.F00(name, false);
            }
            AwS563S0100000_19 awS563S0100000_19 = advancedFeatureProtocol.LLJJJJLIIL;
            if (awS563S0100000_19 != null) {
                awS563S0100000_19.invoke();
            }
        }
    }

    public final void LJL(boolean z) {
        C426770GoN c426770GoN;
        int i;
        View view = this.LLILZLL;
        if (view != null && (c426770GoN = (C426770GoN) view.findViewById(R.id.aj0)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLLIL(c426770GoN, i);
        }
    }

    public final void LJLI(String str) {
        TextView textView;
        View view = this.LLILZLL;
        if (view != null && (textView = (TextView) view.findViewById(R.id.aj1)) != null) {
            textView.setText(str);
        }
    }
}
