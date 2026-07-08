package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C0BQC;
import X.C123100dR;
import X.C13LP;
import X.C15438062q;
import X.C1ER1;
import X.C257930A8x;
import X.C654080Pl8;
import X.C654120PlC;
import X.C654130PlD;
import X.C654190PlJ;
import X.EnumC654070Pl7;
import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class EntityCardTitle implements Serializable {
    public Integer docType;

    @C09CT("dynamic_patch")
    public final DynamicPatch dynamicPatch;

    @C09CT("entity_abstract_display_row_num")
    public int entityAbstractDisplayRowNum;

    @C09CT("entity_desc_list")
    public final List<String> entityDescList;

    @C09CT("entity_name")
    public final String entityName;

    @C09CT("entity_summary")
    public final String entitySummary;

    @C09CT("entity_title")
    public final String entityTitle;

    @C09CT("game_info")
    public final GameInfo gameInfo;

    @C09CT("imdb_info")
    public final IMDBResource imdbInfo;

    @C09CT("is_viral_song")
    public final boolean isViralSong;

    @C09CT("label_info")
    public final EntityCardLabel labelInfo;

    @C09CT("music_info")
    public final SearchMusicInfo musicInfo;

    @C09CT("remove_tag_list")
    public final boolean removeTagList;

    @C09CT("search_source")
    public final String searchSource;
    public Integer selectedTabIndex;
    public String standardCardId;

    @C09CT("title_style")
    public final int titleStyle;
    public Integer type;
    public Integer universalRank;

    @C09CT("wiki_info")
    public final WikiResource wikiInfo;

    public EntityCardTitle() {
        this(null, null, null, null, null, null, null, 0, null, null, null, null, null, 2, false, null, false);
    }

    public final String getAbstractForWeakEntity() {
        IMDBResource iMDBResource;
        int i = this.titleStyle;
        if (i == EnumC654070Pl7.WIKI.getType()) {
            WikiResource wikiResource = this.wikiInfo;
            if (wikiResource != null) {
                return wikiResource.getAbstract(false);
            }
            return null;
        }
        if (i != EnumC654070Pl7.IMDB.getType() || (iMDBResource = this.imdbInfo) == null) {
            return null;
        }
        return iMDBResource.getAbstract(false);
    }

    public final String getPictureUrl() {
        GameInfo gameInfo;
        UrlModel urlModel;
        List<String> urlList;
        UrlModel urlModel2;
        List<String> urlList2;
        UrlModel urlModel3;
        List<String> urlList3;
        int i = this.titleStyle;
        if (i == EnumC654070Pl7.WIKI.getType()) {
            WikiResource wikiResource = this.wikiInfo;
            if (wikiResource != null) {
                return wikiResource.image;
            }
            return null;
        }
        if (i == EnumC654070Pl7.IMDB.getType()) {
            IMDBResource iMDBResource = this.imdbInfo;
            if (iMDBResource == null || (urlModel3 = iMDBResource.cover) == null || (urlList3 = urlModel3.getUrlList()) == null) {
                return null;
            }
            return (String) C13LP.LJJJLL(urlList3);
        }
        if (i == EnumC654070Pl7.MUSIC.getType()) {
            SearchMusicInfo searchMusicInfo = this.musicInfo;
            if (searchMusicInfo == null || (urlModel2 = searchMusicInfo.coverThumb) == null || (urlList2 = urlModel2.getUrlList()) == null) {
                return null;
            }
            return (String) C13LP.LJJJLL(urlList2);
        }
        if (i != EnumC654070Pl7.GAME.getType() || (gameInfo = this.gameInfo) == null || (urlModel = gameInfo.coverThumb) == null || (urlList = urlModel.getUrlList()) == null) {
            return null;
        }
        return (String) C13LP.LJJJLL(urlList);
    }

    public final String getSearchResultId() {
        GameInfo gameInfo;
        int i = this.titleStyle;
        if (i == EnumC654070Pl7.WIKI.getType()) {
            WikiResource wikiResource = this.wikiInfo;
            if (wikiResource != null) {
                return wikiResource.id;
            }
            return null;
        }
        if (i == EnumC654070Pl7.IMDB.getType()) {
            IMDBResource iMDBResource = this.imdbInfo;
            if (iMDBResource != null) {
                return iMDBResource.id;
            }
            return null;
        }
        if (i == EnumC654070Pl7.MUSIC.getType()) {
            SearchMusicInfo searchMusicInfo = this.musicInfo;
            if (searchMusicInfo != null) {
                return searchMusicInfo.idStr;
            }
            return null;
        }
        if (i != EnumC654070Pl7.GAME.getType() || (gameInfo = this.gameInfo) == null) {
            return null;
        }
        return gameInfo.idStr;
    }

    public final C654190PlJ getSubTitle() {
        ArrayList arrayList;
        List<SearchMusicArtistInfo> list;
        int i = this.titleStyle;
        if (i != EnumC654070Pl7.MUSIC.getType()) {
            if (i != EnumC654070Pl7.IMDB.getType()) {
                String str = this.entitySummary;
                return new C654190PlJ(str != null ? str : "", null, null, 30);
            }
            IMDBResource iMDBResource = this.imdbInfo;
            C654120PlC c654120PlC = iMDBResource != null ? new C654120PlC(iMDBResource.rating, iMDBResource.ratingVotes) : null;
            String str2 = this.entitySummary;
            return new C654190PlJ(str2 != null ? str2 : "", null, c654120PlC, 14);
        }
        SearchMusicInfo searchMusicInfo = this.musicInfo;
        if (searchMusicInfo == null || (list = searchMusicInfo.artists) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (SearchMusicArtistInfo searchMusicArtistInfo : list) {
                arrayList.add(new C654130PlD(searchMusicArtistInfo.nickName, searchMusicArtistInfo.isVerified()));
            }
        }
        String str3 = this.entitySummary;
        return new C654190PlJ(str3 != null ? str3 : "", arrayList, null, 22);
    }

    public final String getThirdPartyUrl() {
        IMDBResource iMDBResource;
        int i = this.titleStyle;
        if (i == EnumC654070Pl7.WIKI.getType()) {
            WikiResource wikiResource = this.wikiInfo;
            if (wikiResource != null) {
                return wikiResource.url;
            }
            return null;
        }
        if (i != EnumC654070Pl7.IMDB.getType() || (iMDBResource = this.imdbInfo) == null) {
            return null;
        }
        return iMDBResource.detailUrl;
    }

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
    public final C654080Pl8 tryGetMobParams() {
        GameInfo gameInfo;
        C654080Pl8 searchHubMobParams;
        boolean zLIZ = C123100dR.LIZ(getPictureUrl());
        int i = this.titleStyle;
        if (i == EnumC654070Pl7.WIKI.getType()) {
            WikiResource wikiResource = this.wikiInfo;
            if (wikiResource == null) {
                return null;
            }
            searchHubMobParams = wikiResource.toSearchHubMobParams(this.entityTitle, zLIZ ? 1 : 0, this.entityName);
        } else if (i == EnumC654070Pl7.IMDB.getType()) {
            IMDBResource iMDBResource = this.imdbInfo;
            if (iMDBResource == null) {
                return null;
            }
            searchHubMobParams = iMDBResource.toSearchHubMobParams(this.entityTitle, zLIZ ? 1 : 0, this.entityName);
        } else if (i == EnumC654070Pl7.MUSIC.getType()) {
            SearchMusicInfo searchMusicInfo = this.musicInfo;
            if (searchMusicInfo == null) {
                return null;
            }
            searchHubMobParams = searchMusicInfo.toSearchHubMobParams(this.entityTitle, zLIZ ? 1 : 0, this.entityName);
        } else {
            if (i != EnumC654070Pl7.GAME.getType() || (gameInfo = this.gameInfo) == null) {
                return null;
            }
            searchHubMobParams = gameInfo.toSearchHubMobParams(this.entityTitle, zLIZ ? 1 : 0, this.entityName);
        }
        if (searchHubMobParams != null) {
            return ((Boolean) C257930A8x.LIZ.getValue()).booleanValue() ? C654080Pl8.LIZ(searchHubMobParams, null, this.universalRank, null, null, null, 3839) : searchHubMobParams;
        }
        return null;
    }

    public final boolean isViralSong() {
        return this.isViralSong;
    }

    public final Pair<String, String> getAbstract(Context context) {
        String string;
        int i = this.titleStyle;
        String str = null;
        if (i == EnumC654070Pl7.WIKI.getType()) {
            WikiResource wikiResource = this.wikiInfo;
            if (wikiResource != null) {
                str = wikiResource.getAbstract(C1ER1.LIZIZ.LJJIJIL());
            }
            return new Pair<>(str, context.getString(2131837627));
        }
        if (i != EnumC654070Pl7.IMDB.getType()) {
            return null;
        }
        IMDBResource iMDBResource = this.imdbInfo;
        if (iMDBResource != null) {
            str = iMDBResource.getAbstract(C1ER1.LIZIZ.LJJIJIL());
        }
        if (C0BQC.LIZ()) {
            string = context.getString(2131837627);
        } else {
            string = "IMDb";
        }
        return new Pair<>(str, string);
    }

    public final void setDocType(Integer num) {
        this.docType = num;
    }

    public final void setEntityAbstractDisplayRowNum(int i) {
        this.entityAbstractDisplayRowNum = i;
    }

    public final void setSelectedTabIndex(Integer num) {
        this.selectedTabIndex = num;
    }

    public final void setStandardCardId(String str) {
        this.standardCardId = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setUniversalRank(Integer num) {
        this.universalRank = num;
    }

    public EntityCardTitle(Integer num, String str, DynamicPatch dynamicPatch, String str2, String str3, List<String> list, EntityCardLabel entityCardLabel, int i, WikiResource wikiResource, IMDBResource iMDBResource, SearchMusicInfo searchMusicInfo, GameInfo gameInfo, String str4, int i2, boolean z, String str5, boolean z2) {
        this.selectedTabIndex = num;
        this.entityName = str;
        this.dynamicPatch = dynamicPatch;
        this.entityTitle = str2;
        this.entitySummary = str3;
        this.entityDescList = list;
        this.labelInfo = entityCardLabel;
        this.titleStyle = i;
        this.wikiInfo = wikiResource;
        this.imdbInfo = iMDBResource;
        this.musicInfo = searchMusicInfo;
        this.gameInfo = gameInfo;
        this.standardCardId = str4;
        this.entityAbstractDisplayRowNum = i2;
        this.isViralSong = z;
        this.searchSource = str5;
        this.removeTagList = z2;
    }
}
