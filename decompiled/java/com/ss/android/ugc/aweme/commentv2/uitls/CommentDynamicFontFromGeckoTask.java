package com.ss.android.ugc.aweme.commentv2.uitls;

import X.C0CCZ;
import X.C0O50;
import X.C0P4B;
import X.C0VU1;
import X.C0VZ0;
import X.C1537050q6J;
import X.C1551950qUL;
import X.C2097908Jt;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class CommentDynamicFontFromGeckoTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CommentDynamicFontFromGeckoTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0O50.LIZ.getClass();
        String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
        C1537050q6J.LIZ.getClass();
        C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
        C0P4B c0p4b = new C0P4B(1);
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setLazyUpdate(true);
        optionCheckUpdateParams.setListener(c0p4b);
        List listSingletonList = Collections.singletonList(new CheckRequestBodyModel.TargetChannel("comment_activity_font"));
        if (c1551950qULLIZ != null) {
            try {
                c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, listSingletonList)), optionCheckUpdateParams);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
