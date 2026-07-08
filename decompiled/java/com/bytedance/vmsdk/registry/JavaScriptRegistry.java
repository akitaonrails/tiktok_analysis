package com.bytedance.vmsdk.registry;

import X.C2188811AlT;
import X.InterfaceC20225314Bv;
import X.InterfaceC20225414Bw;
import android.text.TextUtils;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import com.bytedance.vmsdk.registry.JavaScriptRegistry;
import com.bytedance.vmsdk.worker.JsWorker;
import com.bytedance.vmsdk.worker.VmSdkException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public class JavaScriptRegistry {
    public HashMap<Class<? extends InterfaceC20225414Bw>, InterfaceC20225414Bw> mModuleMap = new HashMap<>();
    public HashMap<Class<? extends InterfaceC20225314Bv>, InterfaceC20225314Bv> mFunctionMap = new HashMap<>();

    public static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Short.TYPE) {
            return 's';
        }
        if (cls == Short.class) {
            return 'S';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        if (cls == String.class) {
            return 'T';
        }
        if (cls == Byte.TYPE) {
            return 'b';
        }
        if (cls == Byte.class) {
            return 'B';
        }
        if (cls == Long.TYPE) {
            return 'l';
        }
        if (cls == Long.class) {
            return 'L';
        }
        if (cls == byte[].class) {
            return 'a';
        }
        return (char) 0;
    }

    public static char returnTypeToChar(Class cls) {
        char cCommonTypeToChar = commonTypeToChar(cls);
        if (cCommonTypeToChar != 0) {
            return cCommonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Got unknown return class: ");
        sbLIZ.append(cls.getSimpleName());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public <T extends InterfaceC20225314Bv> T getJavaScriptFunction(final JsWorker jsWorker, Class<? extends InterfaceC20225314Bv> cls) {
        T t = (T) this.mFunctionMap.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler(jsWorker) { // from class: X.14Bt
            public final JsWorker LL;

            {
                this.LL = jsWorker;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                JavaOnlyArray javaOnlyArrayOf = JavaOnlyArray.of(objArr);
                Class<?>[] exceptionTypes = method.getExceptionTypes();
                int length = exceptionTypes.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (VmSdkException.class == exceptionTypes[i]) {
                        z = true;
                        break;
                    }
                    i++;
                }
                return this.LL.invokeJavaScriptFunction(method.getName(), javaOnlyArrayOf, JavaScriptRegistry.returnTypeToChar(method.getReturnType()), z);
            }
        });
        this.mFunctionMap.put(cls, t2);
        return t2;
    }

    public <T extends InterfaceC20225414Bw> T getJavaScriptModule(final JsWorker jsWorker, final Class<? extends InterfaceC20225414Bw> cls) {
        T t = (T) this.mModuleMap.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler(jsWorker, cls) { // from class: X.14Bs
            public final JsWorker LL;
            public String LLILLJJLI;
            public final Class<? extends InterfaceC20225414Bw> LLILLL;

            {
                this.LL = jsWorker;
                this.LLILLL = cls;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                JavaOnlyArray javaOnlyArrayOf = JavaOnlyArray.of(objArr);
                Class<?>[] exceptionTypes = method.getExceptionTypes();
                int length = exceptionTypes.length;
                for (int i = 0; i < length && VmSdkException.class != exceptionTypes[i]; i++) {
                }
                JsWorker jsWorker2 = this.LL;
                if (TextUtils.isEmpty(this.LLILLJJLI)) {
                    String strName = ((InterfaceC20225214Bu) this.LLILLL.getAnnotation(InterfaceC20225214Bu.class)).name();
                    if ("".equals(strName)) {
                        strName = this.LLILLL.getSimpleName();
                    }
                    this.LLILLJJLI = strName;
                }
                return jsWorker2.invokeJavaScriptModule(this.LLILLJJLI, method.getName(), javaOnlyArrayOf, JavaScriptRegistry.returnTypeToChar(method.getReturnType()));
            }
        });
        this.mModuleMap.put(cls, t2);
        return t2;
    }
}
