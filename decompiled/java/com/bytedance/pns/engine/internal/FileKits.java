package com.bytedance.pns.engine.internal;

import com.bytedance.pns.engine.ConfigProvider;
import com.bytedance.pns.engine.ConstPoolConfig;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class FileKits {
    public static final FileKits INSTANCE = new FileKits();

    public static final List<String> loadAssets(ConfigProvider configProvider) {
        ConstPoolConfig constPoolConfig;
        if (configProvider != null && (constPoolConfig = configProvider.getConstPoolConfig()) != null) {
            return constPoolConfig.getExtraConfig();
        }
        return null;
    }
}
