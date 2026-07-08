package com.ss.android.ugc.aweme.channel.share.ability;

import X.AbstractC1375550ltp;
import X.C06KX;
import X.C1374080lrS;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AbsIntentShare implements C06KX {
    public abstract AbstractC1375550ltp LIZ(Context context, C1374080lrS c1374080lrS);

    public abstract ShareContentType LIZJ();

    public static String LIZLLL(C1374080lrS c1374080lrS) {
        if (c1374080lrS.LJ.LIZIZ) {
            return c1374080lrS.LIZLLL;
        }
        return "";
    }

    public static String LJ(C1374080lrS c1374080lrS) {
        if (c1374080lrS.LJ.LIZJ) {
            return c1374080lrS.LIZJ;
        }
        return "";
    }
}
