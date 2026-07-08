package com.ss.android.ugc.aweme.im.service.provider;

import X.AbstractC1607320rve;
import X.C13LE;
import X.C1607330rvf;
import X.C1807670x8n;
import X.C2217381BqS;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.aweme.im.service.IIMNonSDKService;
import com.ss.android.ugc.aweme.im.service.avatar.AvatarActiveDataAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class IMNonSDKService implements IIMNonSDKService {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMNonSDKService.class, "avatarActiveAdapter", "getAvatarActiveAdapter()Lcom/ss/android/ugc/aweme/im/service/avatar/IMBaseAvatarBusinessAdapter;", 0);
        C13LE.LIZ.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0rvf] */
    @Override // com.ss.android.ugc.aweme.im.service.IIMNonSDKService
    public final C1607330rvf LIZ() {
        C1607330rvf c1607330rvf = C1807670x8n.LJJZZI;
        if (c1607330rvf == null) {
            synchronized (C1607330rvf.class) {
                try {
                    c1607330rvf = C1807670x8n.LJJZZI;
                    if (c1607330rvf == null) {
                        ?? r1 = new AbstractC1607320rve() { // from class: X.0rvf
                            @Override // X.InterfaceC1608800ry2
                            public final EnumC1607270rvZ LIZ() {
                                return EnumC1607270rvZ.ACTIVE;
                            }

                            @Override // X.InterfaceC1608800ry2
                            public final InterfaceC1608870ry9 LIZIZ(InterfaceC426680GoE interfaceC426680GoE) {
                                return new AvatarActiveDataAdapter((C1607310rvd) interfaceC426680GoE);
                            }

                            @Override // X.InterfaceC1608800ry2
                            public final AbstractC1608790ry1 LIZJ(InterfaceC426680GoE interfaceC426680GoE) {
                                final C1607310rvd c1607310rvd = (C1607310rvd) interfaceC426680GoE;
                                return new AbstractC1608790ry1<AbstractC1153360g7S, C1607310rvd>(c1607310rvd) { // from class: X.0rvb
                                    public final C1607310rvd LIZLLL;

                                    @Override // X.AbstractC1608790ry1
                                    public final /* bridge */ /* synthetic */ InterfaceC426680GoE LJ() {
                                        return this.LIZLLL;
                                    }

                                    {
                                        this.LIZLLL = c1607310rvd;
                                    }

                                    @Override // X.AbstractC1608790ry1
                                    public final C1606960rv4 LIZ(InterfaceC1606880ruw interfaceC1606880ruw) {
                                        if (interfaceC1606880ruw instanceof C1153350g7R) {
                                            return LJFF(true);
                                        }
                                        if (interfaceC1606880ruw instanceof C1153340g7Q) {
                                            C1607310rvd c1607310rvd2 = this.LIZLLL;
                                            if (c1607310rvd2 != null && c1607310rvd2.LIZLLL) {
                                                return LJFF(false);
                                            }
                                            return null;
                                        }
                                        throw new C1954807lC();
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
                                    /* JADX WARN: Removed duplicated region for block: B:67:0x00ea  */
                                    /* JADX WARN: Removed duplicated region for block: B:72:0x00fe  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final X.C1606960rv4 LJFF(boolean r10) {
                                        /*
                                            Method dump skipped, instruction units count: 257
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C1607290rvb.LJFF(boolean):X.0rv4");
                                    }
                                };
                            }

                            @Override // X.AbstractC1608810ry3
                            public final InterfaceC1606880ruw LJ(InterfaceC1606880ruw interfaceC1606880ruw) {
                                if (!(interfaceC1606880ruw instanceof AbstractC1153360g7S)) {
                                    return null;
                                }
                                return interfaceC1606880ruw;
                            }
                        };
                        C1807670x8n.LJJZZI = r1;
                        return r1;
                    }
                } finally {
                }
            }
        }
        return c1607330rvf;
    }
}
