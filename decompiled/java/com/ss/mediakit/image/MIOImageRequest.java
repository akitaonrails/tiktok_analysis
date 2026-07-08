package com.ss.mediakit.image;

import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.mediakit.image.MIOImageResponse;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.Locale;

/* JADX INFO: loaded from: classes35.dex */
public class MIOImageRequest implements IMIOImageRequest {
    public MIOImageCallback callback;
    public final String id;
    public final MIOImageClient imageClient;
    public final MIOImageTaskConfig taskConfig;

    public String getQueryString() {
        StringBuilder sb = new StringBuilder("mdl://image/?");
        if (!TextUtils.isEmpty(this.taskConfig.traceId())) {
            sb.append("&tid=");
            sb.append(this.taskConfig.traceId());
        }
        sb.append("&img_task_id=");
        sb.append(this.id);
        sb.append("&ft=6");
        if (this.taskConfig.urls() == null || this.taskConfig.urls().isEmpty()) {
            AVMDLLog.d("MIO_IMG", "generate query string failed, invalid url");
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < this.taskConfig.urls().size(); i++) {
            String strEncodeUrl = MIOImageUtils.encodeUrl((String) ListProtector.get(this.taskConfig.urls(), i));
            if (!TextUtils.isEmpty(strEncodeUrl)) {
                sb2.append("&iu=");
                sb2.append(strEncodeUrl);
            }
        }
        sb.append((CharSequence) sb2);
        if (!TextUtils.isEmpty(this.taskConfig.fileKey())) {
            sb.append("&k=");
            sb.append(this.taskConfig.fileKey());
        } else {
            if (this.taskConfig.mainUrl().isEmpty()) {
                AVMDLLog.d("MIO_IMG", "generate query string failed, invalid file key");
                return null;
            }
            String strMainUrl = this.taskConfig.mainUrl();
            sb.append("&k=");
            sb.append(MIOImageUtils.md5(strMainUrl));
        }
        if (!TextUtils.isEmpty(this.taskConfig.partition())) {
            sb.append("&img_part=");
            sb.append(this.taskConfig.partition());
        }
        sb.append("&img_prior=");
        sb.append(this.taskConfig.priority());
        if (this.taskConfig.headers() != null && !this.taskConfig.headers().isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            for (String str : this.taskConfig.headers().keySet()) {
                sb3.append(str);
                sb3.append(": ");
                sb3.append(this.taskConfig.headers().get(str));
                sb3.append("\r\n");
            }
            String strEncodeUrl2 = MIOImageUtils.encodeUrl(sb3.toString());
            if (!TextUtils.isEmpty(strEncodeUrl2)) {
                sb.append("&h=");
                sb.append(strEncodeUrl2);
            }
        }
        if (this.taskConfig.options() != null && !this.taskConfig.options().isEmpty()) {
            StringBuilder sb4 = new StringBuilder();
            for (String str2 : this.taskConfig.options().keySet()) {
                sb4.append(str2);
                sb4.append(": ");
                sb4.append(this.taskConfig.options().get(str2));
                sb4.append("\r\n");
            }
            String strEncodeUrl3 = MIOImageUtils.encodeUrl(sb4.toString());
            if (!TextUtils.isEmpty(strEncodeUrl3)) {
                sb.append("&img_opts=");
                sb.append(strEncodeUrl3);
            }
        }
        sb.append("&img_s_off=");
        sb.append(this.taskConfig.startOffset());
        sb.append("&img_e_off=");
        sb.append(this.taskConfig.endOffset());
        return sb.toString();
    }

    @Override // com.ss.mediakit.image.IMIOImageRequest
    public void stop() {
        int iCancelImageRequest = this.imageClient.cancelImageRequest(this.id);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request stopped. task: ");
        sbLIZ.append(this.id);
        sbLIZ.append(", ret: ");
        sbLIZ.append(iCancelImageRequest);
        AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
    }

    public String getId() {
        return this.id;
    }

    public MIOImageRequest(MIOImageTaskConfig mIOImageTaskConfig) {
        this.taskConfig = mIOImageTaskConfig;
        MIOImageClient mIOImageClient = MIOImageClient.getInstance();
        this.imageClient = mIOImageClient;
        String strK4 = C786410Ut5.k4(Locale.US, "img-%d-%d", new Object[]{Integer.valueOf(mIOImageClient.nextGlobalTaskId()), Integer.valueOf(mIOImageTaskConfig.priority())});
        this.id = strK4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request created. task: ");
        sbLIZ.append(strK4);
        AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void onComplete(MIOImageResponse mIOImageResponse) {
        if (mIOImageResponse == null) {
            return;
        }
        MIOImageCallback mIOImageCallback = this.callback;
        if (mIOImageCallback != null) {
            mIOImageCallback.onComplete(this, mIOImageResponse);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request complete. task: ");
        sbLIZ.append(this.id);
        sbLIZ.append(", code: ");
        sbLIZ.append(mIOImageResponse.code());
        AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void onFailure(MIOImageError mIOImageError) {
        if (mIOImageError == null) {
            return;
        }
        MIOImageCallback mIOImageCallback = this.callback;
        if (mIOImageCallback != null) {
            MIOImageResponse.Builder builderNewBuilder = MIOImageResponse.newBuilder();
            builderNewBuilder.setCode(mIOImageError.code());
            builderNewBuilder.setDesc(mIOImageError.desc());
            mIOImageCallback.onResponse(this, builderNewBuilder.build());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("response failure. task: ");
        sbLIZ.append(this.id);
        sbLIZ.append(", error: ");
        sbLIZ.append(mIOImageError.code());
        AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void onResponse(MIOImageResponse mIOImageResponse) {
        if (mIOImageResponse == null) {
            return;
        }
        MIOImageCallback mIOImageCallback = this.callback;
        if (mIOImageCallback != null) {
            mIOImageCallback.onResponse(this, mIOImageResponse);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("response success. task: ");
        sbLIZ.append(this.id);
        AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.mediakit.image.IMIOImageRequest
    public void start(MIOImageCallback mIOImageCallback) {
        this.callback = mIOImageCallback;
        int iAddImageRequest = this.imageClient.addImageRequest(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request start. task: ");
        sbLIZ.append(this.id);
        sbLIZ.append(", ret: ");
        sbLIZ.append(iAddImageRequest);
        AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
    }
}
