package com.bytedance.android.livesdk.config;

import X.C09CT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class LiveStreamTestConfig {

    @C09CT("enable")
    public boolean mEnable;

    @C09CT("with")
    public int mWidth = -1;

    @C09CT("height")
    public int mHeight = -1;

    @C09CT("defaultbBitRate")
    public int mDefaultBitrate = -1;

    @C09CT("minBitRate")
    public int mMinBitrate = -1;

    @C09CT("maxBitRate")
    public int mMaxBitrate = -1;

    @C09CT("fps")
    public int mFps = -1;

    @C09CT("vCode")
    public String mVCodec = "";

    @C09CT("useHardware")
    public boolean mUseHardware = true;

    @C09CT("mixMaxBitRate")
    public int mMixMaxBitrate = -1;

    @C09CT("mixDefaultBitRate")
    public int mMixDefaultBitrate = -1;

    @C09CT("minMinBitRate")
    public int mMixMinBitrate = -1;

    public Map<String, String> getStringMap() {
        HashMap map = new HashMap();
        if (!this.mEnable) {
            return map;
        }
        try {
            int i = this.mWidth;
            if (i > 0) {
                map.put("width", String.valueOf(i));
            }
            int i2 = this.mHeight;
            if (i2 > 0) {
                map.put("height", String.valueOf(i2));
            }
            int i3 = this.mDefaultBitrate;
            if (i3 > 0) {
                map.put("defaultBitrate", String.valueOf(i3));
            }
            int i4 = this.mMinBitrate;
            if (i4 > 0) {
                map.put("minBitrate", String.valueOf(i4));
            }
            int i5 = this.mMaxBitrate;
            if (i5 > 0) {
                map.put("maxBitrate", String.valueOf(i5));
            }
            int i6 = this.mFps;
            if (i6 > 0) {
                map.put("fps", String.valueOf(i6));
            }
            if (!TextUtils.isEmpty(this.mVCodec)) {
                map.put("vCodec", this.mVCodec);
            }
            map.put("useHardware", String.valueOf(this.mUseHardware));
            int i7 = this.mMixMaxBitrate;
            if (i7 > 0) {
                map.put("mixMaxBitrate", String.valueOf(i7));
            }
            int i8 = this.mMixDefaultBitrate;
            if (i8 > 0) {
                map.put("mixDefaultBitrate", String.valueOf(i8));
            }
            int i9 = this.mMixMinBitrate;
            if (i9 > 0) {
                map.put("mixMinBitrate", String.valueOf(i9));
                return map;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return map;
    }
}
