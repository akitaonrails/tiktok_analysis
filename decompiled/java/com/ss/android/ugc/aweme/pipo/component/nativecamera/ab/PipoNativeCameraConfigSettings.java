package com.ss.android.ugc.aweme.pipo.component.nativecamera.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class PipoNativeCameraConfigSettings {
    public static final PipoNativeCameraConfigModel LIZ = new PipoNativeCameraConfigModel(Boolean.TRUE);

    public static final class PipoNativeCameraConfigModel {

        @C09CT("is_use_native_camera")
        public final Boolean isUseNativeCamera;

        public PipoNativeCameraConfigModel() {
            this(Boolean.TRUE);
        }

        public PipoNativeCameraConfigModel(Boolean bool) {
            this.isUseNativeCamera = bool;
        }
    }
}
