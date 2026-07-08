package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomSchemaBizTypeDetectionModel {

    @C09CT("check_path")
    public final List<String> checkPath;

    @C09CT("enable_debug_dialog")
    public final Boolean enableDebugDialog;

    @C09CT("enable_report")
    public final Boolean enableReport;

    public EcomSchemaBizTypeDetectionModel(List<String> list, Boolean bool, Boolean bool2) {
        this.checkPath = list;
        this.enableReport = bool;
        this.enableDebugDialog = bool2;
    }
}
