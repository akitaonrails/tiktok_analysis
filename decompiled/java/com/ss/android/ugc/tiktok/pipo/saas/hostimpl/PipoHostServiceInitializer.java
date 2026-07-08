package com.ss.android.ugc.tiktok.pipo.saas.hostimpl;

import X.InterfaceC1723760uxS;
import X.InterfaceC1954907lD;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import jv6.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoHostServiceInitializer implements InterfaceC1954907lD {
    @Override // X.InterfaceC1954907lD
    public <T> T createService(Class<T> cls) {
        if (Intrinsics.LJFF(cls, InterfaceC1723760uxS.class)) {
            return (T) new InterfaceC1723760uxS() { // from class: X.144j
                @Override // X.InterfaceC1723760uxS
                public final InterfaceC1723770uxT LIZLLL() {
                    final C1BLW c1blwLIZLLL = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).LIZLLL();
                    return new InterfaceC1723770uxT() { // from class: X.144k
                        @Override // X.InterfaceC1723770uxT
                        public final void splitCompatInstall(Context context) {
                            if (c1blwLIZLLL != null) {
                                a.install(context);
                            }
                        }

                        @Override // X.InterfaceC1723770uxT
                        public final void LIZ(String str, boolean z) {
                            if (c1blwLIZLLL != null) {
                                C1BLW.LIZIZ(str, z);
                            }
                        }
                    };
                }

                @Override // X.InterfaceC1723760uxS
                public final boolean LJ() {
                    ((IPluginService) ServiceManager.get().getService(IPluginService.class)).LJ();
                    return true;
                }

                @Override // X.InterfaceC1723760uxS
                public final boolean checkPluginInstalled(String str) {
                    IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                    if (iPluginService != null) {
                        return iPluginService.checkPluginInstalled(str);
                    }
                    return false;
                }

                @Override // X.InterfaceC1723760uxS
                public final void LJIILL(C1723700uxM c1723700uxM, final InterfaceC202062144m interfaceC202062144m) {
                    EnumC202055144f enumC202055144f;
                    InterfaceC842850X4p interfaceC842850X4p = new InterfaceC842850X4p() { // from class: X.144l
                        @Override // X.InterfaceC842850X4p
                        public final void LIZJ(String str, boolean z) {
                            interfaceC202062144m.onSuccess();
                        }

                        @Override // X.InterfaceC842850X4p
                        public final void LIZ(int i, String str, boolean z) {
                            interfaceC202062144m.onFailed();
                        }
                    };
                    C844020X9c c844020X9c = new C844020X9c();
                    c844020X9c.LIZ = c1723700uxM.LIZ;
                    c844020X9c.LIZIZ = true;
                    AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                    anonymousClass1403.LIZ = false;
                    int i = C202058144i.LIZ[c1723700uxM.LIZIZ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                enumC202055144f = EnumC202055144f.APPEND;
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            enumC202055144f = EnumC202055144f.REPLACE;
                        }
                    } else {
                        enumC202055144f = EnumC202055144f.KEEP;
                    }
                    anonymousClass1403.LJII = enumC202055144f;
                    c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
                    c844020X9c.LIZLLL = interfaceC842850X4p;
                    ((IPluginService) ServiceManager.get().getService(IPluginService.class)).LJJI(new C202068144s(c844020X9c));
                }
            };
        }
        return null;
    }
}
