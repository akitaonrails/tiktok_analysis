package com.ss.android.ugc.aweme.recommendationcard.view;

import X.AbstractC197104129u;
import X.AnonymousClass0956;
import X.C0XF1;
import X.C12A7;
import X.C12A8;
import X.C12AA;
import X.C12AW;
import X.C13LP;
import X.C1449260noi;
import X.C1479530obX;
import X.C1479720obq;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481240oeI;
import X.C1481290oeN;
import X.C1697810uHb;
import X.C197101129r;
import X.C197103129t;
import X.C204674156y;
import X.C2084808Es;
import X.C2097608Jq;
import X.C23250099c;
import X.C2470809mE;
import X.C560530Lyd;
import X.C583620Mum;
import X.EnumC2281141EQm;
import X.InterfaceC1482650ogZ;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.data.EffectStructV2;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectRecommendationCarouselViewModel extends EffectRecommendationBaseViewModel<AbstractC197104129u, C197103129t> implements OnUIPlayListener {
    public final C560530Lyd<C12AA> LLIZ;
    public final C560530Lyd LLIZLLLIL;
    public InterfaceC1482650ogZ LLJ;
    public final Map<Integer, InterfaceC1482650ogZ> LLJI;
    public final List<Aweme> LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public AnonymousClass0956 LLJJ;
    public final ConcurrentHashMap<Integer, int[]> LLJJI;
    public final GradientDrawable LLJJIII;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        C583620Mum.LIZIZ(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C583620Mum.LIZJ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C583620Mum.LIZLLL(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C583620Mum.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str) {
        C583620Mum.LJIIIIZZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
        C583620Mum.LJIIIZ(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C583620Mum.LJIIJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C583620Mum.LJIIL(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C583620Mum.LJIILIIL(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJIILJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLoopPlay(String str, int i) {
        C583620Mum.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str) {
        C583620Mum.LJIJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C583620Mum.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C583620Mum.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C583620Mum.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C583620Mum.LJJIJIIJI(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C583620Mum.LJJIJIL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C583620Mum.LJJIJL(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C583620Mum.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJL(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSecondFrame(String str) {
        C583620Mum.LJJJLZIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C583620Mum.LJJJZ(this, str, i, i2);
    }

    public final Aweme CQ2() {
        List<CardContent> list;
        List<Aweme> list2;
        C197103129t c197103129t = (C197103129t) this.LLILZIL.getValue();
        if (c197103129t == null || (list = c197103129t.LIZJ) == null) {
            return null;
        }
        Integer num = c197103129t.LJI;
        CardContent cardContent = (CardContent) C13LP.LJJJLZIJ(num != null ? num.intValue() : 0, list);
        if (cardContent == null || (list2 = cardContent.awemeList) == null) {
            return null;
        }
        return (Aweme) ListProtector.get(list2, 0);
    }

    public final void DQ2() {
        C197103129t c197103129t;
        C197103129t c197103129t2;
        if (!this.LLJILJIL || this.LLJILLL || (c197103129t = (C197103129t) this.LLILZIL.getValue()) == null || c197103129t.LJ == null || (c197103129t2 = (C197103129t) this.LLILZIL.getValue()) == null) {
            return;
        }
        List<CardContent> list = c197103129t2.LIZJ;
        if (list != null) {
            int i = 0;
            for (CardContent cardContent : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                CardContent cardContent2 = cardContent;
                List<Aweme> list2 = cardContent2.awemeList;
                Aweme aweme = list2 != null ? (Aweme) C13LP.LJJJLL(list2) : null;
                String str = c197103129t2.LJ;
                String strLIZ = str != null ? C2084808Es.LIZ(str) : null;
                Integer numValueOf = Integer.valueOf(FQ2(Integer.valueOf(i)));
                EffectStructV2 effectStructV2 = cardContent2.effect;
                C197101129r.LIZ(null, numValueOf, effectStructV2 != null ? effectStructV2.effectId : null, "prop_carousel", strLIZ, aweme != null ? aweme.getAid() : null);
                i = i2;
            }
        }
        Object value = this.LLILLJJLI.getValue();
        String str2 = c197103129t2.LJ;
        value.getClass();
        C12AW.LIZLLL(str2);
        this.LLJILLL = true;
    }

    public final void GQ2() {
        C560530Lyd<C12AA> c560530Lyd = this.LLIZ;
        C197103129t c197103129t = (C197103129t) this.LLILZIL.getValue();
        c560530Lyd.LJIIJ(new C12A8(c197103129t != null ? c197103129t.LJI : null));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public EffectRecommendationCarouselViewModel() {
        C560530Lyd<C12AA> c560530Lyd = new C560530Lyd<>();
        this.LLIZ = c560530Lyd;
        this.LLIZLLLIL = c560530Lyd;
        this.LLJI = new LinkedHashMap();
        this.LLJIJIL = new ArrayList();
        this.LLJILJILJ = true;
        this.LLJJI = new ConcurrentHashMap<>();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.rgb(33, 33, 33), -16777216});
        gradientDrawable.setCornerRadius(0.0f);
        this.LLJJIII = gradientDrawable;
        this.LLILZIL.setValue((S) new C197103129t(0));
    }

    public final void Gn() {
        InterfaceC1482650ogZ interfaceC1482650ogZ;
        Aweme awemeCQ2 = CQ2();
        Video video = awemeCQ2 != null ? awemeCQ2.getVideo() : null;
        if (!this.LLJILJIL || (interfaceC1482650ogZ = this.LLJ) == null || !interfaceC1482650ogZ.Da() || video == null) {
            return;
        }
        video.setDuration(2000.0d);
        C1479720obq c1479720obq = new C1479720obq();
        SimVideo simVideoLIZLLL = C1481240oeI.LIZLLL(video);
        C1479530obX c1479530obX = c1479720obq.LIZ;
        c1479530obX.LIZLLL = simVideoLIZLLL;
        c1479530obX.LJIILLIIL = true;
        c1479530obX.LJJJLL = true;
        c1479530obX.LJIIJ = true;
        c1479530obX.LJJJJLL = LSPassThroughRecordSizeConfig.DEFAULT;
        C1479530obX c1479530obXLIZ = c1479720obq.LIZ();
        wQ2().LJJIJ(this);
        wQ2().LJJJJJL(c1479530obXLIZ);
    }

    public static int FQ2(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return 1;
            }
            if (num.intValue() == 1) {
                return 3;
            }
            if (num.intValue() == 2) {
                return 2;
            }
            return -1;
        }
        return -1;
    }

    public static Integer zQ2(C204674156y c204674156y) {
        c204674156y.LJFF(80.0f);
        c204674156y.LJ(0.1f, 0.2f, 0.3f, 0.5f, 0.0f);
        c204674156y.LJI(0.0f);
        return c204674156y.LIZIZ();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void AQ2(Context context) {
        Object objLIZ;
        if (C0XF1.LIZLLL(context)) {
            Gn();
            DQ2();
            return;
        }
        MutableLiveData<S> mutableLiveData = this.LLILZIL;
        C197103129t c197103129t = (C197103129t) mutableLiveData.getValue();
        if (c197103129t != null) {
            objLIZ = C197103129t.LIZ(c197103129t, null, null, null, null, true, null, null, 223);
        } else {
            objLIZ = null;
        }
        mutableLiveData.setValue((S) objLIZ);
    }

    public final Drawable BQ2(Integer num) {
        int[] iArr = this.LLJJI.get(num);
        if (iArr == null) {
            return this.LLJJIII;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(0.0f);
        return gradientDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00be -> B:14:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d7 -> B:12:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel.EQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x041c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(X.AbstractC197104129u r46) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel.xQ2(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
        GQ2();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        Integer num;
        C583620Mum.LJJJIL(this, str, c1480420ocy);
        C560530Lyd<C12AA> c560530Lyd = this.LLIZ;
        C197103129t c197103129t = (C197103129t) this.LLILZIL.getValue();
        String aid = null;
        if (c197103129t != null) {
            num = c197103129t.LJI;
        } else {
            num = null;
        }
        c560530Lyd.LJIIJ(new C12A7(num));
        AnonymousClass0956 anonymousClass0956 = this.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (this.LLJILJILJ) {
            this.LLJJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2470809mE(this, null), 3);
        }
        Aweme awemeCQ2 = CQ2();
        if (awemeCQ2 != null) {
            aid = awemeCQ2.getAid();
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enter_from", "homepage_hot_card");
        if (aid == null) {
            aid = "";
        }
        pairArr[1] = new Pair("group_id", aid);
        C1449260noi.LJ("video_play", C2097608Jq.LJIIJ(pairArr));
    }
}
