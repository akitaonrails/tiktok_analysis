package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C0X1D;
import X.C0X1G;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class InterfaceControlSettings implements Serializable {
    public static final int $stable = 8;

    @C09CT("rules")
    public final List<InterfaceControlRule> rules;

    @C09CT("use_new_control")
    public final Boolean useNewControl;

    @C09CT("user_type")
    public final String userType;

    @C09CT("version")
    public final String version;

    public InterfaceControlSettings() {
        this(null, null, null, null);
    }

    public final C0X1D getUserType() {
        C0X1G c0x1g = C0X1D.Companion;
        String str = this.userType;
        if (str == null) {
            str = "";
        }
        c0x1g.getClass();
        C0X1D c0x1d = C0X1D.NOT_LOGIN;
        if (Intrinsics.LJFF(str, c0x1d.getUserType())) {
            return c0x1d;
        }
        C0X1D c0x1d2 = C0X1D.NORMAL;
        if (Intrinsics.LJFF(str, c0x1d2.getUserType())) {
            return c0x1d2;
        }
        C0X1D c0x1d3 = C0X1D.CHILD_US;
        return (Intrinsics.LJFF(str, c0x1d3.getUserType()) || Intrinsics.LJFF(str, C0X1D.CHILD_OTHERS.getUserType())) ? c0x1d3 : C0X1D.UNKNOWN;
    }

    public InterfaceControlSettings(List<InterfaceControlRule> list, String str, String str2, Boolean bool) {
        this.rules = list;
        this.userType = str;
        this.version = str2;
        this.useNewControl = bool;
    }
}
