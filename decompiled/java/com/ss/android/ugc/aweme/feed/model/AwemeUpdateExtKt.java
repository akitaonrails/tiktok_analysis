package com.ss.android.ugc.aweme.feed.model;

import X.C0A4O;
import X.C257780A8i;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.model.ucp.AcShopData;
import com.ss.android.ugc.aweme.feed.model.ad.AwemeRawAdUpdateBugFixParam;
import com.ss.android.ugc.aweme.feed.model.ad.ShopAnchorSellingPointData;
import com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AwemeRawAdUpdateBugFixer;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.model.TTMMusicInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class AwemeUpdateExtKt {
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void update(com.ss.android.ugc.aweme.feed.model.Aweme r11, com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instruction units count: 1953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.AwemeUpdateExtKt.update(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static final void updatePoiDataStruct(Aweme aweme, Aweme aweme2) {
        PoiDataStruct poiDataStruct = aweme.poiDataStruct;
        if (poiDataStruct != null && poiDataStruct.isProductAnchor()) {
            return;
        }
        aweme.poiDataStruct = aweme2.poiDataStruct;
    }

    public static final void updateAwemeRawAd(Aweme aweme, Aweme aweme2, AwemeRawAdUpdateBugFixParam awemeRawAdUpdateBugFixParam) {
        String str;
        IAdTranslatableData translatableData;
        IAdTranslationData translationData;
        Boolean hasOpenUrlImmutable;
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        AcShopData acShopData;
        List<AwemeRawAdUpdateBugFixer> listCreate = AwemeRawAdUpdateBugFixer.BuiltIn.Companion.create(aweme, awemeRawAdUpdateBugFixParam);
        AwemeRawAd awemeRawAd = aweme.awemeRawAd;
        OmVast omVast = null;
        boolean z = false;
        if (awemeRawAd != null) {
            translatableData = awemeRawAd.getTranslatableData();
            translationData = awemeRawAd.getTranslationData();
            hasOpenUrlImmutable = awemeRawAd.getHasOpenUrlImmutable();
            shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints();
            acShopData = awemeRawAd.getAcShopData();
            str = awemeRawAd.openUrl;
            if (str != null && str.length() != 0 && Intrinsics.LJFF(UriProtector.parse(str).getHost(), "acshop")) {
                z = true;
            }
        } else {
            str = null;
            translatableData = null;
            translationData = null;
            hasOpenUrlImmutable = null;
            shopAnchorSellingPoints = null;
            acShopData = null;
        }
        if (((Boolean) C0A4O.LIZ.getValue()).booleanValue()) {
            AwemeRawAd awemeRawAd2 = aweme.awemeRawAd;
            if (awemeRawAd2 != null) {
                omVast = awemeRawAd2.omVast;
            }
            AwemeRawAd awemeRawAd3 = aweme2.awemeRawAd;
            aweme.awemeRawAd = awemeRawAd3;
            if (awemeRawAd3 != null) {
                awemeRawAd3.omVast = omVast;
            }
        } else {
            aweme.awemeRawAd = aweme2.awemeRawAd;
        }
        AwemeRawAd awemeRawAd4 = aweme.awemeRawAd;
        if (awemeRawAd4 != null) {
            awemeRawAd4.setTranslatableData(translatableData);
            awemeRawAd4.setTranslationData(translationData);
            if (((Boolean) C257780A8i.LIZ.getValue()).booleanValue()) {
                awemeRawAd4.setHasOpenUrlImmutable(hasOpenUrlImmutable);
            }
            awemeRawAd4.setShopAnchorSellingPoints(shopAnchorSellingPoints);
            if (z) {
                awemeRawAd4.setAcShopData(acShopData);
                awemeRawAd4.openUrl = str;
            }
        }
        if (listCreate != null) {
            Iterator<AwemeRawAdUpdateBugFixer> it2 = listCreate.iterator();
            while (it2.hasNext()) {
                it2.next().fix(aweme2);
            }
        }
    }

    public static final void updateMusic(Aweme aweme, Music music, Music music2) {
        if (music2 != null && music != null) {
            TTMMusicInfo ttmInfo = music.getTtmInfo();
            MusicReleaseInfo musicReleaseInfo = music.getMusicReleaseInfo();
            String logExtra = music.getLogExtra();
            MatchedPGCSoundInfo matchedPGCSoundInfo = music.getMatchedPGCSoundInfo();
            MatchedSoundInfo matchedSongInfo = music.getMatchedSongInfo();
            List<TT2DSPSongInfo> tT2DSPSongInfos = music.getTT2DSPSongInfos();
            MusicFusion musicFusion = music.getMusicFusion();
            if (ttmInfo != null) {
                music2.setTtmInfo(ttmInfo);
            }
            if (musicReleaseInfo != null) {
                music2.setMusicReleaseInfo(musicReleaseInfo);
            }
            if (logExtra != null) {
                music2.setLogExtra(logExtra);
            }
            if (matchedPGCSoundInfo != null) {
                music2.setMatchedPGCSoundInfo(matchedPGCSoundInfo);
            }
            if (matchedSongInfo != null) {
                music2.setMatchedSongInfo(matchedSongInfo);
            }
            if (tT2DSPSongInfos != null) {
                music2.setTT2DSPSongInfos(tT2DSPSongInfos);
            }
            if (musicFusion != null) {
                music2.setMusicFusion(musicFusion);
            }
        }
    }
}
