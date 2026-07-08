package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes11.dex */
public final class EComSearchBffResp {

    @C09CT("body")
    public final EComSearchBffBody bffBody;

    @C09CT("big_sale_skin")
    public final n bigSaleSkin;

    @C09CT("brand_skin")
    public final n brandSkin;

    @C09CT("btm")
    public final String btm;

    @C09CT("care_page_data")
    public final CarePageData carePageData;

    @C09CT("chunk_meta")
    public final ChunkMetaStruct chunkMeta;

    @C09CT("cursor")
    public final int cursor;

    @C09CT("extraInfo")
    public final String extraInfo;

    @C09CT("global_doodle_config")
    public final n globalDoodleConfig;

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("page_state")
    public final Integer pageState;

    @C09CT("page_state_info")
    public final String pageStateInfo;

    @C09CT("pendent_layer")
    public final PendantLayer pendantLayer;

    @C09CT("photo_search")
    public final PhotoSearchImageInfo photoSearch;

    @C09CT("search_nil_info")
    public final MixSearchNilInfo searchNilInfo;

    @C09CT("search_nil_text")
    public final MixPageNilText searchNilText;

    @C09CT("section_cursor")
    public final int sectionCursor;

    @C09CT("server_perf_info")
    public final ServerPerfStruct serverPerfInfo;

    @C09CT("shop_card_skin")
    public final n shopCardSkin;

    @C09CT("skin_type")
    public final Integer skinType;

    @C09CT("style")
    public final MixStyle style;

    public EComSearchBffResp() {
        this(null, null, null, null, null, null, null, -1, -1, -1, "", "", null, null, null, null, null, -1, null, null, null, null);
    }

    public EComSearchBffResp(MixStyle mixStyle, EComSearchBffBody eComSearchBffBody, Integer num, PendantLayer pendantLayer, ChunkMetaStruct chunkMetaStruct, ServerPerfStruct serverPerfStruct, String str, int i, int i2, int i3, String str2, String str3, LogPbBean logPbBean, n nVar, n nVar2, n nVar3, n nVar4, Integer num2, MixPageNilText mixPageNilText, MixSearchNilInfo mixSearchNilInfo, CarePageData carePageData, PhotoSearchImageInfo photoSearchImageInfo) {
        this.style = mixStyle;
        this.bffBody = eComSearchBffBody;
        this.pageState = num;
        this.pendantLayer = pendantLayer;
        this.chunkMeta = chunkMetaStruct;
        this.serverPerfInfo = serverPerfStruct;
        this.pageStateInfo = str;
        this.hasMore = i;
        this.cursor = i2;
        this.sectionCursor = i3;
        this.btm = str2;
        this.extraInfo = str3;
        this.logPb = logPbBean;
        this.globalDoodleConfig = nVar;
        this.shopCardSkin = nVar2;
        this.brandSkin = nVar3;
        this.bigSaleSkin = nVar4;
        this.skinType = num2;
        this.searchNilText = mixPageNilText;
        this.searchNilInfo = mixSearchNilInfo;
        this.carePageData = carePageData;
        this.photoSearch = photoSearchImageInfo;
    }
}
