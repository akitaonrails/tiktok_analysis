package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DonationMessage_ProtoDecoder implements C0IMD<DonationMessage> {
    @Override // X.C0IMD
    public final void LIZ(DonationMessage donationMessage) {
        DonationMessage donationMessage2 = donationMessage;
        CommonMessageData commonMessageData = donationMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<User> list = donationMessage2.sponsor;
        if (list == null) {
            donationMessage2.sponsor = new ArrayList();
        } else if (!list.isEmpty()) {
            for (User user : donationMessage2.sponsor) {
                if (user != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        List<User> list2 = donationMessage2.user;
        if (list2 == null) {
            donationMessage2.user = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (User user2 : donationMessage2.user) {
            if (user2 != null) {
                _User_ProtoDecoder.LJ(user2);
            }
        }
    }

    @Override // X.C0IMD
    public final DonationMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        DonationMessage donationMessage = new DonationMessage();
        donationMessage.sponsor = new ArrayList();
        donationMessage.user = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    donationMessage.user.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                donationMessage.sponsor.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            donationMessage.currency = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        donationMessage.total = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    donationMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return donationMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DonationMessage donationMessage, List list) {
    }
}
