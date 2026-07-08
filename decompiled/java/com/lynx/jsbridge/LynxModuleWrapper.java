package com.lynx.jsbridge;

import X.C1289620jfE;
import X.C1968607nQ;
import X.C2188811AlT;
import X.InterfaceC1063790dmz;
import X.InterfaceC1297320jre;
import X.InterfaceC1297330jrf;
import X.InterfaceC1298070jsr;
import Y.ARunnableS53S0300000_20;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.jsi.ILynxJSIObject;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.PiperData;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.TemplateData;
import j27.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxModuleWrapper {
    public static final ConcurrentHashMap<Class<? extends LynxModule>, ArrayList<MethodDescriptor>> LJFF = new ConcurrentHashMap<>();
    public final LynxModule LIZ;
    public final ArrayList<MethodDescriptor> LIZIZ = new ArrayList<>();
    public final ArrayList<AttributeDescriptor> LIZJ = new ArrayList<>();
    public final String LIZLLL;
    public volatile InterfaceC1297320jre LJ;

    public boolean hasAuthValidator() {
        return false;
    }

    public boolean verify(String str, String str2, JavaOnlyArray javaOnlyArray) {
        return true;
    }

    public final void LIZ() {
        HashSet hashSet = new HashSet();
        for (Field field : this.LIZ.getClass().getDeclaredFields()) {
            if (field.getAnnotation(InterfaceC1297330jrf.class) != null) {
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
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                try {
                    javaOnlyArray.add(field.get(this.LIZ));
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LynxLog.e("NativeModule:LynxModuleWrapper", e.toString());
                }
                this.LIZJ.add(new AttributeDescriptor(name, javaOnlyArray));
            }
        }
    }

    public final void LIZIZ() {
        Class<?> cls = this.LIZ.getClass();
        ConcurrentHashMap<Class<? extends LynxModule>, ArrayList<MethodDescriptor>> concurrentHashMap = LJFF;
        if (concurrentHashMap.containsKey(cls)) {
            this.LIZIZ.addAll(concurrentHashMap.get(cls));
            return;
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getAnnotation(InterfaceC1063790dmz.class) != null) {
                String name = method.getName();
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                C1968607nQ c1968607nQ = new C1968607nQ(method);
                methodDescriptor.LIZJ = name;
                if (!c1968607nQ.LIZIZ) {
                    c1968607nQ.LIZIZ = true;
                    Class[] clsArr = c1968607nQ.LIZ;
                    StringBuilder sb = new StringBuilder(clsArr.length + 2);
                    Class<?> returnType = method.getReturnType();
                    char cLIZ = C1968607nQ.LIZ(returnType);
                    if (cLIZ == 0) {
                        if (returnType == Void.TYPE) {
                            cLIZ = 'v';
                        } else if (returnType == WritableMap.class || returnType == ReadableMap.class || returnType == JavaOnlyMap.class) {
                            cLIZ = 'M';
                        } else if (returnType == WritableArray.class || returnType == ReadableArray.class || returnType == JavaOnlyArray.class) {
                            cLIZ = 'A';
                        } else if (returnType == byte[].class) {
                            cLIZ = 'a';
                        } else if (returnType == PiperData.class) {
                            cLIZ = 'J';
                        } else if (returnType == ILynxJSIObject.class) {
                            cLIZ = 'O';
                        } else {
                            if (returnType != TemplateData.class) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Got unknown return class: ");
                                sbLIZ.append(returnType.getSimpleName());
                                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            cLIZ = 'E';
                        }
                    }
                    sb.append(cLIZ);
                    sb.append('.');
                    for (int i = 0; i < clsArr.length; i++) {
                        Class cls2 = clsArr[i];
                        if (cls2 == Promise.class && i != clsArr.length - 1) {
                            throw new AssertionError("Promise must be used as last parameter only");
                        }
                        char cLIZ2 = C1968607nQ.LIZ(cls2);
                        if (cLIZ2 == 0) {
                            if (cls2 == Callback.class) {
                                cLIZ2 = 'X';
                            } else if (cls2 == Promise.class) {
                                cLIZ2 = 'P';
                            } else if (((HashSet) C1968607nQ.LIZLLL).contains(cls2)) {
                                cLIZ2 = 'M';
                            } else if (((HashSet) C1968607nQ.LJ).contains(cls2)) {
                                cLIZ2 = 'A';
                            } else if (cls2 == InterfaceC1298070jsr.class) {
                                cLIZ2 = 'Y';
                            } else if (cls2 == byte[].class) {
                                cLIZ2 = 'a';
                            } else {
                                if (cls2 != s.class) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Got unknown param class: ");
                                    sbLIZ2.append(cls2.getSimpleName());
                                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                                cLIZ2 = 'K';
                            }
                        }
                        sb.append(cLIZ2);
                    }
                    c1968607nQ.LIZJ = sb.toString();
                }
                String str = c1968607nQ.LIZJ;
                if (str == null) {
                    throw new AssertionError();
                }
                methodDescriptor.LIZIZ = str;
                methodDescriptor.LIZ = method;
                this.LIZIZ.add(methodDescriptor);
            }
        }
        LJFF.putIfAbsent((Class<? extends LynxModule>) cls, new ArrayList<>(this.LIZIZ));
    }

    public Collection<AttributeDescriptor> getAttributeDescriptor() {
        WeakReference<Context> weakReferenceLIZ = this.LJ.LIZ("");
        if (this.LIZJ.isEmpty()) {
            try {
                LIZ();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C1289620jfE.LIZJ(new ARunnableS53S0300000_20(weakReferenceLIZ, e, this, 4));
                LynxLog.e("NativeModule:LynxModuleWrapper", e.toString());
            }
        }
        return this.LIZJ;
    }

    public Collection<MethodDescriptor> getMethodDescriptors() {
        WeakReference<Context> weakReferenceLIZ = this.LJ.LIZ("");
        if (this.LIZIZ.isEmpty()) {
            try {
                LIZIZ();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C1289620jfE.LIZJ(new ARunnableS53S0300000_20(weakReferenceLIZ, e, this, 3));
                LynxLog.e("NativeModule:LynxModuleWrapper", e.toString());
            }
        }
        return this.LIZIZ;
    }

    public LynxModule getModule() {
        return this.LIZ;
    }

    public String getName() {
        return this.LIZLLL;
    }

    public s getLynxContext(String str) {
        WeakReference<Context> weakReferenceLIZ = this.LJ.LIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" GetLynxContext instanceId:");
        sbLIZ.append(str);
        sbLIZ.append(", contextRef: ");
        sbLIZ.append(weakReferenceLIZ);
        sbLIZ.append(", module: ");
        sbLIZ.append(this.LIZ);
        LynxLog.d("NativeModule:LynxModuleWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (weakReferenceLIZ != null) {
            Context context = weakReferenceLIZ.get();
            if (context instanceof s) {
                return (s) context;
            }
            if (context != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("GetLynxContext , Context found but is not a LynxContext:");
                sbLIZ2.append(context.getClass().getName());
                LynxLog.w("NativeModule:LynxModuleWrapper", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
            return null;
        }
        return null;
    }

    public LynxModuleWrapper(String str, LynxModule lynxModule) {
        this.LIZLLL = str;
        this.LIZ = lynxModule;
    }
}
