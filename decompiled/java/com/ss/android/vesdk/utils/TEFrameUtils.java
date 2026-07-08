package com.ss.android.vesdk.utils;

import X.C1284350jWj;
import X.C2185611AgJ;
import X.C2185641AgM;
import X.EnumC2185621AgK;
import android.media.Image;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.vesdk.VECameraSettings;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class TEFrameUtils {
    public static int TEFormat2ImageFormat(TECameraFrame.ETEPixelFormat eTEPixelFormat) {
        int i = C2185641AgM.LIZ[eTEPixelFormat.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            if (i != 3) {
                return -1;
            }
            return -2;
        }
        return -3;
    }

    public static ImageFrame TEImageFrame2ImageFrame(TECameraFrame tECameraFrame) {
        ByteBuffer buffer = null;
        if (tECameraFrame == null) {
            return null;
        }
        if (tECameraFrame.getPixelFormat() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420) {
            return new ImageFrame(TEPlanUtils.convert(tECameraFrame.getPlans()), TEFormat2ImageFormat(tECameraFrame.getPixelFormat()), tECameraFrame.getSize().width, tECameraFrame.getSize().height);
        }
        if (tECameraFrame.getPixelFormat() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG) {
            if (tECameraFrame.getBufferData() != null) {
                return new ImageFrame(tECameraFrame.getBufferData(), TEFormat2ImageFormat(tECameraFrame.getPixelFormat()), tECameraFrame.getSize().width, tECameraFrame.getSize().height);
            }
            Image.Plane[] planeArr = tECameraFrame.getPlans().LIZ;
            if (planeArr != null && planeArr.length > 0) {
                buffer = planeArr[0].getBuffer();
            }
            buffer.rewind();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            return new ImageFrame(bArr, TEFormat2ImageFormat(tECameraFrame.getPixelFormat()), tECameraFrame.getSize().width, tECameraFrame.getSize().height);
        }
        if (tECameraFrame.getPixelFormat() != TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21) {
            return null;
        }
        return new ImageFrame(tECameraFrame.getBufferData(), TEFormat2ImageFormat(tECameraFrame.getPixelFormat()), tECameraFrame.getSize().width, tECameraFrame.getSize().height);
    }

    public static VEFrame TEImageFrame2VEFrame(TECameraFrame tECameraFrame) {
        VEFrame vEFrameCreateByteArrayFrame = null;
        buffer = null;
        ByteBuffer buffer = null;
        if (tECameraFrame == null) {
            return null;
        }
        boolean z = false;
        if (tECameraFrame.getPixelFormat() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420) {
            vEFrameCreateByteArrayFrame = VEFrame.createYUVPlanFrame(new C1284350jWj(tECameraFrame.getPlans().LIZ), tECameraFrame.getSize().width, tECameraFrame.getSize().height, tECameraFrame.getRotation(), tECameraFrame.getTimeStampNS(), EnumC2185621AgK.TEPIXEL_FORMAT_YUV420);
        } else if (tECameraFrame.getPixelFormat() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG) {
            if (tECameraFrame.getBufferData() != null) {
                vEFrameCreateByteArrayFrame = VEFrame.createByteArrayFrame(tECameraFrame.getBufferData(), tECameraFrame.getSize().width, tECameraFrame.getSize().height, tECameraFrame.getRotation(), tECameraFrame.getTimeStampNS(), EnumC2185621AgK.TEPIXEL_FORMAT_JPEG);
            } else {
                Image.Plane[] planeArr = tECameraFrame.getPlans().LIZ;
                if (planeArr != null && planeArr.length > 0) {
                    buffer = planeArr[0].getBuffer();
                }
                buffer.rewind();
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                vEFrameCreateByteArrayFrame = VEFrame.createByteArrayFrame(bArr, tECameraFrame.getSize().width, tECameraFrame.getSize().height, tECameraFrame.getRotation(), tECameraFrame.getTimeStampNS(), EnumC2185621AgK.TEPIXEL_FORMAT_JPEG);
            }
        } else {
            if (tECameraFrame.getPixelFormat() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21) {
                vEFrameCreateByteArrayFrame = VEFrame.createByteArrayFrame(tECameraFrame.getBufferData(), tECameraFrame.getSize().width, tECameraFrame.getSize().height, tECameraFrame.getRotation(), tECameraFrame.getTimeStampNS(), EnumC2185621AgK.TEPixFmt_NV21);
            }
            return vEFrameCreateByteArrayFrame;
        }
        if (vEFrameCreateByteArrayFrame != null) {
            if (tECameraFrame.getFacing() == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT.ordinal()) {
                z = true;
            }
            vEFrameCreateByteArrayFrame.setFromFrontCamera(z);
        }
        return vEFrameCreateByteArrayFrame;
    }

    public static ImageFrame VEFrame2ImageFrame(VEFrame vEFrame) {
        if (vEFrame == null) {
            return null;
        }
        if (vEFrame.getFormat() == EnumC2185621AgK.TEPIXEL_FORMAT_YUV420) {
            return new ImageFrame(new C2185611AgJ(((VEFrame.YUVPlansFrame) vEFrame.getFrame()).getPlanes()), -2, vEFrame.getWidth(), vEFrame.getHeight());
        }
        if (vEFrame.getFormat() == EnumC2185621AgK.TEPIXEL_FORMAT_JPEG) {
            if (!(vEFrame.getFrame() instanceof VEFrame.ByteArrayFrame)) {
                return null;
            }
            return new ImageFrame(((VEFrame.ByteArrayFrame) vEFrame.getFrame()).getByteArray(), 1, vEFrame.getWidth(), vEFrame.getHeight());
        }
        if (vEFrame.getFormat() != EnumC2185621AgK.TEPixFmt_NV21 || !(vEFrame.getFrame() instanceof VEFrame.ByteArrayFrame)) {
            return null;
        }
        return new ImageFrame(((VEFrame.ByteArrayFrame) vEFrame.getFrame()).getByteArray(), -3, vEFrame.getWidth(), vEFrame.getHeight());
    }
}
