package com.ss.android.ugc.aweme.favorites.guide.button.sensor;

import X.AbstractC616030OEf;
import X.C01GW;
import X.C13LE;
import X.C14EU;
import X.C1618440sDa;
import X.C2217381BqS;
import X.C452501pT;
import X.C609840Nvy;
import X.C609850Nvz;
import X.C638900P4e;
import X.C698680Ras;
import X.C704830Rkn;
import X.C729510SjV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC706770Rnv;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class FavoriteGuideButtonSensor extends AbstractC616030OEf<VideoItemParams> {
    public static final C609840Nvy LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final Lifecycle LLILZIL;
    public final C638900P4e LLILZLL;
    public final C01GW LLIZ;
    public VideoItemParams LLIZLLLIL;
    public boolean LLJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Nvy] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FavoriteGuideButtonSensor.class, "videoFavoriteVM", "getVideoFavoriteVM()Lcom/ss/android/ugc/aweme/feed/favorite/VideoFavoriteVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new Object() { // from class: X.0Nvy
        };
    }

    @Override // X.AbstractC616030OEf
    public final void LIZJ() {
        EventBus.LIZLLL().LJIJJ(this);
        this.LLILZIL.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.favorites.guide.button.sensor.FavoriteGuideButtonSensor$onInit$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    EventBus.LIZLLL().LJJI(this.LL);
                }
            }
        });
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public FavoriteGuideButtonSensor(Lifecycle lifecycle) {
        super("bottom_button_favorite_guide");
        this.LLILZIL = lifecycle;
        this.LLILZLL = new C638900P4e(this, C13LE.LIZ(VideoFavoriteVM.class), 0);
        this.LLIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(104));
    }

    @Override // X.AbstractC616030OEf
    public final boolean LIZLLL(C698680Ras c698680Ras) {
        boolean zIsLogin;
        Fragment fragment;
        Aweme aweme;
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            zIsLogin = accountUserServiceLJIIJ.isLogin();
        } else {
            zIsLogin = false;
        }
        if (this.LLJ || !((Boolean) this.LLIZ.getValue()).booleanValue() || !zIsLogin) {
            return false;
        }
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
        VideoItemParams videoItemParams = this.LLIZLLLIL;
        if (videoItemParams != null) {
            fragment = videoItemParams.fragment;
        } else {
            fragment = null;
        }
        boolean zLJJIIJZLJL = interfaceC706770RnvLJJIIJ.LJJIIJZLJL(fragment);
        VideoItemParams videoItemParams2 = this.LLIZLLLIL;
        if (videoItemParams2 == null || (aweme = videoItemParams2.getAweme()) == null || C729510SjV.LJJIJIL(aweme) || aweme.isAd() || AwemeSaaSExtKt.isLive(aweme) || zLJJIIJZLJL) {
            return false;
        }
        return true;
    }

    @C14EU
    public final void onFavoriteClickEvent(C609850Nvz c609850Nvz) {
        String aid;
        Aweme aweme;
        VideoItemParams videoItemParams = this.LLIZLLLIL;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, c609850Nvz.LIZIZ)) {
            this.LLJ = !c609850Nvz.LIZ;
        }
        LJ(false);
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        Map<String, Object> map;
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        C609840Nvy c609840Nvy = LLJI;
        C704830Rkn c704830Rkn = this.LLILLL;
        boolean zIsCollected = false;
        Object value = this.LLILZLL.getValue(this, LLJIJIL[0]);
        c609840Nvy.getClass();
        if (c704830Rkn != null && (map = c704830Rkn.LJFF) != null) {
            map.put("vm_video_favorite", value);
        }
        if (videoItemParams != null) {
            this.LLIZLLLIL = videoItemParams;
            Aweme aweme = videoItemParams.getAweme();
            if (aweme != null) {
                zIsCollected = AwemeExtKt.isCollected(aweme);
            }
            this.LLJ = zIsCollected;
        }
    }
}
