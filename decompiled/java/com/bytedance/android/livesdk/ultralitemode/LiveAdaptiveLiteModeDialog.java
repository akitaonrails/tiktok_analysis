package com.bytedance.android.livesdk.ultralitemode;

import X.C0IJT;
import X.C1090000eTG;
import X.C1119920fFW;
import X.C1161920gLG;
import X.C16F5;
import X.C1954807lC;
import X.C20743716Ff;
import X.C21382118m3;
import X.C444920HcY;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.C521550Kcr;
import X.C521710Kd7;
import X.C786410Ut5;
import X.EnumC1094630eaj;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS3S2100000_4;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUltraLiteModeSetting;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveAdaptiveLiteModeDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PSk4Oy4/HELIOSITEpJCA3LWsAIDk2CSEtOTs6PiAAIDs2BSooLAs6KSkjLg==";
    public C16F5 LL;
    public String LLILLJJLI = "";
    public C20743716Ff LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public View LLILZLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public static int NR() {
        String str;
        C1090000eTG c1090000eTGO3 = ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).O3(EnumC1094630eaj.DEFAULT, "live_mode_setting", "ultra_lite_mode");
        if (c1090000eTGO3 == null) {
            return LiveUltraLiteModeSetting.INSTANCE.getValue().getDefaultAutoSwitch();
        }
        try {
            Object obj = c1090000eTGO3.LIZJ;
            return (!(obj instanceof String) || (str = (String) obj) == null) ? LiveUltraLiteModeSetting.INSTANCE.getValue().getDefaultAutoSwitch() : CastIntegerProtector.parseInt(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LiveUltraLiteModeSetting.INSTANCE.getValue().getDefaultAutoSwitch();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        int i;
        int i2;
        int iLIZIZ;
        boolean zLJIL = C497740JfY.LJIL();
        if (zLJIL) {
            i = R.style.uh;
            i2 = 80;
        } else {
            i = R.style.ui;
            i2 = 5;
        }
        int iLIZIZ2 = -1;
        if (zLJIL) {
            iLIZIZ = -1;
            if (zLJIL) {
                iLIZIZ2 = (int) C497740JfY.LIZIZ(144.0f);
            } else if (zLJIL) {
                throw new C1954807lC();
            }
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(490.0f);
        }
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.fxm);
        c500980Jkm.LIZJ = i;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = i2;
        c500980Jkm.LJIIIZ = iLIZIZ;
        c500980Jkm.LJIIJ = iLIZIZ2;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    public final SpannableStringBuilder MR(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        int length2 = spannableStringBuilder.length();
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(61, false), 0, length, 33);
        C1119920fFW.LJ(getContext(), spannableStringBuilder, length, length2, 17, 8, 500);
        C786410Ut5.q2(spannableStringBuilder, new C521550Kcr(this, 4), length, length2, 33);
        return spannableStringBuilder;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        super.onViewCreated(view, bundle);
        this.LL = (C16F5) view.findViewById(R.id.n8z);
        C20743716Ff c20743716Ff = (C20743716Ff) view.findViewById(R.id.n90);
        this.LLILLL = c20743716Ff;
        boolean z2 = false;
        if (c20743716Ff != null) {
            if (NR() == 1) {
                z = true;
            } else {
                z = false;
            }
            c20743716Ff.setChecked(z);
        }
        C20743716Ff c20743716Ff2 = this.LLILLL;
        if (c20743716Ff2 != null) {
            C786410Ut5.A7(c20743716Ff2, new C521710Kd7(this, 1));
        }
        View viewFindViewById = view.findViewById(R.id.n8y);
        this.LLILZLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 107), viewFindViewById);
        }
        this.LLILZ = (C16F5) view.findViewById(R.id.f835yo5);
        this.LLILZIL = (C16F5) view.findViewById(R.id.yo4);
        try {
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                C21382118m3.LIZIZ(c16f5, 10, 17, 1, 1);
            }
            C16F5 c16f52 = this.LLILZIL;
            if (c16f52 != null) {
                C21382118m3.LIZIZ(c16f52, 9, 16, 1, 1);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String strLJIJI = C497740JfY.LJIJI(2131855035);
        String strLJIJI2 = C497740JfY.LJIJI(2131851237);
        C16F5 c16f53 = this.LL;
        if (c16f53 != null) {
            c16f53.setText(MR(strLJIJI, strLJIJI2));
            c16f53.setMovementMethod(LinkMovementMethod.getInstance());
            c16f53.setHighlightColor(0);
        }
        try {
            C16F5 c16f54 = this.LL;
            if (c16f54 != null) {
                C21382118m3.LIZIZ(c16f54, 8, 13, 1, 1);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C16F5 c16f55 = this.LL;
        if (c16f55 != null) {
            HandlerHook.viewPost(c16f55, new ARunnableS3S2100000_4(this, strLJIJI, strLJIJI2, 1));
        }
        String str2 = this.LLILLJJLI;
        if (NR() == 1) {
            z2 = true;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_lite_mode_event");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("panel_show_from", str2);
        if (z2) {
            str = "on";
        } else {
            str = "off";
        }
        linkedHashMap.put("toggle_status", str);
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
