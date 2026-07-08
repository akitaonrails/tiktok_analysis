package com.ss.android.ugc.aweme.commercialize.assem;

import X.C04TD;
import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.commercialize.feed.assem.IAdAssemUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class AdAssemUtils implements IAdAssemUtils {
    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.IAdAssemUtils
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(AdLightWebPageAssem.class);
    }

    public static IAdAssemUtils LIZIZ() {
        Object objLIZ = C04TD.LIZ(IAdAssemUtils.class, false);
        if (objLIZ != null) {
            return (IAdAssemUtils) objLIZ;
        }
        if (C04TD.LLJL == null) {
            synchronized (IAdAssemUtils.class) {
                if (C04TD.LLJL == null) {
                    C04TD.LLJL = new AdAssemUtils();
                }
            }
        }
        return C04TD.LLJL;
    }
}
