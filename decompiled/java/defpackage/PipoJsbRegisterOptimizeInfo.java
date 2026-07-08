package defpackage;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoJsbRegisterOptimizeInfo {

    @C09CT("bnpl_opt_config")
    public final PipoBnplJsbRegisterConfig bnplOptConfig;

    @C09CT("enable_bnpl_opt")
    public final boolean enableBnplOpt;

    @C09CT("enable_pipo_opt")
    public final boolean enablePipoOpt;

    @C09CT("pipo_opt_config")
    public final List<String> pipoOptConfigList;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final boolean f0switch;

    public PipoJsbRegisterOptimizeInfo() {
        this(false, false, null, false, null);
    }

    public PipoJsbRegisterOptimizeInfo(boolean z, boolean z2, List<String> list, boolean z3, PipoBnplJsbRegisterConfig pipoBnplJsbRegisterConfig) {
        this.f0switch = z;
        this.enablePipoOpt = z2;
        this.pipoOptConfigList = list;
        this.enableBnplOpt = z3;
        this.bnplOptConfig = pipoBnplJsbRegisterConfig;
    }
}
