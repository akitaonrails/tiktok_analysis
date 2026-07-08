package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public interface INLEEffectRuntime {
    int doAction(Boolean bool, String str, int i, MapStrStr mapStrStr, INLEListenerDoAction iNLEListenerDoAction);

    int removeEffectMessageCenterCallback();

    int setEffectMessageCenterCallback(INLEListenerEffectMsg iNLEListenerEffectMsg);
}
