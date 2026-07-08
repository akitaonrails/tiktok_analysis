package com.ss.android.ugc.aweme.services.publisherror;

import X.C1434650nR9;
import X.C1697810uHb;
import X.C1954807lC;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.publisherror.PublishErrorHandleInterceptorResult;
import com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class StudioPublishErrorHandleDelegate {
    public static final StudioPublishErrorHandleDelegate INSTANCE = new StudioPublishErrorHandleDelegate();
    public static final List<PublishErrorHandleInterceptor> interceptors = C1697810uHb.LJIIJJI(ErrorMessageHandleInterceptor.INSTANCE, ABHandleInterceptor.INSTANCE);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PublishErrorHandleBtnType.values().length];
            try {
                iArr[PublishErrorHandleBtnType.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[PublishErrorHandleBtnType.GO_TO_EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[PublishErrorHandleBtnType.GO_TO_PUBLISH.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[PublishErrorHandleBtnType.OPEN_SCHEMA.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr[PublishErrorHandleBtnType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr[PublishErrorHandleBtnType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final ResolvedPublishErrorHandle runInterceptors(PublishErrorHandleContext publishErrorHandleContext) {
        Iterator<PublishErrorHandleInterceptor> it2 = interceptors.iterator();
        while (it2.hasNext()) {
            PublishErrorHandleInterceptorResult publishErrorHandleInterceptorResultIntercept = it2.next().intercept(publishErrorHandleContext);
            if (publishErrorHandleInterceptorResultIntercept instanceof PublishErrorHandleInterceptorResult.Resolved) {
                return ((PublishErrorHandleInterceptorResult.Resolved) publishErrorHandleInterceptorResultIntercept).getHandle();
            }
            if (!(publishErrorHandleInterceptorResultIntercept instanceof PublishErrorHandleInterceptorResult.Pass)) {
                throw new C1954807lC();
            }
        }
        return null;
    }

    public final boolean tryApply(Context context, C1434650nR9 c1434650nR9, IUploadRecoverInfoStore iUploadRecoverInfoStore, int i, String str, String str2) {
        ResolvedPublishErrorHandle resolvedPublishErrorHandleRunInterceptors = runInterceptors(new PublishErrorHandleContext(context, c1434650nR9, iUploadRecoverInfoStore, i, str, str2));
        if (resolvedPublishErrorHandleRunInterceptors == null) {
            return false;
        }
        if (iUploadRecoverInfoStore != null) {
            iUploadRecoverInfoStore.setText(resolvedPublishErrorHandleRunInterceptors.title, resolvedPublishErrorHandleRunInterceptors.btnText);
        }
        switch (WhenMappings.$EnumSwitchMapping$0[resolvedPublishErrorHandleRunInterceptors.btnType.ordinal()]) {
            case 1:
                if (iUploadRecoverInfoStore != null) {
                    iUploadRecoverInfoStore.setSchema(null);
                    iUploadRecoverInfoStore.setJumpTo(0);
                } else {
                    return true;
                }
                break;
            case 2:
                if (iUploadRecoverInfoStore != null) {
                    iUploadRecoverInfoStore.setSchema(null);
                    iUploadRecoverInfoStore.setJumpTo(2);
                } else {
                    return true;
                }
                break;
            case 3:
                if (iUploadRecoverInfoStore != null) {
                    iUploadRecoverInfoStore.setSchema(null);
                    iUploadRecoverInfoStore.setJumpTo(6);
                } else {
                    return true;
                }
                break;
            case 4:
                if (iUploadRecoverInfoStore != null) {
                    iUploadRecoverInfoStore.setSchema(resolvedPublishErrorHandleRunInterceptors.btnAction);
                    iUploadRecoverInfoStore.setJumpTo(0);
                } else {
                    return true;
                }
                break;
            case 5:
                if (iUploadRecoverInfoStore != null) {
                    iUploadRecoverInfoStore.setSchema(null);
                    iUploadRecoverInfoStore.setJumpTo(3);
                } else {
                    return true;
                }
                break;
            case 6:
                if (iUploadRecoverInfoStore != null) {
                    iUploadRecoverInfoStore.setSchema(null);
                } else {
                    return true;
                }
                break;
            default:
                throw new C1954807lC();
        }
        iUploadRecoverInfoStore.isBackUp(false);
        return true;
    }
}
