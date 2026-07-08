package com.ss.android.ugc.aweme.verify;

import X.C01GW;
import X.C1155580gB2;
import X.C1238130iKB;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1559260qg8;
import X.C1713570uh1;
import X.C1713680uhC;
import X.C1714230ui5;
import X.C1714660uim;
import X.C1715340ujs;
import X.C1715350ujt;
import X.C343970De7;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.CountDownTimerC1715160uja;
import X.EnumC1714450uiR;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.pipo.verify.base.model.response.AlertMsg;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.verify.ocr.OCRScannedAssem;
import kotlin.jvm.internal.AwS45S2100000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public abstract class BaseVerifyUIContentAssem extends ThemedContextUIContentAssem {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final C1559260qg8 LLJ = new C1559260qg8(new C723590SZx(this, C1155580gB2.class, "data_key"), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1132));
    public CountDownTimerC1715160uja LLJIJIL;
    public boolean LLJILJIL;

    public boolean Ho() {
        return this instanceof OCRScannedAssem;
    }

    public final C1713570uh1 Jo() {
        return (C1713570uh1) this.LLJI.getValue();
    }

    public final void Lo() {
        BaseVerifyFragment baseVerifyFragmentLIZ = C1714230ui5.LIZ(this);
        if (baseVerifyFragmentLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(baseVerifyFragmentLIZ);
            c1389890mGx.LJIIIZ(2131848597);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        CountDownTimerC1715160uja countDownTimerC1715160uja = this.LLJIJIL;
        if (countDownTimerC1715160uja != null) {
            countDownTimerC1715160uja.cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        EnumC1714450uiR enumC1714450uiRLJFF;
        boolean z;
        super.onViewCreated(view);
        C1713570uh1 c1713570uh1Jo = Jo();
        if (c1713570uh1Jo != null) {
            enumC1714450uiRLJFF = c1713570uh1Jo.LJFF();
        } else {
            enumC1714450uiRLJFF = null;
        }
        if (enumC1714450uiRLJFF == EnumC1714450uiR.HALF_PAGE && !Ho()) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILJIL = z;
    }

    public final void Go(String str, String str2) {
        BaseVerifyFragment baseVerifyFragment;
        C1713680uhC c1713680uhC;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if ((fragmentLJI instanceof BaseVerifyFragment) && (baseVerifyFragment = (BaseVerifyFragment) fragmentLJI) != null) {
            baseVerifyFragment.bS(str);
            C1713570uh1 c1713570uh1Jo = Jo();
            if (c1713570uh1Jo != null && (c1713680uhC = c1713570uh1Jo.LJIILIIL) != null) {
                C1714230ui5.LIZJ(c1713680uhC, baseVerifyFragment, str, baseVerifyFragment.UR(), str2, null, 48);
            }
            if (this.LLJILJIL) {
                String str3 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(baseVerifyFragment, C343970De7.LIZ);
            } else {
                C1714230ui5.LIZIZ(C724240Sb0.LIZ(this), Jo(), str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0uja, android.os.CountDownTimer] */
    public final void No(Integer num, final String str, boolean z) {
        Fragment fragmentLJI;
        int iIntValue;
        final long jLIZ = C1715340ujs.LIZ();
        ?? r2 = new CountDownTimer(jLIZ) { // from class: X.0uja
            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                this.LIZ.Go("PASS", str);
            }
        };
        r2.start();
        this.LLJIJIL = r2;
        if (z && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 2131840454;
            }
            C1715350ujt.LIZ(fragmentLJI, fragmentLJI.getString(iIntValue), 0L, 28);
        }
    }

    public final void Oo(AlertMsg alertMsg, String str, String str2) {
        BaseVerifyFragment baseVerifyFragmentLIZ;
        C1714660uim c1714660uimVR;
        if (alertMsg != null) {
            String str3 = alertMsg.title;
            String str4 = alertMsg.content;
            if ((str3 != null && str3.length() != 0) || (str4 != null && str4.length() != 0)) {
                if (str != null && str2 != null && (baseVerifyFragmentLIZ = C1714230ui5.LIZ(this)) != null && (c1714660uimVR = baseVerifyFragmentLIZ.VR()) != null) {
                    c1714660uimVR.LJII(str2, str);
                }
                Context context = this.LLIZLLLIL;
                if (context == null) {
                    return;
                }
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJI(str3);
                c1397580mTM.LIZIZ(str4);
                C1238130iKB.LIZ(c1397580mTM, new AwS45S2100000_26(this, str2, str, 14));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
        }
        Go("REJECT", null);
    }
}
