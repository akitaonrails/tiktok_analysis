package com.ss.android.ugc.aweme.api.brand.likeeffect;

import X.AbstractC1327750kej;
import X.C01GW;
import X.C03IT;
import X.C054G;
import X.C08JS;
import X.C098200Yq;
import X.C0HWE;
import X.C0PEM;
import X.C0VSJ;
import X.C1017070cZd;
import X.C1018170cbP;
import X.C1018420cbo;
import X.C1022620cia;
import X.C12ES;
import X.C1322200kVm;
import X.C1323050kX9;
import X.C1325540kbA;
import X.C1325700kbQ;
import X.C1325710kbR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C15438062q;
import X.C1618190sDB;
import X.C1697810uHb;
import X.C189200o6;
import X.C1906580ziK;
import X.C1AF0;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C396801gU;
import X.C452501pT;
import X.C516201zk;
import X.C731940SnQ;
import X.C823050WQl;
import X.EnumC1331380kka;
import X.EnumC1334360kpO;
import X.InterfaceC1018470cbt;
import X.InterfaceC1320200kSY;
import X.InterfaceC1331910klR;
import X.InterfaceC605070NoH;
import X.RunnableC514101zP;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.animation.LinearInterpolator;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.brand.likeeffect.LikeEffectServiceImpl;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.model.AlphaVideoData;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.AnolePlayerVideoDataModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class LikeEffectServiceImpl implements ILikeEffectService {
    public static final /* synthetic */ int LJFF = 0;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(944));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 65));
    public final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ);

    public LikeEffectServiceImpl() {
        C1906580ziK.LIZJ().LJIIIIZZ().LJJLJLI(new C516201zk(this, 318));
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final boolean LJIILLIIL() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LIZIZ(Aweme aweme) {
        C1018420cbo c1018420cbo = new C1018420cbo(aweme);
        c1018420cbo.logAd(c1018420cbo.LJI);
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LIZLLL(Aweme aweme) {
        C1018420cbo c1018420cbo = new C1018420cbo(aweme);
        c1018420cbo.logAd(c1018420cbo.LJ, AFwS252S0000000_16.get$arr$(655));
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LJFF(Aweme aweme) {
        C1018420cbo c1018420cbo = new C1018420cbo(aweme);
        c1018420cbo.logAd(c1018420cbo.LIZJ, new AwS30S0001000_16(41));
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final List<SimpleUriAndUrl> LJI(Aweme aweme) {
        String url;
        String uri;
        String url2;
        String uri2;
        if (aweme == null || !C1017070cZd.LJLLL(aweme)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        SimpleUriAndUrl simpleUriAndUrlLJJIII = C1017070cZd.LJJIII(aweme);
        if (simpleUriAndUrlLJJIII != null && (url2 = simpleUriAndUrlLJJIII.getUrl()) != null && url2.length() != 0 && (uri2 = simpleUriAndUrlLJJIII.getUri()) != null && uri2.length() != 0) {
            arrayList.add(simpleUriAndUrlLJJIII);
        }
        SimpleUriAndUrl simpleUriAndUrlLJJII = C1017070cZd.LJJII(aweme);
        if (simpleUriAndUrlLJJII != null && (url = simpleUriAndUrlLJJII.getUrl()) != null && url.length() != 0 && (uri = simpleUriAndUrlLJJII.getUri()) != null && uri.length() != 0) {
            arrayList.add(simpleUriAndUrlLJJII);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final AlphaVideoData LJIIL(Aweme aweme) {
        AwemeRawAd styleInfo;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        AnoleComponentModel anoleComponentModel;
        Map<String, ? extends Object> map2;
        Object c098200Yq;
        AnoleModel anoleModel2;
        AlphaVideoData alphaVideoData = null;
        if (aweme == null) {
            return null;
        }
        try {
            C1017070cZd.LJJIII(aweme);
            AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
            if (awemeRawAdLJJIJLIJ == null || (anoleModel2 = awemeRawAdLJJIJLIJ.getAnoleModel()) == null || (map = anoleModel2.components) == null) {
                AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo != null && (styleInfo = commerceVideoAuthInfo.getStyleInfo()) != null && (anoleModel = styleInfo.getAnoleModel()) != null) {
                    map = anoleModel.components;
                    if (map != null || map.isEmpty() || (anoleComponentModel = map.get("premium_like_effect")) == null || (map2 = anoleComponentModel.data) == null || map2.isEmpty()) {
                        return null;
                    }
                    try {
                        c098200Yq = (AnolePlayerVideoDataModel) C08JS.LIZ(C08JS.LIZLLL(map2), AnolePlayerVideoDataModel.class);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C1AF0.LJ(thM5exceptionOrNullimpl);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    AnolePlayerVideoDataModel anolePlayerVideoDataModel = (AnolePlayerVideoDataModel) c098200Yq;
                    if (anolePlayerVideoDataModel == null) {
                        return null;
                    }
                    alphaVideoData = anolePlayerVideoDataModel.video;
                    return alphaVideoData;
                }
            } else if (map != null) {
            }
            return null;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return alphaVideoData;
        }
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LJIIZILJ(boolean z) {
        this.LIZIZ = z;
    }

    public final Bitmap LJIJ(String str) {
        Bitmap bitmap = (Bitmap) ((LruCache) this.LIZ.getValue()).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            ((LruCache) this.LIZ.getValue()).remove(str);
            return null;
        }
        return bitmap;
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final Drawable LIZJ(Context context, Aweme aweme) {
        SimpleUriAndUrl simpleUriAndUrlLJJIII;
        String uri;
        Bitmap bitmapLJIJ;
        Resources resources = null;
        if (aweme == null || (simpleUriAndUrlLJJIII = C1017070cZd.LJJIII(aweme)) == null || (uri = simpleUriAndUrlLJJIII.getUri()) == null || (bitmapLJIJ = LJIJ(uri)) == null) {
            return null;
        }
        Bitmap.Config config = bitmapLJIJ.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCopy = bitmapLJIJ.copy(config, true);
        if (context != null) {
            resources = context.getResources();
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCopy);
        bitmapDrawable.setBounds(0, 0, C1618190sDB.LIZ(32), C1618190sDB.LIZ(32));
        return bitmapDrawable;
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LJII(Aweme aweme, String str) {
        C1018420cbo c1018420cbo = new C1018420cbo(aweme);
        c1018420cbo.logAd(c1018420cbo.LJFF, new AwS67S1000000_16(str, 46));
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LJIIIIZZ(Aweme aweme, String str) {
        C1018420cbo c1018420cbo = new C1018420cbo(aweme);
        c1018420cbo.logAd(c1018420cbo.LIZLLL, new AwS67S1000000_16(str, 44));
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final Drawable LJIIIZ(Context context, Aweme aweme) {
        SimpleUriAndUrl simpleUriAndUrlLJJII;
        String uri;
        Bitmap bitmapLJIJ;
        Resources resources = null;
        if (aweme == null || (simpleUriAndUrlLJJII = C1017070cZd.LJJII(aweme)) == null || (uri = simpleUriAndUrlLJJII.getUri()) == null || (bitmapLJIJ = LJIJ(uri)) == null || bitmapLJIJ.isRecycled()) {
            return null;
        }
        if (context != null) {
            resources = context.getResources();
        }
        Bitmap.Config config = bitmapLJIJ.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new BitmapDrawable(resources, bitmapLJIJ.copy(config, true));
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LJIIJJI(Aweme aweme, String str) {
        C1018420cbo c1018420cbo = new C1018420cbo(aweme);
        c1018420cbo.logAd(c1018420cbo.LIZIZ, new AwS67S1000000_16(str, 45));
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final String LJIILIIL(String str, List<String> list) {
        boolean z;
        C1018170cbP c1018170cbP = (C1018170cbP) this.LIZLLL.getValue();
        c1018170cbP.getClass();
        boolean z2 = false;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (str == null || str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) c1018170cbP.LIZJ.getValue());
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                try {
                    if (new C0VSJ(strLIZIZ).exists()) {
                        return strLIZIZ;
                    }
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final AnimatorSet LJIILJJIL(Context context, C731940SnQ c731940SnQ) {
        Float fValueOf = Float.valueOf(5.0f);
        float fLIZJ = C12ES.LIZJ(5.0f, context);
        AnimatorSet animatorSet = new AnimatorSet();
        Float fValueOf2 = Float.valueOf(0.0f);
        float f = -fLIZJ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c731940SnQ, "translationY", 0.0f, f);
        objectAnimatorOfFloat.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c731940SnQ, "translationY", f, 0.0f);
        objectAnimatorOfFloat2.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c731940SnQ, "translationY", 0.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(800L);
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c731940SnQ, "scaleX", 1.0f, 1.1f);
        objectAnimatorOfFloat4.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c731940SnQ, "scaleY", 1.0f, 1.1f);
        objectAnimatorOfFloat5.setDuration(100L);
        animatorSet3.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5);
        AnimatorSet animatorSet4 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(c731940SnQ, "scaleX", 1.1f, 1.1f);
        objectAnimatorOfFloat6.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(c731940SnQ, "scaleY", 1.1f, 1.1f);
        objectAnimatorOfFloat7.setDuration(400L);
        animatorSet4.playTogether(objectAnimatorOfFloat6, objectAnimatorOfFloat7);
        AnimatorSet animatorSet5 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(c731940SnQ, "scaleX", 1.1f, 1.0f);
        objectAnimatorOfFloat8.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(c731940SnQ, "scaleY", 1.1f, 1.0f);
        objectAnimatorOfFloat9.setDuration(500L);
        animatorSet5.playTogether(objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        animatorSet2.playSequentially(animatorSet3, animatorSet4, animatorSet5);
        Float fValueOf3 = Float.valueOf(10.0f);
        Float fValueOf4 = Float.valueOf(-15.0f);
        Float fValueOf5 = Float.valueOf(15.0f);
        Float fValueOf6 = Float.valueOf(-10.0f);
        List<Pair> listLJIIJJI = C1697810uHb.LJIIJJI(new Pair(fValueOf2, fValueOf3), new Pair(fValueOf3, fValueOf4), new Pair(fValueOf4, fValueOf5), new Pair(fValueOf5, fValueOf6), new Pair(fValueOf6, fValueOf), new Pair(fValueOf, fValueOf2));
        AnimatorSet animatorSet6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        for (Pair pair : listLJIIJJI) {
            ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(c731940SnQ, "rotation", ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
            objectAnimatorOfFloat10.setDuration(100L);
            arrayList.add(objectAnimatorOfFloat10);
        }
        animatorSet6.playSequentially(arrayList);
        AnimatorSet animatorSet7 = new AnimatorSet();
        animatorSet7.playTogether(animatorSet, animatorSet2, animatorSet6);
        animatorSet7.setInterpolator(new LinearInterpolator());
        return animatorSet7;
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LJIILL(Context context, Aweme aweme) {
        List<SimpleUriAndUrl> listLJI;
        if (context != null && C1017070cZd.LLIZLLLIL(aweme) && C1017070cZd.LJLLL(aweme) && (listLJI = LJI(aweme)) != null && !listLJI.isEmpty()) {
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) listLJI;
                if (i < arrayList.size()) {
                    SimpleUriAndUrl simpleUriAndUrl = (SimpleUriAndUrl) ListProtector.get(arrayList, i);
                    String uri = simpleUriAndUrl.getUri();
                    String url = simpleUriAndUrl.getUrl();
                    if (uri != null && uri.length() != 0 && url != null && url.length() != 0) {
                        try {
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        if (url.length() == 0 || !C1331660kl2.LIZJ().LJIIIZ(UriProtector.parse(url))) {
                            String uri2 = simpleUriAndUrl.getUri();
                            String url2 = simpleUriAndUrl.getUrl();
                            if (uri2 != null && uri2.length() != 0 && url2 != null && url2.length() != 0) {
                                C823050WQl.LIZIZ().execute(new RunnableC514101zP(i, this, context, uri2, 1));
                            }
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LIZ(Context context, final String str, final String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(arrayList));
        c1331670kl3LJIIJ.LJJIJL(context);
        c1331670kl3LJIIJ.LIZLLL("topview_like_effect");
        c1331670kl3LJIIJ.LJJIIJZLJL = C823050WQl.LIZLLL();
        c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIJ.LJIILJJIL(new InterfaceC605070NoH() { // from class: X.0cbp
            @Override // X.InterfaceC605070NoH
            public final void onCanceled() {
            }

            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                String path;
                if (file != null && file.exists()) {
                    try {
                        C0VSJ c0vsj = new C0VSJ(str2);
                        if (c0vsj.exists()) {
                            return;
                        }
                        C08QA.LJIILLIIL(file, c0vsj, true, 4);
                        file.delete();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCompleted picUrl=");
                sbLIZ.append(str);
                sbLIZ.append(", file = ");
                if (file != null) {
                    path = file.getPath();
                } else {
                    path = null;
                }
                sbLIZ.append(path);
                C1022620cia.LIZ("LikeEffectServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailed picUrl=");
                sbLIZ.append(str);
                sbLIZ.append(", throwable ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C1022620cia.LIZ("LikeEffectServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LJ(Context context, Aweme aweme, boolean z, Function1 function1) {
        C1022620cia.LIZ("LikeEffectServiceImpl", "preload start");
        C23250099c.LIZLLL(this.LJ, null, null, new C396801gU(C1697810uHb.LJIIJJI(C1017070cZd.LJJIII(aweme), C1017070cZd.LJJII(aweme)), z, this, aweme, function1, context, null), 3);
        this.LIZJ = true;
    }

    @Override // com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService
    public final void LJIIJ(Context context, String str, final String str2, final InterfaceC1018470cbt interfaceC1018470cbt) {
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
        c1331670kl3LJI.LJJIJL(context);
        c1331670kl3LJI.LIZLLL("topview_like_effect");
        c1331670kl3LJI.LJJIIJZLJL = C823050WQl.LIZLLL();
        c1331670kl3LJI.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJI.LJJIIJ(new InterfaceC1331910klR() { // from class: X.0cbq
            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
                interfaceC1018470cbt.LIZ(false);
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                boolean z;
                Bitmap bitmapCopy;
                if (bitmap != null) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1018470cbt.LIZ(z);
                if (z) {
                    if (bitmap != null) {
                        Bitmap.Config config = bitmap.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        bitmapCopy = bitmap.copy(config, true);
                    } else {
                        bitmapCopy = null;
                    }
                    ((LruCache) this.LIZ.getValue()).put(str2, bitmapCopy);
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                interfaceC1018470cbt.LIZ(false);
            }
        });
    }

    public final void LJIJI(final int i, Context context, final String str, final String str2, final Function1 function1) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadPicture start url = ");
        sbLIZ.append(str2);
        sbLIZ.append(", context==null? ");
        if (context == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (context != null && str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            try {
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str2));
                c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.HIGH;
                C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
                C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = c1325540kbALIZ.LJI(c1325710kbRLIZ, null);
                boolean zLJIIL = c1325540kbALIZ.LJIIL(c1325710kbRLIZ);
                boolean zLJIILJJIL = c1325540kbALIZ.LJIILJJIL(c1325710kbRLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preloadPicture start url = ");
                sbLIZ2.append(str2);
                sbLIZ2.append(", isInMemoryCache=");
                sbLIZ2.append(zLJIIL);
                sbLIZ2.append(", isInDiskCache=");
                sbLIZ2.append(zLJIILJJIL);
                C2188811AlT.LIZIZ(sbLIZ2);
                interfaceC1320200kSYLJI.LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0Hdz
                    @Override // X.C0HWE
                    public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                        Function1<Boolean, Unit> function12;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("preloadPicture failed url = ");
                        sbLIZ3.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        if (i == 0 && (function12 = function1) != null) {
                            function12.invoke(Boolean.FALSE);
                        }
                    }

                    @Override // X.C0HWE
                    public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                        AbstractC1327750kej abstractC1327750kej;
                        C1329440khS c1329440khSLIZIZ;
                        C1323050kX9 c1323050kX9LJFF;
                        Bitmap bitmapCreateScaledBitmap;
                        Function1<Boolean, Unit> function12;
                        if (!interfaceC1320200kSY.LIZ()) {
                            if (i == 0 && (function12 = function1) != null) {
                                function12.invoke(Boolean.FALSE);
                                return;
                            }
                            return;
                        }
                        C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY.getResult();
                        if (result != null && (abstractC1327750kej = result.get()) != null) {
                            int i2 = i;
                            LikeEffectServiceImpl likeEffectServiceImpl = this;
                            String str3 = str;
                            Function1<Boolean, Unit> function13 = function1;
                            if (abstractC1327750kej instanceof C1325120kaU) {
                                bitmapCreateScaledBitmap = ((AbstractC1325130kaV) abstractC1327750kej).getUnderlyingBitmap();
                            } else if ((abstractC1327750kej instanceof C1329380khM) && (c1329440khSLIZIZ = ((C1329380khM) abstractC1327750kej).LIZIZ()) != null) {
                                synchronized (c1329440khSLIZIZ) {
                                    c1323050kX9LJFF = C1323050kX9.LJFF(c1329440khSLIZIZ.LIZJ);
                                }
                                if (c1323050kX9LJFF != null) {
                                    bitmapCreateScaledBitmap = (Bitmap) c1323050kX9LJFF.get();
                                }
                            }
                            if (bitmapCreateScaledBitmap != null && (!bitmapCreateScaledBitmap.isRecycled())) {
                                if (i2 == 0) {
                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, C1618190sDB.LIZ(32), C1618190sDB.LIZ(32), true);
                                }
                                ((LruCache) likeEffectServiceImpl.LIZ.getValue()).put(str3, bitmapCreateScaledBitmap);
                                if (i2 == 0 && function13 != null) {
                                    function13.invoke(Boolean.TRUE);
                                }
                            }
                        }
                        C1323050kX9.LJII(result);
                    }
                }, C823050WQl.LIZLLL());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
