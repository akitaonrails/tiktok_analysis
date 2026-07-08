package com.ss.android.ugc.aweme.ogc.news.sticker.common;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C09CT;
import X.C09JN;
import X.C0NJD;
import X.C0XQ7;
import X.C108200b2;
import X.C11NZ;
import X.C11S5;
import X.C1227904rF;
import X.C189200o6;
import X.C452501pT;
import X.InterfaceC1487280oo2;
import Y.AkS490S0100000_29;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerConfigResponse;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerStorage;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS178S1100000_29;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS87S1000000_2;

/* JADX INFO: loaded from: classes30.dex */
public final class ArticleStickerStorage {
    public static final ArticleStickerStorage LIZ = new ArticleStickerStorage();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(110));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(109));
    public static final C0NJD<ArticleStickerConfigResponse> LIZLLL = new C0NJD<>(null);
    public static final MutableLiveData<ArticleStickerConfigResponse.ArticleStickerAssetConfig> LJ = new MutableLiveData<>(null);
    public static final C0NJD<Boolean> LJFF = new C0NJD<>(null);
    public static final MutableLiveData<Boolean> LJI = new MutableLiveData<>(null);
    public static final C0NJD<Boolean> LJII = new C0NJD<>(null);

    public static AssetConfigDiskCache LIZIZ() {
        Object c098200Yq;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String string = LIZLLL().getString("STORAGE_KEY_ARTICLE_STICKER_CONFIG", "");
            c1227904rF.getClass();
            c098200Yq = (AssetConfigDiskCache) C1227904rF.LIZIZ(string, AssetConfigDiskCache.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (AssetConfigDiskCache) c098200Yq;
    }

    public static Keva LIZLLL() {
        return (Keva) LIZIZ.getValue();
    }

    public static String LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        return str == null ? "" : str;
    }

    public static ArticleStickerConfigResponse LIZJ() {
        Object c098200Yq;
        ArticleStickerConfigResponse articleStickerConfigResponse;
        Integer num;
        if (!C108200b2.LIZ()) {
            return null;
        }
        C0NJD<ArticleStickerConfigResponse> c0njd = LIZLLL;
        ArticleStickerConfigResponse articleStickerConfigResponseLIZ = c0njd.LIZ();
        if (articleStickerConfigResponseLIZ != null) {
            return articleStickerConfigResponseLIZ;
        }
        try {
            AssetConfigDiskCache assetConfigDiskCacheLIZIZ = LIZIZ();
            c098200Yq = (assetConfigDiskCacheLIZIZ == null || (articleStickerConfigResponse = assetConfigDiskCacheLIZIZ.response) == null || (num = articleStickerConfigResponse.statusCode) == null || num.intValue() != 0) ? null : assetConfigDiskCacheLIZIZ.response;
            c0njd.LIZIZ((ArticleStickerConfigResponse) c098200Yq);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (ArticleStickerConfigResponse) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public static void LJFF(Boolean bool) {
        if (!C108200b2.LIZ()) {
            return;
        }
        C11NZ.LJJJJI(new Callable() { // from class: X.11sq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ArticleStickerStorage@913a.updateConfig$2");
                ArticleStickerStorage.LIZ.getClass();
                C19640911st c19640911st = new C19640911st(ArticleStickerStorage.LIZIZ());
                C1C7U.LIZIZ("ArticleStickerStorage@913a.updateConfig$2");
                return c19640911st;
            }
        }).LJJJJZI(new AkS490S0100000_29(bool, 1)).LJJJ(new InterfaceC1487280oo2() { // from class: X.11sl
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C11NZ<ArticleStickerConfigResponse> c11nzLIZ;
                Integer num;
                ArticleStickerConfigResponse articleStickerConfigResponse = (ArticleStickerConfigResponse) ((C19640911st) obj).LIZ;
                if (articleStickerConfigResponse != null && (num = articleStickerConfigResponse.statusCode) != null && num.intValue() == 0) {
                    return C11NZ.LJJJJZ(articleStickerConfigResponse);
                }
                ArticleStickerStorage.LIZ.getClass();
                InterfaceC19640811ss interfaceC19640811ss = (InterfaceC19640811ss) ArticleStickerStorage.LIZJ.getValue();
                if (interfaceC19640811ss != null && (c11nzLIZ = interfaceC19640811ss.LIZ()) != null) {
                    return c11nzLIZ.LJJIJIIJIL(new C09JN() { // from class: X.11sm
                        @Override // X.C09JN
                        public final void accept(Object obj2) {
                            C1C7U.LIZ("ArticleStickerStorage@913a.updateConfig$4$1");
                            ArticleStickerConfigResponse articleStickerConfigResponse2 = (ArticleStickerConfigResponse) obj2;
                            Integer num2 = articleStickerConfigResponse2.statusCode;
                            if (num2 != null && num2.intValue() == 0) {
                                ArticleStickerStorage.LIZ.getClass();
                                ArticleStickerStorage.AssetConfigDiskCache assetConfigDiskCache = new ArticleStickerStorage.AssetConfigDiskCache(ArticleStickerStorage.LIZ(), Long.valueOf(((long) C0XK4.LIZ()) * 1000), articleStickerConfigResponse2);
                                Keva kevaLIZLLL = ArticleStickerStorage.LIZLLL();
                                String strLIZ = C2343809Gi.LIZ(assetConfigDiskCache);
                                new AwS87S1000000_2(strLIZ, 4);
                                kevaLIZLLL.storeString("STORAGE_KEY_ARTICLE_STICKER_CONFIG", strLIZ);
                                ArticleStickerStorage.LJ.postValue(articleStickerConfigResponse2.assetConfig);
                                C1C7U.LIZIZ("ArticleStickerStorage@913a.updateConfig$4$1");
                                return;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("request server failed, response is not valid, ");
                            sbLIZ.append(articleStickerConfigResponse2);
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    });
                }
                throw new IllegalStateException("server api is null");
            }
        }, false).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.11sr
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ArticleStickerStorage@913a.updateConfig$5");
                ArticleStickerConfigResponse articleStickerConfigResponse = (ArticleStickerConfigResponse) obj;
                ArticleStickerStorage.LIZLLL.LIZIZ(articleStickerConfigResponse);
                new AwS568S0100000_24(articleStickerConfigResponse, 825);
                C1C7U.LIZIZ("ArticleStickerStorage@913a.updateConfig$5");
            }
        }, new C09JN() { // from class: X.00Jj
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ArticleStickerStorage@913a.updateConfig$6");
                new C5182020e((Throwable) obj, 144);
                C1C7U.LIZIZ("ArticleStickerStorage@913a.updateConfig$6");
            }
        });
    }

    public static final class AssetConfigDiskCache {

        @C09CT("cache_time_ms")
        public Long cacheTimeMs;

        @C09CT("response")
        public ArticleStickerConfigResponse response;

        @C09CT("user_id")
        public String userId;

        public AssetConfigDiskCache(String str, Long l, ArticleStickerConfigResponse articleStickerConfigResponse) {
            this.userId = str;
            this.cacheTimeMs = l;
            this.response = articleStickerConfigResponse;
        }
    }

    public static ArticleStickerModel LJ(ArticleStickerModel articleStickerModel, String str, ArticleStickerConfigResponse.ArticleStickerAssetConfig articleStickerAssetConfig) {
        String str2;
        String str3;
        new AwS178S1100000_29(str, articleStickerAssetConfig, 2);
        String str4 = null;
        if (articleStickerAssetConfig != null) {
            str4 = articleStickerAssetConfig.brandIconId;
            str2 = articleStickerAssetConfig.brandIconUrl;
            str3 = articleStickerAssetConfig.themeColorHex;
        } else {
            str2 = null;
            str3 = null;
        }
        return articleStickerModel.copy(articleStickerModel.baseStickerModel, articleStickerModel.articleLink, articleStickerModel.articleTitle, str4, str2, str3, articleStickerModel.styleState, articleStickerModel.previewContainerHeightPx, articleStickerModel.realMediaWidth, articleStickerModel.realMediaHeight);
    }
}
