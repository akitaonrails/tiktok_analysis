package com.lynx.jsbridge;

import X.C1289620jfE;
import X.C1297450jrr;
import X.C1297470jrt;
import X.C2188811AlT;
import X.InterfaceC1297440jrq;
import com.lynx.base.log.LynxLog;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxModuleFactory {
    public final ConcurrentHashMap<String, C1297450jrr> LIZ = new ConcurrentHashMap<>();
    public long LIZIZ;
    public InterfaceC1297440jrq LIZJ;
    public Object LIZLLL;
    public boolean LJ;
    public C1297470jrt LJFF;

    private native boolean nativeRetainJniObject(long j);

    public final void LIZLLL() {
        if (nativeRetainJniObject(this.LIZIZ)) {
            return;
        }
        LynxLog.e("LynxModuleFactory", "LynxModuleFactory try to retainJniObject failed");
        destroy();
    }

    public void destroy() {
        if (this.LJ) {
            return;
        }
        C1297470jrt c1297470jrt = this.LJFF;
        if (c1297470jrt != null) {
            C1289620jfE.LIZJ(c1297470jrt.LIZ);
        }
        InterfaceC1297440jrq interfaceC1297440jrq = this.LIZJ;
        if (interfaceC1297440jrq != null) {
            interfaceC1297440jrq.destroy();
        }
        this.LIZ.clear();
        this.LIZIZ = 0L;
        this.LJ = true;
    }

    public long getNativePtr() {
        return this.LIZIZ;
    }

    private LynxModuleWrapper moduleWrapperForName(String str) {
        return LIZIZ(str);
    }

    private void setNativePtr(long j) {
        this.LIZIZ = j;
    }

    public final void LIZ(List<C1297450jrr> list) {
        if (list != null && !list.isEmpty()) {
            for (C1297450jrr c1297450jrr : list) {
                String str = c1297450jrr.LIZ;
                C1297450jrr c1297450jrr2 = this.LIZ.get(str);
                if (c1297450jrr2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Duplicated LynxModule For Name: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", ");
                    sbLIZ.append(c1297450jrr2);
                    sbLIZ.append(" will be override");
                    LynxLog.e("LynxModuleFactory", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LIZ.put(str, c1297450jrr);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("method addModuleParamWrapper ,  registered module with name: ");
                sbLIZ2.append(str);
                sbLIZ2.append(" class");
                sbLIZ2.append(c1297450jrr);
                LynxLog.v("LynxModuleFactory", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public final LynxModuleWrapper LIZIZ(String str) {
        InterfaceC1297440jrq interfaceC1297440jrq = this.LIZJ;
        if (interfaceC1297440jrq == null) {
            return null;
        }
        LynxModuleWrapper lynxModuleWrapperLIZJ = interfaceC1297440jrq.LIZJ(str, this.LIZ);
        if (lynxModuleWrapperLIZJ != null) {
            lynxModuleWrapperLIZJ.getModule().setExtraData(this.LIZLLL);
        }
        return lynxModuleWrapperLIZJ;
    }

    public final void LIZJ(String str, Class<? extends LynxModule> cls, Object obj) {
        C1297450jrr c1297450jrr = new C1297450jrr();
        c1297450jrr.LIZ = str;
        c1297450jrr.LIZIZ = cls;
        c1297450jrr.LIZJ = obj;
        C1297450jrr c1297450jrr2 = this.LIZ.get(str);
        if (c1297450jrr2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Duplicated LynxModule For Name: ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(c1297450jrr2);
            sbLIZ.append(" will be override");
            LynxLog.e("LynxModuleFactory", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.put(str, c1297450jrr);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("method registerModule , registered module with name: ");
        sbLIZ2.append(str);
        sbLIZ2.append(" class");
        sbLIZ2.append(cls);
        LynxLog.v("LynxModuleFactory", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
