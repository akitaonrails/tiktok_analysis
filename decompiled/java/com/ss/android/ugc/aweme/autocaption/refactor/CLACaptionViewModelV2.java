package com.ss.android.ugc.aweme.autocaption.refactor;

import X.AnonymousClass1604;
import X.C01GW;
import X.C0Q69;
import X.C0RT2;
import X.C0XQ7;
import X.C160A;
import X.C160B;
import X.C160C;
import X.C160E;
import X.C160Q;
import X.C160S;
import X.C160Z;
import X.C20703415zs;
import X.C20703515zt;
import X.C207044160c;
import X.C292300Bcy;
import X.C452501pT;
import X.C710840RuU;
import X.C746760TRa;
import X.InterfaceC0148002o;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public final class CLACaptionViewModelV2 extends FeedBaseViewModel<C160C> implements C160S {
    public final C01GW LL = C452501pT.LIZIZ(new C160E(this));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C160Q(this));

    @Override // X.InterfaceC20703115zp
    public final boolean YF0() {
        C20703515zt c20703515zt = C20703515zt.LIZ;
        VideoItemParams videoItemParams = getVideoItemParams();
        Aweme aweme = videoItemParams != null ? videoItemParams.getAweme() : null;
        c20703515zt.getClass();
        return !C20703515zt.LIZIZ(C20703515zt.LJIIIZ(aweme));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C160C(new C710840RuU("", C160B.HIDDEN, false, null), new C160Z(false), new C20703415zs(false, ""));
    }

    public final C207044160c vQ2() {
        return (C207044160c) this.LLILLJJLI.getValue();
    }

    public final C160A wQ2() {
        return (C160A) this.LL.getValue();
    }

    @Override // X.C160K
    public final void EK() {
        wQ2().EK();
        vQ2().getClass();
    }

    @Override // X.InterfaceC20703115zp
    public final String ID() {
        return wQ2().ID();
    }

    @Override // X.InterfaceC20703115zp
    public final double LF1() {
        return wQ2().LLIZ;
    }

    @Override // X.InterfaceC20703115zp
    public final String getAwemeId() {
        return AnonymousClass1604.LIZ(this);
    }

    @Override // X.InterfaceC20703115zp
    public final VideoItemParams getVideoItemParams() {
        return getItem();
    }

    @Override // X.InterfaceC20703115zp
    public final boolean rK() {
        return AnonymousClass1604.LIZIZ(this);
    }

    @Override // X.InterfaceC20703115zp
    public final boolean w1() {
        return wQ2().LLIZLLLIL;
    }

    @Override // X.C160K
    public final void En1(VideoItemParams videoItemParams) {
        wQ2().En1(videoItemParams);
        vQ2().En1(videoItemParams);
    }

    @Override // X.C160K
    public final void PU1(Context context) {
        Aweme aweme;
        String strLIZ;
        wQ2().PU1(context);
        vQ2().getClass();
        VideoItemParams item = getItem();
        if (item != null && (aweme = item.getAweme()) != null && Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), C0XQ7.LJFF().getCurUserId()) && (strLIZ = AnonymousClass1604.LIZ(this)) != null) {
            ICaptionKevaService iCaptionKevaServiceLIZ = C746760TRa.LIZ();
            if (AnonymousClass1604.LIZIZ(this) && iCaptionKevaServiceLIZ.LJJIJ(strLIZ)) {
                iCaptionKevaServiceLIZ.LJJLI(strLIZ);
            }
        }
    }

    @Override // X.C160K
    public final void cL2(boolean z) {
        wQ2().cL2(z);
        vQ2().cL2(z);
    }

    @Override // X.C160K
    public final void vD2(C0Q69 c0q69) throws JSONException {
        wQ2().vD2(c0q69);
        vQ2().vD2(c0q69);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        C160C c160c = (C160C) interfaceC0148002o;
        En1(videoItemParams);
        if (C292300Bcy.LIZ) {
            C0RT2.LIZ().LJIIIIZZ(videoItemParams.getAweme());
        }
        super.paramSync2StateAccept(c160c, videoItemParams);
        return c160c;
    }
}
