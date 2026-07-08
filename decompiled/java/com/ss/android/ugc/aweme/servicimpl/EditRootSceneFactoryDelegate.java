package com.ss.android.ugc.aweme.servicimpl;

import X.AbstractC1453750nvx;
import X.C1456410o0F;
import X.C1DRG;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory;

/* JADX INFO: loaded from: classes23.dex */
public final class EditRootSceneFactoryDelegate implements IEditRootSceneFactory {
    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final AbstractC1453750nvx LIZ(C1DRG c1drg) {
        C1456410o0F c1456410o0F;
        if (!AVInitializerImpl.LIZIZ) {
            c1456410o0F = null;
        } else {
            c1456410o0F = C1456410o0F.LIZIZ;
        }
        return c1456410o0F.LIZ(c1drg);
    }
}
