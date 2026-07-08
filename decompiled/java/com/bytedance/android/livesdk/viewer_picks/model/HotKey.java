package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HotKey {

    @C09CT("key_type")
    public int keyType;

    @C09CT("keyboard_keys")
    public List<KeyBoardHotKey> keyboardKeys = new ArrayList();

    @C09CT("mouse_keys")
    public List<MouseHotKey> mouseKeys = new ArrayList();
}
