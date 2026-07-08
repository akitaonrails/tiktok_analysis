package com.bytedance.geckox.settings;

import android.content.Context;
import com.bytedance.geckox.OptionCheckUpdateParams;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface IGeckoRegister {
    Map<String, OptionCheckUpdateParams.CustomValue> registerCustomParams();

    String registerRootDir(Context context);
}
