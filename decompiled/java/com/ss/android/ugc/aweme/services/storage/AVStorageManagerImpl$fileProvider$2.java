package com.ss.android.ugc.aweme.services.storage;

import X.C09AY;
import X.C13VH;
import X.C20587715hD;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public final class AVStorageManagerImpl$fileProvider$2 extends C09AY implements Function0<C20587715hD> {
    public AVStorageManagerImpl$fileProvider$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15hD] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C20587715hD invoke() {
        return new C13VH() { // from class: X.15hD
            @Override // X.C13VH
            public final String cacheDir() {
                return LJ(EnumC20587515hB.CACHE, null);
            }

            @Override // X.C13VH
            public final C0VSJ LIZ(String str) {
                C0VSJ c0vsj = new C0VSJ(str);
                C0MZY.LIZ.getClass();
                C0MZY.LIZJ();
                return c0vsj;
            }

            @Override // X.C13VH
            public final String LIZIZ(String str) {
                String str2;
                int i = C20587615hC.LIZ[EnumC20587815hE.VIDEOEDIT.ordinal()];
                boolean z = true;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                str2 = "publish";
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            str2 = "videocut";
                        }
                    } else {
                        str2 = "videoedit";
                    }
                } else {
                    str2 = "shoot";
                }
                if (str.length() != 0) {
                    z = false;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C1449640npK.LIZ);
                    sbLIZ.append("shortvideo/");
                    sbLIZ.append(str2);
                    sbLIZ.append('/');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C1449640npK.LIZ);
                sbLIZ2.append("shortvideo/");
                sbLIZ2.append(str2);
                sbLIZ2.append('/');
                sbLIZ2.append(str);
                sbLIZ2.append('/');
                return C2188811AlT.LIZIZ(sbLIZ2);
            }

            @Override // X.C13VH
            public final String LIZLLL(String str) {
                return LJ(EnumC20587515hB.RESOURCE, str);
            }

            public static String LJ(EnumC20587515hB enumC20587515hB, String str) {
                String str2;
                int i = C20587615hC.LIZIZ[enumC20587515hB.ordinal()];
                boolean z = true;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    str2 = "image";
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                str2 = "story";
                            }
                        } else {
                            str2 = "draft";
                        }
                    } else {
                        str2 = "resources";
                    }
                } else {
                    str2 = "cache";
                }
                if (str != null && str.length() != 0) {
                    z = false;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C1449640npK.LIZ);
                    sbLIZ.append("shortvideo/");
                    sbLIZ.append(str2);
                    sbLIZ.append('/');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C1449640npK.LIZ);
                sbLIZ2.append("shortvideo/");
                sbLIZ2.append(str2);
                sbLIZ2.append('/');
                sbLIZ2.append(str);
                sbLIZ2.append('/');
                return C2188811AlT.LIZIZ(sbLIZ2);
            }

            @Override // X.C13VH
            public final C0VSJ LIZJ(File file, String str) {
                C0VSJ c0vsj = new C0VSJ(file, str);
                C0MZY.LIZ.getClass();
                C0MZY.LIZJ();
                return c0vsj;
            }
        };
    }
}
