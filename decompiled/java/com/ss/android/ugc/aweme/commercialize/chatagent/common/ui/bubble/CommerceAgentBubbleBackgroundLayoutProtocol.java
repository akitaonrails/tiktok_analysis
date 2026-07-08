package com.ss.android.ugc.aweme.commercialize.chatagent.common.ui.bubble;

import X.C1165804hE;
import X.C321490Cix;
import X.C321710CjJ;
import X.C321720CjK;
import X.InterfaceC1467705op;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardPostProcessProtocol;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.MessageSender;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentBubbleBackgroundLayoutProtocol implements ICommerceAgentCardPostProcessProtocol {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardPostProcessProtocol
    public final List<InterfaceC1467705op> wO0(List<? extends InterfaceC1467705op> list, C321710CjJ c321710CjJ) {
        int i;
        Integer numValueOf;
        Integer numValueOf2;
        C321490Cix c321490Cix;
        InterfaceC1467705op interfaceC1467705op = null;
        loop0: while (true) {
            InterfaceC1467705op interfaceC1467705op2 = interfaceC1467705op;
            for (InterfaceC1467705op interfaceC1467705op3 : list) {
                if (!(interfaceC1467705op3 instanceof C321490Cix)) {
                    if ((interfaceC1467705op3 instanceof C1165804hE) || (interfaceC1467705op3 instanceof C321720CjK)) {
                        if (((interfaceC1467705op3 instanceof C1165804hE) || (interfaceC1467705op3 instanceof C321720CjK)) && (interfaceC1467705op2 instanceof C321490Cix) && (c321490Cix = (C321490Cix) interfaceC1467705op2) != null) {
                            int i2 = c321490Cix.LJ;
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    c321490Cix.LJ = 3;
                                }
                            } else {
                                c321490Cix.LJ = 0;
                            }
                        }
                        interfaceC1467705op2 = interfaceC1467705op3;
                    }
                } else {
                    C321490Cix c321490Cix2 = (C321490Cix) interfaceC1467705op3;
                    if (interfaceC1467705op2 instanceof C321490Cix) {
                        C321490Cix c321490Cix3 = (C321490Cix) interfaceC1467705op2;
                        MessageSender messageSender = c321490Cix2.LIZJ.sender;
                        if (messageSender != null) {
                            numValueOf = Integer.valueOf(messageSender.senderType);
                        } else {
                            numValueOf = null;
                        }
                        MessageSender messageSender2 = c321490Cix3.LIZJ.sender;
                        if (messageSender2 != null) {
                            numValueOf2 = Integer.valueOf(messageSender2.senderType);
                        } else {
                            numValueOf2 = null;
                        }
                        if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                            Message message = c321490Cix3.LIZJ;
                            MessageSender messageSender3 = message.sender;
                            if (messageSender3 != null && messageSender3.senderType == 2) {
                                int i3 = c321490Cix3.LJ;
                                if (i3 == 0 || i3 == 3) {
                                    c321490Cix3.LJ = 1;
                                }
                                int i4 = c321490Cix2.LJ;
                                if (i4 == 0 || i4 == 1 || i4 == 3) {
                                    c321490Cix2.LJ = 2;
                                }
                            } else if (message.LIZJ == 3) {
                                int i5 = c321490Cix3.LJ;
                                if (i5 != 1) {
                                    if (i5 == 2) {
                                        c321490Cix3.LJ = 3;
                                    }
                                } else {
                                    c321490Cix3.LJ = 0;
                                }
                                int i6 = c321490Cix2.LJ;
                                if (i6 == 0 || i6 == 3) {
                                    c321490Cix2.LJ = 1;
                                }
                            } else {
                                int i7 = c321490Cix3.LJ;
                                if (i7 == 0 || i7 == 3) {
                                    c321490Cix3.LJ = 1;
                                }
                                int i8 = c321490Cix2.LJ;
                                if (i8 == 0 || i8 == 1 || i8 == 3) {
                                    c321490Cix2.LJ = 2;
                                }
                            }
                        } else {
                            int i9 = c321490Cix3.LJ;
                            if (i9 != 1) {
                                if (i9 == 2) {
                                    c321490Cix3.LJ = 3;
                                }
                            } else {
                                c321490Cix3.LJ = 0;
                            }
                            int i10 = c321490Cix2.LJ;
                            if (i10 == 0 || i10 == 3) {
                                c321490Cix2.LJ = 1;
                            }
                        }
                    } else if (((interfaceC1467705op2 instanceof C1165804hE) || (interfaceC1467705op2 instanceof C321720CjK)) && c321490Cix2 != null && ((i = c321490Cix2.LJ) == 0 || i == 3)) {
                        c321490Cix2.LJ = 1;
                    }
                    interfaceC1467705op = interfaceC1467705op3;
                }
            }
            break loop0;
        }
        C321490Cix c321490Cix4 = (C321490Cix) interfaceC1467705op;
        if (c321490Cix4 != null) {
            int i11 = c321490Cix4.LJ;
            if (i11 != 1) {
                if (i11 == 2) {
                    c321490Cix4.LJ = 3;
                }
            } else {
                c321490Cix4.LJ = 0;
                return list;
            }
        }
        return list;
    }
}
