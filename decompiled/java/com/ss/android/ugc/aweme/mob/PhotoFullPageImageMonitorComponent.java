package com.ss.android.ugc.aweme.mob;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0SAX;
import X.C0SMF;
import X.C0SRL;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C716890SAd;
import X.C716920SAg;
import X.C716930SAh;
import X.C716960SAk;
import X.InterfaceC469360Ias;
import X.InterfaceC719500SKe;
import Y.AObserverS176S0200000_11;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.FullPageHostAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.mob.PhotoFullPageImageMonitorComponent;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoFullPageImageMonitorComponent extends AbstractC738140SxQ {
    public final C0SAX LL = new C0SAX();
    public final C630740Ooa LLILLJJLI = C628500Oky.LIZ(new AwS555S0100000_11(this, 515));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 514));
    public final C716930SAh LLILZ = new InterfaceC469360Ias() { // from class: X.0SAh
        @Override // X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // X.InterfaceC469360Ias
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // X.InterfaceC469360Ias
        public final void onPageSelected(int i) {
            PhotoFullPageImageMonitorComponent photoFullPageImageMonitorComponent = this.LL;
            int i2 = photoFullPageImageMonitorComponent.LLIZ;
            if (i2 != i) {
                photoFullPageImageMonitorComponent.LL.LIZIZ(i2);
                this.LL.LL.LIZJ(i);
            }
            this.LL.LLIZ = i;
        }
    };
    public final C716890SAd LLILZIL = new InterfaceC719500SKe() { // from class: X.0SAd
        @Override // X.InterfaceC719500SKe
        public final void p2(SlidesImageLoadParams slidesImageLoadParams) {
            this.LL.LL.LIZLLL(slidesImageLoadParams);
        }

        @Override // X.InterfaceC719500SKe
        public final void u6(SlidesImageLoadParams slidesImageLoadParams) {
            this.LL.LL.LIZLLL(slidesImageLoadParams);
        }

        @Override // X.InterfaceC719500SKe
        public final void n5(int i, JSONObject jSONObject) {
            String strOptString;
            C0SAX c0sax = this.LL.LL;
            c0sax.getClass();
            try {
                C0SAZ c0sazLIZ = c0sax.LIZ(i);
                if (jSONObject != null) {
                    strOptString = jSONObject.optString("hit_cdn_cache");
                } else {
                    strOptString = null;
                }
                c0sazLIZ.LJIIIIZZ = strOptString;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    };
    public final C716920SAg LLILZLL = new C0SMF() { // from class: X.0SAg
        @Override // X.C0SMF
        public final void Yb() {
        }

        @Override // X.C0SMF
        public final void wd(int i) {
            this.LL.LL.LJ(i);
        }
    };
    public int LLIZ = -1;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final FullPageHostAbility bo() {
        return (FullPageHostAbility) this.LLILLJJLI.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        C0SRL c0srlAR1;
        Aweme aweme;
        Aweme aweme2;
        super.onCreate();
        VideoItemParams videoItemParams = ((C716960SAk) this.LLILLL.getValue()).LIZ;
        Integer numValueOf = null;
        String aid = (videoItemParams == null || (aweme2 = videoItemParams.getAweme()) == null) ? null : aweme2.getAid();
        VideoItemParams videoItemParams2 = ((C716960SAk) this.LLILLL.getValue()).LIZ;
        String str = videoItemParams2 != null ? videoItemParams2.mEventType : null;
        C0SAX c0sax = this.LL;
        VideoItemParams videoItemParams3 = ((C716960SAk) this.LLILLL.getValue()).LIZ;
        if (videoItemParams3 != null && (aweme = videoItemParams3.getAweme()) != null) {
            numValueOf = Integer.valueOf(AwemeBizOptExtKt.getAwemeCacheType(aweme));
        }
        c0sax.LIZJ = aid;
        c0sax.LJ = str;
        c0sax.LJFF = Boolean.TRUE;
        c0sax.LIZLLL = numValueOf;
        FullPageHostAbility fullPageHostAbilityBo = bo();
        if (fullPageHostAbilityBo == null || (c0srlAR1 = fullPageHostAbilityBo.AR1()) == null) {
            return;
        }
        c0srlAR1.LJIIIIZZ.LLJLIL.observe(this, new AObserverS176S0200000_11(this, c0srlAR1, 2));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LL.LIZIZ(this.LLIZ);
        FullPageHostAbility fullPageHostAbilityBo = bo();
        if (fullPageHostAbilityBo != null) {
            fullPageHostAbilityBo.b3(this.LLILZ);
        }
        FullPageHostAbility fullPageHostAbilityBo2 = bo();
        if (fullPageHostAbilityBo2 != null) {
            fullPageHostAbilityBo2.Qt(this.LLILZIL);
        }
        FullPageHostAbility fullPageHostAbilityBo3 = bo();
        if (fullPageHostAbilityBo3 != null) {
            fullPageHostAbilityBo3.tj(this.LLILZLL);
        }
        C0SAX c0sax = this.LL;
        c0sax.LIZJ = null;
        c0sax.LJ = null;
        c0sax.LJFF = null;
        c0sax.LIZLLL = null;
        c0sax.LIZIZ.LIZLLL(null, null, AFwS198S0000000_11.get$arr$(538));
        ((LinkedHashMap) c0sax.LIZ).clear();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LL.LIZIZ(this.LLIZ);
    }
}
