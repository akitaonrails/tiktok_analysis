package com.ss.android.ttve.model;

import X.C0VSV;
import X.C1284350jWj;
import X.C2185631AgL;
import X.C2185671AgP;
import X.C2185711AgT;
import X.C2188811AlT;
import X.C2189641Amo;
import X.C2484209oO;
import X.C786410Ut5;
import X.EnumC2185621AgK;
import X.EnumC994290byt;
import X.InterfaceC2185701AgS;
import android.graphics.Bitmap;
import android.media.Image;
import android.opengl.EGLContext;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes34.dex */
public class VEFrame implements Parcelable {
    public static final Parcelable.Creator<VEFrame> CREATOR = new C2189641Amo(16);
    public EnumC2185621AgK format;
    public boolean fromFrontCamera;
    public int height;
    public FrameBase mInternalFrame;
    public HashMap<String, String> mMetaDataMap;
    public int rotation;
    public long timeStamp;
    public int width;

    public static class BitmapFrame extends FrameBase {
        public Bitmap bitmap;

        @Override // com.ss.android.ttve.model.VEFrame.FrameBase
        public final void recycle() {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                C786410Ut5.LJJJJ(bitmap);
            }
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(super.toString());
            sbLIZ.append(", Bitmap:");
            sbLIZ.append(this.bitmap);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public BitmapFrame(Bitmap bitmap) {
            this.bitmap = bitmap;
        }
    }

    public static class ByteBufferFrame extends FrameBase {
        public InterfaceC2185701AgS allocator;
        public ByteBuffer byteBuffer;

        @Override // com.ss.android.ttve.model.VEFrame.FrameBase
        public void recycle() {
            InterfaceC2185701AgS interfaceC2185701AgS = this.allocator;
            if (interfaceC2185701AgS != null) {
                ByteBuffer byteBuffer = this.byteBuffer;
                C2185711AgT c2185711AgT = (C2185711AgT) interfaceC2185701AgS;
                synchronized (c2185711AgT) {
                    if (byteBuffer != null) {
                        try {
                            if (!((LinkedList) c2185711AgT.LIZ).contains(byteBuffer)) {
                                ((LinkedList) c2185711AgT.LIZ).add(byteBuffer);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        }

        public ByteBuffer getByteBuffer() {
            return this.byteBuffer;
        }

        public ByteBufferFrame(ByteBuffer byteBuffer) {
            this.byteBuffer = byteBuffer;
        }

        public ByteBufferFrame(ByteBuffer byteBuffer, InterfaceC2185701AgS interfaceC2185701AgS) {
            this(byteBuffer);
            this.allocator = interfaceC2185701AgS;
        }
    }

    public static class CacheableByteBufferFrame extends ByteBufferFrame {
        public InterfaceC2185701AgS allocator;

        @Override // com.ss.android.ttve.model.VEFrame.ByteBufferFrame, com.ss.android.ttve.model.VEFrame.FrameBase
        public final void recycle() {
            InterfaceC2185701AgS interfaceC2185701AgS = this.allocator;
            if (interfaceC2185701AgS != null) {
                ByteBuffer byteBuffer = this.byteBuffer;
                C2185711AgT c2185711AgT = (C2185711AgT) interfaceC2185701AgS;
                synchronized (c2185711AgT) {
                    if (byteBuffer != null) {
                        try {
                            if (!((LinkedList) c2185711AgT.LIZ).contains(byteBuffer)) {
                                ((LinkedList) c2185711AgT.LIZ).add(byteBuffer);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public static class YUVPlansFrame extends FrameBase {
        public C1284350jWj planes;

        public Image.Plane[] getPlanes() {
            return this.planes.LIZ;
        }

        public YUVPlansFrame(C1284350jWj c1284350jWj) {
            this.planes = c1284350jWj;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static class TextureDescFrame extends FrameBase {
        public String texDesc;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(super.toString());
            sbLIZ.append(", texDesc:");
            sbLIZ.append(this.texDesc);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public TextureDescFrame(String str) {
            this.texDesc = str;
        }
    }

    public int getFormatOrdinal() {
        return this.format.ordinal();
    }

    public byte[] getJpegData() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            C2484209oO.LIZJ("VEFrame", "get jpeg data failed, no internal frame!");
            return null;
        }
        if (this.format == EnumC2185621AgK.TEPIXEL_FORMAT_JPEG) {
            if (frameBase instanceof ByteArrayFrame) {
                return ((ByteArrayFrame) frameBase).getByteArray();
            }
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get jpeg data failed, internal frame format: ");
        sbLIZ.append(this.format);
        C2484209oO.LIZJ("VEFrame", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public VERenderContext getRenderContext() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            C2484209oO.LIZJ("VEFrame", "get render context failed, no internal frame!");
            return null;
        }
        if (!(frameBase instanceof TextureFrame)) {
            return null;
        }
        C2185671AgP c2185671AgP = new C2185671AgP();
        EnumC994290byt enumC994290byt = EnumC994290byt.VE_RENDER_ENV_OPENGL;
        VERenderContext vERenderContext = c2185671AgP.LIZ;
        vERenderContext.envType = enumC994290byt;
        vERenderContext.eglContext = ((TextureFrame) frameBase).context;
        return vERenderContext;
    }

    public int getTextureID() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            C2484209oO.LIZJ("VEFrame", "get texture id failed, no internal frame!");
            return -1;
        }
        if (frameBase instanceof TextureFrame) {
            return ((TextureFrame) frameBase).texID;
        }
        return -1;
    }

    public float[] getTextureTransformMatrix() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            C2484209oO.LIZJ("VEFrame", "get texture transform matrix failed, no internal frame!");
            return null;
        }
        if (!(frameBase instanceof TextureFrame)) {
            return null;
        }
        float[] fArr = ((TextureFrame) frameBase).transformMatrix;
        if (fArr == null) {
            C2484209oO.LJIIIIZZ("VEFrame", "transform matrix data is null!");
        }
        return fArr;
    }

    public Image.Plane[] getYUVPlanes() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            C2484209oO.LIZJ("VEFrame", "get yuv data failed, no internal frame!");
            return null;
        }
        if (frameBase instanceof YUVPlansFrame) {
            return ((YUVPlansFrame) frameBase).getPlanes();
        }
        return null;
    }

    public void recycle() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase != null) {
            frameBase.recycle();
        }
    }

    public Bitmap toBitmap() {
        int i;
        int i2;
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null || (i = this.width) <= 0 || (i2 = this.height) <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("toBitmap failed. Invalid width or height: ");
            sbLIZ.append(this.width);
            sbLIZ.append(" ");
            sbLIZ.append(this.height);
            C2484209oO.LIZJ("VEFrame", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (frameBase instanceof ByteBufferFrame) {
            if (this.format == EnumC2185621AgK.TEPixFmt_RGBA8 && this.rotation == 0) {
                ByteBuffer byteBuffer = ((ByteBufferFrame) frameBase).byteBuffer;
                byteBuffer.rewind();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
                return bitmapCreateBitmap;
            }
        } else if (frameBase instanceof IntArrayFrame) {
            if (this.format == EnumC2185621AgK.TEPixFmt_RGBA8 && this.rotation == 0) {
                return Bitmap.createBitmap(((IntArrayFrame) frameBase).intArray, i, i2, Bitmap.Config.ARGB_8888);
            }
        } else if (frameBase instanceof ByteArrayFrame) {
            if (this.format == EnumC2185621AgK.TEPixFmt_RGBA8 && this.rotation == 0) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap2.copyPixelsFromBuffer(ByteBuffer.wrap(((ByteArrayFrame) this.mInternalFrame).byteArray));
                return bitmapCreateBitmap2;
            }
        } else {
            if (frameBase instanceof TextureDescFrame) {
                return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            if (frameBase instanceof BitmapFrame) {
                return ((BitmapFrame) frameBase).bitmap;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("toBitmap failed. Invalid mInternalFrame: ");
        sbLIZ2.append(this.mInternalFrame.getClass().getName());
        C2484209oO.LIZJ("VEFrame", C2188811AlT.LIZIZ(sbLIZ2));
        throw new UnsupportedOperationException("Conversion to bitmap is not supported!!!");
    }

    public static class ByteArrayFrame extends FrameBase {
        public byte[] byteArray;

        public byte[] getByteArray() {
            return this.byteArray;
        }

        public ByteArrayFrame(byte[] bArr) {
            this.byteArray = bArr;
        }
    }

    public static class FrameBase implements Parcelable {
        public static final Parcelable.Creator<FrameBase> CREATOR = new C2189641Amo(15);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void recycle() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public FrameBase() {
        }

        public FrameBase(Parcel parcel) {
        }
    }

    public static class IntArrayFrame extends FrameBase {
        public int[] intArray;

        public int[] getIntArray() {
            return this.intArray;
        }

        public IntArrayFrame(int[] iArr) {
            this.intArray = iArr;
        }
    }

    public EnumC2185621AgK getFormat() {
        return this.format;
    }

    public FrameBase getFrame() {
        return this.mInternalFrame;
    }

    public int getHeight() {
        return this.height;
    }

    public HashMap<String, String> getMetaData() {
        return this.mMetaDataMap;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isFromFrontCamera() {
        return this.fromFrontCamera;
    }

    public VEFrame(Parcel parcel) {
        EnumC2185621AgK enumC2185621AgK;
        boolean z;
        this.format = EnumC2185621AgK.TEPixFmt_Count;
        int i = parcel.readInt();
        if (i == -1) {
            enumC2185621AgK = null;
        } else {
            enumC2185621AgK = EnumC2185621AgK.values()[i];
        }
        this.format = enumC2185621AgK;
        this.mInternalFrame = (FrameBase) parcel.readParcelable(FrameBase.class.getClassLoader());
        this.rotation = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.timeStamp = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.fromFrontCamera = z;
    }

    public static ByteBuffer allocateFrame(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public void dumpImageToPath(String str) throws Throwable {
        C0VSV c0vsv;
        C0VSV c0vsv2;
        if (this.mInternalFrame == null) {
            C2484209oO.LIZJ("VEFrame", "dump image failed! internal frame is null!");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_");
        sbLIZ.append(this.width);
        sbLIZ.append("x");
        sbLIZ.append(this.height);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_");
        sbLIZ2.append(System.currentTimeMillis());
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("_VEFrame");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(strLIZIZ2);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        int i = C2185631AgL.LIZ[this.format.ordinal()];
        C0VSV c0vsv3 = null;
        if (i != 1) {
            if (i != 2) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("unexpected dump image format: ");
                sbLIZ4.append(this.format);
                C2484209oO.LIZJ("VEFrame", C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ3);
            sbLIZ5.append("_JPEG.jpeg");
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Start to dump VEFrame to ");
            sbLIZ6.append(strLIZIZ4);
            C2484209oO.LJI("VEFrame", C2188811AlT.LIZIZ(sbLIZ6));
            byte[] jpegData = getJpegData();
            try {
                try {
                    if (jpegData == null) {
                        C2484209oO.LIZJ("VEImageUtils", "Input null data, failed to save jpeg!");
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
                        C2484209oO.LIZJ("VEImageUtils", "save jpeg failed！");
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
                                C2484209oO.LIZJ("VEImageUtils", "close FileOutputStream failed!");
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    C2484209oO.LIZJ("VEImageUtils", "close FileOutputStream failed!");
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(strLIZIZ3);
            sbLIZ7.append("_YUV420.yuv");
            String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ7);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("Start to dump VEFrame to ");
            sbLIZ8.append(strLIZIZ5);
            C2484209oO.LJI("VEFrame", C2188811AlT.LIZIZ(sbLIZ8));
            Image.Plane[] yUVPlanes = getYUVPlanes();
            int i2 = this.width;
            int i3 = this.height;
            if (yUVPlanes == null) {
                C2484209oO.LIZJ("VEImageUtils", "Input null plane, failed to save yuv!");
                return;
            }
            if (yUVPlanes[0] != null) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                byteBufferAllocate.putInt(i2);
                byteBufferAllocate.putInt(i3);
                byteBufferAllocate.putInt(yUVPlanes[0].getPixelStride());
                byteBufferAllocate.putInt(yUVPlanes[0].getRowStride());
                try {
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    try {
                        c0vsv = new C0VSV(strLIZIZ5);
                    } catch (IOException e5) {
                        e = e5;
                    }
                    try {
                        c0vsv.write(byteBufferAllocate.array());
                        for (Image.Plane plane : yUVPlanes) {
                            ByteBuffer buffer = plane.getBuffer();
                            byte[] bArr = new byte[buffer.remaining()];
                            buffer.get(bArr);
                            c0vsv.write(bArr);
                            buffer.rewind();
                        }
                        c0vsv.close();
                        return;
                    } catch (IOException e6) {
                        e = e6;
                        c0vsv3 = c0vsv;
                        TryCatchGuardChecker.doCheck(e);
                        C2484209oO.LIZJ("VEImageUtils", "save yuv failed!");
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
                            } catch (IOException e7) {
                                TryCatchGuardChecker.doCheck(e7);
                                C2484209oO.LIZJ("VEImageUtils", "close FileOutputStream failed!");
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (IOException e8) {
                    TryCatchGuardChecker.doCheck(e8);
                    C2484209oO.LIZJ("VEImageUtils", "close FileOutputStream failed!");
                    return;
                }
            }
            C2484209oO.LIZJ("VEImageUtils", "save yuv failed, plane is null");
        }
    }

    public void setFromFrontCamera(boolean z) {
        this.fromFrontCamera = z;
    }

    public void setMetaData(HashMap<String, String> map) {
        this.mMetaDataMap = map;
    }

    public static class TextureFrame extends FrameBase {
        public EGLContext context;
        public int texID;
        public float[] transformMatrix;

        public TextureFrame(EGLContext eGLContext, int i) {
            this.context = eGLContext;
            this.texID = i;
        }

        public TextureFrame(EGLContext eGLContext, int i, float[] fArr) {
            this.context = eGLContext;
            this.texID = i;
            this.transformMatrix = fArr;
        }
    }

    public static VEFrame createBitmapFrame(Bitmap bitmap, long j) {
        if (bitmap != null && !bitmap.isRecycled()) {
            VEFrame vEFrame = new VEFrame(bitmap.getWidth(), bitmap.getHeight(), 0, j, EnumC2185621AgK.TEPixFmt_RGBA8);
            vEFrame.mInternalFrame = new BitmapFrame(bitmap);
            return vEFrame;
        }
        return null;
    }

    public static VEFrame createByteBufferFrame(Bitmap bitmap, long j) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(bitmap.getByteCount()).order(ByteOrder.LITTLE_ENDIAN);
            bitmap.copyPixelsToBuffer(byteBufferOrder);
            VEFrame vEFrame = new VEFrame(bitmap.getWidth(), bitmap.getHeight(), 0, j, EnumC2185621AgK.TEPixFmt_RGBA8);
            vEFrame.mInternalFrame = new ByteBufferFrame(byteBufferOrder);
            return vEFrame;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iOrdinal;
        EnumC2185621AgK enumC2185621AgK = this.format;
        if (enumC2185621AgK == null) {
            iOrdinal = -1;
        } else {
            iOrdinal = enumC2185621AgK.ordinal();
        }
        parcel.writeInt(iOrdinal);
        parcel.writeParcelable(this.mInternalFrame, i);
        parcel.writeInt(this.rotation);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.timeStamp);
        parcel.writeByte(this.fromFrontCamera ? (byte) 1 : (byte) 0);
    }

    public VEFrame(int i, int i2, int i3, long j, EnumC2185621AgK enumC2185621AgK) {
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.timeStamp = j;
        this.format = enumC2185621AgK;
    }

    public static VEFrame createByteArrayFrame(byte[] bArr, int i, int i2, int i3, long j, EnumC2185621AgK enumC2185621AgK) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, enumC2185621AgK);
        vEFrame.mInternalFrame = new ByteArrayFrame(bArr);
        return vEFrame;
    }

    public static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, int i4) {
        if (i4 >= 0 && i4 < EnumC2185621AgK.values().length) {
            return createByteBufferFrame(byteBuffer, i, i2, i3, j, EnumC2185621AgK.values()[i4]);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createByteBufferFrame failed. Invalid order: ");
        sbLIZ.append(i4);
        C2484209oO.LIZJ("VEFrame", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public static VEFrame createIntArrayFrame(int[] iArr, int i, int i2, int i3, long j, EnumC2185621AgK enumC2185621AgK) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, enumC2185621AgK);
        vEFrame.mInternalFrame = new IntArrayFrame(iArr);
        return vEFrame;
    }

    public static VEFrame createTextureFrame(String str, int i, int i2, int i3, long j, EnumC2185621AgK enumC2185621AgK) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, enumC2185621AgK);
        vEFrame.mInternalFrame = new TextureDescFrame(str);
        return vEFrame;
    }

    public static VEFrame createYUVPlanFrame(C1284350jWj c1284350jWj, int i, int i2, int i3, long j, EnumC2185621AgK enumC2185621AgK) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, enumC2185621AgK);
        vEFrame.mInternalFrame = new YUVPlansFrame(c1284350jWj);
        return vEFrame;
    }

    public static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, EnumC2185621AgK enumC2185621AgK) {
        return createByteBufferFrame(byteBuffer, i, i2, i3, j, enumC2185621AgK, null);
    }

    public static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, EnumC2185621AgK enumC2185621AgK, InterfaceC2185701AgS interfaceC2185701AgS) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, enumC2185621AgK);
        vEFrame.mInternalFrame = new ByteBufferFrame(byteBuffer, interfaceC2185701AgS);
        return vEFrame;
    }

    public static VEFrame createTextureFrame(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, EnumC2185621AgK enumC2185621AgK) {
        VEFrame vEFrame = new VEFrame(i2, i3, i4, j, enumC2185621AgK);
        vEFrame.mInternalFrame = new TextureFrame(eGLContext, i);
        return vEFrame;
    }

    public static VEFrame createTextureFrame(EGLContext eGLContext, int i, float[] fArr, int i2, int i3, int i4, long j, EnumC2185621AgK enumC2185621AgK) {
        VEFrame vEFrame = new VEFrame(i2, i3, i4, j, enumC2185621AgK);
        vEFrame.mInternalFrame = new TextureFrame(eGLContext, i, fArr);
        return vEFrame;
    }
}
