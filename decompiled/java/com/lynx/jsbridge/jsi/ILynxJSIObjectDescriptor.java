package com.lynx.jsbridge.jsi;

/* JADX INFO: loaded from: classes4.dex */
public interface ILynxJSIObjectDescriptor {
    String getClassName();

    String[] getFields();

    String[] getLynxObjectDescriptorInfo(String str);

    void warmUp();
}
