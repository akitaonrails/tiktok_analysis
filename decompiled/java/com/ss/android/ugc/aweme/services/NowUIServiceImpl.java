package com.ss.android.ugc.aweme.services;

import X.C0LAB;
import X.C1DRG;
import X.C578100Mls;
import X.C578720Mms;
import X.C578820Mn2;
import X.C578880Mn8;
import X.InterfaceC1675320thK;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;
import lnn.q;
import zrj.m0;

/* JADX INFO: loaded from: classes9.dex */
public final class NowUIServiceImpl implements InterfaceC1675320thK {
    public StickerInfo buildStickerInfo(C1DRG c1drg) {
        q qVar;
        if (c1drg == null || (qVar = (q) c1drg.LJIIL(null, q.class)) == null) {
            return null;
        }
        m0.LLJJI.getClass();
        return C578820Mn2.LIZ(qVar);
    }

    @Override // X.InterfaceC1675320thK
    public int getSurfaceTopMargin(Context context) {
        return C578100Mls.LIZJ(context);
    }

    @Override // X.InterfaceC1675320thK
    public void resetSurface(View view, Context context) {
        C578880Mn8.LIZIZ(context, view);
    }

    public void mobSavePhotoErrorRate(ShortVideoContext shortVideoContext, boolean z, int i) {
        C578720Mms.LIZ(shortVideoContext, z, i);
    }

    public void mobTakePhotoErrorRate(ShortVideoContext shortVideoContext, boolean z, int i, boolean z2) {
        C578720Mms.LIZJ(shortVideoContext, z, i, z2);
    }

    public void mobTakePhoto(ShortVideoContext shortVideoContext, long j, long j2, C1DRG c1drg, Function1<? super C0LAB, Unit> function1) {
        C578720Mms.LIZIZ(shortVideoContext, j, j2, new AwS552S0100000_8(c1drg, 165), function1);
    }
}
