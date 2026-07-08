package com.ss.android.ugc.aweme.ecommerce.sec;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomCsSdkABModel {

    @C09CT("au_click")
    public final boolean abAutoClick;

    @C09CT("enable_btm")
    public final boolean abBtm;

    @C09CT("ab_delay_time")
    public final int abDelayTime;

    @C09CT("enable_emu")
    public final boolean abEmu;

    @C09CT("enable_file_syscall")
    public final boolean abSyscall;

    @C09CT("enable_vm_sign")
    public final boolean abVmSign;

    @C09CT("action_map")
    public final Map<String, Integer> actionMap;

    @C09CT("btm_chain_length")
    public final int btmChainLength;

    @C09CT("cs_switch")
    public final Map<String, Object> csSwitch;

    public EcomCsSdkABModel() {
        this(480, false, C2097608Jq.LJ(), false, false, false, 10, false, C2097608Jq.LJ());
    }

    public EcomCsSdkABModel(int i, boolean z, Map<String, ? extends Object> map, boolean z2, boolean z3, boolean z4, int i2, boolean z5, Map<String, Integer> map2) {
        this.abDelayTime = i;
        this.abAutoClick = z;
        this.csSwitch = map;
        this.abBtm = z2;
        this.abEmu = z3;
        this.abSyscall = z4;
        this.btmChainLength = i2;
        this.abVmSign = z5;
        this.actionMap = map2;
    }
}
