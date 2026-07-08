package com.ss.android.ttvecamera;

import X.C08FF;
import X.C0VSV;
import X.C2183321Acc;
import X.C2183341Ace;
import X.C2185681AgQ;
import X.C2185891Agl;
import X.C2185901Agm;
import X.C2185911Agn;
import X.C2185921Ago;
import X.C2185931Agp;
import X.C2187451AjH;
import X.C2188811AlT;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Rational;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes34.dex */
public class TECameraFrame {
    public boolean isDependSurfaceTimestamp;
    public boolean isMatchFrameHandleFps;
    public C2185931Agp mCameraFrameBase;
    public boolean mCanDrop;
    public String mCustomTag;
    public long mDynamicRangeProfile;
    public int mHeight;
    public Metadata mMetadata;
    public int mWidth;
    public long mfTimestampNS;

    /* JADX INFO: loaded from: classes36.dex */
    public static class Metadata {
        public TotalCaptureResult captureResult;
        public int maxIso;
        public int minIso;
        public int width = -1;
        public int height = -1;
        public long timestamp = -1;
        public int maeState = -1;
        public float fovx = -1.0f;
        public float fovy = -1.0f;
        public float zoomRatio = -1.0f;
        public int exposureTime = -1;
        public float ambientLight = -1.0f;

        public HashMap<String, String> flatten() {
            HashMap<String, String> map = new HashMap<>();
            if (this.timestamp != -1) {
                TimeZone timeZone = TimeZone.getDefault();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
                simpleDateFormat.setTimeZone(timeZone);
                String str = simpleDateFormat.format(Long.valueOf(this.timestamp));
                if (str != null) {
                    map.put("DateTime", str);
                    map.put("DateTimeDigitized", str);
                    if (Build.VERSION.SDK_INT >= 24) {
                        map.put("DateTimeOriginal", str);
                    }
                }
            }
            int i = this.width;
            if (i != -1) {
                map.put("ImageWidth", String.valueOf(i));
                if (Build.VERSION.SDK_INT >= 24) {
                    map.put("PixelXDimension", String.valueOf(this.width));
                }
            }
            int i2 = this.height;
            if (i2 != -1) {
                map.put("ImageLength", String.valueOf(i2));
                if (Build.VERSION.SDK_INT >= 24) {
                    map.put("PixelYDimension", String.valueOf(this.height));
                }
            }
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                map.put("Make", str2);
            }
            String str3 = Build.MODEL;
            if (str3 != null) {
                map.put("Model", str3);
            }
            TotalCaptureResult totalCaptureResult = this.captureResult;
            if (totalCaptureResult != null) {
                Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                if (l != null) {
                    map.put("ExposureTime", String.valueOf(new Rational((int) (l.longValue() / 1000000), LSPassThroughRecordSizeConfig.DEFAULT).floatValue()));
                }
                Integer num = (Integer) this.captureResult.get(CaptureResult.CONTROL_AWB_MODE);
                if (num != null) {
                    if (num.intValue() == 1) {
                        map.put("WhiteBalance", String.valueOf(0));
                    } else {
                        map.put("WhiteBalance", String.valueOf(1));
                    }
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    Float f = (Float) this.captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
                    if (f != null) {
                        map.put("FocalLength", new Rational((int) (f.floatValue() * 1000.0f), LSPassThroughRecordSizeConfig.DEFAULT).toString());
                    }
                    Integer num2 = (Integer) this.captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                    Integer num3 = (Integer) this.captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
                    if (num3 != null && num2 != null) {
                        map.put("ISOSpeedRatings", String.valueOf((num3.intValue() * num2.intValue()) / 100));
                    }
                    Object obj = this.captureResult.get(CaptureResult.LENS_APERTURE);
                    if (obj != null) {
                        map.put("FNumber", String.valueOf(obj));
                    }
                }
            }
            return map;
        }

        public HashMap<String, Integer> flattenForTitan() {
            HashMap<String, Integer> map = new HashMap<>();
            TotalCaptureResult totalCaptureResult = this.captureResult;
            if (totalCaptureResult != null) {
                Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                if (l != null) {
                    map.put("exposuretime", Integer.valueOf(new Rational((int) (l.longValue() / 1000000), LSPassThroughRecordSizeConfig.DEFAULT).intValue()));
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    Integer num = (Integer) this.captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                    Integer num2 = (Integer) this.captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
                    if (num2 != null && num != null) {
                        map.put("iso", Integer.valueOf((num2.intValue() * num.intValue()) / 100));
                    }
                    int i = this.maxIso;
                    if (i != -1) {
                        map.put("maxiso", Integer.valueOf(i));
                    }
                    int i2 = this.minIso;
                    if (i2 != -1) {
                        map.put("minIso", Integer.valueOf(i2));
                    }
                }
            }
            map.put("aeState", Integer.valueOf(this.maeState));
            return map;
        }
    }

    public byte[] getBufferData() {
        C2185931Agp c2185931Agp = this.mCameraFrameBase;
        if (c2185931Agp instanceof C2185901Agm) {
            return ((C2185901Agm) c2185931Agp).LJI;
        }
        return null;
    }

    public int getBufferSize() {
        C2185931Agp c2185931Agp = this.mCameraFrameBase;
        if (c2185931Agp instanceof C2185901Agm) {
            return ((C2185901Agm) c2185931Agp).LJFF;
        }
        return 0;
    }

    public int getFacing() {
        return this.mCameraFrameBase.LJ;
    }

    public float[] getMVPMatrix() {
        C2185931Agp c2185931Agp = this.mCameraFrameBase;
        if (c2185931Agp instanceof C2185911Agn) {
            return ((C2185911Agn) c2185931Agp).LJI;
        }
        return null;
    }

    public ETEPixelFormat getPixelFormat() {
        return this.mCameraFrameBase.LIZIZ;
    }

    public C2185681AgQ getPlans() {
        C2185931Agp c2185931Agp = this.mCameraFrameBase;
        if (c2185931Agp instanceof C2185921Ago) {
            return ((C2185921Ago) c2185931Agp).LJFF;
        }
        return null;
    }

    public int getRotation() {
        return this.mCameraFrameBase.LIZLLL;
    }

    public TEFrameSizei getSize() {
        return this.mCameraFrameBase.LIZ;
    }

    public int getTextureID() {
        C2185931Agp c2185931Agp = this.mCameraFrameBase;
        if (c2185931Agp instanceof C2185911Agn) {
            return ((C2185911Agn) c2185931Agp).LJFF;
        }
        return 0;
    }

    public int getType() {
        return this.mCameraFrameBase.LIZJ;
    }

    public byte[] getJpegData() {
        ByteBuffer buffer = null;
        if (getPixelFormat() != ETEPixelFormat.PIXEL_FORMAT_JPEG) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Current format is ");
            sbLIZ.append(getPixelFormat());
            sbLIZ.append(", could not get jpeg data!");
            C2183341Ace.LIZIZ("TECameraFrame", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        C2185931Agp c2185931Agp = this.mCameraFrameBase;
        if (c2185931Agp instanceof C2185901Agm) {
            return ((C2185901Agm) c2185931Agp).LJI;
        }
        if (!(c2185931Agp instanceof C2185921Ago)) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraFrame", "Unexpected frame instance! Failed to get jpeg data.");
            return null;
        }
        Image.Plane[] planeArr = ((C2185921Ago) c2185931Agp).LJFF.LIZ;
        if (planeArr != null && planeArr.length > 0) {
            buffer = planeArr[0].getBuffer();
        }
        buffer.rewind();
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        return bArr;
    }

    public String getCustomTag() {
        return this.mCustomTag;
    }

    public long getDynamicRangeProfile() {
        return this.mDynamicRangeProfile;
    }

    public Metadata getMetadata() {
        return this.mMetadata;
    }

    public long getTimeStampNS() {
        return this.mfTimestampNS;
    }

    public boolean isCanDrop() {
        return this.mCanDrop;
    }

    public boolean isDependSurfaceTimestamp() {
        return this.isDependSurfaceTimestamp;
    }

    public boolean isMatchFrameHandleFps() {
        return this.isMatchFrameHandleFps;
    }

    public enum ETEPixelFormat {
        PIXEL_FORMAT_YUV420,
        PIXEL_FORMAT_YUV420P,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_YUYV422,
        PIXEL_FORMAT_YUV422P,
        PIXEL_FORMAT_UYVY422,
        PIXEL_FORMAT_GRAY8,
        PIXEL_FORMAT_RGB8,
        PIXEL_FORMAT_BGR8,
        PIXEL_FORMAT_ARGB8,
        PIXEL_FORMAT_RGBA8,
        PIXEL_FORMAT_BGRA8,
        PIXEL_FORMAT_OpenGL_GRAY,
        PIXEL_FORMAT_OpenGL_RGB8,
        PIXEL_FORMAT_OpenGL_RGBA8,
        PIXEL_FORMAT_OpenGL_OES,
        PIXEL_FORMAT_JPEG,
        PIXEL_FORMAT_BUFFER,
        PIXEL_FORMAT_Count,
        PIXEL_FORMAT_Recorder,
        PIXEL_FORMAT_RAW_SENSOR;

        public static ETEPixelFormat valueOf(String str) {
            return (ETEPixelFormat) C08FF.LIZ(ETEPixelFormat.class, str);
        }
    }

    public static int pixelFormat2ImageFormat(ETEPixelFormat eTEPixelFormat) {
        switch (C2185891Agl.LIZ[eTEPixelFormat.ordinal()]) {
            case 1:
                return 35;
            case 2:
                return 842094169;
            case 3:
                return 17;
            case 4:
                return 16;
            case 5:
            case 6:
                return 39;
            case 7:
                return 41;
            case 8:
                return 42;
            case BdTuring.TYPE_ECAF /* 9 */:
                return 256;
            default:
                return 0;
        }
    }

    public void dumpImageToPath(String str) throws Throwable {
        C0VSV c0vsv;
        C0VSV c0vsv2;
        if (this.mCameraFrameBase == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraFrame", "frame is null, dump failed!");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_");
        sbLIZ.append(getSize().width);
        sbLIZ.append("x");
        sbLIZ.append(getSize().height);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_");
        sbLIZ2.append(System.currentTimeMillis());
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("_TECameraFrame");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(strLIZIZ2);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        int i2 = C2185891Agl.LIZ[getPixelFormat().ordinal()];
        C0VSV c0vsv3 = null;
        if (i2 != 1) {
            if (i2 != 9) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("unexpected dump image format: ");
                sbLIZ4.append(getPixelFormat());
                C2183341Ace.LIZIZ("TECameraFrame", C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ3);
            sbLIZ5.append("_JPEG.jpeg");
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Start to dump TECameraFrame to ");
            sbLIZ6.append(strLIZIZ4);
            C2183341Ace.LIZLLL("TECameraFrame", C2188811AlT.LIZIZ(sbLIZ6));
            byte[] jpegData = getJpegData();
            String str2 = C2183321Acc.LIZ;
            try {
                try {
                    if (jpegData == null) {
                        C2183341Ace.LIZIZ("TECameraUtils", "Input null data, failed to save jpeg!");
                        return;
                    }
                    try {
                        c0vsv2 = new C0VSV(strLIZIZ4);
                    } catch (IOException e) {
                        e = e;
                    }
                    try {
                        c0vsv2.write(jpegData, 0, jpegData.length);
                        c0vsv2.close();
                    } catch (IOException e2) {
                        e = e2;
                        c0vsv3 = c0vsv2;
                        TryCatchGuardChecker.doCheck(e);
                        int i5 = C2187451AjH.LIZ;
                        C2183341Ace.LIZIZ("TECameraUtils", "save jpeg failed！");
                        if (c0vsv3 == null) {
                            return;
                        }
                        c0vsv3.close();
                    } catch (Throwable th) {
                        th = th;
                        c0vsv3 = c0vsv2;
                        TryCatchGuardChecker.doCheck(th);
                        if (c0vsv3 != null) {
                            try {
                                c0vsv3.close();
                                throw th;
                            } catch (IOException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                int i6 = C2187451AjH.LIZ;
                                C2183341Ace.LIZIZ("TECameraUtils", "close FileOutputStream failed!");
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    int i7 = C2187451AjH.LIZ;
                    C2183341Ace.LIZIZ("TECameraUtils", "close FileOutputStream failed!");
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(strLIZIZ3);
            sbLIZ7.append("_YUV420.yuv");
            String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ7);
            int i8 = C2187451AjH.LIZ;
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("Start to dump TECameraFrame to ");
            sbLIZ8.append(strLIZIZ5);
            C2183341Ace.LIZLLL("TECameraFrame", C2188811AlT.LIZIZ(sbLIZ8));
            if (getPlans() != null) {
                Image.Plane[] planeArr = getPlans().LIZ;
                int i9 = getSize().width;
                int i10 = getSize().height;
                String str3 = C2183321Acc.LIZ;
                if (planeArr == null) {
                    C2183341Ace.LIZIZ("TECameraUtils", "Input null plane, failed to save yuv!");
                    return;
                }
                if (planeArr[0] != null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    byteBufferAllocate.putInt(i9);
                    byteBufferAllocate.putInt(i10);
                    byteBufferAllocate.putInt(planeArr[0].getPixelStride());
                    byteBufferAllocate.putInt(planeArr[0].getRowStride());
                    try {
                        try {
                            try {
                                c0vsv = new C0VSV(strLIZIZ5);
                            } catch (IOException e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                int i11 = C2187451AjH.LIZ;
                                C2183341Ace.LIZIZ("TECameraUtils", "close FileOutputStream failed!");
                                return;
                            }
                        } catch (IOException e6) {
                            e = e6;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        c0vsv.write(byteBufferAllocate.array());
                        for (Image.Plane plane : planeArr) {
                            ByteBuffer buffer = plane.getBuffer();
                            byte[] bArr = new byte[buffer.remaining()];
                            buffer.get(bArr);
                            c0vsv.write(bArr);
                            buffer.rewind();
                        }
                        c0vsv.close();
                        return;
                    } catch (IOException e7) {
                        e = e7;
                        c0vsv3 = c0vsv;
                        TryCatchGuardChecker.doCheck(e);
                        int i12 = C2187451AjH.LIZ;
                        C2183341Ace.LIZIZ("TECameraUtils", "save yuv failed!");
                        if (c0vsv3 == null) {
                            return;
                        }
                        c0vsv3.close();
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        c0vsv3 = c0vsv;
                        TryCatchGuardChecker.doCheck(th);
                        if (c0vsv3 != null) {
                            try {
                                c0vsv3.close();
                                throw th;
                            } catch (IOException e8) {
                                TryCatchGuardChecker.doCheck(e8);
                                int i13 = C2187451AjH.LIZ;
                                C2183341Ace.LIZIZ("TECameraUtils", "close FileOutputStream failed!");
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                C2183341Ace.LIZIZ("TECameraUtils", "save yuv failed, plane is null");
                return;
            }
            C2183341Ace.LIZIZ("TECameraFrame", "plane is null, dump failed!");
        }
    }

    public void setCanDrop(boolean z) {
        this.mCanDrop = z;
    }

    public void setCustomTag(String str) {
        if (str == null) {
            str = "";
        }
        this.mCustomTag = str;
    }

    public void setDependSurfaceTimestamp(boolean z) {
        this.isDependSurfaceTimestamp = z;
    }

    public void setDynamicRangeProfile(long j) {
        this.mDynamicRangeProfile = j;
    }

    public void setEnableMatchFrameHandleFps(boolean z) {
        this.isMatchFrameHandleFps = z;
    }

    public void setMetadata(Metadata metadata) {
        this.mMetadata = metadata;
    }

    public void setTextureID(int i) {
        C2185931Agp c2185931Agp = this.mCameraFrameBase;
        if (c2185931Agp instanceof C2185911Agn) {
            ((C2185911Agn) c2185931Agp).LJFF = i;
        }
    }

    public static ETEPixelFormat imageFormat2PixelFormat(int i, int i2) {
        if (i2 == 2) {
            return ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES;
        }
        if (i2 == 1) {
            if (i == 41) {
                return ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGB8;
            }
            if (i == 42) {
                return ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGBA8;
            }
            return ETEPixelFormat.PIXEL_FORMAT_Count;
        }
        if (i2 == 0) {
            if (i != 17) {
                if (i != 35) {
                    if (i != 39) {
                        if (i != 256) {
                            if (i != 41) {
                                if (i != 42) {
                                    return ETEPixelFormat.PIXEL_FORMAT_Count;
                                }
                                return ETEPixelFormat.PIXEL_FORMAT_RGBA8;
                            }
                            return ETEPixelFormat.PIXEL_FORMAT_RGB8;
                        }
                        return ETEPixelFormat.PIXEL_FORMAT_JPEG;
                    }
                    return ETEPixelFormat.PIXEL_FORMAT_YUV422P;
                }
                return ETEPixelFormat.PIXEL_FORMAT_YUV420P;
            }
            return ETEPixelFormat.PIXEL_FORMAT_NV21;
        }
        return ETEPixelFormat.PIXEL_FORMAT_Count;
    }

    public TECameraFrame(int i, int i2, long j) {
        this.isDependSurfaceTimestamp = true;
        this.mDynamicRangeProfile = 1L;
        this.mCustomTag = "";
        this.mCameraFrameBase = new C2185931Agp(0, 0, 0);
        this.mWidth = i;
        this.mHeight = i2;
        this.mfTimestampNS = j;
    }

    public void initBufferFrame(byte[] bArr, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        this.mCameraFrameBase = new C2185901Agm(this.mWidth, this.mHeight, this.mfTimestampNS, bArr, i, eTEPixelFormat, i2);
    }

    public void initYUVBytesPlans(byte[] bArr, final int i, final ETEPixelFormat eTEPixelFormat, final int i2) {
        final int i3 = this.mWidth;
        final int i4 = this.mHeight;
        final long j = this.mfTimestampNS;
        this.mCameraFrameBase = new C2185931Agp(i3, i4, j, i, eTEPixelFormat, i2) { // from class: X.1Agr
            {
                this.LIZJ = 3;
                this.LIZLLL = i;
                this.LIZIZ = eTEPixelFormat;
            }
        };
    }

    public void initYUVPlans(C2185681AgQ c2185681AgQ, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        this.mCameraFrameBase = new C2185921Ago(this.mWidth, this.mHeight, this.mfTimestampNS, c2185681AgQ, i, eTEPixelFormat, i2);
    }

    public TECameraFrame(byte[] bArr, ETEPixelFormat eTEPixelFormat, int i, int i2, int i3) {
        this(i, i2, 0L);
        initBufferFrame(bArr, i3, eTEPixelFormat, 0);
    }

    public void initRawPlans(C2185681AgQ c2185681AgQ, final int i, final ETEPixelFormat eTEPixelFormat, final int i2, DngCreator dngCreator) {
        final int i3 = this.mWidth;
        final int i4 = this.mHeight;
        final long j = this.mfTimestampNS;
        this.mCameraFrameBase = new C2185931Agp(i3, i4, j, i, eTEPixelFormat, i2) { // from class: X.1Agq
            {
                this.LIZJ = 4;
                this.LIZLLL = i;
                this.LIZIZ = eTEPixelFormat;
            }
        };
    }

    public void initTextureFrame(int i, int i2, float[] fArr, ETEPixelFormat eTEPixelFormat, int i3) {
        this.mCameraFrameBase = new C2185911Agn(this.mWidth, this.mHeight, this.mfTimestampNS, i, i2, fArr, eTEPixelFormat, i3);
    }

    public TECameraFrame(C2185681AgQ c2185681AgQ, ETEPixelFormat eTEPixelFormat, int i, int i2, int i3, DngCreator dngCreator) {
        this(i, i2, 0L);
        initRawPlans(c2185681AgQ, i3, eTEPixelFormat, 0, dngCreator);
    }

    public TECameraFrame(C2185681AgQ c2185681AgQ, ETEPixelFormat eTEPixelFormat, int i, int i2, int i3, int i4) {
        this(i, i2, 0L);
        initYUVPlans(c2185681AgQ, i3, eTEPixelFormat, i4);
    }
}
