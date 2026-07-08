package com.facebook.imagepipeline.common;

import X.C1324940kaC;
import X.C1328950kgf;
import X.C1329360khK;
import X.InterfaceC1330200kig;
import android.graphics.Bitmap;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes21.dex */
public class ImageDecodeOptionsBuilder {
    public boolean LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public InterfaceC1330200kig LJIIIZ;
    public Object LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public Rect LJIILJJIL;
    public boolean LJIILL;
    public C1328950kgf LJIILLIIL;
    public int LIZ = 100;
    public int LIZJ = C1324940kaC.LIZ;
    public Bitmap.Config LJII = Bitmap.Config.ARGB_8888;
    public boolean LJIIIIZZ = false;

    public final void LIZ(C1329360khK c1329360khK) {
        this.LIZ = c1329360khK.LIZ;
        this.LIZIZ = c1329360khK.LIZIZ;
        this.LIZJ = c1329360khK.LIZJ;
        this.LIZLLL = c1329360khK.LIZLLL;
        this.LJ = c1329360khK.LJ;
        this.LJFF = c1329360khK.LJFF;
        this.LJII = c1329360khK.LJII;
        this.LJIIIIZZ = c1329360khK.LJIIIIZZ;
        this.LJIIIZ = c1329360khK.LJIIIZ;
        this.LJI = c1329360khK.LJI;
        this.LJIIJ = c1329360khK.LJIIJ;
        this.LJIIJJI = c1329360khK.LJIIJJI;
        this.LJIIL = c1329360khK.LJIIL;
        this.LJIILJJIL = c1329360khK.LJIILIIL;
        this.LJIILIIL = c1329360khK.LJIILJJIL;
        this.LJIILL = c1329360khK.LJIILL;
        this.LJIILLIIL = c1329360khK.LJIILLIIL;
    }

    public ImageDecodeOptionsBuilder LIZIZ(int i) {
        this.LIZJ = i;
        return this;
    }

    public ImageDecodeOptionsBuilder setBitmapConfig(Bitmap.Config config) {
        this.LJII = config;
        this.LJIIJJI = true;
        return this;
    }
}
