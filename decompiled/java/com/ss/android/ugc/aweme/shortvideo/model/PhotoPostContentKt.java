package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;

/* JADX INFO: loaded from: classes23.dex */
public final class PhotoPostContentKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LivePhotoPreviewMode.values().length];
            try {
                iArr[LivePhotoPreviewMode.LIVE_PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[LivePhotoPreviewMode.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toLivePhotoType(LivePhotoPreviewMode livePhotoPreviewMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[livePhotoPreviewMode.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return 0;
    }
}
