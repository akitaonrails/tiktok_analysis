package com.ss.android.ugc.aweme.component.ca;

import X.C0PEM;
import X.C1222010huB;
import X.C1716550ulp;
import X.C1717580unU;
import X.C1718070uoH;
import X.C1718080uoI;
import X.C1718110uoL;
import X.C1718360uok;
import X.C1718370uol;
import X.C23250099c;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.biz.ab.PipoTtpayOpencaSettingModel;
import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import kotlin.jvm.internal.AwS33S0010000_19;

/* JADX INFO: loaded from: classes27.dex */
public final class OpenCANeedSyncViewModel extends AssemViewModel<C1222010huB> {
    public static final long LLILZ;
    public static final int LLILZIL;
    public boolean LL;
    public String LLILLJJLI;
    public boolean LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1222010huB(0);
    }

    static {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtpayOpencaSettingModel pipoTtpayOpencaSettingModel = C1718370uol.LIZ;
        PipoTtpayOpencaSettingModel pipoTtpayOpencaSettingModel2 = (PipoTtpayOpencaSettingModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ttpay_openca_setting", PipoTtpayOpencaSettingModel.class, pipoTtpayOpencaSettingModel);
        if (pipoTtpayOpencaSettingModel2 == null) {
            pipoTtpayOpencaSettingModel2 = pipoTtpayOpencaSettingModel;
        }
        LLILZ = pipoTtpayOpencaSettingModel2.intervalMs;
        PipoTtpayOpencaSettingModel pipoTtpayOpencaSettingModel3 = (PipoTtpayOpencaSettingModel) SettingsManager.LIZLLL().LJIIIIZZ("pipo_ttpay_openca_setting", PipoTtpayOpencaSettingModel.class, pipoTtpayOpencaSettingModel);
        if (pipoTtpayOpencaSettingModel3 != null) {
            pipoTtpayOpencaSettingModel = pipoTtpayOpencaSettingModel3;
        }
        LLILZIL = pipoTtpayOpencaSettingModel.loopCount;
    }

    public static Object xQ2(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1718070uoH c1718070uoH = new C1718080uoI().LL;
        C1716550ulp.LIZ.getClass();
        String strLIZJ = C1716550ulp.LIZJ(str);
        String strLJ = C1716550ulp.LJ(str);
        if (strLJ == null) {
            strLJ = "";
        }
        C1718110uoL.LIZ.getClass();
        String strLIZ = C1718110uoL.LIZ(str);
        c1718070uoH.getClass();
        PipoAccountApi.LIZ.getClass();
        return C1717580unU.LIZ(strLIZJ).openCaAccountV2(strLJ, strLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:55:0x0100, B:58:0x0107], limit reached: 101 */
    /* JADX WARN: Path cross not found for [B:58:0x0107, B:55:0x0100], limit reached: 101 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[Catch: Exception -> 0x0158, CancellationException -> 0x015d, TryCatch #4 {CancellationException -> 0x015d, Exception -> 0x0158, blocks: (B:13:0x0039, B:75:0x0136, B:50:0x00f5, B:53:0x00fc, B:55:0x0100, B:61:0x010c, B:63:0x0112, B:77:0x013b, B:79:0x0141, B:81:0x0147, B:85:0x014e, B:70:0x011f, B:72:0x0123, B:49:0x00ea, B:18:0x0057, B:21:0x005c, B:23:0x0069, B:24:0x006b, B:29:0x0091, B:31:0x0099, B:34:0x00a0), top: B:100:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c A[Catch: Exception -> 0x0158, CancellationException -> 0x015d, TryCatch #4 {CancellationException -> 0x015d, Exception -> 0x0158, blocks: (B:13:0x0039, B:75:0x0136, B:50:0x00f5, B:53:0x00fc, B:55:0x0100, B:61:0x010c, B:63:0x0112, B:77:0x013b, B:79:0x0141, B:81:0x0147, B:85:0x014e, B:70:0x011f, B:72:0x0123, B:49:0x00ea, B:18:0x0057, B:21:0x005c, B:23:0x0069, B:24:0x006b, B:29:0x0091, B:31:0x0099, B:34:0x00a0), top: B:100:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123 A[Catch: Exception -> 0x0158, CancellationException -> 0x015d, TryCatch #4 {CancellationException -> 0x015d, Exception -> 0x0158, blocks: (B:13:0x0039, B:75:0x0136, B:50:0x00f5, B:53:0x00fc, B:55:0x0100, B:61:0x010c, B:63:0x0112, B:77:0x013b, B:79:0x0141, B:81:0x0147, B:85:0x014e, B:70:0x011f, B:72:0x0123, B:49:0x00ea, B:18:0x0057, B:21:0x005c, B:23:0x0069, B:24:0x006b, B:29:0x0091, B:31:0x0099, B:34:0x00a0), top: B:100:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014e A[Catch: Exception -> 0x0158, CancellationException -> 0x015d, TryCatch #4 {CancellationException -> 0x015d, Exception -> 0x0158, blocks: (B:13:0x0039, B:75:0x0136, B:50:0x00f5, B:53:0x00fc, B:55:0x0100, B:61:0x010c, B:63:0x0112, B:77:0x013b, B:79:0x0141, B:81:0x0147, B:85:0x014e, B:70:0x011f, B:72:0x0123, B:49:0x00ea, B:18:0x0057, B:21:0x005c, B:23:0x0069, B:24:0x006b, B:29:0x0091, B:31:0x0099, B:34:0x00a0), top: B:100:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0121 -> B:75:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0133 -> B:75:0x0136). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(java.lang.String r14, X.InterfaceC1364105Vn<? super java.lang.String> r15) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncViewModel.vQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void wQ2(String str, boolean z, boolean z2) {
        this.LLILLL = z2;
        setState(new AwS33S0010000_19(z, 5));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1718360uok(this, str, null), 2);
    }
}
