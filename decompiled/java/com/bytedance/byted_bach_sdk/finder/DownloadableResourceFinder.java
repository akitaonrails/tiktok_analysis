package com.bytedance.byted_bach_sdk.finder;

import X.C0VSJ;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.AssetManager;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DownloadableResourceFinder extends BachResourceFinder {
    public AssetManager m_assetMgr;
    public Context m_context;
    public HashMap<String, String> m_params;

    private native long nativeCreate(String str, String[] strArr, AssetManager assetManager);

    private native void nativeDestroy(long j);

    private native void nativeDownloadModels(long j, String[] strArr, ModelDownloadListener modelDownloadListener);

    private void init() {
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(this.m_context), "model");
        String[] strArr = new String[this.m_params.size() * 2];
        int i = 0;
        for (String str : this.m_params.keySet()) {
            int i2 = i * 2;
            strArr[i2] = str;
            strArr[i2 + 1] = this.m_params.get(str);
            i++;
        }
        this.m_nativePtr = nativeCreate(c0vsj.getAbsolutePath(), strArr, this.m_assetMgr);
    }

    @Override // com.bytedance.byted_bach_sdk.finder.BachResourceFinder
    public void destroy() {
        if (this.isDestroyed) {
            return;
        }
        this.isDestroyed = true;
        nativeDestroy(this.m_nativePtr);
    }

    public void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    public DownloadableResourceFinder(Context context, HashMap<String, String> map) {
        this.m_assetMgr = context.getAssets();
        this.m_context = context;
        this.m_params = map;
        init();
    }

    public void downloadModels(List<String> list, ModelDownloadListener modelDownloadListener) {
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        nativeDownloadModels(this.m_nativePtr, strArr, modelDownloadListener);
    }
}
