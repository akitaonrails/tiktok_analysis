package com.ss.android.ugc.aweme.notification.lego;

import X.AbstractC848400XPy;
import X.C0CO3;
import X.C0XQ7;
import X.C15O7;
import X.C19252510Tr;
import X.C2188811AlT;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC2385309Wh;
import X.InterfaceC800130Va7;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FetchTutorialVideoRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchTutorialVideoRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.NORMAL;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva repo = Keva.getRepo("top_message_keva_repo");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("msg_id_");
        sbLIZ.append(curUserId);
        final String string = repo.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("first_show_time_");
        sbLIZ2.append(curUserId);
        long j = repo.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("current_show_time_");
        sbLIZ3.append(curUserId);
        long j2 = repo.getLong(C2188811AlT.LIZIZ(sbLIZ3), 0L);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("clicked_");
        sbLIZ4.append(curUserId);
        C19252510Tr.LIZ.LIZ(string, j, j2, repo.getInt(C2188811AlT.LIZIZ(sbLIZ4), 0)).LJIIZILJ(new InterfaceC2385309Wh(this) { // from class: X.10Tq
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7<TutorialVideoResp> c15o7) {
                TutorialVideoInfo info;
                int i;
                C1C7U.LIZ("FetchTutorialVideoRequest@54f7.request$1");
                if (c15o7.LJIILJJIL()) {
                    InterfaceC19252710Tt interfaceC19252710Tt = (InterfaceC19252710Tt) C1906090zhX.LIZ(InterfaceC19252710Tt.class);
                    TutorialVideoResp tutorialVideoRespLJIIL = c15o7.LJIIL();
                    if (tutorialVideoRespLJIIL != null && (info = tutorialVideoRespLJIIL.getInfo()) != null) {
                        String str = string;
                        if (!TextUtils.isEmpty(info.msgId) && !TextUtils.isEmpty(info.deepLink) && !TextUtils.equals(str, info.msgId)) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        C1903780zdo.LJII().LJIILJJIL(LSPassThroughRecordSizeConfig.DEFAULT, i);
                        if (interfaceC19252710Tt != null) {
                            interfaceC19252710Tt.LJ(info.msgId);
                            interfaceC19252710Tt.LIZ(info.icon);
                            interfaceC19252710Tt.LIZJ(info.title);
                            interfaceC19252710Tt.LIZIZ(info.desc);
                            interfaceC19252710Tt.LJFF(info.button);
                            interfaceC19252710Tt.LIZLLL(info.deepLink);
                        }
                    } else if (interfaceC19252710Tt != null) {
                        interfaceC19252710Tt.LJ("");
                        interfaceC19252710Tt.LIZ("");
                        interfaceC19252710Tt.LIZJ("");
                        interfaceC19252710Tt.LIZIZ("");
                        interfaceC19252710Tt.LJFF("");
                        interfaceC19252710Tt.LIZLLL("");
                    }
                }
                C1C7U.LIZIZ("FetchTutorialVideoRequest@54f7.request$1");
                return null;
            }
        }, C15O7.LJIIIIZZ);
    }
}
