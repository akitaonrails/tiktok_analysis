package com.ss.android.vesdk;

import X.C0VSJ;
import X.C2188811AlT;
import X.C2484209oO;
import X.EnumC1290110jg1;
import java.io.File;

/* JADX INFO: loaded from: classes21.dex */
public class VEDebugSettings {
    public String mCaptureDir;
    public boolean mEnableImageDump;
    public String mImageDumpDir;
    public EnumC1290110jg1 mImageDumpType;
    public String mPreviewDir;

    public int getImageDumpTypeValue() {
        return this.mImageDumpType.ordinal();
    }

    public void init() {
        if (this.mEnableImageDump) {
            C0VSJ c0vsj = new C0VSJ(this.mImageDumpDir);
            if (!c0vsj.exists() && !c0vsj.isDirectory()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Dump directory is not exist, so do mkdir {");
                sbLIZ.append(this.mImageDumpDir);
                sbLIZ.append("}");
                C2484209oO.LJI("VEDebugSettings", C2188811AlT.LIZIZ(sbLIZ));
                c0vsj.mkdir();
            }
            if (isNeedDumpCapture()) {
                C0VSJ c0vsj2 = new C0VSJ(this.mCaptureDir);
                if (!c0vsj2.exists() && !c0vsj2.isDirectory()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Dump capture directory is not exist, so do mkdir {");
                    sbLIZ2.append(this.mCaptureDir);
                    sbLIZ2.append("}");
                    C2484209oO.LJI("VEDebugSettings", C2188811AlT.LIZIZ(sbLIZ2));
                    c0vsj2.mkdir();
                }
            }
            if (isNeedDumpPreview()) {
                C0VSJ c0vsj3 = new C0VSJ(this.mPreviewDir);
                if (c0vsj3.exists() || c0vsj3.isDirectory()) {
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Dump preview directory is not exist, so do mkdir {");
                sbLIZ3.append(this.mPreviewDir);
                sbLIZ3.append("}");
                C2484209oO.LJI("VEDebugSettings", C2188811AlT.LIZIZ(sbLIZ3));
                c0vsj3.mkdir();
            }
        }
    }

    public boolean isNeedDumpCapture() {
        if (!this.mEnableImageDump) {
            return false;
        }
        EnumC1290110jg1 enumC1290110jg1 = this.mImageDumpType;
        return enumC1290110jg1 == EnumC1290110jg1.BOTH || enumC1290110jg1 == EnumC1290110jg1.CAPTURE;
    }

    public boolean isNeedDumpPreview() {
        if (!this.mEnableImageDump) {
            return false;
        }
        EnumC1290110jg1 enumC1290110jg1 = this.mImageDumpType;
        return enumC1290110jg1 == EnumC1290110jg1.BOTH || enumC1290110jg1 == EnumC1290110jg1.PREVIEW;
    }

    public VEDebugSettings() {
        this.mImageDumpType = EnumC1290110jg1.CAPTURE;
        this.mImageDumpDir = "sdcard/vemo";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.mImageDumpDir);
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("capture");
        this.mCaptureDir = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.mImageDumpDir);
        sbLIZ2.append(str);
        sbLIZ2.append("preview");
        this.mPreviewDir = C2188811AlT.LIZIZ(sbLIZ2);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DebugSettings{mEnableImageDump=");
        sbLIZ.append(this.mEnableImageDump);
        sbLIZ.append(", mImageDumpType=");
        sbLIZ.append(this.mImageDumpType);
        sbLIZ.append(", mImageDumpDir=");
        sbLIZ.append(this.mImageDumpDir);
        sbLIZ.append(", mCaptureDir=");
        sbLIZ.append(this.mCaptureDir);
        sbLIZ.append(", mPreviewDir=");
        sbLIZ.append(this.mPreviewDir);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getCapDumpDir() {
        return this.mCaptureDir;
    }

    public boolean getEnableImageDump() {
        return this.mEnableImageDump;
    }

    public String getImageDumpDir() {
        return this.mImageDumpDir;
    }

    public EnumC1290110jg1 getImageDumpType() {
        return this.mImageDumpType;
    }

    public String getPrvDumpDir() {
        return this.mPreviewDir;
    }
}
