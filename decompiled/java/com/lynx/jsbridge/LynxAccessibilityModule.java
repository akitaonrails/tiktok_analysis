package com.lynx.jsbridge;

import X.AbstractRunnableC1298320jtG;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1289620jfE;
import X.C1300290jwR;
import X.C1310360kCg;
import X.InterfaceC1063790dmz;
import android.os.Build;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import j27.s;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class LynxAccessibilityModule extends LynxContextModule {
    public LynxAccessibilityModule(s sVar) {
        super(sVar);
    }

    @InterfaceC1063790dmz
    public void accessibilityAnnounce(final ReadableMap readableMap, final Callback callback) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxAccessibilityModule", "accessibilityAnnounce", this, new Object[]{readableMap, callback}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVjv1EB0BXCU3cEgjHH+ZJa7DFQ=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                readableMap = (ReadableMap) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback = (Callback) obj2;
            }
        }
        final s sVar = this.mLynxContext;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jua
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                this.LLILZ.accessibilityAnnounceInner(readableMap, javaOnlyMap);
                callback.invoke(javaOnlyMap);
            }
        });
    }

    public void accessibilityAnnounceInner(ReadableMap readableMap, JavaOnlyMap javaOnlyMap) {
        String string;
        if (readableMap != null) {
            string = readableMap.getString("content");
        } else {
            string = null;
        }
        if (string != null) {
            s sVar = this.mLynxContext;
            if (sVar != null && sVar.LJIILJJIL() != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.mLynxContext.LJIILJJIL().setAccessibilityPaneTitle(string);
                } else {
                    this.mLynxContext.LJIILJJIL().announceForAccessibility(string);
                }
                javaOnlyMap.putString("msg", "Success");
                return;
            }
            javaOnlyMap.putString("msg", "Error: LynxView missing");
            return;
        }
        javaOnlyMap.putString("msg", "Params error: no content found");
    }

    @InterfaceC1063790dmz
    public void registerMutationStyle(final ReadableMap readableMap, final Callback callback) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxAccessibilityModule", "registerMutationStyle", this, new Object[]{readableMap, callback}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVjv1EB0BXCU3cEgjHH+ZJa7DFQ=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                readableMap = (ReadableMap) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback = (Callback) obj2;
            }
        }
        final s sVar = this.mLynxContext;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0juZ
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                this.LLILZ.registerMutationStyleInner(readableMap, javaOnlyMap);
                callback.invoke(javaOnlyMap);
            }
        });
    }

    public void registerMutationStyleInner(ReadableMap readableMap, JavaOnlyMap javaOnlyMap) {
        if (this.mLynxContext.LJIIL() == null) {
            javaOnlyMap.putString("msg", "Fail: init accessibility env error with a11y wrapper is null");
            return;
        }
        C1310360kCg c1310360kCgLJIIL = this.mLynxContext.LJIIL();
        if (c1310360kCgLJIIL.LJIIJ == null || (!c1310360kCgLJIIL.LJ() && !c1310360kCgLJIIL.LJFF())) {
            javaOnlyMap.putString("msg", "Fail: init accessibility mutation env error");
            return;
        }
        ReadableArray array = readableMap.getArray("mutation_styles", null);
        if (array == null) {
            javaOnlyMap.putString("msg", "Fail: params error with keymutation_styles");
            return;
        }
        C1300290jwR c1300290jwR = c1310360kCgLJIIL.LJIIJ;
        Set<String> set = c1300290jwR.LIZIZ;
        if (set != null) {
            ((HashSet) set).clear();
            for (int i = 0; i < array.size(); i++) {
                if (array.getType(i) == ReadableType.String) {
                    ((HashSet) c1300290jwR.LIZIZ).add(array.getString(i));
                }
            }
        }
        javaOnlyMap.putString("msg", "Success: finish register");
    }
}
