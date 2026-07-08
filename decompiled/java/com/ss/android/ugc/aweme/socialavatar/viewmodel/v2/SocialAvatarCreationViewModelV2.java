package com.ss.android.ugc.aweme.socialavatar.viewmodel.v2;

import X.C054G;
import X.C0HL0;
import X.C0HL4;
import X.C0HL5;
import X.C0HL6;
import X.C0HL8;
import X.C0HLI;
import X.C0HMZ;
import X.C13LP;
import X.C1697810uHb;
import X.C1956107lP;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C263660AUy;
import X.C439610HLr;
import X.EnumC439280HKk;
import X.EnumC439310HKn;
import X.EnumC444760HcI;
import X.InterfaceC439650HLv;
import X.InterfaceC497601wk;
import android.content.Intent;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarCreationViewModelV2 extends BaseSocialAvatarCreationVM {
    public final C0HL8 LLJLLL;
    public final Function1<Intent, Unit> LLJZ;
    public C439610HLr LLJZIJLIL;
    public long LLL;

    public final void DQ2() {
        C2252321DDq c2252321DDq = this.LLJIJIL;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C0HL5(EnumC439280HKk.WAIT_QUEUE, 6))) {
        }
        C054G c054g = C1956107lP.LIZ;
        C1956107lP.LIZIZ(wQ2(), false);
        C0HLI c0hli = this.LLILLL;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        String str = this.LLJLLL.LJII;
        if (str == null) {
            str = null;
        }
        AwS620S0100000_6 awS620S0100000_6 = new AwS620S0100000_6(this, 86);
        AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(this, 200);
        AwS585S0100000_6 awS585S0100000_62 = new AwS585S0100000_6(this, 201);
        c0hli.getClass();
        C0HLI.LJIIIZ(viewModelScope, str, awS620S0100000_6, awS585S0100000_6, awS585S0100000_62);
    }

    public final void EQ2() {
        Object value;
        C439610HLr c439610HLr = this.LLJZIJLIL;
        if (c439610HLr != null) {
            C2252321DDq c2252321DDq = this.LLILZIL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, new C0HL4(((C0HL4) value).LIZ, C1697810uHb.LJIILJJIL(c439610HLr))));
        }
        zQ2(xQ2(), 0L, AFwS236S0000000_6.get$arr$(352));
    }

    public final void AQ2() {
        Object value;
        zQ2(xQ2(), 0L, AFwS236S0000000_6.get$arr$(350));
        C2252321DDq c2252321DDq = this.LLILZIL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, new C0HL4(((C0HL4) value).LIZ, new ArrayList())));
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM
    public final void yQ2() {
        InterfaceC439650HLv interfaceC439650HLv = xQ2().getValue().LIZIZ;
        if (!(interfaceC439650HLv instanceof EnumC444760HcI) || interfaceC439650HLv == null || interfaceC439650HLv != EnumC444760HcI.MUGSHOT_SUCCEED || SystemClock.elapsedRealtime() - this.LLL <= ((Number) C263660AUy.LIZ.getValue()).longValue()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUnMatching, mugshotStickyTime = ");
        sbLIZ.append(this.LLL);
        sbLIZ.append(", back to MUGSHOT_DETECTING");
        C2188811AlT.LIZIZ(sbLIZ);
        zQ2(xQ2(), 0L, AFwS236S0000000_6.get$arr$(424));
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM
    public final C0HL8 vQ2() {
        return this.LLJLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SocialAvatarCreationViewModelV2(C0HL8 c0hl8, Function1<? super Intent, Unit> function1) {
        super(c0hl8);
        this.LLJLLL = c0hl8;
        this.LLJZ = function1;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0HMZ(null), 3);
    }

    public final void BQ2(InterfaceC439650HLv interfaceC439650HLv, C439610HLr c439610HLr, boolean z) {
        EnumC444760HcI enumC444760HcI;
        if ((interfaceC439650HLv instanceof EnumC444760HcI) && (enumC444760HcI = (EnumC444760HcI) interfaceC439650HLv) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStageCompleted: ");
            sbLIZ.append(enumC444760HcI);
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C0HL6.LIZ[enumC444760HcI.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.LLL = SystemClock.elapsedRealtime();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("OneStepDetectionStage.MUGSHOT_SUCCEED, mugshotStickyTime = ");
                        sbLIZ2.append(this.LLL);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (z && c439610HLr != null) {
                            this.LLJZIJLIL = c439610HLr;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!z || c439610HLr == null) {
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("OneStepDetectionStage.MUGSHOT_DETECTING, mugshotStickyTime = ");
                sbLIZ3.append(this.LLL);
                C2188811AlT.LIZIZ(sbLIZ3);
                this.LLL = SystemClock.elapsedRealtime();
                InterfaceC439650HLv interfaceC439650HLvNextStage = interfaceC439650HLv.nextStage();
                if (interfaceC439650HLvNextStage == null) {
                    return;
                }
                zQ2(xQ2(), interfaceC439650HLv.detectConfig().LIZLLL, new AwS372S0200000_6(interfaceC439650HLvNextStage, this, 47));
                return;
            }
            InterfaceC439650HLv interfaceC439650HLvNextStage2 = interfaceC439650HLv.nextStage();
            if (interfaceC439650HLvNextStage2 == null) {
                return;
            }
            zQ2(xQ2(), interfaceC439650HLv.detectConfig().LIZLLL, new AwS372S0200000_6(interfaceC439650HLvNextStage2, this, 47));
        }
    }

    public final void CQ2(List<DMUploadImageResult> list, float f, Integer num, Integer num2, Integer num3, InterfaceC497601wk interfaceC497601wk) {
        String uri;
        DMEncryptedImageContent dMEncryptedImageContent;
        zQ2(xQ2(), 0L, AFwS236S0000000_6.get$arr$(351));
        this.LLJLLL.LJIILL.add(EnumC439310HKn.METHOD_UPLOAD);
        C0HL8 c0hl8 = this.LLJLLL;
        DMUploadImageResult dMUploadImageResult = (DMUploadImageResult) C13LP.LJJJLZIJ(0, list);
        if (dMUploadImageResult == null || (dMEncryptedImageContent = dMUploadImageResult.decryptData) == null || (uri = dMEncryptedImageContent.getUri()) == null) {
            uri = "";
        }
        c0hl8.LJJIFFI = uri;
        if (num != null) {
            this.LLJLLL.LJIJJLI = num.intValue();
        }
        if (num2 != null) {
            this.LLJLLL.LJIL = num2.intValue();
        }
        if (num3 != null) {
            this.LLJLLL.LJJ = num3.intValue();
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0HL0(this, list, f, null), 3);
    }
}
