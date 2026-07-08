package com.ss.android.vesdk;

import X.C2188811AlT;
import com.ss.android.ttve.nativePort.TEImageBrushInterface;
import com.ss.android.vesdk.VEImage;

/* JADX INFO: loaded from: classes36.dex */
public class VEImageBrushInvoker {
    public TEImageBrushInterface mNativeBrushHandler;
    public VEImage.VEStickerBrushSavePngCallback mSavePngCallback;

    public void endStickerBrush() {
        this.mNativeBrushHandler.endStickerBrush();
    }

    public VEImageBrushInvoker(VEImage vEImage) {
        throw null;
    }

    public int addBrushSticker(String str) {
        return this.mNativeBrushHandler.addBrushSticker(str);
    }

    public void beginStickerBrush(int i) {
        this.mNativeBrushHandler.beginStickerBrush(i);
    }

    public void clearBursh(String str) {
        this.mNativeBrushHandler.clearBursh(str);
    }

    public void clearStickerBrush(int i) {
        this.mNativeBrushHandler.clearStickerBrush(i);
    }

    public String getStickerBrushState(int i) {
        return this.mNativeBrushHandler.getStickerBrushState(i);
    }

    public int removeBrushSticker(int i) {
        return this.mNativeBrushHandler.removeBrushSticker(i);
    }

    public int removeMagnifier(Boolean bool) {
        return this.mNativeBrushHandler.removeMagnifier(bool.booleanValue());
    }

    public void setEraseMattingMask(String str) {
        this.mNativeBrushHandler.setEraseMattingMask(str);
    }

    public void setStickerBrushParams(String str) {
        this.mNativeBrushHandler.setStickerBrushParams(str);
    }

    public void setStickerBrushResource(String str) {
        this.mNativeBrushHandler.setStickerBrushResource(str);
    }

    public void enableEraseMatting(String str, Boolean bool) {
        this.mNativeBrushHandler.enableEraseMatting(str, bool.booleanValue());
    }

    public void enableImageMatting(String str, Boolean bool) {
        this.mNativeBrushHandler.enableImageMatting(str, bool.booleanValue());
    }

    public void setSmartMattingMask(String str, int i) {
        this.mNativeBrushHandler.setSmartMattingMask(str, i);
    }

    public int setStickerBrushIndex(int i, int i2) {
        return this.mNativeBrushHandler.setStickerBrushIndex(i, i2);
    }

    public void undoRedoBursh(String str, Boolean bool) {
        this.mNativeBrushHandler.undoRedoBursh(str, bool.booleanValue());
    }

    public void undoRedoStickerBrush(Boolean bool, int i) {
        this.mNativeBrushHandler.undoRedoStickerBrush(bool.booleanValue(), i);
    }

    public int saveStickerBrushPng(int i, String str, final VEImage.VEStickerBrushSavePngCallback vEStickerBrushSavePngCallback) {
        if (this.mSavePngCallback == null) {
            this.mSavePngCallback = new VEImage.VEStickerBrushSavePngCallback() { // from class: X.1ECg
            };
        }
        return this.mNativeBrushHandler.saveStickerBrushPng(i, str, vEStickerBrushSavePngCallback);
    }

    public void setEffectTextureCachePathAndSize(String str, int i, int i2) {
        this.mNativeBrushHandler.setEffectTextureCachePathAndSize(str, i, i2);
    }

    public void setPaintBrushEnable(String str, String str2, Boolean bool) {
        this.mNativeBrushHandler.setPaintBrushEnable(str, str2, bool.booleanValue());
    }

    public int setStickerBrushFlip(int i, boolean z, boolean z2) {
        return this.mNativeBrushHandler.setStickerBrushFlip(i, z, z2);
    }

    public int updateMagnifier(Float f, Float f2, Float f3, Boolean bool) {
        return this.mNativeBrushHandler.updateMagnifier(f.floatValue(), f2.floatValue(), f3.floatValue(), bool.booleanValue());
    }

    public Boolean isBrushOverlapped(String str, Float f, Float f2, Float f3, Float f4) {
        return Boolean.valueOf(this.mNativeBrushHandler.isBrushOverlapped(str, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue()));
    }

    public void setStrokeRgba(String str, Float f, Float f2, Float f3, Float f4, Long l) {
        this.mNativeBrushHandler.setStrokeRgba(str, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), l.longValue());
    }

    public void setPaintParams(String str, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, int i) {
        String strLIZIZ = "";
        if (f.floatValue() >= 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append("strokeSize:$strokeSize;");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (f2.floatValue() >= 0.0f) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("strokeStep:$strokeStep;");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (f3.floatValue() >= 0.0f) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append("featherSize:$featherSize;");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (f4.floatValue() >= 0.0f) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append("speedInfluence:$speedInfluence;");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (f5.floatValue() >= 0.0f) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append("R:$R;");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        }
        if (f6.floatValue() >= 0.0f) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(strLIZIZ);
            sbLIZ6.append("G:$G;");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
        }
        if (f7.floatValue() >= 0.0f) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(strLIZIZ);
            sbLIZ7.append("B:$B;");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
        }
        if (f8.floatValue() >= 0.0f) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(strLIZIZ);
            sbLIZ8.append("A:$A;");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
        }
        if (i >= 0) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(strLIZIZ);
            sbLIZ9.append("type:$type;");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
        }
        this.mNativeBrushHandler.setPaintParams(str, strLIZIZ);
    }
}
