package com.ss.android.ugc.aweme.services.external.ui;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class EPTemplateInfo implements Serializable {

    @C09CT("is_ep_template")
    public final boolean isEPTemplate;

    @C09CT("template_used_functions")
    public final String usedFunctions;

    /* JADX WARN: Multi-variable type inference failed */
    public EPTemplateInfo() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean isEPTemplate() {
        return this.isEPTemplate;
    }

    public EPTemplateInfo(boolean z, String str) {
        this.isEPTemplate = z;
        this.usedFunctions = str;
    }

    public /* synthetic */ EPTemplateInfo(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }
}
