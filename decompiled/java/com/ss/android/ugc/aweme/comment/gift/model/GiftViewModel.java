package com.ss.android.ugc.aweme.comment.gift.model;

import X.AbstractC2126608Uu;
import X.C01GW;
import X.C0CQT;
import X.C11IR;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1345170l6p;
import X.C1701940uOG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.InterfaceC1803980x2q;
import Y.AfS190S0100000_21;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.gift.api.GiftListApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class GiftViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(115));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(113));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(114));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(112));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(116));
    public String LLILZLL = "";
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public Integer LLJI = 0;
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public String LLJILJILJ = "comment_panel_outer";
    public final MutableLiveData<Integer> LLJILLL = new MutableLiveData<>();
    public boolean LLJJ;
    public Aweme LLJJI;

    public final void AQ2() {
        String str = this.LLJILJIL;
        if (str == null || str.length() == 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILZLL);
        c2344009Gk.LJIIIIZZ("group_id", this.LLIZ);
        c2344009Gk.LJIIIIZZ("author_id", this.LLIZLLLIL);
        c2344009Gk.LIZJ(C1345170l6p.LIZ(this.LLJJI), "is_follow");
        c2344009Gk.LIZJ(C1345170l6p.LIZ(this.LLJJI), "is_like");
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJILJIL);
        c2344009Gk.LJ(this.LLJI, "is_success");
        c2344009Gk.LJIIIIZZ("error_code", this.LLJIJIL);
        C20684815ws.LJIILLIIL("show_gift_panel_result", c2344009Gk.LIZ);
    }

    public final MutableLiveData<Long> vQ2() {
        return (MutableLiveData) this.LLILZ.getValue();
    }

    public final MutableLiveData<GiftStruct> wQ2() {
        return (MutableLiveData) this.LLILLJJLI.getValue();
    }

    public final MutableLiveData<HashMap<Long, String>> xQ2() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    public final MutableLiveData<GiftResponse> yQ2() {
        return (MutableLiveData) this.LL.getValue();
    }

    public final void PF2(String str, String str2) {
        C11NZ<GiftResponse> giftList;
        yQ2().getValue();
        try {
            if (GiftListApi.LIZ == null) {
                GiftListApi.LIZ = (GiftListApi.FetchGiftListApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(GiftListApi.FetchGiftListApi.class);
            }
            giftList = GiftListApi.LIZ.getGiftList(str, str2, 0);
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            giftList = C11IR.LL;
        }
        new C11NJ().LIZ(giftList.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS190S0100000_21(this, 17), new AfS190S0100000_21(this, 18)));
    }

    public final void zQ2(Integer num, Long l, Long l2) {
        Long value = vQ2().getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILZLL);
        c2344009Gk.LJIIIIZZ("group_id", this.LLIZ);
        c2344009Gk.LJIIIIZZ("author_id", this.LLIZLLLIL);
        c2344009Gk.LJ(l, "product_id");
        c2344009Gk.LJ(num, "is_success");
        c2344009Gk.LJ(l2, "previous_balance");
        c2344009Gk.LJ(value, "new_balance");
        C20684815ws.LJIILLIIL("confirm_coin_recharge", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0lDL] */
    public final void BQ2(final int i, final long j, final Context context, final String str) {
        final Long value = vQ2().getValue();
        vQ2().setValue(Long.MIN_VALUE);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJJJLI(new InterfaceC1803980x2q() { // from class: X.0lDL
            @Override // X.InterfaceC1803980x2q
            public final void LIZ(long j2) {
                this.LIZ.vQ2().setValue(Long.valueOf(j2));
                if (Intrinsics.LJFF(str, "from_recharge")) {
                    this.LIZ.zQ2(Integer.valueOf(i), Long.valueOf(j), value);
                }
            }

            @Override // X.InterfaceC1803980x2q
            public final void LIZIZ(Throwable th) {
                this.LIZ.vQ2().setValue(Long.MIN_VALUE);
                C2344009Gk c2344009Gk = new C2344009Gk();
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                c2344009Gk.LJIIIIZZ("failure_reason", message);
                c2344009Gk.LJIIIIZZ("enter_from", this.LIZ.LLILZLL);
                C20684815ws.LJIILLIIL("refresh_coin_balance_fail", c2344009Gk.LIZ);
                if (Intrinsics.LJFF(str, "from_recharge")) {
                    this.LIZ.zQ2(Integer.valueOf(i), Long.valueOf(j), value);
                }
                if (context != null) {
                    C1233040iBy c1233040iBy = new C1233040iBy(context);
                    c1233040iBy.LIZIZ(2131858205);
                    c1233040iBy.LIZLLL();
                }
            }
        });
    }
}
