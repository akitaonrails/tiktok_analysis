package com.ss.android.ugc.aweme.feed.adapter;

import X.AbstractC848400XPy;
import X.C086I;
import X.C0R6M;
import X.C0R93;
import X.C0RF0;
import X.C0S00;
import X.C0S0L;
import X.C0XQ7;
import X.C1440005kM;
import X.C1480420ocy;
import X.C1591530rWB;
import X.C15O7;
import X.C335610DDr;
import X.C584270Mvp;
import X.C690440R6k;
import X.C738940Syi;
import X.InterfaceC2385309Wh;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class FullFeedVideoViewHolder extends VideoViewCell {
    public static final /* synthetic */ int U0 = 0;
    public final C0S00 T0;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public int LLLIIL() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final C584270Mvp LLLLLJIL() {
        return new C584270Mvp(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void u0() {
        this.T0.LIZLLL();
        if (this.T0.LIZ()) {
            this.T0.LIZJ();
        } else {
            super.u0();
        }
    }

    public static boolean v1() {
        if (C0XQ7.LJFF() != null) {
            return (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || ((AccountUserService) C0XQ7.LJFF()).LIZ() || ((((System.currentTimeMillis() / 1000) - ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getRegisterTime()) > 604800L ? 1 : (((System.currentTimeMillis() / 1000) - ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getRegisterTime()) == 604800L ? 0 : -1)) < 0)) ? false : true;
        }
        return false;
    }

    public final SuperEntranceEvent p1() {
        ISpecialPlusService iSpecialPlusServiceSpecialPlusService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService();
        AnchorCommonStruct anchorCommonStructS1 = s1(this.LLJJ.getAnchors());
        if (anchorCommonStructS1 == null) {
            return null;
        }
        String id = anchorCommonStructS1.getId();
        ISpecialPlusService iSpecialPlusServiceSpecialPlusService2 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService();
        AnchorCommonStruct anchorCommonStructS12 = s1(this.LLJJ.getAnchors());
        if (anchorCommonStructS12 != null) {
            boolean zIsTransformationLimitHit = iSpecialPlusServiceSpecialPlusService2.isTransformationLimitHit(anchorCommonStructS12.getId(), getEventType());
            boolean zIsEffectVideoPlusEnabled = iSpecialPlusServiceSpecialPlusService2.isEffectVideoPlusEnabled();
            boolean z = (anchorCommonStructS12.getThumbnail() == null || anchorCommonStructS12.getThumbnail().getUrlList() == null || anchorCommonStructS12.getThumbnail().getUrlList().isEmpty() || TextUtils.isEmpty((CharSequence) ListProtector.get(anchorCommonStructS12.getThumbnail().getUrlList(), 0))) ? false : true;
            boolean z2 = TextUtils.equals(getEventType(), "homepage_follow") || TextUtils.equals(getEventType(), "homepage_hot");
            if (zIsEffectVideoPlusEnabled && z && v1() && z2 && !zIsTransformationLimitHit) {
                SuperEntranceEvent superEntranceEvent = new SuperEntranceEvent(5, true);
                superEntranceEvent.setEffectId(id);
                superEntranceEvent.setTab(getEventType());
                superEntranceEvent.setIconUrl((String) ListProtector.get(anchorCommonStructS1.getThumbnail().getUrlList(), 0));
                superEntranceEvent.setEffectSceneAwemeId(this.LLJJ.getAid());
                String eventType = getEventType();
                HashMap<String, Integer> transformationsCountMap = iSpecialPlusServiceSpecialPlusService.getTransformationsCountMap(eventType);
                Integer num = transformationsCountMap.get(id);
                if (num == null) {
                    num = 0;
                }
                transformationsCountMap.put(id, Integer.valueOf(num.intValue() + 1));
                iSpecialPlusServiceSpecialPlusService.setTransformationsCountMap(transformationsCountMap, eventType);
                iSpecialPlusServiceSpecialPlusService.setLastTransformationDate(System.currentTimeMillis());
                return superEntranceEvent;
            }
        }
        return new SuperEntranceEvent(0, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public void unBind() {
        super.unBind();
        this.T0.LIZIZ();
    }

    public FullFeedVideoViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
        this.T0 = new C0S00(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LJIIZILJ(boolean z) {
        TextUtils.equals(getEventType(), "homepage_follow");
        if (C0R93.LIZ(getEventType()) && C690440R6k.LIZ().LIZJ) {
            z = C690440R6k.LIZ().LIZJ;
        }
        if (C0R93.LIZLLL(getEventType()) && C690440R6k.LIZ().LIZLLL) {
            z = C690440R6k.LIZ().LIZLLL;
        }
        if (C0R93.LIZJ(getEventType())) {
            C690440R6k.LIZ().getClass();
        }
        if (C1591530rWB.LIZIZ.N7(getEventType()) && C690440R6k.LIZ().LIZIZ(this.LLJILJILJ.LJIIJ)) {
            z = C690440R6k.LIZ().LIZIZ(this.LLJILJILJ.LJIIJ);
        }
        if (C0R93.LJ(getEventType())) {
            C690440R6k.LIZ().getClass();
        }
        if (TextUtils.equals(getEventType(), "homepage_topic_stem") && C690440R6k.LIZ().LJFF) {
            z = C690440R6k.LIZ().LJFF;
        }
        if (C0R93.LJFF(getEventType()) && C690440R6k.LIZ().LJII) {
            z = C690440R6k.LIZ().LJII;
        }
        if (C0R93.LJI(getEventType()) && C690440R6k.LIZ().LJI) {
            z = C690440R6k.LIZ().LJI;
        }
        super.LJIIZILJ(z);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        C0S0L c0s0l = C0S0L.LIZ;
        Context context = this.LLLLLLLLLL;
        Aweme aweme = this.LLJJ;
        c0s0l.getClass();
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && aweme.getAwemeRawAd() != null) {
            C335610DDr.LIZ(context, "commerce old");
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIL(C0R6M c0r6m) {
        super.LJJIL(c0r6m);
        if (c0r6m.LIZ == "HOME" && c0r6m.LIZIZ != "HOME") {
            C1440005kM.LIZ(new SuperEntranceEvent(0, false));
        }
        if (c0r6m.LIZIZ == "HOME" && c0r6m.LIZ != "HOME") {
            SuperEntranceEvent superEntranceEventP1 = p1();
            superEntranceEventP1.getClass();
            C1440005kM.LIZ(superEntranceEventP1);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LJJJJJ(long j) {
        super.LJJJJJ(j);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void W0(Aweme aweme) {
        ISuperEntranceService iSuperEntranceServiceSuperEntranceService;
        Aweme aweme2;
        if (this.LLJJI != 0 && C0XQ7.LJFF() != null) {
            if ((((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && (aweme2 = this.LLJJ) != null && TextUtils.equals(AwemeExtKt.getAuthorUid(aweme2), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) || (iSuperEntranceServiceSuperEntranceService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).superEntranceService()) == null || !iSuperEntranceServiceSuperEntranceService.shouldShowSuperEntranceRecord(this.LLLLLLLLLL)) {
                return;
            }
            List<String> superEntranceEffectList = iSuperEntranceServiceSuperEntranceService.getSuperEntranceEffectList();
            NewFaceStickerBean stickerEntranceInfo = aweme.getStickerEntranceInfo();
            if (stickerEntranceInfo != null && !C086I.LIZIZ(superEntranceEffectList) && superEntranceEffectList.contains(stickerEntranceInfo.id)) {
                C1440005kM.LIZ(new SuperEntranceEvent(1, true));
                iSuperEntranceServiceSuperEntranceService.setShowedSuperEntranceTab();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public void h(boolean z) {
        super.h(z);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        int i;
        super.onRenderFirstFrame(c1480420ocy);
        if (TextUtils.equals(getEventType(), "homepage_hot")) {
            System.currentTimeMillis();
        }
        final Aweme aweme = this.LLJJ;
        if (this.LLJJI == 0) {
            i = 2000;
        } else {
            i = 0;
        }
        C15O7.LJIIIIZZ(i).LJ(new C738940Syi(this, ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService(), aweme, 1), C15O7.LJI, null).LJII(new InterfaceC2385309Wh() { // from class: X.0S0J
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                SuperEntranceEvent superEntranceEvent;
                FullFeedVideoViewHolder fullFeedVideoViewHolder = this.LIZ;
                Aweme aweme2 = aweme;
                int i2 = FullFeedVideoViewHolder.U0;
                fullFeedVideoViewHolder.getClass();
                C1C7U.LIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$2L");
                try {
                    String str = (String) c15o7.LJIIL();
                    new SuperEntranceEvent(0, false);
                    if (TextUtils.equals(str, "show")) {
                        superEntranceEvent = new SuperEntranceEvent(3, true);
                    } else if (fullFeedVideoViewHolder.s1(aweme2.getAnchors()) != null) {
                        superEntranceEvent = fullFeedVideoViewHolder.p1();
                    } else if (TextUtils.equals(str, "hide")) {
                        superEntranceEvent = new SuperEntranceEvent(3, false);
                    } else if (TextUtils.equals(str, "normal")) {
                        superEntranceEvent = new SuperEntranceEvent(0, false);
                    } else {
                        superEntranceEvent = new SuperEntranceEvent(0, false);
                    }
                    superEntranceEvent.getClass();
                    C1440005kM.LIZ(superEntranceEvent);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C1C7U.LIZIZ("FullFeedVideoViewHolder@4b3c.tryShowSpecialPlus$2L");
                return null;
            }
        }, C15O7.LJIIIIZZ);
    }

    public final AnchorCommonStruct s1(List<AnchorCommonStruct> list) {
        if (list != null && !list.isEmpty()) {
            for (AnchorCommonStruct anchorCommonStruct : list) {
                if (anchorCommonStruct.getType() == 28) {
                    return anchorCommonStruct;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void K(View view, boolean z) {
        TextUtils.equals(getEventType(), "homepage_follow");
        if (C0R93.LIZ(getEventType()) && C690440R6k.LIZ().LIZJ) {
            z = C690440R6k.LIZ().LIZJ;
        }
        if (C0R93.LIZLLL(getEventType()) && C690440R6k.LIZ().LIZLLL) {
            z = C690440R6k.LIZ().LIZLLL;
        }
        if (C0R93.LIZJ(getEventType())) {
            C690440R6k.LIZ().getClass();
        }
        if (C1591530rWB.LIZIZ.N7(getEventType()) && C690440R6k.LIZ().LIZIZ(this.LLJILJILJ.LJIIJ)) {
            z = C690440R6k.LIZ().LIZIZ(this.LLJILJILJ.LJIIJ);
        }
        if (C0R93.LJ(getEventType())) {
            C690440R6k.LIZ().getClass();
        }
        if (TextUtils.equals(getEventType(), "homepage_topic_stem") && C690440R6k.LIZ().LJFF) {
            z = C690440R6k.LIZ().LJFF;
        }
        if (C0R93.LJFF(getEventType()) && C690440R6k.LIZ().LJII) {
            z = C690440R6k.LIZ().LJII;
        }
        if (C0R93.LJI(getEventType()) && C690440R6k.LIZ().LJI) {
            z = C690440R6k.LIZ().LJI;
        }
        super.K(view, z);
    }
}
