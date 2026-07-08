package com.heytap.msp.push.callback;

import com.heytap.mcs.liquid.model.ActionResult;

/* JADX INFO: loaded from: classes14.dex */
public interface ILiquidDownloadCallback {
    void onClick(String str, int i);

    void onDismiss(String str);

    void onFailed(String str, int i, int i2);

    ActionResult onPauseClick(String str);

    ActionResult onResumeClick(String str);

    void onShow(String str, int i);
}
