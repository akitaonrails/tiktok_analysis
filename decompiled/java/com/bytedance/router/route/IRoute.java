package com.bytedance.router.route;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes33.dex */
public interface IRoute {
    String getHost();

    Bundle getParams();

    String getPath();

    String getScheme();

    String getUrl();

    void open(Context context);
}
