package com.bytedance.router.plugin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface SupportPluginCallback {
    List<Plugin> initPlugins();

    void loadPlugin(Plugin plugin, String str);
}
