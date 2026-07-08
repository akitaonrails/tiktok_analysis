package com.bytedance.vmsdk.jsbridge;

import X.C08VQ;
import X.C2188811AlT;
import X.InterfaceC1522160piI;
import X.InterfaceC1531550pxR;
import X.InterfaceC2204631BQf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.ReadableArray;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.WritableArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: classes24.dex */
public class JSModuleWrapper {
    public final JSModule LIZ;
    public final ArrayList<MethodDescriptor> LIZIZ = new ArrayList<>();
    public final ArrayList<AttributeDescriptor> LIZJ = new ArrayList<>();
    public final String LIZLLL;

    public final void LIZ() {
        HashSet hashSet = new HashSet();
        for (Field field : this.LIZ.getClass().getDeclaredFields()) {
            if (field.getAnnotation(InterfaceC1531550pxR.class) != null) {
                String name = field.getName();
                if (hashSet.contains(name)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Java Module ");
                    sbLIZ.append(getName());
                    sbLIZ.append(" attribute name already registered: ");
                    sbLIZ.append(name);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                hashSet.add(name);
                AttributeDescriptor attributeDescriptor = new AttributeDescriptor();
                attributeDescriptor.LIZ = name;
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                attributeDescriptor.LIZIZ = javaOnlyArray;
                try {
                    javaOnlyArray.add(field.get(this.LIZ));
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LIZJ.add(attributeDescriptor);
            }
        }
    }

    public final void LIZIZ() {
        HashSet hashSet = new HashSet();
        for (Method method : this.LIZ.getClass().getDeclaredMethods()) {
            if (method.getAnnotation(InterfaceC1522160piI.class) != null) {
                String name = method.getName();
                if (hashSet.contains(name)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Java Module ");
                    sbLIZ.append(getName());
                    sbLIZ.append(" method name already registered: ");
                    sbLIZ.append(name);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                hashSet.add(name);
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                C08VQ c08vq = new C08VQ(method);
                methodDescriptor.LIZJ = name;
                if (!c08vq.LIZIZ) {
                    c08vq.LIZIZ = true;
                    Class[] clsArr = c08vq.LIZ;
                    StringBuilder sb = new StringBuilder(clsArr.length + 2);
                    Class<?> returnType = method.getReturnType();
                    char cLIZ = C08VQ.LIZ(returnType);
                    if (cLIZ == 0) {
                        if (returnType == Void.TYPE) {
                            cLIZ = 'v';
                        } else if (returnType == WritableMap.class) {
                            cLIZ = 'M';
                        } else if (returnType == WritableArray.class) {
                            cLIZ = 'A';
                        } else {
                            if (returnType != byte[].class) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Got unknown return class: ");
                                sbLIZ2.append(returnType.getSimpleName());
                                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            cLIZ = 'a';
                        }
                    }
                    sb.append(cLIZ);
                    sb.append('.');
                    for (int i = 0; i < clsArr.length; i++) {
                        Class cls = clsArr[i];
                        if (cls == Promise.class && i != clsArr.length - 1) {
                            throw new AssertionError("Promise must be used as last parameter only");
                        }
                        char cLIZ2 = C08VQ.LIZ(cls);
                        if (cLIZ2 == 0) {
                            if (cls == Callback.class) {
                                cLIZ2 = 'X';
                            } else if (cls == Promise.class) {
                                cLIZ2 = 'P';
                            } else if (cls == ReadableMap.class) {
                                cLIZ2 = 'M';
                            } else if (cls == ReadableArray.class) {
                                cLIZ2 = 'A';
                            } else if (cls == InterfaceC2204631BQf.class) {
                                cLIZ2 = 'Y';
                            } else {
                                if (cls != byte[].class) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("Got unknown param class: ");
                                    sbLIZ3.append(cls.getSimpleName());
                                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                                }
                                cLIZ2 = 'a';
                            }
                        }
                        sb.append(cLIZ2);
                    }
                    c08vq.LIZJ = sb.toString();
                }
                String str = c08vq.LIZJ;
                if (str == null) {
                    throw new AssertionError();
                }
                methodDescriptor.LIZIZ = str;
                methodDescriptor.LIZ = method;
                this.LIZIZ.add(methodDescriptor);
            }
        }
    }

    public Collection<AttributeDescriptor> getAttributeDescriptor() {
        if (this.LIZJ.isEmpty()) {
            try {
                LIZ();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return this.LIZJ;
    }

    public Collection<MethodDescriptor> getMethodDescriptors() {
        if (this.LIZIZ.isEmpty()) {
            try {
                LIZIZ();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return this.LIZIZ;
    }

    public JSModule getModule() {
        return this.LIZ;
    }

    public String getName() {
        return this.LIZLLL;
    }

    public JSModuleWrapper(String str, JSModule jSModule) {
        this.LIZLLL = str;
        this.LIZ = jSModule;
    }
}
