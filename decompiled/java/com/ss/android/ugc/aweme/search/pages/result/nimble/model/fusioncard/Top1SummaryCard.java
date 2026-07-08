package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C19719612Di;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C682660Qq8;
import X.EnumC682700QqC;
import X.InterfaceC1120204Zs;
import X.InterfaceC1771006we;
import X.InterfaceC682650Qq7;
import X.InterfaceC682670Qq9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntities;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntity;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SummaryFooter;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.Top1LoadMoreStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1SummaryCard implements Serializable, InterfaceC682650Qq7<FusionBlock> {

    @C09CT("fusion_card")
    public final FusionCard fusionCard;

    @C09CT("global_config")
    public final Top1SummaryCardGlobalConfig globalConfig;

    @C09CT("stream_param")
    public final AiStreamParam streamParam;

    @C09CT("summary_attr")
    public final Top1SummaryCardAttr summaryAttr;

    public Top1SummaryCard() {
        this(null, null, null, null);
    }

    public final Top1SummaryCard copy(Top1SummaryCardAttr top1SummaryCardAttr, FusionCard fusionCard, Top1SummaryCardGlobalConfig top1SummaryCardGlobalConfig, AiStreamParam aiStreamParam) {
        return new Top1SummaryCard(top1SummaryCardAttr, fusionCard, top1SummaryCardGlobalConfig, aiStreamParam);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Top1SummaryCard)) {
            return false;
        }
        Top1SummaryCard top1SummaryCard = (Top1SummaryCard) obj;
        return Intrinsics.LJFF(this.summaryAttr, top1SummaryCard.summaryAttr) && Intrinsics.LJFF(this.fusionCard, top1SummaryCard.fusionCard) && Intrinsics.LJFF(this.globalConfig, top1SummaryCard.globalConfig) && Intrinsics.LJFF(this.streamParam, top1SummaryCard.streamParam);
    }

    @Override // X.InterfaceC682650Qq7
    public SummaryFooter getFooter() {
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean getFusionCardDisableShowTitle() {
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public List<Double> getPreviewIndexes() {
        return null;
    }

    public int hashCode() {
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        int iHashCode = (top1SummaryCardAttr == null ? 0 : top1SummaryCardAttr.hashCode()) * 31;
        FusionCard fusionCard = this.fusionCard;
        int iHashCode2 = (iHashCode + (fusionCard == null ? 0 : fusionCard.hashCode())) * 31;
        Top1SummaryCardGlobalConfig top1SummaryCardGlobalConfig = this.globalConfig;
        int iHashCode3 = (iHashCode2 + (top1SummaryCardGlobalConfig == null ? 0 : top1SummaryCardGlobalConfig.hashCode())) * 31;
        AiStreamParam aiStreamParam = this.streamParam;
        return iHashCode3 + (aiStreamParam != null ? aiStreamParam.hashCode() : 0);
    }

    @Override // X.InterfaceC682650Qq7
    public void setLoadMoreStruct(Top1LoadMoreStruct top1LoadMoreStruct) {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top1SummaryCard(summaryAttr=");
        sbLIZ.append(this.summaryAttr);
        sbLIZ.append(", fusionCard=");
        sbLIZ.append(this.fusionCard);
        sbLIZ.append(", globalConfig=");
        sbLIZ.append(this.globalConfig);
        sbLIZ.append(", streamParam=");
        sbLIZ.append(this.streamParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC682650Qq7
    public AnimationConfig getAnimationConfig() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null) {
            return null;
        }
        return summaryDisplayInfo.getAnimationConfig();
    }

    @Override // X.InterfaceC682650Qq7
    public BackGround getBackGround() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null) {
            return null;
        }
        return summaryDisplayInfo.getBackGround();
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean getEnableEnterDetail() {
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        return Boolean.valueOf(top1SummaryCardAttr != null ? Intrinsics.LJFF(top1SummaryCardAttr.isMixTop1(), Boolean.TRUE) : false);
    }

    @Override // X.InterfaceC682650Qq7
    public List<Aweme> getFlattenAwemeList() {
        FusionCard fusionCard = this.fusionCard;
        if (fusionCard != null) {
            return fusionCard.globalItemList;
        }
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public List<FusionBlock> getFusionBlockList() {
        FusionPage fusionPage;
        FusionCard fusionCard = this.fusionCard;
        if (fusionCard == null || (fusionPage = fusionCard.resultPage) == null) {
            return null;
        }
        return fusionPage.blocks;
    }

    @Override // X.InterfaceC682650Qq7
    public boolean getHasNimbleCardInSearchResult() {
        FusionCard fusionCard = this.fusionCard;
        return fusionCard != null && fusionCard.hasNimbleCard();
    }

    @Override // X.InterfaceC682650Qq7
    public Top1LoadMoreStruct getLoadMoreStruct() {
        FusionCard fusionCard = this.fusionCard;
        if (fusionCard != null) {
            return fusionCard.loadMoreStruct;
        }
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public Double getMaxHeight() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null) {
            return null;
        }
        return summaryDisplayInfo.getMaxHeight();
    }

    @Override // X.InterfaceC682650Qq7
    public Integer getMoreDetailAction() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null) {
            return null;
        }
        return summaryDisplayInfo.getMoreDetailAction();
    }

    @Override // X.InterfaceC682650Qq7
    public String getMoreDetailText() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null) {
            return null;
        }
        return summaryDisplayInfo.getMoreDetailText();
    }

    @Override // X.InterfaceC682650Qq7
    public InterfaceC1120204Zs getOnlineDisplayInfo() {
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr != null) {
            return top1SummaryCardAttr.displayInfo;
        }
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public String getProcessedLabelText() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null) {
            return null;
        }
        return summaryDisplayInfo.getLabelText();
    }

    @Override // X.InterfaceC682650Qq7
    public List<RefSource> getRefSourceList() {
        FusionCard fusionCard = this.fusionCard;
        if (fusionCard != null) {
            return fusionCard.globalRefSource;
        }
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public List<SourceFromEntity> getSearchingSources() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null) {
            return null;
        }
        return summaryDisplayInfo.getSearchingSources();
    }

    @Override // X.InterfaceC682650Qq7
    public Integer getSeeMoreArrowType() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SeeMoreButtonConfig seeMoreConfig;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null || (seeMoreConfig = summaryDisplayInfo.getSeeMoreConfig()) == null) {
            return null;
        }
        return seeMoreConfig.showArrowType;
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean getSeeMoreOptimize() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null) {
            return null;
        }
        return summaryDisplayInfo.getSeeMoreOptimize();
    }

    @Override // X.InterfaceC682650Qq7
    public Integer getSourceStyle() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null) {
            return null;
        }
        return summaryDisplayInfo.getSourceStyle();
    }

    @Override // X.InterfaceC682650Qq7
    public boolean isAiRefactor() {
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr != null) {
            return Intrinsics.LJFF(top1SummaryCardAttr.isAiRefactor(), Boolean.TRUE);
        }
        return false;
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean isMixTop1() {
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        return Boolean.valueOf(top1SummaryCardAttr != null ? Intrinsics.LJFF(top1SummaryCardAttr.isMixTop1(), Boolean.TRUE) : false);
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean isRejectedAnswer() {
        SummaryDisplayInfo summaryDisplayInfo;
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr == null || (summaryDisplayInfo = top1SummaryCardAttr.displayInfo) == null) {
            return null;
        }
        return summaryDisplayInfo.isRejectedAnswer();
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean isStream() {
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        if (top1SummaryCardAttr != null) {
            return top1SummaryCardAttr.isStream();
        }
        return null;
    }

    @Override // X.InterfaceC682650Qq7
    public Boolean isTako() {
        Top1SummaryCardAttr top1SummaryCardAttr = this.summaryAttr;
        return Boolean.valueOf(top1SummaryCardAttr != null ? Intrinsics.LJFF(top1SummaryCardAttr.isTako(), Boolean.TRUE) : false);
    }

    @Override // X.InterfaceC682650Qq7
    public String findLabelText() {
        return getProcessedLabelText();
    }

    @Override // X.InterfaceC682650Qq7
    public EnumC682700QqC getJumpPageType() {
        Integer moreDetailAction = getMoreDetailAction();
        return (moreDetailAction == null || moreDetailAction.intValue() != 3) ? EnumC682700QqC.PAGE_LANDING : EnumC682700QqC.PAGE_MIDDLE;
    }

    @Override // X.InterfaceC682650Qq7
    public List<FusionBlock> getLandingPageBlockList() {
        FusionPage fusionPage;
        FusionPage fusionPage2;
        if (getJumpPageType() == EnumC682700QqC.PAGE_MIDDLE) {
            FusionCard fusionCard = this.fusionCard;
            if (fusionCard == null || (fusionPage2 = fusionCard.middlePage) == null) {
                return null;
            }
            return fusionPage2.blocks;
        }
        FusionCard fusionCard2 = this.fusionCard;
        if (fusionCard2 == null || (fusionPage = fusionCard2.landingPage) == null) {
            return null;
        }
        return fusionPage.blocks;
    }

    @Override // X.InterfaceC682650Qq7
    public List<Aweme> getLandingVisibleAwemeList() {
        List<FusionBlock> landingPageBlockList = getLandingPageBlockList();
        if (landingPageBlockList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<FusionBlock> it2 = landingPageBlockList.iterator();
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
    public List<Aweme> getResultVisibleAwemeList() {
        List<FusionBlock> fusionBlockList = getFusionBlockList();
        if (fusionBlockList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<FusionBlock> it2 = fusionBlockList.iterator();
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
    public SourceFromEntities getSourceFromEntities() {
        return C682660Qq8.LIZ(this);
    }

    @Override // X.InterfaceC682650Qq7
    public boolean isExpandStyle() {
        Integer moreDetailAction = getMoreDetailAction();
        return moreDetailAction != null && moreDetailAction.intValue() == 2;
    }

    public final FusionCard getFusionCard() {
        return this.fusionCard;
    }

    public final Top1SummaryCardGlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    @Override // X.InterfaceC682650Qq7
    public InterfaceC1771006we getOnlineLoadingConfig() {
        return this.globalConfig;
    }

    @Override // X.InterfaceC682650Qq7
    public AiStreamParam getStreamParam() {
        return this.streamParam;
    }

    public final Top1SummaryCardAttr getSummaryAttr() {
        return this.summaryAttr;
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
    @Override // X.InterfaceC682650Qq7
    public InterfaceC682650Qq7<FusionBlock> copyFromFusionBlockList(List<? extends InterfaceC682670Qq9> list) {
        FusionCard fusionCardCopy = null;
        FusionPage fusionPageCopy = null;
        FusionCard fusionCard = this.fusionCard;
        if (fusionCard != null) {
            FusionPage fusionPage = fusionCard.resultPage;
            if (fusionPage != null) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC682670Qq9 interfaceC682670Qq9 : list) {
                    if (interfaceC682670Qq9 instanceof FusionBlock) {
                        arrayList.add(interfaceC682670Qq9);
                    }
                }
                fusionPageCopy = fusionPage.copy(arrayList);
            }
            fusionCardCopy = fusionCard.copy(fusionPageCopy, fusionCard.landingPage, fusionCard.middlePage, fusionCard.globalItemList, fusionCard.globalRefSource, fusionCard.loadMoreStruct);
        }
        return copy(this.summaryAttr, fusionCardCopy, this.globalConfig, this.streamParam);
    }

    @Override // X.InterfaceC682650Qq7
    public void injectResources(boolean z) {
        LinkedHashMap linkedHashMap;
        List<FusionBlock> list;
        List<Aweme> list2;
        Aweme awemeFindAwemeById;
        Integer numValueOf;
        List<FusionBlock> list3;
        List<FusionBlock> list4;
        List<Aweme> list5;
        Aweme awemeFindAwemeById2;
        Integer numValueOf2;
        FusionCard fusionCard = this.fusionCard;
        if (fusionCard != null) {
            List<Aweme> list6 = fusionCard.globalItemList;
            if (list6 != null) {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list6, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Aweme aweme : list6) {
                    linkedHashMap.put(aweme.getAid(), aweme);
                }
            } else {
                linkedHashMap = null;
            }
            fusionCard.setAwemeMap(linkedHashMap);
            FusionPage fusionPage = fusionCard.resultPage;
            if (fusionPage != null && (list4 = fusionPage.blocks) != null) {
                for (FusionBlock fusionBlock : list4) {
                    fusionBlock.setSubVideos(fusionCard.findAwemeByIds(fusionBlock.getOutDisplayVideoIds()));
                    String surroundedVideoId = fusionBlock.getSurroundedVideoId();
                    if ((surroundedVideoId == null || (awemeFindAwemeById2 = fusionCard.findAwemeById(surroundedVideoId)) == null) && ((list5 = fusionCard.globalItemList) == null || (awemeFindAwemeById2 = (Aweme) C13LP.LJJJLL(list5)) == null || !Boolean.valueOf(z).booleanValue())) {
                        awemeFindAwemeById2 = null;
                    }
                    fusionBlock.setSurroundedVideo(awemeFindAwemeById2);
                    List<Aweme> list7 = fusionCard.globalItemList;
                    if (list7 != null) {
                        numValueOf2 = Integer.valueOf(list7.size());
                    } else {
                        numValueOf2 = null;
                    }
                    fusionBlock.setFlattenAwemeListSize(numValueOf2);
                }
            }
            FusionPage fusionPage2 = fusionCard.landingPage;
            if (fusionPage2 != null && (list3 = fusionPage2.blocks) != null) {
                for (FusionBlock fusionBlock2 : list3) {
                    fusionBlock2.setSubVideos(fusionCard.findAwemeByIds(fusionBlock2.getOutDisplayVideoIds()));
                }
            }
            FusionPage fusionPage3 = fusionCard.middlePage;
            if (fusionPage3 != null && (list = fusionPage3.blocks) != null) {
                for (FusionBlock fusionBlock3 : list) {
                    fusionBlock3.setSubVideos(fusionCard.findAwemeByIds(fusionBlock3.getOutDisplayVideoIds()));
                    String surroundedVideoId2 = fusionBlock3.getSurroundedVideoId();
                    if ((surroundedVideoId2 == null || (awemeFindAwemeById = fusionCard.findAwemeById(surroundedVideoId2)) == null) && ((list2 = fusionCard.globalItemList) == null || (awemeFindAwemeById = (Aweme) C13LP.LJJJLL(list2)) == null || !Boolean.valueOf(z).booleanValue())) {
                        awemeFindAwemeById = null;
                    }
                    fusionBlock3.setSurroundedVideo(awemeFindAwemeById);
                    List<Aweme> list8 = fusionCard.globalItemList;
                    if (list8 != null) {
                        numValueOf = Integer.valueOf(list8.size());
                    } else {
                        numValueOf = null;
                    }
                    fusionBlock3.setFlattenAwemeListSize(numValueOf);
                }
            }
        }
    }

    @Override // X.InterfaceC682650Qq7
    public boolean isShortAnswer(EnumC682700QqC enumC682700QqC) {
        return C682660Qq8.LIZIZ(this, enumC682700QqC);
    }

    @Override // X.InterfaceC682650Qq7
    public void processAwemeList(String str) {
        C682660Qq8.LIZJ(this, str);
    }

    public Top1SummaryCard(Top1SummaryCardAttr top1SummaryCardAttr, FusionCard fusionCard, Top1SummaryCardGlobalConfig top1SummaryCardGlobalConfig, AiStreamParam aiStreamParam) {
        this.summaryAttr = top1SummaryCardAttr;
        this.fusionCard = fusionCard;
        this.globalConfig = top1SummaryCardGlobalConfig;
        this.streamParam = aiStreamParam;
    }
}
