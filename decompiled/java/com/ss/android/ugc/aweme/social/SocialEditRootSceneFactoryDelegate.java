package com.ss.android.ugc.aweme.social;

import X.AbstractC1453750nvx;
import X.C1456390o0D;
import X.C1DRG;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.aweme.social.creation.edit.util.ISocialEditRootSceneFactory;

/* JADX INFO: loaded from: classes23.dex */
public final class SocialEditRootSceneFactoryDelegate implements ISocialEditRootSceneFactory {
    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final AbstractC1453750nvx LIZ(C1DRG c1drg) {
        C1456390o0D c1456390o0D;
        if (AVInitializerImpl.LIZIZ && (c1456390o0D = C1456390o0D.LIZIZ) != null) {
            return c1456390o0D.LIZ(c1drg);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
