package com.ss.android.ugc.aweme.im.push.impl.alerttone.callback;

import X.C0I0B;
import X.C10FJ;
import X.C1400340mXo;
import X.C1519420pds;
import X.C19328210jY;
import X.C20304514cd;
import X.C323580CmK;
import X.InterfaceC1400360mXq;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.serverpush.presenter.IGetPushSettingCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class MessageInAppSettingCallback implements IGetPushSettingCallback, C10FJ {
    public boolean LL;

    @Override // com.ss.android.ugc.aweme.setting.serverpush.presenter.IGetPushSettingCallback
    public final C10FJ getPushSettingCallback() {
        return this;
    }

    public final void LIZ() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        Function0[] function0Arr = {new C1519420pds()};
        final C19328210jY c19328210jY = new C19328210jY();
        C323580CmK c323580CmK = new C323580CmK(2);
        c323580CmK.LIZ(new C20304514cd());
        c323580CmK.LIZIZ(function0Arr);
        final Function0[] function0Arr2 = (Function0[]) c323580CmK.LIZLLL(new Function0[c323580CmK.LIZJ()]);
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LJ(new InterfaceC1400360mXq(function0Arr2, c19328210jY) { // from class: X.0mXr
            public final InterfaceC461710I8r LIZ;
            public List<String> LIZIZ;
            public final /* synthetic */ Function0<String>[] LIZJ;
            public final /* synthetic */ Function0<Unit> LIZLLL;

            {
                this.LIZJ = function0Arr2;
                this.LIZLLL = c19328210jY;
                InterfaceC461710I8r interfaceC461710I8rLIZ = C0I0B.LJFF.LIZ();
                this.LIZ = interfaceC461710I8rLIZ;
                this.LIZIZ = C13BV.INSTANCE;
                if (((C1400340mXo) interfaceC461710I8rLIZ).isLogin()) {
                    ArrayList arrayList = new ArrayList(function0Arr2.length);
                    for (Function0 function0 : function0Arr2) {
                        arrayList.add(function0.invoke());
                    }
                    this.LIZIZ = arrayList;
                    c19328210jY.invoke();
                }
            }

            @Override // X.InterfaceC1400360mXq
            public final void LLLLLLZZ(int i, User user, User user2) {
                String language;
                if (i != 1 && i != 2 && i != 4 && i != 13) {
                    return;
                }
                Function0<String>[] function0Arr3 = this.LIZJ;
                ArrayList arrayList = new ArrayList(function0Arr3.length);
                for (Function0<String> function0 : function0Arr3) {
                    arrayList.add(function0.invoke());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MessageOutAppAlertToneInitTask.run() called: flags = ");
                sbLIZ.append(arrayList);
                sbLIZ.append(", type: ");
                sbLIZ.append(i);
                sbLIZ.append(", locale: ");
                if (user2 != null) {
                    language = user2.getLanguage();
                } else {
                    language = null;
                }
                sbLIZ.append(language);
                C2188811AlT.LIZIZ(sbLIZ);
                if (Intrinsics.LJFF(this.LIZIZ, arrayList)) {
                    return;
                }
                this.LIZIZ = arrayList;
                this.LIZLLL.invoke();
            }
        });
    }

    @Override // X.C10FJ
    public final void Hl(PushSettings pushSettings) {
        LIZ();
    }

    @Override // X.C10FJ
    public final void onFailed(Exception exc) {
        LIZ();
    }
}
