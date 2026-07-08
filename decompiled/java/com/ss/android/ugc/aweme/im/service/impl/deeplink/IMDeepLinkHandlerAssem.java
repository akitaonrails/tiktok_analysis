package com.ss.android.ugc.aweme.im.service.impl.deeplink;

import X.AnonymousClass0653;
import X.C0I0B;
import X.C0PEM;
import X.C1150504el;
import X.C1336205Ku;
import X.C1400340mXo;
import X.C15485064l;
import X.C15486064m;
import X.C1586906Jf;
import X.C19EG;
import X.C2296808zG;
import X.C23250099c;
import X.C724240Sb0;
import X.C786410Ut5;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMDeepLinkHandlerAssem extends BaseMainContainerAssem {
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Intent intent;
        String stringExtra;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"IMDeepLinkHandlerAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (intent = c19egLIZ.getIntent()) != null) {
            Serializable serializableExtra = intent.getSerializableExtra("key_enter_chat_params");
            Bundle extras = null;
            EnterChatParams enterChatParams = serializableExtra instanceof EnterChatParams ? (EnterChatParams) serializableExtra : null;
            try {
                stringExtra = intent.getStringExtra("external_link");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            String str = "";
            if (stringExtra == null) {
                stringExtra = "";
            }
            try {
                String stringExtra2 = intent.getStringExtra("is_streak_invite");
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                extras = intent.getExtras();
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (enterChatParams != null) {
                enterChatParams.setContext(C724240Sb0.LIZ(this));
                C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
            } else if (Intrinsics.LJFF(stringExtra, "1") && extras != null) {
                bo(extras);
            } else if (Intrinsics.LJFF(str, "1") && extras != null) {
                m241do(extras);
            }
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    public final void bo(Bundle bundle) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            String string = bundle.getString("username");
            String str = "";
            if (string == null) {
                string = "";
            }
            String strDecode = Uri.decode(string);
            String string2 = bundle.getString("message");
            if (string2 == null) {
                string2 = "";
            }
            String strDecode2 = Uri.decode(string2);
            String string3 = bundle.getString("ref");
            if (string3 != null) {
                str = string3;
            }
            AnonymousClass0653 anonymousClass0653 = new AnonymousClass0653(strDecode, strDecode2, Uri.decode(str));
            C0I0B c0i0b = C0I0B.LJFF;
            if (!((C1400340mXo) c0i0b.LIZ()).isLogin()) {
                c0i0b.LIZ();
                C1400340mXo.LJIIJ(c19egLIZ, new C15486064m(this, anonymousClass0653, c19egLIZ));
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C15485064l(anonymousClass0653, this, c19egLIZ, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m241do(Bundle bundle) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            String string = bundle.getString("invite_id");
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = bundle.getString("uniq_id");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = bundle.getString("expire_time");
            if (string3 != null) {
                str = string3;
            }
            IStreakPetService.LIZ.getClass();
            C1586906Jf.LIZ().LJJIFFI(c19egLIZ, string, string2, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) {
        String stringExtra;
        super.onNewIntent(intent);
        Bundle extras = null;
        try {
            stringExtra = intent.getStringExtra("external_link");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            String stringExtra2 = intent.getStringExtra("is_streak_invite");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            extras = intent.getExtras();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (Intrinsics.LJFF(stringExtra, "1") && extras != null) {
            bo(extras);
        } else {
            if (!Intrinsics.LJFF(str, "1") || extras == null) {
                return;
            }
            m241do(extras);
        }
    }
}
