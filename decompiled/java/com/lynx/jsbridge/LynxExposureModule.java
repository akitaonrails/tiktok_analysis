package com.lynx.jsbridge;

import X.AbstractRunnableC1298320jtG;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1289620jfE;
import X.InterfaceC1063790dmz;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class LynxExposureModule extends LynxContextModule {
    @InterfaceC1063790dmz
    public void resumeExposure() {
        if (new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxExposureModule", "resumeExposure", this, new Object[0], "void", new C0WZW(false, "()V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVz0x0p0A2uT+cIg1nHe", null))).LIZ) {
            return;
        }
        final s sVar = this.mLynxContext;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jtV
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                C1309670kBZ c1309670kBZ = this.LLILLJJLI.mLynxContext.LLJJJJLIIL;
                if (c1309670kBZ != null) {
                    c1309670kBZ.LJIILL();
                }
            }
        });
    }

    public LynxExposureModule(s sVar) {
        super(sVar);
    }

    @InterfaceC1063790dmz
    public void setObserverFrameRate(final ReadableMap readableMap) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxExposureModule", "setObserverFrameRate", this, new Object[]{readableMap}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVz0x0p0A2uT+cIg1nHe", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap = (ReadableMap) obj;
        }
        final s sVar = this.mLynxContext;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jtT
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                ReadableMap readableMap2;
                int i;
                BPEAHandler bPEAHandler;
                RunnableC1298440jtS runnableC1298440jtS;
                C1309670kBZ c1309670kBZ = this.LLILLL.mLynxContext.LLJJJJLIIL;
                if (c1309670kBZ == null || (readableMap2 = readableMap) == null) {
                    return;
                }
                if ((readableMap2.hasKey("forExposureCheck") ? readableMap2.getInt("forExposureCheck") : -1) > 0) {
                    c1309670kBZ.LJI = Math.max(16, LSPassThroughRecordSizeConfig.DEFAULT / r0);
                }
                if (!readableMap2.hasKey("forPageRect") || (i = readableMap2.getInt("forPageRect")) < 0) {
                    return;
                }
                long jMax = i != 0 ? Math.max(16, LSPassThroughRecordSizeConfig.DEFAULT / i) : 0L;
                c1309670kBZ.LJIILIIL = jMax;
                if (jMax == 0 || (bPEAHandler = c1309670kBZ.LJIIJ) == null || (runnableC1298440jtS = c1309670kBZ.LJIIJJI) == null) {
                    return;
                }
                C786410Ut5.LJLIIL(jMax, bPEAHandler, runnableC1298440jtS);
            }
        });
    }

    @InterfaceC1063790dmz
    public void stopExposure(final ReadableMap readableMap) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxExposureModule", "stopExposure", this, new Object[]{readableMap}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyVz0x0p0A2uT+cIg1nHe", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap = (ReadableMap) obj;
        }
        final s sVar = this.mLynxContext;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jtU
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                C1309670kBZ c1309670kBZ = this.LLILLL.mLynxContext.LLJJJJLIIL;
                if (c1309670kBZ != null) {
                    c1309670kBZ.LJIIZILJ(readableMap.asHashMap());
                }
            }
        });
    }
}
