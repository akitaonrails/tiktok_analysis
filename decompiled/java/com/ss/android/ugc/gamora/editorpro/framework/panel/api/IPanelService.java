package com.ss.android.ugc.gamora.editorpro.framework.panel.api;

import X.C0E48;
import X.C19A3;
import com.bytedance.news.common.service.manager.IService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public interface IPanelService extends IService {
    void init();

    <I, O> void open(C19A3 c19a3, C0E48 c0e48, Class<Object> cls, I i, Function1<? super O, Unit> function1);
}
