package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum CameraId {
    CAMERA_ID_FRONT(0),
    CAMERA_ID_BACK(1),
    CAMERA_ID_EXTERNAL(2),
    CAMERA_ID_INVALID(3);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.CameraId$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$CameraId;

        static {
            int[] iArr = new int[CameraId.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$CameraId = iArr;
            try {
                iArr[CameraId.CAMERA_ID_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$CameraId[CameraId.CAMERA_ID_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$CameraId[ordinal()];
        return i != 1 ? i != 2 ? "" : "kCameraIDBack" : "kCameraIDFront";
    }

    public int value() {
        return this.value;
    }

    public static CameraId fromId(int i) {
        for (CameraId cameraId : values()) {
            if (cameraId.value() == i) {
                return cameraId;
            }
        }
        return null;
    }

    public static CameraId valueOf(String str) {
        return (CameraId) C08FF.LIZ(CameraId.class, str);
    }

    CameraId(int i) {
        this.value = i;
    }
}
