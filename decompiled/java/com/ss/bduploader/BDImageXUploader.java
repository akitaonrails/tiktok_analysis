package com.ss.bduploader;

import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.TreeMap;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class BDImageXUploader extends BDImageXUploaderBase {
    public void setPreUpload(boolean z) {
    }

    public void startPreHeat() {
        setPreheatUploader(2);
        start();
    }

    public void allowContinueUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._allowContinueUpload(j);
    }

    public void allowMergeUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._mergeUpload(j);
    }

    public void cancelUpload() {
        this.mWriteLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mWriteLock.unlock();
        } else {
            BDImageXUploaderBase._cancelUpload(j);
            this.mWriteLock.unlock();
        }
    }

    public void SetExtraParams(JSONObject jSONObject) {
        if (this.mHandle != 0 && jSONObject != null) {
            setStringValue(61, C786410Ut5.J3(jSONObject));
        }
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        JSONObject jSONObjectMapToJSON;
        if (this.mHandle == 0 || treeMap == null || (jSONObjectMapToJSON = BDUploadUtil.mapToJSON(treeMap)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("custom_config", jSONObjectMapToJSON);
            String strJ3 = C786410Ut5.J3(jSONObject);
            if (!TextUtils.isEmpty(strJ3)) {
                setStringValue(63, strJ3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setDataTransportProtocol(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            BDImageXUploaderBase._setIntValue(j, 411, i);
        }
    }

    public void setEnableCommitUpload(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 401, i);
    }

    public void setEnableEnd2EndEncryption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        this.mEnd2EndEncryptionOption = i;
        BDImageXUploaderBase._setIntValue(j, 439, i);
    }

    public void setEnableSkipMeta(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 435, z ? 1 : 0);
    }

    public void setEnd2EndEncryptionAESKey(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        this.mEnd2EndEncryptionAESKey = str;
        BDImageXUploaderBase._setStringValue(j, 441, str);
    }

    public void setEnd2EndEncryptionPublicKey(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setStringValue(j, 440, str);
    }

    public void setObjectType(String str) {
        setStringValue(54, str);
    }

    public void setPreUploadEncryptionMode(int i) {
        String string;
        if (this.mHandle == 0) {
            return;
        }
        if (i == 2 && (string = UUID.randomUUID().toString()) != null && string.length() > 0) {
            BDImageXUploaderBase._setStringValue(this.mHandle, 420, string);
        }
        BDImageXUploaderBase._setIntValue(this.mHandle, 74, i);
    }

    public void setPreheatUploader(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 419, i);
    }

    public void setEnableCommitUpload(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 401, z ? 1 : 0);
    }

    public void setPreheatUploader(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 419, z ? 1 : 0);
    }

    public void setNetworkType(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, i, i2);
    }

    public void setCustomNetworkTimeoutParams(int i, int i2, int i3, int i4, int i5) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        BDImageXUploaderBase._setIntValue(j, 422, i);
        BDImageXUploaderBase._setIntValue(this.mHandle, 423, i2);
        BDImageXUploaderBase._setIntValue(this.mHandle, 424, i3);
        BDImageXUploaderBase._setIntValue(this.mHandle, 425, i4);
        BDImageXUploaderBase._setIntValue(this.mHandle, 427, i5);
    }
}
