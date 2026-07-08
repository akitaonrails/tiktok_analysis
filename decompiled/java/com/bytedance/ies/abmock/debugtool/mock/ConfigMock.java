package com.bytedance.ies.abmock.debugtool.mock;

import X.C0C5H;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class ConfigMock implements C0C5H {
    public static final ConfigMock INSTANCE = new ConfigMock();

    public void delete(String str) {
    }

    public void deleteAll() {
    }

    @Override // X.C0C5H
    public boolean enable() {
        return false;
    }

    @Override // X.C0C5H
    public Object get(String str) {
        return null;
    }

    public <T> T get(String str, T t) {
        return null;
    }

    public boolean hasMock(String str) {
        return false;
    }

    @Override // X.C0C5H
    public void init(Context context) {
    }

    public void put(String str, Object obj) {
    }
}
