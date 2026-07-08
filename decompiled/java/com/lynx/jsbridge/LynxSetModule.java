package com.lynx.jsbridge;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1285920jZG;
import X.InterfaceC1063790dmz;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.service.ILynxLogService;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class LynxSetModule extends LynxContextModule {
    @InterfaceC1063790dmz
    public boolean getEnableLayoutOnly() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getEnableLayoutOnly", this, new Object[0], "boolean", new C0WZW(false, "()Z", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUrpw2hoEmya0Q==", null)));
        return c0wsuLIZIZ.LIZ ? ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue() : LynxEnv.inst().isLayoutOnlyEnabled();
    }

    @InterfaceC1063790dmz
    public boolean getEnableVsyncAlignedFlush() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getEnableVsyncAlignedFlush", this, new Object[0], "boolean", new C0WZW(false, "()Z", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUrpw2hoEmya0Q==", null)));
        return c0wsuLIZIZ.LIZ ? ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue() : LynxEnv.inst().getVsyncAlignedFlushGlobalSwitch();
    }

    @InterfaceC1063790dmz
    public boolean getIsCreateViewAsync() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getIsCreateViewAsync", this, new Object[0], "boolean", new C0WZW(false, "()Z", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUrpw2hoEmya0Q==", null)));
        return c0wsuLIZIZ.LIZ ? ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue() : LynxEnv.inst().getCreateViewAsync();
    }

    @InterfaceC1063790dmz
    public boolean getLogToSystemStatus() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getLogToSystemStatus", this, new Object[0], "boolean", new C0WZW(false, "()Z", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUrpw2hoEmya0Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        }
        ILynxLogService iLynxLogService = (ILynxLogService) C1285920jZG.LIZJ().LIZ(ILynxLogService.class);
        if (iLynxLogService != null) {
            return iLynxLogService.getLogToSystemStatus();
        }
        return false;
    }

    public LynxSetModule(s sVar) {
        super(sVar);
    }

    @InterfaceC1063790dmz
    public void switchEnableLayoutOnly(Boolean bool) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchEnableLayoutOnly", this, new Object[]{bool}, "void", new C0WZW(false, "(Ljava/lang/Boolean;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUrpw2hoEmya0Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            bool = (Boolean) obj;
        }
        LynxEnv.inst().enableLayoutOnly(bool.booleanValue());
    }

    @InterfaceC1063790dmz
    public void switchEnableVsyncAlignedFlush(Boolean bool) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchEnableVsyncAlignedFlush", this, new Object[]{bool}, "void", new C0WZW(false, "(Ljava/lang/Boolean;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUrpw2hoEmya0Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            bool = (Boolean) obj;
        }
        LynxEnv.inst().setVsyncAlignedFlushGlobalSwitch(bool.booleanValue());
    }

    @InterfaceC1063790dmz
    public void switchIsCreateViewAsync(Boolean bool) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchIsCreateViewAsync", this, new Object[]{bool}, "void", new C0WZW(false, "(Ljava/lang/Boolean;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUrpw2hoEmya0Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            bool = (Boolean) obj;
        }
        LynxEnv.inst().setCreateViewAsync(bool.booleanValue());
    }

    @InterfaceC1063790dmz
    public void switchKeyBoardDetect(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchKeyBoardDetect", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUrpw2hoEmya0Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        if (z) {
            this.mLynxContext.LJIILJJIL().getKeyboardEvent().LIZJ();
        }
    }

    @InterfaceC1063790dmz
    public void switchLogToSystem(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchLogToSystem", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUrpw2hoEmya0Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        ILynxLogService iLynxLogService = (ILynxLogService) C1285920jZG.LIZJ().LIZ(ILynxLogService.class);
        if (iLynxLogService != null) {
            iLynxLogService.switchLogToSystem(z);
        }
    }
}
