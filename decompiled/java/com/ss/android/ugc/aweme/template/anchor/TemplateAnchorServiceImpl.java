package com.ss.android.ugc.aweme.template.anchor;

import X.C1412390mrF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateAnchorServiceImpl implements ITemplateAnchorService {
    @Override // com.ss.android.ugc.aweme.template.anchor.ITemplateAnchorService
    public final String LIZ(String str, String str2) {
        if (Intrinsics.LJFF(str2, "mdp_square")) {
            return "mdp_square";
        }
        if (str != null) {
            return new C1412390mrF(str).LIZLLL().LIZ;
        }
        return null;
    }
}
