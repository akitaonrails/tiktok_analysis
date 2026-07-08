package com.ss.android.ugc.aweme.im.interactioncard.viewmodel;

import X.C01GW;
import X.C069P;
import X.C0PEM;
import X.C0VSJ;
import X.C0Y3I;
import X.C0Y3R;
import X.C0YNP;
import X.C0YNY;
import X.C0Z2Z;
import X.C1710306mr;
import X.C1BGS;
import X.C23250099c;
import X.C318990Cev;
import X.C452501pT;
import X.C603540Nlo;
import X.C869590Y9l;
import X.C898450ZMl;
import X.C898460ZMm;
import X.C898480ZMo;
import X.C913380ZsO;
import X.InterfaceC0148002o;
import X.InterfaceC874680YTa;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.lightinteract.api.model.AlphaVideoFileModel;
import com.ss.android.ugc.aweme.im.message.template.card.InteractionCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.FortuneCookieInfoComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS128S1100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class InteractionCardViewModel extends AssemViewModel<C898480ZMo> {
    public C869590Y9l LLILLL;
    public C869590Y9l LLILZ;
    public final Map<String, AlphaVideoFileModel.Item> LL = new LinkedHashMap();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(130));
    public final Set<String> LLILZIL = new LinkedHashSet();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C898480ZMo(null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C318990Cev(this, null), 3);
    }

    public static String vQ2(C869590Y9l c869590Y9l) {
        String nickName;
        long jLJII = C0YNP.LJII(c869590Y9l.getConversationId());
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        String strValueOf = String.valueOf(jLJII);
        IIMContactUtilService.LIZ.getClass();
        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
        String strLJIIJ = null;
        if (iIMContactUtilServiceLIZ != null) {
            strLJIIJ = iIMContactUtilServiceLIZ.LJIIJ(c869590Y9l.getConversationId());
        }
        IMUser iMUserLIZLLL = c1bgsLJ.LIZLLL(strValueOf, strLJIIJ, "im_chat_interaction_card");
        if (iMUserLIZLLL == null || (nickName = iMUserLIZLLL.getNickName()) == null) {
            return "";
        }
        return nickName;
    }

    public final void AQ2(C869590Y9l c869590Y9l) {
        String uuid;
        String uuid2;
        String uuid3 = c869590Y9l.getUuid();
        C869590Y9l c869590Y9l2 = this.LLILLL;
        if (c869590Y9l2 != null) {
            uuid = c869590Y9l2.getUuid();
        } else {
            uuid = null;
        }
        if (Intrinsics.LJFF(uuid3, uuid)) {
            setStateImmediate(new AwS128S1100000_14(c869590Y9l, C1710306mr.LIZIZ(R.string.dm_fortuneCookie_inline_nickOpenedCookie, vQ2(c869590Y9l)), 6));
        }
        String uuid4 = c869590Y9l.getUuid();
        C869590Y9l c869590Y9l3 = this.LLILZ;
        if (c869590Y9l3 != null) {
            uuid2 = c869590Y9l3.getUuid();
        } else {
            uuid2 = null;
        }
        if (Intrinsics.LJFF(uuid4, uuid2)) {
            ((Keva) this.LLILLJJLI.getValue()).storeBoolean("key_fortune_cookie_receive_notice_showed", true);
            this.LLILZ = null;
            setStateImmediate(AFwS248S0000000_14.get$arr$(132));
        }
    }

    public final void wQ2(C869590Y9l c869590Y9l) {
        InteractionCardTemplate interactionCardTemplate = (InteractionCardTemplate) C0Z2Z.LIZ(c869590Y9l, InteractionCardTemplate.class);
        if (interactionCardTemplate != null) {
            FortuneCookieInfoComponent fortuneCookieInfoComponent = interactionCardTemplate.fortuneCookieInfoComponent;
            if (fortuneCookieInfoComponent != null && fortuneCookieInfoComponent.show) {
                if (!C898460ZMm.LIZ(c869590Y9l)) {
                    yQ2(c869590Y9l);
                    AQ2(c869590Y9l);
                }
                if (interactionCardTemplate == null) {
                    return;
                }
            }
            FortuneCookieInfoComponent fortuneCookieInfoComponent2 = interactionCardTemplate.fortuneCookieInfoComponent;
            if (fortuneCookieInfoComponent2 != null && !fortuneCookieInfoComponent2.show && C898460ZMm.LIZ(c869590Y9l)) {
                zQ2(c869590Y9l);
            }
        }
    }

    public final void yQ2(C869590Y9l c869590Y9l) {
        this.LLILZIL.remove(c869590Y9l.getUuid());
        if (!Intrinsics.LJFF(c869590Y9l.getLocalExt().get("fortune_cookie_opened"), "1")) {
            c869590Y9l.getLocalExt().put("fortune_cookie_opened", "1");
            C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "fortune_cookie_opened", new C0Y3R("1"), new C0Y3I("FortuneCookie message update fortune_cookie_opened"));
        }
    }

    public final void zQ2(C869590Y9l c869590Y9l) {
        InteractionCardTemplate interactionCardTemplate = (InteractionCardTemplate) C0Z2Z.LIZ(c869590Y9l, InteractionCardTemplate.class);
        if (interactionCardTemplate == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C898450ZMl(interactionCardTemplate, c869590Y9l, null), 2);
    }

    public static String xQ2(String str, String str2) {
        C0VSJ c0vsj = new C0VSJ(str, str2);
        if (!c0vsj.exists()) {
            return null;
        }
        return c0vsj.getAbsolutePath();
    }
}
