package com.lynx.tasm.behavior.ui.swiper;

import X.C1312230kFh;
import X.C1312250kFj;
import X.C1312260kFk;
import X.C1312280kFm;
import X.C1312290kFn;
import X.C1312920kGo;
import X.EnumC1300260jwO;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312240kFi;
import X.InterfaceC1312540kGC;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.shadow.CustomLayoutShadowNode;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* JADX INFO: loaded from: classes21.dex */
public class SwiperShadowNode extends CustomLayoutShadowNode implements InterfaceC1312240kFi {
    public boolean LJJIII;
    public int LJIL = -1;
    public int LJJ = -1;
    public int LJJI = -1;
    public float LJJIFFI = 1.0f;
    public float LJJII = 1.0f;
    public String LJJIIJ = "normal";

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    public final void LJ() {
        if (this.LJIJJLI) {
            LJI(this);
        }
        super.LJ();
    }

    @InterfaceC1312540kGC(name = "max-x-scale")
    public void setMaxXScale(double d) {
        if (d >= 0.0d) {
            this.LJJIFFI = (float) d;
        }
        if (this.LJIJJLI) {
            LJIILLIIL();
        }
    }

    @InterfaceC1312540kGC(name = "max-y-scale")
    public void setMaxYScale(double d) {
        if (d >= 0.0d) {
            this.LJJII = (float) d;
        }
        if (this.LJIJJLI) {
            LJIILLIIL();
        }
    }

    @InterfaceC1312540kGC(name = "mode")
    public void setMode(String str) {
        this.LJJIIJ = str;
        if (this.LJIJJLI) {
            LJIILLIIL();
        }
    }

    @InterfaceC1312540kGC(name = "next-margin")
    public void setNextMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() != ReadableType.String) {
            return;
        }
        String strAsString = interfaceC1298070jsr.asString();
        if (strAsString.endsWith("px") || strAsString.endsWith("rpx")) {
            int iLIZLLL = (int) C1312920kGo.LIZLLL(strAsString, 0.0f, -1.0f, this.LJIIL.LLJJJ);
            if (iLIZLLL < 0) {
                iLIZLLL = -1;
            }
            this.LJJ = iLIZLLL;
        }
        if (this.LJIJJLI) {
            LJIILLIIL();
        }
    }

    @InterfaceC1312540kGC(name = "page-margin")
    public void setPageMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            String strAsString = interfaceC1298070jsr.asString();
            if (strAsString.endsWith("px") || strAsString.endsWith("rpx")) {
                int iLIZLLL = (int) C1312920kGo.LIZLLL(strAsString, 0.0f, 0.0f, this.LJIIL.LLJJJ);
                if (iLIZLLL <= 0) {
                    iLIZLLL = 0;
                }
                this.LJJI = iLIZLLL;
            }
            if (this.LJIJJLI) {
                LJIILLIIL();
            }
        }
    }

    @InterfaceC1312540kGC(name = "previous-margin")
    public void setPreviousMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() != ReadableType.String) {
            return;
        }
        String strAsString = interfaceC1298070jsr.asString();
        if (strAsString.endsWith("px") || strAsString.endsWith("rpx")) {
            int iLIZLLL = (int) C1312920kGo.LIZLLL(strAsString, 0.0f, -1.0f, this.LJIIL.LLJJJ);
            if (iLIZLLL < 0) {
                iLIZLLL = -1;
            }
            this.LJIL = iLIZLLL;
        }
        if (this.LJIJJLI) {
            LJIILLIIL();
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "vertical")
    public void setVertical(boolean z) {
        this.LJJIII = z;
        if (this.LJIJJLI) {
            LJIILLIIL();
        }
    }

    @Override // X.InterfaceC1312240kFi
    public final C1312250kFj LIZ(C1312280kFm c1312280kFm, C1312230kFh c1312230kFh) {
        float f;
        float f2;
        float f3;
        float f4;
        C1312230kFh c1312230kFh2 = null;
        for (int i = 0; i < LJIIJ(); i++) {
            ShadowNode shadowNodeLJIIIZ = LJIIIZ(i);
            if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) shadowNodeLJIIIZ;
                if (c1312230kFh2 != null) {
                    nativeLayoutNodeRef.LJJIIJ(c1312280kFm, c1312230kFh2);
                } else {
                    c1312230kFh2 = new C1312230kFh();
                    float f5 = 0.0f;
                    if (!this.LJJIIJ.equals("coverflow") && !this.LJJIIJ.equals("flat-coverflow")) {
                        if (this.LJJIIJ.equals("carousel")) {
                            if (this.LJJIII) {
                                f3 = (float) (((double) c1312230kFh.LIZJ) * 0.8d);
                                f4 = c1312230kFh.LIZ;
                            } else {
                                f3 = c1312230kFh.LIZJ;
                                f4 = (float) (((double) c1312230kFh.LIZ) * 0.8d);
                            }
                            EnumC1300260jwO enumC1300260jwO = c1312230kFh.LIZIZ;
                            EnumC1300260jwO enumC1300260jwO2 = c1312230kFh.LIZLLL;
                            c1312230kFh2.LIZ = f4;
                            c1312230kFh2.LIZIZ = enumC1300260jwO;
                            c1312230kFh2.LIZJ = f3;
                            c1312230kFh2.LIZLLL = enumC1300260jwO2;
                        } else if (this.LJJIIJ.equals("carry")) {
                            float f6 = this.LJIL + this.LJJ + (this.LJJI * 2);
                            float f7 = c1312230kFh.LIZ;
                            boolean z = this.LJJIII;
                            if (z) {
                                f2 = 0.0f;
                            } else {
                                f2 = f6;
                            }
                            float f8 = (f7 - f2) * this.LJJIFFI;
                            EnumC1300260jwO enumC1300260jwO3 = c1312230kFh.LIZIZ;
                            float f9 = c1312230kFh.LIZJ;
                            if (z) {
                                f5 = f6;
                            }
                            float f10 = (f9 - f5) * this.LJJII;
                            EnumC1300260jwO enumC1300260jwO4 = c1312230kFh.LIZLLL;
                            c1312230kFh2.LIZ = f8;
                            c1312230kFh2.LIZIZ = enumC1300260jwO3;
                            c1312230kFh2.LIZJ = f10;
                            c1312230kFh2.LIZLLL = enumC1300260jwO4;
                        } else {
                            float f11 = c1312230kFh.LIZ;
                            EnumC1300260jwO enumC1300260jwO5 = c1312230kFh.LIZIZ;
                            float f12 = c1312230kFh.LIZJ;
                            EnumC1300260jwO enumC1300260jwO6 = c1312230kFh.LIZLLL;
                            c1312230kFh2.LIZ = f11;
                            c1312230kFh2.LIZIZ = enumC1300260jwO5;
                            c1312230kFh2.LIZJ = f12;
                            c1312230kFh2.LIZLLL = enumC1300260jwO6;
                        }
                    } else {
                        float f13 = this.LJIL + this.LJJ + (this.LJJI * 2);
                        float f14 = c1312230kFh.LIZ;
                        boolean z2 = this.LJJIII;
                        if (z2) {
                            f = 0.0f;
                        } else {
                            f = f13;
                        }
                        float f15 = f14 - f;
                        EnumC1300260jwO enumC1300260jwO7 = c1312230kFh.LIZIZ;
                        float f16 = c1312230kFh.LIZJ;
                        if (z2) {
                            f5 = f13;
                        }
                        EnumC1300260jwO enumC1300260jwO8 = c1312230kFh.LIZLLL;
                        c1312230kFh2.LIZ = f15;
                        c1312230kFh2.LIZIZ = enumC1300260jwO7;
                        c1312230kFh2.LIZJ = f16 - f5;
                        c1312230kFh2.LIZLLL = enumC1300260jwO8;
                    }
                    nativeLayoutNodeRef.LJJIIJ(c1312280kFm, c1312230kFh2);
                }
            }
        }
        return new C1312250kFj(c1312230kFh.LIZ, c1312230kFh.LIZJ);
    }

    @Override // X.InterfaceC1312240kFi
    public final void LIZJ(C1312290kFn c1312290kFn, C1312260kFk c1312260kFk) {
        for (int i = 0; i < LJIIJ(); i++) {
            ShadowNode shadowNodeLJIIIZ = LJIIIZ(i);
            if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                ((NativeLayoutNodeRef) shadowNodeLJIIIZ).LJJIII(new C1312260kFk());
            }
        }
    }
}
