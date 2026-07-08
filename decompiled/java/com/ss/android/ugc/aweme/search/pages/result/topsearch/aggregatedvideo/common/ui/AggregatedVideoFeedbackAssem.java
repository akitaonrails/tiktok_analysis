package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui;

import X.C0PCY;
import X.C13BV;
import X.C1913107eT;
import X.C19EG;
import X.C21565319aV;
import X.C418440Gaw;
import X.C641200PDa;
import X.C646370PWx;
import X.C653400Pk2;
import X.C683220Qr2;
import X.C724240Sb0;
import X.InterfaceC652490PiZ;
import X.InterfaceC655050Pmh;
import android.content.res.Resources;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class AggregatedVideoFeedbackAssem extends SearchCardFeedbackAssem<InterfaceC652490PiZ> {
    public InterfaceC652490PiZ LLJJJJLIIL;
    public View LLJJL;

    @Override // X.InterfaceC685830QvF
    public final int ue() {
        return R.id.trq;
    }

    @Override // X.InterfaceC685830QvF
    public final String getFeedbackType() {
        SearchMixFeed searchMixFeedLIZ;
        InterfaceC652490PiZ interfaceC652490PiZ = this.LLJJJJLIIL;
        if (interfaceC652490PiZ == null || (searchMixFeedLIZ = interfaceC652490PiZ.LIZ()) == null) {
            return null;
        }
        return searchMixFeedLIZ.getFeedbackType();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    public final View ep() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC685830QvF
    public final List<Integer> sf() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC685830QvF
    public final List<Integer> ya() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC685830QvF
    public final void Mj(C683220Qr2 c683220Qr2) {
        Aweme aweme;
        UrlModel cover;
        String desc;
        Resources resources;
        SearchMixFeed searchMixFeedLIZ;
        SearchCardInfo searchCardInfo;
        String docId;
        String alasrc;
        C0PCY<C646370PWx> c0pcyWO2;
        C646370PWx c646370PWx;
        InterfaceC652490PiZ interfaceC652490PiZ = this.LLJJJJLIIL;
        if (interfaceC652490PiZ != null && (aweme = interfaceC652490PiZ.getAweme()) != null) {
            Video video = aweme.getVideo();
            String string = null;
            if (video != null) {
                cover = video.getCover();
            } else {
                cover = null;
            }
            c683220Qr2.LIZIZ = cover;
            if (aweme.getSearchDesc() != null) {
                desc = aweme.getSearchDesc();
            } else {
                desc = aweme.getDesc();
            }
            c683220Qr2.LIZJ = desc;
            if (desc == null || desc.length() == 0) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null && (resources = c19egLIZ.getResources()) != null) {
                    string = resources.getString(R.string.video);
                }
                c683220Qr2.LIZJ = string;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJJJJ.getValue();
            String str = "";
            if (iSearchContextAbility != null && (c0pcyWO2 = iSearchContextAbility.wO2()) != null && (c646370PWx = (C646370PWx) c0pcyWO2.LIZJ()) != null) {
                linkedHashMap.put("enter_from", c646370PWx.LLILLL);
                linkedHashMap.put("rank", String.valueOf(c646370PWx.LLILZLL));
                linkedHashMap.put("universal_rank", String.valueOf(c646370PWx.LLJILJIL));
                String str2 = c646370PWx.LLJILJILJ;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("insert_type", str2);
            }
            linkedHashMap.put("list_result_type", "video");
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            linkedHashMap.put("list_item_id", aid);
            InterfaceC652490PiZ interfaceC652490PiZ2 = this.LLJJJJLIIL;
            if (interfaceC652490PiZ2 != null && (searchMixFeedLIZ = interfaceC652490PiZ2.LIZ()) != null) {
                HashMap<String, String> searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme);
                if ((searchExtraParams == null || (docId = searchExtraParams.get("search_result_id")) == null) && ((searchCardInfo = searchMixFeedLIZ.getSearchCardInfo()) == null || (docId = searchCardInfo.getDocId()) == null)) {
                    docId = "";
                }
                linkedHashMap.put("search_result_id", docId);
                SearchCardInfo searchCardInfo2 = searchMixFeedLIZ.getSearchCardInfo();
                if (searchCardInfo2 != null && (alasrc = searchCardInfo2.getAlasrc()) != null) {
                    str = alasrc;
                }
                linkedHashMap.put("token_type", str);
                linkedHashMap.put("item_rank", String.valueOf(C641200PDa.LIZ(aweme, searchMixFeedLIZ)));
            }
            C653400Pk2.LIZ(aweme, linkedHashMap);
            c683220Qr2.LJ = linkedHashMap;
            c683220Qr2.LJFF = aweme.getAid();
            c683220Qr2.LJII = AwemeExtKt.getAuthorUid(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    /* JADX INFO: renamed from: kp */
    public final void up(InterfaceC655050Pmh interfaceC655050Pmh) {
        InterfaceC652490PiZ interfaceC652490PiZ = (InterfaceC652490PiZ) interfaceC655050Pmh;
        super.up(interfaceC652490PiZ);
        this.LLJJJJLIIL = interfaceC652490PiZ;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    public final void op(View view) {
        int iIntValue;
        this.LLJJL = view;
        if (view != null) {
            Integer numValueOf = Integer.valueOf(C1913107eT.LIZJ());
            if (numValueOf.intValue() > 0) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 4;
            }
            C21565319aV.LIZIZ(view, Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))), null, null, null, null, 30);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        InterfaceC652490PiZ interfaceC652490PiZ = (InterfaceC652490PiZ) obj;
        super.up(interfaceC652490PiZ);
        this.LLJJJJLIIL = interfaceC652490PiZ;
    }
}
