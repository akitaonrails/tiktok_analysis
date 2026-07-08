package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import X.C13BV;
import X.C19719612Di;
import X.C682660Qq8;
import X.EnumC682700QqC;
import X.InterfaceC1120204Zs;
import X.InterfaceC1771006we;
import X.InterfaceC682650Qq7;
import X.InterfaceC682670Qq9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.AiStreamParam;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.AnimationConfig;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.BackGround;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1MultiSummary implements Serializable, InterfaceC682650Qq7<MultiVideo> {

    @C09CT("animation_config")
    public final AnimationConfig animationConfig;

    @C09CT("back_ground")
    public final BackGround backGround;

    @C09CT("more_detail_always_enable")
    public final Boolean enableEnterDetail;

    @C09CT("footer")
    public final SummaryFooter footer;

    @C09CT("fusion_card_disable_show_title")
    public final Boolean fusionCardDisableShowTitle;

    @C09CT("is_mix_top1")
    public final Boolean isMixTop1;

    @C09CT("is_rejected_answer")
    public final Boolean isRejectedAnswer;

    @C09CT("label_text")
    public final String labelText;

    @C09CT("load_more_struct")
    public Top1LoadMoreStruct loadMoreStruct;

    @C09CT("max_height")
    public final Double maxHeight;

    @C09CT("more_detail_action")
    public final Integer moreDetailAction;

    @C09CT("more_detail_text")
    public final String moreDetailText;

    @C09CT("display_info")
    public final MultiSummaryDisplayInfo multiSummaryDisplayInfo;

    @C09CT("multi_video")
    public final List<MultiVideo> multiVideo;

    @C09CT("preview_indexes")
    public final List<Double> previewIndexes;

    @C09CT("see_more_optimize")
    public final Boolean seeMoreOptimize;

    @C09CT("source_style")
    public final Integer sourceStyle;

    @C09CT("summary_info")
    public final SummaryInfo summaryInfo;

    @C09CT("summary_landing_page")
    public final SummaryLandingPage summaryLandingPage;

    @C09CT("sync_config")
    public final Top1SummaryCardSyncConfig syncConfig;

    public final Top1MultiSummary copy(List<MultiVideo> list, SummaryLandingPage summaryLandingPage, String str, Integer num, SummaryFooter summaryFooter, Double d, List<Double> list2, MultiSummaryDisplayInfo multiSummaryDisplayInfo, SummaryInfo summaryInfo, Top1LoadMoreStruct top1LoadMoreStruct, String str2, Boolean bool, Boolean bool2, Boolean bool3, Top1SummaryCardSyncConfig top1SummaryCardSyncConfig, Boolean bool4, Integer num2, AnimationConfig animationConfig, BackGround backGround) {
        return new Top1MultiSummary(list, summaryLandingPage, str, num, summaryFooter, d, list2, multiSummaryDisplayInfo, summaryInfo, top1LoadMoreStruct, str2, bool, bool2, bool3, top1SummaryCardSyncConfig, bool4, num2, animationConfig, backGround);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Top1MultiSummary)) {
            return false;
        }
        Top1MultiSummary top1MultiSummary = (Top1MultiSummary) obj;
        return Intrinsics.LJFF(this.multiVideo, top1MultiSummary.multiVideo) && Intrinsics.LJFF(this.summaryLandingPage, top1MultiSummary.summaryLandingPage) && Intrinsics.LJFF(this.moreDetailText, top1MultiSummary.moreDetailText) && Intrinsics.LJFF(this.moreDetailAction, top1MultiSummary.moreDetailAction) && Intrinsics.LJFF(this.footer, top1MultiSummary.footer) && Intrinsics.LJFF(this.maxHeight, top1MultiSummary.maxHeight) && Intrinsics.LJFF(this.previewIndexes, top1MultiSummary.previewIndexes) && Intrinsics.LJFF(this.multiSummaryDisplayInfo, top1MultiSummary.multiSummaryDisplayInfo) && Intrinsics.LJFF(this.summaryInfo, top1MultiSummary.summaryInfo) && Intrinsics.LJFF(this.loadMoreStruct, top1MultiSummary.loadMoreStruct) && Intrinsics.LJFF(this.labelText, top1MultiSummary.labelText) && Intrinsics.LJFF(this.isMixTop1, top1MultiSummary.isMixTop1) && Intrinsics.LJFF(this.seeMoreOptimize, top1MultiSummary.seeMoreOptimize) && Intrinsics.LJFF(this.fusionCardDisableShowTitle, top1MultiSummary.fusionCardDisableShowTitle) && Intrinsics.LJFF(this.syncConfig, top1MultiSummary.syncConfig) && Intrinsics.LJFF(this.isRejectedAnswer, top1MultiSummary.isRejectedAnswer) && Intrinsics.LJFF(this.sourceStyle, top1MultiSummary.sourceStyle) && Intrinsics.LJFF(this.animationConfig, top1MultiSummary.animationConfig) && Intrinsics.LJFF(this.backGround, top1MultiSummary.backGround);
    }

    @Override // X.InterfaceC682650Qq7
    public Integer getSeeMoreArrowType() {
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public AiStreamParam getStreamParam() {
        return null;
    }

    public int hashCode() {
        List<MultiVideo> list = this.multiVideo;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        SummaryLandingPage summaryLandingPage = this.summaryLandingPage;
        int iHashCode2 = (iHashCode + (summaryLandingPage == null ? 0 : summaryLandingPage.hashCode())) * 31;
        String str = this.moreDetailText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.moreDetailAction;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        SummaryFooter summaryFooter = this.footer;
        int iHashCode5 = (iHashCode4 + (summaryFooter == null ? 0 : summaryFooter.hashCode())) * 31;
        Double d = this.maxHeight;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        List<Double> list2 = this.previewIndexes;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MultiSummaryDisplayInfo multiSummaryDisplayInfo = this.multiSummaryDisplayInfo;
        int iHashCode8 = (iHashCode7 + (multiSummaryDisplayInfo == null ? 0 : multiSummaryDisplayInfo.hashCode())) * 31;
        SummaryInfo summaryInfo = this.summaryInfo;
        int iHashCode9 = (iHashCode8 + (summaryInfo == null ? 0 : summaryInfo.hashCode())) * 31;
        Top1LoadMoreStruct top1LoadMoreStruct = this.loadMoreStruct;
        int iHashCode10 = (iHashCode9 + (top1LoadMoreStruct == null ? 0 : top1LoadMoreStruct.hashCode())) * 31;
        String str2 = this.labelText;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isMixTop1;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.seeMoreOptimize;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.fusionCardDisableShowTitle;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Top1SummaryCardSyncConfig top1SummaryCardSyncConfig = this.syncConfig;
        int iHashCode15 = (iHashCode14 + (top1SummaryCardSyncConfig == null ? 0 : top1SummaryCardSyncConfig.hashCode())) * 31;
        Boolean bool4 = this.isRejectedAnswer;
        int iHashCode16 = (iHashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num2 = this.sourceStyle;
        int iHashCode17 = (iHashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AnimationConfig animationConfig = this.animationConfig;
        int iHashCode18 = (iHashCode17 + (animationConfig == null ? 0 : animationConfig.hashCode())) * 31;
        BackGround backGround = this.backGround;
        return iHashCode18 + (backGround != null ? backGround.hashCode() : 0);
    }

    @Override // X.InterfaceC682650Qq7
    public void injectResources(boolean z) {
    }

    @Override // X.InterfaceC682650Qq7
    public boolean isAiRefactor() {
        return false;
    }

    public String toString() {
        return "Top1MultiSummary(multiVideo=" + this.multiVideo + ", summaryLandingPage=" + this.summaryLandingPage + ", moreDetailText=" + this.moreDetailText + ", moreDetailAction=" + this.moreDetailAction + ", footer=" + this.footer + ", maxHeight=" + this.maxHeight + ", previewIndexes=" + this.previewIndexes + ", multiSummaryDisplayInfo=" + this.multiSummaryDisplayInfo + ", summaryInfo=" + this.summaryInfo + ", loadMoreStruct=" + this.loadMoreStruct + ", labelText=" + this.labelText + ", isMixTop1=" + this.isMixTop1 + ", seeMoreOptimize=" + this.seeMoreOptimize + ", fusionCardDisableShowTitle=" + this.fusionCardDisableShowTitle + ", syncConfig=" + this.syncConfig + ", isRejectedAnswer=" + this.isRejectedAnswer + ", sourceStyle=" + this.sourceStyle + ", animationConfig=" + this.animationConfig + ", backGround=" + this.backGround + ')';
    }

    @Override // X.InterfaceC682650Qq7
    public String findLabelText() {
        MultiVideo next;
        String multiVideoSummary;
        List<MultiVideo> list = this.multiVideo;
        if (list == null) {
            return null;
        }
        Iterator<MultiVideo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Integer type = next.getType();
            if (type != null && type.intValue() == 1) {
                break;
            }
        }
        MultiVideo multiVideo = next;
        if (multiVideo == null || (multiVideoSummary = multiVideo.getMultiVideoSummary()) == null || multiVideoSummary.length() <= 2) {
            return null;
        }
        return multiVideoSummary.substring(2);
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean getEnableEnterDetail() {
        Boolean bool = this.enableEnterDetail;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : Intrinsics.LJFF(isMixTop1(), Boolean.TRUE));
    }

    @Override // X.InterfaceC682650Qq7
    public boolean getHasNimbleCardInSearchResult() {
        List<MultiVideo> list = this.multiVideo;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<MultiVideo> it2 = list.iterator();
        while (it2.hasNext()) {
            String layoutName = it2.next().getLayoutName();
            if (layoutName != null && layoutName.length() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC682650Qq7
    public List<MultiVideo> getLandingPageBlockList() {
        List<MultiVideo> list;
        SummaryLandingPage summaryLandingPage = this.summaryLandingPage;
        return (summaryLandingPage == null || (list = summaryLandingPage.multiVideo) == null || !(list.isEmpty() ^ true)) ? this.multiVideo : list;
    }

    @Override // X.InterfaceC682650Qq7
    public String getProcessedLabelText() {
        String str = this.labelText;
        if ((str != null && str.length() != 0) || ((!true) && str != null)) {
            return str;
        }
        if (Intrinsics.LJFF(isMixTop1(), Boolean.TRUE)) {
            return findLabelText();
        }
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public List<Aweme> getResultVisibleAwemeList() {
        Integer type;
        List<Aweme> subVideos;
        List<MultiVideo> list = this.multiVideo;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MultiVideo multiVideo : list) {
            Integer type2 = multiVideo.getType();
            if ((type2 == null || type2.intValue() != 7) && ((type = multiVideo.getType()) == null || type.intValue() != 1)) {
                subVideos = multiVideo.getSubVideos();
                if (subVideos == null) {
                    subVideos = C13BV.INSTANCE;
                }
            } else {
                subVideos = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(subVideos, arrayList);
        }
        return arrayList;
    }

    @Override // X.InterfaceC682650Qq7
    public List<SourceFromEntity> getSearchingSources() {
        Top1SummaryCardSyncConfig top1SummaryCardSyncConfig = this.syncConfig;
        if (top1SummaryCardSyncConfig != null) {
            return top1SummaryCardSyncConfig.getSearchingSources();
        }
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean isStream() {
        SummaryInfo summaryInfo = this.summaryInfo;
        if (summaryInfo != null) {
            return Boolean.valueOf(summaryInfo.isStream());
        }
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public List<Aweme> getFlattenAwemeList() {
        List<MultiVideo> landingPageBlockList = getLandingPageBlockList();
        if (landingPageBlockList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MultiVideo> it2 = landingPageBlockList.iterator();
        while (it2.hasNext()) {
            List<Aweme> subVideos = it2.next().getSubVideos();
            if (subVideos == null) {
                subVideos = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(subVideos, arrayList);
        }
        return arrayList;
    }

    @Override // X.InterfaceC682650Qq7
    public EnumC682700QqC getJumpPageType() {
        Integer moreDetailAction = getMoreDetailAction();
        return (moreDetailAction == null || moreDetailAction.intValue() != 3) ? EnumC682700QqC.PAGE_LANDING : EnumC682700QqC.PAGE_MIDDLE;
    }

    @Override // X.InterfaceC682650Qq7
    public List<Aweme> getLandingVisibleAwemeList() {
        Integer type;
        List<Aweme> subVideos;
        List<MultiVideo> landingPageBlockList = getLandingPageBlockList();
        if (landingPageBlockList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MultiVideo multiVideo : landingPageBlockList) {
            Integer type2 = multiVideo.getType();
            if ((type2 == null || type2.intValue() != 7) && ((type = multiVideo.getType()) == null || type.intValue() != 1)) {
                subVideos = multiVideo.getSubVideos();
                if (subVideos == null) {
                    subVideos = C13BV.INSTANCE;
                }
            } else {
                subVideos = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(subVideos, arrayList);
        }
        return arrayList;
    }

    @Override // X.InterfaceC682650Qq7
    public List<RefSource> getRefSourceList() {
        List<MultiVideo> landingPageBlockList = getLandingPageBlockList();
        if (landingPageBlockList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MultiVideo> it2 = landingPageBlockList.iterator();
        while (it2.hasNext()) {
            List<RefSource> refSourceList = it2.next().getRefSourceList();
            if (refSourceList == null) {
                refSourceList = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(refSourceList, arrayList);
        }
        return arrayList;
    }

    @Override // X.InterfaceC682650Qq7
    public SourceFromEntities getSourceFromEntities() {
        return C682660Qq8.LIZ(this);
    }

    @Override // X.InterfaceC682650Qq7
    public boolean isExpandStyle() {
        Integer moreDetailAction = getMoreDetailAction();
        return moreDetailAction != null && moreDetailAction.intValue() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // X.InterfaceC682650Qq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean isTako() {
        /*
            r4 = this;
            java.util.List r1 = r4.getLandingPageBlockList()
            r3 = 1
            if (r1 == 0) goto L2e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L2e
            java.util.Iterator r2 = r1.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.search.pages.result.pov.model.MultiVideo r0 = (com.ss.android.ugc.aweme.search.pages.result.pov.model.MultiVideo) r0
            java.lang.Boolean r1 = r0.isTako()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L11
        L29:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L2e:
            com.ss.android.ugc.aweme.search.pages.result.pov.model.SummaryInfo r0 = r4.summaryInfo
            if (r0 == 0) goto L39
            boolean r0 = r0.isTako()
            if (r0 != r3) goto L39
            goto L29
        L39:
            r3 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.pov.model.Top1MultiSummary.isTako():java.lang.Boolean");
    }

    @Override // X.InterfaceC682650Qq7
    public AnimationConfig getAnimationConfig() {
        return this.animationConfig;
    }

    @Override // X.InterfaceC682650Qq7
    public BackGround getBackGround() {
        return this.backGround;
    }

    @Override // X.InterfaceC682650Qq7
    public SummaryFooter getFooter() {
        return this.footer;
    }

    @Override // X.InterfaceC682650Qq7
    public List<MultiVideo> getFusionBlockList() {
        return this.multiVideo;
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean getFusionCardDisableShowTitle() {
        return this.fusionCardDisableShowTitle;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    @Override // X.InterfaceC682650Qq7
    public Top1LoadMoreStruct getLoadMoreStruct() {
        return this.loadMoreStruct;
    }

    @Override // X.InterfaceC682650Qq7
    public Double getMaxHeight() {
        return this.maxHeight;
    }

    @Override // X.InterfaceC682650Qq7
    public Integer getMoreDetailAction() {
        return this.moreDetailAction;
    }

    @Override // X.InterfaceC682650Qq7
    public String getMoreDetailText() {
        return this.moreDetailText;
    }

    public final MultiSummaryDisplayInfo getMultiSummaryDisplayInfo() {
        return this.multiSummaryDisplayInfo;
    }

    public final List<MultiVideo> getMultiVideo() {
        return this.multiVideo;
    }

    @Override // X.InterfaceC682650Qq7
    public InterfaceC1120204Zs getOnlineDisplayInfo() {
        return this.multiSummaryDisplayInfo;
    }

    @Override // X.InterfaceC682650Qq7
    public InterfaceC1771006we getOnlineLoadingConfig() {
        return this.syncConfig;
    }

    @Override // X.InterfaceC682650Qq7
    public List<Double> getPreviewIndexes() {
        return this.previewIndexes;
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean getSeeMoreOptimize() {
        return this.seeMoreOptimize;
    }

    @Override // X.InterfaceC682650Qq7
    public Integer getSourceStyle() {
        return this.sourceStyle;
    }

    public final SummaryInfo getSummaryInfo() {
        return this.summaryInfo;
    }

    public final SummaryLandingPage getSummaryLandingPage() {
        return this.summaryLandingPage;
    }

    public final Top1SummaryCardSyncConfig getSyncConfig() {
        return this.syncConfig;
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean isMixTop1() {
        return this.isMixTop1;
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean isRejectedAnswer() {
        return this.isRejectedAnswer;
    }

    @Override // X.InterfaceC682650Qq7
    public InterfaceC682650Qq7<MultiVideo> copyFromFusionBlockList(List<? extends InterfaceC682670Qq9> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC682670Qq9 interfaceC682670Qq9 : list) {
            if (interfaceC682670Qq9 instanceof MultiVideo) {
                arrayList.add(interfaceC682670Qq9);
            }
        }
        return copy(arrayList, this.summaryLandingPage, this.moreDetailText, this.moreDetailAction, this.footer, this.maxHeight, this.previewIndexes, this.multiSummaryDisplayInfo, this.summaryInfo, this.loadMoreStruct, this.labelText, this.isMixTop1, this.seeMoreOptimize, this.fusionCardDisableShowTitle, this.syncConfig, this.isRejectedAnswer, this.sourceStyle, this.animationConfig, this.backGround);
    }

    @Override // X.InterfaceC682650Qq7
    public boolean isShortAnswer(EnumC682700QqC enumC682700QqC) {
        return C682660Qq8.LIZIZ(this, enumC682700QqC);
    }

    @Override // X.InterfaceC682650Qq7
    public void processAwemeList(String str) {
        C682660Qq8.LIZJ(this, str);
    }

    @Override // X.InterfaceC682650Qq7
    public void setLoadMoreStruct(Top1LoadMoreStruct top1LoadMoreStruct) {
        this.loadMoreStruct = top1LoadMoreStruct;
    }

    public Top1MultiSummary(List<MultiVideo> list, SummaryLandingPage summaryLandingPage, String str, Integer num, SummaryFooter summaryFooter, Double d, List<Double> list2, MultiSummaryDisplayInfo multiSummaryDisplayInfo, SummaryInfo summaryInfo, Top1LoadMoreStruct top1LoadMoreStruct, String str2, Boolean bool, Boolean bool2, Boolean bool3, Top1SummaryCardSyncConfig top1SummaryCardSyncConfig, Boolean bool4, Integer num2, AnimationConfig animationConfig, BackGround backGround) {
        this.multiVideo = list;
        this.summaryLandingPage = summaryLandingPage;
        this.moreDetailText = str;
        this.moreDetailAction = num;
        this.footer = summaryFooter;
        this.maxHeight = d;
        this.previewIndexes = list2;
        this.multiSummaryDisplayInfo = multiSummaryDisplayInfo;
        this.summaryInfo = summaryInfo;
        this.loadMoreStruct = top1LoadMoreStruct;
        this.labelText = str2;
        this.isMixTop1 = bool;
        this.seeMoreOptimize = bool2;
        this.fusionCardDisableShowTitle = bool3;
        this.syncConfig = top1SummaryCardSyncConfig;
        this.isRejectedAnswer = bool4;
        this.sourceStyle = num2;
        this.animationConfig = animationConfig;
        this.backGround = backGround;
    }
}
